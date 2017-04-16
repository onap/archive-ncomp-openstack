
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
package org.openecomp.ncomp.openstack.location.util;

import org.openecomp.ncomp.core.NamedEntity;

import org.openecomp.ncomp.openstack.ceilometer.CeilometerProject;
import org.openecomp.ncomp.openstack.ceilometer.CeilometerService;
import org.openecomp.ncomp.openstack.compute.ComputeService;

import org.openecomp.ncomp.openstack.location.*;

import org.openecomp.ncomp.openstack.neutron.NeutronService;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.openecomp.ncomp.openstack.location.LocationPackage
 * @generated
 */
public class LocationSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LocationPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationSwitch() {
		if (modelPackage == null) {
			modelPackage = LocationPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case LocationPackage.OPEN_STACK_LOCATION: {
				OpenStackLocation openStackLocation = (OpenStackLocation)theEObject;
				T result = caseOpenStackLocation(openStackLocation);
				if (result == null) result = caseNamedEntity(openStackLocation);
				if (result == null) result = caseNeutronService(openStackLocation);
				if (result == null) result = caseComputeService(openStackLocation);
				if (result == null) result = caseCeilometerService(openStackLocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LocationPackage.OPEN_STACK_PROJECT: {
				OpenStackProject openStackProject = (OpenStackProject)theEObject;
				T result = caseOpenStackProject(openStackProject);
				if (result == null) result = caseNamedEntity(openStackProject);
				if (result == null) result = caseCeilometerProject(openStackProject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LocationPackage.OPEN_STACK_USER: {
				OpenStackUser openStackUser = (OpenStackUser)theEObject;
				T result = caseOpenStackUser(openStackUser);
				if (result == null) result = caseNamedEntity(openStackUser);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LocationPackage.HYPERVISOR_SERVICE: {
				HypervisorService hypervisorService = (HypervisorService)theEObject;
				T result = caseHypervisorService(hypervisorService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LocationPackage.HYPERVISOR_CPU_TOPOLOGY: {
				HypervisorCpuTopology hypervisorCpuTopology = (HypervisorCpuTopology)theEObject;
				T result = caseHypervisorCpuTopology(hypervisorCpuTopology);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LocationPackage.HYPERVISOR_CPU_INFO: {
				HypervisorCpuInfo hypervisorCpuInfo = (HypervisorCpuInfo)theEObject;
				T result = caseHypervisorCpuInfo(hypervisorCpuInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LocationPackage.HYPERVISOR: {
				Hypervisor hypervisor = (Hypervisor)theEObject;
				T result = caseHypervisor(hypervisor);
				if (result == null) result = caseNamedEntity(hypervisor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Open Stack Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Open Stack Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpenStackLocation(OpenStackLocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Open Stack Project</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Open Stack Project</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpenStackProject(OpenStackProject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Open Stack User</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Open Stack User</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpenStackUser(OpenStackUser object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hypervisor Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hypervisor Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHypervisorService(HypervisorService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hypervisor Cpu Topology</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hypervisor Cpu Topology</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHypervisorCpuTopology(HypervisorCpuTopology object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hypervisor Cpu Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hypervisor Cpu Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHypervisorCpuInfo(HypervisorCpuInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hypervisor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hypervisor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHypervisor(Hypervisor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedEntity(NamedEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNeutronService(NeutronService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComputeService(ComputeService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCeilometerService(CeilometerService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Project</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Project</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCeilometerProject(CeilometerProject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //LocationSwitch
