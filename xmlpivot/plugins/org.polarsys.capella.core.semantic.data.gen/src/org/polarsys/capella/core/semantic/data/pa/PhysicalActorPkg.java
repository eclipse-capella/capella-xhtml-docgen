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

import org.polarsys.capella.core.semantic.data.fa.AbstractFunctionalStructure;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Physical Actor Pkg</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.pa.PhysicalActorPkg#getOwnedPhysicalActorPkgs <em>Owned Physical Actor Pkgs</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.pa.PhysicalActorPkg#getOwnedPhysicalActors <em>Owned Physical Actors</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.pa.PaPackage#getPhysicalActorPkg()
 * @model
 * @generated
 */
public interface PhysicalActorPkg extends AbstractFunctionalStructure {
	/**
	 * Returns the value of the '<em><b>Owned Physical Actor Pkgs</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.pa.PhysicalActorPkg}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Physical Actor Pkgs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Physical Actor Pkgs</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.pa.PaPackage#getPhysicalActorPkg_OwnedPhysicalActorPkgs()
	 * @model containment="true"
	 * @generated
	 */
	EList<PhysicalActorPkg> getOwnedPhysicalActorPkgs();

	/**
	 * Returns the value of the '<em><b>Owned Physical Actors</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.pa.PhysicalActor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Physical Actors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Physical Actors</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.pa.PaPackage#getPhysicalActorPkg_OwnedPhysicalActors()
	 * @model containment="true"
	 * @generated
	 */
	EList<PhysicalActor> getOwnedPhysicalActors();

} // PhysicalActorPkg
