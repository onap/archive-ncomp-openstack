
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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Threshold Alarm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerThresholdAlarm#getThreshold_rule <em>Threshold rule</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerPackage#getCeilometerThresholdAlarm()
 * @model
 * @generated
 */
public interface CeilometerThresholdAlarm extends CeilometerAlarm {

	/**
	 * Returns the value of the '<em><b>Threshold rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Threshold rule</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threshold rule</em>' containment reference.
	 * @see #setThreshold_rule(CeilometerThresholdAlarmRule)
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerPackage#getCeilometerThresholdAlarm_Threshold_rule()
	 * @model containment="true"
	 * @generated
	 */
	CeilometerThresholdAlarmRule getThreshold_rule();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerThresholdAlarm#getThreshold_rule <em>Threshold rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Threshold rule</em>' containment reference.
	 * @see #getThreshold_rule()
	 * @generated
	 */
	void setThreshold_rule(CeilometerThresholdAlarmRule value);
} // CeilometerThresholdAlarm
