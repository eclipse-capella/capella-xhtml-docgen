/*******************************************************************************
 * Copyright (c) 2021 THALES GLOBAL SERVICES.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales - initial API and implementation
 ******************************************************************************/
package org.polarsys.capella.docgen.helper;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.Version;
import org.polarsys.capella.docgen.Messages;

/**
 * Utility class including Capella version related checks
 * 
 * @author <a href="mailto:arnaud.dieumegard@obeo.fr">Arnaud Dieumegard</a>
 *
 */
public class CapellaVersionHelper {

    private static String DOT = ".";

    CapellaVersionHelper() {
    }

    /**
     * Checks that current Capella version is the same as the docgen version.
     * 
     * @return true if the version major value are the same.
     */
    public static boolean isSupportedCapellaVersion() {
        Boolean result = false;
        Bundle capellaPerspectiveBundle = FrameworkUtil.getBundle(org.polarsys.capella.core.model.helpers.CapellaElementExt.class);
        Version docgenBundleVersion = getDocgenBundleVersion();
        if (capellaPerspectiveBundle != null && docgenBundleVersion != null) {
            Version capellaPerspectiveBundleVersion = capellaPerspectiveBundle.getVersion();
            if (capellaPerspectiveBundleVersion.getMajor() == docgenBundleVersion.getMajor()) {
                result = true;
            }
        }
        return result;
    }

    /**
     * Get the Docgen {@link Version}
     * 
     * @return The current {@code org.polarsys.capella.docgen} bundle version. We assume that all docgen bundles versions
     *         matches this version.
     */
    public static Version getDocgenBundleVersion() {
        Bundle docgenBundle = FrameworkUtil.getBundle(org.polarsys.capella.docgen.Activator.class);
        if (docgenBundle != null) {
            return docgenBundle.getVersion();
        }
        return null;
    }

    /**
     * Get the Docgen bundle version as string (without qualifier). The format is Major.Minor.Mico.
     * 
     * @return The Docgen bundle version as a string.
     */
    public static String getDocgenBundleVersionWithoutQualifier() {
        Version docgenBundleVersion = getDocgenBundleVersion();
        if (docgenBundleVersion != null) {
            return docgenBundleVersion.getMajor() + DOT + "x";
        }
        return Messages.docgenVersionNotFound;
    }

}
