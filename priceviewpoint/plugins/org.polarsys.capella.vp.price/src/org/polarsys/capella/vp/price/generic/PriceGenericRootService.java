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
package org.polarsys.capella.vp.price.generic;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.core.data.cs.Part;
import org.polarsys.capella.vp.price.price.Price;
import org.polarsys.kitalpha.emde.model.ElementExtension;


public abstract class PriceGenericRootService implements IPriceService{

	/**
	 * Derived classes have to manage (implement, create and set) her proper Visitor
	 */
	public IPriceVisitor priceVisitor = null;
	
	public PriceServiceFactory priceServiceFactory = PriceServiceFactory.INSTANCE;
	
	/**
	 * Constructor
	 */
	public PriceGenericRootService(){
		priceServiceFactory.registerPriceService(Price.class, new PriceService());
	}
	
	public IPriceVisitor getVisitor(){
		return priceVisitor;
	}
	
	/* To be implemented by derived services */
	
	public abstract void registerVisitor(IPriceVisitor iPriceVisitor);
	
	/*******************
	 * Service methods *
	 *******************/
	
	public int compute(EObject eObject, IPriceVisitor iPriceVisitor, Class<?> context){
		IPriceService _service = getServiceForObject(eObject, context);
		if (_service != null){
			return _service.compute(eObject, iPriceVisitor);
		}
		return -1;
	}
	
	/*****************
	 * Class methods *
	 *****************/
	
	/**
	 * If eObject parameter is a Price Object --> 
	 * 		return the associated service, 
	 * else 
	 * 		Look for a Price Object in eContents of the eObject parameter
	 * 			if found then 
	 * 				return the service associated with the found Price Object
	 * 			else 
	 * 				Print the ServiceForObjectNotFoundException Stack
	 * @param eObject
	 * @return null or the a IPriceService for the current Price object
	 */
	public IPriceService getServiceForObject(EObject eObject, Class<?> cls){
		try {
			return ServiceSwitcher(eObject);
		} catch (ServiceForObjectNotFoundException e) {
			for (EObject eO : eObject.eContents()) {
				boolean go = false;
				if (cls.isInterface()){
					for (Class<?> i : eO.getClass().getSuperclass().getInterfaces()) {
						if (i.equals(cls)){
							go = true;
							break;
						}
					}					
				}else {
					if (eO.getClass().getSuperclass().equals(cls)){
						go = true;
					}
				}

				if (go){
					try {
						return ServiceSwitcher(eO);
					} catch (ServiceForObjectNotFoundException e1) {
						e1.printStackTrace();
					}
				}
			}
			return null;
		}
	}

	/**
	 * Return an IPriceService that handle the eObject parameter (Price object) 
	 * @param eObject : any EObject 
	 * @return The IPriceService defined for the class of eObject parameter
	 * @throws ServiceForObjectNotFoundException : when this exception occur, it mean 
	 * that the eObject parameter is not a Price Object 
	 */
	protected IPriceService ServiceSwitcher(EObject eObject) throws ServiceForObjectNotFoundException{
		if (eObject instanceof Price && !(eObject instanceof Part)){
			return priceServiceFactory.getServiceFor(eObject.getClass());
		}
		
		if (eObject instanceof Part){
			EList<ElementExtension> extensions = ((Part)eObject).getOwnedExtensions();
			
			for (ElementExtension elementExtension : extensions) {
				if (elementExtension instanceof Price){
					return priceServiceFactory.getServiceFor(elementExtension.getClass());
				}
			}
		}
		
		// This exception is triggered only if the eObject parameter is'nt a Price Object 
		throw new ServiceForObjectNotFoundException();
	}
}

