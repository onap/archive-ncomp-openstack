
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
 * A representation of the model object '<em><b>Create Port Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.CreatePortRequest#getName <em>Name</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.CreatePortRequest#getBindingVnicType <em>Binding Vnic Type</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.CreatePortRequest#getStatus <em>Status</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.CreatePortRequest#getAdmin_state_up <em>Admin state up</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.CreatePortRequest#getFixed_ips <em>Fixed ips</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.CreatePortRequest#getMac_address <em>Mac address</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.CreatePortRequest#getNetwork_id <em>Network id</em>}</li>
 * </ul>
 *
 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getCreatePortRequest()
 * @model
 * @generated
 */
public interface CreatePortRequest extends NeutronRequest {
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
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getCreatePortRequest_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.neutron.CreatePortRequest#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Binding Vnic Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding Vnic Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding Vnic Type</em>' attribute.
	 * @see #setBindingVnicType(String)
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getCreatePortRequest_BindingVnicType()
	 * @model unique="false"
	 *        annotation="http://openecomp.org/sirius/openstack name='binding:vnic_type'"
	 * @generated
	 */
	String getBindingVnicType();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.neutron.CreatePortRequest#getBindingVnicType <em>Binding Vnic Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding Vnic Type</em>' attribute.
	 * @see #getBindingVnicType()
	 * @generated
	 */
	void setBindingVnicType(String value);

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
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getCreatePortRequest_Status()
	 * @model unique="false"
	 * @generated
	 */
	String getStatus();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.neutron.CreatePortRequest#getStatus <em>Status</em>}' attribute.
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
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getCreatePortRequest_Admin_state_up()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getAdmin_state_up();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.neutron.CreatePortRequest#getAdmin_state_up <em>Admin state up</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Admin state up</em>' attribute.
	 * @see #getAdmin_state_up()
	 * @generated
	 */
	void setAdmin_state_up(Boolean value);

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
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getCreatePortRequest_Fixed_ips()
	 * @model containment="true"
	 *        annotation="http://openecomp.org/sirius/openstack removeEmptyList='true'"
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
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getCreatePortRequest_Mac_address()
	 * @model unique="false"
	 * @generated
	 */
	String getMac_address();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.neutron.CreatePortRequest#getMac_address <em>Mac address</em>}' attribute.
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
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getCreatePortRequest_Network_id()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getNetwork_id();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.neutron.CreatePortRequest#getNetwork_id <em>Network id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network id</em>' attribute.
	 * @see #getNetwork_id()
	 * @generated
	 */
	void setNetwork_id(String value);

} // CreatePortRequest
