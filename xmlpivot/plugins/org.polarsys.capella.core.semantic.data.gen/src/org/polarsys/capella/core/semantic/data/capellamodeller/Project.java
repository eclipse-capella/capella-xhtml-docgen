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

package org.polarsys.capella.core.semantic.data.capellamodeller;

import org.eclipse.emf.common.util.EList;

import org.polarsys.capella.core.semantic.data.capellacore.KeyValue;
import org.polarsys.capella.core.semantic.data.capellacore.Structure;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.capellamodeller.Project#getKeyValuePairs <em>Key Value Pairs</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.capellamodeller.Project#getOwnedModelRoots <em>Owned Model Roots</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.capellamodeller.CapellamodellerPackage#getProject()
 * @model
 * @generated
 */
public interface Project extends Structure {
	/**
	 * Returns the value of the '<em><b>Key Value Pairs</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.capellacore.KeyValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key Value Pairs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Value Pairs</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.capellamodeller.CapellamodellerPackage#getProject_KeyValuePairs()
	 * @model containment="true"
	 * @generated
	 */
	EList<KeyValue> getKeyValuePairs();

	/**
	 * Returns the value of the '<em><b>Owned Model Roots</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.capellamodeller.ModelRoot}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Model Roots</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Model Roots</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.capellamodeller.CapellamodellerPackage#getProject_OwnedModelRoots()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModelRoot> getOwnedModelRoots();

} // Project
