
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
import org.openecomp.ncomp.openstack.ceilometer.CeilometerThresholdAlarm;

import org.openecomp.ncomp.openstack.ceilometer.CeilometerThresholdAlarmRule;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Threshold Alarm</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerThresholdAlarmImpl#getThreshold_rule <em>Threshold rule</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CeilometerThresholdAlarmImpl extends CeilometerAlarmImpl implements CeilometerThresholdAlarm {
	/**
	 * The cached value of the '{@link #getThreshold_rule() <em>Threshold rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreshold_rule()
	 * @generated
	 * @ordered
	 */
	protected CeilometerThresholdAlarmRule threshold_rule;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CeilometerThresholdAlarmImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CeilometerPackage.Literals.CEILOMETER_THRESHOLD_ALARM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CeilometerThresholdAlarmRule getThreshold_rule() {
		return threshold_rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThreshold_rule(CeilometerThresholdAlarmRule newThreshold_rule, NotificationChain msgs) {
		CeilometerThresholdAlarmRule oldThreshold_rule = threshold_rule;
		threshold_rule = newThreshold_rule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CeilometerPackage.CEILOMETER_THRESHOLD_ALARM__THRESHOLD_RULE, oldThreshold_rule, newThreshold_rule);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThreshold_rule(CeilometerThresholdAlarmRule newThreshold_rule) {
		if (newThreshold_rule != threshold_rule) {
			NotificationChain msgs = null;
			if (threshold_rule != null)
				msgs = ((InternalEObject)threshold_rule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CeilometerPackage.CEILOMETER_THRESHOLD_ALARM__THRESHOLD_RULE, null, msgs);
			if (newThreshold_rule != null)
				msgs = ((InternalEObject)newThreshold_rule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CeilometerPackage.CEILOMETER_THRESHOLD_ALARM__THRESHOLD_RULE, null, msgs);
			msgs = basicSetThreshold_rule(newThreshold_rule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CeilometerPackage.CEILOMETER_THRESHOLD_ALARM__THRESHOLD_RULE, newThreshold_rule, newThreshold_rule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CeilometerPackage.CEILOMETER_THRESHOLD_ALARM__THRESHOLD_RULE:
				return basicSetThreshold_rule(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CeilometerPackage.CEILOMETER_THRESHOLD_ALARM__THRESHOLD_RULE:
				return getThreshold_rule();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CeilometerPackage.CEILOMETER_THRESHOLD_ALARM__THRESHOLD_RULE:
				setThreshold_rule((CeilometerThresholdAlarmRule)newValue);
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
			case CeilometerPackage.CEILOMETER_THRESHOLD_ALARM__THRESHOLD_RULE:
				setThreshold_rule((CeilometerThresholdAlarmRule)null);
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
			case CeilometerPackage.CEILOMETER_THRESHOLD_ALARM__THRESHOLD_RULE:
				return threshold_rule != null;
		}
		return super.eIsSet(featureID);
	}

} //CeilometerThresholdAlarmImpl
