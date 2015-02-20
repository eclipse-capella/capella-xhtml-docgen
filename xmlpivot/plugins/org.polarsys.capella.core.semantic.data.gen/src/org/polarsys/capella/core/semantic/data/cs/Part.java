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

import org.eclipse.emf.common.util.EList;

import org.polarsys.capella.core.semantic.data.information.Partition;

import org.polarsys.capella.core.semantic.data.modellingcore.AbstractType;
import org.polarsys.capella.core.semantic.data.modellingcore.InformationsExchanger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.Part#getDeployedParts <em>Deployed Parts</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.Part#getOwnedAbstractType <em>Owned Abstract Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.cs.CsPackage#getPart()
 * @model
 * @generated
 */
public interface Part extends Partition, InformationsExchanger, DeployableElement, DeploymentTarget, AbstractPathInvolvedElement {
	/**
	 * Returns the value of the '<em><b>Deployed Parts</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.cs.Part}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deployed Parts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployed Parts</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.cs.CsPackage#getPart_DeployedParts()
	 * @model
	 * @generated
	 */
	EList<Part> getDeployedParts();

	/**
	 * Returns the value of the '<em><b>Owned Abstract Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Abstract Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Abstract Type</em>' containment reference.
	 * @see #setOwnedAbstractType(AbstractType)
	 * @see org.polarsys.capella.core.semantic.data.cs.CsPackage#getPart_OwnedAbstractType()
	 * @model containment="true"
	 * @generated
	 */
	AbstractType getOwnedAbstractType();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.cs.Part#getOwnedAbstractType <em>Owned Abstract Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Abstract Type</em>' containment reference.
	 * @see #getOwnedAbstractType()
	 * @generated
	 */
	void setOwnedAbstractType(AbstractType value);

} // Part
