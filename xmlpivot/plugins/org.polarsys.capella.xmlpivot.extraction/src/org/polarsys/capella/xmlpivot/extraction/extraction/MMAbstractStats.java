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
package org.polarsys.capella.xmlpivot.extraction.extraction;

import java.util.Collection;

import org.eclipse.emf.ecore.EPackage;

public abstract class MMAbstractStats implements IMMStats {

 
  protected Collection<EPackage> _ePackages;

  protected int _stats_supp_packages;
  protected int _stats_notsupp_packages;
  protected int _stats_supp_classes;
  protected int _stats_notsupp_classes;
  protected int _stats_supp_references;
  protected int _stats_notsupp_references;
  protected int _stats_supp_attributes;
  protected int _stats_notsupp_attributes;
  protected int _stats_supp_enumORtypes;
  protected int _stats_notsupp_enumORtypes;

  /**
   * Used to hide the default constructor
   */
  protected MMAbstractStats() {
    // Nothing
  }

  protected MMAbstractStats(Collection<EPackage> packages_p) {

    _ePackages = packages_p;

    _stats_supp_packages = 0;
    _stats_notsupp_packages = 0;
    _stats_supp_classes = 0;
    _stats_notsupp_classes = 0;
    _stats_supp_references = 0;
    _stats_notsupp_references = 0;
    _stats_supp_attributes = 0;
    _stats_notsupp_attributes = 0;
    _stats_supp_enumORtypes = 0;
    _stats_notsupp_enumORtypes = 0;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void getStatsOnMModelCleaning() {
    // Nothing
  }

  protected void showStats() {

    System.out.println("**********************************************************"); //$NON-NLS-1$
    System.out.println("      STATS :"); //$NON-NLS-1$
    System.out.println("**********************************************************"); //$NON-NLS-1$
    System.out.println("Number of suppressed packages : " + _stats_supp_packages); //$NON-NLS-1$
    System.out.println("Number of not suppressed packages : " + _stats_notsupp_packages); //$NON-NLS-1$
    System.out.println("Number of suppressed classes : " + _stats_supp_classes); //$NON-NLS-1$
    System.out.println("Number of not suppressed classes : " + _stats_notsupp_classes); //$NON-NLS-1$
    System.out.println("Number of suppressed references : " + _stats_supp_references); //$NON-NLS-1$
    System.out.println("Number of not suppressed references : " + _stats_notsupp_references); //$NON-NLS-1$
    System.out.println("Number of suppressed attributes : " + _stats_supp_attributes); //$NON-NLS-1$
    System.out.println("Number of not suppressed attributes : " + _stats_notsupp_attributes); //$NON-NLS-1$
    System.out.println("Number of suppressed enums and datatypes : " + _stats_supp_enumORtypes); //$NON-NLS-1$
    System.out.println("Number of not suppressed enums and datatypes : " + _stats_notsupp_enumORtypes); //$NON-NLS-1$
    System.out.println("**********************************************************"); //$NON-NLS-1$

  }

}
