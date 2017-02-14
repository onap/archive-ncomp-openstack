
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
import org.openecomp.ncomp.openstack.compute.Flavor;
import org.openecomp.ncomp.openstack.compute.Link;

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
 * An implementation of the model object '<em><b>Flavor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.impl.FlavorImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.impl.FlavorImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.impl.FlavorImpl#getRam <em>Ram</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.impl.FlavorImpl#getDisk <em>Disk</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.impl.FlavorImpl#getVcpus <em>Vcpus</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.impl.FlavorImpl#getSwap <em>Swap</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.impl.FlavorImpl#getRxtx_factor <em>Rxtx factor</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.impl.FlavorImpl#getOS_FLV_EXT_DATA_ephemeral <em>OS FLV EXT DATA ephemeral</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.impl.FlavorImpl#isOS_FLV_DISABLED_disabled <em>OS FLV DISABLED disabled</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.impl.FlavorImpl#isOs_flavor_access_is_public <em>Os flavor access is public</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.impl.FlavorImpl#getLinks <em>Links</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FlavorImpl extends MinimalEObjectImpl.Container implements Flavor {
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
	 * The default value of the '{@link #getRam() <em>Ram</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRam()
	 * @generated
	 * @ordered
	 */
	protected static final int RAM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRam() <em>Ram</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRam()
	 * @generated
	 * @ordered
	 */
	protected int ram = RAM_EDEFAULT;

	/**
	 * The default value of the '{@link #getDisk() <em>Disk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisk()
	 * @generated
	 * @ordered
	 */
	protected static final int DISK_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDisk() <em>Disk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisk()
	 * @generated
	 * @ordered
	 */
	protected int disk = DISK_EDEFAULT;

	/**
	 * The default value of the '{@link #getVcpus() <em>Vcpus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVcpus()
	 * @generated
	 * @ordered
	 */
	protected static final int VCPUS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getVcpus() <em>Vcpus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVcpus()
	 * @generated
	 * @ordered
	 */
	protected int vcpus = VCPUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSwap() <em>Swap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwap()
	 * @generated
	 * @ordered
	 */
	protected static final String SWAP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSwap() <em>Swap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwap()
	 * @generated
	 * @ordered
	 */
	protected String swap = SWAP_EDEFAULT;

	/**
	 * The default value of the '{@link #getRxtx_factor() <em>Rxtx factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRxtx_factor()
	 * @generated
	 * @ordered
	 */
	protected static final double RXTX_FACTOR_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRxtx_factor() <em>Rxtx factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRxtx_factor()
	 * @generated
	 * @ordered
	 */
	protected double rxtx_factor = RXTX_FACTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getOS_FLV_EXT_DATA_ephemeral() <em>OS FLV EXT DATA ephemeral</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOS_FLV_EXT_DATA_ephemeral()
	 * @generated
	 * @ordered
	 */
	protected static final int OS_FLV_EXT_DATA_EPHEMERAL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOS_FLV_EXT_DATA_ephemeral() <em>OS FLV EXT DATA ephemeral</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOS_FLV_EXT_DATA_ephemeral()
	 * @generated
	 * @ordered
	 */
	protected int oS_FLV_EXT_DATA_ephemeral = OS_FLV_EXT_DATA_EPHEMERAL_EDEFAULT;

	/**
	 * The default value of the '{@link #isOS_FLV_DISABLED_disabled() <em>OS FLV DISABLED disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOS_FLV_DISABLED_disabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OS_FLV_DISABLED_DISABLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOS_FLV_DISABLED_disabled() <em>OS FLV DISABLED disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOS_FLV_DISABLED_disabled()
	 * @generated
	 * @ordered
	 */
	protected boolean oS_FLV_DISABLED_disabled = OS_FLV_DISABLED_DISABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #isOs_flavor_access_is_public() <em>Os flavor access is public</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOs_flavor_access_is_public()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OS_FLAVOR_ACCESS_IS_PUBLIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOs_flavor_access_is_public() <em>Os flavor access is public</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOs_flavor_access_is_public()
	 * @generated
	 * @ordered
	 */
	protected boolean os_flavor_access_is_public = OS_FLAVOR_ACCESS_IS_PUBLIC_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlavorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComputePackage.Literals.FLAVOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComputePackage.FLAVOR__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComputePackage.FLAVOR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRam() {
		return ram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRam(int newRam) {
		int oldRam = ram;
		ram = newRam;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputePackage.FLAVOR__RAM, oldRam, ram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDisk() {
		return disk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisk(int newDisk) {
		int oldDisk = disk;
		disk = newDisk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputePackage.FLAVOR__DISK, oldDisk, disk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getVcpus() {
		return vcpus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVcpus(int newVcpus) {
		int oldVcpus = vcpus;
		vcpus = newVcpus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputePackage.FLAVOR__VCPUS, oldVcpus, vcpus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSwap() {
		return swap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwap(String newSwap) {
		String oldSwap = swap;
		swap = newSwap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputePackage.FLAVOR__SWAP, oldSwap, swap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRxtx_factor() {
		return rxtx_factor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRxtx_factor(double newRxtx_factor) {
		double oldRxtx_factor = rxtx_factor;
		rxtx_factor = newRxtx_factor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputePackage.FLAVOR__RXTX_FACTOR, oldRxtx_factor, rxtx_factor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOS_FLV_EXT_DATA_ephemeral() {
		return oS_FLV_EXT_DATA_ephemeral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOS_FLV_EXT_DATA_ephemeral(int newOS_FLV_EXT_DATA_ephemeral) {
		int oldOS_FLV_EXT_DATA_ephemeral = oS_FLV_EXT_DATA_ephemeral;
		oS_FLV_EXT_DATA_ephemeral = newOS_FLV_EXT_DATA_ephemeral;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputePackage.FLAVOR__OS_FLV_EXT_DATA_EPHEMERAL, oldOS_FLV_EXT_DATA_ephemeral, oS_FLV_EXT_DATA_ephemeral));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOS_FLV_DISABLED_disabled() {
		return oS_FLV_DISABLED_disabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOS_FLV_DISABLED_disabled(boolean newOS_FLV_DISABLED_disabled) {
		boolean oldOS_FLV_DISABLED_disabled = oS_FLV_DISABLED_disabled;
		oS_FLV_DISABLED_disabled = newOS_FLV_DISABLED_disabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputePackage.FLAVOR__OS_FLV_DISABLED_DISABLED, oldOS_FLV_DISABLED_disabled, oS_FLV_DISABLED_disabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOs_flavor_access_is_public() {
		return os_flavor_access_is_public;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOs_flavor_access_is_public(boolean newOs_flavor_access_is_public) {
		boolean oldOs_flavor_access_is_public = os_flavor_access_is_public;
		os_flavor_access_is_public = newOs_flavor_access_is_public;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputePackage.FLAVOR__OS_FLAVOR_ACCESS_IS_PUBLIC, oldOs_flavor_access_is_public, os_flavor_access_is_public));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Link> getLinks() {
		if (links == null) {
			links = new EObjectContainmentEList<Link>(Link.class, this, ComputePackage.FLAVOR__LINKS);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComputePackage.FLAVOR__LINKS:
				return ((InternalEList<?>)getLinks()).basicRemove(otherEnd, msgs);
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
			case ComputePackage.FLAVOR__ID:
				return getId();
			case ComputePackage.FLAVOR__NAME:
				return getName();
			case ComputePackage.FLAVOR__RAM:
				return getRam();
			case ComputePackage.FLAVOR__DISK:
				return getDisk();
			case ComputePackage.FLAVOR__VCPUS:
				return getVcpus();
			case ComputePackage.FLAVOR__SWAP:
				return getSwap();
			case ComputePackage.FLAVOR__RXTX_FACTOR:
				return getRxtx_factor();
			case ComputePackage.FLAVOR__OS_FLV_EXT_DATA_EPHEMERAL:
				return getOS_FLV_EXT_DATA_ephemeral();
			case ComputePackage.FLAVOR__OS_FLV_DISABLED_DISABLED:
				return isOS_FLV_DISABLED_disabled();
			case ComputePackage.FLAVOR__OS_FLAVOR_ACCESS_IS_PUBLIC:
				return isOs_flavor_access_is_public();
			case ComputePackage.FLAVOR__LINKS:
				return getLinks();
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
			case ComputePackage.FLAVOR__ID:
				setId((String)newValue);
				return;
			case ComputePackage.FLAVOR__NAME:
				setName((String)newValue);
				return;
			case ComputePackage.FLAVOR__RAM:
				setRam((Integer)newValue);
				return;
			case ComputePackage.FLAVOR__DISK:
				setDisk((Integer)newValue);
				return;
			case ComputePackage.FLAVOR__VCPUS:
				setVcpus((Integer)newValue);
				return;
			case ComputePackage.FLAVOR__SWAP:
				setSwap((String)newValue);
				return;
			case ComputePackage.FLAVOR__RXTX_FACTOR:
				setRxtx_factor((Double)newValue);
				return;
			case ComputePackage.FLAVOR__OS_FLV_EXT_DATA_EPHEMERAL:
				setOS_FLV_EXT_DATA_ephemeral((Integer)newValue);
				return;
			case ComputePackage.FLAVOR__OS_FLV_DISABLED_DISABLED:
				setOS_FLV_DISABLED_disabled((Boolean)newValue);
				return;
			case ComputePackage.FLAVOR__OS_FLAVOR_ACCESS_IS_PUBLIC:
				setOs_flavor_access_is_public((Boolean)newValue);
				return;
			case ComputePackage.FLAVOR__LINKS:
				getLinks().clear();
				getLinks().addAll((Collection<? extends Link>)newValue);
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
			case ComputePackage.FLAVOR__ID:
				setId(ID_EDEFAULT);
				return;
			case ComputePackage.FLAVOR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ComputePackage.FLAVOR__RAM:
				setRam(RAM_EDEFAULT);
				return;
			case ComputePackage.FLAVOR__DISK:
				setDisk(DISK_EDEFAULT);
				return;
			case ComputePackage.FLAVOR__VCPUS:
				setVcpus(VCPUS_EDEFAULT);
				return;
			case ComputePackage.FLAVOR__SWAP:
				setSwap(SWAP_EDEFAULT);
				return;
			case ComputePackage.FLAVOR__RXTX_FACTOR:
				setRxtx_factor(RXTX_FACTOR_EDEFAULT);
				return;
			case ComputePackage.FLAVOR__OS_FLV_EXT_DATA_EPHEMERAL:
				setOS_FLV_EXT_DATA_ephemeral(OS_FLV_EXT_DATA_EPHEMERAL_EDEFAULT);
				return;
			case ComputePackage.FLAVOR__OS_FLV_DISABLED_DISABLED:
				setOS_FLV_DISABLED_disabled(OS_FLV_DISABLED_DISABLED_EDEFAULT);
				return;
			case ComputePackage.FLAVOR__OS_FLAVOR_ACCESS_IS_PUBLIC:
				setOs_flavor_access_is_public(OS_FLAVOR_ACCESS_IS_PUBLIC_EDEFAULT);
				return;
			case ComputePackage.FLAVOR__LINKS:
				getLinks().clear();
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
			case ComputePackage.FLAVOR__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ComputePackage.FLAVOR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ComputePackage.FLAVOR__RAM:
				return ram != RAM_EDEFAULT;
			case ComputePackage.FLAVOR__DISK:
				return disk != DISK_EDEFAULT;
			case ComputePackage.FLAVOR__VCPUS:
				return vcpus != VCPUS_EDEFAULT;
			case ComputePackage.FLAVOR__SWAP:
				return SWAP_EDEFAULT == null ? swap != null : !SWAP_EDEFAULT.equals(swap);
			case ComputePackage.FLAVOR__RXTX_FACTOR:
				return rxtx_factor != RXTX_FACTOR_EDEFAULT;
			case ComputePackage.FLAVOR__OS_FLV_EXT_DATA_EPHEMERAL:
				return oS_FLV_EXT_DATA_ephemeral != OS_FLV_EXT_DATA_EPHEMERAL_EDEFAULT;
			case ComputePackage.FLAVOR__OS_FLV_DISABLED_DISABLED:
				return oS_FLV_DISABLED_disabled != OS_FLV_DISABLED_DISABLED_EDEFAULT;
			case ComputePackage.FLAVOR__OS_FLAVOR_ACCESS_IS_PUBLIC:
				return os_flavor_access_is_public != OS_FLAVOR_ACCESS_IS_PUBLIC_EDEFAULT;
			case ComputePackage.FLAVOR__LINKS:
				return links != null && !links.isEmpty();
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
		result.append(", ram: ");
		result.append(ram);
		result.append(", disk: ");
		result.append(disk);
		result.append(", vcpus: ");
		result.append(vcpus);
		result.append(", swap: ");
		result.append(swap);
		result.append(", rxtx_factor: ");
		result.append(rxtx_factor);
		result.append(", OS_FLV_EXT_DATA_ephemeral: ");
		result.append(oS_FLV_EXT_DATA_ephemeral);
		result.append(", OS_FLV_DISABLED_disabled: ");
		result.append(oS_FLV_DISABLED_disabled);
		result.append(", os_flavor_access_is_public: ");
		result.append(os_flavor_access_is_public);
		result.append(')');
		return result.toString();
	}

} //FlavorImpl
