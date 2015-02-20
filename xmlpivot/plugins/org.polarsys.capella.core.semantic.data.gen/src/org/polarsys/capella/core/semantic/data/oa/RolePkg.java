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

package org.polarsys.capella.core.semantic.data.oa;

import org.eclipse.emf.common.util.EList;

import org.polarsys.capella.core.semantic.data.capellacore.Structure;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Pkg</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.oa.RolePkg#getOwnedRolePkgs <em>Owned Role Pkgs</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.oa.RolePkg#getOwnedRoles <em>Owned Roles</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.oa.OaPackage#getRolePkg()
 * @model
 * @generated
 */
public interface RolePkg extends Structure {
	/**
	 * Returns the value of the '<em><b>Owned Role Pkgs</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.oa.RolePkg}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Role Pkgs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Role Pkgs</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.oa.OaPackage#getRolePkg_OwnedRolePkgs()
	 * @model containment="true"
	 * @generated
	 */
	EList<RolePkg> getOwnedRolePkgs();

	/**
	 * Returns the value of the '<em><b>Owned Roles</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.oa.Role}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Roles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Roles</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.oa.OaPackage#getRolePkg_OwnedRoles()
	 * @model containment="true"
	 * @generated
	 */
	EList<Role> getOwnedRoles();

} // RolePkg
