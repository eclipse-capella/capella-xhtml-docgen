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

import org.polarsys.capella.core.semantic.data.capellacommon.State;

import org.polarsys.capella.core.semantic.data.capellacore.CapellaElement;
import org.polarsys.capella.core.semantic.data.capellacore.InvolvedElement;
import org.polarsys.capella.core.semantic.data.capellacore.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Functional Chain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.fa.FunctionalChain#getKind <em>Kind</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.fa.FunctionalChain#getOwnedFunctionalChainInvolvements <em>Owned Functional Chain Involvements</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.fa.FunctionalChain#getAvailableInStates <em>Available In States</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.fa.FunctionalChain#getFirstFunctionalChainInvolvements <em>First Functional Chain Involvements</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.fa.FunctionalChain#getRealizedFunctionalChains <em>Realized Functional Chains</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.fa.FaPackage#getFunctionalChain()
 * @model
 * @generated
 */
public interface FunctionalChain extends NamedElement, InvolvedElement, CapellaElement {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.polarsys.capella.core.semantic.data.fa.FunctionalChainKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.polarsys.capella.core.semantic.data.fa.FunctionalChainKind
	 * @see #setKind(FunctionalChainKind)
	 * @see org.polarsys.capella.core.semantic.data.fa.FaPackage#getFunctionalChain_Kind()
	 * @model
	 * @generated
	 */
	FunctionalChainKind getKind();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.fa.FunctionalChain#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.polarsys.capella.core.semantic.data.fa.FunctionalChainKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(FunctionalChainKind value);

	/**
	 * Returns the value of the '<em><b>Owned Functional Chain Involvements</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.fa.FunctionalChainInvolvement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Functional Chain Involvements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Functional Chain Involvements</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.fa.FaPackage#getFunctionalChain_OwnedFunctionalChainInvolvements()
	 * @model containment="true"
	 * @generated
	 */
	EList<FunctionalChainInvolvement> getOwnedFunctionalChainInvolvements();

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
	 * @see org.polarsys.capella.core.semantic.data.fa.FaPackage#getFunctionalChain_AvailableInStates()
	 * @model
	 * @generated
	 */
	EList<State> getAvailableInStates();

	/**
	 * Returns the value of the '<em><b>First Functional Chain Involvements</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.fa.FunctionalChainInvolvement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Functional Chain Involvements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Functional Chain Involvements</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.fa.FaPackage#getFunctionalChain_FirstFunctionalChainInvolvements()
	 * @model
	 * @generated
	 */
	EList<FunctionalChainInvolvement> getFirstFunctionalChainInvolvements();

	/**
	 * Returns the value of the '<em><b>Realized Functional Chains</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.fa.FunctionalChain}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realized Functional Chains</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realized Functional Chains</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.fa.FaPackage#getFunctionalChain_RealizedFunctionalChains()
	 * @model
	 * @generated
	 */
	EList<FunctionalChain> getRealizedFunctionalChains();

} // FunctionalChain
