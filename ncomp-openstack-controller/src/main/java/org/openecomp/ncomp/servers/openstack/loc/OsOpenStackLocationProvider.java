
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
	
package org.openecomp.ncomp.servers.openstack.loc;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.openecomp.ncomp.core.User;
import org.openecomp.ncomp.openstack.OpenStackController;
import org.openecomp.ncomp.openstack.ceilometer.CeilometerAlarm;
import org.openecomp.ncomp.openstack.ceilometer.CeilometerSample;
import org.openecomp.ncomp.openstack.ceilometer.CreateAlarmRequest;
import org.openecomp.ncomp.openstack.ceilometer.SampleRequest;
import org.openecomp.ncomp.openstack.compute.ComputeFactory;
import org.openecomp.ncomp.openstack.compute.OpenstackRequestFlavor;
import org.openecomp.ncomp.openstack.compute.OpenstackRequestKeyPair;
import org.openecomp.ncomp.openstack.compute.OpenstackRequestNewServer;
import org.openecomp.ncomp.openstack.compute.OpenstackRequestSecurityGroup;
import org.openecomp.ncomp.openstack.compute.OpenstackRequestServerAction;
import org.openecomp.ncomp.openstack.controller.tools.OpenStackUtil;
import org.openecomp.ncomp.openstack.controller.tools.OpenStackUtil.OpenStackControllerProject;
import org.openecomp.ncomp.openstack.core.CoreFactory;
import org.openecomp.ncomp.openstack.core.OpenstackRequestDelete;
import org.openecomp.ncomp.openstack.core.VirtualMachineType;
import org.openecomp.ncomp.openstack.location.OpenStackLocation;
import org.openecomp.ncomp.openstack.neutron.CreateRouterRequest;
import org.openecomp.ncomp.openstack.neutron.CreateSubnetRequest;
import org.openecomp.ncomp.openstack.neutron.CreatePortRequest;
import org.openecomp.ncomp.openstack.neutron.Network;
import org.openecomp.ncomp.openstack.neutron.NeutronObject;
import org.openecomp.ncomp.openstack.neutron.NeutronRequest;
import org.openecomp.ncomp.openstack.neutron.Router;
import org.openecomp.ncomp.openstack.neutron.Subnet;
import org.openecomp.ncomp.openstack.neutron.Port;
import org.openecomp.ncomp.servers.openstack.OsOpenStackController;
import org.openecomp.ncomp.servers.openstack.OsOpenStackControllerProvider;
import org.openecomp.ncomp.sirius.manager.BasicAdaptorProvider;
import org.openecomp.ncomp.sirius.manager.ISiriusPlugin;
import org.openecomp.ncomp.sirius.manager.ISiriusServer;
import org.openecomp.ncomp.sirius.manager.ManagementServer;
import org.openecomp.ncomp.sirius.manager.Subject;
import org.openecomp.ncomp.sirius.manager.server.Response;
import org.openecomp.ncomp.sirius.manager.server.ServerPackage;

public class OsOpenStackLocationProvider extends BasicAdaptorProvider implements ISiriusPlugin {
	public static final Logger logger = Logger.getLogger(OsOpenStackLocationProvider.class);
	OpenStackUtil util;
	private OpenStackLocation o;

	public OsOpenStackLocationProvider(ISiriusServer controller, OpenStackLocation o) {
		super(controller, o);
		this.o = o;
	}

	public Network createNetwork(org.openecomp.ncomp.openstack.neutron.CreateNetworkRequest request) {
		return (Network) handleNeutronRequest(request);
	}

	public void createServer(OpenstackRequestNewServer request) {
		initUtil();
		util.createServer(request);
	}

	public Subnet createSubnet(CreateSubnetRequest request) {
		initUtil();
		return (Subnet) handleNeutronRequest(request);
	}

	public Port createPort(CreatePortRequest request) {
		initUtil();
		return (Port) handleNeutronRequest(request);
	}

	public void poll() {
		initUtil();
		// TODO implement poll
		// o.poll();
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub

	}

	private void initUtil() {
		if (util == null) {
			OsOpenStackController c = (OsOpenStackController) o.eContainer();
			util = c.controller.getUtil(o.getName()); 
		}
		if (util == null) {
			throw new RuntimeException("Unable to create Openstack Util");
		}
	}

	private NeutronObject handleNeutronRequest(NeutronRequest request) {
		initUtil();
		OpenStackControllerProject p = util.findProject(request.getProjectName());
		if (p == null) {
			throw new RuntimeException("unable to find project: " + request.getProjectName());
		}
		return p.create(request);
	}

	public void deleteNetwork(String projectName, String name) {
		initUtil();
		OpenStackControllerProject p = util.findProject(projectName);
		if (p == null) {
			logger.warn("unable to find project: " + projectName + " " + name);
			 return;
		}
		p.deleteNeutron("network", name);
	}

	public void deleteSubnet(String projectName, String name) {
		initUtil();
		OpenStackControllerProject p = util.findProject(projectName);
		if (p == null) {
			logger.warn("unable to find project: " + projectName);
			return;
		}
		p.deleteNeutron("subnet", name);
	}

	public void deleteServer(String projectName, String name) {
		initUtil();
		util.delete(projectName, "server", name);
	}

	public void associateFloatingIp(String projectName, String ipId, String portId) {
		initUtil();
		OpenStackControllerProject p = util.findProject(projectName);
		if (p == null) {
			logger.warn("unable to find project: " + projectName);
			return;
		}
		p.associateFloatingIp(ipId, portId);
	}

	public CeilometerAlarm createAlarm(CreateAlarmRequest request) {
		throw new UnsupportedOperationException();
	}

	public void deleteAlarm(String projectName, String name) {
		throw new UnsupportedOperationException();
	}

	public EList<CeilometerSample> createAlarm(SampleRequest request) {
		throw new UnsupportedOperationException();
	}

	public static void ecoreSetup() {
		ServerPackage.eINSTANCE.getClass();
	}

	public void createKeyPair(OpenstackRequestKeyPair request) {
		initUtil();
		util.createKeypair(request.getProjectName(), request.getUser());
	}

	public void delete(OpenstackRequestDelete request) {
		initUtil();
		util.delete(request.getProjectName(), request.getObjectType(), request.getObjectName());
	}

	public void createFlavor(OpenstackRequestFlavor request) {
		initUtil();
		util.createFlavor(request.getProjectName(), request.getVmType());
	}

	public void createSecurityGroup(OpenstackRequestSecurityGroup request) {
		initUtil();
		util.createSecurityGroup(request.getProjectName(), request.getVmType());
	}

	public void serverAction(OpenstackRequestServerAction request) {
		initUtil();
		util.serverAction(request);
	}

	public void deployVmType(String vmTypeName, String projectName) {
		OpenstackRequestSecurityGroup req2 = ComputeFactory.eINSTANCE.createOpenstackRequestSecurityGroup();
		req2.setProjectName(projectName);
		req2.setVmType(EcoreUtil.copy(findVmType(vmTypeName)));
		o.createSecurityGroup(req2);
		if (o.isAllowCreateFlavor()) {
			OpenstackRequestFlavor req = ComputeFactory.eINSTANCE.createOpenstackRequestFlavor();
			req.setProjectName(projectName);
			req.setVmType(EcoreUtil.copy(findVmType(vmTypeName)));
			o.createFlavor(req);
		}
	}

	private VirtualMachineType findVmType(String name) {
		OpenStackController c = (OpenStackController) o.eContainer();
		for (VirtualMachineType v : c.getVmTypes()) {
			if (v.getName().equals(name)) return v;
		}
		throw new RuntimeException("Not VmType with name: " + name);
	}

	public void undeployVmType(String vmTypeName, String projectName) {
		OpenstackRequestDelete req1 = CoreFactory.eINSTANCE.createOpenstackRequestDelete();
		req1.setProjectName(projectName);
		req1.setObjectType("flavor");
		req1.setObjectName(vmTypeName);
		o.delete(req1);
		req1.setObjectType("security_group");
		o.delete(req1);
	}

	public void deployUser(User user, String projectName) {
		OpenstackRequestKeyPair req = ComputeFactory.eINSTANCE.createOpenstackRequestKeyPair();
		if (user == null) 
			throw new RuntimeException("Null user");
		req.setProjectName(projectName);
		req.setUser(EcoreUtil.copy(user));
		o.createKeyPair(req);
	}

	public void undeployUser(User user, String projectName) {
		OpenstackRequestDelete req1 = CoreFactory.eINSTANCE.createOpenstackRequestDelete();
		if (user == null) 
			throw new RuntimeException("Null user");
		req1.setProjectName(projectName);
		req1.setObjectType("keypair");
		req1.setObjectName(user.getName());
		o.delete(req1);
	}

	@SuppressWarnings("unused")
	private User findUser(String userPath) {
		Subject s = controller.getServer().find(userPath);
		if (s == null || s.o == null || ! (s instanceof User)) 
			throw new RuntimeException("Unable to find user: " + userPath);
		return (User) s.o;
	}

	public void mergeLocation(OpenStackLocation loc) {
		ManagementServer.merge(o, loc, null, true, null);
	}

	public void deletePort(String projectName, String name) {
		initUtil();
		OpenStackControllerProject p = util.findProject(projectName);
		if (p == null) {
			logger.warn("unable to find project: " + projectName + " " + name);
			 return;
		}
		p.deleteNeutron("port", name);

	}

	public Router createRouter(CreateRouterRequest request) {
		initUtil();
		return (Router) handleNeutronRequest(request);
	}

	public void deleteRouter(String projectName, String name) {
		initUtil();
		OpenStackControllerProject p = util.findProject(projectName);
		if (p == null) {
			logger.warn("unable to find project: " + projectName + " " + name);
			 return;
		}
		p.deleteNeutron("router", name);

		
	}
}
