
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
package org.openecomp.ncomp.openstack.location.impl;

import org.openecomp.ncomp.core.CorePackage;

import org.openecomp.ncomp.openstack.ceilometer.CeilometerPackage;
import org.openecomp.ncomp.openstack.compute.ComputePackage;

import org.openecomp.ncomp.openstack.location.Hypervisor;
import org.openecomp.ncomp.openstack.location.HypervisorCpuInfo;
import org.openecomp.ncomp.openstack.location.HypervisorCpuTopology;
import org.openecomp.ncomp.openstack.location.HypervisorService;
import org.openecomp.ncomp.openstack.location.LocationFactory;
import org.openecomp.ncomp.openstack.location.LocationPackage;
import org.openecomp.ncomp.openstack.location.OpenStackLocation;
import org.openecomp.ncomp.openstack.location.OpenStackProject;
import org.openecomp.ncomp.openstack.location.OpenStackUser;

import org.openecomp.ncomp.openstack.location.OpenStackVersion;
import org.openecomp.ncomp.openstack.neutron.NeutronPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
public class LocationPackageImpl extends EPackageImpl implements LocationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass openStackLocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass openStackProjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass openStackUserEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hypervisorServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hypervisorCpuTopologyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hypervisorCpuInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hypervisorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum openStackVersionEEnum = null;

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
	 * @see org.openecomp.ncomp.openstack.location.LocationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LocationPackageImpl() {
		super(eNS_URI, LocationFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link LocationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LocationPackage init() {
		if (isInited) return (LocationPackage)EPackage.Registry.INSTANCE.getEPackage(LocationPackage.eNS_URI);

		// Obtain or create and register package
		LocationPackageImpl theLocationPackage = (LocationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof LocationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new LocationPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		NeutronPackage.eINSTANCE.eClass();
		CeilometerPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theLocationPackage.createPackageContents();

		// Initialize created meta-data
		theLocationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLocationPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LocationPackage.eNS_URI, theLocationPackage);
		return theLocationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpenStackLocation() {
		return openStackLocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpenStackLocation_Version() {
		return (EAttribute)openStackLocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpenStackLocation_RemoteLocation() {
		return (EAttribute)openStackLocationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpenStackLocation_RemoteLocationName() {
		return (EAttribute)openStackLocationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpenStackLocation_AllowCreateFlavor() {
		return (EAttribute)openStackLocationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpenStackLocation_KeystoneUrl() {
		return (EAttribute)openStackLocationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpenStackLocation_BypassIp() {
		return (EAttribute)openStackLocationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpenStackLocation_FlavorId() {
		return (EAttribute)openStackLocationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpenStackLocation_SupportsSecurityGroups() {
		return (EAttribute)openStackLocationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpenStackLocation_SupportsFloatingIps() {
		return (EAttribute)openStackLocationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOpenStackLocation_Projects() {
		return (EReference)openStackLocationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOpenStackLocation_Users() {
		return (EReference)openStackLocationEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOpenStackLocation_Images() {
		return (EReference)openStackLocationEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOpenStackLocation_Flavors() {
		return (EReference)openStackLocationEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOpenStackLocation_Hypervisors() {
		return (EReference)openStackLocationEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOpenStackLocation__Poll() {
		return openStackLocationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOpenStackLocation__MergeLocation__OpenStackLocation() {
		return openStackLocationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpenStackProject() {
		return openStackProjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpenStackProject_ID() {
		return (EAttribute)openStackProjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpenStackProject_AdminUser() {
		return (EAttribute)openStackProjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpenStackProject_TenantId() {
		return (EAttribute)openStackProjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpenStackProject_Region() {
		return (EAttribute)openStackProjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpenStackProject_PrivateNetwork() {
		return (EAttribute)openStackProjectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpenStackProject_PublicNetwork() {
		return (EAttribute)openStackProjectEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpenStackProject_ApiKey() {
		return (EAttribute)openStackProjectEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOpenStackProject_Servers() {
		return (EReference)openStackProjectEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOpenStackProject_Users() {
		return (EReference)openStackProjectEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOpenStackProject_ControllerUser() {
		return (EReference)openStackProjectEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOpenStackProject_Volumes() {
		return (EReference)openStackProjectEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOpenStackProject_Ips() {
		return (EReference)openStackProjectEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOpenStackProject_Groups() {
		return (EReference)openStackProjectEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOpenStackProject_Keypairs() {
		return (EReference)openStackProjectEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOpenStackProject_Networks() {
		return (EReference)openStackProjectEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOpenStackProject_Subnets() {
		return (EReference)openStackProjectEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOpenStackProject_Routers() {
		return (EReference)openStackProjectEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOpenStackProject_Ports() {
		return (EReference)openStackProjectEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOpenStackProject_Security_groups() {
		return (EReference)openStackProjectEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOpenStackProject_Floatingips() {
		return (EReference)openStackProjectEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOpenStackProject__UpdateNovaState() {
		return openStackProjectEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOpenStackProject__CreateNetwork__CreateNetworkRequest() {
		return openStackProjectEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpenStackUser() {
		return openStackUserEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpenStackUser_Password() {
		return (EAttribute)openStackUserEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHypervisorService() {
		return hypervisorServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHypervisorService_Host() {
		return (EAttribute)hypervisorServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHypervisorService_Id() {
		return (EAttribute)hypervisorServiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHypervisorCpuTopology() {
		return hypervisorCpuTopologyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHypervisorCpuTopology_Cores() {
		return (EAttribute)hypervisorCpuTopologyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHypervisorCpuTopology_Threads() {
		return (EAttribute)hypervisorCpuTopologyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHypervisorCpuTopology_Sockets() {
		return (EAttribute)hypervisorCpuTopologyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHypervisorCpuInfo() {
		return hypervisorCpuInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHypervisorCpuInfo_Vendor() {
		return (EAttribute)hypervisorCpuInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHypervisorCpuInfo_Model() {
		return (EAttribute)hypervisorCpuInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHypervisorCpuInfo_Arch() {
		return (EAttribute)hypervisorCpuInfoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHypervisorCpuInfo_Features() {
		return (EAttribute)hypervisorCpuInfoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHypervisorCpuInfo_Topology() {
		return (EReference)hypervisorCpuInfoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHypervisor() {
		return hypervisorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHypervisor_Service() {
		return (EReference)hypervisorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHypervisor_Host_ip() {
		return (EAttribute)hypervisorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHypervisor_Vcpus_used() {
		return (EAttribute)hypervisorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHypervisor_Hypervisor_type() {
		return (EAttribute)hypervisorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHypervisor_Local_gb_used() {
		return (EAttribute)hypervisorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHypervisor_Hypervisor_hostname() {
		return (EAttribute)hypervisorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHypervisor_Memory_mb_used() {
		return (EAttribute)hypervisorEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHypervisor_Memory_mb() {
		return (EAttribute)hypervisorEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHypervisor_Current_workload() {
		return (EAttribute)hypervisorEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHypervisor_Vcpus() {
		return (EAttribute)hypervisorEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHypervisor_Cpu_info() {
		return (EReference)hypervisorEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHypervisor_Running_vms() {
		return (EAttribute)hypervisorEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHypervisor_Free_disk_gb() {
		return (EAttribute)hypervisorEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHypervisor_Hypervisor_version() {
		return (EAttribute)hypervisorEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHypervisor_Disk_available_least() {
		return (EAttribute)hypervisorEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHypervisor_Local_gb() {
		return (EAttribute)hypervisorEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHypervisor_Free_ram_mb() {
		return (EAttribute)hypervisorEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHypervisor_Id() {
		return (EAttribute)hypervisorEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOpenStackVersion() {
		return openStackVersionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationFactory getLocationFactory() {
		return (LocationFactory)getEFactoryInstance();
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
		openStackLocationEClass = createEClass(OPEN_STACK_LOCATION);
		createEAttribute(openStackLocationEClass, OPEN_STACK_LOCATION__VERSION);
		createEAttribute(openStackLocationEClass, OPEN_STACK_LOCATION__REMOTE_LOCATION);
		createEAttribute(openStackLocationEClass, OPEN_STACK_LOCATION__REMOTE_LOCATION_NAME);
		createEAttribute(openStackLocationEClass, OPEN_STACK_LOCATION__ALLOW_CREATE_FLAVOR);
		createEAttribute(openStackLocationEClass, OPEN_STACK_LOCATION__KEYSTONE_URL);
		createEAttribute(openStackLocationEClass, OPEN_STACK_LOCATION__BYPASS_IP);
		createEAttribute(openStackLocationEClass, OPEN_STACK_LOCATION__FLAVOR_ID);
		createEAttribute(openStackLocationEClass, OPEN_STACK_LOCATION__SUPPORTS_SECURITY_GROUPS);
		createEAttribute(openStackLocationEClass, OPEN_STACK_LOCATION__SUPPORTS_FLOATING_IPS);
		createEReference(openStackLocationEClass, OPEN_STACK_LOCATION__PROJECTS);
		createEReference(openStackLocationEClass, OPEN_STACK_LOCATION__USERS);
		createEReference(openStackLocationEClass, OPEN_STACK_LOCATION__IMAGES);
		createEReference(openStackLocationEClass, OPEN_STACK_LOCATION__FLAVORS);
		createEReference(openStackLocationEClass, OPEN_STACK_LOCATION__HYPERVISORS);
		createEOperation(openStackLocationEClass, OPEN_STACK_LOCATION___POLL);
		createEOperation(openStackLocationEClass, OPEN_STACK_LOCATION___MERGE_LOCATION__OPENSTACKLOCATION);

		openStackProjectEClass = createEClass(OPEN_STACK_PROJECT);
		createEAttribute(openStackProjectEClass, OPEN_STACK_PROJECT__ID);
		createEAttribute(openStackProjectEClass, OPEN_STACK_PROJECT__ADMIN_USER);
		createEAttribute(openStackProjectEClass, OPEN_STACK_PROJECT__TENANT_ID);
		createEAttribute(openStackProjectEClass, OPEN_STACK_PROJECT__REGION);
		createEAttribute(openStackProjectEClass, OPEN_STACK_PROJECT__PRIVATE_NETWORK);
		createEAttribute(openStackProjectEClass, OPEN_STACK_PROJECT__PUBLIC_NETWORK);
		createEAttribute(openStackProjectEClass, OPEN_STACK_PROJECT__API_KEY);
		createEReference(openStackProjectEClass, OPEN_STACK_PROJECT__SERVERS);
		createEReference(openStackProjectEClass, OPEN_STACK_PROJECT__USERS);
		createEReference(openStackProjectEClass, OPEN_STACK_PROJECT__CONTROLLER_USER);
		createEReference(openStackProjectEClass, OPEN_STACK_PROJECT__VOLUMES);
		createEReference(openStackProjectEClass, OPEN_STACK_PROJECT__IPS);
		createEReference(openStackProjectEClass, OPEN_STACK_PROJECT__GROUPS);
		createEReference(openStackProjectEClass, OPEN_STACK_PROJECT__KEYPAIRS);
		createEReference(openStackProjectEClass, OPEN_STACK_PROJECT__NETWORKS);
		createEReference(openStackProjectEClass, OPEN_STACK_PROJECT__SUBNETS);
		createEReference(openStackProjectEClass, OPEN_STACK_PROJECT__ROUTERS);
		createEReference(openStackProjectEClass, OPEN_STACK_PROJECT__PORTS);
		createEReference(openStackProjectEClass, OPEN_STACK_PROJECT__SECURITY_GROUPS);
		createEReference(openStackProjectEClass, OPEN_STACK_PROJECT__FLOATINGIPS);
		createEOperation(openStackProjectEClass, OPEN_STACK_PROJECT___UPDATE_NOVA_STATE);
		createEOperation(openStackProjectEClass, OPEN_STACK_PROJECT___CREATE_NETWORK__CREATENETWORKREQUEST);

		openStackUserEClass = createEClass(OPEN_STACK_USER);
		createEAttribute(openStackUserEClass, OPEN_STACK_USER__PASSWORD);

		hypervisorServiceEClass = createEClass(HYPERVISOR_SERVICE);
		createEAttribute(hypervisorServiceEClass, HYPERVISOR_SERVICE__HOST);
		createEAttribute(hypervisorServiceEClass, HYPERVISOR_SERVICE__ID);

		hypervisorCpuTopologyEClass = createEClass(HYPERVISOR_CPU_TOPOLOGY);
		createEAttribute(hypervisorCpuTopologyEClass, HYPERVISOR_CPU_TOPOLOGY__CORES);
		createEAttribute(hypervisorCpuTopologyEClass, HYPERVISOR_CPU_TOPOLOGY__THREADS);
		createEAttribute(hypervisorCpuTopologyEClass, HYPERVISOR_CPU_TOPOLOGY__SOCKETS);

		hypervisorCpuInfoEClass = createEClass(HYPERVISOR_CPU_INFO);
		createEAttribute(hypervisorCpuInfoEClass, HYPERVISOR_CPU_INFO__VENDOR);
		createEAttribute(hypervisorCpuInfoEClass, HYPERVISOR_CPU_INFO__MODEL);
		createEAttribute(hypervisorCpuInfoEClass, HYPERVISOR_CPU_INFO__ARCH);
		createEAttribute(hypervisorCpuInfoEClass, HYPERVISOR_CPU_INFO__FEATURES);
		createEReference(hypervisorCpuInfoEClass, HYPERVISOR_CPU_INFO__TOPOLOGY);

		hypervisorEClass = createEClass(HYPERVISOR);
		createEReference(hypervisorEClass, HYPERVISOR__SERVICE);
		createEAttribute(hypervisorEClass, HYPERVISOR__HOST_IP);
		createEAttribute(hypervisorEClass, HYPERVISOR__VCPUS_USED);
		createEAttribute(hypervisorEClass, HYPERVISOR__HYPERVISOR_TYPE);
		createEAttribute(hypervisorEClass, HYPERVISOR__LOCAL_GB_USED);
		createEAttribute(hypervisorEClass, HYPERVISOR__HYPERVISOR_HOSTNAME);
		createEAttribute(hypervisorEClass, HYPERVISOR__MEMORY_MB_USED);
		createEAttribute(hypervisorEClass, HYPERVISOR__MEMORY_MB);
		createEAttribute(hypervisorEClass, HYPERVISOR__CURRENT_WORKLOAD);
		createEAttribute(hypervisorEClass, HYPERVISOR__VCPUS);
		createEReference(hypervisorEClass, HYPERVISOR__CPU_INFO);
		createEAttribute(hypervisorEClass, HYPERVISOR__RUNNING_VMS);
		createEAttribute(hypervisorEClass, HYPERVISOR__FREE_DISK_GB);
		createEAttribute(hypervisorEClass, HYPERVISOR__HYPERVISOR_VERSION);
		createEAttribute(hypervisorEClass, HYPERVISOR__DISK_AVAILABLE_LEAST);
		createEAttribute(hypervisorEClass, HYPERVISOR__LOCAL_GB);
		createEAttribute(hypervisorEClass, HYPERVISOR__FREE_RAM_MB);
		createEAttribute(hypervisorEClass, HYPERVISOR__ID);

		// Create enums
		openStackVersionEEnum = createEEnum(OPEN_STACK_VERSION);
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
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		NeutronPackage theNeutronPackage = (NeutronPackage)EPackage.Registry.INSTANCE.getEPackage(NeutronPackage.eNS_URI);
		ComputePackage theComputePackage = (ComputePackage)EPackage.Registry.INSTANCE.getEPackage(ComputePackage.eNS_URI);
		CeilometerPackage theCeilometerPackage = (CeilometerPackage)EPackage.Registry.INSTANCE.getEPackage(CeilometerPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		openStackLocationEClass.getESuperTypes().add(theCorePackage.getNamedEntity());
		openStackLocationEClass.getESuperTypes().add(theNeutronPackage.getNeutronService());
		openStackLocationEClass.getESuperTypes().add(theComputePackage.getComputeService());
		openStackLocationEClass.getESuperTypes().add(theCeilometerPackage.getCeilometerService());
		openStackProjectEClass.getESuperTypes().add(theCorePackage.getNamedEntity());
		openStackProjectEClass.getESuperTypes().add(theCeilometerPackage.getCeilometerProject());
		openStackUserEClass.getESuperTypes().add(theCorePackage.getNamedEntity());
		hypervisorEClass.getESuperTypes().add(theCorePackage.getNamedEntity());

		// Initialize classes, features, and operations; add parameters
		initEClass(openStackLocationEClass, OpenStackLocation.class, "OpenStackLocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOpenStackLocation_Version(), this.getOpenStackVersion(), "version", null, 0, 1, OpenStackLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOpenStackLocation_RemoteLocation(), theEcorePackage.getEBoolean(), "remoteLocation", "false", 0, 1, OpenStackLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOpenStackLocation_RemoteLocationName(), theEcorePackage.getEString(), "remoteLocationName", null, 0, 1, OpenStackLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOpenStackLocation_AllowCreateFlavor(), theEcorePackage.getEBoolean(), "allowCreateFlavor", null, 0, 1, OpenStackLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOpenStackLocation_KeystoneUrl(), theEcorePackage.getEString(), "keystoneUrl", null, 0, 1, OpenStackLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOpenStackLocation_BypassIp(), theEcorePackage.getEString(), "bypassIp", null, 0, 1, OpenStackLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOpenStackLocation_FlavorId(), theEcorePackage.getEInt(), "flavorId", "20000", 0, 1, OpenStackLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOpenStackLocation_SupportsSecurityGroups(), theEcorePackage.getEBoolean(), "supportsSecurityGroups", "true", 0, 1, OpenStackLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOpenStackLocation_SupportsFloatingIps(), theEcorePackage.getEBoolean(), "supportsFloatingIps", "true", 0, 1, OpenStackLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOpenStackLocation_Projects(), this.getOpenStackProject(), null, "projects", null, 0, -1, OpenStackLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOpenStackLocation_Users(), this.getOpenStackUser(), null, "users", null, 0, -1, OpenStackLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOpenStackLocation_Images(), theComputePackage.getImage(), null, "images", null, 0, -1, OpenStackLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOpenStackLocation_Flavors(), theComputePackage.getFlavor(), null, "flavors", null, 0, -1, OpenStackLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOpenStackLocation_Hypervisors(), this.getHypervisor(), null, "hypervisors", null, 0, -1, OpenStackLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getOpenStackLocation__Poll(), null, "poll", 0, 1, !IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getOpenStackLocation__MergeLocation__OpenStackLocation(), null, "mergeLocation", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getOpenStackLocation(), "loc", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(openStackProjectEClass, OpenStackProject.class, "OpenStackProject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOpenStackProject_ID(), theEcorePackage.getEString(), "ID", null, 0, 1, OpenStackProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOpenStackProject_AdminUser(), theEcorePackage.getEString(), "adminUser", null, 0, 1, OpenStackProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOpenStackProject_TenantId(), theEcorePackage.getEString(), "tenantId", null, 0, 1, OpenStackProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOpenStackProject_Region(), theEcorePackage.getEString(), "region", null, 0, 1, OpenStackProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOpenStackProject_PrivateNetwork(), theEcorePackage.getEString(), "privateNetwork", null, 0, 1, OpenStackProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOpenStackProject_PublicNetwork(), theEcorePackage.getEString(), "publicNetwork", null, 0, 1, OpenStackProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOpenStackProject_ApiKey(), theEcorePackage.getEString(), "apiKey", null, 0, 1, OpenStackProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOpenStackProject_Servers(), theComputePackage.getServer(), null, "servers", null, 0, -1, OpenStackProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOpenStackProject_Users(), this.getOpenStackUser(), null, "users", null, 0, -1, OpenStackProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOpenStackProject_ControllerUser(), this.getOpenStackUser(), null, "controllerUser", null, 0, 1, OpenStackProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOpenStackProject_Volumes(), theComputePackage.getVolume(), null, "volumes", null, 0, -1, OpenStackProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOpenStackProject_Ips(), theComputePackage.getFloatingIp(), null, "ips", null, 0, -1, OpenStackProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOpenStackProject_Groups(), theComputePackage.getSecurityGroup(), null, "groups", null, 0, -1, OpenStackProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOpenStackProject_Keypairs(), theComputePackage.getKeyPair(), null, "keypairs", null, 0, -1, OpenStackProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOpenStackProject_Networks(), theNeutronPackage.getNetwork(), null, "networks", null, 0, -1, OpenStackProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOpenStackProject_Subnets(), theNeutronPackage.getSubnet(), null, "subnets", null, 0, -1, OpenStackProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOpenStackProject_Routers(), theNeutronPackage.getRouter(), null, "routers", null, 0, -1, OpenStackProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOpenStackProject_Ports(), theNeutronPackage.getPort(), null, "ports", null, 0, -1, OpenStackProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOpenStackProject_Security_groups(), theNeutronPackage.getNeutronSecurityGroup(), null, "security_groups", null, 0, -1, OpenStackProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOpenStackProject_Floatingips(), theNeutronPackage.getNeutronFloatingIp(), null, "floatingips", null, 0, -1, OpenStackProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getOpenStackProject__UpdateNovaState(), null, "updateNovaState", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getOpenStackProject__CreateNetwork__CreateNetworkRequest(), theNeutronPackage.getNetwork(), "createNetwork", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theNeutronPackage.getCreateNetworkRequest(), "r", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(openStackUserEClass, OpenStackUser.class, "OpenStackUser", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOpenStackUser_Password(), theEcorePackage.getEString(), "password", null, 0, 1, OpenStackUser.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hypervisorServiceEClass, HypervisorService.class, "HypervisorService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHypervisorService_Host(), theEcorePackage.getEString(), "host", null, 0, 1, HypervisorService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHypervisorService_Id(), theEcorePackage.getEInt(), "id", null, 0, 1, HypervisorService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hypervisorCpuTopologyEClass, HypervisorCpuTopology.class, "HypervisorCpuTopology", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHypervisorCpuTopology_Cores(), theEcorePackage.getEInt(), "cores", null, 0, 1, HypervisorCpuTopology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHypervisorCpuTopology_Threads(), theEcorePackage.getEInt(), "threads", null, 0, 1, HypervisorCpuTopology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHypervisorCpuTopology_Sockets(), theEcorePackage.getEInt(), "sockets", null, 0, 1, HypervisorCpuTopology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hypervisorCpuInfoEClass, HypervisorCpuInfo.class, "HypervisorCpuInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHypervisorCpuInfo_Vendor(), theEcorePackage.getEString(), "vendor", null, 0, 1, HypervisorCpuInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHypervisorCpuInfo_Model(), theEcorePackage.getEString(), "model", null, 0, 1, HypervisorCpuInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHypervisorCpuInfo_Arch(), theEcorePackage.getEString(), "arch", null, 0, 1, HypervisorCpuInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHypervisorCpuInfo_Features(), theEcorePackage.getEString(), "features", null, 0, -1, HypervisorCpuInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHypervisorCpuInfo_Topology(), this.getHypervisorCpuTopology(), null, "topology", null, 0, 1, HypervisorCpuInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hypervisorEClass, Hypervisor.class, "Hypervisor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHypervisor_Service(), this.getHypervisorService(), null, "service", null, 0, 1, Hypervisor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHypervisor_Host_ip(), theEcorePackage.getEString(), "host_ip", null, 0, 1, Hypervisor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHypervisor_Vcpus_used(), theEcorePackage.getEInt(), "vcpus_used", null, 0, 1, Hypervisor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHypervisor_Hypervisor_type(), theEcorePackage.getEString(), "hypervisor_type", null, 0, 1, Hypervisor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHypervisor_Local_gb_used(), theEcorePackage.getEInt(), "local_gb_used", null, 0, 1, Hypervisor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHypervisor_Hypervisor_hostname(), theEcorePackage.getEString(), "hypervisor_hostname", null, 0, 1, Hypervisor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHypervisor_Memory_mb_used(), theEcorePackage.getEInt(), "memory_mb_used", null, 0, 1, Hypervisor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHypervisor_Memory_mb(), theEcorePackage.getEInt(), "memory_mb", null, 0, 1, Hypervisor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHypervisor_Current_workload(), theEcorePackage.getEInt(), "current_workload", null, 0, 1, Hypervisor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHypervisor_Vcpus(), theEcorePackage.getEInt(), "vcpus", null, 0, 1, Hypervisor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHypervisor_Cpu_info(), this.getHypervisorCpuInfo(), null, "cpu_info", null, 0, 1, Hypervisor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHypervisor_Running_vms(), theEcorePackage.getEInt(), "running_vms", null, 0, 1, Hypervisor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHypervisor_Free_disk_gb(), theEcorePackage.getEInt(), "free_disk_gb", null, 0, 1, Hypervisor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHypervisor_Hypervisor_version(), theEcorePackage.getEInt(), "hypervisor_version", null, 0, 1, Hypervisor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHypervisor_Disk_available_least(), theEcorePackage.getEInt(), "disk_available_least", null, 0, 1, Hypervisor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHypervisor_Local_gb(), theEcorePackage.getEInt(), "local_gb", null, 0, 1, Hypervisor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHypervisor_Free_ram_mb(), theEcorePackage.getEInt(), "free_ram_mb", null, 0, 1, Hypervisor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHypervisor_Id(), theEcorePackage.getEInt(), "id", null, 0, 1, Hypervisor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(openStackVersionEEnum, OpenStackVersion.class, "OpenStackVersion");
		addEEnumLiteral(openStackVersionEEnum, OpenStackVersion.FOLSOM);
		addEEnumLiteral(openStackVersionEEnum, OpenStackVersion.GRIZZLY);
		addEEnumLiteral(openStackVersionEEnum, OpenStackVersion.HAVANA);
		addEEnumLiteral(openStackVersionEEnum, OpenStackVersion.ICEHOUSE);
		addEEnumLiteral(openStackVersionEEnum, OpenStackVersion.JUNO);
		addEEnumLiteral(openStackVersionEEnum, OpenStackVersion.KILO);
		addEEnumLiteral(openStackVersionEEnum, OpenStackVersion.LIBERTY);
		addEEnumLiteral(openStackVersionEEnum, OpenStackVersion.MITAKA);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2011/Xcore
		createXcoreAnnotations();
		// http://openecomp.org/sirius/persistence
		createPersistenceAnnotations();
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
			 "persistence", "http://openecomp.org/sirius/persistence"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://openecomp.org/sirius/persistence</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPersistenceAnnotations() {
		String source = "http://openecomp.org/sirius/persistence";	
		addAnnotation
		  (getOpenStackUser_Password(), 
		   source, 
		   new String[] {
			 "propertyFile", "bsa.properties"
		   });
	}

} //LocationPackageImpl
