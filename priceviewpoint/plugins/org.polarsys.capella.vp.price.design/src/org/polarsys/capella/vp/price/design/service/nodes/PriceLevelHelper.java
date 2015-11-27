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
package org.polarsys.capella.vp.price.design.service.nodes;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.core.data.cs.Part;
import org.polarsys.capella.vp.price.price.PartPrice;
import org.polarsys.capella.vp.price.price.Price;
import org.polarsys.kitalpha.emde.model.ElementExtension;
import org.polarsys.capella.vp.price.services.PriceCapellaService;

public class PriceLevelHelper {
	
	
	private PriceCapellaService maPriceService = new PriceCapellaService();
	
	
	/**
	 * Adapted Weight Services 
	 */
	
	public int computePrice(EObject eObject) {
		int m = maPriceService.computePrice(eObject);
		((PartPrice)maPriceService.getPriceObject(eObject)).setCurrentPrice(m);
		return m;
	}
	
	public boolean isPriceOverhead(EObject eObject, EObject view,
			EObject container) {
		if (eObject instanceof Price){
			return evaluatePriceStatus(eObject, PriceStatus.OVERHEAD);
		}
		
		return computePartStatus((Part)eObject, view, container, PriceStatus.OVERHEAD);
	}


	public boolean isPriceSaturated(EObject eObject, EObject view,
			EObject container) {
		
		if (eObject instanceof Price){
			return evaluatePriceStatus(eObject, PriceStatus.SATURATED);
		}
		
		return computePartStatus((Part)eObject, view, container, PriceStatus.SATURATED);
	}



	private boolean computePartStatus(Part part, EObject view,
			EObject container, PriceStatus flag) {
		
		Price currentPCPrice = getPriceExtension(part);
		
		if (currentPCPrice != null)
			return evaluatePriceStatus(currentPCPrice, flag);
		
		return false;
	}

	private Price getPriceExtension(Part part) {
		
		EList<ElementExtension> extensions = part.getOwnedExtensions();
		
		for (ElementExtension elementExtension : extensions) {
			if (elementExtension instanceof Price)
				return (Price)elementExtension;
		}
		
		return null;
	}
	
	
	private boolean evaluatePriceStatus(EObject eObject, PriceStatus flag){
		
		int current = maPriceService.computePrice(eObject);
		
		if (flag.equals(PriceStatus.OVERHEAD)){
			return current > ((Price) eObject).getMaxValue();
		}
		
		if (flag.equals(PriceStatus.SATURATED)){
			return current != 0 && current == ((Price) eObject).getMaxValue();
		}
		
		//May be a runtimeException
		return false;
	}
	
	private enum PriceStatus {
		OVERHEAD,
		SATURATED
	}
}
