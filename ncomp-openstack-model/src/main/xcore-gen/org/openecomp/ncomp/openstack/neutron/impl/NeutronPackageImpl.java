
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
package org.openecomp.ncomp.openstack.neutron.impl;

import org.openecomp.ncomp.openstack.core.CorePackage;

import org.openecomp.ncomp.openstack.neutron.AllocationPool;
import org.openecomp.ncomp.openstack.neutron.BindingProfile;
import org.openecomp.ncomp.openstack.neutron.BindingVifDetail;
import org.openecomp.ncomp.openstack.neutron.CreateNetworkRequest;
import org.openecomp.ncomp.openstack.neutron.CreatePortRequest;
import org.openecomp.ncomp.openstack.neutron.CreateRouterRequest;
import org.openecomp.ncomp.openstack.neutron.CreateSubnetRequest;
import org.openecomp.ncomp.openstack.neutron.ExternalGateway;
import org.openecomp.ncomp.openstack.neutron.FixedIp;
import org.openecomp.ncomp.openstack.neutron.Network;
import org.openecomp.ncomp.openstack.neutron.NeutronFactory;
import org.openecomp.ncomp.openstack.neutron.NeutronFloatingIp;
import org.openecomp.ncomp.openstack.neutron.NeutronObject;
import org.openecomp.ncomp.openstack.neutron.NeutronPackage;
import org.openecomp.ncomp.openstack.neutron.NeutronRequest;
import org.openecomp.ncomp.openstack.neutron.NeutronSecurityGroup;
import org.openecomp.ncomp.openstack.neutron.NeutronSecurityRule;
import org.openecomp.ncomp.openstack.neutron.NeutronService;
import org.openecomp.ncomp.openstack.neutron.Port;
import org.openecomp.ncomp.openstack.neutron.Router;
import org.openecomp.ncomp.openstack.neutron.Subnet;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NeutronPackageImpl extends EPackageImpl implements NeutronPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass neutronServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass neutronObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subnetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allocationPoolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass routerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass neutronSecurityGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass neutronSecurityRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass neutronFloatingIpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bindingProfileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bindingVifDetailEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fixedIpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalGatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass neutronRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createNetworkRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createSubnetRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createRouterRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createPortRequestEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private NeutronPackageImpl() {
		super(eNS_URI, NeutronFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link NeutronPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static NeutronPackage init() {
		if (isInited) return (NeutronPackage)EPackage.Registry.INSTANCE.getEPackage(NeutronPackage.eNS_URI);

		// Obtain or create and register package
		NeutronPackageImpl theNeutronPackage = (NeutronPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof NeutronPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new NeutronPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theNeutronPackage.createPackageContents();

		// Initialize created meta-data
		theNeutronPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theNeutronPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(NeutronPackage.eNS_URI, theNeutronPackage);
		return theNeutronPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNeutronService() {
		return neutronServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNeutronService__CreateNetwork__CreateNetworkRequest() {
		return neutronServiceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNeutronService__CreateSubnet__CreateSubnetRequest() {
		return neutronServiceEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNeutronService__CreatePort__CreatePortRequest() {
		return neutronServiceEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNeutronService__CreateRouter__CreateRouterRequest() {
		return neutronServiceEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNeutronService__DeleteNetwork__String_String() {
		return neutronServiceEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNeutronService__DeleteSubnet__String_String() {
		return neutronServiceEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNeutronService__DeletePort__String_String() {
		return neutronServiceEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNeutronService__DeleteRouter__String_String() {
		return neutronServiceEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNeutronService__AssociateFloatingIp__String_String_String() {
		return neutronServiceEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNeutronObject() {
		return neutronObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetwork() {
		return networkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetwork_Id() {
		return (EAttribute)networkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetwork_Name() {
		return (EAttribute)networkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetwork_Admin_state_up() {
		return (EAttribute)networkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetwork_Provider_network_type() {
		return (EAttribute)networkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetwork_Provider_physical_network() {
		return (EAttribute)networkEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetwork_Provider_segmentation_id() {
		return (EAttribute)networkEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetwork_Router_external() {
		return (EAttribute)networkEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetwork_Shared() {
		return (EAttribute)networkEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetwork_Status() {
		return (EAttribute)networkEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetwork_Subnets() {
		return (EAttribute)networkEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetwork_Tenant_id() {
		return (EAttribute)networkEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubnet() {
		return subnetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubnet_Id() {
		return (EAttribute)subnetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubnet_Name() {
		return (EAttribute)subnetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubnet_Status() {
		return (EAttribute)subnetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubnet_Admin_state_up() {
		return (EAttribute)subnetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubnet_Cidr() {
		return (EAttribute)subnetEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubnet_Allocation_pools() {
		return (EReference)subnetEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubnet_Dns_nameservers() {
		return (EAttribute)subnetEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubnet_Enable_dhcp() {
		return (EAttribute)subnetEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubnet_Gateway_ip() {
		return (EAttribute)subnetEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubnet_Host_routes() {
		return (EAttribute)subnetEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubnet_Ip_version() {
		return (EAttribute)subnetEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubnet_Network_id() {
		return (EAttribute)subnetEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubnet_Tenant_id() {
		return (EAttribute)subnetEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllocationPool() {
		return allocationPoolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAllocationPool_Start() {
		return (EAttribute)allocationPoolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAllocationPool_End() {
		return (EAttribute)allocationPoolEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRouter() {
		return routerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRouter_Id() {
		return (EAttribute)routerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRouter_Name() {
		return (EAttribute)routerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRouter_Status() {
		return (EAttribute)routerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRouter_Admin_state_up() {
		return (EAttribute)routerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRouter_External_gateway_info() {
		return (EReference)routerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRouter_Tenant_id() {
		return (EAttribute)routerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPort() {
		return portEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPort_Id() {
		return (EAttribute)portEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPort_Name() {
		return (EAttribute)portEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPort_Status() {
		return (EAttribute)portEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPort_Admin_state_up() {
		return (EAttribute)portEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_External_gateway_info() {
		return (EReference)portEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPort_Tenant_id() {
		return (EAttribute)portEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPort_Allowed_address_pairs() {
		return (EAttribute)portEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPort_Binding_host_id() {
		return (EAttribute)portEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_Binding_profile() {
		return (EReference)portEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_Binding_vif_details() {
		return (EReference)portEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPort_Binding_vif_type() {
		return (EAttribute)portEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPort_Binding_vnic_type() {
		return (EAttribute)portEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPort_Device_id() {
		return (EAttribute)portEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPort_Device_owner() {
		return (EAttribute)portEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPort_Extra_dhcp_opts() {
		return (EAttribute)portEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_Fixed_ips() {
		return (EReference)portEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPort_Mac_address() {
		return (EAttribute)portEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPort_Network_id() {
		return (EAttribute)portEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPort_Security_groups() {
		return (EAttribute)portEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNeutronSecurityGroup() {
		return neutronSecurityGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNeutronSecurityGroup_Id() {
		return (EAttribute)neutronSecurityGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNeutronSecurityGroup_Name() {
		return (EAttribute)neutronSecurityGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNeutronSecurityGroup_Description() {
		return (EAttribute)neutronSecurityGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNeutronSecurityGroup_Security_group_rules() {
		return (EReference)neutronSecurityGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNeutronSecurityGroup_Tenant_id() {
		return (EAttribute)neutronSecurityGroupEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNeutronSecurityRule() {
		return neutronSecurityRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNeutronSecurityRule_Id() {
		return (EAttribute)neutronSecurityRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNeutronSecurityRule_Direction() {
		return (EAttribute)neutronSecurityRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNeutronSecurityRule_Ethertype() {
		return (EAttribute)neutronSecurityRuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNeutronSecurityRule_Port_range_min() {
		return (EAttribute)neutronSecurityRuleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNeutronSecurityRule_Port_range_max() {
		return (EAttribute)neutronSecurityRuleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNeutronSecurityRule_Protocol() {
		return (EAttribute)neutronSecurityRuleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNeutronSecurityRule_Remote_group_id() {
		return (EAttribute)neutronSecurityRuleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNeutronSecurityRule_Remote_ip_prefix() {
		return (EAttribute)neutronSecurityRuleEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNeutronSecurityRule_Security_group_id() {
		return (EAttribute)neutronSecurityRuleEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNeutronSecurityRule_Tenant_id() {
		return (EAttribute)neutronSecurityRuleEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNeutronFloatingIp() {
		return neutronFloatingIpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNeutronFloatingIp_Id() {
		return (EAttribute)neutronFloatingIpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNeutronFloatingIp_Name() {
		return (EAttribute)neutronFloatingIpEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNeutronFloatingIp_Status() {
		return (EAttribute)neutronFloatingIpEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNeutronFloatingIp_Floating_network_id() {
		return (EAttribute)neutronFloatingIpEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNeutronFloatingIp_Router_id() {
		return (EAttribute)neutronFloatingIpEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNeutronFloatingIp_Fixed_ip_address() {
		return (EAttribute)neutronFloatingIpEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNeutronFloatingIp_Floating_ip_address() {
		return (EAttribute)neutronFloatingIpEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNeutronFloatingIp_Tenant_id() {
		return (EAttribute)neutronFloatingIpEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNeutronFloatingIp_Port_id() {
		return (EAttribute)neutronFloatingIpEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBindingProfile() {
		return bindingProfileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBindingVifDetail() {
		return bindingVifDetailEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindingVifDetail_Ovs_hybrid_plug() {
		return (EAttribute)bindingVifDetailEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindingVifDetail_Port_filter() {
		return (EAttribute)bindingVifDetailEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFixedIp() {
		return fixedIpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFixedIp_Ip_address() {
		return (EAttribute)fixedIpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFixedIp_Subnet_id() {
		return (EAttribute)fixedIpEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalGateway() {
		return externalGatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternalGateway_Enable_snat() {
		return (EAttribute)externalGatewayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternalGateway_Network_id() {
		return (EAttribute)externalGatewayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNeutronRequest() {
		return neutronRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateNetworkRequest() {
		return createNetworkRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreateNetworkRequest_Name() {
		return (EAttribute)createNetworkRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreateNetworkRequest_ProviderNetworkType() {
		return (EAttribute)createNetworkRequestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreateNetworkRequest_ProviderPhysicalNetwork() {
		return (EAttribute)createNetworkRequestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreateNetworkRequest_ProviderSegmentationId() {
		return (EAttribute)createNetworkRequestEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreateNetworkRequest_Admin_state_up() {
		return (EAttribute)createNetworkRequestEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreateNetworkRequest_Shared() {
		return (EAttribute)createNetworkRequestEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateSubnetRequest() {
		return createSubnetRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreateSubnetRequest_Name() {
		return (EAttribute)createSubnetRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreateSubnetRequest_Network_id() {
		return (EAttribute)createSubnetRequestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreateSubnetRequest_Ip_version() {
		return (EAttribute)createSubnetRequestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreateSubnetRequest_Cidr() {
		return (EAttribute)createSubnetRequestEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCreateSubnetRequest_Allocation_pools() {
		return (EReference)createSubnetRequestEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreateSubnetRequest_Dns_nameservers() {
		return (EAttribute)createSubnetRequestEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreateSubnetRequest_Enable_dhcp() {
		return (EAttribute)createSubnetRequestEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreateSubnetRequest_Gateway_ip() {
		return (EAttribute)createSubnetRequestEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateRouterRequest() {
		return createRouterRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreateRouterRequest_Name() {
		return (EAttribute)createRouterRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreateRouterRequest_Admin_state_up() {
		return (EAttribute)createRouterRequestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreateRouterRequest_Shared() {
		return (EAttribute)createRouterRequestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreateRouterRequest_ExternalNetwork() {
		return (EAttribute)createRouterRequestEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreateRouterRequest_Ports() {
		return (EAttribute)createRouterRequestEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreateRouterRequest_Subnets() {
		return (EAttribute)createRouterRequestEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreatePortRequest() {
		return createPortRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreatePortRequest_Name() {
		return (EAttribute)createPortRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreatePortRequest_BindingVnicType() {
		return (EAttribute)createPortRequestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreatePortRequest_Status() {
		return (EAttribute)createPortRequestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreatePortRequest_Admin_state_up() {
		return (EAttribute)createPortRequestEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCreatePortRequest_Fixed_ips() {
		return (EReference)createPortRequestEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreatePortRequest_Mac_address() {
		return (EAttribute)createPortRequestEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreatePortRequest_Network_id() {
		return (EAttribute)createPortRequestEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NeutronFactory getNeutronFactory() {
		return (NeutronFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		neutronServiceEClass = createEClass(NEUTRON_SERVICE);
		createEOperation(neutronServiceEClass, NEUTRON_SERVICE___CREATE_NETWORK__CREATENETWORKREQUEST);
		createEOperation(neutronServiceEClass, NEUTRON_SERVICE___CREATE_SUBNET__CREATESUBNETREQUEST);
		createEOperation(neutronServiceEClass, NEUTRON_SERVICE___CREATE_PORT__CREATEPORTREQUEST);
		createEOperation(neutronServiceEClass, NEUTRON_SERVICE___CREATE_ROUTER__CREATEROUTERREQUEST);
		createEOperation(neutronServiceEClass, NEUTRON_SERVICE___DELETE_NETWORK__STRING_STRING);
		createEOperation(neutronServiceEClass, NEUTRON_SERVICE___DELETE_SUBNET__STRING_STRING);
		createEOperation(neutronServiceEClass, NEUTRON_SERVICE___DELETE_PORT__STRING_STRING);
		createEOperation(neutronServiceEClass, NEUTRON_SERVICE___DELETE_ROUTER__STRING_STRING);
		createEOperation(neutronServiceEClass, NEUTRON_SERVICE___ASSOCIATE_FLOATING_IP__STRING_STRING_STRING);

		neutronObjectEClass = createEClass(NEUTRON_OBJECT);

		networkEClass = createEClass(NETWORK);
		createEAttribute(networkEClass, NETWORK__ID);
		createEAttribute(networkEClass, NETWORK__NAME);
		createEAttribute(networkEClass, NETWORK__ADMIN_STATE_UP);
		createEAttribute(networkEClass, NETWORK__PROVIDER_NETWORK_TYPE);
		createEAttribute(networkEClass, NETWORK__PROVIDER_PHYSICAL_NETWORK);
		createEAttribute(networkEClass, NETWORK__PROVIDER_SEGMENTATION_ID);
		createEAttribute(networkEClass, NETWORK__ROUTER_EXTERNAL);
		createEAttribute(networkEClass, NETWORK__SHARED);
		createEAttribute(networkEClass, NETWORK__STATUS);
		createEAttribute(networkEClass, NETWORK__SUBNETS);
		createEAttribute(networkEClass, NETWORK__TENANT_ID);

		subnetEClass = createEClass(SUBNET);
		createEAttribute(subnetEClass, SUBNET__ID);
		createEAttribute(subnetEClass, SUBNET__NAME);
		createEAttribute(subnetEClass, SUBNET__STATUS);
		createEAttribute(subnetEClass, SUBNET__ADMIN_STATE_UP);
		createEAttribute(subnetEClass, SUBNET__CIDR);
		createEReference(subnetEClass, SUBNET__ALLOCATION_POOLS);
		createEAttribute(subnetEClass, SUBNET__DNS_NAMESERVERS);
		createEAttribute(subnetEClass, SUBNET__ENABLE_DHCP);
		createEAttribute(subnetEClass, SUBNET__GATEWAY_IP);
		createEAttribute(subnetEClass, SUBNET__HOST_ROUTES);
		createEAttribute(subnetEClass, SUBNET__IP_VERSION);
		createEAttribute(subnetEClass, SUBNET__NETWORK_ID);
		createEAttribute(subnetEClass, SUBNET__TENANT_ID);

		allocationPoolEClass = createEClass(ALLOCATION_POOL);
		createEAttribute(allocationPoolEClass, ALLOCATION_POOL__START);
		createEAttribute(allocationPoolEClass, ALLOCATION_POOL__END);

		routerEClass = createEClass(ROUTER);
		createEAttribute(routerEClass, ROUTER__ID);
		createEAttribute(routerEClass, ROUTER__NAME);
		createEAttribute(routerEClass, ROUTER__STATUS);
		createEAttribute(routerEClass, ROUTER__ADMIN_STATE_UP);
		createEReference(routerEClass, ROUTER__EXTERNAL_GATEWAY_INFO);
		createEAttribute(routerEClass, ROUTER__TENANT_ID);

		portEClass = createEClass(PORT);
		createEAttribute(portEClass, PORT__ID);
		createEAttribute(portEClass, PORT__NAME);
		createEAttribute(portEClass, PORT__STATUS);
		createEAttribute(portEClass, PORT__ADMIN_STATE_UP);
		createEReference(portEClass, PORT__EXTERNAL_GATEWAY_INFO);
		createEAttribute(portEClass, PORT__TENANT_ID);
		createEAttribute(portEClass, PORT__ALLOWED_ADDRESS_PAIRS);
		createEAttribute(portEClass, PORT__BINDING_HOST_ID);
		createEReference(portEClass, PORT__BINDING_PROFILE);
		createEReference(portEClass, PORT__BINDING_VIF_DETAILS);
		createEAttribute(portEClass, PORT__BINDING_VIF_TYPE);
		createEAttribute(portEClass, PORT__BINDING_VNIC_TYPE);
		createEAttribute(portEClass, PORT__DEVICE_ID);
		createEAttribute(portEClass, PORT__DEVICE_OWNER);
		createEAttribute(portEClass, PORT__EXTRA_DHCP_OPTS);
		createEReference(portEClass, PORT__FIXED_IPS);
		createEAttribute(portEClass, PORT__MAC_ADDRESS);
		createEAttribute(portEClass, PORT__NETWORK_ID);
		createEAttribute(portEClass, PORT__SECURITY_GROUPS);

		neutronSecurityGroupEClass = createEClass(NEUTRON_SECURITY_GROUP);
		createEAttribute(neutronSecurityGroupEClass, NEUTRON_SECURITY_GROUP__ID);
		createEAttribute(neutronSecurityGroupEClass, NEUTRON_SECURITY_GROUP__NAME);
		createEAttribute(neutronSecurityGroupEClass, NEUTRON_SECURITY_GROUP__DESCRIPTION);
		createEReference(neutronSecurityGroupEClass, NEUTRON_SECURITY_GROUP__SECURITY_GROUP_RULES);
		createEAttribute(neutronSecurityGroupEClass, NEUTRON_SECURITY_GROUP__TENANT_ID);

		neutronSecurityRuleEClass = createEClass(NEUTRON_SECURITY_RULE);
		createEAttribute(neutronSecurityRuleEClass, NEUTRON_SECURITY_RULE__ID);
		createEAttribute(neutronSecurityRuleEClass, NEUTRON_SECURITY_RULE__DIRECTION);
		createEAttribute(neutronSecurityRuleEClass, NEUTRON_SECURITY_RULE__ETHERTYPE);
		createEAttribute(neutronSecurityRuleEClass, NEUTRON_SECURITY_RULE__PORT_RANGE_MIN);
		createEAttribute(neutronSecurityRuleEClass, NEUTRON_SECURITY_RULE__PORT_RANGE_MAX);
		createEAttribute(neutronSecurityRuleEClass, NEUTRON_SECURITY_RULE__PROTOCOL);
		createEAttribute(neutronSecurityRuleEClass, NEUTRON_SECURITY_RULE__REMOTE_GROUP_ID);
		createEAttribute(neutronSecurityRuleEClass, NEUTRON_SECURITY_RULE__REMOTE_IP_PREFIX);
		createEAttribute(neutronSecurityRuleEClass, NEUTRON_SECURITY_RULE__SECURITY_GROUP_ID);
		createEAttribute(neutronSecurityRuleEClass, NEUTRON_SECURITY_RULE__TENANT_ID);

		neutronFloatingIpEClass = createEClass(NEUTRON_FLOATING_IP);
		createEAttribute(neutronFloatingIpEClass, NEUTRON_FLOATING_IP__ID);
		createEAttribute(neutronFloatingIpEClass, NEUTRON_FLOATING_IP__NAME);
		createEAttribute(neutronFloatingIpEClass, NEUTRON_FLOATING_IP__STATUS);
		createEAttribute(neutronFloatingIpEClass, NEUTRON_FLOATING_IP__FLOATING_NETWORK_ID);
		createEAttribute(neutronFloatingIpEClass, NEUTRON_FLOATING_IP__ROUTER_ID);
		createEAttribute(neutronFloatingIpEClass, NEUTRON_FLOATING_IP__FIXED_IP_ADDRESS);
		createEAttribute(neutronFloatingIpEClass, NEUTRON_FLOATING_IP__FLOATING_IP_ADDRESS);
		createEAttribute(neutronFloatingIpEClass, NEUTRON_FLOATING_IP__TENANT_ID);
		createEAttribute(neutronFloatingIpEClass, NEUTRON_FLOATING_IP__PORT_ID);

		bindingProfileEClass = createEClass(BINDING_PROFILE);

		bindingVifDetailEClass = createEClass(BINDING_VIF_DETAIL);
		createEAttribute(bindingVifDetailEClass, BINDING_VIF_DETAIL__OVS_HYBRID_PLUG);
		createEAttribute(bindingVifDetailEClass, BINDING_VIF_DETAIL__PORT_FILTER);

		fixedIpEClass = createEClass(FIXED_IP);
		createEAttribute(fixedIpEClass, FIXED_IP__IP_ADDRESS);
		createEAttribute(fixedIpEClass, FIXED_IP__SUBNET_ID);

		externalGatewayEClass = createEClass(EXTERNAL_GATEWAY);
		createEAttribute(externalGatewayEClass, EXTERNAL_GATEWAY__ENABLE_SNAT);
		createEAttribute(externalGatewayEClass, EXTERNAL_GATEWAY__NETWORK_ID);

		neutronRequestEClass = createEClass(NEUTRON_REQUEST);

		createNetworkRequestEClass = createEClass(CREATE_NETWORK_REQUEST);
		createEAttribute(createNetworkRequestEClass, CREATE_NETWORK_REQUEST__NAME);
		createEAttribute(createNetworkRequestEClass, CREATE_NETWORK_REQUEST__PROVIDER_NETWORK_TYPE);
		createEAttribute(createNetworkRequestEClass, CREATE_NETWORK_REQUEST__PROVIDER_PHYSICAL_NETWORK);
		createEAttribute(createNetworkRequestEClass, CREATE_NETWORK_REQUEST__PROVIDER_SEGMENTATION_ID);
		createEAttribute(createNetworkRequestEClass, CREATE_NETWORK_REQUEST__ADMIN_STATE_UP);
		createEAttribute(createNetworkRequestEClass, CREATE_NETWORK_REQUEST__SHARED);

		createSubnetRequestEClass = createEClass(CREATE_SUBNET_REQUEST);
		createEAttribute(createSubnetRequestEClass, CREATE_SUBNET_REQUEST__NAME);
		createEAttribute(createSubnetRequestEClass, CREATE_SUBNET_REQUEST__NETWORK_ID);
		createEAttribute(createSubnetRequestEClass, CREATE_SUBNET_REQUEST__IP_VERSION);
		createEAttribute(createSubnetRequestEClass, CREATE_SUBNET_REQUEST__CIDR);
		createEReference(createSubnetRequestEClass, CREATE_SUBNET_REQUEST__ALLOCATION_POOLS);
		createEAttribute(createSubnetRequestEClass, CREATE_SUBNET_REQUEST__DNS_NAMESERVERS);
		createEAttribute(createSubnetRequestEClass, CREATE_SUBNET_REQUEST__ENABLE_DHCP);
		createEAttribute(createSubnetRequestEClass, CREATE_SUBNET_REQUEST__GATEWAY_IP);

		createRouterRequestEClass = createEClass(CREATE_ROUTER_REQUEST);
		createEAttribute(createRouterRequestEClass, CREATE_ROUTER_REQUEST__NAME);
		createEAttribute(createRouterRequestEClass, CREATE_ROUTER_REQUEST__ADMIN_STATE_UP);
		createEAttribute(createRouterRequestEClass, CREATE_ROUTER_REQUEST__SHARED);
		createEAttribute(createRouterRequestEClass, CREATE_ROUTER_REQUEST__EXTERNAL_NETWORK);
		createEAttribute(createRouterRequestEClass, CREATE_ROUTER_REQUEST__PORTS);
		createEAttribute(createRouterRequestEClass, CREATE_ROUTER_REQUEST__SUBNETS);

		createPortRequestEClass = createEClass(CREATE_PORT_REQUEST);
		createEAttribute(createPortRequestEClass, CREATE_PORT_REQUEST__NAME);
		createEAttribute(createPortRequestEClass, CREATE_PORT_REQUEST__BINDING_VNIC_TYPE);
		createEAttribute(createPortRequestEClass, CREATE_PORT_REQUEST__STATUS);
		createEAttribute(createPortRequestEClass, CREATE_PORT_REQUEST__ADMIN_STATE_UP);
		createEReference(createPortRequestEClass, CREATE_PORT_REQUEST__FIXED_IPS);
		createEAttribute(createPortRequestEClass, CREATE_PORT_REQUEST__MAC_ADDRESS);
		createEAttribute(createPortRequestEClass, CREATE_PORT_REQUEST__NETWORK_ID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		networkEClass.getESuperTypes().add(this.getNeutronObject());
		subnetEClass.getESuperTypes().add(this.getNeutronObject());
		routerEClass.getESuperTypes().add(this.getNeutronObject());
		portEClass.getESuperTypes().add(this.getNeutronObject());
		neutronSecurityGroupEClass.getESuperTypes().add(this.getNeutronObject());
		neutronSecurityRuleEClass.getESuperTypes().add(this.getNeutronObject());
		neutronFloatingIpEClass.getESuperTypes().add(this.getNeutronObject());
		neutronRequestEClass.getESuperTypes().add(theCorePackage.getOpenStackRequest());
		createNetworkRequestEClass.getESuperTypes().add(this.getNeutronRequest());
		createSubnetRequestEClass.getESuperTypes().add(this.getNeutronRequest());
		createRouterRequestEClass.getESuperTypes().add(this.getNeutronRequest());
		createPortRequestEClass.getESuperTypes().add(this.getNeutronRequest());

		// Initialize classes, features, and operations; add parameters
		initEClass(neutronServiceEClass, NeutronService.class, "NeutronService", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getNeutronService__CreateNetwork__CreateNetworkRequest(), this.getNetwork(), "createNetwork", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCreateNetworkRequest(), "request", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getNeutronService__CreateSubnet__CreateSubnetRequest(), this.getSubnet(), "createSubnet", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCreateSubnetRequest(), "request", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getNeutronService__CreatePort__CreatePortRequest(), this.getPort(), "createPort", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCreatePortRequest(), "request", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getNeutronService__CreateRouter__CreateRouterRequest(), this.getRouter(), "createRouter", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCreateRouterRequest(), "request", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getNeutronService__DeleteNetwork__String_String(), null, "deleteNetwork", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "projectName", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getNeutronService__DeleteSubnet__String_String(), null, "deleteSubnet", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "projectName", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getNeutronService__DeletePort__String_String(), null, "deletePort", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "projectName", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getNeutronService__DeleteRouter__String_String(), null, "deleteRouter", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "projectName", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getNeutronService__AssociateFloatingIp__String_String_String(), null, "associateFloatingIp", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "projectName", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "ipId", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "portId", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(neutronObjectEClass, NeutronObject.class, "NeutronObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(networkEClass, Network.class, "Network", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNetwork_Id(), theEcorePackage.getEString(), "id", null, 0, 1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetwork_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetwork_Admin_state_up(), theEcorePackage.getEBooleanObject(), "admin_state_up", null, 0, 1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetwork_Provider_network_type(), theEcorePackage.getEString(), "provider_network_type", null, 0, 1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetwork_Provider_physical_network(), theEcorePackage.getEString(), "provider_physical_network", null, 0, 1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetwork_Provider_segmentation_id(), theEcorePackage.getEIntegerObject(), "provider_segmentation_id", null, 0, 1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetwork_Router_external(), theEcorePackage.getEBooleanObject(), "router_external", null, 0, 1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetwork_Shared(), theEcorePackage.getEBooleanObject(), "shared", null, 0, 1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetwork_Status(), theEcorePackage.getEString(), "status", null, 0, 1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetwork_Subnets(), theEcorePackage.getEString(), "subnets", null, 0, -1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetwork_Tenant_id(), theEcorePackage.getEString(), "tenant_id", null, 0, 1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subnetEClass, Subnet.class, "Subnet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubnet_Id(), theEcorePackage.getEString(), "id", null, 0, 1, Subnet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubnet_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Subnet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubnet_Status(), theEcorePackage.getEString(), "status", null, 0, 1, Subnet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubnet_Admin_state_up(), theEcorePackage.getEBooleanObject(), "admin_state_up", null, 0, 1, Subnet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubnet_Cidr(), theEcorePackage.getEString(), "cidr", null, 0, 1, Subnet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubnet_Allocation_pools(), this.getAllocationPool(), null, "allocation_pools", null, 0, -1, Subnet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubnet_Dns_nameservers(), theEcorePackage.getEString(), "dns_nameservers", null, 0, -1, Subnet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubnet_Enable_dhcp(), theEcorePackage.getEBooleanObject(), "enable_dhcp", null, 0, 1, Subnet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubnet_Gateway_ip(), theEcorePackage.getEString(), "gateway_ip", null, 0, 1, Subnet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubnet_Host_routes(), theEcorePackage.getEString(), "host_routes", null, 0, -1, Subnet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubnet_Ip_version(), theEcorePackage.getEIntegerObject(), "ip_version", null, 0, 1, Subnet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubnet_Network_id(), theEcorePackage.getEString(), "network_id", null, 0, 1, Subnet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubnet_Tenant_id(), theEcorePackage.getEString(), "tenant_id", null, 0, 1, Subnet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(allocationPoolEClass, AllocationPool.class, "AllocationPool", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAllocationPool_Start(), theEcorePackage.getEString(), "start", null, 0, 1, AllocationPool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAllocationPool_End(), theEcorePackage.getEString(), "end", null, 0, 1, AllocationPool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(routerEClass, Router.class, "Router", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRouter_Id(), theEcorePackage.getEString(), "id", null, 0, 1, Router.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRouter_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Router.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRouter_Status(), theEcorePackage.getEString(), "status", null, 0, 1, Router.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRouter_Admin_state_up(), theEcorePackage.getEBooleanObject(), "admin_state_up", null, 0, 1, Router.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRouter_External_gateway_info(), this.getExternalGateway(), null, "external_gateway_info", null, 0, 1, Router.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRouter_Tenant_id(), theEcorePackage.getEString(), "tenant_id", null, 0, 1, Router.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portEClass, Port.class, "Port", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPort_Id(), theEcorePackage.getEString(), "id", null, 0, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPort_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPort_Status(), theEcorePackage.getEString(), "status", null, 0, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPort_Admin_state_up(), theEcorePackage.getEBooleanObject(), "admin_state_up", null, 0, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPort_External_gateway_info(), this.getExternalGateway(), null, "external_gateway_info", null, 0, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPort_Tenant_id(), theEcorePackage.getEString(), "tenant_id", null, 0, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPort_Allowed_address_pairs(), theEcorePackage.getEString(), "allowed_address_pairs", null, 0, -1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPort_Binding_host_id(), theEcorePackage.getEString(), "binding_host_id", null, 0, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPort_Binding_profile(), this.getBindingProfile(), null, "binding_profile", null, 0, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPort_Binding_vif_details(), this.getBindingVifDetail(), null, "binding_vif_details", null, 0, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPort_Binding_vif_type(), theEcorePackage.getEString(), "binding_vif_type", null, 0, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPort_Binding_vnic_type(), theEcorePackage.getEString(), "binding_vnic_type", null, 0, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPort_Device_id(), theEcorePackage.getEString(), "device_id", null, 0, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPort_Device_owner(), theEcorePackage.getEString(), "device_owner", null, 0, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPort_Extra_dhcp_opts(), theEcorePackage.getEString(), "extra_dhcp_opts", null, 0, -1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPort_Fixed_ips(), this.getFixedIp(), null, "fixed_ips", null, 0, -1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPort_Mac_address(), theEcorePackage.getEString(), "mac_address", null, 0, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPort_Network_id(), theEcorePackage.getEString(), "network_id", null, 0, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPort_Security_groups(), theEcorePackage.getEString(), "security_groups", null, 0, -1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(neutronSecurityGroupEClass, NeutronSecurityGroup.class, "NeutronSecurityGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNeutronSecurityGroup_Id(), theEcorePackage.getEString(), "id", null, 0, 1, NeutronSecurityGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNeutronSecurityGroup_Name(), theEcorePackage.getEString(), "name", null, 0, 1, NeutronSecurityGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNeutronSecurityGroup_Description(), theEcorePackage.getEString(), "description", null, 0, 1, NeutronSecurityGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNeutronSecurityGroup_Security_group_rules(), this.getNeutronSecurityRule(), null, "security_group_rules", null, 0, -1, NeutronSecurityGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNeutronSecurityGroup_Tenant_id(), theEcorePackage.getEString(), "tenant_id", null, 0, 1, NeutronSecurityGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(neutronSecurityRuleEClass, NeutronSecurityRule.class, "NeutronSecurityRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNeutronSecurityRule_Id(), theEcorePackage.getEString(), "id", null, 0, 1, NeutronSecurityRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNeutronSecurityRule_Direction(), theEcorePackage.getEString(), "direction", null, 0, 1, NeutronSecurityRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNeutronSecurityRule_Ethertype(), theEcorePackage.getEString(), "ethertype", null, 0, 1, NeutronSecurityRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNeutronSecurityRule_Port_range_min(), theEcorePackage.getEIntegerObject(), "port_range_min", null, 0, 1, NeutronSecurityRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNeutronSecurityRule_Port_range_max(), theEcorePackage.getEIntegerObject(), "port_range_max", null, 0, 1, NeutronSecurityRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNeutronSecurityRule_Protocol(), theEcorePackage.getEString(), "protocol", null, 0, 1, NeutronSecurityRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNeutronSecurityRule_Remote_group_id(), theEcorePackage.getEString(), "remote_group_id", null, 0, 1, NeutronSecurityRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNeutronSecurityRule_Remote_ip_prefix(), theEcorePackage.getEString(), "remote_ip_prefix", null, 0, 1, NeutronSecurityRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNeutronSecurityRule_Security_group_id(), theEcorePackage.getEString(), "security_group_id", null, 0, 1, NeutronSecurityRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNeutronSecurityRule_Tenant_id(), theEcorePackage.getEString(), "tenant_id", null, 0, 1, NeutronSecurityRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(neutronFloatingIpEClass, NeutronFloatingIp.class, "NeutronFloatingIp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNeutronFloatingIp_Id(), theEcorePackage.getEString(), "id", null, 0, 1, NeutronFloatingIp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNeutronFloatingIp_Name(), theEcorePackage.getEString(), "name", null, 0, 1, NeutronFloatingIp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNeutronFloatingIp_Status(), theEcorePackage.getEString(), "status", null, 0, 1, NeutronFloatingIp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNeutronFloatingIp_Floating_network_id(), theEcorePackage.getEString(), "floating_network_id", null, 0, 1, NeutronFloatingIp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNeutronFloatingIp_Router_id(), theEcorePackage.getEString(), "router_id", null, 0, 1, NeutronFloatingIp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNeutronFloatingIp_Fixed_ip_address(), theEcorePackage.getEString(), "fixed_ip_address", null, 0, 1, NeutronFloatingIp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNeutronFloatingIp_Floating_ip_address(), theEcorePackage.getEString(), "floating_ip_address", null, 0, 1, NeutronFloatingIp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNeutronFloatingIp_Tenant_id(), theEcorePackage.getEString(), "tenant_id", null, 0, 1, NeutronFloatingIp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNeutronFloatingIp_Port_id(), theEcorePackage.getEString(), "port_id", null, 0, 1, NeutronFloatingIp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bindingProfileEClass, BindingProfile.class, "BindingProfile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bindingVifDetailEClass, BindingVifDetail.class, "BindingVifDetail", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBindingVifDetail_Ovs_hybrid_plug(), theEcorePackage.getEBooleanObject(), "ovs_hybrid_plug", null, 0, 1, BindingVifDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBindingVifDetail_Port_filter(), theEcorePackage.getEBooleanObject(), "port_filter", null, 0, 1, BindingVifDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fixedIpEClass, FixedIp.class, "FixedIp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFixedIp_Ip_address(), theEcorePackage.getEString(), "ip_address", null, 0, 1, FixedIp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedIp_Subnet_id(), theEcorePackage.getEString(), "subnet_id", null, 0, 1, FixedIp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(externalGatewayEClass, ExternalGateway.class, "ExternalGateway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExternalGateway_Enable_snat(), theEcorePackage.getEBooleanObject(), "enable_snat", null, 0, 1, ExternalGateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExternalGateway_Network_id(), theEcorePackage.getEString(), "network_id", null, 0, 1, ExternalGateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(neutronRequestEClass, NeutronRequest.class, "NeutronRequest", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(createNetworkRequestEClass, CreateNetworkRequest.class, "CreateNetworkRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCreateNetworkRequest_Name(), theEcorePackage.getEString(), "name", null, 0, 1, CreateNetworkRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreateNetworkRequest_ProviderNetworkType(), theEcorePackage.getEString(), "providerNetworkType", null, 0, 1, CreateNetworkRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreateNetworkRequest_ProviderPhysicalNetwork(), theEcorePackage.getEString(), "providerPhysicalNetwork", null, 0, 1, CreateNetworkRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreateNetworkRequest_ProviderSegmentationId(), theEcorePackage.getEInt(), "providerSegmentationId", null, 0, 1, CreateNetworkRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreateNetworkRequest_Admin_state_up(), theEcorePackage.getEBooleanObject(), "admin_state_up", null, 0, 1, CreateNetworkRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreateNetworkRequest_Shared(), theEcorePackage.getEBooleanObject(), "shared", null, 0, 1, CreateNetworkRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(createSubnetRequestEClass, CreateSubnetRequest.class, "CreateSubnetRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCreateSubnetRequest_Name(), theEcorePackage.getEString(), "name", null, 0, 1, CreateSubnetRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreateSubnetRequest_Network_id(), theEcorePackage.getEString(), "network_id", null, 1, 1, CreateSubnetRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreateSubnetRequest_Ip_version(), theEcorePackage.getEInt(), "ip_version", null, 0, 1, CreateSubnetRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreateSubnetRequest_Cidr(), theEcorePackage.getEString(), "cidr", null, 0, 1, CreateSubnetRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCreateSubnetRequest_Allocation_pools(), this.getAllocationPool(), null, "allocation_pools", null, 0, -1, CreateSubnetRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreateSubnetRequest_Dns_nameservers(), theEcorePackage.getEString(), "dns_nameservers", null, 0, -1, CreateSubnetRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreateSubnetRequest_Enable_dhcp(), theEcorePackage.getEBooleanObject(), "enable_dhcp", null, 0, 1, CreateSubnetRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreateSubnetRequest_Gateway_ip(), theEcorePackage.getEString(), "gateway_ip", null, 0, 1, CreateSubnetRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(createRouterRequestEClass, CreateRouterRequest.class, "CreateRouterRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCreateRouterRequest_Name(), theEcorePackage.getEString(), "name", null, 0, 1, CreateRouterRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreateRouterRequest_Admin_state_up(), theEcorePackage.getEBooleanObject(), "admin_state_up", null, 0, 1, CreateRouterRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreateRouterRequest_Shared(), theEcorePackage.getEBooleanObject(), "shared", null, 0, 1, CreateRouterRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreateRouterRequest_ExternalNetwork(), theEcorePackage.getEString(), "externalNetwork", null, 0, 1, CreateRouterRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreateRouterRequest_Ports(), theEcorePackage.getEString(), "ports", null, 0, -1, CreateRouterRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreateRouterRequest_Subnets(), theEcorePackage.getEString(), "subnets", null, 0, -1, CreateRouterRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(createPortRequestEClass, CreatePortRequest.class, "CreatePortRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCreatePortRequest_Name(), theEcorePackage.getEString(), "name", null, 0, 1, CreatePortRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreatePortRequest_BindingVnicType(), theEcorePackage.getEString(), "bindingVnicType", null, 0, 1, CreatePortRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreatePortRequest_Status(), theEcorePackage.getEString(), "status", null, 0, 1, CreatePortRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreatePortRequest_Admin_state_up(), theEcorePackage.getEBooleanObject(), "admin_state_up", null, 0, 1, CreatePortRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCreatePortRequest_Fixed_ips(), this.getFixedIp(), null, "fixed_ips", null, 0, -1, CreatePortRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreatePortRequest_Mac_address(), theEcorePackage.getEString(), "mac_address", null, 0, 1, CreatePortRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreatePortRequest_Network_id(), theEcorePackage.getEString(), "network_id", null, 1, 1, CreatePortRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2011/Xcore
		createXcoreAnnotations();
		// http://openecomp.org/sirius/openstack
		createOpenstackAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2011/Xcore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createXcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2011/Xcore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "openstack", "http://openecomp.org/sirius/openstack"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://openecomp.org/sirius/openstack</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOpenstackAnnotations() {
		String source = "http://openecomp.org/sirius/openstack";	
		addAnnotation
		  (getCreateNetworkRequest_ProviderNetworkType(), 
		   source, 
		   new String[] {
			 "name", "provider:network_type"
		   });	
		addAnnotation
		  (getCreateNetworkRequest_ProviderPhysicalNetwork(), 
		   source, 
		   new String[] {
			 "name", "provider:physical_network"
		   });	
		addAnnotation
		  (getCreateNetworkRequest_ProviderSegmentationId(), 
		   source, 
		   new String[] {
			 "name", "provider:segmentation_id"
		   });	
		addAnnotation
		  (getCreatePortRequest_BindingVnicType(), 
		   source, 
		   new String[] {
			 "name", "binding:vnic_type"
		   });	
		addAnnotation
		  (getCreatePortRequest_Fixed_ips(), 
		   source, 
		   new String[] {
			 "removeEmptyList", "true"
		   });
	}

} //NeutronPackageImpl
