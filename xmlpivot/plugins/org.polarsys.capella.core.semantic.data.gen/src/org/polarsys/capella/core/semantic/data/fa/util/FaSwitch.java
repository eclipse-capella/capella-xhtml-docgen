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

package org.polarsys.capella.core.semantic.data.fa.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.polarsys.capella.core.semantic.data.activity.AbstractAction;
import org.polarsys.capella.core.semantic.data.activity.ActivityEdge;
import org.polarsys.capella.core.semantic.data.activity.ActivityNode;
import org.polarsys.capella.core.semantic.data.activity.InputPin;
import org.polarsys.capella.core.semantic.data.activity.ObjectFlow;
import org.polarsys.capella.core.semantic.data.activity.ObjectNode;
import org.polarsys.capella.core.semantic.data.activity.OutputPin;
import org.polarsys.capella.core.semantic.data.activity.Pin;

import org.polarsys.capella.core.semantic.data.behavior.AbstractEvent;

import org.polarsys.capella.core.semantic.data.capellacore.CapellaElement;
import org.polarsys.capella.core.semantic.data.capellacore.Feature;
import org.polarsys.capella.core.semantic.data.capellacore.InvolvedElement;
import org.polarsys.capella.core.semantic.data.capellacore.NamedElement;
import org.polarsys.capella.core.semantic.data.capellacore.Namespace;
import org.polarsys.capella.core.semantic.data.capellacore.Structure;
import org.polarsys.capella.core.semantic.data.capellacore.Type;
import org.polarsys.capella.core.semantic.data.capellacore.TypedElement;

import org.polarsys.capella.core.semantic.data.emde.Element;
import org.polarsys.capella.core.semantic.data.emde.ExtensibleElement;

import org.polarsys.capella.core.semantic.data.fa.*;

import org.polarsys.capella.core.semantic.data.information.AbstractEventOperation;
import org.polarsys.capella.core.semantic.data.information.MultiplicityElement;
import org.polarsys.capella.core.semantic.data.information.Partition;
import org.polarsys.capella.core.semantic.data.information.Port;
import org.polarsys.capella.core.semantic.data.information.Property;

import org.polarsys.capella.core.semantic.data.modellingcore.AbstractInformationFlow;
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
 * @see org.polarsys.capella.core.semantic.data.fa.FaPackage
 * @generated
 */
public class FaSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FaPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FaSwitch() {
		if (modelPackage == null) {
			modelPackage = FaPackage.eINSTANCE;
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
			case FaPackage.ABSTRACT_FUNCTIONAL_ARCHITECTURE: {
				AbstractFunctionalArchitecture abstractFunctionalArchitecture = (AbstractFunctionalArchitecture)theEObject;
				T result = caseAbstractFunctionalArchitecture(abstractFunctionalArchitecture);
				if (result == null) result = caseStructure(abstractFunctionalArchitecture);
				if (result == null) result = caseNamespace(abstractFunctionalArchitecture);
				if (result == null) result = caseNamedElement(abstractFunctionalArchitecture);
				if (result == null) result = caseAbstractNamedElement(abstractFunctionalArchitecture);
				if (result == null) result = caseCapellaElement(abstractFunctionalArchitecture);
				if (result == null) result = caseTraceableElement(abstractFunctionalArchitecture);
				if (result == null) result = caseModelElement(abstractFunctionalArchitecture);
				if (result == null) result = caseExtensibleElement(abstractFunctionalArchitecture);
				if (result == null) result = caseElement(abstractFunctionalArchitecture);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE: {
				AbstractFunctionalStructure abstractFunctionalStructure = (AbstractFunctionalStructure)theEObject;
				T result = caseAbstractFunctionalStructure(abstractFunctionalStructure);
				if (result == null) result = caseStructure(abstractFunctionalStructure);
				if (result == null) result = caseNamespace(abstractFunctionalStructure);
				if (result == null) result = caseNamedElement(abstractFunctionalStructure);
				if (result == null) result = caseAbstractNamedElement(abstractFunctionalStructure);
				if (result == null) result = caseCapellaElement(abstractFunctionalStructure);
				if (result == null) result = caseTraceableElement(abstractFunctionalStructure);
				if (result == null) result = caseModelElement(abstractFunctionalStructure);
				if (result == null) result = caseExtensibleElement(abstractFunctionalStructure);
				if (result == null) result = caseElement(abstractFunctionalStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FaPackage.ABSTRACT_FUNCTIONAL_BLOCK: {
				AbstractFunctionalBlock abstractFunctionalBlock = (AbstractFunctionalBlock)theEObject;
				T result = caseAbstractFunctionalBlock(abstractFunctionalBlock);
				if (result == null) result = caseType(abstractFunctionalBlock);
				if (result == null) result = caseAbstractType(abstractFunctionalBlock);
				if (result == null) result = caseNamespace(abstractFunctionalBlock);
				if (result == null) result = caseNamedElement(abstractFunctionalBlock);
				if (result == null) result = caseAbstractNamedElement(abstractFunctionalBlock);
				if (result == null) result = caseCapellaElement(abstractFunctionalBlock);
				if (result == null) result = caseExtensibleElement(abstractFunctionalBlock);
				if (result == null) result = caseTraceableElement(abstractFunctionalBlock);
				if (result == null) result = caseModelElement(abstractFunctionalBlock);
				if (result == null) result = caseElement(abstractFunctionalBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FaPackage.FUNCTION_PKG: {
				FunctionPkg functionPkg = (FunctionPkg)theEObject;
				T result = caseFunctionPkg(functionPkg);
				if (result == null) result = caseStructure(functionPkg);
				if (result == null) result = caseNamespace(functionPkg);
				if (result == null) result = caseNamedElement(functionPkg);
				if (result == null) result = caseAbstractNamedElement(functionPkg);
				if (result == null) result = caseCapellaElement(functionPkg);
				if (result == null) result = caseTraceableElement(functionPkg);
				if (result == null) result = caseModelElement(functionPkg);
				if (result == null) result = caseExtensibleElement(functionPkg);
				if (result == null) result = caseElement(functionPkg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FaPackage.EXCHANGE_CATEGORY: {
				ExchangeCategory exchangeCategory = (ExchangeCategory)theEObject;
				T result = caseExchangeCategory(exchangeCategory);
				if (result == null) result = caseNamedElement(exchangeCategory);
				if (result == null) result = caseAbstractNamedElement(exchangeCategory);
				if (result == null) result = caseCapellaElement(exchangeCategory);
				if (result == null) result = caseTraceableElement(exchangeCategory);
				if (result == null) result = caseModelElement(exchangeCategory);
				if (result == null) result = caseExtensibleElement(exchangeCategory);
				if (result == null) result = caseElement(exchangeCategory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FaPackage.FUNCTIONAL_CHAIN: {
				FunctionalChain functionalChain = (FunctionalChain)theEObject;
				T result = caseFunctionalChain(functionalChain);
				if (result == null) result = caseNamedElement(functionalChain);
				if (result == null) result = caseInvolvedElement(functionalChain);
				if (result == null) result = caseAbstractNamedElement(functionalChain);
				if (result == null) result = caseCapellaElement(functionalChain);
				if (result == null) result = caseTraceableElement(functionalChain);
				if (result == null) result = caseModelElement(functionalChain);
				if (result == null) result = caseExtensibleElement(functionalChain);
				if (result == null) result = caseElement(functionalChain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FaPackage.ABSTRACT_FUNCTIONAL_CHAIN_CONTAINER: {
				AbstractFunctionalChainContainer abstractFunctionalChainContainer = (AbstractFunctionalChainContainer)theEObject;
				T result = caseAbstractFunctionalChainContainer(abstractFunctionalChainContainer);
				if (result == null) result = caseCapellaElement(abstractFunctionalChainContainer);
				if (result == null) result = caseTraceableElement(abstractFunctionalChainContainer);
				if (result == null) result = caseModelElement(abstractFunctionalChainContainer);
				if (result == null) result = caseExtensibleElement(abstractFunctionalChainContainer);
				if (result == null) result = caseElement(abstractFunctionalChainContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FaPackage.FUNCTIONAL_CHAIN_INVOLVEMENT: {
				FunctionalChainInvolvement functionalChainInvolvement = (FunctionalChainInvolvement)theEObject;
				T result = caseFunctionalChainInvolvement(functionalChainInvolvement);
				if (result == null) result = caseCapellaElement(functionalChainInvolvement);
				if (result == null) result = caseTraceableElement(functionalChainInvolvement);
				if (result == null) result = caseModelElement(functionalChainInvolvement);
				if (result == null) result = caseExtensibleElement(functionalChainInvolvement);
				if (result == null) result = caseElement(functionalChainInvolvement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FaPackage.FUNCTIONAL_CHAIN_REFERENCE: {
				FunctionalChainReference functionalChainReference = (FunctionalChainReference)theEObject;
				T result = caseFunctionalChainReference(functionalChainReference);
				if (result == null) result = caseFunctionalChainInvolvement(functionalChainReference);
				if (result == null) result = caseCapellaElement(functionalChainReference);
				if (result == null) result = caseTraceableElement(functionalChainReference);
				if (result == null) result = caseModelElement(functionalChainReference);
				if (result == null) result = caseExtensibleElement(functionalChainReference);
				if (result == null) result = caseElement(functionalChainReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FaPackage.FUNCTION_INPUT_PORT: {
				FunctionInputPort functionInputPort = (FunctionInputPort)theEObject;
				T result = caseFunctionInputPort(functionInputPort);
				if (result == null) result = caseFunctionPort(functionInputPort);
				if (result == null) result = caseInputPin(functionInputPort);
				if (result == null) result = casePort(functionInputPort);
				if (result == null) result = caseTypedElement(functionInputPort);
				if (result == null) result = casePin(functionInputPort);
				if (result == null) result = caseNamedElement(functionInputPort);
				if (result == null) result = caseObjectNode(functionInputPort);
				if (result == null) result = caseCapellaElement(functionInputPort);
				if (result == null) result = caseActivityNode(functionInputPort);
				if (result == null) result = caseAbstractNamedElement(functionInputPort);
				if (result == null) result = caseTraceableElement(functionInputPort);
				if (result == null) result = caseModelElement(functionInputPort);
				if (result == null) result = caseExtensibleElement(functionInputPort);
				if (result == null) result = caseElement(functionInputPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FaPackage.FUNCTION_OUTPUT_PORT: {
				FunctionOutputPort functionOutputPort = (FunctionOutputPort)theEObject;
				T result = caseFunctionOutputPort(functionOutputPort);
				if (result == null) result = caseFunctionPort(functionOutputPort);
				if (result == null) result = caseOutputPin(functionOutputPort);
				if (result == null) result = casePort(functionOutputPort);
				if (result == null) result = caseTypedElement(functionOutputPort);
				if (result == null) result = casePin(functionOutputPort);
				if (result == null) result = caseNamedElement(functionOutputPort);
				if (result == null) result = caseObjectNode(functionOutputPort);
				if (result == null) result = caseCapellaElement(functionOutputPort);
				if (result == null) result = caseActivityNode(functionOutputPort);
				if (result == null) result = caseAbstractNamedElement(functionOutputPort);
				if (result == null) result = caseTraceableElement(functionOutputPort);
				if (result == null) result = caseModelElement(functionOutputPort);
				if (result == null) result = caseExtensibleElement(functionOutputPort);
				if (result == null) result = caseElement(functionOutputPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FaPackage.FUNCTIONAL_EXCHANGE: {
				FunctionalExchange functionalExchange = (FunctionalExchange)theEObject;
				T result = caseFunctionalExchange(functionalExchange);
				if (result == null) result = caseInvolvedElement(functionalExchange);
				if (result == null) result = caseObjectFlow(functionalExchange);
				if (result == null) result = caseAbstractEvent(functionalExchange);
				if (result == null) result = caseAbstractEventOperation(functionalExchange);
				if (result == null) result = caseNamedElement(functionalExchange);
				if (result == null) result = caseCapellaElement(functionalExchange);
				if (result == null) result = caseActivityEdge(functionalExchange);
				if (result == null) result = caseAbstractType(functionalExchange);
				if (result == null) result = caseAbstractNamedElement(functionalExchange);
				if (result == null) result = caseTraceableElement(functionalExchange);
				if (result == null) result = caseModelElement(functionalExchange);
				if (result == null) result = caseExtensibleElement(functionalExchange);
				if (result == null) result = caseElement(functionalExchange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FaPackage.ABSTRACT_FUNCTION: {
				AbstractFunction abstractFunction = (AbstractFunction)theEObject;
				T result = caseAbstractFunction(abstractFunction);
				if (result == null) result = caseNamespace(abstractFunction);
				if (result == null) result = caseInvolvedElement(abstractFunction);
				if (result == null) result = caseAbstractFunctionalChainContainer(abstractFunction);
				if (result == null) result = caseAbstractEvent(abstractFunction);
				if (result == null) result = caseProperty(abstractFunction);
				if (result == null) result = caseAbstractAction(abstractFunction);
				if (result == null) result = caseAbstractType(abstractFunction);
				if (result == null) result = caseFeature(abstractFunction);
				if (result == null) result = caseTypedElement(abstractFunction);
				if (result == null) result = caseMultiplicityElement(abstractFunction);
				if (result == null) result = caseActivityNode(abstractFunction);
				if (result == null) result = caseNamedElement(abstractFunction);
				if (result == null) result = caseAbstractNamedElement(abstractFunction);
				if (result == null) result = caseCapellaElement(abstractFunction);
				if (result == null) result = caseTraceableElement(abstractFunction);
				if (result == null) result = caseModelElement(abstractFunction);
				if (result == null) result = caseExtensibleElement(abstractFunction);
				if (result == null) result = caseElement(abstractFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FaPackage.FUNCTION_PORT: {
				FunctionPort functionPort = (FunctionPort)theEObject;
				T result = caseFunctionPort(functionPort);
				if (result == null) result = casePort(functionPort);
				if (result == null) result = caseTypedElement(functionPort);
				if (result == null) result = caseNamedElement(functionPort);
				if (result == null) result = caseAbstractNamedElement(functionPort);
				if (result == null) result = caseCapellaElement(functionPort);
				if (result == null) result = caseTraceableElement(functionPort);
				if (result == null) result = caseModelElement(functionPort);
				if (result == null) result = caseExtensibleElement(functionPort);
				if (result == null) result = caseElement(functionPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FaPackage.COMPONENT_EXCHANGE: {
				ComponentExchange componentExchange = (ComponentExchange)theEObject;
				T result = caseComponentExchange(componentExchange);
				if (result == null) result = caseAbstractEvent(componentExchange);
				if (result == null) result = caseAbstractEventOperation(componentExchange);
				if (result == null) result = caseAbstractInformationFlow(componentExchange);
				if (result == null) result = caseAbstractType(componentExchange);
				if (result == null) result = caseNamedElement(componentExchange);
				if (result == null) result = caseAbstractNamedElement(componentExchange);
				if (result == null) result = caseCapellaElement(componentExchange);
				if (result == null) result = caseTraceableElement(componentExchange);
				if (result == null) result = caseModelElement(componentExchange);
				if (result == null) result = caseExtensibleElement(componentExchange);
				if (result == null) result = caseElement(componentExchange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FaPackage.COMPONENT_EXCHANGE_ALLOCATOR: {
				ComponentExchangeAllocator componentExchangeAllocator = (ComponentExchangeAllocator)theEObject;
				T result = caseComponentExchangeAllocator(componentExchangeAllocator);
				if (result == null) result = caseNamedElement(componentExchangeAllocator);
				if (result == null) result = caseAbstractNamedElement(componentExchangeAllocator);
				if (result == null) result = caseCapellaElement(componentExchangeAllocator);
				if (result == null) result = caseTraceableElement(componentExchangeAllocator);
				if (result == null) result = caseModelElement(componentExchangeAllocator);
				if (result == null) result = caseExtensibleElement(componentExchangeAllocator);
				if (result == null) result = caseElement(componentExchangeAllocator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FaPackage.COMPONENT_EXCHANGE_CATEGORY: {
				ComponentExchangeCategory componentExchangeCategory = (ComponentExchangeCategory)theEObject;
				T result = caseComponentExchangeCategory(componentExchangeCategory);
				if (result == null) result = caseNamedElement(componentExchangeCategory);
				if (result == null) result = caseAbstractNamedElement(componentExchangeCategory);
				if (result == null) result = caseCapellaElement(componentExchangeCategory);
				if (result == null) result = caseTraceableElement(componentExchangeCategory);
				if (result == null) result = caseModelElement(componentExchangeCategory);
				if (result == null) result = caseExtensibleElement(componentExchangeCategory);
				if (result == null) result = caseElement(componentExchangeCategory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FaPackage.COMPONENT_EXCHANGE_END: {
				ComponentExchangeEnd componentExchangeEnd = (ComponentExchangeEnd)theEObject;
				T result = caseComponentExchangeEnd(componentExchangeEnd);
				if (result == null) result = caseInformationsExchanger(componentExchangeEnd);
				if (result == null) result = caseCapellaElement(componentExchangeEnd);
				if (result == null) result = caseTraceableElement(componentExchangeEnd);
				if (result == null) result = caseModelElement(componentExchangeEnd);
				if (result == null) result = caseExtensibleElement(componentExchangeEnd);
				if (result == null) result = caseElement(componentExchangeEnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FaPackage.COMPONENT_PORT: {
				ComponentPort componentPort = (ComponentPort)theEObject;
				T result = caseComponentPort(componentPort);
				if (result == null) result = casePort(componentPort);
				if (result == null) result = casePartition(componentPort);
				if (result == null) result = caseInformationsExchanger(componentPort);
				if (result == null) result = caseProperty(componentPort);
				if (result == null) result = caseFeature(componentPort);
				if (result == null) result = caseTypedElement(componentPort);
				if (result == null) result = caseMultiplicityElement(componentPort);
				if (result == null) result = caseNamedElement(componentPort);
				if (result == null) result = caseAbstractNamedElement(componentPort);
				if (result == null) result = caseCapellaElement(componentPort);
				if (result == null) result = caseTraceableElement(componentPort);
				if (result == null) result = caseModelElement(componentPort);
				if (result == null) result = caseExtensibleElement(componentPort);
				if (result == null) result = caseElement(componentPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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
	 * Returns the result of interpreting the object as an instance of '<em>Exchange Category</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exchange Category</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExchangeCategory(ExchangeCategory object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Functional Chain Involvement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Functional Chain Involvement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionalChainInvolvement(FunctionalChainInvolvement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Functional Chain Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Functional Chain Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionalChainReference(FunctionalChainReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Input Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Input Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionInputPort(FunctionInputPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Output Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Output Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionOutputPort(FunctionOutputPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Functional Exchange</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Functional Exchange</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionalExchange(FunctionalExchange object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Function Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionPort(FunctionPort object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Component Exchange Category</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Exchange Category</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentExchangeCategory(ComponentExchangeCategory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Exchange End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Exchange End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentExchangeEnd(ComponentExchangeEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentPort(ComponentPort object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Object Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectNode(ObjectNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePin(Pin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Pin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Pin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputPin(InputPin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Pin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Pin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputPin(OutputPin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityEdge(ActivityEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectFlow(ObjectFlow object) {
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

} //FaSwitch
