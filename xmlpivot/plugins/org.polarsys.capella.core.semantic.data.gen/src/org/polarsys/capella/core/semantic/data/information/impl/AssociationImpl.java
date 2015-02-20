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

package org.polarsys.capella.core.semantic.data.information.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.capella.core.semantic.data.capellacore.impl.NamedElementImpl;

import org.polarsys.capella.core.semantic.data.information.Association;
import org.polarsys.capella.core.semantic.data.information.InformationPackage;
import org.polarsys.capella.core.semantic.data.information.Property;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.impl.AssociationImpl#getOwnedMembers <em>Owned Members</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.impl.AssociationImpl#getNavigableMembers <em>Navigable Members</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssociationImpl extends NamedElementImpl implements Association {
	/**
	 * The cached value of the '{@link #getOwnedMembers() <em>Owned Members</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMembers()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> ownedMembers;

	/**
	 * The cached value of the '{@link #getNavigableMembers() <em>Navigable Members</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavigableMembers()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> navigableMembers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InformationPackage.Literals.ASSOCIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getOwnedMembers() {
		if (ownedMembers == null) {
			ownedMembers = new EObjectContainmentEList<Property>(Property.class, this, InformationPackage.ASSOCIATION__OWNED_MEMBERS);
		}
		return ownedMembers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getNavigableMembers() {
		if (navigableMembers == null) {
			navigableMembers = new EObjectResolvingEList<Property>(Property.class, this, InformationPackage.ASSOCIATION__NAVIGABLE_MEMBERS);
		}
		return navigableMembers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InformationPackage.ASSOCIATION__OWNED_MEMBERS:
				return ((InternalEList<?>)getOwnedMembers()).basicRemove(otherEnd, msgs);
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
			case InformationPackage.ASSOCIATION__OWNED_MEMBERS:
				return getOwnedMembers();
			case InformationPackage.ASSOCIATION__NAVIGABLE_MEMBERS:
				return getNavigableMembers();
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
			case InformationPackage.ASSOCIATION__OWNED_MEMBERS:
				getOwnedMembers().clear();
				getOwnedMembers().addAll((Collection<? extends Property>)newValue);
				return;
			case InformationPackage.ASSOCIATION__NAVIGABLE_MEMBERS:
				getNavigableMembers().clear();
				getNavigableMembers().addAll((Collection<? extends Property>)newValue);
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
			case InformationPackage.ASSOCIATION__OWNED_MEMBERS:
				getOwnedMembers().clear();
				return;
			case InformationPackage.ASSOCIATION__NAVIGABLE_MEMBERS:
				getNavigableMembers().clear();
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
			case InformationPackage.ASSOCIATION__OWNED_MEMBERS:
				return ownedMembers != null && !ownedMembers.isEmpty();
			case InformationPackage.ASSOCIATION__NAVIGABLE_MEMBERS:
				return navigableMembers != null && !navigableMembers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AssociationImpl
