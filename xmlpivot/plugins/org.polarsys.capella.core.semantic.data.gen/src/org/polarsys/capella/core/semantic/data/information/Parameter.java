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

import org.polarsys.capella.core.semantic.data.capellacore.TypedElement;

import org.polarsys.capella.core.semantic.data.modellingcore.AbstractParameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.Parameter#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.Parameter#getPassingMode <em>Passing Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.information.InformationPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends TypedElement, MultiplicityElement, AbstractParameter {
	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link org.polarsys.capella.core.semantic.data.information.ParameterDirection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see org.polarsys.capella.core.semantic.data.information.ParameterDirection
	 * @see #setDirection(ParameterDirection)
	 * @see org.polarsys.capella.core.semantic.data.information.InformationPackage#getParameter_Direction()
	 * @model
	 * @generated
	 */
	ParameterDirection getDirection();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.information.Parameter#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see org.polarsys.capella.core.semantic.data.information.ParameterDirection
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(ParameterDirection value);

	/**
	 * Returns the value of the '<em><b>Passing Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link org.polarsys.capella.core.semantic.data.information.PassingMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Passing Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passing Mode</em>' attribute.
	 * @see org.polarsys.capella.core.semantic.data.information.PassingMode
	 * @see #setPassingMode(PassingMode)
	 * @see org.polarsys.capella.core.semantic.data.information.InformationPackage#getParameter_PassingMode()
	 * @model
	 * @generated
	 */
	PassingMode getPassingMode();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.information.Parameter#getPassingMode <em>Passing Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passing Mode</em>' attribute.
	 * @see org.polarsys.capella.core.semantic.data.information.PassingMode
	 * @see #getPassingMode()
	 * @generated
	 */
	void setPassingMode(PassingMode value);

} // Parameter
