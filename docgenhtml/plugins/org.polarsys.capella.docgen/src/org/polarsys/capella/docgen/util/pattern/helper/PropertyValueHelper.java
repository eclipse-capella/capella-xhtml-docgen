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

package org.polarsys.capella.docgen.util.pattern.helper;

import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.core.data.capellacore.AbstractPropertyValue;
import org.polarsys.capella.core.data.capellacore.BooleanPropertyValue;
import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.core.data.capellacore.EnumerationPropertyValue;
import org.polarsys.capella.core.data.capellacore.FloatPropertyValue;
import org.polarsys.capella.core.data.capellacore.IntegerPropertyValue;
import org.polarsys.capella.core.data.capellacore.PropertyValueGroup;
import org.polarsys.capella.core.data.capellacore.PropertyValuePkg;
import org.polarsys.capella.core.data.capellacore.StringPropertyValue;
import org.polarsys.capella.core.data.capellamodeller.Project;
import org.polarsys.capella.core.data.capellamodeller.SystemEngineering;
import org.polarsys.capella.docgen.util.CapellaServices;
import org.polarsys.capella.docgen.util.StringUtil;

public class PropertyValueHelper {
	public static String getStringValue(AbstractPropertyValue propertyValue) {
		String value = "";

		if (propertyValue instanceof EnumerationPropertyValue) {
			if (((EnumerationPropertyValue) propertyValue).getValue() != null)
				value = ((EnumerationPropertyValue) propertyValue).getValue().getName();
		}

		if (propertyValue instanceof BooleanPropertyValue)
			value = (((BooleanPropertyValue) propertyValue).isValue() ? "True" : "False");

		if (propertyValue instanceof StringPropertyValue)
			value = ((StringPropertyValue) propertyValue).getValue();

		if (propertyValue instanceof IntegerPropertyValue)
			value = Integer.toString(((IntegerPropertyValue) propertyValue).getValue());

		if (propertyValue instanceof FloatPropertyValue)
			value = Float.toString(((FloatPropertyValue) propertyValue).getValue());

		return value;
	}

	public static String getPVTable(CapellaElement element, int level, String projectName, String outputFolder) {
		StringBuffer result = new StringBuffer();

		// We get the list of applied and owned PV
		EList<AbstractPropertyValue> applied_list = element.getAppliedPropertyValues();
		EList<AbstractPropertyValue> owned_list = element.getOwnedPropertyValues();

		// We sum up those two lists in one while removing duplication
		EList<AbstractPropertyValue> allpv_list = new BasicEList<AbstractPropertyValue>();
		for (AbstractPropertyValue pv : applied_list) {
			// we check that PV are stored whithin SystemEngineering model element (to get
			// rid of PVMT definitions stored outside of SystemEngineering)
			if (isInSystemEngineering(pv)) {
				allpv_list.add(pv);
			} else if (isInExternalPVPackage(element)) {
				allpv_list.add(pv);
			}
		}
		for (AbstractPropertyValue pv : owned_list) {
			if (!allpv_list.contains(pv)) {
				// we check that PV are stored whithin SystemEngineering model element (to get
				// rid of PVMT definitions stored outside of SystemEngineering)
				if (isInSystemEngineering(pv)) {
					allpv_list.add(pv);
				} else if (isInExternalPVPackage(element)) {
					allpv_list.add(pv);
				}
			}
		}

		for (AbstractPropertyValue propertyValue : allpv_list) {
			String basicname = propertyValue.getName();
			StringBuffer name = new StringBuffer();
			for (int i = 0; i < level; i++) {
				name.append("&emsp;");
			}
			name.append(CapellaServices.getImageLinkFromElement(propertyValue, projectName, outputFolder));
			name.append(" ");
			name.append(basicname);
			String value = PropertyValueHelper.getStringValue(propertyValue);
			String description = propertyValue.getDescription();
			description = StringUtil.transformAREFString(propertyValue, description, projectName, outputFolder);

			String relation = "";
			if (owned_list.contains(propertyValue)) {
				relation += "Contained";
				if (applied_list.contains(propertyValue)) {
					relation += " &amp; Applied";
				}
			} else {
				relation += "Applied";
			}

			result.append(getPVRow(relation, name, value, description));
		}
		return result.toString();
	}

	public static String getPVGTable(CapellaElement element, int level, String projectName, String outputFolder) {
		BasicEList<CapellaElement> emptyList = new BasicEList<CapellaElement>();
		return getPVGTable(element, level, projectName, outputFolder, emptyList);
	}

	public static String getPVGTable(CapellaElement element, int level, String projectName, String outputFolder,
			List<CapellaElement> alreadyGeneratedElements) {
		StringBuffer result = new StringBuffer();

		// We get the list of applied and owned PVG
		EList<PropertyValueGroup> appliedgroup_list = element.getAppliedPropertyValueGroups();
		EList<PropertyValueGroup> ownedgroup_list = element.getOwnedPropertyValueGroups();

		// We sum up those two lists in one while removing duplication
		EList<PropertyValueGroup> allgroup_list = new BasicEList<PropertyValueGroup>();
		for (PropertyValueGroup group : appliedgroup_list) {
			// we check that PVG are stored whithin SystemEngineering model element (to get
			// rid of PVMT definitions stored outside of SystemEngineering)
			if (isInSystemEngineering(group)) {
				allgroup_list.add(group);
			} else if (isInExternalPVPackage(element)) {
				allgroup_list.add(group);
			}
		}
		for (PropertyValueGroup group : ownedgroup_list) {
			if (!allgroup_list.contains(group)) {
				// we check that PVG are stored whithin SystemEngineering model element (to get
				// rid of PVMT definitions stored outside of SystemEngineering)
				if (isInSystemEngineering(group)) {
					allgroup_list.add(group);
				} else if (isInExternalPVPackage(element)) {
					allgroup_list.add(group);
				}
			}
		}

		for (PropertyValueGroup group : allgroup_list) {

			// We deal with the Property Value Group itself
			String name = group.getName();
			StringBuffer gname = new StringBuffer();
			for (int i = 0; i < level; i++) {
				gname.append("&emsp;");
			}
			gname.append(CapellaServices.getImageLinkFromElement(group, projectName, outputFolder));
			gname.append(" ");
			gname.append(name);
			String gvalue = "";
			String gdescription = group.getDescription();
			gdescription = StringUtil.transformAREFString(group, gdescription, projectName, outputFolder);

			String grelation = "";
			if (ownedgroup_list.contains(group)) {
				grelation += "Contained";
				if (appliedgroup_list.contains(group)) {
					grelation += " &amp; Applied";
				}
			} else {
				grelation += "Applied";
			}

			result.append(getPVRow(grelation, gname, gvalue, gdescription));

			alreadyGeneratedElements.add(element);

			CapellaElement subelement = (CapellaElement) group;
			if (!alreadyGeneratedElements.contains(subelement)) {
				// We deal with its owned / applied Property Values
				String tablePV = PropertyValueHelper.getPVTable(subelement, level + 1, projectName, outputFolder);
				result.append(tablePV);

				// We deal with its owned / applied Property Value Groups
				String tablePVG = PropertyValueHelper.getPVGTable(subelement, level + 1, projectName, outputFolder,
						alreadyGeneratedElements);
				result.append(tablePVG);
			}
		}
		return result.toString();
	}

	private static String getPVRow(String relation, StringBuffer name, String value, String description) {
		StringBuffer result = new StringBuffer();
		result.append("<tr>");
		result.append("<td><i>");
		result.append(relation);
		result.append("</i></td>");
		result.append("<td>");
		result.append(name);
		result.append("</td>");
		result.append("<td>");
		result.append(value);
		result.append("</td>");
		result.append("<td>");
		result.append(description);
		result.append("</td>");
		result.append("</tr>");
		return result.toString();
	}

	private static boolean isInSystemEngineering(EObject elem) {
		EObject container = elem.eContainer();
		if (container != null) {
			return container instanceof SystemEngineering ? true : isInSystemEngineering(container);
		}
		return false;
	}

	/**
	 * Checks if {@code elem} containment hierarchy is only made of
	 * {@link AbstractPropertyValue}, {@link PropertyValueGroup}, {@link PropertyValuePkg} or {@link Project}
	 * elements.
	 * 
	 * @param pv
	 * @return
	 */
	private static boolean isInExternalPVPackage(EObject elem) {
		if (elem.eContainer() != null) {
			if (elem.eContainer() instanceof AbstractPropertyValue || elem.eContainer() instanceof PropertyValueGroup || elem.eContainer() instanceof PropertyValuePkg) {
				// Check one step up
				return isInExternalPVPackage(elem.eContainer());
			} else if (elem.eContainer() instanceof Project){
				return true;
			}
		}
		return false;
	}
}
