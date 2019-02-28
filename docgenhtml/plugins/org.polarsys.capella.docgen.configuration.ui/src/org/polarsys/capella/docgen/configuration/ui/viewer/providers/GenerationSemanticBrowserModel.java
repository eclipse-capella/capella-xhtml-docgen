/*******************************************************************************
 * Copyright (c) 2017, 2019 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package org.polarsys.capella.docgen.configuration.ui.viewer.providers;

import java.util.List;

import org.polarsys.capella.common.ui.toolkit.browser.category.CategoryImpl;
import org.polarsys.capella.common.ui.toolkit.browser.category.ICategory;
import org.polarsys.capella.common.ui.toolkit.browser.model.ISemanticBrowserModel;

/**
 * SemanticBrowserModel for generation.
 *
 */
public class GenerationSemanticBrowserModel implements ISemanticBrowserModel {
	/**
	 * (non-Javadoc)
	 * 
	 * @see org.polarsys.capella.common.ui.toolkit.browser.model.ISemanticBrowserModel#setShowPatterns(boolean)
	 */
	@Override
	public void setShowPatterns(boolean hidePatterns) {
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see org.polarsys.capella.common.ui.toolkit.browser.model.ISemanticBrowserModel#setShowDiagrams(boolean)
	 */
	@Override
	public void setShowDiagrams(boolean hideDiagrams) {
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see org.polarsys.capella.common.ui.toolkit.browser.model.ISemanticBrowserModel#setLimitateTreeExpansion(boolean)
	 */
	@Override
	public void setLimitateTreeExpansion(boolean limitateTreeExpansion) {
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see org.polarsys.capella.common.ui.toolkit.browser.model.ISemanticBrowserModel#saveExpandedState(org.polarsys.capella.common.ui.toolkit.browser.category.CategoryImpl,
	 *      java.lang.String, boolean)
	 */
	@Override
	public void saveExpandedState(CategoryImpl category, String browserID, boolean expanded) {
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see org.polarsys.capella.common.ui.toolkit.browser.model.ISemanticBrowserModel#getOrCreateHistory(java.lang.String)
	 */
	@Override
	public List<String> getOrCreateHistory(String browserID) {
		return null;
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see org.polarsys.capella.common.ui.toolkit.browser.model.ISemanticBrowserModel#getExpandedState(org.polarsys.capella.common.ui.toolkit.browser.category.ICategory,
	 *      java.lang.String)
	 */
	@Override
	public boolean getExpandedState(ICategory category, String browserID) {
		return false;
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see org.polarsys.capella.common.ui.toolkit.browser.model.ISemanticBrowserModel#doesShowPatterns()
	 */
	@Override
	public boolean doesShowPatterns() {
		return false;
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see org.polarsys.capella.common.ui.toolkit.browser.model.ISemanticBrowserModel#doesShowDiagrams()
	 */
	@Override
	public boolean doesShowDiagrams() {
		return true;
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see org.polarsys.capella.common.ui.toolkit.browser.model.ISemanticBrowserModel#doesShowCategory(org.polarsys.capella.common.ui.toolkit.browser.category.ICategory)
	 */
	@Override
	public boolean doesShowCategory(ICategory category) {
		return true;
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see org.polarsys.capella.common.ui.toolkit.browser.model.ISemanticBrowserModel#doesLimitateTreeExpansion()
	 */
	@Override
	public boolean doesLimitateTreeExpansion() {
		return false;
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see org.polarsys.capella.common.ui.toolkit.browser.model.ISemanticBrowserModel#containsExpandedHistory(java.lang.String)
	 */
	@Override
	public boolean containsExpandedHistory(String browserID) {
		return false;
	}

	@Override
	public void setListeningToPageSelectionEvents(boolean value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isListeningToPageSelectionEvents() {
		// TODO Auto-generated method stub
		return false;
	}
}