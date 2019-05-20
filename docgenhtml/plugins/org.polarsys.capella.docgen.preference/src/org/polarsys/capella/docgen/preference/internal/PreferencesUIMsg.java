/*******************************************************************************
 * Copyright (c) 2014, 2019 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.capella.docgen.preference.internal;

import org.eclipse.osgi.util.NLS;

/**
 * @author Boubekeur Zendagui
 */

public class PreferencesUIMsg {
	// messages for category page
	public static String CATEGORY_PAGE_LABEL_DOCGEN;
	
	// NLS stuff
	private static final String BUNDLE_PACKAGE = Activator.PLUGIN_ID; //$NON-NLS-1$
	private static final String BUNDLE_FILENAME = "PreferencesUIMsg"; //$NON-NLS-1$
	private static final String BUNDLE_NAME = BUNDLE_PACKAGE + ".internal." + BUNDLE_FILENAME; //$NON-NLS-1$

	static {
		NLS.initializeMessages(BUNDLE_NAME, PreferencesUIMsg.class);
	}
}
