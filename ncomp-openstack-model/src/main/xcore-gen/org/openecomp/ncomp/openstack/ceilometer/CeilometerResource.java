
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
package org.openecomp.ncomp.openstack.ceilometer;

import org.openecomp.ncomp.openstack.compute.Link;
import org.openecomp.ncomp.openstack.compute.Metadata;
import java.util.Date;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerResource#getId <em>Id</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerResource#getUser_id <em>User id</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerResource#getProject_id <em>Project id</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerResource#getFirst_sample_timestamp <em>First sample timestamp</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerResource#getLast_sample_timestamp <em>Last sample timestamp</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerResource#getLinks <em>Links</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerResource#getMetadata <em>Metadata</em>}</li>
 * </ul>
 *
 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerPackage#getCeilometerResource()
 * @model
 * @generated
 */
public interface CeilometerResource extends EObject {

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
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerPackage#getCeilometerResource_Id()
	 * @model unique="false"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerResource#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>User id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User id</em>' attribute.
	 * @see #setUser_id(String)
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerPackage#getCeilometerResource_User_id()
	 * @model unique="false"
	 * @generated
	 */
	String getUser_id();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerResource#getUser_id <em>User id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User id</em>' attribute.
	 * @see #getUser_id()
	 * @generated
	 */
	void setUser_id(String value);

	/**
	 * Returns the value of the '<em><b>Project id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project id</em>' attribute.
	 * @see #setProject_id(String)
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerPackage#getCeilometerResource_Project_id()
	 * @model unique="false"
	 * @generated
	 */
	String getProject_id();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerResource#getProject_id <em>Project id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project id</em>' attribute.
	 * @see #getProject_id()
	 * @generated
	 */
	void setProject_id(String value);

	/**
	 * Returns the value of the '<em><b>First sample timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First sample timestamp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First sample timestamp</em>' attribute.
	 * @see #setFirst_sample_timestamp(Date)
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerPackage#getCeilometerResource_First_sample_timestamp()
	 * @model unique="false"
	 * @generated
	 */
	Date getFirst_sample_timestamp();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerResource#getFirst_sample_timestamp <em>First sample timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First sample timestamp</em>' attribute.
	 * @see #getFirst_sample_timestamp()
	 * @generated
	 */
	void setFirst_sample_timestamp(Date value);

	/**
	 * Returns the value of the '<em><b>Last sample timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last sample timestamp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last sample timestamp</em>' attribute.
	 * @see #setLast_sample_timestamp(Date)
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerPackage#getCeilometerResource_Last_sample_timestamp()
	 * @model unique="false"
	 * @generated
	 */
	Date getLast_sample_timestamp();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerResource#getLast_sample_timestamp <em>Last sample timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last sample timestamp</em>' attribute.
	 * @see #getLast_sample_timestamp()
	 * @generated
	 */
	void setLast_sample_timestamp(Date value);

	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.openstack.compute.Link}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerPackage#getCeilometerResource_Links()
	 * @model containment="true"
	 * @generated
	 */
	EList<Link> getLinks();

	/**
	 * Returns the value of the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metadata</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metadata</em>' containment reference.
	 * @see #setMetadata(Metadata)
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerPackage#getCeilometerResource_Metadata()
	 * @model containment="true"
	 * @generated
	 */
	Metadata getMetadata();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerResource#getMetadata <em>Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metadata</em>' containment reference.
	 * @see #getMetadata()
	 * @generated
	 */
	void setMetadata(Metadata value);
} // CeilometerResource
