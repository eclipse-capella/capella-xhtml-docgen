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

package org.polarsys.capella.core.semantic.data.information;

import org.eclipse.emf.common.util.EList;

import org.polarsys.capella.core.semantic.data.capellacore.Structure;
import org.polarsys.capella.core.semantic.data.capellacore.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association Pkg</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.AssociationPkg#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.AssociationPkg#getOwnedAssociations <em>Owned Associations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.information.InformationPackage#getAssociationPkg()
 * @model abstract="true"
 * @generated
 */
public interface AssociationPkg extends Structure {
	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * The literals are from the enumeration {@link org.polarsys.capella.core.semantic.data.capellacore.VisibilityKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visibility</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see org.polarsys.capella.core.semantic.data.capellacore.VisibilityKind
	 * @see #setVisibility(VisibilityKind)
	 * @see org.polarsys.capella.core.semantic.data.information.InformationPackage#getAssociationPkg_Visibility()
	 * @model
	 * @generated
	 */
	VisibilityKind getVisibility();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.information.AssociationPkg#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see org.polarsys.capella.core.semantic.data.capellacore.VisibilityKind
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(VisibilityKind value);

	/**
	 * Returns the value of the '<em><b>Owned Associations</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.information.Association}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Associations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Associations</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.information.InformationPackage#getAssociationPkg_OwnedAssociations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Association> getOwnedAssociations();

} // AssociationPkg
