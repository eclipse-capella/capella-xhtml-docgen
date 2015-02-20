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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.polarsys.capella.core.semantic.data.fa.FaPackage
 * @generated
 */
public interface FaFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FaFactory eINSTANCE = org.polarsys.capella.core.semantic.data.fa.impl.FaFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Exchange Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exchange Category</em>'.
	 * @generated
	 */
	ExchangeCategory createExchangeCategory();

	/**
	 * Returns a new object of class '<em>Functional Chain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Functional Chain</em>'.
	 * @generated
	 */
	FunctionalChain createFunctionalChain();

	/**
	 * Returns a new object of class '<em>Functional Chain Involvement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Functional Chain Involvement</em>'.
	 * @generated
	 */
	FunctionalChainInvolvement createFunctionalChainInvolvement();

	/**
	 * Returns a new object of class '<em>Functional Chain Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Functional Chain Reference</em>'.
	 * @generated
	 */
	FunctionalChainReference createFunctionalChainReference();

	/**
	 * Returns a new object of class '<em>Function Input Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Input Port</em>'.
	 * @generated
	 */
	FunctionInputPort createFunctionInputPort();

	/**
	 * Returns a new object of class '<em>Function Output Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Output Port</em>'.
	 * @generated
	 */
	FunctionOutputPort createFunctionOutputPort();

	/**
	 * Returns a new object of class '<em>Functional Exchange</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Functional Exchange</em>'.
	 * @generated
	 */
	FunctionalExchange createFunctionalExchange();

	/**
	 * Returns a new object of class '<em>Component Exchange</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Exchange</em>'.
	 * @generated
	 */
	ComponentExchange createComponentExchange();

	/**
	 * Returns a new object of class '<em>Component Exchange Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Exchange Category</em>'.
	 * @generated
	 */
	ComponentExchangeCategory createComponentExchangeCategory();

	/**
	 * Returns a new object of class '<em>Component Exchange End</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Exchange End</em>'.
	 * @generated
	 */
	ComponentExchangeEnd createComponentExchangeEnd();

	/**
	 * Returns a new object of class '<em>Component Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Port</em>'.
	 * @generated
	 */
	ComponentPort createComponentPort();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FaPackage getFaPackage();

} //FaFactory
