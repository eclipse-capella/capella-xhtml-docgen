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

import org.polarsys.capella.core.semantic.data.behavior.AbstractBehavior;

import org.polarsys.capella.core.semantic.data.capellacore.Constraint;
import org.polarsys.capella.core.semantic.data.capellacore.Namespace;

import org.polarsys.capella.core.semantic.data.cs.Part;

import org.polarsys.capella.core.semantic.data.fa.AbstractFunction;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.interaction.Scenario#getKind <em>Kind</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.interaction.Scenario#isMerged <em>Merged</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.interaction.Scenario#getPreCondition <em>Pre Condition</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.interaction.Scenario#getPostCondition <em>Post Condition</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.interaction.Scenario#getOwnedMessages <em>Owned Messages</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.interaction.Scenario#getContainedFunctions <em>Contained Functions</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.interaction.Scenario#getContainedParts <em>Contained Parts</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.interaction.Scenario#getReferencedScenarios <em>Referenced Scenarios</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.interaction.Scenario#getRealizedScenarios <em>Realized Scenarios</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.interaction.InteractionPackage#getScenario()
 * @model
 * @generated
 */
public interface Scenario extends Namespace, AbstractBehavior {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The default value is <code>"UNSET"</code>.
	 * The literals are from the enumeration {@link org.polarsys.capella.core.semantic.data.interaction.ScenarioKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.polarsys.capella.core.semantic.data.interaction.ScenarioKind
	 * @see #setKind(ScenarioKind)
	 * @see org.polarsys.capella.core.semantic.data.interaction.InteractionPackage#getScenario_Kind()
	 * @model default="UNSET"
	 * @generated
	 */
	ScenarioKind getKind();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.interaction.Scenario#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.polarsys.capella.core.semantic.data.interaction.ScenarioKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(ScenarioKind value);

	/**
	 * Returns the value of the '<em><b>Merged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Merged</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Merged</em>' attribute.
	 * @see #setMerged(boolean)
	 * @see org.polarsys.capella.core.semantic.data.interaction.InteractionPackage#getScenario_Merged()
	 * @model
	 * @generated
	 */
	boolean isMerged();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.interaction.Scenario#isMerged <em>Merged</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Merged</em>' attribute.
	 * @see #isMerged()
	 * @generated
	 */
	void setMerged(boolean value);

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
	 * @see org.polarsys.capella.core.semantic.data.interaction.InteractionPackage#getScenario_PreCondition()
	 * @model
	 * @generated
	 */
	Constraint getPreCondition();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.interaction.Scenario#getPreCondition <em>Pre Condition</em>}' reference.
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
	 * @see org.polarsys.capella.core.semantic.data.interaction.InteractionPackage#getScenario_PostCondition()
	 * @model
	 * @generated
	 */
	Constraint getPostCondition();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.interaction.Scenario#getPostCondition <em>Post Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post Condition</em>' reference.
	 * @see #getPostCondition()
	 * @generated
	 */
	void setPostCondition(Constraint value);

	/**
	 * Returns the value of the '<em><b>Owned Messages</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.interaction.SequenceMessage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Messages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Messages</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.interaction.InteractionPackage#getScenario_OwnedMessages()
	 * @model containment="true"
	 * @generated
	 */
	EList<SequenceMessage> getOwnedMessages();

	/**
	 * Returns the value of the '<em><b>Contained Functions</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.fa.AbstractFunction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Functions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Functions</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.interaction.InteractionPackage#getScenario_ContainedFunctions()
	 * @model
	 * @generated
	 */
	EList<AbstractFunction> getContainedFunctions();

	/**
	 * Returns the value of the '<em><b>Contained Parts</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.cs.Part}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Parts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Parts</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.interaction.InteractionPackage#getScenario_ContainedParts()
	 * @model
	 * @generated
	 */
	EList<Part> getContainedParts();

	/**
	 * Returns the value of the '<em><b>Referenced Scenarios</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.interaction.Scenario}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Scenarios</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Scenarios</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.interaction.InteractionPackage#getScenario_ReferencedScenarios()
	 * @model
	 * @generated
	 */
	EList<Scenario> getReferencedScenarios();

	/**
	 * Returns the value of the '<em><b>Realized Scenarios</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.interaction.Scenario}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realized Scenarios</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realized Scenarios</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.interaction.InteractionPackage#getScenario_RealizedScenarios()
	 * @model
	 * @generated
	 */
	EList<Scenario> getRealizedScenarios();

} // Scenario
