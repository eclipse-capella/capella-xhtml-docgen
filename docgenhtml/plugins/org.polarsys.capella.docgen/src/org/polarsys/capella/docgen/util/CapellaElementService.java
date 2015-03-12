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

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.polarsys.capella.core.data.ctx.SystemAnalysis;
import org.polarsys.capella.core.data.capellacore.AbstractPropertyValue;
import org.polarsys.capella.core.data.capellacore.Allocation;
import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.core.data.requirement.Requirement;
import org.polarsys.capella.core.model.utils.CapellaLayerCheckingExt;
import org.polarsys.capella.common.data.modellingcore.AbstractTrace;
import org.polarsys.capella.common.data.modellingcore.TraceableElement;

public class CapellaElementService {

	/**
	 * <b>Get the property Value of a Element</b>
	 * <p>
	 * Get the information o all property values of a Element
	 * 
	 * @param eObject_p
	 * @return
	 */
	public static List<String> getPropertiesValue(EObject eObject_p, String projectName, String outputFolder) {
		// Create the list to return
		List<String> ret = new ArrayList<String>();

		// If the Object is a Class
		if (eObject_p instanceof CapellaElement) {
			// For each properties of the Class
			for (AbstractPropertyValue prop : ((CapellaElement) eObject_p).getOwnedPropertyValues()) {
				// Add the information of the property to the list
				ret.add(CapellaPropertyServices.getPropertyValueInformation(prop, projectName, outputFolder));
			}
		}
		return ret;
	}

	/**
	 * 
	 * @param element
	 * @param projectName
	 * @param outputFolder
	 * @return
	 */
	public static Collection<String> getRequirementsToLine(CapellaElement element, String projectName, String outputFolder) {
		Collection<String> ret = new ArrayList<String>();
		for (AbstractTrace trace : element.getOutgoingTraces()) {
			TraceableElement targetElement = trace.getTargetElement();
			if (targetElement instanceof Requirement) {
				Requirement requirement = (Requirement) targetElement;
				StringBuffer buffer = new StringBuffer();
				buffer.append("<tr>");

				buffer.append("<td>");
				buffer.append(CapellaServices.getImageLinkFromElement(requirement, projectName, outputFolder));
				buffer.append(" ");
				buffer.append(CapellaServices.HYPERLINK_OPEN);
				buffer.append(CapellaServices.getPathFromElement(requirement));
				buffer.append(CapellaServices.HYPERLINK_COMPLETE);
				buffer.append(requirement.getRequirementId());
				buffer.append(CapellaServices.HYPERLINK_CLOSE);
				buffer.append("</td>");

				buffer.append("<td>");
				buffer.append(requirement.getName());
				buffer.append("</td>");

				buffer.append("<td>");
				buffer.append(StringUtil.transformAREFString(requirement, requirement.getDescription(), projectName, outputFolder));
				buffer.append("</td>");

				buffer.append("</tr>");

				ret.add(buffer.toString());
			}
		}
		return ret;
	}

	public static Collection<String> getOutGoingAllocation(CapellaElement element, String projectName, String outputFolder) {
		Collection<String> ret = new ArrayList<String>();
		for (AbstractTrace currentAbstractTrace : element.getOutgoingTraces()) {
			if (currentAbstractTrace instanceof Allocation && isSuperLayer(element, ((Allocation) currentAbstractTrace).getTargetElement())) {

				StringBuffer buffer = new StringBuffer();
				TraceableElement traceableElement = ((Allocation) currentAbstractTrace).getTargetElement();
				if (traceableElement != null) {
					buffer.append(CapellaServices.getImageLinkFromElement(traceableElement, projectName, outputFolder));
					buffer.append(" ");
					buffer.append(CapellaServices.getHyperlinkFromElement(traceableElement));
				}
				ret.add(buffer.toString());
			}
		}
		return ret;
	}

	public static Collection<String> getIncomingAllocation(CapellaElement element, String projectName, String outputFolder) {
		Collection<String> ret = new ArrayList<String>();
		for (AbstractTrace currentAbstractTrace : element.getIncomingTraces()) {
			if (currentAbstractTrace instanceof Allocation && isLowerLayer(element, ((Allocation) currentAbstractTrace).getSourceElement())) {
				StringBuffer buffer = new StringBuffer();
				TraceableElement traceableElement = ((Allocation) currentAbstractTrace).getSourceElement();
				if (traceableElement != null) {
					buffer.append(CapellaServices.getImageLinkFromElement(traceableElement, projectName, outputFolder));
					buffer.append(" ");
					buffer.append(CapellaServices.getHyperlinkFromElement(traceableElement));
				}
				ret.add(buffer.toString());
			}
		}
		return ret;
	}

	private static boolean isLowerLayer(CapellaElement targetElement, TraceableElement sourceElement) {
		if (sourceElement instanceof CapellaElement) {
			CapellaElement sourceCapellaElement = (CapellaElement) sourceElement;
			if (CapellaLayerCheckingExt.isInEPBSLayer(sourceCapellaElement)) {
				return false;
			}
			if (CapellaLayerCheckingExt.isInPhysicalLayer(targetElement)) {
				return CapellaLayerCheckingExt.isInEPBSLayer(sourceCapellaElement);
			}
			if (CapellaLayerCheckingExt.isInLogicalLayer(targetElement)) {
				return CapellaLayerCheckingExt.isInPhysicalLayer(sourceCapellaElement);
			}

			if (isInSystemAnalysis(targetElement)) {
				return CapellaLayerCheckingExt.isInLogicalLayer(sourceCapellaElement);
			}
			if (CapellaLayerCheckingExt.isInOperationalAnalysisLayer(targetElement)) {
				return isInSystemAnalysis(sourceCapellaElement);
			}
		}
		return false;
	}

	/**
	 * This method evaluates if a ele_p is in Logical Layer or not.
	 * 
	 * @param ele_p
	 * @return 'true' if in system analysis Layer , 'false' if not
	 */
	public static boolean isInSystemAnalysis(CapellaElement ele_p) {

		ArrayList<CapellaElement> meleList = new ArrayList<CapellaElement>(0);
		CapellaLayerCheckingExt.getAll_ContainerElements(ele_p, meleList);
		meleList.add(ele_p);
		for (CapellaElement element : meleList) {
			if (element instanceof SystemAnalysis) {
				return true;
			}
		}

		return false;
	}

	private static boolean isSuperLayer(CapellaElement element, TraceableElement targetElement) {
		if (targetElement instanceof CapellaElement) {
			CapellaElement targetCapellaElement = (CapellaElement) targetElement;
			if (CapellaLayerCheckingExt.isInEPBSLayer(element)) {
				return !CapellaLayerCheckingExt.isInEPBSLayer(targetCapellaElement);
			} else if (CapellaLayerCheckingExt.isInPhysicalLayer(element)) {
				return !CapellaLayerCheckingExt.isInEPBSLayer(targetCapellaElement) && !CapellaLayerCheckingExt.isInPhysicalLayer(targetCapellaElement);
			} else if (CapellaLayerCheckingExt.isInLogicalLayer(element)) {
				return CapellaLayerCheckingExt.isInContextLayer(targetCapellaElement) || CapellaLayerCheckingExt.isInOperationalAnalysisLayer(targetCapellaElement);
			} else if (CapellaLayerCheckingExt.isInContextLayer(element)) {
				return CapellaLayerCheckingExt.isInOperationalAnalysisLayer(targetCapellaElement);
			}
		}
		return false;
	}
}
