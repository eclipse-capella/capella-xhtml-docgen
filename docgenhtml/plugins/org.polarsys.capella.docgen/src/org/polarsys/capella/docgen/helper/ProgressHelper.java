package org.polarsys.capella.docgen.helper;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.eclipse.sirius.table.metamodel.table.DTable;
import org.eclipse.sirius.viewpoint.DAnalysis;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.DRepresentationDescriptor;
import org.eclipse.sirius.viewpoint.DView;
import org.eclipse.sirius.viewpoint.description.DAnnotation;
import org.polarsys.capella.common.ui.toolkit.viewers.data.DataContentProvider;
import org.polarsys.capella.common.ui.toolkit.viewers.data.TreeData;
import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.core.model.handler.helpers.RepresentationHelper;
import org.polarsys.capella.core.ui.metric.utils.ProgressMonitoringPropagator;
import org.polarsys.capella.core.ui.metric.utils.Utils;
import org.polarsys.capella.core.ui.properties.annotations.IRepresentationAnnotationConstants;
import org.polarsys.capella.docgen.util.CapellaServices;
import org.polarsys.kitalpha.doc.gen.business.core.util.LabelProviderHelper;

public class ProgressHelper {
	
	private static final DataContentProvider dataProvider = new DataContentProvider();
	private static final String TABLE_ID = "progress-overview-table";
	private String projectName;
	private String outputFolder;
	
	public ProgressHelper(String projectName, String outputFolder) {
		this.projectName = projectName;
		this.outputFolder = outputFolder;
	}
	
	public String generateProgressTable(EObject element){
		StringBuffer result = new StringBuffer();
		result.append("<table id=\"").append(TABLE_ID).append("\">");
		result.append(generateExpandCollapsAction(TABLE_ID));
		result.append(generateTableHeader(element));
		result.append(generateTableBody(element));
		result.append("</table>");
		result.append(getPluginIntegration(TABLE_ID));
		return result.toString();
	}
	
	public String generateExpandCollapsAction(String tableID){
		StringBuffer result = new StringBuffer();
		result.append("<caption>");
		result.append("  <a href=\"#\" onclick=\"jQuery('#")
			  .append(tableID)
			  .append("').treetable('expandAll'); return false;\"><img src=\"../../img/closed.gif\" alt=\"Collapse all\"/></a>");
		result.append("  <a href=\"#\" onclick=\"jQuery('#")
			  .append(tableID)
			  .append("').treetable('collapseAll'); return false;\"><img src=\"../../img/open.gif\" alt=\"Collapse all\"/></a>");
		result.append("</caption>");
		return result.toString();
	}
	
	public String getPluginIntegration(String tableID){
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
	
	public String generateTableHeader(EObject element){
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
	
	public String generateTableBody(EObject element){
		StringBuffer result = new StringBuffer();
		List<EObject> taggedObjects = ProgressMonitoringPropagator.getInstance().getTaggedObjects(EcoreUtil.getRootContainer(element));
		TreeData treeData = new TreeData(taggedObjects, null);
		dataProvider.inputChanged(null, null, treeData);
		Object[] elements = dataProvider.getElements(element);
		result.append("<tbody>");
		result.append(generateSubElementTableLines(elements, null));
		result.append("</tbody>");
		return result.toString();
	}
	
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
	 * 
	 * @param element
	 * @param parentID if null, this means that the element is the root
	 * @return
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
			DAnnotation dAnnotationStatus= RepresentationHelper.getAnnotation(IRepresentationAnnotationConstants.ProgressStatus, dRepresentation);
			DAnnotation dAnnotationReview= RepresentationHelper.getAnnotation(IRepresentationAnnotationConstants.StatusReview, dRepresentation);
			
			EObject target = Utils.getTarget(dRepresentation);
			if (target != null) {
				return new String[] {
						getID(dRepresentation),
						getLabel(dRepresentation),
						null == dAnnotationStatus ? "" : dAnnotationStatus.getDetails().get("value"),
						null == dAnnotationReview ? "" : dAnnotationReview.getDetails().get("value")};
			}
		}else if (current instanceof DAnalysis || current instanceof DView) {
			return new String[] { getID(current), getLabel(current), "",""};
		} 
			
		return new String[] {"", "", "", ""};
	}
	
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
			result.append(LabelProviderHelper.getText((EObject)element));
		}
		return result.toString();
	}

	protected String getID(Object current) {
		if (current instanceof CapellaElement) {
			CapellaElement ce = (CapellaElement) current;
			return ce.getId();
		} else if (current instanceof DRepresentation) {
			return ((DRepresentation) current).getUid();
		} else if (current instanceof DAnalysis){
			return ((DAnalysis) current).getVersion();
		} else if (current instanceof DView){
			return ((DView) current).getViewpoint().getName();
		} else if (current instanceof EObject) {
			EObject eElement = (EObject) current;
			EStructuralFeature idSF = eElement.eClass().getEStructuralFeature("id");
			if (idSF == null) {
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
