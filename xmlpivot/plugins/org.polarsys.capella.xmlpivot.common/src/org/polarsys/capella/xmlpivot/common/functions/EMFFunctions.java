/*******************************************************************************
 * Copyright (c) 2006, 2015 THALES GLOBAL SERVICES.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *    
 *  Contributors:
 *     Thales - initial API and implementation
 ******************************************************************************/
package org.polarsys.capella.xmlpivot.common.functions;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.google.common.base.Function;

/**
 *
 */
public class EMFFunctions {

	public static Function<Resource,String> resourceToUriString(){
		return new Function<Resource, String>(){
			@Override
			public String apply(Resource input_p) {
				return input_p.getURI().toString();
			}
		};
	}
	
	public static final Function<Resource,String> resourceToNormalizedUriString() {
		return new Function<Resource, String>(){
			@Override
			public String apply(Resource input_p) {
				return input_p.getResourceSet().getURIConverter().normalize(input_p.getURI()).toString();
			}
		};
	}
	
	public static final Function<EObject, String> eObjectToUriString(){
		return new Function<EObject, String>(){
			@Override
			public String apply(EObject input_p) {
				URI u = EcoreUtil.getURI(input_p);
				if (u == null){
					return ""; //$NON-NLS-1$
				}
				return u.toString();
			}
		};
	}
}
