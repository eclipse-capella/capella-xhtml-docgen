/*******************************************************************************
 * Copyright (c) 2006, 2015 Thales Global Services
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v1.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v10.html
 * 
 *   Contributors:
 *      Thales - initial API and implementation
 ******************************************************************************/
package org.polarsys.capella.vp.price.price.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.polarsys.capella.vp.price.price.PartPrice;
import org.polarsys.capella.vp.price.price.PricePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Part Price</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.capella.vp.price.price.impl.PartPriceImpl#getCurrentPrice <em>Current Price</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PartPriceImpl extends PriceImpl implements PartPrice {

	/**
	 * The default value of the '{@link #getCurrentPrice() <em>Current Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentPrice()
	 * @generated
	 * @ordered
	 */
	protected static final int CURRENT_PRICE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCurrentPrice() <em>Current Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentPrice()
	 * @generated
	 * @ordered
	 */
	protected int currentPrice = CURRENT_PRICE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartPriceImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PricePackage.Literals.PART_PRICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public int getCurrentPrice() {

		return currentPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setCurrentPrice(int newCurrentPrice) {

		int oldCurrentPrice = currentPrice;
		currentPrice = newCurrentPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PricePackage.PART_PRICE__CURRENT_PRICE, oldCurrentPrice,
					currentPrice));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PricePackage.PART_PRICE__CURRENT_PRICE:
			return getCurrentPrice();
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
		case PricePackage.PART_PRICE__CURRENT_PRICE:
			setCurrentPrice((Integer) newValue);
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
		case PricePackage.PART_PRICE__CURRENT_PRICE:
			setCurrentPrice(CURRENT_PRICE_EDEFAULT);
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
		case PricePackage.PART_PRICE__CURRENT_PRICE:
			return currentPrice != CURRENT_PRICE_EDEFAULT;
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
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (currentPrice: "); //$NON-NLS-1$
		result.append(currentPrice);
		result.append(')');
		return result.toString();
	}

} //PartPriceImpl