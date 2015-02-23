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

import org.polarsys.capella.core.semantic.data.fa.AbstractFunctionalStructure;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Pkg</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.oa.EntityPkg#getOwnedEntityPkgs <em>Owned Entity Pkgs</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.oa.EntityPkg#getOwnedEntities <em>Owned Entities</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.oa.OaPackage#getEntityPkg()
 * @model
 * @generated
 */
public interface EntityPkg extends Structure, AbstractFunctionalStructure {
	/**
	 * Returns the value of the '<em><b>Owned Entity Pkgs</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.oa.EntityPkg}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Entity Pkgs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Entity Pkgs</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.oa.OaPackage#getEntityPkg_OwnedEntityPkgs()
	 * @model containment="true"
	 * @generated
	 */
	EList<EntityPkg> getOwnedEntityPkgs();

	/**
	 * Returns the value of the '<em><b>Owned Entities</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.oa.Entity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Entities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Entities</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.oa.OaPackage#getEntityPkg_OwnedEntities()
	 * @model containment="true"
	 * @generated
	 */
	EList<Entity> getOwnedEntities();

} // EntityPkg
