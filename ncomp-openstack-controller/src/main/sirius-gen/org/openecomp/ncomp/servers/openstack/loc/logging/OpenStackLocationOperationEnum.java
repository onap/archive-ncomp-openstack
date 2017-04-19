
package org.openecomp.ncomp.servers.openstack.loc.logging;

import org.openecomp.entity.EcompOperationEnum;

public enum OpenStackLocationOperationEnum implements EcompOperationEnum {

  OpenStackLocation_createNetwork("OpenStackLocation@createNetwork"),
  OpenStackLocation_createSubnet("OpenStackLocation@createSubnet"),
  OpenStackLocation_createPort("OpenStackLocation@createPort"),
  OpenStackLocation_createRouter("OpenStackLocation@createRouter"),
  OpenStackLocation_deleteNetwork("OpenStackLocation@deleteNetwork"),
  OpenStackLocation_deleteSubnet("OpenStackLocation@deleteSubnet"),
  OpenStackLocation_deletePort("OpenStackLocation@deletePort"),
  OpenStackLocation_deleteRouter("OpenStackLocation@deleteRouter"),
  OpenStackLocation_associateFloatingIp("OpenStackLocation@associateFloatingIp"),
  OpenStackLocation_createServer("OpenStackLocation@createServer"),
  OpenStackLocation_deleteServer("OpenStackLocation@deleteServer"),
  OpenStackLocation_createKeyPair("OpenStackLocation@createKeyPair"),
  OpenStackLocation_delete("OpenStackLocation@delete"),
  OpenStackLocation_createFlavor("OpenStackLocation@createFlavor"),
  OpenStackLocation_createSecurityGroup("OpenStackLocation@createSecurityGroup"),
  OpenStackLocation_serverAction("OpenStackLocation@serverAction"),
  OpenStackLocation_deployVmType("OpenStackLocation@deployVmType"),
  OpenStackLocation_undeployVmType("OpenStackLocation@undeployVmType"),
  OpenStackLocation_deployUser("OpenStackLocation@deployUser"),
  OpenStackLocation_undeployUser("OpenStackLocation@undeployUser"),
  OpenStackLocation_createAlarm("OpenStackLocation@createAlarm"),
  OpenStackLocation_deleteAlarm("OpenStackLocation@deleteAlarm"),
  OpenStackLocation_poll("OpenStackLocation@poll"),
  OpenStackLocation_mergeLocation("OpenStackLocation@mergeLocation") ; 


	private String n;
	
	private OpenStackLocationOperationEnum(String n) {
		this.n = n;
	}

	@Override
	public String toString() {
		return n;
	}

}
