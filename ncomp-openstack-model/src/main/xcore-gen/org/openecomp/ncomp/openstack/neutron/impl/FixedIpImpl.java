
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

import org.openecomp.ncomp.openstack.neutron.FixedIp;
import org.openecomp.ncomp.openstack.neutron.NeutronPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fixed Ip</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.FixedIpImpl#getIp_address <em>Ip address</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.FixedIpImpl#getSubnet_id <em>Subnet id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FixedIpImpl extends MinimalEObjectImpl.Container implements FixedIp {
	/**
	 * The default value of the '{@link #getIp_address() <em>Ip address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIp_address()
	 * @generated
	 * @ordered
	 */
	protected static final String IP_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIp_address() <em>Ip address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIp_address()
	 * @generated
	 * @ordered
	 */
	protected String ip_address = IP_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubnet_id() <em>Subnet id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubnet_id()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBNET_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubnet_id() <em>Subnet id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubnet_id()
	 * @generated
	 * @ordered
	 */
	protected String subnet_id = SUBNET_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FixedIpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NeutronPackage.Literals.FIXED_IP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIp_address() {
		return ip_address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIp_address(String newIp_address) {
		String oldIp_address = ip_address;
		ip_address = newIp_address;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NeutronPackage.FIXED_IP__IP_ADDRESS, oldIp_address, ip_address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubnet_id() {
		return subnet_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubnet_id(String newSubnet_id) {
		String oldSubnet_id = subnet_id;
		subnet_id = newSubnet_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NeutronPackage.FIXED_IP__SUBNET_ID, oldSubnet_id, subnet_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NeutronPackage.FIXED_IP__IP_ADDRESS:
				return getIp_address();
			case NeutronPackage.FIXED_IP__SUBNET_ID:
				return getSubnet_id();
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
			case NeutronPackage.FIXED_IP__IP_ADDRESS:
				setIp_address((String)newValue);
				return;
			case NeutronPackage.FIXED_IP__SUBNET_ID:
				setSubnet_id((String)newValue);
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
			case NeutronPackage.FIXED_IP__IP_ADDRESS:
				setIp_address(IP_ADDRESS_EDEFAULT);
				return;
			case NeutronPackage.FIXED_IP__SUBNET_ID:
				setSubnet_id(SUBNET_ID_EDEFAULT);
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
			case NeutronPackage.FIXED_IP__IP_ADDRESS:
				return IP_ADDRESS_EDEFAULT == null ? ip_address != null : !IP_ADDRESS_EDEFAULT.equals(ip_address);
			case NeutronPackage.FIXED_IP__SUBNET_ID:
				return SUBNET_ID_EDEFAULT == null ? subnet_id != null : !SUBNET_ID_EDEFAULT.equals(subnet_id);
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
		result.append(" (ip_address: ");
		result.append(ip_address);
		result.append(", subnet_id: ");
		result.append(subnet_id);
		result.append(')');
		return result.toString();
	}

} //FixedIpImpl
