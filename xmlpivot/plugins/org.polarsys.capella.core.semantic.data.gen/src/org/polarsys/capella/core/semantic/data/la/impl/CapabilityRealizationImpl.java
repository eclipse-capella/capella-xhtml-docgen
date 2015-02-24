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

import org.polarsys.capella.core.semantic.data.cs.AbstractActor;
import org.polarsys.capella.core.semantic.data.cs.SystemComponent;

import org.polarsys.capella.core.semantic.data.ctx.Capability;

import org.polarsys.capella.core.semantic.data.interaction.impl.AbstractCapabilityImpl;

import org.polarsys.capella.core.semantic.data.la.CapabilityRealization;
import org.polarsys.capella.core.semantic.data.la.LaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Capability Realization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.la.impl.CapabilityRealizationImpl#getParticipatingActors <em>Participating Actors</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.la.impl.CapabilityRealizationImpl#getParticipatingSystemComponents <em>Participating System Components</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.la.impl.CapabilityRealizationImpl#getRealizedCapabilities <em>Realized Capabilities</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.la.impl.CapabilityRealizationImpl#getRealizedCapabilityRealizations <em>Realized Capability Realizations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CapabilityRealizationImpl extends AbstractCapabilityImpl implements CapabilityRealization {
	/**
	 * The cached value of the '{@link #getParticipatingActors() <em>Participating Actors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipatingActors()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractActor> participatingActors;

	/**
	 * The cached value of the '{@link #getParticipatingSystemComponents() <em>Participating System Components</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipatingSystemComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemComponent> participatingSystemComponents;

	/**
	 * The cached value of the '{@link #getRealizedCapabilities() <em>Realized Capabilities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizedCapabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<Capability> realizedCapabilities;

	/**
	 * The cached value of the '{@link #getRealizedCapabilityRealizations() <em>Realized Capability Realizations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizedCapabilityRealizations()
	 * @generated
	 * @ordered
	 */
	protected EList<CapabilityRealization> realizedCapabilityRealizations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapabilityRealizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LaPackage.Literals.CAPABILITY_REALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractActor> getParticipatingActors() {
		if (participatingActors == null) {
			participatingActors = new EObjectResolvingEList<AbstractActor>(AbstractActor.class, this, LaPackage.CAPABILITY_REALIZATION__PARTICIPATING_ACTORS);
		}
		return participatingActors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SystemComponent> getParticipatingSystemComponents() {
		if (participatingSystemComponents == null) {
			participatingSystemComponents = new EObjectResolvingEList<SystemComponent>(SystemComponent.class, this, LaPackage.CAPABILITY_REALIZATION__PARTICIPATING_SYSTEM_COMPONENTS);
		}
		return participatingSystemComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Capability> getRealizedCapabilities() {
		if (realizedCapabilities == null) {
			realizedCapabilities = new EObjectResolvingEList<Capability>(Capability.class, this, LaPackage.CAPABILITY_REALIZATION__REALIZED_CAPABILITIES);
		}
		return realizedCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CapabilityRealization> getRealizedCapabilityRealizations() {
		if (realizedCapabilityRealizations == null) {
			realizedCapabilityRealizations = new EObjectResolvingEList<CapabilityRealization>(CapabilityRealization.class, this, LaPackage.CAPABILITY_REALIZATION__REALIZED_CAPABILITY_REALIZATIONS);
		}
		return realizedCapabilityRealizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LaPackage.CAPABILITY_REALIZATION__PARTICIPATING_ACTORS:
				return getParticipatingActors();
			case LaPackage.CAPABILITY_REALIZATION__PARTICIPATING_SYSTEM_COMPONENTS:
				return getParticipatingSystemComponents();
			case LaPackage.CAPABILITY_REALIZATION__REALIZED_CAPABILITIES:
				return getRealizedCapabilities();
			case LaPackage.CAPABILITY_REALIZATION__REALIZED_CAPABILITY_REALIZATIONS:
				return getRealizedCapabilityRealizations();
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
			case LaPackage.CAPABILITY_REALIZATION__PARTICIPATING_ACTORS:
				getParticipatingActors().clear();
				getParticipatingActors().addAll((Collection<? extends AbstractActor>)newValue);
				return;
			case LaPackage.CAPABILITY_REALIZATION__PARTICIPATING_SYSTEM_COMPONENTS:
				getParticipatingSystemComponents().clear();
				getParticipatingSystemComponents().addAll((Collection<? extends SystemComponent>)newValue);
				return;
			case LaPackage.CAPABILITY_REALIZATION__REALIZED_CAPABILITIES:
				getRealizedCapabilities().clear();
				getRealizedCapabilities().addAll((Collection<? extends Capability>)newValue);
				return;
			case LaPackage.CAPABILITY_REALIZATION__REALIZED_CAPABILITY_REALIZATIONS:
				getRealizedCapabilityRealizations().clear();
				getRealizedCapabilityRealizations().addAll((Collection<? extends CapabilityRealization>)newValue);
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
			case LaPackage.CAPABILITY_REALIZATION__PARTICIPATING_ACTORS:
				getParticipatingActors().clear();
				return;
			case LaPackage.CAPABILITY_REALIZATION__PARTICIPATING_SYSTEM_COMPONENTS:
				getParticipatingSystemComponents().clear();
				return;
			case LaPackage.CAPABILITY_REALIZATION__REALIZED_CAPABILITIES:
				getRealizedCapabilities().clear();
				return;
			case LaPackage.CAPABILITY_REALIZATION__REALIZED_CAPABILITY_REALIZATIONS:
				getRealizedCapabilityRealizations().clear();
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
			case LaPackage.CAPABILITY_REALIZATION__PARTICIPATING_ACTORS:
				return participatingActors != null && !participatingActors.isEmpty();
			case LaPackage.CAPABILITY_REALIZATION__PARTICIPATING_SYSTEM_COMPONENTS:
				return participatingSystemComponents != null && !participatingSystemComponents.isEmpty();
			case LaPackage.CAPABILITY_REALIZATION__REALIZED_CAPABILITIES:
				return realizedCapabilities != null && !realizedCapabilities.isEmpty();
			case LaPackage.CAPABILITY_REALIZATION__REALIZED_CAPABILITY_REALIZATIONS:
				return realizedCapabilityRealizations != null && !realizedCapabilityRealizations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CapabilityRealizationImpl
