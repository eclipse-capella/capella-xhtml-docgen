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
package org.polarsys.capella.vp.mass.services;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.core.data.cs.Part;
import org.polarsys.capella.vp.mass.generic.IMassVisitor;
import org.polarsys.capella.vp.mass.generic.MassGenericRootService;
import org.polarsys.capella.vp.mass.mass.Mass;
import org.polarsys.capella.vp.mass.mass.PartMass;
import org.polarsys.kitalpha.emde.model.ElementExtension;


public class MassCapellaService extends MassGenericRootService {
	
	public MassCapellaService(){
		super();
		registerVisitor(null);
	}
	
	/**
	 * Visitor
	 */
	
	@Override
	public void registerVisitor(IMassVisitor iMassVisitor) {
		super.massVisitor = CapellaMassVisitor.INSTANCE;
	}
	

	public EObject getMassObject(EObject eObject) {
		

		
		if (eObject instanceof Part)
		{
			
			final EList<ElementExtension> ownedExtensions = ((Part) eObject).getOwnedExtensions();
			if (ownedExtensions != null && ! ownedExtensions.isEmpty())
			{
				for (ElementExtension extension : ownedExtensions) 
				{
					if (extension instanceof Mass)
						return extension;
				}
			}
		}
		
		if (eObject instanceof Mass)
		{
			return eObject;
		}
		return null;
	}
	
	/**
	 * Adapted Weight Services 
	 */
	
	public int computeMass(EObject eObject) {
		int m = super.compute(eObject, getVisitor(), Mass.class);
		((PartMass) getMassObject(eObject)).setCurrentMass(m);
		return m;
	}

	/**
	 * Unused IMassService methods
	 */
	
	public int compute(EObject eObject, IMassVisitor iMassVisitor) {
		return super.compute(eObject, getVisitor(), Mass.class);
	}
}
