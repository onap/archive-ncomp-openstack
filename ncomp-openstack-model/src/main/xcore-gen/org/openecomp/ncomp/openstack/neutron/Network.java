
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
 * A representation of the model object '<em><b>Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.Network#getId <em>Id</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.Network#getName <em>Name</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.Network#getAdmin_state_up <em>Admin state up</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.Network#getProvider_network_type <em>Provider network type</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.Network#getProvider_physical_network <em>Provider physical network</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.Network#getProvider_segmentation_id <em>Provider segmentation id</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.Network#getRouter_external <em>Router external</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.Network#getShared <em>Shared</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.Network#getStatus <em>Status</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.Network#getSubnets <em>Subnets</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.Network#getTenant_id <em>Tenant id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getNetwork()
 * @model
 * @generated
 */
public interface Network extends NeutronObject {
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
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getNetwork_Id()
	 * @model unique="false"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.neutron.Network#getId <em>Id</em>}' attribute.
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
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getNetwork_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.neutron.Network#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getNetwork_Admin_state_up()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getAdmin_state_up();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.neutron.Network#getAdmin_state_up <em>Admin state up</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Admin state up</em>' attribute.
	 * @see #getAdmin_state_up()
	 * @generated
	 */
	void setAdmin_state_up(Boolean value);

	/**
	 * Returns the value of the '<em><b>Provider network type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provider network type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provider network type</em>' attribute.
	 * @see #setProvider_network_type(String)
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getNetwork_Provider_network_type()
	 * @model unique="false"
	 * @generated
	 */
	String getProvider_network_type();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.neutron.Network#getProvider_network_type <em>Provider network type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider network type</em>' attribute.
	 * @see #getProvider_network_type()
	 * @generated
	 */
	void setProvider_network_type(String value);

	/**
	 * Returns the value of the '<em><b>Provider physical network</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provider physical network</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provider physical network</em>' attribute.
	 * @see #setProvider_physical_network(String)
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getNetwork_Provider_physical_network()
	 * @model unique="false"
	 * @generated
	 */
	String getProvider_physical_network();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.neutron.Network#getProvider_physical_network <em>Provider physical network</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider physical network</em>' attribute.
	 * @see #getProvider_physical_network()
	 * @generated
	 */
	void setProvider_physical_network(String value);

	/**
	 * Returns the value of the '<em><b>Provider segmentation id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provider segmentation id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provider segmentation id</em>' attribute.
	 * @see #setProvider_segmentation_id(Integer)
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getNetwork_Provider_segmentation_id()
	 * @model unique="false"
	 * @generated
	 */
	Integer getProvider_segmentation_id();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.neutron.Network#getProvider_segmentation_id <em>Provider segmentation id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider segmentation id</em>' attribute.
	 * @see #getProvider_segmentation_id()
	 * @generated
	 */
	void setProvider_segmentation_id(Integer value);

	/**
	 * Returns the value of the '<em><b>Router external</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Router external</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Router external</em>' attribute.
	 * @see #setRouter_external(Boolean)
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getNetwork_Router_external()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getRouter_external();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.neutron.Network#getRouter_external <em>Router external</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Router external</em>' attribute.
	 * @see #getRouter_external()
	 * @generated
	 */
	void setRouter_external(Boolean value);

	/**
	 * Returns the value of the '<em><b>Shared</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shared</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shared</em>' attribute.
	 * @see #setShared(Boolean)
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getNetwork_Shared()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getShared();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.neutron.Network#getShared <em>Shared</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shared</em>' attribute.
	 * @see #getShared()
	 * @generated
	 */
	void setShared(Boolean value);

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
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getNetwork_Status()
	 * @model unique="false"
	 * @generated
	 */
	String getStatus();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.neutron.Network#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(String value);

	/**
	 * Returns the value of the '<em><b>Subnets</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subnets</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subnets</em>' attribute list.
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getNetwork_Subnets()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getSubnets();

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
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getNetwork_Tenant_id()
	 * @model unique="false"
	 * @generated
	 */
	String getTenant_id();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.neutron.Network#getTenant_id <em>Tenant id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tenant id</em>' attribute.
	 * @see #getTenant_id()
	 * @generated
	 */
	void setTenant_id(String value);

} // Network
