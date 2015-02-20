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

import org.polarsys.capella.core.semantic.data.interaction.impl.AbstractCapabilityImpl;

import org.polarsys.capella.core.semantic.data.oa.Entity;
import org.polarsys.capella.core.semantic.data.oa.OaPackage;
import org.polarsys.capella.core.semantic.data.oa.OperationalCapability;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operational Capability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.oa.impl.OperationalCapabilityImpl#getInvolvedEntities <em>Involved Entities</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperationalCapabilityImpl extends AbstractCapabilityImpl implements OperationalCapability {
	/**
	 * The cached value of the '{@link #getInvolvedEntities() <em>Involved Entities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvolvedEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> involvedEntities;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationalCapabilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OaPackage.Literals.OPERATIONAL_CAPABILITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entity> getInvolvedEntities() {
		if (involvedEntities == null) {
			involvedEntities = new EObjectResolvingEList<Entity>(Entity.class, this, OaPackage.OPERATIONAL_CAPABILITY__INVOLVED_ENTITIES);
		}
		return involvedEntities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OaPackage.OPERATIONAL_CAPABILITY__INVOLVED_ENTITIES:
				return getInvolvedEntities();
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
			case OaPackage.OPERATIONAL_CAPABILITY__INVOLVED_ENTITIES:
				getInvolvedEntities().clear();
				getInvolvedEntities().addAll((Collection<? extends Entity>)newValue);
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
			case OaPackage.OPERATIONAL_CAPABILITY__INVOLVED_ENTITIES:
				getInvolvedEntities().clear();
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
			case OaPackage.OPERATIONAL_CAPABILITY__INVOLVED_ENTITIES:
				return involvedEntities != null && !involvedEntities.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OperationalCapabilityImpl
