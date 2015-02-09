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
package org.polarsys.capella.transition.system2subsystem.rules.pa;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.osgi.util.NLS;
import org.polarsys.capella.core.data.capellacore.CapellacorePackage;
import org.polarsys.capella.core.data.cs.CsPackage;
import org.polarsys.capella.core.data.cs.PhysicalPathInvolvement;
import org.polarsys.capella.core.transition.common.constants.Messages;
import org.polarsys.capella.core.transition.common.handlers.attachment.AttachmentHelper;
import org.polarsys.capella.core.transition.common.handlers.log.LogHelper;
import org.polarsys.capella.core.transition.common.handlers.transformation.TransformationHandlerHelper;
import org.polarsys.capella.core.transition.system.rules.AbstractCapellaElementRule;
import org.polarsys.capella.transition.system2subsystem.handlers.attachment.PhysicalPathAttachmentHelper;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IPremise;


public class PhysicalPathInvolvementRule extends AbstractCapellaElementRule {

  @Override
  protected EClass getSourceType() {
    return CsPackage.Literals.PHYSICAL_PATH_INVOLVEMENT;
  }

  @Override
  public IStatus transformRequired(EObject element_p, IContext context_p) {
    PhysicalPathInvolvement element = (PhysicalPathInvolvement) element_p;
    // InvolvedElement must be transitioned
    IStatus result = TransformationHandlerHelper.getInstance(context_p).isOrWillBeTransformed(element.getInvolvedElement(), context_p);

    if (result.isOK()) {
      if (!(PhysicalPathAttachmentHelper.getInstance(context_p).isValidElement(element, context_p) == Boolean.TRUE)) {
        result =
            new Status(IStatus.WARNING, Messages.Activity_Transformation, NLS.bind("Physical Path Involvement ''{0}'' is not valid.", LogHelper.getInstance()
                .getText(element_p)));
      }
    }
    return result;
  }

@Override
  protected void retrieveGoDeep(EObject source_p, List<EObject> result_p, IContext context_p) {
    super.retrieveGoDeep(source_p, result_p, context_p);
  }

  @Override
  protected void attachRelated(EObject element_p, EObject result_p, IContext context_p) {
    super.attachRelated(element_p, result_p, context_p);
    AttachmentHelper.getInstance(context_p).attachTracedElements(element_p, result_p, CapellacorePackage.Literals.INVOLVEMENT__INVOLVED, context_p);
    AttachmentHelper.getInstance(context_p).attachTracedElements(element_p, result_p, CsPackage.Literals.PHYSICAL_PATH_INVOLVEMENT__NEXT_INVOLVEMENTS,
        context_p);
    AttachmentHelper.getInstance(context_p).attachTracedElements(element_p, result_p, CapellacorePackage.Literals.INVOLVEMENT__INVOLVER, context_p);
  }

  @Override
  protected void premicesRelated(EObject element_p, ArrayList<IPremise> needed_p) {
    super.premicesRelated(element_p, needed_p);
    needed_p.addAll(createDefaultPrecedencePremices(element_p, CapellacorePackage.Literals.INVOLVEMENT__INVOLVED));
    needed_p.addAll(createDefaultPrecedencePremices(element_p, CsPackage.Literals.PHYSICAL_PATH_INVOLVEMENT__NEXT_INVOLVEMENTS));
    // needed_p.addAll(createDefaultPrecedencePremices((Collection) FunctionalChainExt.getPreviousInvolvements(element), "previousInvolvements"));
  }
}
