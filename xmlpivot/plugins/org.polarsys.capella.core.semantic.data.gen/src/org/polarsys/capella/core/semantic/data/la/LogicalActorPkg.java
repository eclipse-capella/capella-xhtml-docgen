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

import org.polarsys.capella.core.semantic.data.fa.AbstractFunctionalStructure;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logical Actor Pkg</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.la.LogicalActorPkg#getOwnedLogicalActorPkgs <em>Owned Logical Actor Pkgs</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.la.LogicalActorPkg#getOwnedLogicalActors <em>Owned Logical Actors</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.la.LaPackage#getLogicalActorPkg()
 * @model
 * @generated
 */
public interface LogicalActorPkg extends AbstractFunctionalStructure {
	/**
	 * Returns the value of the '<em><b>Owned Logical Actor Pkgs</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.la.LogicalActorPkg}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Logical Actor Pkgs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Logical Actor Pkgs</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.la.LaPackage#getLogicalActorPkg_OwnedLogicalActorPkgs()
	 * @model containment="true"
	 * @generated
	 */
	EList<LogicalActorPkg> getOwnedLogicalActorPkgs();

	/**
	 * Returns the value of the '<em><b>Owned Logical Actors</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.la.LogicalActor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Logical Actors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Logical Actors</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.la.LaPackage#getLogicalActorPkg_OwnedLogicalActors()
	 * @model containment="true"
	 * @generated
	 */
	EList<LogicalActor> getOwnedLogicalActors();

} // LogicalActorPkg
