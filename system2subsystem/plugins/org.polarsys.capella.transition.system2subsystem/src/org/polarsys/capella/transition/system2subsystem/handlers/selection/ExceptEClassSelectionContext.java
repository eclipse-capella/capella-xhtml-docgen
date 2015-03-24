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
package org.polarsys.capella.transition.system2subsystem.handlers.selection;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.core.transition.common.handlers.selection.ISelectionContext;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;

/**
 *
 */
public class ExceptEClassSelectionContext implements ISelectionContext {

  EClass[] _classes;

  ISelectionContext parent;

  public ExceptEClassSelectionContext(ISelectionContext parent_p, EClass... classes_p) {
    _classes = classes_p;
    parent = parent_p;
  }

  public ExceptEClassSelectionContext(EClass... classes_p) {
    _classes = classes_p;
  }

  public boolean match(EObject source_p, EObject target_p, IContext context_p) {
    if (parent != null) {
      if (!(parent.match(source_p, target_p, context_p))) {
        return false;
      }
    }
    for (EClass clazz : _classes) {
      if ((clazz != null) && clazz.isInstance(target_p)) {
        return false;
      }
    }
    return true;
  }

}
