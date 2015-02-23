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

package org.polarsys.capella.core.semantic.data.cs;

import org.polarsys.capella.core.semantic.data.capellacore.CapellaElement;

import org.polarsys.capella.core.semantic.data.information.AbstractEventOperation;
import org.polarsys.capella.core.semantic.data.information.ExchangeItem;

import org.polarsys.capella.core.semantic.data.information.communication.CommunicationLinkProtocol;

import org.polarsys.capella.core.semantic.data.modellingcore.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exchange Item Allocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.ExchangeItemAllocation#getSendProtocol <em>Send Protocol</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.ExchangeItemAllocation#getReceiveProtocol <em>Receive Protocol</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.ExchangeItemAllocation#getAllocatedItem <em>Allocated Item</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.cs.CsPackage#getExchangeItemAllocation()
 * @model
 * @generated
 */
public interface ExchangeItemAllocation extends AbstractEventOperation, CapellaElement, ModelElement {
	/**
	 * Returns the value of the '<em><b>Send Protocol</b></em>' attribute.
	 * The literals are from the enumeration {@link org.polarsys.capella.core.semantic.data.information.communication.CommunicationLinkProtocol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Send Protocol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Send Protocol</em>' attribute.
	 * @see org.polarsys.capella.core.semantic.data.information.communication.CommunicationLinkProtocol
	 * @see #setSendProtocol(CommunicationLinkProtocol)
	 * @see org.polarsys.capella.core.semantic.data.cs.CsPackage#getExchangeItemAllocation_SendProtocol()
	 * @model
	 * @generated
	 */
	CommunicationLinkProtocol getSendProtocol();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.cs.ExchangeItemAllocation#getSendProtocol <em>Send Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Send Protocol</em>' attribute.
	 * @see org.polarsys.capella.core.semantic.data.information.communication.CommunicationLinkProtocol
	 * @see #getSendProtocol()
	 * @generated
	 */
	void setSendProtocol(CommunicationLinkProtocol value);

	/**
	 * Returns the value of the '<em><b>Receive Protocol</b></em>' attribute.
	 * The literals are from the enumeration {@link org.polarsys.capella.core.semantic.data.information.communication.CommunicationLinkProtocol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receive Protocol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receive Protocol</em>' attribute.
	 * @see org.polarsys.capella.core.semantic.data.information.communication.CommunicationLinkProtocol
	 * @see #setReceiveProtocol(CommunicationLinkProtocol)
	 * @see org.polarsys.capella.core.semantic.data.cs.CsPackage#getExchangeItemAllocation_ReceiveProtocol()
	 * @model
	 * @generated
	 */
	CommunicationLinkProtocol getReceiveProtocol();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.cs.ExchangeItemAllocation#getReceiveProtocol <em>Receive Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receive Protocol</em>' attribute.
	 * @see org.polarsys.capella.core.semantic.data.information.communication.CommunicationLinkProtocol
	 * @see #getReceiveProtocol()
	 * @generated
	 */
	void setReceiveProtocol(CommunicationLinkProtocol value);

	/**
	 * Returns the value of the '<em><b>Allocated Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocated Item</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocated Item</em>' reference.
	 * @see #setAllocatedItem(ExchangeItem)
	 * @see org.polarsys.capella.core.semantic.data.cs.CsPackage#getExchangeItemAllocation_AllocatedItem()
	 * @model
	 * @generated
	 */
	ExchangeItem getAllocatedItem();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.cs.ExchangeItemAllocation#getAllocatedItem <em>Allocated Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allocated Item</em>' reference.
	 * @see #getAllocatedItem()
	 * @generated
	 */
	void setAllocatedItem(ExchangeItem value);

} // ExchangeItemAllocation
