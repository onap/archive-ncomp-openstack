
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
import org.openecomp.ncomp.openstack.compute.VolumeAttachment;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Volume Attachment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.impl.VolumeAttachmentImpl#getDevice <em>Device</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.impl.VolumeAttachmentImpl#getServer_id <em>Server id</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.impl.VolumeAttachmentImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.impl.VolumeAttachmentImpl#getVolume_id <em>Volume id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VolumeAttachmentImpl extends MinimalEObjectImpl.Container implements VolumeAttachment {
	/**
	 * The default value of the '{@link #getDevice() <em>Device</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevice()
	 * @generated
	 * @ordered
	 */
	protected static final String DEVICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDevice() <em>Device</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevice()
	 * @generated
	 * @ordered
	 */
	protected String device = DEVICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getServer_id() <em>Server id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServer_id()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServer_id() <em>Server id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServer_id()
	 * @generated
	 * @ordered
	 */
	protected String server_id = SERVER_ID_EDEFAULT;

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
	 * The default value of the '{@link #getVolume_id() <em>Volume id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolume_id()
	 * @generated
	 * @ordered
	 */
	protected static final String VOLUME_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVolume_id() <em>Volume id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolume_id()
	 * @generated
	 * @ordered
	 */
	protected String volume_id = VOLUME_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VolumeAttachmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComputePackage.Literals.VOLUME_ATTACHMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDevice() {
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDevice(String newDevice) {
		String oldDevice = device;
		device = newDevice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputePackage.VOLUME_ATTACHMENT__DEVICE, oldDevice, device));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServer_id() {
		return server_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServer_id(String newServer_id) {
		String oldServer_id = server_id;
		server_id = newServer_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputePackage.VOLUME_ATTACHMENT__SERVER_ID, oldServer_id, server_id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComputePackage.VOLUME_ATTACHMENT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVolume_id() {
		return volume_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVolume_id(String newVolume_id) {
		String oldVolume_id = volume_id;
		volume_id = newVolume_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputePackage.VOLUME_ATTACHMENT__VOLUME_ID, oldVolume_id, volume_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComputePackage.VOLUME_ATTACHMENT__DEVICE:
				return getDevice();
			case ComputePackage.VOLUME_ATTACHMENT__SERVER_ID:
				return getServer_id();
			case ComputePackage.VOLUME_ATTACHMENT__ID:
				return getId();
			case ComputePackage.VOLUME_ATTACHMENT__VOLUME_ID:
				return getVolume_id();
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
			case ComputePackage.VOLUME_ATTACHMENT__DEVICE:
				setDevice((String)newValue);
				return;
			case ComputePackage.VOLUME_ATTACHMENT__SERVER_ID:
				setServer_id((String)newValue);
				return;
			case ComputePackage.VOLUME_ATTACHMENT__ID:
				setId((String)newValue);
				return;
			case ComputePackage.VOLUME_ATTACHMENT__VOLUME_ID:
				setVolume_id((String)newValue);
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
			case ComputePackage.VOLUME_ATTACHMENT__DEVICE:
				setDevice(DEVICE_EDEFAULT);
				return;
			case ComputePackage.VOLUME_ATTACHMENT__SERVER_ID:
				setServer_id(SERVER_ID_EDEFAULT);
				return;
			case ComputePackage.VOLUME_ATTACHMENT__ID:
				setId(ID_EDEFAULT);
				return;
			case ComputePackage.VOLUME_ATTACHMENT__VOLUME_ID:
				setVolume_id(VOLUME_ID_EDEFAULT);
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
			case ComputePackage.VOLUME_ATTACHMENT__DEVICE:
				return DEVICE_EDEFAULT == null ? device != null : !DEVICE_EDEFAULT.equals(device);
			case ComputePackage.VOLUME_ATTACHMENT__SERVER_ID:
				return SERVER_ID_EDEFAULT == null ? server_id != null : !SERVER_ID_EDEFAULT.equals(server_id);
			case ComputePackage.VOLUME_ATTACHMENT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ComputePackage.VOLUME_ATTACHMENT__VOLUME_ID:
				return VOLUME_ID_EDEFAULT == null ? volume_id != null : !VOLUME_ID_EDEFAULT.equals(volume_id);
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
		result.append(" (device: ");
		result.append(device);
		result.append(", server_id: ");
		result.append(server_id);
		result.append(", id: ");
		result.append(id);
		result.append(", volume_id: ");
		result.append(volume_id);
		result.append(')');
		return result.toString();
	}

} //VolumeAttachmentImpl
