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

package org.polarsys.capella.core.semantic.data.interaction;

import org.polarsys.capella.core.semantic.data.capellacore.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Combined Fragment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.interaction.CombinedFragment#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.interaction.InteractionPackage#getCombinedFragment()
 * @model
 * @generated
 */
public interface CombinedFragment extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The default value is <code>"UNSET"</code>.
	 * The literals are from the enumeration {@link org.polarsys.capella.core.semantic.data.interaction.InteractionOperatorKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see org.polarsys.capella.core.semantic.data.interaction.InteractionOperatorKind
	 * @see #setOperator(InteractionOperatorKind)
	 * @see org.polarsys.capella.core.semantic.data.interaction.InteractionPackage#getCombinedFragment_Operator()
	 * @model default="UNSET"
	 * @generated
	 */
	InteractionOperatorKind getOperator();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.interaction.CombinedFragment#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see org.polarsys.capella.core.semantic.data.interaction.InteractionOperatorKind
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(InteractionOperatorKind value);

} // CombinedFragment
