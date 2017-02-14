
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
	
/**
 */
package org.openecomp.ncomp.openstack.compute;

import org.openecomp.ncomp.openstack.core.CorePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.openecomp.ncomp.openstack.compute.ComputeFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel modelDirectory='/ncomp-openstack-model/src/main/xcore-gen' basePackage='org.openecomp.ncomp.openstack'"
 * @generated
 */
public interface ComputePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "compute";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.openecomp.ncomp.openstack.compute";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "compute";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComputePackage eINSTANCE = org.openecomp.ncomp.openstack.compute.impl.ComputePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.openstack.compute.impl.ComputeServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.openstack.compute.impl.ComputeServiceImpl
	 * @see org.openecomp.ncomp.openstack.compute.impl.ComputePackageImpl#getComputeService()
	 * @generated
	 */
	int COMPUTE_SERVICE = 0;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE_SERVICE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Create Server</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE_SERVICE___CREATE_SERVER__OPENSTACKREQUESTNEWSERVER = 0;

	/**
	 * The operation id for the '<em>Delete Server</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE_SERVICE___DELETE_SERVER__STRING_STRING = 1;

	/**
	 * The operation id for the '<em>Create Key Pair</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE_SERVICE___CREATE_KEY_PAIR__OPENSTACKREQUESTKEYPAIR = 2;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE_SERVICE___DELETE__OPENSTACKREQUESTDELETE = 3;

	/**
	 * The operation id for the '<em>Create Flavor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE_SERVICE___CREATE_FLAVOR__OPENSTACKREQUESTFLAVOR = 4;

	/**
	 * The operation id for the '<em>Create Security Group</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE_SERVICE___CREATE_SECURITY_GROUP__OPENSTACKREQUESTSECURITYGROUP = 5;

	/**
	 * The operation id for the '<em>Server Action</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE_SERVICE___SERVER_ACTION__OPENSTACKREQUESTSERVERACTION = 6;

	/**
	 * The operation id for the '<em>Deploy Vm Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE_SERVICE___DEPLOY_VM_TYPE__STRING_STRING = 7;

	/**
	 * The operation id for the '<em>Undeploy Vm Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE_SERVICE___UNDEPLOY_VM_TYPE__STRING_STRING = 8;

	/**
	 * The operation id for the '<em>Deploy User</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE_SERVICE___DEPLOY_USER__USER_STRING = 9;

	/**
	 * The operation id for the '<em>Undeploy User</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE_SERVICE___UNDEPLOY_USER__USER_STRING = 10;

	/**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE_SERVICE_OPERATION_COUNT = 11;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.openstack.compute.impl.OpenstackRequestNewServerImpl <em>Openstack Request New Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.openstack.compute.impl.OpenstackRequestNewServerImpl
	 * @see org.openecomp.ncomp.openstack.compute.impl.ComputePackageImpl#getOpenstackRequestNewServer()
	 * @generated
	 */
	int OPENSTACK_REQUEST_NEW_SERVER = 1;

	/**
	 * The feature id for the '<em><b>Project Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENSTACK_REQUEST_NEW_SERVER__PROJECT_NAME = CorePackage.OPEN_STACK_REQUEST__PROJECT_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENSTACK_REQUEST_NEW_SERVER__NAME = CorePackage.OPEN_STACK_REQUEST_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Hypervisor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENSTACK_REQUEST_NEW_SERVER__HYPERVISOR = CorePackage.OPEN_STACK_REQUEST_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENSTACK_REQUEST_NEW_SERVER__USER = CorePackage.OPEN_STACK_REQUEST_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Networks</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENSTACK_REQUEST_NEW_SERVER__NETWORKS = CorePackage.OPEN_STACK_REQUEST_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENSTACK_REQUEST_NEW_SERVER__PORTS = CorePackage.OPEN_STACK_REQUEST_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>User data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENSTACK_REQUEST_NEW_SERVER__USER_DATA = CorePackage.OPEN_STACK_REQUEST_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Floating Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENSTACK_REQUEST_NEW_SERVER__FLOATING_IP = CorePackage.OPEN_STACK_REQUEST_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Vm Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENSTACK_REQUEST_NEW_SERVER__VM_TYPE = CorePackage.OPEN_STACK_REQUEST_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Openstack Request New Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENSTACK_REQUEST_NEW_SERVER_FEATURE_COUNT = CorePackage.OPEN_STACK_REQUEST_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Openstack Request New Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENSTACK_REQUEST_NEW_SERVER_OPERATION_COUNT = CorePackage.OPEN_STACK_REQUEST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.openstack.compute.impl.OpenstackRequestKeyPairImpl <em>Openstack Request Key Pair</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.openstack.compute.impl.OpenstackRequestKeyPairImpl
	 * @see org.openecomp.ncomp.openstack.compute.impl.ComputePackageImpl#getOpenstackRequestKeyPair()
	 * @generated
	 */
	int OPENSTACK_REQUEST_KEY_PAIR = 2;

	/**
	 * The feature id for the '<em><b>Project Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENSTACK_REQUEST_KEY_PAIR__PROJECT_NAME = CorePackage.OPEN_STACK_REQUEST__PROJECT_NAME;

	/**
	 * The feature id for the '<em><b>User</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENSTACK_REQUEST_KEY_PAIR__USER = CorePackage.OPEN_STACK_REQUEST_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Openstack Request Key Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENSTACK_REQUEST_KEY_PAIR_FEATURE_COUNT = CorePackage.OPEN_STACK_REQUEST_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Openstack Request Key Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENSTACK_REQUEST_KEY_PAIR_OPERATION_COUNT = CorePackage.OPEN_STACK_REQUEST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.openstack.compute.impl.OpenstackRequestFlavorImpl <em>Openstack Request Flavor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.openstack.compute.impl.OpenstackRequestFlavorImpl
	 * @see org.openecomp.ncomp.openstack.compute.impl.ComputePackageImpl#getOpenstackRequestFlavor()
	 * @generated
	 */
	int OPENSTACK_REQUEST_FLAVOR = 3;

	/**
	 * The feature id for the '<em><b>Project Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENSTACK_REQUEST_FLAVOR__PROJECT_NAME = CorePackage.OPEN_STACK_REQUEST__PROJECT_NAME;

	/**
	 * The feature id for the '<em><b>Vm Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENSTACK_REQUEST_FLAVOR__VM_TYPE = CorePackage.OPEN_STACK_REQUEST_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Openstack Request Flavor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENSTACK_REQUEST_FLAVOR_FEATURE_COUNT = CorePackage.OPEN_STACK_REQUEST_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Openstack Request Flavor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENSTACK_REQUEST_FLAVOR_OPERATION_COUNT = CorePackage.OPEN_STACK_REQUEST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.openstack.compute.impl.OpenstackRequestSecurityGroupImpl <em>Openstack Request Security Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.openstack.compute.impl.OpenstackRequestSecurityGroupImpl
	 * @see org.openecomp.ncomp.openstack.compute.impl.ComputePackageImpl#getOpenstackRequestSecurityGroup()
	 * @generated
	 */
	int OPENSTACK_REQUEST_SECURITY_GROUP = 4;

	/**
	 * The feature id for the '<em><b>Project Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENSTACK_REQUEST_SECURITY_GROUP__PROJECT_NAME = CorePackage.OPEN_STACK_REQUEST__PROJECT_NAME;

	/**
	 * The feature id for the '<em><b>Vm Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENSTACK_REQUEST_SECURITY_GROUP__VM_TYPE = CorePackage.OPEN_STACK_REQUEST_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Openstack Request Security Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENSTACK_REQUEST_SECURITY_GROUP_FEATURE_COUNT = CorePackage.OPEN_STACK_REQUEST_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Openstack Request Security Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENSTACK_REQUEST_SECURITY_GROUP_OPERATION_COUNT = CorePackage.OPEN_STACK_REQUEST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.openstack.compute.impl.OpenstackRequestServerActionImpl <em>Openstack Request Server Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.openstack.compute.impl.OpenstackRequestServerActionImpl
	 * @see org.openecomp.ncomp.openstack.compute.impl.ComputePackageImpl#getOpenstackRequestServerAction()
	 * @generated
	 */
	int OPENSTACK_REQUEST_SERVER_ACTION = 5;

	/**
	 * The feature id for the '<em><b>Project Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENSTACK_REQUEST_SERVER_ACTION__PROJECT_NAME = CorePackage.OPEN_STACK_REQUEST__PROJECT_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENSTACK_REQUEST_SERVER_ACTION__NAME = CorePackage.OPEN_STACK_REQUEST_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENSTACK_REQUEST_SERVER_ACTION__ACTION = CorePackage.OPEN_STACK_REQUEST_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Openstack Request Server Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENSTACK_REQUEST_SERVER_ACTION_FEATURE_COUNT = CorePackage.OPEN_STACK_REQUEST_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Openstack Request Server Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENSTACK_REQUEST_SERVER_ACTION_OPERATION_COUNT = CorePackage.OPEN_STACK_REQUEST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.openstack.compute.impl.OpenstackRequestPollImpl <em>Openstack Request Poll</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.openstack.compute.impl.OpenstackRequestPollImpl
	 * @see org.openecomp.ncomp.openstack.compute.impl.ComputePackageImpl#getOpenstackRequestPoll()
	 * @generated
	 */
	int OPENSTACK_REQUEST_POLL = 6;

	/**
	 * The feature id for the '<em><b>Project Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENSTACK_REQUEST_POLL__PROJECT_NAME = CorePackage.OPEN_STACK_REQUEST__PROJECT_NAME;

	/**
	 * The number of structural features of the '<em>Openstack Request Poll</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENSTACK_REQUEST_POLL_FEATURE_COUNT = CorePackage.OPEN_STACK_REQUEST_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Openstack Request Poll</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENSTACK_REQUEST_POLL_OPERATION_COUNT = CorePackage.OPEN_STACK_REQUEST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.openstack.compute.impl.ServerImpl <em>Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.openstack.compute.impl.ServerImpl
	 * @see org.openecomp.ncomp.openstack.compute.impl.ComputePackageImpl#getServer()
	 * @generated
	 */
	int SERVER = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__ID = 0;

	/**
	 * The feature id for the '<em><b>Tenant id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__TENANT_ID = 1;

	/**
	 * The feature id for the '<em><b>User id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__USER_ID = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__NAME = 3;

	/**
	 * The feature id for the '<em><b>Updated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__UPDATED = 4;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__CREATED = 5;

	/**
	 * The feature id for the '<em><b>Host Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__HOST_ID = 6;

	/**
	 * The feature id for the '<em><b>Access IPv4</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__ACCESS_IPV4 = 7;

	/**
	 * The feature id for the '<em><b>Access IPv6</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__ACCESS_IPV6 = 8;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__STATUS = 9;

	/**
	 * The feature id for the '<em><b>Config drive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__CONFIG_DRIVE = 10;

	/**
	 * The feature id for the '<em><b>Key name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__KEY_NAME = 11;

	/**
	 * The feature id for the '<em><b>Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__PROGRESS = 12;

	/**
	 * The feature id for the '<em><b>OS DCF disk Config</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__OS_DCF_DISK_CONFIG = 13;

	/**
	 * The feature id for the '<em><b>OS EXT STS power state</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__OS_EXT_STS_POWER_STATE = 14;

	/**
	 * The feature id for the '<em><b>OS EXT STS vm state</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__OS_EXT_STS_VM_STATE = 15;

	/**
	 * The feature id for the '<em><b>OS EXT STS task state</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__OS_EXT_STS_TASK_STATE = 16;

	/**
	 * The feature id for the '<em><b>OS EXT SRV ATTR host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__OS_EXT_SRV_ATTR_HOST = 17;

	/**
	 * The feature id for the '<em><b>OS EXT SRV ATTR instance name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__OS_EXT_SRV_ATTR_INSTANCE_NAME = 18;

	/**
	 * The feature id for the '<em><b>OS EXT SRV ATTR hypervisor hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__OS_EXT_SRV_ATTR_HYPERVISOR_HOSTNAME = 19;

	/**
	 * The feature id for the '<em><b>OS SRV USG launched at</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__OS_SRV_USG_LAUNCHED_AT = 20;

	/**
	 * The feature id for the '<em><b>OS SRV USG terminated at</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__OS_SRV_USG_TERMINATED_AT = 21;

	/**
	 * The feature id for the '<em><b>Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__IMAGE = 22;

	/**
	 * The feature id for the '<em><b>Flavor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__FLAVOR = 23;

	/**
	 * The feature id for the '<em><b>Addresses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__ADDRESSES = 24;

	/**
	 * The feature id for the '<em><b>Security groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__SECURITY_GROUPS = 25;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__METADATA = 26;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__LINKS = 27;

	/**
	 * The feature id for the '<em><b>Fault</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__FAULT = 28;

	/**
	 * The number of structural features of the '<em>Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_FEATURE_COUNT = 29;

	/**
	 * The number of operations of the '<em>Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.openstack.compute.impl.ImageImpl <em>Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.openstack.compute.impl.ImageImpl
	 * @see org.openecomp.ncomp.openstack.compute.impl.ComputePackageImpl#getImage()
	 * @generated
	 */
	int IMAGE = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Updated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__UPDATED = 2;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__CREATED = 3;

	/**
	 * The feature id for the '<em><b>Tenant id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__TENANT_ID = 4;

	/**
	 * The feature id for the '<em><b>User id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__USER_ID = 5;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__STATUS = 6;

	/**
	 * The feature id for the '<em><b>Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__PROGRESS = 7;

	/**
	 * The feature id for the '<em><b>Min Disk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__MIN_DISK = 8;

	/**
	 * The feature id for the '<em><b>Min Ram</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__MIN_RAM = 9;

	/**
	 * The feature id for the '<em><b>OS EXT IMG SIZE size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__OS_EXT_IMG_SIZE_SIZE = 10;

	/**
	 * The feature id for the '<em><b>Server</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__SERVER = 11;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__LINKS = 12;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__METADATA = 13;

	/**
	 * The number of structural features of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FEATURE_COUNT = 14;

	/**
	 * The number of operations of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.openstack.compute.impl.FlavorImpl <em>Flavor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.openstack.compute.impl.FlavorImpl
	 * @see org.openecomp.ncomp.openstack.compute.impl.ComputePackageImpl#getFlavor()
	 * @generated
	 */
	int FLAVOR = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAVOR__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAVOR__NAME = 1;

	/**
	 * The feature id for the '<em><b>Ram</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAVOR__RAM = 2;

	/**
	 * The feature id for the '<em><b>Disk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAVOR__DISK = 3;

	/**
	 * The feature id for the '<em><b>Vcpus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAVOR__VCPUS = 4;

	/**
	 * The feature id for the '<em><b>Swap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAVOR__SWAP = 5;

	/**
	 * The feature id for the '<em><b>Rxtx factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAVOR__RXTX_FACTOR = 6;

	/**
	 * The feature id for the '<em><b>OS FLV EXT DATA ephemeral</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAVOR__OS_FLV_EXT_DATA_EPHEMERAL = 7;

	/**
	 * The feature id for the '<em><b>OS FLV DISABLED disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAVOR__OS_FLV_DISABLED_DISABLED = 8;

	/**
	 * The feature id for the '<em><b>Os flavor access is public</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAVOR__OS_FLAVOR_ACCESS_IS_PUBLIC = 9;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAVOR__LINKS = 10;

	/**
	 * The number of structural features of the '<em>Flavor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAVOR_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Flavor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAVOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.openstack.compute.impl.AddressesImpl <em>Addresses</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.openstack.compute.impl.AddressesImpl
	 * @see org.openecomp.ncomp.openstack.compute.impl.ComputePackageImpl#getAddresses()
	 * @generated
	 */
	int ADDRESSES = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESSES__NAME = 0;

	/**
	 * The feature id for the '<em><b>Ips</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESSES__IPS = 1;

	/**
	 * The number of structural features of the '<em>Addresses</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESSES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Addresses</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESSES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.openstack.compute.impl.AddressImpl <em>Address</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.openstack.compute.impl.AddressImpl
	 * @see org.openecomp.ncomp.openstack.compute.impl.ComputePackageImpl#getAddress()
	 * @generated
	 */
	int ADDRESS = 11;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__VERSION = 0;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__ADDR = 1;

	/**
	 * The feature id for the '<em><b>OS EXT IPS MAC mac addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__OS_EXT_IPS_MAC_MAC_ADDR = 2;

	/**
	 * The feature id for the '<em><b>OS EXT IPS type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__OS_EXT_IPS_TYPE = 3;

	/**
	 * The number of structural features of the '<em>Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.openstack.compute.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.openstack.compute.impl.LinkImpl
	 * @see org.openecomp.ncomp.openstack.compute.impl.ComputePackageImpl#getLink()
	 * @generated
	 */
	int LINK = 12;

	/**
	 * The feature id for the '<em><b>Rel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__REL = 0;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__HREF = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.openstack.compute.impl.MetadataImpl <em>Metadata</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.openstack.compute.impl.MetadataImpl
	 * @see org.openecomp.ncomp.openstack.compute.impl.ComputePackageImpl#getMetadata()
	 * @generated
	 */
	int METADATA = 13;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Metadata</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Metadata</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.openstack.compute.impl.FaultImpl <em>Fault</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.openstack.compute.impl.FaultImpl
	 * @see org.openecomp.ncomp.openstack.compute.impl.ComputePackageImpl#getFault()
	 * @generated
	 */
	int FAULT = 14;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT__MESSAGE = 0;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT__CREATED = 1;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT__CODE = 2;

	/**
	 * The number of structural features of the '<em>Fault</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Fault</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.openstack.compute.impl.PersonalityImpl <em>Personality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.openstack.compute.impl.PersonalityImpl
	 * @see org.openecomp.ncomp.openstack.compute.impl.ComputePackageImpl#getPersonality()
	 * @generated
	 */
	int PERSONALITY = 15;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONALITY__PATH = 0;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONALITY__CONTENTS = 1;

	/**
	 * The number of structural features of the '<em>Personality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONALITY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Personality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONALITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.openstack.compute.impl.ReferenceImpl <em>Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.openstack.compute.impl.ReferenceImpl
	 * @see org.openecomp.ncomp.openstack.compute.impl.ComputePackageImpl#getReference()
	 * @generated
	 */
	int REFERENCE = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__ID = 0;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__LINKS = 1;

	/**
	 * The number of structural features of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.openstack.compute.impl.VolumeImpl <em>Volume</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.openstack.compute.impl.VolumeImpl
	 * @see org.openecomp.ncomp.openstack.compute.impl.ComputePackageImpl#getVolume()
	 * @generated
	 */
	int VOLUME = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__NAME = org.openecomp.ncomp.core.CorePackage.NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__LAST_POLLED = org.openecomp.ncomp.core.CorePackage.NAMED_ENTITY__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__LAST_CHANGED = org.openecomp.ncomp.core.CorePackage.NAMED_ENTITY__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__CREATED = org.openecomp.ncomp.core.CorePackage.NAMED_ENTITY__CREATED;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__STATUS = org.openecomp.ncomp.core.CorePackage.NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Display name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__DISPLAY_NAME = org.openecomp.ncomp.core.CorePackage.NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attachments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__ATTACHMENTS = org.openecomp.ncomp.core.CorePackage.NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Availability zone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__AVAILABILITY_ZONE = org.openecomp.ncomp.core.CorePackage.NAMED_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Created at</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__CREATED_AT = org.openecomp.ncomp.core.CorePackage.NAMED_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Volume type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__VOLUME_TYPE = org.openecomp.ncomp.core.CorePackage.NAMED_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__METADATA = org.openecomp.ncomp.core.CorePackage.NAMED_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__ID = org.openecomp.ncomp.core.CorePackage.NAMED_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__SIZE = org.openecomp.ncomp.core.CorePackage.NAMED_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Snapshot id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__SNAPSHOT_ID = org.openecomp.ncomp.core.CorePackage.NAMED_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Display description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__DISPLAY_DESCRIPTION = org.openecomp.ncomp.core.CorePackage.NAMED_ENTITY_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Volume</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME_FEATURE_COUNT = org.openecomp.ncomp.core.CorePackage.NAMED_ENTITY_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Volume</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME_OPERATION_COUNT = org.openecomp.ncomp.core.CorePackage.NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.openstack.compute.impl.VolumeAttachmentImpl <em>Volume Attachment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.openstack.compute.impl.VolumeAttachmentImpl
	 * @see org.openecomp.ncomp.openstack.compute.impl.ComputePackageImpl#getVolumeAttachment()
	 * @generated
	 */
	int VOLUME_ATTACHMENT = 18;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME_ATTACHMENT__DEVICE = 0;

	/**
	 * The feature id for the '<em><b>Server id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME_ATTACHMENT__SERVER_ID = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME_ATTACHMENT__ID = 2;

	/**
	 * The feature id for the '<em><b>Volume id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME_ATTACHMENT__VOLUME_ID = 3;

	/**
	 * The number of structural features of the '<em>Volume Attachment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME_ATTACHMENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Volume Attachment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME_ATTACHMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.openstack.compute.impl.FloatingIpImpl <em>Floating Ip</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.openstack.compute.impl.FloatingIpImpl
	 * @see org.openecomp.ncomp.openstack.compute.impl.ComputePackageImpl#getFloatingIp()
	 * @generated
	 */
	int FLOATING_IP = 19;

	/**
	 * The feature id for the '<em><b>Instance id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATING_IP__INSTANCE_ID = 0;

	/**
	 * The feature id for the '<em><b>Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATING_IP__IP = 1;

	/**
	 * The feature id for the '<em><b>Fixed ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATING_IP__FIXED_IP = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATING_IP__ID = 3;

	/**
	 * The feature id for the '<em><b>Pool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATING_IP__POOL = 4;

	/**
	 * The number of structural features of the '<em>Floating Ip</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATING_IP_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Floating Ip</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATING_IP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.openstack.compute.impl.SecurityGroupImpl <em>Security Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.openstack.compute.impl.SecurityGroupImpl
	 * @see org.openecomp.ncomp.openstack.compute.impl.ComputePackageImpl#getSecurityGroup()
	 * @generated
	 */
	int SECURITY_GROUP = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP__NAME = org.openecomp.ncomp.core.CorePackage.NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP__LAST_POLLED = org.openecomp.ncomp.core.CorePackage.NAMED_ENTITY__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP__LAST_CHANGED = org.openecomp.ncomp.core.CorePackage.NAMED_ENTITY__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP__CREATED = org.openecomp.ncomp.core.CorePackage.NAMED_ENTITY__CREATED;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP__RULES = org.openecomp.ncomp.core.CorePackage.NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tenant id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP__TENANT_ID = org.openecomp.ncomp.core.CorePackage.NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP__ID = org.openecomp.ncomp.core.CorePackage.NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP__DESCRIPTION = org.openecomp.ncomp.core.CorePackage.NAMED_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Security Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP_FEATURE_COUNT = org.openecomp.ncomp.core.CorePackage.NAMED_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Security Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP_OPERATION_COUNT = org.openecomp.ncomp.core.CorePackage.NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.openstack.compute.impl.SecurityRuleImpl <em>Security Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.openstack.compute.impl.SecurityRuleImpl
	 * @see org.openecomp.ncomp.openstack.compute.impl.ComputePackageImpl#getSecurityRule()
	 * @generated
	 */
	int SECURITY_RULE = 21;

	/**
	 * The feature id for the '<em><b>From port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_RULE__FROM_PORT = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_RULE__GROUP = 1;

	/**
	 * The feature id for the '<em><b>Ip protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_RULE__IP_PROTOCOL = 2;

	/**
	 * The feature id for the '<em><b>To port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_RULE__TO_PORT = 3;

	/**
	 * The feature id for the '<em><b>Parent group id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_RULE__PARENT_GROUP_ID = 4;

	/**
	 * The feature id for the '<em><b>Ip range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_RULE__IP_RANGE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_RULE__ID = 6;

	/**
	 * The number of structural features of the '<em>Security Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_RULE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Security Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.openstack.compute.impl.SecurityRangeImpl <em>Security Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.openstack.compute.impl.SecurityRangeImpl
	 * @see org.openecomp.ncomp.openstack.compute.impl.ComputePackageImpl#getSecurityRange()
	 * @generated
	 */
	int SECURITY_RANGE = 22;

	/**
	 * The feature id for the '<em><b>Cidr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_RANGE__CIDR = 0;

	/**
	 * The number of structural features of the '<em>Security Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_RANGE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Security Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_RANGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.openstack.compute.impl.KeyPairImpl <em>Key Pair</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.openstack.compute.impl.KeyPairImpl
	 * @see org.openecomp.ncomp.openstack.compute.impl.ComputePackageImpl#getKeyPair()
	 * @generated
	 */
	int KEY_PAIR = 23;

	/**
	 * The feature id for the '<em><b>Public key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_PAIR__PUBLIC_KEY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_PAIR__NAME = 1;

	/**
	 * The feature id for the '<em><b>Fingerprint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_PAIR__FINGERPRINT = 2;

	/**
	 * The number of structural features of the '<em>Key Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_PAIR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Key Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_PAIR_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.openstack.compute.ComputeService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.ComputeService
	 * @generated
	 */
	EClass getComputeService();

	/**
	 * Returns the meta object for the '{@link org.openecomp.ncomp.openstack.compute.ComputeService#createServer(org.openecomp.ncomp.openstack.compute.OpenstackRequestNewServer) <em>Create Server</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Server</em>' operation.
	 * @see org.openecomp.ncomp.openstack.compute.ComputeService#createServer(org.openecomp.ncomp.openstack.compute.OpenstackRequestNewServer)
	 * @generated
	 */
	EOperation getComputeService__CreateServer__OpenstackRequestNewServer();

	/**
	 * Returns the meta object for the '{@link org.openecomp.ncomp.openstack.compute.ComputeService#deleteServer(java.lang.String, java.lang.String) <em>Delete Server</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Delete Server</em>' operation.
	 * @see org.openecomp.ncomp.openstack.compute.ComputeService#deleteServer(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getComputeService__DeleteServer__String_String();

	/**
	 * Returns the meta object for the '{@link org.openecomp.ncomp.openstack.compute.ComputeService#createKeyPair(org.openecomp.ncomp.openstack.compute.OpenstackRequestKeyPair) <em>Create Key Pair</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Key Pair</em>' operation.
	 * @see org.openecomp.ncomp.openstack.compute.ComputeService#createKeyPair(org.openecomp.ncomp.openstack.compute.OpenstackRequestKeyPair)
	 * @generated
	 */
	EOperation getComputeService__CreateKeyPair__OpenstackRequestKeyPair();

	/**
	 * Returns the meta object for the '{@link org.openecomp.ncomp.openstack.compute.ComputeService#delete(org.openecomp.ncomp.openstack.core.OpenstackRequestDelete) <em>Delete</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Delete</em>' operation.
	 * @see org.openecomp.ncomp.openstack.compute.ComputeService#delete(org.openecomp.ncomp.openstack.core.OpenstackRequestDelete)
	 * @generated
	 */
	EOperation getComputeService__Delete__OpenstackRequestDelete();

	/**
	 * Returns the meta object for the '{@link org.openecomp.ncomp.openstack.compute.ComputeService#createFlavor(org.openecomp.ncomp.openstack.compute.OpenstackRequestFlavor) <em>Create Flavor</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Flavor</em>' operation.
	 * @see org.openecomp.ncomp.openstack.compute.ComputeService#createFlavor(org.openecomp.ncomp.openstack.compute.OpenstackRequestFlavor)
	 * @generated
	 */
	EOperation getComputeService__CreateFlavor__OpenstackRequestFlavor();

	/**
	 * Returns the meta object for the '{@link org.openecomp.ncomp.openstack.compute.ComputeService#createSecurityGroup(org.openecomp.ncomp.openstack.compute.OpenstackRequestSecurityGroup) <em>Create Security Group</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Security Group</em>' operation.
	 * @see org.openecomp.ncomp.openstack.compute.ComputeService#createSecurityGroup(org.openecomp.ncomp.openstack.compute.OpenstackRequestSecurityGroup)
	 * @generated
	 */
	EOperation getComputeService__CreateSecurityGroup__OpenstackRequestSecurityGroup();

	/**
	 * Returns the meta object for the '{@link org.openecomp.ncomp.openstack.compute.ComputeService#serverAction(org.openecomp.ncomp.openstack.compute.OpenstackRequestServerAction) <em>Server Action</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Server Action</em>' operation.
	 * @see org.openecomp.ncomp.openstack.compute.ComputeService#serverAction(org.openecomp.ncomp.openstack.compute.OpenstackRequestServerAction)
	 * @generated
	 */
	EOperation getComputeService__ServerAction__OpenstackRequestServerAction();

	/**
	 * Returns the meta object for the '{@link org.openecomp.ncomp.openstack.compute.ComputeService#deployVmType(java.lang.String, java.lang.String) <em>Deploy Vm Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Deploy Vm Type</em>' operation.
	 * @see org.openecomp.ncomp.openstack.compute.ComputeService#deployVmType(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getComputeService__DeployVmType__String_String();

	/**
	 * Returns the meta object for the '{@link org.openecomp.ncomp.openstack.compute.ComputeService#undeployVmType(java.lang.String, java.lang.String) <em>Undeploy Vm Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Undeploy Vm Type</em>' operation.
	 * @see org.openecomp.ncomp.openstack.compute.ComputeService#undeployVmType(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getComputeService__UndeployVmType__String_String();

	/**
	 * Returns the meta object for the '{@link org.openecomp.ncomp.openstack.compute.ComputeService#deployUser(org.openecomp.ncomp.core.User, java.lang.String) <em>Deploy User</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Deploy User</em>' operation.
	 * @see org.openecomp.ncomp.openstack.compute.ComputeService#deployUser(org.openecomp.ncomp.core.User, java.lang.String)
	 * @generated
	 */
	EOperation getComputeService__DeployUser__User_String();

	/**
	 * Returns the meta object for the '{@link org.openecomp.ncomp.openstack.compute.ComputeService#undeployUser(org.openecomp.ncomp.core.User, java.lang.String) <em>Undeploy User</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Undeploy User</em>' operation.
	 * @see org.openecomp.ncomp.openstack.compute.ComputeService#undeployUser(org.openecomp.ncomp.core.User, java.lang.String)
	 * @generated
	 */
	EOperation getComputeService__UndeployUser__User_String();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.openstack.compute.OpenstackRequestNewServer <em>Openstack Request New Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Openstack Request New Server</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.OpenstackRequestNewServer
	 * @generated
	 */
	EClass getOpenstackRequestNewServer();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.compute.OpenstackRequestNewServer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.OpenstackRequestNewServer#getName()
	 * @see #getOpenstackRequestNewServer()
	 * @generated
	 */
	EAttribute getOpenstackRequestNewServer_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.compute.OpenstackRequestNewServer#getHypervisor <em>Hypervisor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hypervisor</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.OpenstackRequestNewServer#getHypervisor()
	 * @see #getOpenstackRequestNewServer()
	 * @generated
	 */
	EAttribute getOpenstackRequestNewServer_Hypervisor();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.compute.OpenstackRequestNewServer#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.OpenstackRequestNewServer#getUser()
	 * @see #getOpenstackRequestNewServer()
	 * @generated
	 */
	EAttribute getOpenstackRequestNewServer_User();

	/**
	 * Returns the meta object for the attribute list '{@link org.openecomp.ncomp.openstack.compute.OpenstackRequestNewServer#getNetworks <em>Networks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Networks</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.OpenstackRequestNewServer#getNetworks()
	 * @see #getOpenstackRequestNewServer()
	 * @generated
	 */
	EAttribute getOpenstackRequestNewServer_Networks();

	/**
	 * Returns the meta object for the attribute list '{@link org.openecomp.ncomp.openstack.compute.OpenstackRequestNewServer#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Ports</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.OpenstackRequestNewServer#getPorts()
	 * @see #getOpenstackRequestNewServer()
	 * @generated
	 */
	EAttribute getOpenstackRequestNewServer_Ports();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.compute.OpenstackRequestNewServer#getUser_data <em>User data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User data</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.OpenstackRequestNewServer#getUser_data()
	 * @see #getOpenstackRequestNewServer()
	 * @generated
	 */
	EAttribute getOpenstackRequestNewServer_User_data();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.compute.OpenstackRequestNewServer#getFloatingIp <em>Floating Ip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Floating Ip</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.OpenstackRequestNewServer#getFloatingIp()
	 * @see #getOpenstackRequestNewServer()
	 * @generated
	 */
	EAttribute getOpenstackRequestNewServer_FloatingIp();

	/**
	 * Returns the meta object for the containment reference '{@link org.openecomp.ncomp.openstack.compute.OpenstackRequestNewServer#getVmType <em>Vm Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Vm Type</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.OpenstackRequestNewServer#getVmType()
	 * @see #getOpenstackRequestNewServer()
	 * @generated
	 */
	EReference getOpenstackRequestNewServer_VmType();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.openstack.compute.OpenstackRequestKeyPair <em>Openstack Request Key Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Openstack Request Key Pair</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.OpenstackRequestKeyPair
	 * @generated
	 */
	EClass getOpenstackRequestKeyPair();

	/**
	 * Returns the meta object for the containment reference '{@link org.openecomp.ncomp.openstack.compute.OpenstackRequestKeyPair#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>User</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.OpenstackRequestKeyPair#getUser()
	 * @see #getOpenstackRequestKeyPair()
	 * @generated
	 */
	EReference getOpenstackRequestKeyPair_User();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.openstack.compute.OpenstackRequestFlavor <em>Openstack Request Flavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Openstack Request Flavor</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.OpenstackRequestFlavor
	 * @generated
	 */
	EClass getOpenstackRequestFlavor();

	/**
	 * Returns the meta object for the containment reference '{@link org.openecomp.ncomp.openstack.compute.OpenstackRequestFlavor#getVmType <em>Vm Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Vm Type</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.OpenstackRequestFlavor#getVmType()
	 * @see #getOpenstackRequestFlavor()
	 * @generated
	 */
	EReference getOpenstackRequestFlavor_VmType();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.openstack.compute.OpenstackRequestSecurityGroup <em>Openstack Request Security Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Openstack Request Security Group</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.OpenstackRequestSecurityGroup
	 * @generated
	 */
	EClass getOpenstackRequestSecurityGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.openecomp.ncomp.openstack.compute.OpenstackRequestSecurityGroup#getVmType <em>Vm Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Vm Type</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.OpenstackRequestSecurityGroup#getVmType()
	 * @see #getOpenstackRequestSecurityGroup()
	 * @generated
	 */
	EReference getOpenstackRequestSecurityGroup_VmType();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.openstack.compute.OpenstackRequestServerAction <em>Openstack Request Server Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Openstack Request Server Action</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.OpenstackRequestServerAction
	 * @generated
	 */
	EClass getOpenstackRequestServerAction();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.compute.OpenstackRequestServerAction#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.OpenstackRequestServerAction#getName()
	 * @see #getOpenstackRequestServerAction()
	 * @generated
	 */
	EAttribute getOpenstackRequestServerAction_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.compute.OpenstackRequestServerAction#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.OpenstackRequestServerAction#getAction()
	 * @see #getOpenstackRequestServerAction()
	 * @generated
	 */
	EAttribute getOpenstackRequestServerAction_Action();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.openstack.compute.OpenstackRequestPoll <em>Openstack Request Poll</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Openstack Request Poll</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.OpenstackRequestPoll
	 * @generated
	 */
	EClass getOpenstackRequestPoll();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.openstack.compute.Server <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Server</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.Server
	 * @generated
	 */
	EClass getServer();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.compute.Server#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.Server#getId()
	 * @see #getServer()
	 * @generated
	 */
	EAttribute getServer_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.compute.Server#getTenant_id <em>Tenant id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tenant id</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.Server#getTenant_id()
	 * @see #getServer()
	 * @generated
	 */
	EAttribute getServer_Tenant_id();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.compute.Server#getUser_id <em>User id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User id</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.Server#getUser_id()
	 * @see #getServer()
	 * @generated
	 */
	EAttribute getServer_User_id();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.compute.Server#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.Server#getName()
	 * @see #getServer()
	 * @generated
	 */
	EAttribute getServer_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.compute.Server#getUpdated <em>Updated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Updated</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.Server#getUpdated()
	 * @see #getServer()
	 * @generated
	 */
	EAttribute getServer_Updated();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.compute.Server#getCreated <em>Created</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.Server#getCreated()
	 * @see #getServer()
	 * @generated
	 */
	EAttribute getServer_Created();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.compute.Server#getHostId <em>Host Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Id</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.Server#getHostId()
	 * @see #getServer()
	 * @generated
	 */
	EAttribute getServer_HostId();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.compute.Server#getAccessIPv4 <em>Access IPv4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access IPv4</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.Server#getAccessIPv4()
	 * @see #getServer()
	 * @generated
	 */
	EAttribute getServer_AccessIPv4();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.compute.Server#getAccessIPv6 <em>Access IPv6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access IPv6</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.Server#getAccessIPv6()
	 * @see #getServer()
	 * @generated
	 */
	EAttribute getServer_AccessIPv6();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.compute.Server#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.Server#getStatus()
	 * @see #getServer()
	 * @generated
	 */
	EAttribute getServer_Status();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.compute.Server#getConfig_drive <em>Config drive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Config drive</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.Server#getConfig_drive()
	 * @see #getServer()
	 * @generated
	 */
	EAttribute getServer_Config_drive();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.compute.Server#getKey_name <em>Key name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key name</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.Server#getKey_name()
	 * @see #getServer()
	 * @generated
	 */
	EAttribute getServer_Key_name();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.compute.Server#getProgress <em>Progress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Progress</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.Server#getProgress()
	 * @see #getServer()
	 * @generated
	 */
	EAttribute getServer_Progress();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.compute.Server#getOS_DCF_diskConfig <em>OS DCF disk Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>OS DCF disk Config</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.Server#getOS_DCF_diskConfig()
	 * @see #getServer()
	 * @generated
	 */
	EAttribute getServer_OS_DCF_diskConfig();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.compute.Server#getOS_EXT_STS_power_state <em>OS EXT STS power state</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>OS EXT STS power state</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.Server#getOS_EXT_STS_power_state()
	 * @see #getServer()
	 * @generated
	 */
	EAttribute getServer_OS_EXT_STS_power_state();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.compute.Server#getOS_EXT_STS_vm_state <em>OS EXT STS vm state</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>OS EXT STS vm state</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.Server#getOS_EXT_STS_vm_state()
	 * @see #getServer()
	 * @generated
	 */
	EAttribute getServer_OS_EXT_STS_vm_state();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.compute.Server#getOS_EXT_STS_task_state <em>OS EXT STS task state</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>OS EXT STS task state</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.Server#getOS_EXT_STS_task_state()
	 * @see #getServer()
	 * @generated
	 */
	EAttribute getServer_OS_EXT_STS_task_state();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.compute.Server#getOS_EXT_SRV_ATTR_host <em>OS EXT SRV ATTR host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>OS EXT SRV ATTR host</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.Server#getOS_EXT_SRV_ATTR_host()
	 * @see #getServer()
	 * @generated
	 */
	EAttribute getServer_OS_EXT_SRV_ATTR_host();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.compute.Server#getOS_EXT_SRV_ATTR_instance_name <em>OS EXT SRV ATTR instance name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>OS EXT SRV ATTR instance name</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.Server#getOS_EXT_SRV_ATTR_instance_name()
	 * @see #getServer()
	 * @generated
	 */
	EAttribute getServer_OS_EXT_SRV_ATTR_instance_name();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.compute.Server#getOS_EXT_SRV_ATTR_hypervisor_hostname <em>OS EXT SRV ATTR hypervisor hostname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>OS EXT SRV ATTR hypervisor hostname</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.Server#getOS_EXT_SRV_ATTR_hypervisor_hostname()
	 * @see #getServer()
	 * @generated
	 */
	EAttribute getServer_OS_EXT_SRV_ATTR_hypervisor_hostname();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.compute.Server#getOS_SRV_USG_launched_at <em>OS SRV USG launched at</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>OS SRV USG launched at</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.Server#getOS_SRV_USG_launched_at()
	 * @see #getServer()
	 * @generated
	 */
	EAttribute getServer_OS_SRV_USG_launched_at();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.compute.Server#getOS_SRV_USG_terminated_at <em>OS SRV USG terminated at</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>OS SRV USG terminated at</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.Server#getOS_SRV_USG_terminated_at()
	 * @see #getServer()
	 * @generated
	 */
	EAttribute getServer_OS_SRV_USG_terminated_at();

	/**
	 * Returns the meta object for the containment reference '{@link org.openecomp.ncomp.openstack.compute.Server#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Image</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.Server#getImage()
	 * @see #getServer()
	 * @generated
	 */
	EReference getServer_Image();

	/**
	 * Returns the meta object for the containment reference '{@link org.openecomp.ncomp.openstack.compute.Server#getFlavor <em>Flavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Flavor</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.Server#getFlavor()
	 * @see #getServer()
	 * @generated
	 */
	EReference getServer_Flavor();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.openstack.compute.Server#getAddresses <em>Addresses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Addresses</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.Server#getAddresses()
	 * @see #getServer()
	 * @generated
	 */
	EReference getServer_Addresses();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.openstack.compute.Server#getSecurity_groups <em>Security groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Security groups</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.Server#getSecurity_groups()
	 * @see #getServer()
	 * @generated
	 */
	EReference getServer_Security_groups();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.openstack.compute.Server#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metadata</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.Server#getMetadata()
	 * @see #getServer()
	 * @generated
	 */
	EReference getServer_Metadata();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.openstack.compute.Server#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.Server#getLinks()
	 * @see #getServer()
	 * @generated
	 */
	EReference getServer_Links();

	/**
	 * Returns the meta object for the containment reference '{@link org.openecomp.ncomp.openstack.compute.Server#getFault <em>Fault</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fault</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.Server#getFault()
	 * @see #getServer()
	 * @generated
	 */
	EReference getServer_Fault();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.openstack.compute.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.Image
	 * @generated
	 */
	EClass getImage();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.compute.Image#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.Image#getId()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.compute.Image#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.Image#getName()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.compute.Image#getUpdated <em>Updated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Updated</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.Image#getUpdated()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Updated();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.compute.Image#getCreated <em>Created</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.Image#getCreated()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Created();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.compute.Image#getTenant_id <em>Tenant id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tenant id</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.Image#getTenant_id()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Tenant_id();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.compute.Image#getUser_id <em>User id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User id</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.Image#getUser_id()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_User_id();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.compute.Image#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.Image#getStatus()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Status();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.compute.Image#getProgress <em>Progress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Progress</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.Image#getProgress()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Progress();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.compute.Image#getMinDisk <em>Min Disk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Disk</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.Image#getMinDisk()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_MinDisk();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.compute.Image#getMinRam <em>Min Ram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Ram</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.Image#getMinRam()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_MinRam();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.compute.Image#getOS_EXT_IMG_SIZE_size <em>OS EXT IMG SIZE size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>OS EXT IMG SIZE size</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.Image#getOS_EXT_IMG_SIZE_size()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_OS_EXT_IMG_SIZE_size();

	/**
	 * Returns the meta object for the containment reference '{@link org.openecomp.ncomp.openstack.compute.Image#getServer <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Server</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.Image#getServer()
	 * @see #getImage()
	 * @generated
	 */
	EReference getImage_Server();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.openstack.compute.Image#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.Image#getLinks()
	 * @see #getImage()
	 * @generated
	 */
	EReference getImage_Links();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.openstack.compute.Image#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metadata</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.Image#getMetadata()
	 * @see #getImage()
	 * @generated
	 */
	EReference getImage_Metadata();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.openstack.compute.Flavor <em>Flavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flavor</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.Flavor
	 * @generated
	 */
	EClass getFlavor();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.compute.Flavor#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.Flavor#getId()
	 * @see #getFlavor()
	 * @generated
	 */
	EAttribute getFlavor_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.compute.Flavor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.Flavor#getName()
	 * @see #getFlavor()
	 * @generated
	 */
	EAttribute getFlavor_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.compute.Flavor#getRam <em>Ram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ram</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.Flavor#getRam()
	 * @see #getFlavor()
	 * @generated
	 */
	EAttribute getFlavor_Ram();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.compute.Flavor#getDisk <em>Disk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disk</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.Flavor#getDisk()
	 * @see #getFlavor()
	 * @generated
	 */
	EAttribute getFlavor_Disk();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.compute.Flavor#getVcpus <em>Vcpus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vcpus</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.Flavor#getVcpus()
	 * @see #getFlavor()
	 * @generated
	 */
	EAttribute getFlavor_Vcpus();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.compute.Flavor#getSwap <em>Swap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Swap</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.Flavor#getSwap()
	 * @see #getFlavor()
	 * @generated
	 */
	EAttribute getFlavor_Swap();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.compute.Flavor#getRxtx_factor <em>Rxtx factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rxtx factor</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.Flavor#getRxtx_factor()
	 * @see #getFlavor()
	 * @generated
	 */
	EAttribute getFlavor_Rxtx_factor();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.compute.Flavor#getOS_FLV_EXT_DATA_ephemeral <em>OS FLV EXT DATA ephemeral</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>OS FLV EXT DATA ephemeral</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.Flavor#getOS_FLV_EXT_DATA_ephemeral()
	 * @see #getFlavor()
	 * @generated
	 */
	EAttribute getFlavor_OS_FLV_EXT_DATA_ephemeral();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.compute.Flavor#isOS_FLV_DISABLED_disabled <em>OS FLV DISABLED disabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>OS FLV DISABLED disabled</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.Flavor#isOS_FLV_DISABLED_disabled()
	 * @see #getFlavor()
	 * @generated
	 */
	EAttribute getFlavor_OS_FLV_DISABLED_disabled();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.compute.Flavor#isOs_flavor_access_is_public <em>Os flavor access is public</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Os flavor access is public</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.Flavor#isOs_flavor_access_is_public()
	 * @see #getFlavor()
	 * @generated
	 */
	EAttribute getFlavor_Os_flavor_access_is_public();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.openstack.compute.Flavor#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.Flavor#getLinks()
	 * @see #getFlavor()
	 * @generated
	 */
	EReference getFlavor_Links();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.openstack.compute.Addresses <em>Addresses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Addresses</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.Addresses
	 * @generated
	 */
	EClass getAddresses();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.compute.Addresses#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.Addresses#getName()
	 * @see #getAddresses()
	 * @generated
	 */
	EAttribute getAddresses_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.openstack.compute.Addresses#getIps <em>Ips</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ips</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.Addresses#getIps()
	 * @see #getAddresses()
	 * @generated
	 */
	EReference getAddresses_Ips();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.openstack.compute.Address <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.Address
	 * @generated
	 */
	EClass getAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.compute.Address#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.Address#getVersion()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_Version();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.compute.Address#getAddr <em>Addr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Addr</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.Address#getAddr()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_Addr();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.compute.Address#getOS_EXT_IPS_MAC_mac_addr <em>OS EXT IPS MAC mac addr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>OS EXT IPS MAC mac addr</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.Address#getOS_EXT_IPS_MAC_mac_addr()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_OS_EXT_IPS_MAC_mac_addr();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.compute.Address#getOS_EXT_IPS_type <em>OS EXT IPS type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>OS EXT IPS type</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.Address#getOS_EXT_IPS_type()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_OS_EXT_IPS_type();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.openstack.compute.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.compute.Link#getRel <em>Rel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rel</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.Link#getRel()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Rel();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.compute.Link#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.Link#getHref()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Href();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.compute.Link#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.Link#getType()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Type();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.openstack.compute.Metadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metadata</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.Metadata
	 * @generated
	 */
	EClass getMetadata();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.compute.Metadata#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.Metadata#getKey()
	 * @see #getMetadata()
	 * @generated
	 */
	EAttribute getMetadata_Key();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.compute.Metadata#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.Metadata#getValue()
	 * @see #getMetadata()
	 * @generated
	 */
	EAttribute getMetadata_Value();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.openstack.compute.Fault <em>Fault</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fault</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.Fault
	 * @generated
	 */
	EClass getFault();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.compute.Fault#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.Fault#getMessage()
	 * @see #getFault()
	 * @generated
	 */
	EAttribute getFault_Message();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.compute.Fault#getCreated <em>Created</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.Fault#getCreated()
	 * @see #getFault()
	 * @generated
	 */
	EAttribute getFault_Created();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.compute.Fault#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.Fault#getCode()
	 * @see #getFault()
	 * @generated
	 */
	EAttribute getFault_Code();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.openstack.compute.Personality <em>Personality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Personality</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.Personality
	 * @generated
	 */
	EClass getPersonality();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.compute.Personality#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.Personality#getPath()
	 * @see #getPersonality()
	 * @generated
	 */
	EAttribute getPersonality_Path();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.compute.Personality#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contents</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.Personality#getContents()
	 * @see #getPersonality()
	 * @generated
	 */
	EAttribute getPersonality_Contents();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.openstack.compute.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.Reference
	 * @generated
	 */
	EClass getReference();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.compute.Reference#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.Reference#getId()
	 * @see #getReference()
	 * @generated
	 */
	EAttribute getReference_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.openstack.compute.Reference#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.Reference#getLinks()
	 * @see #getReference()
	 * @generated
	 */
	EReference getReference_Links();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.openstack.compute.Volume <em>Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Volume</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.Volume
	 * @generated
	 */
	EClass getVolume();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.compute.Volume#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.Volume#getStatus()
	 * @see #getVolume()
	 * @generated
	 */
	EAttribute getVolume_Status();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.compute.Volume#getDisplay_name <em>Display name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display name</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.Volume#getDisplay_name()
	 * @see #getVolume()
	 * @generated
	 */
	EAttribute getVolume_Display_name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.openstack.compute.Volume#getAttachments <em>Attachments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attachments</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.Volume#getAttachments()
	 * @see #getVolume()
	 * @generated
	 */
	EReference getVolume_Attachments();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.compute.Volume#getAvailability_zone <em>Availability zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Availability zone</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.Volume#getAvailability_zone()
	 * @see #getVolume()
	 * @generated
	 */
	EAttribute getVolume_Availability_zone();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.compute.Volume#getCreated_at <em>Created at</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created at</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.Volume#getCreated_at()
	 * @see #getVolume()
	 * @generated
	 */
	EAttribute getVolume_Created_at();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.compute.Volume#getVolume_type <em>Volume type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volume type</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.Volume#getVolume_type()
	 * @see #getVolume()
	 * @generated
	 */
	EAttribute getVolume_Volume_type();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.openstack.compute.Volume#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metadata</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.Volume#getMetadata()
	 * @see #getVolume()
	 * @generated
	 */
	EReference getVolume_Metadata();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.compute.Volume#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.Volume#getId()
	 * @see #getVolume()
	 * @generated
	 */
	EAttribute getVolume_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.compute.Volume#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.Volume#getSize()
	 * @see #getVolume()
	 * @generated
	 */
	EAttribute getVolume_Size();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.compute.Volume#getSnapshot_id <em>Snapshot id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Snapshot id</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.Volume#getSnapshot_id()
	 * @see #getVolume()
	 * @generated
	 */
	EAttribute getVolume_Snapshot_id();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.compute.Volume#getDisplay_description <em>Display description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display description</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.Volume#getDisplay_description()
	 * @see #getVolume()
	 * @generated
	 */
	EAttribute getVolume_Display_description();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.openstack.compute.VolumeAttachment <em>Volume Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Volume Attachment</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.VolumeAttachment
	 * @generated
	 */
	EClass getVolumeAttachment();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.compute.VolumeAttachment#getDevice <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.VolumeAttachment#getDevice()
	 * @see #getVolumeAttachment()
	 * @generated
	 */
	EAttribute getVolumeAttachment_Device();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.compute.VolumeAttachment#getServer_id <em>Server id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Server id</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.VolumeAttachment#getServer_id()
	 * @see #getVolumeAttachment()
	 * @generated
	 */
	EAttribute getVolumeAttachment_Server_id();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.compute.VolumeAttachment#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.VolumeAttachment#getId()
	 * @see #getVolumeAttachment()
	 * @generated
	 */
	EAttribute getVolumeAttachment_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.compute.VolumeAttachment#getVolume_id <em>Volume id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volume id</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.VolumeAttachment#getVolume_id()
	 * @see #getVolumeAttachment()
	 * @generated
	 */
	EAttribute getVolumeAttachment_Volume_id();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.openstack.compute.FloatingIp <em>Floating Ip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Floating Ip</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.FloatingIp
	 * @generated
	 */
	EClass getFloatingIp();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.compute.FloatingIp#getInstance_id <em>Instance id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance id</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.FloatingIp#getInstance_id()
	 * @see #getFloatingIp()
	 * @generated
	 */
	EAttribute getFloatingIp_Instance_id();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.compute.FloatingIp#getIp <em>Ip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ip</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.FloatingIp#getIp()
	 * @see #getFloatingIp()
	 * @generated
	 */
	EAttribute getFloatingIp_Ip();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.compute.FloatingIp#getFixed_ip <em>Fixed ip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fixed ip</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.FloatingIp#getFixed_ip()
	 * @see #getFloatingIp()
	 * @generated
	 */
	EAttribute getFloatingIp_Fixed_ip();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.compute.FloatingIp#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.FloatingIp#getId()
	 * @see #getFloatingIp()
	 * @generated
	 */
	EAttribute getFloatingIp_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.compute.FloatingIp#getPool <em>Pool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pool</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.FloatingIp#getPool()
	 * @see #getFloatingIp()
	 * @generated
	 */
	EAttribute getFloatingIp_Pool();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.openstack.compute.SecurityGroup <em>Security Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Group</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.SecurityGroup
	 * @generated
	 */
	EClass getSecurityGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.openstack.compute.SecurityGroup#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.SecurityGroup#getRules()
	 * @see #getSecurityGroup()
	 * @generated
	 */
	EReference getSecurityGroup_Rules();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.compute.SecurityGroup#getTenant_id <em>Tenant id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tenant id</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.SecurityGroup#getTenant_id()
	 * @see #getSecurityGroup()
	 * @generated
	 */
	EAttribute getSecurityGroup_Tenant_id();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.compute.SecurityGroup#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.SecurityGroup#getId()
	 * @see #getSecurityGroup()
	 * @generated
	 */
	EAttribute getSecurityGroup_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.compute.SecurityGroup#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.SecurityGroup#getDescription()
	 * @see #getSecurityGroup()
	 * @generated
	 */
	EAttribute getSecurityGroup_Description();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.openstack.compute.SecurityRule <em>Security Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Rule</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.SecurityRule
	 * @generated
	 */
	EClass getSecurityRule();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.compute.SecurityRule#getFrom_port <em>From port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From port</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.SecurityRule#getFrom_port()
	 * @see #getSecurityRule()
	 * @generated
	 */
	EAttribute getSecurityRule_From_port();

	/**
	 * Returns the meta object for the containment reference '{@link org.openecomp.ncomp.openstack.compute.SecurityRule#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Group</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.SecurityRule#getGroup()
	 * @see #getSecurityRule()
	 * @generated
	 */
	EReference getSecurityRule_Group();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.compute.SecurityRule#getIp_protocol <em>Ip protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ip protocol</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.SecurityRule#getIp_protocol()
	 * @see #getSecurityRule()
	 * @generated
	 */
	EAttribute getSecurityRule_Ip_protocol();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.compute.SecurityRule#getTo_port <em>To port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To port</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.SecurityRule#getTo_port()
	 * @see #getSecurityRule()
	 * @generated
	 */
	EAttribute getSecurityRule_To_port();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.compute.SecurityRule#getParent_group_id <em>Parent group id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parent group id</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.SecurityRule#getParent_group_id()
	 * @see #getSecurityRule()
	 * @generated
	 */
	EAttribute getSecurityRule_Parent_group_id();

	/**
	 * Returns the meta object for the containment reference '{@link org.openecomp.ncomp.openstack.compute.SecurityRule#getIp_range <em>Ip range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ip range</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.SecurityRule#getIp_range()
	 * @see #getSecurityRule()
	 * @generated
	 */
	EReference getSecurityRule_Ip_range();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.compute.SecurityRule#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.SecurityRule#getId()
	 * @see #getSecurityRule()
	 * @generated
	 */
	EAttribute getSecurityRule_Id();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.openstack.compute.SecurityRange <em>Security Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Range</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.SecurityRange
	 * @generated
	 */
	EClass getSecurityRange();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.compute.SecurityRange#getCidr <em>Cidr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cidr</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.SecurityRange#getCidr()
	 * @see #getSecurityRange()
	 * @generated
	 */
	EAttribute getSecurityRange_Cidr();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.openstack.compute.KeyPair <em>Key Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key Pair</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.KeyPair
	 * @generated
	 */
	EClass getKeyPair();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.compute.KeyPair#getPublic_key <em>Public key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Public key</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.KeyPair#getPublic_key()
	 * @see #getKeyPair()
	 * @generated
	 */
	EAttribute getKeyPair_Public_key();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.compute.KeyPair#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.KeyPair#getName()
	 * @see #getKeyPair()
	 * @generated
	 */
	EAttribute getKeyPair_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.compute.KeyPair#getFingerprint <em>Fingerprint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fingerprint</em>'.
	 * @see org.openecomp.ncomp.openstack.compute.KeyPair#getFingerprint()
	 * @see #getKeyPair()
	 * @generated
	 */
	EAttribute getKeyPair_Fingerprint();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ComputeFactory getComputeFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.openstack.compute.impl.ComputeServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.openstack.compute.impl.ComputeServiceImpl
		 * @see org.openecomp.ncomp.openstack.compute.impl.ComputePackageImpl#getComputeService()
		 * @generated
		 */
		EClass COMPUTE_SERVICE = eINSTANCE.getComputeService();

		/**
		 * The meta object literal for the '<em><b>Create Server</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPUTE_SERVICE___CREATE_SERVER__OPENSTACKREQUESTNEWSERVER = eINSTANCE.getComputeService__CreateServer__OpenstackRequestNewServer();

		/**
		 * The meta object literal for the '<em><b>Delete Server</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPUTE_SERVICE___DELETE_SERVER__STRING_STRING = eINSTANCE.getComputeService__DeleteServer__String_String();

		/**
		 * The meta object literal for the '<em><b>Create Key Pair</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPUTE_SERVICE___CREATE_KEY_PAIR__OPENSTACKREQUESTKEYPAIR = eINSTANCE.getComputeService__CreateKeyPair__OpenstackRequestKeyPair();

		/**
		 * The meta object literal for the '<em><b>Delete</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPUTE_SERVICE___DELETE__OPENSTACKREQUESTDELETE = eINSTANCE.getComputeService__Delete__OpenstackRequestDelete();

		/**
		 * The meta object literal for the '<em><b>Create Flavor</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPUTE_SERVICE___CREATE_FLAVOR__OPENSTACKREQUESTFLAVOR = eINSTANCE.getComputeService__CreateFlavor__OpenstackRequestFlavor();

		/**
		 * The meta object literal for the '<em><b>Create Security Group</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPUTE_SERVICE___CREATE_SECURITY_GROUP__OPENSTACKREQUESTSECURITYGROUP = eINSTANCE.getComputeService__CreateSecurityGroup__OpenstackRequestSecurityGroup();

		/**
		 * The meta object literal for the '<em><b>Server Action</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPUTE_SERVICE___SERVER_ACTION__OPENSTACKREQUESTSERVERACTION = eINSTANCE.getComputeService__ServerAction__OpenstackRequestServerAction();

		/**
		 * The meta object literal for the '<em><b>Deploy Vm Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPUTE_SERVICE___DEPLOY_VM_TYPE__STRING_STRING = eINSTANCE.getComputeService__DeployVmType__String_String();

		/**
		 * The meta object literal for the '<em><b>Undeploy Vm Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPUTE_SERVICE___UNDEPLOY_VM_TYPE__STRING_STRING = eINSTANCE.getComputeService__UndeployVmType__String_String();

		/**
		 * The meta object literal for the '<em><b>Deploy User</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPUTE_SERVICE___DEPLOY_USER__USER_STRING = eINSTANCE.getComputeService__DeployUser__User_String();

		/**
		 * The meta object literal for the '<em><b>Undeploy User</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPUTE_SERVICE___UNDEPLOY_USER__USER_STRING = eINSTANCE.getComputeService__UndeployUser__User_String();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.openstack.compute.impl.OpenstackRequestNewServerImpl <em>Openstack Request New Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.openstack.compute.impl.OpenstackRequestNewServerImpl
		 * @see org.openecomp.ncomp.openstack.compute.impl.ComputePackageImpl#getOpenstackRequestNewServer()
		 * @generated
		 */
		EClass OPENSTACK_REQUEST_NEW_SERVER = eINSTANCE.getOpenstackRequestNewServer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPENSTACK_REQUEST_NEW_SERVER__NAME = eINSTANCE.getOpenstackRequestNewServer_Name();

		/**
		 * The meta object literal for the '<em><b>Hypervisor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPENSTACK_REQUEST_NEW_SERVER__HYPERVISOR = eINSTANCE.getOpenstackRequestNewServer_Hypervisor();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPENSTACK_REQUEST_NEW_SERVER__USER = eINSTANCE.getOpenstackRequestNewServer_User();

		/**
		 * The meta object literal for the '<em><b>Networks</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPENSTACK_REQUEST_NEW_SERVER__NETWORKS = eINSTANCE.getOpenstackRequestNewServer_Networks();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPENSTACK_REQUEST_NEW_SERVER__PORTS = eINSTANCE.getOpenstackRequestNewServer_Ports();

		/**
		 * The meta object literal for the '<em><b>User data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPENSTACK_REQUEST_NEW_SERVER__USER_DATA = eINSTANCE.getOpenstackRequestNewServer_User_data();

		/**
		 * The meta object literal for the '<em><b>Floating Ip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPENSTACK_REQUEST_NEW_SERVER__FLOATING_IP = eINSTANCE.getOpenstackRequestNewServer_FloatingIp();

		/**
		 * The meta object literal for the '<em><b>Vm Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPENSTACK_REQUEST_NEW_SERVER__VM_TYPE = eINSTANCE.getOpenstackRequestNewServer_VmType();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.openstack.compute.impl.OpenstackRequestKeyPairImpl <em>Openstack Request Key Pair</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.openstack.compute.impl.OpenstackRequestKeyPairImpl
		 * @see org.openecomp.ncomp.openstack.compute.impl.ComputePackageImpl#getOpenstackRequestKeyPair()
		 * @generated
		 */
		EClass OPENSTACK_REQUEST_KEY_PAIR = eINSTANCE.getOpenstackRequestKeyPair();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPENSTACK_REQUEST_KEY_PAIR__USER = eINSTANCE.getOpenstackRequestKeyPair_User();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.openstack.compute.impl.OpenstackRequestFlavorImpl <em>Openstack Request Flavor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.openstack.compute.impl.OpenstackRequestFlavorImpl
		 * @see org.openecomp.ncomp.openstack.compute.impl.ComputePackageImpl#getOpenstackRequestFlavor()
		 * @generated
		 */
		EClass OPENSTACK_REQUEST_FLAVOR = eINSTANCE.getOpenstackRequestFlavor();

		/**
		 * The meta object literal for the '<em><b>Vm Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPENSTACK_REQUEST_FLAVOR__VM_TYPE = eINSTANCE.getOpenstackRequestFlavor_VmType();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.openstack.compute.impl.OpenstackRequestSecurityGroupImpl <em>Openstack Request Security Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.openstack.compute.impl.OpenstackRequestSecurityGroupImpl
		 * @see org.openecomp.ncomp.openstack.compute.impl.ComputePackageImpl#getOpenstackRequestSecurityGroup()
		 * @generated
		 */
		EClass OPENSTACK_REQUEST_SECURITY_GROUP = eINSTANCE.getOpenstackRequestSecurityGroup();

		/**
		 * The meta object literal for the '<em><b>Vm Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPENSTACK_REQUEST_SECURITY_GROUP__VM_TYPE = eINSTANCE.getOpenstackRequestSecurityGroup_VmType();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.openstack.compute.impl.OpenstackRequestServerActionImpl <em>Openstack Request Server Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.openstack.compute.impl.OpenstackRequestServerActionImpl
		 * @see org.openecomp.ncomp.openstack.compute.impl.ComputePackageImpl#getOpenstackRequestServerAction()
		 * @generated
		 */
		EClass OPENSTACK_REQUEST_SERVER_ACTION = eINSTANCE.getOpenstackRequestServerAction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPENSTACK_REQUEST_SERVER_ACTION__NAME = eINSTANCE.getOpenstackRequestServerAction_Name();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPENSTACK_REQUEST_SERVER_ACTION__ACTION = eINSTANCE.getOpenstackRequestServerAction_Action();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.openstack.compute.impl.OpenstackRequestPollImpl <em>Openstack Request Poll</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.openstack.compute.impl.OpenstackRequestPollImpl
		 * @see org.openecomp.ncomp.openstack.compute.impl.ComputePackageImpl#getOpenstackRequestPoll()
		 * @generated
		 */
		EClass OPENSTACK_REQUEST_POLL = eINSTANCE.getOpenstackRequestPoll();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.openstack.compute.impl.ServerImpl <em>Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.openstack.compute.impl.ServerImpl
		 * @see org.openecomp.ncomp.openstack.compute.impl.ComputePackageImpl#getServer()
		 * @generated
		 */
		EClass SERVER = eINSTANCE.getServer();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER__ID = eINSTANCE.getServer_Id();

		/**
		 * The meta object literal for the '<em><b>Tenant id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER__TENANT_ID = eINSTANCE.getServer_Tenant_id();

		/**
		 * The meta object literal for the '<em><b>User id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER__USER_ID = eINSTANCE.getServer_User_id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER__NAME = eINSTANCE.getServer_Name();

		/**
		 * The meta object literal for the '<em><b>Updated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER__UPDATED = eINSTANCE.getServer_Updated();

		/**
		 * The meta object literal for the '<em><b>Created</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER__CREATED = eINSTANCE.getServer_Created();

		/**
		 * The meta object literal for the '<em><b>Host Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER__HOST_ID = eINSTANCE.getServer_HostId();

		/**
		 * The meta object literal for the '<em><b>Access IPv4</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER__ACCESS_IPV4 = eINSTANCE.getServer_AccessIPv4();

		/**
		 * The meta object literal for the '<em><b>Access IPv6</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER__ACCESS_IPV6 = eINSTANCE.getServer_AccessIPv6();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER__STATUS = eINSTANCE.getServer_Status();

		/**
		 * The meta object literal for the '<em><b>Config drive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER__CONFIG_DRIVE = eINSTANCE.getServer_Config_drive();

		/**
		 * The meta object literal for the '<em><b>Key name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER__KEY_NAME = eINSTANCE.getServer_Key_name();

		/**
		 * The meta object literal for the '<em><b>Progress</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER__PROGRESS = eINSTANCE.getServer_Progress();

		/**
		 * The meta object literal for the '<em><b>OS DCF disk Config</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER__OS_DCF_DISK_CONFIG = eINSTANCE.getServer_OS_DCF_diskConfig();

		/**
		 * The meta object literal for the '<em><b>OS EXT STS power state</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER__OS_EXT_STS_POWER_STATE = eINSTANCE.getServer_OS_EXT_STS_power_state();

		/**
		 * The meta object literal for the '<em><b>OS EXT STS vm state</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER__OS_EXT_STS_VM_STATE = eINSTANCE.getServer_OS_EXT_STS_vm_state();

		/**
		 * The meta object literal for the '<em><b>OS EXT STS task state</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER__OS_EXT_STS_TASK_STATE = eINSTANCE.getServer_OS_EXT_STS_task_state();

		/**
		 * The meta object literal for the '<em><b>OS EXT SRV ATTR host</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER__OS_EXT_SRV_ATTR_HOST = eINSTANCE.getServer_OS_EXT_SRV_ATTR_host();

		/**
		 * The meta object literal for the '<em><b>OS EXT SRV ATTR instance name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER__OS_EXT_SRV_ATTR_INSTANCE_NAME = eINSTANCE.getServer_OS_EXT_SRV_ATTR_instance_name();

		/**
		 * The meta object literal for the '<em><b>OS EXT SRV ATTR hypervisor hostname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER__OS_EXT_SRV_ATTR_HYPERVISOR_HOSTNAME = eINSTANCE.getServer_OS_EXT_SRV_ATTR_hypervisor_hostname();

		/**
		 * The meta object literal for the '<em><b>OS SRV USG launched at</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER__OS_SRV_USG_LAUNCHED_AT = eINSTANCE.getServer_OS_SRV_USG_launched_at();

		/**
		 * The meta object literal for the '<em><b>OS SRV USG terminated at</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER__OS_SRV_USG_TERMINATED_AT = eINSTANCE.getServer_OS_SRV_USG_terminated_at();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER__IMAGE = eINSTANCE.getServer_Image();

		/**
		 * The meta object literal for the '<em><b>Flavor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER__FLAVOR = eINSTANCE.getServer_Flavor();

		/**
		 * The meta object literal for the '<em><b>Addresses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER__ADDRESSES = eINSTANCE.getServer_Addresses();

		/**
		 * The meta object literal for the '<em><b>Security groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER__SECURITY_GROUPS = eINSTANCE.getServer_Security_groups();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER__METADATA = eINSTANCE.getServer_Metadata();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER__LINKS = eINSTANCE.getServer_Links();

		/**
		 * The meta object literal for the '<em><b>Fault</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER__FAULT = eINSTANCE.getServer_Fault();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.openstack.compute.impl.ImageImpl <em>Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.openstack.compute.impl.ImageImpl
		 * @see org.openecomp.ncomp.openstack.compute.impl.ComputePackageImpl#getImage()
		 * @generated
		 */
		EClass IMAGE = eINSTANCE.getImage();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__ID = eINSTANCE.getImage_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__NAME = eINSTANCE.getImage_Name();

		/**
		 * The meta object literal for the '<em><b>Updated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__UPDATED = eINSTANCE.getImage_Updated();

		/**
		 * The meta object literal for the '<em><b>Created</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__CREATED = eINSTANCE.getImage_Created();

		/**
		 * The meta object literal for the '<em><b>Tenant id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__TENANT_ID = eINSTANCE.getImage_Tenant_id();

		/**
		 * The meta object literal for the '<em><b>User id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__USER_ID = eINSTANCE.getImage_User_id();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__STATUS = eINSTANCE.getImage_Status();

		/**
		 * The meta object literal for the '<em><b>Progress</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__PROGRESS = eINSTANCE.getImage_Progress();

		/**
		 * The meta object literal for the '<em><b>Min Disk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__MIN_DISK = eINSTANCE.getImage_MinDisk();

		/**
		 * The meta object literal for the '<em><b>Min Ram</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__MIN_RAM = eINSTANCE.getImage_MinRam();

		/**
		 * The meta object literal for the '<em><b>OS EXT IMG SIZE size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__OS_EXT_IMG_SIZE_SIZE = eINSTANCE.getImage_OS_EXT_IMG_SIZE_size();

		/**
		 * The meta object literal for the '<em><b>Server</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMAGE__SERVER = eINSTANCE.getImage_Server();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMAGE__LINKS = eINSTANCE.getImage_Links();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMAGE__METADATA = eINSTANCE.getImage_Metadata();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.openstack.compute.impl.FlavorImpl <em>Flavor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.openstack.compute.impl.FlavorImpl
		 * @see org.openecomp.ncomp.openstack.compute.impl.ComputePackageImpl#getFlavor()
		 * @generated
		 */
		EClass FLAVOR = eINSTANCE.getFlavor();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLAVOR__ID = eINSTANCE.getFlavor_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLAVOR__NAME = eINSTANCE.getFlavor_Name();

		/**
		 * The meta object literal for the '<em><b>Ram</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLAVOR__RAM = eINSTANCE.getFlavor_Ram();

		/**
		 * The meta object literal for the '<em><b>Disk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLAVOR__DISK = eINSTANCE.getFlavor_Disk();

		/**
		 * The meta object literal for the '<em><b>Vcpus</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLAVOR__VCPUS = eINSTANCE.getFlavor_Vcpus();

		/**
		 * The meta object literal for the '<em><b>Swap</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLAVOR__SWAP = eINSTANCE.getFlavor_Swap();

		/**
		 * The meta object literal for the '<em><b>Rxtx factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLAVOR__RXTX_FACTOR = eINSTANCE.getFlavor_Rxtx_factor();

		/**
		 * The meta object literal for the '<em><b>OS FLV EXT DATA ephemeral</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLAVOR__OS_FLV_EXT_DATA_EPHEMERAL = eINSTANCE.getFlavor_OS_FLV_EXT_DATA_ephemeral();

		/**
		 * The meta object literal for the '<em><b>OS FLV DISABLED disabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLAVOR__OS_FLV_DISABLED_DISABLED = eINSTANCE.getFlavor_OS_FLV_DISABLED_disabled();

		/**
		 * The meta object literal for the '<em><b>Os flavor access is public</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLAVOR__OS_FLAVOR_ACCESS_IS_PUBLIC = eINSTANCE.getFlavor_Os_flavor_access_is_public();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLAVOR__LINKS = eINSTANCE.getFlavor_Links();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.openstack.compute.impl.AddressesImpl <em>Addresses</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.openstack.compute.impl.AddressesImpl
		 * @see org.openecomp.ncomp.openstack.compute.impl.ComputePackageImpl#getAddresses()
		 * @generated
		 */
		EClass ADDRESSES = eINSTANCE.getAddresses();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESSES__NAME = eINSTANCE.getAddresses_Name();

		/**
		 * The meta object literal for the '<em><b>Ips</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDRESSES__IPS = eINSTANCE.getAddresses_Ips();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.openstack.compute.impl.AddressImpl <em>Address</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.openstack.compute.impl.AddressImpl
		 * @see org.openecomp.ncomp.openstack.compute.impl.ComputePackageImpl#getAddress()
		 * @generated
		 */
		EClass ADDRESS = eINSTANCE.getAddress();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__VERSION = eINSTANCE.getAddress_Version();

		/**
		 * The meta object literal for the '<em><b>Addr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__ADDR = eINSTANCE.getAddress_Addr();

		/**
		 * The meta object literal for the '<em><b>OS EXT IPS MAC mac addr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__OS_EXT_IPS_MAC_MAC_ADDR = eINSTANCE.getAddress_OS_EXT_IPS_MAC_mac_addr();

		/**
		 * The meta object literal for the '<em><b>OS EXT IPS type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__OS_EXT_IPS_TYPE = eINSTANCE.getAddress_OS_EXT_IPS_type();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.openstack.compute.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.openstack.compute.impl.LinkImpl
		 * @see org.openecomp.ncomp.openstack.compute.impl.ComputePackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>Rel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__REL = eINSTANCE.getLink_Rel();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__HREF = eINSTANCE.getLink_Href();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__TYPE = eINSTANCE.getLink_Type();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.openstack.compute.impl.MetadataImpl <em>Metadata</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.openstack.compute.impl.MetadataImpl
		 * @see org.openecomp.ncomp.openstack.compute.impl.ComputePackageImpl#getMetadata()
		 * @generated
		 */
		EClass METADATA = eINSTANCE.getMetadata();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METADATA__KEY = eINSTANCE.getMetadata_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METADATA__VALUE = eINSTANCE.getMetadata_Value();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.openstack.compute.impl.FaultImpl <em>Fault</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.openstack.compute.impl.FaultImpl
		 * @see org.openecomp.ncomp.openstack.compute.impl.ComputePackageImpl#getFault()
		 * @generated
		 */
		EClass FAULT = eINSTANCE.getFault();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAULT__MESSAGE = eINSTANCE.getFault_Message();

		/**
		 * The meta object literal for the '<em><b>Created</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAULT__CREATED = eINSTANCE.getFault_Created();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAULT__CODE = eINSTANCE.getFault_Code();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.openstack.compute.impl.PersonalityImpl <em>Personality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.openstack.compute.impl.PersonalityImpl
		 * @see org.openecomp.ncomp.openstack.compute.impl.ComputePackageImpl#getPersonality()
		 * @generated
		 */
		EClass PERSONALITY = eINSTANCE.getPersonality();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONALITY__PATH = eINSTANCE.getPersonality_Path();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONALITY__CONTENTS = eINSTANCE.getPersonality_Contents();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.openstack.compute.impl.ReferenceImpl <em>Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.openstack.compute.impl.ReferenceImpl
		 * @see org.openecomp.ncomp.openstack.compute.impl.ComputePackageImpl#getReference()
		 * @generated
		 */
		EClass REFERENCE = eINSTANCE.getReference();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE__ID = eINSTANCE.getReference_Id();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE__LINKS = eINSTANCE.getReference_Links();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.openstack.compute.impl.VolumeImpl <em>Volume</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.openstack.compute.impl.VolumeImpl
		 * @see org.openecomp.ncomp.openstack.compute.impl.ComputePackageImpl#getVolume()
		 * @generated
		 */
		EClass VOLUME = eINSTANCE.getVolume();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOLUME__STATUS = eINSTANCE.getVolume_Status();

		/**
		 * The meta object literal for the '<em><b>Display name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOLUME__DISPLAY_NAME = eINSTANCE.getVolume_Display_name();

		/**
		 * The meta object literal for the '<em><b>Attachments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VOLUME__ATTACHMENTS = eINSTANCE.getVolume_Attachments();

		/**
		 * The meta object literal for the '<em><b>Availability zone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOLUME__AVAILABILITY_ZONE = eINSTANCE.getVolume_Availability_zone();

		/**
		 * The meta object literal for the '<em><b>Created at</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOLUME__CREATED_AT = eINSTANCE.getVolume_Created_at();

		/**
		 * The meta object literal for the '<em><b>Volume type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOLUME__VOLUME_TYPE = eINSTANCE.getVolume_Volume_type();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VOLUME__METADATA = eINSTANCE.getVolume_Metadata();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOLUME__ID = eINSTANCE.getVolume_Id();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOLUME__SIZE = eINSTANCE.getVolume_Size();

		/**
		 * The meta object literal for the '<em><b>Snapshot id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOLUME__SNAPSHOT_ID = eINSTANCE.getVolume_Snapshot_id();

		/**
		 * The meta object literal for the '<em><b>Display description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOLUME__DISPLAY_DESCRIPTION = eINSTANCE.getVolume_Display_description();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.openstack.compute.impl.VolumeAttachmentImpl <em>Volume Attachment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.openstack.compute.impl.VolumeAttachmentImpl
		 * @see org.openecomp.ncomp.openstack.compute.impl.ComputePackageImpl#getVolumeAttachment()
		 * @generated
		 */
		EClass VOLUME_ATTACHMENT = eINSTANCE.getVolumeAttachment();

		/**
		 * The meta object literal for the '<em><b>Device</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOLUME_ATTACHMENT__DEVICE = eINSTANCE.getVolumeAttachment_Device();

		/**
		 * The meta object literal for the '<em><b>Server id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOLUME_ATTACHMENT__SERVER_ID = eINSTANCE.getVolumeAttachment_Server_id();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOLUME_ATTACHMENT__ID = eINSTANCE.getVolumeAttachment_Id();

		/**
		 * The meta object literal for the '<em><b>Volume id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOLUME_ATTACHMENT__VOLUME_ID = eINSTANCE.getVolumeAttachment_Volume_id();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.openstack.compute.impl.FloatingIpImpl <em>Floating Ip</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.openstack.compute.impl.FloatingIpImpl
		 * @see org.openecomp.ncomp.openstack.compute.impl.ComputePackageImpl#getFloatingIp()
		 * @generated
		 */
		EClass FLOATING_IP = eINSTANCE.getFloatingIp();

		/**
		 * The meta object literal for the '<em><b>Instance id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOATING_IP__INSTANCE_ID = eINSTANCE.getFloatingIp_Instance_id();

		/**
		 * The meta object literal for the '<em><b>Ip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOATING_IP__IP = eINSTANCE.getFloatingIp_Ip();

		/**
		 * The meta object literal for the '<em><b>Fixed ip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOATING_IP__FIXED_IP = eINSTANCE.getFloatingIp_Fixed_ip();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOATING_IP__ID = eINSTANCE.getFloatingIp_Id();

		/**
		 * The meta object literal for the '<em><b>Pool</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOATING_IP__POOL = eINSTANCE.getFloatingIp_Pool();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.openstack.compute.impl.SecurityGroupImpl <em>Security Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.openstack.compute.impl.SecurityGroupImpl
		 * @see org.openecomp.ncomp.openstack.compute.impl.ComputePackageImpl#getSecurityGroup()
		 * @generated
		 */
		EClass SECURITY_GROUP = eINSTANCE.getSecurityGroup();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_GROUP__RULES = eINSTANCE.getSecurityGroup_Rules();

		/**
		 * The meta object literal for the '<em><b>Tenant id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_GROUP__TENANT_ID = eINSTANCE.getSecurityGroup_Tenant_id();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_GROUP__ID = eINSTANCE.getSecurityGroup_Id();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_GROUP__DESCRIPTION = eINSTANCE.getSecurityGroup_Description();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.openstack.compute.impl.SecurityRuleImpl <em>Security Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.openstack.compute.impl.SecurityRuleImpl
		 * @see org.openecomp.ncomp.openstack.compute.impl.ComputePackageImpl#getSecurityRule()
		 * @generated
		 */
		EClass SECURITY_RULE = eINSTANCE.getSecurityRule();

		/**
		 * The meta object literal for the '<em><b>From port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_RULE__FROM_PORT = eINSTANCE.getSecurityRule_From_port();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_RULE__GROUP = eINSTANCE.getSecurityRule_Group();

		/**
		 * The meta object literal for the '<em><b>Ip protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_RULE__IP_PROTOCOL = eINSTANCE.getSecurityRule_Ip_protocol();

		/**
		 * The meta object literal for the '<em><b>To port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_RULE__TO_PORT = eINSTANCE.getSecurityRule_To_port();

		/**
		 * The meta object literal for the '<em><b>Parent group id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_RULE__PARENT_GROUP_ID = eINSTANCE.getSecurityRule_Parent_group_id();

		/**
		 * The meta object literal for the '<em><b>Ip range</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_RULE__IP_RANGE = eINSTANCE.getSecurityRule_Ip_range();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_RULE__ID = eINSTANCE.getSecurityRule_Id();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.openstack.compute.impl.SecurityRangeImpl <em>Security Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.openstack.compute.impl.SecurityRangeImpl
		 * @see org.openecomp.ncomp.openstack.compute.impl.ComputePackageImpl#getSecurityRange()
		 * @generated
		 */
		EClass SECURITY_RANGE = eINSTANCE.getSecurityRange();

		/**
		 * The meta object literal for the '<em><b>Cidr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_RANGE__CIDR = eINSTANCE.getSecurityRange_Cidr();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.openstack.compute.impl.KeyPairImpl <em>Key Pair</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.openstack.compute.impl.KeyPairImpl
		 * @see org.openecomp.ncomp.openstack.compute.impl.ComputePackageImpl#getKeyPair()
		 * @generated
		 */
		EClass KEY_PAIR = eINSTANCE.getKeyPair();

		/**
		 * The meta object literal for the '<em><b>Public key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_PAIR__PUBLIC_KEY = eINSTANCE.getKeyPair_Public_key();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_PAIR__NAME = eINSTANCE.getKeyPair_Name();

		/**
		 * The meta object literal for the '<em><b>Fingerprint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_PAIR__FINGERPRINT = eINSTANCE.getKeyPair_Fingerprint();

	}

} //ComputePackage
