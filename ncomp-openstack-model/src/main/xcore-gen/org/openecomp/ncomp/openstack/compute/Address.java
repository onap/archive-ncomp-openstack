
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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Address</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.Address#getVersion <em>Version</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.Address#getAddr <em>Addr</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.Address#getOS_EXT_IPS_MAC_mac_addr <em>OS EXT IPS MAC mac addr</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.Address#getOS_EXT_IPS_type <em>OS EXT IPS type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getAddress()
 * @model
 * @generated
 */
public interface Address extends EObject {
	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(int)
	 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getAddress_Version()
	 * @model unique="false"
	 * @generated
	 */
	int getVersion();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.compute.Address#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(int value);

	/**
	 * Returns the value of the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Addr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Addr</em>' attribute.
	 * @see #setAddr(String)
	 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getAddress_Addr()
	 * @model unique="false"
	 * @generated
	 */
	String getAddr();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.compute.Address#getAddr <em>Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Addr</em>' attribute.
	 * @see #getAddr()
	 * @generated
	 */
	void setAddr(String value);

	/**
	 * Returns the value of the '<em><b>OS EXT IPS MAC mac addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OS EXT IPS MAC mac addr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OS EXT IPS MAC mac addr</em>' attribute.
	 * @see #setOS_EXT_IPS_MAC_mac_addr(String)
	 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getAddress_OS_EXT_IPS_MAC_mac_addr()
	 * @model unique="false"
	 * @generated
	 */
	String getOS_EXT_IPS_MAC_mac_addr();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.compute.Address#getOS_EXT_IPS_MAC_mac_addr <em>OS EXT IPS MAC mac addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OS EXT IPS MAC mac addr</em>' attribute.
	 * @see #getOS_EXT_IPS_MAC_mac_addr()
	 * @generated
	 */
	void setOS_EXT_IPS_MAC_mac_addr(String value);

	/**
	 * Returns the value of the '<em><b>OS EXT IPS type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OS EXT IPS type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OS EXT IPS type</em>' attribute.
	 * @see #setOS_EXT_IPS_type(String)
	 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getAddress_OS_EXT_IPS_type()
	 * @model unique="false"
	 * @generated
	 */
	String getOS_EXT_IPS_type();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.compute.Address#getOS_EXT_IPS_type <em>OS EXT IPS type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OS EXT IPS type</em>' attribute.
	 * @see #getOS_EXT_IPS_type()
	 * @generated
	 */
	void setOS_EXT_IPS_type(String value);

} // Address
