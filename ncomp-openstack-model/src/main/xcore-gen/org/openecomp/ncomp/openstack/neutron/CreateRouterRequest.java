
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
 * A representation of the model object '<em><b>Create Router Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.CreateRouterRequest#getName <em>Name</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.CreateRouterRequest#getAdmin_state_up <em>Admin state up</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.CreateRouterRequest#getShared <em>Shared</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.CreateRouterRequest#getExternalNetwork <em>External Network</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.CreateRouterRequest#getPorts <em>Ports</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.CreateRouterRequest#getSubnets <em>Subnets</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getCreateRouterRequest()
 * @model
 * @generated
 */
public interface CreateRouterRequest extends NeutronRequest {
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
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getCreateRouterRequest_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.neutron.CreateRouterRequest#getName <em>Name</em>}' attribute.
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
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getCreateRouterRequest_Admin_state_up()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getAdmin_state_up();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.neutron.CreateRouterRequest#getAdmin_state_up <em>Admin state up</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Admin state up</em>' attribute.
	 * @see #getAdmin_state_up()
	 * @generated
	 */
	void setAdmin_state_up(Boolean value);

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
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getCreateRouterRequest_Shared()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getShared();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.neutron.CreateRouterRequest#getShared <em>Shared</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shared</em>' attribute.
	 * @see #getShared()
	 * @generated
	 */
	void setShared(Boolean value);

	/**
	 * Returns the value of the '<em><b>External Network</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Network</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Network</em>' attribute.
	 * @see #setExternalNetwork(String)
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getCreateRouterRequest_ExternalNetwork()
	 * @model unique="false"
	 * @generated
	 */
	String getExternalNetwork();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.neutron.CreateRouterRequest#getExternalNetwork <em>External Network</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Network</em>' attribute.
	 * @see #getExternalNetwork()
	 * @generated
	 */
	void setExternalNetwork(String value);

	/**
	 * Returns the value of the '<em><b>Ports</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ports</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' attribute list.
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getCreateRouterRequest_Ports()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getPorts();

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
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getCreateRouterRequest_Subnets()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getSubnets();

} // CreateRouterRequest
