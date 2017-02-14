
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
 * A representation of the model object '<em><b>Threshold Alarm Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerThresholdAlarmRule#getMeter_name <em>Meter name</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerThresholdAlarmRule#getEvaluation_periods <em>Evaluation periods</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerThresholdAlarmRule#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerThresholdAlarmRule#getStatistic <em>Statistic</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerThresholdAlarmRule#getThreshold <em>Threshold</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerThresholdAlarmRule#getQuery <em>Query</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerThresholdAlarmRule#getComparison_operator <em>Comparison operator</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerThresholdAlarmRule#getExclude_outliers <em>Exclude outliers</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerPackage#getCeilometerThresholdAlarmRule()
 * @model
 * @generated
 */
public interface CeilometerThresholdAlarmRule extends EObject {
	/**
	 * Returns the value of the '<em><b>Meter name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meter name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meter name</em>' attribute.
	 * @see #setMeter_name(String)
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerPackage#getCeilometerThresholdAlarmRule_Meter_name()
	 * @model unique="false"
	 * @generated
	 */
	String getMeter_name();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerThresholdAlarmRule#getMeter_name <em>Meter name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meter name</em>' attribute.
	 * @see #getMeter_name()
	 * @generated
	 */
	void setMeter_name(String value);

	/**
	 * Returns the value of the '<em><b>Evaluation periods</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evaluation periods</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evaluation periods</em>' attribute.
	 * @see #setEvaluation_periods(Long)
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerPackage#getCeilometerThresholdAlarmRule_Evaluation_periods()
	 * @model unique="false"
	 * @generated
	 */
	Long getEvaluation_periods();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerThresholdAlarmRule#getEvaluation_periods <em>Evaluation periods</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Evaluation periods</em>' attribute.
	 * @see #getEvaluation_periods()
	 * @generated
	 */
	void setEvaluation_periods(Long value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' attribute.
	 * @see #setPeriod(Long)
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerPackage#getCeilometerThresholdAlarmRule_Period()
	 * @model unique="false"
	 * @generated
	 */
	Long getPeriod();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerThresholdAlarmRule#getPeriod <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' attribute.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(Long value);

	/**
	 * Returns the value of the '<em><b>Statistic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statistic</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statistic</em>' attribute.
	 * @see #setStatistic(String)
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerPackage#getCeilometerThresholdAlarmRule_Statistic()
	 * @model unique="false"
	 * @generated
	 */
	String getStatistic();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerThresholdAlarmRule#getStatistic <em>Statistic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statistic</em>' attribute.
	 * @see #getStatistic()
	 * @generated
	 */
	void setStatistic(String value);

	/**
	 * Returns the value of the '<em><b>Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Threshold</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threshold</em>' attribute.
	 * @see #setThreshold(double)
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerPackage#getCeilometerThresholdAlarmRule_Threshold()
	 * @model unique="false"
	 * @generated
	 */
	double getThreshold();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerThresholdAlarmRule#getThreshold <em>Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Threshold</em>' attribute.
	 * @see #getThreshold()
	 * @generated
	 */
	void setThreshold(double value);

	/**
	 * Returns the value of the '<em><b>Query</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query</em>' attribute list.
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerPackage#getCeilometerThresholdAlarmRule_Query()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getQuery();

	/**
	 * Returns the value of the '<em><b>Comparison operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comparison operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comparison operator</em>' attribute.
	 * @see #setComparison_operator(String)
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerPackage#getCeilometerThresholdAlarmRule_Comparison_operator()
	 * @model unique="false"
	 * @generated
	 */
	String getComparison_operator();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerThresholdAlarmRule#getComparison_operator <em>Comparison operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comparison operator</em>' attribute.
	 * @see #getComparison_operator()
	 * @generated
	 */
	void setComparison_operator(String value);

	/**
	 * Returns the value of the '<em><b>Exclude outliers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exclude outliers</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exclude outliers</em>' attribute.
	 * @see #setExclude_outliers(Boolean)
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerPackage#getCeilometerThresholdAlarmRule_Exclude_outliers()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getExclude_outliers();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerThresholdAlarmRule#getExclude_outliers <em>Exclude outliers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exclude outliers</em>' attribute.
	 * @see #getExclude_outliers()
	 * @generated
	 */
	void setExclude_outliers(Boolean value);

} // CeilometerThresholdAlarmRule
