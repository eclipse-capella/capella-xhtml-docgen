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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.capella.core.semantic.data.cs.AbstractDeploymentLink;

import org.polarsys.capella.core.semantic.data.cs.impl.SystemComponentImpl;

import org.polarsys.capella.core.semantic.data.pa.AbstractPhysicalComponent;
import org.polarsys.capella.core.semantic.data.pa.PaPackage;
import org.polarsys.capella.core.semantic.data.pa.PhysicalComponentKind;
import org.polarsys.capella.core.semantic.data.pa.PhysicalComponentNature;

import org.polarsys.capella.core.semantic.data.pa.deployment.DeploymentAspect;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Physical Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.pa.impl.AbstractPhysicalComponentImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.pa.impl.AbstractPhysicalComponentImpl#getNature <em>Nature</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.pa.impl.AbstractPhysicalComponentImpl#getOwnedDeploymentLinks <em>Owned Deployment Links</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.pa.impl.AbstractPhysicalComponentImpl#getOwnedDeploymentAspect <em>Owned Deployment Aspect</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractPhysicalComponentImpl extends SystemComponentImpl implements AbstractPhysicalComponent {
	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final PhysicalComponentKind KIND_EDEFAULT = PhysicalComponentKind.UNSET;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected PhysicalComponentKind kind = KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getNature() <em>Nature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNature()
	 * @generated
	 * @ordered
	 */
	protected static final PhysicalComponentNature NATURE_EDEFAULT = PhysicalComponentNature.UNSET;

	/**
	 * The cached value of the '{@link #getNature() <em>Nature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNature()
	 * @generated
	 * @ordered
	 */
	protected PhysicalComponentNature nature = NATURE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedDeploymentLinks() <em>Owned Deployment Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedDeploymentLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractDeploymentLink> ownedDeploymentLinks;

	/**
	 * The cached value of the '{@link #getOwnedDeploymentAspect() <em>Owned Deployment Aspect</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedDeploymentAspect()
	 * @generated
	 * @ordered
	 */
	protected DeploymentAspect ownedDeploymentAspect;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractPhysicalComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaPackage.Literals.ABSTRACT_PHYSICAL_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalComponentKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(PhysicalComponentKind newKind) {
		PhysicalComponentKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaPackage.ABSTRACT_PHYSICAL_COMPONENT__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalComponentNature getNature() {
		return nature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNature(PhysicalComponentNature newNature) {
		PhysicalComponentNature oldNature = nature;
		nature = newNature == null ? NATURE_EDEFAULT : newNature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaPackage.ABSTRACT_PHYSICAL_COMPONENT__NATURE, oldNature, nature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractDeploymentLink> getOwnedDeploymentLinks() {
		if (ownedDeploymentLinks == null) {
			ownedDeploymentLinks = new EObjectContainmentEList<AbstractDeploymentLink>(AbstractDeploymentLink.class, this, PaPackage.ABSTRACT_PHYSICAL_COMPONENT__OWNED_DEPLOYMENT_LINKS);
		}
		return ownedDeploymentLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentAspect getOwnedDeploymentAspect() {
		return ownedDeploymentAspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedDeploymentAspect(DeploymentAspect newOwnedDeploymentAspect, NotificationChain msgs) {
		DeploymentAspect oldOwnedDeploymentAspect = ownedDeploymentAspect;
		ownedDeploymentAspect = newOwnedDeploymentAspect;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PaPackage.ABSTRACT_PHYSICAL_COMPONENT__OWNED_DEPLOYMENT_ASPECT, oldOwnedDeploymentAspect, newOwnedDeploymentAspect);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedDeploymentAspect(DeploymentAspect newOwnedDeploymentAspect) {
		if (newOwnedDeploymentAspect != ownedDeploymentAspect) {
			NotificationChain msgs = null;
			if (ownedDeploymentAspect != null)
				msgs = ((InternalEObject)ownedDeploymentAspect).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PaPackage.ABSTRACT_PHYSICAL_COMPONENT__OWNED_DEPLOYMENT_ASPECT, null, msgs);
			if (newOwnedDeploymentAspect != null)
				msgs = ((InternalEObject)newOwnedDeploymentAspect).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PaPackage.ABSTRACT_PHYSICAL_COMPONENT__OWNED_DEPLOYMENT_ASPECT, null, msgs);
			msgs = basicSetOwnedDeploymentAspect(newOwnedDeploymentAspect, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaPackage.ABSTRACT_PHYSICAL_COMPONENT__OWNED_DEPLOYMENT_ASPECT, newOwnedDeploymentAspect, newOwnedDeploymentAspect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PaPackage.ABSTRACT_PHYSICAL_COMPONENT__OWNED_DEPLOYMENT_LINKS:
				return ((InternalEList<?>)getOwnedDeploymentLinks()).basicRemove(otherEnd, msgs);
			case PaPackage.ABSTRACT_PHYSICAL_COMPONENT__OWNED_DEPLOYMENT_ASPECT:
				return basicSetOwnedDeploymentAspect(null, msgs);
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
			case PaPackage.ABSTRACT_PHYSICAL_COMPONENT__KIND:
				return getKind();
			case PaPackage.ABSTRACT_PHYSICAL_COMPONENT__NATURE:
				return getNature();
			case PaPackage.ABSTRACT_PHYSICAL_COMPONENT__OWNED_DEPLOYMENT_LINKS:
				return getOwnedDeploymentLinks();
			case PaPackage.ABSTRACT_PHYSICAL_COMPONENT__OWNED_DEPLOYMENT_ASPECT:
				return getOwnedDeploymentAspect();
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
			case PaPackage.ABSTRACT_PHYSICAL_COMPONENT__KIND:
				setKind((PhysicalComponentKind)newValue);
				return;
			case PaPackage.ABSTRACT_PHYSICAL_COMPONENT__NATURE:
				setNature((PhysicalComponentNature)newValue);
				return;
			case PaPackage.ABSTRACT_PHYSICAL_COMPONENT__OWNED_DEPLOYMENT_LINKS:
				getOwnedDeploymentLinks().clear();
				getOwnedDeploymentLinks().addAll((Collection<? extends AbstractDeploymentLink>)newValue);
				return;
			case PaPackage.ABSTRACT_PHYSICAL_COMPONENT__OWNED_DEPLOYMENT_ASPECT:
				setOwnedDeploymentAspect((DeploymentAspect)newValue);
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
			case PaPackage.ABSTRACT_PHYSICAL_COMPONENT__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case PaPackage.ABSTRACT_PHYSICAL_COMPONENT__NATURE:
				setNature(NATURE_EDEFAULT);
				return;
			case PaPackage.ABSTRACT_PHYSICAL_COMPONENT__OWNED_DEPLOYMENT_LINKS:
				getOwnedDeploymentLinks().clear();
				return;
			case PaPackage.ABSTRACT_PHYSICAL_COMPONENT__OWNED_DEPLOYMENT_ASPECT:
				setOwnedDeploymentAspect((DeploymentAspect)null);
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
			case PaPackage.ABSTRACT_PHYSICAL_COMPONENT__KIND:
				return kind != KIND_EDEFAULT;
			case PaPackage.ABSTRACT_PHYSICAL_COMPONENT__NATURE:
				return nature != NATURE_EDEFAULT;
			case PaPackage.ABSTRACT_PHYSICAL_COMPONENT__OWNED_DEPLOYMENT_LINKS:
				return ownedDeploymentLinks != null && !ownedDeploymentLinks.isEmpty();
			case PaPackage.ABSTRACT_PHYSICAL_COMPONENT__OWNED_DEPLOYMENT_ASPECT:
				return ownedDeploymentAspect != null;
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
		result.append(" (kind: ");
		result.append(kind);
		result.append(", nature: ");
		result.append(nature);
		result.append(')');
		return result.toString();
	}

} //AbstractPhysicalComponentImpl
