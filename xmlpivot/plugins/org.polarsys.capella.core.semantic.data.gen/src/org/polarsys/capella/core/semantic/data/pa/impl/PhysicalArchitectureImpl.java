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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.capella.core.semantic.data.cs.AbstractDeploymentLink;

import org.polarsys.capella.core.semantic.data.cs.impl.BlockArchitectureImpl;

import org.polarsys.capella.core.semantic.data.la.CapabilityRealizationPkg;
import org.polarsys.capella.core.semantic.data.la.LogicalArchitecture;

import org.polarsys.capella.core.semantic.data.pa.PaPackage;
import org.polarsys.capella.core.semantic.data.pa.PhysicalActorPkg;
import org.polarsys.capella.core.semantic.data.pa.PhysicalArchitecture;
import org.polarsys.capella.core.semantic.data.pa.PhysicalComponent;
import org.polarsys.capella.core.semantic.data.pa.PhysicalComponentPkg;
import org.polarsys.capella.core.semantic.data.pa.PhysicalContext;
import org.polarsys.capella.core.semantic.data.pa.PhysicalFunctionPkg;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Physical Architecture</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.pa.impl.PhysicalArchitectureImpl#getOwnedPhysicalContext <em>Owned Physical Context</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.pa.impl.PhysicalArchitectureImpl#getOwnedPhysicalComponent <em>Owned Physical Component</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.pa.impl.PhysicalArchitectureImpl#getOwnedPhysicalComponentPkg <em>Owned Physical Component Pkg</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.pa.impl.PhysicalArchitectureImpl#getOwnedPhysicalActorPkg <em>Owned Physical Actor Pkg</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.pa.impl.PhysicalArchitectureImpl#getContainedCapabilityRealizationPkg <em>Contained Capability Realization Pkg</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.pa.impl.PhysicalArchitectureImpl#getContainedPhysicalFunctionPkg <em>Contained Physical Function Pkg</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.pa.impl.PhysicalArchitectureImpl#getOwnedDeployments <em>Owned Deployments</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.pa.impl.PhysicalArchitectureImpl#getAllocatedLogicalArchitectures <em>Allocated Logical Architectures</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PhysicalArchitectureImpl extends BlockArchitectureImpl implements PhysicalArchitecture {
	/**
	 * The cached value of the '{@link #getOwnedPhysicalContext() <em>Owned Physical Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPhysicalContext()
	 * @generated
	 * @ordered
	 */
	protected PhysicalContext ownedPhysicalContext;

	/**
	 * The cached value of the '{@link #getOwnedPhysicalComponent() <em>Owned Physical Component</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPhysicalComponent()
	 * @generated
	 * @ordered
	 */
	protected PhysicalComponent ownedPhysicalComponent;

	/**
	 * The cached value of the '{@link #getOwnedPhysicalComponentPkg() <em>Owned Physical Component Pkg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPhysicalComponentPkg()
	 * @generated
	 * @ordered
	 */
	protected PhysicalComponentPkg ownedPhysicalComponentPkg;

	/**
	 * The cached value of the '{@link #getOwnedPhysicalActorPkg() <em>Owned Physical Actor Pkg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPhysicalActorPkg()
	 * @generated
	 * @ordered
	 */
	protected PhysicalActorPkg ownedPhysicalActorPkg;

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
	 * The cached value of the '{@link #getContainedPhysicalFunctionPkg() <em>Contained Physical Function Pkg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedPhysicalFunctionPkg()
	 * @generated
	 * @ordered
	 */
	protected PhysicalFunctionPkg containedPhysicalFunctionPkg;

	/**
	 * The cached value of the '{@link #getOwnedDeployments() <em>Owned Deployments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedDeployments()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractDeploymentLink> ownedDeployments;

	/**
	 * The cached value of the '{@link #getAllocatedLogicalArchitectures() <em>Allocated Logical Architectures</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatedLogicalArchitectures()
	 * @generated
	 * @ordered
	 */
	protected EList<LogicalArchitecture> allocatedLogicalArchitectures;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicalArchitectureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaPackage.Literals.PHYSICAL_ARCHITECTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalContext getOwnedPhysicalContext() {
		return ownedPhysicalContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedPhysicalContext(PhysicalContext newOwnedPhysicalContext, NotificationChain msgs) {
		PhysicalContext oldOwnedPhysicalContext = ownedPhysicalContext;
		ownedPhysicalContext = newOwnedPhysicalContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PaPackage.PHYSICAL_ARCHITECTURE__OWNED_PHYSICAL_CONTEXT, oldOwnedPhysicalContext, newOwnedPhysicalContext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedPhysicalContext(PhysicalContext newOwnedPhysicalContext) {
		if (newOwnedPhysicalContext != ownedPhysicalContext) {
			NotificationChain msgs = null;
			if (ownedPhysicalContext != null)
				msgs = ((InternalEObject)ownedPhysicalContext).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PaPackage.PHYSICAL_ARCHITECTURE__OWNED_PHYSICAL_CONTEXT, null, msgs);
			if (newOwnedPhysicalContext != null)
				msgs = ((InternalEObject)newOwnedPhysicalContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PaPackage.PHYSICAL_ARCHITECTURE__OWNED_PHYSICAL_CONTEXT, null, msgs);
			msgs = basicSetOwnedPhysicalContext(newOwnedPhysicalContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaPackage.PHYSICAL_ARCHITECTURE__OWNED_PHYSICAL_CONTEXT, newOwnedPhysicalContext, newOwnedPhysicalContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalComponent getOwnedPhysicalComponent() {
		return ownedPhysicalComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedPhysicalComponent(PhysicalComponent newOwnedPhysicalComponent, NotificationChain msgs) {
		PhysicalComponent oldOwnedPhysicalComponent = ownedPhysicalComponent;
		ownedPhysicalComponent = newOwnedPhysicalComponent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PaPackage.PHYSICAL_ARCHITECTURE__OWNED_PHYSICAL_COMPONENT, oldOwnedPhysicalComponent, newOwnedPhysicalComponent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedPhysicalComponent(PhysicalComponent newOwnedPhysicalComponent) {
		if (newOwnedPhysicalComponent != ownedPhysicalComponent) {
			NotificationChain msgs = null;
			if (ownedPhysicalComponent != null)
				msgs = ((InternalEObject)ownedPhysicalComponent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PaPackage.PHYSICAL_ARCHITECTURE__OWNED_PHYSICAL_COMPONENT, null, msgs);
			if (newOwnedPhysicalComponent != null)
				msgs = ((InternalEObject)newOwnedPhysicalComponent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PaPackage.PHYSICAL_ARCHITECTURE__OWNED_PHYSICAL_COMPONENT, null, msgs);
			msgs = basicSetOwnedPhysicalComponent(newOwnedPhysicalComponent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaPackage.PHYSICAL_ARCHITECTURE__OWNED_PHYSICAL_COMPONENT, newOwnedPhysicalComponent, newOwnedPhysicalComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalComponentPkg getOwnedPhysicalComponentPkg() {
		return ownedPhysicalComponentPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedPhysicalComponentPkg(PhysicalComponentPkg newOwnedPhysicalComponentPkg, NotificationChain msgs) {
		PhysicalComponentPkg oldOwnedPhysicalComponentPkg = ownedPhysicalComponentPkg;
		ownedPhysicalComponentPkg = newOwnedPhysicalComponentPkg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PaPackage.PHYSICAL_ARCHITECTURE__OWNED_PHYSICAL_COMPONENT_PKG, oldOwnedPhysicalComponentPkg, newOwnedPhysicalComponentPkg);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedPhysicalComponentPkg(PhysicalComponentPkg newOwnedPhysicalComponentPkg) {
		if (newOwnedPhysicalComponentPkg != ownedPhysicalComponentPkg) {
			NotificationChain msgs = null;
			if (ownedPhysicalComponentPkg != null)
				msgs = ((InternalEObject)ownedPhysicalComponentPkg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PaPackage.PHYSICAL_ARCHITECTURE__OWNED_PHYSICAL_COMPONENT_PKG, null, msgs);
			if (newOwnedPhysicalComponentPkg != null)
				msgs = ((InternalEObject)newOwnedPhysicalComponentPkg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PaPackage.PHYSICAL_ARCHITECTURE__OWNED_PHYSICAL_COMPONENT_PKG, null, msgs);
			msgs = basicSetOwnedPhysicalComponentPkg(newOwnedPhysicalComponentPkg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaPackage.PHYSICAL_ARCHITECTURE__OWNED_PHYSICAL_COMPONENT_PKG, newOwnedPhysicalComponentPkg, newOwnedPhysicalComponentPkg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalActorPkg getOwnedPhysicalActorPkg() {
		return ownedPhysicalActorPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedPhysicalActorPkg(PhysicalActorPkg newOwnedPhysicalActorPkg, NotificationChain msgs) {
		PhysicalActorPkg oldOwnedPhysicalActorPkg = ownedPhysicalActorPkg;
		ownedPhysicalActorPkg = newOwnedPhysicalActorPkg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PaPackage.PHYSICAL_ARCHITECTURE__OWNED_PHYSICAL_ACTOR_PKG, oldOwnedPhysicalActorPkg, newOwnedPhysicalActorPkg);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedPhysicalActorPkg(PhysicalActorPkg newOwnedPhysicalActorPkg) {
		if (newOwnedPhysicalActorPkg != ownedPhysicalActorPkg) {
			NotificationChain msgs = null;
			if (ownedPhysicalActorPkg != null)
				msgs = ((InternalEObject)ownedPhysicalActorPkg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PaPackage.PHYSICAL_ARCHITECTURE__OWNED_PHYSICAL_ACTOR_PKG, null, msgs);
			if (newOwnedPhysicalActorPkg != null)
				msgs = ((InternalEObject)newOwnedPhysicalActorPkg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PaPackage.PHYSICAL_ARCHITECTURE__OWNED_PHYSICAL_ACTOR_PKG, null, msgs);
			msgs = basicSetOwnedPhysicalActorPkg(newOwnedPhysicalActorPkg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaPackage.PHYSICAL_ARCHITECTURE__OWNED_PHYSICAL_ACTOR_PKG, newOwnedPhysicalActorPkg, newOwnedPhysicalActorPkg));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PaPackage.PHYSICAL_ARCHITECTURE__CONTAINED_CAPABILITY_REALIZATION_PKG, oldContainedCapabilityRealizationPkg, newContainedCapabilityRealizationPkg);
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
				msgs = ((InternalEObject)containedCapabilityRealizationPkg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PaPackage.PHYSICAL_ARCHITECTURE__CONTAINED_CAPABILITY_REALIZATION_PKG, null, msgs);
			if (newContainedCapabilityRealizationPkg != null)
				msgs = ((InternalEObject)newContainedCapabilityRealizationPkg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PaPackage.PHYSICAL_ARCHITECTURE__CONTAINED_CAPABILITY_REALIZATION_PKG, null, msgs);
			msgs = basicSetContainedCapabilityRealizationPkg(newContainedCapabilityRealizationPkg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaPackage.PHYSICAL_ARCHITECTURE__CONTAINED_CAPABILITY_REALIZATION_PKG, newContainedCapabilityRealizationPkg, newContainedCapabilityRealizationPkg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalFunctionPkg getContainedPhysicalFunctionPkg() {
		return containedPhysicalFunctionPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainedPhysicalFunctionPkg(PhysicalFunctionPkg newContainedPhysicalFunctionPkg, NotificationChain msgs) {
		PhysicalFunctionPkg oldContainedPhysicalFunctionPkg = containedPhysicalFunctionPkg;
		containedPhysicalFunctionPkg = newContainedPhysicalFunctionPkg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PaPackage.PHYSICAL_ARCHITECTURE__CONTAINED_PHYSICAL_FUNCTION_PKG, oldContainedPhysicalFunctionPkg, newContainedPhysicalFunctionPkg);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainedPhysicalFunctionPkg(PhysicalFunctionPkg newContainedPhysicalFunctionPkg) {
		if (newContainedPhysicalFunctionPkg != containedPhysicalFunctionPkg) {
			NotificationChain msgs = null;
			if (containedPhysicalFunctionPkg != null)
				msgs = ((InternalEObject)containedPhysicalFunctionPkg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PaPackage.PHYSICAL_ARCHITECTURE__CONTAINED_PHYSICAL_FUNCTION_PKG, null, msgs);
			if (newContainedPhysicalFunctionPkg != null)
				msgs = ((InternalEObject)newContainedPhysicalFunctionPkg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PaPackage.PHYSICAL_ARCHITECTURE__CONTAINED_PHYSICAL_FUNCTION_PKG, null, msgs);
			msgs = basicSetContainedPhysicalFunctionPkg(newContainedPhysicalFunctionPkg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaPackage.PHYSICAL_ARCHITECTURE__CONTAINED_PHYSICAL_FUNCTION_PKG, newContainedPhysicalFunctionPkg, newContainedPhysicalFunctionPkg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractDeploymentLink> getOwnedDeployments() {
		if (ownedDeployments == null) {
			ownedDeployments = new EObjectContainmentEList<AbstractDeploymentLink>(AbstractDeploymentLink.class, this, PaPackage.PHYSICAL_ARCHITECTURE__OWNED_DEPLOYMENTS);
		}
		return ownedDeployments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LogicalArchitecture> getAllocatedLogicalArchitectures() {
		if (allocatedLogicalArchitectures == null) {
			allocatedLogicalArchitectures = new EObjectResolvingEList<LogicalArchitecture>(LogicalArchitecture.class, this, PaPackage.PHYSICAL_ARCHITECTURE__ALLOCATED_LOGICAL_ARCHITECTURES);
		}
		return allocatedLogicalArchitectures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PaPackage.PHYSICAL_ARCHITECTURE__OWNED_PHYSICAL_CONTEXT:
				return basicSetOwnedPhysicalContext(null, msgs);
			case PaPackage.PHYSICAL_ARCHITECTURE__OWNED_PHYSICAL_COMPONENT:
				return basicSetOwnedPhysicalComponent(null, msgs);
			case PaPackage.PHYSICAL_ARCHITECTURE__OWNED_PHYSICAL_COMPONENT_PKG:
				return basicSetOwnedPhysicalComponentPkg(null, msgs);
			case PaPackage.PHYSICAL_ARCHITECTURE__OWNED_PHYSICAL_ACTOR_PKG:
				return basicSetOwnedPhysicalActorPkg(null, msgs);
			case PaPackage.PHYSICAL_ARCHITECTURE__CONTAINED_CAPABILITY_REALIZATION_PKG:
				return basicSetContainedCapabilityRealizationPkg(null, msgs);
			case PaPackage.PHYSICAL_ARCHITECTURE__CONTAINED_PHYSICAL_FUNCTION_PKG:
				return basicSetContainedPhysicalFunctionPkg(null, msgs);
			case PaPackage.PHYSICAL_ARCHITECTURE__OWNED_DEPLOYMENTS:
				return ((InternalEList<?>)getOwnedDeployments()).basicRemove(otherEnd, msgs);
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
			case PaPackage.PHYSICAL_ARCHITECTURE__OWNED_PHYSICAL_CONTEXT:
				return getOwnedPhysicalContext();
			case PaPackage.PHYSICAL_ARCHITECTURE__OWNED_PHYSICAL_COMPONENT:
				return getOwnedPhysicalComponent();
			case PaPackage.PHYSICAL_ARCHITECTURE__OWNED_PHYSICAL_COMPONENT_PKG:
				return getOwnedPhysicalComponentPkg();
			case PaPackage.PHYSICAL_ARCHITECTURE__OWNED_PHYSICAL_ACTOR_PKG:
				return getOwnedPhysicalActorPkg();
			case PaPackage.PHYSICAL_ARCHITECTURE__CONTAINED_CAPABILITY_REALIZATION_PKG:
				return getContainedCapabilityRealizationPkg();
			case PaPackage.PHYSICAL_ARCHITECTURE__CONTAINED_PHYSICAL_FUNCTION_PKG:
				return getContainedPhysicalFunctionPkg();
			case PaPackage.PHYSICAL_ARCHITECTURE__OWNED_DEPLOYMENTS:
				return getOwnedDeployments();
			case PaPackage.PHYSICAL_ARCHITECTURE__ALLOCATED_LOGICAL_ARCHITECTURES:
				return getAllocatedLogicalArchitectures();
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
			case PaPackage.PHYSICAL_ARCHITECTURE__OWNED_PHYSICAL_CONTEXT:
				setOwnedPhysicalContext((PhysicalContext)newValue);
				return;
			case PaPackage.PHYSICAL_ARCHITECTURE__OWNED_PHYSICAL_COMPONENT:
				setOwnedPhysicalComponent((PhysicalComponent)newValue);
				return;
			case PaPackage.PHYSICAL_ARCHITECTURE__OWNED_PHYSICAL_COMPONENT_PKG:
				setOwnedPhysicalComponentPkg((PhysicalComponentPkg)newValue);
				return;
			case PaPackage.PHYSICAL_ARCHITECTURE__OWNED_PHYSICAL_ACTOR_PKG:
				setOwnedPhysicalActorPkg((PhysicalActorPkg)newValue);
				return;
			case PaPackage.PHYSICAL_ARCHITECTURE__CONTAINED_CAPABILITY_REALIZATION_PKG:
				setContainedCapabilityRealizationPkg((CapabilityRealizationPkg)newValue);
				return;
			case PaPackage.PHYSICAL_ARCHITECTURE__CONTAINED_PHYSICAL_FUNCTION_PKG:
				setContainedPhysicalFunctionPkg((PhysicalFunctionPkg)newValue);
				return;
			case PaPackage.PHYSICAL_ARCHITECTURE__OWNED_DEPLOYMENTS:
				getOwnedDeployments().clear();
				getOwnedDeployments().addAll((Collection<? extends AbstractDeploymentLink>)newValue);
				return;
			case PaPackage.PHYSICAL_ARCHITECTURE__ALLOCATED_LOGICAL_ARCHITECTURES:
				getAllocatedLogicalArchitectures().clear();
				getAllocatedLogicalArchitectures().addAll((Collection<? extends LogicalArchitecture>)newValue);
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
			case PaPackage.PHYSICAL_ARCHITECTURE__OWNED_PHYSICAL_CONTEXT:
				setOwnedPhysicalContext((PhysicalContext)null);
				return;
			case PaPackage.PHYSICAL_ARCHITECTURE__OWNED_PHYSICAL_COMPONENT:
				setOwnedPhysicalComponent((PhysicalComponent)null);
				return;
			case PaPackage.PHYSICAL_ARCHITECTURE__OWNED_PHYSICAL_COMPONENT_PKG:
				setOwnedPhysicalComponentPkg((PhysicalComponentPkg)null);
				return;
			case PaPackage.PHYSICAL_ARCHITECTURE__OWNED_PHYSICAL_ACTOR_PKG:
				setOwnedPhysicalActorPkg((PhysicalActorPkg)null);
				return;
			case PaPackage.PHYSICAL_ARCHITECTURE__CONTAINED_CAPABILITY_REALIZATION_PKG:
				setContainedCapabilityRealizationPkg((CapabilityRealizationPkg)null);
				return;
			case PaPackage.PHYSICAL_ARCHITECTURE__CONTAINED_PHYSICAL_FUNCTION_PKG:
				setContainedPhysicalFunctionPkg((PhysicalFunctionPkg)null);
				return;
			case PaPackage.PHYSICAL_ARCHITECTURE__OWNED_DEPLOYMENTS:
				getOwnedDeployments().clear();
				return;
			case PaPackage.PHYSICAL_ARCHITECTURE__ALLOCATED_LOGICAL_ARCHITECTURES:
				getAllocatedLogicalArchitectures().clear();
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
			case PaPackage.PHYSICAL_ARCHITECTURE__OWNED_PHYSICAL_CONTEXT:
				return ownedPhysicalContext != null;
			case PaPackage.PHYSICAL_ARCHITECTURE__OWNED_PHYSICAL_COMPONENT:
				return ownedPhysicalComponent != null;
			case PaPackage.PHYSICAL_ARCHITECTURE__OWNED_PHYSICAL_COMPONENT_PKG:
				return ownedPhysicalComponentPkg != null;
			case PaPackage.PHYSICAL_ARCHITECTURE__OWNED_PHYSICAL_ACTOR_PKG:
				return ownedPhysicalActorPkg != null;
			case PaPackage.PHYSICAL_ARCHITECTURE__CONTAINED_CAPABILITY_REALIZATION_PKG:
				return containedCapabilityRealizationPkg != null;
			case PaPackage.PHYSICAL_ARCHITECTURE__CONTAINED_PHYSICAL_FUNCTION_PKG:
				return containedPhysicalFunctionPkg != null;
			case PaPackage.PHYSICAL_ARCHITECTURE__OWNED_DEPLOYMENTS:
				return ownedDeployments != null && !ownedDeployments.isEmpty();
			case PaPackage.PHYSICAL_ARCHITECTURE__ALLOCATED_LOGICAL_ARCHITECTURES:
				return allocatedLogicalArchitectures != null && !allocatedLogicalArchitectures.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PhysicalArchitectureImpl
