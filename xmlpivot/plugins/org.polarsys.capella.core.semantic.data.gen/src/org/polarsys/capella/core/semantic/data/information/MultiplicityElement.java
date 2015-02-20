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

import org.polarsys.capella.core.semantic.data.capellacore.CapellaElement;

import org.polarsys.capella.core.semantic.data.information.datavalue.DataValue;
import org.polarsys.capella.core.semantic.data.information.datavalue.NumericValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiplicity Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.MultiplicityElement#isOrdered <em>Ordered</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.MultiplicityElement#isUnique <em>Unique</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.MultiplicityElement#isMinInclusive <em>Min Inclusive</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.MultiplicityElement#isMaxInclusive <em>Max Inclusive</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.MultiplicityElement#getOwnedDefaultValue <em>Owned Default Value</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.MultiplicityElement#getOwnedMinValue <em>Owned Min Value</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.MultiplicityElement#getOwnedMaxValue <em>Owned Max Value</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.MultiplicityElement#getOwnedNullValue <em>Owned Null Value</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.MultiplicityElement#getOwnedMinCard <em>Owned Min Card</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.MultiplicityElement#getOwnedMinLength <em>Owned Min Length</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.MultiplicityElement#getOwnedMaxCard <em>Owned Max Card</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.MultiplicityElement#getOwnedMaxLength <em>Owned Max Length</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.information.InformationPackage#getMultiplicityElement()
 * @model abstract="true"
 * @generated
 */
public interface MultiplicityElement extends CapellaElement {
	/**
	 * Returns the value of the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ordered</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ordered</em>' attribute.
	 * @see #setOrdered(boolean)
	 * @see org.polarsys.capella.core.semantic.data.information.InformationPackage#getMultiplicityElement_Ordered()
	 * @model
	 * @generated
	 */
	boolean isOrdered();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.information.MultiplicityElement#isOrdered <em>Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ordered</em>' attribute.
	 * @see #isOrdered()
	 * @generated
	 */
	void setOrdered(boolean value);

	/**
	 * Returns the value of the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unique</em>' attribute.
	 * @see #setUnique(boolean)
	 * @see org.polarsys.capella.core.semantic.data.information.InformationPackage#getMultiplicityElement_Unique()
	 * @model
	 * @generated
	 */
	boolean isUnique();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.information.MultiplicityElement#isUnique <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unique</em>' attribute.
	 * @see #isUnique()
	 * @generated
	 */
	void setUnique(boolean value);

	/**
	 * Returns the value of the '<em><b>Min Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Inclusive</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Inclusive</em>' attribute.
	 * @see #setMinInclusive(boolean)
	 * @see org.polarsys.capella.core.semantic.data.information.InformationPackage#getMultiplicityElement_MinInclusive()
	 * @model
	 * @generated
	 */
	boolean isMinInclusive();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.information.MultiplicityElement#isMinInclusive <em>Min Inclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Inclusive</em>' attribute.
	 * @see #isMinInclusive()
	 * @generated
	 */
	void setMinInclusive(boolean value);

	/**
	 * Returns the value of the '<em><b>Max Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Inclusive</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Inclusive</em>' attribute.
	 * @see #setMaxInclusive(boolean)
	 * @see org.polarsys.capella.core.semantic.data.information.InformationPackage#getMultiplicityElement_MaxInclusive()
	 * @model
	 * @generated
	 */
	boolean isMaxInclusive();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.information.MultiplicityElement#isMaxInclusive <em>Max Inclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Inclusive</em>' attribute.
	 * @see #isMaxInclusive()
	 * @generated
	 */
	void setMaxInclusive(boolean value);

	/**
	 * Returns the value of the '<em><b>Owned Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Default Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Default Value</em>' containment reference.
	 * @see #setOwnedDefaultValue(DataValue)
	 * @see org.polarsys.capella.core.semantic.data.information.InformationPackage#getMultiplicityElement_OwnedDefaultValue()
	 * @model containment="true"
	 * @generated
	 */
	DataValue getOwnedDefaultValue();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.information.MultiplicityElement#getOwnedDefaultValue <em>Owned Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Default Value</em>' containment reference.
	 * @see #getOwnedDefaultValue()
	 * @generated
	 */
	void setOwnedDefaultValue(DataValue value);

	/**
	 * Returns the value of the '<em><b>Owned Min Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Min Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Min Value</em>' containment reference.
	 * @see #setOwnedMinValue(DataValue)
	 * @see org.polarsys.capella.core.semantic.data.information.InformationPackage#getMultiplicityElement_OwnedMinValue()
	 * @model containment="true"
	 * @generated
	 */
	DataValue getOwnedMinValue();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.information.MultiplicityElement#getOwnedMinValue <em>Owned Min Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Min Value</em>' containment reference.
	 * @see #getOwnedMinValue()
	 * @generated
	 */
	void setOwnedMinValue(DataValue value);

	/**
	 * Returns the value of the '<em><b>Owned Max Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Max Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Max Value</em>' containment reference.
	 * @see #setOwnedMaxValue(DataValue)
	 * @see org.polarsys.capella.core.semantic.data.information.InformationPackage#getMultiplicityElement_OwnedMaxValue()
	 * @model containment="true"
	 * @generated
	 */
	DataValue getOwnedMaxValue();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.information.MultiplicityElement#getOwnedMaxValue <em>Owned Max Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Max Value</em>' containment reference.
	 * @see #getOwnedMaxValue()
	 * @generated
	 */
	void setOwnedMaxValue(DataValue value);

	/**
	 * Returns the value of the '<em><b>Owned Null Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Null Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Null Value</em>' containment reference.
	 * @see #setOwnedNullValue(DataValue)
	 * @see org.polarsys.capella.core.semantic.data.information.InformationPackage#getMultiplicityElement_OwnedNullValue()
	 * @model containment="true"
	 * @generated
	 */
	DataValue getOwnedNullValue();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.information.MultiplicityElement#getOwnedNullValue <em>Owned Null Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Null Value</em>' containment reference.
	 * @see #getOwnedNullValue()
	 * @generated
	 */
	void setOwnedNullValue(DataValue value);

	/**
	 * Returns the value of the '<em><b>Owned Min Card</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Min Card</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Min Card</em>' containment reference.
	 * @see #setOwnedMinCard(NumericValue)
	 * @see org.polarsys.capella.core.semantic.data.information.InformationPackage#getMultiplicityElement_OwnedMinCard()
	 * @model containment="true"
	 * @generated
	 */
	NumericValue getOwnedMinCard();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.information.MultiplicityElement#getOwnedMinCard <em>Owned Min Card</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Min Card</em>' containment reference.
	 * @see #getOwnedMinCard()
	 * @generated
	 */
	void setOwnedMinCard(NumericValue value);

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
	 * @see org.polarsys.capella.core.semantic.data.information.InformationPackage#getMultiplicityElement_OwnedMinLength()
	 * @model containment="true"
	 * @generated
	 */
	NumericValue getOwnedMinLength();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.information.MultiplicityElement#getOwnedMinLength <em>Owned Min Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Min Length</em>' containment reference.
	 * @see #getOwnedMinLength()
	 * @generated
	 */
	void setOwnedMinLength(NumericValue value);

	/**
	 * Returns the value of the '<em><b>Owned Max Card</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Max Card</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Max Card</em>' containment reference.
	 * @see #setOwnedMaxCard(NumericValue)
	 * @see org.polarsys.capella.core.semantic.data.information.InformationPackage#getMultiplicityElement_OwnedMaxCard()
	 * @model containment="true"
	 * @generated
	 */
	NumericValue getOwnedMaxCard();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.information.MultiplicityElement#getOwnedMaxCard <em>Owned Max Card</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Max Card</em>' containment reference.
	 * @see #getOwnedMaxCard()
	 * @generated
	 */
	void setOwnedMaxCard(NumericValue value);

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
	 * @see org.polarsys.capella.core.semantic.data.information.InformationPackage#getMultiplicityElement_OwnedMaxLength()
	 * @model containment="true"
	 * @generated
	 */
	NumericValue getOwnedMaxLength();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.information.MultiplicityElement#getOwnedMaxLength <em>Owned Max Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Max Length</em>' containment reference.
	 * @see #getOwnedMaxLength()
	 * @generated
	 */
	void setOwnedMaxLength(NumericValue value);

} // MultiplicityElement
