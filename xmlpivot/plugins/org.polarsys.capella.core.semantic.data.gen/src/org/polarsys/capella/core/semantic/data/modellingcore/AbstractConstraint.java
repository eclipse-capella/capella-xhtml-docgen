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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.modellingcore.AbstractConstraint#getConstrainedElements <em>Constrained Elements</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.modellingcore.AbstractConstraint#getOwnedSpecification <em>Owned Specification</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.modellingcore.ModellingcorePackage#getAbstractConstraint()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface AbstractConstraint extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Constrained Elements</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.modellingcore.ModelElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constrained Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constrained Elements</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.modellingcore.ModellingcorePackage#getAbstractConstraint_ConstrainedElements()
	 * @model
	 * @generated
	 */
	EList<ModelElement> getConstrainedElements();

	/**
	 * Returns the value of the '<em><b>Owned Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Specification</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Specification</em>' containment reference.
	 * @see #setOwnedSpecification(ValueSpecification)
	 * @see org.polarsys.capella.core.semantic.data.modellingcore.ModellingcorePackage#getAbstractConstraint_OwnedSpecification()
	 * @model containment="true"
	 * @generated
	 */
	ValueSpecification getOwnedSpecification();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.modellingcore.AbstractConstraint#getOwnedSpecification <em>Owned Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Specification</em>' containment reference.
	 * @see #getOwnedSpecification()
	 * @generated
	 */
	void setOwnedSpecification(ValueSpecification value);

} // AbstractConstraint
