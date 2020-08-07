package org.eclipse.capella.docgen.test.selenium.contents;

import java.util.List;

import org.eclipse.capella.docgen.test.selenium.common.ITestedElementTest;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.core.data.capellacore.NamedElement;

public interface IElementContentTest extends ITestedElementTest {
	
	public NamedElement getElement();
	
	public void elementPageTest();
	
}
