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

package org.polarsys.capella.core.semantic.data.modellingcore;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Information Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.modellingcore.AbstractInformationFlow#getConvoyedInformations <em>Convoyed Informations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.modellingcore.ModellingcorePackage#getAbstractInformationFlow()
 * @model abstract="true"
 * @generated
 */
public interface AbstractInformationFlow extends AbstractNamedElement, ModelElement {
	/**
	 * Returns the value of the '<em><b>Convoyed Informations</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.modellingcore.AbstractExchangeItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Convoyed Informations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Convoyed Informations</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.modellingcore.ModellingcorePackage#getAbstractInformationFlow_ConvoyedInformations()
	 * @model
	 * @generated
	 */
	EList<AbstractExchangeItem> getConvoyedInformations();

} // AbstractInformationFlow
