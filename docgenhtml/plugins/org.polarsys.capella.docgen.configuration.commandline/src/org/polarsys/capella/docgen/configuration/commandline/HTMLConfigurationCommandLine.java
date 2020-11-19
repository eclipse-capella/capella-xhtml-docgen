/*******************************************************************************
 * Copyright (c) 2006, 2020 THALES GLOBAL SERVICES and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales - initial API and implementation
 *   Obeo - add support for generation configuration files
 ******************************************************************************/

package org.polarsys.capella.docgen.configuration.commandline;

import java.util.Collection;
import java.util.List;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.egf.core.producer.InvocationException;
import org.eclipse.egf.core.producer.MissingExtensionException;
import org.eclipse.egf.model.domain.Domain;
import org.eclipse.egf.model.domain.DomainViewpoint;
import org.eclipse.egf.model.domain.EMFDomain;
import org.eclipse.egf.model.fcore.Activity;
import org.eclipse.egf.model.fcore.Contract;
import org.eclipse.egf.model.fcore.FactoryComponent;
import org.eclipse.egf.model.fcore.Viewpoint;
import org.eclipse.egf.model.types.Type;
import org.eclipse.egf.model.types.TypeString;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.equinox.app.IApplicationContext;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.common.tools.api.util.ReflectionHelper;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.application.WorkbenchAdvisor;
import org.polarsys.capella.core.commandline.core.AbstractCommandLine;
import org.polarsys.capella.core.commandline.core.CommandLineArgumentHelper;
import org.polarsys.capella.core.commandline.core.CommandLineException;
import org.polarsys.capella.core.data.capellamodeller.Project;
import org.polarsys.capella.core.sirius.ui.helper.SessionHelper;
import org.polarsys.capella.docgen.configuration.ui.utils.ConfigurationUtils;
import org.polarsys.kitalpha.doc.gen.business.core.scope.GenerationGlobalScope;
import org.polarsys.kitalpha.doc.gen.business.core.scope.ScopeElementStrategy;
import org.polarsys.kitalpha.doc.gen.business.core.scope.ScopeException;
import org.polarsys.kitalpha.doc.gen.business.core.scope.ScopeReferencesStrategy;
import org.polarsys.kitalpha.doc.gen.business.core.sirius.util.session.DiagramSessionHelper;
import org.polarsys.kitalpha.doc.gen.business.core.ui.helper.InvokeActivityHelper;

/**
 * Command line for HTML generation with configuration. From
 * org.polarsys.capella.docgen.commandline.HTMLCommandLine. Update execute
 * method to launch generation on configuration file elements.
 */
public class HTMLConfigurationCommandLine extends AbstractCommandLine {

	private static final String FCORE_URI = "/org.polarsys.capella.docgen.ui/egf/capellalauncher.fcore#_zup7kAkdEeCBJtEcjZDVOA";
	private static final URI CAPELLA_LAUNCHER_URI = URI.createURI("platform:/plugin" + FCORE_URI); //$NON-NLS-1$

	/**
	 * Configuration file parameter
	 */
	private String configurationFile;
	public static final String CONFIGURATION = "-configurationfile"; //$NON-NLS-1$

	/**
	 * Constructor.
	 */
	public HTMLConfigurationCommandLine() {
		super();
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see org.polarsys.capella.core.commandline.core.AbstractCommandLine#printHelp()
	 */
	@Override
	public void printHelp() {
		System.out.println("Capella HTML with Configuration Command Line"); //$NON-NLS-1$
		super.printHelp();
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see org.polarsys.capella.core.commandline.core.AbstractCommandLine#checkArgs(org.eclipse.equinox.app.IApplicationContext)
	 */
	@Override
	public void checkArgs(IApplicationContext context_p) throws CommandLineException {
		super.checkArgs(context_p);

		// check mandatory configuration file
		String[] args = CommandLineArgumentHelper.parseContext(context_p);
		for (int i = 0; i < args.length; i++) {
			String arg = args[i].toLowerCase();
			if (CONFIGURATION.equals(arg)) {
				configurationFile = args[++i];
			}
		}
		// is configuration empty ?
		if (isEmtyOrNull(configurationFile)) {
			logErrorAndThrowException(Messages.configuration_mandatory);
		}
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see org.polarsys.capella.core.commandline.core.AbstractCommandLine#execute(org.eclipse.equinox.app.IApplicationContext)
	 */
	@Override
	public boolean execute(IApplicationContext context_p) {

		startFakeWorkbench();

		// load the AIRD
		String fileURI = Messages.resource_prefix + argHelper.getFilePath();
		URI uri = URI.createURI(fileURI);

		URI semanticResourceURI = uri;

		if (uri.lastSegment().endsWith(".aird")) {//$NON-NLS-1$

			DiagramSessionHelper.setAirdUri(uri);
			Session session = DiagramSessionHelper.initSession();

			session.open(new NullProgressMonitor());
			// initialize scope
			boolean init = initializeScope(session);
			if (!init) {
				return true;
			}

			// init the EGF activity
			Activity htmlGenerator = InvokeActivityHelper.getActivity(CAPELLA_LAUNCHER_URI);

			Project rootSemanticElement = SessionHelper.getCapellaProject(session);
			if (rootSemanticElement != null) {
				Resource semanticResource = rootSemanticElement.eResource();
				semanticResourceURI = semanticResource.getURI();

				boolean status = executeEGFActivity(htmlGenerator, argHelper.getOutputFolder(), semanticResourceURI);

				if (status) {
					logInfo(Messages.generation_done + argHelper.getOutputFolder());
				}
			} else {
				logError(Messages.no_root_semantic_element);
			}
		} else {
			logError(Messages.filepath_point_to_aird);
		}

		return true;
	}

	/**
	 * Initialise generation scope with ScopeReferencesStrategy and scope
	 * elements.
	 * 
	 * @param session_p
	 *            Session
	 */
	private boolean initializeScope(Session session_p) {
		// Clean old scope data.
		GenerationGlobalScope.getInstance().cleanScope();

		// Initialize scope strategies
		GenerationGlobalScope.getInstance().setReferencesStrategy(ScopeReferencesStrategy.DONT_EXPORT);
		ReflectionHelper.setFieldValueWithoutException(GenerationGlobalScope.getInstance(), "elementStrategy",
				ScopeElementStrategy.ELEMENT);

		// Initialize scope.
		List<EObject> selectedModelElements = ConfigurationUtils.getInstance()
				.getElementsFromConfigurationFile(configurationFile, session_p, new NullProgressMonitor());
		if (selectedModelElements.isEmpty() && ConfigurationUtils.getInstance().getMessage() != null
				&& ConfigurationUtils.getInstance().getMessage() != "") {
			logError(ConfigurationUtils.getInstance().getMessage());
			return false;
		}
		for (EObject eObject : selectedModelElements) {
			try {
				GenerationGlobalScope.getInstance().addToScope(eObject);
			} catch (ScopeException e) {
				logError(e.getMessage());
			}
		}
		return true;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @throws CommandLineException
	 */
	@Override
	public void prepare(IApplicationContext context_p) throws CommandLineException {
		super.prepare(context_p);
	}

	public static void startFakeWorkbench() {
		Display display = PlatformUI.createDisplay();
		PlatformUI.createAndRunWorkbench(display, new WorkbenchAdvisor() {

			/**
			 * {@inheritDoc}
			 */
			@Override
			public boolean openWindows() {
				return false;
			}

			@Override
			public String getInitialWindowPerspectiveId() {
				return null;
			}
		});
	}

	private boolean executeEGFActivity(Activity capellaLauncher, final String outputFolder, final URI uri) {

		boolean success = false;
		String prefix = Messages.exec_pb;

		// create output folder in the project
		IPath path = new Path(outputFolder);
		IFolder folder = ResourcesPlugin.getWorkspace().getRoot().getFolder(path.append("output"));
		if (!folder.exists()) {
			try {
				folder.create(true, true, new NullProgressMonitor());
			} catch (CoreException e) {
				StringBuilder message = new StringBuilder(prefix).append(e.getMessage());
				logError(message.toString());
				return false;
			}
		}

		if (capellaLauncher instanceof FactoryComponent) {
			String relativeFilePath = getRelativeFilePath(outputFolder);
			String projectName = getProjectName(outputFolder);

			final FactoryComponent factoryComponent = (FactoryComponent) capellaLauncher;
			setContract(factoryComponent, "projectName", projectName); //$NON-NLS-1$
			setContract(factoryComponent, "outputFolder", relativeFilePath + "/output"); //$NON-NLS-1$
			setDomain(factoryComponent, uri);

			// run the activity
			try {
				InvokeActivityHelper.invokeOutOfUIThread(factoryComponent);
				success = true;

			} catch (MissingExtensionException e) {
				StringBuilder message = new StringBuilder(prefix).append(e.getMessage());
				logError(message.toString());
				return false;

			} catch (InvocationException e) {
				StringBuilder message = new StringBuilder(prefix).append(e.getMessage());
				logError(message.toString());
				return false;

			} catch (CoreException e) {
				StringBuilder message = new StringBuilder(prefix).append(e.getMessage());
				logError(message.toString());
				return false;
			}

		} else {
			success = false;
		}
		return success;
	}

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

	private void setContract(FactoryComponent factoryComponent, String contractName, String value) {
		Contract invokedContract = factoryComponent.getContract(contractName);

		Type type = invokedContract.getType();
		if (type instanceof TypeString) {
			TypeString typeString = (TypeString) type;
			typeString.setValue(value);
		}

	}

}
