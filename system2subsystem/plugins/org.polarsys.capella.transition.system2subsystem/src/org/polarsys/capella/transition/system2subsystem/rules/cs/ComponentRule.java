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
package org.polarsys.capella.transition.system2subsystem.rules.cs;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.common.helpers.EObjectExt;
import org.polarsys.capella.core.data.cs.Component;
import org.polarsys.capella.core.data.cs.Part;
import org.polarsys.capella.core.data.information.Partition;
import org.polarsys.capella.core.data.interaction.InteractionPackage;
import org.polarsys.capella.core.model.helpers.ComponentExt;
import org.polarsys.capella.core.transition.common.constants.ITransitionConstants;
import org.polarsys.capella.core.transition.common.handlers.contextscope.ContextScopeHandlerHelper;
import org.polarsys.capella.core.transition.common.handlers.contextscope.IContextScopeHandler;
import org.polarsys.capella.core.transition.common.handlers.options.OptionsHandlerHelper;
import org.polarsys.capella.transition.system2subsystem.constants.IOptionsConstants;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;


public class ComponentRule extends org.polarsys.capella.core.transition.system.rules.cs.ComponentRule {

  @Override
  protected void retrieveComponentGoDeep(EObject source_p, List<EObject> result_p, IContext context_p) {

    Component element = (Component) source_p;
    super.retrieveComponentGoDeep(source_p, result_p, context_p);

    result_p.addAll(element.getRepresentingPartitions());
    result_p.addAll(element.getFunctionalAllocations());
    result_p.addAll(element.getUsedInterfaceLinks());
    result_p.addAll(element.getImplementedInterfaceLinks());

    IContextScopeHandler handler = ContextScopeHandlerHelper.getInstance(context_p);

    if (handler.contains(ITransitionConstants.SOURCE_SCOPE, element, context_p)) {

      // Retrieve state machines of reference components
      String value =
          OptionsHandlerHelper.getInstance(context_p).getStringValue(context_p, IOptionsConstants.SYSTEM2SUBSYSTEM_PREFERENCES,
              IOptionsConstants.STATE_MODES_EXPORT, IOptionsConstants.STATE_MODES_DEFAULT_VALUE);

      if (IOptionsConstants.STATE_MODES_ONLY_REFERENCES_VALUE.equals(value)) {
        result_p.addAll(element.getOwnedStateMachines());
        handler.addAll(ITransitionConstants.SOURCE_SCOPE, element.getOwnedStateMachines(), context_p);

      } else if (IOptionsConstants.STATE_MODES_HIERARCHICAL_VALUE.equals(value)) {
        result_p.addAll(element.getOwnedStateMachines());
        handler.addAll(ITransitionConstants.SOURCE_SCOPE, element.getOwnedStateMachines(), context_p);

        for (Component ancestor : getComponentAncestors(element)) {
          result_p.addAll(ancestor.getOwnedStateMachines());
          handler.addAll(ITransitionConstants.SOURCE_SCOPE, ancestor.getOwnedStateMachines(), context_p);
        }
      }

      //Add all instance roles
      if (OptionsHandlerHelper.getInstance(context_p).getBooleanValue(context_p, IOptionsConstants.SYSTEM2SUBSYSTEM_PREFERENCES,
          IOptionsConstants.SCENARIO_EXPORT, IOptionsConstants.SCENARIO_EXPORT_DEFAULT_VALUE)) {
        result_p.addAll(EObjectExt.getReferencers(element, InteractionPackage.Literals.INSTANCE_ROLE__REPRESENTED_INSTANCE));
      }
    }

  }

  private Collection<Component> getComponentAncestors(Component component_p) {
    Collection<Component> result = new HashSet<Component>();

    for (Partition partition : component_p.getRepresentingPartitions()) {
      if (partition instanceof Part) {
        for (Part componentAncestor : ComponentExt.getPartAncestors((Part) partition)) {

          if ((componentAncestor.getAbstractType() != null) && (componentAncestor.getAbstractType() instanceof Component)) {
            result.add((Component) componentAncestor.getAbstractType());
          }
        }
      }
    }

    return result;

  }

}
