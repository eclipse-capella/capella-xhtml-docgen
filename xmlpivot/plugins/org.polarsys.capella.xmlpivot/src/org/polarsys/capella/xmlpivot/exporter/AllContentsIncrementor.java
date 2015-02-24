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
package org.polarsys.capella.xmlpivot.exporter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

import com.google.common.base.Function;
import org.polarsys.capella.core.model.semantic.SimplifiedCapellaMetadata;

/**
 *
 */
public class AllContentsIncrementor implements Function<Collection <? extends EObject>, Iterator<? extends EObject>> {
  
  @Override
  public Iterator<? extends EObject> apply(Collection<? extends EObject> input_p) {
    List<EObject> contents = new ArrayList<EObject>();
    for (EObject e : input_p){
      for (EReference ref : e.eClass().getEAllReferences()){
       
        if (SimplifiedCapellaMetadata.INSTANCE.isContainment(ref) && SimplifiedCapellaMetadata.INSTANCE.isNavigable(ref)){
          
          if (e.eIsSet(ref)){
            if (ref.isMany()){
              contents.addAll((List)e.eGet(ref));
            } else {
              contents.add((EObject) e.eGet(ref));
            }
          }
        }
      }
    }
    return contents.iterator();
  }

}
