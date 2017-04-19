
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
package org.openecomp.ncomp.openstack.core.impl;

import org.openecomp.ncomp.core.impl.NamedEntityImpl;

import org.openecomp.ncomp.openstack.core.CorePackage;
import org.openecomp.ncomp.openstack.core.SecurityRule;
import org.openecomp.ncomp.openstack.core.SecurityRuleProtocol;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Security Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.openstack.core.impl.SecurityRuleImpl#getPortRangeStart <em>Port Range Start</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.core.impl.SecurityRuleImpl#getPortRangeEnd <em>Port Range End</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.core.impl.SecurityRuleImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.core.impl.SecurityRuleImpl#getIpProtocol <em>Ip Protocol</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecurityRuleImpl extends NamedEntityImpl implements SecurityRule {
	/**
	 * The default value of the '{@link #getPortRangeStart() <em>Port Range Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortRangeStart()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PORT_RANGE_START_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPortRangeStart() <em>Port Range Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortRangeStart()
	 * @generated
	 * @ordered
	 */
	protected Integer portRangeStart = PORT_RANGE_START_EDEFAULT;

	/**
	 * The default value of the '{@link #getPortRangeEnd() <em>Port Range End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortRangeEnd()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PORT_RANGE_END_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPortRangeEnd() <em>Port Range End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortRangeEnd()
	 * @generated
	 * @ordered
	 */
	protected Integer portRangeEnd = PORT_RANGE_END_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String PREFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected String prefix = PREFIX_EDEFAULT;

	/**
	 * The default value of the '{@link #getIpProtocol() <em>Ip Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIpProtocol()
	 * @generated
	 * @ordered
	 */
	protected static final SecurityRuleProtocol IP_PROTOCOL_EDEFAULT = SecurityRuleProtocol.NONE;

	/**
	 * The cached value of the '{@link #getIpProtocol() <em>Ip Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIpProtocol()
	 * @generated
	 * @ordered
	 */
	protected SecurityRuleProtocol ipProtocol = IP_PROTOCOL_EDEFAULT;

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
		return CorePackage.Literals.SECURITY_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getPortRangeStart() {
		return portRangeStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortRangeStart(Integer newPortRangeStart) {
		Integer oldPortRangeStart = portRangeStart;
		portRangeStart = newPortRangeStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SECURITY_RULE__PORT_RANGE_START, oldPortRangeStart, portRangeStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getPortRangeEnd() {
		return portRangeEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortRangeEnd(Integer newPortRangeEnd) {
		Integer oldPortRangeEnd = portRangeEnd;
		portRangeEnd = newPortRangeEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SECURITY_RULE__PORT_RANGE_END, oldPortRangeEnd, portRangeEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrefix() {
		return prefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrefix(String newPrefix) {
		String oldPrefix = prefix;
		prefix = newPrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SECURITY_RULE__PREFIX, oldPrefix, prefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityRuleProtocol getIpProtocol() {
		return ipProtocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIpProtocol(SecurityRuleProtocol newIpProtocol) {
		SecurityRuleProtocol oldIpProtocol = ipProtocol;
		ipProtocol = newIpProtocol == null ? IP_PROTOCOL_EDEFAULT : newIpProtocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SECURITY_RULE__IP_PROTOCOL, oldIpProtocol, ipProtocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.SECURITY_RULE__PORT_RANGE_START:
				return getPortRangeStart();
			case CorePackage.SECURITY_RULE__PORT_RANGE_END:
				return getPortRangeEnd();
			case CorePackage.SECURITY_RULE__PREFIX:
				return getPrefix();
			case CorePackage.SECURITY_RULE__IP_PROTOCOL:
				return getIpProtocol();
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
			case CorePackage.SECURITY_RULE__PORT_RANGE_START:
				setPortRangeStart((Integer)newValue);
				return;
			case CorePackage.SECURITY_RULE__PORT_RANGE_END:
				setPortRangeEnd((Integer)newValue);
				return;
			case CorePackage.SECURITY_RULE__PREFIX:
				setPrefix((String)newValue);
				return;
			case CorePackage.SECURITY_RULE__IP_PROTOCOL:
				setIpProtocol((SecurityRuleProtocol)newValue);
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
			case CorePackage.SECURITY_RULE__PORT_RANGE_START:
				setPortRangeStart(PORT_RANGE_START_EDEFAULT);
				return;
			case CorePackage.SECURITY_RULE__PORT_RANGE_END:
				setPortRangeEnd(PORT_RANGE_END_EDEFAULT);
				return;
			case CorePackage.SECURITY_RULE__PREFIX:
				setPrefix(PREFIX_EDEFAULT);
				return;
			case CorePackage.SECURITY_RULE__IP_PROTOCOL:
				setIpProtocol(IP_PROTOCOL_EDEFAULT);
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
			case CorePackage.SECURITY_RULE__PORT_RANGE_START:
				return PORT_RANGE_START_EDEFAULT == null ? portRangeStart != null : !PORT_RANGE_START_EDEFAULT.equals(portRangeStart);
			case CorePackage.SECURITY_RULE__PORT_RANGE_END:
				return PORT_RANGE_END_EDEFAULT == null ? portRangeEnd != null : !PORT_RANGE_END_EDEFAULT.equals(portRangeEnd);
			case CorePackage.SECURITY_RULE__PREFIX:
				return PREFIX_EDEFAULT == null ? prefix != null : !PREFIX_EDEFAULT.equals(prefix);
			case CorePackage.SECURITY_RULE__IP_PROTOCOL:
				return ipProtocol != IP_PROTOCOL_EDEFAULT;
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
		result.append(" (portRangeStart: ");
		result.append(portRangeStart);
		result.append(", portRangeEnd: ");
		result.append(portRangeEnd);
		result.append(", prefix: ");
		result.append(prefix);
		result.append(", ipProtocol: ");
		result.append(ipProtocol);
		result.append(')');
		return result.toString();
	}

} //SecurityRuleImpl
