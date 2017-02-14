
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
package org.openecomp.ncomp.openstack.impl;

import org.openecomp.ncomp.core.User;
import org.openecomp.ncomp.openstack.OpenStackController;
import org.openecomp.ncomp.openstack.OpenstackPackage;
import org.openecomp.ncomp.openstack.core.VirtualMachineType;
import org.openecomp.ncomp.openstack.location.OpenStackLocation;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.json.JSONObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Open Stack Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.openstack.impl.OpenStackControllerImpl#getLocations <em>Locations</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.impl.OpenStackControllerImpl#getVmTypes <em>Vm Types</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.impl.OpenStackControllerImpl#getUsers <em>Users</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OpenStackControllerImpl extends MinimalEObjectImpl.Container implements OpenStackController {
	/**
	 * The cached value of the '{@link #getLocations() <em>Locations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<OpenStackLocation> locations;

	/**
	 * The cached value of the '{@link #getVmTypes() <em>Vm Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVmTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<VirtualMachineType> vmTypes;

	/**
	 * The cached value of the '{@link #getUsers() <em>Users</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsers()
	 * @generated
	 * @ordered
	 */
	protected EList<User> users;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OpenStackControllerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpenstackPackage.Literals.OPEN_STACK_CONTROLLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OpenStackLocation> getLocations() {
		if (locations == null) {
			locations = new EObjectContainmentEList<OpenStackLocation>(OpenStackLocation.class, this, OpenstackPackage.OPEN_STACK_CONTROLLER__LOCATIONS);
		}
		return locations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VirtualMachineType> getVmTypes() {
		if (vmTypes == null) {
			vmTypes = new EObjectContainmentEList<VirtualMachineType>(VirtualMachineType.class, this, OpenstackPackage.OPEN_STACK_CONTROLLER__VM_TYPES);
		}
		return vmTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<User> getUsers() {
		if (users == null) {
			users = new EObjectContainmentEList<User>(User.class, this, OpenstackPackage.OPEN_STACK_CONTROLLER__USERS);
		}
		return users;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void uploadOpenstackConfiguration(JSONObject cx, OpenStackLocation loc) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OpenstackPackage.OPEN_STACK_CONTROLLER__LOCATIONS:
				return ((InternalEList<?>)getLocations()).basicRemove(otherEnd, msgs);
			case OpenstackPackage.OPEN_STACK_CONTROLLER__VM_TYPES:
				return ((InternalEList<?>)getVmTypes()).basicRemove(otherEnd, msgs);
			case OpenstackPackage.OPEN_STACK_CONTROLLER__USERS:
				return ((InternalEList<?>)getUsers()).basicRemove(otherEnd, msgs);
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
			case OpenstackPackage.OPEN_STACK_CONTROLLER__LOCATIONS:
				return getLocations();
			case OpenstackPackage.OPEN_STACK_CONTROLLER__VM_TYPES:
				return getVmTypes();
			case OpenstackPackage.OPEN_STACK_CONTROLLER__USERS:
				return getUsers();
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
			case OpenstackPackage.OPEN_STACK_CONTROLLER__LOCATIONS:
				getLocations().clear();
				getLocations().addAll((Collection<? extends OpenStackLocation>)newValue);
				return;
			case OpenstackPackage.OPEN_STACK_CONTROLLER__VM_TYPES:
				getVmTypes().clear();
				getVmTypes().addAll((Collection<? extends VirtualMachineType>)newValue);
				return;
			case OpenstackPackage.OPEN_STACK_CONTROLLER__USERS:
				getUsers().clear();
				getUsers().addAll((Collection<? extends User>)newValue);
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
			case OpenstackPackage.OPEN_STACK_CONTROLLER__LOCATIONS:
				getLocations().clear();
				return;
			case OpenstackPackage.OPEN_STACK_CONTROLLER__VM_TYPES:
				getVmTypes().clear();
				return;
			case OpenstackPackage.OPEN_STACK_CONTROLLER__USERS:
				getUsers().clear();
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
			case OpenstackPackage.OPEN_STACK_CONTROLLER__LOCATIONS:
				return locations != null && !locations.isEmpty();
			case OpenstackPackage.OPEN_STACK_CONTROLLER__VM_TYPES:
				return vmTypes != null && !vmTypes.isEmpty();
			case OpenstackPackage.OPEN_STACK_CONTROLLER__USERS:
				return users != null && !users.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case OpenstackPackage.OPEN_STACK_CONTROLLER___UPLOAD_OPENSTACK_CONFIGURATION__JSONOBJECT_OPENSTACKLOCATION:
				uploadOpenstackConfiguration((JSONObject)arguments.get(0), (OpenStackLocation)arguments.get(1));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //OpenStackControllerImpl
