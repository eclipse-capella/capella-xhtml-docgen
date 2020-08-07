package org.eclipse.capella.docgen.test.selenium.utils;

import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.polarsys.capella.common.libraries.LibrariesPackage;
import org.polarsys.capella.core.data.capellacommon.CapellacommonPackage;
import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.core.data.capellacore.CapellacorePackage;
import org.polarsys.capella.core.data.capellamodeller.CapellamodellerPackage;
import org.polarsys.capella.core.data.capellamodeller.Project;

public class CapellaModelUtils {
	
	public static Project capellaModelProject;

	public static void setCapellaModelProject(String airdPath) {
		URI airdURI = URI.createFileURI(airdPath);
		URI melodyURI = airdURI.trimFileExtension().appendFileExtension("melodymodeller");
		
		CapellamodellerPackage.eINSTANCE.eClass();
		CapellacommonPackage.eINSTANCE.eClass();
		CapellacorePackage.eINSTANCE.eClass();
		LibrariesPackage.eINSTANCE.eClass();
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("melodymodeller", new XMIResourceFactoryImpl());
		
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.getResource(melodyURI, true);
		
		capellaModelProject = (Project) resource.getContents().get(0);
	}
	
	public static EObject getEObject(String ID) {
		EObject object = null;
		if (capellaModelProject!=null) {
			Iterator<EObject> iter = capellaModelProject.eAllContents();
			while (iter.hasNext()) {
				EObject eObject = (EObject) iter.next();
				if (eObject instanceof CapellaElement) {
					if (((CapellaElement) eObject).getId().equals(ID)) {
						return eObject;
					}
				}
			}
		}
		return object;
	}
	
}
