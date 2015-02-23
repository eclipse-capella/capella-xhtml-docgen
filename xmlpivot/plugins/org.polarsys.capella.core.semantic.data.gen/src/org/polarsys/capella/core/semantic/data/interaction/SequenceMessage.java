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

package org.polarsys.capella.core.semantic.data.interaction;

import org.eclipse.emf.common.util.EList;

import org.polarsys.capella.core.semantic.data.capellacore.Constraint;
import org.polarsys.capella.core.semantic.data.capellacore.NamedElement;

import org.polarsys.capella.core.semantic.data.cs.Part;

import org.polarsys.capella.core.semantic.data.fa.AbstractFunction;

import org.polarsys.capella.core.semantic.data.information.AbstractEventOperation;
import org.polarsys.capella.core.semantic.data.information.ExchangeItem;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.interaction.SequenceMessage#getKind <em>Kind</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.interaction.SequenceMessage#getExchangeContext <em>Exchange Context</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.interaction.SequenceMessage#getInvokedOperation <em>Invoked Operation</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.interaction.SequenceMessage#getExchangedItems <em>Exchanged Items</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.interaction.SequenceMessage#getSendingPart <em>Sending Part</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.interaction.SequenceMessage#getReceivingPart <em>Receiving Part</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.interaction.SequenceMessage#getSendingFunction <em>Sending Function</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.interaction.SequenceMessage#getReceivingFunction <em>Receiving Function</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.interaction.SequenceMessage#getOwnedSequenceMessageValuations <em>Owned Sequence Message Valuations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.interaction.InteractionPackage#getSequenceMessage()
 * @model
 * @generated
 */
public interface SequenceMessage extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.polarsys.capella.core.semantic.data.interaction.MessageKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.polarsys.capella.core.semantic.data.interaction.MessageKind
	 * @see #setKind(MessageKind)
	 * @see org.polarsys.capella.core.semantic.data.interaction.InteractionPackage#getSequenceMessage_Kind()
	 * @model
	 * @generated
	 */
	MessageKind getKind();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.interaction.SequenceMessage#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.polarsys.capella.core.semantic.data.interaction.MessageKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(MessageKind value);

	/**
	 * Returns the value of the '<em><b>Exchange Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exchange Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exchange Context</em>' reference.
	 * @see #setExchangeContext(Constraint)
	 * @see org.polarsys.capella.core.semantic.data.interaction.InteractionPackage#getSequenceMessage_ExchangeContext()
	 * @model
	 * @generated
	 */
	Constraint getExchangeContext();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.interaction.SequenceMessage#getExchangeContext <em>Exchange Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exchange Context</em>' reference.
	 * @see #getExchangeContext()
	 * @generated
	 */
	void setExchangeContext(Constraint value);

	/**
	 * Returns the value of the '<em><b>Invoked Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invoked Operation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoked Operation</em>' reference.
	 * @see #setInvokedOperation(AbstractEventOperation)
	 * @see org.polarsys.capella.core.semantic.data.interaction.InteractionPackage#getSequenceMessage_InvokedOperation()
	 * @model
	 * @generated
	 */
	AbstractEventOperation getInvokedOperation();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.interaction.SequenceMessage#getInvokedOperation <em>Invoked Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoked Operation</em>' reference.
	 * @see #getInvokedOperation()
	 * @generated
	 */
	void setInvokedOperation(AbstractEventOperation value);

	/**
	 * Returns the value of the '<em><b>Exchanged Items</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.information.ExchangeItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exchanged Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exchanged Items</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.interaction.InteractionPackage#getSequenceMessage_ExchangedItems()
	 * @model
	 * @generated
	 */
	EList<ExchangeItem> getExchangedItems();

	/**
	 * Returns the value of the '<em><b>Sending Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sending Part</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sending Part</em>' reference.
	 * @see #setSendingPart(Part)
	 * @see org.polarsys.capella.core.semantic.data.interaction.InteractionPackage#getSequenceMessage_SendingPart()
	 * @model
	 * @generated
	 */
	Part getSendingPart();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.interaction.SequenceMessage#getSendingPart <em>Sending Part</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sending Part</em>' reference.
	 * @see #getSendingPart()
	 * @generated
	 */
	void setSendingPart(Part value);

	/**
	 * Returns the value of the '<em><b>Receiving Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receiving Part</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receiving Part</em>' reference.
	 * @see #setReceivingPart(Part)
	 * @see org.polarsys.capella.core.semantic.data.interaction.InteractionPackage#getSequenceMessage_ReceivingPart()
	 * @model
	 * @generated
	 */
	Part getReceivingPart();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.interaction.SequenceMessage#getReceivingPart <em>Receiving Part</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receiving Part</em>' reference.
	 * @see #getReceivingPart()
	 * @generated
	 */
	void setReceivingPart(Part value);

	/**
	 * Returns the value of the '<em><b>Sending Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sending Function</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sending Function</em>' reference.
	 * @see #setSendingFunction(AbstractFunction)
	 * @see org.polarsys.capella.core.semantic.data.interaction.InteractionPackage#getSequenceMessage_SendingFunction()
	 * @model
	 * @generated
	 */
	AbstractFunction getSendingFunction();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.interaction.SequenceMessage#getSendingFunction <em>Sending Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sending Function</em>' reference.
	 * @see #getSendingFunction()
	 * @generated
	 */
	void setSendingFunction(AbstractFunction value);

	/**
	 * Returns the value of the '<em><b>Receiving Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receiving Function</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receiving Function</em>' reference.
	 * @see #setReceivingFunction(AbstractFunction)
	 * @see org.polarsys.capella.core.semantic.data.interaction.InteractionPackage#getSequenceMessage_ReceivingFunction()
	 * @model
	 * @generated
	 */
	AbstractFunction getReceivingFunction();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.interaction.SequenceMessage#getReceivingFunction <em>Receiving Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receiving Function</em>' reference.
	 * @see #getReceivingFunction()
	 * @generated
	 */
	void setReceivingFunction(AbstractFunction value);

	/**
	 * Returns the value of the '<em><b>Owned Sequence Message Valuations</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.interaction.SequenceMessageValuation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Sequence Message Valuations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Sequence Message Valuations</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.interaction.InteractionPackage#getSequenceMessage_OwnedSequenceMessageValuations()
	 * @model containment="true"
	 * @generated
	 */
	EList<SequenceMessageValuation> getOwnedSequenceMessageValuations();

} // SequenceMessage
