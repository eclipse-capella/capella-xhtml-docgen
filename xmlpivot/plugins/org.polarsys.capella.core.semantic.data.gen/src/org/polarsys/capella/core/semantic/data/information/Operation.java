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

package org.polarsys.capella.core.semantic.data.information;

import org.eclipse.emf.common.util.EList;

import org.polarsys.capella.core.semantic.data.behavior.AbstractEvent;

import org.polarsys.capella.core.semantic.data.capellacore.Feature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.Operation#getOwnedParameters <em>Owned Parameters</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.Operation#getAllocatedOperations <em>Allocated Operations</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.Operation#getRealizedExchangeItems <em>Realized Exchange Items</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.information.InformationPackage#getOperation()
 * @model abstract="true"
 * @generated
 */
public interface Operation extends Feature, AbstractEvent, AbstractEventOperation {
	/**
	 * Returns the value of the '<em><b>Owned Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.information.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Parameters</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.information.InformationPackage#getOperation_OwnedParameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getOwnedParameters();

	/**
	 * Returns the value of the '<em><b>Allocated Operations</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.information.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocated Operations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocated Operations</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.information.InformationPackage#getOperation_AllocatedOperations()
	 * @model
	 * @generated
	 */
	EList<Operation> getAllocatedOperations();

	/**
	 * Returns the value of the '<em><b>Realized Exchange Items</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.information.ExchangeItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realized Exchange Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realized Exchange Items</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.information.InformationPackage#getOperation_RealizedExchangeItems()
	 * @model
	 * @generated
	 */
	EList<ExchangeItem> getRealizedExchangeItems();

} // Operation
