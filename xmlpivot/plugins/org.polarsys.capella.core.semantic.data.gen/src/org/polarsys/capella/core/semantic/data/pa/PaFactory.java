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

package org.polarsys.capella.core.semantic.data.pa;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.polarsys.capella.core.semantic.data.pa.PaPackage
 * @generated
 */
public interface PaFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PaFactory eINSTANCE = org.polarsys.capella.core.semantic.data.pa.impl.PaFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Physical Architecture</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Physical Architecture</em>'.
	 * @generated
	 */
	PhysicalArchitecture createPhysicalArchitecture();

	/**
	 * Returns a new object of class '<em>Physical Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Physical Function</em>'.
	 * @generated
	 */
	PhysicalFunction createPhysicalFunction();

	/**
	 * Returns a new object of class '<em>Physical Function Pkg</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Physical Function Pkg</em>'.
	 * @generated
	 */
	PhysicalFunctionPkg createPhysicalFunctionPkg();

	/**
	 * Returns a new object of class '<em>Physical Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Physical Component</em>'.
	 * @generated
	 */
	PhysicalComponent createPhysicalComponent();

	/**
	 * Returns a new object of class '<em>Physical Actor Pkg</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Physical Actor Pkg</em>'.
	 * @generated
	 */
	PhysicalActorPkg createPhysicalActorPkg();

	/**
	 * Returns a new object of class '<em>Physical Component Pkg</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Physical Component Pkg</em>'.
	 * @generated
	 */
	PhysicalComponentPkg createPhysicalComponentPkg();

	/**
	 * Returns a new object of class '<em>Physical Actor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Physical Actor</em>'.
	 * @generated
	 */
	PhysicalActor createPhysicalActor();

	/**
	 * Returns a new object of class '<em>Physical Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Physical Node</em>'.
	 * @generated
	 */
	PhysicalNode createPhysicalNode();

	/**
	 * Returns a new object of class '<em>Physical Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Physical Context</em>'.
	 * @generated
	 */
	PhysicalContext createPhysicalContext();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PaPackage getPaPackage();

} //PaFactory
