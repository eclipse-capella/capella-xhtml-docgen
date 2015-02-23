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
package org.polarsys.capella.core.semantic.data.activity;

import org.eclipse.emf.common.util.EList;

import org.polarsys.capella.core.semantic.data.modellingcore.AbstractNamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.activity.AbstractAction#getInputs <em>Inputs</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.activity.AbstractAction#getOutputs <em>Outputs</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.activity.ActivityPackage#getAbstractAction()
 * @model abstract="true"
 * @generated
 */
public interface AbstractAction extends AbstractNamedElement, ActivityNode {
	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.activity.InputPin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inputs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.activity.ActivityPackage#getAbstractAction_Inputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<InputPin> getInputs();

	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.activity.OutputPin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outputs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputs</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.activity.ActivityPackage#getAbstractAction_Outputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<OutputPin> getOutputs();

} // AbstractAction
