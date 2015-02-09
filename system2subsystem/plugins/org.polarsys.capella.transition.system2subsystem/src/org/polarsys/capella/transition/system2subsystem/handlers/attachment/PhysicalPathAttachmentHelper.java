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
package org.polarsys.capella.transition.system2subsystem.handlers.attachment;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.core.data.cs.PhysicalPath;
import org.polarsys.capella.core.data.cs.PhysicalPathInvolvement;
import org.polarsys.capella.core.transition.common.handlers.IHandler;
import org.polarsys.capella.core.transition.common.handlers.scope.ScopeHandlerHelper;
import org.polarsys.capella.core.transition.common.handlers.transformation.TransformationHandlerHelper;
import org.polarsys.capella.transition.system2subsystem.constants.ISubSystemConstants;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;


/**
 * 
 */
public class PhysicalPathAttachmentHelper implements IHandler {

  protected static final String PHYSICAL_PATH_ATTACHMENT_MAP = "PPAttachmentMap"; //$NON-NLS-1$

  public static PhysicalPathAttachmentHelper getInstance(IContext context_p) {
    PhysicalPathAttachmentHelper handler = (PhysicalPathAttachmentHelper) context_p.get(ISubSystemConstants.PHYSICAL_PATH_ATTACHMENT_HELPER);
    if (handler == null) {
      handler = new PhysicalPathAttachmentHelper();
      handler.init(context_p);
      context_p.put(ISubSystemConstants.PHYSICAL_PATH_ATTACHMENT_HELPER, handler);
    }
    return handler;
  }

  public Boolean isValidElement(EObject source, IContext context_p) {
    Boolean cache = getMap(context_p).get(source);
    if (cache == null) {
      cache = Boolean.FALSE;
    }
    return cache;
  }

  public void setValidElement(EObject source, Boolean target, IContext context_p) {
    getMap(context_p).put(source, target);
  }

  @SuppressWarnings("unchecked")
  protected Map<EObject, Boolean> getMap(IContext context_p) {
    if (context_p.get(PHYSICAL_PATH_ATTACHMENT_MAP) == null) {
      context_p.put(PHYSICAL_PATH_ATTACHMENT_MAP, new HashMap<EObject, Boolean>());
    }
    return (Map<EObject, Boolean>) context_p.get(PHYSICAL_PATH_ATTACHMENT_MAP);
  }

  /**
   * {@inheritDoc}
   */
  public IStatus init(IContext context_p) {
    return Status.OK_STATUS;
  }

  /**
   * {@inheritDoc}
   */
  public IStatus dispose(IContext context_p) {
    return Status.OK_STATUS;
  }

  /**
   * Returns whether the involvement can be transitioned (in the scope and involved is transitioned)
   */
  protected boolean isValidInvolvement(PhysicalPathInvolvement element_p, IContext context_p) {
    boolean a = ScopeHandlerHelper.getInstance(context_p).isInScope(element_p, context_p);
    IStatus b = TransformationHandlerHelper.getInstance(context_p).isOrWillBeTransformed(element_p.getInvolvedElement(), context_p);
    return a && b.isOK();
  }

  /**
   * Put in the map true for all valid functional chain involvement (stop browsing the chain after the first invalid involvement)
   */
  public void computePath(PhysicalPath element_p, IContext context_p) {

    LinkedList<PhysicalPathInvolvement> sources = new LinkedList<PhysicalPathInvolvement>();
    LinkedList<PhysicalPathInvolvement> valids = new LinkedList<PhysicalPathInvolvement>();
    sources.addAll(element_p.getFirstPhysicalPathInvolvements());

    // Retrieve the first valid involvement
    while (sources.size() > 0) {
      PhysicalPathInvolvement involmt = sources.removeFirst();
      boolean isValid = isValidInvolvement(involmt, context_p);
      if (isValid) {
        setValidElement(involmt, Boolean.valueOf(isValid), context_p);
        valids.add(involmt);
        break;
      }
      sources.addAll(involmt.getNextInvolvements());
    }

    while (valids.size() > 0) {
      PhysicalPathInvolvement involmt = valids.removeFirst();
      boolean isValid = isValidInvolvement(involmt, context_p);
      setValidElement(involmt, Boolean.valueOf(isValid), context_p);
      if (isValid) {
        valids.addAll(involmt.getNextInvolvements());
      }
    }

  }
}
