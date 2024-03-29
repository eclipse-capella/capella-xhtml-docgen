/*******************************************************************************
 * Copyright (c) 2022 THALES GLOBAL SERVICES.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.capella.docgen.test.ju.util;

public class CapellaDocGenTestUtil {
	
	private static final String IMG_SRC_ICON_PNG_REPLACEMENT = "img src=\"$1../icon/$2.png\"";
	private static final String IMG_SRC_ICON_GIF_PATTERN = "img src=\"(../)?../icon/(.*?).gif\"";
	private static final String R_N_REPLACEMENT = "\n";
	private static final String R_N = "\\r\\n";

	public static String formatDocGenOutput(String toBeFormattedGenerationContent) {
		String result = toBeFormattedGenerationContent;
		
		// Replace line endings
		result = result.replaceAll(R_N, R_N_REPLACEMENT);
		
		// Set all icon files extensions to png
		result = result.replaceAll(IMG_SRC_ICON_GIF_PATTERN, IMG_SRC_ICON_PNG_REPLACEMENT);
		
		// Remove area coords content (may differ a bit depending on the diagram rendering, the OS, the font availability...) 
		//<area shape="rect" group="bbee94fd1bf74709bc8e3de6dfe74908" coords="226,157,242,173" href="../IFE/bbee94fd1bf74709bc8e3de6dfe74908.html#idbbee94fd-1bf7-4709-bc8e-3de6dfe74908" alt="bbee94fd1bf74709bc8e3de6dfe74908" />
		result = result.replaceAll("area shape=\"(.*?)\" group=\"(.*?)\" coords=\"(.*?)\" href=\"(.*?)\" alt=\"(.*?)\"", "area shape=\"\" group=\"\" coords=\"\" href=\"\" alt\"\"");
		
		return result;
	}

}
