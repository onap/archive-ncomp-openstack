
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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerPackage
 * @generated
 */
public interface CeilometerFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CeilometerFactory eINSTANCE = org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Threshold Alarm</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Threshold Alarm</em>'.
	 * @generated
	 */
	CeilometerThresholdAlarm createCeilometerThresholdAlarm();

	/**
	 * Returns a new object of class '<em>Threshold Alarm Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Threshold Alarm Rule</em>'.
	 * @generated
	 */
	CeilometerThresholdAlarmRule createCeilometerThresholdAlarmRule();

	/**
	 * Returns a new object of class '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource</em>'.
	 * @generated
	 */
	CeilometerResource createCeilometerResource();

	/**
	 * Returns a new object of class '<em>Meter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Meter</em>'.
	 * @generated
	 */
	CeilometerMeter createCeilometerMeter();

	/**
	 * Returns a new object of class '<em>Query</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Query</em>'.
	 * @generated
	 */
	CeilometerQuery createCeilometerQuery();

	/**
	 * Returns a new object of class '<em>Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Filter</em>'.
	 * @generated
	 */
	CeilometerFilter createCeilometerFilter();

	/**
	 * Returns a new object of class '<em>Ordered By</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ordered By</em>'.
	 * @generated
	 */
	CeilometerOrderedBy createCeilometerOrderedBy();

	/**
	 * Returns a new object of class '<em>Create Alarm Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create Alarm Request</em>'.
	 * @generated
	 */
	CreateAlarmRequest createCreateAlarmRequest();

	/**
	 * Returns a new object of class '<em>Sample Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sample Request</em>'.
	 * @generated
	 */
	SampleRequest createSampleRequest();

	/**
	 * Returns a new object of class '<em>Sample</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sample</em>'.
	 * @generated
	 */
	CeilometerSample createCeilometerSample();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CeilometerPackage getCeilometerPackage();

} //CeilometerFactory
