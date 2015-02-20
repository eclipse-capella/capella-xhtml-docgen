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
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.activity.ActivityNode#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.activity.ActivityNode#getIncoming <em>Incoming</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.activity.ActivityPackage#getActivityNode()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ActivityNode extends AbstractNamedElement {
	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.activity.ActivityEdge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.activity.ActivityPackage#getActivityNode_Outgoing()
	 * @model
	 * @generated
	 */
	EList<ActivityEdge> getOutgoing();

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.activity.ActivityEdge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.activity.ActivityPackage#getActivityNode_Incoming()
	 * @model
	 * @generated
	 */
	EList<ActivityEdge> getIncoming();

} // ActivityNode
