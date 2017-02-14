
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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Floating Ip</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.NeutronFloatingIp#getId <em>Id</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.NeutronFloatingIp#getName <em>Name</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.NeutronFloatingIp#getStatus <em>Status</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.NeutronFloatingIp#getFloating_network_id <em>Floating network id</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.NeutronFloatingIp#getRouter_id <em>Router id</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.NeutronFloatingIp#getFixed_ip_address <em>Fixed ip address</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.NeutronFloatingIp#getFloating_ip_address <em>Floating ip address</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.NeutronFloatingIp#getTenant_id <em>Tenant id</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.NeutronFloatingIp#getPort_id <em>Port id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getNeutronFloatingIp()
 * @model
 * @generated
 */
public interface NeutronFloatingIp extends NeutronObject {
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
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getNeutronFloatingIp_Id()
	 * @model unique="false"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.neutron.NeutronFloatingIp#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

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
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getNeutronFloatingIp_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.neutron.NeutronFloatingIp#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #setStatus(String)
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getNeutronFloatingIp_Status()
	 * @model unique="false"
	 * @generated
	 */
	String getStatus();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.neutron.NeutronFloatingIp#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(String value);

	/**
	 * Returns the value of the '<em><b>Floating network id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Floating network id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Floating network id</em>' attribute.
	 * @see #setFloating_network_id(String)
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getNeutronFloatingIp_Floating_network_id()
	 * @model unique="false"
	 * @generated
	 */
	String getFloating_network_id();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.neutron.NeutronFloatingIp#getFloating_network_id <em>Floating network id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Floating network id</em>' attribute.
	 * @see #getFloating_network_id()
	 * @generated
	 */
	void setFloating_network_id(String value);

	/**
	 * Returns the value of the '<em><b>Router id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Router id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Router id</em>' attribute.
	 * @see #setRouter_id(String)
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getNeutronFloatingIp_Router_id()
	 * @model unique="false"
	 * @generated
	 */
	String getRouter_id();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.neutron.NeutronFloatingIp#getRouter_id <em>Router id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Router id</em>' attribute.
	 * @see #getRouter_id()
	 * @generated
	 */
	void setRouter_id(String value);

	/**
	 * Returns the value of the '<em><b>Fixed ip address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed ip address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed ip address</em>' attribute.
	 * @see #setFixed_ip_address(String)
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getNeutronFloatingIp_Fixed_ip_address()
	 * @model unique="false"
	 * @generated
	 */
	String getFixed_ip_address();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.neutron.NeutronFloatingIp#getFixed_ip_address <em>Fixed ip address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed ip address</em>' attribute.
	 * @see #getFixed_ip_address()
	 * @generated
	 */
	void setFixed_ip_address(String value);

	/**
	 * Returns the value of the '<em><b>Floating ip address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Floating ip address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Floating ip address</em>' attribute.
	 * @see #setFloating_ip_address(String)
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getNeutronFloatingIp_Floating_ip_address()
	 * @model unique="false"
	 * @generated
	 */
	String getFloating_ip_address();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.neutron.NeutronFloatingIp#getFloating_ip_address <em>Floating ip address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Floating ip address</em>' attribute.
	 * @see #getFloating_ip_address()
	 * @generated
	 */
	void setFloating_ip_address(String value);

	/**
	 * Returns the value of the '<em><b>Tenant id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tenant id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tenant id</em>' attribute.
	 * @see #setTenant_id(String)
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getNeutronFloatingIp_Tenant_id()
	 * @model unique="false"
	 * @generated
	 */
	String getTenant_id();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.neutron.NeutronFloatingIp#getTenant_id <em>Tenant id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tenant id</em>' attribute.
	 * @see #getTenant_id()
	 * @generated
	 */
	void setTenant_id(String value);

	/**
	 * Returns the value of the '<em><b>Port id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port id</em>' attribute.
	 * @see #setPort_id(String)
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getNeutronFloatingIp_Port_id()
	 * @model unique="false"
	 * @generated
	 */
	String getPort_id();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.neutron.NeutronFloatingIp#getPort_id <em>Port id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port id</em>' attribute.
	 * @see #getPort_id()
	 * @generated
	 */
	void setPort_id(String value);

} // NeutronFloatingIp
