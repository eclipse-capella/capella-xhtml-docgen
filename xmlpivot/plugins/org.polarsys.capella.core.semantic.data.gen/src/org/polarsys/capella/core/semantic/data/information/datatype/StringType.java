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

package org.polarsys.capella.core.semantic.data.information.datatype;

import org.polarsys.capella.core.semantic.data.information.datavalue.AbstractStringValue;
import org.polarsys.capella.core.semantic.data.information.datavalue.NumericValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.datatype.StringType#getOwnedDefaultValue <em>Owned Default Value</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.datatype.StringType#getOwnedNullValue <em>Owned Null Value</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.datatype.StringType#getOwnedMinLength <em>Owned Min Length</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.datatype.StringType#getOwnedMaxLength <em>Owned Max Length</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.information.datatype.DatatypePackage#getStringType()
 * @model
 * @generated
 */
public interface StringType extends DataType {
	/**
	 * Returns the value of the '<em><b>Owned Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Default Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Default Value</em>' containment reference.
	 * @see #setOwnedDefaultValue(AbstractStringValue)
	 * @see org.polarsys.capella.core.semantic.data.information.datatype.DatatypePackage#getStringType_OwnedDefaultValue()
	 * @model containment="true"
	 * @generated
	 */
	AbstractStringValue getOwnedDefaultValue();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.information.datatype.StringType#getOwnedDefaultValue <em>Owned Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Default Value</em>' containment reference.
	 * @see #getOwnedDefaultValue()
	 * @generated
	 */
	void setOwnedDefaultValue(AbstractStringValue value);

	/**
	 * Returns the value of the '<em><b>Owned Null Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Null Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Null Value</em>' containment reference.
	 * @see #setOwnedNullValue(AbstractStringValue)
	 * @see org.polarsys.capella.core.semantic.data.information.datatype.DatatypePackage#getStringType_OwnedNullValue()
	 * @model containment="true"
	 * @generated
	 */
	AbstractStringValue getOwnedNullValue();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.information.datatype.StringType#getOwnedNullValue <em>Owned Null Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Null Value</em>' containment reference.
	 * @see #getOwnedNullValue()
	 * @generated
	 */
	void setOwnedNullValue(AbstractStringValue value);

	/**
	 * Returns the value of the '<em><b>Owned Min Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Min Length</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Min Length</em>' containment reference.
	 * @see #setOwnedMinLength(NumericValue)
	 * @see org.polarsys.capella.core.semantic.data.information.datatype.DatatypePackage#getStringType_OwnedMinLength()
	 * @model containment="true"
	 * @generated
	 */
	NumericValue getOwnedMinLength();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.information.datatype.StringType#getOwnedMinLength <em>Owned Min Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Min Length</em>' containment reference.
	 * @see #getOwnedMinLength()
	 * @generated
	 */
	void setOwnedMinLength(NumericValue value);

	/**
	 * Returns the value of the '<em><b>Owned Max Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Max Length</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Max Length</em>' containment reference.
	 * @see #setOwnedMaxLength(NumericValue)
	 * @see org.polarsys.capella.core.semantic.data.information.datatype.DatatypePackage#getStringType_OwnedMaxLength()
	 * @model containment="true"
	 * @generated
	 */
	NumericValue getOwnedMaxLength();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.information.datatype.StringType#getOwnedMaxLength <em>Owned Max Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Max Length</em>' containment reference.
	 * @see #getOwnedMaxLength()
	 * @generated
	 */
	void setOwnedMaxLength(NumericValue value);

} // StringType
