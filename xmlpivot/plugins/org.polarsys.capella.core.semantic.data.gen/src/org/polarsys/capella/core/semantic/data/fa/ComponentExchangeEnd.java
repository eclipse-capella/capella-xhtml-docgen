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

import org.polarsys.capella.core.semantic.data.capellacore.CapellaElement;

import org.polarsys.capella.core.semantic.data.information.Partition;
import org.polarsys.capella.core.semantic.data.information.Port;

import org.polarsys.capella.core.semantic.data.modellingcore.InformationsExchanger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Exchange End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.fa.ComponentExchangeEnd#getPort <em>Port</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.fa.ComponentExchangeEnd#getPart <em>Part</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.fa.FaPackage#getComponentExchangeEnd()
 * @model
 * @generated
 */
public interface ComponentExchangeEnd extends InformationsExchanger, CapellaElement {
	/**
	 * Returns the value of the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' reference.
	 * @see #setPort(Port)
	 * @see org.polarsys.capella.core.semantic.data.fa.FaPackage#getComponentExchangeEnd_Port()
	 * @model
	 * @generated
	 */
	Port getPort();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.fa.ComponentExchangeEnd#getPort <em>Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' reference.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(Port value);

	/**
	 * Returns the value of the '<em><b>Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part</em>' reference.
	 * @see #setPart(Partition)
	 * @see org.polarsys.capella.core.semantic.data.fa.FaPackage#getComponentExchangeEnd_Part()
	 * @model
	 * @generated
	 */
	Partition getPart();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.fa.ComponentExchangeEnd#getPart <em>Part</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part</em>' reference.
	 * @see #getPart()
	 * @generated
	 */
	void setPart(Partition value);

} // ComponentExchangeEnd
