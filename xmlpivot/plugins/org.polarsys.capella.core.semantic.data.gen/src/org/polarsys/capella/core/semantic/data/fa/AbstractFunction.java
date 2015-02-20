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

package org.polarsys.capella.core.semantic.data.fa;

import org.eclipse.emf.common.util.EList;

import org.polarsys.capella.core.semantic.data.activity.AbstractAction;

import org.polarsys.capella.core.semantic.data.behavior.AbstractEvent;

import org.polarsys.capella.core.semantic.data.capellacommon.State;
import org.polarsys.capella.core.semantic.data.capellacommon.StateMachine;

import org.polarsys.capella.core.semantic.data.capellacore.InvolvedElement;
import org.polarsys.capella.core.semantic.data.capellacore.Namespace;

import org.polarsys.capella.core.semantic.data.information.Property;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.fa.AbstractFunction#getKind <em>Kind</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.fa.AbstractFunction#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.fa.AbstractFunction#getOwnedFunctionalExchanges <em>Owned Functional Exchanges</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.fa.AbstractFunction#getAvailableInStates <em>Available In States</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.fa.AbstractFunction#getLinkedStateMachine <em>Linked State Machine</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.fa.FaPackage#getAbstractFunction()
 * @model abstract="true"
 * @generated
 */
public interface AbstractFunction extends Namespace, InvolvedElement, AbstractFunctionalChainContainer, AbstractEvent, Property, AbstractAction {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.polarsys.capella.core.semantic.data.fa.FunctionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.polarsys.capella.core.semantic.data.fa.FunctionKind
	 * @see #setKind(FunctionKind)
	 * @see org.polarsys.capella.core.semantic.data.fa.FaPackage#getAbstractFunction_Kind()
	 * @model
	 * @generated
	 */
	FunctionKind getKind();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.fa.AbstractFunction#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.polarsys.capella.core.semantic.data.fa.FunctionKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(FunctionKind value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see #setCondition(String)
	 * @see org.polarsys.capella.core.semantic.data.fa.FaPackage#getAbstractFunction_Condition()
	 * @model
	 * @generated
	 */
	String getCondition();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.fa.AbstractFunction#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(String value);

	/**
	 * Returns the value of the '<em><b>Owned Functional Exchanges</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.fa.FunctionalExchange}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Functional Exchanges</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Functional Exchanges</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.fa.FaPackage#getAbstractFunction_OwnedFunctionalExchanges()
	 * @model containment="true"
	 * @generated
	 */
	EList<FunctionalExchange> getOwnedFunctionalExchanges();

	/**
	 * Returns the value of the '<em><b>Available In States</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.capellacommon.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Available In States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Available In States</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.fa.FaPackage#getAbstractFunction_AvailableInStates()
	 * @model
	 * @generated
	 */
	EList<State> getAvailableInStates();

	/**
	 * Returns the value of the '<em><b>Linked State Machine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linked State Machine</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linked State Machine</em>' reference.
	 * @see #setLinkedStateMachine(StateMachine)
	 * @see org.polarsys.capella.core.semantic.data.fa.FaPackage#getAbstractFunction_LinkedStateMachine()
	 * @model resolveProxies="false"
	 * @generated
	 */
	StateMachine getLinkedStateMachine();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.fa.AbstractFunction#getLinkedStateMachine <em>Linked State Machine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linked State Machine</em>' reference.
	 * @see #getLinkedStateMachine()
	 * @generated
	 */
	void setLinkedStateMachine(StateMachine value);

} // AbstractFunction
