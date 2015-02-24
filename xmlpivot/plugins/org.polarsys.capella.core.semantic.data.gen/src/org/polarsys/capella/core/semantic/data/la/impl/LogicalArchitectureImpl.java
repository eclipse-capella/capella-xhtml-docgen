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

package org.polarsys.capella.core.semantic.data.la.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.polarsys.capella.core.semantic.data.cs.impl.BlockArchitectureImpl;

import org.polarsys.capella.core.semantic.data.ctx.SystemAnalysis;

import org.polarsys.capella.core.semantic.data.la.CapabilityRealizationPkg;
import org.polarsys.capella.core.semantic.data.la.LaPackage;
import org.polarsys.capella.core.semantic.data.la.LogicalActorPkg;
import org.polarsys.capella.core.semantic.data.la.LogicalArchitecture;
import org.polarsys.capella.core.semantic.data.la.LogicalComponent;
import org.polarsys.capella.core.semantic.data.la.LogicalComponentPkg;
import org.polarsys.capella.core.semantic.data.la.LogicalContext;
import org.polarsys.capella.core.semantic.data.la.LogicalFunctionPkg;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logical Architecture</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.la.impl.LogicalArchitectureImpl#getOwnedLogicalContext <em>Owned Logical Context</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.la.impl.LogicalArchitectureImpl#getOwnedLogicalComponent <em>Owned Logical Component</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.la.impl.LogicalArchitectureImpl#getOwnedLogicalComponentPkg <em>Owned Logical Component Pkg</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.la.impl.LogicalArchitectureImpl#getOwnedLogicalActorPkg <em>Owned Logical Actor Pkg</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.la.impl.LogicalArchitectureImpl#getContainedCapabilityRealizationPkg <em>Contained Capability Realization Pkg</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.la.impl.LogicalArchitectureImpl#getContainedLogicalFunctionPkg <em>Contained Logical Function Pkg</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.la.impl.LogicalArchitectureImpl#getAllocatedSystemAnalyses <em>Allocated System Analyses</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LogicalArchitectureImpl extends BlockArchitectureImpl implements LogicalArchitecture {
	/**
	 * The cached value of the '{@link #getOwnedLogicalContext() <em>Owned Logical Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedLogicalContext()
	 * @generated
	 * @ordered
	 */
	protected LogicalContext ownedLogicalContext;

	/**
	 * The cached value of the '{@link #getOwnedLogicalComponent() <em>Owned Logical Component</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedLogicalComponent()
	 * @generated
	 * @ordered
	 */
	protected LogicalComponent ownedLogicalComponent;

	/**
	 * The cached value of the '{@link #getOwnedLogicalComponentPkg() <em>Owned Logical Component Pkg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedLogicalComponentPkg()
	 * @generated
	 * @ordered
	 */
	protected LogicalComponentPkg ownedLogicalComponentPkg;

	/**
	 * The cached value of the '{@link #getOwnedLogicalActorPkg() <em>Owned Logical Actor Pkg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedLogicalActorPkg()
	 * @generated
	 * @ordered
	 */
	protected LogicalActorPkg ownedLogicalActorPkg;

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
	 * The cached value of the '{@link #getContainedLogicalFunctionPkg() <em>Contained Logical Function Pkg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedLogicalFunctionPkg()
	 * @generated
	 * @ordered
	 */
	protected LogicalFunctionPkg containedLogicalFunctionPkg;

	/**
	 * The cached value of the '{@link #getAllocatedSystemAnalyses() <em>Allocated System Analyses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatedSystemAnalyses()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemAnalysis> allocatedSystemAnalyses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogicalArchitectureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LaPackage.Literals.LOGICAL_ARCHITECTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalContext getOwnedLogicalContext() {
		return ownedLogicalContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedLogicalContext(LogicalContext newOwnedLogicalContext, NotificationChain msgs) {
		LogicalContext oldOwnedLogicalContext = ownedLogicalContext;
		ownedLogicalContext = newOwnedLogicalContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LaPackage.LOGICAL_ARCHITECTURE__OWNED_LOGICAL_CONTEXT, oldOwnedLogicalContext, newOwnedLogicalContext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedLogicalContext(LogicalContext newOwnedLogicalContext) {
		if (newOwnedLogicalContext != ownedLogicalContext) {
			NotificationChain msgs = null;
			if (ownedLogicalContext != null)
				msgs = ((InternalEObject)ownedLogicalContext).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LaPackage.LOGICAL_ARCHITECTURE__OWNED_LOGICAL_CONTEXT, null, msgs);
			if (newOwnedLogicalContext != null)
				msgs = ((InternalEObject)newOwnedLogicalContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LaPackage.LOGICAL_ARCHITECTURE__OWNED_LOGICAL_CONTEXT, null, msgs);
			msgs = basicSetOwnedLogicalContext(newOwnedLogicalContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LaPackage.LOGICAL_ARCHITECTURE__OWNED_LOGICAL_CONTEXT, newOwnedLogicalContext, newOwnedLogicalContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalComponent getOwnedLogicalComponent() {
		return ownedLogicalComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedLogicalComponent(LogicalComponent newOwnedLogicalComponent, NotificationChain msgs) {
		LogicalComponent oldOwnedLogicalComponent = ownedLogicalComponent;
		ownedLogicalComponent = newOwnedLogicalComponent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LaPackage.LOGICAL_ARCHITECTURE__OWNED_LOGICAL_COMPONENT, oldOwnedLogicalComponent, newOwnedLogicalComponent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedLogicalComponent(LogicalComponent newOwnedLogicalComponent) {
		if (newOwnedLogicalComponent != ownedLogicalComponent) {
			NotificationChain msgs = null;
			if (ownedLogicalComponent != null)
				msgs = ((InternalEObject)ownedLogicalComponent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LaPackage.LOGICAL_ARCHITECTURE__OWNED_LOGICAL_COMPONENT, null, msgs);
			if (newOwnedLogicalComponent != null)
				msgs = ((InternalEObject)newOwnedLogicalComponent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LaPackage.LOGICAL_ARCHITECTURE__OWNED_LOGICAL_COMPONENT, null, msgs);
			msgs = basicSetOwnedLogicalComponent(newOwnedLogicalComponent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LaPackage.LOGICAL_ARCHITECTURE__OWNED_LOGICAL_COMPONENT, newOwnedLogicalComponent, newOwnedLogicalComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalComponentPkg getOwnedLogicalComponentPkg() {
		return ownedLogicalComponentPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedLogicalComponentPkg(LogicalComponentPkg newOwnedLogicalComponentPkg, NotificationChain msgs) {
		LogicalComponentPkg oldOwnedLogicalComponentPkg = ownedLogicalComponentPkg;
		ownedLogicalComponentPkg = newOwnedLogicalComponentPkg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LaPackage.LOGICAL_ARCHITECTURE__OWNED_LOGICAL_COMPONENT_PKG, oldOwnedLogicalComponentPkg, newOwnedLogicalComponentPkg);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedLogicalComponentPkg(LogicalComponentPkg newOwnedLogicalComponentPkg) {
		if (newOwnedLogicalComponentPkg != ownedLogicalComponentPkg) {
			NotificationChain msgs = null;
			if (ownedLogicalComponentPkg != null)
				msgs = ((InternalEObject)ownedLogicalComponentPkg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LaPackage.LOGICAL_ARCHITECTURE__OWNED_LOGICAL_COMPONENT_PKG, null, msgs);
			if (newOwnedLogicalComponentPkg != null)
				msgs = ((InternalEObject)newOwnedLogicalComponentPkg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LaPackage.LOGICAL_ARCHITECTURE__OWNED_LOGICAL_COMPONENT_PKG, null, msgs);
			msgs = basicSetOwnedLogicalComponentPkg(newOwnedLogicalComponentPkg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LaPackage.LOGICAL_ARCHITECTURE__OWNED_LOGICAL_COMPONENT_PKG, newOwnedLogicalComponentPkg, newOwnedLogicalComponentPkg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalActorPkg getOwnedLogicalActorPkg() {
		return ownedLogicalActorPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedLogicalActorPkg(LogicalActorPkg newOwnedLogicalActorPkg, NotificationChain msgs) {
		LogicalActorPkg oldOwnedLogicalActorPkg = ownedLogicalActorPkg;
		ownedLogicalActorPkg = newOwnedLogicalActorPkg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LaPackage.LOGICAL_ARCHITECTURE__OWNED_LOGICAL_ACTOR_PKG, oldOwnedLogicalActorPkg, newOwnedLogicalActorPkg);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedLogicalActorPkg(LogicalActorPkg newOwnedLogicalActorPkg) {
		if (newOwnedLogicalActorPkg != ownedLogicalActorPkg) {
			NotificationChain msgs = null;
			if (ownedLogicalActorPkg != null)
				msgs = ((InternalEObject)ownedLogicalActorPkg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LaPackage.LOGICAL_ARCHITECTURE__OWNED_LOGICAL_ACTOR_PKG, null, msgs);
			if (newOwnedLogicalActorPkg != null)
				msgs = ((InternalEObject)newOwnedLogicalActorPkg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LaPackage.LOGICAL_ARCHITECTURE__OWNED_LOGICAL_ACTOR_PKG, null, msgs);
			msgs = basicSetOwnedLogicalActorPkg(newOwnedLogicalActorPkg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LaPackage.LOGICAL_ARCHITECTURE__OWNED_LOGICAL_ACTOR_PKG, newOwnedLogicalActorPkg, newOwnedLogicalActorPkg));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LaPackage.LOGICAL_ARCHITECTURE__CONTAINED_CAPABILITY_REALIZATION_PKG, oldContainedCapabilityRealizationPkg, newContainedCapabilityRealizationPkg);
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
				msgs = ((InternalEObject)containedCapabilityRealizationPkg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LaPackage.LOGICAL_ARCHITECTURE__CONTAINED_CAPABILITY_REALIZATION_PKG, null, msgs);
			if (newContainedCapabilityRealizationPkg != null)
				msgs = ((InternalEObject)newContainedCapabilityRealizationPkg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LaPackage.LOGICAL_ARCHITECTURE__CONTAINED_CAPABILITY_REALIZATION_PKG, null, msgs);
			msgs = basicSetContainedCapabilityRealizationPkg(newContainedCapabilityRealizationPkg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LaPackage.LOGICAL_ARCHITECTURE__CONTAINED_CAPABILITY_REALIZATION_PKG, newContainedCapabilityRealizationPkg, newContainedCapabilityRealizationPkg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalFunctionPkg getContainedLogicalFunctionPkg() {
		return containedLogicalFunctionPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainedLogicalFunctionPkg(LogicalFunctionPkg newContainedLogicalFunctionPkg, NotificationChain msgs) {
		LogicalFunctionPkg oldContainedLogicalFunctionPkg = containedLogicalFunctionPkg;
		containedLogicalFunctionPkg = newContainedLogicalFunctionPkg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LaPackage.LOGICAL_ARCHITECTURE__CONTAINED_LOGICAL_FUNCTION_PKG, oldContainedLogicalFunctionPkg, newContainedLogicalFunctionPkg);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainedLogicalFunctionPkg(LogicalFunctionPkg newContainedLogicalFunctionPkg) {
		if (newContainedLogicalFunctionPkg != containedLogicalFunctionPkg) {
			NotificationChain msgs = null;
			if (containedLogicalFunctionPkg != null)
				msgs = ((InternalEObject)containedLogicalFunctionPkg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LaPackage.LOGICAL_ARCHITECTURE__CONTAINED_LOGICAL_FUNCTION_PKG, null, msgs);
			if (newContainedLogicalFunctionPkg != null)
				msgs = ((InternalEObject)newContainedLogicalFunctionPkg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LaPackage.LOGICAL_ARCHITECTURE__CONTAINED_LOGICAL_FUNCTION_PKG, null, msgs);
			msgs = basicSetContainedLogicalFunctionPkg(newContainedLogicalFunctionPkg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LaPackage.LOGICAL_ARCHITECTURE__CONTAINED_LOGICAL_FUNCTION_PKG, newContainedLogicalFunctionPkg, newContainedLogicalFunctionPkg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SystemAnalysis> getAllocatedSystemAnalyses() {
		if (allocatedSystemAnalyses == null) {
			allocatedSystemAnalyses = new EObjectResolvingEList<SystemAnalysis>(SystemAnalysis.class, this, LaPackage.LOGICAL_ARCHITECTURE__ALLOCATED_SYSTEM_ANALYSES);
		}
		return allocatedSystemAnalyses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LaPackage.LOGICAL_ARCHITECTURE__OWNED_LOGICAL_CONTEXT:
				return basicSetOwnedLogicalContext(null, msgs);
			case LaPackage.LOGICAL_ARCHITECTURE__OWNED_LOGICAL_COMPONENT:
				return basicSetOwnedLogicalComponent(null, msgs);
			case LaPackage.LOGICAL_ARCHITECTURE__OWNED_LOGICAL_COMPONENT_PKG:
				return basicSetOwnedLogicalComponentPkg(null, msgs);
			case LaPackage.LOGICAL_ARCHITECTURE__OWNED_LOGICAL_ACTOR_PKG:
				return basicSetOwnedLogicalActorPkg(null, msgs);
			case LaPackage.LOGICAL_ARCHITECTURE__CONTAINED_CAPABILITY_REALIZATION_PKG:
				return basicSetContainedCapabilityRealizationPkg(null, msgs);
			case LaPackage.LOGICAL_ARCHITECTURE__CONTAINED_LOGICAL_FUNCTION_PKG:
				return basicSetContainedLogicalFunctionPkg(null, msgs);
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
			case LaPackage.LOGICAL_ARCHITECTURE__OWNED_LOGICAL_CONTEXT:
				return getOwnedLogicalContext();
			case LaPackage.LOGICAL_ARCHITECTURE__OWNED_LOGICAL_COMPONENT:
				return getOwnedLogicalComponent();
			case LaPackage.LOGICAL_ARCHITECTURE__OWNED_LOGICAL_COMPONENT_PKG:
				return getOwnedLogicalComponentPkg();
			case LaPackage.LOGICAL_ARCHITECTURE__OWNED_LOGICAL_ACTOR_PKG:
				return getOwnedLogicalActorPkg();
			case LaPackage.LOGICAL_ARCHITECTURE__CONTAINED_CAPABILITY_REALIZATION_PKG:
				return getContainedCapabilityRealizationPkg();
			case LaPackage.LOGICAL_ARCHITECTURE__CONTAINED_LOGICAL_FUNCTION_PKG:
				return getContainedLogicalFunctionPkg();
			case LaPackage.LOGICAL_ARCHITECTURE__ALLOCATED_SYSTEM_ANALYSES:
				return getAllocatedSystemAnalyses();
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
			case LaPackage.LOGICAL_ARCHITECTURE__OWNED_LOGICAL_CONTEXT:
				setOwnedLogicalContext((LogicalContext)newValue);
				return;
			case LaPackage.LOGICAL_ARCHITECTURE__OWNED_LOGICAL_COMPONENT:
				setOwnedLogicalComponent((LogicalComponent)newValue);
				return;
			case LaPackage.LOGICAL_ARCHITECTURE__OWNED_LOGICAL_COMPONENT_PKG:
				setOwnedLogicalComponentPkg((LogicalComponentPkg)newValue);
				return;
			case LaPackage.LOGICAL_ARCHITECTURE__OWNED_LOGICAL_ACTOR_PKG:
				setOwnedLogicalActorPkg((LogicalActorPkg)newValue);
				return;
			case LaPackage.LOGICAL_ARCHITECTURE__CONTAINED_CAPABILITY_REALIZATION_PKG:
				setContainedCapabilityRealizationPkg((CapabilityRealizationPkg)newValue);
				return;
			case LaPackage.LOGICAL_ARCHITECTURE__CONTAINED_LOGICAL_FUNCTION_PKG:
				setContainedLogicalFunctionPkg((LogicalFunctionPkg)newValue);
				return;
			case LaPackage.LOGICAL_ARCHITECTURE__ALLOCATED_SYSTEM_ANALYSES:
				getAllocatedSystemAnalyses().clear();
				getAllocatedSystemAnalyses().addAll((Collection<? extends SystemAnalysis>)newValue);
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
			case LaPackage.LOGICAL_ARCHITECTURE__OWNED_LOGICAL_CONTEXT:
				setOwnedLogicalContext((LogicalContext)null);
				return;
			case LaPackage.LOGICAL_ARCHITECTURE__OWNED_LOGICAL_COMPONENT:
				setOwnedLogicalComponent((LogicalComponent)null);
				return;
			case LaPackage.LOGICAL_ARCHITECTURE__OWNED_LOGICAL_COMPONENT_PKG:
				setOwnedLogicalComponentPkg((LogicalComponentPkg)null);
				return;
			case LaPackage.LOGICAL_ARCHITECTURE__OWNED_LOGICAL_ACTOR_PKG:
				setOwnedLogicalActorPkg((LogicalActorPkg)null);
				return;
			case LaPackage.LOGICAL_ARCHITECTURE__CONTAINED_CAPABILITY_REALIZATION_PKG:
				setContainedCapabilityRealizationPkg((CapabilityRealizationPkg)null);
				return;
			case LaPackage.LOGICAL_ARCHITECTURE__CONTAINED_LOGICAL_FUNCTION_PKG:
				setContainedLogicalFunctionPkg((LogicalFunctionPkg)null);
				return;
			case LaPackage.LOGICAL_ARCHITECTURE__ALLOCATED_SYSTEM_ANALYSES:
				getAllocatedSystemAnalyses().clear();
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
			case LaPackage.LOGICAL_ARCHITECTURE__OWNED_LOGICAL_CONTEXT:
				return ownedLogicalContext != null;
			case LaPackage.LOGICAL_ARCHITECTURE__OWNED_LOGICAL_COMPONENT:
				return ownedLogicalComponent != null;
			case LaPackage.LOGICAL_ARCHITECTURE__OWNED_LOGICAL_COMPONENT_PKG:
				return ownedLogicalComponentPkg != null;
			case LaPackage.LOGICAL_ARCHITECTURE__OWNED_LOGICAL_ACTOR_PKG:
				return ownedLogicalActorPkg != null;
			case LaPackage.LOGICAL_ARCHITECTURE__CONTAINED_CAPABILITY_REALIZATION_PKG:
				return containedCapabilityRealizationPkg != null;
			case LaPackage.LOGICAL_ARCHITECTURE__CONTAINED_LOGICAL_FUNCTION_PKG:
				return containedLogicalFunctionPkg != null;
			case LaPackage.LOGICAL_ARCHITECTURE__ALLOCATED_SYSTEM_ANALYSES:
				return allocatedSystemAnalyses != null && !allocatedSystemAnalyses.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LogicalArchitectureImpl
