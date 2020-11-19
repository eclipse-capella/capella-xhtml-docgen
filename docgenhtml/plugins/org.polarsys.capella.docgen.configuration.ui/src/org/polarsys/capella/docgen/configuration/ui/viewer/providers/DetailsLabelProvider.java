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
 *    Thales - additional customizations
 *******************************************************************************/
package org.polarsys.capella.docgen.configuration.ui.viewer.providers;

import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.sirius.viewpoint.DRepresentationElement;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.polarsys.capella.common.ui.toolkit.browser.label.provider.factory.AbstractLabelProviderFactory;
import org.polarsys.capella.core.platform.sirius.ui.navigator.viewer.CapellaNavigatorLabelProvider;
import org.polarsys.capella.docgen.configuration.ui.utils.ConfigurationUtils;

/**
 * {@link CapellaNavigatorLabelProvider} extension to provide the labels for the
 * 'details' part of the selection dialog. Implements {@link IColorProvider} in
 * order to color in grey the label of elements for which no HTML documentation
 * is generated.
 */
public class DetailsLabelProvider extends CapellaNavigatorLabelProvider implements IColorProvider {

	private ILabelProvider referencedCapellaNavigatorLabelProvider;

	/**
	 * Constructor
	 */
	public DetailsLabelProvider() {
		super();
		referencedCapellaNavigatorLabelProvider = AbstractLabelProviderFactory.getInstance()
				.getReferencedLabelProvider();
		if (referencedCapellaNavigatorLabelProvider == null) {
			referencedCapellaNavigatorLabelProvider = new CapellaNavigatorLabelProvider();
		}
	}

	@Override
	public Color getBackground(Object object) {
		return super.getBackground(object);
	}

	@Override
	public Color getForeground(Object object) {
		if (!ConfigurationUtils.getInstance().canGenerateHtmlDocumentationFor(object)) {
			// Since no HTML documentation can be generated for this
			// element, its label is greyed out.
			return ConfigurationUtils.COLOR_ELEMENT_WITH_NO_HTML_DOCUMENTATION;
		}

		return super.getForeground(object);
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see org.polarsys.capella.common.ui.providers.CapellaTransactionalAdapterFactoryLabelProvider#isLabelProperty(java.lang.Object,
	 *      java.lang.String)
	 */
	@Override
	public boolean isLabelProperty(Object object, String id) {
		return super.isLabelProperty(object, id) && referencedCapellaNavigatorLabelProvider.isLabelProperty(object, id);
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see org.polarsys.capella.core.platform.sirius.ui.navigator.viewer.CapellaNavigatorLabelProvider#dispose()
	 */
	@Override
	public void dispose() {
		super.dispose();
		referencedCapellaNavigatorLabelProvider.dispose();
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see org.polarsys.capella.core.platform.sirius.ui.navigator.viewer.CapellaNavigatorLabelProvider#getImage(java.lang.Object)
	 */
	@Override
	public Image getImage(Object object) {
		if (object instanceof DRepresentationElement) {
			return referencedCapellaNavigatorLabelProvider.getImage(((DRepresentationElement) object).getTarget());
		}
		return referencedCapellaNavigatorLabelProvider.getImage(object);
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see org.polarsys.capella.core.platform.sirius.ui.navigator.viewer.CapellaNavigatorLabelProvider#getText(java.lang.Object)
	 */
	@Override
	public String getText(Object object) {
		if (object instanceof DRepresentationElement) {
			return referencedCapellaNavigatorLabelProvider.getText(((DRepresentationElement) object).getTarget());
		}
		return referencedCapellaNavigatorLabelProvider.getText(object);
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider#addListener(org.eclipse.jface.viewers.ILabelProviderListener)
	 */
	@Override
	public void addListener(ILabelProviderListener listener) {
		referencedCapellaNavigatorLabelProvider.addListener(listener);
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider#removeListener(org.eclipse.jface.viewers.ILabelProviderListener)
	 */
	@Override
	public void removeListener(ILabelProviderListener listener) {
		referencedCapellaNavigatorLabelProvider.removeListener(listener);
	}

}
