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

package org.polarsys.capella.docgen.configuration.ui.actions;

import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.navigator.CommonActionProvider;
import org.eclipse.ui.navigator.ICommonActionExtensionSite;
import org.eclipse.ui.navigator.ICommonMenuConstants;
import org.polarsys.capella.core.platform.sirius.ui.navigator.actions.SelectionHelper;

public class HTMLDocumentationConfigurationGenerationActionProvider extends CommonActionProvider {
	/**
	 * Model's HTML Documentation Generation action.
	 */
	private HTMLDocumentationConfigurationGenerationAction htmlDocumentationGenerationAction;

	/**
	 * @see org.eclipse.ui.actions.ActionGroup#dispose()
	 */
	@Override
	public void dispose() {
		ISelectionProvider selectionProvider = getActionSite().getViewSite().getSelectionProvider();
		if (null != htmlDocumentationGenerationAction) {
			selectionProvider.removeSelectionChangedListener(htmlDocumentationGenerationAction);
			htmlDocumentationGenerationAction = null;
		}
		super.dispose();
	}

	/**
	 * @see org.eclipse.ui.actions.ActionGroup#fillActionBars(org.eclipse.ui.IActionBars)
	 */
	@Override
	public void fillActionBars(IActionBars actionBars_p) {
		// Do nothing.
	}

	/**
	 * @see org.eclipse.ui.actions.ActionGroup#fillContextMenu(org.eclipse.jface.action.IMenuManager)
	 */
	@Override
	public void fillContextMenu(IMenuManager menu_p) {
		menu_p.appendToGroup(ICommonMenuConstants.GROUP_GENERATE, htmlDocumentationGenerationAction);
		if (htmlDocumentationGenerationAction != null) {
			htmlDocumentationGenerationAction.updateSatus();
		}
	}

	/**
	 * @see org.eclipse.ui.navigator.CommonActionProvider#init(org.eclipse.ui.navigator.ICommonActionExtensionSite)
	 */
	@Override
	public void init(ICommonActionExtensionSite site_p) {
		super.init(site_p);
		ISelectionProvider selectionProvider = site_p.getViewSite().getSelectionProvider();
		htmlDocumentationGenerationAction = new HTMLDocumentationConfigurationGenerationAction();
		SelectionHelper.registerToSelectionChanges(htmlDocumentationGenerationAction, selectionProvider);
	}
}
