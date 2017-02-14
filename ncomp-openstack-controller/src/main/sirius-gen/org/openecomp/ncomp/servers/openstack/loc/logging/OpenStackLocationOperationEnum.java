
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
	

package org.openecomp.ncomp.servers.openstack.loc.logging;

import org.openecomp.entity.EcompOperationEnum;

public enum OpenStackLocationOperationEnum implements EcompOperationEnum {

  createNetwork,
  createSubnet,
  createPort,
  createRouter,
  deleteNetwork,
  deleteSubnet,
  deletePort,
  deleteRouter,
  associateFloatingIp,
  createServer,
  deleteServer,
  createKeyPair,
  delete,
  createFlavor,
  createSecurityGroup,
  serverAction,
  deployVmType,
  undeployVmType,
  deployUser,
  undeployUser,
  createAlarm,
  deleteAlarm,
  poll,
  mergeLocation,
  REMOTE_createNetwork,
  REMOTE_createSubnet,
  REMOTE_createPort,
  REMOTE_createRouter,
  REMOTE_deleteNetwork,
  REMOTE_deleteSubnet,
  REMOTE_deletePort,
  REMOTE_deleteRouter,
  REMOTE_associateFloatingIp,
  REMOTE_createServer,
  REMOTE_deleteServer,
  REMOTE_createKeyPair,
  REMOTE_delete,
  REMOTE_createFlavor,
  REMOTE_createSecurityGroup,
  REMOTE_serverAction,
  REMOTE_deployVmType,
  REMOTE_undeployVmType,
  REMOTE_deployUser,
  REMOTE_undeployUser,
  REMOTE_createAlarm,
  REMOTE_deleteAlarm,
  REMOTE_poll,
  REMOTE_mergeLocation;
}
