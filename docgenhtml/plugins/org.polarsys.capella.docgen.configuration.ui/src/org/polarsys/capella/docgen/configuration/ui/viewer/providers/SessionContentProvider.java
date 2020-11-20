/*******************************************************************************
 * Copyright (c) 2006, 2020 THALES GLOBAL SERVICES and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *    Thales - initial API and implementation
 *    Obeo - additional customizations
 *******************************************************************************/
package org.polarsys.capella.docgen.configuration.ui.viewer.providers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.viewpoint.DRepresentationDescriptor;
import org.polarsys.capella.core.data.capellamodeller.Project;
import org.polarsys.capella.core.model.handler.command.CapellaResourceHelper;
import org.polarsys.capella.core.sirius.ui.helper.SessionHelper;

/**
 * Copy of
 * org.polarsys.capella.core.sirius.ui.wizard.RepresentationsSelectionWizardPage
 * .SessionContentProvider
 *
 */
public class SessionContentProvider implements ITreeContentProvider {

	private static final Object[] empty = new Object[0];

	/** The semantic EMF content provider. */
	private AdapterFactoryContentProvider semanticProvider;

	private Session session;

	/**
	 * Create a new <code>SemanticDViewContentProvider</code> with the specified
	 * analysis.
	 * 
	 * @param sessionToProvideFor
	 */
	public SessionContentProvider(Session sessionToProvideFor) {
		session = sessionToProvideFor;
		AdapterFactory adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		semanticProvider = new AdapterFactoryContentProvider(adapterFactory);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#getChildren(java.lang.Object)
	 */
	public Object[] getChildren(Object parentElement_p) {
		Object[] children = empty;
		if (parentElement_p instanceof Session) {
			Session session = (Session) parentElement_p;
			List<EObject> capellaElements = new ArrayList<EObject>();
			Collection<Resource> semanticResources = SessionHelper.getSemanticResources(session);
			for (Resource resource : semanticResources) {
				if (CapellaResourceHelper.isCapellaResource(resource)) {
					for (EObject root : resource.getContents()) {
						if (root instanceof Project) {
							capellaElements.addAll(((Project) root).getOwnedModelRoots());
						}

					}
				}
			}
			children = capellaElements.toArray();
		} else if (parentElement_p instanceof EObject && !(parentElement_p instanceof DRepresentationDescriptor)) {
			EObject parent = (EObject) parentElement_p;
			Collection<DRepresentationDescriptor> representations = this.findRepDescriptors(parent);
			Object[] semantic = this.semanticProvider.getChildren(parentElement_p);
			semantic = filtersSemanticFromAnotherResource(parent.eResource(), semantic);
			Object[] result = new Object[representations.size() + semantic.length];
			System.arraycopy(semantic, 0, result, 0, semantic.length);
			int i = semantic.length;
			Iterator<DRepresentationDescriptor> iterRepresentation = representations.iterator();
			while (iterRepresentation.hasNext()) {
				result[i++] = iterRepresentation.next();
			}
			children = result;
		}
		return children;
	}

	private Object[] filtersSemanticFromAnotherResource(Resource resource_p, Object[] semantic_p) {
		Collection<Object> filtered = new ArrayList<Object>();
		for (Object object : semantic_p) {
			filtered.add(object);
		}

		for (Object object : semantic_p) {
			if (object instanceof EObject && ((EObject) object).eResource() != null) {
				if (resource_p != ((EObject) object).eResource()
						&& session.getSemanticResources().contains(((EObject) object).eResource())) {
					filtered.remove(object);
				}
			}
		}

		return filtered.toArray();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#getParent(java.lang.Object)
	 */
	public Object getParent(Object element_p) {
		if (element_p instanceof EObject) {
			EObject current = (EObject) element_p;
			EObject parent = current instanceof DRepresentationDescriptor
					? ((DRepresentationDescriptor) current).getTarget() : current.eContainer();
			return parent;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#hasChildren(java.lang.Object)
	 */
	public boolean hasChildren(Object element_p) {
		return getChildren(element_p).length > 0;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.viewers.IStructuredContentProvider#getElements(java.lang.Object)
	 */
	public Object[] getElements(Object inputElement_p) {
		return getChildren(inputElement_p);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.viewers.IContentProvider#dispose()
	 */
	public void dispose() {
		semanticProvider.dispose();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.viewers.IContentProvider#inputChanged(org.eclipse.jface.viewers.Viewer,
	 *      java.lang.Object, java.lang.Object)
	 */
	public void inputChanged(Viewer viewer_p, Object oldInput_p, Object newInput_p) {
		// empty
	}

	/**
	 * Return all the DRepresentationDescriptor for the specified viewpoint.
	 *
	 * @param semanticElement
	 *            the parent semantic element.
	 * @return all the diagrams for the specified viewpoint.
	 */
	private Collection<DRepresentationDescriptor> findRepDescriptors(final EObject semanticElement_p) {
		if (semanticElement_p == null) {
			return Collections.emptySet();
		}
		return DialectManager.INSTANCE.getRepresentationDescriptors(semanticElement_p, session);
	}
}