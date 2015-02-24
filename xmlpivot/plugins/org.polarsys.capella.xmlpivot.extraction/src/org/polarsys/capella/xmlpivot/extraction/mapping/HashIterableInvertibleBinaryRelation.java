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
package org.polarsys.capella.xmlpivot.extraction.mapping;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.diffmerge.util.structures.HashInvertibleBinaryRelation;
import org.eclipse.emf.ecore.EObject;

public class HashIterableInvertibleBinaryRelation extends HashInvertibleBinaryRelation<EObject, EObject> {

  public EMap<EObject, List<EObject>> getContents() {
    return ECollections.<EObject, List<EObject>> unmodifiableEMap(_contents);
  }
  
  /**
   * Returns a snapshot set of all values of a certain type in this relation.
   * 
   * The returned set will not be maintained in synchronization with the relation, so
   * subsequend modifications to the relation will not be reflected in the result.
   * 
   * @param clazz the type for which to filter the values
   * @return
   */
  public <T extends EObject> Set<T> getValues(Class<T> clazz){
    Set<T> f = new HashSet<T>();
    for (Map.Entry<EObject, List<EObject>> entry : _contents.entrySet()){
      for (EObject e : entry.getValue()){
        if (clazz.isInstance(e)){
          f.add(clazz.cast(e));
        }
      }
    }
    return f;
  }

  public int removeMappingsToTarget(EObject target) {
    int counter = 0;
    List<EObject> sourceLst = super.getInverse(target);
    for (EObject sourceElm : new ArrayList<EObject>(sourceLst)) {
      super.remove(sourceElm, target);
      counter++;
      if ( get(sourceElm).isEmpty() ) {
        _contents.removeKey(sourceElm);
      }
    }
    
    return counter;
  }

  public int removeMappingsFromSource(EObject source) {
    int counter = 0;
    List<EObject> targetLst = super.get(source);
    for (EObject targetElm : new ArrayList<EObject>(targetLst)) {
      super.remove(source, targetElm);
      counter++;
    }
    return counter;
  }

}
