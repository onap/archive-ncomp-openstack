
package org.openecomp.ncomp.servers.openstack.loc.logging;

import com.att.eelf.i18n.EELFResourceManager;
import org.openecomp.logger.EcompMessageEnum;

public enum OpenStackLocationMessageEnum implements EcompMessageEnum {

  dummy,
  REQUEST_FAILED_createNetwork,
  REQUEST_FAILED_createSubnet,
  REQUEST_FAILED_createPort,
  REQUEST_FAILED_createRouter,
  REQUEST_FAILED_deleteNetwork,
  REQUEST_FAILED_deleteSubnet,
  REQUEST_FAILED_deletePort,
  REQUEST_FAILED_deleteRouter,
  REQUEST_FAILED_associateFloatingIp,
  REQUEST_FAILED_createServer,
  REQUEST_FAILED_deleteServer,
  REQUEST_FAILED_createKeyPair,
  REQUEST_FAILED_delete,
  REQUEST_FAILED_createFlavor,
  REQUEST_FAILED_createSecurityGroup,
  REQUEST_FAILED_serverAction,
  REQUEST_FAILED_deployVmType,
  REQUEST_FAILED_undeployVmType,
  REQUEST_FAILED_deployUser,
  REQUEST_FAILED_undeployUser,
  REQUEST_FAILED_createAlarm,
  REQUEST_FAILED_deleteAlarm,
  REQUEST_FAILED_poll,
  REQUEST_FAILED_mergeLocation,
  REMOTE_CALL_FAILED_createNetwork,
  REMOTE_CALL_FAILED_createSubnet,
  REMOTE_CALL_FAILED_createPort,
  REMOTE_CALL_FAILED_createRouter,
  REMOTE_CALL_FAILED_deleteNetwork,
  REMOTE_CALL_FAILED_deleteSubnet,
  REMOTE_CALL_FAILED_deletePort,
  REMOTE_CALL_FAILED_deleteRouter,
  REMOTE_CALL_FAILED_associateFloatingIp,
  REMOTE_CALL_FAILED_createServer,
  REMOTE_CALL_FAILED_deleteServer,
  REMOTE_CALL_FAILED_createKeyPair,
  REMOTE_CALL_FAILED_delete,
  REMOTE_CALL_FAILED_createFlavor,
  REMOTE_CALL_FAILED_createSecurityGroup,
  REMOTE_CALL_FAILED_serverAction,
  REMOTE_CALL_FAILED_deployVmType,
  REMOTE_CALL_FAILED_undeployVmType,
  REMOTE_CALL_FAILED_deployUser,
  REMOTE_CALL_FAILED_undeployUser,
  REMOTE_CALL_FAILED_createAlarm,
  REMOTE_CALL_FAILED_deleteAlarm,
  REMOTE_CALL_FAILED_poll,
  REMOTE_CALL_FAILED_mergeLocation;

	static {
		EELFResourceManager.loadMessageBundle("org/openecomp/ncomp/servers/openstack/loc/logging/OpenStackLocation");
	}
}
