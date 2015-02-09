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

import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.osgi.util.NLS;
import org.polarsys.capella.core.data.cs.BlockArchitecture;
import org.polarsys.capella.core.data.cs.CsPackage;
import org.polarsys.capella.core.data.cs.PhysicalPath;
import org.polarsys.capella.core.data.cs.PhysicalPathInvolvement;
import org.polarsys.capella.core.model.helpers.BlockArchitectureExt;
import org.polarsys.capella.core.model.helpers.PhysicalPathExt;
import org.polarsys.capella.core.transition.common.constants.Messages;
import org.polarsys.capella.core.transition.common.handlers.log.LogHelper;
import org.polarsys.capella.core.transition.common.handlers.transformation.TransformationHandlerHelper;
import org.polarsys.capella.core.transition.system.rules.AbstractCapellaElementRule;
import org.polarsys.capella.transition.system2subsystem.handlers.attachment.PhysicalPathAttachmentHelper;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;


public class PhysicalPathRule extends AbstractCapellaElementRule {

  @Override
  protected EClass getSourceType() {
    return CsPackage.Literals.PHYSICAL_PATH;
  }

  @Override
  public void apply(EObject element_p, IContext context_p) throws Exception {
    // Perform a computation of valid involvement
    if (applyRequired(element_p, context_p).isOK()) {
      PhysicalPath element = (PhysicalPath) element_p;
      PhysicalPathAttachmentHelper.getInstance(context_p).computePath(element, context_p);
    }

    super.apply(element_p, context_p);
  }

  @Override
  public IStatus transformRequired(EObject element_p, IContext context_p) {
    // transforms if bounds are transformed or will be transformed
    PhysicalPath element = (PhysicalPath) element_p;

    if (!(PhysicalPathExt.isPhysicalPathValid(element))) {
      return new Status(IStatus.WARNING, Messages.Activity_Transformation, NLS.bind("Physical Path ''{0}'' is not valid.",
          LogHelper.getInstance().getText(element_p)));
    }

    return Status.OK_STATUS;
  }

  @Override
  protected void retrieveContainer(EObject element_p, List<EObject> result_p, IContext context_p) {
    // Nothing here. We don't want to add container
  }

  @Override
  protected EObject getDefaultContainer(EObject element_p, EObject result_p, IContext context_p) {
    EObject root = TransformationHandlerHelper.getInstance(context_p).getLevelElement(element_p, context_p);
    BlockArchitecture target =
        (BlockArchitecture) TransformationHandlerHelper.getInstance(context_p).getBestTracedElement(root, context_p, CsPackage.Literals.BLOCK_ARCHITECTURE,
            element_p, result_p);
    return BlockArchitectureExt.getFirstComponent(target);
  }

  @Override
  protected void retrieveGoDeep(EObject source_p, List<EObject> result_p, IContext context_p) {
    super.retrieveGoDeep(source_p, result_p, context_p);
    PhysicalPath element = (PhysicalPath) source_p;

    if (PhysicalPathExt.isPhysicalPathValid(element)) {
      result_p.addAll(element.getOwnedPhysicalPathInvolvements());
      result_p.addAll(element.getOwnedComponentExchangeAllocations());

      // Add all involved elements
      for (PhysicalPathInvolvement involvment : element.getOwnedPhysicalPathInvolvements()) {
        result_p.add(involvment.getInvolvedElement());
      }
    }
  }

}
