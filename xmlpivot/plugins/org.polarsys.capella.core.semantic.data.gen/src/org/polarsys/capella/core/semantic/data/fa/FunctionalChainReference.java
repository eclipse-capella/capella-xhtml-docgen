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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Functional Chain Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.fa.FunctionalChainReference#getReferencedFunctionalChain <em>Referenced Functional Chain</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.fa.FaPackage#getFunctionalChainReference()
 * @model
 * @generated
 */
public interface FunctionalChainReference extends FunctionalChainInvolvement {
	/**
	 * Returns the value of the '<em><b>Referenced Functional Chain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Functional Chain</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Functional Chain</em>' reference.
	 * @see #setReferencedFunctionalChain(FunctionalChain)
	 * @see org.polarsys.capella.core.semantic.data.fa.FaPackage#getFunctionalChainReference_ReferencedFunctionalChain()
	 * @model
	 * @generated
	 */
	FunctionalChain getReferencedFunctionalChain();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.fa.FunctionalChainReference#getReferencedFunctionalChain <em>Referenced Functional Chain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Functional Chain</em>' reference.
	 * @see #getReferencedFunctionalChain()
	 * @generated
	 */
	void setReferencedFunctionalChain(FunctionalChain value);

} // FunctionalChainReference
