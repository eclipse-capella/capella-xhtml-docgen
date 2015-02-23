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

package org.polarsys.capella.core.semantic.data.ctx;

import org.eclipse.emf.common.util.EList;

import org.polarsys.capella.core.semantic.data.fa.AbstractFunction;

import org.polarsys.capella.core.semantic.data.oa.OperationalActivity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.ctx.SystemFunction#getOwnedSystemFunctionPkgs <em>Owned System Function Pkgs</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.ctx.SystemFunction#getRealizedOperationalActivities <em>Realized Operational Activities</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.ctx.SystemFunction#getContainedSystemFunctions <em>Contained System Functions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.ctx.CtxPackage#getSystemFunction()
 * @model
 * @generated
 */
public interface SystemFunction extends AbstractFunction {
	/**
	 * Returns the value of the '<em><b>Owned System Function Pkgs</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.ctx.SystemFunctionPkg}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned System Function Pkgs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned System Function Pkgs</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.ctx.CtxPackage#getSystemFunction_OwnedSystemFunctionPkgs()
	 * @model containment="true"
	 * @generated
	 */
	EList<SystemFunctionPkg> getOwnedSystemFunctionPkgs();

	/**
	 * Returns the value of the '<em><b>Realized Operational Activities</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.oa.OperationalActivity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realized Operational Activities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realized Operational Activities</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.ctx.CtxPackage#getSystemFunction_RealizedOperationalActivities()
	 * @model
	 * @generated
	 */
	EList<OperationalActivity> getRealizedOperationalActivities();

	/**
	 * Returns the value of the '<em><b>Contained System Functions</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.ctx.SystemFunction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained System Functions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained System Functions</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.ctx.CtxPackage#getSystemFunction_ContainedSystemFunctions()
	 * @model containment="true"
	 * @generated
	 */
	EList<SystemFunction> getContainedSystemFunctions();

} // SystemFunction
