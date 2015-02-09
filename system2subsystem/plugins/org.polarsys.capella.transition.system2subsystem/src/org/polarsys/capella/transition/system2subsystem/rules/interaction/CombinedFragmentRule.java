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
package org.polarsys.capella.transition.system2subsystem.rules.interaction;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.core.data.interaction.InteractionPackage;
import org.polarsys.capella.core.transition.common.handlers.attachment.AttachmentHelper;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IPremise;

/**
 * 
 */
public class CombinedFragmentRule extends TimeLapseRule {
  /**
   * @param eclass_p
   */
  public CombinedFragmentRule() {
    super();
    registerUpdatedAttribute(InteractionPackage.Literals.COMBINED_FRAGMENT__OPERATOR);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  protected EClass getSourceType() {
    return InteractionPackage.Literals.COMBINED_FRAGMENT;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  protected void attachRelated(EObject element_p, EObject result_p, IContext context_p) {
    super.attachRelated(element_p, result_p, context_p);
    AttachmentHelper.getInstance(context_p).attachTracedElements(element_p, result_p, InteractionPackage.Literals.COMBINED_FRAGMENT__REFERENCED_OPERANDS,
        context_p);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  protected void premicesRelated(EObject element_p, ArrayList<IPremise> needed_p) {
    super.premicesRelated(element_p, needed_p);
    needed_p.addAll(createDefaultPrecedencePremices(element_p, InteractionPackage.Literals.COMBINED_FRAGMENT__REFERENCED_OPERANDS));
  }

}
