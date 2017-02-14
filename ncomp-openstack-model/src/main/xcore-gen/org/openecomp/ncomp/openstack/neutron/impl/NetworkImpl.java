
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

import org.openecomp.ncomp.openstack.neutron.Network;
import org.openecomp.ncomp.openstack.neutron.NeutronPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Network</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.NetworkImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.NetworkImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.NetworkImpl#getAdmin_state_up <em>Admin state up</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.NetworkImpl#getProvider_network_type <em>Provider network type</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.NetworkImpl#getProvider_physical_network <em>Provider physical network</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.NetworkImpl#getProvider_segmentation_id <em>Provider segmentation id</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.NetworkImpl#getRouter_external <em>Router external</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.NetworkImpl#getShared <em>Shared</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.NetworkImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.NetworkImpl#getSubnets <em>Subnets</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.NetworkImpl#getTenant_id <em>Tenant id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NetworkImpl extends NeutronObjectImpl implements Network {
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
	 * The default value of the '{@link #getProvider_network_type() <em>Provider network type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvider_network_type()
	 * @generated
	 * @ordered
	 */
	protected static final String PROVIDER_NETWORK_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProvider_network_type() <em>Provider network type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvider_network_type()
	 * @generated
	 * @ordered
	 */
	protected String provider_network_type = PROVIDER_NETWORK_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getProvider_physical_network() <em>Provider physical network</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvider_physical_network()
	 * @generated
	 * @ordered
	 */
	protected static final String PROVIDER_PHYSICAL_NETWORK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProvider_physical_network() <em>Provider physical network</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvider_physical_network()
	 * @generated
	 * @ordered
	 */
	protected String provider_physical_network = PROVIDER_PHYSICAL_NETWORK_EDEFAULT;

	/**
	 * The default value of the '{@link #getProvider_segmentation_id() <em>Provider segmentation id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvider_segmentation_id()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PROVIDER_SEGMENTATION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProvider_segmentation_id() <em>Provider segmentation id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvider_segmentation_id()
	 * @generated
	 * @ordered
	 */
	protected Integer provider_segmentation_id = PROVIDER_SEGMENTATION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getRouter_external() <em>Router external</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouter_external()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ROUTER_EXTERNAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRouter_external() <em>Router external</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouter_external()
	 * @generated
	 * @ordered
	 */
	protected Boolean router_external = ROUTER_EXTERNAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getShared() <em>Shared</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShared()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SHARED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShared() <em>Shared</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShared()
	 * @generated
	 * @ordered
	 */
	protected Boolean shared = SHARED_EDEFAULT;

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
	 * The cached value of the '{@link #getSubnets() <em>Subnets</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubnets()
	 * @generated
	 * @ordered
	 */
	protected EList<String> subnets;

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
	protected NetworkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NeutronPackage.Literals.NETWORK;
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
			eNotify(new ENotificationImpl(this, Notification.SET, NeutronPackage.NETWORK__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NeutronPackage.NETWORK__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NeutronPackage.NETWORK__ADMIN_STATE_UP, oldAdmin_state_up, admin_state_up));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProvider_network_type() {
		return provider_network_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvider_network_type(String newProvider_network_type) {
		String oldProvider_network_type = provider_network_type;
		provider_network_type = newProvider_network_type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NeutronPackage.NETWORK__PROVIDER_NETWORK_TYPE, oldProvider_network_type, provider_network_type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProvider_physical_network() {
		return provider_physical_network;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvider_physical_network(String newProvider_physical_network) {
		String oldProvider_physical_network = provider_physical_network;
		provider_physical_network = newProvider_physical_network;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NeutronPackage.NETWORK__PROVIDER_PHYSICAL_NETWORK, oldProvider_physical_network, provider_physical_network));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getProvider_segmentation_id() {
		return provider_segmentation_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvider_segmentation_id(Integer newProvider_segmentation_id) {
		Integer oldProvider_segmentation_id = provider_segmentation_id;
		provider_segmentation_id = newProvider_segmentation_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NeutronPackage.NETWORK__PROVIDER_SEGMENTATION_ID, oldProvider_segmentation_id, provider_segmentation_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getRouter_external() {
		return router_external;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRouter_external(Boolean newRouter_external) {
		Boolean oldRouter_external = router_external;
		router_external = newRouter_external;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NeutronPackage.NETWORK__ROUTER_EXTERNAL, oldRouter_external, router_external));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getShared() {
		return shared;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShared(Boolean newShared) {
		Boolean oldShared = shared;
		shared = newShared;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NeutronPackage.NETWORK__SHARED, oldShared, shared));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NeutronPackage.NETWORK__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getSubnets() {
		if (subnets == null) {
			subnets = new EDataTypeEList<String>(String.class, this, NeutronPackage.NETWORK__SUBNETS);
		}
		return subnets;
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
			eNotify(new ENotificationImpl(this, Notification.SET, NeutronPackage.NETWORK__TENANT_ID, oldTenant_id, tenant_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NeutronPackage.NETWORK__ID:
				return getId();
			case NeutronPackage.NETWORK__NAME:
				return getName();
			case NeutronPackage.NETWORK__ADMIN_STATE_UP:
				return getAdmin_state_up();
			case NeutronPackage.NETWORK__PROVIDER_NETWORK_TYPE:
				return getProvider_network_type();
			case NeutronPackage.NETWORK__PROVIDER_PHYSICAL_NETWORK:
				return getProvider_physical_network();
			case NeutronPackage.NETWORK__PROVIDER_SEGMENTATION_ID:
				return getProvider_segmentation_id();
			case NeutronPackage.NETWORK__ROUTER_EXTERNAL:
				return getRouter_external();
			case NeutronPackage.NETWORK__SHARED:
				return getShared();
			case NeutronPackage.NETWORK__STATUS:
				return getStatus();
			case NeutronPackage.NETWORK__SUBNETS:
				return getSubnets();
			case NeutronPackage.NETWORK__TENANT_ID:
				return getTenant_id();
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
			case NeutronPackage.NETWORK__ID:
				setId((String)newValue);
				return;
			case NeutronPackage.NETWORK__NAME:
				setName((String)newValue);
				return;
			case NeutronPackage.NETWORK__ADMIN_STATE_UP:
				setAdmin_state_up((Boolean)newValue);
				return;
			case NeutronPackage.NETWORK__PROVIDER_NETWORK_TYPE:
				setProvider_network_type((String)newValue);
				return;
			case NeutronPackage.NETWORK__PROVIDER_PHYSICAL_NETWORK:
				setProvider_physical_network((String)newValue);
				return;
			case NeutronPackage.NETWORK__PROVIDER_SEGMENTATION_ID:
				setProvider_segmentation_id((Integer)newValue);
				return;
			case NeutronPackage.NETWORK__ROUTER_EXTERNAL:
				setRouter_external((Boolean)newValue);
				return;
			case NeutronPackage.NETWORK__SHARED:
				setShared((Boolean)newValue);
				return;
			case NeutronPackage.NETWORK__STATUS:
				setStatus((String)newValue);
				return;
			case NeutronPackage.NETWORK__SUBNETS:
				getSubnets().clear();
				getSubnets().addAll((Collection<? extends String>)newValue);
				return;
			case NeutronPackage.NETWORK__TENANT_ID:
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
			case NeutronPackage.NETWORK__ID:
				setId(ID_EDEFAULT);
				return;
			case NeutronPackage.NETWORK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case NeutronPackage.NETWORK__ADMIN_STATE_UP:
				setAdmin_state_up(ADMIN_STATE_UP_EDEFAULT);
				return;
			case NeutronPackage.NETWORK__PROVIDER_NETWORK_TYPE:
				setProvider_network_type(PROVIDER_NETWORK_TYPE_EDEFAULT);
				return;
			case NeutronPackage.NETWORK__PROVIDER_PHYSICAL_NETWORK:
				setProvider_physical_network(PROVIDER_PHYSICAL_NETWORK_EDEFAULT);
				return;
			case NeutronPackage.NETWORK__PROVIDER_SEGMENTATION_ID:
				setProvider_segmentation_id(PROVIDER_SEGMENTATION_ID_EDEFAULT);
				return;
			case NeutronPackage.NETWORK__ROUTER_EXTERNAL:
				setRouter_external(ROUTER_EXTERNAL_EDEFAULT);
				return;
			case NeutronPackage.NETWORK__SHARED:
				setShared(SHARED_EDEFAULT);
				return;
			case NeutronPackage.NETWORK__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case NeutronPackage.NETWORK__SUBNETS:
				getSubnets().clear();
				return;
			case NeutronPackage.NETWORK__TENANT_ID:
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
			case NeutronPackage.NETWORK__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case NeutronPackage.NETWORK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case NeutronPackage.NETWORK__ADMIN_STATE_UP:
				return ADMIN_STATE_UP_EDEFAULT == null ? admin_state_up != null : !ADMIN_STATE_UP_EDEFAULT.equals(admin_state_up);
			case NeutronPackage.NETWORK__PROVIDER_NETWORK_TYPE:
				return PROVIDER_NETWORK_TYPE_EDEFAULT == null ? provider_network_type != null : !PROVIDER_NETWORK_TYPE_EDEFAULT.equals(provider_network_type);
			case NeutronPackage.NETWORK__PROVIDER_PHYSICAL_NETWORK:
				return PROVIDER_PHYSICAL_NETWORK_EDEFAULT == null ? provider_physical_network != null : !PROVIDER_PHYSICAL_NETWORK_EDEFAULT.equals(provider_physical_network);
			case NeutronPackage.NETWORK__PROVIDER_SEGMENTATION_ID:
				return PROVIDER_SEGMENTATION_ID_EDEFAULT == null ? provider_segmentation_id != null : !PROVIDER_SEGMENTATION_ID_EDEFAULT.equals(provider_segmentation_id);
			case NeutronPackage.NETWORK__ROUTER_EXTERNAL:
				return ROUTER_EXTERNAL_EDEFAULT == null ? router_external != null : !ROUTER_EXTERNAL_EDEFAULT.equals(router_external);
			case NeutronPackage.NETWORK__SHARED:
				return SHARED_EDEFAULT == null ? shared != null : !SHARED_EDEFAULT.equals(shared);
			case NeutronPackage.NETWORK__STATUS:
				return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
			case NeutronPackage.NETWORK__SUBNETS:
				return subnets != null && !subnets.isEmpty();
			case NeutronPackage.NETWORK__TENANT_ID:
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
		result.append(", admin_state_up: ");
		result.append(admin_state_up);
		result.append(", provider_network_type: ");
		result.append(provider_network_type);
		result.append(", provider_physical_network: ");
		result.append(provider_physical_network);
		result.append(", provider_segmentation_id: ");
		result.append(provider_segmentation_id);
		result.append(", router_external: ");
		result.append(router_external);
		result.append(", shared: ");
		result.append(shared);
		result.append(", status: ");
		result.append(status);
		result.append(", subnets: ");
		result.append(subnets);
		result.append(", tenant_id: ");
		result.append(tenant_id);
		result.append(')');
		return result.toString();
	}

} //NetworkImpl
