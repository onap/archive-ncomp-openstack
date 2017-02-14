
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
 * A representation of the model object '<em><b>Floating Ip</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.FloatingIp#getInstance_id <em>Instance id</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.FloatingIp#getIp <em>Ip</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.FloatingIp#getFixed_ip <em>Fixed ip</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.FloatingIp#getId <em>Id</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.FloatingIp#getPool <em>Pool</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getFloatingIp()
 * @model
 * @generated
 */
public interface FloatingIp extends EObject {
	/**
	 * Returns the value of the '<em><b>Instance id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance id</em>' attribute.
	 * @see #setInstance_id(String)
	 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getFloatingIp_Instance_id()
	 * @model unique="false"
	 * @generated
	 */
	String getInstance_id();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.compute.FloatingIp#getInstance_id <em>Instance id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance id</em>' attribute.
	 * @see #getInstance_id()
	 * @generated
	 */
	void setInstance_id(String value);

	/**
	 * Returns the value of the '<em><b>Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ip</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ip</em>' attribute.
	 * @see #setIp(String)
	 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getFloatingIp_Ip()
	 * @model unique="false"
	 * @generated
	 */
	String getIp();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.compute.FloatingIp#getIp <em>Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ip</em>' attribute.
	 * @see #getIp()
	 * @generated
	 */
	void setIp(String value);

	/**
	 * Returns the value of the '<em><b>Fixed ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed ip</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed ip</em>' attribute.
	 * @see #setFixed_ip(String)
	 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getFloatingIp_Fixed_ip()
	 * @model unique="false"
	 * @generated
	 */
	String getFixed_ip();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.compute.FloatingIp#getFixed_ip <em>Fixed ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed ip</em>' attribute.
	 * @see #getFixed_ip()
	 * @generated
	 */
	void setFixed_ip(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getFloatingIp_Id()
	 * @model unique="false"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.compute.FloatingIp#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Pool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pool</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pool</em>' attribute.
	 * @see #setPool(String)
	 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getFloatingIp_Pool()
	 * @model unique="false"
	 * @generated
	 */
	String getPool();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.compute.FloatingIp#getPool <em>Pool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pool</em>' attribute.
	 * @see #getPool()
	 * @generated
	 */
	void setPool(String value);

} // FloatingIp
