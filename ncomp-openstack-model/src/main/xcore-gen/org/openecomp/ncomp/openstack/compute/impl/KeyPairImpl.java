
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
import org.openecomp.ncomp.openstack.compute.KeyPair;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Key Pair</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.impl.KeyPairImpl#getPublic_key <em>Public key</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.impl.KeyPairImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.impl.KeyPairImpl#getFingerprint <em>Fingerprint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KeyPairImpl extends MinimalEObjectImpl.Container implements KeyPair {
	/**
	 * The default value of the '{@link #getPublic_key() <em>Public key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublic_key()
	 * @generated
	 * @ordered
	 */
	protected static final String PUBLIC_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPublic_key() <em>Public key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublic_key()
	 * @generated
	 * @ordered
	 */
	protected String public_key = PUBLIC_KEY_EDEFAULT;

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
	 * The default value of the '{@link #getFingerprint() <em>Fingerprint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFingerprint()
	 * @generated
	 * @ordered
	 */
	protected static final String FINGERPRINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFingerprint() <em>Fingerprint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFingerprint()
	 * @generated
	 * @ordered
	 */
	protected String fingerprint = FINGERPRINT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KeyPairImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComputePackage.Literals.KEY_PAIR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPublic_key() {
		return public_key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublic_key(String newPublic_key) {
		String oldPublic_key = public_key;
		public_key = newPublic_key;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputePackage.KEY_PAIR__PUBLIC_KEY, oldPublic_key, public_key));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComputePackage.KEY_PAIR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFingerprint() {
		return fingerprint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFingerprint(String newFingerprint) {
		String oldFingerprint = fingerprint;
		fingerprint = newFingerprint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputePackage.KEY_PAIR__FINGERPRINT, oldFingerprint, fingerprint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComputePackage.KEY_PAIR__PUBLIC_KEY:
				return getPublic_key();
			case ComputePackage.KEY_PAIR__NAME:
				return getName();
			case ComputePackage.KEY_PAIR__FINGERPRINT:
				return getFingerprint();
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
			case ComputePackage.KEY_PAIR__PUBLIC_KEY:
				setPublic_key((String)newValue);
				return;
			case ComputePackage.KEY_PAIR__NAME:
				setName((String)newValue);
				return;
			case ComputePackage.KEY_PAIR__FINGERPRINT:
				setFingerprint((String)newValue);
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
			case ComputePackage.KEY_PAIR__PUBLIC_KEY:
				setPublic_key(PUBLIC_KEY_EDEFAULT);
				return;
			case ComputePackage.KEY_PAIR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ComputePackage.KEY_PAIR__FINGERPRINT:
				setFingerprint(FINGERPRINT_EDEFAULT);
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
			case ComputePackage.KEY_PAIR__PUBLIC_KEY:
				return PUBLIC_KEY_EDEFAULT == null ? public_key != null : !PUBLIC_KEY_EDEFAULT.equals(public_key);
			case ComputePackage.KEY_PAIR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ComputePackage.KEY_PAIR__FINGERPRINT:
				return FINGERPRINT_EDEFAULT == null ? fingerprint != null : !FINGERPRINT_EDEFAULT.equals(fingerprint);
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
		result.append(" (public_key: ");
		result.append(public_key);
		result.append(", name: ");
		result.append(name);
		result.append(", fingerprint: ");
		result.append(fingerprint);
		result.append(')');
		return result.toString();
	}

} //KeyPairImpl
