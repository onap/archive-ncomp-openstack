
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

import org.openecomp.ncomp.core.NamedEntity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Security Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.SecurityGroup#getRules <em>Rules</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.SecurityGroup#getTenant_id <em>Tenant id</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.SecurityGroup#getId <em>Id</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.compute.SecurityGroup#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getSecurityGroup()
 * @model
 * @generated
 */
public interface SecurityGroup extends NamedEntity {
	/**
	 * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.openstack.compute.SecurityRule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' containment reference list.
	 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getSecurityGroup_Rules()
	 * @model containment="true"
	 * @generated
	 */
	EList<SecurityRule> getRules();

	/**
	 * Returns the value of the '<em><b>Tenant id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tenant id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tenant id</em>' attribute.
	 * @see #setTenant_id(String)
	 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getSecurityGroup_Tenant_id()
	 * @model unique="false"
	 * @generated
	 */
	String getTenant_id();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.compute.SecurityGroup#getTenant_id <em>Tenant id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tenant id</em>' attribute.
	 * @see #getTenant_id()
	 * @generated
	 */
	void setTenant_id(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getSecurityGroup_Id()
	 * @model unique="false"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.compute.SecurityGroup#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.openecomp.ncomp.openstack.compute.ComputePackage#getSecurityGroup_Description()
	 * @model unique="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.compute.SecurityGroup#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // SecurityGroup
