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

package org.polarsys.capella.core.semantic.data.cs.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.polarsys.capella.core.semantic.data.cs.CsPackage;
import org.polarsys.capella.core.semantic.data.cs.PhysicalPath;
import org.polarsys.capella.core.semantic.data.cs.PhysicalPathReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Physical Path Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.impl.PhysicalPathReferenceImpl#getReferencedPhysicalPath <em>Referenced Physical Path</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PhysicalPathReferenceImpl extends PhysicalPathInvolvementImpl implements PhysicalPathReference {
	/**
	 * The cached value of the '{@link #getReferencedPhysicalPath() <em>Referenced Physical Path</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedPhysicalPath()
	 * @generated
	 * @ordered
	 */
	protected PhysicalPath referencedPhysicalPath;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicalPathReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CsPackage.Literals.PHYSICAL_PATH_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalPath getReferencedPhysicalPath() {
		if (referencedPhysicalPath != null && referencedPhysicalPath.eIsProxy()) {
			InternalEObject oldReferencedPhysicalPath = (InternalEObject)referencedPhysicalPath;
			referencedPhysicalPath = (PhysicalPath)eResolveProxy(oldReferencedPhysicalPath);
			if (referencedPhysicalPath != oldReferencedPhysicalPath) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CsPackage.PHYSICAL_PATH_REFERENCE__REFERENCED_PHYSICAL_PATH, oldReferencedPhysicalPath, referencedPhysicalPath));
			}
		}
		return referencedPhysicalPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalPath basicGetReferencedPhysicalPath() {
		return referencedPhysicalPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedPhysicalPath(PhysicalPath newReferencedPhysicalPath) {
		PhysicalPath oldReferencedPhysicalPath = referencedPhysicalPath;
		referencedPhysicalPath = newReferencedPhysicalPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.PHYSICAL_PATH_REFERENCE__REFERENCED_PHYSICAL_PATH, oldReferencedPhysicalPath, referencedPhysicalPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CsPackage.PHYSICAL_PATH_REFERENCE__REFERENCED_PHYSICAL_PATH:
				if (resolve) return getReferencedPhysicalPath();
				return basicGetReferencedPhysicalPath();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CsPackage.PHYSICAL_PATH_REFERENCE__REFERENCED_PHYSICAL_PATH:
				setReferencedPhysicalPath((PhysicalPath)newValue);
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
			case CsPackage.PHYSICAL_PATH_REFERENCE__REFERENCED_PHYSICAL_PATH:
				setReferencedPhysicalPath((PhysicalPath)null);
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
			case CsPackage.PHYSICAL_PATH_REFERENCE__REFERENCED_PHYSICAL_PATH:
				return referencedPhysicalPath != null;
		}
		return super.eIsSet(featureID);
	}

} //PhysicalPathReferenceImpl
