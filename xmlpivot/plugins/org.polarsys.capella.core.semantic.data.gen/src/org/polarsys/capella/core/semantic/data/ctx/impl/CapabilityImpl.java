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

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.polarsys.capella.core.semantic.data.ctx.Actor;
import org.polarsys.capella.core.semantic.data.ctx.Capability;
import org.polarsys.capella.core.semantic.data.ctx.CtxPackage;

import org.polarsys.capella.core.semantic.data.interaction.impl.AbstractCapabilityImpl;

import org.polarsys.capella.core.semantic.data.oa.OperationalCapability;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Capability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.ctx.impl.CapabilityImpl#getParticipatingActors <em>Participating Actors</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.ctx.impl.CapabilityImpl#getParticipatingSystem <em>Participating System</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.ctx.impl.CapabilityImpl#getRealizedOperationalCapabilities <em>Realized Operational Capabilities</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CapabilityImpl extends AbstractCapabilityImpl implements Capability {
	/**
	 * The cached value of the '{@link #getParticipatingActors() <em>Participating Actors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipatingActors()
	 * @generated
	 * @ordered
	 */
	protected EList<Actor> participatingActors;

	/**
	 * The cached value of the '{@link #getParticipatingSystem() <em>Participating System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipatingSystem()
	 * @generated
	 * @ordered
	 */
	protected org.polarsys.capella.core.semantic.data.ctx.System participatingSystem;

	/**
	 * The cached value of the '{@link #getRealizedOperationalCapabilities() <em>Realized Operational Capabilities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizedOperationalCapabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationalCapability> realizedOperationalCapabilities;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapabilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CtxPackage.Literals.CAPABILITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Actor> getParticipatingActors() {
		if (participatingActors == null) {
			participatingActors = new EObjectResolvingEList<Actor>(Actor.class, this, CtxPackage.CAPABILITY__PARTICIPATING_ACTORS);
		}
		return participatingActors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.polarsys.capella.core.semantic.data.ctx.System getParticipatingSystem() {
		if (participatingSystem != null && participatingSystem.eIsProxy()) {
			InternalEObject oldParticipatingSystem = (InternalEObject)participatingSystem;
			participatingSystem = (org.polarsys.capella.core.semantic.data.ctx.System)eResolveProxy(oldParticipatingSystem);
			if (participatingSystem != oldParticipatingSystem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CtxPackage.CAPABILITY__PARTICIPATING_SYSTEM, oldParticipatingSystem, participatingSystem));
			}
		}
		return participatingSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.polarsys.capella.core.semantic.data.ctx.System basicGetParticipatingSystem() {
		return participatingSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParticipatingSystem(org.polarsys.capella.core.semantic.data.ctx.System newParticipatingSystem) {
		org.polarsys.capella.core.semantic.data.ctx.System oldParticipatingSystem = participatingSystem;
		participatingSystem = newParticipatingSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CtxPackage.CAPABILITY__PARTICIPATING_SYSTEM, oldParticipatingSystem, participatingSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationalCapability> getRealizedOperationalCapabilities() {
		if (realizedOperationalCapabilities == null) {
			realizedOperationalCapabilities = new EObjectResolvingEList<OperationalCapability>(OperationalCapability.class, this, CtxPackage.CAPABILITY__REALIZED_OPERATIONAL_CAPABILITIES);
		}
		return realizedOperationalCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CtxPackage.CAPABILITY__PARTICIPATING_ACTORS:
				return getParticipatingActors();
			case CtxPackage.CAPABILITY__PARTICIPATING_SYSTEM:
				if (resolve) return getParticipatingSystem();
				return basicGetParticipatingSystem();
			case CtxPackage.CAPABILITY__REALIZED_OPERATIONAL_CAPABILITIES:
				return getRealizedOperationalCapabilities();
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
			case CtxPackage.CAPABILITY__PARTICIPATING_ACTORS:
				getParticipatingActors().clear();
				getParticipatingActors().addAll((Collection<? extends Actor>)newValue);
				return;
			case CtxPackage.CAPABILITY__PARTICIPATING_SYSTEM:
				setParticipatingSystem((org.polarsys.capella.core.semantic.data.ctx.System)newValue);
				return;
			case CtxPackage.CAPABILITY__REALIZED_OPERATIONAL_CAPABILITIES:
				getRealizedOperationalCapabilities().clear();
				getRealizedOperationalCapabilities().addAll((Collection<? extends OperationalCapability>)newValue);
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
			case CtxPackage.CAPABILITY__PARTICIPATING_ACTORS:
				getParticipatingActors().clear();
				return;
			case CtxPackage.CAPABILITY__PARTICIPATING_SYSTEM:
				setParticipatingSystem((org.polarsys.capella.core.semantic.data.ctx.System)null);
				return;
			case CtxPackage.CAPABILITY__REALIZED_OPERATIONAL_CAPABILITIES:
				getRealizedOperationalCapabilities().clear();
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
			case CtxPackage.CAPABILITY__PARTICIPATING_ACTORS:
				return participatingActors != null && !participatingActors.isEmpty();
			case CtxPackage.CAPABILITY__PARTICIPATING_SYSTEM:
				return participatingSystem != null;
			case CtxPackage.CAPABILITY__REALIZED_OPERATIONAL_CAPABILITIES:
				return realizedOperationalCapabilities != null && !realizedOperationalCapabilities.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CapabilityImpl
