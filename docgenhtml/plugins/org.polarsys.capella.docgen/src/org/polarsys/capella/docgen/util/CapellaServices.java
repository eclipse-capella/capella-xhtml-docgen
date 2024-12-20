/*******************************************************************************
 * Copyright (c) 2006, 2021 THALES GLOBAL SERVICES.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales - initial API and implementation
 ******************************************************************************/
package org.polarsys.capella.docgen.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.osgi.util.NLS;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.DRepresentationDescriptor;
import org.polarsys.capella.core.data.capellacore.AbstractDependenciesPkg;
import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.core.data.capellacore.Classifier;
import org.polarsys.capella.core.data.interaction.CombinedFragment;
import org.polarsys.capella.core.data.interaction.InteractionOperand;
import org.polarsys.capella.docgen.Messages;
import org.polarsys.kitalpha.doc.gen.business.core.scope.GenerationGlobalScope;
import org.polarsys.kitalpha.doc.gen.business.core.sirius.util.session.DiagramSessionHelper;
import org.polarsys.kitalpha.doc.gen.business.core.util.DocGenHtmlUtil;
import org.polarsys.kitalpha.doc.gen.business.core.util.EscapeChars;

public class CapellaServices {
	
	private CapellaServices() {}
	
	public static final String BOLD_BEGIN = "<b>";
	public static final String BOLD_END = "</b>";
	public static final String ITALIC_BEGIN = "<i>";
	public static final String ITALIC_END = "</i>";
	
	public static final String SPAN_BEGIN_LABEL = "<span class=\"label\">";
	public static final String SPAN_END = "</span>";

	public static final String NEW_LINE = "<br/>";

	public static final String LI_OPEN = "<li>";
	public static final String LI_CLOSE = "</li>";

	public static final String UL_OPEN = "<ul class=\"generatedList\">";
	public static final String UL_OPEN_WITH_BORDER = "<ul class=\"generatedListWithBorder\">";
	public static final String UL_OPEN_SIMPLE = "<ul>";
	public static final String UL_CLOSE = "</ul>";
	
	public static final String TD_OPEN = "<td>";
	public static final String TD_CLOSE = "</td>";
	
	public static final String TD_STYLE_MAX_WIDTH_100_BORDER_0PX = "<td style=\"max-width:100%; border:0px\">";
	
	public static final String TR_OPEN = "<tr>";
	public static final String TR_CLOSE = "</tr>";

	public static final String NONE = "None";
	
	public static final String NO_NAME = "<i>[No Name]</i>";

	public static final String SPACE = " ";

	public static final String EMPTY = "";

	public static final String VALUE_PRESENTER = " : ";
	public static final String VALUE_EQUAL = " = ";
  public static final String VALUE_ARROW = " -> ";

	public static final String IS_ABSTRACT = "Is Abstract\t:\t";
	public static final String IS_PRIMITIVE = "Is Primitive\t:\t";
	public static final String IS_DISCRETE = "Is Discrete\t:\t";
	public static final String IS_HUMAN = "Is Human\t:\t";
	public static final String IS_ACTOR = "Is Actor\t:\t";
	public static final String PATTERN = "Pattern\t:\t";
	public static final String DEFAULT_FEATURE = "Default\t:\t";
	public static final String MIN_FEATURE = "Min\t:\t";
	public static final String MAX_FEATURE = "Max\t:\t";
	public static final String NULL_FEATURE = "Null\t:\t";
	public static final String MINLENGTH_FEATURE = "Min. length\t:\t";
	public static final String MAXLENGTH_FEATURE = "Max. length\t:\t";
	public static final String PROP_ABSTRACT = "abstract  ";
	public static final String PROP_STATIC = "static  ";
	public static final String PROP_KEY = "key  ";
	public static final String PROP_DERIVED = "derived  ";
	public static final String PROP_READONLY = "readonly  ";
	public static final String PROP_ORDERED = "ordered  ";
	public static final String PROP_UNIQUE = "unique  ";
	public static final String PROP_GENERATED = "generated  ";
	public static final String PROP_CHANGEABLE = "changeable  ";
	public static final String PROP_CRO_ABSTRACT = "{abstract}  ";
	public static final String PROP_CRO_STATIC = "{static}  ";
	public static final String PROP_CRO_KEY = "{key}  ";
	public static final String PROP_CRO_DERIVED = "{derived}  ";
	public static final String PROP_CRO_READONLY = "{readonly}  ";
	public static final String PROP_CRO_ORDERED = "{ordered}  ";
	public static final String PROP_CRO_UNIQUE = "{unique}  ";
	public static final String PROP_CRO_GENERATED = "{generated}  ";
	public static final String PROP_CRO_CHANGEABLE = "{changeable}  ";

	public static final String MIN = "MIN  ";
	public static final String MAX = "MAX  ";
	public static final String DEFAULT = "DEFAULT  ";
	public static final String NULL = "NULL  ";

	public static final String NULL_LOWER_CASE = "null";
	
	public static final String UNDEFINED = "undefined";
	public static final String UNDEFINED_CHEVRON = "&lt;undefined&gt;";

	public static final String PAR_OPEN = "(  ";
	public static final String PAR_CLOSE = " )";
	public static final String CRO_OPEN = "[";
	public static final String CRO_CLOSE = "]";
	public static final String COMMA = ", ";
	
	public static final String CHEV_OPEN = "&lt";
	public static final String CHEV_CLOSE = "&gt";

  public static final String HYPERLINK_OPEN = "<a href=\"";
  public static final String HYPERLINK_SEPARATOR = "/";
  public static final String HYPERLINK_COMPLETE = "\">";
  public static final String HYPERLINK_CLOSE = "</a>";
	private static final Object PATH_OPEN = "../";
	private static final Object PATH_COMPLETE = ".html";

	public static String getHyperlinkFromElement(EObject element, String label) {
		if (element instanceof DSemanticDiagram) {
			return getHyperlinkFromDiagram((DSemanticDiagram) element);
		}
		int linked = isLinkable(element);
		// Get the representation name
		String text = label;
		// Format representation name with html rules
		text = EscapeChars.forHTML(text);
		// Initialize string builder
		StringBuilder stringBuilder = new StringBuilder();
		if (linked != -1) {
			// Add the opening href tag to the buffer
			stringBuilder.append(HYPERLINK_OPEN);
			// Add the preoject root ressource to the buffer
			if (linked == 1) {
				stringBuilder.append(getPathFromElement(element.eContainer()));
				stringBuilder.append("#");
				stringBuilder.append(getAnchorId(element));
			} else
				stringBuilder.append(getPathFromElement(element));
			// Add the href tag completion to the buffer
			stringBuilder.append(HYPERLINK_COMPLETE);
		}
		// Add the name to present to the buffer
		stringBuilder.append(text);
		if (linked != -1) {
			// Add the close href tag to the buffer
			stringBuilder.append(HYPERLINK_CLOSE);
		}
		// return the buffer
		return stringBuilder.toString();
	}
	/**
	 * 
	 * @param element
	 * @param label
	 * @return the hyperlink to element page from index
	 */
	public static String getIndexHyperlinkFromElement(EObject element, String label) {
		int linked = isLinkable(element);
		// Get the representation name
		String text = label;
		// Format representation name with html rules
		text = EscapeChars.forHTML(text);
		// Initialize string builder
		StringBuilder stringBuilder = new StringBuilder();
		if (linked != -1) {
			// Add the opening href tag to the buffer
			stringBuilder.append(HYPERLINK_OPEN);
			// Add the preoject root ressource to the buffer
			if (linked == 1) {
				stringBuilder.append(getIndexPathFromElement(element.eContainer()));
				stringBuilder.append("#");
				stringBuilder.append(getAnchorId(element));
			} else
				stringBuilder.append(getIndexPathFromElement(element));
			// Add the href tag completion to the buffer
			stringBuilder.append(HYPERLINK_COMPLETE);
		}
		// Add the name to present to the buffer
		stringBuilder.append(text);
		if (linked != -1) {
			// Add the close href tag to the buffer
			stringBuilder.append(HYPERLINK_CLOSE);
		}
		// return the buffer
		return stringBuilder.toString();
	}

	/**
	 * <b>Create a html hyper link from an element</b>
	 * <p>
	 * Create and format a html hyper link (a href) from a Capella Element
	 * 
	 * @param element
	 * @return
	 */
	public static String getHyperlinkFromElement(EObject element) {
		return getHyperlinkFromElement(element, CapellaLabelProviderHelper.getText(element));
	}
	
	public static String getIndexHyperlinkFromElement(EObject element) {
		return getIndexHyperlinkFromElement(element, CapellaLabelProviderHelper.getText(element));
	}

	public static boolean isElementLinkable(EObject element) {
		return isLinkable(element) >= 0;
	}

	/**
	 * 
	 * @param element
	 * @return 0 if element has page, 1 if parent element has page, otherwise -1
	 */
	public static int isLinkable(EObject element) {
		if ((! GenerationGlobalScope.getInstance().inScope(element, true)) || !(element instanceof CapellaElement))
			return -1;
		
		if (DocGenHtmlCapellaControl.isPageCandidate((CapellaElement) element))
			return 0;
		else {
			if (! DocGenHtmlCapellaControl.isPageOptional((CapellaElement) element)) {
				EObject parent = element.eContainer();
				if (parent instanceof CapellaElement && DocGenHtmlCapellaControl.isPageCandidate((CapellaElement) parent)) {
					return 1;
				}
			}
		}
		return -1;
	}
	
	/**
	 * @param element
	 * @return 0 if element has page, 1 if parent element has page, otherwise -1
	 */
	public static int isLinkableWithoutScope(EObject element) {
		if (element instanceof CombinedFragment || element instanceof  InteractionOperand || !(element instanceof CapellaElement)) {
			return -1;
		}
		
		if (DocGenHtmlCapellaControl.isPageCandidate((CapellaElement) element))
			return 0;
		else {
			if (! DocGenHtmlCapellaControl.isPageOptional((CapellaElement) element)) {
				EObject parent = element.eContainer();
				if (parent instanceof CapellaElement && DocGenHtmlCapellaControl.isPageCandidate((CapellaElement) parent)) {
					return 1;
				}
			}
		}
		return -1;
	}

	public static String getPathFromElement(EObject element) {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(PATH_OPEN);
		// Add the project root resource to the buffer
		stringBuilder.append(DocGenHtmlUtil.getModelName(element));
		// Add the Separator to the buffer
		stringBuilder.append(HYPERLINK_SEPARATOR);
		// Add the file name to the buffer
		stringBuilder.append(DocGenHtmlCapellaUtil.SERVICE.getFileName(element));
		// Add the href tag completion to the buffer
		stringBuilder.append(PATH_COMPLETE);
		return stringBuilder.toString();
	}
	
	/**
	 * 
	 * @param element
	 * @return the path of the element to be reachable from the index
	 */
	public static String getIndexPathFromElement(EObject element) {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(PATH_OPEN).append(PATH_OPEN); //Index is located one level deeper
		// Add the project root resource to the buffer
		stringBuilder.append(DocGenHtmlUtil.getModelName(element));
		// Add the Separator to the buffer
		stringBuilder.append(HYPERLINK_SEPARATOR);
		// Add the file name to the buffer
		stringBuilder.append(DocGenHtmlCapellaUtil.SERVICE.getFileName(element));
		// Add the href tag completion to the buffer
		stringBuilder.append(PATH_COMPLETE);
		return stringBuilder.toString();
	}

	private static String getHyperlinkFromDiagram(DSemanticDiagram diagram) {
		// Get the representation name
		String text = CapellaLabelProviderHelper.getText(diagram);
		// Format representation name with html rules
		text = EscapeChars.forHTML(text);
		// Initialize string builder
		StringBuilder stringBuilder = new StringBuilder();
		// Add the opening href tag to the buffer
		stringBuilder.append(HYPERLINK_OPEN);
		// Add the project root resource to the buffer
		stringBuilder.append(getPathFromElement(getRepresentationTarget(diagram)));
		// Add diagram fragment id as link anchor
		stringBuilder.append("#");
		stringBuilder.append(getDiagramUid(diagram));
		// Add the href tag completion to the buffer
		stringBuilder.append(HYPERLINK_COMPLETE);
		// Add the name to present to the buffer
		stringBuilder.append(text);
		// Add the close href tag to the buffer
		stringBuilder.append(HYPERLINK_CLOSE);
		// return the buffer
		return stringBuilder.toString();
	}

	public static String getAnchorId(EObject element) {
		return "id" + EcoreUtil.getURI(element).fragment();
	}

	/**
	 * 
	 * @param diagram
	 * @return
	 * 
	 * @deprecated use getDiagramUid(DSemanticDiagram) instead
	 */
	@Deprecated
	public static String getDiagramId(DSemanticDiagram diagram) {
		return getDiagramUid(diagram);
	}
	
	/**
	 * 
	 * @param diagram
	 * @return
	 * 
	 * @since 1.2.1
	 */
	public static String getDiagramUid(DSemanticDiagram diagram) {
		return diagram.getUid();
	}	

	public static String getImageLinkFromElement(EObject element, String projectName, String outputFolder) {
		String imageFileName = CapellaLabelProviderHelper.getImageFileName(element, projectName, outputFolder);
		StringBuilder stringBuilder = new StringBuilder();
		return appendRelativePath(element, imageFileName, stringBuilder, "../icon/");
	}
	
	/**
	 * 
	 * @param element
	 * @param projectName
	 * @param outputFolder
	 * @return image tag to be reachable from the index
	 */
	public static String getIndexImageLinkFromElement(EObject element, String projectName, String outputFolder) {
		String imageFileName = CapellaLabelProviderHelper.getImageFileName(element, projectName, outputFolder);
		StringBuilder stringBuilder = new StringBuilder();
		return appendRelativePath(element, imageFileName, stringBuilder, "../../icon/");
	}
	
	private static String appendRelativePath(EObject element, String imageFileName, StringBuilder stringBuilder, String relativePath) {
		stringBuilder.append("<img src=\"");
		stringBuilder.append(relativePath);
		stringBuilder.append(imageFileName);
		stringBuilder.append("\" alt=\"");
		stringBuilder.append(element.eClass().getName());
		stringBuilder.append("\" />");
		return stringBuilder.toString();
	}
	
	/**
	 * Build linkable img HTML tag for exported diagram in generated folder
	 * @param generatedFolder where the diagram file is generated
	 * @param diagram to display
	 * @return valid img HTML tag
	 */
	public static String getImageLinkForDiagram(String generatedFolder, DSemanticDiagram diagram) {
		StringBuilder stringBuilder = new StringBuilder();
		
		String fileName = DocGenHtmlCapellaUtil.getCapellaElementFileName((CapellaElement)diagram.getTarget());
		
		stringBuilder.append(HYPERLINK_OPEN); //$NON-NLS-1$
		stringBuilder.append(fileName);
		stringBuilder.append("#"); //$NON-NLS-1$
		stringBuilder.append(DiagramSessionHelper.getID(diagram));
		stringBuilder.append("\">"); //$NON-NLS-1$
		stringBuilder.append("<img src=\""); //$NON-NLS-1$
		stringBuilder.append(generatedFolder);
		stringBuilder.append("/"); //$NON-NLS-1$
		String validFileName = DocGenHtmlUtil.getValidFileName(DiagramSessionHelper.getID(diagram));
		stringBuilder.append(validFileName);
		stringBuilder.append(".jpg\" alt=\"").append(validFileName).append("\"/>"); //$NON-NLS-1$
		stringBuilder.append("</a>"); //$NON-NLS-1$
		
		return stringBuilder.toString();
	}

	/**
	 * 
	 * @param elt
	 * @return
	 */
	public static String getFullDataPkgHierarchyLink(EObject elt) {
		return getFullDataPkgHierarchyLink(elt, true);
	}

	/**
	 * 
	 * @param elt
	 * @param linkedLastElement
	 *            whether to display a link on the last element of hierarchy.
	 * @return
	 */
	public static String getFullDataPkgHierarchyLink(EObject elt, boolean linkedLastElement) {
		StringBuilder stringBuilder = new StringBuilder();
		for (EObject pkg : getPackageElementPath(elt)) {
			stringBuilder.append(CapellaServices.getHyperlinkFromElement(pkg));
			stringBuilder.append(".");
		}
		if (linkedLastElement)
			stringBuilder.append(CapellaServices.getHyperlinkFromElement(elt));
		else {
			stringBuilder.append(CapellaLabelProviderHelper.getText(elt));
		}
		return stringBuilder.toString();
	}

	/**
	 * 
	 * @param element
	 * @return
	 */
	public static String getElementPath(EObject element) {
		StringBuilder stringBuilder = new StringBuilder();
		Iterator<EObject> iterator = getFullElementPath(element).iterator();
		while (iterator.hasNext()) {
			stringBuilder.append(CapellaServices.getHyperlinkFromElement(iterator.next()));
			if (iterator.hasNext()) {
				stringBuilder.append(" > ");
			}
		}
		return stringBuilder.toString();
	}

	private static List<EObject> getFullElementPath(EObject element) {
		List<EObject> eObjects = new ArrayList<>();
		EObject parent = element.eContainer();
		if (parent instanceof EObject) {
			eObjects.addAll(getFullElementPath(parent));
		}
		eObjects.add(element);
		return eObjects;
	}

	private static List<EObject> getPackageElementPath(EObject element) {
		EObject parent = element.eContainer();
		if (parent instanceof AbstractDependenciesPkg || parent instanceof Classifier) {
			return getPkgTree(parent);
		}
		return Collections.emptyList();
	}

	private static List<EObject> getPkgTree(EObject pkg) {
		List<EObject> pkgs = new ArrayList<>();
		pkgs.add(pkg);
		EObject parent = pkg.eContainer();
		if (parent instanceof AbstractDependenciesPkg) {
			pkgs.addAll(0, getPkgTree(parent));
		}
		return pkgs;
	}

	public static List<EObject> removeDuplicates(List<EObject> list) {
		Set<EObject> set = new HashSet<>(list);
		list.clear();
		list.addAll(set);
		return list;
	}

	public static String buildHyperlinkWithIcon(String projectName, String outputFolder, EObject object) {
		StringBuilder hyperLinkStringBuilder = new StringBuilder();
		hyperLinkStringBuilder.append(getImageLinkFromElement(object, projectName, outputFolder));
		hyperLinkStringBuilder.append(" "); //$NON-NLS-1$
		hyperLinkStringBuilder.append(getHyperlinkFromElement(object));
		return hyperLinkStringBuilder.toString();
	}

	public static String buildNameWithIcon(String projectName, String outputFolder, CapellaElement object) {
		StringBuilder hyperLinkStringBuilder = new StringBuilder();
		hyperLinkStringBuilder.append(getImageLinkFromElement(object, projectName, outputFolder));
		hyperLinkStringBuilder.append(" "); //$NON-NLS-1$
		hyperLinkStringBuilder.append(object.getLabel());
		return hyperLinkStringBuilder.toString();
	}

	/**
	 * Retrieve a DRepresentation target either directly or from the session's contained RepresentationDescritors.
	 * 
	 * @param representation
	 * @return
	 */
	public static EObject getRepresentationTarget(DRepresentation representation) {
		EObject target = ((DSemanticDiagram) representation).getTarget();
		if (target == null) {
			Session session = SessionManager.INSTANCE.getSession(representation);
			Optional<DRepresentationDescriptor> optDesc = DialectManager.INSTANCE.getAllRepresentationDescriptors(session).stream().filter(repDesc -> repDesc.getRepresentation().equals(representation)).findFirst();
			if (optDesc.isPresent()) {
				target = optDesc.get().getTarget();
			}
		}
		if (target == null) {
			// Message is logged as warning without exception to avoid unnecessary overhead
			Logger.logWarning(NLS.bind(Messages.docgenDiagramTargetNull, representation), null);
		}
		return target;
	}

}
