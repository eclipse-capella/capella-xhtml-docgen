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

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;

import com.google.common.base.Function;
import com.google.common.collect.Iterators;

/**
 *
 */
public class DefaultIncrementor implements Function<Collection<? extends EObject>, Iterator<? extends EObject>>{
  
  private final Function<Collection<? extends EObject>, Iterator<? extends EObject>> contentIncrementor;
  private final Function<Collection<? extends EObject>, Iterator<? extends EObject>> crossReferenceIncrementor;
  
  public DefaultIncrementor(Collection<? extends EObject> selection_p){    
    contentIncrementor = new AllContentsIncrementor(); 
    crossReferenceIncrementor = new CrossReferenceIncrementor();
  }
  
  /**
   * {@inheritDoc}
   */
  @Override
  public Iterator<? extends EObject> apply(Collection<? extends EObject> input_p) {
    Iterator<? extends EObject> content = contentIncrementor.apply(input_p);
    Iterator<? extends EObject> crossRefs = crossReferenceIncrementor.apply(input_p);
    return Iterators.concat(content, crossRefs);
  }

}
