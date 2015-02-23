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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.polarsys.capella.core.semantic.data.cs.impl.BlockArchitectureImpl;

import org.polarsys.capella.core.semantic.data.oa.EntityPkg;
import org.polarsys.capella.core.semantic.data.oa.OaPackage;
import org.polarsys.capella.core.semantic.data.oa.OperationalActivityPkg;
import org.polarsys.capella.core.semantic.data.oa.OperationalAnalysis;
import org.polarsys.capella.core.semantic.data.oa.OperationalCapabilityPkg;
import org.polarsys.capella.core.semantic.data.oa.OperationalContext;
import org.polarsys.capella.core.semantic.data.oa.RolePkg;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operational Analysis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.oa.impl.OperationalAnalysisImpl#getOwnedOperationalContext <em>Owned Operational Context</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.oa.impl.OperationalAnalysisImpl#getOwnedRolePkg <em>Owned Role Pkg</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.oa.impl.OperationalAnalysisImpl#getOwnedEntityPkg <em>Owned Entity Pkg</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.oa.impl.OperationalAnalysisImpl#getContainedOperationalCapabilityPkg <em>Contained Operational Capability Pkg</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.oa.impl.OperationalAnalysisImpl#getContainedOperationalActivityPkg <em>Contained Operational Activity Pkg</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperationalAnalysisImpl extends BlockArchitectureImpl implements OperationalAnalysis {
	/**
	 * The cached value of the '{@link #getOwnedOperationalContext() <em>Owned Operational Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedOperationalContext()
	 * @generated
	 * @ordered
	 */
	protected OperationalContext ownedOperationalContext;

	/**
	 * The cached value of the '{@link #getOwnedRolePkg() <em>Owned Role Pkg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedRolePkg()
	 * @generated
	 * @ordered
	 */
	protected RolePkg ownedRolePkg;

	/**
	 * The cached value of the '{@link #getOwnedEntityPkg() <em>Owned Entity Pkg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedEntityPkg()
	 * @generated
	 * @ordered
	 */
	protected EntityPkg ownedEntityPkg;

	/**
	 * The cached value of the '{@link #getContainedOperationalCapabilityPkg() <em>Contained Operational Capability Pkg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedOperationalCapabilityPkg()
	 * @generated
	 * @ordered
	 */
	protected OperationalCapabilityPkg containedOperationalCapabilityPkg;

	/**
	 * The cached value of the '{@link #getContainedOperationalActivityPkg() <em>Contained Operational Activity Pkg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedOperationalActivityPkg()
	 * @generated
	 * @ordered
	 */
	protected OperationalActivityPkg containedOperationalActivityPkg;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationalAnalysisImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OaPackage.Literals.OPERATIONAL_ANALYSIS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalContext getOwnedOperationalContext() {
		return ownedOperationalContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedOperationalContext(OperationalContext newOwnedOperationalContext, NotificationChain msgs) {
		OperationalContext oldOwnedOperationalContext = ownedOperationalContext;
		ownedOperationalContext = newOwnedOperationalContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OaPackage.OPERATIONAL_ANALYSIS__OWNED_OPERATIONAL_CONTEXT, oldOwnedOperationalContext, newOwnedOperationalContext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedOperationalContext(OperationalContext newOwnedOperationalContext) {
		if (newOwnedOperationalContext != ownedOperationalContext) {
			NotificationChain msgs = null;
			if (ownedOperationalContext != null)
				msgs = ((InternalEObject)ownedOperationalContext).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OaPackage.OPERATIONAL_ANALYSIS__OWNED_OPERATIONAL_CONTEXT, null, msgs);
			if (newOwnedOperationalContext != null)
				msgs = ((InternalEObject)newOwnedOperationalContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OaPackage.OPERATIONAL_ANALYSIS__OWNED_OPERATIONAL_CONTEXT, null, msgs);
			msgs = basicSetOwnedOperationalContext(newOwnedOperationalContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OaPackage.OPERATIONAL_ANALYSIS__OWNED_OPERATIONAL_CONTEXT, newOwnedOperationalContext, newOwnedOperationalContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RolePkg getOwnedRolePkg() {
		return ownedRolePkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedRolePkg(RolePkg newOwnedRolePkg, NotificationChain msgs) {
		RolePkg oldOwnedRolePkg = ownedRolePkg;
		ownedRolePkg = newOwnedRolePkg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OaPackage.OPERATIONAL_ANALYSIS__OWNED_ROLE_PKG, oldOwnedRolePkg, newOwnedRolePkg);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedRolePkg(RolePkg newOwnedRolePkg) {
		if (newOwnedRolePkg != ownedRolePkg) {
			NotificationChain msgs = null;
			if (ownedRolePkg != null)
				msgs = ((InternalEObject)ownedRolePkg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OaPackage.OPERATIONAL_ANALYSIS__OWNED_ROLE_PKG, null, msgs);
			if (newOwnedRolePkg != null)
				msgs = ((InternalEObject)newOwnedRolePkg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OaPackage.OPERATIONAL_ANALYSIS__OWNED_ROLE_PKG, null, msgs);
			msgs = basicSetOwnedRolePkg(newOwnedRolePkg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OaPackage.OPERATIONAL_ANALYSIS__OWNED_ROLE_PKG, newOwnedRolePkg, newOwnedRolePkg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityPkg getOwnedEntityPkg() {
		return ownedEntityPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedEntityPkg(EntityPkg newOwnedEntityPkg, NotificationChain msgs) {
		EntityPkg oldOwnedEntityPkg = ownedEntityPkg;
		ownedEntityPkg = newOwnedEntityPkg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OaPackage.OPERATIONAL_ANALYSIS__OWNED_ENTITY_PKG, oldOwnedEntityPkg, newOwnedEntityPkg);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedEntityPkg(EntityPkg newOwnedEntityPkg) {
		if (newOwnedEntityPkg != ownedEntityPkg) {
			NotificationChain msgs = null;
			if (ownedEntityPkg != null)
				msgs = ((InternalEObject)ownedEntityPkg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OaPackage.OPERATIONAL_ANALYSIS__OWNED_ENTITY_PKG, null, msgs);
			if (newOwnedEntityPkg != null)
				msgs = ((InternalEObject)newOwnedEntityPkg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OaPackage.OPERATIONAL_ANALYSIS__OWNED_ENTITY_PKG, null, msgs);
			msgs = basicSetOwnedEntityPkg(newOwnedEntityPkg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OaPackage.OPERATIONAL_ANALYSIS__OWNED_ENTITY_PKG, newOwnedEntityPkg, newOwnedEntityPkg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalCapabilityPkg getContainedOperationalCapabilityPkg() {
		return containedOperationalCapabilityPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainedOperationalCapabilityPkg(OperationalCapabilityPkg newContainedOperationalCapabilityPkg, NotificationChain msgs) {
		OperationalCapabilityPkg oldContainedOperationalCapabilityPkg = containedOperationalCapabilityPkg;
		containedOperationalCapabilityPkg = newContainedOperationalCapabilityPkg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OaPackage.OPERATIONAL_ANALYSIS__CONTAINED_OPERATIONAL_CAPABILITY_PKG, oldContainedOperationalCapabilityPkg, newContainedOperationalCapabilityPkg);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainedOperationalCapabilityPkg(OperationalCapabilityPkg newContainedOperationalCapabilityPkg) {
		if (newContainedOperationalCapabilityPkg != containedOperationalCapabilityPkg) {
			NotificationChain msgs = null;
			if (containedOperationalCapabilityPkg != null)
				msgs = ((InternalEObject)containedOperationalCapabilityPkg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OaPackage.OPERATIONAL_ANALYSIS__CONTAINED_OPERATIONAL_CAPABILITY_PKG, null, msgs);
			if (newContainedOperationalCapabilityPkg != null)
				msgs = ((InternalEObject)newContainedOperationalCapabilityPkg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OaPackage.OPERATIONAL_ANALYSIS__CONTAINED_OPERATIONAL_CAPABILITY_PKG, null, msgs);
			msgs = basicSetContainedOperationalCapabilityPkg(newContainedOperationalCapabilityPkg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OaPackage.OPERATIONAL_ANALYSIS__CONTAINED_OPERATIONAL_CAPABILITY_PKG, newContainedOperationalCapabilityPkg, newContainedOperationalCapabilityPkg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalActivityPkg getContainedOperationalActivityPkg() {
		return containedOperationalActivityPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainedOperationalActivityPkg(OperationalActivityPkg newContainedOperationalActivityPkg, NotificationChain msgs) {
		OperationalActivityPkg oldContainedOperationalActivityPkg = containedOperationalActivityPkg;
		containedOperationalActivityPkg = newContainedOperationalActivityPkg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OaPackage.OPERATIONAL_ANALYSIS__CONTAINED_OPERATIONAL_ACTIVITY_PKG, oldContainedOperationalActivityPkg, newContainedOperationalActivityPkg);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainedOperationalActivityPkg(OperationalActivityPkg newContainedOperationalActivityPkg) {
		if (newContainedOperationalActivityPkg != containedOperationalActivityPkg) {
			NotificationChain msgs = null;
			if (containedOperationalActivityPkg != null)
				msgs = ((InternalEObject)containedOperationalActivityPkg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OaPackage.OPERATIONAL_ANALYSIS__CONTAINED_OPERATIONAL_ACTIVITY_PKG, null, msgs);
			if (newContainedOperationalActivityPkg != null)
				msgs = ((InternalEObject)newContainedOperationalActivityPkg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OaPackage.OPERATIONAL_ANALYSIS__CONTAINED_OPERATIONAL_ACTIVITY_PKG, null, msgs);
			msgs = basicSetContainedOperationalActivityPkg(newContainedOperationalActivityPkg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OaPackage.OPERATIONAL_ANALYSIS__CONTAINED_OPERATIONAL_ACTIVITY_PKG, newContainedOperationalActivityPkg, newContainedOperationalActivityPkg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OaPackage.OPERATIONAL_ANALYSIS__OWNED_OPERATIONAL_CONTEXT:
				return basicSetOwnedOperationalContext(null, msgs);
			case OaPackage.OPERATIONAL_ANALYSIS__OWNED_ROLE_PKG:
				return basicSetOwnedRolePkg(null, msgs);
			case OaPackage.OPERATIONAL_ANALYSIS__OWNED_ENTITY_PKG:
				return basicSetOwnedEntityPkg(null, msgs);
			case OaPackage.OPERATIONAL_ANALYSIS__CONTAINED_OPERATIONAL_CAPABILITY_PKG:
				return basicSetContainedOperationalCapabilityPkg(null, msgs);
			case OaPackage.OPERATIONAL_ANALYSIS__CONTAINED_OPERATIONAL_ACTIVITY_PKG:
				return basicSetContainedOperationalActivityPkg(null, msgs);
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
			case OaPackage.OPERATIONAL_ANALYSIS__OWNED_OPERATIONAL_CONTEXT:
				return getOwnedOperationalContext();
			case OaPackage.OPERATIONAL_ANALYSIS__OWNED_ROLE_PKG:
				return getOwnedRolePkg();
			case OaPackage.OPERATIONAL_ANALYSIS__OWNED_ENTITY_PKG:
				return getOwnedEntityPkg();
			case OaPackage.OPERATIONAL_ANALYSIS__CONTAINED_OPERATIONAL_CAPABILITY_PKG:
				return getContainedOperationalCapabilityPkg();
			case OaPackage.OPERATIONAL_ANALYSIS__CONTAINED_OPERATIONAL_ACTIVITY_PKG:
				return getContainedOperationalActivityPkg();
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
			case OaPackage.OPERATIONAL_ANALYSIS__OWNED_OPERATIONAL_CONTEXT:
				setOwnedOperationalContext((OperationalContext)newValue);
				return;
			case OaPackage.OPERATIONAL_ANALYSIS__OWNED_ROLE_PKG:
				setOwnedRolePkg((RolePkg)newValue);
				return;
			case OaPackage.OPERATIONAL_ANALYSIS__OWNED_ENTITY_PKG:
				setOwnedEntityPkg((EntityPkg)newValue);
				return;
			case OaPackage.OPERATIONAL_ANALYSIS__CONTAINED_OPERATIONAL_CAPABILITY_PKG:
				setContainedOperationalCapabilityPkg((OperationalCapabilityPkg)newValue);
				return;
			case OaPackage.OPERATIONAL_ANALYSIS__CONTAINED_OPERATIONAL_ACTIVITY_PKG:
				setContainedOperationalActivityPkg((OperationalActivityPkg)newValue);
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
			case OaPackage.OPERATIONAL_ANALYSIS__OWNED_OPERATIONAL_CONTEXT:
				setOwnedOperationalContext((OperationalContext)null);
				return;
			case OaPackage.OPERATIONAL_ANALYSIS__OWNED_ROLE_PKG:
				setOwnedRolePkg((RolePkg)null);
				return;
			case OaPackage.OPERATIONAL_ANALYSIS__OWNED_ENTITY_PKG:
				setOwnedEntityPkg((EntityPkg)null);
				return;
			case OaPackage.OPERATIONAL_ANALYSIS__CONTAINED_OPERATIONAL_CAPABILITY_PKG:
				setContainedOperationalCapabilityPkg((OperationalCapabilityPkg)null);
				return;
			case OaPackage.OPERATIONAL_ANALYSIS__CONTAINED_OPERATIONAL_ACTIVITY_PKG:
				setContainedOperationalActivityPkg((OperationalActivityPkg)null);
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
			case OaPackage.OPERATIONAL_ANALYSIS__OWNED_OPERATIONAL_CONTEXT:
				return ownedOperationalContext != null;
			case OaPackage.OPERATIONAL_ANALYSIS__OWNED_ROLE_PKG:
				return ownedRolePkg != null;
			case OaPackage.OPERATIONAL_ANALYSIS__OWNED_ENTITY_PKG:
				return ownedEntityPkg != null;
			case OaPackage.OPERATIONAL_ANALYSIS__CONTAINED_OPERATIONAL_CAPABILITY_PKG:
				return containedOperationalCapabilityPkg != null;
			case OaPackage.OPERATIONAL_ANALYSIS__CONTAINED_OPERATIONAL_ACTIVITY_PKG:
				return containedOperationalActivityPkg != null;
		}
		return super.eIsSet(featureID);
	}

} //OperationalAnalysisImpl
