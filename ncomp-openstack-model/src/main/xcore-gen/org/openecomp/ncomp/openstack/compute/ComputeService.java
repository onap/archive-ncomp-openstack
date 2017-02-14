
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
package org.openecomp.ncomp.openstack.compute;

import org.openecomp.ncomp.core.User;
import org.openecomp.ncomp.openstack.core.OpenstackRequestDelete;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getComputeService()
 * @model abstract="true"
 * @generated
 */
public interface ComputeService extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model requestUnique="false"
	 * @generated
	 */
	void createServer(OpenstackRequestNewServer request);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model projectNameUnique="false" nameUnique="false"
	 * @generated
	 */
	void deleteServer(String projectName, String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model requestUnique="false"
	 * @generated
	 */
	void createKeyPair(OpenstackRequestKeyPair request);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model requestUnique="false"
	 * @generated
	 */
	void delete(OpenstackRequestDelete request);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model requestUnique="false"
	 * @generated
	 */
	void createFlavor(OpenstackRequestFlavor request);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model requestUnique="false"
	 * @generated
	 */
	void createSecurityGroup(OpenstackRequestSecurityGroup request);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model requestUnique="false"
	 * @generated
	 */
	void serverAction(OpenstackRequestServerAction request);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model vmTypeNameUnique="false" projectNameUnique="false"
	 * @generated
	 */
	void deployVmType(String vmTypeName, String projectName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model vmTypeNameUnique="false" projectNameUnique="false"
	 * @generated
	 */
	void undeployVmType(String vmTypeName, String projectName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model userUnique="false" projectNameUnique="false"
	 * @generated
	 */
	void deployUser(User user, String projectName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model userUnique="false" projectNameUnique="false"
	 * @generated
	 */
	void undeployUser(User user, String projectName);

} // ComputeService
