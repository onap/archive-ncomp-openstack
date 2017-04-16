
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

import org.openecomp.ncomp.openstack.neutron.NeutronFloatingIp;
import org.openecomp.ncomp.openstack.neutron.NeutronPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Floating Ip</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.NeutronFloatingIpImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.NeutronFloatingIpImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.NeutronFloatingIpImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.NeutronFloatingIpImpl#getFloating_network_id <em>Floating network id</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.NeutronFloatingIpImpl#getRouter_id <em>Router id</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.NeutronFloatingIpImpl#getFixed_ip_address <em>Fixed ip address</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.NeutronFloatingIpImpl#getFloating_ip_address <em>Floating ip address</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.NeutronFloatingIpImpl#getTenant_id <em>Tenant id</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.NeutronFloatingIpImpl#getPort_id <em>Port id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NeutronFloatingIpImpl extends NeutronObjectImpl implements NeutronFloatingIp {
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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected String status = STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getFloating_network_id() <em>Floating network id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloating_network_id()
	 * @generated
	 * @ordered
	 */
	protected static final String FLOATING_NETWORK_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFloating_network_id() <em>Floating network id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloating_network_id()
	 * @generated
	 * @ordered
	 */
	protected String floating_network_id = FLOATING_NETWORK_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getRouter_id() <em>Router id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouter_id()
	 * @generated
	 * @ordered
	 */
	protected static final String ROUTER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRouter_id() <em>Router id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouter_id()
	 * @generated
	 * @ordered
	 */
	protected String router_id = ROUTER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getFixed_ip_address() <em>Fixed ip address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixed_ip_address()
	 * @generated
	 * @ordered
	 */
	protected static final String FIXED_IP_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFixed_ip_address() <em>Fixed ip address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixed_ip_address()
	 * @generated
	 * @ordered
	 */
	protected String fixed_ip_address = FIXED_IP_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getFloating_ip_address() <em>Floating ip address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloating_ip_address()
	 * @generated
	 * @ordered
	 */
	protected static final String FLOATING_IP_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFloating_ip_address() <em>Floating ip address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloating_ip_address()
	 * @generated
	 * @ordered
	 */
	protected String floating_ip_address = FLOATING_IP_ADDRESS_EDEFAULT;

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
	 * The default value of the '{@link #getPort_id() <em>Port id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort_id()
	 * @generated
	 * @ordered
	 */
	protected static final String PORT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPort_id() <em>Port id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort_id()
	 * @generated
	 * @ordered
	 */
	protected String port_id = PORT_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NeutronFloatingIpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NeutronPackage.Literals.NEUTRON_FLOATING_IP;
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
			eNotify(new ENotificationImpl(this, Notification.SET, NeutronPackage.NEUTRON_FLOATING_IP__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NeutronPackage.NEUTRON_FLOATING_IP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(String newStatus) {
		String oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NeutronPackage.NEUTRON_FLOATING_IP__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFloating_network_id() {
		return floating_network_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFloating_network_id(String newFloating_network_id) {
		String oldFloating_network_id = floating_network_id;
		floating_network_id = newFloating_network_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NeutronPackage.NEUTRON_FLOATING_IP__FLOATING_NETWORK_ID, oldFloating_network_id, floating_network_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRouter_id() {
		return router_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRouter_id(String newRouter_id) {
		String oldRouter_id = router_id;
		router_id = newRouter_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NeutronPackage.NEUTRON_FLOATING_IP__ROUTER_ID, oldRouter_id, router_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFixed_ip_address() {
		return fixed_ip_address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFixed_ip_address(String newFixed_ip_address) {
		String oldFixed_ip_address = fixed_ip_address;
		fixed_ip_address = newFixed_ip_address;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NeutronPackage.NEUTRON_FLOATING_IP__FIXED_IP_ADDRESS, oldFixed_ip_address, fixed_ip_address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFloating_ip_address() {
		return floating_ip_address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFloating_ip_address(String newFloating_ip_address) {
		String oldFloating_ip_address = floating_ip_address;
		floating_ip_address = newFloating_ip_address;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NeutronPackage.NEUTRON_FLOATING_IP__FLOATING_IP_ADDRESS, oldFloating_ip_address, floating_ip_address));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NeutronPackage.NEUTRON_FLOATING_IP__TENANT_ID, oldTenant_id, tenant_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPort_id() {
		return port_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort_id(String newPort_id) {
		String oldPort_id = port_id;
		port_id = newPort_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NeutronPackage.NEUTRON_FLOATING_IP__PORT_ID, oldPort_id, port_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NeutronPackage.NEUTRON_FLOATING_IP__ID:
				return getId();
			case NeutronPackage.NEUTRON_FLOATING_IP__NAME:
				return getName();
			case NeutronPackage.NEUTRON_FLOATING_IP__STATUS:
				return getStatus();
			case NeutronPackage.NEUTRON_FLOATING_IP__FLOATING_NETWORK_ID:
				return getFloating_network_id();
			case NeutronPackage.NEUTRON_FLOATING_IP__ROUTER_ID:
				return getRouter_id();
			case NeutronPackage.NEUTRON_FLOATING_IP__FIXED_IP_ADDRESS:
				return getFixed_ip_address();
			case NeutronPackage.NEUTRON_FLOATING_IP__FLOATING_IP_ADDRESS:
				return getFloating_ip_address();
			case NeutronPackage.NEUTRON_FLOATING_IP__TENANT_ID:
				return getTenant_id();
			case NeutronPackage.NEUTRON_FLOATING_IP__PORT_ID:
				return getPort_id();
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
			case NeutronPackage.NEUTRON_FLOATING_IP__ID:
				setId((String)newValue);
				return;
			case NeutronPackage.NEUTRON_FLOATING_IP__NAME:
				setName((String)newValue);
				return;
			case NeutronPackage.NEUTRON_FLOATING_IP__STATUS:
				setStatus((String)newValue);
				return;
			case NeutronPackage.NEUTRON_FLOATING_IP__FLOATING_NETWORK_ID:
				setFloating_network_id((String)newValue);
				return;
			case NeutronPackage.NEUTRON_FLOATING_IP__ROUTER_ID:
				setRouter_id((String)newValue);
				return;
			case NeutronPackage.NEUTRON_FLOATING_IP__FIXED_IP_ADDRESS:
				setFixed_ip_address((String)newValue);
				return;
			case NeutronPackage.NEUTRON_FLOATING_IP__FLOATING_IP_ADDRESS:
				setFloating_ip_address((String)newValue);
				return;
			case NeutronPackage.NEUTRON_FLOATING_IP__TENANT_ID:
				setTenant_id((String)newValue);
				return;
			case NeutronPackage.NEUTRON_FLOATING_IP__PORT_ID:
				setPort_id((String)newValue);
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
			case NeutronPackage.NEUTRON_FLOATING_IP__ID:
				setId(ID_EDEFAULT);
				return;
			case NeutronPackage.NEUTRON_FLOATING_IP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case NeutronPackage.NEUTRON_FLOATING_IP__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case NeutronPackage.NEUTRON_FLOATING_IP__FLOATING_NETWORK_ID:
				setFloating_network_id(FLOATING_NETWORK_ID_EDEFAULT);
				return;
			case NeutronPackage.NEUTRON_FLOATING_IP__ROUTER_ID:
				setRouter_id(ROUTER_ID_EDEFAULT);
				return;
			case NeutronPackage.NEUTRON_FLOATING_IP__FIXED_IP_ADDRESS:
				setFixed_ip_address(FIXED_IP_ADDRESS_EDEFAULT);
				return;
			case NeutronPackage.NEUTRON_FLOATING_IP__FLOATING_IP_ADDRESS:
				setFloating_ip_address(FLOATING_IP_ADDRESS_EDEFAULT);
				return;
			case NeutronPackage.NEUTRON_FLOATING_IP__TENANT_ID:
				setTenant_id(TENANT_ID_EDEFAULT);
				return;
			case NeutronPackage.NEUTRON_FLOATING_IP__PORT_ID:
				setPort_id(PORT_ID_EDEFAULT);
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
			case NeutronPackage.NEUTRON_FLOATING_IP__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case NeutronPackage.NEUTRON_FLOATING_IP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case NeutronPackage.NEUTRON_FLOATING_IP__STATUS:
				return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
			case NeutronPackage.NEUTRON_FLOATING_IP__FLOATING_NETWORK_ID:
				return FLOATING_NETWORK_ID_EDEFAULT == null ? floating_network_id != null : !FLOATING_NETWORK_ID_EDEFAULT.equals(floating_network_id);
			case NeutronPackage.NEUTRON_FLOATING_IP__ROUTER_ID:
				return ROUTER_ID_EDEFAULT == null ? router_id != null : !ROUTER_ID_EDEFAULT.equals(router_id);
			case NeutronPackage.NEUTRON_FLOATING_IP__FIXED_IP_ADDRESS:
				return FIXED_IP_ADDRESS_EDEFAULT == null ? fixed_ip_address != null : !FIXED_IP_ADDRESS_EDEFAULT.equals(fixed_ip_address);
			case NeutronPackage.NEUTRON_FLOATING_IP__FLOATING_IP_ADDRESS:
				return FLOATING_IP_ADDRESS_EDEFAULT == null ? floating_ip_address != null : !FLOATING_IP_ADDRESS_EDEFAULT.equals(floating_ip_address);
			case NeutronPackage.NEUTRON_FLOATING_IP__TENANT_ID:
				return TENANT_ID_EDEFAULT == null ? tenant_id != null : !TENANT_ID_EDEFAULT.equals(tenant_id);
			case NeutronPackage.NEUTRON_FLOATING_IP__PORT_ID:
				return PORT_ID_EDEFAULT == null ? port_id != null : !PORT_ID_EDEFAULT.equals(port_id);
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
		result.append(", name: ");
		result.append(name);
		result.append(", status: ");
		result.append(status);
		result.append(", floating_network_id: ");
		result.append(floating_network_id);
		result.append(", router_id: ");
		result.append(router_id);
		result.append(", fixed_ip_address: ");
		result.append(fixed_ip_address);
		result.append(", floating_ip_address: ");
		result.append(floating_ip_address);
		result.append(", tenant_id: ");
		result.append(tenant_id);
		result.append(", port_id: ");
		result.append(port_id);
		result.append(')');
		return result.toString();
	}

} //NeutronFloatingIpImpl
