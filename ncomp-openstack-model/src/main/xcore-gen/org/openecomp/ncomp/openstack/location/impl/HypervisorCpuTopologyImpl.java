
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

import org.openecomp.ncomp.openstack.location.HypervisorCpuTopology;
import org.openecomp.ncomp.openstack.location.LocationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hypervisor Cpu Topology</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.openstack.location.impl.HypervisorCpuTopologyImpl#getCores <em>Cores</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.impl.HypervisorCpuTopologyImpl#getThreads <em>Threads</em>}</li>
 *   <li>{@link org.openecomp.ncomp.openstack.location.impl.HypervisorCpuTopologyImpl#getSockets <em>Sockets</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HypervisorCpuTopologyImpl extends MinimalEObjectImpl.Container implements HypervisorCpuTopology {
	/**
	 * The default value of the '{@link #getCores() <em>Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCores()
	 * @generated
	 * @ordered
	 */
	protected static final int CORES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCores() <em>Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCores()
	 * @generated
	 * @ordered
	 */
	protected int cores = CORES_EDEFAULT;

	/**
	 * The default value of the '{@link #getThreads() <em>Threads</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreads()
	 * @generated
	 * @ordered
	 */
	protected static final int THREADS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getThreads() <em>Threads</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreads()
	 * @generated
	 * @ordered
	 */
	protected int threads = THREADS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSockets() <em>Sockets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSockets()
	 * @generated
	 * @ordered
	 */
	protected static final int SOCKETS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSockets() <em>Sockets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSockets()
	 * @generated
	 * @ordered
	 */
	protected int sockets = SOCKETS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HypervisorCpuTopologyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LocationPackage.Literals.HYPERVISOR_CPU_TOPOLOGY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCores() {
		return cores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCores(int newCores) {
		int oldCores = cores;
		cores = newCores;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationPackage.HYPERVISOR_CPU_TOPOLOGY__CORES, oldCores, cores));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getThreads() {
		return threads;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThreads(int newThreads) {
		int oldThreads = threads;
		threads = newThreads;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationPackage.HYPERVISOR_CPU_TOPOLOGY__THREADS, oldThreads, threads));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSockets() {
		return sockets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSockets(int newSockets) {
		int oldSockets = sockets;
		sockets = newSockets;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocationPackage.HYPERVISOR_CPU_TOPOLOGY__SOCKETS, oldSockets, sockets));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LocationPackage.HYPERVISOR_CPU_TOPOLOGY__CORES:
				return getCores();
			case LocationPackage.HYPERVISOR_CPU_TOPOLOGY__THREADS:
				return getThreads();
			case LocationPackage.HYPERVISOR_CPU_TOPOLOGY__SOCKETS:
				return getSockets();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LocationPackage.HYPERVISOR_CPU_TOPOLOGY__CORES:
				setCores((Integer)newValue);
				return;
			case LocationPackage.HYPERVISOR_CPU_TOPOLOGY__THREADS:
				setThreads((Integer)newValue);
				return;
			case LocationPackage.HYPERVISOR_CPU_TOPOLOGY__SOCKETS:
				setSockets((Integer)newValue);
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
			case LocationPackage.HYPERVISOR_CPU_TOPOLOGY__CORES:
				setCores(CORES_EDEFAULT);
				return;
			case LocationPackage.HYPERVISOR_CPU_TOPOLOGY__THREADS:
				setThreads(THREADS_EDEFAULT);
				return;
			case LocationPackage.HYPERVISOR_CPU_TOPOLOGY__SOCKETS:
				setSockets(SOCKETS_EDEFAULT);
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
			case LocationPackage.HYPERVISOR_CPU_TOPOLOGY__CORES:
				return cores != CORES_EDEFAULT;
			case LocationPackage.HYPERVISOR_CPU_TOPOLOGY__THREADS:
				return threads != THREADS_EDEFAULT;
			case LocationPackage.HYPERVISOR_CPU_TOPOLOGY__SOCKETS:
				return sockets != SOCKETS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (cores: ");
		result.append(cores);
		result.append(", threads: ");
		result.append(threads);
		result.append(", sockets: ");
		result.append(sockets);
		result.append(')');
		return result.toString();
	}

} //HypervisorCpuTopologyImpl
