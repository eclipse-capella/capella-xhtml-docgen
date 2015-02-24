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

import org.polarsys.capella.core.semantic.data.cs.AbstractActor;

import org.polarsys.capella.core.semantic.data.ctx.Actor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logical Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.la.LogicalActor#getAllocatedLogicalFunctions <em>Allocated Logical Functions</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.la.LogicalActor#getRealizedSystemActors <em>Realized System Actors</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.la.LaPackage#getLogicalActor()
 * @model
 * @generated
 */
public interface LogicalActor extends AbstractActor {
	/**
	 * Returns the value of the '<em><b>Allocated Logical Functions</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.la.LogicalFunction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocated Logical Functions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocated Logical Functions</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.la.LaPackage#getLogicalActor_AllocatedLogicalFunctions()
	 * @model
	 * @generated
	 */
	EList<LogicalFunction> getAllocatedLogicalFunctions();

	/**
	 * Returns the value of the '<em><b>Realized System Actors</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.ctx.Actor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realized System Actors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realized System Actors</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.la.LaPackage#getLogicalActor_RealizedSystemActors()
	 * @model
	 * @generated
	 */
	EList<Actor> getRealizedSystemActors();

} // LogicalActor
