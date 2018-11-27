/*******************************************************************************
 * Copyright (c) 2006, 2018 THALES GLOBAL SERVICES.
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
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
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
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.sirius.business.api.session.resource.AirdResource;
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.polarsys.capella.common.data.modellingcore.AbstractNamedElement;
import org.polarsys.capella.core.data.capellamodeller.util.CapellamodellerResourceImpl;
import org.polarsys.capella.docgen.Activator;
import org.polarsys.capella.shared.id.handler.IScope;
import org.polarsys.capella.shared.id.handler.IdManager;
import org.polarsys.kitalpha.doc.gen.business.core.util.DocGenHtmlConstants;
import org.polarsys.kitalpha.doc.gen.business.core.util.DocGenHtmlUtil;

public class StringUtil {
	private static final String ELEMENT_LINK_REGEX = "hlink://(.+)";
//	private static final String REGEX = "<[\\s]*a[\\s]+href[\\s]*=[\\s]*\"([^>]+)\"[\\s]*>[\\s]*(.+?)[\\s]*<[\\s]*/[\\s]*a[\\s]*>";
	private static final String REGEX = "<[\\s]*[aA][\\s]+href[\\s]*=[\\s]*\"([^>]+)\"[\\s]*>(.*?)<[\\s]*/[\\s]*[aA][\\s]*>";
	private static final String REGEX_IMG = "<[\\s]*img[^>]*?src[\\s]*=[\\s]*\"([^>\"]+?)\"[^>]*?/[\\s]*>";
	private static final String REGEX_FilePATH = "<[aA][\\s]+href=\"(.+?)\">";
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
			input = manageImages(eObject, input, projectName, outputFolder);

			/**
			 * Manage links to relative files path Relative path will be
			 * translated to absolute path.
			 */
			input = manageFileLinks(eObject, input, projectName, outputFolder);

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
	private static String manageFileLinks(EObject eObject, String input, String projectName, String outputFolder) {
		if (input.trim().length() == 0) {
			return input;
		}

		Pattern pattern = Pattern.compile(REGEX_FilePATH, Pattern.DOTALL);
		Matcher matcher = pattern.matcher(input);
		final IPath parentSrcFolder = new Path(eObject.eResource().getURI().segment(1));
		final IPath parentTargetFolderPath = new Path(projectName).append(outputFolder);
		while (matcher.find()) {
			// we check that we really have a link to a file (absolute or relative) and not a link to URL, model element, diagram...
			if (matcher.group(1).startsWith("file://") || matcher.group(1).startsWith("local://")) {
				// in the following, replaceAll("%20", " ") is used to fix spaces in file path
				String id = eObject.eGet(eObject.eClass().getEStructuralFeature("id")).toString();
				id = id.replace("-", "");
				IPath patha = new Path(matcher.group(1).replaceAll("%20", " "));
				String iconName = id + "/" + patha.lastSegment();
				StringBuilder iconSourcePath = new StringBuilder();

				// if absolute path
				if (matcher.group(1).startsWith("file://")) {
					for (String segment : patha.segments()) {
						iconSourcePath.append("/").append(segment);
					}
				} else {
					// relative path. We need to remove "local://" from matcher.group(1) => we starts with character n°8
					IPath path = parentSrcFolder.append(matcher.group(1).substring(8, matcher.group(1).length()).replaceAll("%20", " "));
					IFile iconFile = ResourcesPlugin.getWorkspace().getRoot().getFile(path);
					iconSourcePath.append(iconFile.getLocationURI().getPath());
				}

				IFolder parentTargetFolder = ResourcesPlugin.getWorkspace().getRoot().getFolder(parentTargetFolderPath);
				input = input.replace(matcher.group(1), "./files/" + iconName + "\"");
				final ILog loger = org.polarsys.capella.docgen.Activator.getDefault().getLog();
				try {
					ImageHelper.INSTANCE.copyProjectImageToSystemLocation(iconSourcePath.toString(), parentTargetFolder.getLocationURI().getPath() + "/files/" + iconName);
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
	private static String manageImages(EObject eObject, String input, String projectName, String outputFolder) {
		if (input.trim().isEmpty()) {
			return input;
		}

		Pattern pattern = Pattern.compile(REGEX_IMG, Pattern.DOTALL);
		Matcher matcher = pattern.matcher(input);
		final IPath parentSrcFolder = new Path(eObject.eResource().getURI().segment(1));
		final IPath parentTargetFolderPath = new Path(projectName).append(outputFolder);
		while (matcher.find()) {
			if (matcher.groupCount() == 1) {
				// in the following, replaceAll("%20", " ") is used to fix spaces in image path
				String id = eObject.eGet(eObject.eClass().getEStructuralFeature("id")).toString();
				id = id.replace("-", "");
				IPath patha = new Path(matcher.group(1).replaceAll("%20", " "));
				String iconName = id + "/" + patha.lastSegment();
				String iconSourcePath = "";

				if (patha.isAbsolute()) {
					for (String segment : patha.segments()) {
						iconSourcePath += "/" + segment;
					}
				} else {
					IPath path = parentSrcFolder.append(matcher.group(1).replaceAll("%20", " "));
					IFile iconFile = ResourcesPlugin.getWorkspace().getRoot().getFile(path);
					iconSourcePath = iconFile.getLocationURI().getPath();
				}

				IFolder parentTargetFolder = ResourcesPlugin.getWorkspace().getRoot().getFolder(parentTargetFolderPath);
				input = input.replace(matcher.group(1), "./images/" + iconName + "\"");
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
		if (matcher.find() && matcher.groupCount() == 1) {
			String id = matcher.group(1);
			if (id != null && id.trim().length() > 0 && id.contains("/")) {
				id = id.substring(0, id.length() - 1);
			}

			EObject eObject = resource.getEObject(id);
			// If the object is not found in the current resource, we look for
			// it in all loaded resources of the ResourceSet
			if (eObject == null) {
				ResourceSet rs = resource.getResourceSet();
				for (Resource iResource : rs.getResources()) {
					// Case of model element
					if (iResource instanceof CapellamodellerResourceImpl) {
						eObject = iResource.getEObject(id);
						if (eObject != null) {
							break;
						}
					}

					// Case of diagram element
					if (iResource instanceof AirdResource) {
						eObject = iResource.getEObject(id);
						if (eObject != null) {
							break;
						}
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

			if (eObject != null) {
				if (eObject instanceof DSemanticDiagram) {
					buffer.append(CapellaServices.getPathFromElement(((DSemanticDiagram) eObject).getTarget()));
					buffer.append("#");
					buffer.append(CapellaServices.getDiagramUid((DSemanticDiagram) eObject));
				} else {
					buffer.append(CapellaServices.getPathFromElement(eObject));
				}
				return buffer.toString();
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
				buletteItem(buffer, str);
			}
			buffer.append(CapellaServices.UL_CLOSE);
		}
		// Return the buffer
		return buffer.toString();
	}

	public static String stringListToBulette(EList<? extends AbstractNamedElement> list_elts, String projectName, String outputFolder) {
		// Buffer declaration
		StringBuffer buffer = new StringBuffer();
		if (list_elts.size() < 1) {
			buffer.append(CapellaServices.NONE);
		} else {
			buffer.append(CapellaServices.UL_OPEN);
			// For each element of the list
			for (AbstractNamedElement elt : list_elts) {
				// Add the open bullet tag to the buffer
				buffer.append(CapellaServices.LI_OPEN);
				// Add the content of the bullet to the buffer
				buffer.append(CapellaServices.getImageLinkFromElement(elt, projectName, outputFolder));
				buffer.append(CapellaServices.SPACE);
				buffer.append(CapellaServices.getHyperlinkFromElement(elt));
				// Add the close bullet tag to the buffer
				buffer.append(CapellaServices.LI_CLOSE);			}
			buffer.append(CapellaServices.UL_CLOSE);
		}
		// Return the buffer
		return buffer.toString();
	}

	private static void buletteItem(StringBuffer buffer, String str) {
		// Add the open bullet tag to the buffer
		buffer.append(CapellaServices.LI_OPEN);
		// Add the content of the bullet to the buffer
		buffer.append(str);
		// Add the close bullet tag to the buffer
		buffer.append(CapellaServices.LI_CLOSE);
	}

	/**
	 * Build a 2 columns html table. The first table contains the keys of the map and the second
	 * contains the values of the map
	 * @param map data of the table
	 * @param firstColTitle the title of the first column
	 * @param secondColTitle the title of the second column
	 * @return html table string
	 */
	public static String mapToHTMLTable(Map<String, String> map, 
			String firstColTitle, String secondColTitle){
		
		//To generate header one of the first or second title must be set
		boolean generateTableHeader = (firstColTitle != null && !firstColTitle.isEmpty()) || (secondColTitle != null && !secondColTitle.isEmpty());
		
		firstColTitle = firstColTitle== null ? "" : firstColTitle;
		secondColTitle = secondColTitle== null ? "" : secondColTitle;
		
		StringBuffer buffer = new StringBuffer();
		buffer.append("<table>"); //$NON-NLS-1$
		if (generateTableHeader){
			buffer.append("<tr>").append("<th>"); //$NON-NLS-1$ //$NON-NLS-2$
			buffer.append(firstColTitle).append("</th>"); //End first col //$NON-NLS-1$
			
			buffer.append("<th>"); //$NON-NLS-1$
			buffer.append(secondColTitle);
			buffer.append("</th></tr>"); //End second col and the first row //$NON-NLS-1$
		}
		
		//Generate the table content
		for(Entry<String, String> e: map.entrySet()){
			buffer.append("<tr>"); //$NON-NLS-1$
			buffer.append("<td>").append(e.getKey()).append("</td><td>").append(e.getValue()).append("</td>"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
			buffer.append("</tr>"); //$NON-NLS-1$
		}
		buffer.append("</table>"); //$NON-NLS-1$
		
		return buffer.toString();
	}
	
	/**
	 * @param stringSet must be not null
	 * @return true if the stringSet contains a not empty or null value string, otherwise false
	 */
	public static boolean containsNotEmptyString(Collection<String> stringSet){
		
		for (String string : stringSet) {
			if (string != null && !string.isEmpty()){
				return true;
			}
		}
		return false;
	}
}
