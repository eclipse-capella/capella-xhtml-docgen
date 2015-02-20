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

package org.polarsys.capella.core.semantic.data.la;

import org.eclipse.emf.common.util.EList;

import org.polarsys.capella.core.semantic.data.ctx.SystemFunction;

import org.polarsys.capella.core.semantic.data.fa.AbstractFunction;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logical Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.la.LogicalFunction#getOwnedLogicalFunctionPkgs <em>Owned Logical Function Pkgs</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.la.LogicalFunction#getRealizedSystemFunctions <em>Realized System Functions</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.la.LogicalFunction#getContainedLogicalFunctions <em>Contained Logical Functions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.la.LaPackage#getLogicalFunction()
 * @model
 * @generated
 */
public interface LogicalFunction extends AbstractFunction {
	/**
	 * Returns the value of the '<em><b>Owned Logical Function Pkgs</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.la.LogicalFunctionPkg}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Logical Function Pkgs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Logical Function Pkgs</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.la.LaPackage#getLogicalFunction_OwnedLogicalFunctionPkgs()
	 * @model containment="true"
	 * @generated
	 */
	EList<LogicalFunctionPkg> getOwnedLogicalFunctionPkgs();

	/**
	 * Returns the value of the '<em><b>Realized System Functions</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.ctx.SystemFunction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realized System Functions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realized System Functions</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.la.LaPackage#getLogicalFunction_RealizedSystemFunctions()
	 * @model
	 * @generated
	 */
	EList<SystemFunction> getRealizedSystemFunctions();

	/**
	 * Returns the value of the '<em><b>Contained Logical Functions</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.la.LogicalFunction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Logical Functions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Logical Functions</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.la.LaPackage#getLogicalFunction_ContainedLogicalFunctions()
	 * @model containment="true"
	 * @generated
	 */
	EList<LogicalFunction> getContainedLogicalFunctions();

} // LogicalFunction
