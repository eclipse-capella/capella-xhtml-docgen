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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.polarsys.capella.core.semantic.data.information.impl.PropertyImpl;

import org.polarsys.capella.core.semantic.data.oa.OaPackage;
import org.polarsys.capella.core.semantic.data.oa.OperationalActivity;
import org.polarsys.capella.core.semantic.data.oa.Role;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.oa.impl.RoleImpl#getAllocatedOperationalActivities <em>Allocated Operational Activities</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoleImpl extends PropertyImpl implements Role {
	/**
	 * The cached value of the '{@link #getAllocatedOperationalActivities() <em>Allocated Operational Activities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatedOperationalActivities()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationalActivity> allocatedOperationalActivities;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OaPackage.Literals.ROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationalActivity> getAllocatedOperationalActivities() {
		if (allocatedOperationalActivities == null) {
			allocatedOperationalActivities = new EObjectResolvingEList<OperationalActivity>(OperationalActivity.class, this, OaPackage.ROLE__ALLOCATED_OPERATIONAL_ACTIVITIES);
		}
		return allocatedOperationalActivities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OaPackage.ROLE__ALLOCATED_OPERATIONAL_ACTIVITIES:
				return getAllocatedOperationalActivities();
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
			case OaPackage.ROLE__ALLOCATED_OPERATIONAL_ACTIVITIES:
				getAllocatedOperationalActivities().clear();
				getAllocatedOperationalActivities().addAll((Collection<? extends OperationalActivity>)newValue);
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
			case OaPackage.ROLE__ALLOCATED_OPERATIONAL_ACTIVITIES:
				getAllocatedOperationalActivities().clear();
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
			case OaPackage.ROLE__ALLOCATED_OPERATIONAL_ACTIVITIES:
				return allocatedOperationalActivities != null && !allocatedOperationalActivities.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RoleImpl
