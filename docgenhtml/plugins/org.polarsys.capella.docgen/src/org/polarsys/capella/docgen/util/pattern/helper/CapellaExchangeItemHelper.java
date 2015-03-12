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
package org.polarsys.capella.docgen.util.pattern.helper;

import java.util.ArrayList;
import java.util.Collection;

import org.polarsys.capella.core.data.cs.ExchangeItemAllocation;
import org.polarsys.capella.core.data.cs.Interface;
import org.polarsys.capella.core.data.helpers.information.services.ExchangeItemExt;
import org.polarsys.capella.core.data.information.ExchangeItem;
import org.polarsys.capella.core.data.information.ExchangeItemElement;
import org.polarsys.capella.docgen.util.CapellaServices;

public class CapellaExchangeItemHelper {

	/**
	 * 
	 * @param exchangeItem
	 * @param projectName
	 * @param outputFolder
	 * @return
	 */
	public static Collection<String> getExchangeItemElements(ExchangeItem exchangeItem, String projectName, String outputFolder) {
		Collection<String> ret = new ArrayList<String>();

		for (ExchangeItemElement exchangeItemElement : exchangeItem.getOwnedElements()) {
			ret.add(CapellaExchangeItemElementHelper.exchangeItemElementToString(exchangeItemElement, projectName, outputFolder));
		}
		return ret;
	}

	public static Collection<String> getExchangeItemInterfaces(ExchangeItem exchangeItem, String projectName, String outputFolder) {
		Collection<String> ret = new ArrayList<String>();
		for (ExchangeItemAllocation allocation : ExchangeItemExt.getRelatedExchangeItemAllocations(exchangeItem)) {
			StringBuffer buffer = new StringBuffer();
			Interface interface1 = allocation.getAllocatingInterface();
			buffer.append(CapellaServices.getImageLinkFromElement(interface1, projectName, outputFolder));
			buffer.append(" ");
			buffer.append(CapellaServices.getHyperlinkFromElement(interface1));
			allocation.getAllocatingInterface();
			ret.add(buffer.toString());
		}
		return ret;
	}
}
