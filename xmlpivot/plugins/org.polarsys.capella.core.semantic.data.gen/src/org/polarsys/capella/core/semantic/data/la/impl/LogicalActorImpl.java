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

package org.polarsys.capella.core.semantic.data.la.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.polarsys.capella.core.semantic.data.cs.impl.AbstractActorImpl;

import org.polarsys.capella.core.semantic.data.ctx.Actor;

import org.polarsys.capella.core.semantic.data.la.LaPackage;
import org.polarsys.capella.core.semantic.data.la.LogicalActor;
import org.polarsys.capella.core.semantic.data.la.LogicalFunction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logical Actor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.la.impl.LogicalActorImpl#getAllocatedLogicalFunctions <em>Allocated Logical Functions</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.la.impl.LogicalActorImpl#getRealizedSystemActors <em>Realized System Actors</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LogicalActorImpl extends AbstractActorImpl implements LogicalActor {
	/**
	 * The cached value of the '{@link #getAllocatedLogicalFunctions() <em>Allocated Logical Functions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatedLogicalFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<LogicalFunction> allocatedLogicalFunctions;

	/**
	 * The cached value of the '{@link #getRealizedSystemActors() <em>Realized System Actors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizedSystemActors()
	 * @generated
	 * @ordered
	 */
	protected EList<Actor> realizedSystemActors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogicalActorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LaPackage.Literals.LOGICAL_ACTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LogicalFunction> getAllocatedLogicalFunctions() {
		if (allocatedLogicalFunctions == null) {
			allocatedLogicalFunctions = new EObjectResolvingEList<LogicalFunction>(LogicalFunction.class, this, LaPackage.LOGICAL_ACTOR__ALLOCATED_LOGICAL_FUNCTIONS);
		}
		return allocatedLogicalFunctions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Actor> getRealizedSystemActors() {
		if (realizedSystemActors == null) {
			realizedSystemActors = new EObjectResolvingEList<Actor>(Actor.class, this, LaPackage.LOGICAL_ACTOR__REALIZED_SYSTEM_ACTORS);
		}
		return realizedSystemActors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LaPackage.LOGICAL_ACTOR__ALLOCATED_LOGICAL_FUNCTIONS:
				return getAllocatedLogicalFunctions();
			case LaPackage.LOGICAL_ACTOR__REALIZED_SYSTEM_ACTORS:
				return getRealizedSystemActors();
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
			case LaPackage.LOGICAL_ACTOR__ALLOCATED_LOGICAL_FUNCTIONS:
				getAllocatedLogicalFunctions().clear();
				getAllocatedLogicalFunctions().addAll((Collection<? extends LogicalFunction>)newValue);
				return;
			case LaPackage.LOGICAL_ACTOR__REALIZED_SYSTEM_ACTORS:
				getRealizedSystemActors().clear();
				getRealizedSystemActors().addAll((Collection<? extends Actor>)newValue);
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
			case LaPackage.LOGICAL_ACTOR__ALLOCATED_LOGICAL_FUNCTIONS:
				getAllocatedLogicalFunctions().clear();
				return;
			case LaPackage.LOGICAL_ACTOR__REALIZED_SYSTEM_ACTORS:
				getRealizedSystemActors().clear();
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
			case LaPackage.LOGICAL_ACTOR__ALLOCATED_LOGICAL_FUNCTIONS:
				return allocatedLogicalFunctions != null && !allocatedLogicalFunctions.isEmpty();
			case LaPackage.LOGICAL_ACTOR__REALIZED_SYSTEM_ACTORS:
				return realizedSystemActors != null && !realizedSystemActors.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LogicalActorImpl
