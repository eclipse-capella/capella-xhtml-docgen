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

import org.polarsys.capella.core.semantic.data.capellacore.AbstractExchangeItemPkg;
import org.polarsys.capella.core.semantic.data.capellacore.Structure;

import org.polarsys.capella.core.semantic.data.information.communication.MessageReferencePkg;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Pkg</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.InterfacePkg#getOwnedInterfaces <em>Owned Interfaces</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.InterfacePkg#getOwnedInterfacePkgs <em>Owned Interface Pkgs</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.cs.CsPackage#getInterfacePkg()
 * @model
 * @generated
 */
public interface InterfacePkg extends MessageReferencePkg, AbstractExchangeItemPkg, Structure {
	/**
	 * Returns the value of the '<em><b>Owned Interfaces</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.cs.Interface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Interfaces</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Interfaces</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.cs.CsPackage#getInterfacePkg_OwnedInterfaces()
	 * @model containment="true"
	 * @generated
	 */
	EList<Interface> getOwnedInterfaces();

	/**
	 * Returns the value of the '<em><b>Owned Interface Pkgs</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.cs.InterfacePkg}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Interface Pkgs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Interface Pkgs</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.cs.CsPackage#getInterfacePkg_OwnedInterfacePkgs()
	 * @model containment="true"
	 * @generated
	 */
	EList<InterfacePkg> getOwnedInterfacePkgs();

} // InterfacePkg
