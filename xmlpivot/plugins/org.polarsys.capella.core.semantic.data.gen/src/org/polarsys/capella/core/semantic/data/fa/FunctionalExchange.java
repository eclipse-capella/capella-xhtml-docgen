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

import org.polarsys.capella.core.semantic.data.activity.ObjectFlow;

import org.polarsys.capella.core.semantic.data.behavior.AbstractEvent;

import org.polarsys.capella.core.semantic.data.capellacore.CapellaElement;
import org.polarsys.capella.core.semantic.data.capellacore.InvolvedElement;
import org.polarsys.capella.core.semantic.data.capellacore.NamedElement;

import org.polarsys.capella.core.semantic.data.information.AbstractEventOperation;
import org.polarsys.capella.core.semantic.data.information.ExchangeItem;

import org.polarsys.capella.core.semantic.data.modellingcore.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Functional Exchange</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.fa.FunctionalExchange#getExchangedItems <em>Exchanged Items</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.fa.FunctionalExchange#getCategories <em>Categories</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.fa.FunctionalExchange#getSourceFunctionOutputPort <em>Source Function Output Port</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.fa.FunctionalExchange#getTargetFunctionInputPort <em>Target Function Input Port</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.fa.FunctionalExchange#getRealizedFunctionalExchanges <em>Realized Functional Exchanges</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.fa.FaPackage#getFunctionalExchange()
 * @model
 * @generated
 */
public interface FunctionalExchange extends NamedElement, InvolvedElement, ObjectFlow, AbstractEvent, AbstractEventOperation, CapellaElement, ModelElement {
	/**
	 * Returns the value of the '<em><b>Exchanged Items</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.information.ExchangeItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exchanged Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exchanged Items</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.fa.FaPackage#getFunctionalExchange_ExchangedItems()
	 * @model
	 * @generated
	 */
	EList<ExchangeItem> getExchangedItems();

	/**
	 * Returns the value of the '<em><b>Categories</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.fa.ExchangeCategory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categories</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categories</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.fa.FaPackage#getFunctionalExchange_Categories()
	 * @model
	 * @generated
	 */
	EList<ExchangeCategory> getCategories();

	/**
	 * Returns the value of the '<em><b>Source Function Output Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Function Output Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Function Output Port</em>' reference.
	 * @see #setSourceFunctionOutputPort(FunctionOutputPort)
	 * @see org.polarsys.capella.core.semantic.data.fa.FaPackage#getFunctionalExchange_SourceFunctionOutputPort()
	 * @model
	 * @generated
	 */
	FunctionOutputPort getSourceFunctionOutputPort();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.fa.FunctionalExchange#getSourceFunctionOutputPort <em>Source Function Output Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Function Output Port</em>' reference.
	 * @see #getSourceFunctionOutputPort()
	 * @generated
	 */
	void setSourceFunctionOutputPort(FunctionOutputPort value);

	/**
	 * Returns the value of the '<em><b>Target Function Input Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Function Input Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Function Input Port</em>' reference.
	 * @see #setTargetFunctionInputPort(FunctionInputPort)
	 * @see org.polarsys.capella.core.semantic.data.fa.FaPackage#getFunctionalExchange_TargetFunctionInputPort()
	 * @model
	 * @generated
	 */
	FunctionInputPort getTargetFunctionInputPort();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.fa.FunctionalExchange#getTargetFunctionInputPort <em>Target Function Input Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Function Input Port</em>' reference.
	 * @see #getTargetFunctionInputPort()
	 * @generated
	 */
	void setTargetFunctionInputPort(FunctionInputPort value);

	/**
	 * Returns the value of the '<em><b>Realized Functional Exchanges</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.fa.FunctionalExchange}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realized Functional Exchanges</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realized Functional Exchanges</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.fa.FaPackage#getFunctionalExchange_RealizedFunctionalExchanges()
	 * @model
	 * @generated
	 */
	EList<FunctionalExchange> getRealizedFunctionalExchanges();

} // FunctionalExchange
