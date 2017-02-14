
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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hypervisor Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.openstack.location.HypervisorService#getHost <em>Host</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.HypervisorService#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openecomp.ncomp.openstack.location.LocationPackage#getHypervisorService()
 * @model
 * @generated
 */
public interface HypervisorService extends EObject {
	/**
	 * Returns the value of the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host</em>' attribute.
	 * @see #setHost(String)
	 * @see org.openecomp.ncomp.openstack.location.LocationPackage#getHypervisorService_Host()
	 * @model unique="false"
	 * @generated
	 */
	String getHost();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.location.HypervisorService#getHost <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host</em>' attribute.
	 * @see #getHost()
	 * @generated
	 */
	void setHost(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see org.openecomp.ncomp.openstack.location.LocationPackage#getHypervisorService_Id()
	 * @model unique="false"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.location.HypervisorService#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

} // HypervisorService
