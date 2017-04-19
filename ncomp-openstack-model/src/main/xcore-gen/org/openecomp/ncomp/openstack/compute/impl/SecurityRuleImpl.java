
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
package org.openecomp.ncomp.openstack.compute.impl;

import org.openecomp.ncomp.openstack.compute.ComputePackage;
import org.openecomp.ncomp.openstack.compute.SecurityGroup;
import org.openecomp.ncomp.openstack.compute.SecurityRange;
import org.openecomp.ncomp.openstack.compute.SecurityRule;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Security Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.impl.SecurityRuleImpl#getFrom_port <em>From port</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.impl.SecurityRuleImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.impl.SecurityRuleImpl#getIp_protocol <em>Ip protocol</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.impl.SecurityRuleImpl#getTo_port <em>To port</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.impl.SecurityRuleImpl#getParent_group_id <em>Parent group id</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.impl.SecurityRuleImpl#getIp_range <em>Ip range</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.impl.SecurityRuleImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecurityRuleImpl extends MinimalEObjectImpl.Container implements SecurityRule {
	/**
	 * The default value of the '{@link #getFrom_port() <em>From port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom_port()
	 * @generated
	 * @ordered
	 */
	protected static final Integer FROM_PORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFrom_port() <em>From port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom_port()
	 * @generated
	 * @ordered
	 */
	protected Integer from_port = FROM_PORT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected SecurityGroup group;

	/**
	 * The default value of the '{@link #getIp_protocol() <em>Ip protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIp_protocol()
	 * @generated
	 * @ordered
	 */
	protected static final String IP_PROTOCOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIp_protocol() <em>Ip protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIp_protocol()
	 * @generated
	 * @ordered
	 */
	protected String ip_protocol = IP_PROTOCOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getTo_port() <em>To port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo_port()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TO_PORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTo_port() <em>To port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo_port()
	 * @generated
	 * @ordered
	 */
	protected Integer to_port = TO_PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getParent_group_id() <em>Parent group id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent_group_id()
	 * @generated
	 * @ordered
	 */
	protected static final String PARENT_GROUP_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParent_group_id() <em>Parent group id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent_group_id()
	 * @generated
	 * @ordered
	 */
	protected String parent_group_id = PARENT_GROUP_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIp_range() <em>Ip range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIp_range()
	 * @generated
	 * @ordered
	 */
	protected SecurityRange ip_range;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComputePackage.Literals.SECURITY_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getFrom_port() {
		return from_port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom_port(Integer newFrom_port) {
		Integer oldFrom_port = from_port;
		from_port = newFrom_port;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputePackage.SECURITY_RULE__FROM_PORT, oldFrom_port, from_port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityGroup getGroup() {
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroup(SecurityGroup newGroup, NotificationChain msgs) {
		SecurityGroup oldGroup = group;
		group = newGroup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComputePackage.SECURITY_RULE__GROUP, oldGroup, newGroup);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroup(SecurityGroup newGroup) {
		if (newGroup != group) {
			NotificationChain msgs = null;
			if (group != null)
				msgs = ((InternalEObject)group).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComputePackage.SECURITY_RULE__GROUP, null, msgs);
			if (newGroup != null)
				msgs = ((InternalEObject)newGroup).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComputePackage.SECURITY_RULE__GROUP, null, msgs);
			msgs = basicSetGroup(newGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputePackage.SECURITY_RULE__GROUP, newGroup, newGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIp_protocol() {
		return ip_protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIp_protocol(String newIp_protocol) {
		String oldIp_protocol = ip_protocol;
		ip_protocol = newIp_protocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputePackage.SECURITY_RULE__IP_PROTOCOL, oldIp_protocol, ip_protocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getTo_port() {
		return to_port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo_port(Integer newTo_port) {
		Integer oldTo_port = to_port;
		to_port = newTo_port;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputePackage.SECURITY_RULE__TO_PORT, oldTo_port, to_port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParent_group_id() {
		return parent_group_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent_group_id(String newParent_group_id) {
		String oldParent_group_id = parent_group_id;
		parent_group_id = newParent_group_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputePackage.SECURITY_RULE__PARENT_GROUP_ID, oldParent_group_id, parent_group_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityRange getIp_range() {
		return ip_range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIp_range(SecurityRange newIp_range, NotificationChain msgs) {
		SecurityRange oldIp_range = ip_range;
		ip_range = newIp_range;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComputePackage.SECURITY_RULE__IP_RANGE, oldIp_range, newIp_range);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIp_range(SecurityRange newIp_range) {
		if (newIp_range != ip_range) {
			NotificationChain msgs = null;
			if (ip_range != null)
				msgs = ((InternalEObject)ip_range).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComputePackage.SECURITY_RULE__IP_RANGE, null, msgs);
			if (newIp_range != null)
				msgs = ((InternalEObject)newIp_range).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComputePackage.SECURITY_RULE__IP_RANGE, null, msgs);
			msgs = basicSetIp_range(newIp_range, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputePackage.SECURITY_RULE__IP_RANGE, newIp_range, newIp_range));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComputePackage.SECURITY_RULE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComputePackage.SECURITY_RULE__GROUP:
				return basicSetGroup(null, msgs);
			case ComputePackage.SECURITY_RULE__IP_RANGE:
				return basicSetIp_range(null, msgs);
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
			case ComputePackage.SECURITY_RULE__FROM_PORT:
				return getFrom_port();
			case ComputePackage.SECURITY_RULE__GROUP:
				return getGroup();
			case ComputePackage.SECURITY_RULE__IP_PROTOCOL:
				return getIp_protocol();
			case ComputePackage.SECURITY_RULE__TO_PORT:
				return getTo_port();
			case ComputePackage.SECURITY_RULE__PARENT_GROUP_ID:
				return getParent_group_id();
			case ComputePackage.SECURITY_RULE__IP_RANGE:
				return getIp_range();
			case ComputePackage.SECURITY_RULE__ID:
				return getId();
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
			case ComputePackage.SECURITY_RULE__FROM_PORT:
				setFrom_port((Integer)newValue);
				return;
			case ComputePackage.SECURITY_RULE__GROUP:
				setGroup((SecurityGroup)newValue);
				return;
			case ComputePackage.SECURITY_RULE__IP_PROTOCOL:
				setIp_protocol((String)newValue);
				return;
			case ComputePackage.SECURITY_RULE__TO_PORT:
				setTo_port((Integer)newValue);
				return;
			case ComputePackage.SECURITY_RULE__PARENT_GROUP_ID:
				setParent_group_id((String)newValue);
				return;
			case ComputePackage.SECURITY_RULE__IP_RANGE:
				setIp_range((SecurityRange)newValue);
				return;
			case ComputePackage.SECURITY_RULE__ID:
				setId((String)newValue);
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
			case ComputePackage.SECURITY_RULE__FROM_PORT:
				setFrom_port(FROM_PORT_EDEFAULT);
				return;
			case ComputePackage.SECURITY_RULE__GROUP:
				setGroup((SecurityGroup)null);
				return;
			case ComputePackage.SECURITY_RULE__IP_PROTOCOL:
				setIp_protocol(IP_PROTOCOL_EDEFAULT);
				return;
			case ComputePackage.SECURITY_RULE__TO_PORT:
				setTo_port(TO_PORT_EDEFAULT);
				return;
			case ComputePackage.SECURITY_RULE__PARENT_GROUP_ID:
				setParent_group_id(PARENT_GROUP_ID_EDEFAULT);
				return;
			case ComputePackage.SECURITY_RULE__IP_RANGE:
				setIp_range((SecurityRange)null);
				return;
			case ComputePackage.SECURITY_RULE__ID:
				setId(ID_EDEFAULT);
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
			case ComputePackage.SECURITY_RULE__FROM_PORT:
				return FROM_PORT_EDEFAULT == null ? from_port != null : !FROM_PORT_EDEFAULT.equals(from_port);
			case ComputePackage.SECURITY_RULE__GROUP:
				return group != null;
			case ComputePackage.SECURITY_RULE__IP_PROTOCOL:
				return IP_PROTOCOL_EDEFAULT == null ? ip_protocol != null : !IP_PROTOCOL_EDEFAULT.equals(ip_protocol);
			case ComputePackage.SECURITY_RULE__TO_PORT:
				return TO_PORT_EDEFAULT == null ? to_port != null : !TO_PORT_EDEFAULT.equals(to_port);
			case ComputePackage.SECURITY_RULE__PARENT_GROUP_ID:
				return PARENT_GROUP_ID_EDEFAULT == null ? parent_group_id != null : !PARENT_GROUP_ID_EDEFAULT.equals(parent_group_id);
			case ComputePackage.SECURITY_RULE__IP_RANGE:
				return ip_range != null;
			case ComputePackage.SECURITY_RULE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
		result.append(" (from_port: ");
		result.append(from_port);
		result.append(", ip_protocol: ");
		result.append(ip_protocol);
		result.append(", to_port: ");
		result.append(to_port);
		result.append(", parent_group_id: ");
		result.append(parent_group_id);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //SecurityRuleImpl
