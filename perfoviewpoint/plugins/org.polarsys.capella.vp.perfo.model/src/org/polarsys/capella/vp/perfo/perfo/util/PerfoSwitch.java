/*******************************************************************************
 * Copyright (c) 2006, 2015 Thales Global Services
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v1.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v10.html
 * 
 *   Contributors:
 *      Thales - initial API and implementation
 ******************************************************************************/
package org.polarsys.capella.vp.perfo.perfo.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.polarsys.capella.common.data.modellingcore.AbstractNamedElement;
import org.polarsys.capella.common.data.modellingcore.ModelElement;
import org.polarsys.capella.common.data.modellingcore.PublishableElement;
import org.polarsys.capella.common.data.modellingcore.TraceableElement;

import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.core.data.capellacore.NamedElement;

import org.polarsys.capella.vp.perfo.perfo.*;

import org.polarsys.kitalpha.emde.model.Element;
import org.polarsys.kitalpha.emde.model.ElementExtension;
import org.polarsys.kitalpha.emde.model.ExtensibleElement;

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
 * @see org.polarsys.capella.vp.perfo.perfo.PerfoPackage
 * @generated
 */
public class PerfoSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PerfoPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerfoSwitch() {
		if (modelPackage == null) {
			modelPackage = PerfoPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
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
		case PerfoPackage.PERFORMANCE_CRITERIA: {
			PerformanceCriteria performanceCriteria = (PerformanceCriteria) theEObject;
			T result = casePerformanceCriteria(performanceCriteria);
			if (result == null)
				result = caseNamedElement(performanceCriteria);
			if (result == null)
				result = caseAbstractNamedElement(performanceCriteria);
			if (result == null)
				result = caseCapellaElement(performanceCriteria);
			if (result == null)
				result = caseTraceableElement(performanceCriteria);
			if (result == null)
				result = casePublishableElement(performanceCriteria);
			if (result == null)
				result = caseModelElement(performanceCriteria);
			if (result == null)
				result = caseExtensibleElement(performanceCriteria);
			if (result == null)
				result = caseElement(performanceCriteria);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PerfoPackage.PERFORMANCE_CONSUMPTION: {
			PerformanceConsumption performanceConsumption = (PerformanceConsumption) theEObject;
			T result = casePerformanceConsumption(performanceConsumption);
			if (result == null)
				result = casePerformanceCriteria(performanceConsumption);
			if (result == null)
				result = caseNamedElement(performanceConsumption);
			if (result == null)
				result = caseAbstractNamedElement(performanceConsumption);
			if (result == null)
				result = caseCapellaElement(performanceConsumption);
			if (result == null)
				result = caseTraceableElement(performanceConsumption);
			if (result == null)
				result = casePublishableElement(performanceConsumption);
			if (result == null)
				result = caseModelElement(performanceConsumption);
			if (result == null)
				result = caseExtensibleElement(performanceConsumption);
			if (result == null)
				result = caseElement(performanceConsumption);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PerfoPackage.PERFORMANCE_CAPACITY: {
			PerformanceCapacity performanceCapacity = (PerformanceCapacity) theEObject;
			T result = casePerformanceCapacity(performanceCapacity);
			if (result == null)
				result = casePerformanceCriteria(performanceCapacity);
			if (result == null)
				result = caseNamedElement(performanceCapacity);
			if (result == null)
				result = caseAbstractNamedElement(performanceCapacity);
			if (result == null)
				result = caseCapellaElement(performanceCapacity);
			if (result == null)
				result = caseTraceableElement(performanceCapacity);
			if (result == null)
				result = casePublishableElement(performanceCapacity);
			if (result == null)
				result = caseModelElement(performanceCapacity);
			if (result == null)
				result = caseExtensibleElement(performanceCapacity);
			if (result == null)
				result = caseElement(performanceCapacity);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PerfoPackage.TIME_CONSUMPTION: {
			timeConsumption timeConsumption = (timeConsumption) theEObject;
			T result = casetimeConsumption(timeConsumption);
			if (result == null)
				result = casePerformanceConsumption(timeConsumption);
			if (result == null)
				result = caseUnityElement(timeConsumption);
			if (result == null)
				result = caseElementExtension(timeConsumption);
			if (result == null)
				result = casePerformanceCriteria(timeConsumption);
			if (result == null)
				result = caseNamedElement(timeConsumption);
			if (result == null)
				result = caseAbstractNamedElement(timeConsumption);
			if (result == null)
				result = caseCapellaElement(timeConsumption);
			if (result == null)
				result = caseTraceableElement(timeConsumption);
			if (result == null)
				result = casePublishableElement(timeConsumption);
			if (result == null)
				result = caseModelElement(timeConsumption);
			if (result == null)
				result = caseExtensibleElement(timeConsumption);
			if (result == null)
				result = caseElement(timeConsumption);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PerfoPackage.TIME_CAPACITY: {
			timeCapacity timeCapacity = (timeCapacity) theEObject;
			T result = casetimeCapacity(timeCapacity);
			if (result == null)
				result = casePerformanceCapacity(timeCapacity);
			if (result == null)
				result = caseUnityElement(timeCapacity);
			if (result == null)
				result = caseElementExtension(timeCapacity);
			if (result == null)
				result = casePerformanceCriteria(timeCapacity);
			if (result == null)
				result = caseNamedElement(timeCapacity);
			if (result == null)
				result = caseAbstractNamedElement(timeCapacity);
			if (result == null)
				result = caseCapellaElement(timeCapacity);
			if (result == null)
				result = caseTraceableElement(timeCapacity);
			if (result == null)
				result = casePublishableElement(timeCapacity);
			if (result == null)
				result = caseModelElement(timeCapacity);
			if (result == null)
				result = caseExtensibleElement(timeCapacity);
			if (result == null)
				result = caseElement(timeCapacity);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PerfoPackage.UNITY_ELEMENT: {
			UnityElement unityElement = (UnityElement) theEObject;
			T result = caseUnityElement(unityElement);
			if (result == null)
				result = caseNamedElement(unityElement);
			if (result == null)
				result = caseAbstractNamedElement(unityElement);
			if (result == null)
				result = caseCapellaElement(unityElement);
			if (result == null)
				result = caseTraceableElement(unityElement);
			if (result == null)
				result = casePublishableElement(unityElement);
			if (result == null)
				result = caseModelElement(unityElement);
			if (result == null)
				result = caseExtensibleElement(unityElement);
			if (result == null)
				result = caseElement(unityElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Performance Criteria</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Performance Criteria</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerformanceCriteria(PerformanceCriteria object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Performance Consumption</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Performance Consumption</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerformanceConsumption(PerformanceConsumption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Performance Capacity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Performance Capacity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerformanceCapacity(PerformanceCapacity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>time Consumption</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>time Consumption</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casetimeConsumption(timeConsumption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>time Capacity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>time Capacity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casetimeCapacity(timeCapacity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unity Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unity Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnityElement(UnityElement object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Publishable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Publishable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePublishableElement(PublishableElement object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Element Extension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Extension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementExtension(ElementExtension object) {
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

} //PerfoSwitch
