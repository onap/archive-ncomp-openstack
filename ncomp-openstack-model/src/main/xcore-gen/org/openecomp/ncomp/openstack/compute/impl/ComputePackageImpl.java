
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
package org.openecomp.ncomp.openstack.compute.impl;

import org.openecomp.ncomp.openstack.compute.Address;
import org.openecomp.ncomp.openstack.compute.Addresses;
import org.openecomp.ncomp.openstack.compute.ComputeFactory;
import org.openecomp.ncomp.openstack.compute.ComputePackage;
import org.openecomp.ncomp.openstack.compute.ComputeService;
import org.openecomp.ncomp.openstack.compute.Fault;
import org.openecomp.ncomp.openstack.compute.Flavor;
import org.openecomp.ncomp.openstack.compute.FloatingIp;
import org.openecomp.ncomp.openstack.compute.Image;
import org.openecomp.ncomp.openstack.compute.KeyPair;
import org.openecomp.ncomp.openstack.compute.Link;
import org.openecomp.ncomp.openstack.compute.Metadata;
import org.openecomp.ncomp.openstack.compute.OpenstackRequestFlavor;
import org.openecomp.ncomp.openstack.compute.OpenstackRequestKeyPair;
import org.openecomp.ncomp.openstack.compute.OpenstackRequestNewServer;
import org.openecomp.ncomp.openstack.compute.OpenstackRequestPoll;
import org.openecomp.ncomp.openstack.compute.OpenstackRequestSecurityGroup;
import org.openecomp.ncomp.openstack.compute.OpenstackRequestServerAction;
import org.openecomp.ncomp.openstack.compute.Personality;
import org.openecomp.ncomp.openstack.compute.Reference;
import org.openecomp.ncomp.openstack.compute.SecurityGroup;
import org.openecomp.ncomp.openstack.compute.SecurityRange;
import org.openecomp.ncomp.openstack.compute.SecurityRule;
import org.openecomp.ncomp.openstack.compute.Server;
import org.openecomp.ncomp.openstack.compute.Volume;
import org.openecomp.ncomp.openstack.compute.VolumeAttachment;
import org.openecomp.ncomp.openstack.core.CorePackage;
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
public class ComputePackageImpl extends EPackageImpl implements ComputePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass computeServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass openstackRequestNewServerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass openstackRequestKeyPairEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass openstackRequestFlavorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass openstackRequestSecurityGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass openstackRequestServerActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass openstackRequestPollEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serverEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flavorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addressesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addressEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metadataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass faultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personalityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass volumeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass volumeAttachmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass floatingIpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityRangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keyPairEClass = null;

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
	 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ComputePackageImpl() {
		super(eNS_URI, ComputeFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ComputePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ComputePackage init() {
		if (isInited) return (ComputePackage)EPackage.Registry.INSTANCE.getEPackage(ComputePackage.eNS_URI);

		// Obtain or create and register package
		ComputePackageImpl theComputePackage = (ComputePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ComputePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ComputePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theComputePackage.createPackageContents();

		// Initialize created meta-data
		theComputePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theComputePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ComputePackage.eNS_URI, theComputePackage);
		return theComputePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComputeService() {
		return computeServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComputeService__CreateServer__OpenstackRequestNewServer() {
		return computeServiceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComputeService__DeleteServer__String_String() {
		return computeServiceEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComputeService__CreateKeyPair__OpenstackRequestKeyPair() {
		return computeServiceEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComputeService__Delete__OpenstackRequestDelete() {
		return computeServiceEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComputeService__CreateFlavor__OpenstackRequestFlavor() {
		return computeServiceEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComputeService__CreateSecurityGroup__OpenstackRequestSecurityGroup() {
		return computeServiceEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComputeService__ServerAction__OpenstackRequestServerAction() {
		return computeServiceEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComputeService__DeployVmType__String_String() {
		return computeServiceEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComputeService__UndeployVmType__String_String() {
		return computeServiceEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComputeService__DeployUser__User_String() {
		return computeServiceEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComputeService__UndeployUser__User_String() {
		return computeServiceEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpenstackRequestNewServer() {
		return openstackRequestNewServerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpenstackRequestNewServer_Name() {
		return (EAttribute)openstackRequestNewServerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpenstackRequestNewServer_Hypervisor() {
		return (EAttribute)openstackRequestNewServerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpenstackRequestNewServer_User() {
		return (EAttribute)openstackRequestNewServerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpenstackRequestNewServer_Networks() {
		return (EAttribute)openstackRequestNewServerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpenstackRequestNewServer_Ports() {
		return (EAttribute)openstackRequestNewServerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpenstackRequestNewServer_User_data() {
		return (EAttribute)openstackRequestNewServerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpenstackRequestNewServer_FloatingIp() {
		return (EAttribute)openstackRequestNewServerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOpenstackRequestNewServer_VmType() {
		return (EReference)openstackRequestNewServerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpenstackRequestKeyPair() {
		return openstackRequestKeyPairEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOpenstackRequestKeyPair_User() {
		return (EReference)openstackRequestKeyPairEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpenstackRequestFlavor() {
		return openstackRequestFlavorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOpenstackRequestFlavor_VmType() {
		return (EReference)openstackRequestFlavorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpenstackRequestSecurityGroup() {
		return openstackRequestSecurityGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOpenstackRequestSecurityGroup_VmType() {
		return (EReference)openstackRequestSecurityGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpenstackRequestServerAction() {
		return openstackRequestServerActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpenstackRequestServerAction_Name() {
		return (EAttribute)openstackRequestServerActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpenstackRequestServerAction_Action() {
		return (EAttribute)openstackRequestServerActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpenstackRequestPoll() {
		return openstackRequestPollEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServer() {
		return serverEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServer_Id() {
		return (EAttribute)serverEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServer_Tenant_id() {
		return (EAttribute)serverEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServer_User_id() {
		return (EAttribute)serverEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServer_Name() {
		return (EAttribute)serverEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServer_Updated() {
		return (EAttribute)serverEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServer_Created() {
		return (EAttribute)serverEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServer_HostId() {
		return (EAttribute)serverEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServer_AccessIPv4() {
		return (EAttribute)serverEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServer_AccessIPv6() {
		return (EAttribute)serverEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServer_Status() {
		return (EAttribute)serverEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServer_Config_drive() {
		return (EAttribute)serverEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServer_Key_name() {
		return (EAttribute)serverEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServer_Progress() {
		return (EAttribute)serverEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServer_OS_DCF_diskConfig() {
		return (EAttribute)serverEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServer_OS_EXT_STS_power_state() {
		return (EAttribute)serverEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServer_OS_EXT_STS_vm_state() {
		return (EAttribute)serverEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServer_OS_EXT_STS_task_state() {
		return (EAttribute)serverEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServer_OS_EXT_SRV_ATTR_host() {
		return (EAttribute)serverEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServer_OS_EXT_SRV_ATTR_instance_name() {
		return (EAttribute)serverEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServer_OS_EXT_SRV_ATTR_hypervisor_hostname() {
		return (EAttribute)serverEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServer_OS_SRV_USG_launched_at() {
		return (EAttribute)serverEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServer_OS_SRV_USG_terminated_at() {
		return (EAttribute)serverEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServer_Image() {
		return (EReference)serverEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServer_Flavor() {
		return (EReference)serverEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServer_Addresses() {
		return (EReference)serverEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServer_Security_groups() {
		return (EReference)serverEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServer_Metadata() {
		return (EReference)serverEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServer_Links() {
		return (EReference)serverEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServer_Fault() {
		return (EReference)serverEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImage() {
		return imageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImage_Id() {
		return (EAttribute)imageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImage_Name() {
		return (EAttribute)imageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImage_Updated() {
		return (EAttribute)imageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImage_Created() {
		return (EAttribute)imageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImage_Tenant_id() {
		return (EAttribute)imageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImage_User_id() {
		return (EAttribute)imageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImage_Status() {
		return (EAttribute)imageEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImage_Progress() {
		return (EAttribute)imageEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImage_MinDisk() {
		return (EAttribute)imageEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImage_MinRam() {
		return (EAttribute)imageEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImage_OS_EXT_IMG_SIZE_size() {
		return (EAttribute)imageEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImage_Server() {
		return (EReference)imageEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImage_Links() {
		return (EReference)imageEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImage_Metadata() {
		return (EReference)imageEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlavor() {
		return flavorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlavor_Id() {
		return (EAttribute)flavorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlavor_Name() {
		return (EAttribute)flavorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlavor_Ram() {
		return (EAttribute)flavorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlavor_Disk() {
		return (EAttribute)flavorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlavor_Vcpus() {
		return (EAttribute)flavorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlavor_Swap() {
		return (EAttribute)flavorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlavor_Rxtx_factor() {
		return (EAttribute)flavorEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlavor_OS_FLV_EXT_DATA_ephemeral() {
		return (EAttribute)flavorEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlavor_OS_FLV_DISABLED_disabled() {
		return (EAttribute)flavorEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlavor_Os_flavor_access_is_public() {
		return (EAttribute)flavorEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlavor_Links() {
		return (EReference)flavorEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddresses() {
		return addressesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddresses_Name() {
		return (EAttribute)addressesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddresses_Ips() {
		return (EReference)addressesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddress() {
		return addressEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddress_Version() {
		return (EAttribute)addressEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddress_Addr() {
		return (EAttribute)addressEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddress_OS_EXT_IPS_MAC_mac_addr() {
		return (EAttribute)addressEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddress_OS_EXT_IPS_type() {
		return (EAttribute)addressEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLink() {
		return linkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLink_Rel() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLink_Href() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLink_Type() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetadata() {
		return metadataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetadata_Key() {
		return (EAttribute)metadataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetadata_Value() {
		return (EAttribute)metadataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFault() {
		return faultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFault_Message() {
		return (EAttribute)faultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFault_Created() {
		return (EAttribute)faultEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFault_Code() {
		return (EAttribute)faultEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersonality() {
		return personalityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonality_Path() {
		return (EAttribute)personalityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonality_Contents() {
		return (EAttribute)personalityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReference() {
		return referenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReference_Id() {
		return (EAttribute)referenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReference_Links() {
		return (EReference)referenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVolume() {
		return volumeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVolume_Status() {
		return (EAttribute)volumeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVolume_Display_name() {
		return (EAttribute)volumeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVolume_Attachments() {
		return (EReference)volumeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVolume_Availability_zone() {
		return (EAttribute)volumeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVolume_Created_at() {
		return (EAttribute)volumeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVolume_Volume_type() {
		return (EAttribute)volumeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVolume_Metadata() {
		return (EReference)volumeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVolume_Id() {
		return (EAttribute)volumeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVolume_Size() {
		return (EAttribute)volumeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVolume_Snapshot_id() {
		return (EAttribute)volumeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVolume_Display_description() {
		return (EAttribute)volumeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVolumeAttachment() {
		return volumeAttachmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVolumeAttachment_Device() {
		return (EAttribute)volumeAttachmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVolumeAttachment_Server_id() {
		return (EAttribute)volumeAttachmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVolumeAttachment_Id() {
		return (EAttribute)volumeAttachmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVolumeAttachment_Volume_id() {
		return (EAttribute)volumeAttachmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFloatingIp() {
		return floatingIpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFloatingIp_Instance_id() {
		return (EAttribute)floatingIpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFloatingIp_Ip() {
		return (EAttribute)floatingIpEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFloatingIp_Fixed_ip() {
		return (EAttribute)floatingIpEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFloatingIp_Id() {
		return (EAttribute)floatingIpEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFloatingIp_Pool() {
		return (EAttribute)floatingIpEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecurityGroup() {
		return securityGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityGroup_Rules() {
		return (EReference)securityGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityGroup_Tenant_id() {
		return (EAttribute)securityGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityGroup_Id() {
		return (EAttribute)securityGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityGroup_Description() {
		return (EAttribute)securityGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecurityRule() {
		return securityRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityRule_From_port() {
		return (EAttribute)securityRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityRule_Group() {
		return (EReference)securityRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityRule_Ip_protocol() {
		return (EAttribute)securityRuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityRule_To_port() {
		return (EAttribute)securityRuleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityRule_Parent_group_id() {
		return (EAttribute)securityRuleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityRule_Ip_range() {
		return (EReference)securityRuleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityRule_Id() {
		return (EAttribute)securityRuleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecurityRange() {
		return securityRangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityRange_Cidr() {
		return (EAttribute)securityRangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKeyPair() {
		return keyPairEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyPair_Public_key() {
		return (EAttribute)keyPairEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyPair_Name() {
		return (EAttribute)keyPairEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyPair_Fingerprint() {
		return (EAttribute)keyPairEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComputeFactory getComputeFactory() {
		return (ComputeFactory)getEFactoryInstance();
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
		computeServiceEClass = createEClass(COMPUTE_SERVICE);
		createEOperation(computeServiceEClass, COMPUTE_SERVICE___CREATE_SERVER__OPENSTACKREQUESTNEWSERVER);
		createEOperation(computeServiceEClass, COMPUTE_SERVICE___DELETE_SERVER__STRING_STRING);
		createEOperation(computeServiceEClass, COMPUTE_SERVICE___CREATE_KEY_PAIR__OPENSTACKREQUESTKEYPAIR);
		createEOperation(computeServiceEClass, COMPUTE_SERVICE___DELETE__OPENSTACKREQUESTDELETE);
		createEOperation(computeServiceEClass, COMPUTE_SERVICE___CREATE_FLAVOR__OPENSTACKREQUESTFLAVOR);
		createEOperation(computeServiceEClass, COMPUTE_SERVICE___CREATE_SECURITY_GROUP__OPENSTACKREQUESTSECURITYGROUP);
		createEOperation(computeServiceEClass, COMPUTE_SERVICE___SERVER_ACTION__OPENSTACKREQUESTSERVERACTION);
		createEOperation(computeServiceEClass, COMPUTE_SERVICE___DEPLOY_VM_TYPE__STRING_STRING);
		createEOperation(computeServiceEClass, COMPUTE_SERVICE___UNDEPLOY_VM_TYPE__STRING_STRING);
		createEOperation(computeServiceEClass, COMPUTE_SERVICE___DEPLOY_USER__USER_STRING);
		createEOperation(computeServiceEClass, COMPUTE_SERVICE___UNDEPLOY_USER__USER_STRING);

		openstackRequestNewServerEClass = createEClass(OPENSTACK_REQUEST_NEW_SERVER);
		createEAttribute(openstackRequestNewServerEClass, OPENSTACK_REQUEST_NEW_SERVER__NAME);
		createEAttribute(openstackRequestNewServerEClass, OPENSTACK_REQUEST_NEW_SERVER__HYPERVISOR);
		createEAttribute(openstackRequestNewServerEClass, OPENSTACK_REQUEST_NEW_SERVER__USER);
		createEAttribute(openstackRequestNewServerEClass, OPENSTACK_REQUEST_NEW_SERVER__NETWORKS);
		createEAttribute(openstackRequestNewServerEClass, OPENSTACK_REQUEST_NEW_SERVER__PORTS);
		createEAttribute(openstackRequestNewServerEClass, OPENSTACK_REQUEST_NEW_SERVER__USER_DATA);
		createEAttribute(openstackRequestNewServerEClass, OPENSTACK_REQUEST_NEW_SERVER__FLOATING_IP);
		createEReference(openstackRequestNewServerEClass, OPENSTACK_REQUEST_NEW_SERVER__VM_TYPE);

		openstackRequestKeyPairEClass = createEClass(OPENSTACK_REQUEST_KEY_PAIR);
		createEReference(openstackRequestKeyPairEClass, OPENSTACK_REQUEST_KEY_PAIR__USER);

		openstackRequestFlavorEClass = createEClass(OPENSTACK_REQUEST_FLAVOR);
		createEReference(openstackRequestFlavorEClass, OPENSTACK_REQUEST_FLAVOR__VM_TYPE);

		openstackRequestSecurityGroupEClass = createEClass(OPENSTACK_REQUEST_SECURITY_GROUP);
		createEReference(openstackRequestSecurityGroupEClass, OPENSTACK_REQUEST_SECURITY_GROUP__VM_TYPE);

		openstackRequestServerActionEClass = createEClass(OPENSTACK_REQUEST_SERVER_ACTION);
		createEAttribute(openstackRequestServerActionEClass, OPENSTACK_REQUEST_SERVER_ACTION__NAME);
		createEAttribute(openstackRequestServerActionEClass, OPENSTACK_REQUEST_SERVER_ACTION__ACTION);

		openstackRequestPollEClass = createEClass(OPENSTACK_REQUEST_POLL);

		serverEClass = createEClass(SERVER);
		createEAttribute(serverEClass, SERVER__ID);
		createEAttribute(serverEClass, SERVER__TENANT_ID);
		createEAttribute(serverEClass, SERVER__USER_ID);
		createEAttribute(serverEClass, SERVER__NAME);
		createEAttribute(serverEClass, SERVER__UPDATED);
		createEAttribute(serverEClass, SERVER__CREATED);
		createEAttribute(serverEClass, SERVER__HOST_ID);
		createEAttribute(serverEClass, SERVER__ACCESS_IPV4);
		createEAttribute(serverEClass, SERVER__ACCESS_IPV6);
		createEAttribute(serverEClass, SERVER__STATUS);
		createEAttribute(serverEClass, SERVER__CONFIG_DRIVE);
		createEAttribute(serverEClass, SERVER__KEY_NAME);
		createEAttribute(serverEClass, SERVER__PROGRESS);
		createEAttribute(serverEClass, SERVER__OS_DCF_DISK_CONFIG);
		createEAttribute(serverEClass, SERVER__OS_EXT_STS_POWER_STATE);
		createEAttribute(serverEClass, SERVER__OS_EXT_STS_VM_STATE);
		createEAttribute(serverEClass, SERVER__OS_EXT_STS_TASK_STATE);
		createEAttribute(serverEClass, SERVER__OS_EXT_SRV_ATTR_HOST);
		createEAttribute(serverEClass, SERVER__OS_EXT_SRV_ATTR_INSTANCE_NAME);
		createEAttribute(serverEClass, SERVER__OS_EXT_SRV_ATTR_HYPERVISOR_HOSTNAME);
		createEAttribute(serverEClass, SERVER__OS_SRV_USG_LAUNCHED_AT);
		createEAttribute(serverEClass, SERVER__OS_SRV_USG_TERMINATED_AT);
		createEReference(serverEClass, SERVER__IMAGE);
		createEReference(serverEClass, SERVER__FLAVOR);
		createEReference(serverEClass, SERVER__ADDRESSES);
		createEReference(serverEClass, SERVER__SECURITY_GROUPS);
		createEReference(serverEClass, SERVER__METADATA);
		createEReference(serverEClass, SERVER__LINKS);
		createEReference(serverEClass, SERVER__FAULT);

		imageEClass = createEClass(IMAGE);
		createEAttribute(imageEClass, IMAGE__ID);
		createEAttribute(imageEClass, IMAGE__NAME);
		createEAttribute(imageEClass, IMAGE__UPDATED);
		createEAttribute(imageEClass, IMAGE__CREATED);
		createEAttribute(imageEClass, IMAGE__TENANT_ID);
		createEAttribute(imageEClass, IMAGE__USER_ID);
		createEAttribute(imageEClass, IMAGE__STATUS);
		createEAttribute(imageEClass, IMAGE__PROGRESS);
		createEAttribute(imageEClass, IMAGE__MIN_DISK);
		createEAttribute(imageEClass, IMAGE__MIN_RAM);
		createEAttribute(imageEClass, IMAGE__OS_EXT_IMG_SIZE_SIZE);
		createEReference(imageEClass, IMAGE__SERVER);
		createEReference(imageEClass, IMAGE__LINKS);
		createEReference(imageEClass, IMAGE__METADATA);

		flavorEClass = createEClass(FLAVOR);
		createEAttribute(flavorEClass, FLAVOR__ID);
		createEAttribute(flavorEClass, FLAVOR__NAME);
		createEAttribute(flavorEClass, FLAVOR__RAM);
		createEAttribute(flavorEClass, FLAVOR__DISK);
		createEAttribute(flavorEClass, FLAVOR__VCPUS);
		createEAttribute(flavorEClass, FLAVOR__SWAP);
		createEAttribute(flavorEClass, FLAVOR__RXTX_FACTOR);
		createEAttribute(flavorEClass, FLAVOR__OS_FLV_EXT_DATA_EPHEMERAL);
		createEAttribute(flavorEClass, FLAVOR__OS_FLV_DISABLED_DISABLED);
		createEAttribute(flavorEClass, FLAVOR__OS_FLAVOR_ACCESS_IS_PUBLIC);
		createEReference(flavorEClass, FLAVOR__LINKS);

		addressesEClass = createEClass(ADDRESSES);
		createEAttribute(addressesEClass, ADDRESSES__NAME);
		createEReference(addressesEClass, ADDRESSES__IPS);

		addressEClass = createEClass(ADDRESS);
		createEAttribute(addressEClass, ADDRESS__VERSION);
		createEAttribute(addressEClass, ADDRESS__ADDR);
		createEAttribute(addressEClass, ADDRESS__OS_EXT_IPS_MAC_MAC_ADDR);
		createEAttribute(addressEClass, ADDRESS__OS_EXT_IPS_TYPE);

		linkEClass = createEClass(LINK);
		createEAttribute(linkEClass, LINK__REL);
		createEAttribute(linkEClass, LINK__HREF);
		createEAttribute(linkEClass, LINK__TYPE);

		metadataEClass = createEClass(METADATA);
		createEAttribute(metadataEClass, METADATA__KEY);
		createEAttribute(metadataEClass, METADATA__VALUE);

		faultEClass = createEClass(FAULT);
		createEAttribute(faultEClass, FAULT__MESSAGE);
		createEAttribute(faultEClass, FAULT__CREATED);
		createEAttribute(faultEClass, FAULT__CODE);

		personalityEClass = createEClass(PERSONALITY);
		createEAttribute(personalityEClass, PERSONALITY__PATH);
		createEAttribute(personalityEClass, PERSONALITY__CONTENTS);

		referenceEClass = createEClass(REFERENCE);
		createEAttribute(referenceEClass, REFERENCE__ID);
		createEReference(referenceEClass, REFERENCE__LINKS);

		volumeEClass = createEClass(VOLUME);
		createEAttribute(volumeEClass, VOLUME__STATUS);
		createEAttribute(volumeEClass, VOLUME__DISPLAY_NAME);
		createEReference(volumeEClass, VOLUME__ATTACHMENTS);
		createEAttribute(volumeEClass, VOLUME__AVAILABILITY_ZONE);
		createEAttribute(volumeEClass, VOLUME__CREATED_AT);
		createEAttribute(volumeEClass, VOLUME__VOLUME_TYPE);
		createEReference(volumeEClass, VOLUME__METADATA);
		createEAttribute(volumeEClass, VOLUME__ID);
		createEAttribute(volumeEClass, VOLUME__SIZE);
		createEAttribute(volumeEClass, VOLUME__SNAPSHOT_ID);
		createEAttribute(volumeEClass, VOLUME__DISPLAY_DESCRIPTION);

		volumeAttachmentEClass = createEClass(VOLUME_ATTACHMENT);
		createEAttribute(volumeAttachmentEClass, VOLUME_ATTACHMENT__DEVICE);
		createEAttribute(volumeAttachmentEClass, VOLUME_ATTACHMENT__SERVER_ID);
		createEAttribute(volumeAttachmentEClass, VOLUME_ATTACHMENT__ID);
		createEAttribute(volumeAttachmentEClass, VOLUME_ATTACHMENT__VOLUME_ID);

		floatingIpEClass = createEClass(FLOATING_IP);
		createEAttribute(floatingIpEClass, FLOATING_IP__INSTANCE_ID);
		createEAttribute(floatingIpEClass, FLOATING_IP__IP);
		createEAttribute(floatingIpEClass, FLOATING_IP__FIXED_IP);
		createEAttribute(floatingIpEClass, FLOATING_IP__ID);
		createEAttribute(floatingIpEClass, FLOATING_IP__POOL);

		securityGroupEClass = createEClass(SECURITY_GROUP);
		createEReference(securityGroupEClass, SECURITY_GROUP__RULES);
		createEAttribute(securityGroupEClass, SECURITY_GROUP__TENANT_ID);
		createEAttribute(securityGroupEClass, SECURITY_GROUP__ID);
		createEAttribute(securityGroupEClass, SECURITY_GROUP__DESCRIPTION);

		securityRuleEClass = createEClass(SECURITY_RULE);
		createEAttribute(securityRuleEClass, SECURITY_RULE__FROM_PORT);
		createEReference(securityRuleEClass, SECURITY_RULE__GROUP);
		createEAttribute(securityRuleEClass, SECURITY_RULE__IP_PROTOCOL);
		createEAttribute(securityRuleEClass, SECURITY_RULE__TO_PORT);
		createEAttribute(securityRuleEClass, SECURITY_RULE__PARENT_GROUP_ID);
		createEReference(securityRuleEClass, SECURITY_RULE__IP_RANGE);
		createEAttribute(securityRuleEClass, SECURITY_RULE__ID);

		securityRangeEClass = createEClass(SECURITY_RANGE);
		createEAttribute(securityRangeEClass, SECURITY_RANGE__CIDR);

		keyPairEClass = createEClass(KEY_PAIR);
		createEAttribute(keyPairEClass, KEY_PAIR__PUBLIC_KEY);
		createEAttribute(keyPairEClass, KEY_PAIR__NAME);
		createEAttribute(keyPairEClass, KEY_PAIR__FINGERPRINT);
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
		org.openecomp.ncomp.core.CorePackage theCorePackage_1 = (org.openecomp.ncomp.core.CorePackage)EPackage.Registry.INSTANCE.getEPackage(org.openecomp.ncomp.core.CorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		openstackRequestNewServerEClass.getESuperTypes().add(theCorePackage.getOpenStackRequest());
		openstackRequestKeyPairEClass.getESuperTypes().add(theCorePackage.getOpenStackRequest());
		openstackRequestFlavorEClass.getESuperTypes().add(theCorePackage.getOpenStackRequest());
		openstackRequestSecurityGroupEClass.getESuperTypes().add(theCorePackage.getOpenStackRequest());
		openstackRequestServerActionEClass.getESuperTypes().add(theCorePackage.getOpenStackRequest());
		openstackRequestPollEClass.getESuperTypes().add(theCorePackage.getOpenStackRequest());
		volumeEClass.getESuperTypes().add(theCorePackage_1.getNamedEntity());
		securityGroupEClass.getESuperTypes().add(theCorePackage_1.getNamedEntity());

		// Initialize classes, features, and operations; add parameters
		initEClass(computeServiceEClass, ComputeService.class, "ComputeService", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getComputeService__CreateServer__OpenstackRequestNewServer(), null, "createServer", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getOpenstackRequestNewServer(), "request", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getComputeService__DeleteServer__String_String(), null, "deleteServer", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "projectName", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getComputeService__CreateKeyPair__OpenstackRequestKeyPair(), null, "createKeyPair", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getOpenstackRequestKeyPair(), "request", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getComputeService__Delete__OpenstackRequestDelete(), null, "delete", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCorePackage.getOpenstackRequestDelete(), "request", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getComputeService__CreateFlavor__OpenstackRequestFlavor(), null, "createFlavor", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getOpenstackRequestFlavor(), "request", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getComputeService__CreateSecurityGroup__OpenstackRequestSecurityGroup(), null, "createSecurityGroup", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getOpenstackRequestSecurityGroup(), "request", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getComputeService__ServerAction__OpenstackRequestServerAction(), null, "serverAction", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getOpenstackRequestServerAction(), "request", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getComputeService__DeployVmType__String_String(), null, "deployVmType", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "vmTypeName", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "projectName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getComputeService__UndeployVmType__String_String(), null, "undeployVmType", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "vmTypeName", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "projectName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getComputeService__DeployUser__User_String(), null, "deployUser", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCorePackage_1.getUser(), "user", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "projectName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getComputeService__UndeployUser__User_String(), null, "undeployUser", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCorePackage_1.getUser(), "user", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "projectName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(openstackRequestNewServerEClass, OpenstackRequestNewServer.class, "OpenstackRequestNewServer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOpenstackRequestNewServer_Name(), theEcorePackage.getEString(), "name", null, 0, 1, OpenstackRequestNewServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOpenstackRequestNewServer_Hypervisor(), theEcorePackage.getEString(), "hypervisor", null, 0, 1, OpenstackRequestNewServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOpenstackRequestNewServer_User(), theEcorePackage.getEString(), "user", null, 0, 1, OpenstackRequestNewServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOpenstackRequestNewServer_Networks(), theEcorePackage.getEString(), "networks", null, 0, -1, OpenstackRequestNewServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOpenstackRequestNewServer_Ports(), theEcorePackage.getEString(), "ports", null, 0, -1, OpenstackRequestNewServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOpenstackRequestNewServer_User_data(), theEcorePackage.getEString(), "user_data", null, 0, 1, OpenstackRequestNewServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOpenstackRequestNewServer_FloatingIp(), theEcorePackage.getEString(), "floatingIp", null, 0, 1, OpenstackRequestNewServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOpenstackRequestNewServer_VmType(), theCorePackage.getVirtualMachineType(), null, "vmType", null, 0, 1, OpenstackRequestNewServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(openstackRequestKeyPairEClass, OpenstackRequestKeyPair.class, "OpenstackRequestKeyPair", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOpenstackRequestKeyPair_User(), theCorePackage_1.getUser(), null, "user", null, 0, 1, OpenstackRequestKeyPair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(openstackRequestFlavorEClass, OpenstackRequestFlavor.class, "OpenstackRequestFlavor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOpenstackRequestFlavor_VmType(), theCorePackage.getVirtualMachineType(), null, "vmType", null, 0, 1, OpenstackRequestFlavor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(openstackRequestSecurityGroupEClass, OpenstackRequestSecurityGroup.class, "OpenstackRequestSecurityGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOpenstackRequestSecurityGroup_VmType(), theCorePackage.getVirtualMachineType(), null, "vmType", null, 0, 1, OpenstackRequestSecurityGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(openstackRequestServerActionEClass, OpenstackRequestServerAction.class, "OpenstackRequestServerAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOpenstackRequestServerAction_Name(), theEcorePackage.getEString(), "name", null, 0, 1, OpenstackRequestServerAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOpenstackRequestServerAction_Action(), theEcorePackage.getEString(), "action", null, 0, 1, OpenstackRequestServerAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(openstackRequestPollEClass, OpenstackRequestPoll.class, "OpenstackRequestPoll", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(serverEClass, Server.class, "Server", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServer_Id(), theEcorePackage.getEString(), "id", null, 0, 1, Server.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServer_Tenant_id(), theEcorePackage.getEString(), "tenant_id", null, 0, 1, Server.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServer_User_id(), theEcorePackage.getEString(), "user_id", null, 0, 1, Server.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServer_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Server.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServer_Updated(), theEcorePackage.getEString(), "updated", null, 0, 1, Server.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServer_Created(), theEcorePackage.getEString(), "created", null, 0, 1, Server.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServer_HostId(), theEcorePackage.getEString(), "hostId", null, 0, 1, Server.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServer_AccessIPv4(), theEcorePackage.getEString(), "accessIPv4", null, 0, 1, Server.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServer_AccessIPv6(), theEcorePackage.getEString(), "accessIPv6", null, 0, 1, Server.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServer_Status(), theEcorePackage.getEString(), "status", null, 0, 1, Server.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServer_Config_drive(), theEcorePackage.getEString(), "config_drive", null, 0, 1, Server.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServer_Key_name(), theEcorePackage.getEString(), "key_name", null, 0, 1, Server.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServer_Progress(), theEcorePackage.getEInt(), "progress", null, 0, 1, Server.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServer_OS_DCF_diskConfig(), theEcorePackage.getEString(), "OS_DCF_diskConfig", null, 0, 1, Server.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServer_OS_EXT_STS_power_state(), theEcorePackage.getEInt(), "OS_EXT_STS_power_state", null, 0, 1, Server.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServer_OS_EXT_STS_vm_state(), theEcorePackage.getEString(), "OS_EXT_STS_vm_state", null, 0, 1, Server.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServer_OS_EXT_STS_task_state(), theEcorePackage.getEString(), "OS_EXT_STS_task_state", null, 0, 1, Server.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServer_OS_EXT_SRV_ATTR_host(), theEcorePackage.getEString(), "OS_EXT_SRV_ATTR_host", null, 0, 1, Server.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServer_OS_EXT_SRV_ATTR_instance_name(), theEcorePackage.getEString(), "OS_EXT_SRV_ATTR_instance_name", null, 0, 1, Server.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServer_OS_EXT_SRV_ATTR_hypervisor_hostname(), theEcorePackage.getEString(), "OS_EXT_SRV_ATTR_hypervisor_hostname", null, 0, 1, Server.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServer_OS_SRV_USG_launched_at(), theEcorePackage.getEString(), "OS_SRV_USG_launched_at", null, 0, 1, Server.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServer_OS_SRV_USG_terminated_at(), theEcorePackage.getEString(), "OS_SRV_USG_terminated_at", null, 0, 1, Server.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServer_Image(), this.getReference(), null, "image", null, 0, 1, Server.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServer_Flavor(), this.getReference(), null, "flavor", null, 0, 1, Server.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServer_Addresses(), this.getAddresses(), null, "addresses", null, 0, -1, Server.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServer_Security_groups(), this.getSecurityGroup(), null, "security_groups", null, 0, -1, Server.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServer_Metadata(), this.getMetadata(), null, "metadata", null, 0, -1, Server.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServer_Links(), this.getLink(), null, "links", null, 0, -1, Server.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServer_Fault(), this.getFault(), null, "fault", null, 0, 1, Server.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(imageEClass, Image.class, "Image", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImage_Id(), theEcorePackage.getEString(), "id", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImage_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImage_Updated(), theEcorePackage.getEString(), "updated", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImage_Created(), theEcorePackage.getEString(), "created", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImage_Tenant_id(), theEcorePackage.getEString(), "tenant_id", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImage_User_id(), theEcorePackage.getEString(), "user_id", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImage_Status(), theEcorePackage.getEString(), "status", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImage_Progress(), theEcorePackage.getELongObject(), "progress", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImage_MinDisk(), theEcorePackage.getELongObject(), "minDisk", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImage_MinRam(), theEcorePackage.getELongObject(), "minRam", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImage_OS_EXT_IMG_SIZE_size(), theEcorePackage.getELongObject(), "OS_EXT_IMG_SIZE_size", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImage_Server(), this.getReference(), null, "server", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImage_Links(), this.getLink(), null, "links", null, 0, -1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImage_Metadata(), this.getMetadata(), null, "metadata", null, 0, -1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(flavorEClass, Flavor.class, "Flavor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFlavor_Id(), theEcorePackage.getEString(), "id", null, 0, 1, Flavor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlavor_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Flavor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlavor_Ram(), theEcorePackage.getEInt(), "ram", null, 0, 1, Flavor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlavor_Disk(), theEcorePackage.getEInt(), "disk", null, 0, 1, Flavor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlavor_Vcpus(), theEcorePackage.getEInt(), "vcpus", null, 0, 1, Flavor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlavor_Swap(), theEcorePackage.getEString(), "swap", null, 0, 1, Flavor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlavor_Rxtx_factor(), theEcorePackage.getEDouble(), "rxtx_factor", null, 0, 1, Flavor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlavor_OS_FLV_EXT_DATA_ephemeral(), theEcorePackage.getEInt(), "OS_FLV_EXT_DATA_ephemeral", null, 0, 1, Flavor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlavor_OS_FLV_DISABLED_disabled(), theEcorePackage.getEBoolean(), "OS_FLV_DISABLED_disabled", null, 0, 1, Flavor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlavor_Os_flavor_access_is_public(), theEcorePackage.getEBoolean(), "os_flavor_access_is_public", null, 0, 1, Flavor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlavor_Links(), this.getLink(), null, "links", null, 0, -1, Flavor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addressesEClass, Addresses.class, "Addresses", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddresses_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Addresses.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAddresses_Ips(), this.getAddress(), null, "ips", null, 0, -1, Addresses.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addressEClass, Address.class, "Address", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddress_Version(), theEcorePackage.getEInt(), "version", null, 0, 1, Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddress_Addr(), theEcorePackage.getEString(), "addr", null, 0, 1, Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddress_OS_EXT_IPS_MAC_mac_addr(), theEcorePackage.getEString(), "OS_EXT_IPS_MAC_mac_addr", null, 0, 1, Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddress_OS_EXT_IPS_type(), theEcorePackage.getEString(), "OS_EXT_IPS_type", null, 0, 1, Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkEClass, Link.class, "Link", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLink_Rel(), theEcorePackage.getEString(), "rel", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLink_Href(), theEcorePackage.getEString(), "href", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLink_Type(), theEcorePackage.getEString(), "type", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metadataEClass, Metadata.class, "Metadata", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMetadata_Key(), theEcorePackage.getEString(), "key", null, 0, 1, Metadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetadata_Value(), theEcorePackage.getEString(), "value", null, 0, 1, Metadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(faultEClass, Fault.class, "Fault", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFault_Message(), theEcorePackage.getEString(), "message", null, 0, 1, Fault.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFault_Created(), theEcorePackage.getEString(), "created", null, 0, 1, Fault.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFault_Code(), theEcorePackage.getEInt(), "code", null, 0, 1, Fault.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(personalityEClass, Personality.class, "Personality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPersonality_Path(), theEcorePackage.getEString(), "path", null, 0, 1, Personality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersonality_Contents(), theEcorePackage.getEString(), "contents", null, 0, 1, Personality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referenceEClass, Reference.class, "Reference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReference_Id(), theEcorePackage.getEString(), "id", null, 0, 1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReference_Links(), this.getLink(), null, "links", null, 0, -1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(volumeEClass, Volume.class, "Volume", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVolume_Status(), theEcorePackage.getEString(), "status", null, 0, 1, Volume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVolume_Display_name(), theEcorePackage.getEString(), "display_name", null, 0, 1, Volume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVolume_Attachments(), this.getVolumeAttachment(), null, "attachments", null, 0, -1, Volume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVolume_Availability_zone(), theEcorePackage.getEString(), "availability_zone", null, 0, 1, Volume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVolume_Created_at(), theEcorePackage.getEString(), "created_at", null, 0, 1, Volume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVolume_Volume_type(), theEcorePackage.getEString(), "volume_type", null, 0, 1, Volume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVolume_Metadata(), this.getMetadata(), null, "metadata", null, 0, -1, Volume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVolume_Id(), theEcorePackage.getEString(), "id", null, 0, 1, Volume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVolume_Size(), theEcorePackage.getEInt(), "size", null, 0, 1, Volume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVolume_Snapshot_id(), theEcorePackage.getEString(), "snapshot_id", null, 0, 1, Volume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVolume_Display_description(), theEcorePackage.getEString(), "display_description", null, 0, 1, Volume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(volumeAttachmentEClass, VolumeAttachment.class, "VolumeAttachment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVolumeAttachment_Device(), theEcorePackage.getEString(), "device", null, 0, 1, VolumeAttachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVolumeAttachment_Server_id(), theEcorePackage.getEString(), "server_id", null, 0, 1, VolumeAttachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVolumeAttachment_Id(), theEcorePackage.getEString(), "id", null, 0, 1, VolumeAttachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVolumeAttachment_Volume_id(), theEcorePackage.getEString(), "volume_id", null, 0, 1, VolumeAttachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(floatingIpEClass, FloatingIp.class, "FloatingIp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFloatingIp_Instance_id(), theEcorePackage.getEString(), "instance_id", null, 0, 1, FloatingIp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFloatingIp_Ip(), theEcorePackage.getEString(), "ip", null, 0, 1, FloatingIp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFloatingIp_Fixed_ip(), theEcorePackage.getEString(), "fixed_ip", null, 0, 1, FloatingIp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFloatingIp_Id(), theEcorePackage.getEString(), "id", null, 0, 1, FloatingIp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFloatingIp_Pool(), theEcorePackage.getEString(), "pool", null, 0, 1, FloatingIp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(securityGroupEClass, SecurityGroup.class, "SecurityGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSecurityGroup_Rules(), this.getSecurityRule(), null, "rules", null, 0, -1, SecurityGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityGroup_Tenant_id(), theEcorePackage.getEString(), "tenant_id", null, 0, 1, SecurityGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityGroup_Id(), theEcorePackage.getEString(), "id", null, 0, 1, SecurityGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityGroup_Description(), theEcorePackage.getEString(), "description", null, 0, 1, SecurityGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(securityRuleEClass, SecurityRule.class, "SecurityRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSecurityRule_From_port(), theEcorePackage.getEIntegerObject(), "from_port", null, 0, 1, SecurityRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSecurityRule_Group(), this.getSecurityGroup(), null, "group", null, 0, 1, SecurityRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityRule_Ip_protocol(), theEcorePackage.getEString(), "ip_protocol", null, 0, 1, SecurityRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityRule_To_port(), theEcorePackage.getEIntegerObject(), "to_port", null, 0, 1, SecurityRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityRule_Parent_group_id(), theEcorePackage.getEString(), "parent_group_id", null, 0, 1, SecurityRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSecurityRule_Ip_range(), this.getSecurityRange(), null, "ip_range", null, 0, 1, SecurityRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityRule_Id(), theEcorePackage.getEString(), "id", null, 0, 1, SecurityRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(securityRangeEClass, SecurityRange.class, "SecurityRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSecurityRange_Cidr(), theEcorePackage.getEString(), "cidr", null, 0, 1, SecurityRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(keyPairEClass, KeyPair.class, "KeyPair", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKeyPair_Public_key(), theEcorePackage.getEString(), "public_key", null, 0, 1, KeyPair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeyPair_Name(), theEcorePackage.getEString(), "name", null, 0, 1, KeyPair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeyPair_Fingerprint(), theEcorePackage.getEString(), "fingerprint", null, 0, 1, KeyPair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ComputePackageImpl
