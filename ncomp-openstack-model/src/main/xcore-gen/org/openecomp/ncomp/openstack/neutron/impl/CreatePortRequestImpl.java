
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

import org.openecomp.ncomp.openstack.neutron.CreatePortRequest;
import org.openecomp.ncomp.openstack.neutron.FixedIp;
import org.openecomp.ncomp.openstack.neutron.NeutronPackage;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Create Port Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.CreatePortRequestImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.CreatePortRequestImpl#getBindingVnicType <em>Binding Vnic Type</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.CreatePortRequestImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.CreatePortRequestImpl#getAdmin_state_up <em>Admin state up</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.CreatePortRequestImpl#getFixed_ips <em>Fixed ips</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.CreatePortRequestImpl#getMac_address <em>Mac address</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.CreatePortRequestImpl#getNetwork_id <em>Network id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CreatePortRequestImpl extends NeutronRequestImpl implements CreatePortRequest {
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
	 * The default value of the '{@link #getBindingVnicType() <em>Binding Vnic Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindingVnicType()
	 * @generated
	 * @ordered
	 */
	protected static final String BINDING_VNIC_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBindingVnicType() <em>Binding Vnic Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindingVnicType()
	 * @generated
	 * @ordered
	 */
	protected String bindingVnicType = BINDING_VNIC_TYPE_EDEFAULT;

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
	 * The default value of the '{@link #getAdmin_state_up() <em>Admin state up</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdmin_state_up()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ADMIN_STATE_UP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdmin_state_up() <em>Admin state up</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdmin_state_up()
	 * @generated
	 * @ordered
	 */
	protected Boolean admin_state_up = ADMIN_STATE_UP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFixed_ips() <em>Fixed ips</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixed_ips()
	 * @generated
	 * @ordered
	 */
	protected EList<FixedIp> fixed_ips;

	/**
	 * The default value of the '{@link #getMac_address() <em>Mac address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMac_address()
	 * @generated
	 * @ordered
	 */
	protected static final String MAC_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMac_address() <em>Mac address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMac_address()
	 * @generated
	 * @ordered
	 */
	protected String mac_address = MAC_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNetwork_id() <em>Network id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetwork_id()
	 * @generated
	 * @ordered
	 */
	protected static final String NETWORK_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNetwork_id() <em>Network id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetwork_id()
	 * @generated
	 * @ordered
	 */
	protected String network_id = NETWORK_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreatePortRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NeutronPackage.Literals.CREATE_PORT_REQUEST;
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
			eNotify(new ENotificationImpl(this, Notification.SET, NeutronPackage.CREATE_PORT_REQUEST__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBindingVnicType() {
		return bindingVnicType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBindingVnicType(String newBindingVnicType) {
		String oldBindingVnicType = bindingVnicType;
		bindingVnicType = newBindingVnicType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NeutronPackage.CREATE_PORT_REQUEST__BINDING_VNIC_TYPE, oldBindingVnicType, bindingVnicType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NeutronPackage.CREATE_PORT_REQUEST__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getAdmin_state_up() {
		return admin_state_up;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdmin_state_up(Boolean newAdmin_state_up) {
		Boolean oldAdmin_state_up = admin_state_up;
		admin_state_up = newAdmin_state_up;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NeutronPackage.CREATE_PORT_REQUEST__ADMIN_STATE_UP, oldAdmin_state_up, admin_state_up));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FixedIp> getFixed_ips() {
		if (fixed_ips == null) {
			fixed_ips = new EObjectContainmentEList<FixedIp>(FixedIp.class, this, NeutronPackage.CREATE_PORT_REQUEST__FIXED_IPS);
		}
		return fixed_ips;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMac_address() {
		return mac_address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMac_address(String newMac_address) {
		String oldMac_address = mac_address;
		mac_address = newMac_address;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NeutronPackage.CREATE_PORT_REQUEST__MAC_ADDRESS, oldMac_address, mac_address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNetwork_id() {
		return network_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetwork_id(String newNetwork_id) {
		String oldNetwork_id = network_id;
		network_id = newNetwork_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NeutronPackage.CREATE_PORT_REQUEST__NETWORK_ID, oldNetwork_id, network_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NeutronPackage.CREATE_PORT_REQUEST__FIXED_IPS:
				return ((InternalEList<?>)getFixed_ips()).basicRemove(otherEnd, msgs);
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
			case NeutronPackage.CREATE_PORT_REQUEST__NAME:
				return getName();
			case NeutronPackage.CREATE_PORT_REQUEST__BINDING_VNIC_TYPE:
				return getBindingVnicType();
			case NeutronPackage.CREATE_PORT_REQUEST__STATUS:
				return getStatus();
			case NeutronPackage.CREATE_PORT_REQUEST__ADMIN_STATE_UP:
				return getAdmin_state_up();
			case NeutronPackage.CREATE_PORT_REQUEST__FIXED_IPS:
				return getFixed_ips();
			case NeutronPackage.CREATE_PORT_REQUEST__MAC_ADDRESS:
				return getMac_address();
			case NeutronPackage.CREATE_PORT_REQUEST__NETWORK_ID:
				return getNetwork_id();
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
			case NeutronPackage.CREATE_PORT_REQUEST__NAME:
				setName((String)newValue);
				return;
			case NeutronPackage.CREATE_PORT_REQUEST__BINDING_VNIC_TYPE:
				setBindingVnicType((String)newValue);
				return;
			case NeutronPackage.CREATE_PORT_REQUEST__STATUS:
				setStatus((String)newValue);
				return;
			case NeutronPackage.CREATE_PORT_REQUEST__ADMIN_STATE_UP:
				setAdmin_state_up((Boolean)newValue);
				return;
			case NeutronPackage.CREATE_PORT_REQUEST__FIXED_IPS:
				getFixed_ips().clear();
				getFixed_ips().addAll((Collection<? extends FixedIp>)newValue);
				return;
			case NeutronPackage.CREATE_PORT_REQUEST__MAC_ADDRESS:
				setMac_address((String)newValue);
				return;
			case NeutronPackage.CREATE_PORT_REQUEST__NETWORK_ID:
				setNetwork_id((String)newValue);
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
			case NeutronPackage.CREATE_PORT_REQUEST__NAME:
				setName(NAME_EDEFAULT);
				return;
			case NeutronPackage.CREATE_PORT_REQUEST__BINDING_VNIC_TYPE:
				setBindingVnicType(BINDING_VNIC_TYPE_EDEFAULT);
				return;
			case NeutronPackage.CREATE_PORT_REQUEST__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case NeutronPackage.CREATE_PORT_REQUEST__ADMIN_STATE_UP:
				setAdmin_state_up(ADMIN_STATE_UP_EDEFAULT);
				return;
			case NeutronPackage.CREATE_PORT_REQUEST__FIXED_IPS:
				getFixed_ips().clear();
				return;
			case NeutronPackage.CREATE_PORT_REQUEST__MAC_ADDRESS:
				setMac_address(MAC_ADDRESS_EDEFAULT);
				return;
			case NeutronPackage.CREATE_PORT_REQUEST__NETWORK_ID:
				setNetwork_id(NETWORK_ID_EDEFAULT);
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
			case NeutronPackage.CREATE_PORT_REQUEST__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case NeutronPackage.CREATE_PORT_REQUEST__BINDING_VNIC_TYPE:
				return BINDING_VNIC_TYPE_EDEFAULT == null ? bindingVnicType != null : !BINDING_VNIC_TYPE_EDEFAULT.equals(bindingVnicType);
			case NeutronPackage.CREATE_PORT_REQUEST__STATUS:
				return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
			case NeutronPackage.CREATE_PORT_REQUEST__ADMIN_STATE_UP:
				return ADMIN_STATE_UP_EDEFAULT == null ? admin_state_up != null : !ADMIN_STATE_UP_EDEFAULT.equals(admin_state_up);
			case NeutronPackage.CREATE_PORT_REQUEST__FIXED_IPS:
				return fixed_ips != null && !fixed_ips.isEmpty();
			case NeutronPackage.CREATE_PORT_REQUEST__MAC_ADDRESS:
				return MAC_ADDRESS_EDEFAULT == null ? mac_address != null : !MAC_ADDRESS_EDEFAULT.equals(mac_address);
			case NeutronPackage.CREATE_PORT_REQUEST__NETWORK_ID:
				return NETWORK_ID_EDEFAULT == null ? network_id != null : !NETWORK_ID_EDEFAULT.equals(network_id);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", bindingVnicType: ");
		result.append(bindingVnicType);
		result.append(", status: ");
		result.append(status);
		result.append(", admin_state_up: ");
		result.append(admin_state_up);
		result.append(", mac_address: ");
		result.append(mac_address);
		result.append(", network_id: ");
		result.append(network_id);
		result.append(')');
		return result.toString();
	}

} //CreatePortRequestImpl
