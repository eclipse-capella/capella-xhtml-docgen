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
package org.polarsys.capella.transition.system2subsystem.rules.fa;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.osgi.util.NLS;
import org.polarsys.capella.common.data.activity.ActivityEdge;
import org.polarsys.capella.common.helpers.EObjectExt;
import org.polarsys.capella.core.data.capellacore.Involvement;
import org.polarsys.capella.core.data.capellacore.InvolverElement;
import org.polarsys.capella.core.data.fa.AbstractFunction;
import org.polarsys.capella.core.data.fa.FunctionalChain;
import org.polarsys.capella.core.data.fa.FunctionalChainInvolvement;
import org.polarsys.capella.core.data.fa.FunctionalExchange;
import org.polarsys.capella.core.data.helpers.fa.services.FunctionExt;
import org.polarsys.capella.core.data.interaction.AbstractCapability;
import org.polarsys.capella.core.data.interaction.AbstractFunctionAbstractCapabilityInvolvement;
import org.polarsys.capella.core.data.interaction.InteractionPackage;
import org.polarsys.capella.core.model.helpers.AbstractFunctionExt;
import org.polarsys.capella.core.model.helpers.BlockArchitectureExt;
import org.polarsys.capella.core.transition.common.constants.ITransitionConstants;
import org.polarsys.capella.core.transition.common.constants.Messages;
import org.polarsys.capella.core.transition.common.handlers.contextscope.ContextScopeHandlerHelper;
import org.polarsys.capella.core.transition.common.handlers.contextscope.IContextScopeHandler;
import org.polarsys.capella.core.transition.common.handlers.log.LogHelper;
import org.polarsys.capella.core.transition.common.handlers.options.OptionsHandlerHelper;
import org.polarsys.capella.core.transition.common.handlers.scope.IScopeHandler;
import org.polarsys.capella.core.transition.common.handlers.scope.ScopeHandlerHelper;
import org.polarsys.capella.transition.system2subsystem.constants.IOptionsConstants;
import org.polarsys.capella.transition.system2subsystem.constants.ISubSystemConstants;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;


/**
 * 
 */
public class AbstractFunctionRule extends org.polarsys.capella.core.transition.system.rules.fa.AbstractFunctionRule {

  /**
   * {@inheritDoc}
   */
  @Override
  public IStatus transformRequired(EObject source_p, IContext context_p) {
    AbstractFunction function = (AbstractFunction) source_p;

    IStatus result = super.transformRequired(source_p, context_p);

    if (result.isOK()) {

      String value =
          OptionsHandlerHelper.getInstance(context_p).getStringValue(context_p, IOptionsConstants.SYSTEM2SUBSYSTEM_PREFERENCES,
              IOptionsConstants.HIERARCHICAL_EXPORT, IOptionsConstants.HIERARCHICAL_EXPORT_DEFAULT_VALUE);

      // if hierarchical function is "HIERARCHICAL_EXPORT_RESTRICTED_VALUE", we perform transition only leaf
      // functions.
      if (IOptionsConstants.HIERARCHICAL_EXPORT_RESTRICTED_VALUE.equals(value)) {
        if (!AbstractFunctionExt.isLeaf(function)) {
          IScopeHandler scope = ScopeHandlerHelper.getInstance(context_p);
          if (scope != null) {
            for (AbstractFunction child : FunctionExt.getAllAbstractFunctions(function)) {
              if (AbstractFunctionExt.isLeaf(child) && !scope.isInScope(child, context_p)) {
                return new Status(IStatus.WARNING, Messages.Activity_Transformation, NLS.bind("All leaf functions of ''{0}'' are not transitioned.", LogHelper
                    .getInstance().getText(source_p)));
              }
            }
          }
        }
      }

    }

    return result;
  }

  @Override
  protected void retrieveContainer(EObject element_p, List<EObject> result_p, IContext context_p) {
    // According to preference, behavior is different
    String value =
        OptionsHandlerHelper.getInstance(context_p).getStringValue(context_p, IOptionsConstants.SYSTEM2SUBSYSTEM_PREFERENCES,
            IOptionsConstants.HIERARCHICAL_EXPORT, IOptionsConstants.HIERARCHICAL_EXPORT_DEFAULT_VALUE);

    if (BlockArchitectureExt.getRootFunction(BlockArchitectureExt.getRootBlockArchitecture(element_p)) == element_p) {
      return;
    }
    if (IOptionsConstants.HIERARCHICAL_EXPORT_LEAF_VALUE.equals(value)) {
      return;

    } else if (IOptionsConstants.HIERARCHICAL_EXPORT_ALWAYS_VALUE.equals(value)) {
      super.retrieveContainer(element_p, result_p, context_p);

    } else if (IOptionsConstants.HIERARCHICAL_EXPORT_RESTRICTED_VALUE.equals(value)) {
      super.retrieveContainer(element_p, result_p, context_p);
    }
  }

  @Override
  protected void retrieveGoDeep(EObject source_p, List<EObject> result_p, IContext context_p) {
    IContextScopeHandler scope = ContextScopeHandlerHelper.getInstance(context_p);
    AbstractFunction element = (AbstractFunction) source_p;

    boolean isLinkToPrimary = isLinkToPrimaryFunction(element, context_p);
    boolean isPrimary =
        scope.contains(ITransitionConstants.SOURCE_SCOPE, element, context_p)
            && (scope.contains(ISubSystemConstants.SCOPE_SECONDARY_ELEMENT, element, context_p) == false);

    if (isLinkToPrimary || isPrimary) {
      result_p.addAll(element.getComponentFunctionalAllocations());

      if (isPrimary) {
        super.retrieveGoDeep(source_p, result_p, context_p);

        for (Involvement involvement : element.getInvolvingInvolvements()) {
          InvolverElement fc = involvement.getInvolver();

          // Add all involving FunctionalChains
          if (involvement instanceof FunctionalChainInvolvement) {
            if ((fc != null) && (fc instanceof FunctionalChain)) {
              result_p.add(fc);
            }
          }

          // Add all involving Capabilities
          if (involvement instanceof AbstractFunctionAbstractCapabilityInvolvement) {
            if ((fc != null) && (fc instanceof AbstractCapability)) {
              result_p.add(fc);
            }
          }
        }

        if (OptionsHandlerHelper.getInstance(context_p).getBooleanValue(context_p, IOptionsConstants.SYSTEM2SUBSYSTEM_PREFERENCES,
            IOptionsConstants.SCENARIO_EXPORT, IOptionsConstants.SCENARIO_EXPORT_DEFAULT_VALUE)) {
          // Add all instance roles
          result_p.addAll(EObjectExt.getReferencers(element, InteractionPackage.Literals.INSTANCE_ROLE__REPRESENTED_INSTANCE));
        }
      } else if (isLinkToPrimary) {
        scope.add(ISubSystemConstants.SCOPE_SECONDARY_ELEMENT, element, context_p);
        addPotentialsFEToScope(element, context_p, result_p);
      }

      for (Involvement involvement : element.getInvolvingInvolvements()) {
        // Add all involving Capabilities
        if (involvement instanceof AbstractFunctionAbstractCapabilityInvolvement) {
          result_p.add(involvement);
        }
      }
    }
  }

  /**
   * @param function
   * @param context_p
   * @return scoped FE linked to this function
   */
  protected Collection<FunctionalExchange> getScopedFE(AbstractFunction function, IContext context_p) {
    IContextScopeHandler scope = ContextScopeHandlerHelper.getInstance(context_p);
    Collection<FunctionalExchange> res = new ArrayList<FunctionalExchange>();

    Collection<ActivityEdge> edges = new ArrayList<ActivityEdge>();
    edges.addAll(function.getIncoming());
    edges.addAll(function.getOutgoing());

    for (ActivityEdge edge : edges) {
      if (edge instanceof FunctionalExchange) {
        if (scope.contains(ITransitionConstants.SOURCE_SCOPE, edge, context_p)) {
          res.add((FunctionalExchange) edge);
        }
      }
    }

    return res;
  }

  protected boolean isLinkToPrimaryFunction(AbstractFunction function, IContext context_p) {
    IContextScopeHandler scope = ContextScopeHandlerHelper.getInstance(context_p);
    Collection<ActivityEdge> edges = new ArrayList<ActivityEdge>();
    edges.addAll(function.getIncoming());
    edges.addAll(function.getOutgoing());

    for (ActivityEdge edge : edges) {
      if (edge instanceof FunctionalExchange) {
        FunctionalExchange fe = (FunctionalExchange) edge;

        AbstractFunction opposite = null;
        if (fe.getSource().eContainer().equals(function)) {
          opposite = (AbstractFunction) fe.getTarget().eContainer();
        } else {
          opposite = (AbstractFunction) fe.getSource().eContainer();
        }

        if (scope.contains(ITransitionConstants.SOURCE_SCOPE, opposite, context_p)
            && (scope.contains(ISubSystemConstants.SCOPE_SECONDARY_ELEMENT, opposite, context_p) == false)) {
          return true;
        }
      }
    }

    return false;
  }

  protected void addPotentialsFEToScope(AbstractFunction function, IContext context_p, List<EObject> result_p) {
    IContextScopeHandler scope = ContextScopeHandlerHelper.getInstance(context_p);

    Collection<ActivityEdge> edges = new ArrayList<ActivityEdge>();
    edges.addAll(function.getIncoming());
    edges.addAll(function.getOutgoing());

    for (ActivityEdge edge : edges) {
      if (edge instanceof FunctionalExchange) {
        FunctionalExchange fe = (FunctionalExchange) edge;

        if (scope.contains(ITransitionConstants.SOURCE_SCOPE, fe, context_p) == false) {
          AbstractFunction opposite = null;
          if (fe.getSource().eContainer().equals(function)) {
            opposite = (AbstractFunction) fe.getTarget().eContainer();
          } else {
            opposite = (AbstractFunction) fe.getSource().eContainer();
          }

          if (isLinkToPrimaryFunction(opposite, context_p)) {
            Collection<FunctionalExchange> srcFes = getScopedFE(function, context_p);
            Collection<FunctionalExchange> trgFes = getScopedFE(opposite, context_p);

            Collection<FunctionalChain> srcFcs = getFunctionalChains(srcFes);
            Collection<FunctionalChain> trgFcs = getFunctionalChains(trgFes);
            Collection<FunctionalChain> feFcs = fe.getInvolvingFunctionalChains();

            Collection<FunctionalChain> retained = new ArrayList<FunctionalChain>();
            retained.addAll(feFcs);
            retained.retainAll(srcFcs);
            retained.retainAll(trgFcs);

            if (retained.isEmpty() == false) {
              result_p.add(fe.getTarget());
              result_p.add(fe.getSource());
              result_p.add(fe);

              if (scope.contains(ITransitionConstants.SOURCE_SCOPE, fe.getTarget(), context_p) == false) {
                scope.add(ISubSystemConstants.SCOPE_SECONDARY_ELEMENT, fe.getTarget(), context_p);
                scope.add(ITransitionConstants.SOURCE_SCOPE, fe.getTarget(), context_p);
              }

              if (scope.contains(ITransitionConstants.SOURCE_SCOPE, fe.getSource(), context_p) == false) {
                scope.add(ISubSystemConstants.SCOPE_SECONDARY_ELEMENT, fe.getSource(), context_p);
                scope.add(ITransitionConstants.SOURCE_SCOPE, fe.getSource(), context_p);
              }

              if (scope.contains(ITransitionConstants.SOURCE_SCOPE, fe, context_p) == false) {
                scope.add(ISubSystemConstants.SCOPE_SECONDARY_ELEMENT, fe, context_p);
                scope.add(ITransitionConstants.SOURCE_SCOPE, fe, context_p);
              }
            }
          }
        }
      }
    }
  }

  protected Collection<FunctionalChain> getFunctionalChains(Collection<FunctionalExchange> srcs) {
    Collection<FunctionalChain> res = new ArrayList<FunctionalChain>();

    for (FunctionalExchange fe : srcs) {
      res.addAll(fe.getInvolvingFunctionalChains());
    }

    return res;

  }
}
