
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
package org.openecomp.ncomp.openstack.compute;

import org.openecomp.ncomp.core.User;
import org.openecomp.ncomp.openstack.core.OpenStackRequest;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Openstack Request Key Pair</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.OpenstackRequestKeyPair#getUser <em>User</em>}</li>
 * </ul>
 *
 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getOpenstackRequestKeyPair()
 * @model
 * @generated
 */
public interface OpenstackRequestKeyPair extends OpenStackRequest {
	/**
	 * Returns the value of the '<em><b>User</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' containment reference.
	 * @see #setUser(User)
	 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getOpenstackRequestKeyPair_User()
	 * @model containment="true"
	 * @generated
	 */
	User getUser();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.compute.OpenstackRequestKeyPair#getUser <em>User</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' containment reference.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(User value);

} // OpenstackRequestKeyPair
