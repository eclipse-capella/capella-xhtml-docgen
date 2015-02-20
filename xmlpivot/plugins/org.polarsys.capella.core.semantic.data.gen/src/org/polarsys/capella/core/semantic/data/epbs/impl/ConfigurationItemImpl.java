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

package org.polarsys.capella.core.semantic.data.epbs.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.capella.core.semantic.data.cs.AbstractPhysicalArtifact;

import org.polarsys.capella.core.semantic.data.cs.impl.SystemComponentImpl;

import org.polarsys.capella.core.semantic.data.epbs.ConfigurationItem;
import org.polarsys.capella.core.semantic.data.epbs.ConfigurationItemKind;
import org.polarsys.capella.core.semantic.data.epbs.ConfigurationItemPkg;
import org.polarsys.capella.core.semantic.data.epbs.EpbsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.epbs.impl.ConfigurationItemImpl#getItemIdentifier <em>Item Identifier</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.epbs.impl.ConfigurationItemImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.epbs.impl.ConfigurationItemImpl#getOwnedConfigurationItems <em>Owned Configuration Items</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.epbs.impl.ConfigurationItemImpl#getOwnedConfigurationItemPkgs <em>Owned Configuration Item Pkgs</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.epbs.impl.ConfigurationItemImpl#getAllocatedPhysicalArtifacts <em>Allocated Physical Artifacts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConfigurationItemImpl extends SystemComponentImpl implements ConfigurationItem {
	/**
	 * The default value of the '{@link #getItemIdentifier() <em>Item Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String ITEM_IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getItemIdentifier() <em>Item Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String itemIdentifier = ITEM_IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final ConfigurationItemKind KIND_EDEFAULT = ConfigurationItemKind.UNSET;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected ConfigurationItemKind kind = KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedConfigurationItems() <em>Owned Configuration Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedConfigurationItems()
	 * @generated
	 * @ordered
	 */
	protected EList<ConfigurationItem> ownedConfigurationItems;

	/**
	 * The cached value of the '{@link #getOwnedConfigurationItemPkgs() <em>Owned Configuration Item Pkgs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedConfigurationItemPkgs()
	 * @generated
	 * @ordered
	 */
	protected EList<ConfigurationItemPkg> ownedConfigurationItemPkgs;

	/**
	 * The cached value of the '{@link #getAllocatedPhysicalArtifacts() <em>Allocated Physical Artifacts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatedPhysicalArtifacts()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractPhysicalArtifact> allocatedPhysicalArtifacts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EpbsPackage.Literals.CONFIGURATION_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getItemIdentifier() {
		return itemIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItemIdentifier(String newItemIdentifier) {
		String oldItemIdentifier = itemIdentifier;
		itemIdentifier = newItemIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EpbsPackage.CONFIGURATION_ITEM__ITEM_IDENTIFIER, oldItemIdentifier, itemIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationItemKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(ConfigurationItemKind newKind) {
		ConfigurationItemKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EpbsPackage.CONFIGURATION_ITEM__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConfigurationItem> getOwnedConfigurationItems() {
		if (ownedConfigurationItems == null) {
			ownedConfigurationItems = new EObjectContainmentEList<ConfigurationItem>(ConfigurationItem.class, this, EpbsPackage.CONFIGURATION_ITEM__OWNED_CONFIGURATION_ITEMS);
		}
		return ownedConfigurationItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConfigurationItemPkg> getOwnedConfigurationItemPkgs() {
		if (ownedConfigurationItemPkgs == null) {
			ownedConfigurationItemPkgs = new EObjectContainmentEList<ConfigurationItemPkg>(ConfigurationItemPkg.class, this, EpbsPackage.CONFIGURATION_ITEM__OWNED_CONFIGURATION_ITEM_PKGS);
		}
		return ownedConfigurationItemPkgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractPhysicalArtifact> getAllocatedPhysicalArtifacts() {
		if (allocatedPhysicalArtifacts == null) {
			allocatedPhysicalArtifacts = new EObjectResolvingEList<AbstractPhysicalArtifact>(AbstractPhysicalArtifact.class, this, EpbsPackage.CONFIGURATION_ITEM__ALLOCATED_PHYSICAL_ARTIFACTS);
		}
		return allocatedPhysicalArtifacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EpbsPackage.CONFIGURATION_ITEM__OWNED_CONFIGURATION_ITEMS:
				return ((InternalEList<?>)getOwnedConfigurationItems()).basicRemove(otherEnd, msgs);
			case EpbsPackage.CONFIGURATION_ITEM__OWNED_CONFIGURATION_ITEM_PKGS:
				return ((InternalEList<?>)getOwnedConfigurationItemPkgs()).basicRemove(otherEnd, msgs);
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
			case EpbsPackage.CONFIGURATION_ITEM__ITEM_IDENTIFIER:
				return getItemIdentifier();
			case EpbsPackage.CONFIGURATION_ITEM__KIND:
				return getKind();
			case EpbsPackage.CONFIGURATION_ITEM__OWNED_CONFIGURATION_ITEMS:
				return getOwnedConfigurationItems();
			case EpbsPackage.CONFIGURATION_ITEM__OWNED_CONFIGURATION_ITEM_PKGS:
				return getOwnedConfigurationItemPkgs();
			case EpbsPackage.CONFIGURATION_ITEM__ALLOCATED_PHYSICAL_ARTIFACTS:
				return getAllocatedPhysicalArtifacts();
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
			case EpbsPackage.CONFIGURATION_ITEM__ITEM_IDENTIFIER:
				setItemIdentifier((String)newValue);
				return;
			case EpbsPackage.CONFIGURATION_ITEM__KIND:
				setKind((ConfigurationItemKind)newValue);
				return;
			case EpbsPackage.CONFIGURATION_ITEM__OWNED_CONFIGURATION_ITEMS:
				getOwnedConfigurationItems().clear();
				getOwnedConfigurationItems().addAll((Collection<? extends ConfigurationItem>)newValue);
				return;
			case EpbsPackage.CONFIGURATION_ITEM__OWNED_CONFIGURATION_ITEM_PKGS:
				getOwnedConfigurationItemPkgs().clear();
				getOwnedConfigurationItemPkgs().addAll((Collection<? extends ConfigurationItemPkg>)newValue);
				return;
			case EpbsPackage.CONFIGURATION_ITEM__ALLOCATED_PHYSICAL_ARTIFACTS:
				getAllocatedPhysicalArtifacts().clear();
				getAllocatedPhysicalArtifacts().addAll((Collection<? extends AbstractPhysicalArtifact>)newValue);
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
			case EpbsPackage.CONFIGURATION_ITEM__ITEM_IDENTIFIER:
				setItemIdentifier(ITEM_IDENTIFIER_EDEFAULT);
				return;
			case EpbsPackage.CONFIGURATION_ITEM__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case EpbsPackage.CONFIGURATION_ITEM__OWNED_CONFIGURATION_ITEMS:
				getOwnedConfigurationItems().clear();
				return;
			case EpbsPackage.CONFIGURATION_ITEM__OWNED_CONFIGURATION_ITEM_PKGS:
				getOwnedConfigurationItemPkgs().clear();
				return;
			case EpbsPackage.CONFIGURATION_ITEM__ALLOCATED_PHYSICAL_ARTIFACTS:
				getAllocatedPhysicalArtifacts().clear();
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
			case EpbsPackage.CONFIGURATION_ITEM__ITEM_IDENTIFIER:
				return ITEM_IDENTIFIER_EDEFAULT == null ? itemIdentifier != null : !ITEM_IDENTIFIER_EDEFAULT.equals(itemIdentifier);
			case EpbsPackage.CONFIGURATION_ITEM__KIND:
				return kind != KIND_EDEFAULT;
			case EpbsPackage.CONFIGURATION_ITEM__OWNED_CONFIGURATION_ITEMS:
				return ownedConfigurationItems != null && !ownedConfigurationItems.isEmpty();
			case EpbsPackage.CONFIGURATION_ITEM__OWNED_CONFIGURATION_ITEM_PKGS:
				return ownedConfigurationItemPkgs != null && !ownedConfigurationItemPkgs.isEmpty();
			case EpbsPackage.CONFIGURATION_ITEM__ALLOCATED_PHYSICAL_ARTIFACTS:
				return allocatedPhysicalArtifacts != null && !allocatedPhysicalArtifacts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (itemIdentifier: ");
		result.append(itemIdentifier);
		result.append(", kind: ");
		result.append(kind);
		result.append(')');
		return result.toString();
	}

} //ConfigurationItemImpl
