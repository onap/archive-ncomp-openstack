
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

import org.openecomp.ncomp.openstack.ceilometer.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CeilometerFactoryImpl extends EFactoryImpl implements CeilometerFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CeilometerFactory init() {
		try {
			CeilometerFactory theCeilometerFactory = (CeilometerFactory)EPackage.Registry.INSTANCE.getEFactory(CeilometerPackage.eNS_URI);
			if (theCeilometerFactory != null) {
				return theCeilometerFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CeilometerFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CeilometerFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CeilometerPackage.CEILOMETER_THRESHOLD_ALARM: return createCeilometerThresholdAlarm();
			case CeilometerPackage.CEILOMETER_THRESHOLD_ALARM_RULE: return createCeilometerThresholdAlarmRule();
			case CeilometerPackage.CEILOMETER_RESOURCE: return createCeilometerResource();
			case CeilometerPackage.CEILOMETER_METER: return createCeilometerMeter();
			case CeilometerPackage.CEILOMETER_QUERY: return createCeilometerQuery();
			case CeilometerPackage.CEILOMETER_FILTER: return createCeilometerFilter();
			case CeilometerPackage.CEILOMETER_ORDERED_BY: return createCeilometerOrderedBy();
			case CeilometerPackage.CREATE_ALARM_REQUEST: return createCreateAlarmRequest();
			case CeilometerPackage.SAMPLE_REQUEST: return createSampleRequest();
			case CeilometerPackage.CEILOMETER_SAMPLE: return createCeilometerSample();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CeilometerThresholdAlarm createCeilometerThresholdAlarm() {
		CeilometerThresholdAlarmImpl ceilometerThresholdAlarm = new CeilometerThresholdAlarmImpl();
		return ceilometerThresholdAlarm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CeilometerThresholdAlarmRule createCeilometerThresholdAlarmRule() {
		CeilometerThresholdAlarmRuleImpl ceilometerThresholdAlarmRule = new CeilometerThresholdAlarmRuleImpl();
		return ceilometerThresholdAlarmRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CeilometerResource createCeilometerResource() {
		CeilometerResourceImpl ceilometerResource = new CeilometerResourceImpl();
		return ceilometerResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CeilometerMeter createCeilometerMeter() {
		CeilometerMeterImpl ceilometerMeter = new CeilometerMeterImpl();
		return ceilometerMeter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CeilometerQuery createCeilometerQuery() {
		CeilometerQueryImpl ceilometerQuery = new CeilometerQueryImpl();
		return ceilometerQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CeilometerFilter createCeilometerFilter() {
		CeilometerFilterImpl ceilometerFilter = new CeilometerFilterImpl();
		return ceilometerFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CeilometerOrderedBy createCeilometerOrderedBy() {
		CeilometerOrderedByImpl ceilometerOrderedBy = new CeilometerOrderedByImpl();
		return ceilometerOrderedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateAlarmRequest createCreateAlarmRequest() {
		CreateAlarmRequestImpl createAlarmRequest = new CreateAlarmRequestImpl();
		return createAlarmRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SampleRequest createSampleRequest() {
		SampleRequestImpl sampleRequest = new SampleRequestImpl();
		return sampleRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CeilometerSample createCeilometerSample() {
		CeilometerSampleImpl ceilometerSample = new CeilometerSampleImpl();
		return ceilometerSample;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CeilometerPackage getCeilometerPackage() {
		return (CeilometerPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CeilometerPackage getPackage() {
		return CeilometerPackage.eINSTANCE;
	}

} //CeilometerFactoryImpl
