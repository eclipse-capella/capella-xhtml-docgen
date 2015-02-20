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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration Property Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.capellacore.EnumerationPropertyValue#getType <em>Type</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.capellacore.EnumerationPropertyValue#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.capellacore.CapellacorePackage#getEnumerationPropertyValue()
 * @model
 * @generated
 */
public interface EnumerationPropertyValue extends AbstractPropertyValue {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(EnumerationPropertyType)
	 * @see org.polarsys.capella.core.semantic.data.capellacore.CapellacorePackage#getEnumerationPropertyValue_Type()
	 * @model
	 * @generated
	 */
	EnumerationPropertyType getType();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.capellacore.EnumerationPropertyValue#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(EnumerationPropertyType value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(EnumerationPropertyLiteral)
	 * @see org.polarsys.capella.core.semantic.data.capellacore.CapellacorePackage#getEnumerationPropertyValue_Value()
	 * @model
	 * @generated
	 */
	EnumerationPropertyLiteral getValue();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.capellacore.EnumerationPropertyValue#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(EnumerationPropertyLiteral value);

} // EnumerationPropertyValue
