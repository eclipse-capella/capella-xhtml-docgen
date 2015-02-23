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
package org.polarsys.capella.xmlpivot.extraction;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EModelElement;

/**
 * A ConceptualMapping decorator that memorizes results for faster lookup.
 * 
 */
public class MemoizingConceptualMapping implements ConceptualMapping {
  
  // caches SIMPLIFIED to TECHNICAL elements
  private final Map<EModelElement, EModelElement> cache = new HashMap<EModelElement, EModelElement>();
  
  private final ConceptualMapping delegate;

  public MemoizingConceptualMapping(ConceptualMapping delegate_p){
    delegate = delegate_p;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public <T extends EModelElement> T getSimplified(T technical_p) {
    return delegate.getSimplified(technical_p);
  }

  /**
   * {@inheritDoc}
   */
  @SuppressWarnings("unchecked")
  @Override
  public <T extends EModelElement> T getTechnical(T simplified_p) {
    if (!cache.containsKey(simplified_p)){
      cache.put(simplified_p, delegate.getTechnical(simplified_p));
    }
    return (T) cache.get(simplified_p);
  }
}
