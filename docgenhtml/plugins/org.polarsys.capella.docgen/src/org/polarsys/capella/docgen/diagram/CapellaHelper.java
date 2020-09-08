/*******************************************************************************
 * Copyright (c) 2006, 2020 THALES GLOBAL SERVICES.
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
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.query.EObjectQuery;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.common.tools.api.editing.EditingDomainFactoryService;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.DRepresentationDescriptor;
import org.eclipse.sirius.viewpoint.description.DAnnotation;
import org.eclipse.sirius.viewpoint.description.DescriptionPackage;
import org.polarsys.capella.common.data.modellingcore.AbstractType;
import org.polarsys.capella.common.data.modellingcore.AbstractTypedElement;
import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.core.data.cs.BlockArchitecture;
import org.polarsys.capella.core.data.information.AbstractInstance;
import org.polarsys.capella.core.diagram.helpers.naming.DAnnotationSourceConstants;
import org.polarsys.capella.docgen.util.CapellaServices;
import org.polarsys.kitalpha.doc.gen.business.core.preference.helper.DocgenDiagramPreferencesHelper;
import org.polarsys.kitalpha.doc.gen.business.core.scope.GenerationGlobalScope;
import org.polarsys.kitalpha.doc.gen.business.core.scope.ScopeReferencesStrategy;
import org.polarsys.kitalpha.doc.gen.business.core.sirius.util.session.DiagramSessionHelper;
import org.polarsys.kitalpha.doc.gen.business.core.util.SiriusHelper;

public class CapellaHelper {
	private static final String AIRD = ".aird";
	private static final String MELODYMODELLER = ".melodymodeller";

	public static Collection<DRepresentation> getDiagramForObject(CapellaElement element) {
		Collection<DRepresentation> representations = new ArrayList<DRepresentation>();
		if (!DocgenDiagramPreferencesHelper.getExportDiagram()) {
			return representations;
		}

		final Session currentSession = DiagramSessionHelper.getCurrentSession();
		final ScopeReferencesStrategy referencesStrategy = GenerationGlobalScope.getInstance().getReferencesStrategy();
		if (referencesStrategy.equals(ScopeReferencesStrategy.DONT_EXPORT)) {
			final EObject originalModelElement = GenerationGlobalScope.getInstance().getOriginalModelElement(element);
			representations = DialectManager.INSTANCE.getRepresentations(originalModelElement, currentSession);
		} else {
			representations = DialectManager.INSTANCE.getRepresentations(element, currentSession);
		}

		return representations;
	}

	public static Resource getAIRDResource(CapellaElement element) {
		URI uri = URI.createURI(element.eResource().getURI().toString().replace(MELODYMODELLER, AIRD));
		EditingDomain domain = EditingDomainFactoryService.INSTANCE.getEditingDomainFactory().createEditingDomain();
		if (domain != null)
			return domain.getResourceSet().getResource(uri, true);
		return null;
	}

	public static Set<DSemanticDiagram> getDiagramContainingObject(CapellaElement element) {
		Set<DSemanticDiagram> diagrams = new HashSet<DSemanticDiagram>();
		
		if (GenerationGlobalScope.getInstance().getReferencesStrategy().equals(ScopeReferencesStrategy.DONT_EXPORT)) {
			element = (CapellaElement) GenerationGlobalScope.getInstance().getOriginalModelElement(element);
		}
		
		getAllDiagramsForObject(element).stream()
			.filter(rep -> rep instanceof DSemanticDiagram)
			.filter(rep -> GenerationGlobalScope.getInstance().isCopyInScope(((DSemanticDiagram) rep).getTarget()))
			.forEach(diag -> diagrams.add((DSemanticDiagram) diag));
		
		return diagrams;
	}
	
	/**
	 * <p>
	 * Get all DRepresentation element displaying the model element.
	 * <br>
	 * This method keep only one instance of a given representation if it 
	 * is return many times by Sirius APIs.
	 * </p>
	 * @param element The model element 
	 * @return a {@link Collection} of all {@link DRepresentation}
	 */
	private static Collection<DRepresentation> getAllDiagramsForObject(EObject element) {
		Collection<DRepresentation> result = new ArrayList<DRepresentation>();
		// Check Diagram export preference
		if (DocgenDiagramPreferencesHelper.getExportDiagram())
		{
			Collection<EObject> refElements = resolveReferencedElements(element);
			for (EObject refElement: refElements) {
				SiriusHelper.getDiagramForObject(refElement, false).stream().forEach(rep -> {
					if (!result.contains(rep)) {
						result.add(rep);
					}
				});
			}
		}
		return result;
	}
	
	private static EList<EObject> resolveReferencedElements(EObject element) {
		EList<EObject> objects = new BasicEList<EObject>();
		objects.add(element);
		// If we have a Component then we look also for Parts
		if (element instanceof AbstractType) {
			List<AbstractTypedElement> ates = ((AbstractType)element).getAbstractTypedElements();
			objects.addAll(ates);
			// Then we look for InstanceRoles for these parts
			for (EObject ate : ates) {
				if (element instanceof AbstractInstance) {
					objects.addAll(((AbstractInstance)ate).getRepresentingInstanceRoles());
				}
			}
		} 
		if (element instanceof AbstractInstance) {
			objects.addAll(((AbstractInstance)element).getRepresentingInstanceRoles());
		}
		return objects;
	}

	/**
	 * Scrutinize all EOI (element of interest: See
	 * {@link org.polarsys.capella.core.diagram.helpers.naming.DAnnotationSourceConstants.CAPELLA_ELEMENT_OF_INTEREST})
	 * annotation of all representation descriptors to find all representations
	 * which are interested by the semantic element
	 * 
	 * @param semanticElement
	 *            to find all representation interested by it
	 * @return a collection of representations interested by semantic element. If
	 *         there are no representation, empty collection is returned
	 */
	public static Collection<DDiagram> getAllInterestedRepresentationsFor(EObject semanticElement) {
		Collection<EObject> descriptors = new LinkedHashSet<>();

		Collection<EObject> inverseReferences = new EObjectQuery(semanticElement)
				.getInverseReferences(DescriptionPackage.Literals.DANNOTATION__REFERENCES);
		inverseReferences.forEach(eObject -> {
			DAnnotation annotation = (DAnnotation) eObject;
			if (DAnnotationSourceConstants.CAPELLA_ELEMENT_OF_INTEREST.equals(annotation.getSource())) {
				descriptors.add(annotation.eContainer());
			}
		});

		return descriptors.parallelStream().map(eObject -> (DRepresentationDescriptor) eObject)
				.map(desc -> DiagramSessionHelper.getDDiagram(desc)).collect(Collectors.toList());
	}

	/**
	 * Retrieve all <code>DRepresentation</code> objects for elements of <code>archi</code>
	 * 
	 * @param archi
	 * @return
	 */
	public static Collection<DRepresentation> getAllDiagramsIn(BlockArchitecture archi) {
		Collection<DRepresentation> representations = new ArrayList<DRepresentation>();
		for (DRepresentation rep : DiagramSessionHelper.getSessionDRepresentation()) {
			// Return only representations belonging to the current BlockArchitecture
			if (archi.equals(getBlockArchitectureContainer(rep))) {
				representations.add(rep);
			}
		}
		return representations;
	}

	/**
	 * Check whether <code>archi</code> hosts diagrams
	 * 
	 * @param archi
	 * @return
	 */
	public static boolean hostDiagrams(BlockArchitecture archi) {
		for (DRepresentation rep : DiagramSessionHelper.getSessionDRepresentation()) {
			// Return only representations belonging to the current BlockArchitecture
			if (archi.equals(getBlockArchitectureContainer(rep))) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Loops towards eContainer() calls to find the containing BlockArchitecture
	 * element
	 * 
	 * @param diagram
	 * @return
	 */
	private static EObject getBlockArchitectureContainer(DRepresentation representation) {
		EObject parent = null;
		if (representation instanceof DSemanticDiagram) {
			EObject target = CapellaServices.getRepresentationTarget(representation);
			if (target != null) {
				parent = target.eContainer();
			}
		}
		while (!(parent instanceof BlockArchitecture) && parent != null) {
			parent = parent.eContainer();
		}
		return parent;
	}
}
