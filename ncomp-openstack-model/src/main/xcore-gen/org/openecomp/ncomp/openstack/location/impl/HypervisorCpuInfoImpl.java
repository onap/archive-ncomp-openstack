
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
package org.openecomp.ncomp.openstack.location.impl;

import org.openecomp.ncomp.openstack.location.HypervisorCpuInfo;
import org.openecomp.ncomp.openstack.location.HypervisorCpuTopology;
import org.openecomp.ncomp.openstack.location.LocationPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hypervisor Cpu Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.openstack.location.impl.HypervisorCpuInfoImpl#getVendor <em>Vendor</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.impl.HypervisorCpuInfoImpl#getModel <em>Model</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.impl.HypervisorCpuInfoImpl#getArch <em>Arch</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.impl.HypervisorCpuInfoImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.impl.HypervisorCpuInfoImpl#getTopology <em>Topology</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HypervisorCpuInfoImpl extends MinimalEObjectImpl.Container implements HypervisorCpuInfo {
	/**
	 * The default value of the '{@link #getVendor() <em>Vendor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendor()
	 * @generated
	 * @ordered
	 */
	protected static final String VENDOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVendor() <em>Vendor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendor()
	 * @generated
	 * @ordered
	 */
	protected String vendor = VENDOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getModel() <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected String model = MODEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getArch() <em>Arch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArch()
	 * @generated
	 * @ordered
	 */
	protected static final String ARCH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArch() <em>Arch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArch()
	 * @generated
	 * @ordered
	 */
	protected String arch = ARCH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<String> features;

	/**
	 * The cached value of the '{@link #getTopology() <em>Topology</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopology()
	 * @generated
	 * @ordered
	 */
	protected HypervisorCpuTopology topology;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HypervisorCpuInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LocationPackage.Literals.HYPERVISOR_CPU_INFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVendor() {
		return vendor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVendor(String newVendor) {
		String oldVendor = vendor;
		vendor = newVendor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationPackage.HYPERVISOR_CPU_INFO__VENDOR, oldVendor, vendor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModel() {
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(String newModel) {
		String oldModel = model;
		model = newModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationPackage.HYPERVISOR_CPU_INFO__MODEL, oldModel, model));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getArch() {
		return arch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArch(String newArch) {
		String oldArch = arch;
		arch = newArch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationPackage.HYPERVISOR_CPU_INFO__ARCH, oldArch, arch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getFeatures() {
		if (features == null) {
			features = new EDataTypeEList<String>(String.class, this, LocationPackage.HYPERVISOR_CPU_INFO__FEATURES);
		}
		return features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HypervisorCpuTopology getTopology() {
		return topology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTopology(HypervisorCpuTopology newTopology, NotificationChain msgs) {
		HypervisorCpuTopology oldTopology = topology;
		topology = newTopology;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LocationPackage.HYPERVISOR_CPU_INFO__TOPOLOGY, oldTopology, newTopology);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopology(HypervisorCpuTopology newTopology) {
		if (newTopology != topology) {
			NotificationChain msgs = null;
			if (topology != null)
				msgs = ((InternalEObject)topology).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LocationPackage.HYPERVISOR_CPU_INFO__TOPOLOGY, null, msgs);
			if (newTopology != null)
				msgs = ((InternalEObject)newTopology).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LocationPackage.HYPERVISOR_CPU_INFO__TOPOLOGY, null, msgs);
			msgs = basicSetTopology(newTopology, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationPackage.HYPERVISOR_CPU_INFO__TOPOLOGY, newTopology, newTopology));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LocationPackage.HYPERVISOR_CPU_INFO__TOPOLOGY:
				return basicSetTopology(null, msgs);
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
			case LocationPackage.HYPERVISOR_CPU_INFO__VENDOR:
				return getVendor();
			case LocationPackage.HYPERVISOR_CPU_INFO__MODEL:
				return getModel();
			case LocationPackage.HYPERVISOR_CPU_INFO__ARCH:
				return getArch();
			case LocationPackage.HYPERVISOR_CPU_INFO__FEATURES:
				return getFeatures();
			case LocationPackage.HYPERVISOR_CPU_INFO__TOPOLOGY:
				return getTopology();
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
			case LocationPackage.HYPERVISOR_CPU_INFO__VENDOR:
				setVendor((String)newValue);
				return;
			case LocationPackage.HYPERVISOR_CPU_INFO__MODEL:
				setModel((String)newValue);
				return;
			case LocationPackage.HYPERVISOR_CPU_INFO__ARCH:
				setArch((String)newValue);
				return;
			case LocationPackage.HYPERVISOR_CPU_INFO__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends String>)newValue);
				return;
			case LocationPackage.HYPERVISOR_CPU_INFO__TOPOLOGY:
				setTopology((HypervisorCpuTopology)newValue);
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
			case LocationPackage.HYPERVISOR_CPU_INFO__VENDOR:
				setVendor(VENDOR_EDEFAULT);
				return;
			case LocationPackage.HYPERVISOR_CPU_INFO__MODEL:
				setModel(MODEL_EDEFAULT);
				return;
			case LocationPackage.HYPERVISOR_CPU_INFO__ARCH:
				setArch(ARCH_EDEFAULT);
				return;
			case LocationPackage.HYPERVISOR_CPU_INFO__FEATURES:
				getFeatures().clear();
				return;
			case LocationPackage.HYPERVISOR_CPU_INFO__TOPOLOGY:
				setTopology((HypervisorCpuTopology)null);
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
			case LocationPackage.HYPERVISOR_CPU_INFO__VENDOR:
				return VENDOR_EDEFAULT == null ? vendor != null : !VENDOR_EDEFAULT.equals(vendor);
			case LocationPackage.HYPERVISOR_CPU_INFO__MODEL:
				return MODEL_EDEFAULT == null ? model != null : !MODEL_EDEFAULT.equals(model);
			case LocationPackage.HYPERVISOR_CPU_INFO__ARCH:
				return ARCH_EDEFAULT == null ? arch != null : !ARCH_EDEFAULT.equals(arch);
			case LocationPackage.HYPERVISOR_CPU_INFO__FEATURES:
				return features != null && !features.isEmpty();
			case LocationPackage.HYPERVISOR_CPU_INFO__TOPOLOGY:
				return topology != null;
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
		result.append(" (vendor: ");
		result.append(vendor);
		result.append(", model: ");
		result.append(model);
		result.append(", arch: ");
		result.append(arch);
		result.append(", features: ");
		result.append(features);
		result.append(')');
		return result.toString();
	}

} //HypervisorCpuInfoImpl
