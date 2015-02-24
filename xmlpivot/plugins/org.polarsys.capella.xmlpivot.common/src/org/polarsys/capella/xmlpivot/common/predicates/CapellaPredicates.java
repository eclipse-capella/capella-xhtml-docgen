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
package org.polarsys.capella.xmlpivot.common.predicates;

import org.eclipse.emf.ecore.EStructuralFeature;

import com.google.common.base.Predicate;
import org.polarsys.capella.core.model.semantic.SimplifiedCapellaMetadata;

/**
 * <p>
 * <strong>EXPERIMENTAL</strong>. This class or interface has been added as
 * part of a work in progress. There is no guarantee that this API will
 * work or that it will remain the same. Please do not use this API without
 * consulting with the <Your Team Name> team.
 * </p>
 */
public class CapellaPredicates {
  
	private final static Predicate<EStructuralFeature> IS_NAVIGABLE = isNavigable(SimplifiedCapellaMetadata.INSTANCE);
	
	public static Predicate<EStructuralFeature> isNavigable(final SimplifiedCapellaMetadata meta){
	  return new Predicate<EStructuralFeature>(){
      @Override
      public boolean apply(EStructuralFeature input) {
        return meta.isNavigable(input);
      }
	  };
	}
	
	public static Predicate<EStructuralFeature> isNavigable(){
	  return IS_NAVIGABLE;
	}
	
}
