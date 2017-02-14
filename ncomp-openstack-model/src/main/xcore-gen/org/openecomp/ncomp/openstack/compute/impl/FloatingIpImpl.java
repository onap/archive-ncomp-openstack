
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
package org.openecomp.ncomp.openstack.compute.impl;

import org.openecomp.ncomp.openstack.compute.ComputePackage;
import org.openecomp.ncomp.openstack.compute.FloatingIp;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Floating Ip</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.impl.FloatingIpImpl#getInstance_id <em>Instance id</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.impl.FloatingIpImpl#getIp <em>Ip</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.impl.FloatingIpImpl#getFixed_ip <em>Fixed ip</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.impl.FloatingIpImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.impl.FloatingIpImpl#getPool <em>Pool</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FloatingIpImpl extends MinimalEObjectImpl.Container implements FloatingIp {
	/**
	 * The default value of the '{@link #getInstance_id() <em>Instance id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstance_id()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTANCE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstance_id() <em>Instance id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstance_id()
	 * @generated
	 * @ordered
	 */
	protected String instance_id = INSTANCE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getIp() <em>Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIp()
	 * @generated
	 * @ordered
	 */
	protected static final String IP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIp() <em>Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIp()
	 * @generated
	 * @ordered
	 */
	protected String ip = IP_EDEFAULT;

	/**
	 * The default value of the '{@link #getFixed_ip() <em>Fixed ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixed_ip()
	 * @generated
	 * @ordered
	 */
	protected static final String FIXED_IP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFixed_ip() <em>Fixed ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixed_ip()
	 * @generated
	 * @ordered
	 */
	protected String fixed_ip = FIXED_IP_EDEFAULT;

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
	 * The default value of the '{@link #getPool() <em>Pool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPool()
	 * @generated
	 * @ordered
	 */
	protected static final String POOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPool() <em>Pool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPool()
	 * @generated
	 * @ordered
	 */
	protected String pool = POOL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FloatingIpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComputePackage.Literals.FLOATING_IP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInstance_id() {
		return instance_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstance_id(String newInstance_id) {
		String oldInstance_id = instance_id;
		instance_id = newInstance_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputePackage.FLOATING_IP__INSTANCE_ID, oldInstance_id, instance_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIp() {
		return ip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIp(String newIp) {
		String oldIp = ip;
		ip = newIp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputePackage.FLOATING_IP__IP, oldIp, ip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFixed_ip() {
		return fixed_ip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFixed_ip(String newFixed_ip) {
		String oldFixed_ip = fixed_ip;
		fixed_ip = newFixed_ip;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputePackage.FLOATING_IP__FIXED_IP, oldFixed_ip, fixed_ip));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComputePackage.FLOATING_IP__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPool() {
		return pool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPool(String newPool) {
		String oldPool = pool;
		pool = newPool;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputePackage.FLOATING_IP__POOL, oldPool, pool));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComputePackage.FLOATING_IP__INSTANCE_ID:
				return getInstance_id();
			case ComputePackage.FLOATING_IP__IP:
				return getIp();
			case ComputePackage.FLOATING_IP__FIXED_IP:
				return getFixed_ip();
			case ComputePackage.FLOATING_IP__ID:
				return getId();
			case ComputePackage.FLOATING_IP__POOL:
				return getPool();
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
			case ComputePackage.FLOATING_IP__INSTANCE_ID:
				setInstance_id((String)newValue);
				return;
			case ComputePackage.FLOATING_IP__IP:
				setIp((String)newValue);
				return;
			case ComputePackage.FLOATING_IP__FIXED_IP:
				setFixed_ip((String)newValue);
				return;
			case ComputePackage.FLOATING_IP__ID:
				setId((String)newValue);
				return;
			case ComputePackage.FLOATING_IP__POOL:
				setPool((String)newValue);
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
			case ComputePackage.FLOATING_IP__INSTANCE_ID:
				setInstance_id(INSTANCE_ID_EDEFAULT);
				return;
			case ComputePackage.FLOATING_IP__IP:
				setIp(IP_EDEFAULT);
				return;
			case ComputePackage.FLOATING_IP__FIXED_IP:
				setFixed_ip(FIXED_IP_EDEFAULT);
				return;
			case ComputePackage.FLOATING_IP__ID:
				setId(ID_EDEFAULT);
				return;
			case ComputePackage.FLOATING_IP__POOL:
				setPool(POOL_EDEFAULT);
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
			case ComputePackage.FLOATING_IP__INSTANCE_ID:
				return INSTANCE_ID_EDEFAULT == null ? instance_id != null : !INSTANCE_ID_EDEFAULT.equals(instance_id);
			case ComputePackage.FLOATING_IP__IP:
				return IP_EDEFAULT == null ? ip != null : !IP_EDEFAULT.equals(ip);
			case ComputePackage.FLOATING_IP__FIXED_IP:
				return FIXED_IP_EDEFAULT == null ? fixed_ip != null : !FIXED_IP_EDEFAULT.equals(fixed_ip);
			case ComputePackage.FLOATING_IP__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ComputePackage.FLOATING_IP__POOL:
				return POOL_EDEFAULT == null ? pool != null : !POOL_EDEFAULT.equals(pool);
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
		result.append(" (instance_id: ");
		result.append(instance_id);
		result.append(", ip: ");
		result.append(ip);
		result.append(", fixed_ip: ");
		result.append(fixed_ip);
		result.append(", id: ");
		result.append(id);
		result.append(", pool: ");
		result.append(pool);
		result.append(')');
		return result.toString();
	}

} //FloatingIpImpl
