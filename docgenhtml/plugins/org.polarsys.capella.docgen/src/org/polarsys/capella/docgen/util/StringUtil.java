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
package org.polarsys.capella.docgen.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.sirius.business.api.session.resource.AirdResource;
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.polarsys.capella.core.data.capellamodeller.util.CapellamodellerResourceImpl;
import org.polarsys.capella.docgen.Activator;
import org.polarsys.capella.shared.id.handler.IScope;
import org.polarsys.capella.shared.id.handler.IdManager;
import org.polarsys.kitalpha.doc.gen.business.core.util.DocGenHtmlConstants;
import org.polarsys.kitalpha.doc.gen.business.core.util.DocGenHtmlUtil;

public class StringUtil {
	private static final String ELEMENT_LINK_REGEX = "hlink://(.+)";
	private static final String REGEX = "<[\\s]*a[\\s]+href[\\s]*=[\\s]*\"([^>]+)\"[\\s]*>[\\s]*(.+?)[\\s]*<[\\s]*/[\\s]*a[\\s]*>";
	private static final String REGEX_IMG = "<[\\s]*img[\\s]+src[\\s]*=[\\s]*\"([^>]+)\"[\\s]*/[\\s]*>";
	private static final String REGEX_RelativeFilePATH_OpenTag = "<a[\\s]+href=\"local://(.+?)\">";
	private static final String ERROR_CPY = "Error during project relative image copy";

	/**
	 * Transform all links added in an model element description to Html links
	 * 
	 * @param eObject
	 *            model element for which documentation is about to be generated
	 * @param input
	 *            <code> eObject </code> description
	 * @param projectName
	 *            project name wherein documentation is generated
	 * @param outputFolder
	 *            folder name wherein documentation is generated
	 * @return model element description with all links transformed to html
	 *         links
	 */
	public static String transformAREFString(EObject eObject, String input, String projectName, String outputFolder) {

		if (input != null) {
			/**
			 * Manage Links to Capella model element and Sirius diagrams Links
			 * are translated to HTML link to generated HTML page
			 **/
			input = manageModelAndDiagramElementsLinks(input, eObject);

			/**
			 * Manage Links to relative image path. Image is copied in a sub
			 * folder of output folder and link copy is used
			 **/
			input = manageRelativeImages(eObject, input, projectName, outputFolder);

			/**
			 * Manage links to relative files path Relative path will be
			 * translated to absolute path.
			 */
			input = manageRelativeFileLinks(eObject, input, projectName, outputFolder);

			return input;
		}
		return "";
	}

	/**
	 * Transforms links to model elements or diagrams to html links. This links
	 * format is <code>hlink://Target ID/</code>.
	 * 
	 * @param input
	 *            <code> eObject </code> description
	 * @param eObject
	 *            model element for which documentation is about to be generated
	 * @return model element description (<code>input</code>) with links to
	 *         model or diagram elements are transformed to html links
	 */
	private static String manageModelAndDiagramElementsLinks(String input, EObject eObject) {
		Pattern pattern = Pattern.compile(REGEX, Pattern.DOTALL);
		Matcher matcher = pattern.matcher(input);

		while (matcher.find()) {
			if (matcher.groupCount() == 2) {
				final String akB = "<a href=\"";
				final String akE = "</a>";
				final String link = akB + switchToDocPath(matcher.group(1), eObject.eResource()) + "\">" + matcher.group(2) + akE;
				input = input.replace(matcher.group(0), link);
			}
		}
		return input;
	}

	/**
	 * Transform link to file using relative path to absolute path.
	 * 
	 * @param eObject
	 *            model element for which documentation is about to be generated
	 * @param input
	 *            <code> eObject </code> description
	 * @param projectName
	 *            project name wherein documentation is generated
	 * @param outputFolder
	 *            folder name wherein documentation is generated
	 * @return model element description (<code>input</code>) with file relative
	 *         paths transformed to file absolute paths
	 */
	private static String manageRelativeFileLinks(EObject eObject, String input, String projectName, String outputFolder) {
		if (input.trim().length() == 0)
			return input;

		Pattern pattern = Pattern.compile(REGEX_RelativeFilePATH_OpenTag, Pattern.DOTALL);
		Matcher matcher = pattern.matcher(input);
		final IPath parentSrcFolder = new Path(eObject.eResource().getURI().segment(1));
		final IPath parentTargetFolderPath = new Path(projectName).append(outputFolder);
		while (matcher.find()) {
			String id = eObject.eGet(eObject.eClass().getEStructuralFeature("id")).toString();
			id = id.replace("-", "");
			IPath patha = new Path(matcher.group(1));
			String iconName = id + "/" + patha.lastSegment();
			String iconSourcePath = "";

			IPath path = parentSrcFolder.append(matcher.group(1));
			IFile iconFile = ResourcesPlugin.getWorkspace().getRoot().getFile(path);
			iconSourcePath = iconFile.getLocationURI().getPath();

			IFolder parentTargetFolder = ResourcesPlugin.getWorkspace().getRoot().getFolder(parentTargetFolderPath);
			input = input.replace(matcher.group(0), "<a href=\"./files/" + iconName + "\">");
			final ILog loger = org.polarsys.capella.docgen.Activator.getDefault().getLog();
			try {
				ImageHelper.INSTANCE.copyProjectImageToSystemLocation(iconSourcePath, parentTargetFolder.getLocationURI().getPath() + "/files/" + iconName);
			} catch (IOException e) {
				loger.log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, ERROR_CPY, e));
			} catch (Exception e) {
				loger.log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, ERROR_CPY, e));
			}
		}

		return input;
	}

	/**
	 * Copy image linked by relative path to documentation generation folder and
	 * change it relative path to the new copy path
	 * 
	 * @param eObject
	 *            model element for which documentation is about to be generated
	 * @param input
	 *            <code> eObject </code> description
	 * @param projectName
	 *            project name wherein documentation is generated
	 * @param outputFolder
	 *            folder name wherein documentation is generated
	 * @return model element description (<code>input</code>) with image
	 *         relative paths transformed to local copy absolute paths
	 */
	private static String manageRelativeImages(EObject eObject, String input, String projectName, String outputFolder) {
		if (input.trim().isEmpty())
			return input;

		Pattern pattern = Pattern.compile(REGEX_IMG, Pattern.DOTALL);
		Matcher matcher = pattern.matcher(input);
		final IPath parentSrcFolder = new Path(eObject.eResource().getURI().segment(1));
		final IPath parentTargetFolderPath = new Path(projectName).append(outputFolder);
		while (matcher.find()) {
			if (matcher.groupCount() == 1) {
				String id = eObject.eGet(eObject.eClass().getEStructuralFeature("id")).toString();
				id = id.replace("-", "");
				IPath patha = new Path(matcher.group(1));
				String iconName = id + "/" + patha.lastSegment();
				String iconSourcePath = "";

				if (patha.isAbsolute()) {
					for (String segment : patha.segments()) {
						iconSourcePath += "/" + segment;
					}
				} else {
					IPath path = parentSrcFolder.append(matcher.group(1));
					IFile iconFile = ResourcesPlugin.getWorkspace().getRoot().getFile(path);
					iconSourcePath = iconFile.getLocationURI().getPath();
				}

				IFolder parentTargetFolder = ResourcesPlugin.getWorkspace().getRoot().getFolder(parentTargetFolderPath);
				input = input.replace(matcher.group(0), "<img src=\"./images/" + iconName + "\">");
				final ILog loger = org.polarsys.capella.docgen.Activator.getDefault().getLog();
				try {
					ImageHelper.INSTANCE.copyProjectImageToSystemLocation(iconSourcePath, parentTargetFolder.getLocationURI().getPath() + "/images/" + iconName);
				} catch (IOException e) {
					loger.log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, ERROR_CPY, e));
				} catch (Exception e) {
					loger.log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, ERROR_CPY, e));
				}
			}
		}
		return input;
	}

	/**
	 * Manage a link to a Model element or a diagram
	 * 
	 * @param group
	 *            text containing a link to handle
	 * @param resource
	 *            capella resource
	 * @return <code>group</code> with links to model elements replaced by html
	 *         links
	 */
	private static String switchToDocPath(String group, Resource resource) {
		/**
		 * Handle links to model or diagram elements
		 */
		Pattern pattern = Pattern.compile(ELEMENT_LINK_REGEX);
		Matcher matcher = pattern.matcher(group);
		StringBuffer buffer = new StringBuffer();
		if (matcher.find() && matcher.groupCount() == 1) 
		{
			String id = matcher.group(1);
			if (id != null && id.trim().length() > 0 && id.contains("/"))
				id = id.substring(0, id.length() - 1);

			EObject eObject = resource.getEObject(id);
			
			// If the object is not found in the current resource, we look for
			// it in all loaded resources of the ResourceSet
			
			if (eObject == null) 
			{
				ResourceSet rs = resource.getResourceSet();
				for (Resource iResource : rs.getResources()) {
					// Case of model element
					if (iResource instanceof CapellamodellerResourceImpl) {
						eObject = iResource.getEObject(id);
						if (eObject != null)
							break;
					}

					// Case of diagram element
					if (iResource instanceof AirdResource) {
						eObject = iResource.getEObject(id);
						if (eObject != null)
							break;
					}
				}
			}
			
			// If the object is still not found, so we use the Capella API.
			if (eObject == null) 
			{
				final ResourceSet rs = resource.getResourceSet();
				eObject = IdManager.getInstance().getEObject(id, new IScope() {
					@Override
					public List<Resource> getResources() {
						return rs.getResources();
					}
				});
			}

			if (eObject != null) 
			{
				if (eObject instanceof DSemanticDiagram) 
				{
					buffer.append(CapellaServices.getPathFromElement(((DSemanticDiagram) eObject).getTarget()));
					buffer.append("#");
					buffer.append(CapellaServices.getDiagramId((DSemanticDiagram) eObject));
					return buffer.toString();
				} 
				else 
				{
					buffer.append(CapellaServices.getPathFromElement(eObject));
					return buffer.toString();
				}
			}
		}

		return group;
	}

	protected static String getPath(Resource resource, String id) {
		String newID = id.replaceAll("#", "");
		EObject eObject = resource.getEObject(newID);
		if (eObject != null) {
			String fileName = DocGenHtmlCapellaUtil.SERVICE.getFileName(eObject);
			String modelName = DocGenHtmlUtil.getModelName(eObject);
			String validFileName = "../" + modelName + "/" + DocGenHtmlUtil.getValidFileName(fileName) + "." + DocGenHtmlConstants.HTML_FILE_EXTENSION;
			return validFileName;
		}
		return "#";
	}

	/**
	 * Transform a list of string to html bullet list
	 * <p>
	 * Transform a List of string to a string containing the html bullet list
	 * </p>
	 * 
	 * @param list_p
	 * @return
	 */
	public static String stringListToBulette(Collection<String> list_p) {
		// Buffer declaration
		StringBuffer buffer = new StringBuffer();
		if (list_p.size() < 1) {
			buffer.append(CapellaServices.NONE);
		} else {
			buffer.append(CapellaServices.UL_OPEN);
			// For each element of the list
			for (String str : list_p) {
				// Add the open bullet tag to the buffer
				buffer.append(CapellaServices.LI_OPEN);
				// Add the content of the bullet to the buffer
				buffer.append(str);
				// Add the close bullet tag to the buffer
				buffer.append(CapellaServices.LI_CLOSE);
			}
			buffer.append(CapellaServices.UL_CLOSE);
		}
		// Return the buffer
		return buffer.toString();
	}
}
