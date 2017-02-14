
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

import org.openecomp.ncomp.openstack.location.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LocationFactoryImpl extends EFactoryImpl implements LocationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LocationFactory init() {
		try {
			LocationFactory theLocationFactory = (LocationFactory)EPackage.Registry.INSTANCE.getEFactory(LocationPackage.eNS_URI);
			if (theLocationFactory != null) {
				return theLocationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LocationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case LocationPackage.OPEN_STACK_LOCATION: return createOpenStackLocation();
			case LocationPackage.OPEN_STACK_PROJECT: return createOpenStackProject();
			case LocationPackage.OPEN_STACK_USER: return createOpenStackUser();
			case LocationPackage.HYPERVISOR_SERVICE: return createHypervisorService();
			case LocationPackage.HYPERVISOR_CPU_TOPOLOGY: return createHypervisorCpuTopology();
			case LocationPackage.HYPERVISOR_CPU_INFO: return createHypervisorCpuInfo();
			case LocationPackage.HYPERVISOR: return createHypervisor();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case LocationPackage.OPEN_STACK_VERSION:
				return createOpenStackVersionFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case LocationPackage.OPEN_STACK_VERSION:
				return convertOpenStackVersionToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenStackLocation createOpenStackLocation() {
		OpenStackLocationImpl openStackLocation = new OpenStackLocationImpl();
		return openStackLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenStackProject createOpenStackProject() {
		OpenStackProjectImpl openStackProject = new OpenStackProjectImpl();
		return openStackProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenStackUser createOpenStackUser() {
		OpenStackUserImpl openStackUser = new OpenStackUserImpl();
		return openStackUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HypervisorService createHypervisorService() {
		HypervisorServiceImpl hypervisorService = new HypervisorServiceImpl();
		return hypervisorService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HypervisorCpuTopology createHypervisorCpuTopology() {
		HypervisorCpuTopologyImpl hypervisorCpuTopology = new HypervisorCpuTopologyImpl();
		return hypervisorCpuTopology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HypervisorCpuInfo createHypervisorCpuInfo() {
		HypervisorCpuInfoImpl hypervisorCpuInfo = new HypervisorCpuInfoImpl();
		return hypervisorCpuInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hypervisor createHypervisor() {
		HypervisorImpl hypervisor = new HypervisorImpl();
		return hypervisor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenStackVersion createOpenStackVersionFromString(EDataType eDataType, String initialValue) {
		OpenStackVersion result = OpenStackVersion.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOpenStackVersionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationPackage getLocationPackage() {
		return (LocationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LocationPackage getPackage() {
		return LocationPackage.eINSTANCE;
	}

} //LocationFactoryImpl
