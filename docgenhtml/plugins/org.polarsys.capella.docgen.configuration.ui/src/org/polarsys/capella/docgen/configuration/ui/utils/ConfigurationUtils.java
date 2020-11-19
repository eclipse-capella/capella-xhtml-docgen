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
package org.polarsys.capella.docgen.configuration.ui.utils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.tools.api.command.semantic.AddSemanticResourceCommand;
import org.eclipse.sirius.tools.api.command.semantic.RemoveSemanticResourceCommand;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.DRepresentationDescriptor;
import org.eclipse.sirius.viewpoint.DRepresentationElement;
import org.eclipse.sirius.viewpoint.description.DModelElement;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;
import org.polarsys.capella.common.ui.toolkit.browser.content.provider.wrapper.EObjectWrapper;
import org.polarsys.capella.configuration.Configuration;
import org.polarsys.capella.configuration.ConfigurationElement;
import org.polarsys.capella.configuration.ConfigurationFactory;
import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.docgen.configuration.ui.Activator;
import org.polarsys.capella.docgen.configuration.ui.Messages;
import org.polarsys.capella.docgen.util.DocGenHtmlCapellaControl;

/**
 * Utils for configuration.
 *
 */
public class ConfigurationUtils {

	/**
	 * The color for elements for which no HTML documentation can be generated.
	 */
	public static final Color COLOR_ELEMENT_WITH_NO_HTML_DOCUMENTATION = new Color(Display.getCurrent(), 180, 180, 180);

	private String message = "";

	private ConfigurationUtils() {
	}

	/**
	 * Instance.
	 */
	private static ConfigurationUtils INSTANCE = new ConfigurationUtils();

	/**
	 * @return ConfigurationUtils instance
	 */
	public static ConfigurationUtils getInstance() {
		return INSTANCE;
	}

	/**
	 * @param fileName
	 *            Configuration file name
	 * @param session
	 *            Session
	 * @param monitor
	 *            IProgressMonitor
	 * @return all referenced EObject from configuration file.
	 */
	public List<EObject> getElementsFromConfigurationFile(final String fileName, final Session session,
			final IProgressMonitor monitor) {
		setMessage(""); //$NON-NLS-1$
		// check if configuration file refers session_p resources
		int nbResources = session.getSemanticResources().size();

		// add configuration resource to session
		try {
			AddSemanticResourceCommand addSemanticResourceCommand = new AddSemanticResourceCommand(session,
					URI.createFileURI(fileName), new SubProgressMonitor(monitor, 1));
			session.getTransactionalEditingDomain().getCommandStack().execute(addSemanticResourceCommand);
		} catch (Exception e) {
			setMessage(Messages.ConfigurationUtils_1);
			return new ArrayList<EObject>();
		}

		// check if configuration file refers session_p resources
		if (session.getSemanticResources().size() > nbResources + 1) {
			session.getTransactionalEditingDomain().getCommandStack().undo();
			setMessage(Messages.ConfigurationUtils_2);
			return new ArrayList<EObject>();
		}
		if (session.getSemanticResources().size() == nbResources) {
			setMessage(Messages.ConfigurationUtils_3);
			return new ArrayList<EObject>();
		}

		final Resource configurationResource = session.getTransactionalEditingDomain().getResourceSet()
				.getResource(URI.createFileURI(fileName), true);

		// get all configuration elements
		List<EObject> configurationElements = new ArrayList<EObject>();
		if (!configurationResource.getContents().isEmpty()
				&& configurationResource.getContents().get(0) instanceof Configuration) {
			Configuration configuration = (Configuration) configurationResource.getContents().get(0);
			for (ConfigurationElement element : configuration.getConfigurationElements()) {
				if (!element.getReference().eIsProxy()) {
					configurationElements.add(element.getReference());
				}
			}
		}

		// remove configuration resource from session and clean command stack
		RemoveSemanticResourceCommand removeSemanticResourceCommand = new RemoveSemanticResourceCommand(session,
				configurationResource, new SubProgressMonitor(monitor, 1), false);
		session.getTransactionalEditingDomain().getCommandStack().execute(removeSemanticResourceCommand);
		return configurationElements;
	}

	/**
	 * @param fileName
	 *            Configuration file name
	 * @param selectedElements
	 *            EObject list to reference in configuration file.
	 */
	public void createConfigurationResource(final String fileName, Collection<EObject> selectedElements) {
		setMessage(""); //$NON-NLS-1$
		// create configuration resource
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource configurationResource = resourceSet.createResource(URI.createFileURI(fileName));

		// create configuration elements
		Configuration configuration = ConfigurationFactory.eINSTANCE.createConfiguration();
		for (EObject selectedElement : selectedElements) {
			ConfigurationElement configurationElement = ConfigurationFactory.eINSTANCE.createConfigurationElement();
			configurationElement.setReference(selectedElement);
			configuration.getConfigurationElements().add(configurationElement);
		}
		configurationResource.getContents().add(configuration);

		// save resource
		try {
			configurationResource.save(Collections.EMPTY_MAP);
		} catch (IOException e1) {
			setMessage(Messages.ConfigurationUtils_5);
			Activator.getDefault().getLog().log(new Status(Status.ERROR, Activator.PLUGIN_ID, e1.getMessage()));
		}
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * Provides whether the HTML documentation generation can be applied to the
	 * given {@link Object}.
	 * 
	 * @param object
	 *            a (maybe-{@code null}) {@link Object}.
	 * @return {@code true} if the HTML documentation generation can be applied
	 *         to {@code object}, {@code false} otherwise.
	 */
	public boolean canGenerateHtmlDocumentationFor(Object object) {
		Object candidate = object;
		if (candidate instanceof EObjectWrapper) {
			candidate = ((EObjectWrapper) object).getElement();
		}
		if (candidate instanceof EObject) {
			EObject eObject = (EObject) candidate;
			return canGenerateHtmlDocumentationFor(eObject);
		} else {
			return false;
		}
	}

	/**
	 * Provides whether the HTML documentation generation can be applied to the
	 * given {@link EObject}.
	 * 
	 * @param eObject
	 *            a (maybe-{@code null}) {@link EObject}.
	 * @return {@code true} if the HTML documentation generation can be applied
	 *         to {@code eObject}, {@code false} otherwise.
	 */
	public boolean canGenerateHtmlDocumentationFor(EObject eObject) {
		if (eObject instanceof CapellaElement) {
			return canGenerateHtmlDocumentationFor((CapellaElement) eObject);
		} else {
			return eObject instanceof DModelElement || eObject instanceof DRepresentationElement;
		}
	}

	/**
	 * Provides whether the HTML documentation generation can be applied to the
	 * given {@link CapellaElement}.
	 * 
	 * @param capellaElement
	 *            a (maybe-{@code null}) {@link CapellaElement}.
	 * @return {@code true} if the HTML documentation generation can be applied
	 *         to {@code capellaElement}, {@code false} otherwise.
	 */
	public boolean canGenerateHtmlDocumentationFor(CapellaElement capellaElement) {
		return DocGenHtmlCapellaControl.isPageCandidate(capellaElement);
	}

	/**
	 * Provides whether the HTML documentation generation generates the
	 * documentation of an {@link EObject} on the HTML documentation page of its
	 * parent element.
	 * 
	 * @param eObject
	 *            a (maybe-{@code null}) {@link EObject}.
	 * @return {@code true} if the HTML documentation generation generates the
	 *         documentation for {@code eObject} in the page of its parent
	 *         element, {@code false} otherwise.
	 */
	public boolean htmlDocumentationGenerationGeneratesIntoParentPage(EObject eObject) {
		if (eObject instanceof CapellaElement) {
			return htmlDocumentationGenerationGeneratesIntoParentPage((CapellaElement) eObject);
		} else {
			return eObject instanceof DRepresentationDescriptor || eObject instanceof DRepresentation;
		}
	}

	/**
	 * Provides whether the HTML documentation generation generates the
	 * documentation of an {@link CapellaElement} on the HTML documentation page
	 * of its parent element.
	 * 
	 * @param capellaElement
	 *            a (maybe-{@code null}) {@link CapellaElement}.
	 * @return {@code true} if the HTML documentation generation generates the
	 *         documentation for {@code capellaElement} in the page of its
	 *         parent element, {@code false} otherwise.
	 */
	public boolean htmlDocumentationGenerationGeneratesIntoParentPage(CapellaElement capellaElement) {
		return DocGenHtmlCapellaControl.isPageCandidateForAnyElement(capellaElement);
	}
}
