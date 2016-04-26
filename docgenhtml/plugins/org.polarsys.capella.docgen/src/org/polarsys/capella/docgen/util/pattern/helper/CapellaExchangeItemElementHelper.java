/*******************************************************************************
 * Copyright (c) 2006, 2016 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales - initial API and implementation
 ******************************************************************************/
package org.polarsys.capella.docgen.util.pattern.helper;

import org.eclipse.emf.common.util.EList;
import org.polarsys.capella.core.data.information.ExchangeItemElement;
import org.polarsys.capella.core.data.information.ParameterDirection;
import org.polarsys.capella.core.data.information.Property;
import org.polarsys.capella.docgen.util.CapellaDataValueServices;
import org.polarsys.capella.docgen.util.CapellaPropertyServices;
import org.polarsys.capella.docgen.util.CapellaServices;
import org.polarsys.capella.docgen.util.StringUtil;

public class CapellaExchangeItemElementHelper {

	public static String exchangeItemElementToString(ExchangeItemElement exItemElt, String projectName, String outputFolder) {
		StringBuffer buffer = new StringBuffer();
		buffer.append(CapellaServices.getImageLinkFromElement(exItemElt, projectName, outputFolder));
		buffer.append(CapellaServices.SPACE);
		buffer.append(CapellaServices.BOLD_BEGIN);
		if (exItemElt.getDirection().equals(ParameterDirection.RETURN)) {
			buffer.append("RETURN ");
		}

		if (exItemElt.isComposite()) {
			buffer.append("{ref}");
		}
		buffer.append(exItemElt.getName());

		buffer.append(CapellaServices.CRO_OPEN);
		buffer.append(CapellaDataValueServices.getSimpleValueOfDataValue(exItemElt.getOwnedMaxCard()));
		buffer.append(",");
		buffer.append(CapellaDataValueServices.getSimpleValueOfDataValue(exItemElt.getOwnedMinCard()));
		buffer.append(CapellaServices.CRO_CLOSE);
		String referencedProperties = generateReferencedProperties(exItemElt, projectName, outputFolder);
		if (! referencedProperties.isEmpty())
		{
			buffer.append(referencedProperties);
		}
		buffer.append(CapellaServices.BOLD_END);
		
		buffer.append(CapellaServices.VALUE_PRESENTER);
		if (exItemElt.getAbstractType() != null) {
			buffer.append(CapellaServices.getFullDataPkgHierarchyLink(exItemElt.getAbstractType()));
		}

		// description and summary
		if (exItemElt.getSummary() != null && exItemElt.getSummary().length() > 0) {
			buffer.append("\n<br />");
			buffer.append(exItemElt.getSummary());
		}

		if (exItemElt.getDescription() != null && exItemElt.getDescription().length() > 0) {
			buffer.append("\n<br />");
			buffer.append(StringUtil.transformAREFString(exItemElt, exItemElt.getDescription(), projectName, outputFolder));
		}

		String propertyValues = CapellaPropertyServices.getPropertyValues(exItemElt.getOwnedPropertyValues(), projectName, outputFolder);
		if (propertyValues != null && propertyValues.length() > 0) {
			buffer.append(CapellaServices.UL_OPEN);
			buffer.append(propertyValues);
			buffer.append(CapellaServices.UL_CLOSE);
		}

		return buffer.toString();
	}
	
	private static String generateReferencedProperties(ExchangeItemElement exItemElt, String projectName, String outputFolder){
		StringBuffer buffer = new StringBuffer();
		EList<Property> referencedProperties = exItemElt.getReferencedProperties();
		if (! referencedProperties.isEmpty())
		{
			buffer.append("{");
			for (Property property : referencedProperties) 
			{
				String propertyName = property.getName();
				String propertyLink = CapellaServices.getHyperlinkFromElement(property, propertyName);
				buffer.append(propertyLink);
				if (referencedProperties.indexOf(property) != referencedProperties.size() -1)
				{
					buffer.append(", ");
				}
			}
			buffer.append("}");
		}
		
		return buffer.toString();
	}
}
