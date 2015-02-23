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

package org.polarsys.capella.core.semantic.data.interaction;

import org.eclipse.emf.common.util.EList;

import org.polarsys.capella.core.semantic.data.capellacommon.State;

import org.polarsys.capella.core.semantic.data.capellacore.CapellaElement;
import org.polarsys.capella.core.semantic.data.capellacore.Constraint;
import org.polarsys.capella.core.semantic.data.capellacore.Structure;

import org.polarsys.capella.core.semantic.data.fa.AbstractFunction;
import org.polarsys.capella.core.semantic.data.fa.AbstractFunctionalChainContainer;
import org.polarsys.capella.core.semantic.data.fa.FunctionalChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Capability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.interaction.AbstractCapability#getPreCondition <em>Pre Condition</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.interaction.AbstractCapability#getPostCondition <em>Post Condition</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.interaction.AbstractCapability#getOwnedScenarios <em>Owned Scenarios</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.interaction.AbstractCapability#getSuper <em>Super</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.interaction.AbstractCapability#getIncludedAbstractCapabilities <em>Included Abstract Capabilities</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.interaction.AbstractCapability#getExtendedAbstractCapabilities <em>Extended Abstract Capabilities</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.interaction.AbstractCapability#getAvailableInStates <em>Available In States</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.interaction.AbstractCapability#getInvolvedAbstractFunctions <em>Involved Abstract Functions</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.interaction.AbstractCapability#getInvolvedFunctionalChains <em>Involved Functional Chains</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.interaction.InteractionPackage#getAbstractCapability()
 * @model abstract="true"
 * @generated
 */
public interface AbstractCapability extends Structure, AbstractFunctionalChainContainer, CapellaElement {
	/**
	 * Returns the value of the '<em><b>Pre Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre Condition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre Condition</em>' reference.
	 * @see #setPreCondition(Constraint)
	 * @see org.polarsys.capella.core.semantic.data.interaction.InteractionPackage#getAbstractCapability_PreCondition()
	 * @model
	 * @generated
	 */
	Constraint getPreCondition();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.interaction.AbstractCapability#getPreCondition <em>Pre Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre Condition</em>' reference.
	 * @see #getPreCondition()
	 * @generated
	 */
	void setPreCondition(Constraint value);

	/**
	 * Returns the value of the '<em><b>Post Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Post Condition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post Condition</em>' reference.
	 * @see #setPostCondition(Constraint)
	 * @see org.polarsys.capella.core.semantic.data.interaction.InteractionPackage#getAbstractCapability_PostCondition()
	 * @model
	 * @generated
	 */
	Constraint getPostCondition();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.interaction.AbstractCapability#getPostCondition <em>Post Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post Condition</em>' reference.
	 * @see #getPostCondition()
	 * @generated
	 */
	void setPostCondition(Constraint value);

	/**
	 * Returns the value of the '<em><b>Owned Scenarios</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.interaction.Scenario}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Scenarios</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Scenarios</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.interaction.InteractionPackage#getAbstractCapability_OwnedScenarios()
	 * @model containment="true"
	 * @generated
	 */
	EList<Scenario> getOwnedScenarios();

	/**
	 * Returns the value of the '<em><b>Super</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.interaction.AbstractCapability}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.interaction.InteractionPackage#getAbstractCapability_Super()
	 * @model
	 * @generated
	 */
	EList<AbstractCapability> getSuper();

	/**
	 * Returns the value of the '<em><b>Included Abstract Capabilities</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.interaction.AbstractCapability}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Included Abstract Capabilities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Included Abstract Capabilities</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.interaction.InteractionPackage#getAbstractCapability_IncludedAbstractCapabilities()
	 * @model
	 * @generated
	 */
	EList<AbstractCapability> getIncludedAbstractCapabilities();

	/**
	 * Returns the value of the '<em><b>Extended Abstract Capabilities</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.interaction.AbstractCapability}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extended Abstract Capabilities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extended Abstract Capabilities</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.interaction.InteractionPackage#getAbstractCapability_ExtendedAbstractCapabilities()
	 * @model
	 * @generated
	 */
	EList<AbstractCapability> getExtendedAbstractCapabilities();

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
	 * @see org.polarsys.capella.core.semantic.data.interaction.InteractionPackage#getAbstractCapability_AvailableInStates()
	 * @model
	 * @generated
	 */
	EList<State> getAvailableInStates();

	/**
	 * Returns the value of the '<em><b>Involved Abstract Functions</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.fa.AbstractFunction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Involved Abstract Functions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Involved Abstract Functions</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.interaction.InteractionPackage#getAbstractCapability_InvolvedAbstractFunctions()
	 * @model
	 * @generated
	 */
	EList<AbstractFunction> getInvolvedAbstractFunctions();

	/**
	 * Returns the value of the '<em><b>Involved Functional Chains</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.fa.FunctionalChain}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Involved Functional Chains</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Involved Functional Chains</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.interaction.InteractionPackage#getAbstractCapability_InvolvedFunctionalChains()
	 * @model
	 * @generated
	 */
	EList<FunctionalChain> getInvolvedFunctionalChains();

} // AbstractCapability
