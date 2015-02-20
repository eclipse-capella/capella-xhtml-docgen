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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.polarsys.capella.core.semantic.data.capellacommon.CapellacommonPackage
 * @generated
 */
public interface CapellacommonFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CapellacommonFactory eINSTANCE = org.polarsys.capella.core.semantic.data.capellacommon.impl.CapellacommonFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Generic Trace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generic Trace</em>'.
	 * @generated
	 */
	GenericTrace createGenericTrace();

	/**
	 * Returns a new object of class '<em>State Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State Machine</em>'.
	 * @generated
	 */
	StateMachine createStateMachine();

	/**
	 * Returns a new object of class '<em>Region</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Region</em>'.
	 * @generated
	 */
	Region createRegion();

	/**
	 * Returns a new object of class '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State</em>'.
	 * @generated
	 */
	State createState();

	/**
	 * Returns a new object of class '<em>Mode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mode</em>'.
	 * @generated
	 */
	Mode createMode();

	/**
	 * Returns a new object of class '<em>Final State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Final State</em>'.
	 * @generated
	 */
	FinalState createFinalState();

	/**
	 * Returns a new object of class '<em>State Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State Transition</em>'.
	 * @generated
	 */
	StateTransition createStateTransition();

	/**
	 * Returns a new object of class '<em>Initial Pseudo State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Initial Pseudo State</em>'.
	 * @generated
	 */
	InitialPseudoState createInitialPseudoState();

	/**
	 * Returns a new object of class '<em>Join Pseudo State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Join Pseudo State</em>'.
	 * @generated
	 */
	JoinPseudoState createJoinPseudoState();

	/**
	 * Returns a new object of class '<em>Fork Pseudo State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fork Pseudo State</em>'.
	 * @generated
	 */
	ForkPseudoState createForkPseudoState();

	/**
	 * Returns a new object of class '<em>Choice Pseudo State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Choice Pseudo State</em>'.
	 * @generated
	 */
	ChoicePseudoState createChoicePseudoState();

	/**
	 * Returns a new object of class '<em>Terminate Pseudo State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Terminate Pseudo State</em>'.
	 * @generated
	 */
	TerminatePseudoState createTerminatePseudoState();

	/**
	 * Returns a new object of class '<em>Shallow History Pseudo State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shallow History Pseudo State</em>'.
	 * @generated
	 */
	ShallowHistoryPseudoState createShallowHistoryPseudoState();

	/**
	 * Returns a new object of class '<em>Deep History Pseudo State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deep History Pseudo State</em>'.
	 * @generated
	 */
	DeepHistoryPseudoState createDeepHistoryPseudoState();

	/**
	 * Returns a new object of class '<em>Entry Point Pseudo State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entry Point Pseudo State</em>'.
	 * @generated
	 */
	EntryPointPseudoState createEntryPointPseudoState();

	/**
	 * Returns a new object of class '<em>Exit Point Pseudo State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exit Point Pseudo State</em>'.
	 * @generated
	 */
	ExitPointPseudoState createExitPointPseudoState();

	/**
	 * Returns a new object of class '<em>Change Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Change Event</em>'.
	 * @generated
	 */
	ChangeEvent createChangeEvent();

	/**
	 * Returns a new object of class '<em>Time Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Event</em>'.
	 * @generated
	 */
	TimeEvent createTimeEvent();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CapellacommonPackage getCapellacommonPackage();

} //CapellacommonFactory
