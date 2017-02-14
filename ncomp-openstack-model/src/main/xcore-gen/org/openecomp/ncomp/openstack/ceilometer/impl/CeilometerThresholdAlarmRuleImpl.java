
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
package org.openecomp.ncomp.openstack.ceilometer.impl;

import org.openecomp.ncomp.openstack.ceilometer.CeilometerPackage;
import org.openecomp.ncomp.openstack.ceilometer.CeilometerThresholdAlarmRule;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Threshold Alarm Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerThresholdAlarmRuleImpl#getMeter_name <em>Meter name</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerThresholdAlarmRuleImpl#getEvaluation_periods <em>Evaluation periods</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerThresholdAlarmRuleImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerThresholdAlarmRuleImpl#getStatistic <em>Statistic</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerThresholdAlarmRuleImpl#getThreshold <em>Threshold</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerThresholdAlarmRuleImpl#getQuery <em>Query</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerThresholdAlarmRuleImpl#getComparison_operator <em>Comparison operator</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerThresholdAlarmRuleImpl#getExclude_outliers <em>Exclude outliers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CeilometerThresholdAlarmRuleImpl extends MinimalEObjectImpl.Container implements CeilometerThresholdAlarmRule {
	/**
	 * The default value of the '{@link #getMeter_name() <em>Meter name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeter_name()
	 * @generated
	 * @ordered
	 */
	protected static final String METER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMeter_name() <em>Meter name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeter_name()
	 * @generated
	 * @ordered
	 */
	protected String meter_name = METER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEvaluation_periods() <em>Evaluation periods</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvaluation_periods()
	 * @generated
	 * @ordered
	 */
	protected static final Long EVALUATION_PERIODS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEvaluation_periods() <em>Evaluation periods</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvaluation_periods()
	 * @generated
	 * @ordered
	 */
	protected Long evaluation_periods = EVALUATION_PERIODS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPeriod() <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected static final Long PERIOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected Long period = PERIOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatistic() <em>Statistic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatistic()
	 * @generated
	 * @ordered
	 */
	protected static final String STATISTIC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatistic() <em>Statistic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatistic()
	 * @generated
	 * @ordered
	 */
	protected String statistic = STATISTIC_EDEFAULT;

	/**
	 * The default value of the '{@link #getThreshold() <em>Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreshold()
	 * @generated
	 * @ordered
	 */
	protected static final double THRESHOLD_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getThreshold() <em>Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreshold()
	 * @generated
	 * @ordered
	 */
	protected double threshold = THRESHOLD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getQuery() <em>Query</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuery()
	 * @generated
	 * @ordered
	 */
	protected EList<String> query;

	/**
	 * The default value of the '{@link #getComparison_operator() <em>Comparison operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparison_operator()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPARISON_OPERATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComparison_operator() <em>Comparison operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparison_operator()
	 * @generated
	 * @ordered
	 */
	protected String comparison_operator = COMPARISON_OPERATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getExclude_outliers() <em>Exclude outliers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExclude_outliers()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean EXCLUDE_OUTLIERS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExclude_outliers() <em>Exclude outliers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExclude_outliers()
	 * @generated
	 * @ordered
	 */
	protected Boolean exclude_outliers = EXCLUDE_OUTLIERS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CeilometerThresholdAlarmRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CeilometerPackage.Literals.CEILOMETER_THRESHOLD_ALARM_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMeter_name() {
		return meter_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeter_name(String newMeter_name) {
		String oldMeter_name = meter_name;
		meter_name = newMeter_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CeilometerPackage.CEILOMETER_THRESHOLD_ALARM_RULE__METER_NAME, oldMeter_name, meter_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getEvaluation_periods() {
		return evaluation_periods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvaluation_periods(Long newEvaluation_periods) {
		Long oldEvaluation_periods = evaluation_periods;
		evaluation_periods = newEvaluation_periods;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CeilometerPackage.CEILOMETER_THRESHOLD_ALARM_RULE__EVALUATION_PERIODS, oldEvaluation_periods, evaluation_periods));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod(Long newPeriod) {
		Long oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CeilometerPackage.CEILOMETER_THRESHOLD_ALARM_RULE__PERIOD, oldPeriod, period));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStatistic() {
		return statistic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatistic(String newStatistic) {
		String oldStatistic = statistic;
		statistic = newStatistic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CeilometerPackage.CEILOMETER_THRESHOLD_ALARM_RULE__STATISTIC, oldStatistic, statistic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getThreshold() {
		return threshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThreshold(double newThreshold) {
		double oldThreshold = threshold;
		threshold = newThreshold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CeilometerPackage.CEILOMETER_THRESHOLD_ALARM_RULE__THRESHOLD, oldThreshold, threshold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getQuery() {
		if (query == null) {
			query = new EDataTypeEList<String>(String.class, this, CeilometerPackage.CEILOMETER_THRESHOLD_ALARM_RULE__QUERY);
		}
		return query;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComparison_operator() {
		return comparison_operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComparison_operator(String newComparison_operator) {
		String oldComparison_operator = comparison_operator;
		comparison_operator = newComparison_operator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CeilometerPackage.CEILOMETER_THRESHOLD_ALARM_RULE__COMPARISON_OPERATOR, oldComparison_operator, comparison_operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getExclude_outliers() {
		return exclude_outliers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExclude_outliers(Boolean newExclude_outliers) {
		Boolean oldExclude_outliers = exclude_outliers;
		exclude_outliers = newExclude_outliers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CeilometerPackage.CEILOMETER_THRESHOLD_ALARM_RULE__EXCLUDE_OUTLIERS, oldExclude_outliers, exclude_outliers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CeilometerPackage.CEILOMETER_THRESHOLD_ALARM_RULE__METER_NAME:
				return getMeter_name();
			case CeilometerPackage.CEILOMETER_THRESHOLD_ALARM_RULE__EVALUATION_PERIODS:
				return getEvaluation_periods();
			case CeilometerPackage.CEILOMETER_THRESHOLD_ALARM_RULE__PERIOD:
				return getPeriod();
			case CeilometerPackage.CEILOMETER_THRESHOLD_ALARM_RULE__STATISTIC:
				return getStatistic();
			case CeilometerPackage.CEILOMETER_THRESHOLD_ALARM_RULE__THRESHOLD:
				return getThreshold();
			case CeilometerPackage.CEILOMETER_THRESHOLD_ALARM_RULE__QUERY:
				return getQuery();
			case CeilometerPackage.CEILOMETER_THRESHOLD_ALARM_RULE__COMPARISON_OPERATOR:
				return getComparison_operator();
			case CeilometerPackage.CEILOMETER_THRESHOLD_ALARM_RULE__EXCLUDE_OUTLIERS:
				return getExclude_outliers();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CeilometerPackage.CEILOMETER_THRESHOLD_ALARM_RULE__METER_NAME:
				setMeter_name((String)newValue);
				return;
			case CeilometerPackage.CEILOMETER_THRESHOLD_ALARM_RULE__EVALUATION_PERIODS:
				setEvaluation_periods((Long)newValue);
				return;
			case CeilometerPackage.CEILOMETER_THRESHOLD_ALARM_RULE__PERIOD:
				setPeriod((Long)newValue);
				return;
			case CeilometerPackage.CEILOMETER_THRESHOLD_ALARM_RULE__STATISTIC:
				setStatistic((String)newValue);
				return;
			case CeilometerPackage.CEILOMETER_THRESHOLD_ALARM_RULE__THRESHOLD:
				setThreshold((Double)newValue);
				return;
			case CeilometerPackage.CEILOMETER_THRESHOLD_ALARM_RULE__QUERY:
				getQuery().clear();
				getQuery().addAll((Collection<? extends String>)newValue);
				return;
			case CeilometerPackage.CEILOMETER_THRESHOLD_ALARM_RULE__COMPARISON_OPERATOR:
				setComparison_operator((String)newValue);
				return;
			case CeilometerPackage.CEILOMETER_THRESHOLD_ALARM_RULE__EXCLUDE_OUTLIERS:
				setExclude_outliers((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CeilometerPackage.CEILOMETER_THRESHOLD_ALARM_RULE__METER_NAME:
				setMeter_name(METER_NAME_EDEFAULT);
				return;
			case CeilometerPackage.CEILOMETER_THRESHOLD_ALARM_RULE__EVALUATION_PERIODS:
				setEvaluation_periods(EVALUATION_PERIODS_EDEFAULT);
				return;
			case CeilometerPackage.CEILOMETER_THRESHOLD_ALARM_RULE__PERIOD:
				setPeriod(PERIOD_EDEFAULT);
				return;
			case CeilometerPackage.CEILOMETER_THRESHOLD_ALARM_RULE__STATISTIC:
				setStatistic(STATISTIC_EDEFAULT);
				return;
			case CeilometerPackage.CEILOMETER_THRESHOLD_ALARM_RULE__THRESHOLD:
				setThreshold(THRESHOLD_EDEFAULT);
				return;
			case CeilometerPackage.CEILOMETER_THRESHOLD_ALARM_RULE__QUERY:
				getQuery().clear();
				return;
			case CeilometerPackage.CEILOMETER_THRESHOLD_ALARM_RULE__COMPARISON_OPERATOR:
				setComparison_operator(COMPARISON_OPERATOR_EDEFAULT);
				return;
			case CeilometerPackage.CEILOMETER_THRESHOLD_ALARM_RULE__EXCLUDE_OUTLIERS:
				setExclude_outliers(EXCLUDE_OUTLIERS_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CeilometerPackage.CEILOMETER_THRESHOLD_ALARM_RULE__METER_NAME:
				return METER_NAME_EDEFAULT == null ? meter_name != null : !METER_NAME_EDEFAULT.equals(meter_name);
			case CeilometerPackage.CEILOMETER_THRESHOLD_ALARM_RULE__EVALUATION_PERIODS:
				return EVALUATION_PERIODS_EDEFAULT == null ? evaluation_periods != null : !EVALUATION_PERIODS_EDEFAULT.equals(evaluation_periods);
			case CeilometerPackage.CEILOMETER_THRESHOLD_ALARM_RULE__PERIOD:
				return PERIOD_EDEFAULT == null ? period != null : !PERIOD_EDEFAULT.equals(period);
			case CeilometerPackage.CEILOMETER_THRESHOLD_ALARM_RULE__STATISTIC:
				return STATISTIC_EDEFAULT == null ? statistic != null : !STATISTIC_EDEFAULT.equals(statistic);
			case CeilometerPackage.CEILOMETER_THRESHOLD_ALARM_RULE__THRESHOLD:
				return threshold != THRESHOLD_EDEFAULT;
			case CeilometerPackage.CEILOMETER_THRESHOLD_ALARM_RULE__QUERY:
				return query != null && !query.isEmpty();
			case CeilometerPackage.CEILOMETER_THRESHOLD_ALARM_RULE__COMPARISON_OPERATOR:
				return COMPARISON_OPERATOR_EDEFAULT == null ? comparison_operator != null : !COMPARISON_OPERATOR_EDEFAULT.equals(comparison_operator);
			case CeilometerPackage.CEILOMETER_THRESHOLD_ALARM_RULE__EXCLUDE_OUTLIERS:
				return EXCLUDE_OUTLIERS_EDEFAULT == null ? exclude_outliers != null : !EXCLUDE_OUTLIERS_EDEFAULT.equals(exclude_outliers);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (meter_name: ");
		result.append(meter_name);
		result.append(", evaluation_periods: ");
		result.append(evaluation_periods);
		result.append(", period: ");
		result.append(period);
		result.append(", statistic: ");
		result.append(statistic);
		result.append(", threshold: ");
		result.append(threshold);
		result.append(", query: ");
		result.append(query);
		result.append(", comparison_operator: ");
		result.append(comparison_operator);
		result.append(", exclude_outliers: ");
		result.append(exclude_outliers);
		result.append(')');
		return result.toString();
	}

} //CeilometerThresholdAlarmRuleImpl
