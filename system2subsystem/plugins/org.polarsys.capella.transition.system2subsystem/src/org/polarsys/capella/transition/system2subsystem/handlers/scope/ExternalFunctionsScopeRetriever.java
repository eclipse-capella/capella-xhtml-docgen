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
package org.polarsys.capella.transition.system2subsystem.handlers.scope;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.common.data.activity.ActivityEdge;
import org.polarsys.capella.core.data.fa.AbstractFunction;
import org.polarsys.capella.core.data.fa.FunctionInputPort;
import org.polarsys.capella.core.data.fa.FunctionOutputPort;
import org.polarsys.capella.core.data.fa.FunctionalChain;
import org.polarsys.capella.core.data.fa.FunctionalExchange;
import org.polarsys.capella.core.data.helpers.fa.services.FunctionExt;
import org.polarsys.capella.core.model.helpers.FunctionalExchangeExt;
import org.polarsys.capella.core.transition.common.constants.ITransitionConstants;
import org.polarsys.capella.core.transition.common.handlers.contextscope.ContextScopeHandlerHelper;
import org.polarsys.capella.core.transition.common.handlers.contextscope.IContextScopeHandler;
import org.polarsys.capella.core.transition.common.handlers.scope.IScopeRetriever;
import org.polarsys.capella.core.transition.common.rules.AbstractRule;
import org.polarsys.capella.transition.system2subsystem.constants.ISubSystemConstants;
import org.polarsys.kitalpha.transposer.rules.handler.api.IRulesHandler;
import org.polarsys.kitalpha.transposer.rules.handler.exceptions.possibilities.MappingPossibilityResolutionException;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IRule;
import org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingPossibility;

/**
 * A scope retriever to retrieve all exchanges that can be reused as a FakeExchange while FunctionalChain processing
 */
public class ExternalFunctionsScopeRetriever implements IScopeRetriever {

  /**
   * {@inheritDoc}
   */
  public IStatus init(IContext context_p) {
    return Status.OK_STATUS;
  }

  /**
   * {@inheritDoc}
   */
  public IStatus dispose(IContext context_p) {
    return Status.OK_STATUS;
  }

  /**
   * {@inheritDoc}
   */
  public Collection<? extends EObject> retrieveRelatedElements(EObject source_p, IContext context_p) {
    Collection<EObject> result = new LinkedList<EObject>();

    return result;
  }

  protected Collection<FunctionalChain> getFunctionalChains(Collection<FunctionalExchange> srcs) {
    Collection<FunctionalChain> res = new ArrayList<FunctionalChain>();

    for (FunctionalExchange fe : srcs) {
      res.addAll(fe.getInvolvingFunctionalChains());
    }
    return res;
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

  protected Collection<FunctionalExchange> getFE(AbstractFunction function, IContext context_p) {
    Collection<FunctionalExchange> res = new ArrayList<FunctionalExchange>();
    res.addAll(FunctionExt.getIncomingExchange(function));
    res.addAll(FunctionExt.getOutGoingExchange(function));
    return res;
  }

  /**
   * {@inheritDoc}
   */
  public Collection<? extends EObject> retrieveSharedElements(IContext context_p) {

    HashSet<EObject> result = new HashSet<EObject>();
    Collection<AbstractFunction> linkToPrimary = new ArrayList<AbstractFunction>();

    IContextScopeHandler scope = ContextScopeHandlerHelper.getInstance(context_p);
    for (EObject object : scope.getCollection(ITransitionConstants.SOURCE_SCOPE, context_p)) {

      if (object instanceof AbstractFunction) {
        AbstractFunction element = (AbstractFunction) object;

        for (FunctionalExchange exchange : getFE(element, context_p)) {
          AbstractFunction source = (AbstractFunction) exchange.getSource().eContainer();
          AbstractFunction target = (AbstractFunction) exchange.getTarget().eContainer();
          AbstractFunction opposite = element.equals(target) ? source : target;
          if (isLinkToPrimaryFunction(opposite, context_p)) {
            linkToPrimary.add(opposite);
          }
        }
      }
    }

    for (AbstractFunction function : linkToPrimary) {
      scope.add(ISubSystemConstants.SCOPE_SECONDARY_ELEMENT, function, context_p);

      for (FunctionalExchange exchange : getFE(function, context_p)) {
        if (!scope.contains(ITransitionConstants.SOURCE_SCOPE, exchange, context_p)) {

          AbstractFunction source = (AbstractFunction) exchange.getSource().eContainer();
          AbstractFunction target = (AbstractFunction) exchange.getTarget().eContainer();
          AbstractFunction opposite = function.equals(target) ? source : target;

          if (isLinkToPrimaryFunction(opposite, context_p)) {

            Collection<FunctionalExchange> srcFes = getFE(source, context_p);
            Collection<FunctionalExchange> trgFes = getFE(target, context_p);

            Collection<FunctionalChain> srcFcs = getFunctionalChains(srcFes);
            Collection<FunctionalChain> trgFcs = getFunctionalChains(trgFes);
            Collection<FunctionalChain> feFcs = exchange.getInvolvingFunctionalChains();

            Collection<FunctionalChain> retained = new ArrayList<FunctionalChain>();
            retained.addAll(feFcs);
            retained.retainAll(srcFcs);
            retained.retainAll(trgFcs);

            if (!retained.isEmpty()) {

              for (EObject related : getRelatedElements(exchange)) {
                if (!scope.contains(ITransitionConstants.SOURCE_SCOPE, related, context_p)) {
                  scope.add(ISubSystemConstants.SCOPE_SECONDARY_ELEMENT, related, context_p);
                }
                result.add(related);
              }

              if (!scope.contains(ITransitionConstants.SOURCE_SCOPE, source, context_p)) {
                scope.add(ISubSystemConstants.SCOPE_SECONDARY_ELEMENT, source, context_p);
                result.add(source);
              }
              if (!scope.contains(ITransitionConstants.SOURCE_SCOPE, target, context_p)) {
                scope.add(ISubSystemConstants.SCOPE_SECONDARY_ELEMENT, target, context_p);
                result.add(target);
              }
              if (!scope.contains(ITransitionConstants.SOURCE_SCOPE, exchange, context_p)) {
                scope.add(ISubSystemConstants.SCOPE_SECONDARY_ELEMENT, exchange, context_p);
                result.add(exchange);
              }
            }
          }
        }
      }
    }

    ensureTransposer(result, context_p);
    return result;
  }

  /**
   * This method ensure that the IContext is correctly setted in the rules that will transform elements before premices computation
   */
  protected void ensureTransposer(Collection<EObject> elements_p, IContext context_p) {
    IRulesHandler ruleHandler = (IRulesHandler) context_p.get(ITransitionConstants.RULES_HANDLER);
    for (EObject object : elements_p) {
      try {
        if (object != null) {
          MappingPossibility mapping = ruleHandler.getApplicablePossibility(object);
          if (mapping != null) {
            IRule<?> rule = ruleHandler.getApplicablePossibility(object).getCompleteRule();
            if ((rule != null) && (rule instanceof AbstractRule)) {
              AbstractRule deeperRule = (AbstractRule) rule;
              deeperRule.retrieveContainers(object, context_p);
            }
          }
        }
      } catch (MappingPossibilityResolutionException exception_p) {
        // Nothing to report
      }
    }

  }

  protected Collection<EObject> getRelatedElements(FunctionalExchange exchange_p) {
    Collection<EObject> result = new ArrayList<EObject>();
    result.add(exchange_p);
    result.addAll(exchange_p.getExchangedItems());
    result.addAll(exchange_p.getCategories());

    result.add(FunctionalExchangeExt.getSourceFunction(exchange_p));
    result.add(FunctionalExchangeExt.getTargetFunction(exchange_p));

    if (exchange_p.getTarget() instanceof FunctionInputPort) {
      result.add(exchange_p.getTarget());
      result.addAll(((FunctionInputPort) exchange_p.getTarget()).getIncomingExchangeItems());
    }
    if (exchange_p.getSource() instanceof FunctionOutputPort) {
      result.add(exchange_p.getSource());
      result.addAll(((FunctionOutputPort) exchange_p.getSource()).getOutgoingExchangeItems());
    }

    return result;
  }

  public static boolean isLinkToPrimaryFunction(AbstractFunction function, IContext context_p) {
    Collection<ActivityEdge> edges = new ArrayList<ActivityEdge>();
    edges.addAll(function.getIncoming());
    edges.addAll(function.getOutgoing());
    IContextScopeHandler scope = ContextScopeHandlerHelper.getInstance(context_p);

    for (ActivityEdge edge : edges) {
      if (edge instanceof FunctionalExchange) {
        FunctionalExchange fe = (FunctionalExchange) edge;

        AbstractFunction opposite = null;
        if (fe.getSource().eContainer().equals(function)) {
          opposite = (AbstractFunction) fe.getTarget().eContainer();
        } else {
          opposite = (AbstractFunction) fe.getSource().eContainer();
        }

        if (scope.contains(ITransitionConstants.SOURCE_SCOPE, opposite, context_p)) {
          return true;
        }
      }
    }

    return false;
  }

  /**
   * @param exchange_p
   * @param context_p
   * @return
   */
  public static boolean isLinkToPrimaryFunction(FunctionalExchange exchange_p, IContext context_p) {
    AbstractFunction source = FunctionalExchangeExt.getSourceFunction(exchange_p);
    AbstractFunction target = FunctionalExchangeExt.getTargetFunction(exchange_p);

    if (isPrimaryFunction(source, context_p)) {
      return !isPrimaryFunction(target, context_p);
    }
    if (isPrimaryFunction(target, context_p)) {
      return !isPrimaryFunction(source, context_p);
    }
    return false;
  }

  public static boolean isPrimaryExchange(FunctionalExchange exchange_p, IContext context_p) {
    AbstractFunction source = FunctionalExchangeExt.getSourceFunction(exchange_p);
    AbstractFunction target = FunctionalExchangeExt.getTargetFunction(exchange_p);

    return isPrimaryFunction(source, context_p) && isPrimaryFunction(target, context_p);
  }

  /**
   * @param involvedElement_p
   * @param context_p
   * @return
   */
  public static boolean isPrimaryFunction(AbstractFunction function, IContext context_p) {
    return ContextScopeHandlerHelper.getInstance(context_p).contains(ITransitionConstants.SOURCE_SCOPE, function, context_p);
  }

}
