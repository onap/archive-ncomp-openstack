
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

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>External Gateway</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.ExternalGatewayImpl#getEnable_snat <em>Enable snat</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.ExternalGatewayImpl#getNetwork_id <em>Network id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExternalGatewayImpl extends MinimalEObjectImpl.Container implements ExternalGateway {
	/**
	 * The default value of the '{@link #getEnable_snat() <em>Enable snat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnable_snat()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ENABLE_SNAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnable_snat() <em>Enable snat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnable_snat()
	 * @generated
	 * @ordered
	 */
	protected Boolean enable_snat = ENABLE_SNAT_EDEFAULT;

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
	protected ExternalGatewayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NeutronPackage.Literals.EXTERNAL_GATEWAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getEnable_snat() {
		return enable_snat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnable_snat(Boolean newEnable_snat) {
		Boolean oldEnable_snat = enable_snat;
		enable_snat = newEnable_snat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NeutronPackage.EXTERNAL_GATEWAY__ENABLE_SNAT, oldEnable_snat, enable_snat));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NeutronPackage.EXTERNAL_GATEWAY__NETWORK_ID, oldNetwork_id, network_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NeutronPackage.EXTERNAL_GATEWAY__ENABLE_SNAT:
				return getEnable_snat();
			case NeutronPackage.EXTERNAL_GATEWAY__NETWORK_ID:
				return getNetwork_id();
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
			case NeutronPackage.EXTERNAL_GATEWAY__ENABLE_SNAT:
				setEnable_snat((Boolean)newValue);
				return;
			case NeutronPackage.EXTERNAL_GATEWAY__NETWORK_ID:
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
			case NeutronPackage.EXTERNAL_GATEWAY__ENABLE_SNAT:
				setEnable_snat(ENABLE_SNAT_EDEFAULT);
				return;
			case NeutronPackage.EXTERNAL_GATEWAY__NETWORK_ID:
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
			case NeutronPackage.EXTERNAL_GATEWAY__ENABLE_SNAT:
				return ENABLE_SNAT_EDEFAULT == null ? enable_snat != null : !ENABLE_SNAT_EDEFAULT.equals(enable_snat);
			case NeutronPackage.EXTERNAL_GATEWAY__NETWORK_ID:
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
		result.append(" (enable_snat: ");
		result.append(enable_snat);
		result.append(", network_id: ");
		result.append(network_id);
		result.append(')');
		return result.toString();
	}

} //ExternalGatewayImpl
