
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
package org.openecomp.ncomp.openstack.neutron.impl;

import org.openecomp.ncomp.openstack.neutron.CreateNetworkRequest;
import org.openecomp.ncomp.openstack.neutron.CreatePortRequest;
import org.openecomp.ncomp.openstack.neutron.CreateRouterRequest;
import org.openecomp.ncomp.openstack.neutron.CreateSubnetRequest;
import org.openecomp.ncomp.openstack.neutron.Network;
import org.openecomp.ncomp.openstack.neutron.NeutronPackage;
import org.openecomp.ncomp.openstack.neutron.NeutronService;
import org.openecomp.ncomp.openstack.neutron.Port;
import org.openecomp.ncomp.openstack.neutron.Router;
import org.openecomp.ncomp.openstack.neutron.Subnet;
import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class NeutronServiceImpl extends MinimalEObjectImpl.Container implements NeutronService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NeutronServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NeutronPackage.Literals.NEUTRON_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Network createNetwork(CreateNetworkRequest request) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subnet createSubnet(CreateSubnetRequest request) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port createPort(CreatePortRequest request) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Router createRouter(CreateRouterRequest request) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void deleteNetwork(String projectName, String name) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void deleteSubnet(String projectName, String name) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void deletePort(String projectName, String name) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void deleteRouter(String projectName, String name) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void associateFloatingIp(String projectName, String ipId, String portId) {
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case NeutronPackage.NEUTRON_SERVICE___CREATE_NETWORK__CREATENETWORKREQUEST:
				return createNetwork((CreateNetworkRequest)arguments.get(0));
			case NeutronPackage.NEUTRON_SERVICE___CREATE_SUBNET__CREATESUBNETREQUEST:
				return createSubnet((CreateSubnetRequest)arguments.get(0));
			case NeutronPackage.NEUTRON_SERVICE___CREATE_PORT__CREATEPORTREQUEST:
				return createPort((CreatePortRequest)arguments.get(0));
			case NeutronPackage.NEUTRON_SERVICE___CREATE_ROUTER__CREATEROUTERREQUEST:
				return createRouter((CreateRouterRequest)arguments.get(0));
			case NeutronPackage.NEUTRON_SERVICE___DELETE_NETWORK__STRING_STRING:
				deleteNetwork((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case NeutronPackage.NEUTRON_SERVICE___DELETE_SUBNET__STRING_STRING:
				deleteSubnet((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case NeutronPackage.NEUTRON_SERVICE___DELETE_PORT__STRING_STRING:
				deletePort((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case NeutronPackage.NEUTRON_SERVICE___DELETE_ROUTER__STRING_STRING:
				deleteRouter((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case NeutronPackage.NEUTRON_SERVICE___ASSOCIATE_FLOATING_IP__STRING_STRING_STRING:
				associateFloatingIp((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //NeutronServiceImpl
