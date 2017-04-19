
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
package org.openecomp.ncomp.openstack.location;

import org.openecomp.ncomp.core.CorePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * <!-- begin-model-doc -->
 * -
 * ============LICENSE_START==========================================
 * OPENECOMP - DCAE
 * ===================================================================
 * Copyright (c) 2017 AT&T Intellectual Property. All rights reserved.
 * ===================================================================
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  *        http://www.apache.org/licenses/LICENSE-2.0
 *  * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ============LICENSE_END============================================
 * <!-- end-model-doc -->
 * @see org.openecomp.ncomp.openstack.location.LocationFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel modelDirectory='/ncomp-openstack-model/src/main/xcore-gen' basePackage='org.openecomp.ncomp.openstack'"
 *        annotation="http://www.eclipse.org/emf/2011/Xcore persistence='http://openecomp.org/sirius/persistence'"
 * @generated
 */
public interface LocationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "location";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.openecomp.ncomp.openstack.location";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "location";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LocationPackage eINSTANCE = org.openecomp.ncomp.openstack.location.impl.LocationPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.openstack.location.impl.OpenStackLocationImpl <em>Open Stack Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.openstack.location.impl.OpenStackLocationImpl
	 * @see org.openecomp.ncomp.openstack.location.impl.LocationPackageImpl#getOpenStackLocation()
	 * @generated
	 */
	int OPEN_STACK_LOCATION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_LOCATION__NAME = CorePackage.NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_LOCATION__LAST_POLLED = CorePackage.NAMED_ENTITY__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_LOCATION__LAST_CHANGED = CorePackage.NAMED_ENTITY__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_LOCATION__CREATED = CorePackage.NAMED_ENTITY__CREATED;

	/**
	 * The feature id for the '<em><b>Ceilometer Available Capabilites</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_LOCATION__CEILOMETER_AVAILABLE_CAPABILITES = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ceilometer Unavailable Capabilites</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_LOCATION__CEILOMETER_UNAVAILABLE_CAPABILITES = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_LOCATION__VERSION = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Remote Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_LOCATION__REMOTE_LOCATION = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Remote Location Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_LOCATION__REMOTE_LOCATION_NAME = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Allow Create Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_LOCATION__ALLOW_CREATE_FLAVOR = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Keystone Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_LOCATION__KEYSTONE_URL = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Bypass Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_LOCATION__BYPASS_IP = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Flavor Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_LOCATION__FLAVOR_ID = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Supports Security Groups</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_LOCATION__SUPPORTS_SECURITY_GROUPS = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Supports Floating Ips</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_LOCATION__SUPPORTS_FLOATING_IPS = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Projects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_LOCATION__PROJECTS = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Users</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_LOCATION__USERS = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Images</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_LOCATION__IMAGES = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Flavors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_LOCATION__FLAVORS = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Hypervisors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_LOCATION__HYPERVISORS = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>Open Stack Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_LOCATION_FEATURE_COUNT = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 16;

	/**
	 * The operation id for the '<em>Create Network</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_LOCATION___CREATE_NETWORK__CREATENETWORKREQUEST = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Create Subnet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_LOCATION___CREATE_SUBNET__CREATESUBNETREQUEST = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Create Port</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_LOCATION___CREATE_PORT__CREATEPORTREQUEST = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Create Router</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_LOCATION___CREATE_ROUTER__CREATEROUTERREQUEST = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Delete Network</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_LOCATION___DELETE_NETWORK__STRING_STRING = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Delete Subnet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_LOCATION___DELETE_SUBNET__STRING_STRING = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Delete Port</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_LOCATION___DELETE_PORT__STRING_STRING = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Delete Router</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_LOCATION___DELETE_ROUTER__STRING_STRING = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Associate Floating Ip</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_LOCATION___ASSOCIATE_FLOATING_IP__STRING_STRING_STRING = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Create Server</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_LOCATION___CREATE_SERVER__OPENSTACKREQUESTNEWSERVER = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Delete Server</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_LOCATION___DELETE_SERVER__STRING_STRING = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Create Key Pair</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_LOCATION___CREATE_KEY_PAIR__OPENSTACKREQUESTKEYPAIR = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_LOCATION___DELETE__OPENSTACKREQUESTDELETE = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Create Flavor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_LOCATION___CREATE_FLAVOR__OPENSTACKREQUESTFLAVOR = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Create Security Group</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_LOCATION___CREATE_SECURITY_GROUP__OPENSTACKREQUESTSECURITYGROUP = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Server Action</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_LOCATION___SERVER_ACTION__OPENSTACKREQUESTSERVERACTION = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Deploy Vm Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_LOCATION___DEPLOY_VM_TYPE__STRING_STRING = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Undeploy Vm Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_LOCATION___UNDEPLOY_VM_TYPE__STRING_STRING = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Deploy User</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_LOCATION___DEPLOY_USER__USER_STRING = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Undeploy User</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_LOCATION___UNDEPLOY_USER__USER_STRING = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Create Alarm</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_LOCATION___CREATE_ALARM__CREATEALARMREQUEST = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Delete Alarm</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_LOCATION___DELETE_ALARM__STRING_STRING = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Create Alarm</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_LOCATION___CREATE_ALARM__SAMPLEREQUEST = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Poll</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_LOCATION___POLL = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Merge Location</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_LOCATION___MERGE_LOCATION__OPENSTACKLOCATION = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 24;

	/**
	 * The number of operations of the '<em>Open Stack Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_LOCATION_OPERATION_COUNT = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 25;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.openstack.location.impl.OpenStackProjectImpl <em>Open Stack Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.openstack.location.impl.OpenStackProjectImpl
	 * @see org.openecomp.ncomp.openstack.location.impl.LocationPackageImpl#getOpenStackProject()
	 * @generated
	 */
	int OPEN_STACK_PROJECT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_PROJECT__NAME = CorePackage.NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_PROJECT__LAST_POLLED = CorePackage.NAMED_ENTITY__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_PROJECT__LAST_CHANGED = CorePackage.NAMED_ENTITY__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_PROJECT__CREATED = CorePackage.NAMED_ENTITY__CREATED;

	/**
	 * The feature id for the '<em><b>Alarms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_PROJECT__ALARMS = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_PROJECT__RESOURCES = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Meters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_PROJECT__METERS = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_PROJECT__ID = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Admin User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_PROJECT__ADMIN_USER = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Tenant Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_PROJECT__TENANT_ID = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_PROJECT__REGION = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Private Network</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_PROJECT__PRIVATE_NETWORK = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Public Network</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_PROJECT__PUBLIC_NETWORK = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Api Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_PROJECT__API_KEY = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Servers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_PROJECT__SERVERS = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Users</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_PROJECT__USERS = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Controller User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_PROJECT__CONTROLLER_USER = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Volumes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_PROJECT__VOLUMES = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Ips</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_PROJECT__IPS = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_PROJECT__GROUPS = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Keypairs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_PROJECT__KEYPAIRS = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Networks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_PROJECT__NETWORKS = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Subnets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_PROJECT__SUBNETS = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Routers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_PROJECT__ROUTERS = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_PROJECT__PORTS = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Security groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_PROJECT__SECURITY_GROUPS = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Floatingips</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_PROJECT__FLOATINGIPS = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 22;

	/**
	 * The number of structural features of the '<em>Open Stack Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_PROJECT_FEATURE_COUNT = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 23;

	/**
	 * The operation id for the '<em>Update Nova State</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_PROJECT___UPDATE_NOVA_STATE = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Create Network</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_PROJECT___CREATE_NETWORK__CREATENETWORKREQUEST = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Open Stack Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_PROJECT_OPERATION_COUNT = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.openstack.location.impl.OpenStackUserImpl <em>Open Stack User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.openstack.location.impl.OpenStackUserImpl
	 * @see org.openecomp.ncomp.openstack.location.impl.LocationPackageImpl#getOpenStackUser()
	 * @generated
	 */
	int OPEN_STACK_USER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_USER__NAME = CorePackage.NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_USER__LAST_POLLED = CorePackage.NAMED_ENTITY__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_USER__LAST_CHANGED = CorePackage.NAMED_ENTITY__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_USER__CREATED = CorePackage.NAMED_ENTITY__CREATED;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_USER__PASSWORD = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Open Stack User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_USER_FEATURE_COUNT = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Open Stack User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_USER_OPERATION_COUNT = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.openstack.location.impl.HypervisorServiceImpl <em>Hypervisor Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.openstack.location.impl.HypervisorServiceImpl
	 * @see org.openecomp.ncomp.openstack.location.impl.LocationPackageImpl#getHypervisorService()
	 * @generated
	 */
	int HYPERVISOR_SERVICE = 3;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERVISOR_SERVICE__HOST = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERVISOR_SERVICE__ID = 1;

	/**
	 * The number of structural features of the '<em>Hypervisor Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERVISOR_SERVICE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Hypervisor Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERVISOR_SERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.openstack.location.impl.HypervisorCpuTopologyImpl <em>Hypervisor Cpu Topology</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.openstack.location.impl.HypervisorCpuTopologyImpl
	 * @see org.openecomp.ncomp.openstack.location.impl.LocationPackageImpl#getHypervisorCpuTopology()
	 * @generated
	 */
	int HYPERVISOR_CPU_TOPOLOGY = 4;

	/**
	 * The feature id for the '<em><b>Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERVISOR_CPU_TOPOLOGY__CORES = 0;

	/**
	 * The feature id for the '<em><b>Threads</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERVISOR_CPU_TOPOLOGY__THREADS = 1;

	/**
	 * The feature id for the '<em><b>Sockets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERVISOR_CPU_TOPOLOGY__SOCKETS = 2;

	/**
	 * The number of structural features of the '<em>Hypervisor Cpu Topology</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERVISOR_CPU_TOPOLOGY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Hypervisor Cpu Topology</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERVISOR_CPU_TOPOLOGY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.openstack.location.impl.HypervisorCpuInfoImpl <em>Hypervisor Cpu Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.openstack.location.impl.HypervisorCpuInfoImpl
	 * @see org.openecomp.ncomp.openstack.location.impl.LocationPackageImpl#getHypervisorCpuInfo()
	 * @generated
	 */
	int HYPERVISOR_CPU_INFO = 5;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERVISOR_CPU_INFO__VENDOR = 0;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERVISOR_CPU_INFO__MODEL = 1;

	/**
	 * The feature id for the '<em><b>Arch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERVISOR_CPU_INFO__ARCH = 2;

	/**
	 * The feature id for the '<em><b>Features</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERVISOR_CPU_INFO__FEATURES = 3;

	/**
	 * The feature id for the '<em><b>Topology</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERVISOR_CPU_INFO__TOPOLOGY = 4;

	/**
	 * The number of structural features of the '<em>Hypervisor Cpu Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERVISOR_CPU_INFO_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Hypervisor Cpu Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERVISOR_CPU_INFO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.openstack.location.impl.HypervisorImpl <em>Hypervisor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.openstack.location.impl.HypervisorImpl
	 * @see org.openecomp.ncomp.openstack.location.impl.LocationPackageImpl#getHypervisor()
	 * @generated
	 */
	int HYPERVISOR = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERVISOR__NAME = CorePackage.NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERVISOR__LAST_POLLED = CorePackage.NAMED_ENTITY__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERVISOR__LAST_CHANGED = CorePackage.NAMED_ENTITY__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERVISOR__CREATED = CorePackage.NAMED_ENTITY__CREATED;

	/**
	 * The feature id for the '<em><b>Service</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERVISOR__SERVICE = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Host ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERVISOR__HOST_IP = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Vcpus used</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERVISOR__VCPUS_USED = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Hypervisor type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERVISOR__HYPERVISOR_TYPE = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Local gb used</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERVISOR__LOCAL_GB_USED = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Hypervisor hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERVISOR__HYPERVISOR_HOSTNAME = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Memory mb used</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERVISOR__MEMORY_MB_USED = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Memory mb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERVISOR__MEMORY_MB = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Current workload</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERVISOR__CURRENT_WORKLOAD = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Vcpus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERVISOR__VCPUS = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Cpu info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERVISOR__CPU_INFO = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Running vms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERVISOR__RUNNING_VMS = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Free disk gb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERVISOR__FREE_DISK_GB = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Hypervisor version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERVISOR__HYPERVISOR_VERSION = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Disk available least</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERVISOR__DISK_AVAILABLE_LEAST = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Local gb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERVISOR__LOCAL_GB = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Free ram mb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERVISOR__FREE_RAM_MB = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERVISOR__ID = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 17;

	/**
	 * The number of structural features of the '<em>Hypervisor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERVISOR_FEATURE_COUNT = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 18;

	/**
	 * The number of operations of the '<em>Hypervisor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERVISOR_OPERATION_COUNT = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.openstack.location.OpenStackVersion <em>Open Stack Version</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.openstack.location.OpenStackVersion
	 * @see org.openecomp.ncomp.openstack.location.impl.LocationPackageImpl#getOpenStackVersion()
	 * @generated
	 */
	int OPEN_STACK_VERSION = 7;


	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.openstack.location.OpenStackLocation <em>Open Stack Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Open Stack Location</em>'.
	 * @see org.openecomp.ncomp.openstack.location.OpenStackLocation
	 * @generated
	 */
	EClass getOpenStackLocation();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.location.OpenStackLocation#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.openecomp.ncomp.openstack.location.OpenStackLocation#getVersion()
	 * @see #getOpenStackLocation()
	 * @generated
	 */
	EAttribute getOpenStackLocation_Version();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.location.OpenStackLocation#isRemoteLocation <em>Remote Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remote Location</em>'.
	 * @see org.openecomp.ncomp.openstack.location.OpenStackLocation#isRemoteLocation()
	 * @see #getOpenStackLocation()
	 * @generated
	 */
	EAttribute getOpenStackLocation_RemoteLocation();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.location.OpenStackLocation#getRemoteLocationName <em>Remote Location Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remote Location Name</em>'.
	 * @see org.openecomp.ncomp.openstack.location.OpenStackLocation#getRemoteLocationName()
	 * @see #getOpenStackLocation()
	 * @generated
	 */
	EAttribute getOpenStackLocation_RemoteLocationName();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.location.OpenStackLocation#isAllowCreateFlavor <em>Allow Create Flavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Create Flavor</em>'.
	 * @see org.openecomp.ncomp.openstack.location.OpenStackLocation#isAllowCreateFlavor()
	 * @see #getOpenStackLocation()
	 * @generated
	 */
	EAttribute getOpenStackLocation_AllowCreateFlavor();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.location.OpenStackLocation#getKeystoneUrl <em>Keystone Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Keystone Url</em>'.
	 * @see org.openecomp.ncomp.openstack.location.OpenStackLocation#getKeystoneUrl()
	 * @see #getOpenStackLocation()
	 * @generated
	 */
	EAttribute getOpenStackLocation_KeystoneUrl();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.location.OpenStackLocation#getBypassIp <em>Bypass Ip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bypass Ip</em>'.
	 * @see org.openecomp.ncomp.openstack.location.OpenStackLocation#getBypassIp()
	 * @see #getOpenStackLocation()
	 * @generated
	 */
	EAttribute getOpenStackLocation_BypassIp();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.location.OpenStackLocation#getFlavorId <em>Flavor Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flavor Id</em>'.
	 * @see org.openecomp.ncomp.openstack.location.OpenStackLocation#getFlavorId()
	 * @see #getOpenStackLocation()
	 * @generated
	 */
	EAttribute getOpenStackLocation_FlavorId();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.location.OpenStackLocation#isSupportsSecurityGroups <em>Supports Security Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Supports Security Groups</em>'.
	 * @see org.openecomp.ncomp.openstack.location.OpenStackLocation#isSupportsSecurityGroups()
	 * @see #getOpenStackLocation()
	 * @generated
	 */
	EAttribute getOpenStackLocation_SupportsSecurityGroups();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.location.OpenStackLocation#isSupportsFloatingIps <em>Supports Floating Ips</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Supports Floating Ips</em>'.
	 * @see org.openecomp.ncomp.openstack.location.OpenStackLocation#isSupportsFloatingIps()
	 * @see #getOpenStackLocation()
	 * @generated
	 */
	EAttribute getOpenStackLocation_SupportsFloatingIps();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.openstack.location.OpenStackLocation#getProjects <em>Projects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Projects</em>'.
	 * @see org.openecomp.ncomp.openstack.location.OpenStackLocation#getProjects()
	 * @see #getOpenStackLocation()
	 * @generated
	 */
	EReference getOpenStackLocation_Projects();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.openstack.location.OpenStackLocation#getUsers <em>Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Users</em>'.
	 * @see org.openecomp.ncomp.openstack.location.OpenStackLocation#getUsers()
	 * @see #getOpenStackLocation()
	 * @generated
	 */
	EReference getOpenStackLocation_Users();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.openstack.location.OpenStackLocation#getImages <em>Images</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Images</em>'.
	 * @see org.openecomp.ncomp.openstack.location.OpenStackLocation#getImages()
	 * @see #getOpenStackLocation()
	 * @generated
	 */
	EReference getOpenStackLocation_Images();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.openstack.location.OpenStackLocation#getFlavors <em>Flavors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Flavors</em>'.
	 * @see org.openecomp.ncomp.openstack.location.OpenStackLocation#getFlavors()
	 * @see #getOpenStackLocation()
	 * @generated
	 */
	EReference getOpenStackLocation_Flavors();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.openstack.location.OpenStackLocation#getHypervisors <em>Hypervisors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hypervisors</em>'.
	 * @see org.openecomp.ncomp.openstack.location.OpenStackLocation#getHypervisors()
	 * @see #getOpenStackLocation()
	 * @generated
	 */
	EReference getOpenStackLocation_Hypervisors();

	/**
	 * Returns the meta object for the '{@link org.openecomp.ncomp.openstack.location.OpenStackLocation#poll() <em>Poll</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Poll</em>' operation.
	 * @see org.openecomp.ncomp.openstack.location.OpenStackLocation#poll()
	 * @generated
	 */
	EOperation getOpenStackLocation__Poll();

	/**
	 * Returns the meta object for the '{@link org.openecomp.ncomp.openstack.location.OpenStackLocation#mergeLocation(org.openecomp.ncomp.openstack.location.OpenStackLocation) <em>Merge Location</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Merge Location</em>' operation.
	 * @see org.openecomp.ncomp.openstack.location.OpenStackLocation#mergeLocation(org.openecomp.ncomp.openstack.location.OpenStackLocation)
	 * @generated
	 */
	EOperation getOpenStackLocation__MergeLocation__OpenStackLocation();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.openstack.location.OpenStackProject <em>Open Stack Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Open Stack Project</em>'.
	 * @see org.openecomp.ncomp.openstack.location.OpenStackProject
	 * @generated
	 */
	EClass getOpenStackProject();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.location.OpenStackProject#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see org.openecomp.ncomp.openstack.location.OpenStackProject#getID()
	 * @see #getOpenStackProject()
	 * @generated
	 */
	EAttribute getOpenStackProject_ID();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.location.OpenStackProject#getAdminUser <em>Admin User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Admin User</em>'.
	 * @see org.openecomp.ncomp.openstack.location.OpenStackProject#getAdminUser()
	 * @see #getOpenStackProject()
	 * @generated
	 */
	EAttribute getOpenStackProject_AdminUser();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.location.OpenStackProject#getTenantId <em>Tenant Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tenant Id</em>'.
	 * @see org.openecomp.ncomp.openstack.location.OpenStackProject#getTenantId()
	 * @see #getOpenStackProject()
	 * @generated
	 */
	EAttribute getOpenStackProject_TenantId();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.location.OpenStackProject#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Region</em>'.
	 * @see org.openecomp.ncomp.openstack.location.OpenStackProject#getRegion()
	 * @see #getOpenStackProject()
	 * @generated
	 */
	EAttribute getOpenStackProject_Region();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.location.OpenStackProject#getPrivateNetwork <em>Private Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Private Network</em>'.
	 * @see org.openecomp.ncomp.openstack.location.OpenStackProject#getPrivateNetwork()
	 * @see #getOpenStackProject()
	 * @generated
	 */
	EAttribute getOpenStackProject_PrivateNetwork();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.location.OpenStackProject#getPublicNetwork <em>Public Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Public Network</em>'.
	 * @see org.openecomp.ncomp.openstack.location.OpenStackProject#getPublicNetwork()
	 * @see #getOpenStackProject()
	 * @generated
	 */
	EAttribute getOpenStackProject_PublicNetwork();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.location.OpenStackProject#getApiKey <em>Api Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Api Key</em>'.
	 * @see org.openecomp.ncomp.openstack.location.OpenStackProject#getApiKey()
	 * @see #getOpenStackProject()
	 * @generated
	 */
	EAttribute getOpenStackProject_ApiKey();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.openstack.location.OpenStackProject#getServers <em>Servers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Servers</em>'.
	 * @see org.openecomp.ncomp.openstack.location.OpenStackProject#getServers()
	 * @see #getOpenStackProject()
	 * @generated
	 */
	EReference getOpenStackProject_Servers();

	/**
	 * Returns the meta object for the reference list '{@link org.openecomp.ncomp.openstack.location.OpenStackProject#getUsers <em>Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Users</em>'.
	 * @see org.openecomp.ncomp.openstack.location.OpenStackProject#getUsers()
	 * @see #getOpenStackProject()
	 * @generated
	 */
	EReference getOpenStackProject_Users();

	/**
	 * Returns the meta object for the reference '{@link org.openecomp.ncomp.openstack.location.OpenStackProject#getControllerUser <em>Controller User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Controller User</em>'.
	 * @see org.openecomp.ncomp.openstack.location.OpenStackProject#getControllerUser()
	 * @see #getOpenStackProject()
	 * @generated
	 */
	EReference getOpenStackProject_ControllerUser();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.openstack.location.OpenStackProject#getVolumes <em>Volumes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Volumes</em>'.
	 * @see org.openecomp.ncomp.openstack.location.OpenStackProject#getVolumes()
	 * @see #getOpenStackProject()
	 * @generated
	 */
	EReference getOpenStackProject_Volumes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.openstack.location.OpenStackProject#getIps <em>Ips</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ips</em>'.
	 * @see org.openecomp.ncomp.openstack.location.OpenStackProject#getIps()
	 * @see #getOpenStackProject()
	 * @generated
	 */
	EReference getOpenStackProject_Ips();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.openstack.location.OpenStackProject#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Groups</em>'.
	 * @see org.openecomp.ncomp.openstack.location.OpenStackProject#getGroups()
	 * @see #getOpenStackProject()
	 * @generated
	 */
	EReference getOpenStackProject_Groups();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.openstack.location.OpenStackProject#getKeypairs <em>Keypairs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Keypairs</em>'.
	 * @see org.openecomp.ncomp.openstack.location.OpenStackProject#getKeypairs()
	 * @see #getOpenStackProject()
	 * @generated
	 */
	EReference getOpenStackProject_Keypairs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.openstack.location.OpenStackProject#getNetworks <em>Networks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Networks</em>'.
	 * @see org.openecomp.ncomp.openstack.location.OpenStackProject#getNetworks()
	 * @see #getOpenStackProject()
	 * @generated
	 */
	EReference getOpenStackProject_Networks();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.openstack.location.OpenStackProject#getSubnets <em>Subnets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subnets</em>'.
	 * @see org.openecomp.ncomp.openstack.location.OpenStackProject#getSubnets()
	 * @see #getOpenStackProject()
	 * @generated
	 */
	EReference getOpenStackProject_Subnets();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.openstack.location.OpenStackProject#getRouters <em>Routers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Routers</em>'.
	 * @see org.openecomp.ncomp.openstack.location.OpenStackProject#getRouters()
	 * @see #getOpenStackProject()
	 * @generated
	 */
	EReference getOpenStackProject_Routers();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.openstack.location.OpenStackProject#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ports</em>'.
	 * @see org.openecomp.ncomp.openstack.location.OpenStackProject#getPorts()
	 * @see #getOpenStackProject()
	 * @generated
	 */
	EReference getOpenStackProject_Ports();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.openstack.location.OpenStackProject#getSecurity_groups <em>Security groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Security groups</em>'.
	 * @see org.openecomp.ncomp.openstack.location.OpenStackProject#getSecurity_groups()
	 * @see #getOpenStackProject()
	 * @generated
	 */
	EReference getOpenStackProject_Security_groups();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.openstack.location.OpenStackProject#getFloatingips <em>Floatingips</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Floatingips</em>'.
	 * @see org.openecomp.ncomp.openstack.location.OpenStackProject#getFloatingips()
	 * @see #getOpenStackProject()
	 * @generated
	 */
	EReference getOpenStackProject_Floatingips();

	/**
	 * Returns the meta object for the '{@link org.openecomp.ncomp.openstack.location.OpenStackProject#updateNovaState() <em>Update Nova State</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Nova State</em>' operation.
	 * @see org.openecomp.ncomp.openstack.location.OpenStackProject#updateNovaState()
	 * @generated
	 */
	EOperation getOpenStackProject__UpdateNovaState();

	/**
	 * Returns the meta object for the '{@link org.openecomp.ncomp.openstack.location.OpenStackProject#createNetwork(org.openecomp.ncomp.openstack.neutron.CreateNetworkRequest) <em>Create Network</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Network</em>' operation.
	 * @see org.openecomp.ncomp.openstack.location.OpenStackProject#createNetwork(org.openecomp.ncomp.openstack.neutron.CreateNetworkRequest)
	 * @generated
	 */
	EOperation getOpenStackProject__CreateNetwork__CreateNetworkRequest();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.openstack.location.OpenStackUser <em>Open Stack User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Open Stack User</em>'.
	 * @see org.openecomp.ncomp.openstack.location.OpenStackUser
	 * @generated
	 */
	EClass getOpenStackUser();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.location.OpenStackUser#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see org.openecomp.ncomp.openstack.location.OpenStackUser#getPassword()
	 * @see #getOpenStackUser()
	 * @generated
	 */
	EAttribute getOpenStackUser_Password();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.openstack.location.HypervisorService <em>Hypervisor Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hypervisor Service</em>'.
	 * @see org.openecomp.ncomp.openstack.location.HypervisorService
	 * @generated
	 */
	EClass getHypervisorService();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.location.HypervisorService#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host</em>'.
	 * @see org.openecomp.ncomp.openstack.location.HypervisorService#getHost()
	 * @see #getHypervisorService()
	 * @generated
	 */
	EAttribute getHypervisorService_Host();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.location.HypervisorService#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.openecomp.ncomp.openstack.location.HypervisorService#getId()
	 * @see #getHypervisorService()
	 * @generated
	 */
	EAttribute getHypervisorService_Id();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.openstack.location.HypervisorCpuTopology <em>Hypervisor Cpu Topology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hypervisor Cpu Topology</em>'.
	 * @see org.openecomp.ncomp.openstack.location.HypervisorCpuTopology
	 * @generated
	 */
	EClass getHypervisorCpuTopology();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.location.HypervisorCpuTopology#getCores <em>Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cores</em>'.
	 * @see org.openecomp.ncomp.openstack.location.HypervisorCpuTopology#getCores()
	 * @see #getHypervisorCpuTopology()
	 * @generated
	 */
	EAttribute getHypervisorCpuTopology_Cores();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.location.HypervisorCpuTopology#getThreads <em>Threads</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Threads</em>'.
	 * @see org.openecomp.ncomp.openstack.location.HypervisorCpuTopology#getThreads()
	 * @see #getHypervisorCpuTopology()
	 * @generated
	 */
	EAttribute getHypervisorCpuTopology_Threads();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.location.HypervisorCpuTopology#getSockets <em>Sockets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sockets</em>'.
	 * @see org.openecomp.ncomp.openstack.location.HypervisorCpuTopology#getSockets()
	 * @see #getHypervisorCpuTopology()
	 * @generated
	 */
	EAttribute getHypervisorCpuTopology_Sockets();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.openstack.location.HypervisorCpuInfo <em>Hypervisor Cpu Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hypervisor Cpu Info</em>'.
	 * @see org.openecomp.ncomp.openstack.location.HypervisorCpuInfo
	 * @generated
	 */
	EClass getHypervisorCpuInfo();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.location.HypervisorCpuInfo#getVendor <em>Vendor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vendor</em>'.
	 * @see org.openecomp.ncomp.openstack.location.HypervisorCpuInfo#getVendor()
	 * @see #getHypervisorCpuInfo()
	 * @generated
	 */
	EAttribute getHypervisorCpuInfo_Vendor();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.location.HypervisorCpuInfo#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model</em>'.
	 * @see org.openecomp.ncomp.openstack.location.HypervisorCpuInfo#getModel()
	 * @see #getHypervisorCpuInfo()
	 * @generated
	 */
	EAttribute getHypervisorCpuInfo_Model();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.location.HypervisorCpuInfo#getArch <em>Arch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arch</em>'.
	 * @see org.openecomp.ncomp.openstack.location.HypervisorCpuInfo#getArch()
	 * @see #getHypervisorCpuInfo()
	 * @generated
	 */
	EAttribute getHypervisorCpuInfo_Arch();

	/**
	 * Returns the meta object for the attribute list '{@link org.openecomp.ncomp.openstack.location.HypervisorCpuInfo#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Features</em>'.
	 * @see org.openecomp.ncomp.openstack.location.HypervisorCpuInfo#getFeatures()
	 * @see #getHypervisorCpuInfo()
	 * @generated
	 */
	EAttribute getHypervisorCpuInfo_Features();

	/**
	 * Returns the meta object for the containment reference '{@link org.openecomp.ncomp.openstack.location.HypervisorCpuInfo#getTopology <em>Topology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Topology</em>'.
	 * @see org.openecomp.ncomp.openstack.location.HypervisorCpuInfo#getTopology()
	 * @see #getHypervisorCpuInfo()
	 * @generated
	 */
	EReference getHypervisorCpuInfo_Topology();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.openstack.location.Hypervisor <em>Hypervisor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hypervisor</em>'.
	 * @see org.openecomp.ncomp.openstack.location.Hypervisor
	 * @generated
	 */
	EClass getHypervisor();

	/**
	 * Returns the meta object for the containment reference '{@link org.openecomp.ncomp.openstack.location.Hypervisor#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service</em>'.
	 * @see org.openecomp.ncomp.openstack.location.Hypervisor#getService()
	 * @see #getHypervisor()
	 * @generated
	 */
	EReference getHypervisor_Service();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.location.Hypervisor#getHost_ip <em>Host ip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host ip</em>'.
	 * @see org.openecomp.ncomp.openstack.location.Hypervisor#getHost_ip()
	 * @see #getHypervisor()
	 * @generated
	 */
	EAttribute getHypervisor_Host_ip();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.location.Hypervisor#getVcpus_used <em>Vcpus used</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vcpus used</em>'.
	 * @see org.openecomp.ncomp.openstack.location.Hypervisor#getVcpus_used()
	 * @see #getHypervisor()
	 * @generated
	 */
	EAttribute getHypervisor_Vcpus_used();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.location.Hypervisor#getHypervisor_type <em>Hypervisor type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hypervisor type</em>'.
	 * @see org.openecomp.ncomp.openstack.location.Hypervisor#getHypervisor_type()
	 * @see #getHypervisor()
	 * @generated
	 */
	EAttribute getHypervisor_Hypervisor_type();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.location.Hypervisor#getLocal_gb_used <em>Local gb used</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local gb used</em>'.
	 * @see org.openecomp.ncomp.openstack.location.Hypervisor#getLocal_gb_used()
	 * @see #getHypervisor()
	 * @generated
	 */
	EAttribute getHypervisor_Local_gb_used();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.location.Hypervisor#getHypervisor_hostname <em>Hypervisor hostname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hypervisor hostname</em>'.
	 * @see org.openecomp.ncomp.openstack.location.Hypervisor#getHypervisor_hostname()
	 * @see #getHypervisor()
	 * @generated
	 */
	EAttribute getHypervisor_Hypervisor_hostname();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.location.Hypervisor#getMemory_mb_used <em>Memory mb used</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Memory mb used</em>'.
	 * @see org.openecomp.ncomp.openstack.location.Hypervisor#getMemory_mb_used()
	 * @see #getHypervisor()
	 * @generated
	 */
	EAttribute getHypervisor_Memory_mb_used();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.location.Hypervisor#getMemory_mb <em>Memory mb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Memory mb</em>'.
	 * @see org.openecomp.ncomp.openstack.location.Hypervisor#getMemory_mb()
	 * @see #getHypervisor()
	 * @generated
	 */
	EAttribute getHypervisor_Memory_mb();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.location.Hypervisor#getCurrent_workload <em>Current workload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current workload</em>'.
	 * @see org.openecomp.ncomp.openstack.location.Hypervisor#getCurrent_workload()
	 * @see #getHypervisor()
	 * @generated
	 */
	EAttribute getHypervisor_Current_workload();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.location.Hypervisor#getVcpus <em>Vcpus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vcpus</em>'.
	 * @see org.openecomp.ncomp.openstack.location.Hypervisor#getVcpus()
	 * @see #getHypervisor()
	 * @generated
	 */
	EAttribute getHypervisor_Vcpus();

	/**
	 * Returns the meta object for the containment reference '{@link org.openecomp.ncomp.openstack.location.Hypervisor#getCpu_info <em>Cpu info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cpu info</em>'.
	 * @see org.openecomp.ncomp.openstack.location.Hypervisor#getCpu_info()
	 * @see #getHypervisor()
	 * @generated
	 */
	EReference getHypervisor_Cpu_info();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.location.Hypervisor#getRunning_vms <em>Running vms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Running vms</em>'.
	 * @see org.openecomp.ncomp.openstack.location.Hypervisor#getRunning_vms()
	 * @see #getHypervisor()
	 * @generated
	 */
	EAttribute getHypervisor_Running_vms();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.location.Hypervisor#getFree_disk_gb <em>Free disk gb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Free disk gb</em>'.
	 * @see org.openecomp.ncomp.openstack.location.Hypervisor#getFree_disk_gb()
	 * @see #getHypervisor()
	 * @generated
	 */
	EAttribute getHypervisor_Free_disk_gb();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.location.Hypervisor#getHypervisor_version <em>Hypervisor version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hypervisor version</em>'.
	 * @see org.openecomp.ncomp.openstack.location.Hypervisor#getHypervisor_version()
	 * @see #getHypervisor()
	 * @generated
	 */
	EAttribute getHypervisor_Hypervisor_version();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.location.Hypervisor#getDisk_available_least <em>Disk available least</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disk available least</em>'.
	 * @see org.openecomp.ncomp.openstack.location.Hypervisor#getDisk_available_least()
	 * @see #getHypervisor()
	 * @generated
	 */
	EAttribute getHypervisor_Disk_available_least();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.location.Hypervisor#getLocal_gb <em>Local gb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local gb</em>'.
	 * @see org.openecomp.ncomp.openstack.location.Hypervisor#getLocal_gb()
	 * @see #getHypervisor()
	 * @generated
	 */
	EAttribute getHypervisor_Local_gb();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.location.Hypervisor#getFree_ram_mb <em>Free ram mb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Free ram mb</em>'.
	 * @see org.openecomp.ncomp.openstack.location.Hypervisor#getFree_ram_mb()
	 * @see #getHypervisor()
	 * @generated
	 */
	EAttribute getHypervisor_Free_ram_mb();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.location.Hypervisor#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.openecomp.ncomp.openstack.location.Hypervisor#getId()
	 * @see #getHypervisor()
	 * @generated
	 */
	EAttribute getHypervisor_Id();

	/**
	 * Returns the meta object for enum '{@link org.openecomp.ncomp.openstack.location.OpenStackVersion <em>Open Stack Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Open Stack Version</em>'.
	 * @see org.openecomp.ncomp.openstack.location.OpenStackVersion
	 * @generated
	 */
	EEnum getOpenStackVersion();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LocationFactory getLocationFactory();

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
		 * The meta object literal for the '{@link org.openecomp.ncomp.openstack.location.impl.OpenStackLocationImpl <em>Open Stack Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.openstack.location.impl.OpenStackLocationImpl
		 * @see org.openecomp.ncomp.openstack.location.impl.LocationPackageImpl#getOpenStackLocation()
		 * @generated
		 */
		EClass OPEN_STACK_LOCATION = eINSTANCE.getOpenStackLocation();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_STACK_LOCATION__VERSION = eINSTANCE.getOpenStackLocation_Version();

		/**
		 * The meta object literal for the '<em><b>Remote Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_STACK_LOCATION__REMOTE_LOCATION = eINSTANCE.getOpenStackLocation_RemoteLocation();

		/**
		 * The meta object literal for the '<em><b>Remote Location Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_STACK_LOCATION__REMOTE_LOCATION_NAME = eINSTANCE.getOpenStackLocation_RemoteLocationName();

		/**
		 * The meta object literal for the '<em><b>Allow Create Flavor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_STACK_LOCATION__ALLOW_CREATE_FLAVOR = eINSTANCE.getOpenStackLocation_AllowCreateFlavor();

		/**
		 * The meta object literal for the '<em><b>Keystone Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_STACK_LOCATION__KEYSTONE_URL = eINSTANCE.getOpenStackLocation_KeystoneUrl();

		/**
		 * The meta object literal for the '<em><b>Bypass Ip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_STACK_LOCATION__BYPASS_IP = eINSTANCE.getOpenStackLocation_BypassIp();

		/**
		 * The meta object literal for the '<em><b>Flavor Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_STACK_LOCATION__FLAVOR_ID = eINSTANCE.getOpenStackLocation_FlavorId();

		/**
		 * The meta object literal for the '<em><b>Supports Security Groups</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_STACK_LOCATION__SUPPORTS_SECURITY_GROUPS = eINSTANCE.getOpenStackLocation_SupportsSecurityGroups();

		/**
		 * The meta object literal for the '<em><b>Supports Floating Ips</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_STACK_LOCATION__SUPPORTS_FLOATING_IPS = eINSTANCE.getOpenStackLocation_SupportsFloatingIps();

		/**
		 * The meta object literal for the '<em><b>Projects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPEN_STACK_LOCATION__PROJECTS = eINSTANCE.getOpenStackLocation_Projects();

		/**
		 * The meta object literal for the '<em><b>Users</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPEN_STACK_LOCATION__USERS = eINSTANCE.getOpenStackLocation_Users();

		/**
		 * The meta object literal for the '<em><b>Images</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPEN_STACK_LOCATION__IMAGES = eINSTANCE.getOpenStackLocation_Images();

		/**
		 * The meta object literal for the '<em><b>Flavors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPEN_STACK_LOCATION__FLAVORS = eINSTANCE.getOpenStackLocation_Flavors();

		/**
		 * The meta object literal for the '<em><b>Hypervisors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPEN_STACK_LOCATION__HYPERVISORS = eINSTANCE.getOpenStackLocation_Hypervisors();

		/**
		 * The meta object literal for the '<em><b>Poll</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPEN_STACK_LOCATION___POLL = eINSTANCE.getOpenStackLocation__Poll();

		/**
		 * The meta object literal for the '<em><b>Merge Location</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPEN_STACK_LOCATION___MERGE_LOCATION__OPENSTACKLOCATION = eINSTANCE.getOpenStackLocation__MergeLocation__OpenStackLocation();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.openstack.location.impl.OpenStackProjectImpl <em>Open Stack Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.openstack.location.impl.OpenStackProjectImpl
		 * @see org.openecomp.ncomp.openstack.location.impl.LocationPackageImpl#getOpenStackProject()
		 * @generated
		 */
		EClass OPEN_STACK_PROJECT = eINSTANCE.getOpenStackProject();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_STACK_PROJECT__ID = eINSTANCE.getOpenStackProject_ID();

		/**
		 * The meta object literal for the '<em><b>Admin User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_STACK_PROJECT__ADMIN_USER = eINSTANCE.getOpenStackProject_AdminUser();

		/**
		 * The meta object literal for the '<em><b>Tenant Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_STACK_PROJECT__TENANT_ID = eINSTANCE.getOpenStackProject_TenantId();

		/**
		 * The meta object literal for the '<em><b>Region</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_STACK_PROJECT__REGION = eINSTANCE.getOpenStackProject_Region();

		/**
		 * The meta object literal for the '<em><b>Private Network</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_STACK_PROJECT__PRIVATE_NETWORK = eINSTANCE.getOpenStackProject_PrivateNetwork();

		/**
		 * The meta object literal for the '<em><b>Public Network</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_STACK_PROJECT__PUBLIC_NETWORK = eINSTANCE.getOpenStackProject_PublicNetwork();

		/**
		 * The meta object literal for the '<em><b>Api Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_STACK_PROJECT__API_KEY = eINSTANCE.getOpenStackProject_ApiKey();

		/**
		 * The meta object literal for the '<em><b>Servers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPEN_STACK_PROJECT__SERVERS = eINSTANCE.getOpenStackProject_Servers();

		/**
		 * The meta object literal for the '<em><b>Users</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPEN_STACK_PROJECT__USERS = eINSTANCE.getOpenStackProject_Users();

		/**
		 * The meta object literal for the '<em><b>Controller User</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPEN_STACK_PROJECT__CONTROLLER_USER = eINSTANCE.getOpenStackProject_ControllerUser();

		/**
		 * The meta object literal for the '<em><b>Volumes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPEN_STACK_PROJECT__VOLUMES = eINSTANCE.getOpenStackProject_Volumes();

		/**
		 * The meta object literal for the '<em><b>Ips</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPEN_STACK_PROJECT__IPS = eINSTANCE.getOpenStackProject_Ips();

		/**
		 * The meta object literal for the '<em><b>Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPEN_STACK_PROJECT__GROUPS = eINSTANCE.getOpenStackProject_Groups();

		/**
		 * The meta object literal for the '<em><b>Keypairs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPEN_STACK_PROJECT__KEYPAIRS = eINSTANCE.getOpenStackProject_Keypairs();

		/**
		 * The meta object literal for the '<em><b>Networks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPEN_STACK_PROJECT__NETWORKS = eINSTANCE.getOpenStackProject_Networks();

		/**
		 * The meta object literal for the '<em><b>Subnets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPEN_STACK_PROJECT__SUBNETS = eINSTANCE.getOpenStackProject_Subnets();

		/**
		 * The meta object literal for the '<em><b>Routers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPEN_STACK_PROJECT__ROUTERS = eINSTANCE.getOpenStackProject_Routers();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPEN_STACK_PROJECT__PORTS = eINSTANCE.getOpenStackProject_Ports();

		/**
		 * The meta object literal for the '<em><b>Security groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPEN_STACK_PROJECT__SECURITY_GROUPS = eINSTANCE.getOpenStackProject_Security_groups();

		/**
		 * The meta object literal for the '<em><b>Floatingips</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPEN_STACK_PROJECT__FLOATINGIPS = eINSTANCE.getOpenStackProject_Floatingips();

		/**
		 * The meta object literal for the '<em><b>Update Nova State</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPEN_STACK_PROJECT___UPDATE_NOVA_STATE = eINSTANCE.getOpenStackProject__UpdateNovaState();

		/**
		 * The meta object literal for the '<em><b>Create Network</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPEN_STACK_PROJECT___CREATE_NETWORK__CREATENETWORKREQUEST = eINSTANCE.getOpenStackProject__CreateNetwork__CreateNetworkRequest();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.openstack.location.impl.OpenStackUserImpl <em>Open Stack User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.openstack.location.impl.OpenStackUserImpl
		 * @see org.openecomp.ncomp.openstack.location.impl.LocationPackageImpl#getOpenStackUser()
		 * @generated
		 */
		EClass OPEN_STACK_USER = eINSTANCE.getOpenStackUser();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_STACK_USER__PASSWORD = eINSTANCE.getOpenStackUser_Password();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.openstack.location.impl.HypervisorServiceImpl <em>Hypervisor Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.openstack.location.impl.HypervisorServiceImpl
		 * @see org.openecomp.ncomp.openstack.location.impl.LocationPackageImpl#getHypervisorService()
		 * @generated
		 */
		EClass HYPERVISOR_SERVICE = eINSTANCE.getHypervisorService();

		/**
		 * The meta object literal for the '<em><b>Host</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYPERVISOR_SERVICE__HOST = eINSTANCE.getHypervisorService_Host();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYPERVISOR_SERVICE__ID = eINSTANCE.getHypervisorService_Id();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.openstack.location.impl.HypervisorCpuTopologyImpl <em>Hypervisor Cpu Topology</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.openstack.location.impl.HypervisorCpuTopologyImpl
		 * @see org.openecomp.ncomp.openstack.location.impl.LocationPackageImpl#getHypervisorCpuTopology()
		 * @generated
		 */
		EClass HYPERVISOR_CPU_TOPOLOGY = eINSTANCE.getHypervisorCpuTopology();

		/**
		 * The meta object literal for the '<em><b>Cores</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYPERVISOR_CPU_TOPOLOGY__CORES = eINSTANCE.getHypervisorCpuTopology_Cores();

		/**
		 * The meta object literal for the '<em><b>Threads</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYPERVISOR_CPU_TOPOLOGY__THREADS = eINSTANCE.getHypervisorCpuTopology_Threads();

		/**
		 * The meta object literal for the '<em><b>Sockets</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYPERVISOR_CPU_TOPOLOGY__SOCKETS = eINSTANCE.getHypervisorCpuTopology_Sockets();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.openstack.location.impl.HypervisorCpuInfoImpl <em>Hypervisor Cpu Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.openstack.location.impl.HypervisorCpuInfoImpl
		 * @see org.openecomp.ncomp.openstack.location.impl.LocationPackageImpl#getHypervisorCpuInfo()
		 * @generated
		 */
		EClass HYPERVISOR_CPU_INFO = eINSTANCE.getHypervisorCpuInfo();

		/**
		 * The meta object literal for the '<em><b>Vendor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYPERVISOR_CPU_INFO__VENDOR = eINSTANCE.getHypervisorCpuInfo_Vendor();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYPERVISOR_CPU_INFO__MODEL = eINSTANCE.getHypervisorCpuInfo_Model();

		/**
		 * The meta object literal for the '<em><b>Arch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYPERVISOR_CPU_INFO__ARCH = eINSTANCE.getHypervisorCpuInfo_Arch();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYPERVISOR_CPU_INFO__FEATURES = eINSTANCE.getHypervisorCpuInfo_Features();

		/**
		 * The meta object literal for the '<em><b>Topology</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HYPERVISOR_CPU_INFO__TOPOLOGY = eINSTANCE.getHypervisorCpuInfo_Topology();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.openstack.location.impl.HypervisorImpl <em>Hypervisor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.openstack.location.impl.HypervisorImpl
		 * @see org.openecomp.ncomp.openstack.location.impl.LocationPackageImpl#getHypervisor()
		 * @generated
		 */
		EClass HYPERVISOR = eINSTANCE.getHypervisor();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HYPERVISOR__SERVICE = eINSTANCE.getHypervisor_Service();

		/**
		 * The meta object literal for the '<em><b>Host ip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYPERVISOR__HOST_IP = eINSTANCE.getHypervisor_Host_ip();

		/**
		 * The meta object literal for the '<em><b>Vcpus used</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYPERVISOR__VCPUS_USED = eINSTANCE.getHypervisor_Vcpus_used();

		/**
		 * The meta object literal for the '<em><b>Hypervisor type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYPERVISOR__HYPERVISOR_TYPE = eINSTANCE.getHypervisor_Hypervisor_type();

		/**
		 * The meta object literal for the '<em><b>Local gb used</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYPERVISOR__LOCAL_GB_USED = eINSTANCE.getHypervisor_Local_gb_used();

		/**
		 * The meta object literal for the '<em><b>Hypervisor hostname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYPERVISOR__HYPERVISOR_HOSTNAME = eINSTANCE.getHypervisor_Hypervisor_hostname();

		/**
		 * The meta object literal for the '<em><b>Memory mb used</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYPERVISOR__MEMORY_MB_USED = eINSTANCE.getHypervisor_Memory_mb_used();

		/**
		 * The meta object literal for the '<em><b>Memory mb</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYPERVISOR__MEMORY_MB = eINSTANCE.getHypervisor_Memory_mb();

		/**
		 * The meta object literal for the '<em><b>Current workload</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYPERVISOR__CURRENT_WORKLOAD = eINSTANCE.getHypervisor_Current_workload();

		/**
		 * The meta object literal for the '<em><b>Vcpus</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYPERVISOR__VCPUS = eINSTANCE.getHypervisor_Vcpus();

		/**
		 * The meta object literal for the '<em><b>Cpu info</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HYPERVISOR__CPU_INFO = eINSTANCE.getHypervisor_Cpu_info();

		/**
		 * The meta object literal for the '<em><b>Running vms</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYPERVISOR__RUNNING_VMS = eINSTANCE.getHypervisor_Running_vms();

		/**
		 * The meta object literal for the '<em><b>Free disk gb</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYPERVISOR__FREE_DISK_GB = eINSTANCE.getHypervisor_Free_disk_gb();

		/**
		 * The meta object literal for the '<em><b>Hypervisor version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYPERVISOR__HYPERVISOR_VERSION = eINSTANCE.getHypervisor_Hypervisor_version();

		/**
		 * The meta object literal for the '<em><b>Disk available least</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYPERVISOR__DISK_AVAILABLE_LEAST = eINSTANCE.getHypervisor_Disk_available_least();

		/**
		 * The meta object literal for the '<em><b>Local gb</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYPERVISOR__LOCAL_GB = eINSTANCE.getHypervisor_Local_gb();

		/**
		 * The meta object literal for the '<em><b>Free ram mb</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYPERVISOR__FREE_RAM_MB = eINSTANCE.getHypervisor_Free_ram_mb();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYPERVISOR__ID = eINSTANCE.getHypervisor_Id();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.openstack.location.OpenStackVersion <em>Open Stack Version</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.openstack.location.OpenStackVersion
		 * @see org.openecomp.ncomp.openstack.location.impl.LocationPackageImpl#getOpenStackVersion()
		 * @generated
		 */
		EEnum OPEN_STACK_VERSION = eINSTANCE.getOpenStackVersion();

	}

} //LocationPackage
