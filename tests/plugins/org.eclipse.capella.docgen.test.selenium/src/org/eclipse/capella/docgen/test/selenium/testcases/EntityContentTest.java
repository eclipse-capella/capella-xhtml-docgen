package org.eclipse.capella.docgen.test.selenium.testcases;

import org.eclipse.capella.docgen.test.selenium.contents.ComponentContentTest;
import org.eclipse.capella.docgen.test.selenium.data.MAHTMLDOC184TestValues;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.polarsys.capella.core.data.capellacore.NamedElement;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EntityContentTest extends ComponentContentTest {

	@Override
	public NamedElement getElement() {
		return MAHTMLDOC184TestValues.getElement().getNamedElement();
	}
	
}
