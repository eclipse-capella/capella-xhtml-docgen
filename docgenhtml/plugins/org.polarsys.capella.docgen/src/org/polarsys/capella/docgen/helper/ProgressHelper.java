/*******************************************************************************
 * Copyright (c) 2006, 2020 THALES GLOBAL SERVICES.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales - initial API and implementation
 ******************************************************************************/

package org.polarsys.capella.docgen.helper;

import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.eclipse.sirius.table.metamodel.table.DTable;
import org.eclipse.sirius.viewpoint.DAnalysis;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.DRepresentationDescriptor;
import org.eclipse.sirius.viewpoint.DView;
import org.polarsys.capella.common.ui.toolkit.viewers.data.DataContentProvider;
import org.polarsys.capella.common.ui.toolkit.viewers.data.TreeData;
import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.core.data.capellacore.EnumerationPropertyLiteral;
import org.polarsys.capella.core.data.capellacore.EnumerationPropertyType;
import org.polarsys.capella.core.diagram.helpers.RepresentationAnnotationHelper;
import org.polarsys.capella.core.model.handler.helpers.CapellaProjectHelper;
import org.polarsys.capella.core.ui.metric.utils.ProgressMonitoringPropagator;
import org.polarsys.capella.docgen.util.CapellaLabelProviderHelper;
import org.polarsys.capella.docgen.util.CapellaServices;
import org.polarsys.kitalpha.doc.gen.business.core.scope.GenerationGlobalScope;

/**
 * @author Zendagui Boubekeur
 */
public class ProgressHelper {
	
	private static final DataContentProvider dataProvider = new DataContentProvider();
	private static final String TABLE_ID = "progress-overview-table";
	private String projectName;
	private String outputFolder;
	
	/**
	 * Default constructor. The two parameters are needed for managing the element icons
	 * @param projectName the project wherein the documentation will be generated
	 * @param outputFolder the folder wherein the documentation will be generated
	 */
	public ProgressHelper(String projectName, String outputFolder) {
		this.projectName = projectName;
		this.outputFolder = outputFolder;
	}
	
	/**
	 * Generate the HTML page. This method is the root one.
	 * @param element a model element
	 * @return an HTML table (<code>&lttable&gt ... &lt/table&gt</codes>)
	 */
	public String generateProgressTable(EObject element){
		StringBuffer result = new StringBuffer();
		result.append(generateSearchArea(element));
		result.append("<table id=\"").append(TABLE_ID).append("\">");
		result.append(generateExpandCollapsAction(TABLE_ID));
		result.append(generateTableHeader());
		result.append(generateTableBody(element));
		result.append("</table>");
		result.append(generateCustomStype());
		result.append(getTreeTablePluginIntegration(TABLE_ID));
		result.append(getSearchJavascriptFucntions());
		return result.toString();
	}
	
	/**
	 * Generate the Collapse and Expand all buttons for a given HTML table
	 * @param tableID the ID of the table
	 * @return the section <code>&ltcaption&gt ... &lt/caption&gt</codes> 
	 */
	public String generateExpandCollapsAction(String tableID){
		StringBuffer result = new StringBuffer();
		result.append("<img class=\"cebutton\" src=\"../../img/closed.gif\" alt=\"Collapse all\" onclick=\"jQuery('#progress-overview-table').treetable('expandAll'); return false;\"/>");
		result.append("<img class=\"cebutton\" src=\"../../img/open.gif\" alt=\"Collapse all\" onclick=\"jQuery('#progress-overview-table').treetable('collapseAll'); return false;\"/>");
		return result.toString();
	}
	
	/**
	 * @return The search area HTML code. It contains 3 search criteria, end-user can use to filter table lines
	 */
	public String generateSearchArea(EObject element){
		StringBuffer result = new StringBuffer();
		result.append("<label for=\"filter-object\">Object:</label>");
		result.append("<input class=\"search\" type=\"text\" id=\"filter-object\" onkeyup=\"multiSearch()\" placeholder=\"Search Object by name..\">");
		result.append("<label for=\"filter-status\">Status:</label>");
		result.append("<select class=\"search\" id=\"filter-status\" style=\"min-width:60px\" onchange=\"multiSearch()\">");
		result.append("	<option value=\"\">- All -</option>");
		
		EnumerationPropertyType progressStatus = CapellaProjectHelper.getEnumerationPropertyType(element, CapellaProjectHelper.PROGRESS_STATUS_KEYWORD);
		progressStatus.getOwnedLiterals().forEach( literal -> {
			result.append("	<option value=\"").append(literal.getName()).append("\">").append(literal.getName()).append("</option>");
		});
		result.append("</select>");
		result.append("<label for=\"filter-review\">Review:</label>");
		result.append("<input class=\"search\" type=\"text\" id=\"filter-review\" onkeyup=\"multiSearch()\" placeholder=\"Search in review..\">");
		return result.toString();
	}
	
	public String generateCustomStype(){
		StringBuffer result = new StringBuffer();
		result.append("<style>");
		result.append("	.search {width: 160;height: 30px;border-radius: 3px;border: 1px solid #000000; margin: 15px}");
		result.append("	.search input {width: 120px;padding: 10px 5px;float: left;color: #ccc;border: 0;background: transparent;border-radius: 3px 0 0 3px;}");
		result.append("	.cebutton {width: 20px;padding: 20px 5px;float: right;}");
		result.append("</style>");
		return result.toString();
	}
	
	/**
	 * @param tableID the ID of the table
	 * @return the HTML content allowing the integration of the JQuery scripts
	 */
	public String getTreeTablePluginIntegration(String tableID){
		StringBuffer result = new StringBuffer();
		result.append("<script src=\"../../scripts/jquery-treeview/lib/jquery-1.11.1.js\"></script>");
		result.append("<script src=\"../../scripts/jquery-treetable/jquery.treetable.js\"></script>");
		result.append("<link href=\"../../scripts/jquery-treetable/css/jquery.treetable.css\" rel=\"stylesheet\" type=\"text/css\" />");
		result.append("<link href=\"../../scripts/jquery-treetable/css/jquery.treetable.theme.default.css\" rel=\"stylesheet\" type=\"text/css\" />");
		result.append("<script>");
		result.append("	$(\"#").append(tableID).append("\").treetable({ expandable: true});");
		result.append("	$(\"#").append(tableID).append(" tbody\").on(\"mousedown\", \"tr\", function() {");
		result.append("		$(\".selected\").not(this).removeClass(\"selected\");");
		result.append("		$(this).toggleClass(\"selected\");");
		result.append("	});");
		result.append("</script>");
		return result.toString();
	}
	
	/**
	 * @param tableID the ID of the table
	 * @return the HTML content allowing the integration of the JQuery scripts
	 */
	public String getSearchJavascriptFucntions(){
		StringBuffer result = new StringBuffer();
		result.append("<script>");
		result.append("	function multiSearch() {");
		result.append("		$(\"#progress-overview-table\").treetable(\"expandAll\");");
		result.append("		filterName   = document.getElementById('filter-object').value.toUpperCase();");
		result.append("		filterStatus = document.getElementById('filter-status').value.toUpperCase();");
		result.append("		filterReview = document.getElementById('filter-review').value.toUpperCase();");		
		result.append("		table = document.getElementById(\"progress-overview-table\");");
		result.append("		tr = table.getElementsByTagName(\"tr\");");
		result.append("		for (i = 1; i < tr.length; i++) {");
		result.append("			tdStatus = tr[i].getElementsByTagName(\"td\")[1];");
		result.append("			if (tdStatus) {");
		result.append("				status = tdStatus.textContent || tdStatus.innerText;");
		result.append("				if (filterStatus.toUpperCase().indexOf(status) > -1) {");
		result.append("					doDisplay=true;");
		result.append("				} else {");
		result.append("					if (filterStatus===\"\") {");
		result.append("						doDisplay=true;");
		result.append("					} else {");
		result.append("						doDisplay=false;");
		result.append("					}");
		result.append("				}");
		result.append("			}");
		result.append("			tdObject = tr[i].getElementsByTagName(\"td\")[0];");
		result.append("			if (tdObject) {");
		result.append("				doDisplay = doDisplay && checkValue(tdObject, filterName);");
		result.append("			} ");
		result.append("			tdReview = tr[i].getElementsByTagName(\"td\")[2];");
		result.append("			if (tdObject) {");
		result.append("				doDisplay = doDisplay && checkValue(tdReview, filterReview);");
		result.append("			} 			");
		result.append("			if (doDisplay) {");
		result.append("				tr[i].style.display = \"\";");
		result.append("			} else {");
		result.append("				tr[i].style.display = \"none\";");
		result.append("			}");
		result.append("		}");
		result.append("	}");
		result.append("	function checkValue(td, filter){");
		result.append("		txtValue = td.textContent || td.innerText;");
		result.append("		if (txtValue && txtValue.toUpperCase().indexOf(filter) > -1) {");
		result.append("			return true;");
		result.append("		} else {");
		result.append("			if (filter===\"\") {");
		result.append("				return true;");
		result.append("			} else {");
		result.append("				return false;");
		result.append("			}");
		result.append("		}");
		result.append("	}");
		result.append("</script>");
		return result.toString();
	}
	
	/**
	 * Generate a static table header
	 * @return the section <code>&ltthead&gt ... &lt/thead&gt</code>
	 */
	public String generateTableHeader(){
		StringBuffer result = new StringBuffer();
		result.append("<thead>");
		result.append("<tr>");
		result.append("<th>Object</th>");
		result.append("<th>Status</th>");
		result.append("<th>Review</th>");
		result.append("</tr>");
		result.append("</thead>");
		return result.toString();
	}
	
	/**
	 * Generate the table body
	 * @param element a model element
	 * @return the section <code>&lttbody&gt ... &lt/tbody&gt</code>
	 */
	public String generateTableBody(EObject element){
		StringBuffer result = new StringBuffer();
		List<EObject> allTaggedObjects = ProgressMonitoringPropagator.getInstance().getTaggedObjects(EcoreUtil.getRootContainer(element));
		List<EObject> taggedObjects = allTaggedObjects.stream().filter(eObject -> {
			if (GenerationGlobalScope.getInstance().inScope(eObject, true)){
				return true;
			} else {
				if (eObject instanceof DRepresentationDescriptor) {
					EObject target = ((DRepresentationDescriptor) eObject).getTarget();
					return GenerationGlobalScope.getInstance().inScope(target, true);
				}
				return false;
			}
		}
		).collect(Collectors.toList());
		TreeData treeData = new TreeData(taggedObjects, null);
		dataProvider.inputChanged(null, null, treeData);
		Object[] elements = dataProvider.getElements(element);
		result.append("<tbody>");
		result.append(generateSubElementTableLines(elements, null));
		result.append("</tbody>");
		return result.toString();
	}
	
	/**
	 * Generate a table line for a given element. Because the first column is a tree, each line is considered as a node.
	 * @param elements the model element
	 * @param parentID the ID of parent node of the new node 
	 * @return
	 */
	public String generateSubElementTableLines(Object[] elements, String parentID){
		StringBuffer result = new StringBuffer();
		for (Object element : elements) {
			// generate HTML content for the current element
			result.append(generateElementHtmlLine(element, parentID));
			// generate HTML content for sub-elements
			// Compute the element ID
			String elementID = getID(element);
			String content = generateSubElementTableLines(dataProvider.getChildren(element), elementID);
			result.append(content);
		}
		return result.toString();
	}
	
	/**
	 * @param element
	 * @param parentID if null, this means that the element is the root
	 * @return a set of <code>&lttr&gt ... &lt/tr&gt</code>
	 */
	public String generateElementHtmlLine(Object element, String parentID){
		String[] exportableData = getExportableData(element);
		if (parentID != null && exportableData[0].equals(parentID)) {
			return "";
		}
		StringBuffer result = new StringBuffer();
		result.append("<tr data-tt-id=\"").append(exportableData[0]).append("\"");
		if (parentID != null && ((EObject)element).eContainer() != null) {
			result.append(" data-tt-parent-id=\"").append(parentID).append("\"");
		}
		result.append(">");
		result.append("<td>").append(exportableData[1]).append("</td>");
		result.append("<td>").append(exportableData[2]).append("</td>");
		result.append("<td>").append(exportableData[3]).append("</td>");
		result.append("</tr>");
		return result.toString();
	}
	
	
	/**
	 * Compute necessary data to generate a table line
	 * @param current The element for witch a table line will be generated
	 * @return <p> A String array containing always 4 elements. Empty or null result is equals to an array with 4 empty Strings.</p>
	 * <p>
	 * The result is composed of the following information:
	 * <ul>
	 * <li> An ID</li>
	 * <li> A Label</li>
	 * <li> The element Status</li>
	 * <li> The element review</li>
	 * </ul>
	 * </p>
	 */
	protected String[] getExportableData(Object current) {
		if (current instanceof CapellaElement) {
			CapellaElement ce = (CapellaElement) current;
			return new String[] { 
					getID(ce),
					getLabel(ce), 
					null == ce.getStatus() ? "" : ce.getStatus().getLabel(),
					null == ce.getReview() ? "" : ce.getReview()};
		} else if (current instanceof DRepresentationDescriptor) {
			DRepresentationDescriptor representationDesc = (DRepresentationDescriptor) current;
			DRepresentation dRepresentation = representationDesc.getRepresentation();

			EnumerationPropertyLiteral status = RepresentationAnnotationHelper.getProgressStatus(representationDesc);
			String review = RepresentationAnnotationHelper.getStatusReview(representationDesc);
		
			EObject target = representationDesc.getTarget();
			if (target != null) {
				return new String[] {
						getID(dRepresentation),
						getLabel(dRepresentation),
						null == status ? "" : status.getLabel(),
						null == review ? "" : review};
			}
		}else if (current instanceof DAnalysis || current instanceof DView) {
			return new String[] { getID(current), getLabel(current), "",""};
		} 
			
		return new String[] {"", "", "", ""};
	}
	
	/**
	 * Compute a Label to display. The label is composed of two parts: an icon and a text. 
	 * The text is an HTML link if an HTML page is available for the element  
	 * @param element the Element for which the label is to be computed
	 * @return the element label.
	 */
	private String getLabel(Object element){
		StringBuffer result = new StringBuffer();
		result.append(CapellaServices.getImageLinkFromElement((EObject) element, this.projectName, this.outputFolder));
		result.append(" ");
		if (element instanceof CapellaElement || element instanceof DSemanticDiagram){ 
			result.append(CapellaServices.getHyperlinkFromElement((EObject) element));
		} else if (element instanceof DAnalysis){
			result.append("DAnalysis " + ((DAnalysis) element).getVersion());
		} else if (element instanceof DView){
			result.append("DView");
		} else if (element instanceof DTable){
			result.append(CapellaLabelProviderHelper.getText((EObject)element));
		}
		return result.toString();
	}

	/**
	 * Return the ID of an element
	 * @param current the Element
	 * @return it's ID
	 */
	protected String getID(Object current) {
		if (current instanceof CapellaElement) {
			/** Capella ModelElement ID attribute */
			return ((CapellaElement) current).getId();
		} else if (current instanceof DRepresentation) {
			/** DRepresentation UID attribute */
			return ((DRepresentation) current).getUid();
		} else if (current instanceof DAnalysis){
			/** The version of the DAnalysis. Only one DAnalysis can be displayed
			 *  in the table so there are no conflict on this data */ 
			return ((DAnalysis) current).getVersion();			
		} else if (current instanceof DView){
			/** The name of the Sirius Viewpoint. Each DView is  */
			return ((DView) current).getViewpoint().getName();
		} else if (current instanceof EObject) {
			EObject eElement = (EObject) current;
			/** Trying the use an attribute which name is "id" */ 
			EStructuralFeature idSF = eElement.eClass().getEStructuralFeature("id");
			if (idSF == null) {
				/** Trying the use an ID attribute*/
				idSF = eElement.eClass().getEIDAttribute();
			}
			if (idSF != null) {
				Object id = eElement.eGet(idSF);
				return id != null ? id.toString() : null;
			}
		}
		return null;
	}
}
