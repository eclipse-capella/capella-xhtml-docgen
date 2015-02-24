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

import java.util.ArrayDeque;
import java.util.Deque;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;

/**
 */
public class ProjectRepairUtil {

  final ComposedAdapterFactory factory;
  
  public ProjectRepairUtil(CapellacommonModelWalkerFactory capellacommonFactory,
    CapellamodellerModelWalkerFactory capellamodellerFactory,
    OaModelWalkerFactory oaFactory,
    LaModelWalkerFactory laFactory,
    PaModelWalkerFactory paFactory,
    CtxModelWalkerFactory ctxFactory,
    InformationModelWalkerFactory informationFactory,
    EpbsModelWalkerFactory epbsFactory,
    CsModelWalkerFactory csFactory){
      factory = new ComposedAdapterFactory();
      factory.addAdapterFactory(capellacommonFactory);
      factory.addAdapterFactory(capellamodellerFactory);
      factory.addAdapterFactory(oaFactory);
      factory.addAdapterFactory(laFactory);
      factory.addAdapterFactory(paFactory);
      factory.addAdapterFactory(ctxFactory);
      factory.addAdapterFactory(informationFactory);
      factory.addAdapterFactory(epbsFactory);
      factory.addAdapterFactory(csFactory);
  }
  
  public void repair(EObject e, ModelWalkerHelper helper){
      repairImpl(e, factory, helper);
      repairImpl(e, factory, helper); // FIXME weird, but necessary for now
  }
  
  private void repairImpl(EObject e, AdapterFactory f, ModelWalkerHelper helper){
    Deque<EObject> queue = new ArrayDeque<EObject>();
    queue.add(e);
    while (!queue.isEmpty()){
      EObject next = queue.pop();
      ModelWalker walker = (ModelWalker) f.adapt(next, ModelWalker.class);
      if (walker != null){
        walker.accept(next, helper);
      }
      queue.addAll(next.eContents());
    }
  }

}
