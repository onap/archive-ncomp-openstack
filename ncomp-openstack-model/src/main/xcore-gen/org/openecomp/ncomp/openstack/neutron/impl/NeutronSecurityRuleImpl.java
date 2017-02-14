
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
package org.openecomp.ncomp.openstack.neutron.impl;

import org.openecomp.ncomp.openstack.neutron.NeutronPackage;
import org.openecomp.ncomp.openstack.neutron.NeutronSecurityRule;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Security Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.NeutronSecurityRuleImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.NeutronSecurityRuleImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.NeutronSecurityRuleImpl#getEthertype <em>Ethertype</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.NeutronSecurityRuleImpl#getPort_range_min <em>Port range min</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.NeutronSecurityRuleImpl#getPort_range_max <em>Port range max</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.NeutronSecurityRuleImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.NeutronSecurityRuleImpl#getRemote_group_id <em>Remote group id</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.NeutronSecurityRuleImpl#getRemote_ip_prefix <em>Remote ip prefix</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.NeutronSecurityRuleImpl#getSecurity_group_id <em>Security group id</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.NeutronSecurityRuleImpl#getTenant_id <em>Tenant id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NeutronSecurityRuleImpl extends NeutronObjectImpl implements NeutronSecurityRule {
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
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final String DIRECTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected String direction = DIRECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getEthertype() <em>Ethertype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEthertype()
	 * @generated
	 * @ordered
	 */
	protected static final String ETHERTYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEthertype() <em>Ethertype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEthertype()
	 * @generated
	 * @ordered
	 */
	protected String ethertype = ETHERTYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPort_range_min() <em>Port range min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort_range_min()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PORT_RANGE_MIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPort_range_min() <em>Port range min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort_range_min()
	 * @generated
	 * @ordered
	 */
	protected Integer port_range_min = PORT_RANGE_MIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getPort_range_max() <em>Port range max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort_range_max()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PORT_RANGE_MAX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPort_range_max() <em>Port range max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort_range_max()
	 * @generated
	 * @ordered
	 */
	protected Integer port_range_max = PORT_RANGE_MAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected static final String PROTOCOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected String protocol = PROTOCOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getRemote_group_id() <em>Remote group id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemote_group_id()
	 * @generated
	 * @ordered
	 */
	protected static final String REMOTE_GROUP_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemote_group_id() <em>Remote group id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemote_group_id()
	 * @generated
	 * @ordered
	 */
	protected String remote_group_id = REMOTE_GROUP_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getRemote_ip_prefix() <em>Remote ip prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemote_ip_prefix()
	 * @generated
	 * @ordered
	 */
	protected static final String REMOTE_IP_PREFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemote_ip_prefix() <em>Remote ip prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemote_ip_prefix()
	 * @generated
	 * @ordered
	 */
	protected String remote_ip_prefix = REMOTE_IP_PREFIX_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecurity_group_id() <em>Security group id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurity_group_id()
	 * @generated
	 * @ordered
	 */
	protected static final String SECURITY_GROUP_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecurity_group_id() <em>Security group id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurity_group_id()
	 * @generated
	 * @ordered
	 */
	protected String security_group_id = SECURITY_GROUP_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTenant_id() <em>Tenant id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTenant_id()
	 * @generated
	 * @ordered
	 */
	protected static final String TENANT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTenant_id() <em>Tenant id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTenant_id()
	 * @generated
	 * @ordered
	 */
	protected String tenant_id = TENANT_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NeutronSecurityRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NeutronPackage.Literals.NEUTRON_SECURITY_RULE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, NeutronPackage.NEUTRON_SECURITY_RULE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(String newDirection) {
		String oldDirection = direction;
		direction = newDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NeutronPackage.NEUTRON_SECURITY_RULE__DIRECTION, oldDirection, direction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEthertype() {
		return ethertype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEthertype(String newEthertype) {
		String oldEthertype = ethertype;
		ethertype = newEthertype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NeutronPackage.NEUTRON_SECURITY_RULE__ETHERTYPE, oldEthertype, ethertype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getPort_range_min() {
		return port_range_min;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort_range_min(Integer newPort_range_min) {
		Integer oldPort_range_min = port_range_min;
		port_range_min = newPort_range_min;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NeutronPackage.NEUTRON_SECURITY_RULE__PORT_RANGE_MIN, oldPort_range_min, port_range_min));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getPort_range_max() {
		return port_range_max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort_range_max(Integer newPort_range_max) {
		Integer oldPort_range_max = port_range_max;
		port_range_max = newPort_range_max;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NeutronPackage.NEUTRON_SECURITY_RULE__PORT_RANGE_MAX, oldPort_range_max, port_range_max));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProtocol() {
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtocol(String newProtocol) {
		String oldProtocol = protocol;
		protocol = newProtocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NeutronPackage.NEUTRON_SECURITY_RULE__PROTOCOL, oldProtocol, protocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRemote_group_id() {
		return remote_group_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemote_group_id(String newRemote_group_id) {
		String oldRemote_group_id = remote_group_id;
		remote_group_id = newRemote_group_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NeutronPackage.NEUTRON_SECURITY_RULE__REMOTE_GROUP_ID, oldRemote_group_id, remote_group_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRemote_ip_prefix() {
		return remote_ip_prefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemote_ip_prefix(String newRemote_ip_prefix) {
		String oldRemote_ip_prefix = remote_ip_prefix;
		remote_ip_prefix = newRemote_ip_prefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NeutronPackage.NEUTRON_SECURITY_RULE__REMOTE_IP_PREFIX, oldRemote_ip_prefix, remote_ip_prefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSecurity_group_id() {
		return security_group_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurity_group_id(String newSecurity_group_id) {
		String oldSecurity_group_id = security_group_id;
		security_group_id = newSecurity_group_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NeutronPackage.NEUTRON_SECURITY_RULE__SECURITY_GROUP_ID, oldSecurity_group_id, security_group_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTenant_id() {
		return tenant_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTenant_id(String newTenant_id) {
		String oldTenant_id = tenant_id;
		tenant_id = newTenant_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NeutronPackage.NEUTRON_SECURITY_RULE__TENANT_ID, oldTenant_id, tenant_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NeutronPackage.NEUTRON_SECURITY_RULE__ID:
				return getId();
			case NeutronPackage.NEUTRON_SECURITY_RULE__DIRECTION:
				return getDirection();
			case NeutronPackage.NEUTRON_SECURITY_RULE__ETHERTYPE:
				return getEthertype();
			case NeutronPackage.NEUTRON_SECURITY_RULE__PORT_RANGE_MIN:
				return getPort_range_min();
			case NeutronPackage.NEUTRON_SECURITY_RULE__PORT_RANGE_MAX:
				return getPort_range_max();
			case NeutronPackage.NEUTRON_SECURITY_RULE__PROTOCOL:
				return getProtocol();
			case NeutronPackage.NEUTRON_SECURITY_RULE__REMOTE_GROUP_ID:
				return getRemote_group_id();
			case NeutronPackage.NEUTRON_SECURITY_RULE__REMOTE_IP_PREFIX:
				return getRemote_ip_prefix();
			case NeutronPackage.NEUTRON_SECURITY_RULE__SECURITY_GROUP_ID:
				return getSecurity_group_id();
			case NeutronPackage.NEUTRON_SECURITY_RULE__TENANT_ID:
				return getTenant_id();
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
			case NeutronPackage.NEUTRON_SECURITY_RULE__ID:
				setId((String)newValue);
				return;
			case NeutronPackage.NEUTRON_SECURITY_RULE__DIRECTION:
				setDirection((String)newValue);
				return;
			case NeutronPackage.NEUTRON_SECURITY_RULE__ETHERTYPE:
				setEthertype((String)newValue);
				return;
			case NeutronPackage.NEUTRON_SECURITY_RULE__PORT_RANGE_MIN:
				setPort_range_min((Integer)newValue);
				return;
			case NeutronPackage.NEUTRON_SECURITY_RULE__PORT_RANGE_MAX:
				setPort_range_max((Integer)newValue);
				return;
			case NeutronPackage.NEUTRON_SECURITY_RULE__PROTOCOL:
				setProtocol((String)newValue);
				return;
			case NeutronPackage.NEUTRON_SECURITY_RULE__REMOTE_GROUP_ID:
				setRemote_group_id((String)newValue);
				return;
			case NeutronPackage.NEUTRON_SECURITY_RULE__REMOTE_IP_PREFIX:
				setRemote_ip_prefix((String)newValue);
				return;
			case NeutronPackage.NEUTRON_SECURITY_RULE__SECURITY_GROUP_ID:
				setSecurity_group_id((String)newValue);
				return;
			case NeutronPackage.NEUTRON_SECURITY_RULE__TENANT_ID:
				setTenant_id((String)newValue);
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
			case NeutronPackage.NEUTRON_SECURITY_RULE__ID:
				setId(ID_EDEFAULT);
				return;
			case NeutronPackage.NEUTRON_SECURITY_RULE__DIRECTION:
				setDirection(DIRECTION_EDEFAULT);
				return;
			case NeutronPackage.NEUTRON_SECURITY_RULE__ETHERTYPE:
				setEthertype(ETHERTYPE_EDEFAULT);
				return;
			case NeutronPackage.NEUTRON_SECURITY_RULE__PORT_RANGE_MIN:
				setPort_range_min(PORT_RANGE_MIN_EDEFAULT);
				return;
			case NeutronPackage.NEUTRON_SECURITY_RULE__PORT_RANGE_MAX:
				setPort_range_max(PORT_RANGE_MAX_EDEFAULT);
				return;
			case NeutronPackage.NEUTRON_SECURITY_RULE__PROTOCOL:
				setProtocol(PROTOCOL_EDEFAULT);
				return;
			case NeutronPackage.NEUTRON_SECURITY_RULE__REMOTE_GROUP_ID:
				setRemote_group_id(REMOTE_GROUP_ID_EDEFAULT);
				return;
			case NeutronPackage.NEUTRON_SECURITY_RULE__REMOTE_IP_PREFIX:
				setRemote_ip_prefix(REMOTE_IP_PREFIX_EDEFAULT);
				return;
			case NeutronPackage.NEUTRON_SECURITY_RULE__SECURITY_GROUP_ID:
				setSecurity_group_id(SECURITY_GROUP_ID_EDEFAULT);
				return;
			case NeutronPackage.NEUTRON_SECURITY_RULE__TENANT_ID:
				setTenant_id(TENANT_ID_EDEFAULT);
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
			case NeutronPackage.NEUTRON_SECURITY_RULE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case NeutronPackage.NEUTRON_SECURITY_RULE__DIRECTION:
				return DIRECTION_EDEFAULT == null ? direction != null : !DIRECTION_EDEFAULT.equals(direction);
			case NeutronPackage.NEUTRON_SECURITY_RULE__ETHERTYPE:
				return ETHERTYPE_EDEFAULT == null ? ethertype != null : !ETHERTYPE_EDEFAULT.equals(ethertype);
			case NeutronPackage.NEUTRON_SECURITY_RULE__PORT_RANGE_MIN:
				return PORT_RANGE_MIN_EDEFAULT == null ? port_range_min != null : !PORT_RANGE_MIN_EDEFAULT.equals(port_range_min);
			case NeutronPackage.NEUTRON_SECURITY_RULE__PORT_RANGE_MAX:
				return PORT_RANGE_MAX_EDEFAULT == null ? port_range_max != null : !PORT_RANGE_MAX_EDEFAULT.equals(port_range_max);
			case NeutronPackage.NEUTRON_SECURITY_RULE__PROTOCOL:
				return PROTOCOL_EDEFAULT == null ? protocol != null : !PROTOCOL_EDEFAULT.equals(protocol);
			case NeutronPackage.NEUTRON_SECURITY_RULE__REMOTE_GROUP_ID:
				return REMOTE_GROUP_ID_EDEFAULT == null ? remote_group_id != null : !REMOTE_GROUP_ID_EDEFAULT.equals(remote_group_id);
			case NeutronPackage.NEUTRON_SECURITY_RULE__REMOTE_IP_PREFIX:
				return REMOTE_IP_PREFIX_EDEFAULT == null ? remote_ip_prefix != null : !REMOTE_IP_PREFIX_EDEFAULT.equals(remote_ip_prefix);
			case NeutronPackage.NEUTRON_SECURITY_RULE__SECURITY_GROUP_ID:
				return SECURITY_GROUP_ID_EDEFAULT == null ? security_group_id != null : !SECURITY_GROUP_ID_EDEFAULT.equals(security_group_id);
			case NeutronPackage.NEUTRON_SECURITY_RULE__TENANT_ID:
				return TENANT_ID_EDEFAULT == null ? tenant_id != null : !TENANT_ID_EDEFAULT.equals(tenant_id);
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
		result.append(", direction: ");
		result.append(direction);
		result.append(", ethertype: ");
		result.append(ethertype);
		result.append(", port_range_min: ");
		result.append(port_range_min);
		result.append(", port_range_max: ");
		result.append(port_range_max);
		result.append(", protocol: ");
		result.append(protocol);
		result.append(", remote_group_id: ");
		result.append(remote_group_id);
		result.append(", remote_ip_prefix: ");
		result.append(remote_ip_prefix);
		result.append(", security_group_id: ");
		result.append(security_group_id);
		result.append(", tenant_id: ");
		result.append(tenant_id);
		result.append(')');
		return result.toString();
	}

} //NeutronSecurityRuleImpl
