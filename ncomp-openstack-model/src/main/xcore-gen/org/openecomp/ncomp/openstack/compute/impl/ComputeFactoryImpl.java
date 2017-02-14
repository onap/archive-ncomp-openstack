
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

import org.openecomp.ncomp.openstack.compute.*;

import org.eclipse.emf.ecore.EClass;
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
public class ComputeFactoryImpl extends EFactoryImpl implements ComputeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ComputeFactory init() {
		try {
			ComputeFactory theComputeFactory = (ComputeFactory)EPackage.Registry.INSTANCE.getEFactory(ComputePackage.eNS_URI);
			if (theComputeFactory != null) {
				return theComputeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ComputeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComputeFactoryImpl() {
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
			case ComputePackage.OPENSTACK_REQUEST_NEW_SERVER: return createOpenstackRequestNewServer();
			case ComputePackage.OPENSTACK_REQUEST_KEY_PAIR: return createOpenstackRequestKeyPair();
			case ComputePackage.OPENSTACK_REQUEST_FLAVOR: return createOpenstackRequestFlavor();
			case ComputePackage.OPENSTACK_REQUEST_SECURITY_GROUP: return createOpenstackRequestSecurityGroup();
			case ComputePackage.OPENSTACK_REQUEST_SERVER_ACTION: return createOpenstackRequestServerAction();
			case ComputePackage.OPENSTACK_REQUEST_POLL: return createOpenstackRequestPoll();
			case ComputePackage.SERVER: return createServer();
			case ComputePackage.IMAGE: return createImage();
			case ComputePackage.FLAVOR: return createFlavor();
			case ComputePackage.ADDRESSES: return createAddresses();
			case ComputePackage.ADDRESS: return createAddress();
			case ComputePackage.LINK: return createLink();
			case ComputePackage.METADATA: return createMetadata();
			case ComputePackage.FAULT: return createFault();
			case ComputePackage.PERSONALITY: return createPersonality();
			case ComputePackage.REFERENCE: return createReference();
			case ComputePackage.VOLUME: return createVolume();
			case ComputePackage.VOLUME_ATTACHMENT: return createVolumeAttachment();
			case ComputePackage.FLOATING_IP: return createFloatingIp();
			case ComputePackage.SECURITY_GROUP: return createSecurityGroup();
			case ComputePackage.SECURITY_RULE: return createSecurityRule();
			case ComputePackage.SECURITY_RANGE: return createSecurityRange();
			case ComputePackage.KEY_PAIR: return createKeyPair();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenstackRequestNewServer createOpenstackRequestNewServer() {
		OpenstackRequestNewServerImpl openstackRequestNewServer = new OpenstackRequestNewServerImpl();
		return openstackRequestNewServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenstackRequestKeyPair createOpenstackRequestKeyPair() {
		OpenstackRequestKeyPairImpl openstackRequestKeyPair = new OpenstackRequestKeyPairImpl();
		return openstackRequestKeyPair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenstackRequestFlavor createOpenstackRequestFlavor() {
		OpenstackRequestFlavorImpl openstackRequestFlavor = new OpenstackRequestFlavorImpl();
		return openstackRequestFlavor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenstackRequestSecurityGroup createOpenstackRequestSecurityGroup() {
		OpenstackRequestSecurityGroupImpl openstackRequestSecurityGroup = new OpenstackRequestSecurityGroupImpl();
		return openstackRequestSecurityGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenstackRequestServerAction createOpenstackRequestServerAction() {
		OpenstackRequestServerActionImpl openstackRequestServerAction = new OpenstackRequestServerActionImpl();
		return openstackRequestServerAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenstackRequestPoll createOpenstackRequestPoll() {
		OpenstackRequestPollImpl openstackRequestPoll = new OpenstackRequestPollImpl();
		return openstackRequestPoll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Server createServer() {
		ServerImpl server = new ServerImpl();
		return server;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Image createImage() {
		ImageImpl image = new ImageImpl();
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Flavor createFlavor() {
		FlavorImpl flavor = new FlavorImpl();
		return flavor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Addresses createAddresses() {
		AddressesImpl addresses = new AddressesImpl();
		return addresses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Address createAddress() {
		AddressImpl address = new AddressImpl();
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link createLink() {
		LinkImpl link = new LinkImpl();
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metadata createMetadata() {
		MetadataImpl metadata = new MetadataImpl();
		return metadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fault createFault() {
		FaultImpl fault = new FaultImpl();
		return fault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Personality createPersonality() {
		PersonalityImpl personality = new PersonalityImpl();
		return personality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference createReference() {
		ReferenceImpl reference = new ReferenceImpl();
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Volume createVolume() {
		VolumeImpl volume = new VolumeImpl();
		return volume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VolumeAttachment createVolumeAttachment() {
		VolumeAttachmentImpl volumeAttachment = new VolumeAttachmentImpl();
		return volumeAttachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FloatingIp createFloatingIp() {
		FloatingIpImpl floatingIp = new FloatingIpImpl();
		return floatingIp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityGroup createSecurityGroup() {
		SecurityGroupImpl securityGroup = new SecurityGroupImpl();
		return securityGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityRule createSecurityRule() {
		SecurityRuleImpl securityRule = new SecurityRuleImpl();
		return securityRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityRange createSecurityRange() {
		SecurityRangeImpl securityRange = new SecurityRangeImpl();
		return securityRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyPair createKeyPair() {
		KeyPairImpl keyPair = new KeyPairImpl();
		return keyPair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComputePackage getComputePackage() {
		return (ComputePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ComputePackage getPackage() {
		return ComputePackage.eINSTANCE;
	}

} //ComputeFactoryImpl
