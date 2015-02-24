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
import org.polarsys.capella.core.data.capellamodeller.util.CapellamodellerAdapterFactory;

/**
 *
 */
public class CapellamodellerModelWalkerFactory extends CapellamodellerAdapterFactory implements ComposeableAdapterFactory {

  private final ProjectWalker projectWalker;
  private final SystemEngineeringWalker systemEngineeringWalker;

  private ComposeableAdapterFactory parentAdapterFactory;

  /**
   * @param projectWalker_p
   * @param systemEngineeringWalker_p
   */
  public CapellamodellerModelWalkerFactory(ProjectWalker projectWalker_p, SystemEngineeringWalker systemEngineeringWalker_p) {
    projectWalker = projectWalker_p;
    systemEngineeringWalker = systemEngineeringWalker_p;
  }

  @Override
  public boolean isFactoryForType(Object object_p) {
    return super.isFactoryForType(object_p) || (object_p == ModelWalker.class);
  }

  @Override
  public Adapter createProjectAdapter() {
    return projectWalker;
  }

  @Override
  public Adapter createSystemEngineeringAdapter() {
    return systemEngineeringWalker;
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
