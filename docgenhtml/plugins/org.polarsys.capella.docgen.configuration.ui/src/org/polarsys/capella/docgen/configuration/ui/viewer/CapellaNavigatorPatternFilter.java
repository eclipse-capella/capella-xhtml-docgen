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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.polarsys.capella.common.mdsofa.common.constant.ICommonConstants;
import org.polarsys.capella.common.ui.toolkit.widgets.filter.TreePatternFilter;
import org.polarsys.capella.core.data.capellacore.CapellaElement;

/**
 * Copy of org.polarsys.capella.core.platform.sirius.ui.navigator.view.
 * CapellaCommonNavigator.CapellaNavigatorPatternFilter. Specific pattern filter
 * for the Capella Navigator to be able to search base on {@link LabelProvider}
 * or on Description model element attribute.
 */
public class CapellaNavigatorPatternFilter extends TreePatternFilter {
	/**
	 * Flag to tell if we are searching in description
	 * {@link CapellaElement#getDescription()} rather than label provider.
	 */
	private boolean searchInDescription;

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected String getTextFromModelElement(EObject element) {
		String result = null;
		if (searchInDescription) {
			// Search on description attribute.
			if (element instanceof CapellaElement) {
				result = ((CapellaElement) element).getDescription();
			} else if (element instanceof DSemanticDiagram) {
				result = ((DSemanticDiagram) element).getDocumentation();
			}
		} else {
			result = super.getTextFromModelElement(element);
		}
		return (null == result) ? ICommonConstants.EMPTY_STRING : result;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean isElementVisible(Viewer viewer, Object parentElement, Object element) {
		if (searchInDescription) {
			// Apply strict match algorithm.
			return isLeafMatch(viewer, parentElement, element) || isParentMatch(viewer, parentElement, element);
		}
		boolean visible = super.isElementVisible(viewer, parentElement, element);
		return visible;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected boolean isLeafMatch(Viewer viewer, Object parentElement, Object element) {
		if (searchInDescription) {
			// Apply strict match algorithm.
			return doIsLeafMatch(viewer, parentElement, element);
		}
		return super.isLeafMatch(viewer, parentElement, element);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected boolean isParentMatch(Viewer viewer, Object parentElement, Object element) {
		// we provide our own content provider instead of getting it from
		// the viewer
		ITreeContentProvider iTreeContentProvider = (ITreeContentProvider) ((StructuredViewer) viewer)
				.getContentProvider();
		Object[] children = iTreeContentProvider.getChildren(element);
		if ((children != null) && (children.length > 0)) {
			return isAnyVisible(viewer, element, children);
		}
		return false;
	}

	/**
	 * Is searching is description.
	 * 
	 * @return the searchInDescription
	 */
	protected boolean isSearchingInDescription() {
		return searchInDescription;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean select(Viewer viewer, Object parentElement, Object element) {
		if (searchInDescription) {
			// Apply strict match algorithm.
			return isElementVisible(viewer, parentElement, element);
		}
		return super.select(viewer, parentElement, element);
	}

	/**
	 * Set Search in description flag.
	 * 
	 * @param newSearchInDescription
	 *            the searchInDescription to set
	 */
	protected void setSearchInDescription(boolean newSearchInDescription) {
		searchInDescription = newSearchInDescription;
	}
}