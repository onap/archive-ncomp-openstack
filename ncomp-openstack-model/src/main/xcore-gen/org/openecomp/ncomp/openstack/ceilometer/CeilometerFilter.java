
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
 * A representation of the model object '<em><b>Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerFilter#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerFilter#getValue <em>Value</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerFilter#getField <em>Field</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerFilter#getFilters <em>Filters</em>}</li>
 * </ul>
 *
 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerPackage#getCeilometerFilter()
 * @model
 * @generated
 */
public interface CeilometerFilter extends EObject {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' attribute.
	 * @see #setOperation(String)
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerPackage#getCeilometerFilter_Operation()
	 * @model unique="false"
	 * @generated
	 */
	String getOperation();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerFilter#getOperation <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' attribute.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerPackage#getCeilometerFilter_Value()
	 * @model unique="false"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerFilter#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field</em>' attribute.
	 * @see #setField(String)
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerPackage#getCeilometerFilter_Field()
	 * @model unique="false"
	 * @generated
	 */
	String getField();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerFilter#getField <em>Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field</em>' attribute.
	 * @see #getField()
	 * @generated
	 */
	void setField(String value);

	/**
	 * Returns the value of the '<em><b>Filters</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.openstack.ceilometer.CeilometerFilter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filters</em>' containment reference list.
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerPackage#getCeilometerFilter_Filters()
	 * @model containment="true"
	 * @generated
	 */
	EList<CeilometerFilter> getFilters();

} // CeilometerFilter
