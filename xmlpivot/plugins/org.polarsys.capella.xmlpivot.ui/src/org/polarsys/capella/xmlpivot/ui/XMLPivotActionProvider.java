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
package org.polarsys.capella.xmlpivot.ui;

import org.eclipse.jface.action.GroupMarker;
import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.ui.internal.navigator.resources.actions.OpenActionProvider;
import org.eclipse.ui.navigator.ICommonMenuConstants;

/**
 * Provides functions to open/openWith for XML files. 
 * 
 * The OpenActionProvider which is usually sufficient for this cannot be used directly
 * because the core menu setup does not add an OPEN_WITH group to the menu, which the
 * OpenActionProvider expects. So I override fillContextMenu to add the OPEN_WITH
 * group if it does not exist, and then let the OpenActionProvider continue.
 * 
 */
public class XMLPivotActionProvider extends OpenActionProvider {

  /**
   * {@inheritDoc}
   */
  @Override
  public void fillContextMenu(IMenuManager menu_p) {
    for (IContributionItem i : menu_p.getItems()){
      if (ICommonMenuConstants.GROUP_OPEN_WITH.equals(i.getId())){
        super.fillContextMenu(menu_p);
        return;
      }
    } 
    menu_p.insertAfter(ICommonMenuConstants.GROUP_OPEN, new GroupMarker(ICommonMenuConstants.GROUP_OPEN_WITH));
    super.fillContextMenu(menu_p);
  }
  
}
