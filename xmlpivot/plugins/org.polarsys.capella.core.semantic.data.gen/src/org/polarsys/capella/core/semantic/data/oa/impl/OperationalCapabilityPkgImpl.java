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

import org.polarsys.capella.core.semantic.data.capellacommon.impl.AbstractCapabilityPkgImpl;

import org.polarsys.capella.core.semantic.data.oa.OaPackage;
import org.polarsys.capella.core.semantic.data.oa.OperationalCapability;
import org.polarsys.capella.core.semantic.data.oa.OperationalCapabilityPkg;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operational Capability Pkg</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.oa.impl.OperationalCapabilityPkgImpl#getOwnedOperationalCapabilities <em>Owned Operational Capabilities</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.oa.impl.OperationalCapabilityPkgImpl#getOwnedOperationalCapabilityPkgs <em>Owned Operational Capability Pkgs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperationalCapabilityPkgImpl extends AbstractCapabilityPkgImpl implements OperationalCapabilityPkg {
	/**
	 * The cached value of the '{@link #getOwnedOperationalCapabilities() <em>Owned Operational Capabilities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedOperationalCapabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationalCapability> ownedOperationalCapabilities;

	/**
	 * The cached value of the '{@link #getOwnedOperationalCapabilityPkgs() <em>Owned Operational Capability Pkgs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedOperationalCapabilityPkgs()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationalCapabilityPkg> ownedOperationalCapabilityPkgs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationalCapabilityPkgImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OaPackage.Literals.OPERATIONAL_CAPABILITY_PKG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationalCapability> getOwnedOperationalCapabilities() {
		if (ownedOperationalCapabilities == null) {
			ownedOperationalCapabilities = new EObjectContainmentEList<OperationalCapability>(OperationalCapability.class, this, OaPackage.OPERATIONAL_CAPABILITY_PKG__OWNED_OPERATIONAL_CAPABILITIES);
		}
		return ownedOperationalCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationalCapabilityPkg> getOwnedOperationalCapabilityPkgs() {
		if (ownedOperationalCapabilityPkgs == null) {
			ownedOperationalCapabilityPkgs = new EObjectContainmentEList<OperationalCapabilityPkg>(OperationalCapabilityPkg.class, this, OaPackage.OPERATIONAL_CAPABILITY_PKG__OWNED_OPERATIONAL_CAPABILITY_PKGS);
		}
		return ownedOperationalCapabilityPkgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OaPackage.OPERATIONAL_CAPABILITY_PKG__OWNED_OPERATIONAL_CAPABILITIES:
				return ((InternalEList<?>)getOwnedOperationalCapabilities()).basicRemove(otherEnd, msgs);
			case OaPackage.OPERATIONAL_CAPABILITY_PKG__OWNED_OPERATIONAL_CAPABILITY_PKGS:
				return ((InternalEList<?>)getOwnedOperationalCapabilityPkgs()).basicRemove(otherEnd, msgs);
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
			case OaPackage.OPERATIONAL_CAPABILITY_PKG__OWNED_OPERATIONAL_CAPABILITIES:
				return getOwnedOperationalCapabilities();
			case OaPackage.OPERATIONAL_CAPABILITY_PKG__OWNED_OPERATIONAL_CAPABILITY_PKGS:
				return getOwnedOperationalCapabilityPkgs();
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
			case OaPackage.OPERATIONAL_CAPABILITY_PKG__OWNED_OPERATIONAL_CAPABILITIES:
				getOwnedOperationalCapabilities().clear();
				getOwnedOperationalCapabilities().addAll((Collection<? extends OperationalCapability>)newValue);
				return;
			case OaPackage.OPERATIONAL_CAPABILITY_PKG__OWNED_OPERATIONAL_CAPABILITY_PKGS:
				getOwnedOperationalCapabilityPkgs().clear();
				getOwnedOperationalCapabilityPkgs().addAll((Collection<? extends OperationalCapabilityPkg>)newValue);
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
			case OaPackage.OPERATIONAL_CAPABILITY_PKG__OWNED_OPERATIONAL_CAPABILITIES:
				getOwnedOperationalCapabilities().clear();
				return;
			case OaPackage.OPERATIONAL_CAPABILITY_PKG__OWNED_OPERATIONAL_CAPABILITY_PKGS:
				getOwnedOperationalCapabilityPkgs().clear();
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
			case OaPackage.OPERATIONAL_CAPABILITY_PKG__OWNED_OPERATIONAL_CAPABILITIES:
				return ownedOperationalCapabilities != null && !ownedOperationalCapabilities.isEmpty();
			case OaPackage.OPERATIONAL_CAPABILITY_PKG__OWNED_OPERATIONAL_CAPABILITY_PKGS:
				return ownedOperationalCapabilityPkgs != null && !ownedOperationalCapabilityPkgs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OperationalCapabilityPkgImpl
