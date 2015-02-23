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

package org.polarsys.capella.core.semantic.data.oa.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.capella.core.semantic.data.fa.impl.AbstractFunctionImpl;

import org.polarsys.capella.core.semantic.data.oa.OaPackage;
import org.polarsys.capella.core.semantic.data.oa.OperationalActivity;
import org.polarsys.capella.core.semantic.data.oa.OperationalActivityPkg;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operational Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.oa.impl.OperationalActivityImpl#getOwnedOperationalActivityPkgs <em>Owned Operational Activity Pkgs</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.oa.impl.OperationalActivityImpl#getContainedOperationalActivities <em>Contained Operational Activities</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperationalActivityImpl extends AbstractFunctionImpl implements OperationalActivity {
	/**
	 * The cached value of the '{@link #getOwnedOperationalActivityPkgs() <em>Owned Operational Activity Pkgs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedOperationalActivityPkgs()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationalActivityPkg> ownedOperationalActivityPkgs;

	/**
	 * The cached value of the '{@link #getContainedOperationalActivities() <em>Contained Operational Activities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedOperationalActivities()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationalActivity> containedOperationalActivities;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationalActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OaPackage.Literals.OPERATIONAL_ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationalActivityPkg> getOwnedOperationalActivityPkgs() {
		if (ownedOperationalActivityPkgs == null) {
			ownedOperationalActivityPkgs = new EObjectContainmentEList<OperationalActivityPkg>(OperationalActivityPkg.class, this, OaPackage.OPERATIONAL_ACTIVITY__OWNED_OPERATIONAL_ACTIVITY_PKGS);
		}
		return ownedOperationalActivityPkgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationalActivity> getContainedOperationalActivities() {
		if (containedOperationalActivities == null) {
			containedOperationalActivities = new EObjectContainmentEList<OperationalActivity>(OperationalActivity.class, this, OaPackage.OPERATIONAL_ACTIVITY__CONTAINED_OPERATIONAL_ACTIVITIES);
		}
		return containedOperationalActivities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OaPackage.OPERATIONAL_ACTIVITY__OWNED_OPERATIONAL_ACTIVITY_PKGS:
				return ((InternalEList<?>)getOwnedOperationalActivityPkgs()).basicRemove(otherEnd, msgs);
			case OaPackage.OPERATIONAL_ACTIVITY__CONTAINED_OPERATIONAL_ACTIVITIES:
				return ((InternalEList<?>)getContainedOperationalActivities()).basicRemove(otherEnd, msgs);
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
			case OaPackage.OPERATIONAL_ACTIVITY__OWNED_OPERATIONAL_ACTIVITY_PKGS:
				return getOwnedOperationalActivityPkgs();
			case OaPackage.OPERATIONAL_ACTIVITY__CONTAINED_OPERATIONAL_ACTIVITIES:
				return getContainedOperationalActivities();
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
			case OaPackage.OPERATIONAL_ACTIVITY__OWNED_OPERATIONAL_ACTIVITY_PKGS:
				getOwnedOperationalActivityPkgs().clear();
				getOwnedOperationalActivityPkgs().addAll((Collection<? extends OperationalActivityPkg>)newValue);
				return;
			case OaPackage.OPERATIONAL_ACTIVITY__CONTAINED_OPERATIONAL_ACTIVITIES:
				getContainedOperationalActivities().clear();
				getContainedOperationalActivities().addAll((Collection<? extends OperationalActivity>)newValue);
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
			case OaPackage.OPERATIONAL_ACTIVITY__OWNED_OPERATIONAL_ACTIVITY_PKGS:
				getOwnedOperationalActivityPkgs().clear();
				return;
			case OaPackage.OPERATIONAL_ACTIVITY__CONTAINED_OPERATIONAL_ACTIVITIES:
				getContainedOperationalActivities().clear();
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
			case OaPackage.OPERATIONAL_ACTIVITY__OWNED_OPERATIONAL_ACTIVITY_PKGS:
				return ownedOperationalActivityPkgs != null && !ownedOperationalActivityPkgs.isEmpty();
			case OaPackage.OPERATIONAL_ACTIVITY__CONTAINED_OPERATIONAL_ACTIVITIES:
				return containedOperationalActivities != null && !containedOperationalActivities.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OperationalActivityImpl
