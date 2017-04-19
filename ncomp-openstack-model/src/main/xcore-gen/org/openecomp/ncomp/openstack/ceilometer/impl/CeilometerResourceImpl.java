
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
package org.openecomp.ncomp.openstack.ceilometer.impl;

import org.openecomp.ncomp.openstack.ceilometer.CeilometerPackage;
import org.openecomp.ncomp.openstack.ceilometer.CeilometerResource;

import org.openecomp.ncomp.openstack.compute.Link;
import org.openecomp.ncomp.openstack.compute.Metadata;
import java.util.Collection;
import java.util.Date;
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
 * An implementation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerResourceImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerResourceImpl#getUser_id <em>User id</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerResourceImpl#getProject_id <em>Project id</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerResourceImpl#getFirst_sample_timestamp <em>First sample timestamp</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerResourceImpl#getLast_sample_timestamp <em>Last sample timestamp</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerResourceImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.ceilometer.impl.CeilometerResourceImpl#getMetadata <em>Metadata</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CeilometerResourceImpl extends MinimalEObjectImpl.Container implements CeilometerResource {
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
	 * The default value of the '{@link #getProject_id() <em>Project id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProject_id()
	 * @generated
	 * @ordered
	 */
	protected static final String PROJECT_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getProject_id() <em>Project id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProject_id()
	 * @generated
	 * @ordered
	 */
	protected String project_id = PROJECT_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getFirst_sample_timestamp() <em>First sample timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirst_sample_timestamp()
	 * @generated
	 * @ordered
	 */
	protected static final Date FIRST_SAMPLE_TIMESTAMP_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getFirst_sample_timestamp() <em>First sample timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirst_sample_timestamp()
	 * @generated
	 * @ordered
	 */
	protected Date first_sample_timestamp = FIRST_SAMPLE_TIMESTAMP_EDEFAULT;
	/**
	 * The default value of the '{@link #getLast_sample_timestamp() <em>Last sample timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLast_sample_timestamp()
	 * @generated
	 * @ordered
	 */
	protected static final Date LAST_SAMPLE_TIMESTAMP_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getLast_sample_timestamp() <em>Last sample timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLast_sample_timestamp()
	 * @generated
	 * @ordered
	 */
	protected Date last_sample_timestamp = LAST_SAMPLE_TIMESTAMP_EDEFAULT;
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
	 * The cached value of the '{@link #getMetadata() <em>Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadata()
	 * @generated
	 * @ordered
	 */
	protected Metadata metadata;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CeilometerResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CeilometerPackage.Literals.CEILOMETER_RESOURCE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CeilometerPackage.CEILOMETER_RESOURCE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CeilometerPackage.CEILOMETER_RESOURCE__USER_ID, oldUser_id, user_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProject_id() {
		return project_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProject_id(String newProject_id) {
		String oldProject_id = project_id;
		project_id = newProject_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CeilometerPackage.CEILOMETER_RESOURCE__PROJECT_ID, oldProject_id, project_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getFirst_sample_timestamp() {
		return first_sample_timestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirst_sample_timestamp(Date newFirst_sample_timestamp) {
		Date oldFirst_sample_timestamp = first_sample_timestamp;
		first_sample_timestamp = newFirst_sample_timestamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CeilometerPackage.CEILOMETER_RESOURCE__FIRST_SAMPLE_TIMESTAMP, oldFirst_sample_timestamp, first_sample_timestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getLast_sample_timestamp() {
		return last_sample_timestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLast_sample_timestamp(Date newLast_sample_timestamp) {
		Date oldLast_sample_timestamp = last_sample_timestamp;
		last_sample_timestamp = newLast_sample_timestamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CeilometerPackage.CEILOMETER_RESOURCE__LAST_SAMPLE_TIMESTAMP, oldLast_sample_timestamp, last_sample_timestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Link> getLinks() {
		if (links == null) {
			links = new EObjectContainmentEList<Link>(Link.class, this, CeilometerPackage.CEILOMETER_RESOURCE__LINKS);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metadata getMetadata() {
		return metadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetadata(Metadata newMetadata, NotificationChain msgs) {
		Metadata oldMetadata = metadata;
		metadata = newMetadata;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CeilometerPackage.CEILOMETER_RESOURCE__METADATA, oldMetadata, newMetadata);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetadata(Metadata newMetadata) {
		if (newMetadata != metadata) {
			NotificationChain msgs = null;
			if (metadata != null)
				msgs = ((InternalEObject)metadata).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CeilometerPackage.CEILOMETER_RESOURCE__METADATA, null, msgs);
			if (newMetadata != null)
				msgs = ((InternalEObject)newMetadata).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CeilometerPackage.CEILOMETER_RESOURCE__METADATA, null, msgs);
			msgs = basicSetMetadata(newMetadata, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CeilometerPackage.CEILOMETER_RESOURCE__METADATA, newMetadata, newMetadata));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CeilometerPackage.CEILOMETER_RESOURCE__LINKS:
				return ((InternalEList<?>)getLinks()).basicRemove(otherEnd, msgs);
			case CeilometerPackage.CEILOMETER_RESOURCE__METADATA:
				return basicSetMetadata(null, msgs);
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
			case CeilometerPackage.CEILOMETER_RESOURCE__ID:
				return getId();
			case CeilometerPackage.CEILOMETER_RESOURCE__USER_ID:
				return getUser_id();
			case CeilometerPackage.CEILOMETER_RESOURCE__PROJECT_ID:
				return getProject_id();
			case CeilometerPackage.CEILOMETER_RESOURCE__FIRST_SAMPLE_TIMESTAMP:
				return getFirst_sample_timestamp();
			case CeilometerPackage.CEILOMETER_RESOURCE__LAST_SAMPLE_TIMESTAMP:
				return getLast_sample_timestamp();
			case CeilometerPackage.CEILOMETER_RESOURCE__LINKS:
				return getLinks();
			case CeilometerPackage.CEILOMETER_RESOURCE__METADATA:
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
			case CeilometerPackage.CEILOMETER_RESOURCE__ID:
				setId((String)newValue);
				return;
			case CeilometerPackage.CEILOMETER_RESOURCE__USER_ID:
				setUser_id((String)newValue);
				return;
			case CeilometerPackage.CEILOMETER_RESOURCE__PROJECT_ID:
				setProject_id((String)newValue);
				return;
			case CeilometerPackage.CEILOMETER_RESOURCE__FIRST_SAMPLE_TIMESTAMP:
				setFirst_sample_timestamp((Date)newValue);
				return;
			case CeilometerPackage.CEILOMETER_RESOURCE__LAST_SAMPLE_TIMESTAMP:
				setLast_sample_timestamp((Date)newValue);
				return;
			case CeilometerPackage.CEILOMETER_RESOURCE__LINKS:
				getLinks().clear();
				getLinks().addAll((Collection<? extends Link>)newValue);
				return;
			case CeilometerPackage.CEILOMETER_RESOURCE__METADATA:
				setMetadata((Metadata)newValue);
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
			case CeilometerPackage.CEILOMETER_RESOURCE__ID:
				setId(ID_EDEFAULT);
				return;
			case CeilometerPackage.CEILOMETER_RESOURCE__USER_ID:
				setUser_id(USER_ID_EDEFAULT);
				return;
			case CeilometerPackage.CEILOMETER_RESOURCE__PROJECT_ID:
				setProject_id(PROJECT_ID_EDEFAULT);
				return;
			case CeilometerPackage.CEILOMETER_RESOURCE__FIRST_SAMPLE_TIMESTAMP:
				setFirst_sample_timestamp(FIRST_SAMPLE_TIMESTAMP_EDEFAULT);
				return;
			case CeilometerPackage.CEILOMETER_RESOURCE__LAST_SAMPLE_TIMESTAMP:
				setLast_sample_timestamp(LAST_SAMPLE_TIMESTAMP_EDEFAULT);
				return;
			case CeilometerPackage.CEILOMETER_RESOURCE__LINKS:
				getLinks().clear();
				return;
			case CeilometerPackage.CEILOMETER_RESOURCE__METADATA:
				setMetadata((Metadata)null);
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
			case CeilometerPackage.CEILOMETER_RESOURCE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case CeilometerPackage.CEILOMETER_RESOURCE__USER_ID:
				return USER_ID_EDEFAULT == null ? user_id != null : !USER_ID_EDEFAULT.equals(user_id);
			case CeilometerPackage.CEILOMETER_RESOURCE__PROJECT_ID:
				return PROJECT_ID_EDEFAULT == null ? project_id != null : !PROJECT_ID_EDEFAULT.equals(project_id);
			case CeilometerPackage.CEILOMETER_RESOURCE__FIRST_SAMPLE_TIMESTAMP:
				return FIRST_SAMPLE_TIMESTAMP_EDEFAULT == null ? first_sample_timestamp != null : !FIRST_SAMPLE_TIMESTAMP_EDEFAULT.equals(first_sample_timestamp);
			case CeilometerPackage.CEILOMETER_RESOURCE__LAST_SAMPLE_TIMESTAMP:
				return LAST_SAMPLE_TIMESTAMP_EDEFAULT == null ? last_sample_timestamp != null : !LAST_SAMPLE_TIMESTAMP_EDEFAULT.equals(last_sample_timestamp);
			case CeilometerPackage.CEILOMETER_RESOURCE__LINKS:
				return links != null && !links.isEmpty();
			case CeilometerPackage.CEILOMETER_RESOURCE__METADATA:
				return metadata != null;
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
		result.append(", user_id: ");
		result.append(user_id);
		result.append(", project_id: ");
		result.append(project_id);
		result.append(", first_sample_timestamp: ");
		result.append(first_sample_timestamp);
		result.append(", last_sample_timestamp: ");
		result.append(last_sample_timestamp);
		result.append(')');
		return result.toString();
	}

} //CeilometerResourceImpl
