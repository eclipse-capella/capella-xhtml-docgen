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
package org.polarsys.capella.vp.perfo.generic;


import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.vp.perfo.perfo.PerformanceCapacity;
import org.polarsys.capella.vp.perfo.perfo.PerformanceConsumption;


public class GenericPerformanceService{
	
	public static GenericPerformanceService INSTANCE = new GenericPerformanceService();
	
	protected static IPerformanceBrowser _browser;
	
	protected void setBrowser(IPerformanceBrowser browser){
		_browser = browser;
	}
	
	public IPerformanceBrowser getBrowser(){
		return _browser;
	}
	
	/**
	 * This method Check the performance for a given component.
	 */
	
	public int checkPerformance(EObject eObject){

		int totalCns = getTotalCns(eObject);
		/**
		* java.text.DecimalFormat df = new java.text.DecimalFormat("0.#########"); 
		* double temps = System.nanoTime();
		* System.out.println("Element Name : "+((NamedElement)thePart).getName() +", Total Consumption "+totalCns);
		*/
		
//		int capacity = getObjectCapacityValue(eObject);
		
		/**
		 * System.out.print("Element : " + ((NamedElement)thePart).getName());
		 * System.out.println("  Durée d'exécution : "+ df.format((System.nanoTime() - temps )/1000000000) +" secondes");
		 * System.out.println(((NamedElement)thePart).getName() +"(cap:"+ capacity+", Load : "+totalCns+")");
		 */
		
		return totalCns;
		
//		return  capacity > 0 ? (totalCns > capacity ? true : false) : false;
	}
	
	private int getTotalCns(EObject eObject){
		int cnsLeafs = getLeafsConsumption(eObject);
		int cnsSubComponent = subComponentsConsumption(eObject);
		return cnsLeafs + cnsSubComponent;
	}
	
	private int subComponentsConsumption(EObject eObject){
		int totalLeafsCns = 0;

		EList<EObject> subComponentList = _browser.getSubComponentsObjects(eObject);
		
		if (subComponentList != null && 
				subComponentList.size() > 0){
			for (EObject subComponent : subComponentList) {
				totalLeafsCns += getTotalCns(subComponent);
			}
		}

		return totalLeafsCns;
	}
	
	private int getLeafsConsumption(EObject eObject){
		int totalLeafsCns = 0;
		
		EList<EObject> leafs = _browser.getLeafsObjects(eObject);

		if (leafs != null && leafs.size() > 0){
			for (EObject curLeaf : leafs) {
				totalLeafsCns += getLeafConsumptionValue(curLeaf);
			}
		}

		return totalLeafsCns;
	}

	@SuppressWarnings("unused")
	private int getObjectCapacityValue(EObject thePart){
		for (EObject curObjectChild : thePart.eContents()) {
			if (curObjectChild instanceof PerformanceCapacity){
				return ((PerformanceCapacity)curObjectChild).getValue();
			}
		}
		return 0;
	}
	
	private int getLeafConsumptionValue(EObject curLeaf) {
		for (EObject curLeafChild : curLeaf.eContents()) {
			if (curLeafChild instanceof PerformanceConsumption){
				return ((PerformanceConsumption)curLeafChild).getValue();
			}
		}
		return 0;
	}

}
