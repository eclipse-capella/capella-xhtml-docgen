/*******************************************************************************
 * Copyright (c) 2006, 2015 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales - initial API and implementation
 ******************************************************************************/

package org.polarsys.capella.docgen.commandline;

import java.util.Collection;

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
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.equinox.app.IApplicationContext;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.application.WorkbenchAdvisor;
import org.polarsys.capella.core.commandline.core.AbstractCommandLine;
import org.polarsys.capella.core.commandline.core.CommandLineException;
import org.polarsys.kitalpha.doc.gen.business.core.sirius.util.session.DiagramSessionHelper;
import org.polarsys.kitalpha.doc.gen.business.core.ui.helper.InvokeActivityHelper;

/**
 * 
 */
public class HTMLCommandLine extends AbstractCommandLine {

	private static final String FCORE_URI = "/org.polarsys.kitalpha.doc.gen.business.capella.ui/egf/capellalauncher.fcore#_zup7kAkdEeCBJtEcjZDVOA";
	private static final URI CAPELLA_LAUNCHER_URI = URI.createURI("platform:/plugin" + FCORE_URI); //$NON-NLS-1$

	/**
   * 
   */
	public HTMLCommandLine() {
		super();
	}

	@Override
	public void printHelp() {
		System.out.println("Capella HTML Command Line"); //$NON-NLS-1$
		super.printHelp();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void checkArgs(IApplicationContext context_p) throws CommandLineException {
		super.checkArgs(context_p);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean execute(IApplicationContext context_p) {

		startFakeWorkbench();

		// load the AIRD
		String fileURI = Messages.resource_prefix + argHelper.getFilePath();
		URI uri = URI.createURI(fileURI);

		// init the EGF activity
		Activity htmlGenerator = InvokeActivityHelper.getActivity(CAPELLA_LAUNCHER_URI);

		URI semanticResourceURI = uri;

		if (uri.lastSegment().endsWith(".aird")) {//$NON-NLS-1$

			DiagramSessionHelper.setAirdUri(uri);
			Session session = DiagramSessionHelper.initSession();

			Collection<Resource> resources = session.getSemanticResources();

			session.open(new NullProgressMonitor());

			if (!resources.isEmpty()) {
				Resource semanticResource = resources.iterator().next();
				semanticResourceURI = semanticResource.getURI();

				boolean status = executeEGFActivity(htmlGenerator, argHelper.getOutputFolder(), semanticResourceURI);

				if (status) {
					logInfo(Messages.generation_done + argHelper.getOutputFolder());
				}
			}
		} else {
			logError(Messages.filepath_point_to_aird);
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
