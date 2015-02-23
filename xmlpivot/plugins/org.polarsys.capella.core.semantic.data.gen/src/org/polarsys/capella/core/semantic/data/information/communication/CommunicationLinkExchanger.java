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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link Exchanger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.information.communication.CommunicationLinkExchanger#getOwnedCommunicationLinks <em>Owned Communication Links</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.information.communication.CommunicationPackage#getCommunicationLinkExchanger()
 * @model abstract="true"
 * @generated
 */
public interface CommunicationLinkExchanger extends EObject {
	/**
	 * Returns the value of the '<em><b>Owned Communication Links</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.information.communication.CommunicationLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Communication Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Communication Links</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.information.communication.CommunicationPackage#getCommunicationLinkExchanger_OwnedCommunicationLinks()
	 * @model containment="true"
	 * @generated
	 */
	EList<CommunicationLink> getOwnedCommunicationLinks();

} // CommunicationLinkExchanger
