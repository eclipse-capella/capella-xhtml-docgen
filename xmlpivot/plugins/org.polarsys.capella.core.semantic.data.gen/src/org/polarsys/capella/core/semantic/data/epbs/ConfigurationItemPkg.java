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

package org.polarsys.capella.core.semantic.data.epbs;

import org.eclipse.emf.common.util.EList;

import org.polarsys.capella.core.semantic.data.capellacore.Structure;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration Item Pkg</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.epbs.ConfigurationItemPkg#getOwnedConfigurationItems <em>Owned Configuration Items</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.epbs.ConfigurationItemPkg#getOwnedConfigurationItemPkgs <em>Owned Configuration Item Pkgs</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.epbs.EpbsPackage#getConfigurationItemPkg()
 * @model
 * @generated
 */
public interface ConfigurationItemPkg extends Structure {
	/**
	 * Returns the value of the '<em><b>Owned Configuration Items</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.epbs.ConfigurationItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Configuration Items</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Configuration Items</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.epbs.EpbsPackage#getConfigurationItemPkg_OwnedConfigurationItems()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConfigurationItem> getOwnedConfigurationItems();

	/**
	 * Returns the value of the '<em><b>Owned Configuration Item Pkgs</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.epbs.ConfigurationItemPkg}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Configuration Item Pkgs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Configuration Item Pkgs</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.epbs.EpbsPackage#getConfigurationItemPkg_OwnedConfigurationItemPkgs()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConfigurationItemPkg> getOwnedConfigurationItemPkgs();

} // ConfigurationItemPkg
