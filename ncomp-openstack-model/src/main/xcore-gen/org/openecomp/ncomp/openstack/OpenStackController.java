
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

import org.openecomp.ncomp.core.User;
import org.openecomp.ncomp.openstack.core.VirtualMachineType;
import org.openecomp.ncomp.openstack.location.OpenStackLocation;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.json.JSONObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Open Stack Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.openstack.OpenStackController#getLocations <em>Locations</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.OpenStackController#getVmTypes <em>Vm Types</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.OpenStackController#getUsers <em>Users</em>}</li>
 * </ul>
 *
 * @see org.openecomp.ncomp.openstack.OpenstackPackage#getOpenStackController()
 * @model
 * @generated
 */
public interface OpenStackController extends EObject {
	/**
	 * Returns the value of the '<em><b>Locations</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.openstack.location.OpenStackLocation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locations</em>' containment reference list.
	 * @see org.openecomp.ncomp.openstack.OpenstackPackage#getOpenStackController_Locations()
	 * @model containment="true"
	 * @generated
	 */
	EList<OpenStackLocation> getLocations();

	/**
	 * Returns the value of the '<em><b>Vm Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.openstack.core.VirtualMachineType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vm Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vm Types</em>' containment reference list.
	 * @see org.openecomp.ncomp.openstack.OpenstackPackage#getOpenStackController_VmTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<VirtualMachineType> getVmTypes();

	/**
	 * Returns the value of the '<em><b>Users</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.core.User}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Users</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Users</em>' containment reference list.
	 * @see org.openecomp.ncomp.openstack.OpenstackPackage#getOpenStackController_Users()
	 * @model containment="true"
	 * @generated
	 */
	EList<User> getUsers();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model cxDataType="org.openecomp.ncomp.core.RemoteContext" cxUnique="false" locUnique="false"
	 * @generated
	 */
	void uploadOpenstackConfiguration(JSONObject cx, OpenStackLocation loc);

} // OpenStackController
