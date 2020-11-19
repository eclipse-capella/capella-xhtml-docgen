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

import org.polarsys.capella.core.data.information.ExchangeItemElement;
import org.polarsys.capella.core.data.information.ParameterDirection;
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
}
