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

import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.ui.business.api.viewpoint.ViewpointSelection;
import org.eclipse.ui.statushandlers.StatusManager;
import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.core.data.capellamodeller.Project;
import org.polarsys.capella.core.data.capellamodeller.SystemEngineering;
import org.polarsys.capella.core.model.handler.command.CapellaResourceHelper;
import org.polarsys.capella.core.model.helpers.CapellaElementExt;
import org.polarsys.capella.core.platform.sirius.ui.project.operations.ProjectSessionCreationHelper;
import org.polarsys.capella.core.sirius.ui.helper.SessionHelper;
import org.polarsys.capella.core.transition.common.constants.ITransitionConstants;
import org.polarsys.capella.core.transition.common.handlers.IHandler;
import org.polarsys.capella.core.transition.common.handlers.traceability.ITraceabilityHandler;
import org.polarsys.capella.core.transition.system.activities.InitializeTransformationActivity;
import org.polarsys.capella.core.transition.system.handlers.traceability.config.TransformationConfiguration;
import org.polarsys.capella.transition.system2subsystem.activities.FinalizeSubsystemTransitionActivity;
import org.polarsys.capella.transition.system2subsystem.multiphases.handlers.traceability.config.RecTraceabilityHandler;
import org.polarsys.capella.transition.system2subsystem.multiphases.handlers.traceability.config.SIDTraceabilityHandler;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;


public final class InitializeMultiphasesTransformationActivity extends InitializeTransformationActivity {

  @Override
  protected IHandler createDefaultTraceabilityTransformationHandler() {

    TransformationConfiguration configuration = new TransformationConfiguration() {

      @Override
      protected void initHandlers(IContext fContext_p) {
        addHandler(fContext_p, new SIDTraceabilityHandler(getIdentifier(fContext_p)));
        addHandler(fContext_p, new RecTraceabilityHandler());
      }

      @Override
      public boolean useHandlerForAttachment(EObject source_p, EObject target_p, ITraceabilityHandler handler_p, IContext context_p) {
        if (handler_p instanceof RecTraceabilityHandler) {
          return false;
        }
        return super.useHandlerForAttachment(source_p, target_p, handler_p, context_p);
      }
    };
    return new MultiphaseTraceabilityHandler(configuration);
  }

  /**
  * Overridden to create a temporary transformation project 
  * rather than attaching a new SystemEngineering into the target model.
  */
  @Override
  protected EObject createTargetTransformationContainer(Resource targetResource_p, IContext context_p) {
    EObject result = null;

    if (context_p.get(ITransitionConstants.DIFFMERGE_DISABLE) == Boolean.TRUE) {
      // elements are created directly in the target model
      Project project = (Project) CapellaElementExt.getRoot((CapellaElement) targetResource_p.getContents().get(0));
      result = project.getOwnedModelRoots().get(0);
    } else {

      // Create a temporary project and reload its model through the target editing domain
      // The temporary project is removed later in FinalizeSubsystemTransitionActivity
      try {
        String temporaryProjectName = getTemporaryProjectName(context_p);
        Session session =
            new ProjectSessionCreationHelper(true, true).createFullProject(temporaryProjectName, null, Collections.<IProject> emptyList(),
                ViewpointSelection.getViewpoints(CapellaResourceHelper.CAPELLA_MODEL_FILE_EXTENSION), new NullProgressMonitor());
        Project project = SessionHelper.getCapellaProject(session);
        SystemEngineering engineering = (SystemEngineering) project.getOwnedModelRoots().get(0);
        session.close(new NullProgressMonitor());
        result =
            ((EditingDomain) context_p.get(ITransitionConstants.TRANSITION_TARGET_EDITING_DOMAIN)).getResourceSet().getEObject(EcoreUtil.getURI(engineering),
                true);
        context_p.put(FinalizeSubsystemTransitionActivity.PARAM__DELETE_PROJECT, ResourcesPlugin.getWorkspace().getRoot().getProject(temporaryProjectName));
      } catch (InvocationTargetException exception_p) {
        StatusManager.getManager().handle(
            new Status(IStatus.ERROR, org.polarsys.capella.transition.system2subsystem.Activator.PLUGIN_ID, exception_p.getMessage(), exception_p));
      } catch (InterruptedException exception_p) {
        StatusManager.getManager().handle(
            new Status(IStatus.ERROR, org.polarsys.capella.transition.system2subsystem.Activator.PLUGIN_ID, exception_p.getMessage(), exception_p));
      }
    }
    return result;
  }

  private String getTemporaryProjectName(IContext context_p) {
    return "MultiphaseTransformation_" + new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()); //$NON-NLS-1$ //$NON-NLS-2$
  }

}