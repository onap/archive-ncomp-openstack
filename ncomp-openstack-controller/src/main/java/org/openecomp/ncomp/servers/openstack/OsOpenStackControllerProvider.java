
/*-
 * ============LICENSE_START==========================================
 * OPENECOMP - DCAE
 * ===================================================================
 * Copyright (c) 2017 AT&T Intellectual Property. All rights reserved.
 * ===================================================================
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0 
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ============LICENSE_END============================================
 */
	
package org.openecomp.ncomp.servers.openstack;

import java.util.Date;
import java.util.HashMap;

import org.apache.log4j.Logger;
import org.json.JSONObject;

import org.openecomp.logger.StatusCodeEnum;
import org.openecomp.ncomp.openstack.OpenStackController;
import org.openecomp.ncomp.openstack.controller.tools.OpenStackUtil;
import org.openecomp.ncomp.openstack.location.OpenStackLocation;
import org.openecomp.ncomp.servers.openstack.logging.OpenStackAdaptorMessageEnum;
import org.openecomp.ncomp.servers.openstack.logging.OpenStackAdaptorOperationEnum;
import org.openecomp.ncomp.sirius.manager.BasicAdaptorProvider;
import org.openecomp.ncomp.sirius.manager.ISiriusServer;
import org.openecomp.ncomp.sirius.manager.ManagementServer;
import org.openecomp.ncomp.sirius.manager.ManagementServerError;
import org.openecomp.ncomp.sirius.manager.ManagementServerUtils;
import org.openecomp.ncomp.sirius.manager.logging.NcompLogger;
import org.openecomp.ncomp.sirius.manager.server.ServerPackage;

public class OsOpenStackControllerProvider extends BasicAdaptorProvider {
	public static final Logger logger = Logger.getLogger(OsOpenStackControllerProvider.class);
	static final NcompLogger ecomplogger = NcompLogger.getNcompLogger();
	private HashMap<String, OpenStackUtil> utils = new HashMap<String, OpenStackUtil>();
	private HashMap<String, Thread> pollers = new HashMap<String, Thread>();
	private HashMap<String, Date> lastPoll = new HashMap<String, Date>();
	private OpenStackController o;
	private OsOpenStackControllerClient parent = null;
	protected long pollingFrequency;

	public OsOpenStackControllerProvider(ISiriusServer controller, OpenStackController o) {
		super(controller, o);
		this.o = o;
		for (OpenStackLocation l : o.getLocations()) {
			if (!l.isRemoteLocation()) {
				startOpenstackPolling(l);
			}
		}
		if (controller.getServer().getProps().containsKey("openstackParent.endpoint")) {
			parent = new OsOpenStackControllerClient("location.properties", "openstackParent");
		}
	}

	private synchronized void startOpenstackPolling(final OpenStackLocation l) {
		Thread t = pollers.get(l.getName());
		if (t != null && t.isAlive()) {
			return;
		}
		t = new Thread("openstackPoller " + l.getName()) {
			@Override
			public void run() {
				while (true) {
					Date lastPoll2 = lastPoll.get(l.getName());
					if (lastPoll2 == null || lastPoll2.getTime() + pollingFrequency < new Date().getTime()) {
						try {
							ecomplogger.setOperation(OpenStackAdaptorOperationEnum.POLLING);
							ecomplogger.newRequestId();
							ecomplogger.setInstanceId(controller, l);
							ecomplogger.recordAuditEventStart();
							openstackPolling(l);
							ecomplogger.recordAuditEventEnd();
						} catch (Exception e) {
							ecomplogger.warn(OpenStackAdaptorMessageEnum.POLLING_FAILED, ManagementServer.object2ref(l));
							ManagementServerUtils.printStackTrace(e);
							ecomplogger.recordAuditEventEnd(StatusCodeEnum.ERROR);
						}
					}
					try {
						Thread.sleep(30000);
					} catch (InterruptedException e1) {
					}
				}
			};
		};
		t.setDaemon(true);
		t.start();
		pollers.put(l.getName(), t);
	}

	protected void openstackPolling(OpenStackLocation l) {
		if (! l.getKeystoneUrl().startsWith("http")) {
			logger.warn("openstackPolling ignored no valid keystone url: " + l.getName() + " " + l.getKeystoneUrl()); 
			return;
		}
		logger.info("openstackPolling: " + l.getName());
		OpenStackUtil util = getUtil(l.getName());
		lastPoll.put(l.getName(), new Date());
		OpenStackLocation poll = util.poll();
		poll.setName(l.getName());
		poll.setRemoteLocationName(l.getName());
		logger.info("polling done: " + poll);
		if (poll != null) {
			try {
				uploadOpenstackConfiguration(null, poll);
			} catch (ManagementServerError e) {
				logger.warn("uploadOpenstackConfiguration: " + e.getJson().toString(2));
			}
		}

	}

	public static void ecoreSetup() {
		ServerPackage.eINSTANCE.getClass();
	}

	public void uploadOpenstackConfiguration(JSONObject cx, OpenStackLocation loc) {
		if (parent != null) {
			parent.uploadOpenstackConfiguration(cx, loc);
		}
	}

	public void start() {
		for (OpenStackLocation l : o.getLocations()) {
			if (!l.isRemoteLocation()) {
				startOpenstackPolling(l);
			}
		}
	}

	public synchronized OpenStackUtil getUtil(String name) {
		OpenStackUtil util = utils.get(name);
		if (util == null) {
			for (OpenStackLocation l : o.getLocations()) {
				if (l.isRemoteLocation()) {
					break;
				}
				if (!l.getName().equals(name))
					continue;
				util = new OpenStackUtil(l, controller.getServer(), controller.getServer().getProps()
						.getProperty("openstack.propertyfile", "openstack.properties"));
				utils.put(name, util);
				pollingFrequency = util.pollingFrequency;
				return (util);
			}
		}
		return (util);
	}

}
