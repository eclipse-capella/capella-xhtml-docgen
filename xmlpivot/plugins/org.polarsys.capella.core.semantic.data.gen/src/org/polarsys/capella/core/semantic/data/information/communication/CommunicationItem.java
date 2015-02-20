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

package org.polarsys.capella.core.semantic.data.information.communication;

import org.eclipse.emf.common.util.EList;

import org.polarsys.capella.core.semantic.data.capellacommon.StateMachine;

import org.polarsys.capella.core.semantic.data.capellacore.Classifier;
import org.polarsys.capella.core.semantic.data.capellacore.VisibilityKind;

import org.polarsys.capella.core.semantic.data.information.datavalue.DataValueContainer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.communication.CommunicationItem#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.communication.CommunicationItem#getOwnedStateMachines <em>Owned State Machines</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.information.communication.CommunicationPackage#getCommunicationItem()
 * @model abstract="true"
 * @generated
 */
public interface CommunicationItem extends Classifier, DataValueContainer {
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
	 * @see org.polarsys.capella.core.semantic.data.information.communication.CommunicationPackage#getCommunicationItem_Visibility()
	 * @model
	 * @generated
	 */
	VisibilityKind getVisibility();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.information.communication.CommunicationItem#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see org.polarsys.capella.core.semantic.data.capellacore.VisibilityKind
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(VisibilityKind value);

	/**
	 * Returns the value of the '<em><b>Owned State Machines</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.capellacommon.StateMachine}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned State Machines</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned State Machines</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.information.communication.CommunicationPackage#getCommunicationItem_OwnedStateMachines()
	 * @model containment="true"
	 * @generated
	 */
	EList<StateMachine> getOwnedStateMachines();

} // CommunicationItem
