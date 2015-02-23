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

package org.polarsys.capella.core.semantic.data.information.datavalue;

import org.polarsys.capella.core.semantic.data.capellacore.CapellaElement;

import org.polarsys.capella.core.semantic.data.information.Property;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.datavalue.ValuePart#getReferencedProperty <em>Referenced Property</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.datavalue.ValuePart#getOwnedValue <em>Owned Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.information.datavalue.DatavaluePackage#getValuePart()
 * @model
 * @generated
 */
public interface ValuePart extends CapellaElement {
	/**
	 * Returns the value of the '<em><b>Referenced Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Property</em>' reference.
	 * @see #setReferencedProperty(Property)
	 * @see org.polarsys.capella.core.semantic.data.information.datavalue.DatavaluePackage#getValuePart_ReferencedProperty()
	 * @model
	 * @generated
	 */
	Property getReferencedProperty();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.information.datavalue.ValuePart#getReferencedProperty <em>Referenced Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Property</em>' reference.
	 * @see #getReferencedProperty()
	 * @generated
	 */
	void setReferencedProperty(Property value);

	/**
	 * Returns the value of the '<em><b>Owned Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Value</em>' containment reference.
	 * @see #setOwnedValue(DataValue)
	 * @see org.polarsys.capella.core.semantic.data.information.datavalue.DatavaluePackage#getValuePart_OwnedValue()
	 * @model containment="true"
	 * @generated
	 */
	DataValue getOwnedValue();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.information.datavalue.ValuePart#getOwnedValue <em>Owned Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Value</em>' containment reference.
	 * @see #getOwnedValue()
	 * @generated
	 */
	void setOwnedValue(DataValue value);

} // ValuePart
