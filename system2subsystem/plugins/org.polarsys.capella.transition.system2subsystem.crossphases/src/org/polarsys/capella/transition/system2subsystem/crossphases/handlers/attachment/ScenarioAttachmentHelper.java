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
package org.polarsys.capella.transition.system2subsystem.crossphases.handlers.attachment;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.common.data.modellingcore.AbstractType;
import org.polarsys.capella.core.data.cs.Component;
import org.polarsys.capella.core.data.cs.Part;
import org.polarsys.capella.core.data.information.AbstractInstance;
import org.polarsys.capella.core.data.information.InformationPackage;
import org.polarsys.capella.core.data.information.PartitionableElement;
import org.polarsys.capella.core.transition.common.handlers.scope.ScopeHandlerHelper;
import org.polarsys.capella.core.transition.common.handlers.traceability.TraceabilityHandlerHelper;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;

/**
 * 
 */
public class ScenarioAttachmentHelper extends org.polarsys.capella.transition.system2subsystem.handlers.attachment.ScenarioAttachmentHelper {

  /**
   * @param role_p
   * @return
   */
  @Override
  public Collection<AbstractInstance> getRelatedTracedInstances(AbstractInstance instance_p, IContext context_p) {
    List<AbstractInstance> partBounds = new ArrayList<AbstractInstance>();

    if (!(instance_p instanceof Part)) {
      partBounds.addAll((Collection) TraceabilityHandlerHelper.getInstance(context_p).retrieveTracedElements(instance_p, context_p,
          InformationPackage.Literals.ABSTRACT_INSTANCE));

    } else {
      AbstractType component = instance_p.getAbstractType();

      boolean isIncluded = ScopeHandlerHelper.getInstance(context_p).isInScope(component, context_p);
      Object root = CrossPhasesAttachmentHelper.getInstance(context_p).getMap(context_p).get(component);
      if (!isIncluded && (root != null)) {
        isIncluded = true;
      }

      if (isIncluded) {
        EObject type = component;
        if (component instanceof Component) {
          type = CrossPhasesAttachmentHelper.getInstance(context_p).getRelatedComponent((Component) component, context_p);
        }

        Collection<EObject> result =
            TraceabilityHandlerHelper.getInstance(context_p).retrieveTracedElements(type, context_p, InformationPackage.Literals.PARTITIONABLE_ELEMENT);
        for (EObject element : result) {
          if (element instanceof PartitionableElement) {
            partBounds.addAll(((PartitionableElement) element).getRepresentingPartitions());
          }
        }
      }
    }
    return partBounds;
  }
}
