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

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.polarsys.capella.core.transition.common.constants.ITransitionConstants;
import org.polarsys.capella.core.transition.common.constants.Messages;
import org.polarsys.capella.core.transition.common.exception.TransitionException;
import org.polarsys.capella.core.transition.common.handlers.log.LogHelper;
import org.polarsys.capella.core.transition.common.transposer.ExtendedTransposer;
import org.polarsys.capella.transition.system2subsystem.launcher.SubSystemLauncher;
import org.polarsys.capella.transition.system2subsystem.multiphases.MultiphasesContext;
import org.polarsys.capella.transition.system2subsystem.transposer.SubsystemRuleHandler;
import org.polarsys.kitalpha.cadence.core.api.parameter.GenericParameter;
import org.polarsys.kitalpha.cadence.core.api.parameter.WorkflowActivityParameter;
import org.polarsys.kitalpha.transposer.TransposerCorePlugin;
import org.polarsys.kitalpha.transposer.api.ITransposerWorkflow;
import org.polarsys.kitalpha.transposer.rules.handler.exceptions.mappings.purposes.NonExistingPurposeException;

class AbstractHeadlessMultiphasesLauncher extends SubSystemLauncher {

  private final MultiphasesContext context;
  private final MultiphasesContext.Mapping mapping;
  private final boolean isMerge;
  private final Collection<GenericParameter<?>> headlessParameters;

  public AbstractHeadlessMultiphasesLauncher(MultiphasesContext context_p, MultiphasesContext.Mapping mapping_p, boolean isMerge_p,
      Collection<? extends GenericParameter<?>> headlessParameters_p) {
    context = context_p;
    mapping = mapping_p;
    isMerge = isMerge_p;
    headlessParameters = new ArrayList<GenericParameter<?>>(headlessParameters_p);
  }

  @Override
  protected final String getMapping() {
    return mapping.getMappingId();
  }

  @Override
  public final void run(Collection<Object> selection_p, boolean save, IProgressMonitor monitor_p) {
    context.setMapping(mapping);
    super.run(selection_p, save, monitor_p);
  }

  @Override
  // overridden to update rules handler in context
  public final void launch(Collection<Object> selection_p, String purpose_p, String mappingId_p, IProgressMonitor monitor_p) {
    try {
      initializeLogHandler();
      _transposer = createTransposer(purpose_p, mappingId_p);
      context.put(ITransitionConstants.TRANSPOSER_INSTANCE, _transposer);
      context.put(ITransitionConstants.TRANSPOSER_SELECTION, selection_p);
      context.put(ITransposerWorkflow.TRANSPOSER_ANALYSIS_SOURCES, new ArrayList<Object>());
      context.put(ITransitionConstants.RULES_HANDLER, _transposer.getRulesHandler());
      triggerActivities(selection_p, getWorkflow(), monitor_p);

    } catch (OperationCanceledException e) {
      processCancel();
      throw e;

    } catch (TransitionException e) {
      LogHelper.getInstance().error(e.getMessage(), Messages.Activity_Transition);
      e.printStackTrace();
      throw e;

    } catch (Exception e) {
      LogHelper.getInstance().error(e.getMessage(), Messages.Activity_Transition);
      e.printStackTrace();
      throw new TransitionException(e);

    } finally {
      dispose();
    }
  }

  @Override
  protected final WorkflowActivityParameter buildInitializationActivities() {
    return new WorkflowActivityParameter();
  }

  @Override
  // context is shared across different transposer invocations
  // this requires some initialization tricks since this kind of usage
  // was never predicted in transposer
  protected ExtendedTransposer createTransposer(String purpose_p, String mappingId_p) {
    return new ExtendedTransposer(purpose_p, mappingId_p) {
      @Override
      public void initCadence() {
        cadenceLauncher = _cadenceLauncher;
      }

      @Override
      public void initRulesHandler(String purpose_p, String mappingId_p) {
        try {
          _rulesHandler = new SubsystemRuleHandler(purpose_p, mappingId_p);
          _rulesHandler.setContext(context);
          initContext();
        } catch (NonExistingPurposeException e) {
          TransposerCorePlugin.getDefault().logError(TransposerCorePlugin.PLUGIN_ID, e.getMessage(), e);
        }
      }
    };
  }

  @Override
  protected final Collection<GenericParameter<?>> getHeadlessParameters() {
    return headlessParameters;
  }

  @Override
  protected final WorkflowActivityParameter buildDiffMergeActivities() {
    return new WorkflowActivityParameter();
  }
}
