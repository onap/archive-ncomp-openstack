
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
package org.openecomp.ncomp.openstack.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Openstack Request Delete</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.openstack.core.OpenstackRequestDelete#getObjectType <em>Object Type</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.core.OpenstackRequestDelete#getObjectName <em>Object Name</em>}</li>
 * </ul>
 *
 * @see org.openecomp.ncomp.openstack.core.CorePackage#getOpenstackRequestDelete()
 * @model
 * @generated
 */
public interface OpenstackRequestDelete extends OpenStackRequest {
	/**
	 * Returns the value of the '<em><b>Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Type</em>' attribute.
	 * @see #setObjectType(String)
	 * @see org.openecomp.ncomp.openstack.core.CorePackage#getOpenstackRequestDelete_ObjectType()
	 * @model unique="false"
	 * @generated
	 */
	String getObjectType();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.core.OpenstackRequestDelete#getObjectType <em>Object Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Type</em>' attribute.
	 * @see #getObjectType()
	 * @generated
	 */
	void setObjectType(String value);

	/**
	 * Returns the value of the '<em><b>Object Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Name</em>' attribute.
	 * @see #setObjectName(String)
	 * @see org.openecomp.ncomp.openstack.core.CorePackage#getOpenstackRequestDelete_ObjectName()
	 * @model unique="false"
	 * @generated
	 */
	String getObjectName();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.core.OpenstackRequestDelete#getObjectName <em>Object Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Name</em>' attribute.
	 * @see #getObjectName()
	 * @generated
	 */
	void setObjectName(String value);

} // OpenstackRequestDelete
