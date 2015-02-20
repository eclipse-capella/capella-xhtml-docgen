/*******************************************************************************
 * Copyright (c) 2006, 2015 THALES GLOBAL SERVICES.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *    
 *  Contributors:
 *     Thales - initial API and implementation
 ******************************************************************************/
package org.polarsys.capella.xmlpivot.common;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.converter.util.ConverterUtil;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageRegistryImpl;

/**
 */
public class CapellaPackageRegistry {

  private static final URI CAPELLA_GENMODEL_URI = URI.createPlatformResourceURI(
      "org.polarsys.capella.core.data.gen/model/CapellaModeller.genmodel", true); //$NON-NLS-1$
  private static Collection<EPackage> allCapellaPackages = null;

  /**
   * Returns a (delegating) package registry whose directly registered
   * packages are all packages from the Capella genmodel. Packages 
   * will be registered even if they are already registered in the
   * delegate registry.
   * 
   * @param delegate a delegate registry. not null.
   * @return
   */
  public static EPackage.Registry create(EPackage.Registry delegate) {
    EPackage.Registry registry = new EPackageRegistryImpl(delegate);
    for (EPackage p : getAllCapellaPackages()) {
      registry.put(p.getNsURI(), p);
    }
    return registry;
  }

  /**
   * Return all Capella packages. This also includes nested packages, like information.datatype etc.
   */
  public static synchronized Collection<EPackage> getAllCapellaPackages() {
    if (allCapellaPackages == null) {
      List<EPackage> l = new ArrayList<EPackage>();
      for (GenPackage p : getCapellaGenModel().getAllGenAndUsedGenPackagesWithClassifiers()) {
        EPackage registered = EPackage.Registry.INSTANCE.getEPackage(p.getNSURI());
        if (registered != null) {
          l.add(registered);
        } else {
          l.add(p.getEcorePackage());
        }
      }
      allCapellaPackages = Collections.unmodifiableList(l);
    }
    return allCapellaPackages;
  }

  private static GenModel getCapellaGenModel() {
    return (GenModel) ConverterUtil.createResourceSet().getResource(CAPELLA_GENMODEL_URI, true).getContents().get(0);
  }

}
