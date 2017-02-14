
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
package org.openecomp.ncomp.openstack.neutron;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Gateway</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.ExternalGateway#getEnable_snat <em>Enable snat</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.ExternalGateway#getNetwork_id <em>Network id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getExternalGateway()
 * @model
 * @generated
 */
public interface ExternalGateway extends EObject {
	/**
	 * Returns the value of the '<em><b>Enable snat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enable snat</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enable snat</em>' attribute.
	 * @see #setEnable_snat(Boolean)
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getExternalGateway_Enable_snat()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getEnable_snat();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.neutron.ExternalGateway#getEnable_snat <em>Enable snat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable snat</em>' attribute.
	 * @see #getEnable_snat()
	 * @generated
	 */
	void setEnable_snat(Boolean value);

	/**
	 * Returns the value of the '<em><b>Network id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Network id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network id</em>' attribute.
	 * @see #setNetwork_id(String)
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getExternalGateway_Network_id()
	 * @model unique="false"
	 * @generated
	 */
	String getNetwork_id();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.neutron.ExternalGateway#getNetwork_id <em>Network id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network id</em>' attribute.
	 * @see #getNetwork_id()
	 * @generated
	 */
	void setNetwork_id(String value);

} // ExternalGateway
