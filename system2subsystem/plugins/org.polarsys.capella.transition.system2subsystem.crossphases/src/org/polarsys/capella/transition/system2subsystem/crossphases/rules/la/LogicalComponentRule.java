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
package org.polarsys.capella.transition.system2subsystem.crossphases.rules.la;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.osgi.util.NLS;
import org.polarsys.capella.core.data.cs.Component;
import org.polarsys.capella.core.data.cs.Part;
import org.polarsys.capella.core.data.information.Partition;
import org.polarsys.capella.core.data.la.LaPackage;
import org.polarsys.capella.core.data.la.LogicalComponent;
import org.polarsys.capella.core.model.helpers.ComponentExt;
import org.polarsys.capella.core.transition.common.constants.ITransitionConstants;
import org.polarsys.capella.core.transition.common.constants.Messages;
import org.polarsys.capella.core.transition.common.handlers.contextscope.ContextScopeHandlerHelper;
import org.polarsys.capella.core.transition.common.handlers.log.LogHelper;
import org.polarsys.capella.core.transition.common.handlers.options.OptionsHandlerHelper;
import org.polarsys.capella.transition.system2subsystem.crossphases.constants.IOptionsConstants;
import org.polarsys.capella.transition.system2subsystem.crossphases.handlers.attachment.CrossPhasesAttachmentHelper;
import org.polarsys.capella.transition.system2subsystem.crossphases.rules.pa.Component2SARule;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IPremise;


public class LogicalComponentRule extends Component2SARule {

  @Override
  protected EClass getSourceType() {
    return LaPackage.Literals.LOGICAL_COMPONENT;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  protected void premicesRelated(EObject element_p, ArrayList<IPremise> needed_p) {
    super.premicesRelated(element_p, needed_p);

    // Disable merge of components if option is disabled
    if (!OptionsHandlerHelper.getInstance(getCurrentContext()).getBooleanValue(getCurrentContext(),
        IOptionsConstants.SYSTEM2SUBSYSTEM_CROSSPHASES_PREFERENCES, IOptionsConstants.COMPONENT_MERGE, IOptionsConstants.COMPONENT_MERGE__DEFAULT_VALUE)) {
      return;
    }
    LogicalComponent element = (LogicalComponent) element_p;

    for (Partition partition : element.getRepresentingPartitions()) {
      needed_p.addAll(createDefaultPrecedencePremices((Collection) ComponentExt.getPartAncestors((Part) partition), "part"));
    }
  }

  @Override
  protected void retrieveGoDeep(EObject source_p, List<EObject> result_p, IContext context_p) {
    super.retrieveGoDeep(source_p, result_p, context_p);

    // Disable merge of components if option is disabled
    if (!OptionsHandlerHelper.getInstance(getCurrentContext()).getBooleanValue(getCurrentContext(),
        IOptionsConstants.SYSTEM2SUBSYSTEM_CROSSPHASES_PREFERENCES, IOptionsConstants.COMPONENT_MERGE, IOptionsConstants.COMPONENT_MERGE__DEFAULT_VALUE)) {
      return;
    }

    if (ContextScopeHandlerHelper.getInstance(context_p).contains(ITransitionConstants.SOURCE_SCOPE, source_p, context_p)) {
      if (source_p instanceof LogicalComponent) {
        LogicalComponent element = (LogicalComponent) source_p;
        for (Partition part : element.getOwnedPartitions()) {
          if (part instanceof Part) {
            result_p.add(part);
            ContextScopeHandlerHelper.getInstance(context_p).add(ITransitionConstants.SOURCE_SCOPE, part, context_p);
          }
        }
      }
    }
  }

  @Override
  public IStatus transformRequired(EObject source_p, IContext context_p) {
    LogicalComponent element = (LogicalComponent) source_p;

    // Disable merge of components if option is disabled
    if (!OptionsHandlerHelper.getInstance(getCurrentContext()).getBooleanValue(context_p, IOptionsConstants.SYSTEM2SUBSYSTEM_CROSSPHASES_PREFERENCES,
        IOptionsConstants.COMPONENT_MERGE, IOptionsConstants.COMPONENT_MERGE__DEFAULT_VALUE)) {
      return super.transformRequired(source_p, context_p);
    }

    Collection<EObject> transfoSources = (Collection<EObject>) context_p.get(ITransitionConstants.TRANSITION_SOURCES);
    if (transfoSources.contains(element)) {
      return Status.OK_STATUS;
    }

    Component src = CrossPhasesAttachmentHelper.getInstance(context_p).getRelatedComponent(element, context_p);
    if (src != element) {
      return new Status(IStatus.WARNING, Messages.Activity_Transformation, NLS.bind("Component ''{0}'' will be merged into ''{1}''", LogHelper.getInstance()
          .getText(element), LogHelper.getInstance().getText(src)));
    }

    return super.transformRequired(source_p, context_p);
  }
}
