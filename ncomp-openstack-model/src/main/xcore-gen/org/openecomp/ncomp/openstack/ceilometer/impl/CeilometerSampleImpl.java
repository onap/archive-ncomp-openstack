
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
import org.openecomp.ncomp.openstack.ceilometer.CeilometerSample;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sample</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerSampleImpl#getCounter_name <em>Counter name</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerSampleImpl#getUser_id <em>User id</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerSampleImpl#getResource_id <em>Resource id</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerSampleImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerSampleImpl#getRecorded_at <em>Recorded at</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerSampleImpl#getMessage_id <em>Message id</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerSampleImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerSampleImpl#getCounter_unit <em>Counter unit</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerSampleImpl#getCounter_volume <em>Counter volume</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerSampleImpl#getProject_id <em>Project id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CeilometerSampleImpl extends MinimalEObjectImpl.Container implements CeilometerSample {
	/**
	 * The default value of the '{@link #getCounter_name() <em>Counter name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCounter_name()
	 * @generated
	 * @ordered
	 */
	protected static final String COUNTER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCounter_name() <em>Counter name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCounter_name()
	 * @generated
	 * @ordered
	 */
	protected String counter_name = COUNTER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getUser_id() <em>User id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser_id()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUser_id() <em>User id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser_id()
	 * @generated
	 * @ordered
	 */
	protected String user_id = USER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getResource_id() <em>Resource id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource_id()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOURCE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResource_id() <em>Resource id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource_id()
	 * @generated
	 * @ordered
	 */
	protected String resource_id = RESOURCE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected static final Date TIMESTAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected Date timestamp = TIMESTAMP_EDEFAULT;

	/**
	 * The default value of the '{@link #getRecorded_at() <em>Recorded at</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecorded_at()
	 * @generated
	 * @ordered
	 */
	protected static final Date RECORDED_AT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRecorded_at() <em>Recorded at</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecorded_at()
	 * @generated
	 * @ordered
	 */
	protected Date recorded_at = RECORDED_AT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMessage_id() <em>Message id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage_id()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessage_id() <em>Message id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage_id()
	 * @generated
	 * @ordered
	 */
	protected String message_id = MESSAGE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected String source = SOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCounter_unit() <em>Counter unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCounter_unit()
	 * @generated
	 * @ordered
	 */
	protected static final String COUNTER_UNIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCounter_unit() <em>Counter unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCounter_unit()
	 * @generated
	 * @ordered
	 */
	protected String counter_unit = COUNTER_UNIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCounter_volume() <em>Counter volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCounter_volume()
	 * @generated
	 * @ordered
	 */
	protected static final double COUNTER_VOLUME_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCounter_volume() <em>Counter volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCounter_volume()
	 * @generated
	 * @ordered
	 */
	protected double counter_volume = COUNTER_VOLUME_EDEFAULT;

	/**
	 * The default value of the '{@link #getProject_id() <em>Project id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProject_id()
	 * @generated
	 * @ordered
	 */
	protected static final String PROJECT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProject_id() <em>Project id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProject_id()
	 * @generated
	 * @ordered
	 */
	protected String project_id = PROJECT_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CeilometerSampleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CeilometerPackage.Literals.CEILOMETER_SAMPLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCounter_name() {
		return counter_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCounter_name(String newCounter_name) {
		String oldCounter_name = counter_name;
		counter_name = newCounter_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CeilometerPackage.CEILOMETER_SAMPLE__COUNTER_NAME, oldCounter_name, counter_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUser_id() {
		return user_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUser_id(String newUser_id) {
		String oldUser_id = user_id;
		user_id = newUser_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CeilometerPackage.CEILOMETER_SAMPLE__USER_ID, oldUser_id, user_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResource_id() {
		return resource_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResource_id(String newResource_id) {
		String oldResource_id = resource_id;
		resource_id = newResource_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CeilometerPackage.CEILOMETER_SAMPLE__RESOURCE_ID, oldResource_id, resource_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getTimestamp() {
		return timestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimestamp(Date newTimestamp) {
		Date oldTimestamp = timestamp;
		timestamp = newTimestamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CeilometerPackage.CEILOMETER_SAMPLE__TIMESTAMP, oldTimestamp, timestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getRecorded_at() {
		return recorded_at;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecorded_at(Date newRecorded_at) {
		Date oldRecorded_at = recorded_at;
		recorded_at = newRecorded_at;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CeilometerPackage.CEILOMETER_SAMPLE__RECORDED_AT, oldRecorded_at, recorded_at));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMessage_id() {
		return message_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessage_id(String newMessage_id) {
		String oldMessage_id = message_id;
		message_id = newMessage_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CeilometerPackage.CEILOMETER_SAMPLE__MESSAGE_ID, oldMessage_id, message_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(String newSource) {
		String oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CeilometerPackage.CEILOMETER_SAMPLE__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCounter_unit() {
		return counter_unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCounter_unit(String newCounter_unit) {
		String oldCounter_unit = counter_unit;
		counter_unit = newCounter_unit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CeilometerPackage.CEILOMETER_SAMPLE__COUNTER_UNIT, oldCounter_unit, counter_unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCounter_volume() {
		return counter_volume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCounter_volume(double newCounter_volume) {
		double oldCounter_volume = counter_volume;
		counter_volume = newCounter_volume;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CeilometerPackage.CEILOMETER_SAMPLE__COUNTER_VOLUME, oldCounter_volume, counter_volume));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProject_id() {
		return project_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProject_id(String newProject_id) {
		String oldProject_id = project_id;
		project_id = newProject_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CeilometerPackage.CEILOMETER_SAMPLE__PROJECT_ID, oldProject_id, project_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CeilometerPackage.CEILOMETER_SAMPLE__COUNTER_NAME:
				return getCounter_name();
			case CeilometerPackage.CEILOMETER_SAMPLE__USER_ID:
				return getUser_id();
			case CeilometerPackage.CEILOMETER_SAMPLE__RESOURCE_ID:
				return getResource_id();
			case CeilometerPackage.CEILOMETER_SAMPLE__TIMESTAMP:
				return getTimestamp();
			case CeilometerPackage.CEILOMETER_SAMPLE__RECORDED_AT:
				return getRecorded_at();
			case CeilometerPackage.CEILOMETER_SAMPLE__MESSAGE_ID:
				return getMessage_id();
			case CeilometerPackage.CEILOMETER_SAMPLE__SOURCE:
				return getSource();
			case CeilometerPackage.CEILOMETER_SAMPLE__COUNTER_UNIT:
				return getCounter_unit();
			case CeilometerPackage.CEILOMETER_SAMPLE__COUNTER_VOLUME:
				return getCounter_volume();
			case CeilometerPackage.CEILOMETER_SAMPLE__PROJECT_ID:
				return getProject_id();
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
			case CeilometerPackage.CEILOMETER_SAMPLE__COUNTER_NAME:
				setCounter_name((String)newValue);
				return;
			case CeilometerPackage.CEILOMETER_SAMPLE__USER_ID:
				setUser_id((String)newValue);
				return;
			case CeilometerPackage.CEILOMETER_SAMPLE__RESOURCE_ID:
				setResource_id((String)newValue);
				return;
			case CeilometerPackage.CEILOMETER_SAMPLE__TIMESTAMP:
				setTimestamp((Date)newValue);
				return;
			case CeilometerPackage.CEILOMETER_SAMPLE__RECORDED_AT:
				setRecorded_at((Date)newValue);
				return;
			case CeilometerPackage.CEILOMETER_SAMPLE__MESSAGE_ID:
				setMessage_id((String)newValue);
				return;
			case CeilometerPackage.CEILOMETER_SAMPLE__SOURCE:
				setSource((String)newValue);
				return;
			case CeilometerPackage.CEILOMETER_SAMPLE__COUNTER_UNIT:
				setCounter_unit((String)newValue);
				return;
			case CeilometerPackage.CEILOMETER_SAMPLE__COUNTER_VOLUME:
				setCounter_volume((Double)newValue);
				return;
			case CeilometerPackage.CEILOMETER_SAMPLE__PROJECT_ID:
				setProject_id((String)newValue);
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
			case CeilometerPackage.CEILOMETER_SAMPLE__COUNTER_NAME:
				setCounter_name(COUNTER_NAME_EDEFAULT);
				return;
			case CeilometerPackage.CEILOMETER_SAMPLE__USER_ID:
				setUser_id(USER_ID_EDEFAULT);
				return;
			case CeilometerPackage.CEILOMETER_SAMPLE__RESOURCE_ID:
				setResource_id(RESOURCE_ID_EDEFAULT);
				return;
			case CeilometerPackage.CEILOMETER_SAMPLE__TIMESTAMP:
				setTimestamp(TIMESTAMP_EDEFAULT);
				return;
			case CeilometerPackage.CEILOMETER_SAMPLE__RECORDED_AT:
				setRecorded_at(RECORDED_AT_EDEFAULT);
				return;
			case CeilometerPackage.CEILOMETER_SAMPLE__MESSAGE_ID:
				setMessage_id(MESSAGE_ID_EDEFAULT);
				return;
			case CeilometerPackage.CEILOMETER_SAMPLE__SOURCE:
				setSource(SOURCE_EDEFAULT);
				return;
			case CeilometerPackage.CEILOMETER_SAMPLE__COUNTER_UNIT:
				setCounter_unit(COUNTER_UNIT_EDEFAULT);
				return;
			case CeilometerPackage.CEILOMETER_SAMPLE__COUNTER_VOLUME:
				setCounter_volume(COUNTER_VOLUME_EDEFAULT);
				return;
			case CeilometerPackage.CEILOMETER_SAMPLE__PROJECT_ID:
				setProject_id(PROJECT_ID_EDEFAULT);
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
			case CeilometerPackage.CEILOMETER_SAMPLE__COUNTER_NAME:
				return COUNTER_NAME_EDEFAULT == null ? counter_name != null : !COUNTER_NAME_EDEFAULT.equals(counter_name);
			case CeilometerPackage.CEILOMETER_SAMPLE__USER_ID:
				return USER_ID_EDEFAULT == null ? user_id != null : !USER_ID_EDEFAULT.equals(user_id);
			case CeilometerPackage.CEILOMETER_SAMPLE__RESOURCE_ID:
				return RESOURCE_ID_EDEFAULT == null ? resource_id != null : !RESOURCE_ID_EDEFAULT.equals(resource_id);
			case CeilometerPackage.CEILOMETER_SAMPLE__TIMESTAMP:
				return TIMESTAMP_EDEFAULT == null ? timestamp != null : !TIMESTAMP_EDEFAULT.equals(timestamp);
			case CeilometerPackage.CEILOMETER_SAMPLE__RECORDED_AT:
				return RECORDED_AT_EDEFAULT == null ? recorded_at != null : !RECORDED_AT_EDEFAULT.equals(recorded_at);
			case CeilometerPackage.CEILOMETER_SAMPLE__MESSAGE_ID:
				return MESSAGE_ID_EDEFAULT == null ? message_id != null : !MESSAGE_ID_EDEFAULT.equals(message_id);
			case CeilometerPackage.CEILOMETER_SAMPLE__SOURCE:
				return SOURCE_EDEFAULT == null ? source != null : !SOURCE_EDEFAULT.equals(source);
			case CeilometerPackage.CEILOMETER_SAMPLE__COUNTER_UNIT:
				return COUNTER_UNIT_EDEFAULT == null ? counter_unit != null : !COUNTER_UNIT_EDEFAULT.equals(counter_unit);
			case CeilometerPackage.CEILOMETER_SAMPLE__COUNTER_VOLUME:
				return counter_volume != COUNTER_VOLUME_EDEFAULT;
			case CeilometerPackage.CEILOMETER_SAMPLE__PROJECT_ID:
				return PROJECT_ID_EDEFAULT == null ? project_id != null : !PROJECT_ID_EDEFAULT.equals(project_id);
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
		result.append(" (counter_name: ");
		result.append(counter_name);
		result.append(", user_id: ");
		result.append(user_id);
		result.append(", resource_id: ");
		result.append(resource_id);
		result.append(", timestamp: ");
		result.append(timestamp);
		result.append(", recorded_at: ");
		result.append(recorded_at);
		result.append(", message_id: ");
		result.append(message_id);
		result.append(", source: ");
		result.append(source);
		result.append(", counter_unit: ");
		result.append(counter_unit);
		result.append(", counter_volume: ");
		result.append(counter_volume);
		result.append(", project_id: ");
		result.append(project_id);
		result.append(')');
		return result.toString();
	}

} //CeilometerSampleImpl
