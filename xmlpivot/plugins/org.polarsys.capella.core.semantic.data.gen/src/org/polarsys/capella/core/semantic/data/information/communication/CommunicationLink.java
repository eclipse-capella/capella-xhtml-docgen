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

package org.polarsys.capella.core.semantic.data.information.communication;

import org.polarsys.capella.core.semantic.data.capellacore.CapellaElement;

import org.polarsys.capella.core.semantic.data.information.ExchangeItem;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.communication.CommunicationLink#getKind <em>Kind</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.communication.CommunicationLink#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.communication.CommunicationLink#getExchangeItem <em>Exchange Item</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.information.communication.CommunicationPackage#getCommunicationLink()
 * @model
 * @generated
 */
public interface CommunicationLink extends CapellaElement {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.polarsys.capella.core.semantic.data.information.communication.CommunicationLinkKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.polarsys.capella.core.semantic.data.information.communication.CommunicationLinkKind
	 * @see #setKind(CommunicationLinkKind)
	 * @see org.polarsys.capella.core.semantic.data.information.communication.CommunicationPackage#getCommunicationLink_Kind()
	 * @model
	 * @generated
	 */
	CommunicationLinkKind getKind();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.information.communication.CommunicationLink#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.polarsys.capella.core.semantic.data.information.communication.CommunicationLinkKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(CommunicationLinkKind value);

	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' attribute.
	 * The literals are from the enumeration {@link org.polarsys.capella.core.semantic.data.information.communication.CommunicationLinkProtocol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protocol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol</em>' attribute.
	 * @see org.polarsys.capella.core.semantic.data.information.communication.CommunicationLinkProtocol
	 * @see #setProtocol(CommunicationLinkProtocol)
	 * @see org.polarsys.capella.core.semantic.data.information.communication.CommunicationPackage#getCommunicationLink_Protocol()
	 * @model
	 * @generated
	 */
	CommunicationLinkProtocol getProtocol();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.information.communication.CommunicationLink#getProtocol <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' attribute.
	 * @see org.polarsys.capella.core.semantic.data.information.communication.CommunicationLinkProtocol
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(CommunicationLinkProtocol value);

	/**
	 * Returns the value of the '<em><b>Exchange Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exchange Item</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exchange Item</em>' reference.
	 * @see #setExchangeItem(ExchangeItem)
	 * @see org.polarsys.capella.core.semantic.data.information.communication.CommunicationPackage#getCommunicationLink_ExchangeItem()
	 * @model
	 * @generated
	 */
	ExchangeItem getExchangeItem();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.information.communication.CommunicationLink#getExchangeItem <em>Exchange Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exchange Item</em>' reference.
	 * @see #getExchangeItem()
	 * @generated
	 */
	void setExchangeItem(ExchangeItem value);

} // CommunicationLink
