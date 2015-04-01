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
package org.polarsys.capella.transition.system2subsystem.handlers.attachment;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.core.data.capellacore.NamedElement;
import org.polarsys.capella.core.data.fa.AbstractFunction;
import org.polarsys.capella.core.data.fa.FunctionalChain;
import org.polarsys.capella.core.data.fa.FunctionalChainInvolvement;
import org.polarsys.capella.core.data.fa.FunctionalExchange;
import org.polarsys.capella.core.transition.common.handlers.IHandler;
import org.polarsys.capella.core.transition.common.handlers.contextscope.ContextScopeHandlerHelper;
import org.polarsys.capella.core.transition.common.handlers.contextscope.IContextScopeHandler;
import org.polarsys.capella.core.transition.common.handlers.scope.ScopeHandlerHelper;
import org.polarsys.capella.core.transition.common.handlers.transformation.TransformationHandlerHelper;
import org.polarsys.capella.transition.system2subsystem.constants.ISubSystemConstants;
import org.polarsys.capella.transition.system2subsystem.handlers.scope.ExternalFunctionsScopeRetriever;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;

/**
 * 
 */
public class FunctionalChainAttachmentHelper implements IHandler {

  protected static final String FUNCTIONAL_CHAIN_ATTACHMENT_MAP = "FCAttachmentMap"; //$NON-NLS-1$

  public static FunctionalChainAttachmentHelper getInstance(IContext context_p) {
    FunctionalChainAttachmentHelper handler = (FunctionalChainAttachmentHelper) context_p.get(ISubSystemConstants.FUNCTIONAL_CHAIN_ATTACHMENT_HELPER);
    if (handler == null) {
      handler = new FunctionalChainAttachmentHelper();
      handler.init(context_p);
      context_p.put(ISubSystemConstants.FUNCTIONAL_CHAIN_ATTACHMENT_HELPER, handler);
    }
    return handler;
  }

  public Boolean isValidElement(EObject source, IContext context_p) {
    Boolean cache = getValidityMap(context_p).get(source);
    if (cache == null) {
      cache = Boolean.FALSE;
    }
    return cache;
  }

  public void setValidElement(EObject source, Boolean target, IContext context_p) {
    getValidityMap(context_p).put(source, target);
  }

  @SuppressWarnings("unchecked")
  protected Map<EObject, Boolean> getValidityMap(IContext context_p) {
    Map<EObject, Boolean> res = (Map<EObject, Boolean>) context_p.get(FUNCTIONAL_CHAIN_ATTACHMENT_MAP);
    if (res == null) {
      res = new HashMap<EObject, Boolean>();
      context_p.put(FUNCTIONAL_CHAIN_ATTACHMENT_MAP, res);
    }
    return res;
  }

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
   * Returns whether the involvement can be transitioned (in the scope and involved is transitioned)
   */
  public boolean isValidInvolvement(FunctionalChainInvolvement element_p, IContext context_p) {
    IContextScopeHandler scope = ContextScopeHandlerHelper.getInstance(context_p);
    NamedElement involvedElement = (NamedElement) element_p.getInvolved();

    IStatus willBeTransformed = TransformationHandlerHelper.getInstance(context_p).isOrWillBeTransformed(involvedElement, context_p);

    // First we check the primary scope.
    boolean inScope;

    if (involvedElement instanceof AbstractFunction) {
      inScope = ExternalFunctionsScopeRetriever.isPrimaryFunction((AbstractFunction) involvedElement, context_p);
    } else {
      inScope =
          (scope.contains(ISubSystemConstants.SCOPE_SECONDARY_ELEMENT, involvedElement, context_p) == false)
              && ScopeHandlerHelper.getInstance(context_p).isInScope(involvedElement, context_p);
    }

    // If functional exchange is in scope, the next FunctionalChainInvolvement must be scoped.
    if (inScope && (involvedElement instanceof FunctionalExchange) && (element_p.getNextFunctionalChainInvolvements().isEmpty() == false)) {
      FunctionalChainInvolvement nextFCI = element_p.getNextFunctionalChainInvolvements().get(0);
      boolean nextInScope = isValidInvolvement(nextFCI, context_p);
      if (nextInScope == false) {
        // System.out.println(((NamedElement)element_p.getInvolver()).getName());
        // System.out.println("\t _ " + ((NamedElement)element_p.getInvolved()).getName());
        return false;
      }
    }

    // If not in initial scope, we check the neightbors involvedElements
    if (inScope == false) {

      if (involvedElement instanceof AbstractFunction) {
        // The function is secondary scoped if it is concerned by a scoped FunctionalExchange
        inScope = ExternalFunctionsScopeRetriever.isLinkToPrimaryFunction((AbstractFunction) involvedElement, context_p);

      } else if (involvedElement instanceof FunctionalExchange) {
        // A Functional Exchange will be scoped only if its functions are secondary scoped
        boolean prevScoped = false;
        boolean nextScoped = false;

        for (FunctionalChainInvolvement n : element_p.getNextFunctionalChainInvolvements()) {
          if (ExternalFunctionsScopeRetriever.isLinkToPrimaryFunction((AbstractFunction) n.getInvolved(), context_p)) {
            nextScoped = true;
            break;
          }
        }
        for (FunctionalChainInvolvement p : element_p.getPreviousFunctionalChainInvolvements()) {
          if (ExternalFunctionsScopeRetriever.isLinkToPrimaryFunction((AbstractFunction) p.getInvolved(), context_p)) {
            prevScoped = true;
            break;
          }
        }

        if (prevScoped && nextScoped) {
          inScope = true;
        }
      }

    }

    return inScope && willBeTransformed.isOK();
  }

  /**
   * Put in the map true for all valid functional chain involvement (stop browsing the chain after the first invalid involvement)
   */
  public void computeChain(FunctionalChain element_p, IContext context_p) {
    for (FunctionalChainInvolvement next : element_p.getFirstFunctionalChainInvolvements()) {
      computeChainInternal(next, context_p, null);
    }
  }

  public void computeChainInternal(FunctionalChainInvolvement involmt, IContext context_p, FunctionalChainInvolvement lastValid) {

    // If not already computed
    if (getValidityMap(context_p).get(involmt) != null) {
      return;
    }

    boolean isValid = isValidInvolvement(involmt, context_p) && ((lastValid == null) || (lastValid.getInvolved().equals(involmt.getInvolved()) == false));

    setValidElement(involmt, Boolean.valueOf(isValid), context_p);
    if (isValid) {
      lastValid = involmt;
    }

    try {
      for (FunctionalChainInvolvement next : involmt.getNextFunctionalChainInvolvements()) {
        computeChainInternal(next, context_p, lastValid);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }

  }

  public Collection<FunctionalChainInvolvement> getNextValid(FunctionalChainInvolvement fci, IContext context_p) {
    Collection<FunctionalChainInvolvement> res = new ArrayList<FunctionalChainInvolvement>();

    getNextValidInternal(fci, context_p, res);

    return res;
  }

  private void getNextValidInternal(FunctionalChainInvolvement fci, IContext context_p, Collection<FunctionalChainInvolvement> res) {
    if ((fci.getNextFunctionalChainInvolvements() != null) && (fci.getNextFunctionalChainInvolvements().isEmpty() == false)) {
      for (FunctionalChainInvolvement next : fci.getNextFunctionalChainInvolvements()) {
        if (next != null) {
          if (isValidElement(next, context_p)) {
            res.add(next);
          } else {
            getNextValidInternal(next, context_p, res);
          }
        }
      }
    }
  }

  public Collection<FunctionalChainInvolvement> getPreviousValid(FunctionalChainInvolvement fci, IContext context_p) {
    Collection<FunctionalChainInvolvement> res = new ArrayList<FunctionalChainInvolvement>();

    getPreviousValidInternal(fci, context_p, res);

    return res;
  }

  private void getPreviousValidInternal(FunctionalChainInvolvement fci, IContext context_p, Collection<FunctionalChainInvolvement> res) {
    if ((fci.getPreviousFunctionalChainInvolvements() != null) && (fci.getPreviousFunctionalChainInvolvements().isEmpty() == false)) {
      for (FunctionalChainInvolvement prev : fci.getPreviousFunctionalChainInvolvements()) {
        if (prev != null) {
          if (isValidElement(prev, context_p)) {
            res.add(prev);
          } else {
            getPreviousValidInternal(prev, context_p, res);
          }
        }
      }
    }
  }
}
