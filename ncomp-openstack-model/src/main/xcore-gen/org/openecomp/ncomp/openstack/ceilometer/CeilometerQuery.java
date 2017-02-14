
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
package org.openecomp.ncomp.openstack.ceilometer;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerQuery#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerQuery#getOrderby <em>Orderby</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerQuery#getLimit <em>Limit</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerPackage#getCeilometerQuery()
 * @model
 * @generated
 */
public interface CeilometerQuery extends EObject {
	/**
	 * Returns the value of the '<em><b>Filter</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.openstack.ceilometer.CeilometerFilter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter</em>' containment reference list.
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerPackage#getCeilometerQuery_Filter()
	 * @model containment="true"
	 * @generated
	 */
	EList<CeilometerFilter> getFilter();

	/**
	 * Returns the value of the '<em><b>Orderby</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.openstack.ceilometer.CeilometerOrderedBy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orderby</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orderby</em>' containment reference list.
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerPackage#getCeilometerQuery_Orderby()
	 * @model containment="true"
	 * @generated
	 */
	EList<CeilometerOrderedBy> getOrderby();

	/**
	 * Returns the value of the '<em><b>Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Limit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Limit</em>' attribute.
	 * @see #setLimit(Long)
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerPackage#getCeilometerQuery_Limit()
	 * @model unique="false"
	 * @generated
	 */
	Long getLimit();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerQuery#getLimit <em>Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Limit</em>' attribute.
	 * @see #getLimit()
	 * @generated
	 */
	void setLimit(Long value);

} // CeilometerQuery
