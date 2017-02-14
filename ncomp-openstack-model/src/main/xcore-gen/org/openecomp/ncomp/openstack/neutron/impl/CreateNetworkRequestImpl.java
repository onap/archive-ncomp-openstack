
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

import org.openecomp.ncomp.openstack.neutron.CreateNetworkRequest;
import org.openecomp.ncomp.openstack.neutron.NeutronPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Create Network Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.CreateNetworkRequestImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.CreateNetworkRequestImpl#getProviderNetworkType <em>Provider Network Type</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.CreateNetworkRequestImpl#getProviderPhysicalNetwork <em>Provider Physical Network</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.CreateNetworkRequestImpl#getProviderSegmentationId <em>Provider Segmentation Id</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.CreateNetworkRequestImpl#getAdmin_state_up <em>Admin state up</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.CreateNetworkRequestImpl#getShared <em>Shared</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CreateNetworkRequestImpl extends NeutronRequestImpl implements CreateNetworkRequest {
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
	 * The default value of the '{@link #getProviderNetworkType() <em>Provider Network Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviderNetworkType()
	 * @generated
	 * @ordered
	 */
	protected static final String PROVIDER_NETWORK_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProviderNetworkType() <em>Provider Network Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviderNetworkType()
	 * @generated
	 * @ordered
	 */
	protected String providerNetworkType = PROVIDER_NETWORK_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getProviderPhysicalNetwork() <em>Provider Physical Network</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviderPhysicalNetwork()
	 * @generated
	 * @ordered
	 */
	protected static final String PROVIDER_PHYSICAL_NETWORK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProviderPhysicalNetwork() <em>Provider Physical Network</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviderPhysicalNetwork()
	 * @generated
	 * @ordered
	 */
	protected String providerPhysicalNetwork = PROVIDER_PHYSICAL_NETWORK_EDEFAULT;

	/**
	 * The default value of the '{@link #getProviderSegmentationId() <em>Provider Segmentation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviderSegmentationId()
	 * @generated
	 * @ordered
	 */
	protected static final int PROVIDER_SEGMENTATION_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getProviderSegmentationId() <em>Provider Segmentation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviderSegmentationId()
	 * @generated
	 * @ordered
	 */
	protected int providerSegmentationId = PROVIDER_SEGMENTATION_ID_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreateNetworkRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NeutronPackage.Literals.CREATE_NETWORK_REQUEST;
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
			eNotify(new ENotificationImpl(this, Notification.SET, NeutronPackage.CREATE_NETWORK_REQUEST__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProviderNetworkType() {
		return providerNetworkType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProviderNetworkType(String newProviderNetworkType) {
		String oldProviderNetworkType = providerNetworkType;
		providerNetworkType = newProviderNetworkType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NeutronPackage.CREATE_NETWORK_REQUEST__PROVIDER_NETWORK_TYPE, oldProviderNetworkType, providerNetworkType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProviderPhysicalNetwork() {
		return providerPhysicalNetwork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProviderPhysicalNetwork(String newProviderPhysicalNetwork) {
		String oldProviderPhysicalNetwork = providerPhysicalNetwork;
		providerPhysicalNetwork = newProviderPhysicalNetwork;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NeutronPackage.CREATE_NETWORK_REQUEST__PROVIDER_PHYSICAL_NETWORK, oldProviderPhysicalNetwork, providerPhysicalNetwork));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getProviderSegmentationId() {
		return providerSegmentationId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProviderSegmentationId(int newProviderSegmentationId) {
		int oldProviderSegmentationId = providerSegmentationId;
		providerSegmentationId = newProviderSegmentationId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NeutronPackage.CREATE_NETWORK_REQUEST__PROVIDER_SEGMENTATION_ID, oldProviderSegmentationId, providerSegmentationId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NeutronPackage.CREATE_NETWORK_REQUEST__ADMIN_STATE_UP, oldAdmin_state_up, admin_state_up));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NeutronPackage.CREATE_NETWORK_REQUEST__SHARED, oldShared, shared));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NeutronPackage.CREATE_NETWORK_REQUEST__NAME:
				return getName();
			case NeutronPackage.CREATE_NETWORK_REQUEST__PROVIDER_NETWORK_TYPE:
				return getProviderNetworkType();
			case NeutronPackage.CREATE_NETWORK_REQUEST__PROVIDER_PHYSICAL_NETWORK:
				return getProviderPhysicalNetwork();
			case NeutronPackage.CREATE_NETWORK_REQUEST__PROVIDER_SEGMENTATION_ID:
				return getProviderSegmentationId();
			case NeutronPackage.CREATE_NETWORK_REQUEST__ADMIN_STATE_UP:
				return getAdmin_state_up();
			case NeutronPackage.CREATE_NETWORK_REQUEST__SHARED:
				return getShared();
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
			case NeutronPackage.CREATE_NETWORK_REQUEST__NAME:
				setName((String)newValue);
				return;
			case NeutronPackage.CREATE_NETWORK_REQUEST__PROVIDER_NETWORK_TYPE:
				setProviderNetworkType((String)newValue);
				return;
			case NeutronPackage.CREATE_NETWORK_REQUEST__PROVIDER_PHYSICAL_NETWORK:
				setProviderPhysicalNetwork((String)newValue);
				return;
			case NeutronPackage.CREATE_NETWORK_REQUEST__PROVIDER_SEGMENTATION_ID:
				setProviderSegmentationId((Integer)newValue);
				return;
			case NeutronPackage.CREATE_NETWORK_REQUEST__ADMIN_STATE_UP:
				setAdmin_state_up((Boolean)newValue);
				return;
			case NeutronPackage.CREATE_NETWORK_REQUEST__SHARED:
				setShared((Boolean)newValue);
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
			case NeutronPackage.CREATE_NETWORK_REQUEST__NAME:
				setName(NAME_EDEFAULT);
				return;
			case NeutronPackage.CREATE_NETWORK_REQUEST__PROVIDER_NETWORK_TYPE:
				setProviderNetworkType(PROVIDER_NETWORK_TYPE_EDEFAULT);
				return;
			case NeutronPackage.CREATE_NETWORK_REQUEST__PROVIDER_PHYSICAL_NETWORK:
				setProviderPhysicalNetwork(PROVIDER_PHYSICAL_NETWORK_EDEFAULT);
				return;
			case NeutronPackage.CREATE_NETWORK_REQUEST__PROVIDER_SEGMENTATION_ID:
				setProviderSegmentationId(PROVIDER_SEGMENTATION_ID_EDEFAULT);
				return;
			case NeutronPackage.CREATE_NETWORK_REQUEST__ADMIN_STATE_UP:
				setAdmin_state_up(ADMIN_STATE_UP_EDEFAULT);
				return;
			case NeutronPackage.CREATE_NETWORK_REQUEST__SHARED:
				setShared(SHARED_EDEFAULT);
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
			case NeutronPackage.CREATE_NETWORK_REQUEST__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case NeutronPackage.CREATE_NETWORK_REQUEST__PROVIDER_NETWORK_TYPE:
				return PROVIDER_NETWORK_TYPE_EDEFAULT == null ? providerNetworkType != null : !PROVIDER_NETWORK_TYPE_EDEFAULT.equals(providerNetworkType);
			case NeutronPackage.CREATE_NETWORK_REQUEST__PROVIDER_PHYSICAL_NETWORK:
				return PROVIDER_PHYSICAL_NETWORK_EDEFAULT == null ? providerPhysicalNetwork != null : !PROVIDER_PHYSICAL_NETWORK_EDEFAULT.equals(providerPhysicalNetwork);
			case NeutronPackage.CREATE_NETWORK_REQUEST__PROVIDER_SEGMENTATION_ID:
				return providerSegmentationId != PROVIDER_SEGMENTATION_ID_EDEFAULT;
			case NeutronPackage.CREATE_NETWORK_REQUEST__ADMIN_STATE_UP:
				return ADMIN_STATE_UP_EDEFAULT == null ? admin_state_up != null : !ADMIN_STATE_UP_EDEFAULT.equals(admin_state_up);
			case NeutronPackage.CREATE_NETWORK_REQUEST__SHARED:
				return SHARED_EDEFAULT == null ? shared != null : !SHARED_EDEFAULT.equals(shared);
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
		result.append(", providerNetworkType: ");
		result.append(providerNetworkType);
		result.append(", providerPhysicalNetwork: ");
		result.append(providerPhysicalNetwork);
		result.append(", providerSegmentationId: ");
		result.append(providerSegmentationId);
		result.append(", admin_state_up: ");
		result.append(admin_state_up);
		result.append(", shared: ");
		result.append(shared);
		result.append(')');
		return result.toString();
	}

} //CreateNetworkRequestImpl
