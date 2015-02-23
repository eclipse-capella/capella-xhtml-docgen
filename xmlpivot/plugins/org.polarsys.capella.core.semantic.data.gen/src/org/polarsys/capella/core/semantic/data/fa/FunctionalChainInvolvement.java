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

import org.polarsys.capella.core.semantic.data.capellacore.CapellaElement;
import org.polarsys.capella.core.semantic.data.capellacore.InvolvedElement;

import org.polarsys.capella.core.semantic.data.modellingcore.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Functional Chain Involvement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.fa.FunctionalChainInvolvement#getNextFunctionalChainInvolvements <em>Next Functional Chain Involvements</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.fa.FunctionalChainInvolvement#getInvolvedElement <em>Involved Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.fa.FaPackage#getFunctionalChainInvolvement()
 * @model
 * @generated
 */
public interface FunctionalChainInvolvement extends CapellaElement, ModelElement {
	/**
	 * Returns the value of the '<em><b>Next Functional Chain Involvements</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.fa.FunctionalChainInvolvement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Functional Chain Involvements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Functional Chain Involvements</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.fa.FaPackage#getFunctionalChainInvolvement_NextFunctionalChainInvolvements()
	 * @model
	 * @generated
	 */
	EList<FunctionalChainInvolvement> getNextFunctionalChainInvolvements();

	/**
	 * Returns the value of the '<em><b>Involved Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Involved Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Involved Element</em>' reference.
	 * @see #setInvolvedElement(InvolvedElement)
	 * @see org.polarsys.capella.core.semantic.data.fa.FaPackage#getFunctionalChainInvolvement_InvolvedElement()
	 * @model
	 * @generated
	 */
	InvolvedElement getInvolvedElement();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.fa.FunctionalChainInvolvement#getInvolvedElement <em>Involved Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Involved Element</em>' reference.
	 * @see #getInvolvedElement()
	 * @generated
	 */
	void setInvolvedElement(InvolvedElement value);

} // FunctionalChainInvolvement
