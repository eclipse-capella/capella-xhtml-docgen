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

package org.polarsys.capella.core.semantic.data.capellacommon;

import org.eclipse.emf.common.util.EList;

import org.polarsys.capella.core.semantic.data.behavior.AbstractEvent;

import org.polarsys.capella.core.semantic.data.capellacore.CapellaElement;
import org.polarsys.capella.core.semantic.data.capellacore.Constraint;
import org.polarsys.capella.core.semantic.data.capellacore.NamedElement;

import org.polarsys.capella.core.semantic.data.modellingcore.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.capellacommon.StateTransition#getKind <em>Kind</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.capellacommon.StateTransition#getTriggerDescription <em>Trigger Description</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.capellacommon.StateTransition#getGuard <em>Guard</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.capellacommon.StateTransition#getSource <em>Source</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.capellacommon.StateTransition#getTarget <em>Target</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.capellacommon.StateTransition#getEffect <em>Effect</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.capellacommon.StateTransition#getTriggers <em>Triggers</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.capellacommon.StateTransition#getRealizedStateTransitions <em>Realized State Transitions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.capellacommon.CapellacommonPackage#getStateTransition()
 * @model
 * @generated
 */
public interface StateTransition extends NamedElement, CapellaElement, ModelElement {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.polarsys.capella.core.semantic.data.capellacommon.TransitionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.polarsys.capella.core.semantic.data.capellacommon.TransitionKind
	 * @see #setKind(TransitionKind)
	 * @see org.polarsys.capella.core.semantic.data.capellacommon.CapellacommonPackage#getStateTransition_Kind()
	 * @model
	 * @generated
	 */
	TransitionKind getKind();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.capellacommon.StateTransition#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.polarsys.capella.core.semantic.data.capellacommon.TransitionKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(TransitionKind value);

	/**
	 * Returns the value of the '<em><b>Trigger Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trigger Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger Description</em>' attribute.
	 * @see #setTriggerDescription(String)
	 * @see org.polarsys.capella.core.semantic.data.capellacommon.CapellacommonPackage#getStateTransition_TriggerDescription()
	 * @model
	 * @generated
	 */
	String getTriggerDescription();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.capellacommon.StateTransition#getTriggerDescription <em>Trigger Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger Description</em>' attribute.
	 * @see #getTriggerDescription()
	 * @generated
	 */
	void setTriggerDescription(String value);

	/**
	 * Returns the value of the '<em><b>Guard</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guard</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard</em>' reference.
	 * @see #setGuard(Constraint)
	 * @see org.polarsys.capella.core.semantic.data.capellacommon.CapellacommonPackage#getStateTransition_Guard()
	 * @model
	 * @generated
	 */
	Constraint getGuard();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.capellacommon.StateTransition#getGuard <em>Guard</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard</em>' reference.
	 * @see #getGuard()
	 * @generated
	 */
	void setGuard(Constraint value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(AbstractState)
	 * @see org.polarsys.capella.core.semantic.data.capellacommon.CapellacommonPackage#getStateTransition_Source()
	 * @model required="true"
	 * @generated
	 */
	AbstractState getSource();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.capellacommon.StateTransition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(AbstractState value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(AbstractState)
	 * @see org.polarsys.capella.core.semantic.data.capellacommon.CapellacommonPackage#getStateTransition_Target()
	 * @model required="true"
	 * @generated
	 */
	AbstractState getTarget();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.capellacommon.StateTransition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(AbstractState value);

	/**
	 * Returns the value of the '<em><b>Effect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effect</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effect</em>' reference.
	 * @see #setEffect(AbstractEvent)
	 * @see org.polarsys.capella.core.semantic.data.capellacommon.CapellacommonPackage#getStateTransition_Effect()
	 * @model
	 * @generated
	 */
	AbstractEvent getEffect();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.capellacommon.StateTransition#getEffect <em>Effect</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effect</em>' reference.
	 * @see #getEffect()
	 * @generated
	 */
	void setEffect(AbstractEvent value);

	/**
	 * Returns the value of the '<em><b>Triggers</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.behavior.AbstractEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Triggers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triggers</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.capellacommon.CapellacommonPackage#getStateTransition_Triggers()
	 * @model
	 * @generated
	 */
	EList<AbstractEvent> getTriggers();

	/**
	 * Returns the value of the '<em><b>Realized State Transitions</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.capellacommon.StateTransition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realized State Transitions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realized State Transitions</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.capellacommon.CapellacommonPackage#getStateTransition_RealizedStateTransitions()
	 * @model resolveProxies="false"
	 * @generated
	 */
	EList<StateTransition> getRealizedStateTransitions();

} // StateTransition
