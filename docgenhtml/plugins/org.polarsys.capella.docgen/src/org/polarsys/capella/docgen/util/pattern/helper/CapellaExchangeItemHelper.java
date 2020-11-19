/*******************************************************************************
 * Copyright (c) 2006, 2019 THALES GLOBAL SERVICES.
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

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.polarsys.capella.core.data.capellacore.Involvement;
import org.polarsys.capella.core.data.cs.ExchangeItemAllocation;
import org.polarsys.capella.core.data.cs.Interface;
import org.polarsys.capella.core.data.fa.FunctionalChain;
import org.polarsys.capella.core.data.fa.FunctionalChainInvolvement;
import org.polarsys.capella.core.data.fa.FunctionalChainInvolvementLink;
import org.polarsys.capella.core.data.fa.FunctionalExchange;
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
	
	public static Collection<String> getReferencingFunctionalExchanges(ExchangeItem exchangeItem, String projectName,
		    String outputFolder) {
			Collection<String> referencingFunctionalExchanges = new ArrayList<String>();
			EObject root = EcoreUtil.getRootContainer(exchangeItem);
			TreeIterator<EObject> it = root.eAllContents();
			while (it.hasNext()) {
				EObject object = it.next();
				if (object instanceof FunctionalExchange) {
					FunctionalExchange exchange = (FunctionalExchange) object;
					EList<ExchangeItem> referencedItems = exchange.getExchangedItems();
					if (referencedItems.contains(exchangeItem)) {
						referencingFunctionalExchanges
						    .add(CapellaServices.buildHyperlinkWithIcon(projectName, outputFolder, exchange));
					}
				}
			}

			return referencingFunctionalExchanges;
		}


	public static Collection<String> getInvolvingFunctionalChains(ExchangeItem exchangeItem, String projectName,
		    String outputFolder) {
			Collection<FunctionalChain> referencingFunctionalChains = new ArrayList<FunctionalChain>();
			Collection<String> referencingFunctionalChainsStrings = new ArrayList<String>();

			EObject root = EcoreUtil.getRootContainer(exchangeItem);
			TreeIterator<EObject> it = root.eAllContents();
			while (it.hasNext()) {
				EObject object = it.next();
				if (object instanceof FunctionalChain) {
					FunctionalChain functionalChain = (FunctionalChain) object;
					for (Involvement involvment : functionalChain.getInvolvedInvolvements()) {
						if (involvment instanceof FunctionalChainInvolvementLink) {
							EList<ExchangeItem> referencedItems = ((FunctionalChainInvolvementLink) involvment).getExchangedItems();
							if (referencedItems.contains(exchangeItem) && !referencingFunctionalChains.contains(functionalChain)) {
								referencingFunctionalChainsStrings
								    .add(CapellaServices.buildHyperlinkWithIcon(projectName, outputFolder, functionalChain));
								referencingFunctionalChains.add(functionalChain);
							}
						}
					}
				}
			}

			return referencingFunctionalChainsStrings;
		}
}
