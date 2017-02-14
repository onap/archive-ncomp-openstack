
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
package org.openecomp.ncomp.openstack.ceilometer.util;

import org.openecomp.ncomp.core.NamedEntity;
import org.openecomp.ncomp.openstack.ceilometer.*;

import org.openecomp.ncomp.openstack.core.OpenStackRequest;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerPackage
 * @generated
 */
public class CeilometerAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CeilometerPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CeilometerAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CeilometerPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CeilometerSwitch<Adapter> modelSwitch =
		new CeilometerSwitch<Adapter>() {
			@Override
			public Adapter caseCeilometerService(CeilometerService object) {
				return createCeilometerServiceAdapter();
			}
			@Override
			public Adapter caseCeilometerProject(CeilometerProject object) {
				return createCeilometerProjectAdapter();
			}
			@Override
			public Adapter caseCeilometerAlarm(CeilometerAlarm object) {
				return createCeilometerAlarmAdapter();
			}
			@Override
			public Adapter caseCeilometerThresholdAlarm(CeilometerThresholdAlarm object) {
				return createCeilometerThresholdAlarmAdapter();
			}
			@Override
			public Adapter caseCeilometerThresholdAlarmRule(CeilometerThresholdAlarmRule object) {
				return createCeilometerThresholdAlarmRuleAdapter();
			}
			@Override
			public Adapter caseCeilometerResource(CeilometerResource object) {
				return createCeilometerResourceAdapter();
			}
			@Override
			public Adapter caseCeilometerMeter(CeilometerMeter object) {
				return createCeilometerMeterAdapter();
			}
			@Override
			public Adapter caseCeilometerQuery(CeilometerQuery object) {
				return createCeilometerQueryAdapter();
			}
			@Override
			public Adapter caseCeilometerFilter(CeilometerFilter object) {
				return createCeilometerFilterAdapter();
			}
			@Override
			public Adapter caseCeilometerOrderedBy(CeilometerOrderedBy object) {
				return createCeilometerOrderedByAdapter();
			}
			@Override
			public Adapter caseCeilometerRequest(CeilometerRequest object) {
				return createCeilometerRequestAdapter();
			}
			@Override
			public Adapter caseCreateAlarmRequest(CreateAlarmRequest object) {
				return createCreateAlarmRequestAdapter();
			}
			@Override
			public Adapter caseSampleRequest(SampleRequest object) {
				return createSampleRequestAdapter();
			}
			@Override
			public Adapter caseCeilometerSample(CeilometerSample object) {
				return createCeilometerSampleAdapter();
			}
			@Override
			public Adapter caseNamedEntity(NamedEntity object) {
				return createNamedEntityAdapter();
			}
			@Override
			public Adapter caseOpenStackRequest(OpenStackRequest object) {
				return createOpenStackRequestAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerService
	 * @generated
	 */
	public Adapter createCeilometerServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerProject
	 * @generated
	 */
	public Adapter createCeilometerProjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerAlarm <em>Alarm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerAlarm
	 * @generated
	 */
	public Adapter createCeilometerAlarmAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerThresholdAlarm <em>Threshold Alarm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerThresholdAlarm
	 * @generated
	 */
	public Adapter createCeilometerThresholdAlarmAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerThresholdAlarmRule <em>Threshold Alarm Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerThresholdAlarmRule
	 * @generated
	 */
	public Adapter createCeilometerThresholdAlarmRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerResource
	 * @generated
	 */
	public Adapter createCeilometerResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerMeter <em>Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerMeter
	 * @generated
	 */
	public Adapter createCeilometerMeterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerQuery
	 * @generated
	 */
	public Adapter createCeilometerQueryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerFilter
	 * @generated
	 */
	public Adapter createCeilometerFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerOrderedBy <em>Ordered By</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerOrderedBy
	 * @generated
	 */
	public Adapter createCeilometerOrderedByAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerRequest <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerRequest
	 * @generated
	 */
	public Adapter createCeilometerRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.openstack.ceilometer.CreateAlarmRequest <em>Create Alarm Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.openstack.ceilometer.CreateAlarmRequest
	 * @generated
	 */
	public Adapter createCreateAlarmRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.openstack.ceilometer.SampleRequest <em>Sample Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.openstack.ceilometer.SampleRequest
	 * @generated
	 */
	public Adapter createSampleRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerSample <em>Sample</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerSample
	 * @generated
	 */
	public Adapter createCeilometerSampleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.core.NamedEntity <em>Named Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.core.NamedEntity
	 * @generated
	 */
	public Adapter createNamedEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.openstack.core.OpenStackRequest <em>Open Stack Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.openstack.core.OpenStackRequest
	 * @generated
	 */
	public Adapter createOpenStackRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CeilometerAdapterFactory
