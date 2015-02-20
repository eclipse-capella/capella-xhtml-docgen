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

import org.polarsys.capella.core.semantic.data.capellacommon.StateMachine;

import org.polarsys.capella.core.semantic.data.capellacore.NamedElement;

import org.polarsys.capella.core.semantic.data.cs.Interface;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.Port#getOwnedProtocols <em>Owned Protocols</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.Port#getProvidedInterfaces <em>Provided Interfaces</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.Port#getRequiredInterfaces <em>Required Interfaces</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.information.InformationPackage#getPort()
 * @model abstract="true"
 * @generated
 */
public interface Port extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Owned Protocols</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.capellacommon.StateMachine}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Protocols</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Protocols</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.information.InformationPackage#getPort_OwnedProtocols()
	 * @model containment="true"
	 * @generated
	 */
	EList<StateMachine> getOwnedProtocols();

	/**
	 * Returns the value of the '<em><b>Provided Interfaces</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.cs.Interface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provided Interfaces</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Interfaces</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.information.InformationPackage#getPort_ProvidedInterfaces()
	 * @model
	 * @generated
	 */
	EList<Interface> getProvidedInterfaces();

	/**
	 * Returns the value of the '<em><b>Required Interfaces</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.cs.Interface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Interfaces</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Interfaces</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.information.InformationPackage#getPort_RequiredInterfaces()
	 * @model
	 * @generated
	 */
	EList<Interface> getRequiredInterfaces();

} // Port
