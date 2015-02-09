/*******************************************************************************
 * Copyright (c) 2006, 2015 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.capella.transition.system2subsystem.crossphases.rules.epbs;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.core.data.cs.BlockArchitecture;
import org.polarsys.capella.core.data.cs.CsPackage;
import org.polarsys.capella.core.data.epbs.ConfigurationItem;
import org.polarsys.capella.core.data.epbs.EpbsPackage;
import org.polarsys.capella.core.data.pa.PhysicalArchitecture;
import org.polarsys.capella.core.model.helpers.SystemEngineeringExt;
import org.polarsys.capella.core.transition.common.constants.ITransitionConstants;
import org.polarsys.capella.core.transition.common.handlers.contextscope.ContextScopeHandlerHelper;
import org.polarsys.capella.core.transition.common.handlers.transformation.TransformationHandlerHelper;
import org.polarsys.capella.transition.system2subsystem.crossphases.rules.pa.Component2SARule;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;


/**
 * 
 */
public class ConfigurationItemRule extends Component2SARule {

  @Override
  protected EClass getSourceType() {
    return EpbsPackage.Literals.CONFIGURATION_ITEM;
  }

  @Override
  protected void retrieveCurrent(EObject source_p, List<EObject> result_p, IContext context_p) {
    super.retrieveCurrent(source_p, result_p, context_p);
    ContextScopeHandlerHelper.getInstance(context_p).add(ITransitionConstants.SOURCE_SCOPE, source_p, context_p);
  }

  @Override
  protected void retrieveContainer(EObject element_p, List<EObject> result_p, IContext context_p) {
    //Nothing here. We don't want to add container
  }

  @Override
  protected void retrieveRootElement(EObject source_p, List<EObject> result_p, IContext context_p) {
    //Nothing here. We don't want to add container
  }

  /**
   * {@inheritDoc}
   */
  @Override
  protected EObject getDefaultContainer(EObject element_p, EObject result_p, IContext context_p) {
    EObject root = TransformationHandlerHelper.getInstance(context_p).getLevelElement(element_p, context_p);
    BlockArchitecture epbsArchitecture = (BlockArchitecture) root;
    PhysicalArchitecture architecture = SystemEngineeringExt.getPhysicalArchitecture(epbsArchitecture);
    BlockArchitecture target =
        (BlockArchitecture) TransformationHandlerHelper.getInstance(context_p).getBestTracedElement(architecture, context_p,
            CsPackage.Literals.BLOCK_ARCHITECTURE, element_p, result_p);
    return target;
  }

  @Override
  protected void retrieveComponentGoDeep(EObject source_p, List<EObject> result_p, IContext context_p) {
    ConfigurationItem element = (ConfigurationItem) source_p;
    result_p.addAll(element.getAllocatedComponents());
    result_p.addAll(element.getAllocatedInterfaces());
    result_p.addAll(element.getAllocatedFunctions());

    ContextScopeHandlerHelper.getInstance(context_p).addAll(ITransitionConstants.SOURCE_SCOPE, element.getAllocatedComponents(), context_p);
    ContextScopeHandlerHelper.getInstance(context_p).addAll(ITransitionConstants.SOURCE_SCOPE, element.getAllocatedInterfaces(), context_p);
    ContextScopeHandlerHelper.getInstance(context_p).addAll(ITransitionConstants.SOURCE_SCOPE, element.getAllocatedFunctions(), context_p);
  }

}
