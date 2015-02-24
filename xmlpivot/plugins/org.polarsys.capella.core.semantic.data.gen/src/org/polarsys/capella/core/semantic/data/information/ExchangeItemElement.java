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

import org.polarsys.capella.core.semantic.data.capellacore.NamedElement;
import org.polarsys.capella.core.semantic.data.capellacore.TypedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exchange Item Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.ExchangeItemElement#getKind <em>Kind</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.ExchangeItemElement#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.ExchangeItemElement#isComposite <em>Composite</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.ExchangeItemElement#getReferencedProperties <em>Referenced Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.information.InformationPackage#getExchangeItemElement()
 * @model
 * @generated
 */
public interface ExchangeItemElement extends NamedElement, MultiplicityElement, TypedElement {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.polarsys.capella.core.semantic.data.information.ElementKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.polarsys.capella.core.semantic.data.information.ElementKind
	 * @see #setKind(ElementKind)
	 * @see org.polarsys.capella.core.semantic.data.information.InformationPackage#getExchangeItemElement_Kind()
	 * @model
	 * @generated
	 */
	ElementKind getKind();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.information.ExchangeItemElement#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.polarsys.capella.core.semantic.data.information.ElementKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(ElementKind value);

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
	 * @see org.polarsys.capella.core.semantic.data.information.InformationPackage#getExchangeItemElement_Direction()
	 * @model
	 * @generated
	 */
	ParameterDirection getDirection();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.information.ExchangeItemElement#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see org.polarsys.capella.core.semantic.data.information.ParameterDirection
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(ParameterDirection value);

	/**
	 * Returns the value of the '<em><b>Composite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composite</em>' attribute.
	 * @see #setComposite(boolean)
	 * @see org.polarsys.capella.core.semantic.data.information.InformationPackage#getExchangeItemElement_Composite()
	 * @model
	 * @generated
	 */
	boolean isComposite();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.information.ExchangeItemElement#isComposite <em>Composite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Composite</em>' attribute.
	 * @see #isComposite()
	 * @generated
	 */
	void setComposite(boolean value);

	/**
	 * Returns the value of the '<em><b>Referenced Properties</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.information.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Properties</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Properties</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.information.InformationPackage#getExchangeItemElement_ReferencedProperties()
	 * @model
	 * @generated
	 */
	EList<Property> getReferencedProperties();

} // ExchangeItemElement
