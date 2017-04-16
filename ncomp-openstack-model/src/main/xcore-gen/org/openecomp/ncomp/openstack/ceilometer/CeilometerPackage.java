
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

import org.openecomp.ncomp.openstack.core.CorePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * -
 * ============LICENSE_START==========================================
 * OPENECOMP - DCAE
 * ===================================================================
 * Copyright (c) 2017 AT&T Intellectual Property. All rights reserved.
 * ===================================================================
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  *        http://www.apache.org/licenses/LICENSE-2.0
 *  * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ============LICENSE_END============================================
 * <!-- end-model-doc -->
 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel modelDirectory='/ncomp-openstack-model/src/main/xcore-gen' basePackage='org.openecomp.ncomp.openstack'"
 *        annotation="http://www.eclipse.org/emf/2011/Xcore openstack='http://openecomp.org/sirius/openstack'"
 * @generated
 */
public interface CeilometerPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ceilometer";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.openecomp.ncomp.openstack.ceilometer";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ceilometer";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CeilometerPackage eINSTANCE = org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerServiceImpl
	 * @see org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerPackageImpl#getCeilometerService()
	 * @generated
	 */
	int CEILOMETER_SERVICE = 0;

	/**
	 * The feature id for the '<em><b>Ceilometer Available Capabilites</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILOMETER_SERVICE__CEILOMETER_AVAILABLE_CAPABILITES = 0;

	/**
	 * The feature id for the '<em><b>Ceilometer Unavailable Capabilites</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILOMETER_SERVICE__CEILOMETER_UNAVAILABLE_CAPABILITES = 1;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILOMETER_SERVICE_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Create Alarm</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILOMETER_SERVICE___CREATE_ALARM__CREATEALARMREQUEST = 0;

	/**
	 * The operation id for the '<em>Delete Alarm</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILOMETER_SERVICE___DELETE_ALARM__STRING_STRING = 1;

	/**
	 * The operation id for the '<em>Create Alarm</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILOMETER_SERVICE___CREATE_ALARM__SAMPLEREQUEST = 2;

	/**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILOMETER_SERVICE_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerProjectImpl
	 * @see org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerPackageImpl#getCeilometerProject()
	 * @generated
	 */
	int CEILOMETER_PROJECT = 1;

	/**
	 * The feature id for the '<em><b>Alarms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILOMETER_PROJECT__ALARMS = 0;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILOMETER_PROJECT__RESOURCES = 1;

	/**
	 * The feature id for the '<em><b>Meters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILOMETER_PROJECT__METERS = 2;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILOMETER_PROJECT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILOMETER_PROJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerAlarmImpl <em>Alarm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerAlarmImpl
	 * @see org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerPackageImpl#getCeilometerAlarm()
	 * @generated
	 */
	int CEILOMETER_ALARM = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILOMETER_ALARM__NAME = org.openecomp.ncomp.core.CorePackage.NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILOMETER_ALARM__LAST_POLLED = org.openecomp.ncomp.core.CorePackage.NAMED_ENTITY__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILOMETER_ALARM__LAST_CHANGED = org.openecomp.ncomp.core.CorePackage.NAMED_ENTITY__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILOMETER_ALARM__CREATED = org.openecomp.ncomp.core.CorePackage.NAMED_ENTITY__CREATED;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILOMETER_ALARM__ID = org.openecomp.ncomp.core.CorePackage.NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>User id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILOMETER_ALARM__USER_ID = org.openecomp.ncomp.core.CorePackage.NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILOMETER_ALARM__TIMESTAMP = org.openecomp.ncomp.core.CorePackage.NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILOMETER_ALARM__ENABLED = org.openecomp.ncomp.core.CorePackage.NAMED_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILOMETER_ALARM__STATE = org.openecomp.ncomp.core.CorePackage.NAMED_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>State timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILOMETER_ALARM__STATE_TIMESTAMP = org.openecomp.ncomp.core.CorePackage.NAMED_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILOMETER_ALARM__DESCRIPTION = org.openecomp.ncomp.core.CorePackage.NAMED_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Alarm actions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILOMETER_ALARM__ALARM_ACTIONS = org.openecomp.ncomp.core.CorePackage.NAMED_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Ok actions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILOMETER_ALARM__OK_ACTIONS = org.openecomp.ncomp.core.CorePackage.NAMED_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Insufficient data actions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILOMETER_ALARM__INSUFFICIENT_DATA_ACTIONS = org.openecomp.ncomp.core.CorePackage.NAMED_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Repeat actions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILOMETER_ALARM__REPEAT_ACTIONS = org.openecomp.ncomp.core.CorePackage.NAMED_ENTITY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Time constraints</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILOMETER_ALARM__TIME_CONSTRAINTS = org.openecomp.ncomp.core.CorePackage.NAMED_ENTITY_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Alarm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILOMETER_ALARM_FEATURE_COUNT = org.openecomp.ncomp.core.CorePackage.NAMED_ENTITY_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>Alarm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILOMETER_ALARM_OPERATION_COUNT = org.openecomp.ncomp.core.CorePackage.NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerThresholdAlarmImpl <em>Threshold Alarm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerThresholdAlarmImpl
	 * @see org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerPackageImpl#getCeilometerThresholdAlarm()
	 * @generated
	 */
	int CEILOMETER_THRESHOLD_ALARM = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILOMETER_THRESHOLD_ALARM__NAME = CEILOMETER_ALARM__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILOMETER_THRESHOLD_ALARM__LAST_POLLED = CEILOMETER_ALARM__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILOMETER_THRESHOLD_ALARM__LAST_CHANGED = CEILOMETER_ALARM__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILOMETER_THRESHOLD_ALARM__CREATED = CEILOMETER_ALARM__CREATED;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILOMETER_THRESHOLD_ALARM__ID = CEILOMETER_ALARM__ID;

	/**
	 * The feature id for the '<em><b>User id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILOMETER_THRESHOLD_ALARM__USER_ID = CEILOMETER_ALARM__USER_ID;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILOMETER_THRESHOLD_ALARM__TIMESTAMP = CEILOMETER_ALARM__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILOMETER_THRESHOLD_ALARM__ENABLED = CEILOMETER_ALARM__ENABLED;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILOMETER_THRESHOLD_ALARM__STATE = CEILOMETER_ALARM__STATE;

	/**
	 * The feature id for the '<em><b>State timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILOMETER_THRESHOLD_ALARM__STATE_TIMESTAMP = CEILOMETER_ALARM__STATE_TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILOMETER_THRESHOLD_ALARM__DESCRIPTION = CEILOMETER_ALARM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alarm actions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILOMETER_THRESHOLD_ALARM__ALARM_ACTIONS = CEILOMETER_ALARM__ALARM_ACTIONS;

	/**
	 * The feature id for the '<em><b>Ok actions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILOMETER_THRESHOLD_ALARM__OK_ACTIONS = CEILOMETER_ALARM__OK_ACTIONS;

	/**
	 * The feature id for the '<em><b>Insufficient data actions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILOMETER_THRESHOLD_ALARM__INSUFFICIENT_DATA_ACTIONS = CEILOMETER_ALARM__INSUFFICIENT_DATA_ACTIONS;

	/**
	 * The feature id for the '<em><b>Repeat actions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILOMETER_THRESHOLD_ALARM__REPEAT_ACTIONS = CEILOMETER_ALARM__REPEAT_ACTIONS;

	/**
	 * The feature id for the '<em><b>Time constraints</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILOMETER_THRESHOLD_ALARM__TIME_CONSTRAINTS = CEILOMETER_ALARM__TIME_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Threshold rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILOMETER_THRESHOLD_ALARM__THRESHOLD_RULE = CEILOMETER_ALARM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Threshold Alarm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILOMETER_THRESHOLD_ALARM_FEATURE_COUNT = CEILOMETER_ALARM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Threshold Alarm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILOMETER_THRESHOLD_ALARM_OPERATION_COUNT = CEILOMETER_ALARM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerThresholdAlarmRuleImpl <em>Threshold Alarm Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerThresholdAlarmRuleImpl
	 * @see org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerPackageImpl#getCeilometerThresholdAlarmRule()
	 * @generated
	 */
	int CEILOMETER_THRESHOLD_ALARM_RULE = 4;

	/**
	 * The feature id for the '<em><b>Meter name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILOMETER_THRESHOLD_ALARM_RULE__METER_NAME = 0;

	/**
	 * The feature id for the '<em><b>Evaluation periods</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILOMETER_THRESHOLD_ALARM_RULE__EVALUATION_PERIODS = 1;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILOMETER_THRESHOLD_ALARM_RULE__PERIOD = 2;

	/**
	 * The feature id for the '<em><b>Statistic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILOMETER_THRESHOLD_ALARM_RULE__STATISTIC = 3;

	/**
	 * The feature id for the '<em><b>Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILOMETER_THRESHOLD_ALARM_RULE__THRESHOLD = 4;

	/**
	 * The feature id for the '<em><b>Query</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILOMETER_THRESHOLD_ALARM_RULE__QUERY = 5;

	/**
	 * The feature id for the '<em><b>Comparison operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILOMETER_THRESHOLD_ALARM_RULE__COMPARISON_OPERATOR = 6;

	/**
	 * The feature id for the '<em><b>Exclude outliers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILOMETER_THRESHOLD_ALARM_RULE__EXCLUDE_OUTLIERS = 7;

	/**
	 * The number of structural features of the '<em>Threshold Alarm Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILOMETER_THRESHOLD_ALARM_RULE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Threshold Alarm Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILOMETER_THRESHOLD_ALARM_RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerResourceImpl
	 * @see org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerPackageImpl#getCeilometerResource()
	 * @generated
	 */
	int CEILOMETER_RESOURCE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILOMETER_RESOURCE__ID = 0;

	/**
	 * The feature id for the '<em><b>User id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILOMETER_RESOURCE__USER_ID = 1;

	/**
	 * The feature id for the '<em><b>Project id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILOMETER_RESOURCE__PROJECT_ID = 2;

	/**
	 * The feature id for the '<em><b>First sample timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILOMETER_RESOURCE__FIRST_SAMPLE_TIMESTAMP = 3;

	/**
	 * The feature id for the '<em><b>Last sample timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILOMETER_RESOURCE__LAST_SAMPLE_TIMESTAMP = 4;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILOMETER_RESOURCE__LINKS = 5;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILOMETER_RESOURCE__METADATA = 6;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILOMETER_RESOURCE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILOMETER_RESOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerMeterImpl <em>Meter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerMeterImpl
	 * @see org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerPackageImpl#getCeilometerMeter()
	 * @generated
	 */
	int CEILOMETER_METER = 6;

	/**
	 * The number of structural features of the '<em>Meter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILOMETER_METER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Meter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILOMETER_METER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerQueryImpl <em>Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerQueryImpl
	 * @see org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerPackageImpl#getCeilometerQuery()
	 * @generated
	 */
	int CEILOMETER_QUERY = 7;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILOMETER_QUERY__FILTER = 0;

	/**
	 * The feature id for the '<em><b>Orderby</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILOMETER_QUERY__ORDERBY = 1;

	/**
	 * The feature id for the '<em><b>Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILOMETER_QUERY__LIMIT = 2;

	/**
	 * The number of structural features of the '<em>Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILOMETER_QUERY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILOMETER_QUERY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerFilterImpl <em>Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerFilterImpl
	 * @see org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerPackageImpl#getCeilometerFilter()
	 * @generated
	 */
	int CEILOMETER_FILTER = 8;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILOMETER_FILTER__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILOMETER_FILTER__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILOMETER_FILTER__FIELD = 2;

	/**
	 * The feature id for the '<em><b>Filters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILOMETER_FILTER__FILTERS = 3;

	/**
	 * The number of structural features of the '<em>Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILOMETER_FILTER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILOMETER_FILTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerOrderedByImpl <em>Ordered By</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerOrderedByImpl
	 * @see org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerPackageImpl#getCeilometerOrderedBy()
	 * @generated
	 */
	int CEILOMETER_ORDERED_BY = 9;

	/**
	 * The feature id for the '<em><b>Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILOMETER_ORDERED_BY__FIELD = 0;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILOMETER_ORDERED_BY__DIRECTION = 1;

	/**
	 * The number of structural features of the '<em>Ordered By</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILOMETER_ORDERED_BY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Ordered By</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILOMETER_ORDERED_BY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerRequestImpl <em>Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerRequestImpl
	 * @see org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerPackageImpl#getCeilometerRequest()
	 * @generated
	 */
	int CEILOMETER_REQUEST = 10;

	/**
	 * The feature id for the '<em><b>Project Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILOMETER_REQUEST__PROJECT_NAME = CorePackage.OPEN_STACK_REQUEST__PROJECT_NAME;

	/**
	 * The number of structural features of the '<em>Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILOMETER_REQUEST_FEATURE_COUNT = CorePackage.OPEN_STACK_REQUEST_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILOMETER_REQUEST_OPERATION_COUNT = CorePackage.OPEN_STACK_REQUEST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.openstack.ceilometer.impl.CreateAlarmRequestImpl <em>Create Alarm Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.openstack.ceilometer.impl.CreateAlarmRequestImpl
	 * @see org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerPackageImpl#getCreateAlarmRequest()
	 * @generated
	 */
	int CREATE_ALARM_REQUEST = 11;

	/**
	 * The feature id for the '<em><b>Project Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ALARM_REQUEST__PROJECT_NAME = CEILOMETER_REQUEST__PROJECT_NAME;

	/**
	 * The number of structural features of the '<em>Create Alarm Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ALARM_REQUEST_FEATURE_COUNT = CEILOMETER_REQUEST_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Create Alarm Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ALARM_REQUEST_OPERATION_COUNT = CEILOMETER_REQUEST_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.openstack.ceilometer.impl.SampleRequestImpl <em>Sample Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.openstack.ceilometer.impl.SampleRequestImpl
	 * @see org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerPackageImpl#getSampleRequest()
	 * @generated
	 */
	int SAMPLE_REQUEST = 12;

	/**
	 * The feature id for the '<em><b>Project Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE_REQUEST__PROJECT_NAME = CEILOMETER_REQUEST__PROJECT_NAME;

	/**
	 * The feature id for the '<em><b>Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE_REQUEST__QUERY = CEILOMETER_REQUEST_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sample Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE_REQUEST_FEATURE_COUNT = CEILOMETER_REQUEST_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sample Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE_REQUEST_OPERATION_COUNT = CEILOMETER_REQUEST_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerSampleImpl <em>Sample</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerSampleImpl
	 * @see org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerPackageImpl#getCeilometerSample()
	 * @generated
	 */
	int CEILOMETER_SAMPLE = 13;

	/**
	 * The feature id for the '<em><b>Counter name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILOMETER_SAMPLE__COUNTER_NAME = 0;

	/**
	 * The feature id for the '<em><b>User id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILOMETER_SAMPLE__USER_ID = 1;

	/**
	 * The feature id for the '<em><b>Resource id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILOMETER_SAMPLE__RESOURCE_ID = 2;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILOMETER_SAMPLE__TIMESTAMP = 3;

	/**
	 * The feature id for the '<em><b>Recorded at</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILOMETER_SAMPLE__RECORDED_AT = 4;

	/**
	 * The feature id for the '<em><b>Message id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILOMETER_SAMPLE__MESSAGE_ID = 5;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILOMETER_SAMPLE__SOURCE = 6;

	/**
	 * The feature id for the '<em><b>Counter unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILOMETER_SAMPLE__COUNTER_UNIT = 7;

	/**
	 * The feature id for the '<em><b>Counter volume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILOMETER_SAMPLE__COUNTER_VOLUME = 8;

	/**
	 * The feature id for the '<em><b>Project id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILOMETER_SAMPLE__PROJECT_ID = 9;

	/**
	 * The number of structural features of the '<em>Sample</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILOMETER_SAMPLE_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Sample</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILOMETER_SAMPLE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerService
	 * @generated
	 */
	EClass getCeilometerService();

	/**
	 * Returns the meta object for the attribute list '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerService#getCeilometerAvailableCapabilites <em>Ceilometer Available Capabilites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Ceilometer Available Capabilites</em>'.
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerService#getCeilometerAvailableCapabilites()
	 * @see #getCeilometerService()
	 * @generated
	 */
	EAttribute getCeilometerService_CeilometerAvailableCapabilites();

	/**
	 * Returns the meta object for the attribute list '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerService#getCeilometerUnavailableCapabilites <em>Ceilometer Unavailable Capabilites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Ceilometer Unavailable Capabilites</em>'.
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerService#getCeilometerUnavailableCapabilites()
	 * @see #getCeilometerService()
	 * @generated
	 */
	EAttribute getCeilometerService_CeilometerUnavailableCapabilites();

	/**
	 * Returns the meta object for the '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerService#createAlarm(org.openecomp.ncomp.openstack.ceilometer.CreateAlarmRequest) <em>Create Alarm</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Alarm</em>' operation.
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerService#createAlarm(org.openecomp.ncomp.openstack.ceilometer.CreateAlarmRequest)
	 * @generated
	 */
	EOperation getCeilometerService__CreateAlarm__CreateAlarmRequest();

	/**
	 * Returns the meta object for the '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerService#deleteAlarm(java.lang.String, java.lang.String) <em>Delete Alarm</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Delete Alarm</em>' operation.
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerService#deleteAlarm(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getCeilometerService__DeleteAlarm__String_String();

	/**
	 * Returns the meta object for the '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerService#createAlarm(org.openecomp.ncomp.openstack.ceilometer.SampleRequest) <em>Create Alarm</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Alarm</em>' operation.
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerService#createAlarm(org.openecomp.ncomp.openstack.ceilometer.SampleRequest)
	 * @generated
	 */
	EOperation getCeilometerService__CreateAlarm__SampleRequest();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerProject
	 * @generated
	 */
	EClass getCeilometerProject();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerProject#getAlarms <em>Alarms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alarms</em>'.
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerProject#getAlarms()
	 * @see #getCeilometerProject()
	 * @generated
	 */
	EReference getCeilometerProject_Alarms();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerProject#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerProject#getResources()
	 * @see #getCeilometerProject()
	 * @generated
	 */
	EReference getCeilometerProject_Resources();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerProject#getMeters <em>Meters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Meters</em>'.
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerProject#getMeters()
	 * @see #getCeilometerProject()
	 * @generated
	 */
	EReference getCeilometerProject_Meters();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerAlarm <em>Alarm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alarm</em>'.
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerAlarm
	 * @generated
	 */
	EClass getCeilometerAlarm();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerAlarm#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerAlarm#getId()
	 * @see #getCeilometerAlarm()
	 * @generated
	 */
	EAttribute getCeilometerAlarm_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerAlarm#getUser_id <em>User id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User id</em>'.
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerAlarm#getUser_id()
	 * @see #getCeilometerAlarm()
	 * @generated
	 */
	EAttribute getCeilometerAlarm_User_id();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerAlarm#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerAlarm#getTimestamp()
	 * @see #getCeilometerAlarm()
	 * @generated
	 */
	EAttribute getCeilometerAlarm_Timestamp();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerAlarm#getEnabled <em>Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enabled</em>'.
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerAlarm#getEnabled()
	 * @see #getCeilometerAlarm()
	 * @generated
	 */
	EAttribute getCeilometerAlarm_Enabled();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerAlarm#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerAlarm#getState()
	 * @see #getCeilometerAlarm()
	 * @generated
	 */
	EAttribute getCeilometerAlarm_State();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerAlarm#getState_timestamp <em>State timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State timestamp</em>'.
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerAlarm#getState_timestamp()
	 * @see #getCeilometerAlarm()
	 * @generated
	 */
	EAttribute getCeilometerAlarm_State_timestamp();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerAlarm#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerAlarm#getDescription()
	 * @see #getCeilometerAlarm()
	 * @generated
	 */
	EAttribute getCeilometerAlarm_Description();

	/**
	 * Returns the meta object for the attribute list '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerAlarm#getAlarm_actions <em>Alarm actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Alarm actions</em>'.
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerAlarm#getAlarm_actions()
	 * @see #getCeilometerAlarm()
	 * @generated
	 */
	EAttribute getCeilometerAlarm_Alarm_actions();

	/**
	 * Returns the meta object for the attribute list '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerAlarm#getOk_actions <em>Ok actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Ok actions</em>'.
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerAlarm#getOk_actions()
	 * @see #getCeilometerAlarm()
	 * @generated
	 */
	EAttribute getCeilometerAlarm_Ok_actions();

	/**
	 * Returns the meta object for the attribute list '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerAlarm#getInsufficient_data_actions <em>Insufficient data actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Insufficient data actions</em>'.
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerAlarm#getInsufficient_data_actions()
	 * @see #getCeilometerAlarm()
	 * @generated
	 */
	EAttribute getCeilometerAlarm_Insufficient_data_actions();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerAlarm#getRepeat_actions <em>Repeat actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repeat actions</em>'.
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerAlarm#getRepeat_actions()
	 * @see #getCeilometerAlarm()
	 * @generated
	 */
	EAttribute getCeilometerAlarm_Repeat_actions();

	/**
	 * Returns the meta object for the attribute list '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerAlarm#getTime_constraints <em>Time constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Time constraints</em>'.
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerAlarm#getTime_constraints()
	 * @see #getCeilometerAlarm()
	 * @generated
	 */
	EAttribute getCeilometerAlarm_Time_constraints();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerThresholdAlarm <em>Threshold Alarm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Threshold Alarm</em>'.
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerThresholdAlarm
	 * @generated
	 */
	EClass getCeilometerThresholdAlarm();

	/**
	 * Returns the meta object for the containment reference '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerThresholdAlarm#getThreshold_rule <em>Threshold rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Threshold rule</em>'.
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerThresholdAlarm#getThreshold_rule()
	 * @see #getCeilometerThresholdAlarm()
	 * @generated
	 */
	EReference getCeilometerThresholdAlarm_Threshold_rule();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerThresholdAlarmRule <em>Threshold Alarm Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Threshold Alarm Rule</em>'.
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerThresholdAlarmRule
	 * @generated
	 */
	EClass getCeilometerThresholdAlarmRule();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerThresholdAlarmRule#getMeter_name <em>Meter name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Meter name</em>'.
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerThresholdAlarmRule#getMeter_name()
	 * @see #getCeilometerThresholdAlarmRule()
	 * @generated
	 */
	EAttribute getCeilometerThresholdAlarmRule_Meter_name();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerThresholdAlarmRule#getEvaluation_periods <em>Evaluation periods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Evaluation periods</em>'.
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerThresholdAlarmRule#getEvaluation_periods()
	 * @see #getCeilometerThresholdAlarmRule()
	 * @generated
	 */
	EAttribute getCeilometerThresholdAlarmRule_Evaluation_periods();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerThresholdAlarmRule#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period</em>'.
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerThresholdAlarmRule#getPeriod()
	 * @see #getCeilometerThresholdAlarmRule()
	 * @generated
	 */
	EAttribute getCeilometerThresholdAlarmRule_Period();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerThresholdAlarmRule#getStatistic <em>Statistic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Statistic</em>'.
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerThresholdAlarmRule#getStatistic()
	 * @see #getCeilometerThresholdAlarmRule()
	 * @generated
	 */
	EAttribute getCeilometerThresholdAlarmRule_Statistic();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerThresholdAlarmRule#getThreshold <em>Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Threshold</em>'.
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerThresholdAlarmRule#getThreshold()
	 * @see #getCeilometerThresholdAlarmRule()
	 * @generated
	 */
	EAttribute getCeilometerThresholdAlarmRule_Threshold();

	/**
	 * Returns the meta object for the attribute list '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerThresholdAlarmRule#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Query</em>'.
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerThresholdAlarmRule#getQuery()
	 * @see #getCeilometerThresholdAlarmRule()
	 * @generated
	 */
	EAttribute getCeilometerThresholdAlarmRule_Query();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerThresholdAlarmRule#getComparison_operator <em>Comparison operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comparison operator</em>'.
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerThresholdAlarmRule#getComparison_operator()
	 * @see #getCeilometerThresholdAlarmRule()
	 * @generated
	 */
	EAttribute getCeilometerThresholdAlarmRule_Comparison_operator();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerThresholdAlarmRule#getExclude_outliers <em>Exclude outliers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exclude outliers</em>'.
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerThresholdAlarmRule#getExclude_outliers()
	 * @see #getCeilometerThresholdAlarmRule()
	 * @generated
	 */
	EAttribute getCeilometerThresholdAlarmRule_Exclude_outliers();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerResource
	 * @generated
	 */
	EClass getCeilometerResource();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerResource#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerResource#getId()
	 * @see #getCeilometerResource()
	 * @generated
	 */
	EAttribute getCeilometerResource_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerResource#getUser_id <em>User id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User id</em>'.
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerResource#getUser_id()
	 * @see #getCeilometerResource()
	 * @generated
	 */
	EAttribute getCeilometerResource_User_id();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerResource#getProject_id <em>Project id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project id</em>'.
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerResource#getProject_id()
	 * @see #getCeilometerResource()
	 * @generated
	 */
	EAttribute getCeilometerResource_Project_id();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerResource#getFirst_sample_timestamp <em>First sample timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First sample timestamp</em>'.
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerResource#getFirst_sample_timestamp()
	 * @see #getCeilometerResource()
	 * @generated
	 */
	EAttribute getCeilometerResource_First_sample_timestamp();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerResource#getLast_sample_timestamp <em>Last sample timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last sample timestamp</em>'.
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerResource#getLast_sample_timestamp()
	 * @see #getCeilometerResource()
	 * @generated
	 */
	EAttribute getCeilometerResource_Last_sample_timestamp();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerResource#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerResource#getLinks()
	 * @see #getCeilometerResource()
	 * @generated
	 */
	EReference getCeilometerResource_Links();

	/**
	 * Returns the meta object for the containment reference '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerResource#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Metadata</em>'.
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerResource#getMetadata()
	 * @see #getCeilometerResource()
	 * @generated
	 */
	EReference getCeilometerResource_Metadata();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerMeter <em>Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meter</em>'.
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerMeter
	 * @generated
	 */
	EClass getCeilometerMeter();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query</em>'.
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerQuery
	 * @generated
	 */
	EClass getCeilometerQuery();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerQuery#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Filter</em>'.
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerQuery#getFilter()
	 * @see #getCeilometerQuery()
	 * @generated
	 */
	EReference getCeilometerQuery_Filter();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerQuery#getOrderby <em>Orderby</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Orderby</em>'.
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerQuery#getOrderby()
	 * @see #getCeilometerQuery()
	 * @generated
	 */
	EReference getCeilometerQuery_Orderby();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerQuery#getLimit <em>Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Limit</em>'.
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerQuery#getLimit()
	 * @see #getCeilometerQuery()
	 * @generated
	 */
	EAttribute getCeilometerQuery_Limit();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter</em>'.
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerFilter
	 * @generated
	 */
	EClass getCeilometerFilter();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerFilter#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerFilter#getOperation()
	 * @see #getCeilometerFilter()
	 * @generated
	 */
	EAttribute getCeilometerFilter_Operation();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerFilter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerFilter#getValue()
	 * @see #getCeilometerFilter()
	 * @generated
	 */
	EAttribute getCeilometerFilter_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerFilter#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field</em>'.
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerFilter#getField()
	 * @see #getCeilometerFilter()
	 * @generated
	 */
	EAttribute getCeilometerFilter_Field();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerFilter#getFilters <em>Filters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Filters</em>'.
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerFilter#getFilters()
	 * @see #getCeilometerFilter()
	 * @generated
	 */
	EReference getCeilometerFilter_Filters();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerOrderedBy <em>Ordered By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ordered By</em>'.
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerOrderedBy
	 * @generated
	 */
	EClass getCeilometerOrderedBy();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerOrderedBy#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field</em>'.
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerOrderedBy#getField()
	 * @see #getCeilometerOrderedBy()
	 * @generated
	 */
	EAttribute getCeilometerOrderedBy_Field();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerOrderedBy#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerOrderedBy#getDirection()
	 * @see #getCeilometerOrderedBy()
	 * @generated
	 */
	EAttribute getCeilometerOrderedBy_Direction();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerRequest <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request</em>'.
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerRequest
	 * @generated
	 */
	EClass getCeilometerRequest();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.openstack.ceilometer.CreateAlarmRequest <em>Create Alarm Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Alarm Request</em>'.
	 * @see org.openecomp.ncomp.openstack.ceilometer.CreateAlarmRequest
	 * @generated
	 */
	EClass getCreateAlarmRequest();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.openstack.ceilometer.SampleRequest <em>Sample Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sample Request</em>'.
	 * @see org.openecomp.ncomp.openstack.ceilometer.SampleRequest
	 * @generated
	 */
	EClass getSampleRequest();

	/**
	 * Returns the meta object for the containment reference '{@link org.openecomp.ncomp.openstack.ceilometer.SampleRequest#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Query</em>'.
	 * @see org.openecomp.ncomp.openstack.ceilometer.SampleRequest#getQuery()
	 * @see #getSampleRequest()
	 * @generated
	 */
	EReference getSampleRequest_Query();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerSample <em>Sample</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sample</em>'.
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerSample
	 * @generated
	 */
	EClass getCeilometerSample();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerSample#getCounter_name <em>Counter name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Counter name</em>'.
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerSample#getCounter_name()
	 * @see #getCeilometerSample()
	 * @generated
	 */
	EAttribute getCeilometerSample_Counter_name();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerSample#getUser_id <em>User id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User id</em>'.
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerSample#getUser_id()
	 * @see #getCeilometerSample()
	 * @generated
	 */
	EAttribute getCeilometerSample_User_id();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerSample#getResource_id <em>Resource id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource id</em>'.
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerSample#getResource_id()
	 * @see #getCeilometerSample()
	 * @generated
	 */
	EAttribute getCeilometerSample_Resource_id();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerSample#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerSample#getTimestamp()
	 * @see #getCeilometerSample()
	 * @generated
	 */
	EAttribute getCeilometerSample_Timestamp();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerSample#getRecorded_at <em>Recorded at</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recorded at</em>'.
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerSample#getRecorded_at()
	 * @see #getCeilometerSample()
	 * @generated
	 */
	EAttribute getCeilometerSample_Recorded_at();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerSample#getMessage_id <em>Message id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message id</em>'.
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerSample#getMessage_id()
	 * @see #getCeilometerSample()
	 * @generated
	 */
	EAttribute getCeilometerSample_Message_id();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerSample#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerSample#getSource()
	 * @see #getCeilometerSample()
	 * @generated
	 */
	EAttribute getCeilometerSample_Source();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerSample#getCounter_unit <em>Counter unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Counter unit</em>'.
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerSample#getCounter_unit()
	 * @see #getCeilometerSample()
	 * @generated
	 */
	EAttribute getCeilometerSample_Counter_unit();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerSample#getCounter_volume <em>Counter volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Counter volume</em>'.
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerSample#getCounter_volume()
	 * @see #getCeilometerSample()
	 * @generated
	 */
	EAttribute getCeilometerSample_Counter_volume();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerSample#getProject_id <em>Project id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project id</em>'.
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerSample#getProject_id()
	 * @see #getCeilometerSample()
	 * @generated
	 */
	EAttribute getCeilometerSample_Project_id();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CeilometerFactory getCeilometerFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerServiceImpl
		 * @see org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerPackageImpl#getCeilometerService()
		 * @generated
		 */
		EClass CEILOMETER_SERVICE = eINSTANCE.getCeilometerService();

		/**
		 * The meta object literal for the '<em><b>Ceilometer Available Capabilites</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CEILOMETER_SERVICE__CEILOMETER_AVAILABLE_CAPABILITES = eINSTANCE.getCeilometerService_CeilometerAvailableCapabilites();

		/**
		 * The meta object literal for the '<em><b>Ceilometer Unavailable Capabilites</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CEILOMETER_SERVICE__CEILOMETER_UNAVAILABLE_CAPABILITES = eINSTANCE.getCeilometerService_CeilometerUnavailableCapabilites();

		/**
		 * The meta object literal for the '<em><b>Create Alarm</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CEILOMETER_SERVICE___CREATE_ALARM__CREATEALARMREQUEST = eINSTANCE.getCeilometerService__CreateAlarm__CreateAlarmRequest();

		/**
		 * The meta object literal for the '<em><b>Delete Alarm</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CEILOMETER_SERVICE___DELETE_ALARM__STRING_STRING = eINSTANCE.getCeilometerService__DeleteAlarm__String_String();

		/**
		 * The meta object literal for the '<em><b>Create Alarm</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CEILOMETER_SERVICE___CREATE_ALARM__SAMPLEREQUEST = eINSTANCE.getCeilometerService__CreateAlarm__SampleRequest();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerProjectImpl
		 * @see org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerPackageImpl#getCeilometerProject()
		 * @generated
		 */
		EClass CEILOMETER_PROJECT = eINSTANCE.getCeilometerProject();

		/**
		 * The meta object literal for the '<em><b>Alarms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CEILOMETER_PROJECT__ALARMS = eINSTANCE.getCeilometerProject_Alarms();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CEILOMETER_PROJECT__RESOURCES = eINSTANCE.getCeilometerProject_Resources();

		/**
		 * The meta object literal for the '<em><b>Meters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CEILOMETER_PROJECT__METERS = eINSTANCE.getCeilometerProject_Meters();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerAlarmImpl <em>Alarm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerAlarmImpl
		 * @see org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerPackageImpl#getCeilometerAlarm()
		 * @generated
		 */
		EClass CEILOMETER_ALARM = eINSTANCE.getCeilometerAlarm();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CEILOMETER_ALARM__ID = eINSTANCE.getCeilometerAlarm_Id();

		/**
		 * The meta object literal for the '<em><b>User id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CEILOMETER_ALARM__USER_ID = eINSTANCE.getCeilometerAlarm_User_id();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CEILOMETER_ALARM__TIMESTAMP = eINSTANCE.getCeilometerAlarm_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CEILOMETER_ALARM__ENABLED = eINSTANCE.getCeilometerAlarm_Enabled();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CEILOMETER_ALARM__STATE = eINSTANCE.getCeilometerAlarm_State();

		/**
		 * The meta object literal for the '<em><b>State timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CEILOMETER_ALARM__STATE_TIMESTAMP = eINSTANCE.getCeilometerAlarm_State_timestamp();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CEILOMETER_ALARM__DESCRIPTION = eINSTANCE.getCeilometerAlarm_Description();

		/**
		 * The meta object literal for the '<em><b>Alarm actions</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CEILOMETER_ALARM__ALARM_ACTIONS = eINSTANCE.getCeilometerAlarm_Alarm_actions();

		/**
		 * The meta object literal for the '<em><b>Ok actions</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CEILOMETER_ALARM__OK_ACTIONS = eINSTANCE.getCeilometerAlarm_Ok_actions();

		/**
		 * The meta object literal for the '<em><b>Insufficient data actions</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CEILOMETER_ALARM__INSUFFICIENT_DATA_ACTIONS = eINSTANCE.getCeilometerAlarm_Insufficient_data_actions();

		/**
		 * The meta object literal for the '<em><b>Repeat actions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CEILOMETER_ALARM__REPEAT_ACTIONS = eINSTANCE.getCeilometerAlarm_Repeat_actions();

		/**
		 * The meta object literal for the '<em><b>Time constraints</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CEILOMETER_ALARM__TIME_CONSTRAINTS = eINSTANCE.getCeilometerAlarm_Time_constraints();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerThresholdAlarmImpl <em>Threshold Alarm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerThresholdAlarmImpl
		 * @see org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerPackageImpl#getCeilometerThresholdAlarm()
		 * @generated
		 */
		EClass CEILOMETER_THRESHOLD_ALARM = eINSTANCE.getCeilometerThresholdAlarm();

		/**
		 * The meta object literal for the '<em><b>Threshold rule</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CEILOMETER_THRESHOLD_ALARM__THRESHOLD_RULE = eINSTANCE.getCeilometerThresholdAlarm_Threshold_rule();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerThresholdAlarmRuleImpl <em>Threshold Alarm Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerThresholdAlarmRuleImpl
		 * @see org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerPackageImpl#getCeilometerThresholdAlarmRule()
		 * @generated
		 */
		EClass CEILOMETER_THRESHOLD_ALARM_RULE = eINSTANCE.getCeilometerThresholdAlarmRule();

		/**
		 * The meta object literal for the '<em><b>Meter name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CEILOMETER_THRESHOLD_ALARM_RULE__METER_NAME = eINSTANCE.getCeilometerThresholdAlarmRule_Meter_name();

		/**
		 * The meta object literal for the '<em><b>Evaluation periods</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CEILOMETER_THRESHOLD_ALARM_RULE__EVALUATION_PERIODS = eINSTANCE.getCeilometerThresholdAlarmRule_Evaluation_periods();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CEILOMETER_THRESHOLD_ALARM_RULE__PERIOD = eINSTANCE.getCeilometerThresholdAlarmRule_Period();

		/**
		 * The meta object literal for the '<em><b>Statistic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CEILOMETER_THRESHOLD_ALARM_RULE__STATISTIC = eINSTANCE.getCeilometerThresholdAlarmRule_Statistic();

		/**
		 * The meta object literal for the '<em><b>Threshold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CEILOMETER_THRESHOLD_ALARM_RULE__THRESHOLD = eINSTANCE.getCeilometerThresholdAlarmRule_Threshold();

		/**
		 * The meta object literal for the '<em><b>Query</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CEILOMETER_THRESHOLD_ALARM_RULE__QUERY = eINSTANCE.getCeilometerThresholdAlarmRule_Query();

		/**
		 * The meta object literal for the '<em><b>Comparison operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CEILOMETER_THRESHOLD_ALARM_RULE__COMPARISON_OPERATOR = eINSTANCE.getCeilometerThresholdAlarmRule_Comparison_operator();

		/**
		 * The meta object literal for the '<em><b>Exclude outliers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CEILOMETER_THRESHOLD_ALARM_RULE__EXCLUDE_OUTLIERS = eINSTANCE.getCeilometerThresholdAlarmRule_Exclude_outliers();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerResourceImpl
		 * @see org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerPackageImpl#getCeilometerResource()
		 * @generated
		 */
		EClass CEILOMETER_RESOURCE = eINSTANCE.getCeilometerResource();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CEILOMETER_RESOURCE__ID = eINSTANCE.getCeilometerResource_Id();

		/**
		 * The meta object literal for the '<em><b>User id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CEILOMETER_RESOURCE__USER_ID = eINSTANCE.getCeilometerResource_User_id();

		/**
		 * The meta object literal for the '<em><b>Project id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CEILOMETER_RESOURCE__PROJECT_ID = eINSTANCE.getCeilometerResource_Project_id();

		/**
		 * The meta object literal for the '<em><b>First sample timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CEILOMETER_RESOURCE__FIRST_SAMPLE_TIMESTAMP = eINSTANCE.getCeilometerResource_First_sample_timestamp();

		/**
		 * The meta object literal for the '<em><b>Last sample timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CEILOMETER_RESOURCE__LAST_SAMPLE_TIMESTAMP = eINSTANCE.getCeilometerResource_Last_sample_timestamp();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CEILOMETER_RESOURCE__LINKS = eINSTANCE.getCeilometerResource_Links();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CEILOMETER_RESOURCE__METADATA = eINSTANCE.getCeilometerResource_Metadata();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerMeterImpl <em>Meter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerMeterImpl
		 * @see org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerPackageImpl#getCeilometerMeter()
		 * @generated
		 */
		EClass CEILOMETER_METER = eINSTANCE.getCeilometerMeter();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerQueryImpl <em>Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerQueryImpl
		 * @see org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerPackageImpl#getCeilometerQuery()
		 * @generated
		 */
		EClass CEILOMETER_QUERY = eINSTANCE.getCeilometerQuery();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CEILOMETER_QUERY__FILTER = eINSTANCE.getCeilometerQuery_Filter();

		/**
		 * The meta object literal for the '<em><b>Orderby</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CEILOMETER_QUERY__ORDERBY = eINSTANCE.getCeilometerQuery_Orderby();

		/**
		 * The meta object literal for the '<em><b>Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CEILOMETER_QUERY__LIMIT = eINSTANCE.getCeilometerQuery_Limit();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerFilterImpl <em>Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerFilterImpl
		 * @see org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerPackageImpl#getCeilometerFilter()
		 * @generated
		 */
		EClass CEILOMETER_FILTER = eINSTANCE.getCeilometerFilter();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CEILOMETER_FILTER__OPERATION = eINSTANCE.getCeilometerFilter_Operation();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CEILOMETER_FILTER__VALUE = eINSTANCE.getCeilometerFilter_Value();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CEILOMETER_FILTER__FIELD = eINSTANCE.getCeilometerFilter_Field();

		/**
		 * The meta object literal for the '<em><b>Filters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CEILOMETER_FILTER__FILTERS = eINSTANCE.getCeilometerFilter_Filters();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerOrderedByImpl <em>Ordered By</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerOrderedByImpl
		 * @see org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerPackageImpl#getCeilometerOrderedBy()
		 * @generated
		 */
		EClass CEILOMETER_ORDERED_BY = eINSTANCE.getCeilometerOrderedBy();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CEILOMETER_ORDERED_BY__FIELD = eINSTANCE.getCeilometerOrderedBy_Field();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CEILOMETER_ORDERED_BY__DIRECTION = eINSTANCE.getCeilometerOrderedBy_Direction();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerRequestImpl <em>Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerRequestImpl
		 * @see org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerPackageImpl#getCeilometerRequest()
		 * @generated
		 */
		EClass CEILOMETER_REQUEST = eINSTANCE.getCeilometerRequest();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.openstack.ceilometer.impl.CreateAlarmRequestImpl <em>Create Alarm Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.openstack.ceilometer.impl.CreateAlarmRequestImpl
		 * @see org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerPackageImpl#getCreateAlarmRequest()
		 * @generated
		 */
		EClass CREATE_ALARM_REQUEST = eINSTANCE.getCreateAlarmRequest();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.openstack.ceilometer.impl.SampleRequestImpl <em>Sample Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.openstack.ceilometer.impl.SampleRequestImpl
		 * @see org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerPackageImpl#getSampleRequest()
		 * @generated
		 */
		EClass SAMPLE_REQUEST = eINSTANCE.getSampleRequest();

		/**
		 * The meta object literal for the '<em><b>Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAMPLE_REQUEST__QUERY = eINSTANCE.getSampleRequest_Query();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerSampleImpl <em>Sample</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerSampleImpl
		 * @see org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerPackageImpl#getCeilometerSample()
		 * @generated
		 */
		EClass CEILOMETER_SAMPLE = eINSTANCE.getCeilometerSample();

		/**
		 * The meta object literal for the '<em><b>Counter name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CEILOMETER_SAMPLE__COUNTER_NAME = eINSTANCE.getCeilometerSample_Counter_name();

		/**
		 * The meta object literal for the '<em><b>User id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CEILOMETER_SAMPLE__USER_ID = eINSTANCE.getCeilometerSample_User_id();

		/**
		 * The meta object literal for the '<em><b>Resource id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CEILOMETER_SAMPLE__RESOURCE_ID = eINSTANCE.getCeilometerSample_Resource_id();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CEILOMETER_SAMPLE__TIMESTAMP = eINSTANCE.getCeilometerSample_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Recorded at</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CEILOMETER_SAMPLE__RECORDED_AT = eINSTANCE.getCeilometerSample_Recorded_at();

		/**
		 * The meta object literal for the '<em><b>Message id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CEILOMETER_SAMPLE__MESSAGE_ID = eINSTANCE.getCeilometerSample_Message_id();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CEILOMETER_SAMPLE__SOURCE = eINSTANCE.getCeilometerSample_Source();

		/**
		 * The meta object literal for the '<em><b>Counter unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CEILOMETER_SAMPLE__COUNTER_UNIT = eINSTANCE.getCeilometerSample_Counter_unit();

		/**
		 * The meta object literal for the '<em><b>Counter volume</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CEILOMETER_SAMPLE__COUNTER_VOLUME = eINSTANCE.getCeilometerSample_Counter_volume();

		/**
		 * The meta object literal for the '<em><b>Project id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CEILOMETER_SAMPLE__PROJECT_ID = eINSTANCE.getCeilometerSample_Project_id();

	}

} //CeilometerPackage
