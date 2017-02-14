
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
import org.openecomp.ncomp.openstack.ceilometer.CeilometerFactory;
import org.openecomp.ncomp.openstack.ceilometer.CeilometerFilter;
import org.openecomp.ncomp.openstack.ceilometer.CeilometerMeter;
import org.openecomp.ncomp.openstack.ceilometer.CeilometerOrderedBy;
import org.openecomp.ncomp.openstack.ceilometer.CeilometerPackage;
import org.openecomp.ncomp.openstack.ceilometer.CeilometerProject;
import org.openecomp.ncomp.openstack.ceilometer.CeilometerQuery;
import org.openecomp.ncomp.openstack.ceilometer.CeilometerRequest;
import org.openecomp.ncomp.openstack.ceilometer.CeilometerResource;
import org.openecomp.ncomp.openstack.ceilometer.CeilometerSample;
import org.openecomp.ncomp.openstack.ceilometer.CeilometerService;
import org.openecomp.ncomp.openstack.ceilometer.CeilometerThresholdAlarm;
import org.openecomp.ncomp.openstack.ceilometer.CeilometerThresholdAlarmRule;
import org.openecomp.ncomp.openstack.ceilometer.CreateAlarmRequest;

import org.openecomp.ncomp.openstack.ceilometer.SampleRequest;
import org.openecomp.ncomp.openstack.compute.ComputePackage;
import org.openecomp.ncomp.openstack.core.CorePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CeilometerPackageImpl extends EPackageImpl implements CeilometerPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ceilometerServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ceilometerProjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ceilometerAlarmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ceilometerThresholdAlarmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ceilometerThresholdAlarmRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ceilometerResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ceilometerMeterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ceilometerQueryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ceilometerFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ceilometerOrderedByEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ceilometerRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createAlarmRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sampleRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ceilometerSampleEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CeilometerPackageImpl() {
		super(eNS_URI, CeilometerFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link CeilometerPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CeilometerPackage init() {
		if (isInited) return (CeilometerPackage)EPackage.Registry.INSTANCE.getEPackage(CeilometerPackage.eNS_URI);

		// Obtain or create and register package
		CeilometerPackageImpl theCeilometerPackage = (CeilometerPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CeilometerPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CeilometerPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ComputePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCeilometerPackage.createPackageContents();

		// Initialize created meta-data
		theCeilometerPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCeilometerPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CeilometerPackage.eNS_URI, theCeilometerPackage);
		return theCeilometerPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCeilometerService() {
		return ceilometerServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCeilometerService_CeilometerAvailableCapabilites() {
		return (EAttribute)ceilometerServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCeilometerService_CeilometerUnavailableCapabilites() {
		return (EAttribute)ceilometerServiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCeilometerService__CreateAlarm__CreateAlarmRequest() {
		return ceilometerServiceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCeilometerService__DeleteAlarm__String_String() {
		return ceilometerServiceEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCeilometerService__CreateAlarm__SampleRequest() {
		return ceilometerServiceEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCeilometerProject() {
		return ceilometerProjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCeilometerProject_Alarms() {
		return (EReference)ceilometerProjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCeilometerProject_Resources() {
		return (EReference)ceilometerProjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCeilometerProject_Meters() {
		return (EReference)ceilometerProjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCeilometerAlarm() {
		return ceilometerAlarmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCeilometerAlarm_Id() {
		return (EAttribute)ceilometerAlarmEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCeilometerAlarm_User_id() {
		return (EAttribute)ceilometerAlarmEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCeilometerAlarm_Timestamp() {
		return (EAttribute)ceilometerAlarmEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCeilometerAlarm_Enabled() {
		return (EAttribute)ceilometerAlarmEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCeilometerAlarm_State() {
		return (EAttribute)ceilometerAlarmEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCeilometerAlarm_State_timestamp() {
		return (EAttribute)ceilometerAlarmEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCeilometerAlarm_Description() {
		return (EAttribute)ceilometerAlarmEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCeilometerAlarm_Alarm_actions() {
		return (EAttribute)ceilometerAlarmEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCeilometerAlarm_Ok_actions() {
		return (EAttribute)ceilometerAlarmEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCeilometerAlarm_Insufficient_data_actions() {
		return (EAttribute)ceilometerAlarmEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCeilometerAlarm_Repeat_actions() {
		return (EAttribute)ceilometerAlarmEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCeilometerAlarm_Time_constraints() {
		return (EAttribute)ceilometerAlarmEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCeilometerThresholdAlarm() {
		return ceilometerThresholdAlarmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCeilometerThresholdAlarm_Threshold_rule() {
		return (EReference)ceilometerThresholdAlarmEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCeilometerThresholdAlarmRule() {
		return ceilometerThresholdAlarmRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCeilometerThresholdAlarmRule_Meter_name() {
		return (EAttribute)ceilometerThresholdAlarmRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCeilometerThresholdAlarmRule_Evaluation_periods() {
		return (EAttribute)ceilometerThresholdAlarmRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCeilometerThresholdAlarmRule_Period() {
		return (EAttribute)ceilometerThresholdAlarmRuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCeilometerThresholdAlarmRule_Statistic() {
		return (EAttribute)ceilometerThresholdAlarmRuleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCeilometerThresholdAlarmRule_Threshold() {
		return (EAttribute)ceilometerThresholdAlarmRuleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCeilometerThresholdAlarmRule_Query() {
		return (EAttribute)ceilometerThresholdAlarmRuleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCeilometerThresholdAlarmRule_Comparison_operator() {
		return (EAttribute)ceilometerThresholdAlarmRuleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCeilometerThresholdAlarmRule_Exclude_outliers() {
		return (EAttribute)ceilometerThresholdAlarmRuleEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCeilometerResource() {
		return ceilometerResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCeilometerResource_Id() {
		return (EAttribute)ceilometerResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCeilometerResource_User_id() {
		return (EAttribute)ceilometerResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCeilometerResource_Project_id() {
		return (EAttribute)ceilometerResourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCeilometerResource_First_sample_timestamp() {
		return (EAttribute)ceilometerResourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCeilometerResource_Last_sample_timestamp() {
		return (EAttribute)ceilometerResourceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCeilometerResource_Links() {
		return (EReference)ceilometerResourceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCeilometerResource_Metadata() {
		return (EReference)ceilometerResourceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCeilometerMeter() {
		return ceilometerMeterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCeilometerQuery() {
		return ceilometerQueryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCeilometerQuery_Filter() {
		return (EReference)ceilometerQueryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCeilometerQuery_Orderby() {
		return (EReference)ceilometerQueryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCeilometerQuery_Limit() {
		return (EAttribute)ceilometerQueryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCeilometerFilter() {
		return ceilometerFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCeilometerFilter_Operation() {
		return (EAttribute)ceilometerFilterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCeilometerFilter_Value() {
		return (EAttribute)ceilometerFilterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCeilometerFilter_Field() {
		return (EAttribute)ceilometerFilterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCeilometerFilter_Filters() {
		return (EReference)ceilometerFilterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCeilometerOrderedBy() {
		return ceilometerOrderedByEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCeilometerOrderedBy_Field() {
		return (EAttribute)ceilometerOrderedByEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCeilometerOrderedBy_Direction() {
		return (EAttribute)ceilometerOrderedByEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCeilometerRequest() {
		return ceilometerRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateAlarmRequest() {
		return createAlarmRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSampleRequest() {
		return sampleRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSampleRequest_Query() {
		return (EReference)sampleRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCeilometerSample() {
		return ceilometerSampleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCeilometerSample_Counter_name() {
		return (EAttribute)ceilometerSampleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCeilometerSample_User_id() {
		return (EAttribute)ceilometerSampleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCeilometerSample_Resource_id() {
		return (EAttribute)ceilometerSampleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCeilometerSample_Timestamp() {
		return (EAttribute)ceilometerSampleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCeilometerSample_Recorded_at() {
		return (EAttribute)ceilometerSampleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCeilometerSample_Message_id() {
		return (EAttribute)ceilometerSampleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCeilometerSample_Source() {
		return (EAttribute)ceilometerSampleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCeilometerSample_Counter_unit() {
		return (EAttribute)ceilometerSampleEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCeilometerSample_Counter_volume() {
		return (EAttribute)ceilometerSampleEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCeilometerSample_Project_id() {
		return (EAttribute)ceilometerSampleEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CeilometerFactory getCeilometerFactory() {
		return (CeilometerFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		ceilometerServiceEClass = createEClass(CEILOMETER_SERVICE);
		createEAttribute(ceilometerServiceEClass, CEILOMETER_SERVICE__CEILOMETER_AVAILABLE_CAPABILITES);
		createEAttribute(ceilometerServiceEClass, CEILOMETER_SERVICE__CEILOMETER_UNAVAILABLE_CAPABILITES);
		createEOperation(ceilometerServiceEClass, CEILOMETER_SERVICE___CREATE_ALARM__CREATEALARMREQUEST);
		createEOperation(ceilometerServiceEClass, CEILOMETER_SERVICE___DELETE_ALARM__STRING_STRING);
		createEOperation(ceilometerServiceEClass, CEILOMETER_SERVICE___CREATE_ALARM__SAMPLEREQUEST);

		ceilometerProjectEClass = createEClass(CEILOMETER_PROJECT);
		createEReference(ceilometerProjectEClass, CEILOMETER_PROJECT__ALARMS);
		createEReference(ceilometerProjectEClass, CEILOMETER_PROJECT__RESOURCES);
		createEReference(ceilometerProjectEClass, CEILOMETER_PROJECT__METERS);

		ceilometerAlarmEClass = createEClass(CEILOMETER_ALARM);
		createEAttribute(ceilometerAlarmEClass, CEILOMETER_ALARM__ID);
		createEAttribute(ceilometerAlarmEClass, CEILOMETER_ALARM__USER_ID);
		createEAttribute(ceilometerAlarmEClass, CEILOMETER_ALARM__TIMESTAMP);
		createEAttribute(ceilometerAlarmEClass, CEILOMETER_ALARM__ENABLED);
		createEAttribute(ceilometerAlarmEClass, CEILOMETER_ALARM__STATE);
		createEAttribute(ceilometerAlarmEClass, CEILOMETER_ALARM__STATE_TIMESTAMP);
		createEAttribute(ceilometerAlarmEClass, CEILOMETER_ALARM__DESCRIPTION);
		createEAttribute(ceilometerAlarmEClass, CEILOMETER_ALARM__ALARM_ACTIONS);
		createEAttribute(ceilometerAlarmEClass, CEILOMETER_ALARM__OK_ACTIONS);
		createEAttribute(ceilometerAlarmEClass, CEILOMETER_ALARM__INSUFFICIENT_DATA_ACTIONS);
		createEAttribute(ceilometerAlarmEClass, CEILOMETER_ALARM__REPEAT_ACTIONS);
		createEAttribute(ceilometerAlarmEClass, CEILOMETER_ALARM__TIME_CONSTRAINTS);

		ceilometerThresholdAlarmEClass = createEClass(CEILOMETER_THRESHOLD_ALARM);
		createEReference(ceilometerThresholdAlarmEClass, CEILOMETER_THRESHOLD_ALARM__THRESHOLD_RULE);

		ceilometerThresholdAlarmRuleEClass = createEClass(CEILOMETER_THRESHOLD_ALARM_RULE);
		createEAttribute(ceilometerThresholdAlarmRuleEClass, CEILOMETER_THRESHOLD_ALARM_RULE__METER_NAME);
		createEAttribute(ceilometerThresholdAlarmRuleEClass, CEILOMETER_THRESHOLD_ALARM_RULE__EVALUATION_PERIODS);
		createEAttribute(ceilometerThresholdAlarmRuleEClass, CEILOMETER_THRESHOLD_ALARM_RULE__PERIOD);
		createEAttribute(ceilometerThresholdAlarmRuleEClass, CEILOMETER_THRESHOLD_ALARM_RULE__STATISTIC);
		createEAttribute(ceilometerThresholdAlarmRuleEClass, CEILOMETER_THRESHOLD_ALARM_RULE__THRESHOLD);
		createEAttribute(ceilometerThresholdAlarmRuleEClass, CEILOMETER_THRESHOLD_ALARM_RULE__QUERY);
		createEAttribute(ceilometerThresholdAlarmRuleEClass, CEILOMETER_THRESHOLD_ALARM_RULE__COMPARISON_OPERATOR);
		createEAttribute(ceilometerThresholdAlarmRuleEClass, CEILOMETER_THRESHOLD_ALARM_RULE__EXCLUDE_OUTLIERS);

		ceilometerResourceEClass = createEClass(CEILOMETER_RESOURCE);
		createEAttribute(ceilometerResourceEClass, CEILOMETER_RESOURCE__ID);
		createEAttribute(ceilometerResourceEClass, CEILOMETER_RESOURCE__USER_ID);
		createEAttribute(ceilometerResourceEClass, CEILOMETER_RESOURCE__PROJECT_ID);
		createEAttribute(ceilometerResourceEClass, CEILOMETER_RESOURCE__FIRST_SAMPLE_TIMESTAMP);
		createEAttribute(ceilometerResourceEClass, CEILOMETER_RESOURCE__LAST_SAMPLE_TIMESTAMP);
		createEReference(ceilometerResourceEClass, CEILOMETER_RESOURCE__LINKS);
		createEReference(ceilometerResourceEClass, CEILOMETER_RESOURCE__METADATA);

		ceilometerMeterEClass = createEClass(CEILOMETER_METER);

		ceilometerQueryEClass = createEClass(CEILOMETER_QUERY);
		createEReference(ceilometerQueryEClass, CEILOMETER_QUERY__FILTER);
		createEReference(ceilometerQueryEClass, CEILOMETER_QUERY__ORDERBY);
		createEAttribute(ceilometerQueryEClass, CEILOMETER_QUERY__LIMIT);

		ceilometerFilterEClass = createEClass(CEILOMETER_FILTER);
		createEAttribute(ceilometerFilterEClass, CEILOMETER_FILTER__OPERATION);
		createEAttribute(ceilometerFilterEClass, CEILOMETER_FILTER__VALUE);
		createEAttribute(ceilometerFilterEClass, CEILOMETER_FILTER__FIELD);
		createEReference(ceilometerFilterEClass, CEILOMETER_FILTER__FILTERS);

		ceilometerOrderedByEClass = createEClass(CEILOMETER_ORDERED_BY);
		createEAttribute(ceilometerOrderedByEClass, CEILOMETER_ORDERED_BY__FIELD);
		createEAttribute(ceilometerOrderedByEClass, CEILOMETER_ORDERED_BY__DIRECTION);

		ceilometerRequestEClass = createEClass(CEILOMETER_REQUEST);

		createAlarmRequestEClass = createEClass(CREATE_ALARM_REQUEST);

		sampleRequestEClass = createEClass(SAMPLE_REQUEST);
		createEReference(sampleRequestEClass, SAMPLE_REQUEST__QUERY);

		ceilometerSampleEClass = createEClass(CEILOMETER_SAMPLE);
		createEAttribute(ceilometerSampleEClass, CEILOMETER_SAMPLE__COUNTER_NAME);
		createEAttribute(ceilometerSampleEClass, CEILOMETER_SAMPLE__USER_ID);
		createEAttribute(ceilometerSampleEClass, CEILOMETER_SAMPLE__RESOURCE_ID);
		createEAttribute(ceilometerSampleEClass, CEILOMETER_SAMPLE__TIMESTAMP);
		createEAttribute(ceilometerSampleEClass, CEILOMETER_SAMPLE__RECORDED_AT);
		createEAttribute(ceilometerSampleEClass, CEILOMETER_SAMPLE__MESSAGE_ID);
		createEAttribute(ceilometerSampleEClass, CEILOMETER_SAMPLE__SOURCE);
		createEAttribute(ceilometerSampleEClass, CEILOMETER_SAMPLE__COUNTER_UNIT);
		createEAttribute(ceilometerSampleEClass, CEILOMETER_SAMPLE__COUNTER_VOLUME);
		createEAttribute(ceilometerSampleEClass, CEILOMETER_SAMPLE__PROJECT_ID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		org.openecomp.ncomp.core.CorePackage theCorePackage = (org.openecomp.ncomp.core.CorePackage)EPackage.Registry.INSTANCE.getEPackage(org.openecomp.ncomp.core.CorePackage.eNS_URI);
		ComputePackage theComputePackage = (ComputePackage)EPackage.Registry.INSTANCE.getEPackage(ComputePackage.eNS_URI);
		CorePackage theCorePackage_1 = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		ceilometerAlarmEClass.getESuperTypes().add(theCorePackage.getNamedEntity());
		ceilometerThresholdAlarmEClass.getESuperTypes().add(this.getCeilometerAlarm());
		ceilometerRequestEClass.getESuperTypes().add(theCorePackage_1.getOpenStackRequest());
		createAlarmRequestEClass.getESuperTypes().add(this.getCeilometerRequest());
		sampleRequestEClass.getESuperTypes().add(this.getCeilometerRequest());

		// Initialize classes, features, and operations; add parameters
		initEClass(ceilometerServiceEClass, CeilometerService.class, "CeilometerService", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCeilometerService_CeilometerAvailableCapabilites(), theEcorePackage.getEString(), "ceilometerAvailableCapabilites", null, 0, -1, CeilometerService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCeilometerService_CeilometerUnavailableCapabilites(), theEcorePackage.getEString(), "ceilometerUnavailableCapabilites", null, 0, -1, CeilometerService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getCeilometerService__CreateAlarm__CreateAlarmRequest(), this.getCeilometerAlarm(), "createAlarm", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCreateAlarmRequest(), "request", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCeilometerService__DeleteAlarm__String_String(), null, "deleteAlarm", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "projectName", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCeilometerService__CreateAlarm__SampleRequest(), this.getCeilometerSample(), "createAlarm", 0, -1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSampleRequest(), "request", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(ceilometerProjectEClass, CeilometerProject.class, "CeilometerProject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCeilometerProject_Alarms(), this.getCeilometerAlarm(), null, "alarms", null, 0, -1, CeilometerProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCeilometerProject_Resources(), this.getCeilometerResource(), null, "resources", null, 0, -1, CeilometerProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCeilometerProject_Meters(), this.getCeilometerMeter(), null, "meters", null, 0, -1, CeilometerProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ceilometerAlarmEClass, CeilometerAlarm.class, "CeilometerAlarm", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCeilometerAlarm_Id(), theEcorePackage.getEString(), "id", null, 0, 1, CeilometerAlarm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCeilometerAlarm_User_id(), theEcorePackage.getEString(), "user_id", null, 0, 1, CeilometerAlarm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCeilometerAlarm_Timestamp(), theEcorePackage.getEDate(), "timestamp", null, 0, 1, CeilometerAlarm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCeilometerAlarm_Enabled(), theEcorePackage.getEBooleanObject(), "enabled", null, 0, 1, CeilometerAlarm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCeilometerAlarm_State(), theEcorePackage.getEString(), "state", null, 0, 1, CeilometerAlarm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCeilometerAlarm_State_timestamp(), theEcorePackage.getEDate(), "state_timestamp", null, 0, 1, CeilometerAlarm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCeilometerAlarm_Description(), theEcorePackage.getEString(), "description", null, 0, 1, CeilometerAlarm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCeilometerAlarm_Alarm_actions(), theEcorePackage.getEString(), "alarm_actions", null, 0, -1, CeilometerAlarm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCeilometerAlarm_Ok_actions(), theEcorePackage.getEString(), "ok_actions", null, 0, -1, CeilometerAlarm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCeilometerAlarm_Insufficient_data_actions(), theEcorePackage.getEString(), "insufficient_data_actions", null, 0, -1, CeilometerAlarm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCeilometerAlarm_Repeat_actions(), theEcorePackage.getEBooleanObject(), "repeat_actions", null, 0, 1, CeilometerAlarm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCeilometerAlarm_Time_constraints(), theEcorePackage.getEString(), "time_constraints", null, 0, -1, CeilometerAlarm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ceilometerThresholdAlarmEClass, CeilometerThresholdAlarm.class, "CeilometerThresholdAlarm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCeilometerThresholdAlarm_Threshold_rule(), this.getCeilometerThresholdAlarmRule(), null, "threshold_rule", null, 0, 1, CeilometerThresholdAlarm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ceilometerThresholdAlarmRuleEClass, CeilometerThresholdAlarmRule.class, "CeilometerThresholdAlarmRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCeilometerThresholdAlarmRule_Meter_name(), theEcorePackage.getEString(), "meter_name", null, 0, 1, CeilometerThresholdAlarmRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCeilometerThresholdAlarmRule_Evaluation_periods(), theEcorePackage.getELongObject(), "evaluation_periods", null, 0, 1, CeilometerThresholdAlarmRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCeilometerThresholdAlarmRule_Period(), theEcorePackage.getELongObject(), "period", null, 0, 1, CeilometerThresholdAlarmRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCeilometerThresholdAlarmRule_Statistic(), theEcorePackage.getEString(), "statistic", null, 0, 1, CeilometerThresholdAlarmRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCeilometerThresholdAlarmRule_Threshold(), theEcorePackage.getEDouble(), "threshold", null, 0, 1, CeilometerThresholdAlarmRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCeilometerThresholdAlarmRule_Query(), theEcorePackage.getEString(), "query", null, 0, -1, CeilometerThresholdAlarmRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCeilometerThresholdAlarmRule_Comparison_operator(), theEcorePackage.getEString(), "comparison_operator", null, 0, 1, CeilometerThresholdAlarmRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCeilometerThresholdAlarmRule_Exclude_outliers(), theEcorePackage.getEBooleanObject(), "exclude_outliers", null, 0, 1, CeilometerThresholdAlarmRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ceilometerResourceEClass, CeilometerResource.class, "CeilometerResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCeilometerResource_Id(), theEcorePackage.getEString(), "id", null, 0, 1, CeilometerResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCeilometerResource_User_id(), theEcorePackage.getEString(), "user_id", null, 0, 1, CeilometerResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCeilometerResource_Project_id(), theEcorePackage.getEString(), "project_id", null, 0, 1, CeilometerResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCeilometerResource_First_sample_timestamp(), theEcorePackage.getEDate(), "first_sample_timestamp", null, 0, 1, CeilometerResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCeilometerResource_Last_sample_timestamp(), theEcorePackage.getEDate(), "last_sample_timestamp", null, 0, 1, CeilometerResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCeilometerResource_Links(), theComputePackage.getLink(), null, "links", null, 0, -1, CeilometerResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCeilometerResource_Metadata(), theComputePackage.getMetadata(), null, "metadata", null, 0, 1, CeilometerResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ceilometerMeterEClass, CeilometerMeter.class, "CeilometerMeter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ceilometerQueryEClass, CeilometerQuery.class, "CeilometerQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCeilometerQuery_Filter(), this.getCeilometerFilter(), null, "filter", null, 0, -1, CeilometerQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCeilometerQuery_Orderby(), this.getCeilometerOrderedBy(), null, "orderby", null, 0, -1, CeilometerQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCeilometerQuery_Limit(), theEcorePackage.getELongObject(), "limit", null, 0, 1, CeilometerQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ceilometerFilterEClass, CeilometerFilter.class, "CeilometerFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCeilometerFilter_Operation(), theEcorePackage.getEString(), "operation", null, 0, 1, CeilometerFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCeilometerFilter_Value(), theEcorePackage.getEString(), "value", null, 0, 1, CeilometerFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCeilometerFilter_Field(), theEcorePackage.getEString(), "field", null, 0, 1, CeilometerFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCeilometerFilter_Filters(), this.getCeilometerFilter(), null, "filters", null, 0, -1, CeilometerFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ceilometerOrderedByEClass, CeilometerOrderedBy.class, "CeilometerOrderedBy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCeilometerOrderedBy_Field(), theEcorePackage.getEString(), "field", null, 0, 1, CeilometerOrderedBy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCeilometerOrderedBy_Direction(), theEcorePackage.getEString(), "direction", null, 0, 1, CeilometerOrderedBy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ceilometerRequestEClass, CeilometerRequest.class, "CeilometerRequest", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(createAlarmRequestEClass, CreateAlarmRequest.class, "CreateAlarmRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sampleRequestEClass, SampleRequest.class, "SampleRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSampleRequest_Query(), this.getCeilometerQuery(), null, "query", null, 0, 1, SampleRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ceilometerSampleEClass, CeilometerSample.class, "CeilometerSample", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCeilometerSample_Counter_name(), theEcorePackage.getEString(), "counter_name", null, 0, 1, CeilometerSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCeilometerSample_User_id(), theEcorePackage.getEString(), "user_id", null, 0, 1, CeilometerSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCeilometerSample_Resource_id(), theEcorePackage.getEString(), "resource_id", null, 0, 1, CeilometerSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCeilometerSample_Timestamp(), theEcorePackage.getEDate(), "timestamp", null, 0, 1, CeilometerSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCeilometerSample_Recorded_at(), theEcorePackage.getEDate(), "recorded_at", null, 0, 1, CeilometerSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCeilometerSample_Message_id(), theEcorePackage.getEString(), "message_id", null, 0, 1, CeilometerSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCeilometerSample_Source(), theEcorePackage.getEString(), "source", null, 0, 1, CeilometerSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCeilometerSample_Counter_unit(), theEcorePackage.getEString(), "counter_unit", null, 0, 1, CeilometerSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCeilometerSample_Counter_volume(), theEcorePackage.getEDouble(), "counter_volume", null, 0, 1, CeilometerSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCeilometerSample_Project_id(), theEcorePackage.getEString(), "project_id", null, 0, 1, CeilometerSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2011/Xcore
		createXcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2011/Xcore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createXcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2011/Xcore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "openstack", "http://openecomp.org/sirius/openstack"
		   });
	}

} //CeilometerPackageImpl
