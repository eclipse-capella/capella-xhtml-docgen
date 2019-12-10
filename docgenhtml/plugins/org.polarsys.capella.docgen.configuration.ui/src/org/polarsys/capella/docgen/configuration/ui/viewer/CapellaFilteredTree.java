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

import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Composite;
import org.polarsys.capella.core.platform.sirius.ui.navigator.view.CapellaCommonNavigatorPatternFilter;

/**
 * Adaptation of {@link org.polarsys.capella.core.platform.sirius.ui.navigator.view.CapellaCommonNavigatorFilteredTree}
 */
public class CapellaFilteredTree extends org.polarsys.capella.common.ui.toolkit.widgets.filter.CapellaFilteredTree {

	public CapellaFilteredTree(Composite parent, int treeStyle, CapellaCommonNavigatorPatternFilter filter,
			int defaultLevelOfExpand) {
		super(parent, treeStyle, filter);

		filter.doSetUseCache(true);

		setLevelOfExpandByDefault(defaultLevelOfExpand);

		((GenerationContainerCheckedTreeViewer) getViewer()).addFilter(filter);
	}
	  
	@Override
	protected TreeViewer doCreateTreeViewer(Composite parent, int style) {
		return new GenerationContainerCheckedTreeViewer(parent, style);
	}

	public void setSearchInDescriptionEnabled(boolean isSearchInDescriptionEnabled) {
		((CapellaCommonNavigatorPatternFilter) getPatternFilter())
				.setSearchInDescriptionEnabled(isSearchInDescriptionEnabled);
	}
}
