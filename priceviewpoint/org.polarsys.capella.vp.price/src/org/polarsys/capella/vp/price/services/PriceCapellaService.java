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
package org.polarsys.capella.vp.price.services;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.core.data.cs.Part;
import org.polarsys.capella.vp.price.generic.IPriceVisitor;
import org.polarsys.capella.vp.price.generic.PriceGenericRootService;
import org.polarsys.capella.vp.price.price.PartPrice;
import org.polarsys.capella.vp.price.price.Price;
import org.polarsys.kitalpha.emde.model.ElementExtension;



public class PriceCapellaService extends PriceGenericRootService {
	
	public PriceCapellaService(){
		super();
		registerVisitor(null);
	}
	
	/**
	 * Visitor
	 */
	
	@Override
	public void registerVisitor(IPriceVisitor iWPVisitor) {
		super.priceVisitor = CapellaPriceVisitor.INSTANCE;
	}
	
	public EObject getPriceObject(EObject eObject) {



		if (eObject instanceof Part)
		{

			final EList<ElementExtension> ownedExtensions = ((Part) eObject).getOwnedExtensions();
			if (ownedExtensions != null && ! ownedExtensions.isEmpty())
			{
				for (ElementExtension extension : ownedExtensions) 
				{
					if (extension instanceof Price)
						return extension;
				}
			}
		}

		if (eObject instanceof Price)
		{
			return eObject;
		}
		return null;
	}
	
	
	
	/**
	 * Adapted Price Services 
	 */
	
	public int computePrice(EObject eObject) {
		int m = super.compute(eObject, getVisitor(), PartPrice.class);
		if (eObject instanceof PartPrice){
			((PartPrice)getPriceObject(eObject)).setCurrentPrice(m);
		}
		return m;
	}
	

	/**
	 * Unused IWPService methods
	 */
	
	public int compute(EObject eObject, IPriceVisitor iWPVisitor) {
		return -1;
	}
}
