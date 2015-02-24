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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Functional Chain Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.fa.AbstractFunctionalChainContainer#getOwnedFunctionalChains <em>Owned Functional Chains</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.fa.FaPackage#getAbstractFunctionalChainContainer()
 * @model abstract="true"
 * @generated
 */
public interface AbstractFunctionalChainContainer extends CapellaElement {
	/**
	 * Returns the value of the '<em><b>Owned Functional Chains</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.fa.FunctionalChain}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Functional Chains</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Functional Chains</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.fa.FaPackage#getAbstractFunctionalChainContainer_OwnedFunctionalChains()
	 * @model containment="true"
	 * @generated
	 */
	EList<FunctionalChain> getOwnedFunctionalChains();

} // AbstractFunctionalChainContainer
