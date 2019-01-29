/*******************************************************************************
 * Copyright (c) 2006, 2019 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales - initial API and implementation
 *   Obeo - add support for generation configuration files
 ******************************************************************************/

package org.polarsys.capella.docgen.configuration.commandline;

import org.eclipse.osgi.util.NLS;

/**
 * From org.polarsys.capella.docgen.commandline.Messages. Add
 * configuration_mandatory.
 */
public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.polarsys.capella.docgen.configuration.commandline.messages"; //$NON-NLS-1$
	public static String workspace_in_use;
	public static String project;
	public static String not_exist;
	public static String outputfolder_mandatory;
	public static String aird;
	public static String exec_pb;
	public static String filepath_point_to_aird;
	public static String generation_done;
	public static String representation_mandatory;
	public static String resource_prefix;
	public static String configuration_mandatory;
	public static String no_root_semantic_element;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
