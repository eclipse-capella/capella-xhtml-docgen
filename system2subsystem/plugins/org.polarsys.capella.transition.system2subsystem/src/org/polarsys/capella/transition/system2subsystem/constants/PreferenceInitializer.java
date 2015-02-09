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
package org.polarsys.capella.transition.system2subsystem.constants;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.core.runtime.preferences.DefaultScope;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;

/**
 * 
 */
public class PreferenceInitializer extends AbstractPreferenceInitializer {

  /**
   * {@inheritDoc}
   */
  @Override
  public void initializeDefaultPreferences() {
    IEclipsePreferences node = new DefaultScope().getNode(IOptionsConstants.SYSTEM2SUBSYSTEM_PREFERENCES);

    node.put(IOptionsConstants.DATA_EXPORT, IOptionsConstants.DATA_EXPORT_DEFAULT_VALUE);
    node.put(IOptionsConstants.DIAGRAM_EXPORT, IOptionsConstants.DIAGRAM_EXPORT_DEFAULT_VALUE);
    node.put(IOptionsConstants.FUNCTIONAL_CHAIN_EXPORT, IOptionsConstants.FUNCTIONAL_CHAIN_EXPORT_DEFAULT_VALUE);
    node.put(IOptionsConstants.HIERARCHICAL_EXPORT, IOptionsConstants.HIERARCHICAL_EXPORT_DEFAULT_VALUE);
    node.put(IOptionsConstants.INTERFACE_EXPORT, IOptionsConstants.INTERFACE_EXPORT_DEFAULT_VALUE);

  }
}
