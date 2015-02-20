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

package org.polarsys.capella.core.semantic.data.fa.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.polarsys.capella.core.semantic.data.fa.FaPackage;
import org.polarsys.capella.core.semantic.data.fa.FunctionalChain;
import org.polarsys.capella.core.semantic.data.fa.FunctionalChainReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Functional Chain Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.fa.impl.FunctionalChainReferenceImpl#getReferencedFunctionalChain <em>Referenced Functional Chain</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionalChainReferenceImpl extends FunctionalChainInvolvementImpl implements FunctionalChainReference {
	/**
	 * The cached value of the '{@link #getReferencedFunctionalChain() <em>Referenced Functional Chain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedFunctionalChain()
	 * @generated
	 * @ordered
	 */
	protected FunctionalChain referencedFunctionalChain;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionalChainReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FaPackage.Literals.FUNCTIONAL_CHAIN_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalChain getReferencedFunctionalChain() {
		if (referencedFunctionalChain != null && referencedFunctionalChain.eIsProxy()) {
			InternalEObject oldReferencedFunctionalChain = (InternalEObject)referencedFunctionalChain;
			referencedFunctionalChain = (FunctionalChain)eResolveProxy(oldReferencedFunctionalChain);
			if (referencedFunctionalChain != oldReferencedFunctionalChain) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FaPackage.FUNCTIONAL_CHAIN_REFERENCE__REFERENCED_FUNCTIONAL_CHAIN, oldReferencedFunctionalChain, referencedFunctionalChain));
			}
		}
		return referencedFunctionalChain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalChain basicGetReferencedFunctionalChain() {
		return referencedFunctionalChain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedFunctionalChain(FunctionalChain newReferencedFunctionalChain) {
		FunctionalChain oldReferencedFunctionalChain = referencedFunctionalChain;
		referencedFunctionalChain = newReferencedFunctionalChain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.FUNCTIONAL_CHAIN_REFERENCE__REFERENCED_FUNCTIONAL_CHAIN, oldReferencedFunctionalChain, referencedFunctionalChain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FaPackage.FUNCTIONAL_CHAIN_REFERENCE__REFERENCED_FUNCTIONAL_CHAIN:
				if (resolve) return getReferencedFunctionalChain();
				return basicGetReferencedFunctionalChain();
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
			case FaPackage.FUNCTIONAL_CHAIN_REFERENCE__REFERENCED_FUNCTIONAL_CHAIN:
				setReferencedFunctionalChain((FunctionalChain)newValue);
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
			case FaPackage.FUNCTIONAL_CHAIN_REFERENCE__REFERENCED_FUNCTIONAL_CHAIN:
				setReferencedFunctionalChain((FunctionalChain)null);
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
			case FaPackage.FUNCTIONAL_CHAIN_REFERENCE__REFERENCED_FUNCTIONAL_CHAIN:
				return referencedFunctionalChain != null;
		}
		return super.eIsSet(featureID);
	}

} //FunctionalChainReferenceImpl
