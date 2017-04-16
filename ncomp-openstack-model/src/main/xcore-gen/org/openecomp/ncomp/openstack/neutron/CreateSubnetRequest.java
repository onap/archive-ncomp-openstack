
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
 * A representation of the model object '<em><b>Create Subnet Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.CreateSubnetRequest#getName <em>Name</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.CreateSubnetRequest#getNetwork_id <em>Network id</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.CreateSubnetRequest#getIp_version <em>Ip version</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.CreateSubnetRequest#getCidr <em>Cidr</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.CreateSubnetRequest#getAllocation_pools <em>Allocation pools</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.CreateSubnetRequest#getDns_nameservers <em>Dns nameservers</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.CreateSubnetRequest#getEnable_dhcp <em>Enable dhcp</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.CreateSubnetRequest#getGateway_ip <em>Gateway ip</em>}</li>
 * </ul>
 *
 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getCreateSubnetRequest()
 * @model
 * @generated
 */
public interface CreateSubnetRequest extends NeutronRequest {
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
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getCreateSubnetRequest_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.neutron.CreateSubnetRequest#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getCreateSubnetRequest_Network_id()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getNetwork_id();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.neutron.CreateSubnetRequest#getNetwork_id <em>Network id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network id</em>' attribute.
	 * @see #getNetwork_id()
	 * @generated
	 */
	void setNetwork_id(String value);

	/**
	 * Returns the value of the '<em><b>Ip version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ip version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ip version</em>' attribute.
	 * @see #setIp_version(int)
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getCreateSubnetRequest_Ip_version()
	 * @model unique="false"
	 * @generated
	 */
	int getIp_version();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.neutron.CreateSubnetRequest#getIp_version <em>Ip version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ip version</em>' attribute.
	 * @see #getIp_version()
	 * @generated
	 */
	void setIp_version(int value);

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
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getCreateSubnetRequest_Cidr()
	 * @model unique="false"
	 * @generated
	 */
	String getCidr();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.neutron.CreateSubnetRequest#getCidr <em>Cidr</em>}' attribute.
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
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getCreateSubnetRequest_Allocation_pools()
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
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getCreateSubnetRequest_Dns_nameservers()
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
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getCreateSubnetRequest_Enable_dhcp()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getEnable_dhcp();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.neutron.CreateSubnetRequest#getEnable_dhcp <em>Enable dhcp</em>}' attribute.
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
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getCreateSubnetRequest_Gateway_ip()
	 * @model unique="false"
	 * @generated
	 */
	String getGateway_ip();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.neutron.CreateSubnetRequest#getGateway_ip <em>Gateway ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gateway ip</em>' attribute.
	 * @see #getGateway_ip()
	 * @generated
	 */
	void setGateway_ip(String value);

} // CreateSubnetRequest
