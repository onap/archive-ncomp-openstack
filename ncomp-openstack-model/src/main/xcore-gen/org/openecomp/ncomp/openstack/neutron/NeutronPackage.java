
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
package org.openecomp.ncomp.openstack.neutron;

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
 * @see org.openecomp.ncomp.openstack.neutron.NeutronFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel modelDirectory='/ncomp-openstack-model/src/main/xcore-gen' basePackage='org.openecomp.ncomp.openstack'"
 *        annotation="http://www.eclipse.org/emf/2011/Xcore openstack='http://openecomp.org/sirius/openstack'"
 * @generated
 */
public interface NeutronPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "neutron";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.openecomp.ncomp.openstack.neutron";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "neutron";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NeutronPackage eINSTANCE = org.openecomp.ncomp.openstack.neutron.impl.NeutronPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.openstack.neutron.impl.NeutronServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.openstack.neutron.impl.NeutronServiceImpl
	 * @see org.openecomp.ncomp.openstack.neutron.impl.NeutronPackageImpl#getNeutronService()
	 * @generated
	 */
	int NEUTRON_SERVICE = 0;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEUTRON_SERVICE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Create Network</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEUTRON_SERVICE___CREATE_NETWORK__CREATENETWORKREQUEST = 0;

	/**
	 * The operation id for the '<em>Create Subnet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEUTRON_SERVICE___CREATE_SUBNET__CREATESUBNETREQUEST = 1;

	/**
	 * The operation id for the '<em>Create Port</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEUTRON_SERVICE___CREATE_PORT__CREATEPORTREQUEST = 2;

	/**
	 * The operation id for the '<em>Create Router</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEUTRON_SERVICE___CREATE_ROUTER__CREATEROUTERREQUEST = 3;

	/**
	 * The operation id for the '<em>Delete Network</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEUTRON_SERVICE___DELETE_NETWORK__STRING_STRING = 4;

	/**
	 * The operation id for the '<em>Delete Subnet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEUTRON_SERVICE___DELETE_SUBNET__STRING_STRING = 5;

	/**
	 * The operation id for the '<em>Delete Port</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEUTRON_SERVICE___DELETE_PORT__STRING_STRING = 6;

	/**
	 * The operation id for the '<em>Delete Router</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEUTRON_SERVICE___DELETE_ROUTER__STRING_STRING = 7;

	/**
	 * The operation id for the '<em>Associate Floating Ip</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEUTRON_SERVICE___ASSOCIATE_FLOATING_IP__STRING_STRING_STRING = 8;

	/**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEUTRON_SERVICE_OPERATION_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.openstack.neutron.impl.NeutronObjectImpl <em>Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.openstack.neutron.impl.NeutronObjectImpl
	 * @see org.openecomp.ncomp.openstack.neutron.impl.NeutronPackageImpl#getNeutronObject()
	 * @generated
	 */
	int NEUTRON_OBJECT = 1;

	/**
	 * The number of structural features of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEUTRON_OBJECT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEUTRON_OBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.openstack.neutron.impl.NetworkImpl <em>Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.openstack.neutron.impl.NetworkImpl
	 * @see org.openecomp.ncomp.openstack.neutron.impl.NeutronPackageImpl#getNetwork()
	 * @generated
	 */
	int NETWORK = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__ID = NEUTRON_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__NAME = NEUTRON_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Admin state up</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__ADMIN_STATE_UP = NEUTRON_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Provider network type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__PROVIDER_NETWORK_TYPE = NEUTRON_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Provider physical network</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__PROVIDER_PHYSICAL_NETWORK = NEUTRON_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Provider segmentation id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__PROVIDER_SEGMENTATION_ID = NEUTRON_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Router external</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__ROUTER_EXTERNAL = NEUTRON_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Shared</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__SHARED = NEUTRON_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__STATUS = NEUTRON_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Subnets</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__SUBNETS = NEUTRON_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Tenant id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__TENANT_ID = NEUTRON_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_FEATURE_COUNT = NEUTRON_OBJECT_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_OPERATION_COUNT = NEUTRON_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.openstack.neutron.impl.SubnetImpl <em>Subnet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.openstack.neutron.impl.SubnetImpl
	 * @see org.openecomp.ncomp.openstack.neutron.impl.NeutronPackageImpl#getSubnet()
	 * @generated
	 */
	int SUBNET = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET__ID = NEUTRON_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET__NAME = NEUTRON_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET__STATUS = NEUTRON_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Admin state up</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET__ADMIN_STATE_UP = NEUTRON_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Cidr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET__CIDR = NEUTRON_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Allocation pools</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET__ALLOCATION_POOLS = NEUTRON_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Dns nameservers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET__DNS_NAMESERVERS = NEUTRON_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Enable dhcp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET__ENABLE_DHCP = NEUTRON_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Gateway ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET__GATEWAY_IP = NEUTRON_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Host routes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET__HOST_ROUTES = NEUTRON_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Ip version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET__IP_VERSION = NEUTRON_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Network id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET__NETWORK_ID = NEUTRON_OBJECT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Tenant id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET__TENANT_ID = NEUTRON_OBJECT_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Subnet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_FEATURE_COUNT = NEUTRON_OBJECT_FEATURE_COUNT + 13;

	/**
	 * The number of operations of the '<em>Subnet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_OPERATION_COUNT = NEUTRON_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.openstack.neutron.impl.AllocationPoolImpl <em>Allocation Pool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.openstack.neutron.impl.AllocationPoolImpl
	 * @see org.openecomp.ncomp.openstack.neutron.impl.NeutronPackageImpl#getAllocationPool()
	 * @generated
	 */
	int ALLOCATION_POOL = 4;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_POOL__START = 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_POOL__END = 1;

	/**
	 * The number of structural features of the '<em>Allocation Pool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_POOL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Allocation Pool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_POOL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.openstack.neutron.impl.RouterImpl <em>Router</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.openstack.neutron.impl.RouterImpl
	 * @see org.openecomp.ncomp.openstack.neutron.impl.NeutronPackageImpl#getRouter()
	 * @generated
	 */
	int ROUTER = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER__ID = NEUTRON_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER__NAME = NEUTRON_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER__STATUS = NEUTRON_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Admin state up</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER__ADMIN_STATE_UP = NEUTRON_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>External gateway info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER__EXTERNAL_GATEWAY_INFO = NEUTRON_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Tenant id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER__TENANT_ID = NEUTRON_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Router</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER_FEATURE_COUNT = NEUTRON_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Router</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER_OPERATION_COUNT = NEUTRON_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.openstack.neutron.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.openstack.neutron.impl.PortImpl
	 * @see org.openecomp.ncomp.openstack.neutron.impl.NeutronPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__ID = NEUTRON_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__NAME = NEUTRON_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__STATUS = NEUTRON_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Admin state up</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__ADMIN_STATE_UP = NEUTRON_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>External gateway info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__EXTERNAL_GATEWAY_INFO = NEUTRON_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Tenant id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__TENANT_ID = NEUTRON_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Allowed address pairs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__ALLOWED_ADDRESS_PAIRS = NEUTRON_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Binding host id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__BINDING_HOST_ID = NEUTRON_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Binding profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__BINDING_PROFILE = NEUTRON_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Binding vif details</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__BINDING_VIF_DETAILS = NEUTRON_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Binding vif type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__BINDING_VIF_TYPE = NEUTRON_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Binding vnic type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__BINDING_VNIC_TYPE = NEUTRON_OBJECT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Device id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__DEVICE_ID = NEUTRON_OBJECT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Device owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__DEVICE_OWNER = NEUTRON_OBJECT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Extra dhcp opts</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__EXTRA_DHCP_OPTS = NEUTRON_OBJECT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Fixed ips</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__FIXED_IPS = NEUTRON_OBJECT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Mac address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__MAC_ADDRESS = NEUTRON_OBJECT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Network id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__NETWORK_ID = NEUTRON_OBJECT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Security groups</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__SECURITY_GROUPS = NEUTRON_OBJECT_FEATURE_COUNT + 18;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = NEUTRON_OBJECT_FEATURE_COUNT + 19;

	/**
	 * The number of operations of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_OPERATION_COUNT = NEUTRON_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.openstack.neutron.impl.NeutronSecurityGroupImpl <em>Security Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.openstack.neutron.impl.NeutronSecurityGroupImpl
	 * @see org.openecomp.ncomp.openstack.neutron.impl.NeutronPackageImpl#getNeutronSecurityGroup()
	 * @generated
	 */
	int NEUTRON_SECURITY_GROUP = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEUTRON_SECURITY_GROUP__ID = NEUTRON_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEUTRON_SECURITY_GROUP__NAME = NEUTRON_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEUTRON_SECURITY_GROUP__DESCRIPTION = NEUTRON_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Security group rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEUTRON_SECURITY_GROUP__SECURITY_GROUP_RULES = NEUTRON_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Tenant id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEUTRON_SECURITY_GROUP__TENANT_ID = NEUTRON_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Security Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEUTRON_SECURITY_GROUP_FEATURE_COUNT = NEUTRON_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Security Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEUTRON_SECURITY_GROUP_OPERATION_COUNT = NEUTRON_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.openstack.neutron.impl.NeutronSecurityRuleImpl <em>Security Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.openstack.neutron.impl.NeutronSecurityRuleImpl
	 * @see org.openecomp.ncomp.openstack.neutron.impl.NeutronPackageImpl#getNeutronSecurityRule()
	 * @generated
	 */
	int NEUTRON_SECURITY_RULE = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEUTRON_SECURITY_RULE__ID = NEUTRON_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEUTRON_SECURITY_RULE__DIRECTION = NEUTRON_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ethertype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEUTRON_SECURITY_RULE__ETHERTYPE = NEUTRON_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Port range min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEUTRON_SECURITY_RULE__PORT_RANGE_MIN = NEUTRON_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Port range max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEUTRON_SECURITY_RULE__PORT_RANGE_MAX = NEUTRON_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEUTRON_SECURITY_RULE__PROTOCOL = NEUTRON_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Remote group id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEUTRON_SECURITY_RULE__REMOTE_GROUP_ID = NEUTRON_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Remote ip prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEUTRON_SECURITY_RULE__REMOTE_IP_PREFIX = NEUTRON_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Security group id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEUTRON_SECURITY_RULE__SECURITY_GROUP_ID = NEUTRON_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Tenant id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEUTRON_SECURITY_RULE__TENANT_ID = NEUTRON_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Security Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEUTRON_SECURITY_RULE_FEATURE_COUNT = NEUTRON_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Security Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEUTRON_SECURITY_RULE_OPERATION_COUNT = NEUTRON_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.openstack.neutron.impl.NeutronFloatingIpImpl <em>Floating Ip</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.openstack.neutron.impl.NeutronFloatingIpImpl
	 * @see org.openecomp.ncomp.openstack.neutron.impl.NeutronPackageImpl#getNeutronFloatingIp()
	 * @generated
	 */
	int NEUTRON_FLOATING_IP = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEUTRON_FLOATING_IP__ID = NEUTRON_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEUTRON_FLOATING_IP__NAME = NEUTRON_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEUTRON_FLOATING_IP__STATUS = NEUTRON_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Floating network id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEUTRON_FLOATING_IP__FLOATING_NETWORK_ID = NEUTRON_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Router id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEUTRON_FLOATING_IP__ROUTER_ID = NEUTRON_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Fixed ip address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEUTRON_FLOATING_IP__FIXED_IP_ADDRESS = NEUTRON_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Floating ip address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEUTRON_FLOATING_IP__FLOATING_IP_ADDRESS = NEUTRON_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Tenant id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEUTRON_FLOATING_IP__TENANT_ID = NEUTRON_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Port id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEUTRON_FLOATING_IP__PORT_ID = NEUTRON_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Floating Ip</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEUTRON_FLOATING_IP_FEATURE_COUNT = NEUTRON_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Floating Ip</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEUTRON_FLOATING_IP_OPERATION_COUNT = NEUTRON_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.openstack.neutron.impl.BindingProfileImpl <em>Binding Profile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.openstack.neutron.impl.BindingProfileImpl
	 * @see org.openecomp.ncomp.openstack.neutron.impl.NeutronPackageImpl#getBindingProfile()
	 * @generated
	 */
	int BINDING_PROFILE = 10;

	/**
	 * The number of structural features of the '<em>Binding Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_PROFILE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Binding Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_PROFILE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.openstack.neutron.impl.BindingVifDetailImpl <em>Binding Vif Detail</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.openstack.neutron.impl.BindingVifDetailImpl
	 * @see org.openecomp.ncomp.openstack.neutron.impl.NeutronPackageImpl#getBindingVifDetail()
	 * @generated
	 */
	int BINDING_VIF_DETAIL = 11;

	/**
	 * The feature id for the '<em><b>Ovs hybrid plug</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_VIF_DETAIL__OVS_HYBRID_PLUG = 0;

	/**
	 * The feature id for the '<em><b>Port filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_VIF_DETAIL__PORT_FILTER = 1;

	/**
	 * The number of structural features of the '<em>Binding Vif Detail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_VIF_DETAIL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Binding Vif Detail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_VIF_DETAIL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.openstack.neutron.impl.FixedIpImpl <em>Fixed Ip</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.openstack.neutron.impl.FixedIpImpl
	 * @see org.openecomp.ncomp.openstack.neutron.impl.NeutronPackageImpl#getFixedIp()
	 * @generated
	 */
	int FIXED_IP = 12;

	/**
	 * The feature id for the '<em><b>Ip address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_IP__IP_ADDRESS = 0;

	/**
	 * The feature id for the '<em><b>Subnet id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_IP__SUBNET_ID = 1;

	/**
	 * The number of structural features of the '<em>Fixed Ip</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_IP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Fixed Ip</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_IP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.openstack.neutron.impl.ExternalGatewayImpl <em>External Gateway</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.openstack.neutron.impl.ExternalGatewayImpl
	 * @see org.openecomp.ncomp.openstack.neutron.impl.NeutronPackageImpl#getExternalGateway()
	 * @generated
	 */
	int EXTERNAL_GATEWAY = 13;

	/**
	 * The feature id for the '<em><b>Enable snat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_GATEWAY__ENABLE_SNAT = 0;

	/**
	 * The feature id for the '<em><b>Network id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_GATEWAY__NETWORK_ID = 1;

	/**
	 * The number of structural features of the '<em>External Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_GATEWAY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>External Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_GATEWAY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.openstack.neutron.impl.NeutronRequestImpl <em>Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.openstack.neutron.impl.NeutronRequestImpl
	 * @see org.openecomp.ncomp.openstack.neutron.impl.NeutronPackageImpl#getNeutronRequest()
	 * @generated
	 */
	int NEUTRON_REQUEST = 14;

	/**
	 * The feature id for the '<em><b>Project Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEUTRON_REQUEST__PROJECT_NAME = CorePackage.OPEN_STACK_REQUEST__PROJECT_NAME;

	/**
	 * The number of structural features of the '<em>Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEUTRON_REQUEST_FEATURE_COUNT = CorePackage.OPEN_STACK_REQUEST_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEUTRON_REQUEST_OPERATION_COUNT = CorePackage.OPEN_STACK_REQUEST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.openstack.neutron.impl.CreateNetworkRequestImpl <em>Create Network Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.openstack.neutron.impl.CreateNetworkRequestImpl
	 * @see org.openecomp.ncomp.openstack.neutron.impl.NeutronPackageImpl#getCreateNetworkRequest()
	 * @generated
	 */
	int CREATE_NETWORK_REQUEST = 15;

	/**
	 * The feature id for the '<em><b>Project Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_NETWORK_REQUEST__PROJECT_NAME = NEUTRON_REQUEST__PROJECT_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_NETWORK_REQUEST__NAME = NEUTRON_REQUEST_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Provider Network Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_NETWORK_REQUEST__PROVIDER_NETWORK_TYPE = NEUTRON_REQUEST_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Provider Physical Network</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_NETWORK_REQUEST__PROVIDER_PHYSICAL_NETWORK = NEUTRON_REQUEST_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Provider Segmentation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_NETWORK_REQUEST__PROVIDER_SEGMENTATION_ID = NEUTRON_REQUEST_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Admin state up</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_NETWORK_REQUEST__ADMIN_STATE_UP = NEUTRON_REQUEST_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Shared</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_NETWORK_REQUEST__SHARED = NEUTRON_REQUEST_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Create Network Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_NETWORK_REQUEST_FEATURE_COUNT = NEUTRON_REQUEST_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Create Network Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_NETWORK_REQUEST_OPERATION_COUNT = NEUTRON_REQUEST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.openstack.neutron.impl.CreateSubnetRequestImpl <em>Create Subnet Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.openstack.neutron.impl.CreateSubnetRequestImpl
	 * @see org.openecomp.ncomp.openstack.neutron.impl.NeutronPackageImpl#getCreateSubnetRequest()
	 * @generated
	 */
	int CREATE_SUBNET_REQUEST = 16;

	/**
	 * The feature id for the '<em><b>Project Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_SUBNET_REQUEST__PROJECT_NAME = NEUTRON_REQUEST__PROJECT_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_SUBNET_REQUEST__NAME = NEUTRON_REQUEST_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Network id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_SUBNET_REQUEST__NETWORK_ID = NEUTRON_REQUEST_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ip version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_SUBNET_REQUEST__IP_VERSION = NEUTRON_REQUEST_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Cidr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_SUBNET_REQUEST__CIDR = NEUTRON_REQUEST_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Allocation pools</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_SUBNET_REQUEST__ALLOCATION_POOLS = NEUTRON_REQUEST_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Dns nameservers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_SUBNET_REQUEST__DNS_NAMESERVERS = NEUTRON_REQUEST_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Enable dhcp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_SUBNET_REQUEST__ENABLE_DHCP = NEUTRON_REQUEST_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Gateway ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_SUBNET_REQUEST__GATEWAY_IP = NEUTRON_REQUEST_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Create Subnet Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_SUBNET_REQUEST_FEATURE_COUNT = NEUTRON_REQUEST_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Create Subnet Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_SUBNET_REQUEST_OPERATION_COUNT = NEUTRON_REQUEST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.openstack.neutron.impl.CreateRouterRequestImpl <em>Create Router Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.openstack.neutron.impl.CreateRouterRequestImpl
	 * @see org.openecomp.ncomp.openstack.neutron.impl.NeutronPackageImpl#getCreateRouterRequest()
	 * @generated
	 */
	int CREATE_ROUTER_REQUEST = 17;

	/**
	 * The feature id for the '<em><b>Project Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ROUTER_REQUEST__PROJECT_NAME = NEUTRON_REQUEST__PROJECT_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ROUTER_REQUEST__NAME = NEUTRON_REQUEST_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Admin state up</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ROUTER_REQUEST__ADMIN_STATE_UP = NEUTRON_REQUEST_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Shared</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ROUTER_REQUEST__SHARED = NEUTRON_REQUEST_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>External Network</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ROUTER_REQUEST__EXTERNAL_NETWORK = NEUTRON_REQUEST_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ROUTER_REQUEST__PORTS = NEUTRON_REQUEST_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Subnets</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ROUTER_REQUEST__SUBNETS = NEUTRON_REQUEST_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Create Router Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ROUTER_REQUEST_FEATURE_COUNT = NEUTRON_REQUEST_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Create Router Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ROUTER_REQUEST_OPERATION_COUNT = NEUTRON_REQUEST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.openstack.neutron.impl.CreatePortRequestImpl <em>Create Port Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.openstack.neutron.impl.CreatePortRequestImpl
	 * @see org.openecomp.ncomp.openstack.neutron.impl.NeutronPackageImpl#getCreatePortRequest()
	 * @generated
	 */
	int CREATE_PORT_REQUEST = 18;

	/**
	 * The feature id for the '<em><b>Project Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_PORT_REQUEST__PROJECT_NAME = NEUTRON_REQUEST__PROJECT_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_PORT_REQUEST__NAME = NEUTRON_REQUEST_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Binding Vnic Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_PORT_REQUEST__BINDING_VNIC_TYPE = NEUTRON_REQUEST_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_PORT_REQUEST__STATUS = NEUTRON_REQUEST_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Admin state up</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_PORT_REQUEST__ADMIN_STATE_UP = NEUTRON_REQUEST_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Fixed ips</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_PORT_REQUEST__FIXED_IPS = NEUTRON_REQUEST_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Mac address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_PORT_REQUEST__MAC_ADDRESS = NEUTRON_REQUEST_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Network id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_PORT_REQUEST__NETWORK_ID = NEUTRON_REQUEST_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Create Port Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_PORT_REQUEST_FEATURE_COUNT = NEUTRON_REQUEST_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Create Port Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_PORT_REQUEST_OPERATION_COUNT = NEUTRON_REQUEST_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.openstack.neutron.NeutronService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronService
	 * @generated
	 */
	EClass getNeutronService();

	/**
	 * Returns the meta object for the '{@link org.openecomp.ncomp.openstack.neutron.NeutronService#createNetwork(org.openecomp.ncomp.openstack.neutron.CreateNetworkRequest) <em>Create Network</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Network</em>' operation.
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronService#createNetwork(org.openecomp.ncomp.openstack.neutron.CreateNetworkRequest)
	 * @generated
	 */
	EOperation getNeutronService__CreateNetwork__CreateNetworkRequest();

	/**
	 * Returns the meta object for the '{@link org.openecomp.ncomp.openstack.neutron.NeutronService#createSubnet(org.openecomp.ncomp.openstack.neutron.CreateSubnetRequest) <em>Create Subnet</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Subnet</em>' operation.
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronService#createSubnet(org.openecomp.ncomp.openstack.neutron.CreateSubnetRequest)
	 * @generated
	 */
	EOperation getNeutronService__CreateSubnet__CreateSubnetRequest();

	/**
	 * Returns the meta object for the '{@link org.openecomp.ncomp.openstack.neutron.NeutronService#createPort(org.openecomp.ncomp.openstack.neutron.CreatePortRequest) <em>Create Port</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Port</em>' operation.
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronService#createPort(org.openecomp.ncomp.openstack.neutron.CreatePortRequest)
	 * @generated
	 */
	EOperation getNeutronService__CreatePort__CreatePortRequest();

	/**
	 * Returns the meta object for the '{@link org.openecomp.ncomp.openstack.neutron.NeutronService#createRouter(org.openecomp.ncomp.openstack.neutron.CreateRouterRequest) <em>Create Router</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Router</em>' operation.
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronService#createRouter(org.openecomp.ncomp.openstack.neutron.CreateRouterRequest)
	 * @generated
	 */
	EOperation getNeutronService__CreateRouter__CreateRouterRequest();

	/**
	 * Returns the meta object for the '{@link org.openecomp.ncomp.openstack.neutron.NeutronService#deleteNetwork(java.lang.String, java.lang.String) <em>Delete Network</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Delete Network</em>' operation.
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronService#deleteNetwork(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getNeutronService__DeleteNetwork__String_String();

	/**
	 * Returns the meta object for the '{@link org.openecomp.ncomp.openstack.neutron.NeutronService#deleteSubnet(java.lang.String, java.lang.String) <em>Delete Subnet</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Delete Subnet</em>' operation.
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronService#deleteSubnet(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getNeutronService__DeleteSubnet__String_String();

	/**
	 * Returns the meta object for the '{@link org.openecomp.ncomp.openstack.neutron.NeutronService#deletePort(java.lang.String, java.lang.String) <em>Delete Port</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Delete Port</em>' operation.
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronService#deletePort(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getNeutronService__DeletePort__String_String();

	/**
	 * Returns the meta object for the '{@link org.openecomp.ncomp.openstack.neutron.NeutronService#deleteRouter(java.lang.String, java.lang.String) <em>Delete Router</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Delete Router</em>' operation.
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronService#deleteRouter(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getNeutronService__DeleteRouter__String_String();

	/**
	 * Returns the meta object for the '{@link org.openecomp.ncomp.openstack.neutron.NeutronService#associateFloatingIp(java.lang.String, java.lang.String, java.lang.String) <em>Associate Floating Ip</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Associate Floating Ip</em>' operation.
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronService#associateFloatingIp(java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getNeutronService__AssociateFloatingIp__String_String_String();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.openstack.neutron.NeutronObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronObject
	 * @generated
	 */
	EClass getNeutronObject();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.openstack.neutron.Network <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.Network
	 * @generated
	 */
	EClass getNetwork();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.neutron.Network#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.Network#getId()
	 * @see #getNetwork()
	 * @generated
	 */
	EAttribute getNetwork_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.neutron.Network#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.Network#getName()
	 * @see #getNetwork()
	 * @generated
	 */
	EAttribute getNetwork_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.neutron.Network#getAdmin_state_up <em>Admin state up</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Admin state up</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.Network#getAdmin_state_up()
	 * @see #getNetwork()
	 * @generated
	 */
	EAttribute getNetwork_Admin_state_up();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.neutron.Network#getProvider_network_type <em>Provider network type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provider network type</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.Network#getProvider_network_type()
	 * @see #getNetwork()
	 * @generated
	 */
	EAttribute getNetwork_Provider_network_type();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.neutron.Network#getProvider_physical_network <em>Provider physical network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provider physical network</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.Network#getProvider_physical_network()
	 * @see #getNetwork()
	 * @generated
	 */
	EAttribute getNetwork_Provider_physical_network();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.neutron.Network#getProvider_segmentation_id <em>Provider segmentation id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provider segmentation id</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.Network#getProvider_segmentation_id()
	 * @see #getNetwork()
	 * @generated
	 */
	EAttribute getNetwork_Provider_segmentation_id();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.neutron.Network#getRouter_external <em>Router external</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Router external</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.Network#getRouter_external()
	 * @see #getNetwork()
	 * @generated
	 */
	EAttribute getNetwork_Router_external();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.neutron.Network#getShared <em>Shared</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shared</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.Network#getShared()
	 * @see #getNetwork()
	 * @generated
	 */
	EAttribute getNetwork_Shared();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.neutron.Network#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.Network#getStatus()
	 * @see #getNetwork()
	 * @generated
	 */
	EAttribute getNetwork_Status();

	/**
	 * Returns the meta object for the attribute list '{@link org.openecomp.ncomp.openstack.neutron.Network#getSubnets <em>Subnets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Subnets</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.Network#getSubnets()
	 * @see #getNetwork()
	 * @generated
	 */
	EAttribute getNetwork_Subnets();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.neutron.Network#getTenant_id <em>Tenant id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tenant id</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.Network#getTenant_id()
	 * @see #getNetwork()
	 * @generated
	 */
	EAttribute getNetwork_Tenant_id();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.openstack.neutron.Subnet <em>Subnet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subnet</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.Subnet
	 * @generated
	 */
	EClass getSubnet();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.neutron.Subnet#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.Subnet#getId()
	 * @see #getSubnet()
	 * @generated
	 */
	EAttribute getSubnet_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.neutron.Subnet#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.Subnet#getName()
	 * @see #getSubnet()
	 * @generated
	 */
	EAttribute getSubnet_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.neutron.Subnet#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.Subnet#getStatus()
	 * @see #getSubnet()
	 * @generated
	 */
	EAttribute getSubnet_Status();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.neutron.Subnet#getAdmin_state_up <em>Admin state up</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Admin state up</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.Subnet#getAdmin_state_up()
	 * @see #getSubnet()
	 * @generated
	 */
	EAttribute getSubnet_Admin_state_up();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.neutron.Subnet#getCidr <em>Cidr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cidr</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.Subnet#getCidr()
	 * @see #getSubnet()
	 * @generated
	 */
	EAttribute getSubnet_Cidr();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.openstack.neutron.Subnet#getAllocation_pools <em>Allocation pools</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Allocation pools</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.Subnet#getAllocation_pools()
	 * @see #getSubnet()
	 * @generated
	 */
	EReference getSubnet_Allocation_pools();

	/**
	 * Returns the meta object for the attribute list '{@link org.openecomp.ncomp.openstack.neutron.Subnet#getDns_nameservers <em>Dns nameservers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Dns nameservers</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.Subnet#getDns_nameservers()
	 * @see #getSubnet()
	 * @generated
	 */
	EAttribute getSubnet_Dns_nameservers();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.neutron.Subnet#getEnable_dhcp <em>Enable dhcp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enable dhcp</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.Subnet#getEnable_dhcp()
	 * @see #getSubnet()
	 * @generated
	 */
	EAttribute getSubnet_Enable_dhcp();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.neutron.Subnet#getGateway_ip <em>Gateway ip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gateway ip</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.Subnet#getGateway_ip()
	 * @see #getSubnet()
	 * @generated
	 */
	EAttribute getSubnet_Gateway_ip();

	/**
	 * Returns the meta object for the attribute list '{@link org.openecomp.ncomp.openstack.neutron.Subnet#getHost_routes <em>Host routes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Host routes</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.Subnet#getHost_routes()
	 * @see #getSubnet()
	 * @generated
	 */
	EAttribute getSubnet_Host_routes();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.neutron.Subnet#getIp_version <em>Ip version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ip version</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.Subnet#getIp_version()
	 * @see #getSubnet()
	 * @generated
	 */
	EAttribute getSubnet_Ip_version();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.neutron.Subnet#getNetwork_id <em>Network id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Network id</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.Subnet#getNetwork_id()
	 * @see #getSubnet()
	 * @generated
	 */
	EAttribute getSubnet_Network_id();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.neutron.Subnet#getTenant_id <em>Tenant id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tenant id</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.Subnet#getTenant_id()
	 * @see #getSubnet()
	 * @generated
	 */
	EAttribute getSubnet_Tenant_id();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.openstack.neutron.AllocationPool <em>Allocation Pool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allocation Pool</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.AllocationPool
	 * @generated
	 */
	EClass getAllocationPool();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.neutron.AllocationPool#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.AllocationPool#getStart()
	 * @see #getAllocationPool()
	 * @generated
	 */
	EAttribute getAllocationPool_Start();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.neutron.AllocationPool#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.AllocationPool#getEnd()
	 * @see #getAllocationPool()
	 * @generated
	 */
	EAttribute getAllocationPool_End();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.openstack.neutron.Router <em>Router</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Router</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.Router
	 * @generated
	 */
	EClass getRouter();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.neutron.Router#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.Router#getId()
	 * @see #getRouter()
	 * @generated
	 */
	EAttribute getRouter_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.neutron.Router#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.Router#getName()
	 * @see #getRouter()
	 * @generated
	 */
	EAttribute getRouter_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.neutron.Router#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.Router#getStatus()
	 * @see #getRouter()
	 * @generated
	 */
	EAttribute getRouter_Status();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.neutron.Router#getAdmin_state_up <em>Admin state up</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Admin state up</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.Router#getAdmin_state_up()
	 * @see #getRouter()
	 * @generated
	 */
	EAttribute getRouter_Admin_state_up();

	/**
	 * Returns the meta object for the containment reference '{@link org.openecomp.ncomp.openstack.neutron.Router#getExternal_gateway_info <em>External gateway info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>External gateway info</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.Router#getExternal_gateway_info()
	 * @see #getRouter()
	 * @generated
	 */
	EReference getRouter_External_gateway_info();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.neutron.Router#getTenant_id <em>Tenant id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tenant id</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.Router#getTenant_id()
	 * @see #getRouter()
	 * @generated
	 */
	EAttribute getRouter_Tenant_id();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.openstack.neutron.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.neutron.Port#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.Port#getId()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.neutron.Port#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.Port#getName()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.neutron.Port#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.Port#getStatus()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Status();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.neutron.Port#getAdmin_state_up <em>Admin state up</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Admin state up</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.Port#getAdmin_state_up()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Admin_state_up();

	/**
	 * Returns the meta object for the containment reference '{@link org.openecomp.ncomp.openstack.neutron.Port#getExternal_gateway_info <em>External gateway info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>External gateway info</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.Port#getExternal_gateway_info()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_External_gateway_info();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.neutron.Port#getTenant_id <em>Tenant id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tenant id</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.Port#getTenant_id()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Tenant_id();

	/**
	 * Returns the meta object for the attribute list '{@link org.openecomp.ncomp.openstack.neutron.Port#getAllowed_address_pairs <em>Allowed address pairs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Allowed address pairs</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.Port#getAllowed_address_pairs()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Allowed_address_pairs();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.neutron.Port#getBinding_host_id <em>Binding host id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Binding host id</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.Port#getBinding_host_id()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Binding_host_id();

	/**
	 * Returns the meta object for the containment reference '{@link org.openecomp.ncomp.openstack.neutron.Port#getBinding_profile <em>Binding profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Binding profile</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.Port#getBinding_profile()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_Binding_profile();

	/**
	 * Returns the meta object for the containment reference '{@link org.openecomp.ncomp.openstack.neutron.Port#getBinding_vif_details <em>Binding vif details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Binding vif details</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.Port#getBinding_vif_details()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_Binding_vif_details();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.neutron.Port#getBinding_vif_type <em>Binding vif type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Binding vif type</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.Port#getBinding_vif_type()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Binding_vif_type();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.neutron.Port#getBinding_vnic_type <em>Binding vnic type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Binding vnic type</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.Port#getBinding_vnic_type()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Binding_vnic_type();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.neutron.Port#getDevice_id <em>Device id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device id</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.Port#getDevice_id()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Device_id();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.neutron.Port#getDevice_owner <em>Device owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device owner</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.Port#getDevice_owner()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Device_owner();

	/**
	 * Returns the meta object for the attribute list '{@link org.openecomp.ncomp.openstack.neutron.Port#getExtra_dhcp_opts <em>Extra dhcp opts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Extra dhcp opts</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.Port#getExtra_dhcp_opts()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Extra_dhcp_opts();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.openstack.neutron.Port#getFixed_ips <em>Fixed ips</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fixed ips</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.Port#getFixed_ips()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_Fixed_ips();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.neutron.Port#getMac_address <em>Mac address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mac address</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.Port#getMac_address()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Mac_address();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.neutron.Port#getNetwork_id <em>Network id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Network id</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.Port#getNetwork_id()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Network_id();

	/**
	 * Returns the meta object for the attribute list '{@link org.openecomp.ncomp.openstack.neutron.Port#getSecurity_groups <em>Security groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Security groups</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.Port#getSecurity_groups()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Security_groups();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.openstack.neutron.NeutronSecurityGroup <em>Security Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Group</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronSecurityGroup
	 * @generated
	 */
	EClass getNeutronSecurityGroup();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.neutron.NeutronSecurityGroup#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronSecurityGroup#getId()
	 * @see #getNeutronSecurityGroup()
	 * @generated
	 */
	EAttribute getNeutronSecurityGroup_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.neutron.NeutronSecurityGroup#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronSecurityGroup#getName()
	 * @see #getNeutronSecurityGroup()
	 * @generated
	 */
	EAttribute getNeutronSecurityGroup_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.neutron.NeutronSecurityGroup#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronSecurityGroup#getDescription()
	 * @see #getNeutronSecurityGroup()
	 * @generated
	 */
	EAttribute getNeutronSecurityGroup_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.openstack.neutron.NeutronSecurityGroup#getSecurity_group_rules <em>Security group rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Security group rules</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronSecurityGroup#getSecurity_group_rules()
	 * @see #getNeutronSecurityGroup()
	 * @generated
	 */
	EReference getNeutronSecurityGroup_Security_group_rules();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.neutron.NeutronSecurityGroup#getTenant_id <em>Tenant id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tenant id</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronSecurityGroup#getTenant_id()
	 * @see #getNeutronSecurityGroup()
	 * @generated
	 */
	EAttribute getNeutronSecurityGroup_Tenant_id();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.openstack.neutron.NeutronSecurityRule <em>Security Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Rule</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronSecurityRule
	 * @generated
	 */
	EClass getNeutronSecurityRule();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.neutron.NeutronSecurityRule#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronSecurityRule#getId()
	 * @see #getNeutronSecurityRule()
	 * @generated
	 */
	EAttribute getNeutronSecurityRule_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.neutron.NeutronSecurityRule#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronSecurityRule#getDirection()
	 * @see #getNeutronSecurityRule()
	 * @generated
	 */
	EAttribute getNeutronSecurityRule_Direction();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.neutron.NeutronSecurityRule#getEthertype <em>Ethertype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ethertype</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronSecurityRule#getEthertype()
	 * @see #getNeutronSecurityRule()
	 * @generated
	 */
	EAttribute getNeutronSecurityRule_Ethertype();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.neutron.NeutronSecurityRule#getPort_range_min <em>Port range min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port range min</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronSecurityRule#getPort_range_min()
	 * @see #getNeutronSecurityRule()
	 * @generated
	 */
	EAttribute getNeutronSecurityRule_Port_range_min();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.neutron.NeutronSecurityRule#getPort_range_max <em>Port range max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port range max</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronSecurityRule#getPort_range_max()
	 * @see #getNeutronSecurityRule()
	 * @generated
	 */
	EAttribute getNeutronSecurityRule_Port_range_max();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.neutron.NeutronSecurityRule#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronSecurityRule#getProtocol()
	 * @see #getNeutronSecurityRule()
	 * @generated
	 */
	EAttribute getNeutronSecurityRule_Protocol();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.neutron.NeutronSecurityRule#getRemote_group_id <em>Remote group id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remote group id</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronSecurityRule#getRemote_group_id()
	 * @see #getNeutronSecurityRule()
	 * @generated
	 */
	EAttribute getNeutronSecurityRule_Remote_group_id();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.neutron.NeutronSecurityRule#getRemote_ip_prefix <em>Remote ip prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remote ip prefix</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronSecurityRule#getRemote_ip_prefix()
	 * @see #getNeutronSecurityRule()
	 * @generated
	 */
	EAttribute getNeutronSecurityRule_Remote_ip_prefix();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.neutron.NeutronSecurityRule#getSecurity_group_id <em>Security group id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Security group id</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronSecurityRule#getSecurity_group_id()
	 * @see #getNeutronSecurityRule()
	 * @generated
	 */
	EAttribute getNeutronSecurityRule_Security_group_id();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.neutron.NeutronSecurityRule#getTenant_id <em>Tenant id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tenant id</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronSecurityRule#getTenant_id()
	 * @see #getNeutronSecurityRule()
	 * @generated
	 */
	EAttribute getNeutronSecurityRule_Tenant_id();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.openstack.neutron.NeutronFloatingIp <em>Floating Ip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Floating Ip</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronFloatingIp
	 * @generated
	 */
	EClass getNeutronFloatingIp();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.neutron.NeutronFloatingIp#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronFloatingIp#getId()
	 * @see #getNeutronFloatingIp()
	 * @generated
	 */
	EAttribute getNeutronFloatingIp_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.neutron.NeutronFloatingIp#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronFloatingIp#getName()
	 * @see #getNeutronFloatingIp()
	 * @generated
	 */
	EAttribute getNeutronFloatingIp_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.neutron.NeutronFloatingIp#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronFloatingIp#getStatus()
	 * @see #getNeutronFloatingIp()
	 * @generated
	 */
	EAttribute getNeutronFloatingIp_Status();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.neutron.NeutronFloatingIp#getFloating_network_id <em>Floating network id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Floating network id</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronFloatingIp#getFloating_network_id()
	 * @see #getNeutronFloatingIp()
	 * @generated
	 */
	EAttribute getNeutronFloatingIp_Floating_network_id();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.neutron.NeutronFloatingIp#getRouter_id <em>Router id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Router id</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronFloatingIp#getRouter_id()
	 * @see #getNeutronFloatingIp()
	 * @generated
	 */
	EAttribute getNeutronFloatingIp_Router_id();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.neutron.NeutronFloatingIp#getFixed_ip_address <em>Fixed ip address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fixed ip address</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronFloatingIp#getFixed_ip_address()
	 * @see #getNeutronFloatingIp()
	 * @generated
	 */
	EAttribute getNeutronFloatingIp_Fixed_ip_address();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.neutron.NeutronFloatingIp#getFloating_ip_address <em>Floating ip address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Floating ip address</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronFloatingIp#getFloating_ip_address()
	 * @see #getNeutronFloatingIp()
	 * @generated
	 */
	EAttribute getNeutronFloatingIp_Floating_ip_address();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.neutron.NeutronFloatingIp#getTenant_id <em>Tenant id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tenant id</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronFloatingIp#getTenant_id()
	 * @see #getNeutronFloatingIp()
	 * @generated
	 */
	EAttribute getNeutronFloatingIp_Tenant_id();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.neutron.NeutronFloatingIp#getPort_id <em>Port id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port id</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronFloatingIp#getPort_id()
	 * @see #getNeutronFloatingIp()
	 * @generated
	 */
	EAttribute getNeutronFloatingIp_Port_id();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.openstack.neutron.BindingProfile <em>Binding Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding Profile</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.BindingProfile
	 * @generated
	 */
	EClass getBindingProfile();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.openstack.neutron.BindingVifDetail <em>Binding Vif Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding Vif Detail</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.BindingVifDetail
	 * @generated
	 */
	EClass getBindingVifDetail();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.neutron.BindingVifDetail#getOvs_hybrid_plug <em>Ovs hybrid plug</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ovs hybrid plug</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.BindingVifDetail#getOvs_hybrid_plug()
	 * @see #getBindingVifDetail()
	 * @generated
	 */
	EAttribute getBindingVifDetail_Ovs_hybrid_plug();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.neutron.BindingVifDetail#getPort_filter <em>Port filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port filter</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.BindingVifDetail#getPort_filter()
	 * @see #getBindingVifDetail()
	 * @generated
	 */
	EAttribute getBindingVifDetail_Port_filter();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.openstack.neutron.FixedIp <em>Fixed Ip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fixed Ip</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.FixedIp
	 * @generated
	 */
	EClass getFixedIp();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.neutron.FixedIp#getIp_address <em>Ip address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ip address</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.FixedIp#getIp_address()
	 * @see #getFixedIp()
	 * @generated
	 */
	EAttribute getFixedIp_Ip_address();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.neutron.FixedIp#getSubnet_id <em>Subnet id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subnet id</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.FixedIp#getSubnet_id()
	 * @see #getFixedIp()
	 * @generated
	 */
	EAttribute getFixedIp_Subnet_id();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.openstack.neutron.ExternalGateway <em>External Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Gateway</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.ExternalGateway
	 * @generated
	 */
	EClass getExternalGateway();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.neutron.ExternalGateway#getEnable_snat <em>Enable snat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enable snat</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.ExternalGateway#getEnable_snat()
	 * @see #getExternalGateway()
	 * @generated
	 */
	EAttribute getExternalGateway_Enable_snat();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.neutron.ExternalGateway#getNetwork_id <em>Network id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Network id</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.ExternalGateway#getNetwork_id()
	 * @see #getExternalGateway()
	 * @generated
	 */
	EAttribute getExternalGateway_Network_id();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.openstack.neutron.NeutronRequest <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronRequest
	 * @generated
	 */
	EClass getNeutronRequest();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.openstack.neutron.CreateNetworkRequest <em>Create Network Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Network Request</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.CreateNetworkRequest
	 * @generated
	 */
	EClass getCreateNetworkRequest();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.neutron.CreateNetworkRequest#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.CreateNetworkRequest#getName()
	 * @see #getCreateNetworkRequest()
	 * @generated
	 */
	EAttribute getCreateNetworkRequest_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.neutron.CreateNetworkRequest#getProviderNetworkType <em>Provider Network Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provider Network Type</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.CreateNetworkRequest#getProviderNetworkType()
	 * @see #getCreateNetworkRequest()
	 * @generated
	 */
	EAttribute getCreateNetworkRequest_ProviderNetworkType();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.neutron.CreateNetworkRequest#getProviderPhysicalNetwork <em>Provider Physical Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provider Physical Network</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.CreateNetworkRequest#getProviderPhysicalNetwork()
	 * @see #getCreateNetworkRequest()
	 * @generated
	 */
	EAttribute getCreateNetworkRequest_ProviderPhysicalNetwork();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.neutron.CreateNetworkRequest#getProviderSegmentationId <em>Provider Segmentation Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provider Segmentation Id</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.CreateNetworkRequest#getProviderSegmentationId()
	 * @see #getCreateNetworkRequest()
	 * @generated
	 */
	EAttribute getCreateNetworkRequest_ProviderSegmentationId();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.neutron.CreateNetworkRequest#getAdmin_state_up <em>Admin state up</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Admin state up</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.CreateNetworkRequest#getAdmin_state_up()
	 * @see #getCreateNetworkRequest()
	 * @generated
	 */
	EAttribute getCreateNetworkRequest_Admin_state_up();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.neutron.CreateNetworkRequest#getShared <em>Shared</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shared</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.CreateNetworkRequest#getShared()
	 * @see #getCreateNetworkRequest()
	 * @generated
	 */
	EAttribute getCreateNetworkRequest_Shared();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.openstack.neutron.CreateSubnetRequest <em>Create Subnet Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Subnet Request</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.CreateSubnetRequest
	 * @generated
	 */
	EClass getCreateSubnetRequest();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.neutron.CreateSubnetRequest#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.CreateSubnetRequest#getName()
	 * @see #getCreateSubnetRequest()
	 * @generated
	 */
	EAttribute getCreateSubnetRequest_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.neutron.CreateSubnetRequest#getNetwork_id <em>Network id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Network id</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.CreateSubnetRequest#getNetwork_id()
	 * @see #getCreateSubnetRequest()
	 * @generated
	 */
	EAttribute getCreateSubnetRequest_Network_id();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.neutron.CreateSubnetRequest#getIp_version <em>Ip version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ip version</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.CreateSubnetRequest#getIp_version()
	 * @see #getCreateSubnetRequest()
	 * @generated
	 */
	EAttribute getCreateSubnetRequest_Ip_version();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.neutron.CreateSubnetRequest#getCidr <em>Cidr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cidr</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.CreateSubnetRequest#getCidr()
	 * @see #getCreateSubnetRequest()
	 * @generated
	 */
	EAttribute getCreateSubnetRequest_Cidr();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.openstack.neutron.CreateSubnetRequest#getAllocation_pools <em>Allocation pools</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Allocation pools</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.CreateSubnetRequest#getAllocation_pools()
	 * @see #getCreateSubnetRequest()
	 * @generated
	 */
	EReference getCreateSubnetRequest_Allocation_pools();

	/**
	 * Returns the meta object for the attribute list '{@link org.openecomp.ncomp.openstack.neutron.CreateSubnetRequest#getDns_nameservers <em>Dns nameservers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Dns nameservers</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.CreateSubnetRequest#getDns_nameservers()
	 * @see #getCreateSubnetRequest()
	 * @generated
	 */
	EAttribute getCreateSubnetRequest_Dns_nameservers();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.neutron.CreateSubnetRequest#getEnable_dhcp <em>Enable dhcp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enable dhcp</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.CreateSubnetRequest#getEnable_dhcp()
	 * @see #getCreateSubnetRequest()
	 * @generated
	 */
	EAttribute getCreateSubnetRequest_Enable_dhcp();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.neutron.CreateSubnetRequest#getGateway_ip <em>Gateway ip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gateway ip</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.CreateSubnetRequest#getGateway_ip()
	 * @see #getCreateSubnetRequest()
	 * @generated
	 */
	EAttribute getCreateSubnetRequest_Gateway_ip();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.openstack.neutron.CreateRouterRequest <em>Create Router Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Router Request</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.CreateRouterRequest
	 * @generated
	 */
	EClass getCreateRouterRequest();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.neutron.CreateRouterRequest#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.CreateRouterRequest#getName()
	 * @see #getCreateRouterRequest()
	 * @generated
	 */
	EAttribute getCreateRouterRequest_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.neutron.CreateRouterRequest#getAdmin_state_up <em>Admin state up</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Admin state up</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.CreateRouterRequest#getAdmin_state_up()
	 * @see #getCreateRouterRequest()
	 * @generated
	 */
	EAttribute getCreateRouterRequest_Admin_state_up();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.neutron.CreateRouterRequest#getShared <em>Shared</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shared</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.CreateRouterRequest#getShared()
	 * @see #getCreateRouterRequest()
	 * @generated
	 */
	EAttribute getCreateRouterRequest_Shared();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.neutron.CreateRouterRequest#getExternalNetwork <em>External Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External Network</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.CreateRouterRequest#getExternalNetwork()
	 * @see #getCreateRouterRequest()
	 * @generated
	 */
	EAttribute getCreateRouterRequest_ExternalNetwork();

	/**
	 * Returns the meta object for the attribute list '{@link org.openecomp.ncomp.openstack.neutron.CreateRouterRequest#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Ports</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.CreateRouterRequest#getPorts()
	 * @see #getCreateRouterRequest()
	 * @generated
	 */
	EAttribute getCreateRouterRequest_Ports();

	/**
	 * Returns the meta object for the attribute list '{@link org.openecomp.ncomp.openstack.neutron.CreateRouterRequest#getSubnets <em>Subnets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Subnets</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.CreateRouterRequest#getSubnets()
	 * @see #getCreateRouterRequest()
	 * @generated
	 */
	EAttribute getCreateRouterRequest_Subnets();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.openstack.neutron.CreatePortRequest <em>Create Port Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Port Request</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.CreatePortRequest
	 * @generated
	 */
	EClass getCreatePortRequest();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.neutron.CreatePortRequest#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.CreatePortRequest#getName()
	 * @see #getCreatePortRequest()
	 * @generated
	 */
	EAttribute getCreatePortRequest_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.neutron.CreatePortRequest#getBindingVnicType <em>Binding Vnic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Binding Vnic Type</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.CreatePortRequest#getBindingVnicType()
	 * @see #getCreatePortRequest()
	 * @generated
	 */
	EAttribute getCreatePortRequest_BindingVnicType();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.neutron.CreatePortRequest#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.CreatePortRequest#getStatus()
	 * @see #getCreatePortRequest()
	 * @generated
	 */
	EAttribute getCreatePortRequest_Status();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.neutron.CreatePortRequest#getAdmin_state_up <em>Admin state up</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Admin state up</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.CreatePortRequest#getAdmin_state_up()
	 * @see #getCreatePortRequest()
	 * @generated
	 */
	EAttribute getCreatePortRequest_Admin_state_up();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.openstack.neutron.CreatePortRequest#getFixed_ips <em>Fixed ips</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fixed ips</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.CreatePortRequest#getFixed_ips()
	 * @see #getCreatePortRequest()
	 * @generated
	 */
	EReference getCreatePortRequest_Fixed_ips();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.neutron.CreatePortRequest#getMac_address <em>Mac address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mac address</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.CreatePortRequest#getMac_address()
	 * @see #getCreatePortRequest()
	 * @generated
	 */
	EAttribute getCreatePortRequest_Mac_address();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.neutron.CreatePortRequest#getNetwork_id <em>Network id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Network id</em>'.
	 * @see org.openecomp.ncomp.openstack.neutron.CreatePortRequest#getNetwork_id()
	 * @see #getCreatePortRequest()
	 * @generated
	 */
	EAttribute getCreatePortRequest_Network_id();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	NeutronFactory getNeutronFactory();

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
		 * The meta object literal for the '{@link org.openecomp.ncomp.openstack.neutron.impl.NeutronServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.openstack.neutron.impl.NeutronServiceImpl
		 * @see org.openecomp.ncomp.openstack.neutron.impl.NeutronPackageImpl#getNeutronService()
		 * @generated
		 */
		EClass NEUTRON_SERVICE = eINSTANCE.getNeutronService();

		/**
		 * The meta object literal for the '<em><b>Create Network</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NEUTRON_SERVICE___CREATE_NETWORK__CREATENETWORKREQUEST = eINSTANCE.getNeutronService__CreateNetwork__CreateNetworkRequest();

		/**
		 * The meta object literal for the '<em><b>Create Subnet</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NEUTRON_SERVICE___CREATE_SUBNET__CREATESUBNETREQUEST = eINSTANCE.getNeutronService__CreateSubnet__CreateSubnetRequest();

		/**
		 * The meta object literal for the '<em><b>Create Port</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NEUTRON_SERVICE___CREATE_PORT__CREATEPORTREQUEST = eINSTANCE.getNeutronService__CreatePort__CreatePortRequest();

		/**
		 * The meta object literal for the '<em><b>Create Router</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NEUTRON_SERVICE___CREATE_ROUTER__CREATEROUTERREQUEST = eINSTANCE.getNeutronService__CreateRouter__CreateRouterRequest();

		/**
		 * The meta object literal for the '<em><b>Delete Network</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NEUTRON_SERVICE___DELETE_NETWORK__STRING_STRING = eINSTANCE.getNeutronService__DeleteNetwork__String_String();

		/**
		 * The meta object literal for the '<em><b>Delete Subnet</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NEUTRON_SERVICE___DELETE_SUBNET__STRING_STRING = eINSTANCE.getNeutronService__DeleteSubnet__String_String();

		/**
		 * The meta object literal for the '<em><b>Delete Port</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NEUTRON_SERVICE___DELETE_PORT__STRING_STRING = eINSTANCE.getNeutronService__DeletePort__String_String();

		/**
		 * The meta object literal for the '<em><b>Delete Router</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NEUTRON_SERVICE___DELETE_ROUTER__STRING_STRING = eINSTANCE.getNeutronService__DeleteRouter__String_String();

		/**
		 * The meta object literal for the '<em><b>Associate Floating Ip</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NEUTRON_SERVICE___ASSOCIATE_FLOATING_IP__STRING_STRING_STRING = eINSTANCE.getNeutronService__AssociateFloatingIp__String_String_String();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.openstack.neutron.impl.NeutronObjectImpl <em>Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.openstack.neutron.impl.NeutronObjectImpl
		 * @see org.openecomp.ncomp.openstack.neutron.impl.NeutronPackageImpl#getNeutronObject()
		 * @generated
		 */
		EClass NEUTRON_OBJECT = eINSTANCE.getNeutronObject();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.openstack.neutron.impl.NetworkImpl <em>Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.openstack.neutron.impl.NetworkImpl
		 * @see org.openecomp.ncomp.openstack.neutron.impl.NeutronPackageImpl#getNetwork()
		 * @generated
		 */
		EClass NETWORK = eINSTANCE.getNetwork();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK__ID = eINSTANCE.getNetwork_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK__NAME = eINSTANCE.getNetwork_Name();

		/**
		 * The meta object literal for the '<em><b>Admin state up</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK__ADMIN_STATE_UP = eINSTANCE.getNetwork_Admin_state_up();

		/**
		 * The meta object literal for the '<em><b>Provider network type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK__PROVIDER_NETWORK_TYPE = eINSTANCE.getNetwork_Provider_network_type();

		/**
		 * The meta object literal for the '<em><b>Provider physical network</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK__PROVIDER_PHYSICAL_NETWORK = eINSTANCE.getNetwork_Provider_physical_network();

		/**
		 * The meta object literal for the '<em><b>Provider segmentation id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK__PROVIDER_SEGMENTATION_ID = eINSTANCE.getNetwork_Provider_segmentation_id();

		/**
		 * The meta object literal for the '<em><b>Router external</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK__ROUTER_EXTERNAL = eINSTANCE.getNetwork_Router_external();

		/**
		 * The meta object literal for the '<em><b>Shared</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK__SHARED = eINSTANCE.getNetwork_Shared();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK__STATUS = eINSTANCE.getNetwork_Status();

		/**
		 * The meta object literal for the '<em><b>Subnets</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK__SUBNETS = eINSTANCE.getNetwork_Subnets();

		/**
		 * The meta object literal for the '<em><b>Tenant id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK__TENANT_ID = eINSTANCE.getNetwork_Tenant_id();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.openstack.neutron.impl.SubnetImpl <em>Subnet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.openstack.neutron.impl.SubnetImpl
		 * @see org.openecomp.ncomp.openstack.neutron.impl.NeutronPackageImpl#getSubnet()
		 * @generated
		 */
		EClass SUBNET = eINSTANCE.getSubnet();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET__ID = eINSTANCE.getSubnet_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET__NAME = eINSTANCE.getSubnet_Name();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET__STATUS = eINSTANCE.getSubnet_Status();

		/**
		 * The meta object literal for the '<em><b>Admin state up</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET__ADMIN_STATE_UP = eINSTANCE.getSubnet_Admin_state_up();

		/**
		 * The meta object literal for the '<em><b>Cidr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET__CIDR = eINSTANCE.getSubnet_Cidr();

		/**
		 * The meta object literal for the '<em><b>Allocation pools</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBNET__ALLOCATION_POOLS = eINSTANCE.getSubnet_Allocation_pools();

		/**
		 * The meta object literal for the '<em><b>Dns nameservers</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET__DNS_NAMESERVERS = eINSTANCE.getSubnet_Dns_nameservers();

		/**
		 * The meta object literal for the '<em><b>Enable dhcp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET__ENABLE_DHCP = eINSTANCE.getSubnet_Enable_dhcp();

		/**
		 * The meta object literal for the '<em><b>Gateway ip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET__GATEWAY_IP = eINSTANCE.getSubnet_Gateway_ip();

		/**
		 * The meta object literal for the '<em><b>Host routes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET__HOST_ROUTES = eINSTANCE.getSubnet_Host_routes();

		/**
		 * The meta object literal for the '<em><b>Ip version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET__IP_VERSION = eINSTANCE.getSubnet_Ip_version();

		/**
		 * The meta object literal for the '<em><b>Network id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET__NETWORK_ID = eINSTANCE.getSubnet_Network_id();

		/**
		 * The meta object literal for the '<em><b>Tenant id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET__TENANT_ID = eINSTANCE.getSubnet_Tenant_id();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.openstack.neutron.impl.AllocationPoolImpl <em>Allocation Pool</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.openstack.neutron.impl.AllocationPoolImpl
		 * @see org.openecomp.ncomp.openstack.neutron.impl.NeutronPackageImpl#getAllocationPool()
		 * @generated
		 */
		EClass ALLOCATION_POOL = eINSTANCE.getAllocationPool();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALLOCATION_POOL__START = eINSTANCE.getAllocationPool_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALLOCATION_POOL__END = eINSTANCE.getAllocationPool_End();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.openstack.neutron.impl.RouterImpl <em>Router</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.openstack.neutron.impl.RouterImpl
		 * @see org.openecomp.ncomp.openstack.neutron.impl.NeutronPackageImpl#getRouter()
		 * @generated
		 */
		EClass ROUTER = eINSTANCE.getRouter();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTER__ID = eINSTANCE.getRouter_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTER__NAME = eINSTANCE.getRouter_Name();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTER__STATUS = eINSTANCE.getRouter_Status();

		/**
		 * The meta object literal for the '<em><b>Admin state up</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTER__ADMIN_STATE_UP = eINSTANCE.getRouter_Admin_state_up();

		/**
		 * The meta object literal for the '<em><b>External gateway info</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTER__EXTERNAL_GATEWAY_INFO = eINSTANCE.getRouter_External_gateway_info();

		/**
		 * The meta object literal for the '<em><b>Tenant id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTER__TENANT_ID = eINSTANCE.getRouter_Tenant_id();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.openstack.neutron.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.openstack.neutron.impl.PortImpl
		 * @see org.openecomp.ncomp.openstack.neutron.impl.NeutronPackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__ID = eINSTANCE.getPort_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__NAME = eINSTANCE.getPort_Name();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__STATUS = eINSTANCE.getPort_Status();

		/**
		 * The meta object literal for the '<em><b>Admin state up</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__ADMIN_STATE_UP = eINSTANCE.getPort_Admin_state_up();

		/**
		 * The meta object literal for the '<em><b>External gateway info</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__EXTERNAL_GATEWAY_INFO = eINSTANCE.getPort_External_gateway_info();

		/**
		 * The meta object literal for the '<em><b>Tenant id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__TENANT_ID = eINSTANCE.getPort_Tenant_id();

		/**
		 * The meta object literal for the '<em><b>Allowed address pairs</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__ALLOWED_ADDRESS_PAIRS = eINSTANCE.getPort_Allowed_address_pairs();

		/**
		 * The meta object literal for the '<em><b>Binding host id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__BINDING_HOST_ID = eINSTANCE.getPort_Binding_host_id();

		/**
		 * The meta object literal for the '<em><b>Binding profile</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__BINDING_PROFILE = eINSTANCE.getPort_Binding_profile();

		/**
		 * The meta object literal for the '<em><b>Binding vif details</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__BINDING_VIF_DETAILS = eINSTANCE.getPort_Binding_vif_details();

		/**
		 * The meta object literal for the '<em><b>Binding vif type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__BINDING_VIF_TYPE = eINSTANCE.getPort_Binding_vif_type();

		/**
		 * The meta object literal for the '<em><b>Binding vnic type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__BINDING_VNIC_TYPE = eINSTANCE.getPort_Binding_vnic_type();

		/**
		 * The meta object literal for the '<em><b>Device id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__DEVICE_ID = eINSTANCE.getPort_Device_id();

		/**
		 * The meta object literal for the '<em><b>Device owner</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__DEVICE_OWNER = eINSTANCE.getPort_Device_owner();

		/**
		 * The meta object literal for the '<em><b>Extra dhcp opts</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__EXTRA_DHCP_OPTS = eINSTANCE.getPort_Extra_dhcp_opts();

		/**
		 * The meta object literal for the '<em><b>Fixed ips</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__FIXED_IPS = eINSTANCE.getPort_Fixed_ips();

		/**
		 * The meta object literal for the '<em><b>Mac address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__MAC_ADDRESS = eINSTANCE.getPort_Mac_address();

		/**
		 * The meta object literal for the '<em><b>Network id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__NETWORK_ID = eINSTANCE.getPort_Network_id();

		/**
		 * The meta object literal for the '<em><b>Security groups</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__SECURITY_GROUPS = eINSTANCE.getPort_Security_groups();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.openstack.neutron.impl.NeutronSecurityGroupImpl <em>Security Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.openstack.neutron.impl.NeutronSecurityGroupImpl
		 * @see org.openecomp.ncomp.openstack.neutron.impl.NeutronPackageImpl#getNeutronSecurityGroup()
		 * @generated
		 */
		EClass NEUTRON_SECURITY_GROUP = eINSTANCE.getNeutronSecurityGroup();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NEUTRON_SECURITY_GROUP__ID = eINSTANCE.getNeutronSecurityGroup_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NEUTRON_SECURITY_GROUP__NAME = eINSTANCE.getNeutronSecurityGroup_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NEUTRON_SECURITY_GROUP__DESCRIPTION = eINSTANCE.getNeutronSecurityGroup_Description();

		/**
		 * The meta object literal for the '<em><b>Security group rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEUTRON_SECURITY_GROUP__SECURITY_GROUP_RULES = eINSTANCE.getNeutronSecurityGroup_Security_group_rules();

		/**
		 * The meta object literal for the '<em><b>Tenant id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NEUTRON_SECURITY_GROUP__TENANT_ID = eINSTANCE.getNeutronSecurityGroup_Tenant_id();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.openstack.neutron.impl.NeutronSecurityRuleImpl <em>Security Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.openstack.neutron.impl.NeutronSecurityRuleImpl
		 * @see org.openecomp.ncomp.openstack.neutron.impl.NeutronPackageImpl#getNeutronSecurityRule()
		 * @generated
		 */
		EClass NEUTRON_SECURITY_RULE = eINSTANCE.getNeutronSecurityRule();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NEUTRON_SECURITY_RULE__ID = eINSTANCE.getNeutronSecurityRule_Id();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NEUTRON_SECURITY_RULE__DIRECTION = eINSTANCE.getNeutronSecurityRule_Direction();

		/**
		 * The meta object literal for the '<em><b>Ethertype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NEUTRON_SECURITY_RULE__ETHERTYPE = eINSTANCE.getNeutronSecurityRule_Ethertype();

		/**
		 * The meta object literal for the '<em><b>Port range min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NEUTRON_SECURITY_RULE__PORT_RANGE_MIN = eINSTANCE.getNeutronSecurityRule_Port_range_min();

		/**
		 * The meta object literal for the '<em><b>Port range max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NEUTRON_SECURITY_RULE__PORT_RANGE_MAX = eINSTANCE.getNeutronSecurityRule_Port_range_max();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NEUTRON_SECURITY_RULE__PROTOCOL = eINSTANCE.getNeutronSecurityRule_Protocol();

		/**
		 * The meta object literal for the '<em><b>Remote group id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NEUTRON_SECURITY_RULE__REMOTE_GROUP_ID = eINSTANCE.getNeutronSecurityRule_Remote_group_id();

		/**
		 * The meta object literal for the '<em><b>Remote ip prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NEUTRON_SECURITY_RULE__REMOTE_IP_PREFIX = eINSTANCE.getNeutronSecurityRule_Remote_ip_prefix();

		/**
		 * The meta object literal for the '<em><b>Security group id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NEUTRON_SECURITY_RULE__SECURITY_GROUP_ID = eINSTANCE.getNeutronSecurityRule_Security_group_id();

		/**
		 * The meta object literal for the '<em><b>Tenant id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NEUTRON_SECURITY_RULE__TENANT_ID = eINSTANCE.getNeutronSecurityRule_Tenant_id();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.openstack.neutron.impl.NeutronFloatingIpImpl <em>Floating Ip</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.openstack.neutron.impl.NeutronFloatingIpImpl
		 * @see org.openecomp.ncomp.openstack.neutron.impl.NeutronPackageImpl#getNeutronFloatingIp()
		 * @generated
		 */
		EClass NEUTRON_FLOATING_IP = eINSTANCE.getNeutronFloatingIp();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NEUTRON_FLOATING_IP__ID = eINSTANCE.getNeutronFloatingIp_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NEUTRON_FLOATING_IP__NAME = eINSTANCE.getNeutronFloatingIp_Name();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NEUTRON_FLOATING_IP__STATUS = eINSTANCE.getNeutronFloatingIp_Status();

		/**
		 * The meta object literal for the '<em><b>Floating network id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NEUTRON_FLOATING_IP__FLOATING_NETWORK_ID = eINSTANCE.getNeutronFloatingIp_Floating_network_id();

		/**
		 * The meta object literal for the '<em><b>Router id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NEUTRON_FLOATING_IP__ROUTER_ID = eINSTANCE.getNeutronFloatingIp_Router_id();

		/**
		 * The meta object literal for the '<em><b>Fixed ip address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NEUTRON_FLOATING_IP__FIXED_IP_ADDRESS = eINSTANCE.getNeutronFloatingIp_Fixed_ip_address();

		/**
		 * The meta object literal for the '<em><b>Floating ip address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NEUTRON_FLOATING_IP__FLOATING_IP_ADDRESS = eINSTANCE.getNeutronFloatingIp_Floating_ip_address();

		/**
		 * The meta object literal for the '<em><b>Tenant id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NEUTRON_FLOATING_IP__TENANT_ID = eINSTANCE.getNeutronFloatingIp_Tenant_id();

		/**
		 * The meta object literal for the '<em><b>Port id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NEUTRON_FLOATING_IP__PORT_ID = eINSTANCE.getNeutronFloatingIp_Port_id();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.openstack.neutron.impl.BindingProfileImpl <em>Binding Profile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.openstack.neutron.impl.BindingProfileImpl
		 * @see org.openecomp.ncomp.openstack.neutron.impl.NeutronPackageImpl#getBindingProfile()
		 * @generated
		 */
		EClass BINDING_PROFILE = eINSTANCE.getBindingProfile();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.openstack.neutron.impl.BindingVifDetailImpl <em>Binding Vif Detail</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.openstack.neutron.impl.BindingVifDetailImpl
		 * @see org.openecomp.ncomp.openstack.neutron.impl.NeutronPackageImpl#getBindingVifDetail()
		 * @generated
		 */
		EClass BINDING_VIF_DETAIL = eINSTANCE.getBindingVifDetail();

		/**
		 * The meta object literal for the '<em><b>Ovs hybrid plug</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINDING_VIF_DETAIL__OVS_HYBRID_PLUG = eINSTANCE.getBindingVifDetail_Ovs_hybrid_plug();

		/**
		 * The meta object literal for the '<em><b>Port filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINDING_VIF_DETAIL__PORT_FILTER = eINSTANCE.getBindingVifDetail_Port_filter();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.openstack.neutron.impl.FixedIpImpl <em>Fixed Ip</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.openstack.neutron.impl.FixedIpImpl
		 * @see org.openecomp.ncomp.openstack.neutron.impl.NeutronPackageImpl#getFixedIp()
		 * @generated
		 */
		EClass FIXED_IP = eINSTANCE.getFixedIp();

		/**
		 * The meta object literal for the '<em><b>Ip address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED_IP__IP_ADDRESS = eINSTANCE.getFixedIp_Ip_address();

		/**
		 * The meta object literal for the '<em><b>Subnet id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED_IP__SUBNET_ID = eINSTANCE.getFixedIp_Subnet_id();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.openstack.neutron.impl.ExternalGatewayImpl <em>External Gateway</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.openstack.neutron.impl.ExternalGatewayImpl
		 * @see org.openecomp.ncomp.openstack.neutron.impl.NeutronPackageImpl#getExternalGateway()
		 * @generated
		 */
		EClass EXTERNAL_GATEWAY = eINSTANCE.getExternalGateway();

		/**
		 * The meta object literal for the '<em><b>Enable snat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_GATEWAY__ENABLE_SNAT = eINSTANCE.getExternalGateway_Enable_snat();

		/**
		 * The meta object literal for the '<em><b>Network id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_GATEWAY__NETWORK_ID = eINSTANCE.getExternalGateway_Network_id();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.openstack.neutron.impl.NeutronRequestImpl <em>Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.openstack.neutron.impl.NeutronRequestImpl
		 * @see org.openecomp.ncomp.openstack.neutron.impl.NeutronPackageImpl#getNeutronRequest()
		 * @generated
		 */
		EClass NEUTRON_REQUEST = eINSTANCE.getNeutronRequest();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.openstack.neutron.impl.CreateNetworkRequestImpl <em>Create Network Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.openstack.neutron.impl.CreateNetworkRequestImpl
		 * @see org.openecomp.ncomp.openstack.neutron.impl.NeutronPackageImpl#getCreateNetworkRequest()
		 * @generated
		 */
		EClass CREATE_NETWORK_REQUEST = eINSTANCE.getCreateNetworkRequest();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_NETWORK_REQUEST__NAME = eINSTANCE.getCreateNetworkRequest_Name();

		/**
		 * The meta object literal for the '<em><b>Provider Network Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_NETWORK_REQUEST__PROVIDER_NETWORK_TYPE = eINSTANCE.getCreateNetworkRequest_ProviderNetworkType();

		/**
		 * The meta object literal for the '<em><b>Provider Physical Network</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_NETWORK_REQUEST__PROVIDER_PHYSICAL_NETWORK = eINSTANCE.getCreateNetworkRequest_ProviderPhysicalNetwork();

		/**
		 * The meta object literal for the '<em><b>Provider Segmentation Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_NETWORK_REQUEST__PROVIDER_SEGMENTATION_ID = eINSTANCE.getCreateNetworkRequest_ProviderSegmentationId();

		/**
		 * The meta object literal for the '<em><b>Admin state up</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_NETWORK_REQUEST__ADMIN_STATE_UP = eINSTANCE.getCreateNetworkRequest_Admin_state_up();

		/**
		 * The meta object literal for the '<em><b>Shared</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_NETWORK_REQUEST__SHARED = eINSTANCE.getCreateNetworkRequest_Shared();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.openstack.neutron.impl.CreateSubnetRequestImpl <em>Create Subnet Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.openstack.neutron.impl.CreateSubnetRequestImpl
		 * @see org.openecomp.ncomp.openstack.neutron.impl.NeutronPackageImpl#getCreateSubnetRequest()
		 * @generated
		 */
		EClass CREATE_SUBNET_REQUEST = eINSTANCE.getCreateSubnetRequest();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_SUBNET_REQUEST__NAME = eINSTANCE.getCreateSubnetRequest_Name();

		/**
		 * The meta object literal for the '<em><b>Network id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_SUBNET_REQUEST__NETWORK_ID = eINSTANCE.getCreateSubnetRequest_Network_id();

		/**
		 * The meta object literal for the '<em><b>Ip version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_SUBNET_REQUEST__IP_VERSION = eINSTANCE.getCreateSubnetRequest_Ip_version();

		/**
		 * The meta object literal for the '<em><b>Cidr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_SUBNET_REQUEST__CIDR = eINSTANCE.getCreateSubnetRequest_Cidr();

		/**
		 * The meta object literal for the '<em><b>Allocation pools</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATE_SUBNET_REQUEST__ALLOCATION_POOLS = eINSTANCE.getCreateSubnetRequest_Allocation_pools();

		/**
		 * The meta object literal for the '<em><b>Dns nameservers</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_SUBNET_REQUEST__DNS_NAMESERVERS = eINSTANCE.getCreateSubnetRequest_Dns_nameservers();

		/**
		 * The meta object literal for the '<em><b>Enable dhcp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_SUBNET_REQUEST__ENABLE_DHCP = eINSTANCE.getCreateSubnetRequest_Enable_dhcp();

		/**
		 * The meta object literal for the '<em><b>Gateway ip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_SUBNET_REQUEST__GATEWAY_IP = eINSTANCE.getCreateSubnetRequest_Gateway_ip();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.openstack.neutron.impl.CreateRouterRequestImpl <em>Create Router Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.openstack.neutron.impl.CreateRouterRequestImpl
		 * @see org.openecomp.ncomp.openstack.neutron.impl.NeutronPackageImpl#getCreateRouterRequest()
		 * @generated
		 */
		EClass CREATE_ROUTER_REQUEST = eINSTANCE.getCreateRouterRequest();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_ROUTER_REQUEST__NAME = eINSTANCE.getCreateRouterRequest_Name();

		/**
		 * The meta object literal for the '<em><b>Admin state up</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_ROUTER_REQUEST__ADMIN_STATE_UP = eINSTANCE.getCreateRouterRequest_Admin_state_up();

		/**
		 * The meta object literal for the '<em><b>Shared</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_ROUTER_REQUEST__SHARED = eINSTANCE.getCreateRouterRequest_Shared();

		/**
		 * The meta object literal for the '<em><b>External Network</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_ROUTER_REQUEST__EXTERNAL_NETWORK = eINSTANCE.getCreateRouterRequest_ExternalNetwork();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_ROUTER_REQUEST__PORTS = eINSTANCE.getCreateRouterRequest_Ports();

		/**
		 * The meta object literal for the '<em><b>Subnets</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_ROUTER_REQUEST__SUBNETS = eINSTANCE.getCreateRouterRequest_Subnets();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.openstack.neutron.impl.CreatePortRequestImpl <em>Create Port Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.openstack.neutron.impl.CreatePortRequestImpl
		 * @see org.openecomp.ncomp.openstack.neutron.impl.NeutronPackageImpl#getCreatePortRequest()
		 * @generated
		 */
		EClass CREATE_PORT_REQUEST = eINSTANCE.getCreatePortRequest();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_PORT_REQUEST__NAME = eINSTANCE.getCreatePortRequest_Name();

		/**
		 * The meta object literal for the '<em><b>Binding Vnic Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_PORT_REQUEST__BINDING_VNIC_TYPE = eINSTANCE.getCreatePortRequest_BindingVnicType();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_PORT_REQUEST__STATUS = eINSTANCE.getCreatePortRequest_Status();

		/**
		 * The meta object literal for the '<em><b>Admin state up</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_PORT_REQUEST__ADMIN_STATE_UP = eINSTANCE.getCreatePortRequest_Admin_state_up();

		/**
		 * The meta object literal for the '<em><b>Fixed ips</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATE_PORT_REQUEST__FIXED_IPS = eINSTANCE.getCreatePortRequest_Fixed_ips();

		/**
		 * The meta object literal for the '<em><b>Mac address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_PORT_REQUEST__MAC_ADDRESS = eINSTANCE.getCreatePortRequest_Mac_address();

		/**
		 * The meta object literal for the '<em><b>Network id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_PORT_REQUEST__NETWORK_ID = eINSTANCE.getCreatePortRequest_Network_id();

	}

} //NeutronPackage
