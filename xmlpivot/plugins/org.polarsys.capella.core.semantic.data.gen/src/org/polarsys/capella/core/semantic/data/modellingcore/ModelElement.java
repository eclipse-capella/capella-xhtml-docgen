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

package org.polarsys.capella.core.semantic.data.modellingcore;

import org.eclipse.emf.common.util.EList;

import org.polarsys.capella.core.semantic.data.emde.ExtensibleElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.modellingcore.ModelElement#getId <em>Id</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.modellingcore.ModelElement#getSid <em>Sid</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.modellingcore.ModelElement#getOwnedConstraints <em>Owned Constraints</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.modellingcore.ModellingcorePackage#getModelElement()
 * @model abstract="true"
 * @generated
 */
public interface ModelElement extends ExtensibleElement {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.polarsys.capella.core.semantic.data.modellingcore.ModellingcorePackage#getModelElement_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.modellingcore.ModelElement#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sid</em>' attribute.
	 * @see #setSid(String)
	 * @see org.polarsys.capella.core.semantic.data.modellingcore.ModellingcorePackage#getModelElement_Sid()
	 * @model
	 * @generated
	 */
	String getSid();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.modellingcore.ModelElement#getSid <em>Sid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sid</em>' attribute.
	 * @see #getSid()
	 * @generated
	 */
	void setSid(String value);

	/**
	 * Returns the value of the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.modellingcore.AbstractConstraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Constraints</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.modellingcore.ModellingcorePackage#getModelElement_OwnedConstraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractConstraint> getOwnedConstraints();

} // ModelElement
