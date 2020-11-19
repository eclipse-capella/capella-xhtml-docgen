/*******************************************************************************
 * Copyright (c) 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
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
	public static String EXPORT__DIAGRAM_TREE_FIELD_LABEL;
	
	private static final String BUNDLE_PACKAGE = Activator.PLUGIN_ID; //$NON-NLS-1$
	private static final String BUNDLE_FILENAME = "Messages"; //$NON-NLS-1$
	private static final String BUNDLE_NAME = BUNDLE_PACKAGE + ".internal." + BUNDLE_FILENAME; //$NON-NLS-1$

	static {
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}
}
