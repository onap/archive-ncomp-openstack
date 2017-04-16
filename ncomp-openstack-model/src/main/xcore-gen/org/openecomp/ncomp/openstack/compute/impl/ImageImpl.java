
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
import org.openecomp.ncomp.openstack.compute.Image;
import org.openecomp.ncomp.openstack.compute.Link;
import org.openecomp.ncomp.openstack.compute.Metadata;
import org.openecomp.ncomp.openstack.compute.Reference;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Image</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.impl.ImageImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.impl.ImageImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.impl.ImageImpl#getUpdated <em>Updated</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.impl.ImageImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.impl.ImageImpl#getTenant_id <em>Tenant id</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.impl.ImageImpl#getUser_id <em>User id</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.impl.ImageImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.impl.ImageImpl#getProgress <em>Progress</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.impl.ImageImpl#getMinDisk <em>Min Disk</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.impl.ImageImpl#getMinRam <em>Min Ram</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.impl.ImageImpl#getOS_EXT_IMG_SIZE_size <em>OS EXT IMG SIZE size</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.impl.ImageImpl#getServer <em>Server</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.impl.ImageImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.impl.ImageImpl#getMetadata <em>Metadata</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImageImpl extends MinimalEObjectImpl.Container implements Image {
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
	 * The default value of the '{@link #getUpdated() <em>Updated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdated()
	 * @generated
	 * @ordered
	 */
	protected static final String UPDATED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUpdated() <em>Updated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdated()
	 * @generated
	 * @ordered
	 */
	protected String updated = UPDATED_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreated() <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreated() <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated()
	 * @generated
	 * @ordered
	 */
	protected String created = CREATED_EDEFAULT;

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
	 * The default value of the '{@link #getUser_id() <em>User id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser_id()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUser_id() <em>User id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser_id()
	 * @generated
	 * @ordered
	 */
	protected String user_id = USER_ID_EDEFAULT;

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
	 * The default value of the '{@link #getProgress() <em>Progress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgress()
	 * @generated
	 * @ordered
	 */
	protected static final Long PROGRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProgress() <em>Progress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgress()
	 * @generated
	 * @ordered
	 */
	protected Long progress = PROGRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinDisk() <em>Min Disk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinDisk()
	 * @generated
	 * @ordered
	 */
	protected static final Long MIN_DISK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinDisk() <em>Min Disk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinDisk()
	 * @generated
	 * @ordered
	 */
	protected Long minDisk = MIN_DISK_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinRam() <em>Min Ram</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinRam()
	 * @generated
	 * @ordered
	 */
	protected static final Long MIN_RAM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinRam() <em>Min Ram</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinRam()
	 * @generated
	 * @ordered
	 */
	protected Long minRam = MIN_RAM_EDEFAULT;

	/**
	 * The default value of the '{@link #getOS_EXT_IMG_SIZE_size() <em>OS EXT IMG SIZE size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOS_EXT_IMG_SIZE_size()
	 * @generated
	 * @ordered
	 */
	protected static final Long OS_EXT_IMG_SIZE_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOS_EXT_IMG_SIZE_size() <em>OS EXT IMG SIZE size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOS_EXT_IMG_SIZE_size()
	 * @generated
	 * @ordered
	 */
	protected Long oS_EXT_IMG_SIZE_size = OS_EXT_IMG_SIZE_SIZE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getServer() <em>Server</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServer()
	 * @generated
	 * @ordered
	 */
	protected Reference server;

	/**
	 * The cached value of the '{@link #getLinks() <em>Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> links;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComputePackage.Literals.IMAGE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComputePackage.IMAGE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComputePackage.IMAGE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUpdated() {
		return updated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdated(String newUpdated) {
		String oldUpdated = updated;
		updated = newUpdated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputePackage.IMAGE__UPDATED, oldUpdated, updated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCreated() {
		return created;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreated(String newCreated) {
		String oldCreated = created;
		created = newCreated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputePackage.IMAGE__CREATED, oldCreated, created));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComputePackage.IMAGE__TENANT_ID, oldTenant_id, tenant_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUser_id() {
		return user_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUser_id(String newUser_id) {
		String oldUser_id = user_id;
		user_id = newUser_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputePackage.IMAGE__USER_ID, oldUser_id, user_id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComputePackage.IMAGE__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getProgress() {
		return progress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProgress(Long newProgress) {
		Long oldProgress = progress;
		progress = newProgress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputePackage.IMAGE__PROGRESS, oldProgress, progress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getMinDisk() {
		return minDisk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinDisk(Long newMinDisk) {
		Long oldMinDisk = minDisk;
		minDisk = newMinDisk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputePackage.IMAGE__MIN_DISK, oldMinDisk, minDisk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getMinRam() {
		return minRam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinRam(Long newMinRam) {
		Long oldMinRam = minRam;
		minRam = newMinRam;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputePackage.IMAGE__MIN_RAM, oldMinRam, minRam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getOS_EXT_IMG_SIZE_size() {
		return oS_EXT_IMG_SIZE_size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOS_EXT_IMG_SIZE_size(Long newOS_EXT_IMG_SIZE_size) {
		Long oldOS_EXT_IMG_SIZE_size = oS_EXT_IMG_SIZE_size;
		oS_EXT_IMG_SIZE_size = newOS_EXT_IMG_SIZE_size;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputePackage.IMAGE__OS_EXT_IMG_SIZE_SIZE, oldOS_EXT_IMG_SIZE_size, oS_EXT_IMG_SIZE_size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getServer() {
		return server;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServer(Reference newServer, NotificationChain msgs) {
		Reference oldServer = server;
		server = newServer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComputePackage.IMAGE__SERVER, oldServer, newServer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServer(Reference newServer) {
		if (newServer != server) {
			NotificationChain msgs = null;
			if (server != null)
				msgs = ((InternalEObject)server).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComputePackage.IMAGE__SERVER, null, msgs);
			if (newServer != null)
				msgs = ((InternalEObject)newServer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComputePackage.IMAGE__SERVER, null, msgs);
			msgs = basicSetServer(newServer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputePackage.IMAGE__SERVER, newServer, newServer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Link> getLinks() {
		if (links == null) {
			links = new EObjectContainmentEList<Link>(Link.class, this, ComputePackage.IMAGE__LINKS);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Metadata> getMetadata() {
		if (metadata == null) {
			metadata = new EObjectContainmentEList<Metadata>(Metadata.class, this, ComputePackage.IMAGE__METADATA);
		}
		return metadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComputePackage.IMAGE__SERVER:
				return basicSetServer(null, msgs);
			case ComputePackage.IMAGE__LINKS:
				return ((InternalEList<?>)getLinks()).basicRemove(otherEnd, msgs);
			case ComputePackage.IMAGE__METADATA:
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
			case ComputePackage.IMAGE__ID:
				return getId();
			case ComputePackage.IMAGE__NAME:
				return getName();
			case ComputePackage.IMAGE__UPDATED:
				return getUpdated();
			case ComputePackage.IMAGE__CREATED:
				return getCreated();
			case ComputePackage.IMAGE__TENANT_ID:
				return getTenant_id();
			case ComputePackage.IMAGE__USER_ID:
				return getUser_id();
			case ComputePackage.IMAGE__STATUS:
				return getStatus();
			case ComputePackage.IMAGE__PROGRESS:
				return getProgress();
			case ComputePackage.IMAGE__MIN_DISK:
				return getMinDisk();
			case ComputePackage.IMAGE__MIN_RAM:
				return getMinRam();
			case ComputePackage.IMAGE__OS_EXT_IMG_SIZE_SIZE:
				return getOS_EXT_IMG_SIZE_size();
			case ComputePackage.IMAGE__SERVER:
				return getServer();
			case ComputePackage.IMAGE__LINKS:
				return getLinks();
			case ComputePackage.IMAGE__METADATA:
				return getMetadata();
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
			case ComputePackage.IMAGE__ID:
				setId((String)newValue);
				return;
			case ComputePackage.IMAGE__NAME:
				setName((String)newValue);
				return;
			case ComputePackage.IMAGE__UPDATED:
				setUpdated((String)newValue);
				return;
			case ComputePackage.IMAGE__CREATED:
				setCreated((String)newValue);
				return;
			case ComputePackage.IMAGE__TENANT_ID:
				setTenant_id((String)newValue);
				return;
			case ComputePackage.IMAGE__USER_ID:
				setUser_id((String)newValue);
				return;
			case ComputePackage.IMAGE__STATUS:
				setStatus((String)newValue);
				return;
			case ComputePackage.IMAGE__PROGRESS:
				setProgress((Long)newValue);
				return;
			case ComputePackage.IMAGE__MIN_DISK:
				setMinDisk((Long)newValue);
				return;
			case ComputePackage.IMAGE__MIN_RAM:
				setMinRam((Long)newValue);
				return;
			case ComputePackage.IMAGE__OS_EXT_IMG_SIZE_SIZE:
				setOS_EXT_IMG_SIZE_size((Long)newValue);
				return;
			case ComputePackage.IMAGE__SERVER:
				setServer((Reference)newValue);
				return;
			case ComputePackage.IMAGE__LINKS:
				getLinks().clear();
				getLinks().addAll((Collection<? extends Link>)newValue);
				return;
			case ComputePackage.IMAGE__METADATA:
				getMetadata().clear();
				getMetadata().addAll((Collection<? extends Metadata>)newValue);
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
			case ComputePackage.IMAGE__ID:
				setId(ID_EDEFAULT);
				return;
			case ComputePackage.IMAGE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ComputePackage.IMAGE__UPDATED:
				setUpdated(UPDATED_EDEFAULT);
				return;
			case ComputePackage.IMAGE__CREATED:
				setCreated(CREATED_EDEFAULT);
				return;
			case ComputePackage.IMAGE__TENANT_ID:
				setTenant_id(TENANT_ID_EDEFAULT);
				return;
			case ComputePackage.IMAGE__USER_ID:
				setUser_id(USER_ID_EDEFAULT);
				return;
			case ComputePackage.IMAGE__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case ComputePackage.IMAGE__PROGRESS:
				setProgress(PROGRESS_EDEFAULT);
				return;
			case ComputePackage.IMAGE__MIN_DISK:
				setMinDisk(MIN_DISK_EDEFAULT);
				return;
			case ComputePackage.IMAGE__MIN_RAM:
				setMinRam(MIN_RAM_EDEFAULT);
				return;
			case ComputePackage.IMAGE__OS_EXT_IMG_SIZE_SIZE:
				setOS_EXT_IMG_SIZE_size(OS_EXT_IMG_SIZE_SIZE_EDEFAULT);
				return;
			case ComputePackage.IMAGE__SERVER:
				setServer((Reference)null);
				return;
			case ComputePackage.IMAGE__LINKS:
				getLinks().clear();
				return;
			case ComputePackage.IMAGE__METADATA:
				getMetadata().clear();
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
			case ComputePackage.IMAGE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ComputePackage.IMAGE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ComputePackage.IMAGE__UPDATED:
				return UPDATED_EDEFAULT == null ? updated != null : !UPDATED_EDEFAULT.equals(updated);
			case ComputePackage.IMAGE__CREATED:
				return CREATED_EDEFAULT == null ? created != null : !CREATED_EDEFAULT.equals(created);
			case ComputePackage.IMAGE__TENANT_ID:
				return TENANT_ID_EDEFAULT == null ? tenant_id != null : !TENANT_ID_EDEFAULT.equals(tenant_id);
			case ComputePackage.IMAGE__USER_ID:
				return USER_ID_EDEFAULT == null ? user_id != null : !USER_ID_EDEFAULT.equals(user_id);
			case ComputePackage.IMAGE__STATUS:
				return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
			case ComputePackage.IMAGE__PROGRESS:
				return PROGRESS_EDEFAULT == null ? progress != null : !PROGRESS_EDEFAULT.equals(progress);
			case ComputePackage.IMAGE__MIN_DISK:
				return MIN_DISK_EDEFAULT == null ? minDisk != null : !MIN_DISK_EDEFAULT.equals(minDisk);
			case ComputePackage.IMAGE__MIN_RAM:
				return MIN_RAM_EDEFAULT == null ? minRam != null : !MIN_RAM_EDEFAULT.equals(minRam);
			case ComputePackage.IMAGE__OS_EXT_IMG_SIZE_SIZE:
				return OS_EXT_IMG_SIZE_SIZE_EDEFAULT == null ? oS_EXT_IMG_SIZE_size != null : !OS_EXT_IMG_SIZE_SIZE_EDEFAULT.equals(oS_EXT_IMG_SIZE_size);
			case ComputePackage.IMAGE__SERVER:
				return server != null;
			case ComputePackage.IMAGE__LINKS:
				return links != null && !links.isEmpty();
			case ComputePackage.IMAGE__METADATA:
				return metadata != null && !metadata.isEmpty();
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
		result.append(", updated: ");
		result.append(updated);
		result.append(", created: ");
		result.append(created);
		result.append(", tenant_id: ");
		result.append(tenant_id);
		result.append(", user_id: ");
		result.append(user_id);
		result.append(", status: ");
		result.append(status);
		result.append(", progress: ");
		result.append(progress);
		result.append(", minDisk: ");
		result.append(minDisk);
		result.append(", minRam: ");
		result.append(minRam);
		result.append(", OS_EXT_IMG_SIZE_size: ");
		result.append(oS_EXT_IMG_SIZE_size);
		result.append(')');
		return result.toString();
	}

} //ImageImpl
