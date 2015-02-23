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
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.polarsys.capella.core.data.la.util.LaAdapterFactory;

/**
 *
 */
public class LaModelWalkerFactory extends LaAdapterFactory implements ComposeableAdapterFactory {

  private final LogicalArchitectureWalker logicalArchitectureWalker;
  private final LogicalContextWalker logicalContextWalker;
  private final LogicalFunctionPkgWalker logicalFunctionPkgWalker;
  private ComposeableAdapterFactory parentAdapterFactory;
  
  /**
   * @param logicalArchitectureWalker_p
   * @param logicalContextWalker_p
   * @param logicalFunctionPkgWalker_p
   */
  public LaModelWalkerFactory(LogicalArchitectureWalker logicalArchitectureWalker_p, LogicalContextWalker logicalContextWalker_p,
      LogicalFunctionPkgWalker logicalFunctionPkgWalker_p) {
    logicalArchitectureWalker = logicalArchitectureWalker_p;
    logicalContextWalker = logicalContextWalker_p;
    logicalFunctionPkgWalker = logicalFunctionPkgWalker_p;
  }

  @Override
  public boolean isFactoryForType(Object object_p) {
    return super.isFactoryForType(object_p) || object_p == ModelWalker.class;
  }

  @Override
  public Adapter createLogicalArchitectureAdapter() {
    return logicalArchitectureWalker;
  }

  @Override
  public Adapter createLogicalContextAdapter(){
    return logicalContextWalker;
  }
  
  @Override
  public Adapter createLogicalFunctionPkgAdapter(){
    return logicalFunctionPkgWalker;
  }
  
  @Override
  protected void associate(Adapter adapter_p, Notifier target_p) {
     /* we don't want to associate ever */
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
