
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

import org.openecomp.ncomp.openstack.neutron.ExternalGateway;
import org.openecomp.ncomp.openstack.neutron.NeutronPackage;
import org.openecomp.ncomp.openstack.neutron.Router;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Router</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.RouterImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.RouterImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.RouterImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.RouterImpl#getAdmin_state_up <em>Admin state up</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.RouterImpl#getExternal_gateway_info <em>External gateway info</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.RouterImpl#getTenant_id <em>Tenant id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RouterImpl extends NeutronObjectImpl implements Router {
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
	 * The cached value of the '{@link #getExternal_gateway_info() <em>External gateway info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternal_gateway_info()
	 * @generated
	 * @ordered
	 */
	protected ExternalGateway external_gateway_info;

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
	protected RouterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NeutronPackage.Literals.ROUTER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, NeutronPackage.ROUTER__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NeutronPackage.ROUTER__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NeutronPackage.ROUTER__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NeutronPackage.ROUTER__ADMIN_STATE_UP, oldAdmin_state_up, admin_state_up));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalGateway getExternal_gateway_info() {
		return external_gateway_info;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExternal_gateway_info(ExternalGateway newExternal_gateway_info, NotificationChain msgs) {
		ExternalGateway oldExternal_gateway_info = external_gateway_info;
		external_gateway_info = newExternal_gateway_info;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NeutronPackage.ROUTER__EXTERNAL_GATEWAY_INFO, oldExternal_gateway_info, newExternal_gateway_info);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExternal_gateway_info(ExternalGateway newExternal_gateway_info) {
		if (newExternal_gateway_info != external_gateway_info) {
			NotificationChain msgs = null;
			if (external_gateway_info != null)
				msgs = ((InternalEObject)external_gateway_info).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NeutronPackage.ROUTER__EXTERNAL_GATEWAY_INFO, null, msgs);
			if (newExternal_gateway_info != null)
				msgs = ((InternalEObject)newExternal_gateway_info).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NeutronPackage.ROUTER__EXTERNAL_GATEWAY_INFO, null, msgs);
			msgs = basicSetExternal_gateway_info(newExternal_gateway_info, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NeutronPackage.ROUTER__EXTERNAL_GATEWAY_INFO, newExternal_gateway_info, newExternal_gateway_info));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NeutronPackage.ROUTER__TENANT_ID, oldTenant_id, tenant_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NeutronPackage.ROUTER__EXTERNAL_GATEWAY_INFO:
				return basicSetExternal_gateway_info(null, msgs);
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
			case NeutronPackage.ROUTER__ID:
				return getId();
			case NeutronPackage.ROUTER__NAME:
				return getName();
			case NeutronPackage.ROUTER__STATUS:
				return getStatus();
			case NeutronPackage.ROUTER__ADMIN_STATE_UP:
				return getAdmin_state_up();
			case NeutronPackage.ROUTER__EXTERNAL_GATEWAY_INFO:
				return getExternal_gateway_info();
			case NeutronPackage.ROUTER__TENANT_ID:
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
			case NeutronPackage.ROUTER__ID:
				setId((String)newValue);
				return;
			case NeutronPackage.ROUTER__NAME:
				setName((String)newValue);
				return;
			case NeutronPackage.ROUTER__STATUS:
				setStatus((String)newValue);
				return;
			case NeutronPackage.ROUTER__ADMIN_STATE_UP:
				setAdmin_state_up((Boolean)newValue);
				return;
			case NeutronPackage.ROUTER__EXTERNAL_GATEWAY_INFO:
				setExternal_gateway_info((ExternalGateway)newValue);
				return;
			case NeutronPackage.ROUTER__TENANT_ID:
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
			case NeutronPackage.ROUTER__ID:
				setId(ID_EDEFAULT);
				return;
			case NeutronPackage.ROUTER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case NeutronPackage.ROUTER__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case NeutronPackage.ROUTER__ADMIN_STATE_UP:
				setAdmin_state_up(ADMIN_STATE_UP_EDEFAULT);
				return;
			case NeutronPackage.ROUTER__EXTERNAL_GATEWAY_INFO:
				setExternal_gateway_info((ExternalGateway)null);
				return;
			case NeutronPackage.ROUTER__TENANT_ID:
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
			case NeutronPackage.ROUTER__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case NeutronPackage.ROUTER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case NeutronPackage.ROUTER__STATUS:
				return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
			case NeutronPackage.ROUTER__ADMIN_STATE_UP:
				return ADMIN_STATE_UP_EDEFAULT == null ? admin_state_up != null : !ADMIN_STATE_UP_EDEFAULT.equals(admin_state_up);
			case NeutronPackage.ROUTER__EXTERNAL_GATEWAY_INFO:
				return external_gateway_info != null;
			case NeutronPackage.ROUTER__TENANT_ID:
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
		result.append(", name: ");
		result.append(name);
		result.append(", status: ");
		result.append(status);
		result.append(", admin_state_up: ");
		result.append(admin_state_up);
		result.append(", tenant_id: ");
		result.append(tenant_id);
		result.append(')');
		return result.toString();
	}

} //RouterImpl
