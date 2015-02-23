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

package org.polarsys.capella.core.semantic.data.ctx.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.polarsys.capella.core.semantic.data.cs.impl.BlockArchitectureImpl;

import org.polarsys.capella.core.semantic.data.ctx.ActorPkg;
import org.polarsys.capella.core.semantic.data.ctx.CapabilityPkg;
import org.polarsys.capella.core.semantic.data.ctx.CtxPackage;
import org.polarsys.capella.core.semantic.data.ctx.MissionPkg;
import org.polarsys.capella.core.semantic.data.ctx.SystemAnalysis;
import org.polarsys.capella.core.semantic.data.ctx.SystemContext;
import org.polarsys.capella.core.semantic.data.ctx.SystemFunctionPkg;

import org.polarsys.capella.core.semantic.data.oa.OperationalAnalysis;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Analysis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.ctx.impl.SystemAnalysisImpl#getOwnedSystemContext <em>Owned System Context</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.ctx.impl.SystemAnalysisImpl#getOwnedSystem <em>Owned System</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.ctx.impl.SystemAnalysisImpl#getOwnedActorPkg <em>Owned Actor Pkg</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.ctx.impl.SystemAnalysisImpl#getOwnedMissionPkg <em>Owned Mission Pkg</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.ctx.impl.SystemAnalysisImpl#getContainedCapabilityPkg <em>Contained Capability Pkg</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.ctx.impl.SystemAnalysisImpl#getContainedSystemFunctionPkg <em>Contained System Function Pkg</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.ctx.impl.SystemAnalysisImpl#getAllocatedOperationalAnalyses <em>Allocated Operational Analyses</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SystemAnalysisImpl extends BlockArchitectureImpl implements SystemAnalysis {
	/**
	 * The cached value of the '{@link #getOwnedSystemContext() <em>Owned System Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedSystemContext()
	 * @generated
	 * @ordered
	 */
	protected SystemContext ownedSystemContext;

	/**
	 * The cached value of the '{@link #getOwnedSystem() <em>Owned System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedSystem()
	 * @generated
	 * @ordered
	 */
	protected org.polarsys.capella.core.semantic.data.ctx.System ownedSystem;

	/**
	 * The cached value of the '{@link #getOwnedActorPkg() <em>Owned Actor Pkg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedActorPkg()
	 * @generated
	 * @ordered
	 */
	protected ActorPkg ownedActorPkg;

	/**
	 * The cached value of the '{@link #getOwnedMissionPkg() <em>Owned Mission Pkg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMissionPkg()
	 * @generated
	 * @ordered
	 */
	protected MissionPkg ownedMissionPkg;

	/**
	 * The cached value of the '{@link #getContainedCapabilityPkg() <em>Contained Capability Pkg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedCapabilityPkg()
	 * @generated
	 * @ordered
	 */
	protected CapabilityPkg containedCapabilityPkg;

	/**
	 * The cached value of the '{@link #getContainedSystemFunctionPkg() <em>Contained System Function Pkg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedSystemFunctionPkg()
	 * @generated
	 * @ordered
	 */
	protected SystemFunctionPkg containedSystemFunctionPkg;

	/**
	 * The cached value of the '{@link #getAllocatedOperationalAnalyses() <em>Allocated Operational Analyses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatedOperationalAnalyses()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationalAnalysis> allocatedOperationalAnalyses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemAnalysisImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CtxPackage.Literals.SYSTEM_ANALYSIS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemContext getOwnedSystemContext() {
		return ownedSystemContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedSystemContext(SystemContext newOwnedSystemContext, NotificationChain msgs) {
		SystemContext oldOwnedSystemContext = ownedSystemContext;
		ownedSystemContext = newOwnedSystemContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CtxPackage.SYSTEM_ANALYSIS__OWNED_SYSTEM_CONTEXT, oldOwnedSystemContext, newOwnedSystemContext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedSystemContext(SystemContext newOwnedSystemContext) {
		if (newOwnedSystemContext != ownedSystemContext) {
			NotificationChain msgs = null;
			if (ownedSystemContext != null)
				msgs = ((InternalEObject)ownedSystemContext).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CtxPackage.SYSTEM_ANALYSIS__OWNED_SYSTEM_CONTEXT, null, msgs);
			if (newOwnedSystemContext != null)
				msgs = ((InternalEObject)newOwnedSystemContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CtxPackage.SYSTEM_ANALYSIS__OWNED_SYSTEM_CONTEXT, null, msgs);
			msgs = basicSetOwnedSystemContext(newOwnedSystemContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CtxPackage.SYSTEM_ANALYSIS__OWNED_SYSTEM_CONTEXT, newOwnedSystemContext, newOwnedSystemContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.polarsys.capella.core.semantic.data.ctx.System getOwnedSystem() {
		return ownedSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedSystem(org.polarsys.capella.core.semantic.data.ctx.System newOwnedSystem, NotificationChain msgs) {
		org.polarsys.capella.core.semantic.data.ctx.System oldOwnedSystem = ownedSystem;
		ownedSystem = newOwnedSystem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CtxPackage.SYSTEM_ANALYSIS__OWNED_SYSTEM, oldOwnedSystem, newOwnedSystem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedSystem(org.polarsys.capella.core.semantic.data.ctx.System newOwnedSystem) {
		if (newOwnedSystem != ownedSystem) {
			NotificationChain msgs = null;
			if (ownedSystem != null)
				msgs = ((InternalEObject)ownedSystem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CtxPackage.SYSTEM_ANALYSIS__OWNED_SYSTEM, null, msgs);
			if (newOwnedSystem != null)
				msgs = ((InternalEObject)newOwnedSystem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CtxPackage.SYSTEM_ANALYSIS__OWNED_SYSTEM, null, msgs);
			msgs = basicSetOwnedSystem(newOwnedSystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CtxPackage.SYSTEM_ANALYSIS__OWNED_SYSTEM, newOwnedSystem, newOwnedSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActorPkg getOwnedActorPkg() {
		return ownedActorPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedActorPkg(ActorPkg newOwnedActorPkg, NotificationChain msgs) {
		ActorPkg oldOwnedActorPkg = ownedActorPkg;
		ownedActorPkg = newOwnedActorPkg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CtxPackage.SYSTEM_ANALYSIS__OWNED_ACTOR_PKG, oldOwnedActorPkg, newOwnedActorPkg);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedActorPkg(ActorPkg newOwnedActorPkg) {
		if (newOwnedActorPkg != ownedActorPkg) {
			NotificationChain msgs = null;
			if (ownedActorPkg != null)
				msgs = ((InternalEObject)ownedActorPkg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CtxPackage.SYSTEM_ANALYSIS__OWNED_ACTOR_PKG, null, msgs);
			if (newOwnedActorPkg != null)
				msgs = ((InternalEObject)newOwnedActorPkg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CtxPackage.SYSTEM_ANALYSIS__OWNED_ACTOR_PKG, null, msgs);
			msgs = basicSetOwnedActorPkg(newOwnedActorPkg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CtxPackage.SYSTEM_ANALYSIS__OWNED_ACTOR_PKG, newOwnedActorPkg, newOwnedActorPkg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MissionPkg getOwnedMissionPkg() {
		return ownedMissionPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedMissionPkg(MissionPkg newOwnedMissionPkg, NotificationChain msgs) {
		MissionPkg oldOwnedMissionPkg = ownedMissionPkg;
		ownedMissionPkg = newOwnedMissionPkg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CtxPackage.SYSTEM_ANALYSIS__OWNED_MISSION_PKG, oldOwnedMissionPkg, newOwnedMissionPkg);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedMissionPkg(MissionPkg newOwnedMissionPkg) {
		if (newOwnedMissionPkg != ownedMissionPkg) {
			NotificationChain msgs = null;
			if (ownedMissionPkg != null)
				msgs = ((InternalEObject)ownedMissionPkg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CtxPackage.SYSTEM_ANALYSIS__OWNED_MISSION_PKG, null, msgs);
			if (newOwnedMissionPkg != null)
				msgs = ((InternalEObject)newOwnedMissionPkg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CtxPackage.SYSTEM_ANALYSIS__OWNED_MISSION_PKG, null, msgs);
			msgs = basicSetOwnedMissionPkg(newOwnedMissionPkg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CtxPackage.SYSTEM_ANALYSIS__OWNED_MISSION_PKG, newOwnedMissionPkg, newOwnedMissionPkg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityPkg getContainedCapabilityPkg() {
		return containedCapabilityPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainedCapabilityPkg(CapabilityPkg newContainedCapabilityPkg, NotificationChain msgs) {
		CapabilityPkg oldContainedCapabilityPkg = containedCapabilityPkg;
		containedCapabilityPkg = newContainedCapabilityPkg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CtxPackage.SYSTEM_ANALYSIS__CONTAINED_CAPABILITY_PKG, oldContainedCapabilityPkg, newContainedCapabilityPkg);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainedCapabilityPkg(CapabilityPkg newContainedCapabilityPkg) {
		if (newContainedCapabilityPkg != containedCapabilityPkg) {
			NotificationChain msgs = null;
			if (containedCapabilityPkg != null)
				msgs = ((InternalEObject)containedCapabilityPkg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CtxPackage.SYSTEM_ANALYSIS__CONTAINED_CAPABILITY_PKG, null, msgs);
			if (newContainedCapabilityPkg != null)
				msgs = ((InternalEObject)newContainedCapabilityPkg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CtxPackage.SYSTEM_ANALYSIS__CONTAINED_CAPABILITY_PKG, null, msgs);
			msgs = basicSetContainedCapabilityPkg(newContainedCapabilityPkg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CtxPackage.SYSTEM_ANALYSIS__CONTAINED_CAPABILITY_PKG, newContainedCapabilityPkg, newContainedCapabilityPkg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemFunctionPkg getContainedSystemFunctionPkg() {
		return containedSystemFunctionPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainedSystemFunctionPkg(SystemFunctionPkg newContainedSystemFunctionPkg, NotificationChain msgs) {
		SystemFunctionPkg oldContainedSystemFunctionPkg = containedSystemFunctionPkg;
		containedSystemFunctionPkg = newContainedSystemFunctionPkg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CtxPackage.SYSTEM_ANALYSIS__CONTAINED_SYSTEM_FUNCTION_PKG, oldContainedSystemFunctionPkg, newContainedSystemFunctionPkg);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainedSystemFunctionPkg(SystemFunctionPkg newContainedSystemFunctionPkg) {
		if (newContainedSystemFunctionPkg != containedSystemFunctionPkg) {
			NotificationChain msgs = null;
			if (containedSystemFunctionPkg != null)
				msgs = ((InternalEObject)containedSystemFunctionPkg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CtxPackage.SYSTEM_ANALYSIS__CONTAINED_SYSTEM_FUNCTION_PKG, null, msgs);
			if (newContainedSystemFunctionPkg != null)
				msgs = ((InternalEObject)newContainedSystemFunctionPkg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CtxPackage.SYSTEM_ANALYSIS__CONTAINED_SYSTEM_FUNCTION_PKG, null, msgs);
			msgs = basicSetContainedSystemFunctionPkg(newContainedSystemFunctionPkg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CtxPackage.SYSTEM_ANALYSIS__CONTAINED_SYSTEM_FUNCTION_PKG, newContainedSystemFunctionPkg, newContainedSystemFunctionPkg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationalAnalysis> getAllocatedOperationalAnalyses() {
		if (allocatedOperationalAnalyses == null) {
			allocatedOperationalAnalyses = new EObjectResolvingEList<OperationalAnalysis>(OperationalAnalysis.class, this, CtxPackage.SYSTEM_ANALYSIS__ALLOCATED_OPERATIONAL_ANALYSES);
		}
		return allocatedOperationalAnalyses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CtxPackage.SYSTEM_ANALYSIS__OWNED_SYSTEM_CONTEXT:
				return basicSetOwnedSystemContext(null, msgs);
			case CtxPackage.SYSTEM_ANALYSIS__OWNED_SYSTEM:
				return basicSetOwnedSystem(null, msgs);
			case CtxPackage.SYSTEM_ANALYSIS__OWNED_ACTOR_PKG:
				return basicSetOwnedActorPkg(null, msgs);
			case CtxPackage.SYSTEM_ANALYSIS__OWNED_MISSION_PKG:
				return basicSetOwnedMissionPkg(null, msgs);
			case CtxPackage.SYSTEM_ANALYSIS__CONTAINED_CAPABILITY_PKG:
				return basicSetContainedCapabilityPkg(null, msgs);
			case CtxPackage.SYSTEM_ANALYSIS__CONTAINED_SYSTEM_FUNCTION_PKG:
				return basicSetContainedSystemFunctionPkg(null, msgs);
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
			case CtxPackage.SYSTEM_ANALYSIS__OWNED_SYSTEM_CONTEXT:
				return getOwnedSystemContext();
			case CtxPackage.SYSTEM_ANALYSIS__OWNED_SYSTEM:
				return getOwnedSystem();
			case CtxPackage.SYSTEM_ANALYSIS__OWNED_ACTOR_PKG:
				return getOwnedActorPkg();
			case CtxPackage.SYSTEM_ANALYSIS__OWNED_MISSION_PKG:
				return getOwnedMissionPkg();
			case CtxPackage.SYSTEM_ANALYSIS__CONTAINED_CAPABILITY_PKG:
				return getContainedCapabilityPkg();
			case CtxPackage.SYSTEM_ANALYSIS__CONTAINED_SYSTEM_FUNCTION_PKG:
				return getContainedSystemFunctionPkg();
			case CtxPackage.SYSTEM_ANALYSIS__ALLOCATED_OPERATIONAL_ANALYSES:
				return getAllocatedOperationalAnalyses();
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
			case CtxPackage.SYSTEM_ANALYSIS__OWNED_SYSTEM_CONTEXT:
				setOwnedSystemContext((SystemContext)newValue);
				return;
			case CtxPackage.SYSTEM_ANALYSIS__OWNED_SYSTEM:
				setOwnedSystem((org.polarsys.capella.core.semantic.data.ctx.System)newValue);
				return;
			case CtxPackage.SYSTEM_ANALYSIS__OWNED_ACTOR_PKG:
				setOwnedActorPkg((ActorPkg)newValue);
				return;
			case CtxPackage.SYSTEM_ANALYSIS__OWNED_MISSION_PKG:
				setOwnedMissionPkg((MissionPkg)newValue);
				return;
			case CtxPackage.SYSTEM_ANALYSIS__CONTAINED_CAPABILITY_PKG:
				setContainedCapabilityPkg((CapabilityPkg)newValue);
				return;
			case CtxPackage.SYSTEM_ANALYSIS__CONTAINED_SYSTEM_FUNCTION_PKG:
				setContainedSystemFunctionPkg((SystemFunctionPkg)newValue);
				return;
			case CtxPackage.SYSTEM_ANALYSIS__ALLOCATED_OPERATIONAL_ANALYSES:
				getAllocatedOperationalAnalyses().clear();
				getAllocatedOperationalAnalyses().addAll((Collection<? extends OperationalAnalysis>)newValue);
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
			case CtxPackage.SYSTEM_ANALYSIS__OWNED_SYSTEM_CONTEXT:
				setOwnedSystemContext((SystemContext)null);
				return;
			case CtxPackage.SYSTEM_ANALYSIS__OWNED_SYSTEM:
				setOwnedSystem((org.polarsys.capella.core.semantic.data.ctx.System)null);
				return;
			case CtxPackage.SYSTEM_ANALYSIS__OWNED_ACTOR_PKG:
				setOwnedActorPkg((ActorPkg)null);
				return;
			case CtxPackage.SYSTEM_ANALYSIS__OWNED_MISSION_PKG:
				setOwnedMissionPkg((MissionPkg)null);
				return;
			case CtxPackage.SYSTEM_ANALYSIS__CONTAINED_CAPABILITY_PKG:
				setContainedCapabilityPkg((CapabilityPkg)null);
				return;
			case CtxPackage.SYSTEM_ANALYSIS__CONTAINED_SYSTEM_FUNCTION_PKG:
				setContainedSystemFunctionPkg((SystemFunctionPkg)null);
				return;
			case CtxPackage.SYSTEM_ANALYSIS__ALLOCATED_OPERATIONAL_ANALYSES:
				getAllocatedOperationalAnalyses().clear();
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
			case CtxPackage.SYSTEM_ANALYSIS__OWNED_SYSTEM_CONTEXT:
				return ownedSystemContext != null;
			case CtxPackage.SYSTEM_ANALYSIS__OWNED_SYSTEM:
				return ownedSystem != null;
			case CtxPackage.SYSTEM_ANALYSIS__OWNED_ACTOR_PKG:
				return ownedActorPkg != null;
			case CtxPackage.SYSTEM_ANALYSIS__OWNED_MISSION_PKG:
				return ownedMissionPkg != null;
			case CtxPackage.SYSTEM_ANALYSIS__CONTAINED_CAPABILITY_PKG:
				return containedCapabilityPkg != null;
			case CtxPackage.SYSTEM_ANALYSIS__CONTAINED_SYSTEM_FUNCTION_PKG:
				return containedSystemFunctionPkg != null;
			case CtxPackage.SYSTEM_ANALYSIS__ALLOCATED_OPERATIONAL_ANALYSES:
				return allocatedOperationalAnalyses != null && !allocatedOperationalAnalyses.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SystemAnalysisImpl
