/*******************************************************************************
 * Copyright (c) 2017, 2019 Obeo.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/

package org.polarsys.capella.docgen.configuration.ui.viewer.providers;

import org.polarsys.capella.common.ui.toolkit.browser.content.provider.IBrowserContentProvider;
import org.polarsys.capella.common.ui.toolkit.browser.content.provider.wrapper.BrowserElementWrapper;
import org.polarsys.capella.docgen.configuration.ui.Messages;

/**
 * Wrapper for a root category Element.
 */
public class RootCategoryWrapper extends BrowserElementWrapper {
	/**
	 * browser id
	 */
	private String browserID;

	/**
	 * Constructor.
	 * 
	 * @param element
	 * @param browserID
	 */
	public RootCategoryWrapper(Object element, String browserID) {
		super(element);
		this.browserID = browserID;
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see org.polarsys.capella.common.ui.toolkit.browser.content.provider.wrapper.BrowserElementWrapper#equals(java.lang.Object)
	 */
	public boolean equals(final Object object) {
		return (this == object);
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		if (IBrowserContentProvider.ID_REFERENCED_CP.equals(browserID)) {
			return Messages.RootCategoryWrapper_0;
		}
		if (IBrowserContentProvider.ID_REFERENCING_CP.equals(browserID)) {
			return Messages.RootCategoryWrapper_1;
		}
		return super.toString();
	}

	/**
	 * @return _browserID
	 */
	public String getBrowserID() {
		return browserID;
	}

}
