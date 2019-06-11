/*******************************************************************************
 * Copyright (c) 2019 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.capella.docgen.preference.internal;

import org.eclipse.osgi.util.NLS;

/**
 * @author Boubekeur Zendagui
 */

public class Messages {

	public static String EXPORT__STATUS_AND_REVIEW_FIELD_LABEL;
	public static String EXPORT__COMPONENT_EXCHANGE_FIELD_LABEL;
	public static String EXPORT__FUNCTIONAL_EXCHANGE_FIELD_LABEL;
	public static String EXPORT__PHYSICAL_LINK_FIELD_LABEL;
	
	private static final String BUNDLE_PACKAGE = Activator.PLUGIN_ID; //$NON-NLS-1$
	private static final String BUNDLE_FILENAME = "Messages"; //$NON-NLS-1$
	private static final String BUNDLE_NAME = BUNDLE_PACKAGE + ".internal." + BUNDLE_FILENAME; //$NON-NLS-1$

	static {
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}
}
