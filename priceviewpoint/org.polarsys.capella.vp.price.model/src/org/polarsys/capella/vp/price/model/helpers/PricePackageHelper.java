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
package org.polarsys.capella.vp.price.model.helpers;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.common.model.helpers.IHelper;
import org.polarsys.capella.vp.price.price.PartPrice;
import org.polarsys.capella.vp.price.price.Price;

/**
 * @generated 
 */
public class PricePackageHelper implements IHelper {

	/**
	 * @generated
	 */
	public Object getValue(EObject object, EStructuralFeature feature,
			EAnnotation annotation) {
		Object ret = null;

		if (ret == null && object instanceof Price) {
			ret = PriceHelper.getInstance().doSwitch((Price) object, feature);
		}
		if (ret == null && object instanceof PartPrice) {
			ret = PartPriceHelper.getInstance().doSwitch((PartPrice) object,
					feature);
		}
		return ret;
	}

}
