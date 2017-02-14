
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
 * A representation of the model object '<em><b>Fixed Ip</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.FixedIp#getIp_address <em>Ip address</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.FixedIp#getSubnet_id <em>Subnet id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getFixedIp()
 * @model
 * @generated
 */
public interface FixedIp extends EObject {
	/**
	 * Returns the value of the '<em><b>Ip address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ip address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ip address</em>' attribute.
	 * @see #setIp_address(String)
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getFixedIp_Ip_address()
	 * @model unique="false"
	 * @generated
	 */
	String getIp_address();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.neutron.FixedIp#getIp_address <em>Ip address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ip address</em>' attribute.
	 * @see #getIp_address()
	 * @generated
	 */
	void setIp_address(String value);

	/**
	 * Returns the value of the '<em><b>Subnet id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subnet id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subnet id</em>' attribute.
	 * @see #setSubnet_id(String)
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getFixedIp_Subnet_id()
	 * @model unique="false"
	 * @generated
	 */
	String getSubnet_id();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.neutron.FixedIp#getSubnet_id <em>Subnet id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subnet id</em>' attribute.
	 * @see #getSubnet_id()
	 * @generated
	 */
	void setSubnet_id(String value);

} // FixedIp
