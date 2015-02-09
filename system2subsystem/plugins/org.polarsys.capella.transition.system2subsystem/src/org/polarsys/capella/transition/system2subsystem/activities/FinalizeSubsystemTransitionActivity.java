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
package org.polarsys.capella.transition.system2subsystem.activities;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.ui.statushandlers.StatusManager;
import org.polarsys.capella.core.model.handler.helpers.HoldingResourceHelper;
import org.polarsys.capella.core.transition.common.activities.AbstractActivity;
import org.polarsys.capella.core.transition.common.constants.ITransitionConstants;
import org.polarsys.capella.transition.system2subsystem.SubsystemPreferences;
import org.polarsys.kitalpha.cadence.core.api.parameter.ActivityParameters;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;


public class FinalizeSubsystemTransitionActivity extends AbstractActivity {

  public static final String ID = "org.polarsys.capella.transition.system2subsystem.activities.FinalizeSubsystemTransitionActivity"; //$NON-NLS-1$

  public static final String PARAM__DELETE_PROJECT = "FinalizeSubsystemTransitionActivity_Delete_Project"; //$NON-NLS-1$  

  /**
   * {@inheritDoc}
   */
  @Override
  protected IStatus _run(ActivityParameters activityParams_p) {

    unloadHoldingResource(activityParams_p);
    unloadTemporaryResource(activityParams_p);
    handleTemporaryProject(activityParams_p);

    return Status.OK_STATUS;
  }

  private boolean keepTransformationProject() {
    return Platform.getPreferencesService().getBoolean(org.polarsys.capella.transition.system2subsystem.Activator.PLUGIN_ID,
        SubsystemPreferences.KEEP_TRANSFORMATION_PROJECT, false, null);
  }

  private void unloadHoldingResource(ActivityParameters activityParameters_p) {
    TransactionalEditingDomain domain =
        (TransactionalEditingDomain) getContext(activityParameters_p).get(ITransitionConstants.TRANSITION_TARGET_EDITING_DOMAIN);
    if (domain != null) {
      HoldingResourceHelper.flushHoldingResource(domain);
    }
  }

  private void unloadTemporaryResource(ActivityParameters activityParams_p) {
    IContext context = getContext(activityParams_p);
    EObject transformationRoot = (EObject) context.get(ITransitionConstants.TRANSFORMATION_TARGET_ROOT);

    if (transformationRoot != null) {

      Resource transformationResource = transformationRoot.eResource();
      Resource targetResource = (Resource) context.get(ITransitionConstants.TRANSITION_TARGET_RESOURCE);

      // unless we transform directly into the target resource
      // inter and crossphase transform into a resourceless model, so that in these cases the transformationResource is null
      if ((transformationResource != null) && (transformationResource != targetResource)) {

        if (keepTransformationProject()) {
          try {
            transformationResource.save(Collections.emptyMap());
          } catch (IOException exception_p) {
            StatusManager.getManager().handle(
                new Status(IStatus.ERROR, org.polarsys.capella.transition.system2subsystem.Activator.PLUGIN_ID, exception_p.getMessage(), exception_p));
          }
        }

        // remember to unload the transformation resource
        transformationResource.unload();
        transformationResource.getResourceSet().getResources().remove(transformationResource);
      }

      // Remember that the selected target file is loaded into 
      // the editing domain of the source resource to process the transformation.
      // now we're done with it and need to unload it. (The resource was already saved in FinalizeTransitionAction, so theres no need to save it again here)
      if (targetResource != null) {
        targetResource.unload();
        targetResource.getResourceSet().getResources().remove(targetResource);
      }

    }

  }

  private void handleTemporaryProject(ActivityParameters activityParams_p) {
    if (!keepTransformationProject()) {
      IProject toDelete = ((IProject) getContext(activityParams_p).get(PARAM__DELETE_PROJECT));
      if (toDelete != null) {
        try {
          toDelete.delete(true, new NullProgressMonitor());
        } catch (CoreException exception_p) {
          StatusManager.getManager().handle(exception_p, org.polarsys.capella.transition.system2subsystem.Activator.PLUGIN_ID);
        }
      }
    }
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public String getActivityIdentifier() {
    return ID;
  }
}
