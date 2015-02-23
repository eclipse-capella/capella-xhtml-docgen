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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generalizable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.capellacore.GeneralizableElement#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.capellacore.GeneralizableElement#getSuper <em>Super</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.capellacore.GeneralizableElement#getSub <em>Sub</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.capellacore.CapellacorePackage#getGeneralizableElement()
 * @model abstract="true"
 * @generated
 */
public interface GeneralizableElement extends Type {
	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see #setAbstract(boolean)
	 * @see org.polarsys.capella.core.semantic.data.capellacore.CapellacorePackage#getGeneralizableElement_Abstract()
	 * @model
	 * @generated
	 */
	boolean isAbstract();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.capellacore.GeneralizableElement#isAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' attribute.
	 * @see #isAbstract()
	 * @generated
	 */
	void setAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Super</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.capellacore.GeneralizableElement}.
	 * It is bidirectional and its opposite is '{@link org.polarsys.capella.core.semantic.data.capellacore.GeneralizableElement#getSub <em>Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.capellacore.CapellacorePackage#getGeneralizableElement_Super()
	 * @see org.polarsys.capella.core.semantic.data.capellacore.GeneralizableElement#getSub
	 * @model opposite="sub"
	 * @generated
	 */
	EList<GeneralizableElement> getSuper();

	/**
	 * Returns the value of the '<em><b>Sub</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.capellacore.GeneralizableElement}.
	 * It is bidirectional and its opposite is '{@link org.polarsys.capella.core.semantic.data.capellacore.GeneralizableElement#getSuper <em>Super</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.capellacore.CapellacorePackage#getGeneralizableElement_Sub()
	 * @see org.polarsys.capella.core.semantic.data.capellacore.GeneralizableElement#getSuper
	 * @model opposite="super"
	 * @generated
	 */
	EList<GeneralizableElement> getSub();

} // GeneralizableElement
