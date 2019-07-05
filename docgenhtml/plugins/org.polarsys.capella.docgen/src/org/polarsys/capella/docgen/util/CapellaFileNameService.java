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
package org.polarsys.capella.docgen.util;

import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.core.data.cs.ExchangeItemAllocation;
import org.polarsys.capella.core.data.fa.ComponentExchange;
import org.polarsys.capella.core.data.fa.FunctionalExchange;
import org.polarsys.capella.core.data.helpers.fa.services.FunctionExt;
import org.polarsys.capella.core.data.oa.CommunicationMean;
import org.polarsys.capella.core.model.helpers.ComponentExchangeExt;
import org.polarsys.kitalpha.doc.gen.business.core.util.DocGenHtmlUtil;
import org.polarsys.kitalpha.doc.gen.business.core.util.IFileNameService;

public class CapellaFileNameService implements IFileNameService {

	public String getFileName(EObject eObject) {
		EObject element;
		element = eObject;
		if (CapellaServices.isLinkable(eObject) == 1) {
			if (eObject instanceof ExchangeItemAllocation) {
				element = ((ExchangeItemAllocation) eObject).getAllocatingInterface();
			} else if (eObject instanceof CommunicationMean) {
				element = ((CommunicationMean) eObject).getSource();
			} else if (eObject instanceof ComponentExchange) {
				element = ComponentExchangeExt.getSourceComponent((ComponentExchange) eObject);
			} else if (eObject instanceof FunctionalExchange) {
				element = FunctionExt.getIncomingAbstractFunction(((FunctionalExchange) eObject));
			} else {
				element = eObject.eContainer();
			}
		}
		String fileName = DocGenHtmlCapellaUtil.getFileName(element);
		return DocGenHtmlUtil.getValidFileName(fileName);
	}

}
