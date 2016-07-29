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
package org.polarsys.capella.docgen.diagram;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.common.tools.api.editing.EditingDomainFactoryService;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.core.data.cs.Part;
import org.polarsys.capella.core.data.interaction.InstanceRole;
import org.polarsys.capella.core.data.interaction.StateFragment;
import org.polarsys.kitalpha.doc.gen.business.core.preference.helper.DocgenDiagramPreferencesHelper;
import org.polarsys.kitalpha.doc.gen.business.core.scope.GenerationGlobalScope;
import org.polarsys.kitalpha.doc.gen.business.core.scope.ScopeReferencesStrategy;
import org.polarsys.kitalpha.doc.gen.business.core.sirius.util.session.DiagramSessionHelper;

public class CapellaHelper {
	private static final String AIRD = ".aird";
	private static final String MELODYMODELLER = ".melodymodeller";

	public static Collection<DRepresentation> getDiagramForObject(CapellaElement element) {
		Collection<DRepresentation> representations = new ArrayList<DRepresentation>();
		if (! DocgenDiagramPreferencesHelper.getExportDiagram())
		{
			return representations;
		}
		
		final Session currentSession = DiagramSessionHelper.getCurrentSession();
		final ScopeReferencesStrategy referencesStrategy = GenerationGlobalScope.getInstance().getReferencesStrategy();
		if (referencesStrategy.equals(ScopeReferencesStrategy.DONT_EXPORT))
		{
			final EObject originalModelElement = GenerationGlobalScope.getInstance().getOriginalModelElement(element);
			representations = DialectManager.INSTANCE.getRepresentations(originalModelElement, currentSession);
		}
		else
		{
			representations = DialectManager.INSTANCE.getRepresentations(element, currentSession);
		}
		
		return representations;
	}

	public static Resource getAIRDResource(CapellaElement element) {
		URI uri = URI.createURI(element.eResource().getURI().toString()
				.replace(MELODYMODELLER, AIRD));
		EditingDomain domain = EditingDomainFactoryService.INSTANCE.getEditingDomainFactory().createEditingDomain();
		if (domain != null)
			return domain.getResourceSet().getResource(uri, true);
		return null;
	}

	public static Set<DSemanticDiagram> getDiagramContainingObject(CapellaElement element) {
		Set<DSemanticDiagram> diagrams = new HashSet<DSemanticDiagram>();
		if (! DocgenDiagramPreferencesHelper.getExportDiagram())
		{
			return diagrams;
		}
		
		if (GenerationGlobalScope.getInstance().getReferencesStrategy().equals(ScopeReferencesStrategy.DONT_EXPORT))
		{
			element = (CapellaElement) GenerationGlobalScope.getInstance().getOriginalModelElement(element);
		}
		
		for (DRepresentation representation : DiagramSessionHelper.getSessionDRepresentation()) 
		{
			if (representation instanceof DSemanticDiagram) 
			{
				DSemanticDiagram dSemanticDiagram = (DSemanticDiagram) representation;
				EObject semanticTarget = ((DSemanticDiagram) representation).getTarget();
				final boolean copyInScope = GenerationGlobalScope.getInstance().isCopyInScope(semanticTarget);
				if (copyInScope == false)
					continue;
				
				for (DDiagramElement diagramElement : dSemanticDiagram.getDiagramElements()) 
				{
					EObject repTarget = diagramElement.getTarget();
					EList<EObject> targets = resolveReferencedElements(repTarget);
					for (EObject target : targets) 
					{
						if (diagramElement.isVisible() && EcoreUtil.equals(element, target)
							&& EcoreUtil.equals(semanticTarget, target) == false) 
						{
							// Current representation contains our model element.
							// Add it in resulting set, break current loop to search for next representation.
							diagrams.add((DSemanticDiagram) representation);
							break;
						}
					}
				}
			}
		}
		return diagrams;
	}
	
	private static EList<EObject> resolveReferencedElements(EObject repTarget) {
		EList<EObject> objects = new BasicEList<EObject>();
		objects.add(repTarget);
		if (repTarget instanceof Part) 
		{
			objects.addAll(resolveReferencedElements(((Part) repTarget).getAbstractType()));
		}
		
		if (repTarget instanceof InstanceRole) 
		{
			objects.addAll(resolveReferencedElements(((InstanceRole) repTarget).getRepresentedInstance()));
		}
		
		if (repTarget instanceof StateFragment) 
		{
			objects.addAll(resolveReferencedElements(((StateFragment) repTarget).getRelatedAbstractFunction()));
		}
		return objects;
	}
}
