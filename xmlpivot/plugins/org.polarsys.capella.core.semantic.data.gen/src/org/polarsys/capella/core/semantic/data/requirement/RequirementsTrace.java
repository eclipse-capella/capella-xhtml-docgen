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

package org.polarsys.capella.core.semantic.data.requirement;

import org.polarsys.capella.core.semantic.data.capellacore.CapellaElement;

import org.polarsys.capella.core.semantic.data.modellingcore.ModelElement;
import org.polarsys.capella.core.semantic.data.modellingcore.TraceableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirements Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.requirement.RequirementsTrace#getSource <em>Source</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.requirement.RequirementsTrace#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.requirement.RequirementPackage#getRequirementsTrace()
 * @model
 * @generated
 */
public interface RequirementsTrace extends CapellaElement, TraceableElement, ModelElement {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(TraceableElement)
	 * @see org.polarsys.capella.core.semantic.data.requirement.RequirementPackage#getRequirementsTrace_Source()
	 * @model resolveProxies="false" required="true"
	 * @generated
	 */
	TraceableElement getSource();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.requirement.RequirementsTrace#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(TraceableElement value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(TraceableElement)
	 * @see org.polarsys.capella.core.semantic.data.requirement.RequirementPackage#getRequirementsTrace_Target()
	 * @model resolveProxies="false" required="true"
	 * @generated
	 */
	TraceableElement getTarget();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.requirement.RequirementsTrace#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TraceableElement value);

} // RequirementsTrace
