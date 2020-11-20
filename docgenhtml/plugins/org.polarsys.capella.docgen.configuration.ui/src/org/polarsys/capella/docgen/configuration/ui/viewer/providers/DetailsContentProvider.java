/*******************************************************************************
 * Copyright (c) 2017, 2020 Obeo.
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

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.viewpoint.DRefreshable;
import org.eclipse.sirius.viewpoint.DRepresentationDescriptor;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;
import org.polarsys.capella.common.ui.toolkit.browser.category.CategoryRegistry;
import org.polarsys.capella.common.ui.toolkit.browser.category.ICategory;
import org.polarsys.capella.common.ui.toolkit.browser.content.provider.wrapper.BrowserElementWrapper;
import org.polarsys.capella.common.ui.toolkit.browser.content.provider.wrapper.CategoryWrapper;
import org.polarsys.capella.common.ui.toolkit.browser.content.provider.wrapper.EObjectWrapper;

/**
 * Content Provider for details page.
 *
 */
public class DetailsContentProvider implements ITreeContentProvider {

	/**
	 * Category name displayed in Current Viewer.<br>
	 * See definition in org.polarsys.capella.core.semantic.queries.sirius
	 * plugin.xml file in appropriate extension.
	 */
	public static final String ALL_RELATED_DIAGRAMS = "All Related Diagrams"; //$NON-NLS-1$
	public static final String ALL_RELATED_TABLES = "All Related Tables"; //$NON-NLS-1$
	private static final String DIAGRAM_CATEGOTY_ID = "org.polarsys.capella.core.semantic.queries.sirius.diagram.getall"; // $NON-NLS-1$
	private static final String TABLE_CATEGOTY_ID = "org.polarsys.capella.core.semantic.queries.sirius.category1"; //$NON-NLS-1$

	/** The content provider for referenced element. */
	private ITreeContentProvider referencedcontentProvider;

	/** The content provider for referencing element. */
	private ITreeContentProvider referencingcontentProvider;

	/** The content provider for representation element. */
	private ITreeContentProvider representationContentProvider;

	/** The content provider for diagram content element. */
	private DiagramContentProvider diagramContentContentProvider;

	/**
	 * Initialize content providers.
	 * 
	 * @param session
	 *            Session
	 */
	public DetailsContentProvider(Session session) {
		AdapterFactory adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		GenerationWizardContentProviderFactory semanticBrowserContentProviderFactory = new GenerationWizardContentProviderFactory();
		semanticBrowserContentProviderFactory.setModel(new GenerationSemanticBrowserModel());
		referencedcontentProvider = semanticBrowserContentProviderFactory.getReferencedContentProvider();
		referencingcontentProvider = semanticBrowserContentProviderFactory.getReferencingContentProvider();
		representationContentProvider = semanticBrowserContentProviderFactory.getCurrentContentProvider();
		diagramContentContentProvider = new DiagramContentProvider(adapterFactory);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#getChildren(java.lang.Object)
	 */
	public Object[] getChildren(Object parentElement) {
		// sirius content
		if (isSiriusElement(parentElement)) {
			if (parentElement instanceof DSemanticDecorator) {
				return diagramContentContentProvider.getChildren(parentElement);
			}
			if (parentElement instanceof DRepresentationDescriptor) {
				return diagramContentContentProvider
						.getChildren(((DRepresentationDescriptor) parentElement).getRepresentation());
			}

		} else {
			// Capella content
			Set<Object> result = new LinkedHashSet<Object>();
			result.addAll(filterResult(parentElement, referencedcontentProvider.getChildren(parentElement)));
			result.addAll(filterResult(parentElement, referencingcontentProvider.getChildren(parentElement)));
			result.addAll(
					filterDiagramResult(parentElement, representationContentProvider.getChildren(parentElement)));
			return result.toArray();

		}

		return new Object[0];
	}

	/**
	 * Filter referenced and referencing children.
	 * 
	 * @param parentElement
	 *            Object
	 * @param referencedChildren
	 *            Object[]
	 * @return filtered children
	 */
	private Set<Object> filterResult(Object parentElement, Object[] referencedChildren) {
		Set<Object> result = new LinkedHashSet<Object>();
		if (parentElement instanceof EObjectWrapper) {
			for (Object object : referencedChildren) {
				if (!(object instanceof CategoryWrapper)) {
					result.add(object);
				}
			}
		} else {
			Collections.addAll(result, referencedChildren);
		}
		return result;
	}

	/**
	 * Filter representation children. Just ALL_RELATED_DIAGRAMS category and
	 * EObjectWrapper
	 * 
	 * @param parentElement
	 *            Object
	 * @param referencedChildren
	 *            Object[]
	 * @return filtered children
	 */
	private Set<Object> filterDiagramResult(Object parentElement, Object[] referencedChildren) {
		Set<Object> result = new LinkedHashSet<Object>();
		for (Object object : referencedChildren) {
			if (object instanceof EObjectWrapper || (object instanceof CategoryWrapper
					&& ((CategoryWrapper) object).getElement() instanceof ICategory
					&& (ALL_RELATED_DIAGRAMS.equals(((ICategory) ((CategoryWrapper) object).getElement()).getName())
							|| ALL_RELATED_TABLES
									.equals(((ICategory) ((CategoryWrapper) object).getElement()).getName())))) {
				result.add(object);
			}
		}

		// if no category, add diagram one.
		if (result.isEmpty() && !(parentElement instanceof BrowserElementWrapper)) {
			result.add(new CategoryWrapper(CategoryRegistry.getInstance().getCategory(DIAGRAM_CATEGOTY_ID)));
			result.add(new CategoryWrapper(CategoryRegistry.getInstance().getCategory(TABLE_CATEGOTY_ID)));
		}
		return result;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#getParent(java.lang.Object)
	 */
	public Object getParent(Object element) {
		Object parent = referencedcontentProvider.getParent(element);
		if (parent != null) {
			return parent;
		}
		return referencingcontentProvider.getParent(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#hasChildren(java.lang.Object)
	 */
	public boolean hasChildren(Object element) {
		return getChildren(element).length > 0;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.viewers.IStructuredContentProvider#getElements(java.lang.Object)
	 */
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.viewers.IContentProvider#dispose()
	 */
	public void dispose() {
		referencedcontentProvider.dispose();
		referencingcontentProvider.dispose();
		representationContentProvider.dispose();
		diagramContentContentProvider.dispose();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.viewers.IContentProvider#inputChanged(org.eclipse.jface.viewers.Viewer,
	 *      java.lang.Object, java.lang.Object)
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		referencedcontentProvider.inputChanged(viewer, oldInput, newInput);
		referencingcontentProvider.inputChanged(viewer, oldInput, newInput);
		representationContentProvider.inputChanged(viewer, oldInput, newInput);
	}

	/**
	 * Returns whether an object is a Sirius element.
	 */
	private static boolean isSiriusElement(Object object) {
		return (object instanceof DRefreshable) || (object instanceof DRepresentationDescriptor);
	}

}