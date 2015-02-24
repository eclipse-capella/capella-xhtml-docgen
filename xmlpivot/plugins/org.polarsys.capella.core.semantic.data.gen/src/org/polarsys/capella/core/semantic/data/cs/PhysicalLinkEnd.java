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

package org.polarsys.capella.core.semantic.data.cs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Physical Link End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.PhysicalLinkEnd#getPort <em>Port</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.PhysicalLinkEnd#getPart <em>Part</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.cs.CsPackage#getPhysicalLinkEnd()
 * @model
 * @generated
 */
public interface PhysicalLinkEnd extends AbstractPhysicalLinkEnd {
	/**
	 * Returns the value of the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' reference.
	 * @see #setPort(PhysicalPort)
	 * @see org.polarsys.capella.core.semantic.data.cs.CsPackage#getPhysicalLinkEnd_Port()
	 * @model
	 * @generated
	 */
	PhysicalPort getPort();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.cs.PhysicalLinkEnd#getPort <em>Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' reference.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(PhysicalPort value);

	/**
	 * Returns the value of the '<em><b>Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part</em>' reference.
	 * @see #setPart(Part)
	 * @see org.polarsys.capella.core.semantic.data.cs.CsPackage#getPhysicalLinkEnd_Part()
	 * @model
	 * @generated
	 */
	Part getPart();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.cs.PhysicalLinkEnd#getPart <em>Part</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part</em>' reference.
	 * @see #getPart()
	 * @generated
	 */
	void setPart(Part value);

} // PhysicalLinkEnd
