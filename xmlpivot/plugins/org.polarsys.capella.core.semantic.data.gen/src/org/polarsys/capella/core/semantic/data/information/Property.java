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

package org.polarsys.capella.core.semantic.data.information;

import org.polarsys.capella.core.semantic.data.capellacore.Feature;
import org.polarsys.capella.core.semantic.data.capellacore.TypedElement;

import org.polarsys.capella.core.semantic.data.modellingcore.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.Property#getAggregationKind <em>Aggregation Kind</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.Property#isIsDerived <em>Is Derived</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.Property#isIsReadOnly <em>Is Read Only</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.Property#isIsPartOfKey <em>Is Part Of Key</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.information.InformationPackage#getProperty()
 * @model
 * @generated
 */
public interface Property extends Feature, TypedElement, MultiplicityElement, ModelElement {
	/**
	 * Returns the value of the '<em><b>Aggregation Kind</b></em>' attribute.
	 * The default value is <code>"UNSET"</code>.
	 * The literals are from the enumeration {@link org.polarsys.capella.core.semantic.data.information.AggregationKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aggregation Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregation Kind</em>' attribute.
	 * @see org.polarsys.capella.core.semantic.data.information.AggregationKind
	 * @see #setAggregationKind(AggregationKind)
	 * @see org.polarsys.capella.core.semantic.data.information.InformationPackage#getProperty_AggregationKind()
	 * @model default="UNSET"
	 * @generated
	 */
	AggregationKind getAggregationKind();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.information.Property#getAggregationKind <em>Aggregation Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregation Kind</em>' attribute.
	 * @see org.polarsys.capella.core.semantic.data.information.AggregationKind
	 * @see #getAggregationKind()
	 * @generated
	 */
	void setAggregationKind(AggregationKind value);

	/**
	 * Returns the value of the '<em><b>Is Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Derived</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Derived</em>' attribute.
	 * @see #setIsDerived(boolean)
	 * @see org.polarsys.capella.core.semantic.data.information.InformationPackage#getProperty_IsDerived()
	 * @model
	 * @generated
	 */
	boolean isIsDerived();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.information.Property#isIsDerived <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Derived</em>' attribute.
	 * @see #isIsDerived()
	 * @generated
	 */
	void setIsDerived(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Read Only</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Read Only</em>' attribute.
	 * @see #setIsReadOnly(boolean)
	 * @see org.polarsys.capella.core.semantic.data.information.InformationPackage#getProperty_IsReadOnly()
	 * @model
	 * @generated
	 */
	boolean isIsReadOnly();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.information.Property#isIsReadOnly <em>Is Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Read Only</em>' attribute.
	 * @see #isIsReadOnly()
	 * @generated
	 */
	void setIsReadOnly(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Part Of Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Part Of Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Part Of Key</em>' attribute.
	 * @see #setIsPartOfKey(boolean)
	 * @see org.polarsys.capella.core.semantic.data.information.InformationPackage#getProperty_IsPartOfKey()
	 * @model
	 * @generated
	 */
	boolean isIsPartOfKey();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.information.Property#isIsPartOfKey <em>Is Part Of Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Part Of Key</em>' attribute.
	 * @see #isIsPartOfKey()
	 * @generated
	 */
	void setIsPartOfKey(boolean value);

} // Property
