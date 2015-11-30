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

import java.util.HashMap;
import java.util.Map;

import org.polarsys.capella.vp.mass.mass.Mass;


public class MassServiceFactory {

	public static MassServiceFactory INSTANCE = new MassServiceFactory();
	
	Map<Class<?>, IMassService> massServiceList = new HashMap<Class<?>, IMassService>();

	public void registerMassService(Class<?> cls, IMassService iMassService){
		massServiceList.put(cls, iMassService);
	}

	public void unregisterMassService(Class<?> cls){
		massServiceList.remove(cls);
	}

	public IMassService getServiceFor(Class<?> cls){
		
		IMassService iMassService = massServiceList.get(cls);
		
		if (iMassService == null)
		{
			// Try to verify super classes
			if (cls.isInterface())
			{
				iMassService = massServiceList.get(cls.getSuperclass());
			}
			else
			{
				for (Class<?> i : cls.getInterfaces()) 
				{
					for (Class<?> j : i.getInterfaces()) 
					{
						if (j.equals(Mass.class))
						{
							iMassService = massServiceList.get(j);
							break;
						}
					}
				}
			}
		}
		
		return iMassService;
	}

}
