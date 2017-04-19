
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

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sample</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerSample#getCounter_name <em>Counter name</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerSample#getUser_id <em>User id</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerSample#getResource_id <em>Resource id</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerSample#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerSample#getRecorded_at <em>Recorded at</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerSample#getMessage_id <em>Message id</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerSample#getSource <em>Source</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerSample#getCounter_unit <em>Counter unit</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerSample#getCounter_volume <em>Counter volume</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerSample#getProject_id <em>Project id</em>}</li>
 * </ul>
 *
 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerPackage#getCeilometerSample()
 * @model
 * @generated
 */
public interface CeilometerSample extends EObject {
	/**
	 * Returns the value of the '<em><b>Counter name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Counter name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Counter name</em>' attribute.
	 * @see #setCounter_name(String)
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerPackage#getCeilometerSample_Counter_name()
	 * @model unique="false"
	 * @generated
	 */
	String getCounter_name();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerSample#getCounter_name <em>Counter name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Counter name</em>' attribute.
	 * @see #getCounter_name()
	 * @generated
	 */
	void setCounter_name(String value);

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
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerPackage#getCeilometerSample_User_id()
	 * @model unique="false"
	 * @generated
	 */
	String getUser_id();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerSample#getUser_id <em>User id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User id</em>' attribute.
	 * @see #getUser_id()
	 * @generated
	 */
	void setUser_id(String value);

	/**
	 * Returns the value of the '<em><b>Resource id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource id</em>' attribute.
	 * @see #setResource_id(String)
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerPackage#getCeilometerSample_Resource_id()
	 * @model unique="false"
	 * @generated
	 */
	String getResource_id();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerSample#getResource_id <em>Resource id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource id</em>' attribute.
	 * @see #getResource_id()
	 * @generated
	 */
	void setResource_id(String value);

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timestamp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(Date)
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerPackage#getCeilometerSample_Timestamp()
	 * @model unique="false"
	 * @generated
	 */
	Date getTimestamp();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerSample#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(Date value);

	/**
	 * Returns the value of the '<em><b>Recorded at</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recorded at</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recorded at</em>' attribute.
	 * @see #setRecorded_at(Date)
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerPackage#getCeilometerSample_Recorded_at()
	 * @model unique="false"
	 * @generated
	 */
	Date getRecorded_at();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerSample#getRecorded_at <em>Recorded at</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recorded at</em>' attribute.
	 * @see #getRecorded_at()
	 * @generated
	 */
	void setRecorded_at(Date value);

	/**
	 * Returns the value of the '<em><b>Message id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message id</em>' attribute.
	 * @see #setMessage_id(String)
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerPackage#getCeilometerSample_Message_id()
	 * @model unique="false"
	 * @generated
	 */
	String getMessage_id();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerSample#getMessage_id <em>Message id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message id</em>' attribute.
	 * @see #getMessage_id()
	 * @generated
	 */
	void setMessage_id(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see #setSource(String)
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerPackage#getCeilometerSample_Source()
	 * @model unique="false"
	 * @generated
	 */
	String getSource();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerSample#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(String value);

	/**
	 * Returns the value of the '<em><b>Counter unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Counter unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Counter unit</em>' attribute.
	 * @see #setCounter_unit(String)
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerPackage#getCeilometerSample_Counter_unit()
	 * @model unique="false"
	 * @generated
	 */
	String getCounter_unit();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerSample#getCounter_unit <em>Counter unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Counter unit</em>' attribute.
	 * @see #getCounter_unit()
	 * @generated
	 */
	void setCounter_unit(String value);

	/**
	 * Returns the value of the '<em><b>Counter volume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Counter volume</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Counter volume</em>' attribute.
	 * @see #setCounter_volume(double)
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerPackage#getCeilometerSample_Counter_volume()
	 * @model unique="false"
	 * @generated
	 */
	double getCounter_volume();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerSample#getCounter_volume <em>Counter volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Counter volume</em>' attribute.
	 * @see #getCounter_volume()
	 * @generated
	 */
	void setCounter_volume(double value);

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
	 * @see org.openecomp.ncomp.openstack.ceilometer.CeilometerPackage#getCeilometerSample_Project_id()
	 * @model unique="false"
	 * @generated
	 */
	String getProject_id();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.openstack.ceilometer.CeilometerSample#getProject_id <em>Project id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project id</em>' attribute.
	 * @see #getProject_id()
	 * @generated
	 */
	void setProject_id(String value);

} // CeilometerSample
