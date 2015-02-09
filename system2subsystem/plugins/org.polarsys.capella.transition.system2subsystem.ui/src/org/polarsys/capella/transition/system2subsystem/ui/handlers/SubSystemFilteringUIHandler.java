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
package org.polarsys.capella.transition.system2subsystem.ui.handlers;

import java.util.Collection;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.diffmerge.api.diff.IDifference;
import org.polarsys.capella.core.transition.common.ui.handlers.filter.FilteringUIDifferencesHandler;
import org.polarsys.capella.transition.system2subsystem.context.SubSystemContext;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;


/**
 *
 */
public class SubSystemFilteringUIHandler extends FilteringUIDifferencesHandler {

  @Override
  public IStatus processDifferences(IContext context_p, Collection<IDifference> diffSource_p, Collection<IDifference> diffTarget_p) {
    return super.processDifferences(new SubSystemContext(context_p), diffSource_p, diffTarget_p);
  }

  @Override
  protected IStatus displayDifferences(IContext context_p, Collection<IDifference> diffSource_p, Collection<IDifference> diffTarget_p) {
    return super.displayDifferences(context_p, diffSource_p, diffTarget_p);
  }
}
