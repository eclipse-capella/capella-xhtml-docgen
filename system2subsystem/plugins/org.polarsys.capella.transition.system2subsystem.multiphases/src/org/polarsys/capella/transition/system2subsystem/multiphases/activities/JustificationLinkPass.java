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
package org.polarsys.capella.transition.system2subsystem.multiphases.activities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.polarsys.capella.common.helpers.EcoreUtil2;
import org.polarsys.capella.core.data.capellacommon.CapellacommonFactory;
import org.polarsys.capella.core.data.capellacommon.JustificationLink;
import org.polarsys.capella.core.data.capellacore.Namespace;
import org.polarsys.capella.core.data.cs.PhysicalLink;
import org.polarsys.capella.core.data.ctx.SystemFunction;
import org.polarsys.capella.core.data.fa.AbstractFunction;
import org.polarsys.capella.core.data.fa.ComponentExchange;
import org.polarsys.capella.core.data.fa.FunctionalExchange;
import org.polarsys.capella.core.data.la.LogicalComponent;
import org.polarsys.capella.core.data.la.LogicalFunction;
import org.polarsys.capella.core.data.pa.PaPackage;
import org.polarsys.capella.core.data.pa.PhysicalComponent;

/**
 * Implements creation of justification links
 */
public class JustificationLinkPass {

  public void createJustificationLinks(EObject transformationTargetRoot_p, Collection<? extends PhysicalComponent> selectedNodePCs_p){

    final Map<String, PhysicalLink> sidToPhysicalLink = new HashMap<String, PhysicalLink>();  
    final Map<String, LogicalComponent> sidToLogicalComponent = new HashMap<String,LogicalComponent>();

    Collection<JustificationLink> newLinks = new ArrayList<JustificationLink>();
    for (Iterator<EObject> it =  transformationTargetRoot_p.eAllContents(); it.hasNext();){
      EObject next = it.next();
      if (next instanceof ComponentExchange){
        ComponentExchange ce = (ComponentExchange) next;
        newLinks.addAll(makeComponentExchangeToFunctionalExchangeJustificationLink(ce));
      } else if (next instanceof LogicalComponent){
        LogicalComponent lc = (LogicalComponent) next;
        newLinks.addAll(makeLogicalComponentToSystemFunctionJustificationLinks(lc));
        if (lc.getSid() != null){
          sidToLogicalComponent.put(lc.getSid(), lc);
        }
      } else if (next instanceof PhysicalComponent) {
        newLinks.addAll(makePhysicalComponentToLogicalComponentJustificationLinks((PhysicalComponent)next, selectedNodePCs_p, sidToLogicalComponent));
      } else if (next instanceof PhysicalLink){
        PhysicalLink pl = (PhysicalLink) next;
        if (EcoreUtil2.getFirstContainer(next, PaPackage.Literals.PHYSICAL_ARCHITECTURE) != null){
          newLinks.addAll(makePhysicalLinkToComponentExchangeJustificationLinks(pl, sidToPhysicalLink.get(pl.getSid())));
        } else {
          sidToPhysicalLink.put(pl.getSid(), pl);
        }
      }
    }
    
    // finally hook the links into the model
    /**
     * .. and be hooked into the model
     */
    for (JustificationLink l : newLinks){
      // can't attach to source.. ComponentExchange, PhysicalLink can't hold a trace :/. Just find the closest parent namespace..
      EObject e = l.getSource();
      while (e!= null){
        if (e instanceof Namespace){
          ((Namespace) e).getOwnedTraces().add(l);
          break;
        }
        e = e.eContainer();
      }
    }
    
  }

    // The transition shall manage a pre-allocation link between 
    // each created Physical Link and the Logical Component Exchanges 
    // that shall be allocated to. 
    private Collection<JustificationLink> makePhysicalLinkToComponentExchangeJustificationLinks(PhysicalLink next_p, PhysicalLink collision_p) {
      Collection<JustificationLink> result = new ArrayList<JustificationLink>();
      if (collision_p != null){
        for (ComponentExchange allocated : collision_p.getAllocatedComponentExchanges()){
          JustificationLink jl = CapellacommonFactory.eINSTANCE.createJustificationLink();
          jl.setSourceElement(next_p);
          jl.setTargetElement(allocated);
          result.add(jl);
        }
      }
      return result;
    }

  /**
   * @param next_p
   */
  private Collection<JustificationLink> makeLogicalComponentToSystemFunctionJustificationLinks(LogicalComponent logicalComponent_p) {
    Collection<JustificationLink> result = new ArrayList<JustificationLink>();
    for (AbstractFunction func : logicalComponent_p.getAllocatedFunctions()){
      for (SystemFunction realizedSF : ((LogicalFunction) func).getRealizedSystemFunctions()){
        JustificationLink jl = CapellacommonFactory.eINSTANCE.createJustificationLink();
        jl.setSourceElement(logicalComponent_p);
        jl.setTargetElement(realizedSF);
        result.add(jl);
      }
    }
    return result;
  }


  /**
   * @param newJustificationLinks_p
   * @param componentExchanges_p
   */
  private Collection<JustificationLink> makeComponentExchangeToFunctionalExchangeJustificationLink(ComponentExchange componentExchange_p) {
    Collection <JustificationLink> result = new ArrayList<JustificationLink>();
    for (FunctionalExchange fe : componentExchange_p.getAllocatedFunctionalExchanges()){
        for (FunctionalExchange realizedFE : fe.getRealizedFunctionalExchanges()){
          JustificationLink jl = CapellacommonFactory.eINSTANCE.createJustificationLink();
          jl.setSourceElement(componentExchange_p);
          jl.setTargetElement(realizedFE);
          result.add(jl);
        }
      }
    return result;
    }

  // The transition shall manage a pre-allocation link between 
  // each created Physical Node Component and the Logical Components 
  // that shall be deployed in.
  //
  // This is the most difficult. The correct mapping can only be established by looking at the deployment
  // relationships in the source model.
  private Collection<JustificationLink> makePhysicalComponentToLogicalComponentJustificationLinks(PhysicalComponent pc, Collection<? extends PhysicalComponent> selectedNodePCs_p, Map<String, LogicalComponent> sidToLogicalComponent_p){
    
    Collection<JustificationLink> result = new ArrayList<JustificationLink>();
    
    if (pc.getSid() != null && !pc.getSid().isEmpty()){
      for (PhysicalComponent referencePC : getReferenceScopeNodePCs(selectedNodePCs_p)) {
        if (pc.getSid().equals(referencePC.getId())){
          for (PhysicalComponent deployed : referencePC.getDeployedPhysicalComponents()){
            LogicalComponent lc = sidToLogicalComponent_p.get(deployed.getId());
            if (lc != null){
              JustificationLink link = CapellacommonFactory.eINSTANCE.createJustificationLink();
              link.setSourceElement(pc);
              link.setTargetElement(lc);
              result.add(link);
            }
          }
        }
      }
    }
    return result;
  }

  private Collection<PhysicalComponent> getReferenceScopeNodePCs(Collection<? extends PhysicalComponent> selectedPhysicalComponents_p){
    Collection<PhysicalComponent> result = new ArrayList<PhysicalComponent>();
    for (TreeIterator<EObject> it = EcoreUtil.getAllContents(selectedPhysicalComponents_p); it.hasNext();){
      EObject next = it.next();
      if (next instanceof PhysicalComponent) {
        result.add((PhysicalComponent) next);
      } else {
        it.prune();
      }
    }
    return result;
  }

}
