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

package org.polarsys.capella.docgen.ui.domain;

import java.util.Iterator;

import org.eclipse.egf.domain.Activator;
import org.eclipse.egf.domain.DomainException;
import org.eclipse.egf.domain.LoadableDomainHelper;
import org.eclipse.egf.domain.Messages;
import org.eclipse.egf.model.domain.EMFDomain;
import org.eclipse.egf.model.domain.LoadableDomain;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.polarsys.capella.common.ef.ExecutionManagerRegistry;
import org.polarsys.capella.core.data.capellamodeller.util.CapellamodellerResourceImpl;

public class CapellaDomainHelper extends LoadableDomainHelper {

	private ResourceSet getResourcesSet(URI resourceURI) {
		Iterator<TransactionalEditingDomain> iterator = ExecutionManagerRegistry.getInstance().getAllEditingDomains().iterator();

		while (iterator.hasNext()) {
			TransactionalEditingDomain transactionalEditingDomain = (TransactionalEditingDomain) iterator.next();
			Resource resource = transactionalEditingDomain.getResourceSet().getResource(resourceURI, false);
			if (resource != null && resource instanceof CapellamodellerResourceImpl) {
				return transactionalEditingDomain.getResourceSet();
			}
		}
		return null;
	}

	@Override
	protected boolean doLoadDomain(LoadableDomain domain) throws DomainException {
		if (domain instanceof EMFDomain) {
			EMFDomain myDomain = (EMFDomain) domain;
			if (myDomain.isLoaded())
				throw new DomainException(Messages.bind(Messages.Load_Domain_error1, domain.eClass().getName(), domain.getName()));

			myDomain.setLoaded(true);

			final URI uri = myDomain.getUri();
			if (uri == null || "".equals(uri.toString())) {
				Activator.getDefault().logWarning(Messages.bind(Messages.Load_EMFDomain_error1, domain.getName()));
				return true;
			}

			ResourceSet set = getResourcesSet(myDomain.getUri());
			Resource domainResource = null;
			try {
				domainResource = set.getResource(uri, true);
			} catch (Exception e) {
				throw new DomainException(e);
			}

			if (!myDomain.getContent().isEmpty())
				throw new DomainException(Messages.bind(Messages.Load_Domain_error1, domain.eClass().getName(), domain.getName()));

			myDomain.getContent().addAll(domainResource.getContents());
			return true;
		}
		return false;
	}

	@Override
	protected boolean doUnLoadDomain(LoadableDomain domain) throws DomainException {
		if (domain instanceof EMFDomain) {
			EMFDomain myDomain = (EMFDomain) domain;
			if (!myDomain.getContent().isEmpty()) {
				myDomain.getContent().clear();
				myDomain.setLoaded(false);
			}
			return true;
		}
		return false;
	}

}
