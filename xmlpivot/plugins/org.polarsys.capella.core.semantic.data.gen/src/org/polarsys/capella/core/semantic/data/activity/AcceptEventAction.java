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

package org.polarsys.capella.core.semantic.data.activity;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Accept Event Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.activity.AcceptEventAction#isIsUnmarshall <em>Is Unmarshall</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.activity.ActivityPackage#getAcceptEventAction()
 * @model abstract="true"
 * @generated
 */
public interface AcceptEventAction extends AbstractAction {
	/**
	 * Returns the value of the '<em><b>Is Unmarshall</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Unmarshall</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Unmarshall</em>' attribute.
	 * @see #setIsUnmarshall(boolean)
	 * @see org.polarsys.capella.core.semantic.data.activity.ActivityPackage#getAcceptEventAction_IsUnmarshall()
	 * @model
	 * @generated
	 */
	boolean isIsUnmarshall();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.activity.AcceptEventAction#isIsUnmarshall <em>Is Unmarshall</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Unmarshall</em>' attribute.
	 * @see #isIsUnmarshall()
	 * @generated
	 */
	void setIsUnmarshall(boolean value);

} // AcceptEventAction
