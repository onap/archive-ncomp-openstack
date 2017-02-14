
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
package org.openecomp.ncomp.openstack.compute.util;

import org.openecomp.ncomp.core.NamedEntity;

import org.openecomp.ncomp.openstack.compute.*;

import org.openecomp.ncomp.openstack.core.OpenStackRequest;

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
 * @see org.openecomp.ncomp.openstack.compute.ComputePackage
 * @generated
 */
public class ComputeSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ComputePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComputeSwitch() {
		if (modelPackage == null) {
			modelPackage = ComputePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
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
			case ComputePackage.COMPUTE_SERVICE: {
				ComputeService computeService = (ComputeService)theEObject;
				T result = caseComputeService(computeService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComputePackage.OPENSTACK_REQUEST_NEW_SERVER: {
				OpenstackRequestNewServer openstackRequestNewServer = (OpenstackRequestNewServer)theEObject;
				T result = caseOpenstackRequestNewServer(openstackRequestNewServer);
				if (result == null) result = caseOpenStackRequest(openstackRequestNewServer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComputePackage.OPENSTACK_REQUEST_KEY_PAIR: {
				OpenstackRequestKeyPair openstackRequestKeyPair = (OpenstackRequestKeyPair)theEObject;
				T result = caseOpenstackRequestKeyPair(openstackRequestKeyPair);
				if (result == null) result = caseOpenStackRequest(openstackRequestKeyPair);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComputePackage.OPENSTACK_REQUEST_FLAVOR: {
				OpenstackRequestFlavor openstackRequestFlavor = (OpenstackRequestFlavor)theEObject;
				T result = caseOpenstackRequestFlavor(openstackRequestFlavor);
				if (result == null) result = caseOpenStackRequest(openstackRequestFlavor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComputePackage.OPENSTACK_REQUEST_SECURITY_GROUP: {
				OpenstackRequestSecurityGroup openstackRequestSecurityGroup = (OpenstackRequestSecurityGroup)theEObject;
				T result = caseOpenstackRequestSecurityGroup(openstackRequestSecurityGroup);
				if (result == null) result = caseOpenStackRequest(openstackRequestSecurityGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComputePackage.OPENSTACK_REQUEST_SERVER_ACTION: {
				OpenstackRequestServerAction openstackRequestServerAction = (OpenstackRequestServerAction)theEObject;
				T result = caseOpenstackRequestServerAction(openstackRequestServerAction);
				if (result == null) result = caseOpenStackRequest(openstackRequestServerAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComputePackage.OPENSTACK_REQUEST_POLL: {
				OpenstackRequestPoll openstackRequestPoll = (OpenstackRequestPoll)theEObject;
				T result = caseOpenstackRequestPoll(openstackRequestPoll);
				if (result == null) result = caseOpenStackRequest(openstackRequestPoll);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComputePackage.SERVER: {
				Server server = (Server)theEObject;
				T result = caseServer(server);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComputePackage.IMAGE: {
				Image image = (Image)theEObject;
				T result = caseImage(image);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComputePackage.FLAVOR: {
				Flavor flavor = (Flavor)theEObject;
				T result = caseFlavor(flavor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComputePackage.ADDRESSES: {
				Addresses addresses = (Addresses)theEObject;
				T result = caseAddresses(addresses);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComputePackage.ADDRESS: {
				Address address = (Address)theEObject;
				T result = caseAddress(address);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComputePackage.LINK: {
				Link link = (Link)theEObject;
				T result = caseLink(link);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComputePackage.METADATA: {
				Metadata metadata = (Metadata)theEObject;
				T result = caseMetadata(metadata);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComputePackage.FAULT: {
				Fault fault = (Fault)theEObject;
				T result = caseFault(fault);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComputePackage.PERSONALITY: {
				Personality personality = (Personality)theEObject;
				T result = casePersonality(personality);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComputePackage.REFERENCE: {
				Reference reference = (Reference)theEObject;
				T result = caseReference(reference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComputePackage.VOLUME: {
				Volume volume = (Volume)theEObject;
				T result = caseVolume(volume);
				if (result == null) result = caseNamedEntity(volume);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComputePackage.VOLUME_ATTACHMENT: {
				VolumeAttachment volumeAttachment = (VolumeAttachment)theEObject;
				T result = caseVolumeAttachment(volumeAttachment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComputePackage.FLOATING_IP: {
				FloatingIp floatingIp = (FloatingIp)theEObject;
				T result = caseFloatingIp(floatingIp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComputePackage.SECURITY_GROUP: {
				SecurityGroup securityGroup = (SecurityGroup)theEObject;
				T result = caseSecurityGroup(securityGroup);
				if (result == null) result = caseNamedEntity(securityGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComputePackage.SECURITY_RULE: {
				SecurityRule securityRule = (SecurityRule)theEObject;
				T result = caseSecurityRule(securityRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComputePackage.SECURITY_RANGE: {
				SecurityRange securityRange = (SecurityRange)theEObject;
				T result = caseSecurityRange(securityRange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComputePackage.KEY_PAIR: {
				KeyPair keyPair = (KeyPair)theEObject;
				T result = caseKeyPair(keyPair);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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
	 * Returns the result of interpreting the object as an instance of '<em>Openstack Request New Server</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Openstack Request New Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpenstackRequestNewServer(OpenstackRequestNewServer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Openstack Request Key Pair</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Openstack Request Key Pair</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpenstackRequestKeyPair(OpenstackRequestKeyPair object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Openstack Request Flavor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Openstack Request Flavor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpenstackRequestFlavor(OpenstackRequestFlavor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Openstack Request Security Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Openstack Request Security Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpenstackRequestSecurityGroup(OpenstackRequestSecurityGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Openstack Request Server Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Openstack Request Server Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpenstackRequestServerAction(OpenstackRequestServerAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Openstack Request Poll</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Openstack Request Poll</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpenstackRequestPoll(OpenstackRequestPoll object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Server</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServer(Server object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImage(Image object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flavor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flavor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlavor(Flavor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Addresses</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Addresses</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddresses(Addresses object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Address</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Address</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddress(Address object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLink(Link object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metadata</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metadata</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetadata(Metadata object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fault</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fault</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFault(Fault object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Personality</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Personality</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersonality(Personality object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReference(Reference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Volume</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Volume</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVolume(Volume object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Volume Attachment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Volume Attachment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVolumeAttachment(VolumeAttachment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Floating Ip</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Floating Ip</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFloatingIp(FloatingIp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityGroup(SecurityGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityRule(SecurityRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityRange(SecurityRange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Key Pair</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Key Pair</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeyPair(KeyPair object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Open Stack Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Open Stack Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpenStackRequest(OpenStackRequest object) {
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

} //ComputeSwitch
