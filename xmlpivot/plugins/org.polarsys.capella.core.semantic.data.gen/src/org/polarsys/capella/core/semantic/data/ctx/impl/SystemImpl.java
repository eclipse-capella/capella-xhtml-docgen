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

package org.polarsys.capella.core.semantic.data.ctx.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.polarsys.capella.core.semantic.data.cs.impl.ComponentImpl;

import org.polarsys.capella.core.semantic.data.ctx.CtxPackage;
import org.polarsys.capella.core.semantic.data.ctx.SystemFunction;

import org.polarsys.capella.core.semantic.data.oa.Entity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.ctx.impl.SystemImpl#getAllocatedSystemFunctions <em>Allocated System Functions</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.ctx.impl.SystemImpl#getRealizedEntities <em>Realized Entities</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SystemImpl extends ComponentImpl implements org.polarsys.capella.core.semantic.data.ctx.System {
	/**
	 * The cached value of the '{@link #getAllocatedSystemFunctions() <em>Allocated System Functions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatedSystemFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemFunction> allocatedSystemFunctions;

	/**
	 * The cached value of the '{@link #getRealizedEntities() <em>Realized Entities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizedEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> realizedEntities;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CtxPackage.Literals.SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SystemFunction> getAllocatedSystemFunctions() {
		if (allocatedSystemFunctions == null) {
			allocatedSystemFunctions = new EObjectResolvingEList<SystemFunction>(SystemFunction.class, this, CtxPackage.SYSTEM__ALLOCATED_SYSTEM_FUNCTIONS);
		}
		return allocatedSystemFunctions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entity> getRealizedEntities() {
		if (realizedEntities == null) {
			realizedEntities = new EObjectResolvingEList<Entity>(Entity.class, this, CtxPackage.SYSTEM__REALIZED_ENTITIES);
		}
		return realizedEntities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CtxPackage.SYSTEM__ALLOCATED_SYSTEM_FUNCTIONS:
				return getAllocatedSystemFunctions();
			case CtxPackage.SYSTEM__REALIZED_ENTITIES:
				return getRealizedEntities();
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
			case CtxPackage.SYSTEM__ALLOCATED_SYSTEM_FUNCTIONS:
				getAllocatedSystemFunctions().clear();
				getAllocatedSystemFunctions().addAll((Collection<? extends SystemFunction>)newValue);
				return;
			case CtxPackage.SYSTEM__REALIZED_ENTITIES:
				getRealizedEntities().clear();
				getRealizedEntities().addAll((Collection<? extends Entity>)newValue);
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
			case CtxPackage.SYSTEM__ALLOCATED_SYSTEM_FUNCTIONS:
				getAllocatedSystemFunctions().clear();
				return;
			case CtxPackage.SYSTEM__REALIZED_ENTITIES:
				getRealizedEntities().clear();
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
			case CtxPackage.SYSTEM__ALLOCATED_SYSTEM_FUNCTIONS:
				return allocatedSystemFunctions != null && !allocatedSystemFunctions.isEmpty();
			case CtxPackage.SYSTEM__REALIZED_ENTITIES:
				return realizedEntities != null && !realizedEntities.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SystemImpl
