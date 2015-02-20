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

import org.polarsys.capella.core.semantic.data.cs.AbstractActor;

import org.polarsys.capella.core.semantic.data.oa.Entity;
import org.polarsys.capella.core.semantic.data.oa.OperationalActor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.ctx.Actor#getAllocatedSystemFunctions <em>Allocated System Functions</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.ctx.Actor#getRealizedEntities <em>Realized Entities</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.ctx.Actor#getRealizedOperationalActors <em>Realized Operational Actors</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.ctx.CtxPackage#getActor()
 * @model
 * @generated
 */
public interface Actor extends AbstractActor {
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
	 * @see org.polarsys.capella.core.semantic.data.ctx.CtxPackage#getActor_AllocatedSystemFunctions()
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
	 * @see org.polarsys.capella.core.semantic.data.ctx.CtxPackage#getActor_RealizedEntities()
	 * @model
	 * @generated
	 */
	EList<Entity> getRealizedEntities();

	/**
	 * Returns the value of the '<em><b>Realized Operational Actors</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.oa.OperationalActor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realized Operational Actors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realized Operational Actors</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.ctx.CtxPackage#getActor_RealizedOperationalActors()
	 * @model
	 * @generated
	 */
	EList<OperationalActor> getRealizedOperationalActors();

} // Actor
