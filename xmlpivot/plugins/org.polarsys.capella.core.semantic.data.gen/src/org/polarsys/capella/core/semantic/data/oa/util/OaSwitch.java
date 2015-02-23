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

package org.polarsys.capella.core.semantic.data.oa.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.polarsys.capella.core.semantic.data.activity.AbstractAction;
import org.polarsys.capella.core.semantic.data.activity.ActivityNode;

import org.polarsys.capella.core.semantic.data.behavior.AbstractEvent;

import org.polarsys.capella.core.semantic.data.capellacommon.AbstractCapabilityPkg;

import org.polarsys.capella.core.semantic.data.capellacore.CapellaElement;
import org.polarsys.capella.core.semantic.data.capellacore.Classifier;
import org.polarsys.capella.core.semantic.data.capellacore.Feature;
import org.polarsys.capella.core.semantic.data.capellacore.GeneralizableElement;
import org.polarsys.capella.core.semantic.data.capellacore.InvolvedElement;
import org.polarsys.capella.core.semantic.data.capellacore.NamedElement;
import org.polarsys.capella.core.semantic.data.capellacore.Namespace;
import org.polarsys.capella.core.semantic.data.capellacore.Structure;
import org.polarsys.capella.core.semantic.data.capellacore.Type;
import org.polarsys.capella.core.semantic.data.capellacore.TypedElement;

import org.polarsys.capella.core.semantic.data.cs.Block;
import org.polarsys.capella.core.semantic.data.cs.BlockArchitecture;
import org.polarsys.capella.core.semantic.data.cs.Component;

import org.polarsys.capella.core.semantic.data.emde.Element;
import org.polarsys.capella.core.semantic.data.emde.ExtensibleElement;

import org.polarsys.capella.core.semantic.data.fa.AbstractFunction;
import org.polarsys.capella.core.semantic.data.fa.AbstractFunctionalArchitecture;
import org.polarsys.capella.core.semantic.data.fa.AbstractFunctionalBlock;
import org.polarsys.capella.core.semantic.data.fa.AbstractFunctionalChainContainer;
import org.polarsys.capella.core.semantic.data.fa.AbstractFunctionalStructure;
import org.polarsys.capella.core.semantic.data.fa.ComponentExchange;
import org.polarsys.capella.core.semantic.data.fa.FunctionPkg;
import org.polarsys.capella.core.semantic.data.fa.FunctionalChain;

import org.polarsys.capella.core.semantic.data.information.AbstractEventOperation;
import org.polarsys.capella.core.semantic.data.information.MultiplicityElement;
import org.polarsys.capella.core.semantic.data.information.PartitionableElement;
import org.polarsys.capella.core.semantic.data.information.Property;

import org.polarsys.capella.core.semantic.data.information.communication.CommunicationLinkExchanger;

import org.polarsys.capella.core.semantic.data.interaction.AbstractCapability;

import org.polarsys.capella.core.semantic.data.modellingcore.AbstractInformationFlow;
import org.polarsys.capella.core.semantic.data.modellingcore.AbstractNamedElement;
import org.polarsys.capella.core.semantic.data.modellingcore.AbstractType;
import org.polarsys.capella.core.semantic.data.modellingcore.InformationsExchanger;
import org.polarsys.capella.core.semantic.data.modellingcore.ModelElement;
import org.polarsys.capella.core.semantic.data.modellingcore.TraceableElement;

import org.polarsys.capella.core.semantic.data.oa.*;

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
 * @see org.polarsys.capella.core.semantic.data.oa.OaPackage
 * @generated
 */
public class OaSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OaPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OaSwitch() {
		if (modelPackage == null) {
			modelPackage = OaPackage.eINSTANCE;
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
			case OaPackage.OPERATIONAL_ANALYSIS: {
				OperationalAnalysis operationalAnalysis = (OperationalAnalysis)theEObject;
				T result = caseOperationalAnalysis(operationalAnalysis);
				if (result == null) result = caseBlockArchitecture(operationalAnalysis);
				if (result == null) result = caseAbstractFunctionalArchitecture(operationalAnalysis);
				if (result == null) result = caseStructure(operationalAnalysis);
				if (result == null) result = caseNamespace(operationalAnalysis);
				if (result == null) result = caseNamedElement(operationalAnalysis);
				if (result == null) result = caseAbstractNamedElement(operationalAnalysis);
				if (result == null) result = caseCapellaElement(operationalAnalysis);
				if (result == null) result = caseTraceableElement(operationalAnalysis);
				if (result == null) result = caseModelElement(operationalAnalysis);
				if (result == null) result = caseExtensibleElement(operationalAnalysis);
				if (result == null) result = caseElement(operationalAnalysis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OaPackage.OPERATIONAL_SCENARIO: {
				OperationalScenario operationalScenario = (OperationalScenario)theEObject;
				T result = caseOperationalScenario(operationalScenario);
				if (result == null) result = caseNamedElement(operationalScenario);
				if (result == null) result = caseAbstractNamedElement(operationalScenario);
				if (result == null) result = caseCapellaElement(operationalScenario);
				if (result == null) result = caseTraceableElement(operationalScenario);
				if (result == null) result = caseModelElement(operationalScenario);
				if (result == null) result = caseExtensibleElement(operationalScenario);
				if (result == null) result = caseElement(operationalScenario);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OaPackage.OPERATIONAL_ACTIVITY_PKG: {
				OperationalActivityPkg operationalActivityPkg = (OperationalActivityPkg)theEObject;
				T result = caseOperationalActivityPkg(operationalActivityPkg);
				if (result == null) result = caseFunctionPkg(operationalActivityPkg);
				if (result == null) result = caseStructure(operationalActivityPkg);
				if (result == null) result = caseNamespace(operationalActivityPkg);
				if (result == null) result = caseNamedElement(operationalActivityPkg);
				if (result == null) result = caseAbstractNamedElement(operationalActivityPkg);
				if (result == null) result = caseCapellaElement(operationalActivityPkg);
				if (result == null) result = caseTraceableElement(operationalActivityPkg);
				if (result == null) result = caseModelElement(operationalActivityPkg);
				if (result == null) result = caseExtensibleElement(operationalActivityPkg);
				if (result == null) result = caseElement(operationalActivityPkg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OaPackage.OPERATIONAL_ACTIVITY: {
				OperationalActivity operationalActivity = (OperationalActivity)theEObject;
				T result = caseOperationalActivity(operationalActivity);
				if (result == null) result = caseAbstractFunction(operationalActivity);
				if (result == null) result = caseNamespace(operationalActivity);
				if (result == null) result = caseInvolvedElement(operationalActivity);
				if (result == null) result = caseAbstractFunctionalChainContainer(operationalActivity);
				if (result == null) result = caseAbstractEvent(operationalActivity);
				if (result == null) result = caseProperty(operationalActivity);
				if (result == null) result = caseAbstractAction(operationalActivity);
				if (result == null) result = caseAbstractType(operationalActivity);
				if (result == null) result = caseFeature(operationalActivity);
				if (result == null) result = caseTypedElement(operationalActivity);
				if (result == null) result = caseMultiplicityElement(operationalActivity);
				if (result == null) result = caseActivityNode(operationalActivity);
				if (result == null) result = caseNamedElement(operationalActivity);
				if (result == null) result = caseAbstractNamedElement(operationalActivity);
				if (result == null) result = caseCapellaElement(operationalActivity);
				if (result == null) result = caseTraceableElement(operationalActivity);
				if (result == null) result = caseModelElement(operationalActivity);
				if (result == null) result = caseExtensibleElement(operationalActivity);
				if (result == null) result = caseElement(operationalActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OaPackage.OPERATIONAL_PROCESS: {
				OperationalProcess operationalProcess = (OperationalProcess)theEObject;
				T result = caseOperationalProcess(operationalProcess);
				if (result == null) result = caseFunctionalChain(operationalProcess);
				if (result == null) result = caseNamedElement(operationalProcess);
				if (result == null) result = caseInvolvedElement(operationalProcess);
				if (result == null) result = caseAbstractNamedElement(operationalProcess);
				if (result == null) result = caseCapellaElement(operationalProcess);
				if (result == null) result = caseTraceableElement(operationalProcess);
				if (result == null) result = caseModelElement(operationalProcess);
				if (result == null) result = caseExtensibleElement(operationalProcess);
				if (result == null) result = caseElement(operationalProcess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OaPackage.OPERATIONAL_CAPABILITY_PKG: {
				OperationalCapabilityPkg operationalCapabilityPkg = (OperationalCapabilityPkg)theEObject;
				T result = caseOperationalCapabilityPkg(operationalCapabilityPkg);
				if (result == null) result = caseAbstractCapabilityPkg(operationalCapabilityPkg);
				if (result == null) result = caseStructure(operationalCapabilityPkg);
				if (result == null) result = caseNamespace(operationalCapabilityPkg);
				if (result == null) result = caseNamedElement(operationalCapabilityPkg);
				if (result == null) result = caseAbstractNamedElement(operationalCapabilityPkg);
				if (result == null) result = caseCapellaElement(operationalCapabilityPkg);
				if (result == null) result = caseTraceableElement(operationalCapabilityPkg);
				if (result == null) result = caseModelElement(operationalCapabilityPkg);
				if (result == null) result = caseExtensibleElement(operationalCapabilityPkg);
				if (result == null) result = caseElement(operationalCapabilityPkg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OaPackage.OPERATIONAL_CAPABILITY: {
				OperationalCapability operationalCapability = (OperationalCapability)theEObject;
				T result = caseOperationalCapability(operationalCapability);
				if (result == null) result = caseAbstractCapability(operationalCapability);
				if (result == null) result = caseStructure(operationalCapability);
				if (result == null) result = caseAbstractFunctionalChainContainer(operationalCapability);
				if (result == null) result = caseNamespace(operationalCapability);
				if (result == null) result = caseNamedElement(operationalCapability);
				if (result == null) result = caseAbstractNamedElement(operationalCapability);
				if (result == null) result = caseCapellaElement(operationalCapability);
				if (result == null) result = caseTraceableElement(operationalCapability);
				if (result == null) result = caseModelElement(operationalCapability);
				if (result == null) result = caseExtensibleElement(operationalCapability);
				if (result == null) result = caseElement(operationalCapability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OaPackage.ROLE_PKG: {
				RolePkg rolePkg = (RolePkg)theEObject;
				T result = caseRolePkg(rolePkg);
				if (result == null) result = caseStructure(rolePkg);
				if (result == null) result = caseNamespace(rolePkg);
				if (result == null) result = caseNamedElement(rolePkg);
				if (result == null) result = caseAbstractNamedElement(rolePkg);
				if (result == null) result = caseCapellaElement(rolePkg);
				if (result == null) result = caseTraceableElement(rolePkg);
				if (result == null) result = caseModelElement(rolePkg);
				if (result == null) result = caseExtensibleElement(rolePkg);
				if (result == null) result = caseElement(rolePkg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OaPackage.ROLE: {
				Role role = (Role)theEObject;
				T result = caseRole(role);
				if (result == null) result = caseProperty(role);
				if (result == null) result = caseFeature(role);
				if (result == null) result = caseTypedElement(role);
				if (result == null) result = caseMultiplicityElement(role);
				if (result == null) result = caseNamedElement(role);
				if (result == null) result = caseAbstractNamedElement(role);
				if (result == null) result = caseCapellaElement(role);
				if (result == null) result = caseTraceableElement(role);
				if (result == null) result = caseModelElement(role);
				if (result == null) result = caseExtensibleElement(role);
				if (result == null) result = caseElement(role);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OaPackage.ENTITY_PKG: {
				EntityPkg entityPkg = (EntityPkg)theEObject;
				T result = caseEntityPkg(entityPkg);
				if (result == null) result = caseAbstractFunctionalStructure(entityPkg);
				if (result == null) result = caseStructure(entityPkg);
				if (result == null) result = caseNamespace(entityPkg);
				if (result == null) result = caseNamedElement(entityPkg);
				if (result == null) result = caseAbstractNamedElement(entityPkg);
				if (result == null) result = caseCapellaElement(entityPkg);
				if (result == null) result = caseTraceableElement(entityPkg);
				if (result == null) result = caseModelElement(entityPkg);
				if (result == null) result = caseExtensibleElement(entityPkg);
				if (result == null) result = caseElement(entityPkg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OaPackage.ENTITY: {
				Entity entity = (Entity)theEObject;
				T result = caseEntity(entity);
				if (result == null) result = caseInformationsExchanger(entity);
				if (result == null) result = caseInvolvedElement(entity);
				if (result == null) result = caseComponent(entity);
				if (result == null) result = caseBlock(entity);
				if (result == null) result = casePartitionableElement(entity);
				if (result == null) result = caseCommunicationLinkExchanger(entity);
				if (result == null) result = caseExtensibleElement(entity);
				if (result == null) result = caseTraceableElement(entity);
				if (result == null) result = caseAbstractFunctionalBlock(entity);
				if (result == null) result = caseClassifier(entity);
				if (result == null) result = caseElement(entity);
				if (result == null) result = caseGeneralizableElement(entity);
				if (result == null) result = caseType(entity);
				if (result == null) result = caseAbstractType(entity);
				if (result == null) result = caseNamespace(entity);
				if (result == null) result = caseNamedElement(entity);
				if (result == null) result = caseModelElement(entity);
				if (result == null) result = caseCapellaElement(entity);
				if (result == null) result = caseAbstractNamedElement(entity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OaPackage.OPERATIONAL_ACTOR: {
				OperationalActor operationalActor = (OperationalActor)theEObject;
				T result = caseOperationalActor(operationalActor);
				if (result == null) result = caseEntity(operationalActor);
				if (result == null) result = caseInformationsExchanger(operationalActor);
				if (result == null) result = caseInvolvedElement(operationalActor);
				if (result == null) result = caseComponent(operationalActor);
				if (result == null) result = caseBlock(operationalActor);
				if (result == null) result = casePartitionableElement(operationalActor);
				if (result == null) result = caseCommunicationLinkExchanger(operationalActor);
				if (result == null) result = caseExtensibleElement(operationalActor);
				if (result == null) result = caseTraceableElement(operationalActor);
				if (result == null) result = caseAbstractFunctionalBlock(operationalActor);
				if (result == null) result = caseClassifier(operationalActor);
				if (result == null) result = caseElement(operationalActor);
				if (result == null) result = caseGeneralizableElement(operationalActor);
				if (result == null) result = caseType(operationalActor);
				if (result == null) result = caseAbstractType(operationalActor);
				if (result == null) result = caseNamespace(operationalActor);
				if (result == null) result = caseNamedElement(operationalActor);
				if (result == null) result = caseModelElement(operationalActor);
				if (result == null) result = caseCapellaElement(operationalActor);
				if (result == null) result = caseAbstractNamedElement(operationalActor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OaPackage.LOCATION: {
				Location location = (Location)theEObject;
				T result = caseLocation(location);
				if (result == null) result = caseComponent(location);
				if (result == null) result = caseBlock(location);
				if (result == null) result = casePartitionableElement(location);
				if (result == null) result = caseCommunicationLinkExchanger(location);
				if (result == null) result = caseAbstractFunctionalBlock(location);
				if (result == null) result = caseClassifier(location);
				if (result == null) result = caseGeneralizableElement(location);
				if (result == null) result = caseType(location);
				if (result == null) result = caseAbstractType(location);
				if (result == null) result = caseNamespace(location);
				if (result == null) result = caseNamedElement(location);
				if (result == null) result = caseAbstractNamedElement(location);
				if (result == null) result = caseCapellaElement(location);
				if (result == null) result = caseExtensibleElement(location);
				if (result == null) result = caseTraceableElement(location);
				if (result == null) result = caseModelElement(location);
				if (result == null) result = caseElement(location);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OaPackage.COMMUNICATION_MEAN: {
				CommunicationMean communicationMean = (CommunicationMean)theEObject;
				T result = caseCommunicationMean(communicationMean);
				if (result == null) result = caseComponentExchange(communicationMean);
				if (result == null) result = caseAbstractEvent(communicationMean);
				if (result == null) result = caseAbstractEventOperation(communicationMean);
				if (result == null) result = caseAbstractInformationFlow(communicationMean);
				if (result == null) result = caseAbstractType(communicationMean);
				if (result == null) result = caseNamedElement(communicationMean);
				if (result == null) result = caseAbstractNamedElement(communicationMean);
				if (result == null) result = caseCapellaElement(communicationMean);
				if (result == null) result = caseTraceableElement(communicationMean);
				if (result == null) result = caseModelElement(communicationMean);
				if (result == null) result = caseExtensibleElement(communicationMean);
				if (result == null) result = caseElement(communicationMean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OaPackage.OPERATIONAL_CONTEXT: {
				OperationalContext operationalContext = (OperationalContext)theEObject;
				T result = caseOperationalContext(operationalContext);
				if (result == null) result = caseComponent(operationalContext);
				if (result == null) result = caseBlock(operationalContext);
				if (result == null) result = casePartitionableElement(operationalContext);
				if (result == null) result = caseCommunicationLinkExchanger(operationalContext);
				if (result == null) result = caseAbstractFunctionalBlock(operationalContext);
				if (result == null) result = caseClassifier(operationalContext);
				if (result == null) result = caseGeneralizableElement(operationalContext);
				if (result == null) result = caseType(operationalContext);
				if (result == null) result = caseAbstractType(operationalContext);
				if (result == null) result = caseNamespace(operationalContext);
				if (result == null) result = caseNamedElement(operationalContext);
				if (result == null) result = caseAbstractNamedElement(operationalContext);
				if (result == null) result = caseCapellaElement(operationalContext);
				if (result == null) result = caseExtensibleElement(operationalContext);
				if (result == null) result = caseTraceableElement(operationalContext);
				if (result == null) result = caseModelElement(operationalContext);
				if (result == null) result = caseElement(operationalContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operational Analysis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operational Analysis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationalAnalysis(OperationalAnalysis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operational Scenario</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operational Scenario</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationalScenario(OperationalScenario object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operational Activity Pkg</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operational Activity Pkg</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationalActivityPkg(OperationalActivityPkg object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operational Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operational Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationalActivity(OperationalActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operational Process</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operational Process</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationalProcess(OperationalProcess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operational Capability Pkg</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operational Capability Pkg</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationalCapabilityPkg(OperationalCapabilityPkg object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operational Capability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operational Capability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationalCapability(OperationalCapability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Pkg</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Pkg</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRolePkg(RolePkg object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRole(Role object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Pkg</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Pkg</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityPkg(EntityPkg object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity(Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operational Actor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operational Actor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationalActor(OperationalActor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocation(Location object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Communication Mean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Communication Mean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommunicationMean(CommunicationMean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operational Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operational Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationalContext(OperationalContext object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Function Pkg</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Pkg</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionPkg(FunctionPkg object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Functional Chain Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Functional Chain Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractFunctionalChainContainer(AbstractFunctionalChainContainer object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractEvent(AbstractEvent object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityNode(ActivityNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractAction(AbstractAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractFunction(AbstractFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Functional Chain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Functional Chain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionalChain(FunctionalChain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Capability Pkg</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Capability Pkg</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractCapabilityPkg(AbstractCapabilityPkg object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Capability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Capability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractCapability(AbstractCapability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Functional Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Functional Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractFunctionalStructure(AbstractFunctionalStructure object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Information Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Information Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractInformationFlow(AbstractInformationFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Exchange</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Exchange</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentExchange(ComponentExchange object) {
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

} //OaSwitch
