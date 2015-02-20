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

package org.polarsys.capella.core.semantic.data.information.datatype.impl;

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

import org.polarsys.capella.core.semantic.data.capellacore.CapellacorePackage;
import org.polarsys.capella.core.semantic.data.capellacore.PropertyValuePkg;
import org.polarsys.capella.core.semantic.data.capellacore.Structure;
import org.polarsys.capella.core.semantic.data.capellacore.VisibilityKind;

import org.polarsys.capella.core.semantic.data.capellacore.impl.GeneralizableElementImpl;

import org.polarsys.capella.core.semantic.data.information.datatype.DataType;
import org.polarsys.capella.core.semantic.data.information.datatype.DatatypePackage;

import org.polarsys.capella.core.semantic.data.information.datavalue.DataValue;
import org.polarsys.capella.core.semantic.data.information.datavalue.DataValueContainer;
import org.polarsys.capella.core.semantic.data.information.datavalue.DatavaluePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.datatype.impl.DataTypeImpl#getOwnedPropertyValuePkgs <em>Owned Property Value Pkgs</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.datatype.impl.DataTypeImpl#getOwnedDataValues <em>Owned Data Values</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.datatype.impl.DataTypeImpl#isDiscrete <em>Discrete</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.datatype.impl.DataTypeImpl#isMinInclusive <em>Min Inclusive</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.datatype.impl.DataTypeImpl#isMaxInclusive <em>Max Inclusive</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.datatype.impl.DataTypeImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.datatype.impl.DataTypeImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.datatype.impl.DataTypeImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.datatype.impl.DataTypeImpl#getNullValue <em>Null Value</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.datatype.impl.DataTypeImpl#getRealizedDataTypes <em>Realized Data Types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class DataTypeImpl extends GeneralizableElementImpl implements DataType {
	/**
	 * The cached value of the '{@link #getOwnedPropertyValuePkgs() <em>Owned Property Value Pkgs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPropertyValuePkgs()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyValuePkg> ownedPropertyValuePkgs;

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
	 * The default value of the '{@link #isDiscrete() <em>Discrete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDiscrete()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DISCRETE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isDiscrete() <em>Discrete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDiscrete()
	 * @generated
	 * @ordered
	 */
	protected boolean discrete = DISCRETE_EDEFAULT;

	/**
	 * The default value of the '{@link #isMinInclusive() <em>Min Inclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMinInclusive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MIN_INCLUSIVE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isMinInclusive() <em>Min Inclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMinInclusive()
	 * @generated
	 * @ordered
	 */
	protected boolean minInclusive = MIN_INCLUSIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #isMaxInclusive() <em>Max Inclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMaxInclusive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MAX_INCLUSIVE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isMaxInclusive() <em>Max Inclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMaxInclusive()
	 * @generated
	 * @ordered
	 */
	protected boolean maxInclusive = MAX_INCLUSIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPattern() <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPattern()
	 * @generated
	 * @ordered
	 */
	protected static final String PATTERN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPattern() <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPattern()
	 * @generated
	 * @ordered
	 */
	protected String pattern = PATTERN_EDEFAULT;

	/**
	 * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final VisibilityKind VISIBILITY_EDEFAULT = VisibilityKind.UNSET;

	/**
	 * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected VisibilityKind visibility = VISIBILITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected DataValue defaultValue;

	/**
	 * The cached value of the '{@link #getNullValue() <em>Null Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNullValue()
	 * @generated
	 * @ordered
	 */
	protected DataValue nullValue;

	/**
	 * The cached value of the '{@link #getRealizedDataTypes() <em>Realized Data Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizedDataTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<DataType> realizedDataTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatatypePackage.Literals.DATA_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PropertyValuePkg> getOwnedPropertyValuePkgs() {
		if (ownedPropertyValuePkgs == null) {
			ownedPropertyValuePkgs = new EObjectContainmentEList<PropertyValuePkg>(PropertyValuePkg.class, this, DatatypePackage.DATA_TYPE__OWNED_PROPERTY_VALUE_PKGS);
		}
		return ownedPropertyValuePkgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataValue> getOwnedDataValues() {
		if (ownedDataValues == null) {
			ownedDataValues = new EObjectContainmentEList<DataValue>(DataValue.class, this, DatatypePackage.DATA_TYPE__OWNED_DATA_VALUES);
		}
		return ownedDataValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDiscrete() {
		return discrete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiscrete(boolean newDiscrete) {
		boolean oldDiscrete = discrete;
		discrete = newDiscrete;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypePackage.DATA_TYPE__DISCRETE, oldDiscrete, discrete));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMinInclusive() {
		return minInclusive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinInclusive(boolean newMinInclusive) {
		boolean oldMinInclusive = minInclusive;
		minInclusive = newMinInclusive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypePackage.DATA_TYPE__MIN_INCLUSIVE, oldMinInclusive, minInclusive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMaxInclusive() {
		return maxInclusive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxInclusive(boolean newMaxInclusive) {
		boolean oldMaxInclusive = maxInclusive;
		maxInclusive = newMaxInclusive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypePackage.DATA_TYPE__MAX_INCLUSIVE, oldMaxInclusive, maxInclusive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPattern() {
		return pattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPattern(String newPattern) {
		String oldPattern = pattern;
		pattern = newPattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypePackage.DATA_TYPE__PATTERN, oldPattern, pattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibilityKind getVisibility() {
		return visibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibility(VisibilityKind newVisibility) {
		VisibilityKind oldVisibility = visibility;
		visibility = newVisibility == null ? VISIBILITY_EDEFAULT : newVisibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypePackage.DATA_TYPE__VISIBILITY, oldVisibility, visibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataValue getDefaultValue() {
		if (defaultValue != null && defaultValue.eIsProxy()) {
			InternalEObject oldDefaultValue = (InternalEObject)defaultValue;
			defaultValue = (DataValue)eResolveProxy(oldDefaultValue);
			if (defaultValue != oldDefaultValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatatypePackage.DATA_TYPE__DEFAULT_VALUE, oldDefaultValue, defaultValue));
			}
		}
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataValue basicGetDefaultValue() {
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValue(DataValue newDefaultValue) {
		DataValue oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypePackage.DATA_TYPE__DEFAULT_VALUE, oldDefaultValue, defaultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataValue getNullValue() {
		if (nullValue != null && nullValue.eIsProxy()) {
			InternalEObject oldNullValue = (InternalEObject)nullValue;
			nullValue = (DataValue)eResolveProxy(oldNullValue);
			if (nullValue != oldNullValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatatypePackage.DATA_TYPE__NULL_VALUE, oldNullValue, nullValue));
			}
		}
		return nullValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataValue basicGetNullValue() {
		return nullValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNullValue(DataValue newNullValue) {
		DataValue oldNullValue = nullValue;
		nullValue = newNullValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypePackage.DATA_TYPE__NULL_VALUE, oldNullValue, nullValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataType> getRealizedDataTypes() {
		if (realizedDataTypes == null) {
			realizedDataTypes = new EObjectResolvingEList<DataType>(DataType.class, this, DatatypePackage.DATA_TYPE__REALIZED_DATA_TYPES);
		}
		return realizedDataTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DatatypePackage.DATA_TYPE__OWNED_PROPERTY_VALUE_PKGS:
				return ((InternalEList<?>)getOwnedPropertyValuePkgs()).basicRemove(otherEnd, msgs);
			case DatatypePackage.DATA_TYPE__OWNED_DATA_VALUES:
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
			case DatatypePackage.DATA_TYPE__OWNED_PROPERTY_VALUE_PKGS:
				return getOwnedPropertyValuePkgs();
			case DatatypePackage.DATA_TYPE__OWNED_DATA_VALUES:
				return getOwnedDataValues();
			case DatatypePackage.DATA_TYPE__DISCRETE:
				return isDiscrete();
			case DatatypePackage.DATA_TYPE__MIN_INCLUSIVE:
				return isMinInclusive();
			case DatatypePackage.DATA_TYPE__MAX_INCLUSIVE:
				return isMaxInclusive();
			case DatatypePackage.DATA_TYPE__PATTERN:
				return getPattern();
			case DatatypePackage.DATA_TYPE__VISIBILITY:
				return getVisibility();
			case DatatypePackage.DATA_TYPE__DEFAULT_VALUE:
				if (resolve) return getDefaultValue();
				return basicGetDefaultValue();
			case DatatypePackage.DATA_TYPE__NULL_VALUE:
				if (resolve) return getNullValue();
				return basicGetNullValue();
			case DatatypePackage.DATA_TYPE__REALIZED_DATA_TYPES:
				return getRealizedDataTypes();
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
			case DatatypePackage.DATA_TYPE__OWNED_PROPERTY_VALUE_PKGS:
				getOwnedPropertyValuePkgs().clear();
				getOwnedPropertyValuePkgs().addAll((Collection<? extends PropertyValuePkg>)newValue);
				return;
			case DatatypePackage.DATA_TYPE__OWNED_DATA_VALUES:
				getOwnedDataValues().clear();
				getOwnedDataValues().addAll((Collection<? extends DataValue>)newValue);
				return;
			case DatatypePackage.DATA_TYPE__DISCRETE:
				setDiscrete((Boolean)newValue);
				return;
			case DatatypePackage.DATA_TYPE__MIN_INCLUSIVE:
				setMinInclusive((Boolean)newValue);
				return;
			case DatatypePackage.DATA_TYPE__MAX_INCLUSIVE:
				setMaxInclusive((Boolean)newValue);
				return;
			case DatatypePackage.DATA_TYPE__PATTERN:
				setPattern((String)newValue);
				return;
			case DatatypePackage.DATA_TYPE__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case DatatypePackage.DATA_TYPE__DEFAULT_VALUE:
				setDefaultValue((DataValue)newValue);
				return;
			case DatatypePackage.DATA_TYPE__NULL_VALUE:
				setNullValue((DataValue)newValue);
				return;
			case DatatypePackage.DATA_TYPE__REALIZED_DATA_TYPES:
				getRealizedDataTypes().clear();
				getRealizedDataTypes().addAll((Collection<? extends DataType>)newValue);
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
			case DatatypePackage.DATA_TYPE__OWNED_PROPERTY_VALUE_PKGS:
				getOwnedPropertyValuePkgs().clear();
				return;
			case DatatypePackage.DATA_TYPE__OWNED_DATA_VALUES:
				getOwnedDataValues().clear();
				return;
			case DatatypePackage.DATA_TYPE__DISCRETE:
				setDiscrete(DISCRETE_EDEFAULT);
				return;
			case DatatypePackage.DATA_TYPE__MIN_INCLUSIVE:
				setMinInclusive(MIN_INCLUSIVE_EDEFAULT);
				return;
			case DatatypePackage.DATA_TYPE__MAX_INCLUSIVE:
				setMaxInclusive(MAX_INCLUSIVE_EDEFAULT);
				return;
			case DatatypePackage.DATA_TYPE__PATTERN:
				setPattern(PATTERN_EDEFAULT);
				return;
			case DatatypePackage.DATA_TYPE__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case DatatypePackage.DATA_TYPE__DEFAULT_VALUE:
				setDefaultValue((DataValue)null);
				return;
			case DatatypePackage.DATA_TYPE__NULL_VALUE:
				setNullValue((DataValue)null);
				return;
			case DatatypePackage.DATA_TYPE__REALIZED_DATA_TYPES:
				getRealizedDataTypes().clear();
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
			case DatatypePackage.DATA_TYPE__OWNED_PROPERTY_VALUE_PKGS:
				return ownedPropertyValuePkgs != null && !ownedPropertyValuePkgs.isEmpty();
			case DatatypePackage.DATA_TYPE__OWNED_DATA_VALUES:
				return ownedDataValues != null && !ownedDataValues.isEmpty();
			case DatatypePackage.DATA_TYPE__DISCRETE:
				return discrete != DISCRETE_EDEFAULT;
			case DatatypePackage.DATA_TYPE__MIN_INCLUSIVE:
				return minInclusive != MIN_INCLUSIVE_EDEFAULT;
			case DatatypePackage.DATA_TYPE__MAX_INCLUSIVE:
				return maxInclusive != MAX_INCLUSIVE_EDEFAULT;
			case DatatypePackage.DATA_TYPE__PATTERN:
				return PATTERN_EDEFAULT == null ? pattern != null : !PATTERN_EDEFAULT.equals(pattern);
			case DatatypePackage.DATA_TYPE__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case DatatypePackage.DATA_TYPE__DEFAULT_VALUE:
				return defaultValue != null;
			case DatatypePackage.DATA_TYPE__NULL_VALUE:
				return nullValue != null;
			case DatatypePackage.DATA_TYPE__REALIZED_DATA_TYPES:
				return realizedDataTypes != null && !realizedDataTypes.isEmpty();
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
		if (baseClass == Structure.class) {
			switch (derivedFeatureID) {
				case DatatypePackage.DATA_TYPE__OWNED_PROPERTY_VALUE_PKGS: return CapellacorePackage.STRUCTURE__OWNED_PROPERTY_VALUE_PKGS;
				default: return -1;
			}
		}
		if (baseClass == DataValueContainer.class) {
			switch (derivedFeatureID) {
				case DatatypePackage.DATA_TYPE__OWNED_DATA_VALUES: return DatavaluePackage.DATA_VALUE_CONTAINER__OWNED_DATA_VALUES;
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
		if (baseClass == Structure.class) {
			switch (baseFeatureID) {
				case CapellacorePackage.STRUCTURE__OWNED_PROPERTY_VALUE_PKGS: return DatatypePackage.DATA_TYPE__OWNED_PROPERTY_VALUE_PKGS;
				default: return -1;
			}
		}
		if (baseClass == DataValueContainer.class) {
			switch (baseFeatureID) {
				case DatavaluePackage.DATA_VALUE_CONTAINER__OWNED_DATA_VALUES: return DatatypePackage.DATA_TYPE__OWNED_DATA_VALUES;
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
		result.append(" (discrete: ");
		result.append(discrete);
		result.append(", minInclusive: ");
		result.append(minInclusive);
		result.append(", maxInclusive: ");
		result.append(maxInclusive);
		result.append(", pattern: ");
		result.append(pattern);
		result.append(", visibility: ");
		result.append(visibility);
		result.append(')');
		return result.toString();
	}

} //DataTypeImpl
