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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.sirius.diagram.AbstractDNode;
import org.eclipse.sirius.diagram.DDiagramElementContainer;
import org.eclipse.sirius.diagram.DEdge;
import org.eclipse.sirius.table.metamodel.table.DLine;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.DRepresentationElement;

/**
 * Content provider for diagram detail page.
 *
 */
public class DiagramContentProvider extends AdapterFactoryContentProvider {
	/**
	 * Constructor.
	 * 
	 * @param adapterFactory
	 *            AdapterFactory
	 */
	public DiagramContentProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider#getChildren(java.lang.Object)
	 */
	@Override
	public Object[] getChildren(Object object) {
		if (object instanceof DRepresentation) {
			return getNodes((DRepresentation) object).toArray();
		}
		if (object instanceof DDiagramElementContainer) {
			return ((DDiagramElementContainer) object).getElements().toArray();
		}
		if (object instanceof DLine) {
			return ((DLine) object).getLines().toArray();
		}
		return new Object[0];
	}

	/**
	 * @param representation
	 *            DRepresentation
	 * @return List<AbstractDNode>
	 */
	public List<DRepresentationElement> getNodes(DRepresentation representation) {
		List<DRepresentationElement> result = new ArrayList<DRepresentationElement>();
		for (DRepresentationElement dRepresentationElement : representation.getOwnedRepresentationElements()) {
			if (!(dRepresentationElement instanceof DEdge)) {
				result.add(dRepresentationElement);
			}
		}
		return result;
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider#hasChildren(java.lang.Object)
	 */
	@Override
	public boolean hasChildren(Object object) {
		return object instanceof DRepresentation || object instanceof AbstractDNode;
	}
}