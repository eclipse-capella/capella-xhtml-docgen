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

package org.polarsys.capella.core.semantic.data.capellacommon;

import org.polarsys.capella.core.semantic.data.behavior.AbstractEvent;

import org.polarsys.capella.core.semantic.data.capellacore.Constraint;
import org.polarsys.capella.core.semantic.data.capellacore.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.capellacommon.StateEvent#getCondition <em>Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.capellacommon.CapellacommonPackage#getStateEvent()
 * @model abstract="true"
 * @generated
 */
public interface StateEvent extends NamedElement, AbstractEvent {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' reference.
	 * @see #setCondition(Constraint)
	 * @see org.polarsys.capella.core.semantic.data.capellacommon.CapellacommonPackage#getStateEvent_Condition()
	 * @model
	 * @generated
	 */
	Constraint getCondition();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.capellacommon.StateEvent#getCondition <em>Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Constraint value);

} // StateEvent
