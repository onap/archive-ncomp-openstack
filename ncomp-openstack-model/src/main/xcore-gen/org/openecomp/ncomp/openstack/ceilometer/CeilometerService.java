
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
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerService#getCeilometerAvailableCapabilites <em>Ceilometer Available Capabilites</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerService#getCeilometerUnavailableCapabilites <em>Ceilometer Unavailable Capabilites</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerPackage#getCeilometerService()
 * @model abstract="true"
 * @generated
 */
public interface CeilometerService extends EObject {
	/**
	 * Returns the value of the '<em><b>Ceilometer Available Capabilites</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ceilometer Available Capabilites</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ceilometer Available Capabilites</em>' attribute list.
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerPackage#getCeilometerService_CeilometerAvailableCapabilites()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getCeilometerAvailableCapabilites();

	/**
	 * Returns the value of the '<em><b>Ceilometer Unavailable Capabilites</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ceilometer Unavailable Capabilites</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ceilometer Unavailable Capabilites</em>' attribute list.
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerPackage#getCeilometerService_CeilometerUnavailableCapabilites()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getCeilometerUnavailableCapabilites();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" requestUnique="false"
	 * @generated
	 */
	CeilometerAlarm createAlarm(CreateAlarmRequest request);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model projectNameUnique="false" nameUnique="false"
	 * @generated
	 */
	void deleteAlarm(String projectName, String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" requestUnique="false"
	 * @generated
	 */
	EList<CeilometerSample> createAlarm(SampleRequest request);

} // CeilometerService
