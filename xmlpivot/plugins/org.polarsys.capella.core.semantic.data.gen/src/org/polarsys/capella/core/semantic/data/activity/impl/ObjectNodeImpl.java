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
package org.polarsys.capella.core.semantic.data.activity.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.polarsys.capella.core.semantic.data.activity.ActivityEdge;
import org.polarsys.capella.core.semantic.data.activity.ActivityPackage;
import org.polarsys.capella.core.semantic.data.activity.ObjectNode;
import org.polarsys.capella.core.semantic.data.activity.ObjectNodeKind;
import org.polarsys.capella.core.semantic.data.activity.ObjectNodeOrderingKind;

import org.polarsys.capella.core.semantic.data.behavior.AbstractBehavior;

import org.polarsys.capella.core.semantic.data.modellingcore.IState;
import org.polarsys.capella.core.semantic.data.modellingcore.ValueSpecification;

import org.polarsys.capella.core.semantic.data.modellingcore.impl.AbstractNamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.activity.impl.ObjectNodeImpl#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.activity.impl.ObjectNodeImpl#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.activity.impl.ObjectNodeImpl#isIsControlType <em>Is Control Type</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.activity.impl.ObjectNodeImpl#getKindOfNode <em>Kind Of Node</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.activity.impl.ObjectNodeImpl#getOrdering <em>Ordering</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.activity.impl.ObjectNodeImpl#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.activity.impl.ObjectNodeImpl#getInState <em>In State</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.activity.impl.ObjectNodeImpl#getSelection <em>Selection</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ObjectNodeImpl extends AbstractNamedElementImpl implements ObjectNode {
	/**
	 * The cached value of the '{@link #getOutgoing() <em>Outgoing</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoing()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityEdge> outgoing;

	/**
	 * The cached value of the '{@link #getIncoming() <em>Incoming</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncoming()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityEdge> incoming;

	/**
	 * The default value of the '{@link #isIsControlType() <em>Is Control Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsControlType()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CONTROL_TYPE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsControlType() <em>Is Control Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsControlType()
	 * @generated
	 * @ordered
	 */
	protected boolean isControlType = IS_CONTROL_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getKindOfNode() <em>Kind Of Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKindOfNode()
	 * @generated
	 * @ordered
	 */
	protected static final ObjectNodeKind KIND_OF_NODE_EDEFAULT = ObjectNodeKind.UNSPECIFIED;

	/**
	 * The cached value of the '{@link #getKindOfNode() <em>Kind Of Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKindOfNode()
	 * @generated
	 * @ordered
	 */
	protected ObjectNodeKind kindOfNode = KIND_OF_NODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrdering() <em>Ordering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrdering()
	 * @generated
	 * @ordered
	 */
	protected static final ObjectNodeOrderingKind ORDERING_EDEFAULT = ObjectNodeOrderingKind.FIFO;

	/**
	 * The cached value of the '{@link #getOrdering() <em>Ordering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrdering()
	 * @generated
	 * @ordered
	 */
	protected ObjectNodeOrderingKind ordering = ORDERING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUpperBound() <em>Upper Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification upperBound;

	/**
	 * The cached value of the '{@link #getInState() <em>In State</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInState()
	 * @generated
	 * @ordered
	 */
	protected EList<IState> inState;

	/**
	 * The cached value of the '{@link #getSelection() <em>Selection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelection()
	 * @generated
	 * @ordered
	 */
	protected AbstractBehavior selection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivityPackage.Literals.OBJECT_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityEdge> getOutgoing() {
		if (outgoing == null) {
			outgoing = new EObjectResolvingEList<ActivityEdge>(ActivityEdge.class, this, ActivityPackage.OBJECT_NODE__OUTGOING);
		}
		return outgoing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityEdge> getIncoming() {
		if (incoming == null) {
			incoming = new EObjectResolvingEList<ActivityEdge>(ActivityEdge.class, this, ActivityPackage.OBJECT_NODE__INCOMING);
		}
		return incoming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsControlType() {
		return isControlType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsControlType(boolean newIsControlType) {
		boolean oldIsControlType = isControlType;
		isControlType = newIsControlType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityPackage.OBJECT_NODE__IS_CONTROL_TYPE, oldIsControlType, isControlType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectNodeKind getKindOfNode() {
		return kindOfNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKindOfNode(ObjectNodeKind newKindOfNode) {
		ObjectNodeKind oldKindOfNode = kindOfNode;
		kindOfNode = newKindOfNode == null ? KIND_OF_NODE_EDEFAULT : newKindOfNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityPackage.OBJECT_NODE__KIND_OF_NODE, oldKindOfNode, kindOfNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectNodeOrderingKind getOrdering() {
		return ordering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrdering(ObjectNodeOrderingKind newOrdering) {
		ObjectNodeOrderingKind oldOrdering = ordering;
		ordering = newOrdering == null ? ORDERING_EDEFAULT : newOrdering;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityPackage.OBJECT_NODE__ORDERING, oldOrdering, ordering));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getUpperBound() {
		return upperBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpperBound(ValueSpecification newUpperBound, NotificationChain msgs) {
		ValueSpecification oldUpperBound = upperBound;
		upperBound = newUpperBound;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActivityPackage.OBJECT_NODE__UPPER_BOUND, oldUpperBound, newUpperBound);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperBound(ValueSpecification newUpperBound) {
		if (newUpperBound != upperBound) {
			NotificationChain msgs = null;
			if (upperBound != null)
				msgs = ((InternalEObject)upperBound).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ActivityPackage.OBJECT_NODE__UPPER_BOUND, null, msgs);
			if (newUpperBound != null)
				msgs = ((InternalEObject)newUpperBound).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ActivityPackage.OBJECT_NODE__UPPER_BOUND, null, msgs);
			msgs = basicSetUpperBound(newUpperBound, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityPackage.OBJECT_NODE__UPPER_BOUND, newUpperBound, newUpperBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IState> getInState() {
		if (inState == null) {
			inState = new EObjectResolvingEList<IState>(IState.class, this, ActivityPackage.OBJECT_NODE__IN_STATE);
		}
		return inState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractBehavior getSelection() {
		if (selection != null && selection.eIsProxy()) {
			InternalEObject oldSelection = (InternalEObject)selection;
			selection = (AbstractBehavior)eResolveProxy(oldSelection);
			if (selection != oldSelection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivityPackage.OBJECT_NODE__SELECTION, oldSelection, selection));
			}
		}
		return selection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractBehavior basicGetSelection() {
		return selection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelection(AbstractBehavior newSelection) {
		AbstractBehavior oldSelection = selection;
		selection = newSelection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityPackage.OBJECT_NODE__SELECTION, oldSelection, selection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActivityPackage.OBJECT_NODE__UPPER_BOUND:
				return basicSetUpperBound(null, msgs);
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
			case ActivityPackage.OBJECT_NODE__OUTGOING:
				return getOutgoing();
			case ActivityPackage.OBJECT_NODE__INCOMING:
				return getIncoming();
			case ActivityPackage.OBJECT_NODE__IS_CONTROL_TYPE:
				return isIsControlType();
			case ActivityPackage.OBJECT_NODE__KIND_OF_NODE:
				return getKindOfNode();
			case ActivityPackage.OBJECT_NODE__ORDERING:
				return getOrdering();
			case ActivityPackage.OBJECT_NODE__UPPER_BOUND:
				return getUpperBound();
			case ActivityPackage.OBJECT_NODE__IN_STATE:
				return getInState();
			case ActivityPackage.OBJECT_NODE__SELECTION:
				if (resolve) return getSelection();
				return basicGetSelection();
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
			case ActivityPackage.OBJECT_NODE__OUTGOING:
				getOutgoing().clear();
				getOutgoing().addAll((Collection<? extends ActivityEdge>)newValue);
				return;
			case ActivityPackage.OBJECT_NODE__INCOMING:
				getIncoming().clear();
				getIncoming().addAll((Collection<? extends ActivityEdge>)newValue);
				return;
			case ActivityPackage.OBJECT_NODE__IS_CONTROL_TYPE:
				setIsControlType((Boolean)newValue);
				return;
			case ActivityPackage.OBJECT_NODE__KIND_OF_NODE:
				setKindOfNode((ObjectNodeKind)newValue);
				return;
			case ActivityPackage.OBJECT_NODE__ORDERING:
				setOrdering((ObjectNodeOrderingKind)newValue);
				return;
			case ActivityPackage.OBJECT_NODE__UPPER_BOUND:
				setUpperBound((ValueSpecification)newValue);
				return;
			case ActivityPackage.OBJECT_NODE__IN_STATE:
				getInState().clear();
				getInState().addAll((Collection<? extends IState>)newValue);
				return;
			case ActivityPackage.OBJECT_NODE__SELECTION:
				setSelection((AbstractBehavior)newValue);
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
			case ActivityPackage.OBJECT_NODE__OUTGOING:
				getOutgoing().clear();
				return;
			case ActivityPackage.OBJECT_NODE__INCOMING:
				getIncoming().clear();
				return;
			case ActivityPackage.OBJECT_NODE__IS_CONTROL_TYPE:
				setIsControlType(IS_CONTROL_TYPE_EDEFAULT);
				return;
			case ActivityPackage.OBJECT_NODE__KIND_OF_NODE:
				setKindOfNode(KIND_OF_NODE_EDEFAULT);
				return;
			case ActivityPackage.OBJECT_NODE__ORDERING:
				setOrdering(ORDERING_EDEFAULT);
				return;
			case ActivityPackage.OBJECT_NODE__UPPER_BOUND:
				setUpperBound((ValueSpecification)null);
				return;
			case ActivityPackage.OBJECT_NODE__IN_STATE:
				getInState().clear();
				return;
			case ActivityPackage.OBJECT_NODE__SELECTION:
				setSelection((AbstractBehavior)null);
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
			case ActivityPackage.OBJECT_NODE__OUTGOING:
				return outgoing != null && !outgoing.isEmpty();
			case ActivityPackage.OBJECT_NODE__INCOMING:
				return incoming != null && !incoming.isEmpty();
			case ActivityPackage.OBJECT_NODE__IS_CONTROL_TYPE:
				return isControlType != IS_CONTROL_TYPE_EDEFAULT;
			case ActivityPackage.OBJECT_NODE__KIND_OF_NODE:
				return kindOfNode != KIND_OF_NODE_EDEFAULT;
			case ActivityPackage.OBJECT_NODE__ORDERING:
				return ordering != ORDERING_EDEFAULT;
			case ActivityPackage.OBJECT_NODE__UPPER_BOUND:
				return upperBound != null;
			case ActivityPackage.OBJECT_NODE__IN_STATE:
				return inState != null && !inState.isEmpty();
			case ActivityPackage.OBJECT_NODE__SELECTION:
				return selection != null;
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
		result.append(" (isControlType: ");
		result.append(isControlType);
		result.append(", kindOfNode: ");
		result.append(kindOfNode);
		result.append(", ordering: ");
		result.append(ordering);
		result.append(')');
		return result.toString();
	}

} //ObjectNodeImpl
