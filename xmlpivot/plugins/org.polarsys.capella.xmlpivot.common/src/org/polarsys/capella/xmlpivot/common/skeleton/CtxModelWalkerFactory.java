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
package org.polarsys.capella.xmlpivot.common.skeleton;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.polarsys.capella.core.data.ctx.util.CtxAdapterFactory;

/**
 */
public class CtxModelWalkerFactory extends CtxAdapterFactory implements ComposeableAdapterFactory {
  
  private final SystemAnalysisWalker systemAnalysisWalker;
  private final SystemWalker systemWalker;
  private final SystemContextWalker systemContextWalker;
  private ComposedAdapterFactory parentAdapterFactory;

  public CtxModelWalkerFactory(SystemAnalysisWalker systemAnalysisWalker_p, 
      SystemWalker systemWalker_p, SystemContextWalker systemContextWalker_p){
    systemAnalysisWalker = systemAnalysisWalker_p;
    systemWalker = systemWalker_p;
    systemContextWalker = systemContextWalker_p;
  }
  
  @Override
  public boolean isFactoryForType(Object object_p) {
    return super.isFactoryForType(object_p) || object_p == ModelWalker.class;
  }

  @Override
  public Adapter createSystemAnalysisAdapter() {
    return systemAnalysisWalker;
  }
  
  @Override
  public Adapter createSystemAdapter(){
    return systemWalker;
  }

  @Override
  public Adapter createSystemContextAdapter(){
    return systemContextWalker;
  }
    
  /**
   * {@inheritDoc}
   */
  @Override
  public ComposeableAdapterFactory getRootAdapterFactory() {
    return parentAdapterFactory;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory_p) {
     parentAdapterFactory = parentAdapterFactory_p;
  }
  
}
