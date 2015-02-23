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

package org.polarsys.capella.core.semantic.data.information.communication;

import org.eclipse.emf.common.util.EList;

import org.polarsys.capella.core.semantic.data.modellingcore.AbstractType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.communication.Signal#getSignalInstances <em>Signal Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.information.communication.CommunicationPackage#getSignal()
 * @model
 * @generated
 */
public interface Signal extends CommunicationItem, AbstractType {
	/**
	 * Returns the value of the '<em><b>Signal Instances</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.information.communication.SignalInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signal Instances</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signal Instances</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.information.communication.CommunicationPackage#getSignal_SignalInstances()
	 * @model containment="true"
	 * @generated
	 */
	EList<SignalInstance> getSignalInstances();

} // Signal
