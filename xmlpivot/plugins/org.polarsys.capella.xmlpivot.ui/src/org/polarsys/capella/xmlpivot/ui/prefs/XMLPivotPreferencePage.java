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
package org.polarsys.capella.xmlpivot.ui.prefs;

import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.preferences.ScopedPreferenceStore;
import org.polarsys.capella.xmlpivot.XMLPivotActivator;
import org.polarsys.capella.xmlpivot.XMLPivotPreferences;


/**
 *
 */
public class XMLPivotPreferencePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {

  /**
   * {@inheritDoc}
   */
  @Override
  protected void createFieldEditors() {
    addField(new BooleanFieldEditor(XMLPivotPreferences.EXPORT_ALL_ANCESTORS, "Export all ancestors", getFieldEditorParent()));
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void init(IWorkbench workbench_p) {
    setDescription("XML Pivot Preferences"); //$NON-NLS-1$
  }

/**
 * {@inheritDoc}
 */
@Override
protected IPreferenceStore doGetPreferenceStore() {
	return new ScopedPreferenceStore(new InstanceScope(), XMLPivotActivator.PLUGIN_ID);
}
  
  


}
