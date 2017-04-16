
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

import org.openecomp.ncomp.core.impl.NamedEntityImpl;

import org.openecomp.ncomp.openstack.compute.ComputePackage;
import org.openecomp.ncomp.openstack.compute.Metadata;
import org.openecomp.ncomp.openstack.compute.Volume;
import org.openecomp.ncomp.openstack.compute.VolumeAttachment;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Volume</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.impl.VolumeImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.impl.VolumeImpl#getDisplay_name <em>Display name</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.impl.VolumeImpl#getAttachments <em>Attachments</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.impl.VolumeImpl#getAvailability_zone <em>Availability zone</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.impl.VolumeImpl#getCreated_at <em>Created at</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.impl.VolumeImpl#getVolume_type <em>Volume type</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.impl.VolumeImpl#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.impl.VolumeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.impl.VolumeImpl#getSize <em>Size</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.impl.VolumeImpl#getSnapshot_id <em>Snapshot id</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.impl.VolumeImpl#getDisplay_description <em>Display description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VolumeImpl extends NamedEntityImpl implements Volume {
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
	 * The default value of the '{@link #getDisplay_name() <em>Display name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplay_name()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPLAY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisplay_name() <em>Display name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplay_name()
	 * @generated
	 * @ordered
	 */
	protected String display_name = DISPLAY_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAttachments() <em>Attachments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachments()
	 * @generated
	 * @ordered
	 */
	protected EList<VolumeAttachment> attachments;

	/**
	 * The default value of the '{@link #getAvailability_zone() <em>Availability zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailability_zone()
	 * @generated
	 * @ordered
	 */
	protected static final String AVAILABILITY_ZONE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAvailability_zone() <em>Availability zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailability_zone()
	 * @generated
	 * @ordered
	 */
	protected String availability_zone = AVAILABILITY_ZONE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreated_at() <em>Created at</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated_at()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATED_AT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreated_at() <em>Created at</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated_at()
	 * @generated
	 * @ordered
	 */
	protected String created_at = CREATED_AT_EDEFAULT;

	/**
	 * The default value of the '{@link #getVolume_type() <em>Volume type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolume_type()
	 * @generated
	 * @ordered
	 */
	protected static final String VOLUME_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVolume_type() <em>Volume type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolume_type()
	 * @generated
	 * @ordered
	 */
	protected String volume_type = VOLUME_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMetadata() <em>Metadata</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadata()
	 * @generated
	 * @ordered
	 */
	protected EList<Metadata> metadata;

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
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final int SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected int size = SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSnapshot_id() <em>Snapshot id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSnapshot_id()
	 * @generated
	 * @ordered
	 */
	protected static final String SNAPSHOT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSnapshot_id() <em>Snapshot id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSnapshot_id()
	 * @generated
	 * @ordered
	 */
	protected String snapshot_id = SNAPSHOT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDisplay_description() <em>Display description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplay_description()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPLAY_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisplay_description() <em>Display description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplay_description()
	 * @generated
	 * @ordered
	 */
	protected String display_description = DISPLAY_DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VolumeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComputePackage.Literals.VOLUME;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComputePackage.VOLUME__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDisplay_name() {
		return display_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplay_name(String newDisplay_name) {
		String oldDisplay_name = display_name;
		display_name = newDisplay_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputePackage.VOLUME__DISPLAY_NAME, oldDisplay_name, display_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VolumeAttachment> getAttachments() {
		if (attachments == null) {
			attachments = new EObjectContainmentEList<VolumeAttachment>(VolumeAttachment.class, this, ComputePackage.VOLUME__ATTACHMENTS);
		}
		return attachments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAvailability_zone() {
		return availability_zone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvailability_zone(String newAvailability_zone) {
		String oldAvailability_zone = availability_zone;
		availability_zone = newAvailability_zone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputePackage.VOLUME__AVAILABILITY_ZONE, oldAvailability_zone, availability_zone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCreated_at() {
		return created_at;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreated_at(String newCreated_at) {
		String oldCreated_at = created_at;
		created_at = newCreated_at;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputePackage.VOLUME__CREATED_AT, oldCreated_at, created_at));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVolume_type() {
		return volume_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVolume_type(String newVolume_type) {
		String oldVolume_type = volume_type;
		volume_type = newVolume_type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputePackage.VOLUME__VOLUME_TYPE, oldVolume_type, volume_type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Metadata> getMetadata() {
		if (metadata == null) {
			metadata = new EObjectContainmentEList<Metadata>(Metadata.class, this, ComputePackage.VOLUME__METADATA);
		}
		return metadata;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComputePackage.VOLUME__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(int newSize) {
		int oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputePackage.VOLUME__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSnapshot_id() {
		return snapshot_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSnapshot_id(String newSnapshot_id) {
		String oldSnapshot_id = snapshot_id;
		snapshot_id = newSnapshot_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputePackage.VOLUME__SNAPSHOT_ID, oldSnapshot_id, snapshot_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDisplay_description() {
		return display_description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplay_description(String newDisplay_description) {
		String oldDisplay_description = display_description;
		display_description = newDisplay_description;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputePackage.VOLUME__DISPLAY_DESCRIPTION, oldDisplay_description, display_description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComputePackage.VOLUME__ATTACHMENTS:
				return ((InternalEList<?>)getAttachments()).basicRemove(otherEnd, msgs);
			case ComputePackage.VOLUME__METADATA:
				return ((InternalEList<?>)getMetadata()).basicRemove(otherEnd, msgs);
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
			case ComputePackage.VOLUME__STATUS:
				return getStatus();
			case ComputePackage.VOLUME__DISPLAY_NAME:
				return getDisplay_name();
			case ComputePackage.VOLUME__ATTACHMENTS:
				return getAttachments();
			case ComputePackage.VOLUME__AVAILABILITY_ZONE:
				return getAvailability_zone();
			case ComputePackage.VOLUME__CREATED_AT:
				return getCreated_at();
			case ComputePackage.VOLUME__VOLUME_TYPE:
				return getVolume_type();
			case ComputePackage.VOLUME__METADATA:
				return getMetadata();
			case ComputePackage.VOLUME__ID:
				return getId();
			case ComputePackage.VOLUME__SIZE:
				return getSize();
			case ComputePackage.VOLUME__SNAPSHOT_ID:
				return getSnapshot_id();
			case ComputePackage.VOLUME__DISPLAY_DESCRIPTION:
				return getDisplay_description();
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
			case ComputePackage.VOLUME__STATUS:
				setStatus((String)newValue);
				return;
			case ComputePackage.VOLUME__DISPLAY_NAME:
				setDisplay_name((String)newValue);
				return;
			case ComputePackage.VOLUME__ATTACHMENTS:
				getAttachments().clear();
				getAttachments().addAll((Collection<? extends VolumeAttachment>)newValue);
				return;
			case ComputePackage.VOLUME__AVAILABILITY_ZONE:
				setAvailability_zone((String)newValue);
				return;
			case ComputePackage.VOLUME__CREATED_AT:
				setCreated_at((String)newValue);
				return;
			case ComputePackage.VOLUME__VOLUME_TYPE:
				setVolume_type((String)newValue);
				return;
			case ComputePackage.VOLUME__METADATA:
				getMetadata().clear();
				getMetadata().addAll((Collection<? extends Metadata>)newValue);
				return;
			case ComputePackage.VOLUME__ID:
				setId((String)newValue);
				return;
			case ComputePackage.VOLUME__SIZE:
				setSize((Integer)newValue);
				return;
			case ComputePackage.VOLUME__SNAPSHOT_ID:
				setSnapshot_id((String)newValue);
				return;
			case ComputePackage.VOLUME__DISPLAY_DESCRIPTION:
				setDisplay_description((String)newValue);
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
			case ComputePackage.VOLUME__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case ComputePackage.VOLUME__DISPLAY_NAME:
				setDisplay_name(DISPLAY_NAME_EDEFAULT);
				return;
			case ComputePackage.VOLUME__ATTACHMENTS:
				getAttachments().clear();
				return;
			case ComputePackage.VOLUME__AVAILABILITY_ZONE:
				setAvailability_zone(AVAILABILITY_ZONE_EDEFAULT);
				return;
			case ComputePackage.VOLUME__CREATED_AT:
				setCreated_at(CREATED_AT_EDEFAULT);
				return;
			case ComputePackage.VOLUME__VOLUME_TYPE:
				setVolume_type(VOLUME_TYPE_EDEFAULT);
				return;
			case ComputePackage.VOLUME__METADATA:
				getMetadata().clear();
				return;
			case ComputePackage.VOLUME__ID:
				setId(ID_EDEFAULT);
				return;
			case ComputePackage.VOLUME__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case ComputePackage.VOLUME__SNAPSHOT_ID:
				setSnapshot_id(SNAPSHOT_ID_EDEFAULT);
				return;
			case ComputePackage.VOLUME__DISPLAY_DESCRIPTION:
				setDisplay_description(DISPLAY_DESCRIPTION_EDEFAULT);
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
			case ComputePackage.VOLUME__STATUS:
				return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
			case ComputePackage.VOLUME__DISPLAY_NAME:
				return DISPLAY_NAME_EDEFAULT == null ? display_name != null : !DISPLAY_NAME_EDEFAULT.equals(display_name);
			case ComputePackage.VOLUME__ATTACHMENTS:
				return attachments != null && !attachments.isEmpty();
			case ComputePackage.VOLUME__AVAILABILITY_ZONE:
				return AVAILABILITY_ZONE_EDEFAULT == null ? availability_zone != null : !AVAILABILITY_ZONE_EDEFAULT.equals(availability_zone);
			case ComputePackage.VOLUME__CREATED_AT:
				return CREATED_AT_EDEFAULT == null ? created_at != null : !CREATED_AT_EDEFAULT.equals(created_at);
			case ComputePackage.VOLUME__VOLUME_TYPE:
				return VOLUME_TYPE_EDEFAULT == null ? volume_type != null : !VOLUME_TYPE_EDEFAULT.equals(volume_type);
			case ComputePackage.VOLUME__METADATA:
				return metadata != null && !metadata.isEmpty();
			case ComputePackage.VOLUME__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ComputePackage.VOLUME__SIZE:
				return size != SIZE_EDEFAULT;
			case ComputePackage.VOLUME__SNAPSHOT_ID:
				return SNAPSHOT_ID_EDEFAULT == null ? snapshot_id != null : !SNAPSHOT_ID_EDEFAULT.equals(snapshot_id);
			case ComputePackage.VOLUME__DISPLAY_DESCRIPTION:
				return DISPLAY_DESCRIPTION_EDEFAULT == null ? display_description != null : !DISPLAY_DESCRIPTION_EDEFAULT.equals(display_description);
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
		result.append(" (status: ");
		result.append(status);
		result.append(", display_name: ");
		result.append(display_name);
		result.append(", availability_zone: ");
		result.append(availability_zone);
		result.append(", created_at: ");
		result.append(created_at);
		result.append(", volume_type: ");
		result.append(volume_type);
		result.append(", id: ");
		result.append(id);
		result.append(", size: ");
		result.append(size);
		result.append(", snapshot_id: ");
		result.append(snapshot_id);
		result.append(", display_description: ");
		result.append(display_description);
		result.append(')');
		return result.toString();
	}

} //VolumeImpl
