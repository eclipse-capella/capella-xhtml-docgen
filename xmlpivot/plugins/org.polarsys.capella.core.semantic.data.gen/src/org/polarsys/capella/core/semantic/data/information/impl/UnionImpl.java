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
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.capella.core.semantic.data.information.InformationPackage;
import org.polarsys.capella.core.semantic.data.information.Union;
import org.polarsys.capella.core.semantic.data.information.UnionKind;
import org.polarsys.capella.core.semantic.data.information.UnionProperty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Union</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.impl.UnionImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.impl.UnionImpl#getDiscriminant <em>Discriminant</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.impl.UnionImpl#getDefaultProperty <em>Default Property</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.impl.UnionImpl#getContainedUnionProperties <em>Contained Union Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnionImpl extends ClassImpl implements Union {
	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final UnionKind KIND_EDEFAULT = UnionKind.UNION;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected UnionKind kind = KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDiscriminant() <em>Discriminant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscriminant()
	 * @generated
	 * @ordered
	 */
	protected UnionProperty discriminant;

	/**
	 * The cached value of the '{@link #getDefaultProperty() <em>Default Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultProperty()
	 * @generated
	 * @ordered
	 */
	protected UnionProperty defaultProperty;

	/**
	 * The cached value of the '{@link #getContainedUnionProperties() <em>Contained Union Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedUnionProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<UnionProperty> containedUnionProperties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InformationPackage.Literals.UNION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnionKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(UnionKind newKind) {
		UnionKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InformationPackage.UNION__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnionProperty getDiscriminant() {
		if (discriminant != null && discriminant.eIsProxy()) {
			InternalEObject oldDiscriminant = (InternalEObject)discriminant;
			discriminant = (UnionProperty)eResolveProxy(oldDiscriminant);
			if (discriminant != oldDiscriminant) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InformationPackage.UNION__DISCRIMINANT, oldDiscriminant, discriminant));
			}
		}
		return discriminant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnionProperty basicGetDiscriminant() {
		return discriminant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiscriminant(UnionProperty newDiscriminant) {
		UnionProperty oldDiscriminant = discriminant;
		discriminant = newDiscriminant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InformationPackage.UNION__DISCRIMINANT, oldDiscriminant, discriminant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnionProperty getDefaultProperty() {
		if (defaultProperty != null && defaultProperty.eIsProxy()) {
			InternalEObject oldDefaultProperty = (InternalEObject)defaultProperty;
			defaultProperty = (UnionProperty)eResolveProxy(oldDefaultProperty);
			if (defaultProperty != oldDefaultProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InformationPackage.UNION__DEFAULT_PROPERTY, oldDefaultProperty, defaultProperty));
			}
		}
		return defaultProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnionProperty basicGetDefaultProperty() {
		return defaultProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultProperty(UnionProperty newDefaultProperty) {
		UnionProperty oldDefaultProperty = defaultProperty;
		defaultProperty = newDefaultProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InformationPackage.UNION__DEFAULT_PROPERTY, oldDefaultProperty, defaultProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UnionProperty> getContainedUnionProperties() {
		if (containedUnionProperties == null) {
			containedUnionProperties = new EObjectContainmentEList<UnionProperty>(UnionProperty.class, this, InformationPackage.UNION__CONTAINED_UNION_PROPERTIES);
		}
		return containedUnionProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InformationPackage.UNION__CONTAINED_UNION_PROPERTIES:
				return ((InternalEList<?>)getContainedUnionProperties()).basicRemove(otherEnd, msgs);
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
			case InformationPackage.UNION__KIND:
				return getKind();
			case InformationPackage.UNION__DISCRIMINANT:
				if (resolve) return getDiscriminant();
				return basicGetDiscriminant();
			case InformationPackage.UNION__DEFAULT_PROPERTY:
				if (resolve) return getDefaultProperty();
				return basicGetDefaultProperty();
			case InformationPackage.UNION__CONTAINED_UNION_PROPERTIES:
				return getContainedUnionProperties();
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
			case InformationPackage.UNION__KIND:
				setKind((UnionKind)newValue);
				return;
			case InformationPackage.UNION__DISCRIMINANT:
				setDiscriminant((UnionProperty)newValue);
				return;
			case InformationPackage.UNION__DEFAULT_PROPERTY:
				setDefaultProperty((UnionProperty)newValue);
				return;
			case InformationPackage.UNION__CONTAINED_UNION_PROPERTIES:
				getContainedUnionProperties().clear();
				getContainedUnionProperties().addAll((Collection<? extends UnionProperty>)newValue);
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
			case InformationPackage.UNION__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case InformationPackage.UNION__DISCRIMINANT:
				setDiscriminant((UnionProperty)null);
				return;
			case InformationPackage.UNION__DEFAULT_PROPERTY:
				setDefaultProperty((UnionProperty)null);
				return;
			case InformationPackage.UNION__CONTAINED_UNION_PROPERTIES:
				getContainedUnionProperties().clear();
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
			case InformationPackage.UNION__KIND:
				return kind != KIND_EDEFAULT;
			case InformationPackage.UNION__DISCRIMINANT:
				return discriminant != null;
			case InformationPackage.UNION__DEFAULT_PROPERTY:
				return defaultProperty != null;
			case InformationPackage.UNION__CONTAINED_UNION_PROPERTIES:
				return containedUnionProperties != null && !containedUnionProperties.isEmpty();
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
		result.append(" (kind: ");
		result.append(kind);
		result.append(')');
		return result.toString();
	}

} //UnionImpl
