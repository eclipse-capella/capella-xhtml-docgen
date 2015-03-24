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
package org.polarsys.capella.transition.system2subsystem.crossphases.rules.pa;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.polarsys.capella.common.data.modellingcore.AbstractNamedElement;
import org.polarsys.capella.core.data.capellacore.CapellacorePackage;
import org.polarsys.capella.core.data.cs.AbstractActor;
import org.polarsys.capella.core.data.cs.BlockArchitecture;
import org.polarsys.capella.core.data.cs.CsPackage;
import org.polarsys.capella.core.data.ctx.CtxPackage;
import org.polarsys.capella.core.data.ctx.SystemAnalysis;
import org.polarsys.capella.core.data.pa.PhysicalComponent;
import org.polarsys.capella.core.data.pa.PhysicalComponentNature;
import org.polarsys.capella.core.model.helpers.BlockArchitectureExt;
import org.polarsys.capella.core.transition.common.constants.ITransitionConstants;
import org.polarsys.capella.core.transition.common.handlers.contextscope.ContextScopeHandlerHelper;
import org.polarsys.capella.core.transition.common.handlers.transformation.TransformationHandlerHelper;
import org.polarsys.capella.transition.system2subsystem.crossphases.handlers.attachment.CrossPhasesAttachmentHelper;
import org.polarsys.capella.transition.system2subsystem.rules.cs.ComponentRule;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IPremise;

public class Component2SARule extends ComponentRule {

  @Override
  protected void retrieveContainer(EObject element_p, List<EObject> result_p, IContext context_p) {
    // Nothing here. We don't want to add container
  }

  @Override
  protected EObject getBestContainer(EObject element_p, EObject result_p, IContext context_p) {
    return null;
  }

  @Override
  protected void premicesRelated(EObject element_p, ArrayList<IPremise> needed_p) {
    super.premicesRelated(element_p, needed_p);
    IContext context = getCurrentContext();
    CrossPhasesAttachmentHelper.getInstance(context).addPremicesRelatedOfMergedComponent(element_p, this,
        CapellacorePackage.Literals.CAPELLA_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS, needed_p, context);
    CrossPhasesAttachmentHelper.getInstance(context).addPremicesRelatedOfMergedComponent(element_p, this,
        CapellacorePackage.Literals.CAPELLA_ELEMENT__APPLIED_PROPERTY_VALUES, needed_p, context);
  }

  @Override
  protected void attachRelated(EObject element_p, EObject result_p, IContext context_p) {
    super.attachRelated(element_p, result_p, context_p);
    CrossPhasesAttachmentHelper.getInstance(context_p).attachRelatedOfMergedElements(element_p, result_p,
        CapellacorePackage.Literals.CAPELLA_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS, context_p);
    CrossPhasesAttachmentHelper.getInstance(context_p).attachRelatedOfMergedElements(element_p, result_p,
        CapellacorePackage.Literals.CAPELLA_ELEMENT__APPLIED_PROPERTY_VALUES, context_p);
  }

  @Override
  protected EObject transformDirectElement(EObject element_p, IContext context_p) {
    EClass targetType = getTargetType(element_p, context_p);
    if (CtxPackage.Literals.SYSTEM.isSuperTypeOf(targetType)) {
      // Retrieve the existing architecture if any
      EObject root = TransformationHandlerHelper.getInstance(context_p).getLevelElement(element_p, context_p);

      BlockArchitecture target =
          (BlockArchitecture) TransformationHandlerHelper.getInstance(context_p).getBestTracedElement(root, context_p, CsPackage.Literals.BLOCK_ARCHITECTURE);
      if (target instanceof SystemAnalysis) {
        SystemAnalysis analysis = (SystemAnalysis) target;
        if (analysis.getOwnedSystem() != null) {
          return analysis.getOwnedSystem();
        }
      }
    }

    // super.transformDirectElement is broken, we should not call it ! call super.super.transformDirectElement
    EObject result = null;
    EClass clazz = getTargetType(element_p, context_p);

    if (clazz != null) {
      EPackage pkg = (EPackage) clazz.eContainer();
      result = pkg.getEFactoryInstance().create(clazz);
    }

    // Theorically, this should not be performed here, but log message requires a valid name
    if ((element_p instanceof AbstractNamedElement) && (result instanceof AbstractNamedElement)) {
      ((AbstractNamedElement) result).setName(((AbstractNamedElement) element_p).getName());
    }

    if (result instanceof PhysicalComponent) {
      ((PhysicalComponent) result).setNature(PhysicalComponentNature.BEHAVIOR);
    }
    return result;
  }

  @Override
  public EClass getTargetType(EObject element_p, IContext context_p) {

    if (ContextScopeHandlerHelper.getInstance(context_p).contains(ITransitionConstants.SOURCE_SCOPE, element_p, context_p)) {
      return CtxPackage.Literals.SYSTEM;
    }

    return CtxPackage.Literals.ACTOR;
  }

  @Override
  protected EObject getDefaultContainer(EObject element_p, EObject result_p, IContext context_p) {

    EObject root = TransformationHandlerHelper.getInstance(context_p).getLevelElement(element_p, context_p);
    BlockArchitecture target =
        (BlockArchitecture) TransformationHandlerHelper.getInstance(context_p).getBestTracedElement(root, context_p, CsPackage.Literals.BLOCK_ARCHITECTURE,
            element_p, result_p);

    if (root.equals(element_p.eContainer())) {
      return target;
    }

    EClass targetType = getTargetType(element_p, context_p);
    if (CtxPackage.Literals.SYSTEM.isSuperTypeOf(targetType)) {
      return target;
    }

    if (result_p instanceof AbstractActor) {
      return BlockArchitectureExt.getActorPkg(target);
    }
    return BlockArchitectureExt.getFirstComponent(target);
  }

}
