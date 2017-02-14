
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

import org.openecomp.ncomp.openstack.compute.Address;
import org.openecomp.ncomp.openstack.compute.ComputePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Address</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.impl.AddressImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.impl.AddressImpl#getAddr <em>Addr</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.impl.AddressImpl#getOS_EXT_IPS_MAC_mac_addr <em>OS EXT IPS MAC mac addr</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.impl.AddressImpl#getOS_EXT_IPS_type <em>OS EXT IPS type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AddressImpl extends MinimalEObjectImpl.Container implements Address {
	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final int VERSION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected int version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getAddr() <em>Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddr()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddr() <em>Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddr()
	 * @generated
	 * @ordered
	 */
	protected String addr = ADDR_EDEFAULT;

	/**
	 * The default value of the '{@link #getOS_EXT_IPS_MAC_mac_addr() <em>OS EXT IPS MAC mac addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOS_EXT_IPS_MAC_mac_addr()
	 * @generated
	 * @ordered
	 */
	protected static final String OS_EXT_IPS_MAC_MAC_ADDR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOS_EXT_IPS_MAC_mac_addr() <em>OS EXT IPS MAC mac addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOS_EXT_IPS_MAC_mac_addr()
	 * @generated
	 * @ordered
	 */
	protected String oS_EXT_IPS_MAC_mac_addr = OS_EXT_IPS_MAC_MAC_ADDR_EDEFAULT;

	/**
	 * The default value of the '{@link #getOS_EXT_IPS_type() <em>OS EXT IPS type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOS_EXT_IPS_type()
	 * @generated
	 * @ordered
	 */
	protected static final String OS_EXT_IPS_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOS_EXT_IPS_type() <em>OS EXT IPS type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOS_EXT_IPS_type()
	 * @generated
	 * @ordered
	 */
	protected String oS_EXT_IPS_type = OS_EXT_IPS_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddressImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComputePackage.Literals.ADDRESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(int newVersion) {
		int oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputePackage.ADDRESS__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAddr() {
		return addr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddr(String newAddr) {
		String oldAddr = addr;
		addr = newAddr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputePackage.ADDRESS__ADDR, oldAddr, addr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOS_EXT_IPS_MAC_mac_addr() {
		return oS_EXT_IPS_MAC_mac_addr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOS_EXT_IPS_MAC_mac_addr(String newOS_EXT_IPS_MAC_mac_addr) {
		String oldOS_EXT_IPS_MAC_mac_addr = oS_EXT_IPS_MAC_mac_addr;
		oS_EXT_IPS_MAC_mac_addr = newOS_EXT_IPS_MAC_mac_addr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputePackage.ADDRESS__OS_EXT_IPS_MAC_MAC_ADDR, oldOS_EXT_IPS_MAC_mac_addr, oS_EXT_IPS_MAC_mac_addr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOS_EXT_IPS_type() {
		return oS_EXT_IPS_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOS_EXT_IPS_type(String newOS_EXT_IPS_type) {
		String oldOS_EXT_IPS_type = oS_EXT_IPS_type;
		oS_EXT_IPS_type = newOS_EXT_IPS_type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputePackage.ADDRESS__OS_EXT_IPS_TYPE, oldOS_EXT_IPS_type, oS_EXT_IPS_type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComputePackage.ADDRESS__VERSION:
				return getVersion();
			case ComputePackage.ADDRESS__ADDR:
				return getAddr();
			case ComputePackage.ADDRESS__OS_EXT_IPS_MAC_MAC_ADDR:
				return getOS_EXT_IPS_MAC_mac_addr();
			case ComputePackage.ADDRESS__OS_EXT_IPS_TYPE:
				return getOS_EXT_IPS_type();
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
			case ComputePackage.ADDRESS__VERSION:
				setVersion((Integer)newValue);
				return;
			case ComputePackage.ADDRESS__ADDR:
				setAddr((String)newValue);
				return;
			case ComputePackage.ADDRESS__OS_EXT_IPS_MAC_MAC_ADDR:
				setOS_EXT_IPS_MAC_mac_addr((String)newValue);
				return;
			case ComputePackage.ADDRESS__OS_EXT_IPS_TYPE:
				setOS_EXT_IPS_type((String)newValue);
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
			case ComputePackage.ADDRESS__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case ComputePackage.ADDRESS__ADDR:
				setAddr(ADDR_EDEFAULT);
				return;
			case ComputePackage.ADDRESS__OS_EXT_IPS_MAC_MAC_ADDR:
				setOS_EXT_IPS_MAC_mac_addr(OS_EXT_IPS_MAC_MAC_ADDR_EDEFAULT);
				return;
			case ComputePackage.ADDRESS__OS_EXT_IPS_TYPE:
				setOS_EXT_IPS_type(OS_EXT_IPS_TYPE_EDEFAULT);
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
			case ComputePackage.ADDRESS__VERSION:
				return version != VERSION_EDEFAULT;
			case ComputePackage.ADDRESS__ADDR:
				return ADDR_EDEFAULT == null ? addr != null : !ADDR_EDEFAULT.equals(addr);
			case ComputePackage.ADDRESS__OS_EXT_IPS_MAC_MAC_ADDR:
				return OS_EXT_IPS_MAC_MAC_ADDR_EDEFAULT == null ? oS_EXT_IPS_MAC_mac_addr != null : !OS_EXT_IPS_MAC_MAC_ADDR_EDEFAULT.equals(oS_EXT_IPS_MAC_mac_addr);
			case ComputePackage.ADDRESS__OS_EXT_IPS_TYPE:
				return OS_EXT_IPS_TYPE_EDEFAULT == null ? oS_EXT_IPS_type != null : !OS_EXT_IPS_TYPE_EDEFAULT.equals(oS_EXT_IPS_type);
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
		result.append(" (version: ");
		result.append(version);
		result.append(", addr: ");
		result.append(addr);
		result.append(", OS_EXT_IPS_MAC_mac_addr: ");
		result.append(oS_EXT_IPS_MAC_mac_addr);
		result.append(", OS_EXT_IPS_type: ");
		result.append(oS_EXT_IPS_type);
		result.append(')');
		return result.toString();
	}

} //AddressImpl
