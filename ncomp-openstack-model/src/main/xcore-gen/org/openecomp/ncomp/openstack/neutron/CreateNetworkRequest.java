
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
 * A representation of the model object '<em><b>Create Network Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.CreateNetworkRequest#getName <em>Name</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.CreateNetworkRequest#getProviderNetworkType <em>Provider Network Type</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.CreateNetworkRequest#getProviderPhysicalNetwork <em>Provider Physical Network</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.CreateNetworkRequest#getProviderSegmentationId <em>Provider Segmentation Id</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.CreateNetworkRequest#getAdmin_state_up <em>Admin state up</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.CreateNetworkRequest#getShared <em>Shared</em>}</li>
 * </ul>
 *
 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getCreateNetworkRequest()
 * @model
 * @generated
 */
public interface CreateNetworkRequest extends NeutronRequest {
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
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getCreateNetworkRequest_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.neutron.CreateNetworkRequest#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Provider Network Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provider Network Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provider Network Type</em>' attribute.
	 * @see #setProviderNetworkType(String)
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getCreateNetworkRequest_ProviderNetworkType()
	 * @model unique="false"
	 *        annotation="http://openecomp.org/sirius/openstack name='provider:network_type'"
	 * @generated
	 */
	String getProviderNetworkType();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.neutron.CreateNetworkRequest#getProviderNetworkType <em>Provider Network Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider Network Type</em>' attribute.
	 * @see #getProviderNetworkType()
	 * @generated
	 */
	void setProviderNetworkType(String value);

	/**
	 * Returns the value of the '<em><b>Provider Physical Network</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provider Physical Network</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provider Physical Network</em>' attribute.
	 * @see #setProviderPhysicalNetwork(String)
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getCreateNetworkRequest_ProviderPhysicalNetwork()
	 * @model unique="false"
	 *        annotation="http://openecomp.org/sirius/openstack name='provider:physical_network'"
	 * @generated
	 */
	String getProviderPhysicalNetwork();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.neutron.CreateNetworkRequest#getProviderPhysicalNetwork <em>Provider Physical Network</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider Physical Network</em>' attribute.
	 * @see #getProviderPhysicalNetwork()
	 * @generated
	 */
	void setProviderPhysicalNetwork(String value);

	/**
	 * Returns the value of the '<em><b>Provider Segmentation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provider Segmentation Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provider Segmentation Id</em>' attribute.
	 * @see #setProviderSegmentationId(int)
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getCreateNetworkRequest_ProviderSegmentationId()
	 * @model unique="false"
	 *        annotation="http://openecomp.org/sirius/openstack name='provider:segmentation_id'"
	 * @generated
	 */
	int getProviderSegmentationId();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.neutron.CreateNetworkRequest#getProviderSegmentationId <em>Provider Segmentation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider Segmentation Id</em>' attribute.
	 * @see #getProviderSegmentationId()
	 * @generated
	 */
	void setProviderSegmentationId(int value);

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
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getCreateNetworkRequest_Admin_state_up()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getAdmin_state_up();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.neutron.CreateNetworkRequest#getAdmin_state_up <em>Admin state up</em>}' attribute.
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
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getCreateNetworkRequest_Shared()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getShared();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.neutron.CreateNetworkRequest#getShared <em>Shared</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shared</em>' attribute.
	 * @see #getShared()
	 * @generated
	 */
	void setShared(Boolean value);

} // CreateNetworkRequest
