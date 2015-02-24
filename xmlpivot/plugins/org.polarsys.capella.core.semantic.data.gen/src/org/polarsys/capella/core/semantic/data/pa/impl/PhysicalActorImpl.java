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

package org.polarsys.capella.core.semantic.data.pa.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.polarsys.capella.core.semantic.data.la.LogicalActor;

import org.polarsys.capella.core.semantic.data.pa.PaPackage;
import org.polarsys.capella.core.semantic.data.pa.PhysicalActor;
import org.polarsys.capella.core.semantic.data.pa.PhysicalComponent;
import org.polarsys.capella.core.semantic.data.pa.PhysicalFunction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Physical Actor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.pa.impl.PhysicalActorImpl#getAllocatedPhysicalFunctions <em>Allocated Physical Functions</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.pa.impl.PhysicalActorImpl#getRealizedLogicalActors <em>Realized Logical Actors</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.pa.impl.PhysicalActorImpl#getDeployedPhysicalComponents <em>Deployed Physical Components</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PhysicalActorImpl extends AbstractPhysicalComponentImpl implements PhysicalActor {
	/**
	 * The cached value of the '{@link #getAllocatedPhysicalFunctions() <em>Allocated Physical Functions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatedPhysicalFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalFunction> allocatedPhysicalFunctions;

	/**
	 * The cached value of the '{@link #getRealizedLogicalActors() <em>Realized Logical Actors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizedLogicalActors()
	 * @generated
	 * @ordered
	 */
	protected EList<LogicalActor> realizedLogicalActors;

	/**
	 * The cached value of the '{@link #getDeployedPhysicalComponents() <em>Deployed Physical Components</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployedPhysicalComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalComponent> deployedPhysicalComponents;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicalActorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaPackage.Literals.PHYSICAL_ACTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PhysicalFunction> getAllocatedPhysicalFunctions() {
		if (allocatedPhysicalFunctions == null) {
			allocatedPhysicalFunctions = new EObjectResolvingEList<PhysicalFunction>(PhysicalFunction.class, this, PaPackage.PHYSICAL_ACTOR__ALLOCATED_PHYSICAL_FUNCTIONS);
		}
		return allocatedPhysicalFunctions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LogicalActor> getRealizedLogicalActors() {
		if (realizedLogicalActors == null) {
			realizedLogicalActors = new EObjectResolvingEList<LogicalActor>(LogicalActor.class, this, PaPackage.PHYSICAL_ACTOR__REALIZED_LOGICAL_ACTORS);
		}
		return realizedLogicalActors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PhysicalComponent> getDeployedPhysicalComponents() {
		if (deployedPhysicalComponents == null) {
			deployedPhysicalComponents = new EObjectResolvingEList<PhysicalComponent>(PhysicalComponent.class, this, PaPackage.PHYSICAL_ACTOR__DEPLOYED_PHYSICAL_COMPONENTS);
		}
		return deployedPhysicalComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PaPackage.PHYSICAL_ACTOR__ALLOCATED_PHYSICAL_FUNCTIONS:
				return getAllocatedPhysicalFunctions();
			case PaPackage.PHYSICAL_ACTOR__REALIZED_LOGICAL_ACTORS:
				return getRealizedLogicalActors();
			case PaPackage.PHYSICAL_ACTOR__DEPLOYED_PHYSICAL_COMPONENTS:
				return getDeployedPhysicalComponents();
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
			case PaPackage.PHYSICAL_ACTOR__ALLOCATED_PHYSICAL_FUNCTIONS:
				getAllocatedPhysicalFunctions().clear();
				getAllocatedPhysicalFunctions().addAll((Collection<? extends PhysicalFunction>)newValue);
				return;
			case PaPackage.PHYSICAL_ACTOR__REALIZED_LOGICAL_ACTORS:
				getRealizedLogicalActors().clear();
				getRealizedLogicalActors().addAll((Collection<? extends LogicalActor>)newValue);
				return;
			case PaPackage.PHYSICAL_ACTOR__DEPLOYED_PHYSICAL_COMPONENTS:
				getDeployedPhysicalComponents().clear();
				getDeployedPhysicalComponents().addAll((Collection<? extends PhysicalComponent>)newValue);
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
			case PaPackage.PHYSICAL_ACTOR__ALLOCATED_PHYSICAL_FUNCTIONS:
				getAllocatedPhysicalFunctions().clear();
				return;
			case PaPackage.PHYSICAL_ACTOR__REALIZED_LOGICAL_ACTORS:
				getRealizedLogicalActors().clear();
				return;
			case PaPackage.PHYSICAL_ACTOR__DEPLOYED_PHYSICAL_COMPONENTS:
				getDeployedPhysicalComponents().clear();
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
			case PaPackage.PHYSICAL_ACTOR__ALLOCATED_PHYSICAL_FUNCTIONS:
				return allocatedPhysicalFunctions != null && !allocatedPhysicalFunctions.isEmpty();
			case PaPackage.PHYSICAL_ACTOR__REALIZED_LOGICAL_ACTORS:
				return realizedLogicalActors != null && !realizedLogicalActors.isEmpty();
			case PaPackage.PHYSICAL_ACTOR__DEPLOYED_PHYSICAL_COMPONENTS:
				return deployedPhysicalComponents != null && !deployedPhysicalComponents.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PhysicalActorImpl
