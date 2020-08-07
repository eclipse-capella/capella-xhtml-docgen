package org.eclipse.capella.docgen.test.selenium.utils;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.capella.docgen.test.selenium.data.MAHTMLDOC184TestValues;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.core.data.capellacore.NamedElement;

public class MockNamedElement {
	
	private String ID;
	private NamedElement namedElement;
	private EClass eClass;
	private List<EStructuralFeature> namedElementsStructuralFeatures;

	public MockNamedElement(String id) {
		setID(id);
		setNamedElement((NamedElement) CapellaModelUtils.getEObject(id));
		namedElementsStructuralFeatures = new ArrayList<EStructuralFeature>();
	}
	
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public List<EStructuralFeature> getNamedElementsStructuralFeatures() {
		return namedElementsStructuralFeatures;
	}
	public void setNamedElementsStructuralFeatures(List<EStructuralFeature> structuralFeatures) {
		this.namedElementsStructuralFeatures = structuralFeatures;
	}
	public void addNamedElementsStructuralFeatures(EStructuralFeature structuralFeature) {
		this.namedElementsStructuralFeatures.add(structuralFeature);
	}

	public NamedElement getNamedElement() {
		return namedElement;
	}

	public void setNamedElement(NamedElement namedElement) {
		this.namedElement = namedElement;
	}
	
	public EClass getEClass() {
		return eClass;
	}

	public void setEClass(EClass eclass) {
		this.eClass = eclass;
	}

	@SuppressWarnings("unchecked")
	public List<EObject> getFeaturesContent() {
		ArrayList<EObject> objs = new ArrayList<>();
		MAHTMLDOC184TestValues.getElement().getNamedElementsStructuralFeatures().stream().forEach(strFeat -> {
			if (getNamedElement().eIsSet(strFeat)) {
				Object content = getNamedElement().eGet(strFeat);
				if (content instanceof List) {
					((List) content).stream().forEach(e -> objs.add((EObject) e));
				} else {
					objs.add((EObject) content);
				}
			}
		});
		return objs;
	}

}
