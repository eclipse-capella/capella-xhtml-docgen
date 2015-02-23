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

import org.polarsys.capella.core.semantic.data.capellacore.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Functional Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.fa.AbstractFunctionalBlock#getOwnedComponentExchanges <em>Owned Component Exchanges</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.fa.AbstractFunctionalBlock#getOwnedComponentExchangeCategories <em>Owned Component Exchange Categories</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.fa.FaPackage#getAbstractFunctionalBlock()
 * @model abstract="true"
 * @generated
 */
public interface AbstractFunctionalBlock extends Type {
	/**
	 * Returns the value of the '<em><b>Owned Component Exchanges</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.fa.ComponentExchange}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Component Exchanges</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Component Exchanges</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.fa.FaPackage#getAbstractFunctionalBlock_OwnedComponentExchanges()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComponentExchange> getOwnedComponentExchanges();

	/**
	 * Returns the value of the '<em><b>Owned Component Exchange Categories</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.fa.ComponentExchangeCategory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Component Exchange Categories</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Component Exchange Categories</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.fa.FaPackage#getAbstractFunctionalBlock_OwnedComponentExchangeCategories()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComponentExchangeCategory> getOwnedComponentExchangeCategories();

} // AbstractFunctionalBlock
