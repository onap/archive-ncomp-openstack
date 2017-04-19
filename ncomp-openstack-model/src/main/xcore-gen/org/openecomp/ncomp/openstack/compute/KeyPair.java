
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
 * A representation of the model object '<em><b>Key Pair</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.KeyPair#getPublic_key <em>Public key</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.KeyPair#getName <em>Name</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.KeyPair#getFingerprint <em>Fingerprint</em>}</li>
 * </ul>
 *
 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getKeyPair()
 * @model
 * @generated
 */
public interface KeyPair extends EObject {
	/**
	 * Returns the value of the '<em><b>Public key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Public key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Public key</em>' attribute.
	 * @see #setPublic_key(String)
	 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getKeyPair_Public_key()
	 * @model unique="false"
	 * @generated
	 */
	String getPublic_key();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.compute.KeyPair#getPublic_key <em>Public key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Public key</em>' attribute.
	 * @see #getPublic_key()
	 * @generated
	 */
	void setPublic_key(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getKeyPair_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.compute.KeyPair#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Fingerprint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fingerprint</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fingerprint</em>' attribute.
	 * @see #setFingerprint(String)
	 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getKeyPair_Fingerprint()
	 * @model unique="false"
	 * @generated
	 */
	String getFingerprint();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.compute.KeyPair#getFingerprint <em>Fingerprint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fingerprint</em>' attribute.
	 * @see #getFingerprint()
	 * @generated
	 */
	void setFingerprint(String value);

} // KeyPair
