/*******************************************************************************
 * Copyright (c) 2006, 2015 Thales Global Services
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v1.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v10.html
 * 
 *   Contributors:
 *      Thales - initial API and implementation
 ******************************************************************************/
// Generated on 20.08.2015 at 04:49:15 CEST by Viewpoint DSL Generator V 0.1

package org.polarsys.capella.vp.price.design.service.tools;

import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.vp.price.helpers.PriceCreationToolHelper;

/**
 * <!-- begin-user-doc -->
 * This class is an implementation of the DoReMi JavaExtension '<em><b>[org.polarsys.capella.vp.price.design.service.tools.OpenActionService]</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */

public class OpenActionService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param element : the element
	 * @param newSemanticContainer : the element view
	 * @generated NOT
	 */
	public boolean createPC_Price(EObject element, EObject newSemanticContainer) {
		PriceCreationToolHelper priceCreationToolHelper = new PriceCreationToolHelper();
		priceCreationToolHelper.createPrice(element, 2);

		return true;
	}
}