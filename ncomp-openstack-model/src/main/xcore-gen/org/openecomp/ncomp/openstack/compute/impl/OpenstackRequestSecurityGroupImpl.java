
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
import org.openecomp.ncomp.openstack.compute.OpenstackRequestSecurityGroup;

import org.openecomp.ncomp.openstack.core.VirtualMachineType;

import org.openecomp.ncomp.openstack.core.impl.OpenStackRequestImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Openstack Request Security Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.impl.OpenstackRequestSecurityGroupImpl#getVmType <em>Vm Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OpenstackRequestSecurityGroupImpl extends OpenStackRequestImpl implements OpenstackRequestSecurityGroup {
	/**
	 * The cached value of the '{@link #getVmType() <em>Vm Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVmType()
	 * @generated
	 * @ordered
	 */
	protected VirtualMachineType vmType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OpenstackRequestSecurityGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComputePackage.Literals.OPENSTACK_REQUEST_SECURITY_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualMachineType getVmType() {
		return vmType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVmType(VirtualMachineType newVmType, NotificationChain msgs) {
		VirtualMachineType oldVmType = vmType;
		vmType = newVmType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComputePackage.OPENSTACK_REQUEST_SECURITY_GROUP__VM_TYPE, oldVmType, newVmType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVmType(VirtualMachineType newVmType) {
		if (newVmType != vmType) {
			NotificationChain msgs = null;
			if (vmType != null)
				msgs = ((InternalEObject)vmType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComputePackage.OPENSTACK_REQUEST_SECURITY_GROUP__VM_TYPE, null, msgs);
			if (newVmType != null)
				msgs = ((InternalEObject)newVmType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComputePackage.OPENSTACK_REQUEST_SECURITY_GROUP__VM_TYPE, null, msgs);
			msgs = basicSetVmType(newVmType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComputePackage.OPENSTACK_REQUEST_SECURITY_GROUP__VM_TYPE, newVmType, newVmType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComputePackage.OPENSTACK_REQUEST_SECURITY_GROUP__VM_TYPE:
				return basicSetVmType(null, msgs);
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
			case ComputePackage.OPENSTACK_REQUEST_SECURITY_GROUP__VM_TYPE:
				return getVmType();
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
			case ComputePackage.OPENSTACK_REQUEST_SECURITY_GROUP__VM_TYPE:
				setVmType((VirtualMachineType)newValue);
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
			case ComputePackage.OPENSTACK_REQUEST_SECURITY_GROUP__VM_TYPE:
				setVmType((VirtualMachineType)null);
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
			case ComputePackage.OPENSTACK_REQUEST_SECURITY_GROUP__VM_TYPE:
				return vmType != null;
		}
		return super.eIsSet(featureID);
	}

} //OpenstackRequestSecurityGroupImpl
