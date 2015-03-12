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

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.polarsys.capella.core.data.capellamodeller.Project;
import org.polarsys.capella.core.data.cs.Part;
import org.polarsys.capella.core.model.handler.helpers.HoldingResource;
import org.polarsys.capella.core.transition.common.constants.IOptionsConstants;
import org.polarsys.capella.core.transition.common.constants.ITransitionConstants;
import org.polarsys.capella.core.transition.common.handlers.IHandler;
import org.polarsys.capella.core.transition.common.handlers.options.OptionsHandlerHelper;
import org.polarsys.capella.core.transition.common.handlers.scope.CompoundScopeFilter;
import org.polarsys.capella.core.transition.common.handlers.scope.CompoundScopeRetriever;
import org.polarsys.capella.core.transition.common.handlers.scope.IScopeFilter;
import org.polarsys.capella.core.transition.common.handlers.scope.IScopeRetriever;
import org.polarsys.capella.core.transition.system.handlers.attachment.CapellaDefaultAttachmentHandler;
import org.polarsys.capella.transition.system2subsystem.constants.ISubSystemConstants;
import org.polarsys.capella.transition.system2subsystem.handlers.attachment.FunctionalChainAttachmentHelper;
import org.polarsys.capella.transition.system2subsystem.handlers.attachment.PhysicalPathAttachmentHelper;
import org.polarsys.capella.transition.system2subsystem.handlers.attachment.ScenarioAttachmentHelper;
import org.polarsys.capella.transition.system2subsystem.handlers.scope.PropertyValuesScopeFilter;
import org.polarsys.capella.transition.system2subsystem.handlers.scope.PropertyValuesScopeRetriever;
import org.polarsys.capella.transition.system2subsystem.handlers.session.SubSystemSessionHandler;
import org.polarsys.kitalpha.cadence.core.api.parameter.ActivityParameters;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;
import org.polarsys.capella.transition.system2subsystem.handlers.scope.ExternalFunctionsScopeRetriever;


/**
 * 
 */
public class InitializeTransitionActivity extends org.polarsys.capella.core.transition.system.activities.InitializeTransitionActivity {

  public static final String ID = "org.polarsys.capella.transition.system2subsystem.activities.InitializeTransitionActivity"; //$NON-NLS-1$

  @Override
  protected String getDefaultOptionsScope() {
    return "capella.core.transition.system2subsystem"; //$NON-NLS-1$
  }

  @Override
  protected IStatus initializeScopeFilterHandlers(IContext context_p, CompoundScopeFilter handler_p, ActivityParameters activityParams_p) {
    IScopeFilter filter = PropertyValuesScopeFilter.getInstance(context_p);
    handler_p.addScopeFilter(filter, context_p);

    return super.initializeScopeFilterHandlers(context_p, handler_p, activityParams_p);
  }

  @Override
  protected Collection<Object> adaptSelection(Collection<Object> selection_p) {
    Collection<Object> superCollection = super.adaptSelection(selection_p);
    Collection<Object> result = new ArrayList<Object>();
    for (Object item : superCollection) {
      if (item instanceof EObject) {
        if (item instanceof Part) {
          item = ((Part) item).getAbstractType();
        }
        result.add(item);
      }
    }
    return result;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  protected IStatus initializeScopeRetrieverHandlers(IContext context_p, CompoundScopeRetriever handler_p, ActivityParameters activityParams_p) {
    IScopeRetriever retriever = new PropertyValuesScopeRetriever();
    handler_p.addScopeRetriever(retriever, context_p);
    
    handler_p.addScopeRetriever(new ExternalFunctionsScopeRetriever(), context_p);
    
    return super.initializeScopeRetrieverHandlers(context_p, handler_p, activityParams_p);
  }

  @Override
  protected IStatus initializeContext(IContext context_p, ActivityParameters activityParams_p) {

    IHandler handler = new FunctionalChainAttachmentHelper();
    handler.init(context_p);
    context_p.put(ISubSystemConstants.FUNCTIONAL_CHAIN_ATTACHMENT_HELPER, handler);

    handler = new PhysicalPathAttachmentHelper();
    handler.init(context_p);
    context_p.put(ISubSystemConstants.PHYSICAL_PATH_ATTACHMENT_HELPER, handler);

    handler = new ScenarioAttachmentHelper();
    handler.init(context_p);
    context_p.put(ISubSystemConstants.SCENARIO_ATTACHMENT_HELPER, handler);

    return super.initializeContext(context_p, activityParams_p);
  }

  @Override
  protected IStatus initializeTarget(IContext context_p, ActivityParameters activityParams_p) {

    String outputproject =
        OptionsHandlerHelper.getInstance(context_p).getStringValue(context_p, IOptionsConstants.TRANSITION_PREFERENCES, IOptionsConstants.OUTPUT_PROJECT,
            IOptionsConstants.OUTPUT_PROJECT_DEFAULT_VALUE);
    Resource outputResource = null;

    URI fileUri = URI.createPlatformResourceURI(outputproject, true);

    // we must use a single editing domain throughout the entire operation
    EditingDomain targetDomain = (EditingDomain) context_p.get(ITransitionConstants.TRANSITION_SOURCE_EDITING_DOMAIN);
    context_p.put(ITransitionConstants.TRANSITION_TARGET_EDITING_DOMAIN, targetDomain);

    outputResource = targetDomain.getResourceSet().getResource(fileUri, true);
    context_p.put(ITransitionConstants.TRANSITION_TARGET_RESOURCE, outputResource);

    Project project = (Project) outputResource.getContents().get(0);
    context_p.put(ITransitionConstants.TRANSITION_TARGET_ROOT, getEngineering(project, project.getName()));

    return Status.OK_STATUS;
  }

  /**
   * Create default session handler for common transition
   * @return
   */
  @Override
  protected IHandler createDefaultSessionHandler() {
    return new SubSystemSessionHandler();
  }

  /**
   * Return a customized attachment handler that
   * detaches elements from the holding resource 
   * as soon as they are attached to their destination container
   */
  @Override
  protected IHandler createDefaultAttachmentHandler() {
    return new CapellaDefaultAttachmentHandler(){
      @Override
      public boolean attachElementByReference(EObject sourceAttaching_p, EObject targetAttaching_p, EObject sourceAttached_p, EObject targetAttached_p,
          EReference sourceFeature_p, EReference targetFeature_p) {
        boolean result = super.attachElementByReference(sourceAttaching_p, targetAttaching_p, sourceAttached_p, targetAttached_p, sourceFeature_p, targetFeature_p);
        if (((InternalEObject)targetAttached_p).eDirectResource() instanceof HoldingResource && targetAttached_p.eContainer() != null){
          targetAttached_p.eResource().getContents().remove(targetAttached_p);
        }
        return result;
      }
    };
  }
  
}
