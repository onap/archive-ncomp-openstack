
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

import org.openecomp.ncomp.core.NamedEntity;
import java.util.Date;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alarm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerAlarm#getId <em>Id</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerAlarm#getUser_id <em>User id</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerAlarm#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerAlarm#getEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerAlarm#getState <em>State</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerAlarm#getState_timestamp <em>State timestamp</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerAlarm#getDescription <em>Description</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerAlarm#getAlarm_actions <em>Alarm actions</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerAlarm#getOk_actions <em>Ok actions</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerAlarm#getInsufficient_data_actions <em>Insufficient data actions</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerAlarm#getRepeat_actions <em>Repeat actions</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerAlarm#getTime_constraints <em>Time constraints</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerPackage#getCeilometerAlarm()
 * @model abstract="true"
 * @generated
 */
public interface CeilometerAlarm extends NamedEntity {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerPackage#getCeilometerAlarm_Id()
	 * @model unique="false"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerAlarm#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>User id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User id</em>' attribute.
	 * @see #setUser_id(String)
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerPackage#getCeilometerAlarm_User_id()
	 * @model unique="false"
	 * @generated
	 */
	String getUser_id();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerAlarm#getUser_id <em>User id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User id</em>' attribute.
	 * @see #getUser_id()
	 * @generated
	 */
	void setUser_id(String value);

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timestamp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(Date)
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerPackage#getCeilometerAlarm_Timestamp()
	 * @model unique="false"
	 * @generated
	 */
	Date getTimestamp();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerAlarm#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(Date value);

	/**
	 * Returns the value of the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enabled</em>' attribute.
	 * @see #setEnabled(Boolean)
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerPackage#getCeilometerAlarm_Enabled()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getEnabled();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerAlarm#getEnabled <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enabled</em>' attribute.
	 * @see #getEnabled()
	 * @generated
	 */
	void setEnabled(Boolean value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see #setState(String)
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerPackage#getCeilometerAlarm_State()
	 * @model unique="false"
	 * @generated
	 */
	String getState();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerAlarm#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see #getState()
	 * @generated
	 */
	void setState(String value);

	/**
	 * Returns the value of the '<em><b>State timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State timestamp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State timestamp</em>' attribute.
	 * @see #setState_timestamp(Date)
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerPackage#getCeilometerAlarm_State_timestamp()
	 * @model unique="false"
	 * @generated
	 */
	Date getState_timestamp();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerAlarm#getState_timestamp <em>State timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State timestamp</em>' attribute.
	 * @see #getState_timestamp()
	 * @generated
	 */
	void setState_timestamp(Date value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerPackage#getCeilometerAlarm_Description()
	 * @model unique="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerAlarm#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Alarm actions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alarm actions</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alarm actions</em>' attribute list.
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerPackage#getCeilometerAlarm_Alarm_actions()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getAlarm_actions();

	/**
	 * Returns the value of the '<em><b>Ok actions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ok actions</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ok actions</em>' attribute list.
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerPackage#getCeilometerAlarm_Ok_actions()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getOk_actions();

	/**
	 * Returns the value of the '<em><b>Insufficient data actions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Insufficient data actions</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Insufficient data actions</em>' attribute list.
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerPackage#getCeilometerAlarm_Insufficient_data_actions()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getInsufficient_data_actions();

	/**
	 * Returns the value of the '<em><b>Repeat actions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repeat actions</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repeat actions</em>' attribute.
	 * @see #setRepeat_actions(Boolean)
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerPackage#getCeilometerAlarm_Repeat_actions()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getRepeat_actions();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerAlarm#getRepeat_actions <em>Repeat actions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repeat actions</em>' attribute.
	 * @see #getRepeat_actions()
	 * @generated
	 */
	void setRepeat_actions(Boolean value);

	/**
	 * Returns the value of the '<em><b>Time constraints</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time constraints</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time constraints</em>' attribute list.
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerPackage#getCeilometerAlarm_Time_constraints()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getTime_constraints();

} // CeilometerAlarm
