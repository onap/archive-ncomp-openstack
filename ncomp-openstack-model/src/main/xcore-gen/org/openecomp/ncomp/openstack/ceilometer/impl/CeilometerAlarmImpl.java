
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

import org.openecomp.ncomp.core.impl.NamedEntityImpl;
import org.openecomp.ncomp.openstack.ceilometer.CeilometerAlarm;
import org.openecomp.ncomp.openstack.ceilometer.CeilometerPackage;
import java.util.Collection;
import java.util.Date;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alarm</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerAlarmImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerAlarmImpl#getUser_id <em>User id</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerAlarmImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerAlarmImpl#getEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerAlarmImpl#getState <em>State</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerAlarmImpl#getState_timestamp <em>State timestamp</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerAlarmImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerAlarmImpl#getAlarm_actions <em>Alarm actions</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerAlarmImpl#getOk_actions <em>Ok actions</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerAlarmImpl#getInsufficient_data_actions <em>Insufficient data actions</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerAlarmImpl#getRepeat_actions <em>Repeat actions</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerAlarmImpl#getTime_constraints <em>Time constraints</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CeilometerAlarmImpl extends NamedEntityImpl implements CeilometerAlarm {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

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
	 * The default value of the '{@link #getEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ENABLED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnabled()
	 * @generated
	 * @ordered
	 */
	protected Boolean enabled = ENABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final String STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected String state = STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getState_timestamp() <em>State timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState_timestamp()
	 * @generated
	 * @ordered
	 */
	protected static final Date STATE_TIMESTAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getState_timestamp() <em>State timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState_timestamp()
	 * @generated
	 * @ordered
	 */
	protected Date state_timestamp = STATE_TIMESTAMP_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAlarm_actions() <em>Alarm actions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlarm_actions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> alarm_actions;

	/**
	 * The cached value of the '{@link #getOk_actions() <em>Ok actions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOk_actions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> ok_actions;

	/**
	 * The cached value of the '{@link #getInsufficient_data_actions() <em>Insufficient data actions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsufficient_data_actions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> insufficient_data_actions;

	/**
	 * The default value of the '{@link #getRepeat_actions() <em>Repeat actions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepeat_actions()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean REPEAT_ACTIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRepeat_actions() <em>Repeat actions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepeat_actions()
	 * @generated
	 * @ordered
	 */
	protected Boolean repeat_actions = REPEAT_ACTIONS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTime_constraints() <em>Time constraints</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime_constraints()
	 * @generated
	 * @ordered
	 */
	protected EList<String> time_constraints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CeilometerAlarmImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CeilometerPackage.Literals.CEILOMETER_ALARM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CeilometerPackage.CEILOMETER_ALARM__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CeilometerPackage.CEILOMETER_ALARM__USER_ID, oldUser_id, user_id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CeilometerPackage.CEILOMETER_ALARM__TIMESTAMP, oldTimestamp, timestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getEnabled() {
		return enabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnabled(Boolean newEnabled) {
		Boolean oldEnabled = enabled;
		enabled = newEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CeilometerPackage.CEILOMETER_ALARM__ENABLED, oldEnabled, enabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(String newState) {
		String oldState = state;
		state = newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CeilometerPackage.CEILOMETER_ALARM__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getState_timestamp() {
		return state_timestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState_timestamp(Date newState_timestamp) {
		Date oldState_timestamp = state_timestamp;
		state_timestamp = newState_timestamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CeilometerPackage.CEILOMETER_ALARM__STATE_TIMESTAMP, oldState_timestamp, state_timestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CeilometerPackage.CEILOMETER_ALARM__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getAlarm_actions() {
		if (alarm_actions == null) {
			alarm_actions = new EDataTypeEList<String>(String.class, this, CeilometerPackage.CEILOMETER_ALARM__ALARM_ACTIONS);
		}
		return alarm_actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getOk_actions() {
		if (ok_actions == null) {
			ok_actions = new EDataTypeEList<String>(String.class, this, CeilometerPackage.CEILOMETER_ALARM__OK_ACTIONS);
		}
		return ok_actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getInsufficient_data_actions() {
		if (insufficient_data_actions == null) {
			insufficient_data_actions = new EDataTypeEList<String>(String.class, this, CeilometerPackage.CEILOMETER_ALARM__INSUFFICIENT_DATA_ACTIONS);
		}
		return insufficient_data_actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getRepeat_actions() {
		return repeat_actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepeat_actions(Boolean newRepeat_actions) {
		Boolean oldRepeat_actions = repeat_actions;
		repeat_actions = newRepeat_actions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CeilometerPackage.CEILOMETER_ALARM__REPEAT_ACTIONS, oldRepeat_actions, repeat_actions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getTime_constraints() {
		if (time_constraints == null) {
			time_constraints = new EDataTypeEList<String>(String.class, this, CeilometerPackage.CEILOMETER_ALARM__TIME_CONSTRAINTS);
		}
		return time_constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CeilometerPackage.CEILOMETER_ALARM__ID:
				return getId();
			case CeilometerPackage.CEILOMETER_ALARM__USER_ID:
				return getUser_id();
			case CeilometerPackage.CEILOMETER_ALARM__TIMESTAMP:
				return getTimestamp();
			case CeilometerPackage.CEILOMETER_ALARM__ENABLED:
				return getEnabled();
			case CeilometerPackage.CEILOMETER_ALARM__STATE:
				return getState();
			case CeilometerPackage.CEILOMETER_ALARM__STATE_TIMESTAMP:
				return getState_timestamp();
			case CeilometerPackage.CEILOMETER_ALARM__DESCRIPTION:
				return getDescription();
			case CeilometerPackage.CEILOMETER_ALARM__ALARM_ACTIONS:
				return getAlarm_actions();
			case CeilometerPackage.CEILOMETER_ALARM__OK_ACTIONS:
				return getOk_actions();
			case CeilometerPackage.CEILOMETER_ALARM__INSUFFICIENT_DATA_ACTIONS:
				return getInsufficient_data_actions();
			case CeilometerPackage.CEILOMETER_ALARM__REPEAT_ACTIONS:
				return getRepeat_actions();
			case CeilometerPackage.CEILOMETER_ALARM__TIME_CONSTRAINTS:
				return getTime_constraints();
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
			case CeilometerPackage.CEILOMETER_ALARM__ID:
				setId((String)newValue);
				return;
			case CeilometerPackage.CEILOMETER_ALARM__USER_ID:
				setUser_id((String)newValue);
				return;
			case CeilometerPackage.CEILOMETER_ALARM__TIMESTAMP:
				setTimestamp((Date)newValue);
				return;
			case CeilometerPackage.CEILOMETER_ALARM__ENABLED:
				setEnabled((Boolean)newValue);
				return;
			case CeilometerPackage.CEILOMETER_ALARM__STATE:
				setState((String)newValue);
				return;
			case CeilometerPackage.CEILOMETER_ALARM__STATE_TIMESTAMP:
				setState_timestamp((Date)newValue);
				return;
			case CeilometerPackage.CEILOMETER_ALARM__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case CeilometerPackage.CEILOMETER_ALARM__ALARM_ACTIONS:
				getAlarm_actions().clear();
				getAlarm_actions().addAll((Collection<? extends String>)newValue);
				return;
			case CeilometerPackage.CEILOMETER_ALARM__OK_ACTIONS:
				getOk_actions().clear();
				getOk_actions().addAll((Collection<? extends String>)newValue);
				return;
			case CeilometerPackage.CEILOMETER_ALARM__INSUFFICIENT_DATA_ACTIONS:
				getInsufficient_data_actions().clear();
				getInsufficient_data_actions().addAll((Collection<? extends String>)newValue);
				return;
			case CeilometerPackage.CEILOMETER_ALARM__REPEAT_ACTIONS:
				setRepeat_actions((Boolean)newValue);
				return;
			case CeilometerPackage.CEILOMETER_ALARM__TIME_CONSTRAINTS:
				getTime_constraints().clear();
				getTime_constraints().addAll((Collection<? extends String>)newValue);
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
			case CeilometerPackage.CEILOMETER_ALARM__ID:
				setId(ID_EDEFAULT);
				return;
			case CeilometerPackage.CEILOMETER_ALARM__USER_ID:
				setUser_id(USER_ID_EDEFAULT);
				return;
			case CeilometerPackage.CEILOMETER_ALARM__TIMESTAMP:
				setTimestamp(TIMESTAMP_EDEFAULT);
				return;
			case CeilometerPackage.CEILOMETER_ALARM__ENABLED:
				setEnabled(ENABLED_EDEFAULT);
				return;
			case CeilometerPackage.CEILOMETER_ALARM__STATE:
				setState(STATE_EDEFAULT);
				return;
			case CeilometerPackage.CEILOMETER_ALARM__STATE_TIMESTAMP:
				setState_timestamp(STATE_TIMESTAMP_EDEFAULT);
				return;
			case CeilometerPackage.CEILOMETER_ALARM__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case CeilometerPackage.CEILOMETER_ALARM__ALARM_ACTIONS:
				getAlarm_actions().clear();
				return;
			case CeilometerPackage.CEILOMETER_ALARM__OK_ACTIONS:
				getOk_actions().clear();
				return;
			case CeilometerPackage.CEILOMETER_ALARM__INSUFFICIENT_DATA_ACTIONS:
				getInsufficient_data_actions().clear();
				return;
			case CeilometerPackage.CEILOMETER_ALARM__REPEAT_ACTIONS:
				setRepeat_actions(REPEAT_ACTIONS_EDEFAULT);
				return;
			case CeilometerPackage.CEILOMETER_ALARM__TIME_CONSTRAINTS:
				getTime_constraints().clear();
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
			case CeilometerPackage.CEILOMETER_ALARM__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case CeilometerPackage.CEILOMETER_ALARM__USER_ID:
				return USER_ID_EDEFAULT == null ? user_id != null : !USER_ID_EDEFAULT.equals(user_id);
			case CeilometerPackage.CEILOMETER_ALARM__TIMESTAMP:
				return TIMESTAMP_EDEFAULT == null ? timestamp != null : !TIMESTAMP_EDEFAULT.equals(timestamp);
			case CeilometerPackage.CEILOMETER_ALARM__ENABLED:
				return ENABLED_EDEFAULT == null ? enabled != null : !ENABLED_EDEFAULT.equals(enabled);
			case CeilometerPackage.CEILOMETER_ALARM__STATE:
				return STATE_EDEFAULT == null ? state != null : !STATE_EDEFAULT.equals(state);
			case CeilometerPackage.CEILOMETER_ALARM__STATE_TIMESTAMP:
				return STATE_TIMESTAMP_EDEFAULT == null ? state_timestamp != null : !STATE_TIMESTAMP_EDEFAULT.equals(state_timestamp);
			case CeilometerPackage.CEILOMETER_ALARM__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case CeilometerPackage.CEILOMETER_ALARM__ALARM_ACTIONS:
				return alarm_actions != null && !alarm_actions.isEmpty();
			case CeilometerPackage.CEILOMETER_ALARM__OK_ACTIONS:
				return ok_actions != null && !ok_actions.isEmpty();
			case CeilometerPackage.CEILOMETER_ALARM__INSUFFICIENT_DATA_ACTIONS:
				return insufficient_data_actions != null && !insufficient_data_actions.isEmpty();
			case CeilometerPackage.CEILOMETER_ALARM__REPEAT_ACTIONS:
				return REPEAT_ACTIONS_EDEFAULT == null ? repeat_actions != null : !REPEAT_ACTIONS_EDEFAULT.equals(repeat_actions);
			case CeilometerPackage.CEILOMETER_ALARM__TIME_CONSTRAINTS:
				return time_constraints != null && !time_constraints.isEmpty();
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
		result.append(" (id: ");
		result.append(id);
		result.append(", user_id: ");
		result.append(user_id);
		result.append(", timestamp: ");
		result.append(timestamp);
		result.append(", enabled: ");
		result.append(enabled);
		result.append(", state: ");
		result.append(state);
		result.append(", state_timestamp: ");
		result.append(state_timestamp);
		result.append(", description: ");
		result.append(description);
		result.append(", alarm_actions: ");
		result.append(alarm_actions);
		result.append(", ok_actions: ");
		result.append(ok_actions);
		result.append(", insufficient_data_actions: ");
		result.append(insufficient_data_actions);
		result.append(", repeat_actions: ");
		result.append(repeat_actions);
		result.append(", time_constraints: ");
		result.append(time_constraints);
		result.append(')');
		return result.toString();
	}

} //CeilometerAlarmImpl
