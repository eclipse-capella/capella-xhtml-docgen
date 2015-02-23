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

import org.polarsys.capella.core.semantic.data.capellacore.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Exchange Allocator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.fa.ComponentExchangeAllocator#getAllocatedComponentExchanges <em>Allocated Component Exchanges</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.fa.FaPackage#getComponentExchangeAllocator()
 * @model abstract="true"
 * @generated
 */
public interface ComponentExchangeAllocator extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Allocated Component Exchanges</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.fa.ComponentExchange}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocated Component Exchanges</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocated Component Exchanges</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.fa.FaPackage#getComponentExchangeAllocator_AllocatedComponentExchanges()
	 * @model
	 * @generated
	 */
	EList<ComponentExchange> getAllocatedComponentExchanges();

} // ComponentExchangeAllocator
