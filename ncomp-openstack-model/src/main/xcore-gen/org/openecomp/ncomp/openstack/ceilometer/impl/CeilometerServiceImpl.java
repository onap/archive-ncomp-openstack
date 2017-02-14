
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
import org.openecomp.ncomp.openstack.ceilometer.CeilometerPackage;
import org.openecomp.ncomp.openstack.ceilometer.CeilometerSample;
import org.openecomp.ncomp.openstack.ceilometer.CeilometerService;
import org.openecomp.ncomp.openstack.ceilometer.CreateAlarmRequest;
import org.openecomp.ncomp.openstack.ceilometer.SampleRequest;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerServiceImpl#getCeilometerAvailableCapabilites <em>Ceilometer Available Capabilites</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerServiceImpl#getCeilometerUnavailableCapabilites <em>Ceilometer Unavailable Capabilites</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CeilometerServiceImpl extends MinimalEObjectImpl.Container implements CeilometerService {
	/**
	 * The cached value of the '{@link #getCeilometerAvailableCapabilites() <em>Ceilometer Available Capabilites</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCeilometerAvailableCapabilites()
	 * @generated
	 * @ordered
	 */
	protected EList<String> ceilometerAvailableCapabilites;
	/**
	 * The cached value of the '{@link #getCeilometerUnavailableCapabilites() <em>Ceilometer Unavailable Capabilites</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCeilometerUnavailableCapabilites()
	 * @generated
	 * @ordered
	 */
	protected EList<String> ceilometerUnavailableCapabilites;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CeilometerServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CeilometerPackage.Literals.CEILOMETER_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getCeilometerAvailableCapabilites() {
		if (ceilometerAvailableCapabilites == null) {
			ceilometerAvailableCapabilites = new EDataTypeEList<String>(String.class, this, CeilometerPackage.CEILOMETER_SERVICE__CEILOMETER_AVAILABLE_CAPABILITES);
		}
		return ceilometerAvailableCapabilites;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getCeilometerUnavailableCapabilites() {
		if (ceilometerUnavailableCapabilites == null) {
			ceilometerUnavailableCapabilites = new EDataTypeEList<String>(String.class, this, CeilometerPackage.CEILOMETER_SERVICE__CEILOMETER_UNAVAILABLE_CAPABILITES);
		}
		return ceilometerUnavailableCapabilites;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CeilometerAlarm createAlarm(CreateAlarmRequest request) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void deleteAlarm(String projectName, String name) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CeilometerSample> createAlarm(SampleRequest request) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CeilometerPackage.CEILOMETER_SERVICE__CEILOMETER_AVAILABLE_CAPABILITES:
				return getCeilometerAvailableCapabilites();
			case CeilometerPackage.CEILOMETER_SERVICE__CEILOMETER_UNAVAILABLE_CAPABILITES:
				return getCeilometerUnavailableCapabilites();
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
			case CeilometerPackage.CEILOMETER_SERVICE__CEILOMETER_AVAILABLE_CAPABILITES:
				getCeilometerAvailableCapabilites().clear();
				getCeilometerAvailableCapabilites().addAll((Collection<? extends String>)newValue);
				return;
			case CeilometerPackage.CEILOMETER_SERVICE__CEILOMETER_UNAVAILABLE_CAPABILITES:
				getCeilometerUnavailableCapabilites().clear();
				getCeilometerUnavailableCapabilites().addAll((Collection<? extends String>)newValue);
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
			case CeilometerPackage.CEILOMETER_SERVICE__CEILOMETER_AVAILABLE_CAPABILITES:
				getCeilometerAvailableCapabilites().clear();
				return;
			case CeilometerPackage.CEILOMETER_SERVICE__CEILOMETER_UNAVAILABLE_CAPABILITES:
				getCeilometerUnavailableCapabilites().clear();
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
			case CeilometerPackage.CEILOMETER_SERVICE__CEILOMETER_AVAILABLE_CAPABILITES:
				return ceilometerAvailableCapabilites != null && !ceilometerAvailableCapabilites.isEmpty();
			case CeilometerPackage.CEILOMETER_SERVICE__CEILOMETER_UNAVAILABLE_CAPABILITES:
				return ceilometerUnavailableCapabilites != null && !ceilometerUnavailableCapabilites.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CeilometerPackage.CEILOMETER_SERVICE___CREATE_ALARM__CREATEALARMREQUEST:
				return createAlarm((CreateAlarmRequest)arguments.get(0));
			case CeilometerPackage.CEILOMETER_SERVICE___DELETE_ALARM__STRING_STRING:
				deleteAlarm((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case CeilometerPackage.CEILOMETER_SERVICE___CREATE_ALARM__SAMPLEREQUEST:
				return createAlarm((SampleRequest)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (ceilometerAvailableCapabilites: ");
		result.append(ceilometerAvailableCapabilites);
		result.append(", ceilometerUnavailableCapabilites: ");
		result.append(ceilometerUnavailableCapabilites);
		result.append(')');
		return result.toString();
	}

} //CeilometerServiceImpl
