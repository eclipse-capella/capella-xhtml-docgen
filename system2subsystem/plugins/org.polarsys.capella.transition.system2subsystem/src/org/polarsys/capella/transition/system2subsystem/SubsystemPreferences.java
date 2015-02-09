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
package org.polarsys.capella.transition.system2subsystem;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.core.runtime.preferences.DefaultScope;
import org.osgi.service.prefs.Preferences;

public class SubsystemPreferences extends AbstractPreferenceInitializer {

  /**
   * Preference key to store whether the temporary transformation project should be kept
   * in the workspace after the transition completes. The default value is false.
   * There is no UI option to change this value, so users have to use -plugincustomization at
   * startup.
   */
  public static final String KEEP_TRANSFORMATION_PROJECT = "keeptransformationproject"; //$NON-NLS-1$

  @Override
  public void initializeDefaultPreferences() {
    Preferences node = DefaultScope.INSTANCE.getNode(org.polarsys.capella.transition.system2subsystem.Activator.PLUGIN_ID);
    node.putBoolean(SubsystemPreferences.KEEP_TRANSFORMATION_PROJECT, false);
  }

}
