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

package org.polarsys.capella.core.semantic.data.interaction.impl;

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

import org.polarsys.capella.core.semantic.data.behavior.AbstractBehavior;
import org.polarsys.capella.core.semantic.data.behavior.BehaviorPackage;

import org.polarsys.capella.core.semantic.data.capellacommon.GenericTrace;

import org.polarsys.capella.core.semantic.data.capellacore.Constraint;

import org.polarsys.capella.core.semantic.data.capellacore.impl.NamedElementImpl;

import org.polarsys.capella.core.semantic.data.cs.Part;

import org.polarsys.capella.core.semantic.data.fa.AbstractFunction;

import org.polarsys.capella.core.semantic.data.interaction.InteractionPackage;
import org.polarsys.capella.core.semantic.data.interaction.Scenario;
import org.polarsys.capella.core.semantic.data.interaction.ScenarioKind;
import org.polarsys.capella.core.semantic.data.interaction.SequenceMessage;

import org.polarsys.capella.core.semantic.data.requirement.RequirementsTrace;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.interaction.impl.ScenarioImpl#getContainedGenericTraces <em>Contained Generic Traces</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.interaction.impl.ScenarioImpl#getContainedRequirementsTraces <em>Contained Requirements Traces</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.interaction.impl.ScenarioImpl#isIsControlOperator <em>Is Control Operator</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.interaction.impl.ScenarioImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.interaction.impl.ScenarioImpl#isMerged <em>Merged</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.interaction.impl.ScenarioImpl#getPreCondition <em>Pre Condition</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.interaction.impl.ScenarioImpl#getPostCondition <em>Post Condition</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.interaction.impl.ScenarioImpl#getOwnedMessages <em>Owned Messages</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.interaction.impl.ScenarioImpl#getContainedFunctions <em>Contained Functions</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.interaction.impl.ScenarioImpl#getContainedParts <em>Contained Parts</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.interaction.impl.ScenarioImpl#getReferencedScenarios <em>Referenced Scenarios</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.interaction.impl.ScenarioImpl#getRealizedScenarios <em>Realized Scenarios</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScenarioImpl extends NamedElementImpl implements Scenario {
	/**
	 * The cached value of the '{@link #getContainedGenericTraces() <em>Contained Generic Traces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedGenericTraces()
	 * @generated
	 * @ordered
	 */
	protected EList<GenericTrace> containedGenericTraces;

	/**
	 * The cached value of the '{@link #getContainedRequirementsTraces() <em>Contained Requirements Traces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedRequirementsTraces()
	 * @generated
	 * @ordered
	 */
	protected EList<RequirementsTrace> containedRequirementsTraces;

	/**
	 * The default value of the '{@link #isIsControlOperator() <em>Is Control Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsControlOperator()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CONTROL_OPERATOR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsControlOperator() <em>Is Control Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsControlOperator()
	 * @generated
	 * @ordered
	 */
	protected boolean isControlOperator = IS_CONTROL_OPERATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final ScenarioKind KIND_EDEFAULT = ScenarioKind.UNSET;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected ScenarioKind kind = KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #isMerged() <em>Merged</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMerged()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MERGED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMerged() <em>Merged</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMerged()
	 * @generated
	 * @ordered
	 */
	protected boolean merged = MERGED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPreCondition() <em>Pre Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreCondition()
	 * @generated
	 * @ordered
	 */
	protected Constraint preCondition;

	/**
	 * The cached value of the '{@link #getPostCondition() <em>Post Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostCondition()
	 * @generated
	 * @ordered
	 */
	protected Constraint postCondition;

	/**
	 * The cached value of the '{@link #getOwnedMessages() <em>Owned Messages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMessages()
	 * @generated
	 * @ordered
	 */
	protected EList<SequenceMessage> ownedMessages;

	/**
	 * The cached value of the '{@link #getContainedFunctions() <em>Contained Functions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractFunction> containedFunctions;

	/**
	 * The cached value of the '{@link #getContainedParts() <em>Contained Parts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedParts()
	 * @generated
	 * @ordered
	 */
	protected EList<Part> containedParts;

	/**
	 * The cached value of the '{@link #getReferencedScenarios() <em>Referenced Scenarios</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedScenarios()
	 * @generated
	 * @ordered
	 */
	protected EList<Scenario> referencedScenarios;

	/**
	 * The cached value of the '{@link #getRealizedScenarios() <em>Realized Scenarios</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizedScenarios()
	 * @generated
	 * @ordered
	 */
	protected EList<Scenario> realizedScenarios;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScenarioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InteractionPackage.Literals.SCENARIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenericTrace> getContainedGenericTraces() {
		if (containedGenericTraces == null) {
			containedGenericTraces = new EObjectContainmentEList<GenericTrace>(GenericTrace.class, this, InteractionPackage.SCENARIO__CONTAINED_GENERIC_TRACES);
		}
		return containedGenericTraces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RequirementsTrace> getContainedRequirementsTraces() {
		if (containedRequirementsTraces == null) {
			containedRequirementsTraces = new EObjectContainmentEList<RequirementsTrace>(RequirementsTrace.class, this, InteractionPackage.SCENARIO__CONTAINED_REQUIREMENTS_TRACES);
		}
		return containedRequirementsTraces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsControlOperator() {
		return isControlOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsControlOperator(boolean newIsControlOperator) {
		boolean oldIsControlOperator = isControlOperator;
		isControlOperator = newIsControlOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionPackage.SCENARIO__IS_CONTROL_OPERATOR, oldIsControlOperator, isControlOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScenarioKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(ScenarioKind newKind) {
		ScenarioKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionPackage.SCENARIO__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMerged() {
		return merged;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMerged(boolean newMerged) {
		boolean oldMerged = merged;
		merged = newMerged;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionPackage.SCENARIO__MERGED, oldMerged, merged));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint getPreCondition() {
		if (preCondition != null && preCondition.eIsProxy()) {
			InternalEObject oldPreCondition = (InternalEObject)preCondition;
			preCondition = (Constraint)eResolveProxy(oldPreCondition);
			if (preCondition != oldPreCondition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InteractionPackage.SCENARIO__PRE_CONDITION, oldPreCondition, preCondition));
			}
		}
		return preCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint basicGetPreCondition() {
		return preCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreCondition(Constraint newPreCondition) {
		Constraint oldPreCondition = preCondition;
		preCondition = newPreCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionPackage.SCENARIO__PRE_CONDITION, oldPreCondition, preCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint getPostCondition() {
		if (postCondition != null && postCondition.eIsProxy()) {
			InternalEObject oldPostCondition = (InternalEObject)postCondition;
			postCondition = (Constraint)eResolveProxy(oldPostCondition);
			if (postCondition != oldPostCondition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InteractionPackage.SCENARIO__POST_CONDITION, oldPostCondition, postCondition));
			}
		}
		return postCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint basicGetPostCondition() {
		return postCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostCondition(Constraint newPostCondition) {
		Constraint oldPostCondition = postCondition;
		postCondition = newPostCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionPackage.SCENARIO__POST_CONDITION, oldPostCondition, postCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SequenceMessage> getOwnedMessages() {
		if (ownedMessages == null) {
			ownedMessages = new EObjectContainmentEList<SequenceMessage>(SequenceMessage.class, this, InteractionPackage.SCENARIO__OWNED_MESSAGES);
		}
		return ownedMessages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractFunction> getContainedFunctions() {
		if (containedFunctions == null) {
			containedFunctions = new EObjectResolvingEList<AbstractFunction>(AbstractFunction.class, this, InteractionPackage.SCENARIO__CONTAINED_FUNCTIONS);
		}
		return containedFunctions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Part> getContainedParts() {
		if (containedParts == null) {
			containedParts = new EObjectResolvingEList<Part>(Part.class, this, InteractionPackage.SCENARIO__CONTAINED_PARTS);
		}
		return containedParts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Scenario> getReferencedScenarios() {
		if (referencedScenarios == null) {
			referencedScenarios = new EObjectResolvingEList<Scenario>(Scenario.class, this, InteractionPackage.SCENARIO__REFERENCED_SCENARIOS);
		}
		return referencedScenarios;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Scenario> getRealizedScenarios() {
		if (realizedScenarios == null) {
			realizedScenarios = new EObjectResolvingEList<Scenario>(Scenario.class, this, InteractionPackage.SCENARIO__REALIZED_SCENARIOS);
		}
		return realizedScenarios;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InteractionPackage.SCENARIO__CONTAINED_GENERIC_TRACES:
				return ((InternalEList<?>)getContainedGenericTraces()).basicRemove(otherEnd, msgs);
			case InteractionPackage.SCENARIO__CONTAINED_REQUIREMENTS_TRACES:
				return ((InternalEList<?>)getContainedRequirementsTraces()).basicRemove(otherEnd, msgs);
			case InteractionPackage.SCENARIO__OWNED_MESSAGES:
				return ((InternalEList<?>)getOwnedMessages()).basicRemove(otherEnd, msgs);
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
			case InteractionPackage.SCENARIO__CONTAINED_GENERIC_TRACES:
				return getContainedGenericTraces();
			case InteractionPackage.SCENARIO__CONTAINED_REQUIREMENTS_TRACES:
				return getContainedRequirementsTraces();
			case InteractionPackage.SCENARIO__IS_CONTROL_OPERATOR:
				return isIsControlOperator();
			case InteractionPackage.SCENARIO__KIND:
				return getKind();
			case InteractionPackage.SCENARIO__MERGED:
				return isMerged();
			case InteractionPackage.SCENARIO__PRE_CONDITION:
				if (resolve) return getPreCondition();
				return basicGetPreCondition();
			case InteractionPackage.SCENARIO__POST_CONDITION:
				if (resolve) return getPostCondition();
				return basicGetPostCondition();
			case InteractionPackage.SCENARIO__OWNED_MESSAGES:
				return getOwnedMessages();
			case InteractionPackage.SCENARIO__CONTAINED_FUNCTIONS:
				return getContainedFunctions();
			case InteractionPackage.SCENARIO__CONTAINED_PARTS:
				return getContainedParts();
			case InteractionPackage.SCENARIO__REFERENCED_SCENARIOS:
				return getReferencedScenarios();
			case InteractionPackage.SCENARIO__REALIZED_SCENARIOS:
				return getRealizedScenarios();
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
			case InteractionPackage.SCENARIO__CONTAINED_GENERIC_TRACES:
				getContainedGenericTraces().clear();
				getContainedGenericTraces().addAll((Collection<? extends GenericTrace>)newValue);
				return;
			case InteractionPackage.SCENARIO__CONTAINED_REQUIREMENTS_TRACES:
				getContainedRequirementsTraces().clear();
				getContainedRequirementsTraces().addAll((Collection<? extends RequirementsTrace>)newValue);
				return;
			case InteractionPackage.SCENARIO__IS_CONTROL_OPERATOR:
				setIsControlOperator((Boolean)newValue);
				return;
			case InteractionPackage.SCENARIO__KIND:
				setKind((ScenarioKind)newValue);
				return;
			case InteractionPackage.SCENARIO__MERGED:
				setMerged((Boolean)newValue);
				return;
			case InteractionPackage.SCENARIO__PRE_CONDITION:
				setPreCondition((Constraint)newValue);
				return;
			case InteractionPackage.SCENARIO__POST_CONDITION:
				setPostCondition((Constraint)newValue);
				return;
			case InteractionPackage.SCENARIO__OWNED_MESSAGES:
				getOwnedMessages().clear();
				getOwnedMessages().addAll((Collection<? extends SequenceMessage>)newValue);
				return;
			case InteractionPackage.SCENARIO__CONTAINED_FUNCTIONS:
				getContainedFunctions().clear();
				getContainedFunctions().addAll((Collection<? extends AbstractFunction>)newValue);
				return;
			case InteractionPackage.SCENARIO__CONTAINED_PARTS:
				getContainedParts().clear();
				getContainedParts().addAll((Collection<? extends Part>)newValue);
				return;
			case InteractionPackage.SCENARIO__REFERENCED_SCENARIOS:
				getReferencedScenarios().clear();
				getReferencedScenarios().addAll((Collection<? extends Scenario>)newValue);
				return;
			case InteractionPackage.SCENARIO__REALIZED_SCENARIOS:
				getRealizedScenarios().clear();
				getRealizedScenarios().addAll((Collection<? extends Scenario>)newValue);
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
			case InteractionPackage.SCENARIO__CONTAINED_GENERIC_TRACES:
				getContainedGenericTraces().clear();
				return;
			case InteractionPackage.SCENARIO__CONTAINED_REQUIREMENTS_TRACES:
				getContainedRequirementsTraces().clear();
				return;
			case InteractionPackage.SCENARIO__IS_CONTROL_OPERATOR:
				setIsControlOperator(IS_CONTROL_OPERATOR_EDEFAULT);
				return;
			case InteractionPackage.SCENARIO__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case InteractionPackage.SCENARIO__MERGED:
				setMerged(MERGED_EDEFAULT);
				return;
			case InteractionPackage.SCENARIO__PRE_CONDITION:
				setPreCondition((Constraint)null);
				return;
			case InteractionPackage.SCENARIO__POST_CONDITION:
				setPostCondition((Constraint)null);
				return;
			case InteractionPackage.SCENARIO__OWNED_MESSAGES:
				getOwnedMessages().clear();
				return;
			case InteractionPackage.SCENARIO__CONTAINED_FUNCTIONS:
				getContainedFunctions().clear();
				return;
			case InteractionPackage.SCENARIO__CONTAINED_PARTS:
				getContainedParts().clear();
				return;
			case InteractionPackage.SCENARIO__REFERENCED_SCENARIOS:
				getReferencedScenarios().clear();
				return;
			case InteractionPackage.SCENARIO__REALIZED_SCENARIOS:
				getRealizedScenarios().clear();
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
			case InteractionPackage.SCENARIO__CONTAINED_GENERIC_TRACES:
				return containedGenericTraces != null && !containedGenericTraces.isEmpty();
			case InteractionPackage.SCENARIO__CONTAINED_REQUIREMENTS_TRACES:
				return containedRequirementsTraces != null && !containedRequirementsTraces.isEmpty();
			case InteractionPackage.SCENARIO__IS_CONTROL_OPERATOR:
				return isControlOperator != IS_CONTROL_OPERATOR_EDEFAULT;
			case InteractionPackage.SCENARIO__KIND:
				return kind != KIND_EDEFAULT;
			case InteractionPackage.SCENARIO__MERGED:
				return merged != MERGED_EDEFAULT;
			case InteractionPackage.SCENARIO__PRE_CONDITION:
				return preCondition != null;
			case InteractionPackage.SCENARIO__POST_CONDITION:
				return postCondition != null;
			case InteractionPackage.SCENARIO__OWNED_MESSAGES:
				return ownedMessages != null && !ownedMessages.isEmpty();
			case InteractionPackage.SCENARIO__CONTAINED_FUNCTIONS:
				return containedFunctions != null && !containedFunctions.isEmpty();
			case InteractionPackage.SCENARIO__CONTAINED_PARTS:
				return containedParts != null && !containedParts.isEmpty();
			case InteractionPackage.SCENARIO__REFERENCED_SCENARIOS:
				return referencedScenarios != null && !referencedScenarios.isEmpty();
			case InteractionPackage.SCENARIO__REALIZED_SCENARIOS:
				return realizedScenarios != null && !realizedScenarios.isEmpty();
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
		if (baseClass == AbstractBehavior.class) {
			switch (derivedFeatureID) {
				case InteractionPackage.SCENARIO__IS_CONTROL_OPERATOR: return BehaviorPackage.ABSTRACT_BEHAVIOR__IS_CONTROL_OPERATOR;
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
		if (baseClass == AbstractBehavior.class) {
			switch (baseFeatureID) {
				case BehaviorPackage.ABSTRACT_BEHAVIOR__IS_CONTROL_OPERATOR: return InteractionPackage.SCENARIO__IS_CONTROL_OPERATOR;
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
		result.append(" (isControlOperator: ");
		result.append(isControlOperator);
		result.append(", kind: ");
		result.append(kind);
		result.append(", merged: ");
		result.append(merged);
		result.append(')');
		return result.toString();
	}

} //ScenarioImpl
