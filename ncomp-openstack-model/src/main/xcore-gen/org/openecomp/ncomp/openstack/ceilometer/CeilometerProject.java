
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
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerProject#getAlarms <em>Alarms</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerProject#getResources <em>Resources</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerProject#getMeters <em>Meters</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerPackage#getCeilometerProject()
 * @model abstract="true"
 * @generated
 */
public interface CeilometerProject extends EObject {
	/**
	 * Returns the value of the '<em><b>Alarms</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.openstack.ceilometer.CeilometerAlarm}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alarms</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alarms</em>' containment reference list.
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerPackage#getCeilometerProject_Alarms()
	 * @model containment="true"
	 * @generated
	 */
	EList<CeilometerAlarm> getAlarms();

	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.openstack.ceilometer.CeilometerResource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference list.
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerPackage#getCeilometerProject_Resources()
	 * @model containment="true"
	 * @generated
	 */
	EList<CeilometerResource> getResources();

	/**
	 * Returns the value of the '<em><b>Meters</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.openstack.ceilometer.CeilometerMeter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meters</em>' containment reference list.
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerPackage#getCeilometerProject_Meters()
	 * @model containment="true"
	 * @generated
	 */
	EList<CeilometerMeter> getMeters();

} // CeilometerProject
