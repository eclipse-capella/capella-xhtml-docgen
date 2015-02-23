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

package org.polarsys.capella.core.semantic.data.capellacommon.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.capella.core.semantic.data.behavior.AbstractEvent;

import org.polarsys.capella.core.semantic.data.capellacommon.CapellacommonPackage;
import org.polarsys.capella.core.semantic.data.capellacommon.Region;
import org.polarsys.capella.core.semantic.data.capellacommon.State;

import org.polarsys.capella.core.semantic.data.fa.AbstractFunction;
import org.polarsys.capella.core.semantic.data.fa.FunctionalChain;

import org.polarsys.capella.core.semantic.data.interaction.AbstractCapability;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.capellacommon.impl.StateImpl#getOwnedRegions <em>Owned Regions</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.capellacommon.impl.StateImpl#getAvailableAbstractFunctions <em>Available Abstract Functions</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.capellacommon.impl.StateImpl#getAvailableFunctionalChains <em>Available Functional Chains</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.capellacommon.impl.StateImpl#getAvailableAbstractCapabilities <em>Available Abstract Capabilities</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.capellacommon.impl.StateImpl#getDoActivity <em>Do Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StateImpl extends AbstractStateImpl implements State {
	/**
	 * The cached value of the '{@link #getOwnedRegions() <em>Owned Regions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedRegions()
	 * @generated
	 * @ordered
	 */
	protected EList<Region> ownedRegions;

	/**
	 * The cached value of the '{@link #getAvailableAbstractFunctions() <em>Available Abstract Functions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableAbstractFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractFunction> availableAbstractFunctions;

	/**
	 * The cached value of the '{@link #getAvailableFunctionalChains() <em>Available Functional Chains</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableFunctionalChains()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionalChain> availableFunctionalChains;

	/**
	 * The cached value of the '{@link #getAvailableAbstractCapabilities() <em>Available Abstract Capabilities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableAbstractCapabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractCapability> availableAbstractCapabilities;

	/**
	 * The cached value of the '{@link #getDoActivity() <em>Do Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoActivity()
	 * @generated
	 * @ordered
	 */
	protected AbstractEvent doActivity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CapellacommonPackage.Literals.STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Region> getOwnedRegions() {
		if (ownedRegions == null) {
			ownedRegions = new EObjectContainmentEList<Region>(Region.class, this, CapellacommonPackage.STATE__OWNED_REGIONS);
		}
		return ownedRegions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractFunction> getAvailableAbstractFunctions() {
		if (availableAbstractFunctions == null) {
			availableAbstractFunctions = new EObjectEList<AbstractFunction>(AbstractFunction.class, this, CapellacommonPackage.STATE__AVAILABLE_ABSTRACT_FUNCTIONS);
		}
		return availableAbstractFunctions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionalChain> getAvailableFunctionalChains() {
		if (availableFunctionalChains == null) {
			availableFunctionalChains = new EObjectEList<FunctionalChain>(FunctionalChain.class, this, CapellacommonPackage.STATE__AVAILABLE_FUNCTIONAL_CHAINS);
		}
		return availableFunctionalChains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractCapability> getAvailableAbstractCapabilities() {
		if (availableAbstractCapabilities == null) {
			availableAbstractCapabilities = new EObjectEList<AbstractCapability>(AbstractCapability.class, this, CapellacommonPackage.STATE__AVAILABLE_ABSTRACT_CAPABILITIES);
		}
		return availableAbstractCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractEvent getDoActivity() {
		if (doActivity != null && doActivity.eIsProxy()) {
			InternalEObject oldDoActivity = (InternalEObject)doActivity;
			doActivity = (AbstractEvent)eResolveProxy(oldDoActivity);
			if (doActivity != oldDoActivity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CapellacommonPackage.STATE__DO_ACTIVITY, oldDoActivity, doActivity));
			}
		}
		return doActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractEvent basicGetDoActivity() {
		return doActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoActivity(AbstractEvent newDoActivity) {
		AbstractEvent oldDoActivity = doActivity;
		doActivity = newDoActivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CapellacommonPackage.STATE__DO_ACTIVITY, oldDoActivity, doActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CapellacommonPackage.STATE__OWNED_REGIONS:
				return ((InternalEList<?>)getOwnedRegions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CapellacommonPackage.STATE__OWNED_REGIONS:
				return getOwnedRegions();
			case CapellacommonPackage.STATE__AVAILABLE_ABSTRACT_FUNCTIONS:
				return getAvailableAbstractFunctions();
			case CapellacommonPackage.STATE__AVAILABLE_FUNCTIONAL_CHAINS:
				return getAvailableFunctionalChains();
			case CapellacommonPackage.STATE__AVAILABLE_ABSTRACT_CAPABILITIES:
				return getAvailableAbstractCapabilities();
			case CapellacommonPackage.STATE__DO_ACTIVITY:
				if (resolve) return getDoActivity();
				return basicGetDoActivity();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CapellacommonPackage.STATE__OWNED_REGIONS:
				getOwnedRegions().clear();
				getOwnedRegions().addAll((Collection<? extends Region>)newValue);
				return;
			case CapellacommonPackage.STATE__AVAILABLE_ABSTRACT_FUNCTIONS:
				getAvailableAbstractFunctions().clear();
				getAvailableAbstractFunctions().addAll((Collection<? extends AbstractFunction>)newValue);
				return;
			case CapellacommonPackage.STATE__AVAILABLE_FUNCTIONAL_CHAINS:
				getAvailableFunctionalChains().clear();
				getAvailableFunctionalChains().addAll((Collection<? extends FunctionalChain>)newValue);
				return;
			case CapellacommonPackage.STATE__AVAILABLE_ABSTRACT_CAPABILITIES:
				getAvailableAbstractCapabilities().clear();
				getAvailableAbstractCapabilities().addAll((Collection<? extends AbstractCapability>)newValue);
				return;
			case CapellacommonPackage.STATE__DO_ACTIVITY:
				setDoActivity((AbstractEvent)newValue);
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
			case CapellacommonPackage.STATE__OWNED_REGIONS:
				getOwnedRegions().clear();
				return;
			case CapellacommonPackage.STATE__AVAILABLE_ABSTRACT_FUNCTIONS:
				getAvailableAbstractFunctions().clear();
				return;
			case CapellacommonPackage.STATE__AVAILABLE_FUNCTIONAL_CHAINS:
				getAvailableFunctionalChains().clear();
				return;
			case CapellacommonPackage.STATE__AVAILABLE_ABSTRACT_CAPABILITIES:
				getAvailableAbstractCapabilities().clear();
				return;
			case CapellacommonPackage.STATE__DO_ACTIVITY:
				setDoActivity((AbstractEvent)null);
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
			case CapellacommonPackage.STATE__OWNED_REGIONS:
				return ownedRegions != null && !ownedRegions.isEmpty();
			case CapellacommonPackage.STATE__AVAILABLE_ABSTRACT_FUNCTIONS:
				return availableAbstractFunctions != null && !availableAbstractFunctions.isEmpty();
			case CapellacommonPackage.STATE__AVAILABLE_FUNCTIONAL_CHAINS:
				return availableFunctionalChains != null && !availableFunctionalChains.isEmpty();
			case CapellacommonPackage.STATE__AVAILABLE_ABSTRACT_CAPABILITIES:
				return availableAbstractCapabilities != null && !availableAbstractCapabilities.isEmpty();
			case CapellacommonPackage.STATE__DO_ACTIVITY:
				return doActivity != null;
		}
		return super.eIsSet(featureID);
	}

} //StateImpl
