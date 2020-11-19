/*******************************************************************************
 * Copyright (c) 2006, 2015 THALES GLOBAL SERVICES.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
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
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.polarsys.capella.common.ef.ExecutionManagerRegistry;
import org.polarsys.capella.core.data.capellamodeller.ModelRoot;
import org.polarsys.capella.core.data.capellamodeller.Project;

import org.polarsys.kitalpha.doc.gen.business.core.scope.GenerationGlobalScope;
import org.polarsys.kitalpha.doc.gen.business.core.scope.ScopeException;
import org.polarsys.kitalpha.doc.gen.business.core.scope.ScopeReferencesStrategy;

public class CapellaDomainHelper extends LoadableDomainHelper {

	private ResourceSet getResourcesSet(URI resourceURI) {
		Iterator<TransactionalEditingDomain> iterator = ExecutionManagerRegistry.getInstance().getAllEditingDomains().iterator();

		while (iterator.hasNext()) {
			TransactionalEditingDomain transactionalEditingDomain = (TransactionalEditingDomain) iterator.next();
			Resource resource = transactionalEditingDomain.getResourceSet().getResource(resourceURI, false);
			if (resource != null && !(resource.getContents().isEmpty()))
			{
				EObject modelRoot = resource.getContents().get(0);
				if (modelRoot != null && modelRoot instanceof Project)
				{
					Project project = (Project) modelRoot;
					EList<ModelRoot> ownedModelRoots = project.getOwnedModelRoots();
					if (ownedModelRoots != null && ownedModelRoots.isEmpty() == false)
						return transactionalEditingDomain.getResourceSet();
				}
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

			final GenerationGlobalScope globalScope = GenerationGlobalScope.getInstance();
			if (globalScope.getReferencesStrategy().equals(ScopeReferencesStrategy.DONT_EXPORT))
			{
				try {
					final EList<EObject> generationScope = globalScope.getScopedResource().getContents();
					myDomain.getContent().addAll(generationScope);
				} catch (ScopeException e) {
					throw new DomainException(e);
				}
			}
			else
			{
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
				
				final EList<EObject> contents = domainResource.getContents();
				myDomain.getContent().addAll(contents);
			}
			
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
