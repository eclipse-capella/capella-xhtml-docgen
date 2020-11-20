/*******************************************************************************
 * Copyright (c) 2019, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.capella.docgen.preference;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;

/**
 * @author Arnaud Dieumegard
 */
public class CapellaDocgenPreferenceInitializer extends AbstractPreferenceInitializer {
	
	@Override
	public void initializeDefaultPreferences() {
		CapellaDocgenPreferenceHelper.setDefaultValues();
	}

}
