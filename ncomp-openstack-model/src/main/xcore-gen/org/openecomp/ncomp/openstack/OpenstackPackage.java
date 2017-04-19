
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
package org.openecomp.ncomp.openstack;

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
 * @see org.openecomp.ncomp.openstack.OpenstackFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel modelDirectory='/ncomp-openstack-model/src/main/xcore-gen' basePackage='org.openecomp.ncomp'"
 * @generated
 */
public interface OpenstackPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "openstack";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.openecomp.ncomp.openstack";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "openstack";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OpenstackPackage eINSTANCE = org.openecomp.ncomp.openstack.impl.OpenstackPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.openstack.impl.OpenStackControllerImpl <em>Open Stack Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.openstack.impl.OpenStackControllerImpl
	 * @see org.openecomp.ncomp.openstack.impl.OpenstackPackageImpl#getOpenStackController()
	 * @generated
	 */
	int OPEN_STACK_CONTROLLER = 0;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_CONTROLLER__LOCATIONS = 0;

	/**
	 * The feature id for the '<em><b>Vm Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_CONTROLLER__VM_TYPES = 1;

	/**
	 * The feature id for the '<em><b>Users</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_CONTROLLER__USERS = 2;

	/**
	 * The number of structural features of the '<em>Open Stack Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_CONTROLLER_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Upload Openstack Configuration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_CONTROLLER___UPLOAD_OPENSTACK_CONFIGURATION__JSONOBJECT_OPENSTACKLOCATION = 0;

	/**
	 * The number of operations of the '<em>Open Stack Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_STACK_CONTROLLER_OPERATION_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.openstack.OpenStackController <em>Open Stack Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Open Stack Controller</em>'.
	 * @see org.openecomp.ncomp.openstack.OpenStackController
	 * @generated
	 */
	EClass getOpenStackController();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.openstack.OpenStackController#getLocations <em>Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Locations</em>'.
	 * @see org.openecomp.ncomp.openstack.OpenStackController#getLocations()
	 * @see #getOpenStackController()
	 * @generated
	 */
	EReference getOpenStackController_Locations();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.openstack.OpenStackController#getVmTypes <em>Vm Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vm Types</em>'.
	 * @see org.openecomp.ncomp.openstack.OpenStackController#getVmTypes()
	 * @see #getOpenStackController()
	 * @generated
	 */
	EReference getOpenStackController_VmTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.openstack.OpenStackController#getUsers <em>Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Users</em>'.
	 * @see org.openecomp.ncomp.openstack.OpenStackController#getUsers()
	 * @see #getOpenStackController()
	 * @generated
	 */
	EReference getOpenStackController_Users();

	/**
	 * Returns the meta object for the '{@link org.openecomp.ncomp.openstack.OpenStackController#uploadOpenstackConfiguration(org.json.JSONObject, org.openecomp.ncomp.openstack.location.OpenStackLocation) <em>Upload Openstack Configuration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Upload Openstack Configuration</em>' operation.
	 * @see org.openecomp.ncomp.openstack.OpenStackController#uploadOpenstackConfiguration(org.json.JSONObject, org.openecomp.ncomp.openstack.location.OpenStackLocation)
	 * @generated
	 */
	EOperation getOpenStackController__UploadOpenstackConfiguration__JSONObject_OpenStackLocation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OpenstackFactory getOpenstackFactory();

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
		 * The meta object literal for the '{@link org.openecomp.ncomp.openstack.impl.OpenStackControllerImpl <em>Open Stack Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.openstack.impl.OpenStackControllerImpl
		 * @see org.openecomp.ncomp.openstack.impl.OpenstackPackageImpl#getOpenStackController()
		 * @generated
		 */
		EClass OPEN_STACK_CONTROLLER = eINSTANCE.getOpenStackController();

		/**
		 * The meta object literal for the '<em><b>Locations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPEN_STACK_CONTROLLER__LOCATIONS = eINSTANCE.getOpenStackController_Locations();

		/**
		 * The meta object literal for the '<em><b>Vm Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPEN_STACK_CONTROLLER__VM_TYPES = eINSTANCE.getOpenStackController_VmTypes();

		/**
		 * The meta object literal for the '<em><b>Users</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPEN_STACK_CONTROLLER__USERS = eINSTANCE.getOpenStackController_Users();

		/**
		 * The meta object literal for the '<em><b>Upload Openstack Configuration</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPEN_STACK_CONTROLLER___UPLOAD_OPENSTACK_CONFIGURATION__JSONOBJECT_OPENSTACKLOCATION = eINSTANCE.getOpenStackController__UploadOpenstackConfiguration__JSONObject_OpenStackLocation();

	}

} //OpenstackPackage
