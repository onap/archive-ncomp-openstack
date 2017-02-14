
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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.Port#getId <em>Id</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.Port#getName <em>Name</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.Port#getStatus <em>Status</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.Port#getAdmin_state_up <em>Admin state up</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.Port#getExternal_gateway_info <em>External gateway info</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.Port#getTenant_id <em>Tenant id</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.Port#getAllowed_address_pairs <em>Allowed address pairs</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.Port#getBinding_host_id <em>Binding host id</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.Port#getBinding_profile <em>Binding profile</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.Port#getBinding_vif_details <em>Binding vif details</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.Port#getBinding_vif_type <em>Binding vif type</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.Port#getBinding_vnic_type <em>Binding vnic type</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.Port#getDevice_id <em>Device id</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.Port#getDevice_owner <em>Device owner</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.Port#getExtra_dhcp_opts <em>Extra dhcp opts</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.Port#getFixed_ips <em>Fixed ips</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.Port#getMac_address <em>Mac address</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.Port#getNetwork_id <em>Network id</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.Port#getSecurity_groups <em>Security groups</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getPort()
 * @model
 * @generated
 */
public interface Port extends NeutronObject {
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
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getPort_Id()
	 * @model unique="false"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.neutron.Port#getId <em>Id</em>}' attribute.
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
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getPort_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.neutron.Port#getName <em>Name</em>}' attribute.
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
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getPort_Status()
	 * @model unique="false"
	 * @generated
	 */
	String getStatus();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.neutron.Port#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(String value);

	/**
	 * Returns the value of the '<em><b>Admin state up</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Admin state up</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Admin state up</em>' attribute.
	 * @see #setAdmin_state_up(Boolean)
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getPort_Admin_state_up()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getAdmin_state_up();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.neutron.Port#getAdmin_state_up <em>Admin state up</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Admin state up</em>' attribute.
	 * @see #getAdmin_state_up()
	 * @generated
	 */
	void setAdmin_state_up(Boolean value);

	/**
	 * Returns the value of the '<em><b>External gateway info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External gateway info</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External gateway info</em>' containment reference.
	 * @see #setExternal_gateway_info(ExternalGateway)
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getPort_External_gateway_info()
	 * @model containment="true"
	 * @generated
	 */
	ExternalGateway getExternal_gateway_info();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.neutron.Port#getExternal_gateway_info <em>External gateway info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External gateway info</em>' containment reference.
	 * @see #getExternal_gateway_info()
	 * @generated
	 */
	void setExternal_gateway_info(ExternalGateway value);

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
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getPort_Tenant_id()
	 * @model unique="false"
	 * @generated
	 */
	String getTenant_id();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.neutron.Port#getTenant_id <em>Tenant id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tenant id</em>' attribute.
	 * @see #getTenant_id()
	 * @generated
	 */
	void setTenant_id(String value);

	/**
	 * Returns the value of the '<em><b>Allowed address pairs</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allowed address pairs</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allowed address pairs</em>' attribute list.
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getPort_Allowed_address_pairs()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getAllowed_address_pairs();

	/**
	 * Returns the value of the '<em><b>Binding host id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding host id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding host id</em>' attribute.
	 * @see #setBinding_host_id(String)
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getPort_Binding_host_id()
	 * @model unique="false"
	 * @generated
	 */
	String getBinding_host_id();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.neutron.Port#getBinding_host_id <em>Binding host id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding host id</em>' attribute.
	 * @see #getBinding_host_id()
	 * @generated
	 */
	void setBinding_host_id(String value);

	/**
	 * Returns the value of the '<em><b>Binding profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding profile</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding profile</em>' containment reference.
	 * @see #setBinding_profile(BindingProfile)
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getPort_Binding_profile()
	 * @model containment="true"
	 * @generated
	 */
	BindingProfile getBinding_profile();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.neutron.Port#getBinding_profile <em>Binding profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding profile</em>' containment reference.
	 * @see #getBinding_profile()
	 * @generated
	 */
	void setBinding_profile(BindingProfile value);

	/**
	 * Returns the value of the '<em><b>Binding vif details</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding vif details</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding vif details</em>' containment reference.
	 * @see #setBinding_vif_details(BindingVifDetail)
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getPort_Binding_vif_details()
	 * @model containment="true"
	 * @generated
	 */
	BindingVifDetail getBinding_vif_details();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.neutron.Port#getBinding_vif_details <em>Binding vif details</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding vif details</em>' containment reference.
	 * @see #getBinding_vif_details()
	 * @generated
	 */
	void setBinding_vif_details(BindingVifDetail value);

	/**
	 * Returns the value of the '<em><b>Binding vif type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding vif type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding vif type</em>' attribute.
	 * @see #setBinding_vif_type(String)
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getPort_Binding_vif_type()
	 * @model unique="false"
	 * @generated
	 */
	String getBinding_vif_type();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.neutron.Port#getBinding_vif_type <em>Binding vif type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding vif type</em>' attribute.
	 * @see #getBinding_vif_type()
	 * @generated
	 */
	void setBinding_vif_type(String value);

	/**
	 * Returns the value of the '<em><b>Binding vnic type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding vnic type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding vnic type</em>' attribute.
	 * @see #setBinding_vnic_type(String)
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getPort_Binding_vnic_type()
	 * @model unique="false"
	 * @generated
	 */
	String getBinding_vnic_type();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.neutron.Port#getBinding_vnic_type <em>Binding vnic type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding vnic type</em>' attribute.
	 * @see #getBinding_vnic_type()
	 * @generated
	 */
	void setBinding_vnic_type(String value);

	/**
	 * Returns the value of the '<em><b>Device id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device id</em>' attribute.
	 * @see #setDevice_id(String)
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getPort_Device_id()
	 * @model unique="false"
	 * @generated
	 */
	String getDevice_id();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.neutron.Port#getDevice_id <em>Device id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device id</em>' attribute.
	 * @see #getDevice_id()
	 * @generated
	 */
	void setDevice_id(String value);

	/**
	 * Returns the value of the '<em><b>Device owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device owner</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device owner</em>' attribute.
	 * @see #setDevice_owner(String)
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getPort_Device_owner()
	 * @model unique="false"
	 * @generated
	 */
	String getDevice_owner();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.neutron.Port#getDevice_owner <em>Device owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device owner</em>' attribute.
	 * @see #getDevice_owner()
	 * @generated
	 */
	void setDevice_owner(String value);

	/**
	 * Returns the value of the '<em><b>Extra dhcp opts</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extra dhcp opts</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extra dhcp opts</em>' attribute list.
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getPort_Extra_dhcp_opts()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getExtra_dhcp_opts();

	/**
	 * Returns the value of the '<em><b>Fixed ips</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.openstack.neutron.FixedIp}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed ips</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed ips</em>' containment reference list.
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getPort_Fixed_ips()
	 * @model containment="true"
	 * @generated
	 */
	EList<FixedIp> getFixed_ips();

	/**
	 * Returns the value of the '<em><b>Mac address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mac address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mac address</em>' attribute.
	 * @see #setMac_address(String)
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getPort_Mac_address()
	 * @model unique="false"
	 * @generated
	 */
	String getMac_address();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.neutron.Port#getMac_address <em>Mac address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mac address</em>' attribute.
	 * @see #getMac_address()
	 * @generated
	 */
	void setMac_address(String value);

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
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getPort_Network_id()
	 * @model unique="false"
	 * @generated
	 */
	String getNetwork_id();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.neutron.Port#getNetwork_id <em>Network id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network id</em>' attribute.
	 * @see #getNetwork_id()
	 * @generated
	 */
	void setNetwork_id(String value);

	/**
	 * Returns the value of the '<em><b>Security groups</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security groups</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security groups</em>' attribute list.
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getPort_Security_groups()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getSecurity_groups();

} // Port
