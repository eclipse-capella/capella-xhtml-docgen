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

package org.polarsys.capella.core.semantic.data.capellacore;

import org.eclipse.emf.common.util.EList;

import org.polarsys.capella.core.semantic.data.capellacommon.GenericTrace;

import org.polarsys.capella.core.semantic.data.requirement.RequirementsTrace;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Namespace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.capellacore.Namespace#getContainedGenericTraces <em>Contained Generic Traces</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.capellacore.Namespace#getContainedRequirementsTraces <em>Contained Requirements Traces</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.capellacore.CapellacorePackage#getNamespace()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Namespace extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Contained Generic Traces</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.capellacommon.GenericTrace}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Generic Traces</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Generic Traces</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.capellacore.CapellacorePackage#getNamespace_ContainedGenericTraces()
	 * @model containment="true"
	 * @generated
	 */
	EList<GenericTrace> getContainedGenericTraces();

	/**
	 * Returns the value of the '<em><b>Contained Requirements Traces</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.requirement.RequirementsTrace}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Requirements Traces</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Requirements Traces</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.capellacore.CapellacorePackage#getNamespace_ContainedRequirementsTraces()
	 * @model containment="true"
	 * @generated
	 */
	EList<RequirementsTrace> getContainedRequirementsTraces();

} // Namespace
