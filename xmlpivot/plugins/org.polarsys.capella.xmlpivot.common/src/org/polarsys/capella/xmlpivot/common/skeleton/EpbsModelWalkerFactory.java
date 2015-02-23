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

import org.polarsys.capella.core.data.epbs.util.EpbsAdapterFactory;

/**
 *
 */
public class EpbsModelWalkerFactory extends EpbsAdapterFactory implements ComposeableAdapterFactory {

  private final EPBSArchitectureWalker epbsArchitectureWalker;  
  private final EPBSContextWalker epbsContextWalker;
  
  private ComposeableAdapterFactory parentAdapterFactory;
  
  /**
   * @param epbsArchitectureWalker_p
   * @param epbsContextWalker_p
   */
  public EpbsModelWalkerFactory(EPBSArchitectureWalker epbsArchitectureWalker_p, EPBSContextWalker epbsContextWalker_p) {
    super();
    epbsArchitectureWalker = epbsArchitectureWalker_p;
    epbsContextWalker = epbsContextWalker_p;
  }

  @Override
  public boolean isFactoryForType(Object object_p) {
    return super.isFactoryForType(object_p) || object_p == ModelWalker.class;
  }

  @Override
  public Adapter createEPBSArchitectureAdapter() {
    return epbsArchitectureWalker;
  }

  @Override
  public Adapter createEPBSContextAdapter(){
    return epbsContextWalker;
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
