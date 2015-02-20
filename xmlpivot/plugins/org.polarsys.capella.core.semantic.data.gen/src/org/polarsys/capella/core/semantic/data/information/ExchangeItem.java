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

import org.polarsys.capella.core.semantic.data.behavior.AbstractEvent;

import org.polarsys.capella.core.semantic.data.capellacore.GeneralizableElement;

import org.polarsys.capella.core.semantic.data.modellingcore.AbstractExchangeItem;
import org.polarsys.capella.core.semantic.data.modellingcore.AbstractType;
import org.polarsys.capella.core.semantic.data.modellingcore.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exchange Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.ExchangeItem#getExchangeMechanism <em>Exchange Mechanism</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.ExchangeItem#getOwnedElements <em>Owned Elements</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.ExchangeItem#getOwnedExchangeItemInstances <em>Owned Exchange Item Instances</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.ExchangeItem#getRealizedExchangeItems <em>Realized Exchange Items</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.information.InformationPackage#getExchangeItem()
 * @model
 * @generated
 */
public interface ExchangeItem extends AbstractExchangeItem, AbstractEvent, GeneralizableElement, AbstractType, ModelElement {
	/**
	 * Returns the value of the '<em><b>Exchange Mechanism</b></em>' attribute.
	 * The literals are from the enumeration {@link org.polarsys.capella.core.semantic.data.information.ExchangeMechanism}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exchange Mechanism</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exchange Mechanism</em>' attribute.
	 * @see org.polarsys.capella.core.semantic.data.information.ExchangeMechanism
	 * @see #setExchangeMechanism(ExchangeMechanism)
	 * @see org.polarsys.capella.core.semantic.data.information.InformationPackage#getExchangeItem_ExchangeMechanism()
	 * @model required="true"
	 * @generated
	 */
	ExchangeMechanism getExchangeMechanism();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.information.ExchangeItem#getExchangeMechanism <em>Exchange Mechanism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exchange Mechanism</em>' attribute.
	 * @see org.polarsys.capella.core.semantic.data.information.ExchangeMechanism
	 * @see #getExchangeMechanism()
	 * @generated
	 */
	void setExchangeMechanism(ExchangeMechanism value);

	/**
	 * Returns the value of the '<em><b>Owned Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.information.ExchangeItemElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Elements</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.information.InformationPackage#getExchangeItem_OwnedElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExchangeItemElement> getOwnedElements();

	/**
	 * Returns the value of the '<em><b>Owned Exchange Item Instances</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.information.ExchangeItemInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Exchange Item Instances</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Exchange Item Instances</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.information.InformationPackage#getExchangeItem_OwnedExchangeItemInstances()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExchangeItemInstance> getOwnedExchangeItemInstances();

	/**
	 * Returns the value of the '<em><b>Realized Exchange Items</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.information.ExchangeItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realized Exchange Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realized Exchange Items</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.information.InformationPackage#getExchangeItem_RealizedExchangeItems()
	 * @model
	 * @generated
	 */
	EList<ExchangeItem> getRealizedExchangeItems();

} // ExchangeItem
