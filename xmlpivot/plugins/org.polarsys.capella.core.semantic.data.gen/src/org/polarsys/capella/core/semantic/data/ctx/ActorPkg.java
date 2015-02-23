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

import org.polarsys.capella.core.semantic.data.capellacore.Structure;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actor Pkg</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.ctx.ActorPkg#getOwnedActors <em>Owned Actors</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.ctx.ActorPkg#getOwnedActorPkgs <em>Owned Actor Pkgs</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.ctx.CtxPackage#getActorPkg()
 * @model
 * @generated
 */
public interface ActorPkg extends Structure {
	/**
	 * Returns the value of the '<em><b>Owned Actors</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.ctx.Actor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Actors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Actors</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.ctx.CtxPackage#getActorPkg_OwnedActors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Actor> getOwnedActors();

	/**
	 * Returns the value of the '<em><b>Owned Actor Pkgs</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.ctx.ActorPkg}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Actor Pkgs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Actor Pkgs</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.ctx.CtxPackage#getActorPkg_OwnedActorPkgs()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActorPkg> getOwnedActorPkgs();

} // ActorPkg
