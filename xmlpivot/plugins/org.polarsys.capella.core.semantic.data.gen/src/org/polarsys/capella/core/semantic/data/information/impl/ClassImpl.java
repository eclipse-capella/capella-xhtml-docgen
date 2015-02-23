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

package org.polarsys.capella.core.semantic.data.information.impl;

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

import org.polarsys.capella.core.semantic.data.capellacommon.StateMachine;

import org.polarsys.capella.core.semantic.data.capellacore.impl.GeneralClassImpl;

import org.polarsys.capella.core.semantic.data.information.InformationPackage;
import org.polarsys.capella.core.semantic.data.information.KeyPart;

import org.polarsys.capella.core.semantic.data.information.datavalue.DataValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.impl.ClassImpl#isIsPrimitive <em>Is Primitive</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.impl.ClassImpl#getKeyParts <em>Key Parts</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.impl.ClassImpl#getOwnedStateMachines <em>Owned State Machines</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.impl.ClassImpl#getOwnedDataValues <em>Owned Data Values</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.impl.ClassImpl#getRealizedClasses <em>Realized Classes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassImpl extends GeneralClassImpl implements org.polarsys.capella.core.semantic.data.information.Class {
	/**
	 * The default value of the '{@link #isIsPrimitive() <em>Is Primitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPrimitive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PRIMITIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsPrimitive() <em>Is Primitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPrimitive()
	 * @generated
	 * @ordered
	 */
	protected boolean isPrimitive = IS_PRIMITIVE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getKeyParts() <em>Key Parts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyParts()
	 * @generated
	 * @ordered
	 */
	protected EList<KeyPart> keyParts;

	/**
	 * The cached value of the '{@link #getOwnedStateMachines() <em>Owned State Machines</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedStateMachines()
	 * @generated
	 * @ordered
	 */
	protected EList<StateMachine> ownedStateMachines;

	/**
	 * The cached value of the '{@link #getOwnedDataValues() <em>Owned Data Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedDataValues()
	 * @generated
	 * @ordered
	 */
	protected EList<DataValue> ownedDataValues;

	/**
	 * The cached value of the '{@link #getRealizedClasses() <em>Realized Classes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizedClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<org.polarsys.capella.core.semantic.data.information.Class> realizedClasses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InformationPackage.Literals.CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsPrimitive() {
		return isPrimitive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPrimitive(boolean newIsPrimitive) {
		boolean oldIsPrimitive = isPrimitive;
		isPrimitive = newIsPrimitive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InformationPackage.CLASS__IS_PRIMITIVE, oldIsPrimitive, isPrimitive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KeyPart> getKeyParts() {
		if (keyParts == null) {
			keyParts = new EObjectResolvingEList<KeyPart>(KeyPart.class, this, InformationPackage.CLASS__KEY_PARTS);
		}
		return keyParts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StateMachine> getOwnedStateMachines() {
		if (ownedStateMachines == null) {
			ownedStateMachines = new EObjectContainmentEList<StateMachine>(StateMachine.class, this, InformationPackage.CLASS__OWNED_STATE_MACHINES);
		}
		return ownedStateMachines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataValue> getOwnedDataValues() {
		if (ownedDataValues == null) {
			ownedDataValues = new EObjectContainmentEList<DataValue>(DataValue.class, this, InformationPackage.CLASS__OWNED_DATA_VALUES);
		}
		return ownedDataValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.polarsys.capella.core.semantic.data.information.Class> getRealizedClasses() {
		if (realizedClasses == null) {
			realizedClasses = new EObjectResolvingEList<org.polarsys.capella.core.semantic.data.information.Class>(org.polarsys.capella.core.semantic.data.information.Class.class, this, InformationPackage.CLASS__REALIZED_CLASSES);
		}
		return realizedClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InformationPackage.CLASS__OWNED_STATE_MACHINES:
				return ((InternalEList<?>)getOwnedStateMachines()).basicRemove(otherEnd, msgs);
			case InformationPackage.CLASS__OWNED_DATA_VALUES:
				return ((InternalEList<?>)getOwnedDataValues()).basicRemove(otherEnd, msgs);
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
			case InformationPackage.CLASS__IS_PRIMITIVE:
				return isIsPrimitive();
			case InformationPackage.CLASS__KEY_PARTS:
				return getKeyParts();
			case InformationPackage.CLASS__OWNED_STATE_MACHINES:
				return getOwnedStateMachines();
			case InformationPackage.CLASS__OWNED_DATA_VALUES:
				return getOwnedDataValues();
			case InformationPackage.CLASS__REALIZED_CLASSES:
				return getRealizedClasses();
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
			case InformationPackage.CLASS__IS_PRIMITIVE:
				setIsPrimitive((Boolean)newValue);
				return;
			case InformationPackage.CLASS__KEY_PARTS:
				getKeyParts().clear();
				getKeyParts().addAll((Collection<? extends KeyPart>)newValue);
				return;
			case InformationPackage.CLASS__OWNED_STATE_MACHINES:
				getOwnedStateMachines().clear();
				getOwnedStateMachines().addAll((Collection<? extends StateMachine>)newValue);
				return;
			case InformationPackage.CLASS__OWNED_DATA_VALUES:
				getOwnedDataValues().clear();
				getOwnedDataValues().addAll((Collection<? extends DataValue>)newValue);
				return;
			case InformationPackage.CLASS__REALIZED_CLASSES:
				getRealizedClasses().clear();
				getRealizedClasses().addAll((Collection<? extends org.polarsys.capella.core.semantic.data.information.Class>)newValue);
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
			case InformationPackage.CLASS__IS_PRIMITIVE:
				setIsPrimitive(IS_PRIMITIVE_EDEFAULT);
				return;
			case InformationPackage.CLASS__KEY_PARTS:
				getKeyParts().clear();
				return;
			case InformationPackage.CLASS__OWNED_STATE_MACHINES:
				getOwnedStateMachines().clear();
				return;
			case InformationPackage.CLASS__OWNED_DATA_VALUES:
				getOwnedDataValues().clear();
				return;
			case InformationPackage.CLASS__REALIZED_CLASSES:
				getRealizedClasses().clear();
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
			case InformationPackage.CLASS__IS_PRIMITIVE:
				return isPrimitive != IS_PRIMITIVE_EDEFAULT;
			case InformationPackage.CLASS__KEY_PARTS:
				return keyParts != null && !keyParts.isEmpty();
			case InformationPackage.CLASS__OWNED_STATE_MACHINES:
				return ownedStateMachines != null && !ownedStateMachines.isEmpty();
			case InformationPackage.CLASS__OWNED_DATA_VALUES:
				return ownedDataValues != null && !ownedDataValues.isEmpty();
			case InformationPackage.CLASS__REALIZED_CLASSES:
				return realizedClasses != null && !realizedClasses.isEmpty();
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
		result.append(" (isPrimitive: ");
		result.append(isPrimitive);
		result.append(')');
		return result.toString();
	}

} //ClassImpl
