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

import org.polarsys.capella.core.semantic.data.information.AssociationPkg;
import org.polarsys.capella.core.semantic.data.information.KeyPart;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Physical Component Pkg</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.pa.PhysicalComponentPkg#getOwnedComponents <em>Owned Components</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.pa.PhysicalComponentPkg#getOwnedPhysicalComponentPkgs <em>Owned Physical Component Pkgs</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.pa.PhysicalComponentPkg#getOwnedKeyParts <em>Owned Key Parts</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.pa.PaPackage#getPhysicalComponentPkg()
 * @model
 * @generated
 */
public interface PhysicalComponentPkg extends AbstractFunctionalStructure, AssociationPkg {
	/**
	 * Returns the value of the '<em><b>Owned Components</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.pa.PhysicalComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Components</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Components</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.pa.PaPackage#getPhysicalComponentPkg_OwnedComponents()
	 * @model containment="true"
	 * @generated
	 */
	EList<PhysicalComponent> getOwnedComponents();

	/**
	 * Returns the value of the '<em><b>Owned Physical Component Pkgs</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.pa.PhysicalComponentPkg}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Physical Component Pkgs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Physical Component Pkgs</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.pa.PaPackage#getPhysicalComponentPkg_OwnedPhysicalComponentPkgs()
	 * @model containment="true"
	 * @generated
	 */
	EList<PhysicalComponentPkg> getOwnedPhysicalComponentPkgs();

	/**
	 * Returns the value of the '<em><b>Owned Key Parts</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.information.KeyPart}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Key Parts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Key Parts</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.pa.PaPackage#getPhysicalComponentPkg_OwnedKeyParts()
	 * @model containment="true"
	 * @generated
	 */
	EList<KeyPart> getOwnedKeyParts();

} // PhysicalComponentPkg
