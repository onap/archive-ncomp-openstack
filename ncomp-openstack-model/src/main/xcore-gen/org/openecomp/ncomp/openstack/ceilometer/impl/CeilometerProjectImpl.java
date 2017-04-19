
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

import org.openecomp.ncomp.openstack.ceilometer.CeilometerAlarm;
import org.openecomp.ncomp.openstack.ceilometer.CeilometerMeter;
import org.openecomp.ncomp.openstack.ceilometer.CeilometerPackage;
import org.openecomp.ncomp.openstack.ceilometer.CeilometerProject;

import org.openecomp.ncomp.openstack.ceilometer.CeilometerResource;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerProjectImpl#getAlarms <em>Alarms</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerProjectImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerProjectImpl#getMeters <em>Meters</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CeilometerProjectImpl extends MinimalEObjectImpl.Container implements CeilometerProject {
	/**
	 * The cached value of the '{@link #getAlarms() <em>Alarms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlarms()
	 * @generated
	 * @ordered
	 */
	protected EList<CeilometerAlarm> alarms;

	/**
	 * The cached value of the '{@link #getResources() <em>Resources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResources()
	 * @generated
	 * @ordered
	 */
	protected EList<CeilometerResource> resources;
	/**
	 * The cached value of the '{@link #getMeters() <em>Meters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeters()
	 * @generated
	 * @ordered
	 */
	protected EList<CeilometerMeter> meters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CeilometerProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CeilometerPackage.Literals.CEILOMETER_PROJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CeilometerAlarm> getAlarms() {
		if (alarms == null) {
			alarms = new EObjectContainmentEList<CeilometerAlarm>(CeilometerAlarm.class, this, CeilometerPackage.CEILOMETER_PROJECT__ALARMS);
		}
		return alarms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CeilometerResource> getResources() {
		if (resources == null) {
			resources = new EObjectContainmentEList<CeilometerResource>(CeilometerResource.class, this, CeilometerPackage.CEILOMETER_PROJECT__RESOURCES);
		}
		return resources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CeilometerMeter> getMeters() {
		if (meters == null) {
			meters = new EObjectContainmentEList<CeilometerMeter>(CeilometerMeter.class, this, CeilometerPackage.CEILOMETER_PROJECT__METERS);
		}
		return meters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CeilometerPackage.CEILOMETER_PROJECT__ALARMS:
				return ((InternalEList<?>)getAlarms()).basicRemove(otherEnd, msgs);
			case CeilometerPackage.CEILOMETER_PROJECT__RESOURCES:
				return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
			case CeilometerPackage.CEILOMETER_PROJECT__METERS:
				return ((InternalEList<?>)getMeters()).basicRemove(otherEnd, msgs);
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
			case CeilometerPackage.CEILOMETER_PROJECT__ALARMS:
				return getAlarms();
			case CeilometerPackage.CEILOMETER_PROJECT__RESOURCES:
				return getResources();
			case CeilometerPackage.CEILOMETER_PROJECT__METERS:
				return getMeters();
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
			case CeilometerPackage.CEILOMETER_PROJECT__ALARMS:
				getAlarms().clear();
				getAlarms().addAll((Collection<? extends CeilometerAlarm>)newValue);
				return;
			case CeilometerPackage.CEILOMETER_PROJECT__RESOURCES:
				getResources().clear();
				getResources().addAll((Collection<? extends CeilometerResource>)newValue);
				return;
			case CeilometerPackage.CEILOMETER_PROJECT__METERS:
				getMeters().clear();
				getMeters().addAll((Collection<? extends CeilometerMeter>)newValue);
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
			case CeilometerPackage.CEILOMETER_PROJECT__ALARMS:
				getAlarms().clear();
				return;
			case CeilometerPackage.CEILOMETER_PROJECT__RESOURCES:
				getResources().clear();
				return;
			case CeilometerPackage.CEILOMETER_PROJECT__METERS:
				getMeters().clear();
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
			case CeilometerPackage.CEILOMETER_PROJECT__ALARMS:
				return alarms != null && !alarms.isEmpty();
			case CeilometerPackage.CEILOMETER_PROJECT__RESOURCES:
				return resources != null && !resources.isEmpty();
			case CeilometerPackage.CEILOMETER_PROJECT__METERS:
				return meters != null && !meters.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CeilometerProjectImpl
