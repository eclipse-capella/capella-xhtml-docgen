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

import org.polarsys.capella.core.semantic.data.capellacore.InvolvedElement;

import org.polarsys.capella.core.semantic.data.cs.Component;

import org.polarsys.capella.core.semantic.data.oa.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.ctx.System#getAllocatedSystemFunctions <em>Allocated System Functions</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.ctx.System#getRealizedEntities <em>Realized Entities</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.ctx.CtxPackage#getSystem()
 * @model
 * @generated
 */
public interface System extends Component, InvolvedElement {
	/**
	 * Returns the value of the '<em><b>Allocated System Functions</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.ctx.SystemFunction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocated System Functions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocated System Functions</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.ctx.CtxPackage#getSystem_AllocatedSystemFunctions()
	 * @model
	 * @generated
	 */
	EList<SystemFunction> getAllocatedSystemFunctions();

	/**
	 * Returns the value of the '<em><b>Realized Entities</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.oa.Entity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realized Entities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realized Entities</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.ctx.CtxPackage#getSystem_RealizedEntities()
	 * @model
	 * @generated
	 */
	EList<Entity> getRealizedEntities();

} // System
