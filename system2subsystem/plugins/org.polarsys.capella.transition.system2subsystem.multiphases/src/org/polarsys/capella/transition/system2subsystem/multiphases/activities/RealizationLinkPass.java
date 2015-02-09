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

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.common.data.modellingcore.ModelElement;
import org.polarsys.capella.core.data.capellamodeller.SystemEngineering;
import org.polarsys.capella.core.data.cs.BlockArchitecture;
import org.polarsys.capella.core.model.helpers.BlockArchitectureExt;
import org.polarsys.capella.core.transition.system.handlers.traceability.RealizationLinkTraceabilityHandler;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;

/**
 * This class is responsible to create all realization links in a multiphase transition
 */
public class RealizationLinkPass {

  public void createRealizationLinks(SystemEngineering se_p, IContext context_p) {

    final Map<String, EObject> sidToElement = new HashMap<String, EObject>();

    RealizationLinkTraceabilityHandler handler = new RealizationLinkTraceabilityHandler(getClass().getSimpleName());
    handler.init(context_p); //init() is expected since it is an handler, but here it is also required since this handler is notified at the end of the transformation to attach links

    // Exploit that elements in PA show up after elements in LA which themselves show up after elements in SA.
    // When finding a collision on an sid attribute, we can create a trace.

    for (Iterator<EObject> it = se_p.eAllContents(); it.hasNext();) {
      EObject next = it.next();
      if (next instanceof ModelElement) {
        ModelElement element = (ModelElement) next;
        if (element.getSid() != null) {
          EObject previous = sidToElement.put(element.getSid(), element);
          if (previous != null) {

            BlockArchitecture previousOne = BlockArchitectureExt.getRootBlockArchitecture(previous);
            BlockArchitecture currentOne = BlockArchitectureExt.getRootBlockArchitecture(element);

            //If SA2LA or LA2PA, we create a link
            if (previousOne.getAllocatingArchitectures().contains(currentOne)) {
              handler.attachTraceability(previous, element, context_p);
            }
          }
        }
      }

    }

  }

}
