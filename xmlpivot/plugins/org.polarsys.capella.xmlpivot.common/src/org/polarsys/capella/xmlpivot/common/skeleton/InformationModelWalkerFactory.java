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
import org.polarsys.capella.core.data.information.util.InformationAdapterFactory;

/**
 *
 */
public class InformationModelWalkerFactory extends InformationAdapterFactory implements ComposeableAdapterFactory {

  private final DataPkgWalker dataPkgWalker;
  
  private ComposeableAdapterFactory parentAdapterFactory;
  
  /**
   * @param dataPkgWalker_p
   */
  public InformationModelWalkerFactory(DataPkgWalker dataPkgWalker_p) {
    dataPkgWalker = dataPkgWalker_p;
  }

  @Override
  public boolean isFactoryForType(Object object_p) {
    return super.isFactoryForType(object_p) || object_p == ModelWalker.class;
  }

  @Override
  public Adapter createDataPkgAdapter() {
    return dataPkgWalker;
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
