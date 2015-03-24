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
import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.common.helpers.EObjectExt;
import org.polarsys.capella.core.data.cs.Component;
import org.polarsys.capella.core.data.cs.Part;
import org.polarsys.capella.core.data.ctx.ActorPkg;
import org.polarsys.capella.core.data.ctx.CtxPackage;
import org.polarsys.capella.core.data.ctx.SystemAnalysis;
import org.polarsys.capella.core.data.information.Partition;
import org.polarsys.capella.core.data.interaction.InteractionPackage;
import org.polarsys.capella.core.data.la.LaPackage;
import org.polarsys.capella.core.data.la.LogicalActorPkg;
import org.polarsys.capella.core.data.la.LogicalArchitecture;
import org.polarsys.capella.core.data.la.LogicalComponent;
import org.polarsys.capella.core.data.la.LogicalComponentPkg;
import org.polarsys.capella.core.data.pa.PaPackage;
import org.polarsys.capella.core.data.pa.PhysicalActorPkg;
import org.polarsys.capella.core.data.pa.PhysicalArchitecture;
import org.polarsys.capella.core.data.pa.PhysicalComponent;
import org.polarsys.capella.core.data.pa.PhysicalComponentPkg;
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

      // Add all instance roles
      if (OptionsHandlerHelper.getInstance(context_p).getBooleanValue(context_p, IOptionsConstants.SYSTEM2SUBSYSTEM_PREFERENCES,
          IOptionsConstants.SCENARIO_EXPORT, IOptionsConstants.SCENARIO_EXPORT_DEFAULT_VALUE)) {
        result_p.addAll(EObjectExt.getReferencers(element, InteractionPackage.Literals.INSTANCE_ROLE__REPRESENTED_INSTANCE));
      }
    }

  }

  @Override
  protected EStructuralFeature getTargetContainementFeature(EObject element_p, EObject result_p, EObject container_p, IContext context_p) {

    if (container_p instanceof SystemAnalysis) {
      return CtxPackage.Literals.SYSTEM_ANALYSIS__OWNED_SYSTEM;

    } else if (container_p instanceof LogicalArchitecture) {
      return LaPackage.Literals.LOGICAL_ARCHITECTURE__OWNED_LOGICAL_COMPONENT;

    } else if (container_p instanceof PhysicalArchitecture) {
      return PaPackage.Literals.PHYSICAL_ARCHITECTURE__OWNED_PHYSICAL_COMPONENT;

    } else if (container_p instanceof ActorPkg) {
      return CtxPackage.Literals.ACTOR_PKG__OWNED_ACTORS;

    } else if (container_p instanceof LogicalActorPkg) {
      return LaPackage.Literals.LOGICAL_ACTOR_PKG__OWNED_LOGICAL_ACTORS;

    } else if (container_p instanceof PhysicalActorPkg) {
      return PaPackage.Literals.PHYSICAL_ACTOR_PKG__OWNED_PHYSICAL_ACTORS;

    } else if (container_p instanceof LogicalComponent) {
      return LaPackage.Literals.LOGICAL_COMPONENT__OWNED_LOGICAL_COMPONENTS;

    } else if (container_p instanceof PhysicalComponent) {
      return PaPackage.Literals.PHYSICAL_COMPONENT__OWNED_PHYSICAL_COMPONENTS;

    } else if (container_p instanceof LogicalComponentPkg) {
      return LaPackage.Literals.LOGICAL_COMPONENT_PKG__OWNED_LOGICAL_COMPONENTS;

    } else if (container_p instanceof PhysicalComponentPkg) {
      return PaPackage.Literals.PHYSICAL_COMPONENT_PKG__OWNED_COMPONENTS;
    }

    return super.getTargetContainementFeature(element_p, result_p, container_p, context_p);
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
