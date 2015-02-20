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

import org.polarsys.capella.core.semantic.data.capellacore.CapellaElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Physical Link End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.AbstractPhysicalLinkEnd#getInvolvedLinks <em>Involved Links</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.cs.CsPackage#getAbstractPhysicalLinkEnd()
 * @model abstract="true"
 * @generated
 */
public interface AbstractPhysicalLinkEnd extends CapellaElement {
	/**
	 * Returns the value of the '<em><b>Involved Links</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.cs.PhysicalLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Involved Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Involved Links</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.cs.CsPackage#getAbstractPhysicalLinkEnd_InvolvedLinks()
	 * @model
	 * @generated
	 */
	EList<PhysicalLink> getInvolvedLinks();

} // AbstractPhysicalLinkEnd
