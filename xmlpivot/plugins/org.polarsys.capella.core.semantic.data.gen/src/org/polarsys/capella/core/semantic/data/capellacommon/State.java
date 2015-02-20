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

import org.polarsys.capella.core.semantic.data.fa.AbstractFunction;
import org.polarsys.capella.core.semantic.data.fa.FunctionalChain;

import org.polarsys.capella.core.semantic.data.interaction.AbstractCapability;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.capellacommon.State#getOwnedRegions <em>Owned Regions</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.capellacommon.State#getAvailableAbstractFunctions <em>Available Abstract Functions</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.capellacommon.State#getAvailableFunctionalChains <em>Available Functional Chains</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.capellacommon.State#getAvailableAbstractCapabilities <em>Available Abstract Capabilities</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.capellacommon.State#getDoActivity <em>Do Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.capellacommon.CapellacommonPackage#getState()
 * @model
 * @generated
 */
public interface State extends AbstractState {
	/**
	 * Returns the value of the '<em><b>Owned Regions</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.capellacommon.Region}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Regions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Regions</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.capellacommon.CapellacommonPackage#getState_OwnedRegions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Region> getOwnedRegions();

	/**
	 * Returns the value of the '<em><b>Available Abstract Functions</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.fa.AbstractFunction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Available Abstract Functions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Available Abstract Functions</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.capellacommon.CapellacommonPackage#getState_AvailableAbstractFunctions()
	 * @model resolveProxies="false"
	 * @generated
	 */
	EList<AbstractFunction> getAvailableAbstractFunctions();

	/**
	 * Returns the value of the '<em><b>Available Functional Chains</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.fa.FunctionalChain}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Available Functional Chains</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Available Functional Chains</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.capellacommon.CapellacommonPackage#getState_AvailableFunctionalChains()
	 * @model resolveProxies="false"
	 * @generated
	 */
	EList<FunctionalChain> getAvailableFunctionalChains();

	/**
	 * Returns the value of the '<em><b>Available Abstract Capabilities</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.interaction.AbstractCapability}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Available Abstract Capabilities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Available Abstract Capabilities</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.capellacommon.CapellacommonPackage#getState_AvailableAbstractCapabilities()
	 * @model resolveProxies="false"
	 * @generated
	 */
	EList<AbstractCapability> getAvailableAbstractCapabilities();

	/**
	 * Returns the value of the '<em><b>Do Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Do Activity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Do Activity</em>' reference.
	 * @see #setDoActivity(AbstractEvent)
	 * @see org.polarsys.capella.core.semantic.data.capellacommon.CapellacommonPackage#getState_DoActivity()
	 * @model
	 * @generated
	 */
	AbstractEvent getDoActivity();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.capellacommon.State#getDoActivity <em>Do Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Do Activity</em>' reference.
	 * @see #getDoActivity()
	 * @generated
	 */
	void setDoActivity(AbstractEvent value);

} // State
