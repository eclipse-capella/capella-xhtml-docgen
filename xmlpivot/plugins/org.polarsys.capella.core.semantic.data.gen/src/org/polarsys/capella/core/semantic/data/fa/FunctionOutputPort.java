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

package org.polarsys.capella.core.semantic.data.fa;

import org.eclipse.emf.common.util.EList;

import org.polarsys.capella.core.semantic.data.activity.OutputPin;

import org.polarsys.capella.core.semantic.data.information.ExchangeItem;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Output Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.fa.FunctionOutputPort#getOutgoingExchangeItems <em>Outgoing Exchange Items</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.fa.FaPackage#getFunctionOutputPort()
 * @model
 * @generated
 */
public interface FunctionOutputPort extends FunctionPort, OutputPin {
	/**
	 * Returns the value of the '<em><b>Outgoing Exchange Items</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.information.ExchangeItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Exchange Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Exchange Items</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.fa.FaPackage#getFunctionOutputPort_OutgoingExchangeItems()
	 * @model
	 * @generated
	 */
	EList<ExchangeItem> getOutgoingExchangeItems();

} // FunctionOutputPort
