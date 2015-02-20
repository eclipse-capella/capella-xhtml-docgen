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

package org.polarsys.capella.core.semantic.data.capellacore;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.capellacore.Structure#getOwnedPropertyValuePkgs <em>Owned Property Value Pkgs</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.capellacore.CapellacorePackage#getStructure()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Structure extends Namespace {
	/**
	 * Returns the value of the '<em><b>Owned Property Value Pkgs</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.capellacore.PropertyValuePkg}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Property Value Pkgs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Property Value Pkgs</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.capellacore.CapellacorePackage#getStructure_OwnedPropertyValuePkgs()
	 * @model containment="true"
	 * @generated
	 */
	EList<PropertyValuePkg> getOwnedPropertyValuePkgs();

} // Structure
