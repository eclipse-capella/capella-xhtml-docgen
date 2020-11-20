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

package org.polarsys.capella.docgen.configuration.ui.actions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.egf.model.domain.Domain;
import org.eclipse.egf.model.domain.DomainViewpoint;
import org.eclipse.egf.model.domain.EMFDomain;
import org.eclipse.egf.model.fcore.Activity;
import org.eclipse.egf.model.fcore.Contract;
import org.eclipse.egf.model.fcore.FactoryComponent;
import org.eclipse.egf.model.fcore.Viewpoint;
import org.eclipse.egf.model.types.Type;
import org.eclipse.egf.model.types.TypeString;
import org.eclipse.egf.pattern.EGFPatternPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.common.tools.api.util.ReflectionHelper;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.BaseSelectionListenerAction;
import org.polarsys.capella.docgen.configuration.ui.Activator;
import org.polarsys.capella.docgen.configuration.ui.Messages;
import org.polarsys.capella.docgen.configuration.ui.wizard.SelectElementsWizardPage;
import org.polarsys.capella.docgen.util.CapellaLabelProviderHelper;
import org.polarsys.kitalpha.doc.gen.business.core.scope.GenerationGlobalScope;
import org.polarsys.kitalpha.doc.gen.business.core.scope.ScopeElementStrategy;
import org.polarsys.kitalpha.doc.gen.business.core.scope.ScopeException;
import org.polarsys.kitalpha.doc.gen.business.core.scope.ScopeReferencesStrategy;
import org.polarsys.kitalpha.doc.gen.business.core.sirius.util.session.DiagramSessionHelper;
import org.polarsys.kitalpha.doc.gen.business.core.ui.helper.InvokeActivityHelper;
import org.polarsys.kitalpha.doc.gen.business.core.ui.wizards.HTMLDocumentationBrandingWizardPage;
import org.polarsys.kitalpha.doc.gen.business.core.ui.wizards.HTMLDocumentationGenerationWizard;
import org.polarsys.kitalpha.doc.gen.business.core.ui.wizards.HTMLDocumentationGenerationWizardPage;

/**
 * Generate XHTML action.
 *
 */
public class HTMLDocumentationConfigurationGenerationAction extends BaseSelectionListenerAction {
	private static final URI CAPELLA_LAUNCHER_URI = URI.createURI(
			"platform:/plugin/org.polarsys.capella.docgen.ui/egf/capellalauncher.fcore#_zup7kAkdEeCBJtEcjZDVOA"); //$NON-NLS-1$

	private SelectElementsWizardPage selectElementsPage;
	private HTMLDocumentationGenerationWizardPage page;
	private HTMLDocumentationBrandingWizardPage brandingPage;

	/**
	 * Constructor.
	 * 
	 */
	public HTMLDocumentationConfigurationGenerationAction() {
		super(Messages.HTMLDocumentationConfigurationGenerationAction_1);
		setImageDescriptor(Activator.getImageDescriptor(IImageKeys.IMG_DOCGEN_MODEL));
	}

	/**
	 * Constructor.
	 * 
	 */
	protected HTMLDocumentationConfigurationGenerationAction(String text_p) {
		super(text_p);
		setImageDescriptor(Activator.getImageDescriptor(IImageKeys.IMG_DOCGEN_MODEL));
	}

	/**
	 * @see org.eclipse.jface.action.Action#run()
	 */
	@Override
	public void run() {
		final IStructuredSelection structuredSelection = this.getStructuredSelection();

		HTMLDocumentationGenerationWizard wizard = new HTMLDocumentationGenerationWizard(structuredSelection) {

			/**
			 * (non-Javadoc)
			 * 
			 * @see org.polarsys.kitalpha.doc.gen.business.core.ui.wizards.HTMLDocumentationGenerationWizard#getLaunchersURI()
			 */
			@Override
			protected Map<String, URI> getLaunchersURI() {
				Map<String, URI> map = new HashMap<String, URI>();
				map.put(HTMLDocumentationGenerationWizard.DEFAULT_LAUNCHER_LABEL, CAPELLA_LAUNCHER_URI);
				IConfigurationElement[] config = Platform.getExtensionRegistry()
						.getConfigurationElementsFor("org.polarsys.capella.docgen.ui.launcher"); //$NON-NLS-1$
				for (IConfigurationElement configurationElement : config) {
					if (configurationElement.getName().equals("launcher")) { //$NON-NLS-1$
						String nameString = configurationElement.getAttribute("name"); //$NON-NLS-1$
						String uriString = configurationElement.getAttribute("uri"); //$NON-NLS-1$
						map.put(nameString, URI.createURI(uriString));
					}
				}
				return map;
			}

			/**
			 * (non-Javadoc)
			 * 
			 * @see org.polarsys.kitalpha.doc.gen.business.core.ui.wizards.HTMLDocumentationGenerationWizard#addPages()
			 */
			@Override
			public void addPages() {
				selectElementsPage = new SelectElementsWizardPage(structuredSelection);
				addPage(selectElementsPage);
				super.addPages();
				page = (HTMLDocumentationGenerationWizardPage) getPages()[1];
				page.setScopedGeneration(true);
				brandingPage = (HTMLDocumentationBrandingWizardPage) getPages()[2];
			}

			/**
			 * (non-Javadoc)
			 * 
			 * @see org.polarsys.kitalpha.doc.gen.business.core.ui.wizards.HTMLDocumentationGenerationWizard#performFinish()
			 */
			@Override
			public boolean performFinish() {
				selectedModelElements.addAll(selectElementsPage.getSelectedElements());
				// boolean performFinish = super.performFinish();
				// return performFinish;

				// can not ask directly super.performFinish(), have to change
				// ScopeElementStrategy and ScopeReferencesStrategy, values set
				// in
				// initialiseScope method
				brandingPage.askUserForUpdatingBrandingDataPreferences();

				/** Collect data from wizard pages **/
				final String modelURI = page.getModelURI();
				final String containerName = page.getContainerName();
				final String selectedLauncher = page.getSelectedLauncher();
				// final ScopeReferencesStrategy referencesStrategy =
				// page.getReferencesStrategy();

				final String copyright = brandingPage.getCopyright();
				final String logoAlt = brandingPage.getLogoAlt();
				final String logoPath = brandingPage.getLogoPath();

				initializeScope();

				CapellaLabelProviderHelper.initImageRegistry();

				List<URI> modelURIList = getURIList(modelURI);
				final String projectName = getProjectName(containerName);
				final String outputFolder = getOutputFolder(containerName);
				Activity melodyLauncher = InvokeActivityHelper.getActivity(getLaunchersURI().get(selectedLauncher));
				for (URI uri : modelURIList) {
					URI semanticResourceURI = uri;
					if (uri.lastSegment().endsWith(".aird")) //$NON-NLS-1$
					{
						DiagramSessionHelper.setAirdUri(uri);
						Session session = DiagramSessionHelper.initSession();
						Collection<Resource> resources = session.getSemanticResources();

						if (!resources.isEmpty()) {
							/*
							 * FIXME a workaround to skip launching the HTML
							 * GenDoc on the AFM models AFM models are used by
							 * Kitalpha Viewpoint Framework and are the first
							 * resource in session semantic resource list.
							 * 
							 * This solution must be replaced by a more generic
							 * mechanism for launching the generation on models.
							 * 
							 * Bug:
							 * https://bugs.polarsys.org/show_bug.cgi?id=1338
							 */

							Iterator<Resource> iterator = resources.iterator();
							while (iterator.hasNext()) {
								Resource next = iterator.next();
								URI uri2 = next.getURI();
								if (uri2.lastSegment().endsWith(".afm")) { //$NON-NLS-1$
									continue;
								}
								// Keeping the aird URI if the semantic resource
								// uri is
								// null (i.e., the semantic
								// model doesn't exist)
								semanticResourceURI = uri2 == null ? semanticResourceURI : uri2;
								break;
							}

						}
					}
					execute(melodyLauncher, projectName, outputFolder, semanticResourceURI, copyright, logoAlt,
							logoPath);
				}

				return true;
			}

			private void initializeScope() {
				// Clean old scope data.
				GenerationGlobalScope.getInstance().cleanScope();

				// Initialize scope strategies
				GenerationGlobalScope.getInstance().setReferencesStrategy(page.getReferencesStrategy());
				ReflectionHelper.setFieldValueWithoutException(GenerationGlobalScope.getInstance(), "elementStrategy",
						ScopeElementStrategy.ELEMENT);

				// Initialize scope.
				if (selectedModelElements != null && false == selectedModelElements.isEmpty()) {
					for (EObject eObject : selectedModelElements) {
						try {
							GenerationGlobalScope.getInstance().addToScope(eObject);
						} catch (ScopeException e) {
							e.printStackTrace();
						}
					}
				}
			}

			/**
			 * Copied method from
			 * org.polarsys.kitalpha.doc.gen.business.core.ui.wizards.
			 * HTMLDocumentationGenerationWizard
			 * 
			 */
			private List<URI> getURIList(String modelURI) {
				Set<URI> uriSet = new HashSet<URI>();
				StringTokenizer tokenizer = new StringTokenizer(modelURI);
				while (tokenizer.hasMoreElements()) {
					String nextURI = tokenizer.nextElement().toString();
					uriSet.add(URI.createURI(nextURI));
				}
				return new ArrayList<URI>(uriSet);
			}

			/**
			 * Copied method from
			 * org.polarsys.kitalpha.doc.gen.business.core.ui.wizards.
			 * HTMLDocumentationGenerationWizard
			 * 
			 */
			private String getOutputFolder(String containerName) {
				String projectName = getProjectName(containerName);
				IPath outputFolderPath = new Path(containerName);
				outputFolderPath = outputFolderPath.makeRelativeTo(new Path(projectName));
				return outputFolderPath.toString();
			}

			/**
			 * Copied method from
			 * org.polarsys.kitalpha.doc.gen.business.core.ui.wizards.
			 * HTMLDocumentationGenerationWizard
			 * 
			 */
			private String getProjectName(String containerName) {
				IContainer container = ResourcesPlugin.getWorkspace().getRoot().getFolder(new Path(containerName));
				return container.getProject().getName();
			}

			/**
			 * Copied method from
			 * org.polarsys.kitalpha.doc.gen.business.core.ui.wizards.
			 * HTMLDocumentationGenerationWizard
			 * 
			 */
			private void execute(Activity melodyLauncher, final String projectName, final String outputFolder,
					final URI uri, final String copyright, final String logoAlt, final String logoPath) {
				IPath path = new Path(projectName + "/" + outputFolder);
				path = path.append("output");
				IFolder folder = ResourcesPlugin.getWorkspace().getRoot().getFolder(path);
				if (!folder.exists()) {
					try {
						folder.create(true, true, null);
					} catch (CoreException e) {
						EGFPatternPlugin.getDefault().logError(e);
					}
				}

				if (melodyLauncher instanceof FactoryComponent) {
					final FactoryComponent factoryComponent = (FactoryComponent) melodyLauncher;

					/** Setting the values of the mandatory contracts **/
					setContract(factoryComponent, "projectName", projectName, true);
					setContract(factoryComponent, "outputFolder", outputFolder + "/output", true);
					setDomain(factoryComponent, uri);

					/** Setting the values of the optional contracts **/
					setContract(factoryComponent, "copyright", copyright, false);
					setContract(factoryComponent, "logo.alt", logoAlt, false);
					setContract(factoryComponent, "logo.path", logoPath, false);

					try {
						InvokeActivityHelper.invoke(factoryComponent);
					} catch (Exception e) {
						EGFPatternPlugin.getDefault().logError(e);
					}
				}

			}

			/**
			 * Copied method from
			 * org.polarsys.kitalpha.doc.gen.business.core.ui.wizards.
			 * HTMLDocumentationGenerationWizard
			 * 
			 */
			private void setContract(FactoryComponent factoryComponent, String contractName, String value,
					boolean mandatory) {
				Contract invokedContract = factoryComponent.getContract(contractName);
				if (invokedContract != null) {
					Type type = invokedContract.getType();
					if (type instanceof TypeString) {
						TypeString typeString = (TypeString) type;
						typeString.setValue(value);
					}
				} else {
					if (mandatory) {
						throw new IllegalArgumentException("Can't find the mandatory contract " + contractName
								+ " in the factory component " + factoryComponent.getName());
					}
				}
			}

			/**
			 * Copied method from
			 * org.polarsys.kitalpha.doc.gen.business.core.ui.wizards.
			 * HTMLDocumentationGenerationWizard
			 * 
			 */
			private void setDomain(FactoryComponent factoryComponent, URI uri) {
				Viewpoint viewpoint = factoryComponent.getViewpointContainer().getViewpoint(DomainViewpoint.class);
				if (viewpoint instanceof DomainViewpoint) {
					DomainViewpoint domainViewpoint = (DomainViewpoint) viewpoint;
					Domain domain = domainViewpoint.getDomains().get(0);
					if (domain instanceof EMFDomain) {
						EMFDomain domainURI = (EMFDomain) domain;
						domainURI.setUri(uri);
					}
				}
			}

		};
		wizard.setNeedsProgressMonitor(true);
		WizardDialog dialog = new WizardDialog(PlatformUI.getWorkbench().getDisplay().getActiveShell(), wizard) {

			/**
			 * (non-Javadoc)
			 * 
			 * @see org.eclipse.jface.wizard.WizardDialog#configureShell(org.eclipse.swt.widgets.Shell)
			 */
			@Override
			protected void configureShell(Shell newShell) {
				super.configureShell(newShell);
				newShell.setSize(800, 600);
			}

			@Override
			protected Control createContents(Composite parent) {
				Control createContents = super.createContents(parent);
				// set option Export references to element out of scope to false
				// by default
				Control control = HTMLDocumentationConfigurationGenerationAction.this.page.getControl();
				if (control instanceof Composite && ((Composite) control).getChildren().length == 7
						&& ((Composite) control).getChildren()[6] instanceof Group) {
					Group group = (Group) ((Composite) control).getChildren()[6];
					if (group.getChildren().length == 1 && group.getChildren()[0] instanceof Button) {
						Button button = (Button) group.getChildren()[0];
						button.setSelection(false);
						ReflectionHelper.setFieldValueWithoutException(
								HTMLDocumentationConfigurationGenerationAction.this.page, "referencesStrategy",
								ScopeReferencesStrategy.DONT_EXPORT);
					}
				}
				return createContents;
			}
			
			@Override
			protected Button createButton(Composite parent, int id, String label, boolean defaultButton) {
				return super.createButton(parent, id, label, false);
			}
			
			@Override
			public void updateButtons() {
				super.updateButtons();
				// reset default button in order to avoid flip to next page.
				// do not remove the second instruction.
				getShell().setDefaultButton(null);
				// DO NOT REMOVE!
				getShell().setDefaultButton(null);
			}

		};
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
				if (currentSession.getSessionResource() != null
						&& currentSession.getSessionResource().getURI().equals(uri)) {
					enable = true;
				}
			}
			setEnabled(enable);
		}

	}

}
