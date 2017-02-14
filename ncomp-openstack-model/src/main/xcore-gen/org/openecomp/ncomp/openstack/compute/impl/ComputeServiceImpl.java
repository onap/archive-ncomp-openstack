
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

import org.openecomp.ncomp.core.User;
import org.openecomp.ncomp.openstack.compute.ComputePackage;
import org.openecomp.ncomp.openstack.compute.ComputeService;
import org.openecomp.ncomp.openstack.compute.OpenstackRequestFlavor;
import org.openecomp.ncomp.openstack.compute.OpenstackRequestKeyPair;
import org.openecomp.ncomp.openstack.compute.OpenstackRequestNewServer;
import org.openecomp.ncomp.openstack.compute.OpenstackRequestSecurityGroup;
import org.openecomp.ncomp.openstack.compute.OpenstackRequestServerAction;
import org.openecomp.ncomp.openstack.core.OpenstackRequestDelete;
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
public abstract class ComputeServiceImpl extends MinimalEObjectImpl.Container implements ComputeService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComputeServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComputePackage.Literals.COMPUTE_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createServer(OpenstackRequestNewServer request) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void deleteServer(String projectName, String name) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createKeyPair(OpenstackRequestKeyPair request) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void delete(OpenstackRequestDelete request) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createFlavor(OpenstackRequestFlavor request) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createSecurityGroup(OpenstackRequestSecurityGroup request) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void serverAction(OpenstackRequestServerAction request) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void deployVmType(String vmTypeName, String projectName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void undeployVmType(String vmTypeName, String projectName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void deployUser(User user, String projectName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void undeployUser(User user, String projectName) {
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
			case ComputePackage.COMPUTE_SERVICE___CREATE_SERVER__OPENSTACKREQUESTNEWSERVER:
				createServer((OpenstackRequestNewServer)arguments.get(0));
				return null;
			case ComputePackage.COMPUTE_SERVICE___DELETE_SERVER__STRING_STRING:
				deleteServer((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case ComputePackage.COMPUTE_SERVICE___CREATE_KEY_PAIR__OPENSTACKREQUESTKEYPAIR:
				createKeyPair((OpenstackRequestKeyPair)arguments.get(0));
				return null;
			case ComputePackage.COMPUTE_SERVICE___DELETE__OPENSTACKREQUESTDELETE:
				delete((OpenstackRequestDelete)arguments.get(0));
				return null;
			case ComputePackage.COMPUTE_SERVICE___CREATE_FLAVOR__OPENSTACKREQUESTFLAVOR:
				createFlavor((OpenstackRequestFlavor)arguments.get(0));
				return null;
			case ComputePackage.COMPUTE_SERVICE___CREATE_SECURITY_GROUP__OPENSTACKREQUESTSECURITYGROUP:
				createSecurityGroup((OpenstackRequestSecurityGroup)arguments.get(0));
				return null;
			case ComputePackage.COMPUTE_SERVICE___SERVER_ACTION__OPENSTACKREQUESTSERVERACTION:
				serverAction((OpenstackRequestServerAction)arguments.get(0));
				return null;
			case ComputePackage.COMPUTE_SERVICE___DEPLOY_VM_TYPE__STRING_STRING:
				deployVmType((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case ComputePackage.COMPUTE_SERVICE___UNDEPLOY_VM_TYPE__STRING_STRING:
				undeployVmType((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case ComputePackage.COMPUTE_SERVICE___DEPLOY_USER__USER_STRING:
				deployUser((User)arguments.get(0), (String)arguments.get(1));
				return null;
			case ComputePackage.COMPUTE_SERVICE___UNDEPLOY_USER__USER_STRING:
				undeployUser((User)arguments.get(0), (String)arguments.get(1));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ComputeServiceImpl
