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

import org.eclipse.emf.common.util.EList;

import org.polarsys.capella.core.semantic.data.fa.AbstractFunction;

import org.polarsys.capella.core.semantic.data.la.LogicalFunction;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Physical Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.pa.PhysicalFunction#getOwnedPhysicalFunctionPkgs <em>Owned Physical Function Pkgs</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.pa.PhysicalFunction#getRealizedLogicalFunctions <em>Realized Logical Functions</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.pa.PhysicalFunction#getContainedPhysicalFunctions <em>Contained Physical Functions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.pa.PaPackage#getPhysicalFunction()
 * @model
 * @generated
 */
public interface PhysicalFunction extends AbstractFunction {
	/**
	 * Returns the value of the '<em><b>Owned Physical Function Pkgs</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.pa.PhysicalFunctionPkg}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Physical Function Pkgs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Physical Function Pkgs</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.pa.PaPackage#getPhysicalFunction_OwnedPhysicalFunctionPkgs()
	 * @model containment="true"
	 * @generated
	 */
	EList<PhysicalFunctionPkg> getOwnedPhysicalFunctionPkgs();

	/**
	 * Returns the value of the '<em><b>Realized Logical Functions</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.la.LogicalFunction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realized Logical Functions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realized Logical Functions</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.pa.PaPackage#getPhysicalFunction_RealizedLogicalFunctions()
	 * @model
	 * @generated
	 */
	EList<LogicalFunction> getRealizedLogicalFunctions();

	/**
	 * Returns the value of the '<em><b>Contained Physical Functions</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.pa.PhysicalFunction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Physical Functions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Physical Functions</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.pa.PaPackage#getPhysicalFunction_ContainedPhysicalFunctions()
	 * @model containment="true"
	 * @generated
	 */
	EList<PhysicalFunction> getContainedPhysicalFunctions();

} // PhysicalFunction
