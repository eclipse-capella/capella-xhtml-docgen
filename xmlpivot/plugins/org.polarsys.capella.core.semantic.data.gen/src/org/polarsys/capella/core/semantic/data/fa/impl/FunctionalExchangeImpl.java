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

package org.polarsys.capella.core.semantic.data.fa.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.polarsys.capella.core.semantic.data.activity.ActivityEdge;
import org.polarsys.capella.core.semantic.data.activity.ActivityNode;
import org.polarsys.capella.core.semantic.data.activity.ActivityPackage;
import org.polarsys.capella.core.semantic.data.activity.ObjectFlow;

import org.polarsys.capella.core.semantic.data.behavior.AbstractEvent;

import org.polarsys.capella.core.semantic.data.capellacore.InvolvedElement;

import org.polarsys.capella.core.semantic.data.capellacore.impl.NamedElementImpl;

import org.polarsys.capella.core.semantic.data.fa.ExchangeCategory;
import org.polarsys.capella.core.semantic.data.fa.FaPackage;
import org.polarsys.capella.core.semantic.data.fa.FunctionInputPort;
import org.polarsys.capella.core.semantic.data.fa.FunctionOutputPort;
import org.polarsys.capella.core.semantic.data.fa.FunctionalExchange;

import org.polarsys.capella.core.semantic.data.information.AbstractEventOperation;
import org.polarsys.capella.core.semantic.data.information.ExchangeItem;

import org.polarsys.capella.core.semantic.data.modellingcore.AbstractType;
import org.polarsys.capella.core.semantic.data.modellingcore.RateKind;
import org.polarsys.capella.core.semantic.data.modellingcore.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Functional Exchange</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.fa.impl.FunctionalExchangeImpl#getKindOfRate <em>Kind Of Rate</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.fa.impl.FunctionalExchangeImpl#getRate <em>Rate</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.fa.impl.FunctionalExchangeImpl#getProbability <em>Probability</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.fa.impl.FunctionalExchangeImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.fa.impl.FunctionalExchangeImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.fa.impl.FunctionalExchangeImpl#getGuard <em>Guard</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.fa.impl.FunctionalExchangeImpl#getWeight <em>Weight</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.fa.impl.FunctionalExchangeImpl#isIsMulticast <em>Is Multicast</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.fa.impl.FunctionalExchangeImpl#isIsMultireceive <em>Is Multireceive</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.fa.impl.FunctionalExchangeImpl#getExchangedItems <em>Exchanged Items</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.fa.impl.FunctionalExchangeImpl#getCategories <em>Categories</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.fa.impl.FunctionalExchangeImpl#getSourceFunctionOutputPort <em>Source Function Output Port</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.fa.impl.FunctionalExchangeImpl#getTargetFunctionInputPort <em>Target Function Input Port</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.fa.impl.FunctionalExchangeImpl#getRealizedFunctionalExchanges <em>Realized Functional Exchanges</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionalExchangeImpl extends NamedElementImpl implements FunctionalExchange {
	/**
	 * The default value of the '{@link #getKindOfRate() <em>Kind Of Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKindOfRate()
	 * @generated
	 * @ordered
	 */
	protected static final RateKind KIND_OF_RATE_EDEFAULT = RateKind.UNSPECIFIED;

	/**
	 * The cached value of the '{@link #getKindOfRate() <em>Kind Of Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKindOfRate()
	 * @generated
	 * @ordered
	 */
	protected RateKind kindOfRate = KIND_OF_RATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRate() <em>Rate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRate()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification rate;

	/**
	 * The cached value of the '{@link #getProbability() <em>Probability</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbability()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification probability;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected ActivityNode target;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected ActivityNode source;

	/**
	 * The cached value of the '{@link #getGuard() <em>Guard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuard()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification guard;

	/**
	 * The cached value of the '{@link #getWeight() <em>Weight</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification weight;

	/**
	 * The default value of the '{@link #isIsMulticast() <em>Is Multicast</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMulticast()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_MULTICAST_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsMulticast() <em>Is Multicast</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMulticast()
	 * @generated
	 * @ordered
	 */
	protected boolean isMulticast = IS_MULTICAST_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsMultireceive() <em>Is Multireceive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMultireceive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_MULTIRECEIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsMultireceive() <em>Is Multireceive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMultireceive()
	 * @generated
	 * @ordered
	 */
	protected boolean isMultireceive = IS_MULTIRECEIVE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExchangedItems() <em>Exchanged Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExchangedItems()
	 * @generated
	 * @ordered
	 */
	protected EList<ExchangeItem> exchangedItems;

	/**
	 * The cached value of the '{@link #getCategories() <em>Categories</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategories()
	 * @generated
	 * @ordered
	 */
	protected EList<ExchangeCategory> categories;

	/**
	 * The cached value of the '{@link #getSourceFunctionOutputPort() <em>Source Function Output Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceFunctionOutputPort()
	 * @generated
	 * @ordered
	 */
	protected FunctionOutputPort sourceFunctionOutputPort;

	/**
	 * The cached value of the '{@link #getTargetFunctionInputPort() <em>Target Function Input Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetFunctionInputPort()
	 * @generated
	 * @ordered
	 */
	protected FunctionInputPort targetFunctionInputPort;

	/**
	 * The cached value of the '{@link #getRealizedFunctionalExchanges() <em>Realized Functional Exchanges</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizedFunctionalExchanges()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionalExchange> realizedFunctionalExchanges;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionalExchangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FaPackage.Literals.FUNCTIONAL_EXCHANGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RateKind getKindOfRate() {
		return kindOfRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKindOfRate(RateKind newKindOfRate) {
		RateKind oldKindOfRate = kindOfRate;
		kindOfRate = newKindOfRate == null ? KIND_OF_RATE_EDEFAULT : newKindOfRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.FUNCTIONAL_EXCHANGE__KIND_OF_RATE, oldKindOfRate, kindOfRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getRate() {
		return rate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRate(ValueSpecification newRate, NotificationChain msgs) {
		ValueSpecification oldRate = rate;
		rate = newRate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FaPackage.FUNCTIONAL_EXCHANGE__RATE, oldRate, newRate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRate(ValueSpecification newRate) {
		if (newRate != rate) {
			NotificationChain msgs = null;
			if (rate != null)
				msgs = ((InternalEObject)rate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FaPackage.FUNCTIONAL_EXCHANGE__RATE, null, msgs);
			if (newRate != null)
				msgs = ((InternalEObject)newRate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FaPackage.FUNCTIONAL_EXCHANGE__RATE, null, msgs);
			msgs = basicSetRate(newRate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.FUNCTIONAL_EXCHANGE__RATE, newRate, newRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getProbability() {
		return probability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProbability(ValueSpecification newProbability, NotificationChain msgs) {
		ValueSpecification oldProbability = probability;
		probability = newProbability;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FaPackage.FUNCTIONAL_EXCHANGE__PROBABILITY, oldProbability, newProbability);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProbability(ValueSpecification newProbability) {
		if (newProbability != probability) {
			NotificationChain msgs = null;
			if (probability != null)
				msgs = ((InternalEObject)probability).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FaPackage.FUNCTIONAL_EXCHANGE__PROBABILITY, null, msgs);
			if (newProbability != null)
				msgs = ((InternalEObject)newProbability).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FaPackage.FUNCTIONAL_EXCHANGE__PROBABILITY, null, msgs);
			msgs = basicSetProbability(newProbability, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.FUNCTIONAL_EXCHANGE__PROBABILITY, newProbability, newProbability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (ActivityNode)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FaPackage.FUNCTIONAL_EXCHANGE__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(ActivityNode newTarget) {
		ActivityNode oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.FUNCTIONAL_EXCHANGE__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (ActivityNode)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FaPackage.FUNCTIONAL_EXCHANGE__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(ActivityNode newSource) {
		ActivityNode oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.FUNCTIONAL_EXCHANGE__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getGuard() {
		return guard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGuard(ValueSpecification newGuard, NotificationChain msgs) {
		ValueSpecification oldGuard = guard;
		guard = newGuard;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FaPackage.FUNCTIONAL_EXCHANGE__GUARD, oldGuard, newGuard);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuard(ValueSpecification newGuard) {
		if (newGuard != guard) {
			NotificationChain msgs = null;
			if (guard != null)
				msgs = ((InternalEObject)guard).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FaPackage.FUNCTIONAL_EXCHANGE__GUARD, null, msgs);
			if (newGuard != null)
				msgs = ((InternalEObject)newGuard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FaPackage.FUNCTIONAL_EXCHANGE__GUARD, null, msgs);
			msgs = basicSetGuard(newGuard, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.FUNCTIONAL_EXCHANGE__GUARD, newGuard, newGuard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getWeight() {
		return weight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWeight(ValueSpecification newWeight, NotificationChain msgs) {
		ValueSpecification oldWeight = weight;
		weight = newWeight;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FaPackage.FUNCTIONAL_EXCHANGE__WEIGHT, oldWeight, newWeight);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeight(ValueSpecification newWeight) {
		if (newWeight != weight) {
			NotificationChain msgs = null;
			if (weight != null)
				msgs = ((InternalEObject)weight).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FaPackage.FUNCTIONAL_EXCHANGE__WEIGHT, null, msgs);
			if (newWeight != null)
				msgs = ((InternalEObject)newWeight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FaPackage.FUNCTIONAL_EXCHANGE__WEIGHT, null, msgs);
			msgs = basicSetWeight(newWeight, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.FUNCTIONAL_EXCHANGE__WEIGHT, newWeight, newWeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsMulticast() {
		return isMulticast;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsMulticast(boolean newIsMulticast) {
		boolean oldIsMulticast = isMulticast;
		isMulticast = newIsMulticast;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.FUNCTIONAL_EXCHANGE__IS_MULTICAST, oldIsMulticast, isMulticast));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsMultireceive() {
		return isMultireceive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsMultireceive(boolean newIsMultireceive) {
		boolean oldIsMultireceive = isMultireceive;
		isMultireceive = newIsMultireceive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.FUNCTIONAL_EXCHANGE__IS_MULTIRECEIVE, oldIsMultireceive, isMultireceive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExchangeItem> getExchangedItems() {
		if (exchangedItems == null) {
			exchangedItems = new EObjectResolvingEList<ExchangeItem>(ExchangeItem.class, this, FaPackage.FUNCTIONAL_EXCHANGE__EXCHANGED_ITEMS);
		}
		return exchangedItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExchangeCategory> getCategories() {
		if (categories == null) {
			categories = new EObjectResolvingEList<ExchangeCategory>(ExchangeCategory.class, this, FaPackage.FUNCTIONAL_EXCHANGE__CATEGORIES);
		}
		return categories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionOutputPort getSourceFunctionOutputPort() {
		if (sourceFunctionOutputPort != null && sourceFunctionOutputPort.eIsProxy()) {
			InternalEObject oldSourceFunctionOutputPort = (InternalEObject)sourceFunctionOutputPort;
			sourceFunctionOutputPort = (FunctionOutputPort)eResolveProxy(oldSourceFunctionOutputPort);
			if (sourceFunctionOutputPort != oldSourceFunctionOutputPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FaPackage.FUNCTIONAL_EXCHANGE__SOURCE_FUNCTION_OUTPUT_PORT, oldSourceFunctionOutputPort, sourceFunctionOutputPort));
			}
		}
		return sourceFunctionOutputPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionOutputPort basicGetSourceFunctionOutputPort() {
		return sourceFunctionOutputPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceFunctionOutputPort(FunctionOutputPort newSourceFunctionOutputPort) {
		FunctionOutputPort oldSourceFunctionOutputPort = sourceFunctionOutputPort;
		sourceFunctionOutputPort = newSourceFunctionOutputPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.FUNCTIONAL_EXCHANGE__SOURCE_FUNCTION_OUTPUT_PORT, oldSourceFunctionOutputPort, sourceFunctionOutputPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionInputPort getTargetFunctionInputPort() {
		if (targetFunctionInputPort != null && targetFunctionInputPort.eIsProxy()) {
			InternalEObject oldTargetFunctionInputPort = (InternalEObject)targetFunctionInputPort;
			targetFunctionInputPort = (FunctionInputPort)eResolveProxy(oldTargetFunctionInputPort);
			if (targetFunctionInputPort != oldTargetFunctionInputPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FaPackage.FUNCTIONAL_EXCHANGE__TARGET_FUNCTION_INPUT_PORT, oldTargetFunctionInputPort, targetFunctionInputPort));
			}
		}
		return targetFunctionInputPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionInputPort basicGetTargetFunctionInputPort() {
		return targetFunctionInputPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetFunctionInputPort(FunctionInputPort newTargetFunctionInputPort) {
		FunctionInputPort oldTargetFunctionInputPort = targetFunctionInputPort;
		targetFunctionInputPort = newTargetFunctionInputPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.FUNCTIONAL_EXCHANGE__TARGET_FUNCTION_INPUT_PORT, oldTargetFunctionInputPort, targetFunctionInputPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionalExchange> getRealizedFunctionalExchanges() {
		if (realizedFunctionalExchanges == null) {
			realizedFunctionalExchanges = new EObjectResolvingEList<FunctionalExchange>(FunctionalExchange.class, this, FaPackage.FUNCTIONAL_EXCHANGE__REALIZED_FUNCTIONAL_EXCHANGES);
		}
		return realizedFunctionalExchanges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FaPackage.FUNCTIONAL_EXCHANGE__RATE:
				return basicSetRate(null, msgs);
			case FaPackage.FUNCTIONAL_EXCHANGE__PROBABILITY:
				return basicSetProbability(null, msgs);
			case FaPackage.FUNCTIONAL_EXCHANGE__GUARD:
				return basicSetGuard(null, msgs);
			case FaPackage.FUNCTIONAL_EXCHANGE__WEIGHT:
				return basicSetWeight(null, msgs);
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
			case FaPackage.FUNCTIONAL_EXCHANGE__KIND_OF_RATE:
				return getKindOfRate();
			case FaPackage.FUNCTIONAL_EXCHANGE__RATE:
				return getRate();
			case FaPackage.FUNCTIONAL_EXCHANGE__PROBABILITY:
				return getProbability();
			case FaPackage.FUNCTIONAL_EXCHANGE__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case FaPackage.FUNCTIONAL_EXCHANGE__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case FaPackage.FUNCTIONAL_EXCHANGE__GUARD:
				return getGuard();
			case FaPackage.FUNCTIONAL_EXCHANGE__WEIGHT:
				return getWeight();
			case FaPackage.FUNCTIONAL_EXCHANGE__IS_MULTICAST:
				return isIsMulticast();
			case FaPackage.FUNCTIONAL_EXCHANGE__IS_MULTIRECEIVE:
				return isIsMultireceive();
			case FaPackage.FUNCTIONAL_EXCHANGE__EXCHANGED_ITEMS:
				return getExchangedItems();
			case FaPackage.FUNCTIONAL_EXCHANGE__CATEGORIES:
				return getCategories();
			case FaPackage.FUNCTIONAL_EXCHANGE__SOURCE_FUNCTION_OUTPUT_PORT:
				if (resolve) return getSourceFunctionOutputPort();
				return basicGetSourceFunctionOutputPort();
			case FaPackage.FUNCTIONAL_EXCHANGE__TARGET_FUNCTION_INPUT_PORT:
				if (resolve) return getTargetFunctionInputPort();
				return basicGetTargetFunctionInputPort();
			case FaPackage.FUNCTIONAL_EXCHANGE__REALIZED_FUNCTIONAL_EXCHANGES:
				return getRealizedFunctionalExchanges();
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
			case FaPackage.FUNCTIONAL_EXCHANGE__KIND_OF_RATE:
				setKindOfRate((RateKind)newValue);
				return;
			case FaPackage.FUNCTIONAL_EXCHANGE__RATE:
				setRate((ValueSpecification)newValue);
				return;
			case FaPackage.FUNCTIONAL_EXCHANGE__PROBABILITY:
				setProbability((ValueSpecification)newValue);
				return;
			case FaPackage.FUNCTIONAL_EXCHANGE__TARGET:
				setTarget((ActivityNode)newValue);
				return;
			case FaPackage.FUNCTIONAL_EXCHANGE__SOURCE:
				setSource((ActivityNode)newValue);
				return;
			case FaPackage.FUNCTIONAL_EXCHANGE__GUARD:
				setGuard((ValueSpecification)newValue);
				return;
			case FaPackage.FUNCTIONAL_EXCHANGE__WEIGHT:
				setWeight((ValueSpecification)newValue);
				return;
			case FaPackage.FUNCTIONAL_EXCHANGE__IS_MULTICAST:
				setIsMulticast((Boolean)newValue);
				return;
			case FaPackage.FUNCTIONAL_EXCHANGE__IS_MULTIRECEIVE:
				setIsMultireceive((Boolean)newValue);
				return;
			case FaPackage.FUNCTIONAL_EXCHANGE__EXCHANGED_ITEMS:
				getExchangedItems().clear();
				getExchangedItems().addAll((Collection<? extends ExchangeItem>)newValue);
				return;
			case FaPackage.FUNCTIONAL_EXCHANGE__CATEGORIES:
				getCategories().clear();
				getCategories().addAll((Collection<? extends ExchangeCategory>)newValue);
				return;
			case FaPackage.FUNCTIONAL_EXCHANGE__SOURCE_FUNCTION_OUTPUT_PORT:
				setSourceFunctionOutputPort((FunctionOutputPort)newValue);
				return;
			case FaPackage.FUNCTIONAL_EXCHANGE__TARGET_FUNCTION_INPUT_PORT:
				setTargetFunctionInputPort((FunctionInputPort)newValue);
				return;
			case FaPackage.FUNCTIONAL_EXCHANGE__REALIZED_FUNCTIONAL_EXCHANGES:
				getRealizedFunctionalExchanges().clear();
				getRealizedFunctionalExchanges().addAll((Collection<? extends FunctionalExchange>)newValue);
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
			case FaPackage.FUNCTIONAL_EXCHANGE__KIND_OF_RATE:
				setKindOfRate(KIND_OF_RATE_EDEFAULT);
				return;
			case FaPackage.FUNCTIONAL_EXCHANGE__RATE:
				setRate((ValueSpecification)null);
				return;
			case FaPackage.FUNCTIONAL_EXCHANGE__PROBABILITY:
				setProbability((ValueSpecification)null);
				return;
			case FaPackage.FUNCTIONAL_EXCHANGE__TARGET:
				setTarget((ActivityNode)null);
				return;
			case FaPackage.FUNCTIONAL_EXCHANGE__SOURCE:
				setSource((ActivityNode)null);
				return;
			case FaPackage.FUNCTIONAL_EXCHANGE__GUARD:
				setGuard((ValueSpecification)null);
				return;
			case FaPackage.FUNCTIONAL_EXCHANGE__WEIGHT:
				setWeight((ValueSpecification)null);
				return;
			case FaPackage.FUNCTIONAL_EXCHANGE__IS_MULTICAST:
				setIsMulticast(IS_MULTICAST_EDEFAULT);
				return;
			case FaPackage.FUNCTIONAL_EXCHANGE__IS_MULTIRECEIVE:
				setIsMultireceive(IS_MULTIRECEIVE_EDEFAULT);
				return;
			case FaPackage.FUNCTIONAL_EXCHANGE__EXCHANGED_ITEMS:
				getExchangedItems().clear();
				return;
			case FaPackage.FUNCTIONAL_EXCHANGE__CATEGORIES:
				getCategories().clear();
				return;
			case FaPackage.FUNCTIONAL_EXCHANGE__SOURCE_FUNCTION_OUTPUT_PORT:
				setSourceFunctionOutputPort((FunctionOutputPort)null);
				return;
			case FaPackage.FUNCTIONAL_EXCHANGE__TARGET_FUNCTION_INPUT_PORT:
				setTargetFunctionInputPort((FunctionInputPort)null);
				return;
			case FaPackage.FUNCTIONAL_EXCHANGE__REALIZED_FUNCTIONAL_EXCHANGES:
				getRealizedFunctionalExchanges().clear();
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
			case FaPackage.FUNCTIONAL_EXCHANGE__KIND_OF_RATE:
				return kindOfRate != KIND_OF_RATE_EDEFAULT;
			case FaPackage.FUNCTIONAL_EXCHANGE__RATE:
				return rate != null;
			case FaPackage.FUNCTIONAL_EXCHANGE__PROBABILITY:
				return probability != null;
			case FaPackage.FUNCTIONAL_EXCHANGE__TARGET:
				return target != null;
			case FaPackage.FUNCTIONAL_EXCHANGE__SOURCE:
				return source != null;
			case FaPackage.FUNCTIONAL_EXCHANGE__GUARD:
				return guard != null;
			case FaPackage.FUNCTIONAL_EXCHANGE__WEIGHT:
				return weight != null;
			case FaPackage.FUNCTIONAL_EXCHANGE__IS_MULTICAST:
				return isMulticast != IS_MULTICAST_EDEFAULT;
			case FaPackage.FUNCTIONAL_EXCHANGE__IS_MULTIRECEIVE:
				return isMultireceive != IS_MULTIRECEIVE_EDEFAULT;
			case FaPackage.FUNCTIONAL_EXCHANGE__EXCHANGED_ITEMS:
				return exchangedItems != null && !exchangedItems.isEmpty();
			case FaPackage.FUNCTIONAL_EXCHANGE__CATEGORIES:
				return categories != null && !categories.isEmpty();
			case FaPackage.FUNCTIONAL_EXCHANGE__SOURCE_FUNCTION_OUTPUT_PORT:
				return sourceFunctionOutputPort != null;
			case FaPackage.FUNCTIONAL_EXCHANGE__TARGET_FUNCTION_INPUT_PORT:
				return targetFunctionInputPort != null;
			case FaPackage.FUNCTIONAL_EXCHANGE__REALIZED_FUNCTIONAL_EXCHANGES:
				return realizedFunctionalExchanges != null && !realizedFunctionalExchanges.isEmpty();
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
		if (baseClass == ActivityEdge.class) {
			switch (derivedFeatureID) {
				case FaPackage.FUNCTIONAL_EXCHANGE__KIND_OF_RATE: return ActivityPackage.ACTIVITY_EDGE__KIND_OF_RATE;
				case FaPackage.FUNCTIONAL_EXCHANGE__RATE: return ActivityPackage.ACTIVITY_EDGE__RATE;
				case FaPackage.FUNCTIONAL_EXCHANGE__PROBABILITY: return ActivityPackage.ACTIVITY_EDGE__PROBABILITY;
				case FaPackage.FUNCTIONAL_EXCHANGE__TARGET: return ActivityPackage.ACTIVITY_EDGE__TARGET;
				case FaPackage.FUNCTIONAL_EXCHANGE__SOURCE: return ActivityPackage.ACTIVITY_EDGE__SOURCE;
				case FaPackage.FUNCTIONAL_EXCHANGE__GUARD: return ActivityPackage.ACTIVITY_EDGE__GUARD;
				case FaPackage.FUNCTIONAL_EXCHANGE__WEIGHT: return ActivityPackage.ACTIVITY_EDGE__WEIGHT;
				default: return -1;
			}
		}
		if (baseClass == ObjectFlow.class) {
			switch (derivedFeatureID) {
				case FaPackage.FUNCTIONAL_EXCHANGE__IS_MULTICAST: return ActivityPackage.OBJECT_FLOW__IS_MULTICAST;
				case FaPackage.FUNCTIONAL_EXCHANGE__IS_MULTIRECEIVE: return ActivityPackage.OBJECT_FLOW__IS_MULTIRECEIVE;
				default: return -1;
			}
		}
		if (baseClass == AbstractType.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == AbstractEvent.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == AbstractEventOperation.class) {
			switch (derivedFeatureID) {
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
		if (baseClass == ActivityEdge.class) {
			switch (baseFeatureID) {
				case ActivityPackage.ACTIVITY_EDGE__KIND_OF_RATE: return FaPackage.FUNCTIONAL_EXCHANGE__KIND_OF_RATE;
				case ActivityPackage.ACTIVITY_EDGE__RATE: return FaPackage.FUNCTIONAL_EXCHANGE__RATE;
				case ActivityPackage.ACTIVITY_EDGE__PROBABILITY: return FaPackage.FUNCTIONAL_EXCHANGE__PROBABILITY;
				case ActivityPackage.ACTIVITY_EDGE__TARGET: return FaPackage.FUNCTIONAL_EXCHANGE__TARGET;
				case ActivityPackage.ACTIVITY_EDGE__SOURCE: return FaPackage.FUNCTIONAL_EXCHANGE__SOURCE;
				case ActivityPackage.ACTIVITY_EDGE__GUARD: return FaPackage.FUNCTIONAL_EXCHANGE__GUARD;
				case ActivityPackage.ACTIVITY_EDGE__WEIGHT: return FaPackage.FUNCTIONAL_EXCHANGE__WEIGHT;
				default: return -1;
			}
		}
		if (baseClass == ObjectFlow.class) {
			switch (baseFeatureID) {
				case ActivityPackage.OBJECT_FLOW__IS_MULTICAST: return FaPackage.FUNCTIONAL_EXCHANGE__IS_MULTICAST;
				case ActivityPackage.OBJECT_FLOW__IS_MULTIRECEIVE: return FaPackage.FUNCTIONAL_EXCHANGE__IS_MULTIRECEIVE;
				default: return -1;
			}
		}
		if (baseClass == AbstractType.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == AbstractEvent.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == AbstractEventOperation.class) {
			switch (baseFeatureID) {
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
		result.append(" (kindOfRate: ");
		result.append(kindOfRate);
		result.append(", isMulticast: ");
		result.append(isMulticast);
		result.append(", isMultireceive: ");
		result.append(isMultireceive);
		result.append(')');
		return result.toString();
	}

} //FunctionalExchangeImpl
