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

import org.polarsys.capella.core.semantic.data.cs.impl.AbstractActorImpl;

import org.polarsys.capella.core.semantic.data.ctx.Actor;
import org.polarsys.capella.core.semantic.data.ctx.CtxPackage;
import org.polarsys.capella.core.semantic.data.ctx.SystemFunction;

import org.polarsys.capella.core.semantic.data.oa.Entity;
import org.polarsys.capella.core.semantic.data.oa.OperationalActor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.ctx.impl.ActorImpl#getAllocatedSystemFunctions <em>Allocated System Functions</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.ctx.impl.ActorImpl#getRealizedEntities <em>Realized Entities</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.ctx.impl.ActorImpl#getRealizedOperationalActors <em>Realized Operational Actors</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActorImpl extends AbstractActorImpl implements Actor {
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
	 * The cached value of the '{@link #getRealizedOperationalActors() <em>Realized Operational Actors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizedOperationalActors()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationalActor> realizedOperationalActors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CtxPackage.Literals.ACTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SystemFunction> getAllocatedSystemFunctions() {
		if (allocatedSystemFunctions == null) {
			allocatedSystemFunctions = new EObjectResolvingEList<SystemFunction>(SystemFunction.class, this, CtxPackage.ACTOR__ALLOCATED_SYSTEM_FUNCTIONS);
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
			realizedEntities = new EObjectResolvingEList<Entity>(Entity.class, this, CtxPackage.ACTOR__REALIZED_ENTITIES);
		}
		return realizedEntities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationalActor> getRealizedOperationalActors() {
		if (realizedOperationalActors == null) {
			realizedOperationalActors = new EObjectResolvingEList<OperationalActor>(OperationalActor.class, this, CtxPackage.ACTOR__REALIZED_OPERATIONAL_ACTORS);
		}
		return realizedOperationalActors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CtxPackage.ACTOR__ALLOCATED_SYSTEM_FUNCTIONS:
				return getAllocatedSystemFunctions();
			case CtxPackage.ACTOR__REALIZED_ENTITIES:
				return getRealizedEntities();
			case CtxPackage.ACTOR__REALIZED_OPERATIONAL_ACTORS:
				return getRealizedOperationalActors();
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
			case CtxPackage.ACTOR__ALLOCATED_SYSTEM_FUNCTIONS:
				getAllocatedSystemFunctions().clear();
				getAllocatedSystemFunctions().addAll((Collection<? extends SystemFunction>)newValue);
				return;
			case CtxPackage.ACTOR__REALIZED_ENTITIES:
				getRealizedEntities().clear();
				getRealizedEntities().addAll((Collection<? extends Entity>)newValue);
				return;
			case CtxPackage.ACTOR__REALIZED_OPERATIONAL_ACTORS:
				getRealizedOperationalActors().clear();
				getRealizedOperationalActors().addAll((Collection<? extends OperationalActor>)newValue);
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
			case CtxPackage.ACTOR__ALLOCATED_SYSTEM_FUNCTIONS:
				getAllocatedSystemFunctions().clear();
				return;
			case CtxPackage.ACTOR__REALIZED_ENTITIES:
				getRealizedEntities().clear();
				return;
			case CtxPackage.ACTOR__REALIZED_OPERATIONAL_ACTORS:
				getRealizedOperationalActors().clear();
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
			case CtxPackage.ACTOR__ALLOCATED_SYSTEM_FUNCTIONS:
				return allocatedSystemFunctions != null && !allocatedSystemFunctions.isEmpty();
			case CtxPackage.ACTOR__REALIZED_ENTITIES:
				return realizedEntities != null && !realizedEntities.isEmpty();
			case CtxPackage.ACTOR__REALIZED_OPERATIONAL_ACTORS:
				return realizedOperationalActors != null && !realizedOperationalActors.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ActorImpl
