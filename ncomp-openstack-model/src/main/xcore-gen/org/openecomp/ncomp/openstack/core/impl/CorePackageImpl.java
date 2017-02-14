
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
package org.openecomp.ncomp.openstack.core.impl;

import org.openecomp.ncomp.openstack.core.CoreFactory;
import org.openecomp.ncomp.openstack.core.CorePackage;
import org.openecomp.ncomp.openstack.core.OpenStackRequest;
import org.openecomp.ncomp.openstack.core.OpenstackRequestDelete;
import org.openecomp.ncomp.openstack.core.OpenstackRequestPoll;
import org.openecomp.ncomp.openstack.core.SecurityRule;
import org.openecomp.ncomp.openstack.core.SecurityRuleProtocol;
import org.openecomp.ncomp.openstack.core.VirtualMachineType;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
public class CorePackageImpl extends EPackageImpl implements CorePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass openStackRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass openstackRequestDeleteEClass = null;

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
	private EClass virtualMachineTypeEClass = null;

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
	private EEnum securityRuleProtocolEEnum = null;

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
	 * @see org.openecomp.ncomp.openstack.core.CorePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CorePackageImpl() {
		super(eNS_URI, CoreFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CorePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CorePackage init() {
		if (isInited) return (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);

		// Obtain or create and register package
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CorePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		org.openecomp.ncomp.core.CorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCorePackage.createPackageContents();

		// Initialize created meta-data
		theCorePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCorePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CorePackage.eNS_URI, theCorePackage);
		return theCorePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpenStackRequest() {
		return openStackRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpenStackRequest_ProjectName() {
		return (EAttribute)openStackRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpenstackRequestDelete() {
		return openstackRequestDeleteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpenstackRequestDelete_ObjectType() {
		return (EAttribute)openstackRequestDeleteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpenstackRequestDelete_ObjectName() {
		return (EAttribute)openstackRequestDeleteEClass.getEStructuralFeatures().get(1);
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
	public EClass getVirtualMachineType() {
		return virtualMachineTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVirtualMachineType_Description() {
		return (EAttribute)virtualMachineTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVirtualMachineType_NumberOfCores() {
		return (EAttribute)virtualMachineTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVirtualMachineType_MemorySizeMB() {
		return (EAttribute)virtualMachineTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVirtualMachineType_RootDiskSizeGB() {
		return (EAttribute)virtualMachineTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVirtualMachineType_DiskSizeGB() {
		return (EAttribute)virtualMachineTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVirtualMachineType_VolumeSizeGB() {
		return (EAttribute)virtualMachineTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVirtualMachineType_ImageName() {
		return (EAttribute)virtualMachineTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVirtualMachineType_FlavorName() {
		return (EAttribute)virtualMachineTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVirtualMachineType_NeedPublicIp() {
		return (EAttribute)virtualMachineTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVirtualMachineType_DeploymentStatus() {
		return (EAttribute)virtualMachineTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVirtualMachineType_IncomingSecurityRules() {
		return (EReference)virtualMachineTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVirtualMachineType_OutboundSecurityRules() {
		return (EReference)virtualMachineTypeEClass.getEStructuralFeatures().get(11);
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
	public EAttribute getSecurityRule_PortRangeStart() {
		return (EAttribute)securityRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityRule_PortRangeEnd() {
		return (EAttribute)securityRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityRule_Prefix() {
		return (EAttribute)securityRuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityRule_IpProtocol() {
		return (EAttribute)securityRuleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSecurityRuleProtocol() {
		return securityRuleProtocolEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreFactory getCoreFactory() {
		return (CoreFactory)getEFactoryInstance();
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
		openStackRequestEClass = createEClass(OPEN_STACK_REQUEST);
		createEAttribute(openStackRequestEClass, OPEN_STACK_REQUEST__PROJECT_NAME);

		openstackRequestDeleteEClass = createEClass(OPENSTACK_REQUEST_DELETE);
		createEAttribute(openstackRequestDeleteEClass, OPENSTACK_REQUEST_DELETE__OBJECT_TYPE);
		createEAttribute(openstackRequestDeleteEClass, OPENSTACK_REQUEST_DELETE__OBJECT_NAME);

		openstackRequestPollEClass = createEClass(OPENSTACK_REQUEST_POLL);

		virtualMachineTypeEClass = createEClass(VIRTUAL_MACHINE_TYPE);
		createEAttribute(virtualMachineTypeEClass, VIRTUAL_MACHINE_TYPE__DESCRIPTION);
		createEAttribute(virtualMachineTypeEClass, VIRTUAL_MACHINE_TYPE__NUMBER_OF_CORES);
		createEAttribute(virtualMachineTypeEClass, VIRTUAL_MACHINE_TYPE__MEMORY_SIZE_MB);
		createEAttribute(virtualMachineTypeEClass, VIRTUAL_MACHINE_TYPE__ROOT_DISK_SIZE_GB);
		createEAttribute(virtualMachineTypeEClass, VIRTUAL_MACHINE_TYPE__DISK_SIZE_GB);
		createEAttribute(virtualMachineTypeEClass, VIRTUAL_MACHINE_TYPE__VOLUME_SIZE_GB);
		createEAttribute(virtualMachineTypeEClass, VIRTUAL_MACHINE_TYPE__IMAGE_NAME);
		createEAttribute(virtualMachineTypeEClass, VIRTUAL_MACHINE_TYPE__FLAVOR_NAME);
		createEAttribute(virtualMachineTypeEClass, VIRTUAL_MACHINE_TYPE__NEED_PUBLIC_IP);
		createEAttribute(virtualMachineTypeEClass, VIRTUAL_MACHINE_TYPE__DEPLOYMENT_STATUS);
		createEReference(virtualMachineTypeEClass, VIRTUAL_MACHINE_TYPE__INCOMING_SECURITY_RULES);
		createEReference(virtualMachineTypeEClass, VIRTUAL_MACHINE_TYPE__OUTBOUND_SECURITY_RULES);

		securityRuleEClass = createEClass(SECURITY_RULE);
		createEAttribute(securityRuleEClass, SECURITY_RULE__PORT_RANGE_START);
		createEAttribute(securityRuleEClass, SECURITY_RULE__PORT_RANGE_END);
		createEAttribute(securityRuleEClass, SECURITY_RULE__PREFIX);
		createEAttribute(securityRuleEClass, SECURITY_RULE__IP_PROTOCOL);

		// Create enums
		securityRuleProtocolEEnum = createEEnum(SECURITY_RULE_PROTOCOL);
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
		org.openecomp.ncomp.core.CorePackage theCorePackage_1 = (org.openecomp.ncomp.core.CorePackage)EPackage.Registry.INSTANCE.getEPackage(org.openecomp.ncomp.core.CorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		openstackRequestDeleteEClass.getESuperTypes().add(this.getOpenStackRequest());
		openstackRequestPollEClass.getESuperTypes().add(this.getOpenStackRequest());
		virtualMachineTypeEClass.getESuperTypes().add(theCorePackage_1.getNamedEntity());
		securityRuleEClass.getESuperTypes().add(theCorePackage_1.getNamedEntity());

		// Initialize classes, features, and operations; add parameters
		initEClass(openStackRequestEClass, OpenStackRequest.class, "OpenStackRequest", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOpenStackRequest_ProjectName(), theEcorePackage.getEString(), "projectName", null, 0, 1, OpenStackRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(openstackRequestDeleteEClass, OpenstackRequestDelete.class, "OpenstackRequestDelete", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOpenstackRequestDelete_ObjectType(), theEcorePackage.getEString(), "objectType", null, 0, 1, OpenstackRequestDelete.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOpenstackRequestDelete_ObjectName(), theEcorePackage.getEString(), "objectName", null, 0, 1, OpenstackRequestDelete.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(openstackRequestPollEClass, OpenstackRequestPoll.class, "OpenstackRequestPoll", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(virtualMachineTypeEClass, VirtualMachineType.class, "VirtualMachineType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVirtualMachineType_Description(), theEcorePackage.getEString(), "description", null, 0, 1, VirtualMachineType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVirtualMachineType_NumberOfCores(), theEcorePackage.getEInt(), "numberOfCores", null, 0, 1, VirtualMachineType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVirtualMachineType_MemorySizeMB(), theEcorePackage.getEInt(), "memorySizeMB", null, 0, 1, VirtualMachineType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVirtualMachineType_RootDiskSizeGB(), theEcorePackage.getEInt(), "rootDiskSizeGB", null, 0, 1, VirtualMachineType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVirtualMachineType_DiskSizeGB(), theEcorePackage.getEInt(), "diskSizeGB", null, 0, 1, VirtualMachineType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVirtualMachineType_VolumeSizeGB(), theEcorePackage.getEInt(), "volumeSizeGB", null, 0, 1, VirtualMachineType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVirtualMachineType_ImageName(), theEcorePackage.getEString(), "imageName", null, 0, 1, VirtualMachineType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVirtualMachineType_FlavorName(), theEcorePackage.getEString(), "flavorName", null, 0, 1, VirtualMachineType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVirtualMachineType_NeedPublicIp(), theEcorePackage.getEBoolean(), "needPublicIp", null, 0, 1, VirtualMachineType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVirtualMachineType_DeploymentStatus(), theCorePackage_1.getDeploymentStatus(), "deploymentStatus", null, 0, 1, VirtualMachineType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVirtualMachineType_IncomingSecurityRules(), this.getSecurityRule(), null, "incomingSecurityRules", null, 0, -1, VirtualMachineType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVirtualMachineType_OutboundSecurityRules(), this.getSecurityRule(), null, "outboundSecurityRules", null, 0, -1, VirtualMachineType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(securityRuleEClass, SecurityRule.class, "SecurityRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSecurityRule_PortRangeStart(), theEcorePackage.getEIntegerObject(), "portRangeStart", null, 0, 1, SecurityRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityRule_PortRangeEnd(), theEcorePackage.getEIntegerObject(), "portRangeEnd", null, 0, 1, SecurityRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityRule_Prefix(), theEcorePackage.getEString(), "prefix", null, 0, 1, SecurityRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityRule_IpProtocol(), this.getSecurityRuleProtocol(), "ipProtocol", null, 0, 1, SecurityRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(securityRuleProtocolEEnum, SecurityRuleProtocol.class, "SecurityRuleProtocol");
		addEEnumLiteral(securityRuleProtocolEEnum, SecurityRuleProtocol.NONE);
		addEEnumLiteral(securityRuleProtocolEEnum, SecurityRuleProtocol.TCP);
		addEEnumLiteral(securityRuleProtocolEEnum, SecurityRuleProtocol.UDP);
		addEEnumLiteral(securityRuleProtocolEEnum, SecurityRuleProtocol.IMCP);

		// Create resource
		createResource(eNS_URI);
	}

} //CorePackageImpl
