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

package org.polarsys.capella.core.semantic.data.cs;

import org.eclipse.emf.common.util.EList;

import org.polarsys.capella.core.semantic.data.fa.AbstractFunctionalArchitecture;

import org.polarsys.capella.core.semantic.data.information.DataPkg;

import org.polarsys.capella.core.semantic.data.requirement.RequirementsPkg;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block Architecture</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.BlockArchitecture#getOwnedRequirementPkgs <em>Owned Requirement Pkgs</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.BlockArchitecture#getOwnedInterfacePkg <em>Owned Interface Pkg</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.BlockArchitecture#getOwnedDataPkg <em>Owned Data Pkg</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.cs.CsPackage#getBlockArchitecture()
 * @model abstract="true"
 * @generated
 */
public interface BlockArchitecture extends AbstractFunctionalArchitecture {
	/**
	 * Returns the value of the '<em><b>Owned Requirement Pkgs</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.requirement.RequirementsPkg}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Requirement Pkgs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Requirement Pkgs</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.cs.CsPackage#getBlockArchitecture_OwnedRequirementPkgs()
	 * @model containment="true"
	 * @generated
	 */
	EList<RequirementsPkg> getOwnedRequirementPkgs();

	/**
	 * Returns the value of the '<em><b>Owned Interface Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Interface Pkg</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Interface Pkg</em>' containment reference.
	 * @see #setOwnedInterfacePkg(InterfacePkg)
	 * @see org.polarsys.capella.core.semantic.data.cs.CsPackage#getBlockArchitecture_OwnedInterfacePkg()
	 * @model containment="true"
	 * @generated
	 */
	InterfacePkg getOwnedInterfacePkg();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.cs.BlockArchitecture#getOwnedInterfacePkg <em>Owned Interface Pkg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Interface Pkg</em>' containment reference.
	 * @see #getOwnedInterfacePkg()
	 * @generated
	 */
	void setOwnedInterfacePkg(InterfacePkg value);

	/**
	 * Returns the value of the '<em><b>Owned Data Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Data Pkg</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Data Pkg</em>' containment reference.
	 * @see #setOwnedDataPkg(DataPkg)
	 * @see org.polarsys.capella.core.semantic.data.cs.CsPackage#getBlockArchitecture_OwnedDataPkg()
	 * @model containment="true"
	 * @generated
	 */
	DataPkg getOwnedDataPkg();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.cs.BlockArchitecture#getOwnedDataPkg <em>Owned Data Pkg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Data Pkg</em>' containment reference.
	 * @see #getOwnedDataPkg()
	 * @generated
	 */
	void setOwnedDataPkg(DataPkg value);

} // BlockArchitecture
