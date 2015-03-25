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
package org.polarsys.capella.transition.system2subsystem.multiphases.launcher;

import java.util.Collection;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.polarsys.capella.common.tools.report.config.registry.ReportManagerRegistry;
import org.polarsys.capella.common.tools.report.util.IReportManagerDefaultComponents;
import org.polarsys.capella.core.transition.common.activities.DifferencesMergingActivity;
import org.polarsys.capella.core.transition.common.activities.FinalizeTransitionActivity;
import org.polarsys.capella.core.transition.common.activities.InitializeScopeActivity;
import org.polarsys.capella.core.transition.common.activities.InitializeTransitionActivity;
import org.polarsys.capella.core.transition.common.activities.PostTransformationActivity;
import org.polarsys.capella.core.transition.common.constants.ITransitionConstants;
import org.polarsys.capella.core.transition.common.handlers.IHandler;
import org.polarsys.capella.core.transition.common.handlers.options.DefaultOptionsHandler;
import org.polarsys.capella.core.transition.common.handlers.options.IOptionsHandler;
import org.polarsys.capella.core.transition.common.transposer.ExtendedRulesHandler;
import org.polarsys.capella.transition.system2subsystem.activities.FinalizeSubsystemTransitionActivity;
import org.polarsys.capella.transition.system2subsystem.crossphases.handlers.attachment.CrossPhasesAttachmentHelper;
import org.polarsys.capella.transition.system2subsystem.multiphases.MultiphasesContext;
import org.polarsys.capella.transition.system2subsystem.multiphases.activities.InitializeMultiphasesDiffMergeActivity;
import org.polarsys.capella.transition.system2subsystem.multiphases.activities.InitializeMultiphasesTransformationActivity;
import org.polarsys.capella.transition.system2subsystem.multiphases.activities.InitializeMultiphasesTransitionActivity;
import org.polarsys.capella.transition.system2subsystem.multiphases.activities.JustificationLinkPass;
import org.polarsys.capella.transition.system2subsystem.multiphases.activities.MultiphasesDifferencesComputingActivity;
import org.polarsys.capella.transition.system2subsystem.multiphases.activities.MultiphasesDifferencesFilteringActivity;
import org.polarsys.capella.transition.system2subsystem.multiphases.activities.RealizationLinkPass;
import org.polarsys.capella.transition.system2subsystem.multiphases.activities.RootComponentNameUpdater;
import org.polarsys.capella.transition.system2subsystem.multiphases.handlers.attachment.LAAttachmentHelper;
import org.polarsys.capella.transition.system2subsystem.multiphases.handlers.attachment.PAAttachmentHelper;
import org.polarsys.capella.transition.system2subsystem.multiphases.handlers.attachment.SAAttachmentHelper;
import org.polarsys.kitalpha.cadence.core.api.parameter.ActivityParameters;
import org.polarsys.kitalpha.cadence.core.api.parameter.GenericParameter;
import org.polarsys.kitalpha.transposer.api.ITransposerWorkflow;
import org.polarsys.kitalpha.transposer.rules.handler.api.IRulesHandler;
import org.polarsys.kitalpha.transposer.rules.handler.exceptions.mappings.purposes.NonExistingPurposeException;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;

public class HeadlessMultiphasesLauncher {

  private final IOptionsHandler optionsHandler;

  private final boolean merge;
  private final Collection<GenericParameter<?>> headlessParameters;
  private final Logger logger;

  public HeadlessMultiphasesLauncher(IOptionsHandler optionsHandler_p, Collection<GenericParameter<?>> headlessParameters_p, boolean merge_p) {
    optionsHandler = optionsHandler_p;
    headlessParameters = headlessParameters_p;
    merge = merge_p;
    logger = ReportManagerRegistry.getInstance().subscribe(IReportManagerDefaultComponents.DEFAULT);
  }

  public HeadlessMultiphasesLauncher(Collection<GenericParameter<?>> headlessParameters_p, boolean merge_p) {
    this(new DefaultOptionsHandler(), headlessParameters_p, merge_p);
  }

  public HeadlessMultiphasesLauncher(Collection<GenericParameter<?>> headlessParameters) {
    this(headlessParameters, true);
  }

  public void launch(Collection<Object> selection_p, IProgressMonitor monitor_p) {

    final MultiphasesContext context = new MultiphasesContext(selection_p);
    IStatus result = initializeMultiphasesTransition(context, optionsHandler);

    if (result.isOK()) {
      try {

        context.put(CrossPhasesAttachmentHelper.CROSS_PHASES_ATTACHMENT_HELPER, new SAAttachmentHelper());
        CrossPhasesAttachmentHelper.getInstance(context).clear(context);

        new SA_Launcher(context).run(selection_p, true, monitor_p);

        context.put(CrossPhasesAttachmentHelper.CROSS_PHASES_ATTACHMENT_HELPER, new LAAttachmentHelper());
        CrossPhasesAttachmentHelper.getInstance(context).clear(context);
        new LA_Launcher(context).run(selection_p, true, monitor_p);

        context.put(CrossPhasesAttachmentHelper.CROSS_PHASES_ATTACHMENT_HELPER, new PAAttachmentHelper());
        CrossPhasesAttachmentHelper.getInstance(context).clear(context);
        new PA_Launcher(context).run(selection_p, true, monitor_p);

        new LostAndFoundPass().attachLostAndFound(context);
        new RealizationLinkPass().createRealizationLinks(context.getTempSystemEngineering(), context);

        ActivityParameters params = createPostTransformationParameters(context);
        new PostTransformationActivity().run(params);

        new JustificationLinkPass().createJustificationLinks(context.getTempSystemEngineering(), context.getSelectedPhysicalComponents());
        new RootComponentNameUpdater().updateRootComponentNames(context.getTempSystemEngineering(), context.getSelectedPhysicalComponents());

        if (merge) {
          new InitializeMultiphasesDiffMergeActivity().run(params);
          new MultiphasesDifferencesComputingActivity().run(params);
          new MultiphasesDifferencesFilteringActivity().run(params);
          new DifferencesMergingActivity().run(params);
        }
        new FinalizeTransitionActivity().run(params);
      } finally {
        ActivityParameters params = new ActivityParameters();
        params.addParameter(new GenericParameter<IContext>(ITransposerWorkflow.TRANSPOSER_CONTEXT, context, null));
        new FinalizeSubsystemTransitionActivity().run(params);
      }
    } else {
      if (result == Status.CANCEL_STATUS) {
        // the cancel status singleton doesn't carry a message, and we would like a message..
        logger.debug("Multiphase transition was cancelled"); //$NON-NLS-1$
      } else {
        logger.log(statusToLevel(result), result.getMessage());
      }
    }
  }

  private Level statusToLevel(IStatus status) {
    switch (status.getSeverity()) {
      case IStatus.ERROR:
        return Level.ERROR;
      case IStatus.INFO:
        return Level.INFO;
      case IStatus.CANCEL:
        return Level.DEBUG;
      case IStatus.WARNING:
        return Level.WARN;
      default:
        return Level.ERROR;
    }
  }

  protected ActivityParameters createPostTransformationParameters(MultiphasesContext context_p) {
    ActivityParameters params = new ActivityParameters();
    params.addParameter(new GenericParameter<IContext>(ITransposerWorkflow.TRANSPOSER_CONTEXT, context_p, null));
    for (GenericParameter<?> paramHeadless : headlessParameters) {
      params.addParameter(paramHeadless);
    }
    return params;
  }

  protected ActivityParameters createPreTransformationParameters(MultiphasesContext context_p, IOptionsHandler optionsHandler_p) {
    ActivityParameters parameter = new ActivityParameters();
    parameter.addParameter(new GenericParameter<IContext>(ITransposerWorkflow.TRANSPOSER_CONTEXT, context_p, null));
    parameter.addParameter(new GenericParameter<IRulesHandler>(InitializeTransitionActivity.PARAMETER_RULE_HANDLER, null, null));
    parameter.addParameter(new GenericParameter<IHandler>(ITransitionConstants.OPTIONS_HANDLER, optionsHandler_p, "Transposer Options handler"));
    for (GenericParameter<?> paramHeadless : headlessParameters) {
      parameter.addParameter(paramHeadless);
    }
    return parameter;
  }

  // here we fake a cadence invocation to initialize the transition.
  // TODO refactor to allow to be called outside cadence without the use of generic parameters..
  private IStatus initializeMultiphasesTransition(MultiphasesContext context_p, IOptionsHandler optionsHandler_p) {

    if (!merge) {
      context_p.put(ITransitionConstants.DIFFMERGE_DISABLE, Boolean.TRUE);
    }

    ActivityParameters params = createPreTransformationParameters(context_p, optionsHandler_p);

    // this just fills the context with lots of stuff
    IStatus status = new InitializeMultiphasesTransitionActivity().run(params);

    if (status.isOK()) {
      status = new InitializeMultiphasesTransformationActivity().run(params);
    }

    if (status.isOK()) {
      // this initializes the scope with rules from SA.
      try {
        IRulesHandler handler = new ExtendedRulesHandler("org.polarsys.capella.core.transition", MultiphasesContext.Mapping.SA.getMappingId());
        context_p.put(ITransitionConstants.RULES_HANDLER, handler);
      } catch (NonExistingPurposeException e) {
        throw new IllegalStateException(e);
      }
      status = new InitializeScopeActivity().run(params);
    }

    return status;
  }

  protected class SA_Launcher extends AbstractHeadlessMultiphasesLauncher {
    public SA_Launcher(MultiphasesContext context) {
      super(context, MultiphasesContext.Mapping.SA, merge, headlessParameters);
    }
  }

  protected class LA_Launcher extends AbstractHeadlessMultiphasesLauncher {
    public LA_Launcher(MultiphasesContext context_p) {
      super(context_p, MultiphasesContext.Mapping.LA, merge, headlessParameters);
    }
  }

  protected class PA_Launcher extends AbstractHeadlessMultiphasesLauncher {
    public PA_Launcher(MultiphasesContext context_p) {
      super(context_p, MultiphasesContext.Mapping.PA, merge, headlessParameters);
    }
  }

}
