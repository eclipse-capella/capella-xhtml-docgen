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
package org.polarsys.capella.vp.mass.generic;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.core.data.cs.Part;
import org.polarsys.capella.vp.mass.mass.Mass;
import org.polarsys.kitalpha.emde.model.ElementExtension;


public abstract class MassGenericRootService implements IMassService{

	/**
	 * Derived classes have to manage (implement, create and set) her proper Visitor
	 */
	public IMassVisitor massVisitor = null;
	
	public MassServiceFactory massServiceFactory = MassServiceFactory.INSTANCE;
	
	/**
	 * Constructor
	 */
	public MassGenericRootService(){
		massServiceFactory.registerMassService(Mass.class, new MassService());
	}
	
	public IMassVisitor getVisitor(){
		return massVisitor;
	}
	
	/* To be implemented by derived services */
	
	public abstract void registerVisitor(IMassVisitor imassVisitor);
	
	/*******************
	 * Service methods *
	 *******************/
	
	public int compute(EObject eObject, IMassVisitor iMassVisitor, Class<?> context){
		IMassService _service = getServiceForObject(eObject, context);
		if (_service != null)
			return _service.compute(eObject, iMassVisitor);
		
		return -1;
	}

	
	/*****************
	 * Class methods *
	 *****************/
	
	/**
	 * If eObject parameter is a Mass Object --> 
	 * 		return the associated service, 
	 * else 
	 * 		Look for a Mass Object in eContents of the eObject parameter
	 * 			if found then 
	 * 				return the service associated with the found Mass Object
	 * 			else 
	 * 				Print the ServiceForObjectNotFoundException Stack
	 * @param eObject
	 * @return null or the a IMassService for the current MassCriteria object
	 */
	public IMassService getServiceForObject(EObject eObject, Class<?> clazz){
		try {
			return ServiceSwitcher(eObject);
		} 
		catch (ServiceForObjectNotFoundException e) 
		{
			for (EObject eO : eObject.eContents()) 
			{
				boolean go = false;
				if (clazz.isInterface())
				{
					for (Class<?> i : eO.getClass().getSuperclass().getInterfaces()) 
					{
						if (i.equals(clazz))
						{
							go = true;
							break;
						}
					}					
				}
				else 
				{
					if (eO.getClass().getSuperclass().equals(clazz))
						go = true;
				}

				if (go)
				{
					try 
					{
						return ServiceSwitcher(eO);
					} 
					catch (ServiceForObjectNotFoundException e1) 
					{
						e1.printStackTrace();
					}
				}
			}
			return null;
		}
	}

	/**
	 * Return an IMassService that handle the eObject parameter (Mass object) 
	 * @param eObject : any EObject 
	 * @return The IMassService defined for the class of eObject parameter
	 * @throws ServiceForObjectNotFoundException : when this exception occur, it mean 
	 * that the eObject parameter is not a Mass Object 
	 */
	protected IMassService ServiceSwitcher(EObject eObject) throws ServiceForObjectNotFoundException{
		
		if (eObject instanceof Mass && !(eObject instanceof Part)){
			return massServiceFactory.getServiceFor(eObject.getClass());
		}
		
		if (eObject instanceof Part){
			EList<ElementExtension> extensions = ((Part)eObject).getOwnedExtensions();
			
			for (ElementExtension elementExtension : extensions) {
				if (elementExtension instanceof Mass){
					return massServiceFactory.getServiceFor(elementExtension.getClass());
				}
			}
		}
		
		// This exception is triggered only if the eObject parameter is'nt a Mass Object 
		throw new ServiceForObjectNotFoundException();
	}
}

