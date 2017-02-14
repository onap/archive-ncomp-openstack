
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

import org.openecomp.ncomp.openstack.neutron.CreateRouterRequest;
import org.openecomp.ncomp.openstack.neutron.NeutronPackage;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Create Router Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.CreateRouterRequestImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.CreateRouterRequestImpl#getAdmin_state_up <em>Admin state up</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.CreateRouterRequestImpl#getShared <em>Shared</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.CreateRouterRequestImpl#getExternalNetwork <em>External Network</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.CreateRouterRequestImpl#getPorts <em>Ports</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.CreateRouterRequestImpl#getSubnets <em>Subnets</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CreateRouterRequestImpl extends NeutronRequestImpl implements CreateRouterRequest {
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
	 * The default value of the '{@link #getExternalNetwork() <em>External Network</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalNetwork()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTERNAL_NETWORK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExternalNetwork() <em>External Network</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalNetwork()
	 * @generated
	 * @ordered
	 */
	protected String externalNetwork = EXTERNAL_NETWORK_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPorts() <em>Ports</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<String> ports;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreateRouterRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NeutronPackage.Literals.CREATE_ROUTER_REQUEST;
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
			eNotify(new ENotificationImpl(this, Notification.SET, NeutronPackage.CREATE_ROUTER_REQUEST__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NeutronPackage.CREATE_ROUTER_REQUEST__ADMIN_STATE_UP, oldAdmin_state_up, admin_state_up));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NeutronPackage.CREATE_ROUTER_REQUEST__SHARED, oldShared, shared));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExternalNetwork() {
		return externalNetwork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExternalNetwork(String newExternalNetwork) {
		String oldExternalNetwork = externalNetwork;
		externalNetwork = newExternalNetwork;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NeutronPackage.CREATE_ROUTER_REQUEST__EXTERNAL_NETWORK, oldExternalNetwork, externalNetwork));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getPorts() {
		if (ports == null) {
			ports = new EDataTypeEList<String>(String.class, this, NeutronPackage.CREATE_ROUTER_REQUEST__PORTS);
		}
		return ports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getSubnets() {
		if (subnets == null) {
			subnets = new EDataTypeEList<String>(String.class, this, NeutronPackage.CREATE_ROUTER_REQUEST__SUBNETS);
		}
		return subnets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NeutronPackage.CREATE_ROUTER_REQUEST__NAME:
				return getName();
			case NeutronPackage.CREATE_ROUTER_REQUEST__ADMIN_STATE_UP:
				return getAdmin_state_up();
			case NeutronPackage.CREATE_ROUTER_REQUEST__SHARED:
				return getShared();
			case NeutronPackage.CREATE_ROUTER_REQUEST__EXTERNAL_NETWORK:
				return getExternalNetwork();
			case NeutronPackage.CREATE_ROUTER_REQUEST__PORTS:
				return getPorts();
			case NeutronPackage.CREATE_ROUTER_REQUEST__SUBNETS:
				return getSubnets();
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
			case NeutronPackage.CREATE_ROUTER_REQUEST__NAME:
				setName((String)newValue);
				return;
			case NeutronPackage.CREATE_ROUTER_REQUEST__ADMIN_STATE_UP:
				setAdmin_state_up((Boolean)newValue);
				return;
			case NeutronPackage.CREATE_ROUTER_REQUEST__SHARED:
				setShared((Boolean)newValue);
				return;
			case NeutronPackage.CREATE_ROUTER_REQUEST__EXTERNAL_NETWORK:
				setExternalNetwork((String)newValue);
				return;
			case NeutronPackage.CREATE_ROUTER_REQUEST__PORTS:
				getPorts().clear();
				getPorts().addAll((Collection<? extends String>)newValue);
				return;
			case NeutronPackage.CREATE_ROUTER_REQUEST__SUBNETS:
				getSubnets().clear();
				getSubnets().addAll((Collection<? extends String>)newValue);
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
			case NeutronPackage.CREATE_ROUTER_REQUEST__NAME:
				setName(NAME_EDEFAULT);
				return;
			case NeutronPackage.CREATE_ROUTER_REQUEST__ADMIN_STATE_UP:
				setAdmin_state_up(ADMIN_STATE_UP_EDEFAULT);
				return;
			case NeutronPackage.CREATE_ROUTER_REQUEST__SHARED:
				setShared(SHARED_EDEFAULT);
				return;
			case NeutronPackage.CREATE_ROUTER_REQUEST__EXTERNAL_NETWORK:
				setExternalNetwork(EXTERNAL_NETWORK_EDEFAULT);
				return;
			case NeutronPackage.CREATE_ROUTER_REQUEST__PORTS:
				getPorts().clear();
				return;
			case NeutronPackage.CREATE_ROUTER_REQUEST__SUBNETS:
				getSubnets().clear();
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
			case NeutronPackage.CREATE_ROUTER_REQUEST__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case NeutronPackage.CREATE_ROUTER_REQUEST__ADMIN_STATE_UP:
				return ADMIN_STATE_UP_EDEFAULT == null ? admin_state_up != null : !ADMIN_STATE_UP_EDEFAULT.equals(admin_state_up);
			case NeutronPackage.CREATE_ROUTER_REQUEST__SHARED:
				return SHARED_EDEFAULT == null ? shared != null : !SHARED_EDEFAULT.equals(shared);
			case NeutronPackage.CREATE_ROUTER_REQUEST__EXTERNAL_NETWORK:
				return EXTERNAL_NETWORK_EDEFAULT == null ? externalNetwork != null : !EXTERNAL_NETWORK_EDEFAULT.equals(externalNetwork);
			case NeutronPackage.CREATE_ROUTER_REQUEST__PORTS:
				return ports != null && !ports.isEmpty();
			case NeutronPackage.CREATE_ROUTER_REQUEST__SUBNETS:
				return subnets != null && !subnets.isEmpty();
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
		result.append(", admin_state_up: ");
		result.append(admin_state_up);
		result.append(", shared: ");
		result.append(shared);
		result.append(", externalNetwork: ");
		result.append(externalNetwork);
		result.append(", ports: ");
		result.append(ports);
		result.append(", subnets: ");
		result.append(subnets);
		result.append(')');
		return result.toString();
	}

} //CreateRouterRequestImpl
