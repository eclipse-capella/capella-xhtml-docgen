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

package org.polarsys.capella.core.semantic.data.cs;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.polarsys.capella.core.semantic.data.cs.CsPackage
 * @generated
 */
public interface CsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CsFactory eINSTANCE = org.polarsys.capella.core.semantic.data.cs.impl.CsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Part</em>'.
	 * @generated
	 */
	Part createPart();

	/**
	 * Returns a new object of class '<em>Interface Pkg</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface Pkg</em>'.
	 * @generated
	 */
	InterfacePkg createInterfacePkg();

	/**
	 * Returns a new object of class '<em>Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface</em>'.
	 * @generated
	 */
	Interface createInterface();

	/**
	 * Returns a new object of class '<em>Exchange Item Allocation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exchange Item Allocation</em>'.
	 * @generated
	 */
	ExchangeItemAllocation createExchangeItemAllocation();

	/**
	 * Returns a new object of class '<em>Physical Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Physical Link</em>'.
	 * @generated
	 */
	PhysicalLink createPhysicalLink();

	/**
	 * Returns a new object of class '<em>Physical Link Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Physical Link Category</em>'.
	 * @generated
	 */
	PhysicalLinkCategory createPhysicalLinkCategory();

	/**
	 * Returns a new object of class '<em>Physical Link End</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Physical Link End</em>'.
	 * @generated
	 */
	PhysicalLinkEnd createPhysicalLinkEnd();

	/**
	 * Returns a new object of class '<em>Physical Path</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Physical Path</em>'.
	 * @generated
	 */
	PhysicalPath createPhysicalPath();

	/**
	 * Returns a new object of class '<em>Physical Path Involvement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Physical Path Involvement</em>'.
	 * @generated
	 */
	PhysicalPathInvolvement createPhysicalPathInvolvement();

	/**
	 * Returns a new object of class '<em>Physical Path Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Physical Path Reference</em>'.
	 * @generated
	 */
	PhysicalPathReference createPhysicalPathReference();

	/**
	 * Returns a new object of class '<em>Physical Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Physical Port</em>'.
	 * @generated
	 */
	PhysicalPort createPhysicalPort();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CsPackage getCsPackage();

} //CsFactory
