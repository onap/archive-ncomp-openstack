
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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerPackage
 * @generated
 */
public class CeilometerSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CeilometerPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CeilometerSwitch() {
		if (modelPackage == null) {
			modelPackage = CeilometerPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CeilometerPackage.CEILOMETER_SERVICE: {
				CeilometerService ceilometerService = (CeilometerService)theEObject;
				T result = caseCeilometerService(ceilometerService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CeilometerPackage.CEILOMETER_PROJECT: {
				CeilometerProject ceilometerProject = (CeilometerProject)theEObject;
				T result = caseCeilometerProject(ceilometerProject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CeilometerPackage.CEILOMETER_ALARM: {
				CeilometerAlarm ceilometerAlarm = (CeilometerAlarm)theEObject;
				T result = caseCeilometerAlarm(ceilometerAlarm);
				if (result == null) result = caseNamedEntity(ceilometerAlarm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CeilometerPackage.CEILOMETER_THRESHOLD_ALARM: {
				CeilometerThresholdAlarm ceilometerThresholdAlarm = (CeilometerThresholdAlarm)theEObject;
				T result = caseCeilometerThresholdAlarm(ceilometerThresholdAlarm);
				if (result == null) result = caseCeilometerAlarm(ceilometerThresholdAlarm);
				if (result == null) result = caseNamedEntity(ceilometerThresholdAlarm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CeilometerPackage.CEILOMETER_THRESHOLD_ALARM_RULE: {
				CeilometerThresholdAlarmRule ceilometerThresholdAlarmRule = (CeilometerThresholdAlarmRule)theEObject;
				T result = caseCeilometerThresholdAlarmRule(ceilometerThresholdAlarmRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CeilometerPackage.CEILOMETER_RESOURCE: {
				CeilometerResource ceilometerResource = (CeilometerResource)theEObject;
				T result = caseCeilometerResource(ceilometerResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CeilometerPackage.CEILOMETER_METER: {
				CeilometerMeter ceilometerMeter = (CeilometerMeter)theEObject;
				T result = caseCeilometerMeter(ceilometerMeter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CeilometerPackage.CEILOMETER_QUERY: {
				CeilometerQuery ceilometerQuery = (CeilometerQuery)theEObject;
				T result = caseCeilometerQuery(ceilometerQuery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CeilometerPackage.CEILOMETER_FILTER: {
				CeilometerFilter ceilometerFilter = (CeilometerFilter)theEObject;
				T result = caseCeilometerFilter(ceilometerFilter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CeilometerPackage.CEILOMETER_ORDERED_BY: {
				CeilometerOrderedBy ceilometerOrderedBy = (CeilometerOrderedBy)theEObject;
				T result = caseCeilometerOrderedBy(ceilometerOrderedBy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CeilometerPackage.CEILOMETER_REQUEST: {
				CeilometerRequest ceilometerRequest = (CeilometerRequest)theEObject;
				T result = caseCeilometerRequest(ceilometerRequest);
				if (result == null) result = caseOpenStackRequest(ceilometerRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CeilometerPackage.CREATE_ALARM_REQUEST: {
				CreateAlarmRequest createAlarmRequest = (CreateAlarmRequest)theEObject;
				T result = caseCreateAlarmRequest(createAlarmRequest);
				if (result == null) result = caseCeilometerRequest(createAlarmRequest);
				if (result == null) result = caseOpenStackRequest(createAlarmRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CeilometerPackage.SAMPLE_REQUEST: {
				SampleRequest sampleRequest = (SampleRequest)theEObject;
				T result = caseSampleRequest(sampleRequest);
				if (result == null) result = caseCeilometerRequest(sampleRequest);
				if (result == null) result = caseOpenStackRequest(sampleRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CeilometerPackage.CEILOMETER_SAMPLE: {
				CeilometerSample ceilometerSample = (CeilometerSample)theEObject;
				T result = caseCeilometerSample(ceilometerSample);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCeilometerService(CeilometerService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Project</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Project</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCeilometerProject(CeilometerProject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alarm</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alarm</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCeilometerAlarm(CeilometerAlarm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Threshold Alarm</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Threshold Alarm</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCeilometerThresholdAlarm(CeilometerThresholdAlarm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Threshold Alarm Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Threshold Alarm Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCeilometerThresholdAlarmRule(CeilometerThresholdAlarmRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCeilometerResource(CeilometerResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Meter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Meter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCeilometerMeter(CeilometerMeter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCeilometerQuery(CeilometerQuery object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCeilometerFilter(CeilometerFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ordered By</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ordered By</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCeilometerOrderedBy(CeilometerOrderedBy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCeilometerRequest(CeilometerRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Alarm Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Alarm Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateAlarmRequest(CreateAlarmRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sample Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sample Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSampleRequest(SampleRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sample</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sample</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCeilometerSample(CeilometerSample object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedEntity(NamedEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Open Stack Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Open Stack Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpenStackRequest(OpenStackRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CeilometerSwitch
