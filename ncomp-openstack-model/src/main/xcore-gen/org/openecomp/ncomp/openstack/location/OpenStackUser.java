
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
package org.openecomp.ncomp.openstack.location;

import org.openecomp.ncomp.core.NamedEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Open Stack User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.openstack.location.OpenStackUser#getPassword <em>Password</em>}</li>
 * </ul>
 *
 * @see org.openecomp.ncomp.openstack.location.LocationPackage#getOpenStackUser()
 * @model
 * @generated
 */
public interface OpenStackUser extends NamedEntity {
	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see org.openecomp.ncomp.openstack.location.LocationPackage#getOpenStackUser_Password()
	 * @model unique="false" transient="true"
	 *        annotation="http://openecomp.org/sirius/persistence propertyFile='bsa.properties'"
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.location.OpenStackUser#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

} // OpenStackUser
