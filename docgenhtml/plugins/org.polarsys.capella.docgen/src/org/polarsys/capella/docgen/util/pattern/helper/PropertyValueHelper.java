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

package org.polarsys.capella.docgen.util.pattern.helper;

import java.util.List;
import java.util.stream.Collectors;

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
	
	private PropertyValueHelper() {}
	
	public static String getStringValue(AbstractPropertyValue propertyValue) {
		String value = "";

		if ((propertyValue instanceof EnumerationPropertyValue) && (((EnumerationPropertyValue) propertyValue).getValue() != null)) {
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
		StringBuilder result = new StringBuilder();

		// We get the list of applied and owned PV
		EList<AbstractPropertyValue> appliedList = element.getAppliedPropertyValues();
		EList<AbstractPropertyValue> ownedList = element.getOwnedPropertyValues();

		// We sum up those two lists in one while removing duplication
		EList<AbstractPropertyValue> allPVList = new BasicEList<>();
		
		
		// we check that PVG are stored whithin SystemEngineering model element (to get
		// rid of PVMT definitions stored outside of SystemEngineering)
		allPVList.addAll(appliedList.stream().filter(pv -> isInSystemEngineering(pv) || isInExternalPVPackage(pv)).collect(Collectors.toList()));
		
		// we check that PVG are stored whithin SystemEngineering model element (to get
		// rid of PVMT definitions stored outside of SystemEngineering)
		allPVList.addAll(ownedList.stream().filter(pv -> !allPVList.contains(pv)).filter(pv -> isInSystemEngineering(pv) || isInExternalPVPackage(pv)).collect(Collectors.toList()));
		
		for (AbstractPropertyValue propertyValue : allPVList) {
			String basicname = propertyValue.getName();
			StringBuilder name = new StringBuilder();
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
			if (ownedList.contains(propertyValue)) {
				relation += "Contained";
				if (appliedList.contains(propertyValue)) {
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
		BasicEList<CapellaElement> emptyList = new BasicEList<>();
		return getPVGTable(element, level, projectName, outputFolder, emptyList);
	}

	public static String getPVGTable(CapellaElement element, int level, String projectName, String outputFolder,
			List<CapellaElement> alreadyGeneratedElements) {
		StringBuilder result = new StringBuilder();

		// We get the list of applied and owned PVG
		EList<PropertyValueGroup> appliedGroupList = element.getAppliedPropertyValueGroups();
		EList<PropertyValueGroup> ownedGroupList = element.getOwnedPropertyValueGroups();

		// We sum up those two lists in one while removing duplication
		EList<PropertyValueGroup> allGroupList = new BasicEList<>();
		
		// we check that PVG are stored whithin SystemEngineering model element (to get
		// rid of PVMT definitions stored outside of SystemEngineering)
		allGroupList.addAll(appliedGroupList.stream().filter(group -> isInSystemEngineering(group) || isInExternalPVPackage(group)).collect(Collectors.toList()));
		
		// we check that PVG are stored whithin SystemEngineering model element (to get
		// rid of PVMT definitions stored outside of SystemEngineering)
		allGroupList.addAll(ownedGroupList.stream().filter(group -> !allGroupList.contains(group)).filter(group -> isInSystemEngineering(group) || isInExternalPVPackage(group)).collect(Collectors.toList()));
		
		for (PropertyValueGroup group : allGroupList) {

			// We deal with the Property Value Group itself
			String name = group.getName();
			StringBuilder gname = new StringBuilder();
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
			if (ownedGroupList.contains(group)) {
				grelation += "Contained";
				if (appliedGroupList.contains(group)) {
					grelation += " &amp; Applied";
				}
			} else {
				grelation += "Applied";
			}

			result.append(getPVRow(grelation, gname, gvalue, gdescription));

			alreadyGeneratedElements.add(element);

			if (!alreadyGeneratedElements.contains(group)) {
				// We deal with its owned / applied Property Values
				String tablePV = PropertyValueHelper.getPVTable(group, level + 1, projectName, outputFolder);
				result.append(tablePV);

				// We deal with its owned / applied Property Value Groups
				String tablePVG = PropertyValueHelper.getPVGTable(group, level + 1, projectName, outputFolder,
						alreadyGeneratedElements);
				result.append(tablePVG);
			}
		}
		return result.toString();
	}
	
	public static boolean hasAppliedOrOwnedPropertyValues(CapellaElement element) {
		EList<AbstractPropertyValue> appliedPVList = element.getAppliedPropertyValues();
		EList<PropertyValueGroup> appliedPVGList = element.getAppliedPropertyValueGroups();
		EList<AbstractPropertyValue> ownedPVList = element.getOwnedPropertyValues();
		EList<PropertyValueGroup> ownedPVGList = element.getOwnedPropertyValueGroups();
		return !appliedPVList.isEmpty() || !appliedPVGList.isEmpty() || !ownedPVList.isEmpty() || !ownedPVGList.isEmpty();
	}

	private static String getPVRow(String relation, StringBuilder name, String value, String description) {
		StringBuilder result = new StringBuilder();
		result.append(CapellaServices.TR_OPEN);
		result.append(CapellaServices.TD_OPEN + CapellaServices.ITALIC_BEGIN);
		result.append(relation);
		result.append(CapellaServices.ITALIC_END + CapellaServices.TD_CLOSE);
		result.append(CapellaServices.TD_OPEN);
		result.append(name);
		result.append(CapellaServices.TD_CLOSE);
		result.append(CapellaServices.TD_OPEN);
		result.append(value);
		result.append(CapellaServices.TD_CLOSE);
		result.append(CapellaServices.TD_OPEN);
		result.append(description);
		result.append(CapellaServices.TD_CLOSE);
		result.append(CapellaServices.TR_CLOSE);
		return result.toString();
	}

	private static boolean isInSystemEngineering(EObject elem) {
		EObject container = elem.eContainer();
		if (container != null) {
			return container instanceof SystemEngineering || isInSystemEngineering(container);
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
