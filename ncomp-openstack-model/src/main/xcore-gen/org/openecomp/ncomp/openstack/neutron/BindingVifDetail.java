
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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binding Vif Detail</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.BindingVifDetail#getOvs_hybrid_plug <em>Ovs hybrid plug</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.BindingVifDetail#getPort_filter <em>Port filter</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getBindingVifDetail()
 * @model
 * @generated
 */
public interface BindingVifDetail extends EObject {
	/**
	 * Returns the value of the '<em><b>Ovs hybrid plug</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ovs hybrid plug</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ovs hybrid plug</em>' attribute.
	 * @see #setOvs_hybrid_plug(Boolean)
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getBindingVifDetail_Ovs_hybrid_plug()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getOvs_hybrid_plug();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.neutron.BindingVifDetail#getOvs_hybrid_plug <em>Ovs hybrid plug</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ovs hybrid plug</em>' attribute.
	 * @see #getOvs_hybrid_plug()
	 * @generated
	 */
	void setOvs_hybrid_plug(Boolean value);

	/**
	 * Returns the value of the '<em><b>Port filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port filter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port filter</em>' attribute.
	 * @see #setPort_filter(Boolean)
	 * @see org.openecomp.ncomp.openstack.neutron.NeutronPackage#getBindingVifDetail_Port_filter()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getPort_filter();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.neutron.BindingVifDetail#getPort_filter <em>Port filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port filter</em>' attribute.
	 * @see #getPort_filter()
	 * @generated
	 */
	void setPort_filter(Boolean value);

} // BindingVifDetail
