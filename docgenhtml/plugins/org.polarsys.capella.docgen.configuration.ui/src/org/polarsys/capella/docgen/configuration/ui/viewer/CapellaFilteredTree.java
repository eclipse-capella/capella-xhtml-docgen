/*******************************************************************************
 * Copyright (c) 2006, 2019 THALES GLOBAL SERVICES and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Thales - initial API and implementation
 *    Obeo - additional customizations
 *******************************************************************************/
package org.polarsys.capella.docgen.configuration.ui.viewer;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.polarsys.capella.common.mdsofa.common.constant.ICommonConstants;
import org.polarsys.capella.common.ui.toolkit.widgets.filter.FilteredTree;
import org.polarsys.capella.common.ui.toolkit.widgets.filter.PatternFilter;
import org.polarsys.capella.core.platform.sirius.ui.navigator.CapellaNavigatorPlugin;
import org.polarsys.capella.core.platform.sirius.ui.navigator.IImageKeys;

/**
 * Copy of org.polarsys.capella.core.platform.sirius.ui.navigator.view.
 * CapellaCommonNavigator.CapellaFilteredTree. Capella Filtered Tree.<br>
 * Standard {@link FilteredTree} adapted to CNF.
 */
public class CapellaFilteredTree extends FilteredTree {

	/**
	 * Constructor.
	 * 
	 * @param parent
	 */
	protected CapellaFilteredTree(Composite parent) {
		super(parent);
		attachFilterControlFocusListener();
	}

	/**
	 * Constructor.
	 * 
	 * @param parent
	 * @param treeStyle
	 * @param filter
	 */
	public CapellaFilteredTree(Composite parent, int treeStyle, PatternFilter filter) {
		super(parent, treeStyle, filter);
		attachFilterControlFocusListener();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void clearText() {
		// Reset pattern filter to default algorithm.
		getPatternFilter().setSearchInDescription(false);
		super.clearText();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void createClearText(Composite parent) {
		// filterToolBar = new ToolBarManager(SWT.FLAT | SWT.HORIZONTAL);
		// filterToolBar.createControl(parent);
		// createSearchDescriptionButton(parent);
		// super.createClearText(parent);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected Composite createFilterControls(Composite parent) {
		// Change the layout of the parent to host 3 widgets.
		GridLayout layout = (GridLayout) parent.getLayout();
		layout.numColumns = 3;
		Composite filterControls = super.createFilterControls(parent);
		return filterControls;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected Label createMessageArea(Composite parent) {
		Label messageArea = super.createMessageArea(parent);
		GridData layoutData = (GridData) messageArea.getLayoutData();
		layoutData.horizontalSpan = 3;
		String labelText = messageArea.getText();
		labelText += ". Hit Enter to appply the filter";
		messageArea.setText(labelText);
		return messageArea;
	}

	/**
	 * Create the button that triggers search in description.
	 * 
	 * @param parent
	 *            parent <code>Composite</code> of toolbar button
	 */
	private void createSearchDescriptionButton(Composite parent) {
		IAction searchInDescriptionAction = new Action(ICommonConstants.EMPTY_STRING, IAction.AS_PUSH_BUTTON) {
			/**
			 * {@inheritDoc}
			 */
			@SuppressWarnings("synthetic-access")
			@Override
			public void run() {
				// Set pattern filter to search in description algorithm.
				getPatternFilter().setSearchInDescription(true);
				textChanged();
			}
		};
		searchInDescriptionAction.setToolTipText(
				org.polarsys.capella.core.platform.sirius.ui.navigator.view.Messages.CapellaCommonNavigator_searchInDescriptionAction_Tooltip);
		searchInDescriptionAction.setImageDescriptor(
				CapellaNavigatorPlugin.getDefault().getImageDescriptor(IImageKeys.IM_SEARCH_DESCRIPTION));
		filterToolBar.add(searchInDescriptionAction);
	}

	/**
	 * @see org.eclipse.ui.dialogs.FilteredTree#doCreateTreeViewer(org.eclipse.swt.widgets.Composite,
	 *      int)
	 */
	@Override
	protected TreeViewer doCreateTreeViewer(Composite parent, int style) {
		return new GenerationContainerCheckedTreeViewer(parent, style);
	}

	/**
	 * @see org.polarsys.capella.common.ui.toolkit.widgets.filter.FilteredTree#getExpansionLevelWhenNoFilter()
	 */
	@Override
	protected int getExpansionLevelWhenNoFilter() {
		return 4; // Enables to see all architecture packages.
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CapellaNavigatorPatternFilter getPatternFilter() {
		return (CapellaNavigatorPatternFilter) super.getPatternFilter();
	}

	/**
	 * It seems there is a bug when the filter is cleared.
	 */
	protected void handleTreeViewerExpansionWhenNoFilter(ISelection currentSelection, Object[] expandedElements) {
		super.handleTreeViewerExpansionWhenNoFilter(currentSelection, expandedElements);
		treeViewer.refresh(false);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void handleCRKeyStoke() {
		// Reset pattern filter to default algorithm.
		getPatternFilter().setSearchInDescription(false);
		super.handleCRKeyStoke();
	}

	/**
	 * @see org.polarsys.capella.common.ui.toolkit.widgets.filter.FilteredTree#init(int,
	 *      org.polarsys.capella.common.ui.toolkit.widgets.filter.PatternFilter)
	 */
	@Override
	protected void init(int treeStyle, PatternFilter filter) {
		// Disable auto filtering for usability.
		setAutoFiltering(false);
		super.init(treeStyle, filter);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void updateToolbar(boolean visible) {
		// Do nothing as we want to always see the toolbar to access search
		// in description.
		// IContributionItem[] items = filterToolBar.getItems();
		// items[hasNativeClearButton() ? 0 : 1].setVisible(visible);
		// filterToolBar.update(true);
	}

	private void attachFilterControlFocusListener() {
		getFilterControl().addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				// whenever the filter text control receives the focus,
				// uninstall
				// the global cut/copy/paste handlers set in
				// EditCommonActionProvider
				// IActionBars ab = getViewSite().getActionBars();
				// ab.setGlobalActionHandler(ActionFactory.CUT.getId(), null);
				// ab.setGlobalActionHandler(ActionFactory.COPY.getId(), null);
				// ab.setGlobalActionHandler(ActionFactory.PASTE.getId(), null);
			}
		});
	}
}
