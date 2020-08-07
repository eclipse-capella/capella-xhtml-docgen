package org.eclipse.capella.docgen.test.selenium.data;

import org.eclipse.capella.docgen.test.selenium.utils.MockNamedElement;
import org.polarsys.capella.core.data.oa.OaPackage;

public class MAHTMLDOC184TestValues extends AbstractTestValue {

	@Override
	public String getModelName() {
		return "MAHTMLDOC-184";
	}
	
	public static MockNamedElement getElement() {
		final String componentID = "b62e066c-6f9f-43b0-9d6e-ef1773228198";
		MockNamedElement element = new MockNamedElement(componentID);
		//element.addNamedElementsStructuralFeatures(OaPackage.Literals.ENTITY__ALLOCATED_OPERATIONAL_ACTIVITIES);
		//element.addNamedElementsStructuralFeatures(OaPackage.Literals.ENTITY__ALLOCATED_ROLES);
		//element.addNamedElementsStructuralFeatures(OaPackage.Literals.ENTITY__INVOLVING_OPERATIONAL_CAPABILITIES);
		//element.addNamedElementsStructuralFeatures(OaPackage.Literals.ENTITY__ORGANISATIONAL_UNIT_MEMBERSHIPS);
		element.addNamedElementsStructuralFeatures(OaPackage.Literals.ENTITY__OWNED_COMMUNICATION_MEANS);
		element.addNamedElementsStructuralFeatures(OaPackage.Literals.ENTITY__OWNED_ENTITIES);
		element.addNamedElementsStructuralFeatures(OaPackage.Literals.ENTITY__OWNED_ROLE_ALLOCATIONS);
		//element.addNamedElementsStructuralFeatures(OaPackage.Literals.ENTITY__REALIZING_SYSTEM_COMPONENTS);
		//element.addNamedElementsStructuralFeatures(OaPackage.Literals.ENTITY__ROLE_ALLOCATIONS);
		//element.addNamedElementsStructuralFeatures(OaPackage.Literals.ENTITY__SUB_ENTITIES);
		return element;
	}

}
