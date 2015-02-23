/*******************************************************************************
 * Copyright (c) 2006, 2015 THALES GLOBAL SERVICES.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *    
 *  Contributors:
 *     Thales - initial API and implementation
 ******************************************************************************/
package org.polarsys.capella.xmlpivot.common.skeleton;

import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.core.data.capellacore.EnumerationPropertyType;
import org.polarsys.capella.core.data.capellamodeller.Project;
import org.polarsys.capella.core.model.handler.helpers.CapellaProjectHelper;

/**
 */
public class ProjectWalker extends AbstractModelWalker {

  /**
   * @param parent_p
   */
  @Override
  public void accept(EObject parent_p, ModelWalkerHelper helper) {
    Project project = (Project) parent_p;
    if (project.getOwnedModelRoots().isEmpty()) {
      project.getOwnedModelRoots().add(helper.getSystemEngineering());
    }

    addProgressStatus(project);

  }

  private void addProgressStatus(Project p) {
    for (EnumerationPropertyType ept : p.getOwnedEnumerationPropertyTypes()) {
      if (CapellaProjectHelper.PROGRESS_STATUS_KEYWORD.equals(ept.getName())) {
        return;
      }
    }
    CapellaProjectHelper.addProjectProgressStatus(p);
  }

}
