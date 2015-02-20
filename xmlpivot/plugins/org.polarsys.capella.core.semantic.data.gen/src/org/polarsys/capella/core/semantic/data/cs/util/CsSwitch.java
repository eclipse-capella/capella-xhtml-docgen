/*******************************************************************************
 * Copyright (c) 2006, 2015 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *     
 * Contributors:
 *    Thales - initial API and implementation
 ******************************************************************************/

package org.polarsys.capella.core.semantic.data.cs.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.polarsys.capella.core.semantic.data.capellacore.AbstractExchangeItemPkg;
import org.polarsys.capella.core.semantic.data.capellacore.CapellaElement;
import org.polarsys.capella.core.semantic.data.capellacore.Classifier;
import org.polarsys.capella.core.semantic.data.capellacore.Feature;
import org.polarsys.capella.core.semantic.data.capellacore.GeneralClass;
import org.polarsys.capella.core.semantic.data.capellacore.GeneralizableElement;
import org.polarsys.capella.core.semantic.data.capellacore.InvolvedElement;
import org.polarsys.capella.core.semantic.data.capellacore.NamedElement;
import org.polarsys.capella.core.semantic.data.capellacore.Namespace;
import org.polarsys.capella.core.semantic.data.capellacore.Structure;
import org.polarsys.capella.core.semantic.data.capellacore.Type;
import org.polarsys.capella.core.semantic.data.capellacore.TypedElement;

import org.polarsys.capella.core.semantic.data.cs.*;

import org.polarsys.capella.core.semantic.data.emde.Element;
import org.polarsys.capella.core.semantic.data.emde.ExtensibleElement;

import org.polarsys.capella.core.semantic.data.fa.AbstractFunctionalArchitecture;
import org.polarsys.capella.core.semantic.data.fa.AbstractFunctionalBlock;
import org.polarsys.capella.core.semantic.data.fa.ComponentExchangeAllocator;

import org.polarsys.capella.core.semantic.data.information.AbstractEventOperation;
import org.polarsys.capella.core.semantic.data.information.MultiplicityElement;
import org.polarsys.capella.core.semantic.data.information.Partition;
import org.polarsys.capella.core.semantic.data.information.PartitionableElement;
import org.polarsys.capella.core.semantic.data.information.Port;
import org.polarsys.capella.core.semantic.data.information.Property;

import org.polarsys.capella.core.semantic.data.information.communication.CommunicationLinkExchanger;
import org.polarsys.capella.core.semantic.data.information.communication.MessageReferencePkg;

import org.polarsys.capella.core.semantic.data.modellingcore.AbstractNamedElement;
import org.polarsys.capella.core.semantic.data.modellingcore.AbstractType;
import org.polarsys.capella.core.semantic.data.modellingcore.InformationsExchanger;
import org.polarsys.capella.core.semantic.data.modellingcore.ModelElement;
import org.polarsys.capella.core.semantic.data.modellingcore.TraceableElement;

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
 * @see org.polarsys.capella.core.semantic.data.cs.CsPackage
 * @generated
 */
public class CsSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CsSwitch() {
		if (modelPackage == null) {
			modelPackage = CsPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CsPackage.BLOCK_ARCHITECTURE: {
				BlockArchitecture blockArchitecture = (BlockArchitecture)theEObject;
				T result = caseBlockArchitecture(blockArchitecture);
				if (result == null) result = caseAbstractFunctionalArchitecture(blockArchitecture);
				if (result == null) result = caseStructure(blockArchitecture);
				if (result == null) result = caseNamespace(blockArchitecture);
				if (result == null) result = caseNamedElement(blockArchitecture);
				if (result == null) result = caseAbstractNamedElement(blockArchitecture);
				if (result == null) result = caseCapellaElement(blockArchitecture);
				if (result == null) result = caseTraceableElement(blockArchitecture);
				if (result == null) result = caseModelElement(blockArchitecture);
				if (result == null) result = caseExtensibleElement(blockArchitecture);
				if (result == null) result = caseElement(blockArchitecture);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsPackage.BLOCK: {
				Block block = (Block)theEObject;
				T result = caseBlock(block);
				if (result == null) result = caseAbstractFunctionalBlock(block);
				if (result == null) result = caseType(block);
				if (result == null) result = caseAbstractType(block);
				if (result == null) result = caseNamespace(block);
				if (result == null) result = caseNamedElement(block);
				if (result == null) result = caseAbstractNamedElement(block);
				if (result == null) result = caseCapellaElement(block);
				if (result == null) result = caseExtensibleElement(block);
				if (result == null) result = caseTraceableElement(block);
				if (result == null) result = caseModelElement(block);
				if (result == null) result = caseElement(block);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsPackage.COMPONENT: {
				Component component = (Component)theEObject;
				T result = caseComponent(component);
				if (result == null) result = caseBlock(component);
				if (result == null) result = casePartitionableElement(component);
				if (result == null) result = caseCommunicationLinkExchanger(component);
				if (result == null) result = caseAbstractFunctionalBlock(component);
				if (result == null) result = caseClassifier(component);
				if (result == null) result = caseGeneralizableElement(component);
				if (result == null) result = caseType(component);
				if (result == null) result = caseAbstractType(component);
				if (result == null) result = caseNamespace(component);
				if (result == null) result = caseNamedElement(component);
				if (result == null) result = caseAbstractNamedElement(component);
				if (result == null) result = caseCapellaElement(component);
				if (result == null) result = caseExtensibleElement(component);
				if (result == null) result = caseTraceableElement(component);
				if (result == null) result = caseModelElement(component);
				if (result == null) result = caseElement(component);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsPackage.ABSTRACT_ACTOR: {
				AbstractActor abstractActor = (AbstractActor)theEObject;
				T result = caseAbstractActor(abstractActor);
				if (result == null) result = caseComponent(abstractActor);
				if (result == null) result = caseInvolvedElement(abstractActor);
				if (result == null) result = caseBlock(abstractActor);
				if (result == null) result = casePartitionableElement(abstractActor);
				if (result == null) result = caseCommunicationLinkExchanger(abstractActor);
				if (result == null) result = caseAbstractFunctionalBlock(abstractActor);
				if (result == null) result = caseClassifier(abstractActor);
				if (result == null) result = caseGeneralizableElement(abstractActor);
				if (result == null) result = caseType(abstractActor);
				if (result == null) result = caseAbstractType(abstractActor);
				if (result == null) result = caseNamespace(abstractActor);
				if (result == null) result = caseNamedElement(abstractActor);
				if (result == null) result = caseAbstractNamedElement(abstractActor);
				if (result == null) result = caseCapellaElement(abstractActor);
				if (result == null) result = caseExtensibleElement(abstractActor);
				if (result == null) result = caseTraceableElement(abstractActor);
				if (result == null) result = caseModelElement(abstractActor);
				if (result == null) result = caseElement(abstractActor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsPackage.PART: {
				Part part = (Part)theEObject;
				T result = casePart(part);
				if (result == null) result = casePartition(part);
				if (result == null) result = caseInformationsExchanger(part);
				if (result == null) result = caseDeployableElement(part);
				if (result == null) result = caseDeploymentTarget(part);
				if (result == null) result = caseAbstractPathInvolvedElement(part);
				if (result == null) result = caseProperty(part);
				if (result == null) result = caseInvolvedElement(part);
				if (result == null) result = caseFeature(part);
				if (result == null) result = caseTypedElement(part);
				if (result == null) result = caseMultiplicityElement(part);
				if (result == null) result = caseNamedElement(part);
				if (result == null) result = caseAbstractNamedElement(part);
				if (result == null) result = caseCapellaElement(part);
				if (result == null) result = caseTraceableElement(part);
				if (result == null) result = caseModelElement(part);
				if (result == null) result = caseExtensibleElement(part);
				if (result == null) result = caseElement(part);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsPackage.SYSTEM_COMPONENT: {
				SystemComponent systemComponent = (SystemComponent)theEObject;
				T result = caseSystemComponent(systemComponent);
				if (result == null) result = caseComponent(systemComponent);
				if (result == null) result = caseInvolvedElement(systemComponent);
				if (result == null) result = caseBlock(systemComponent);
				if (result == null) result = casePartitionableElement(systemComponent);
				if (result == null) result = caseCommunicationLinkExchanger(systemComponent);
				if (result == null) result = caseAbstractFunctionalBlock(systemComponent);
				if (result == null) result = caseClassifier(systemComponent);
				if (result == null) result = caseGeneralizableElement(systemComponent);
				if (result == null) result = caseType(systemComponent);
				if (result == null) result = caseAbstractType(systemComponent);
				if (result == null) result = caseNamespace(systemComponent);
				if (result == null) result = caseNamedElement(systemComponent);
				if (result == null) result = caseAbstractNamedElement(systemComponent);
				if (result == null) result = caseCapellaElement(systemComponent);
				if (result == null) result = caseExtensibleElement(systemComponent);
				if (result == null) result = caseTraceableElement(systemComponent);
				if (result == null) result = caseModelElement(systemComponent);
				if (result == null) result = caseElement(systemComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsPackage.INTERFACE_PKG: {
				InterfacePkg interfacePkg = (InterfacePkg)theEObject;
				T result = caseInterfacePkg(interfacePkg);
				if (result == null) result = caseMessageReferencePkg(interfacePkg);
				if (result == null) result = caseAbstractExchangeItemPkg(interfacePkg);
				if (result == null) result = caseStructure(interfacePkg);
				if (result == null) result = caseNamespace(interfacePkg);
				if (result == null) result = caseNamedElement(interfacePkg);
				if (result == null) result = caseAbstractNamedElement(interfacePkg);
				if (result == null) result = caseCapellaElement(interfacePkg);
				if (result == null) result = caseTraceableElement(interfacePkg);
				if (result == null) result = caseModelElement(interfacePkg);
				if (result == null) result = caseExtensibleElement(interfacePkg);
				if (result == null) result = caseElement(interfacePkg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsPackage.INTERFACE: {
				Interface interface_ = (Interface)theEObject;
				T result = caseInterface(interface_);
				if (result == null) result = caseGeneralClass(interface_);
				if (result == null) result = caseClassifier(interface_);
				if (result == null) result = caseGeneralizableElement(interface_);
				if (result == null) result = caseType(interface_);
				if (result == null) result = caseAbstractType(interface_);
				if (result == null) result = caseNamespace(interface_);
				if (result == null) result = caseNamedElement(interface_);
				if (result == null) result = caseAbstractNamedElement(interface_);
				if (result == null) result = caseCapellaElement(interface_);
				if (result == null) result = caseExtensibleElement(interface_);
				if (result == null) result = caseTraceableElement(interface_);
				if (result == null) result = caseModelElement(interface_);
				if (result == null) result = caseElement(interface_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsPackage.EXCHANGE_ITEM_ALLOCATION: {
				ExchangeItemAllocation exchangeItemAllocation = (ExchangeItemAllocation)theEObject;
				T result = caseExchangeItemAllocation(exchangeItemAllocation);
				if (result == null) result = caseAbstractEventOperation(exchangeItemAllocation);
				if (result == null) result = caseNamedElement(exchangeItemAllocation);
				if (result == null) result = caseAbstractNamedElement(exchangeItemAllocation);
				if (result == null) result = caseCapellaElement(exchangeItemAllocation);
				if (result == null) result = caseTraceableElement(exchangeItemAllocation);
				if (result == null) result = caseModelElement(exchangeItemAllocation);
				if (result == null) result = caseExtensibleElement(exchangeItemAllocation);
				if (result == null) result = caseElement(exchangeItemAllocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsPackage.DEPLOYABLE_ELEMENT: {
				DeployableElement deployableElement = (DeployableElement)theEObject;
				T result = caseDeployableElement(deployableElement);
				if (result == null) result = caseNamedElement(deployableElement);
				if (result == null) result = caseAbstractNamedElement(deployableElement);
				if (result == null) result = caseCapellaElement(deployableElement);
				if (result == null) result = caseTraceableElement(deployableElement);
				if (result == null) result = caseModelElement(deployableElement);
				if (result == null) result = caseExtensibleElement(deployableElement);
				if (result == null) result = caseElement(deployableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsPackage.DEPLOYMENT_TARGET: {
				DeploymentTarget deploymentTarget = (DeploymentTarget)theEObject;
				T result = caseDeploymentTarget(deploymentTarget);
				if (result == null) result = caseNamedElement(deploymentTarget);
				if (result == null) result = caseAbstractNamedElement(deploymentTarget);
				if (result == null) result = caseCapellaElement(deploymentTarget);
				if (result == null) result = caseTraceableElement(deploymentTarget);
				if (result == null) result = caseModelElement(deploymentTarget);
				if (result == null) result = caseExtensibleElement(deploymentTarget);
				if (result == null) result = caseElement(deploymentTarget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsPackage.ABSTRACT_DEPLOYMENT_LINK: {
				AbstractDeploymentLink abstractDeploymentLink = (AbstractDeploymentLink)theEObject;
				T result = caseAbstractDeploymentLink(abstractDeploymentLink);
				if (result == null) result = caseCapellaElement(abstractDeploymentLink);
				if (result == null) result = caseTraceableElement(abstractDeploymentLink);
				if (result == null) result = caseModelElement(abstractDeploymentLink);
				if (result == null) result = caseExtensibleElement(abstractDeploymentLink);
				if (result == null) result = caseElement(abstractDeploymentLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsPackage.ABSTRACT_PATH_INVOLVED_ELEMENT: {
				AbstractPathInvolvedElement abstractPathInvolvedElement = (AbstractPathInvolvedElement)theEObject;
				T result = caseAbstractPathInvolvedElement(abstractPathInvolvedElement);
				if (result == null) result = caseInvolvedElement(abstractPathInvolvedElement);
				if (result == null) result = caseCapellaElement(abstractPathInvolvedElement);
				if (result == null) result = caseTraceableElement(abstractPathInvolvedElement);
				if (result == null) result = caseModelElement(abstractPathInvolvedElement);
				if (result == null) result = caseExtensibleElement(abstractPathInvolvedElement);
				if (result == null) result = caseElement(abstractPathInvolvedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsPackage.ABSTRACT_PHYSICAL_ARTIFACT: {
				AbstractPhysicalArtifact abstractPhysicalArtifact = (AbstractPhysicalArtifact)theEObject;
				T result = caseAbstractPhysicalArtifact(abstractPhysicalArtifact);
				if (result == null) result = caseCapellaElement(abstractPhysicalArtifact);
				if (result == null) result = caseTraceableElement(abstractPhysicalArtifact);
				if (result == null) result = caseModelElement(abstractPhysicalArtifact);
				if (result == null) result = caseExtensibleElement(abstractPhysicalArtifact);
				if (result == null) result = caseElement(abstractPhysicalArtifact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsPackage.ABSTRACT_PHYSICAL_LINK_END: {
				AbstractPhysicalLinkEnd abstractPhysicalLinkEnd = (AbstractPhysicalLinkEnd)theEObject;
				T result = caseAbstractPhysicalLinkEnd(abstractPhysicalLinkEnd);
				if (result == null) result = caseCapellaElement(abstractPhysicalLinkEnd);
				if (result == null) result = caseTraceableElement(abstractPhysicalLinkEnd);
				if (result == null) result = caseModelElement(abstractPhysicalLinkEnd);
				if (result == null) result = caseExtensibleElement(abstractPhysicalLinkEnd);
				if (result == null) result = caseElement(abstractPhysicalLinkEnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsPackage.PHYSICAL_LINK: {
				PhysicalLink physicalLink = (PhysicalLink)theEObject;
				T result = casePhysicalLink(physicalLink);
				if (result == null) result = caseAbstractPhysicalArtifact(physicalLink);
				if (result == null) result = caseAbstractPathInvolvedElement(physicalLink);
				if (result == null) result = caseComponentExchangeAllocator(physicalLink);
				if (result == null) result = caseInvolvedElement(physicalLink);
				if (result == null) result = caseNamedElement(physicalLink);
				if (result == null) result = caseCapellaElement(physicalLink);
				if (result == null) result = caseTraceableElement(physicalLink);
				if (result == null) result = caseAbstractNamedElement(physicalLink);
				if (result == null) result = caseModelElement(physicalLink);
				if (result == null) result = caseExtensibleElement(physicalLink);
				if (result == null) result = caseElement(physicalLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsPackage.PHYSICAL_LINK_CATEGORY: {
				PhysicalLinkCategory physicalLinkCategory = (PhysicalLinkCategory)theEObject;
				T result = casePhysicalLinkCategory(physicalLinkCategory);
				if (result == null) result = caseNamedElement(physicalLinkCategory);
				if (result == null) result = caseAbstractNamedElement(physicalLinkCategory);
				if (result == null) result = caseCapellaElement(physicalLinkCategory);
				if (result == null) result = caseTraceableElement(physicalLinkCategory);
				if (result == null) result = caseModelElement(physicalLinkCategory);
				if (result == null) result = caseExtensibleElement(physicalLinkCategory);
				if (result == null) result = caseElement(physicalLinkCategory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsPackage.PHYSICAL_LINK_END: {
				PhysicalLinkEnd physicalLinkEnd = (PhysicalLinkEnd)theEObject;
				T result = casePhysicalLinkEnd(physicalLinkEnd);
				if (result == null) result = caseAbstractPhysicalLinkEnd(physicalLinkEnd);
				if (result == null) result = caseCapellaElement(physicalLinkEnd);
				if (result == null) result = caseTraceableElement(physicalLinkEnd);
				if (result == null) result = caseModelElement(physicalLinkEnd);
				if (result == null) result = caseExtensibleElement(physicalLinkEnd);
				if (result == null) result = caseElement(physicalLinkEnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsPackage.PHYSICAL_PATH: {
				PhysicalPath physicalPath = (PhysicalPath)theEObject;
				T result = casePhysicalPath(physicalPath);
				if (result == null) result = caseComponentExchangeAllocator(physicalPath);
				if (result == null) result = caseAbstractPathInvolvedElement(physicalPath);
				if (result == null) result = caseNamedElement(physicalPath);
				if (result == null) result = caseAbstractNamedElement(physicalPath);
				if (result == null) result = caseInvolvedElement(physicalPath);
				if (result == null) result = caseCapellaElement(physicalPath);
				if (result == null) result = caseTraceableElement(physicalPath);
				if (result == null) result = caseModelElement(physicalPath);
				if (result == null) result = caseExtensibleElement(physicalPath);
				if (result == null) result = caseElement(physicalPath);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsPackage.PHYSICAL_PATH_INVOLVEMENT: {
				PhysicalPathInvolvement physicalPathInvolvement = (PhysicalPathInvolvement)theEObject;
				T result = casePhysicalPathInvolvement(physicalPathInvolvement);
				if (result == null) result = caseCapellaElement(physicalPathInvolvement);
				if (result == null) result = caseTraceableElement(physicalPathInvolvement);
				if (result == null) result = caseModelElement(physicalPathInvolvement);
				if (result == null) result = caseExtensibleElement(physicalPathInvolvement);
				if (result == null) result = caseElement(physicalPathInvolvement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsPackage.PHYSICAL_PATH_REFERENCE: {
				PhysicalPathReference physicalPathReference = (PhysicalPathReference)theEObject;
				T result = casePhysicalPathReference(physicalPathReference);
				if (result == null) result = casePhysicalPathInvolvement(physicalPathReference);
				if (result == null) result = caseCapellaElement(physicalPathReference);
				if (result == null) result = caseTraceableElement(physicalPathReference);
				if (result == null) result = caseModelElement(physicalPathReference);
				if (result == null) result = caseExtensibleElement(physicalPathReference);
				if (result == null) result = caseElement(physicalPathReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsPackage.PHYSICAL_PORT: {
				PhysicalPort physicalPort = (PhysicalPort)theEObject;
				T result = casePhysicalPort(physicalPort);
				if (result == null) result = casePartition(physicalPort);
				if (result == null) result = casePort(physicalPort);
				if (result == null) result = caseAbstractPhysicalArtifact(physicalPort);
				if (result == null) result = caseInformationsExchanger(physicalPort);
				if (result == null) result = caseAbstractPhysicalLinkEnd(physicalPort);
				if (result == null) result = caseProperty(physicalPort);
				if (result == null) result = caseFeature(physicalPort);
				if (result == null) result = caseTypedElement(physicalPort);
				if (result == null) result = caseMultiplicityElement(physicalPort);
				if (result == null) result = caseNamedElement(physicalPort);
				if (result == null) result = caseAbstractNamedElement(physicalPort);
				if (result == null) result = caseCapellaElement(physicalPort);
				if (result == null) result = caseTraceableElement(physicalPort);
				if (result == null) result = caseModelElement(physicalPort);
				if (result == null) result = caseExtensibleElement(physicalPort);
				if (result == null) result = caseElement(physicalPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block Architecture</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block Architecture</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlockArchitecture(BlockArchitecture object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlock(Block object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponent(Component object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Actor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Actor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractActor(AbstractActor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePart(Part object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemComponent(SystemComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Pkg</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Pkg</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfacePkg(InterfacePkg object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterface(Interface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exchange Item Allocation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exchange Item Allocation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExchangeItemAllocation(ExchangeItemAllocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deployable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deployable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeployableElement(DeployableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deployment Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deployment Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeploymentTarget(DeploymentTarget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Deployment Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Deployment Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractDeploymentLink(AbstractDeploymentLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Path Involved Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Path Involved Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractPathInvolvedElement(AbstractPathInvolvedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Physical Artifact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Physical Artifact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractPhysicalArtifact(AbstractPhysicalArtifact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Physical Link End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Physical Link End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractPhysicalLinkEnd(AbstractPhysicalLinkEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Physical Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Physical Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhysicalLink(PhysicalLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Physical Link Category</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Physical Link Category</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhysicalLinkCategory(PhysicalLinkCategory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Physical Link End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Physical Link End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhysicalLinkEnd(PhysicalLinkEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Physical Path</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Physical Path</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhysicalPath(PhysicalPath object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Physical Path Involvement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Physical Path Involvement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhysicalPathInvolvement(PhysicalPathInvolvement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Physical Path Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Physical Path Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhysicalPathReference(PhysicalPathReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Physical Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Physical Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhysicalPort(PhysicalPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extensible Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extensible Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtensibleElement(ExtensibleElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelElement(ModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractNamedElement(AbstractNamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traceable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traceable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTraceableElement(TraceableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capella Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capella Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapellaElement(CapellaElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Namespace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Namespace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamespace(Namespace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructure(Structure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Functional Architecture</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Functional Architecture</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractFunctionalArchitecture(AbstractFunctionalArchitecture object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractType(AbstractType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseType(Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Functional Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Functional Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractFunctionalBlock(AbstractFunctionalBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generalizable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generalizable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralizableElement(GeneralizableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassifier(Classifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Partitionable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Partitionable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePartitionableElement(PartitionableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link Exchanger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link Exchanger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommunicationLinkExchanger(CommunicationLinkExchanger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Involved Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Involved Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInvolvedElement(InvolvedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeature(Feature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Typed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypedElement(TypedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiplicity Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiplicity Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiplicityElement(MultiplicityElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperty(Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Partition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Partition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePartition(Partition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Informations Exchanger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Informations Exchanger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInformationsExchanger(InformationsExchanger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Reference Pkg</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Reference Pkg</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageReferencePkg(MessageReferencePkg object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Exchange Item Pkg</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Exchange Item Pkg</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractExchangeItemPkg(AbstractExchangeItemPkg object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>General Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>General Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralClass(GeneralClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Event Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Event Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractEventOperation(AbstractEventOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Exchange Allocator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Exchange Allocator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentExchangeAllocator(ComponentExchangeAllocator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePort(Port object) {
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
	public T defaultCase(EObject object) {
		return null;
	}

} //CsSwitch
