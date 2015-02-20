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

package org.polarsys.capella.core.semantic.data.behavior;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Time Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.behavior.AbstractTimeEvent#isIsRelative <em>Is Relative</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.behavior.BehaviorPackage#getAbstractTimeEvent()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface AbstractTimeEvent extends AbstractEvent {
	/**
	 * Returns the value of the '<em><b>Is Relative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Relative</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Relative</em>' attribute.
	 * @see #setIsRelative(boolean)
	 * @see org.polarsys.capella.core.semantic.data.behavior.BehaviorPackage#getAbstractTimeEvent_IsRelative()
	 * @model
	 * @generated
	 */
	boolean isIsRelative();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.behavior.AbstractTimeEvent#isIsRelative <em>Is Relative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Relative</em>' attribute.
	 * @see #isIsRelative()
	 * @generated
	 */
	void setIsRelative(boolean value);

} // AbstractTimeEvent
