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

import org.polarsys.capella.core.semantic.data.capellacore.InvolvedElement;
import org.polarsys.capella.core.semantic.data.capellacore.NamedElement;

import org.polarsys.capella.core.semantic.data.cs.AbstractPathInvolvedElement;
import org.polarsys.capella.core.semantic.data.cs.AbstractPhysicalLinkEnd;
import org.polarsys.capella.core.semantic.data.cs.CsPackage;
import org.polarsys.capella.core.semantic.data.cs.PhysicalLink;
import org.polarsys.capella.core.semantic.data.cs.PhysicalLinkCategory;
import org.polarsys.capella.core.semantic.data.cs.PhysicalLinkEnd;
import org.polarsys.capella.core.semantic.data.cs.PhysicalPort;

import org.polarsys.capella.core.semantic.data.fa.ComponentExchange;
import org.polarsys.capella.core.semantic.data.fa.ComponentExchangeAllocator;
import org.polarsys.capella.core.semantic.data.fa.FaPackage;

import org.polarsys.capella.core.semantic.data.modellingcore.AbstractNamedElement;
import org.polarsys.capella.core.semantic.data.modellingcore.ModellingcorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Physical Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.impl.PhysicalLinkImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.impl.PhysicalLinkImpl#getAllocatedComponentExchanges <em>Allocated Component Exchanges</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.impl.PhysicalLinkImpl#getLinkEnds <em>Link Ends</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.impl.PhysicalLinkImpl#getOwnedPhysicalLinkEnds <em>Owned Physical Link Ends</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.impl.PhysicalLinkImpl#getCategories <em>Categories</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.impl.PhysicalLinkImpl#getSourcePhysicalPort <em>Source Physical Port</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.impl.PhysicalLinkImpl#getTargetPhysicalPort <em>Target Physical Port</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.impl.PhysicalLinkImpl#getRealizedPhysicalLinks <em>Realized Physical Links</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PhysicalLinkImpl extends AbstractPhysicalArtifactImpl implements PhysicalLink {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAllocatedComponentExchanges() <em>Allocated Component Exchanges</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatedComponentExchanges()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentExchange> allocatedComponentExchanges;

	/**
	 * The cached value of the '{@link #getLinkEnds() <em>Link Ends</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkEnds()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractPhysicalLinkEnd> linkEnds;

	/**
	 * The cached value of the '{@link #getOwnedPhysicalLinkEnds() <em>Owned Physical Link Ends</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPhysicalLinkEnds()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalLinkEnd> ownedPhysicalLinkEnds;

	/**
	 * The cached value of the '{@link #getCategories() <em>Categories</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategories()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalLinkCategory> categories;

	/**
	 * The cached value of the '{@link #getSourcePhysicalPort() <em>Source Physical Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourcePhysicalPort()
	 * @generated
	 * @ordered
	 */
	protected PhysicalPort sourcePhysicalPort;

	/**
	 * The cached value of the '{@link #getTargetPhysicalPort() <em>Target Physical Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetPhysicalPort()
	 * @generated
	 * @ordered
	 */
	protected PhysicalPort targetPhysicalPort;

	/**
	 * The cached value of the '{@link #getRealizedPhysicalLinks() <em>Realized Physical Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizedPhysicalLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalLink> realizedPhysicalLinks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicalLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CsPackage.Literals.PHYSICAL_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.PHYSICAL_LINK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentExchange> getAllocatedComponentExchanges() {
		if (allocatedComponentExchanges == null) {
			allocatedComponentExchanges = new EObjectResolvingEList<ComponentExchange>(ComponentExchange.class, this, CsPackage.PHYSICAL_LINK__ALLOCATED_COMPONENT_EXCHANGES);
		}
		return allocatedComponentExchanges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractPhysicalLinkEnd> getLinkEnds() {
		if (linkEnds == null) {
			linkEnds = new EObjectResolvingEList<AbstractPhysicalLinkEnd>(AbstractPhysicalLinkEnd.class, this, CsPackage.PHYSICAL_LINK__LINK_ENDS);
		}
		return linkEnds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PhysicalLinkEnd> getOwnedPhysicalLinkEnds() {
		if (ownedPhysicalLinkEnds == null) {
			ownedPhysicalLinkEnds = new EObjectContainmentEList<PhysicalLinkEnd>(PhysicalLinkEnd.class, this, CsPackage.PHYSICAL_LINK__OWNED_PHYSICAL_LINK_ENDS);
		}
		return ownedPhysicalLinkEnds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PhysicalLinkCategory> getCategories() {
		if (categories == null) {
			categories = new EObjectResolvingEList<PhysicalLinkCategory>(PhysicalLinkCategory.class, this, CsPackage.PHYSICAL_LINK__CATEGORIES);
		}
		return categories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalPort getSourcePhysicalPort() {
		if (sourcePhysicalPort != null && sourcePhysicalPort.eIsProxy()) {
			InternalEObject oldSourcePhysicalPort = (InternalEObject)sourcePhysicalPort;
			sourcePhysicalPort = (PhysicalPort)eResolveProxy(oldSourcePhysicalPort);
			if (sourcePhysicalPort != oldSourcePhysicalPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CsPackage.PHYSICAL_LINK__SOURCE_PHYSICAL_PORT, oldSourcePhysicalPort, sourcePhysicalPort));
			}
		}
		return sourcePhysicalPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalPort basicGetSourcePhysicalPort() {
		return sourcePhysicalPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourcePhysicalPort(PhysicalPort newSourcePhysicalPort) {
		PhysicalPort oldSourcePhysicalPort = sourcePhysicalPort;
		sourcePhysicalPort = newSourcePhysicalPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.PHYSICAL_LINK__SOURCE_PHYSICAL_PORT, oldSourcePhysicalPort, sourcePhysicalPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalPort getTargetPhysicalPort() {
		if (targetPhysicalPort != null && targetPhysicalPort.eIsProxy()) {
			InternalEObject oldTargetPhysicalPort = (InternalEObject)targetPhysicalPort;
			targetPhysicalPort = (PhysicalPort)eResolveProxy(oldTargetPhysicalPort);
			if (targetPhysicalPort != oldTargetPhysicalPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CsPackage.PHYSICAL_LINK__TARGET_PHYSICAL_PORT, oldTargetPhysicalPort, targetPhysicalPort));
			}
		}
		return targetPhysicalPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalPort basicGetTargetPhysicalPort() {
		return targetPhysicalPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetPhysicalPort(PhysicalPort newTargetPhysicalPort) {
		PhysicalPort oldTargetPhysicalPort = targetPhysicalPort;
		targetPhysicalPort = newTargetPhysicalPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.PHYSICAL_LINK__TARGET_PHYSICAL_PORT, oldTargetPhysicalPort, targetPhysicalPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PhysicalLink> getRealizedPhysicalLinks() {
		if (realizedPhysicalLinks == null) {
			realizedPhysicalLinks = new EObjectResolvingEList<PhysicalLink>(PhysicalLink.class, this, CsPackage.PHYSICAL_LINK__REALIZED_PHYSICAL_LINKS);
		}
		return realizedPhysicalLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CsPackage.PHYSICAL_LINK__OWNED_PHYSICAL_LINK_ENDS:
				return ((InternalEList<?>)getOwnedPhysicalLinkEnds()).basicRemove(otherEnd, msgs);
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
			case CsPackage.PHYSICAL_LINK__NAME:
				return getName();
			case CsPackage.PHYSICAL_LINK__ALLOCATED_COMPONENT_EXCHANGES:
				return getAllocatedComponentExchanges();
			case CsPackage.PHYSICAL_LINK__LINK_ENDS:
				return getLinkEnds();
			case CsPackage.PHYSICAL_LINK__OWNED_PHYSICAL_LINK_ENDS:
				return getOwnedPhysicalLinkEnds();
			case CsPackage.PHYSICAL_LINK__CATEGORIES:
				return getCategories();
			case CsPackage.PHYSICAL_LINK__SOURCE_PHYSICAL_PORT:
				if (resolve) return getSourcePhysicalPort();
				return basicGetSourcePhysicalPort();
			case CsPackage.PHYSICAL_LINK__TARGET_PHYSICAL_PORT:
				if (resolve) return getTargetPhysicalPort();
				return basicGetTargetPhysicalPort();
			case CsPackage.PHYSICAL_LINK__REALIZED_PHYSICAL_LINKS:
				return getRealizedPhysicalLinks();
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
			case CsPackage.PHYSICAL_LINK__NAME:
				setName((String)newValue);
				return;
			case CsPackage.PHYSICAL_LINK__ALLOCATED_COMPONENT_EXCHANGES:
				getAllocatedComponentExchanges().clear();
				getAllocatedComponentExchanges().addAll((Collection<? extends ComponentExchange>)newValue);
				return;
			case CsPackage.PHYSICAL_LINK__LINK_ENDS:
				getLinkEnds().clear();
				getLinkEnds().addAll((Collection<? extends AbstractPhysicalLinkEnd>)newValue);
				return;
			case CsPackage.PHYSICAL_LINK__OWNED_PHYSICAL_LINK_ENDS:
				getOwnedPhysicalLinkEnds().clear();
				getOwnedPhysicalLinkEnds().addAll((Collection<? extends PhysicalLinkEnd>)newValue);
				return;
			case CsPackage.PHYSICAL_LINK__CATEGORIES:
				getCategories().clear();
				getCategories().addAll((Collection<? extends PhysicalLinkCategory>)newValue);
				return;
			case CsPackage.PHYSICAL_LINK__SOURCE_PHYSICAL_PORT:
				setSourcePhysicalPort((PhysicalPort)newValue);
				return;
			case CsPackage.PHYSICAL_LINK__TARGET_PHYSICAL_PORT:
				setTargetPhysicalPort((PhysicalPort)newValue);
				return;
			case CsPackage.PHYSICAL_LINK__REALIZED_PHYSICAL_LINKS:
				getRealizedPhysicalLinks().clear();
				getRealizedPhysicalLinks().addAll((Collection<? extends PhysicalLink>)newValue);
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
			case CsPackage.PHYSICAL_LINK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CsPackage.PHYSICAL_LINK__ALLOCATED_COMPONENT_EXCHANGES:
				getAllocatedComponentExchanges().clear();
				return;
			case CsPackage.PHYSICAL_LINK__LINK_ENDS:
				getLinkEnds().clear();
				return;
			case CsPackage.PHYSICAL_LINK__OWNED_PHYSICAL_LINK_ENDS:
				getOwnedPhysicalLinkEnds().clear();
				return;
			case CsPackage.PHYSICAL_LINK__CATEGORIES:
				getCategories().clear();
				return;
			case CsPackage.PHYSICAL_LINK__SOURCE_PHYSICAL_PORT:
				setSourcePhysicalPort((PhysicalPort)null);
				return;
			case CsPackage.PHYSICAL_LINK__TARGET_PHYSICAL_PORT:
				setTargetPhysicalPort((PhysicalPort)null);
				return;
			case CsPackage.PHYSICAL_LINK__REALIZED_PHYSICAL_LINKS:
				getRealizedPhysicalLinks().clear();
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
			case CsPackage.PHYSICAL_LINK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CsPackage.PHYSICAL_LINK__ALLOCATED_COMPONENT_EXCHANGES:
				return allocatedComponentExchanges != null && !allocatedComponentExchanges.isEmpty();
			case CsPackage.PHYSICAL_LINK__LINK_ENDS:
				return linkEnds != null && !linkEnds.isEmpty();
			case CsPackage.PHYSICAL_LINK__OWNED_PHYSICAL_LINK_ENDS:
				return ownedPhysicalLinkEnds != null && !ownedPhysicalLinkEnds.isEmpty();
			case CsPackage.PHYSICAL_LINK__CATEGORIES:
				return categories != null && !categories.isEmpty();
			case CsPackage.PHYSICAL_LINK__SOURCE_PHYSICAL_PORT:
				return sourcePhysicalPort != null;
			case CsPackage.PHYSICAL_LINK__TARGET_PHYSICAL_PORT:
				return targetPhysicalPort != null;
			case CsPackage.PHYSICAL_LINK__REALIZED_PHYSICAL_LINKS:
				return realizedPhysicalLinks != null && !realizedPhysicalLinks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == InvolvedElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == AbstractPathInvolvedElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == AbstractNamedElement.class) {
			switch (derivedFeatureID) {
				case CsPackage.PHYSICAL_LINK__NAME: return ModellingcorePackage.ABSTRACT_NAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ComponentExchangeAllocator.class) {
			switch (derivedFeatureID) {
				case CsPackage.PHYSICAL_LINK__ALLOCATED_COMPONENT_EXCHANGES: return FaPackage.COMPONENT_EXCHANGE_ALLOCATOR__ALLOCATED_COMPONENT_EXCHANGES;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == InvolvedElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == AbstractPathInvolvedElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == AbstractNamedElement.class) {
			switch (baseFeatureID) {
				case ModellingcorePackage.ABSTRACT_NAMED_ELEMENT__NAME: return CsPackage.PHYSICAL_LINK__NAME;
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ComponentExchangeAllocator.class) {
			switch (baseFeatureID) {
				case FaPackage.COMPONENT_EXCHANGE_ALLOCATOR__ALLOCATED_COMPONENT_EXCHANGES: return CsPackage.PHYSICAL_LINK__ALLOCATED_COMPONENT_EXCHANGES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //PhysicalLinkImpl
