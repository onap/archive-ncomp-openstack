
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
package org.openecomp.ncomp.openstack.impl;

import org.openecomp.ncomp.openstack.OpenStackController;
import org.openecomp.ncomp.openstack.OpenstackFactory;
import org.openecomp.ncomp.openstack.OpenstackPackage;
import org.openecomp.ncomp.openstack.core.CorePackage;
import org.openecomp.ncomp.openstack.location.LocationPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OpenstackPackageImpl extends EPackageImpl implements OpenstackPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass openStackControllerEClass = null;

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
	 * @see org.openecomp.ncomp.openstack.OpenstackPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OpenstackPackageImpl() {
		super(eNS_URI, OpenstackFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link OpenstackPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OpenstackPackage init() {
		if (isInited) return (OpenstackPackage)EPackage.Registry.INSTANCE.getEPackage(OpenstackPackage.eNS_URI);

		// Obtain or create and register package
		OpenstackPackageImpl theOpenstackPackage = (OpenstackPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OpenstackPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OpenstackPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		LocationPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theOpenstackPackage.createPackageContents();

		// Initialize created meta-data
		theOpenstackPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOpenstackPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OpenstackPackage.eNS_URI, theOpenstackPackage);
		return theOpenstackPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpenStackController() {
		return openStackControllerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOpenStackController_Locations() {
		return (EReference)openStackControllerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOpenStackController_VmTypes() {
		return (EReference)openStackControllerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOpenStackController_Users() {
		return (EReference)openStackControllerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOpenStackController__UploadOpenstackConfiguration__JSONObject_OpenStackLocation() {
		return openStackControllerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenstackFactory getOpenstackFactory() {
		return (OpenstackFactory)getEFactoryInstance();
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
		openStackControllerEClass = createEClass(OPEN_STACK_CONTROLLER);
		createEReference(openStackControllerEClass, OPEN_STACK_CONTROLLER__LOCATIONS);
		createEReference(openStackControllerEClass, OPEN_STACK_CONTROLLER__VM_TYPES);
		createEReference(openStackControllerEClass, OPEN_STACK_CONTROLLER__USERS);
		createEOperation(openStackControllerEClass, OPEN_STACK_CONTROLLER___UPLOAD_OPENSTACK_CONFIGURATION__JSONOBJECT_OPENSTACKLOCATION);
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
		LocationPackage theLocationPackage = (LocationPackage)EPackage.Registry.INSTANCE.getEPackage(LocationPackage.eNS_URI);
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		org.openecomp.ncomp.core.CorePackage theCorePackage_1 = (org.openecomp.ncomp.core.CorePackage)EPackage.Registry.INSTANCE.getEPackage(org.openecomp.ncomp.core.CorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(openStackControllerEClass, OpenStackController.class, "OpenStackController", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOpenStackController_Locations(), theLocationPackage.getOpenStackLocation(), null, "locations", null, 0, -1, OpenStackController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOpenStackController_VmTypes(), theCorePackage.getVirtualMachineType(), null, "vmTypes", null, 0, -1, OpenStackController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOpenStackController_Users(), theCorePackage_1.getUser(), null, "users", null, 0, -1, OpenStackController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getOpenStackController__UploadOpenstackConfiguration__JSONObject_OpenStackLocation(), null, "uploadOpenstackConfiguration", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCorePackage_1.getRemoteContext(), "cx", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theLocationPackage.getOpenStackLocation(), "loc", 0, 1, !IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //OpenstackPackageImpl
