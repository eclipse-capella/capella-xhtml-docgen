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
package org.polarsys.capella.transition.system2subsystem.handlers.session;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.polarsys.capella.common.data.modellingcore.ModelElement;
import org.polarsys.capella.core.transition.common.capellaHelpers.HashMapSet;
import org.polarsys.capella.core.transition.common.handlers.session.DefaultSessionHandler;
import org.polarsys.capella.transition.system2subsystem.context.SubSystemContext;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;

/**
 *
 */
public class SubSystemSessionHandler extends DefaultSessionHandler {

  private static final String DEFAULT_EOBJECT = "DEFAULT_EOBJECT"; //$NON-NLS-1$

  /**
   * {@inheritDoc}
   */
  @Override
  public IStatus dispose(IContext context_p) {
    return Status.OK_STATUS;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public EObject getEObjectFromId(String id_p, IContext context_p) {

    EObject element = null;

    if (id_p != null) {

      Iterator<Resource> resources = getRelatedResources(context_p).iterator();
      while (resources.hasNext() && (element == null)) {
        Resource resource = resources.next();
        element = resource.getEObject(id_p);

        if (element == null) {

          if (!context_p.exists("MAPPP")) {
            HashMapSet<String, EObject> map = new HashMapSet<String, EObject>();
            context_p.put("MAPPP", map);
            Iterator<EObject> childs = resource.getAllContents();
            while (childs.hasNext() && (element == null)) {
              EObject child = childs.next();
              if (child instanceof ModelElement) {
                String sid = ((ModelElement) child).getSid();
                if (sid != null) {
                  map.put(sid, child);
                }
              }
            }
          }

          HashMapSet<String, EObject> map = (HashMapSet<String, EObject>) context_p.get("MAPPP");
          Collection<EObject> elements = map.get(id_p);
          if (!(elements.isEmpty())) {
            element = elements.iterator().next();
          }
        }
      }
    }

    if (element != null) {
      return element;
    }
    if (context_p instanceof SubSystemContext) {
      return getDefaultEObject(context_p);
    }
    return element;
  }

  protected EObject getDefaultEObject(IContext context_p) {
    if (!context_p.exists(DEFAULT_EOBJECT)) {
      context_p.put(DEFAULT_EOBJECT, EcorePackage.Literals.ECLASS);
    }
    return (EObject) context_p.get(DEFAULT_EOBJECT);

  }
}
