
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

import org.openecomp.ncomp.openstack.neutron.BindingVifDetail;
import org.openecomp.ncomp.openstack.neutron.NeutronPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binding Vif Detail</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.BindingVifDetailImpl#getOvs_hybrid_plug <em>Ovs hybrid plug</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.neutron.impl.BindingVifDetailImpl#getPort_filter <em>Port filter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BindingVifDetailImpl extends MinimalEObjectImpl.Container implements BindingVifDetail {
	/**
	 * The default value of the '{@link #getOvs_hybrid_plug() <em>Ovs hybrid plug</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOvs_hybrid_plug()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean OVS_HYBRID_PLUG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOvs_hybrid_plug() <em>Ovs hybrid plug</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOvs_hybrid_plug()
	 * @generated
	 * @ordered
	 */
	protected Boolean ovs_hybrid_plug = OVS_HYBRID_PLUG_EDEFAULT;

	/**
	 * The default value of the '{@link #getPort_filter() <em>Port filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort_filter()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean PORT_FILTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPort_filter() <em>Port filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort_filter()
	 * @generated
	 * @ordered
	 */
	protected Boolean port_filter = PORT_FILTER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BindingVifDetailImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NeutronPackage.Literals.BINDING_VIF_DETAIL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getOvs_hybrid_plug() {
		return ovs_hybrid_plug;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOvs_hybrid_plug(Boolean newOvs_hybrid_plug) {
		Boolean oldOvs_hybrid_plug = ovs_hybrid_plug;
		ovs_hybrid_plug = newOvs_hybrid_plug;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NeutronPackage.BINDING_VIF_DETAIL__OVS_HYBRID_PLUG, oldOvs_hybrid_plug, ovs_hybrid_plug));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getPort_filter() {
		return port_filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort_filter(Boolean newPort_filter) {
		Boolean oldPort_filter = port_filter;
		port_filter = newPort_filter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NeutronPackage.BINDING_VIF_DETAIL__PORT_FILTER, oldPort_filter, port_filter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NeutronPackage.BINDING_VIF_DETAIL__OVS_HYBRID_PLUG:
				return getOvs_hybrid_plug();
			case NeutronPackage.BINDING_VIF_DETAIL__PORT_FILTER:
				return getPort_filter();
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
			case NeutronPackage.BINDING_VIF_DETAIL__OVS_HYBRID_PLUG:
				setOvs_hybrid_plug((Boolean)newValue);
				return;
			case NeutronPackage.BINDING_VIF_DETAIL__PORT_FILTER:
				setPort_filter((Boolean)newValue);
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
			case NeutronPackage.BINDING_VIF_DETAIL__OVS_HYBRID_PLUG:
				setOvs_hybrid_plug(OVS_HYBRID_PLUG_EDEFAULT);
				return;
			case NeutronPackage.BINDING_VIF_DETAIL__PORT_FILTER:
				setPort_filter(PORT_FILTER_EDEFAULT);
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
			case NeutronPackage.BINDING_VIF_DETAIL__OVS_HYBRID_PLUG:
				return OVS_HYBRID_PLUG_EDEFAULT == null ? ovs_hybrid_plug != null : !OVS_HYBRID_PLUG_EDEFAULT.equals(ovs_hybrid_plug);
			case NeutronPackage.BINDING_VIF_DETAIL__PORT_FILTER:
				return PORT_FILTER_EDEFAULT == null ? port_filter != null : !PORT_FILTER_EDEFAULT.equals(port_filter);
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
		result.append(" (ovs_hybrid_plug: ");
		result.append(ovs_hybrid_plug);
		result.append(", port_filter: ");
		result.append(port_filter);
		result.append(')');
		return result.toString();
	}

} //BindingVifDetailImpl
