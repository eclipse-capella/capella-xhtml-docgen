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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Union</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.Union#getKind <em>Kind</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.Union#getDiscriminant <em>Discriminant</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.Union#getDefaultProperty <em>Default Property</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.Union#getContainedUnionProperties <em>Contained Union Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.information.InformationPackage#getUnion()
 * @model
 * @generated
 */
public interface Union extends org.polarsys.capella.core.semantic.data.information.Class {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.polarsys.capella.core.semantic.data.information.UnionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.polarsys.capella.core.semantic.data.information.UnionKind
	 * @see #setKind(UnionKind)
	 * @see org.polarsys.capella.core.semantic.data.information.InformationPackage#getUnion_Kind()
	 * @model
	 * @generated
	 */
	UnionKind getKind();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.information.Union#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.polarsys.capella.core.semantic.data.information.UnionKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(UnionKind value);

	/**
	 * Returns the value of the '<em><b>Discriminant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Discriminant</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discriminant</em>' reference.
	 * @see #setDiscriminant(UnionProperty)
	 * @see org.polarsys.capella.core.semantic.data.information.InformationPackage#getUnion_Discriminant()
	 * @model
	 * @generated
	 */
	UnionProperty getDiscriminant();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.information.Union#getDiscriminant <em>Discriminant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discriminant</em>' reference.
	 * @see #getDiscriminant()
	 * @generated
	 */
	void setDiscriminant(UnionProperty value);

	/**
	 * Returns the value of the '<em><b>Default Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Property</em>' reference.
	 * @see #setDefaultProperty(UnionProperty)
	 * @see org.polarsys.capella.core.semantic.data.information.InformationPackage#getUnion_DefaultProperty()
	 * @model
	 * @generated
	 */
	UnionProperty getDefaultProperty();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.information.Union#getDefaultProperty <em>Default Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Property</em>' reference.
	 * @see #getDefaultProperty()
	 * @generated
	 */
	void setDefaultProperty(UnionProperty value);

	/**
	 * Returns the value of the '<em><b>Contained Union Properties</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.information.UnionProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Union Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Union Properties</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.information.InformationPackage#getUnion_ContainedUnionProperties()
	 * @model containment="true"
	 * @generated
	 */
	EList<UnionProperty> getContainedUnionProperties();

} // Union
