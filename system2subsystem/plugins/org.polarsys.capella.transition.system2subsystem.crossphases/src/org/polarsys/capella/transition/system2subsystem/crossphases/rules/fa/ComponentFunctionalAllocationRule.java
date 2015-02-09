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
package org.polarsys.capella.transition.system2subsystem.crossphases.rules.fa;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.common.data.modellingcore.ModellingcorePackage;
import org.polarsys.capella.core.data.capellacore.Allocation;
import org.polarsys.capella.core.data.cs.Component;
import org.polarsys.capella.transition.system2subsystem.crossphases.handlers.attachment.CrossPhasesAttachmentHelper;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IPremise;


/**
 * 
 */
public class ComponentFunctionalAllocationRule extends org.polarsys.capella.transition.system2subsystem.rules.fa.ComponentFunctionalAllocationRule {

  @Override
  protected EObject getSourceContainer(EObject element_p, EObject result_p, IContext context_p) {
    Allocation element = (Allocation) element_p;
    EObject bestContainer = CrossPhasesAttachmentHelper.getInstance(context_p).getRelatedComponent((Component) element.getSourceElement(), context_p);
    return bestContainer;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  protected void retrieveContainer(EObject element_p, List<EObject> result_p, IContext context_p) {
  }

  @Override
  protected void premicesAllocationRelated(EObject element_p, ArrayList<IPremise> needed_p) {
    Allocation element = (Allocation) element_p;
    IContext context = getCurrentContext();
    needed_p.addAll(createDefaultPrecedencePremices(
        (Collection) Collections.singletonList(CrossPhasesAttachmentHelper.getInstance(context).getRelatedComponent((Component) element.getSourceElement(),
            context)), "part"));
    needed_p.addAll(createDefaultPrecedencePremices(element, ModellingcorePackage.Literals.ABSTRACT_TRACE__TARGET_ELEMENT));
  }

  @Override
  protected void attachAllocationRelated(EObject element_p, EObject result_p, IContext context_p) {
    CrossPhasesAttachmentHelper.getInstance(context_p).attachRelatedElements(element_p, result_p, ModellingcorePackage.Literals.ABSTRACT_TRACE__SOURCE_ELEMENT,
        context_p);
    CrossPhasesAttachmentHelper.getInstance(context_p).attachRelatedElements(element_p, result_p, ModellingcorePackage.Literals.ABSTRACT_TRACE__TARGET_ELEMENT,
        context_p);
  }

  @Override
  protected EObject getSource(EObject source_p, IContext context_p) {
    Allocation element = (Allocation) source_p;
    EObject sourceElement = CrossPhasesAttachmentHelper.getInstance(context_p).getRelatedComponent((Component) element.getSourceElement(), context_p);
    return sourceElement;
  }

}
