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

import org.polarsys.capella.core.semantic.data.capellacore.CapellaElement;
import org.polarsys.capella.core.semantic.data.capellacore.NamedElement;

import org.polarsys.capella.core.semantic.data.modellingcore.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.Association#getOwnedMembers <em>Owned Members</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.Association#getNavigableMembers <em>Navigable Members</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.information.InformationPackage#getAssociation()
 * @model
 * @generated
 */
public interface Association extends NamedElement, CapellaElement, ModelElement {
	/**
	 * Returns the value of the '<em><b>Owned Members</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.information.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Members</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Members</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.information.InformationPackage#getAssociation_OwnedMembers()
	 * @model containment="true" upper="2"
	 * @generated
	 */
	EList<Property> getOwnedMembers();

	/**
	 * Returns the value of the '<em><b>Navigable Members</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.information.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Navigable Members</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Navigable Members</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.information.InformationPackage#getAssociation_NavigableMembers()
	 * @model upper="2"
	 * @generated
	 */
	EList<Property> getNavigableMembers();

} // Association
