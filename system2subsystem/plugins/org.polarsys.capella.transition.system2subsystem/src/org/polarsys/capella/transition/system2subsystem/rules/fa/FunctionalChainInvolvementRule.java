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
import java.util.Iterator;
import java.util.LinkedList;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.osgi.util.NLS;
import org.polarsys.capella.common.data.activity.AbstractAction;
import org.polarsys.capella.common.data.activity.InputPin;
import org.polarsys.capella.common.data.activity.OutputPin;
import org.polarsys.capella.core.data.capellacore.InvolvedElement;
import org.polarsys.capella.core.data.capellacore.NamedElement;
import org.polarsys.capella.core.data.fa.AbstractFunction;
import org.polarsys.capella.core.data.fa.FaFactory;
import org.polarsys.capella.core.data.fa.FunctionInputPort;
import org.polarsys.capella.core.data.fa.FunctionOutputPort;
import org.polarsys.capella.core.data.fa.FunctionPort;
import org.polarsys.capella.core.data.fa.FunctionalChain;
import org.polarsys.capella.core.data.fa.FunctionalChainInvolvement;
import org.polarsys.capella.core.data.fa.FunctionalChainReference;
import org.polarsys.capella.core.data.fa.FunctionalExchange;
import org.polarsys.capella.core.transition.common.constants.Messages;
import org.polarsys.capella.core.transition.common.handlers.log.LogHelper;
import org.polarsys.capella.core.transition.common.handlers.transformation.TransformationHandlerHelper;
import org.polarsys.capella.transition.system2subsystem.handlers.attachment.FunctionalChainAttachmentHelper;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IPremise;

public class FunctionalChainInvolvementRule extends org.polarsys.capella.core.transition.system.rules.fa.FunctionalChainInvolvementRule {

  @Override
  public IStatus transformRequired(EObject element_p, IContext context_p) {
    FunctionalChainInvolvement element = (FunctionalChainInvolvement) element_p;
    // InvolvedElement must be transitioned

    NamedElement involved = (NamedElement) element.getInvolved();

    IStatus result = TransformationHandlerHelper.getInstance(context_p).isOrWillBeTransformed(element.getInvolver(), context_p);
    if (!result.isOK()) {
      return result;
    }

    result = TransformationHandlerHelper.getInstance(context_p).isOrWillBeTransformed(involved, context_p);
    FunctionalChainAttachmentHelper helper = FunctionalChainAttachmentHelper.getInstance(context_p);

    if (result.isOK()) {
      if (!(helper.isValidElement(element, context_p) == Boolean.TRUE)) {
        result =
            new Status(IStatus.WARNING, Messages.Activity_Transformation, NLS.bind("Functional Chain Involvement ''{0}'' is not valid.", LogHelper
                .getInstance().getText(element_p)));
      }
    } else {
      if (helper.isValidElement(element, context_p) == Boolean.TRUE) {
        result = Status.OK_STATUS;
      }
    }

    if (result.isOK() && (involved instanceof FunctionalExchange)) {
      boolean res = true;
      Collection<FunctionalChainInvolvement> nextsValid = helper.getNextValid(element, context_p);
      // If an FE FCI has no valid next or valid previous (typically if this FCI ends with itself),
      // then it shall not be exported.
      if (nextsValid.isEmpty()) {
        res = false;
      } else {
        // If there is a valid next, it shall be direct (no jump)
        if (FCIsCollectionMatching(element.getNextFunctionalChainInvolvements(), nextsValid) == false) {
          res = false;
        }
      }

      Collection<FunctionalChainInvolvement> prevsValid = helper.getPreviousValid(element, context_p);
      if (prevsValid.isEmpty()) {
        res = false;
      } else {
        // If there is a valid previous, it shall be direct (no jump)
        if (FCIsCollectionMatching(element.getPreviousFunctionalChainInvolvements(), prevsValid) == false) {
          res = false;
        }
      }

      if (res == false) {
        result =
            new Status(IStatus.WARNING, Messages.Activity_Transformation, NLS.bind("Functional Chain Involvement ''{0}'' is not valid.", LogHelper
                .getInstance().getText(element_p)));
      }
    }

    return result;
  }

  private boolean FCIsCollectionMatching(Collection<FunctionalChainInvolvement> fci1, Collection<FunctionalChainInvolvement> fci2) {
    boolean containOne = false;
    for (FunctionalChainInvolvement fci : fci1) {
      for (FunctionalChainInvolvement nextValid : fci2) {
        if ((nextValid.getInvolved() != null) && nextValid.getInvolved().equals(fci.getInvolved())) {
          containOne = true;
          break;
        }
      }
      if (containOne) {
        break;
      }
    }

    return containOne;
  }

  @Override
  protected EObject transformDirectElement(EObject src, IContext context_p) {
    EObject trg = super.transformDirectElement(src, context_p);
    return trg;
  }

  @Override
  protected void attachRelated(EObject src, EObject trg, IContext context_p) {
    super.attachRelated(src, trg, context_p);
    FunctionalChainAttachmentHelper helper = FunctionalChainAttachmentHelper.getInstance(context_p);

    FunctionalChainInvolvement fSrc = (FunctionalChainInvolvement) src;
    FunctionalChainInvolvement fTrg = (FunctionalChainInvolvement) trg;

    fTrg.getNextFunctionalChainInvolvements().clear();

    if (fSrc.getNextFunctionalChainInvolvements().isEmpty() == false) {
      for (FunctionalChainInvolvement nextSrcValid : helper.getNextValid(fSrc, context_p)) {
        if (nextSrcValid.getInvolved() instanceof FunctionalExchange) {
          boolean isDirectJump = false;
          for (FunctionalChainInvolvement fci : nextSrcValid.getPreviousFunctionalChainInvolvements()) {
            if (fSrc.getInvolved().equals(fci.getInvolved())) {
              isDirectJump = true;
              break;
            }
          }

          // If jump and if try to link through a FE => redirection to FE's target.
          if (!isDirectJump && (fSrc.getNextFunctionalChainInvolvements().contains(nextSrcValid) == false)) {
            nextSrcValid = nextSrcValid.getNextFunctionalChainInvolvements().get(0);
          }
        }

        Collection<EObject> nextTrgs = retrieveTracedElements(nextSrcValid, context_p);

        if ((nextTrgs != null) && (nextTrgs.isEmpty() == false)) {
          FunctionalChainInvolvement nextTrgValid = (FunctionalChainInvolvement) nextTrgs.iterator().next();

          // If not jump to next
          // or
          // If next's involved is a FE => no problem
          if (fSrc.getNextFunctionalChainInvolvements().contains(nextSrcValid) || (nextSrcValid.getInvolved() instanceof FunctionalExchange)) {
            fTrg.getNextFunctionalChainInvolvements().add(nextTrgValid);
          }
          // If there is a jump to next and that this jump concern two Functions => creation of a fake FE
          else {
            Collection<InvolvedElement> involvedElements = listInvolvedElements(fSrc, nextSrcValid);
            String description = buildDescription(involvedElements);

            // Creation of a fake FE
            Iterator<EObject> it = retrieveTracedElements(nextSrcValid.getInvolved(), context_p).iterator();
            EObject next = it.next();
            AbstractFunction nextTrgFct = (AbstractFunction) next;

            String idDiff = nextTrgFct.getClass().getSimpleName().replaceAll("Function", "");
            idDiff = idDiff.replaceAll("Impl", "");

            Collection<FunctionalExchange> fakeFEs = createFakeFE(fTrg, nextTrgValid, nextTrgFct, context_p, description, idDiff);

            if (fakeFEs.isEmpty() == false) {
              FunctionalChainInvolvement fakeFCI = createFakeFunctionalChainInvolvement(fTrg, nextTrgValid, fakeFEs.iterator().next(), context_p, idDiff);

              fTrg.getNextFunctionalChainInvolvements().add(fakeFCI);

              fakeFCI.getNextFunctionalChainInvolvements().add(nextTrgValid);
            }
          }
        }
      }
    }
  }

  private Collection<InvolvedElement> listInvolvedElements(FunctionalChainInvolvement startFci, FunctionalChainInvolvement endFci) {
    Collection<InvolvedElement> res = new ArrayList<InvolvedElement>();
    FunctionalChainInvolvement current = startFci;

    while (current.getNextFunctionalChainInvolvements().isEmpty() == false) {
      FunctionalChainInvolvement next = current.getNextFunctionalChainInvolvements().get(0);
      if (next.equals(endFci) == false) {
        current = next;
        res.add(current.getInvolved());
      } else {
        break;
      }
    }

    return res;
  }

  private String buildDescription(Collection<InvolvedElement> involvedElements) {
    StringBuilder descriptionBuilder = new StringBuilder();

    for (InvolvedElement current : involvedElements) {
      NamedElement iv = (NamedElement) current;
      descriptionBuilder.append(String.format("%s(%s);<br/>", iv.getName(), iv.getId()));
    }

    return descriptionBuilder.toString();
  }

  @Override
  protected void premicesRelated(EObject element_p, ArrayList<IPremise> needed_p) {
    super.premicesRelated(element_p, needed_p);

    if (element_p instanceof FunctionalChainInvolvement) {
      FunctionalChainInvolvement src = (FunctionalChainInvolvement) element_p;

      Collection<EObject> nexts = new ArrayList<EObject>();

      while ((src.getNextFunctionalChainInvolvements() != null) && (src.getNextFunctionalChainInvolvements().isEmpty() == false)) {
        src = src.getNextFunctionalChainInvolvements().get(0);
        nexts.add(src);

      }
      needed_p.addAll(createDefaultPrecedencePremices(nexts, "nextsInvolvements"));
    }

    if (element_p instanceof FunctionalChainReference) {
      Collection<EObject> fcis = new ArrayList<EObject>();
      FunctionalChain fc = ((FunctionalChainReference) element_p).getReferencedFunctionalChain();
      fcis.addAll(fc.getOwnedFunctionalChainInvolvements());

      needed_p.addAll(createDefaultCriticalPremices(fcis, "referencedInvolvements"));
    }

  }

  private FunctionalChainInvolvement createFakeFunctionalChainInvolvement(FunctionalChainInvolvement src, FunctionalChainInvolvement trg,
      FunctionalExchange fe, IContext context_p, String idPrefix) {
    String id = String.format("ID_FakeFunctionalChainInvolvement_%s_%s_%s", idPrefix, src.getSid(), trg.getSid());

    FunctionalChain parent = (FunctionalChain) src.eContainer();
    FunctionalChainInvolvement res = null;

    for (FunctionalChainInvolvement fci : src.getNextFunctionalChainInvolvements()) {
      if (fci.getSid().equals(id)) {
        res = fci;
        break;
      }
    }
    for (FunctionalChainInvolvement fci : trg.getPreviousFunctionalChainInvolvements()) {
      if (fci.getSid().equals(id)) {
        res = fci;
        break;
      }
    }

    if (res == null) {
      res = FaFactory.eINSTANCE.createFunctionalChainInvolvement();
      res.setSid(id);
    }

    res.setInvolved(fe);
    res.setInvolver(src.getInvolver());

    parent.getOwnedFunctionalChainInvolvements().add(res);

    return res;
  }

  private Collection<FunctionalExchange> createFakeFE(FunctionalChainInvolvement srcFci, FunctionalChainInvolvement trgFci, AbstractFunction targetFunction,
      IContext context_p, String description, String idPrefix) {
    Collection<FunctionalExchange> res = new ArrayList<FunctionalExchange>();

    Collection<AbstractFunction> srcs = new ArrayList<AbstractFunction>();

    if (srcFci.getInvolved() instanceof AbstractFunction) {
      srcs.add((AbstractFunction) srcFci.getInvolved());
    } else if (srcFci.getInvolved() instanceof FunctionalChain) {
      srcs.addAll(retrieveEndFunctionsOfFC((FunctionalChain) srcFci.getInvolved(), context_p));
    }

    for (AbstractFunction src : srcs) {
      AbstractFunction trg = targetFunction;

      String id = String.format("ID_FakeFunctionalExchange_%s_%s_%s", idPrefix, src.getSid(), trg.getSid());
      String srcPortId = String.format("ID_FakeFunctionPortOut_%s_%s", src.getSid(), id);
      String trgPortId = String.format("ID_FakeFunctionPortIn_%s_%s", trg.getSid(), id);

      EObject container = src.eContainer();

      FunctionalExchange fe = null;

      for (FunctionalExchange existingFE : ((AbstractFunction) container).getOwnedFunctionalExchanges()) {
        if (existingFE.getSid().equals(id)) {
          fe = existingFE;
          break;
        }
      }

      if (fe == null) {
        String feName = String.format("FakeFE_%s_%s", src.getName(), trg.getName());
        String outPortName = "out_" + feName;
        String inPortName = "in_" + feName;
        FunctionOutputPort srcPort = (FunctionOutputPort) getOrCreateFakePort(srcPortId, outPortName, src, false, context_p);
        FunctionInputPort trgPort = (FunctionInputPort) getOrCreateFakePort(trgPortId, inPortName, trg, true, context_p);

        fe = FaFactory.eINSTANCE.createFunctionalExchange();
        fe.setSid(id);
        fe.setId(id);

        fe.setDescription(description);

        fe.setName(feName);

        fe.setSource(srcPort);
        fe.setTarget(trgPort);

        if (container instanceof AbstractFunction) {
          ((AbstractFunction) container).getOwnedFunctionalExchanges().add(fe);
        }
      }
      res.add(fe);
    }
    return res;
  }

  private Collection<? extends AbstractFunction> retrieveEndFunctionsOfFC(FunctionalChain fc, IContext context_p) {
    Collection<AbstractFunction> res = new ArrayList<AbstractFunction>();
    LinkedList<FunctionalChainInvolvement> course = new LinkedList<FunctionalChainInvolvement>();
    course.addAll(fc.getFirstFunctionalChainInvolvements());

    while (course.isEmpty() == false) {
      FunctionalChainInvolvement fci = course.poll();
      if (fci.getNextFunctionalChainInvolvements().isEmpty()) {
        if (fci.getInvolved() instanceof AbstractFunction) {
          res.add((AbstractFunction) fci.getInvolved());
        }
      } else {
        course.addAll(fci.getNextFunctionalChainInvolvements());
      }
    }

    return res;
  }

  private FunctionPort getOrCreateFakePort(String id, String name, AbstractAction fct, boolean input, IContext context_p) {
    FunctionPort res = null;

    if (res == null) {
      if (input) {
        for (InputPin port : fct.getInputs()) {
          if (port.getId().equals(id)) {
            res = (FunctionPort) port;
            break;
          }
        }

        if (res == null) {
          res = FaFactory.eINSTANCE.createFunctionInputPort();
          fct.getInputs().add((FunctionInputPort) res);
        }
      } else {
        for (OutputPin port : fct.getOutputs()) {
          if (port.getId().equals(id)) {
            res = (FunctionPort) port;
            break;
          }
        }

        if (res == null) {
          res = FaFactory.eINSTANCE.createFunctionOutputPort();
          fct.getOutputs().add((FunctionOutputPort) res);
        }
      }
      res.setSid(id);
      res.setId(id);
      res.setName(name);
    }

    return res;
  }
}
