
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
 * A representation of the model object '<em><b>Security Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.NeutronSecurityRule#getId <em>Id</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.NeutronSecurityRule#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.NeutronSecurityRule#getEthertype <em>Ethertype</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.NeutronSecurityRule#getPort_range_min <em>Port range min</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.NeutronSecurityRule#getPort_range_max <em>Port range max</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.NeutronSecurityRule#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.NeutronSecurityRule#getRemote_group_id <em>Remote group id</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.NeutronSecurityRule#getRemote_ip_prefix <em>Remote ip prefix</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.NeutronSecurityRule#getSecurity_group_id <em>Security group id</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.NeutronSecurityRule#getTenant_id <em>Tenant id</em>}</li>
 * </ul>
 *
 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getNeutronSecurityRule()
 * @model
 * @generated
 */
public interface NeutronSecurityRule extends NeutronObject {
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
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getNeutronSecurityRule_Id()
	 * @model unique="false"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.neutron.NeutronSecurityRule#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see #setDirection(String)
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getNeutronSecurityRule_Direction()
	 * @model unique="false"
	 * @generated
	 */
	String getDirection();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.neutron.NeutronSecurityRule#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(String value);

	/**
	 * Returns the value of the '<em><b>Ethertype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ethertype</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ethertype</em>' attribute.
	 * @see #setEthertype(String)
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getNeutronSecurityRule_Ethertype()
	 * @model unique="false"
	 * @generated
	 */
	String getEthertype();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.neutron.NeutronSecurityRule#getEthertype <em>Ethertype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ethertype</em>' attribute.
	 * @see #getEthertype()
	 * @generated
	 */
	void setEthertype(String value);

	/**
	 * Returns the value of the '<em><b>Port range min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port range min</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port range min</em>' attribute.
	 * @see #setPort_range_min(Integer)
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getNeutronSecurityRule_Port_range_min()
	 * @model unique="false"
	 * @generated
	 */
	Integer getPort_range_min();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.neutron.NeutronSecurityRule#getPort_range_min <em>Port range min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port range min</em>' attribute.
	 * @see #getPort_range_min()
	 * @generated
	 */
	void setPort_range_min(Integer value);

	/**
	 * Returns the value of the '<em><b>Port range max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port range max</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port range max</em>' attribute.
	 * @see #setPort_range_max(Integer)
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getNeutronSecurityRule_Port_range_max()
	 * @model unique="false"
	 * @generated
	 */
	Integer getPort_range_max();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.neutron.NeutronSecurityRule#getPort_range_max <em>Port range max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port range max</em>' attribute.
	 * @see #getPort_range_max()
	 * @generated
	 */
	void setPort_range_max(Integer value);

	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protocol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol</em>' attribute.
	 * @see #setProtocol(String)
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getNeutronSecurityRule_Protocol()
	 * @model unique="false"
	 * @generated
	 */
	String getProtocol();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.neutron.NeutronSecurityRule#getProtocol <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' attribute.
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(String value);

	/**
	 * Returns the value of the '<em><b>Remote group id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remote group id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remote group id</em>' attribute.
	 * @see #setRemote_group_id(String)
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getNeutronSecurityRule_Remote_group_id()
	 * @model unique="false"
	 * @generated
	 */
	String getRemote_group_id();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.neutron.NeutronSecurityRule#getRemote_group_id <em>Remote group id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remote group id</em>' attribute.
	 * @see #getRemote_group_id()
	 * @generated
	 */
	void setRemote_group_id(String value);

	/**
	 * Returns the value of the '<em><b>Remote ip prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remote ip prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remote ip prefix</em>' attribute.
	 * @see #setRemote_ip_prefix(String)
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getNeutronSecurityRule_Remote_ip_prefix()
	 * @model unique="false"
	 * @generated
	 */
	String getRemote_ip_prefix();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.neutron.NeutronSecurityRule#getRemote_ip_prefix <em>Remote ip prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remote ip prefix</em>' attribute.
	 * @see #getRemote_ip_prefix()
	 * @generated
	 */
	void setRemote_ip_prefix(String value);

	/**
	 * Returns the value of the '<em><b>Security group id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security group id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security group id</em>' attribute.
	 * @see #setSecurity_group_id(String)
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getNeutronSecurityRule_Security_group_id()
	 * @model unique="false"
	 * @generated
	 */
	String getSecurity_group_id();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.neutron.NeutronSecurityRule#getSecurity_group_id <em>Security group id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security group id</em>' attribute.
	 * @see #getSecurity_group_id()
	 * @generated
	 */
	void setSecurity_group_id(String value);

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
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getNeutronSecurityRule_Tenant_id()
	 * @model unique="false"
	 * @generated
	 */
	String getTenant_id();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.neutron.NeutronSecurityRule#getTenant_id <em>Tenant id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tenant id</em>' attribute.
	 * @see #getTenant_id()
	 * @generated
	 */
	void setTenant_id(String value);

} // NeutronSecurityRule
