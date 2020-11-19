/*******************************************************************************
 * Copyright (c) 2015, 2020 THALES GLOBAL SERVICES.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales - initial API and implementation
 ******************************************************************************/

package org.polarsys.capella.docgen.ui.actions;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.BaseSelectionListenerAction;
import org.polarsys.capella.docgen.ui.Activator;
import org.polarsys.kitalpha.doc.gen.business.core.ui.wizards.HTMLDocumentationGenerationWizard;

public class HTMLDocumentationGenerationAction extends BaseSelectionListenerAction {
	private static final URI CAPELLA_LAUNCHER_URI = URI
			.createURI("platform:/plugin/org.polarsys.capella.docgen.ui/egf/capellalauncher.fcore#_zup7kAkdEeCBJtEcjZDVOA");

	/**
	 * Constructor.
	 * 
	 * @param text_p
	 */
	public HTMLDocumentationGenerationAction() {
		super("HTML Documentation Generation");
		setImageDescriptor(Activator.getImageDescriptor(IImageKeys.IMG_DOCGEN_MODEL));
	}

	protected HTMLDocumentationGenerationAction(String text) {
		super(text);
	}

	/**
	 * @see org.eclipse.jface.action.Action#run()
	 */
	@Override
	public void run() {
		IStructuredSelection structuredSelection = this.getStructuredSelection();
		HTMLDocumentationGenerationWizard wizard = new HTMLDocumentationGenerationWizard(structuredSelection) {

			@Override
			protected Map<String, URI> getLaunchersURI() {
				Map<String, URI> map = new HashMap<String, URI>();
				map.put(HTMLDocumentationGenerationWizard.DEFAULT_LAUNCHER_LABEL, CAPELLA_LAUNCHER_URI);
				IConfigurationElement[] config = Platform.getExtensionRegistry().getConfigurationElementsFor("org.polarsys.capella.docgen.ui.launcher");
				for (IConfigurationElement configurationElement : config) {
					if (configurationElement.getName().equals("launcher")) {
						String nameString = configurationElement.getAttribute("name");
						String uriString = configurationElement.getAttribute("uri");
						map.put(nameString, URI.createURI(uriString));
					}
				}
				return map;
			}
		};

		WizardDialog dialog = new WizardDialog(PlatformUI.getWorkbench().getDisplay().getActiveShell(), wizard);
		if (dialog.open() == WizardDialog.OK) {

		}
	}

	public void updateSatus() {
		boolean enable = false;
		IStructuredSelection structuredSelection = getStructuredSelection();
		Object element = structuredSelection.getFirstElement();
		if (element instanceof IResource) {
			URI uri = URI.createPlatformResourceURI(((IResource) element).getFullPath().toString(), true);
			for (Session currentSession : SessionManager.INSTANCE.getSessions()) {
				if (currentSession.getSessionResource() != null && currentSession.getSessionResource().getURI().equals(uri)) {
					enable = true;
				}
			}
			setEnabled(enable);
		}

	}

}
