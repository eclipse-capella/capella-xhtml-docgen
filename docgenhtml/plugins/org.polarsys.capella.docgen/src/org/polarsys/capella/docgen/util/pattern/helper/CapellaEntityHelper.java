/*******************************************************************************
 * Copyright (c) 2006, 2019 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales - initial API and implementation
 ******************************************************************************/
package org.polarsys.capella.docgen.util.pattern.helper;

import java.util.ArrayList;
import java.util.Collection;

import org.polarsys.capella.core.data.fa.FunctionalExchange;
import org.polarsys.capella.core.data.oa.CommunicationMean;
import org.polarsys.capella.core.data.oa.Entity;
import org.polarsys.capella.common.data.modellingcore.AbstractInformationFlow;
import org.polarsys.capella.common.data.modellingcore.InformationsExchanger;
import org.polarsys.capella.docgen.util.CapellaServices;
import org.polarsys.capella.docgen.util.StringUtil;

public class CapellaEntityHelper {

	public static Collection<String> getIncomingCommunicationMeansLines(Entity entity, String projectName, String outputFolder) {
		Collection<String> ret = new ArrayList<String>();

		for (AbstractInformationFlow informationFlow : entity.getIncomingInformationFlows()) {
			if (informationFlow instanceof CommunicationMean) {
				CommunicationMean communicationMean = (CommunicationMean) informationFlow;
				ret.add(communicationMeanToTableLine(projectName, outputFolder, communicationMean, false));
			}
		}

		return ret;
	}

	public static Collection<String> getOutgoingCommunicationMeansLines(Entity entity, String projectName, String outputFolder) {
		Collection<String> ret = new ArrayList<String>();

		for (AbstractInformationFlow informationFlow : entity.getOutgoingInformationFlows()) {
			if (informationFlow instanceof CommunicationMean) {
				CommunicationMean communicationMean = (CommunicationMean) informationFlow;
				ret.add(communicationMeanToTableLine(projectName, outputFolder, communicationMean, true));
			}
		}

		return ret;
	}

	private static String communicationMeanToTableLine(String projectName, String outputFolder, CommunicationMean communicationMean, boolean isOut) {
		StringBuffer buffer = new StringBuffer();
		buffer.append("<tr>");
		buffer.append("<td id=\"" + CapellaServices.getAnchorId(communicationMean) + "\">");
		buffer.append(CapellaServices.getImageLinkFromElement(communicationMean, projectName, outputFolder));
		buffer.append(" ");
		buffer.append(CapellaServices.getHyperlinkFromElement(communicationMean));
		buffer.append("</td>");
		buffer.append("<td>");
		InformationsExchanger informationsExchanger;
		if (isOut)
			informationsExchanger = communicationMean.getTarget();

		else
			informationsExchanger = communicationMean.getSource();
		buffer.append(CapellaServices.getImageLinkFromElement(informationsExchanger, projectName, outputFolder));
		buffer.append("&nbsp;");
		buffer.append(CapellaServices.getHyperlinkFromElement(informationsExchanger));
		buffer.append("</td>");
		buffer.append("<td>");
		buffer.append(StringUtil.transformAREFString(communicationMean, communicationMean.getDescription(), projectName, outputFolder));
		buffer.append("</td>");
		buffer.append("<td>");
		Collection<String> functionalExchanges = getFunctionalExchanges(communicationMean, projectName, outputFolder);
		if (functionalExchanges.size() > 0)
			buffer.append(StringUtil.stringListToBulette(functionalExchanges));
		buffer.append("</td>");
		buffer.append("</tr>");
		return buffer.toString();
	}

	private static Collection<String> getFunctionalExchanges(CommunicationMean communicationMean, String projectName, String outputFolder) {
		Collection<String> ret = new ArrayList<String>();

		for (FunctionalExchange functionalExchange : communicationMean.getAllocatedFunctionalExchanges()) {
			StringBuffer buffer = new StringBuffer();
			buffer.append(CapellaServices.getImageLinkFromElement(functionalExchange, projectName, outputFolder));
			buffer.append("&nbsp;");
			buffer.append(CapellaServices.getHyperlinkFromElement(functionalExchange));
			ret.add(buffer.toString());
		}
		return ret;
	}
}
