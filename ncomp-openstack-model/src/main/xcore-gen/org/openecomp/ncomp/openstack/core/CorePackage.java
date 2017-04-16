
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
package org.openecomp.ncomp.openstack.core;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see org.openecomp.ncomp.openstack.core.CoreFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel modelDirectory='/ncomp-openstack-model/src/main/xcore-gen' basePackage='org.openecomp.ncomp.openstack'"
 * @generated
 */
public interface CorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "core";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.openecomp.ncomp.openstack.core";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "core";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CorePackage eINSTANCE = org.openecomp.ncomp.openstack.core.impl.CorePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.openstack.core.impl.OpenStackRequestImpl <em>Open Stack Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.openstack.core.impl.OpenStackRequestImpl
	 * @see org.openecomp.ncomp.openstack.core.impl.CorePackageImpl#getOpenStackRequest()
	 * @generated
	 */
	int OPEN_STACK_REQUEST = 0;

	/**
	 * The feature id for the '<em><b>Project Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_REQUEST__PROJECT_NAME = 0;

	/**
	 * The number of structural features of the '<em>Open Stack Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_REQUEST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Open Stack Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.openstack.core.impl.OpenstackRequestDeleteImpl <em>Openstack Request Delete</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.openstack.core.impl.OpenstackRequestDeleteImpl
	 * @see org.openecomp.ncomp.openstack.core.impl.CorePackageImpl#getOpenstackRequestDelete()
	 * @generated
	 */
	int OPENSTACK_REQUEST_DELETE = 1;

	/**
	 * The feature id for the '<em><b>Project Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENSTACK_REQUEST_DELETE__PROJECT_NAME = OPEN_STACK_REQUEST__PROJECT_NAME;

	/**
	 * The feature id for the '<em><b>Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENSTACK_REQUEST_DELETE__OBJECT_TYPE = OPEN_STACK_REQUEST_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Object Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENSTACK_REQUEST_DELETE__OBJECT_NAME = OPEN_STACK_REQUEST_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Openstack Request Delete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENSTACK_REQUEST_DELETE_FEATURE_COUNT = OPEN_STACK_REQUEST_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Openstack Request Delete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENSTACK_REQUEST_DELETE_OPERATION_COUNT = OPEN_STACK_REQUEST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.openstack.core.impl.OpenstackRequestPollImpl <em>Openstack Request Poll</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.openstack.core.impl.OpenstackRequestPollImpl
	 * @see org.openecomp.ncomp.openstack.core.impl.CorePackageImpl#getOpenstackRequestPoll()
	 * @generated
	 */
	int OPENSTACK_REQUEST_POLL = 2;

	/**
	 * The feature id for the '<em><b>Project Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENSTACK_REQUEST_POLL__PROJECT_NAME = OPEN_STACK_REQUEST__PROJECT_NAME;

	/**
	 * The number of structural features of the '<em>Openstack Request Poll</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENSTACK_REQUEST_POLL_FEATURE_COUNT = OPEN_STACK_REQUEST_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Openstack Request Poll</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENSTACK_REQUEST_POLL_OPERATION_COUNT = OPEN_STACK_REQUEST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.openstack.core.impl.VirtualMachineTypeImpl <em>Virtual Machine Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.openstack.core.impl.VirtualMachineTypeImpl
	 * @see org.openecomp.ncomp.openstack.core.impl.CorePackageImpl#getVirtualMachineType()
	 * @generated
	 */
	int VIRTUAL_MACHINE_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_TYPE__NAME = org.openecomp.ncomp.core.CorePackage.NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_TYPE__LAST_POLLED = org.openecomp.ncomp.core.CorePackage.NAMED_ENTITY__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_TYPE__LAST_CHANGED = org.openecomp.ncomp.core.CorePackage.NAMED_ENTITY__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_TYPE__CREATED = org.openecomp.ncomp.core.CorePackage.NAMED_ENTITY__CREATED;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_TYPE__DESCRIPTION = org.openecomp.ncomp.core.CorePackage.NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Number Of Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_TYPE__NUMBER_OF_CORES = org.openecomp.ncomp.core.CorePackage.NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Memory Size MB</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_TYPE__MEMORY_SIZE_MB = org.openecomp.ncomp.core.CorePackage.NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Root Disk Size GB</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_TYPE__ROOT_DISK_SIZE_GB = org.openecomp.ncomp.core.CorePackage.NAMED_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Disk Size GB</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_TYPE__DISK_SIZE_GB = org.openecomp.ncomp.core.CorePackage.NAMED_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Volume Size GB</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_TYPE__VOLUME_SIZE_GB = org.openecomp.ncomp.core.CorePackage.NAMED_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Image Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_TYPE__IMAGE_NAME = org.openecomp.ncomp.core.CorePackage.NAMED_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Flavor Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_TYPE__FLAVOR_NAME = org.openecomp.ncomp.core.CorePackage.NAMED_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Need Public Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_TYPE__NEED_PUBLIC_IP = org.openecomp.ncomp.core.CorePackage.NAMED_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Deployment Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_TYPE__DEPLOYMENT_STATUS = org.openecomp.ncomp.core.CorePackage.NAMED_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Incoming Security Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_TYPE__INCOMING_SECURITY_RULES = org.openecomp.ncomp.core.CorePackage.NAMED_ENTITY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Outbound Security Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_TYPE__OUTBOUND_SECURITY_RULES = org.openecomp.ncomp.core.CorePackage.NAMED_ENTITY_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Virtual Machine Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_TYPE_FEATURE_COUNT = org.openecomp.ncomp.core.CorePackage.NAMED_ENTITY_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>Virtual Machine Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_TYPE_OPERATION_COUNT = org.openecomp.ncomp.core.CorePackage.NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.openstack.core.impl.SecurityRuleImpl <em>Security Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.openstack.core.impl.SecurityRuleImpl
	 * @see org.openecomp.ncomp.openstack.core.impl.CorePackageImpl#getSecurityRule()
	 * @generated
	 */
	int SECURITY_RULE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_RULE__NAME = org.openecomp.ncomp.core.CorePackage.NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_RULE__LAST_POLLED = org.openecomp.ncomp.core.CorePackage.NAMED_ENTITY__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_RULE__LAST_CHANGED = org.openecomp.ncomp.core.CorePackage.NAMED_ENTITY__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_RULE__CREATED = org.openecomp.ncomp.core.CorePackage.NAMED_ENTITY__CREATED;

	/**
	 * The feature id for the '<em><b>Port Range Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_RULE__PORT_RANGE_START = org.openecomp.ncomp.core.CorePackage.NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port Range End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_RULE__PORT_RANGE_END = org.openecomp.ncomp.core.CorePackage.NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_RULE__PREFIX = org.openecomp.ncomp.core.CorePackage.NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ip Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_RULE__IP_PROTOCOL = org.openecomp.ncomp.core.CorePackage.NAMED_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Security Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_RULE_FEATURE_COUNT = org.openecomp.ncomp.core.CorePackage.NAMED_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Security Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_RULE_OPERATION_COUNT = org.openecomp.ncomp.core.CorePackage.NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.openstack.core.SecurityRuleProtocol <em>Security Rule Protocol</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.openstack.core.SecurityRuleProtocol
	 * @see org.openecomp.ncomp.openstack.core.impl.CorePackageImpl#getSecurityRuleProtocol()
	 * @generated
	 */
	int SECURITY_RULE_PROTOCOL = 5;

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.openstack.core.OpenStackRequest <em>Open Stack Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Open Stack Request</em>'.
	 * @see org.openecomp.ncomp.openstack.core.OpenStackRequest
	 * @generated
	 */
	EClass getOpenStackRequest();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.core.OpenStackRequest#getProjectName <em>Project Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project Name</em>'.
	 * @see org.openecomp.ncomp.openstack.core.OpenStackRequest#getProjectName()
	 * @see #getOpenStackRequest()
	 * @generated
	 */
	EAttribute getOpenStackRequest_ProjectName();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.openstack.core.OpenstackRequestDelete <em>Openstack Request Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Openstack Request Delete</em>'.
	 * @see org.openecomp.ncomp.openstack.core.OpenstackRequestDelete
	 * @generated
	 */
	EClass getOpenstackRequestDelete();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.core.OpenstackRequestDelete#getObjectType <em>Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object Type</em>'.
	 * @see org.openecomp.ncomp.openstack.core.OpenstackRequestDelete#getObjectType()
	 * @see #getOpenstackRequestDelete()
	 * @generated
	 */
	EAttribute getOpenstackRequestDelete_ObjectType();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.core.OpenstackRequestDelete#getObjectName <em>Object Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object Name</em>'.
	 * @see org.openecomp.ncomp.openstack.core.OpenstackRequestDelete#getObjectName()
	 * @see #getOpenstackRequestDelete()
	 * @generated
	 */
	EAttribute getOpenstackRequestDelete_ObjectName();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.openstack.core.OpenstackRequestPoll <em>Openstack Request Poll</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Openstack Request Poll</em>'.
	 * @see org.openecomp.ncomp.openstack.core.OpenstackRequestPoll
	 * @generated
	 */
	EClass getOpenstackRequestPoll();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.openstack.core.VirtualMachineType <em>Virtual Machine Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtual Machine Type</em>'.
	 * @see org.openecomp.ncomp.openstack.core.VirtualMachineType
	 * @generated
	 */
	EClass getVirtualMachineType();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.core.VirtualMachineType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.openecomp.ncomp.openstack.core.VirtualMachineType#getDescription()
	 * @see #getVirtualMachineType()
	 * @generated
	 */
	EAttribute getVirtualMachineType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.core.VirtualMachineType#getNumberOfCores <em>Number Of Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Cores</em>'.
	 * @see org.openecomp.ncomp.openstack.core.VirtualMachineType#getNumberOfCores()
	 * @see #getVirtualMachineType()
	 * @generated
	 */
	EAttribute getVirtualMachineType_NumberOfCores();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.core.VirtualMachineType#getMemorySizeMB <em>Memory Size MB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Memory Size MB</em>'.
	 * @see org.openecomp.ncomp.openstack.core.VirtualMachineType#getMemorySizeMB()
	 * @see #getVirtualMachineType()
	 * @generated
	 */
	EAttribute getVirtualMachineType_MemorySizeMB();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.core.VirtualMachineType#getRootDiskSizeGB <em>Root Disk Size GB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Root Disk Size GB</em>'.
	 * @see org.openecomp.ncomp.openstack.core.VirtualMachineType#getRootDiskSizeGB()
	 * @see #getVirtualMachineType()
	 * @generated
	 */
	EAttribute getVirtualMachineType_RootDiskSizeGB();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.core.VirtualMachineType#getDiskSizeGB <em>Disk Size GB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disk Size GB</em>'.
	 * @see org.openecomp.ncomp.openstack.core.VirtualMachineType#getDiskSizeGB()
	 * @see #getVirtualMachineType()
	 * @generated
	 */
	EAttribute getVirtualMachineType_DiskSizeGB();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.core.VirtualMachineType#getVolumeSizeGB <em>Volume Size GB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volume Size GB</em>'.
	 * @see org.openecomp.ncomp.openstack.core.VirtualMachineType#getVolumeSizeGB()
	 * @see #getVirtualMachineType()
	 * @generated
	 */
	EAttribute getVirtualMachineType_VolumeSizeGB();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.core.VirtualMachineType#getImageName <em>Image Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Name</em>'.
	 * @see org.openecomp.ncomp.openstack.core.VirtualMachineType#getImageName()
	 * @see #getVirtualMachineType()
	 * @generated
	 */
	EAttribute getVirtualMachineType_ImageName();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.core.VirtualMachineType#getFlavorName <em>Flavor Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flavor Name</em>'.
	 * @see org.openecomp.ncomp.openstack.core.VirtualMachineType#getFlavorName()
	 * @see #getVirtualMachineType()
	 * @generated
	 */
	EAttribute getVirtualMachineType_FlavorName();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.core.VirtualMachineType#isNeedPublicIp <em>Need Public Ip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Need Public Ip</em>'.
	 * @see org.openecomp.ncomp.openstack.core.VirtualMachineType#isNeedPublicIp()
	 * @see #getVirtualMachineType()
	 * @generated
	 */
	EAttribute getVirtualMachineType_NeedPublicIp();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.core.VirtualMachineType#getDeploymentStatus <em>Deployment Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deployment Status</em>'.
	 * @see org.openecomp.ncomp.openstack.core.VirtualMachineType#getDeploymentStatus()
	 * @see #getVirtualMachineType()
	 * @generated
	 */
	EAttribute getVirtualMachineType_DeploymentStatus();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.openstack.core.VirtualMachineType#getIncomingSecurityRules <em>Incoming Security Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Incoming Security Rules</em>'.
	 * @see org.openecomp.ncomp.openstack.core.VirtualMachineType#getIncomingSecurityRules()
	 * @see #getVirtualMachineType()
	 * @generated
	 */
	EReference getVirtualMachineType_IncomingSecurityRules();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.openstack.core.VirtualMachineType#getOutboundSecurityRules <em>Outbound Security Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outbound Security Rules</em>'.
	 * @see org.openecomp.ncomp.openstack.core.VirtualMachineType#getOutboundSecurityRules()
	 * @see #getVirtualMachineType()
	 * @generated
	 */
	EReference getVirtualMachineType_OutboundSecurityRules();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.openstack.core.SecurityRule <em>Security Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Rule</em>'.
	 * @see org.openecomp.ncomp.openstack.core.SecurityRule
	 * @generated
	 */
	EClass getSecurityRule();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.core.SecurityRule#getPortRangeStart <em>Port Range Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port Range Start</em>'.
	 * @see org.openecomp.ncomp.openstack.core.SecurityRule#getPortRangeStart()
	 * @see #getSecurityRule()
	 * @generated
	 */
	EAttribute getSecurityRule_PortRangeStart();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.core.SecurityRule#getPortRangeEnd <em>Port Range End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port Range End</em>'.
	 * @see org.openecomp.ncomp.openstack.core.SecurityRule#getPortRangeEnd()
	 * @see #getSecurityRule()
	 * @generated
	 */
	EAttribute getSecurityRule_PortRangeEnd();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.core.SecurityRule#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefix</em>'.
	 * @see org.openecomp.ncomp.openstack.core.SecurityRule#getPrefix()
	 * @see #getSecurityRule()
	 * @generated
	 */
	EAttribute getSecurityRule_Prefix();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.core.SecurityRule#getIpProtocol <em>Ip Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ip Protocol</em>'.
	 * @see org.openecomp.ncomp.openstack.core.SecurityRule#getIpProtocol()
	 * @see #getSecurityRule()
	 * @generated
	 */
	EAttribute getSecurityRule_IpProtocol();

	/**
	 * Returns the meta object for enum '{@link org.openecomp.ncomp.openstack.core.SecurityRuleProtocol <em>Security Rule Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Security Rule Protocol</em>'.
	 * @see org.openecomp.ncomp.openstack.core.SecurityRuleProtocol
	 * @generated
	 */
	EEnum getSecurityRuleProtocol();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CoreFactory getCoreFactory();

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
		 * The meta object literal for the '{@link org.openecomp.ncomp.openstack.core.impl.OpenStackRequestImpl <em>Open Stack Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.openstack.core.impl.OpenStackRequestImpl
		 * @see org.openecomp.ncomp.openstack.core.impl.CorePackageImpl#getOpenStackRequest()
		 * @generated
		 */
		EClass OPEN_STACK_REQUEST = eINSTANCE.getOpenStackRequest();

		/**
		 * The meta object literal for the '<em><b>Project Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_STACK_REQUEST__PROJECT_NAME = eINSTANCE.getOpenStackRequest_ProjectName();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.openstack.core.impl.OpenstackRequestDeleteImpl <em>Openstack Request Delete</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.openstack.core.impl.OpenstackRequestDeleteImpl
		 * @see org.openecomp.ncomp.openstack.core.impl.CorePackageImpl#getOpenstackRequestDelete()
		 * @generated
		 */
		EClass OPENSTACK_REQUEST_DELETE = eINSTANCE.getOpenstackRequestDelete();

		/**
		 * The meta object literal for the '<em><b>Object Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPENSTACK_REQUEST_DELETE__OBJECT_TYPE = eINSTANCE.getOpenstackRequestDelete_ObjectType();

		/**
		 * The meta object literal for the '<em><b>Object Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPENSTACK_REQUEST_DELETE__OBJECT_NAME = eINSTANCE.getOpenstackRequestDelete_ObjectName();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.openstack.core.impl.OpenstackRequestPollImpl <em>Openstack Request Poll</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.openstack.core.impl.OpenstackRequestPollImpl
		 * @see org.openecomp.ncomp.openstack.core.impl.CorePackageImpl#getOpenstackRequestPoll()
		 * @generated
		 */
		EClass OPENSTACK_REQUEST_POLL = eINSTANCE.getOpenstackRequestPoll();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.openstack.core.impl.VirtualMachineTypeImpl <em>Virtual Machine Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.openstack.core.impl.VirtualMachineTypeImpl
		 * @see org.openecomp.ncomp.openstack.core.impl.CorePackageImpl#getVirtualMachineType()
		 * @generated
		 */
		EClass VIRTUAL_MACHINE_TYPE = eINSTANCE.getVirtualMachineType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIRTUAL_MACHINE_TYPE__DESCRIPTION = eINSTANCE.getVirtualMachineType_Description();

		/**
		 * The meta object literal for the '<em><b>Number Of Cores</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIRTUAL_MACHINE_TYPE__NUMBER_OF_CORES = eINSTANCE.getVirtualMachineType_NumberOfCores();

		/**
		 * The meta object literal for the '<em><b>Memory Size MB</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIRTUAL_MACHINE_TYPE__MEMORY_SIZE_MB = eINSTANCE.getVirtualMachineType_MemorySizeMB();

		/**
		 * The meta object literal for the '<em><b>Root Disk Size GB</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIRTUAL_MACHINE_TYPE__ROOT_DISK_SIZE_GB = eINSTANCE.getVirtualMachineType_RootDiskSizeGB();

		/**
		 * The meta object literal for the '<em><b>Disk Size GB</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIRTUAL_MACHINE_TYPE__DISK_SIZE_GB = eINSTANCE.getVirtualMachineType_DiskSizeGB();

		/**
		 * The meta object literal for the '<em><b>Volume Size GB</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIRTUAL_MACHINE_TYPE__VOLUME_SIZE_GB = eINSTANCE.getVirtualMachineType_VolumeSizeGB();

		/**
		 * The meta object literal for the '<em><b>Image Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIRTUAL_MACHINE_TYPE__IMAGE_NAME = eINSTANCE.getVirtualMachineType_ImageName();

		/**
		 * The meta object literal for the '<em><b>Flavor Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIRTUAL_MACHINE_TYPE__FLAVOR_NAME = eINSTANCE.getVirtualMachineType_FlavorName();

		/**
		 * The meta object literal for the '<em><b>Need Public Ip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIRTUAL_MACHINE_TYPE__NEED_PUBLIC_IP = eINSTANCE.getVirtualMachineType_NeedPublicIp();

		/**
		 * The meta object literal for the '<em><b>Deployment Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIRTUAL_MACHINE_TYPE__DEPLOYMENT_STATUS = eINSTANCE.getVirtualMachineType_DeploymentStatus();

		/**
		 * The meta object literal for the '<em><b>Incoming Security Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_MACHINE_TYPE__INCOMING_SECURITY_RULES = eINSTANCE.getVirtualMachineType_IncomingSecurityRules();

		/**
		 * The meta object literal for the '<em><b>Outbound Security Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_MACHINE_TYPE__OUTBOUND_SECURITY_RULES = eINSTANCE.getVirtualMachineType_OutboundSecurityRules();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.openstack.core.impl.SecurityRuleImpl <em>Security Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.openstack.core.impl.SecurityRuleImpl
		 * @see org.openecomp.ncomp.openstack.core.impl.CorePackageImpl#getSecurityRule()
		 * @generated
		 */
		EClass SECURITY_RULE = eINSTANCE.getSecurityRule();

		/**
		 * The meta object literal for the '<em><b>Port Range Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_RULE__PORT_RANGE_START = eINSTANCE.getSecurityRule_PortRangeStart();

		/**
		 * The meta object literal for the '<em><b>Port Range End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_RULE__PORT_RANGE_END = eINSTANCE.getSecurityRule_PortRangeEnd();

		/**
		 * The meta object literal for the '<em><b>Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_RULE__PREFIX = eINSTANCE.getSecurityRule_Prefix();

		/**
		 * The meta object literal for the '<em><b>Ip Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_RULE__IP_PROTOCOL = eINSTANCE.getSecurityRule_IpProtocol();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.openstack.core.SecurityRuleProtocol <em>Security Rule Protocol</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.openstack.core.SecurityRuleProtocol
		 * @see org.openecomp.ncomp.openstack.core.impl.CorePackageImpl#getSecurityRuleProtocol()
		 * @generated
		 */
		EEnum SECURITY_RULE_PROTOCOL = eINSTANCE.getSecurityRuleProtocol();

	}

} //CorePackage
