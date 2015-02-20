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

package org.polarsys.capella.core.semantic.data.cs.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.polarsys.capella.core.semantic.data.cs.CsPackage;
import org.polarsys.capella.core.semantic.data.cs.ExchangeItemAllocation;

import org.polarsys.capella.core.semantic.data.information.ExchangeItem;

import org.polarsys.capella.core.semantic.data.information.communication.CommunicationLinkProtocol;

import org.polarsys.capella.core.semantic.data.information.impl.AbstractEventOperationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exchange Item Allocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.impl.ExchangeItemAllocationImpl#getSendProtocol <em>Send Protocol</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.impl.ExchangeItemAllocationImpl#getReceiveProtocol <em>Receive Protocol</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.impl.ExchangeItemAllocationImpl#getAllocatedItem <em>Allocated Item</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExchangeItemAllocationImpl extends AbstractEventOperationImpl implements ExchangeItemAllocation {
	/**
	 * The default value of the '{@link #getSendProtocol() <em>Send Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendProtocol()
	 * @generated
	 * @ordered
	 */
	protected static final CommunicationLinkProtocol SEND_PROTOCOL_EDEFAULT = CommunicationLinkProtocol.UNSET;

	/**
	 * The cached value of the '{@link #getSendProtocol() <em>Send Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendProtocol()
	 * @generated
	 * @ordered
	 */
	protected CommunicationLinkProtocol sendProtocol = SEND_PROTOCOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getReceiveProtocol() <em>Receive Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiveProtocol()
	 * @generated
	 * @ordered
	 */
	protected static final CommunicationLinkProtocol RECEIVE_PROTOCOL_EDEFAULT = CommunicationLinkProtocol.UNSET;

	/**
	 * The cached value of the '{@link #getReceiveProtocol() <em>Receive Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiveProtocol()
	 * @generated
	 * @ordered
	 */
	protected CommunicationLinkProtocol receiveProtocol = RECEIVE_PROTOCOL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAllocatedItem() <em>Allocated Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatedItem()
	 * @generated
	 * @ordered
	 */
	protected ExchangeItem allocatedItem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExchangeItemAllocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CsPackage.Literals.EXCHANGE_ITEM_ALLOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationLinkProtocol getSendProtocol() {
		return sendProtocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSendProtocol(CommunicationLinkProtocol newSendProtocol) {
		CommunicationLinkProtocol oldSendProtocol = sendProtocol;
		sendProtocol = newSendProtocol == null ? SEND_PROTOCOL_EDEFAULT : newSendProtocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.EXCHANGE_ITEM_ALLOCATION__SEND_PROTOCOL, oldSendProtocol, sendProtocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationLinkProtocol getReceiveProtocol() {
		return receiveProtocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceiveProtocol(CommunicationLinkProtocol newReceiveProtocol) {
		CommunicationLinkProtocol oldReceiveProtocol = receiveProtocol;
		receiveProtocol = newReceiveProtocol == null ? RECEIVE_PROTOCOL_EDEFAULT : newReceiveProtocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.EXCHANGE_ITEM_ALLOCATION__RECEIVE_PROTOCOL, oldReceiveProtocol, receiveProtocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExchangeItem getAllocatedItem() {
		if (allocatedItem != null && allocatedItem.eIsProxy()) {
			InternalEObject oldAllocatedItem = (InternalEObject)allocatedItem;
			allocatedItem = (ExchangeItem)eResolveProxy(oldAllocatedItem);
			if (allocatedItem != oldAllocatedItem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CsPackage.EXCHANGE_ITEM_ALLOCATION__ALLOCATED_ITEM, oldAllocatedItem, allocatedItem));
			}
		}
		return allocatedItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExchangeItem basicGetAllocatedItem() {
		return allocatedItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllocatedItem(ExchangeItem newAllocatedItem) {
		ExchangeItem oldAllocatedItem = allocatedItem;
		allocatedItem = newAllocatedItem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.EXCHANGE_ITEM_ALLOCATION__ALLOCATED_ITEM, oldAllocatedItem, allocatedItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CsPackage.EXCHANGE_ITEM_ALLOCATION__SEND_PROTOCOL:
				return getSendProtocol();
			case CsPackage.EXCHANGE_ITEM_ALLOCATION__RECEIVE_PROTOCOL:
				return getReceiveProtocol();
			case CsPackage.EXCHANGE_ITEM_ALLOCATION__ALLOCATED_ITEM:
				if (resolve) return getAllocatedItem();
				return basicGetAllocatedItem();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CsPackage.EXCHANGE_ITEM_ALLOCATION__SEND_PROTOCOL:
				setSendProtocol((CommunicationLinkProtocol)newValue);
				return;
			case CsPackage.EXCHANGE_ITEM_ALLOCATION__RECEIVE_PROTOCOL:
				setReceiveProtocol((CommunicationLinkProtocol)newValue);
				return;
			case CsPackage.EXCHANGE_ITEM_ALLOCATION__ALLOCATED_ITEM:
				setAllocatedItem((ExchangeItem)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CsPackage.EXCHANGE_ITEM_ALLOCATION__SEND_PROTOCOL:
				setSendProtocol(SEND_PROTOCOL_EDEFAULT);
				return;
			case CsPackage.EXCHANGE_ITEM_ALLOCATION__RECEIVE_PROTOCOL:
				setReceiveProtocol(RECEIVE_PROTOCOL_EDEFAULT);
				return;
			case CsPackage.EXCHANGE_ITEM_ALLOCATION__ALLOCATED_ITEM:
				setAllocatedItem((ExchangeItem)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CsPackage.EXCHANGE_ITEM_ALLOCATION__SEND_PROTOCOL:
				return sendProtocol != SEND_PROTOCOL_EDEFAULT;
			case CsPackage.EXCHANGE_ITEM_ALLOCATION__RECEIVE_PROTOCOL:
				return receiveProtocol != RECEIVE_PROTOCOL_EDEFAULT;
			case CsPackage.EXCHANGE_ITEM_ALLOCATION__ALLOCATED_ITEM:
				return allocatedItem != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (sendProtocol: ");
		result.append(sendProtocol);
		result.append(", receiveProtocol: ");
		result.append(receiveProtocol);
		result.append(')');
		return result.toString();
	}

} //ExchangeItemAllocationImpl
