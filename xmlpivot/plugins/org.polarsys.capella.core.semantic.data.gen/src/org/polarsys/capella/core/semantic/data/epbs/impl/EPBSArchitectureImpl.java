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

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.polarsys.capella.core.semantic.data.cs.impl.BlockArchitectureImpl;

import org.polarsys.capella.core.semantic.data.epbs.ConfigurationItem;
import org.polarsys.capella.core.semantic.data.epbs.ConfigurationItemPkg;
import org.polarsys.capella.core.semantic.data.epbs.EPBSArchitecture;
import org.polarsys.capella.core.semantic.data.epbs.EPBSContext;
import org.polarsys.capella.core.semantic.data.epbs.EpbsPackage;

import org.polarsys.capella.core.semantic.data.la.CapabilityRealizationPkg;

import org.polarsys.capella.core.semantic.data.pa.PhysicalArchitecture;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EPBS Architecture</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.epbs.impl.EPBSArchitectureImpl#getOwnedEPBSContext <em>Owned EPBS Context</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.epbs.impl.EPBSArchitectureImpl#getOwnedConfigurationItem <em>Owned Configuration Item</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.epbs.impl.EPBSArchitectureImpl#getOwnedConfigurationItemPkg <em>Owned Configuration Item Pkg</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.epbs.impl.EPBSArchitectureImpl#getContainedCapabilityRealizationPkg <em>Contained Capability Realization Pkg</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.epbs.impl.EPBSArchitectureImpl#getAllocatedPhysicalArchitectures <em>Allocated Physical Architectures</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EPBSArchitectureImpl extends BlockArchitectureImpl implements EPBSArchitecture {
	/**
	 * The cached value of the '{@link #getOwnedEPBSContext() <em>Owned EPBS Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedEPBSContext()
	 * @generated
	 * @ordered
	 */
	protected EPBSContext ownedEPBSContext;

	/**
	 * The cached value of the '{@link #getOwnedConfigurationItem() <em>Owned Configuration Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedConfigurationItem()
	 * @generated
	 * @ordered
	 */
	protected ConfigurationItem ownedConfigurationItem;

	/**
	 * The cached value of the '{@link #getOwnedConfigurationItemPkg() <em>Owned Configuration Item Pkg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedConfigurationItemPkg()
	 * @generated
	 * @ordered
	 */
	protected ConfigurationItemPkg ownedConfigurationItemPkg;

	/**
	 * The cached value of the '{@link #getContainedCapabilityRealizationPkg() <em>Contained Capability Realization Pkg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedCapabilityRealizationPkg()
	 * @generated
	 * @ordered
	 */
	protected CapabilityRealizationPkg containedCapabilityRealizationPkg;

	/**
	 * The cached value of the '{@link #getAllocatedPhysicalArchitectures() <em>Allocated Physical Architectures</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatedPhysicalArchitectures()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalArchitecture> allocatedPhysicalArchitectures;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EPBSArchitectureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EpbsPackage.Literals.EPBS_ARCHITECTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPBSContext getOwnedEPBSContext() {
		return ownedEPBSContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedEPBSContext(EPBSContext newOwnedEPBSContext, NotificationChain msgs) {
		EPBSContext oldOwnedEPBSContext = ownedEPBSContext;
		ownedEPBSContext = newOwnedEPBSContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EpbsPackage.EPBS_ARCHITECTURE__OWNED_EPBS_CONTEXT, oldOwnedEPBSContext, newOwnedEPBSContext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedEPBSContext(EPBSContext newOwnedEPBSContext) {
		if (newOwnedEPBSContext != ownedEPBSContext) {
			NotificationChain msgs = null;
			if (ownedEPBSContext != null)
				msgs = ((InternalEObject)ownedEPBSContext).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EpbsPackage.EPBS_ARCHITECTURE__OWNED_EPBS_CONTEXT, null, msgs);
			if (newOwnedEPBSContext != null)
				msgs = ((InternalEObject)newOwnedEPBSContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EpbsPackage.EPBS_ARCHITECTURE__OWNED_EPBS_CONTEXT, null, msgs);
			msgs = basicSetOwnedEPBSContext(newOwnedEPBSContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EpbsPackage.EPBS_ARCHITECTURE__OWNED_EPBS_CONTEXT, newOwnedEPBSContext, newOwnedEPBSContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationItem getOwnedConfigurationItem() {
		return ownedConfigurationItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedConfigurationItem(ConfigurationItem newOwnedConfigurationItem, NotificationChain msgs) {
		ConfigurationItem oldOwnedConfigurationItem = ownedConfigurationItem;
		ownedConfigurationItem = newOwnedConfigurationItem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EpbsPackage.EPBS_ARCHITECTURE__OWNED_CONFIGURATION_ITEM, oldOwnedConfigurationItem, newOwnedConfigurationItem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedConfigurationItem(ConfigurationItem newOwnedConfigurationItem) {
		if (newOwnedConfigurationItem != ownedConfigurationItem) {
			NotificationChain msgs = null;
			if (ownedConfigurationItem != null)
				msgs = ((InternalEObject)ownedConfigurationItem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EpbsPackage.EPBS_ARCHITECTURE__OWNED_CONFIGURATION_ITEM, null, msgs);
			if (newOwnedConfigurationItem != null)
				msgs = ((InternalEObject)newOwnedConfigurationItem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EpbsPackage.EPBS_ARCHITECTURE__OWNED_CONFIGURATION_ITEM, null, msgs);
			msgs = basicSetOwnedConfigurationItem(newOwnedConfigurationItem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EpbsPackage.EPBS_ARCHITECTURE__OWNED_CONFIGURATION_ITEM, newOwnedConfigurationItem, newOwnedConfigurationItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationItemPkg getOwnedConfigurationItemPkg() {
		return ownedConfigurationItemPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedConfigurationItemPkg(ConfigurationItemPkg newOwnedConfigurationItemPkg, NotificationChain msgs) {
		ConfigurationItemPkg oldOwnedConfigurationItemPkg = ownedConfigurationItemPkg;
		ownedConfigurationItemPkg = newOwnedConfigurationItemPkg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EpbsPackage.EPBS_ARCHITECTURE__OWNED_CONFIGURATION_ITEM_PKG, oldOwnedConfigurationItemPkg, newOwnedConfigurationItemPkg);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedConfigurationItemPkg(ConfigurationItemPkg newOwnedConfigurationItemPkg) {
		if (newOwnedConfigurationItemPkg != ownedConfigurationItemPkg) {
			NotificationChain msgs = null;
			if (ownedConfigurationItemPkg != null)
				msgs = ((InternalEObject)ownedConfigurationItemPkg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EpbsPackage.EPBS_ARCHITECTURE__OWNED_CONFIGURATION_ITEM_PKG, null, msgs);
			if (newOwnedConfigurationItemPkg != null)
				msgs = ((InternalEObject)newOwnedConfigurationItemPkg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EpbsPackage.EPBS_ARCHITECTURE__OWNED_CONFIGURATION_ITEM_PKG, null, msgs);
			msgs = basicSetOwnedConfigurationItemPkg(newOwnedConfigurationItemPkg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EpbsPackage.EPBS_ARCHITECTURE__OWNED_CONFIGURATION_ITEM_PKG, newOwnedConfigurationItemPkg, newOwnedConfigurationItemPkg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityRealizationPkg getContainedCapabilityRealizationPkg() {
		return containedCapabilityRealizationPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainedCapabilityRealizationPkg(CapabilityRealizationPkg newContainedCapabilityRealizationPkg, NotificationChain msgs) {
		CapabilityRealizationPkg oldContainedCapabilityRealizationPkg = containedCapabilityRealizationPkg;
		containedCapabilityRealizationPkg = newContainedCapabilityRealizationPkg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EpbsPackage.EPBS_ARCHITECTURE__CONTAINED_CAPABILITY_REALIZATION_PKG, oldContainedCapabilityRealizationPkg, newContainedCapabilityRealizationPkg);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainedCapabilityRealizationPkg(CapabilityRealizationPkg newContainedCapabilityRealizationPkg) {
		if (newContainedCapabilityRealizationPkg != containedCapabilityRealizationPkg) {
			NotificationChain msgs = null;
			if (containedCapabilityRealizationPkg != null)
				msgs = ((InternalEObject)containedCapabilityRealizationPkg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EpbsPackage.EPBS_ARCHITECTURE__CONTAINED_CAPABILITY_REALIZATION_PKG, null, msgs);
			if (newContainedCapabilityRealizationPkg != null)
				msgs = ((InternalEObject)newContainedCapabilityRealizationPkg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EpbsPackage.EPBS_ARCHITECTURE__CONTAINED_CAPABILITY_REALIZATION_PKG, null, msgs);
			msgs = basicSetContainedCapabilityRealizationPkg(newContainedCapabilityRealizationPkg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EpbsPackage.EPBS_ARCHITECTURE__CONTAINED_CAPABILITY_REALIZATION_PKG, newContainedCapabilityRealizationPkg, newContainedCapabilityRealizationPkg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PhysicalArchitecture> getAllocatedPhysicalArchitectures() {
		if (allocatedPhysicalArchitectures == null) {
			allocatedPhysicalArchitectures = new EObjectResolvingEList<PhysicalArchitecture>(PhysicalArchitecture.class, this, EpbsPackage.EPBS_ARCHITECTURE__ALLOCATED_PHYSICAL_ARCHITECTURES);
		}
		return allocatedPhysicalArchitectures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EpbsPackage.EPBS_ARCHITECTURE__OWNED_EPBS_CONTEXT:
				return basicSetOwnedEPBSContext(null, msgs);
			case EpbsPackage.EPBS_ARCHITECTURE__OWNED_CONFIGURATION_ITEM:
				return basicSetOwnedConfigurationItem(null, msgs);
			case EpbsPackage.EPBS_ARCHITECTURE__OWNED_CONFIGURATION_ITEM_PKG:
				return basicSetOwnedConfigurationItemPkg(null, msgs);
			case EpbsPackage.EPBS_ARCHITECTURE__CONTAINED_CAPABILITY_REALIZATION_PKG:
				return basicSetContainedCapabilityRealizationPkg(null, msgs);
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
			case EpbsPackage.EPBS_ARCHITECTURE__OWNED_EPBS_CONTEXT:
				return getOwnedEPBSContext();
			case EpbsPackage.EPBS_ARCHITECTURE__OWNED_CONFIGURATION_ITEM:
				return getOwnedConfigurationItem();
			case EpbsPackage.EPBS_ARCHITECTURE__OWNED_CONFIGURATION_ITEM_PKG:
				return getOwnedConfigurationItemPkg();
			case EpbsPackage.EPBS_ARCHITECTURE__CONTAINED_CAPABILITY_REALIZATION_PKG:
				return getContainedCapabilityRealizationPkg();
			case EpbsPackage.EPBS_ARCHITECTURE__ALLOCATED_PHYSICAL_ARCHITECTURES:
				return getAllocatedPhysicalArchitectures();
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
			case EpbsPackage.EPBS_ARCHITECTURE__OWNED_EPBS_CONTEXT:
				setOwnedEPBSContext((EPBSContext)newValue);
				return;
			case EpbsPackage.EPBS_ARCHITECTURE__OWNED_CONFIGURATION_ITEM:
				setOwnedConfigurationItem((ConfigurationItem)newValue);
				return;
			case EpbsPackage.EPBS_ARCHITECTURE__OWNED_CONFIGURATION_ITEM_PKG:
				setOwnedConfigurationItemPkg((ConfigurationItemPkg)newValue);
				return;
			case EpbsPackage.EPBS_ARCHITECTURE__CONTAINED_CAPABILITY_REALIZATION_PKG:
				setContainedCapabilityRealizationPkg((CapabilityRealizationPkg)newValue);
				return;
			case EpbsPackage.EPBS_ARCHITECTURE__ALLOCATED_PHYSICAL_ARCHITECTURES:
				getAllocatedPhysicalArchitectures().clear();
				getAllocatedPhysicalArchitectures().addAll((Collection<? extends PhysicalArchitecture>)newValue);
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
			case EpbsPackage.EPBS_ARCHITECTURE__OWNED_EPBS_CONTEXT:
				setOwnedEPBSContext((EPBSContext)null);
				return;
			case EpbsPackage.EPBS_ARCHITECTURE__OWNED_CONFIGURATION_ITEM:
				setOwnedConfigurationItem((ConfigurationItem)null);
				return;
			case EpbsPackage.EPBS_ARCHITECTURE__OWNED_CONFIGURATION_ITEM_PKG:
				setOwnedConfigurationItemPkg((ConfigurationItemPkg)null);
				return;
			case EpbsPackage.EPBS_ARCHITECTURE__CONTAINED_CAPABILITY_REALIZATION_PKG:
				setContainedCapabilityRealizationPkg((CapabilityRealizationPkg)null);
				return;
			case EpbsPackage.EPBS_ARCHITECTURE__ALLOCATED_PHYSICAL_ARCHITECTURES:
				getAllocatedPhysicalArchitectures().clear();
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
			case EpbsPackage.EPBS_ARCHITECTURE__OWNED_EPBS_CONTEXT:
				return ownedEPBSContext != null;
			case EpbsPackage.EPBS_ARCHITECTURE__OWNED_CONFIGURATION_ITEM:
				return ownedConfigurationItem != null;
			case EpbsPackage.EPBS_ARCHITECTURE__OWNED_CONFIGURATION_ITEM_PKG:
				return ownedConfigurationItemPkg != null;
			case EpbsPackage.EPBS_ARCHITECTURE__CONTAINED_CAPABILITY_REALIZATION_PKG:
				return containedCapabilityRealizationPkg != null;
			case EpbsPackage.EPBS_ARCHITECTURE__ALLOCATED_PHYSICAL_ARCHITECTURES:
				return allocatedPhysicalArchitectures != null && !allocatedPhysicalArchitectures.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EPBSArchitectureImpl
