
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





import java.io.InputStream;

import org.openecomp.ncomp.sirius.manager.IRequestHandler;
import org.openecomp.ncomp.sirius.manager.ISiriusPlugin;
import org.openecomp.ncomp.sirius.manager.ISiriusServer;
import org.openecomp.ncomp.sirius.function.FunctionUtils;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.json.JSONObject;



import org.openecomp.ncomp.sirius.manager.BasicAdaptorProvider;


import org.openecomp.ncomp.openstack.location.impl.OpenStackLocationImpl;
import org.openecomp.ncomp.openstack.location.OpenStackLocation;


public class OsOpenStackLocationProviderTemplate extends BasicAdaptorProvider {
	private static final Logger logger = Logger.getLogger(OsOpenStackLocationProviderTemplate.class);
	OpenStackLocation o;

	public OsOpenStackLocationProviderTemplate(ISiriusServer controller, OpenStackLocation o) {
		super(controller, o);
		this.o = o;
	}

	public void poll() {
		
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public void mergeLocation(org.openecomp.ncomp.openstack.location.OpenStackLocation loc) {
		
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public org.openecomp.ncomp.openstack.neutron.Network createNetwork(org.openecomp.ncomp.openstack.neutron.CreateNetworkRequest request) {
		org.openecomp.ncomp.openstack.neutron.Network res = null;
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public org.openecomp.ncomp.openstack.neutron.Subnet createSubnet(org.openecomp.ncomp.openstack.neutron.CreateSubnetRequest request) {
		org.openecomp.ncomp.openstack.neutron.Subnet res = null;
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public org.openecomp.ncomp.openstack.neutron.Port createPort(org.openecomp.ncomp.openstack.neutron.CreatePortRequest request) {
		org.openecomp.ncomp.openstack.neutron.Port res = null;
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public org.openecomp.ncomp.openstack.neutron.Router createRouter(org.openecomp.ncomp.openstack.neutron.CreateRouterRequest request) {
		org.openecomp.ncomp.openstack.neutron.Router res = null;
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public void deleteNetwork(java.lang.String projectName, java.lang.String name) {
		
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public void deleteSubnet(java.lang.String projectName, java.lang.String name) {
		
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public void deletePort(java.lang.String projectName, java.lang.String name) {
		
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public void deleteRouter(java.lang.String projectName, java.lang.String name) {
		
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public void associateFloatingIp(java.lang.String projectName, java.lang.String ipId, java.lang.String portId) {
		
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public void createServer(org.openecomp.ncomp.openstack.compute.OpenstackRequestNewServer request) {
		
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public void deleteServer(java.lang.String projectName, java.lang.String name) {
		
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public void createKeyPair(org.openecomp.ncomp.openstack.compute.OpenstackRequestKeyPair request) {
		
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public void delete(org.openecomp.ncomp.openstack.core.OpenstackRequestDelete request) {
		
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public void createFlavor(org.openecomp.ncomp.openstack.compute.OpenstackRequestFlavor request) {
		
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public void createSecurityGroup(org.openecomp.ncomp.openstack.compute.OpenstackRequestSecurityGroup request) {
		
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public void serverAction(org.openecomp.ncomp.openstack.compute.OpenstackRequestServerAction request) {
		
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public void deployVmType(java.lang.String vmTypeName, java.lang.String projectName) {
		
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public void undeployVmType(java.lang.String vmTypeName, java.lang.String projectName) {
		
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public void deployUser(org.openecomp.ncomp.core.User user, java.lang.String projectName) {
		
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public void undeployUser(org.openecomp.ncomp.core.User user, java.lang.String projectName) {
		
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public org.openecomp.ncomp.openstack.ceilometer.CeilometerAlarm createAlarm(org.openecomp.ncomp.openstack.ceilometer.CreateAlarmRequest request) {
		org.openecomp.ncomp.openstack.ceilometer.CeilometerAlarm res = null;
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public void deleteAlarm(java.lang.String projectName, java.lang.String name) {
		
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public EList<org.openecomp.ncomp.openstack.ceilometer.CeilometerSample> createAlarm(org.openecomp.ncomp.openstack.ceilometer.SampleRequest request) {
		EList<org.openecomp.ncomp.openstack.ceilometer.CeilometerSample> res = null;
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}





	
}
