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

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.capella.core.semantic.data.activity.AbstractAction;
import org.polarsys.capella.core.semantic.data.activity.ActivityEdge;
import org.polarsys.capella.core.semantic.data.activity.ActivityNode;
import org.polarsys.capella.core.semantic.data.activity.ActivityPackage;
import org.polarsys.capella.core.semantic.data.activity.InputPin;
import org.polarsys.capella.core.semantic.data.activity.OutputPin;

import org.polarsys.capella.core.semantic.data.modellingcore.impl.AbstractNamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.activity.impl.AbstractActionImpl#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.activity.impl.AbstractActionImpl#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.activity.impl.AbstractActionImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.activity.impl.AbstractActionImpl#getOutputs <em>Outputs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractActionImpl extends AbstractNamedElementImpl implements AbstractAction {
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
	 * The cached value of the '{@link #getInputs() <em>Inputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected EList<InputPin> inputs;

	/**
	 * The cached value of the '{@link #getOutputs() <em>Outputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputs()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputPin> outputs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivityPackage.Literals.ABSTRACT_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityEdge> getOutgoing() {
		if (outgoing == null) {
			outgoing = new EObjectResolvingEList<ActivityEdge>(ActivityEdge.class, this, ActivityPackage.ABSTRACT_ACTION__OUTGOING);
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
			incoming = new EObjectResolvingEList<ActivityEdge>(ActivityEdge.class, this, ActivityPackage.ABSTRACT_ACTION__INCOMING);
		}
		return incoming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputPin> getInputs() {
		if (inputs == null) {
			inputs = new EObjectContainmentEList<InputPin>(InputPin.class, this, ActivityPackage.ABSTRACT_ACTION__INPUTS);
		}
		return inputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputPin> getOutputs() {
		if (outputs == null) {
			outputs = new EObjectContainmentEList<OutputPin>(OutputPin.class, this, ActivityPackage.ABSTRACT_ACTION__OUTPUTS);
		}
		return outputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActivityPackage.ABSTRACT_ACTION__INPUTS:
				return ((InternalEList<?>)getInputs()).basicRemove(otherEnd, msgs);
			case ActivityPackage.ABSTRACT_ACTION__OUTPUTS:
				return ((InternalEList<?>)getOutputs()).basicRemove(otherEnd, msgs);
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
			case ActivityPackage.ABSTRACT_ACTION__OUTGOING:
				return getOutgoing();
			case ActivityPackage.ABSTRACT_ACTION__INCOMING:
				return getIncoming();
			case ActivityPackage.ABSTRACT_ACTION__INPUTS:
				return getInputs();
			case ActivityPackage.ABSTRACT_ACTION__OUTPUTS:
				return getOutputs();
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
			case ActivityPackage.ABSTRACT_ACTION__OUTGOING:
				getOutgoing().clear();
				getOutgoing().addAll((Collection<? extends ActivityEdge>)newValue);
				return;
			case ActivityPackage.ABSTRACT_ACTION__INCOMING:
				getIncoming().clear();
				getIncoming().addAll((Collection<? extends ActivityEdge>)newValue);
				return;
			case ActivityPackage.ABSTRACT_ACTION__INPUTS:
				getInputs().clear();
				getInputs().addAll((Collection<? extends InputPin>)newValue);
				return;
			case ActivityPackage.ABSTRACT_ACTION__OUTPUTS:
				getOutputs().clear();
				getOutputs().addAll((Collection<? extends OutputPin>)newValue);
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
			case ActivityPackage.ABSTRACT_ACTION__OUTGOING:
				getOutgoing().clear();
				return;
			case ActivityPackage.ABSTRACT_ACTION__INCOMING:
				getIncoming().clear();
				return;
			case ActivityPackage.ABSTRACT_ACTION__INPUTS:
				getInputs().clear();
				return;
			case ActivityPackage.ABSTRACT_ACTION__OUTPUTS:
				getOutputs().clear();
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
			case ActivityPackage.ABSTRACT_ACTION__OUTGOING:
				return outgoing != null && !outgoing.isEmpty();
			case ActivityPackage.ABSTRACT_ACTION__INCOMING:
				return incoming != null && !incoming.isEmpty();
			case ActivityPackage.ABSTRACT_ACTION__INPUTS:
				return inputs != null && !inputs.isEmpty();
			case ActivityPackage.ABSTRACT_ACTION__OUTPUTS:
				return outputs != null && !outputs.isEmpty();
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
		if (baseClass == ActivityNode.class) {
			switch (derivedFeatureID) {
				case ActivityPackage.ABSTRACT_ACTION__OUTGOING: return ActivityPackage.ACTIVITY_NODE__OUTGOING;
				case ActivityPackage.ABSTRACT_ACTION__INCOMING: return ActivityPackage.ACTIVITY_NODE__INCOMING;
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
		if (baseClass == ActivityNode.class) {
			switch (baseFeatureID) {
				case ActivityPackage.ACTIVITY_NODE__OUTGOING: return ActivityPackage.ABSTRACT_ACTION__OUTGOING;
				case ActivityPackage.ACTIVITY_NODE__INCOMING: return ActivityPackage.ABSTRACT_ACTION__INCOMING;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //AbstractActionImpl
