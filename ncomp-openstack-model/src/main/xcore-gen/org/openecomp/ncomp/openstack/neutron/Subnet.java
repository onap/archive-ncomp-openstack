
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
 * A representation of the model object '<em><b>Subnet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.Subnet#getId <em>Id</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.Subnet#getName <em>Name</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.Subnet#getStatus <em>Status</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.Subnet#getAdmin_state_up <em>Admin state up</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.Subnet#getCidr <em>Cidr</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.Subnet#getAllocation_pools <em>Allocation pools</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.Subnet#getDns_nameservers <em>Dns nameservers</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.Subnet#getEnable_dhcp <em>Enable dhcp</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.Subnet#getGateway_ip <em>Gateway ip</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.Subnet#getHost_routes <em>Host routes</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.Subnet#getIp_version <em>Ip version</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.Subnet#getNetwork_id <em>Network id</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.Subnet#getTenant_id <em>Tenant id</em>}</li>
 * </ul>
 *
 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getSubnet()
 * @model
 * @generated
 */
public interface Subnet extends NeutronObject {
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
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getSubnet_Id()
	 * @model unique="false"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.neutron.Subnet#getId <em>Id</em>}' attribute.
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
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getSubnet_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.neutron.Subnet#getName <em>Name</em>}' attribute.
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
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getSubnet_Status()
	 * @model unique="false"
	 * @generated
	 */
	String getStatus();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.neutron.Subnet#getStatus <em>Status</em>}' attribute.
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
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getSubnet_Admin_state_up()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getAdmin_state_up();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.neutron.Subnet#getAdmin_state_up <em>Admin state up</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Admin state up</em>' attribute.
	 * @see #getAdmin_state_up()
	 * @generated
	 */
	void setAdmin_state_up(Boolean value);

	/**
	 * Returns the value of the '<em><b>Cidr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cidr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cidr</em>' attribute.
	 * @see #setCidr(String)
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getSubnet_Cidr()
	 * @model unique="false"
	 * @generated
	 */
	String getCidr();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.neutron.Subnet#getCidr <em>Cidr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cidr</em>' attribute.
	 * @see #getCidr()
	 * @generated
	 */
	void setCidr(String value);

	/**
	 * Returns the value of the '<em><b>Allocation pools</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.openstack.neutron.AllocationPool}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocation pools</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocation pools</em>' containment reference list.
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getSubnet_Allocation_pools()
	 * @model containment="true"
	 * @generated
	 */
	EList<AllocationPool> getAllocation_pools();

	/**
	 * Returns the value of the '<em><b>Dns nameservers</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dns nameservers</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dns nameservers</em>' attribute list.
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getSubnet_Dns_nameservers()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getDns_nameservers();

	/**
	 * Returns the value of the '<em><b>Enable dhcp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enable dhcp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enable dhcp</em>' attribute.
	 * @see #setEnable_dhcp(Boolean)
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getSubnet_Enable_dhcp()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getEnable_dhcp();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.neutron.Subnet#getEnable_dhcp <em>Enable dhcp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable dhcp</em>' attribute.
	 * @see #getEnable_dhcp()
	 * @generated
	 */
	void setEnable_dhcp(Boolean value);

	/**
	 * Returns the value of the '<em><b>Gateway ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gateway ip</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gateway ip</em>' attribute.
	 * @see #setGateway_ip(String)
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getSubnet_Gateway_ip()
	 * @model unique="false"
	 * @generated
	 */
	String getGateway_ip();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.neutron.Subnet#getGateway_ip <em>Gateway ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gateway ip</em>' attribute.
	 * @see #getGateway_ip()
	 * @generated
	 */
	void setGateway_ip(String value);

	/**
	 * Returns the value of the '<em><b>Host routes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host routes</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host routes</em>' attribute list.
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getSubnet_Host_routes()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getHost_routes();

	/**
	 * Returns the value of the '<em><b>Ip version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ip version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ip version</em>' attribute.
	 * @see #setIp_version(Integer)
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getSubnet_Ip_version()
	 * @model unique="false"
	 * @generated
	 */
	Integer getIp_version();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.neutron.Subnet#getIp_version <em>Ip version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ip version</em>' attribute.
	 * @see #getIp_version()
	 * @generated
	 */
	void setIp_version(Integer value);

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
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getSubnet_Network_id()
	 * @model unique="false"
	 * @generated
	 */
	String getNetwork_id();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.neutron.Subnet#getNetwork_id <em>Network id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network id</em>' attribute.
	 * @see #getNetwork_id()
	 * @generated
	 */
	void setNetwork_id(String value);

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
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getSubnet_Tenant_id()
	 * @model unique="false"
	 * @generated
	 */
	String getTenant_id();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.neutron.Subnet#getTenant_id <em>Tenant id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tenant id</em>' attribute.
	 * @see #getTenant_id()
	 * @generated
	 */
	void setTenant_id(String value);

} // Subnet
