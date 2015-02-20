/**
 * Copyright (c) 2006, 2015 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *     
 * Contributors:
 *    Thales - initial API and implementation
 */
package org.polarsys.capella.xmlpivot.report.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.capella.xmlpivot.report.RClass;
import org.polarsys.capella.xmlpivot.report.RStructuralFeature;
import org.polarsys.capella.xmlpivot.report.Report;
import org.polarsys.capella.xmlpivot.report.ReportPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Report</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.capella.xmlpivot.report.impl.ReportImpl#getRClasses <em>RClasses</em>}</li>
 *   <li>{@link org.polarsys.capella.xmlpivot.report.impl.ReportImpl#getRStructuralFeatures <em>RStructural Features</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReportImpl extends MinimalEObjectImpl.Container implements Report {
  /**
   * The cached value of the '{@link #getRClasses() <em>RClasses</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRClasses()
   * @generated
   * @ordered
   */
  protected EList<RClass> rClasses;
  /**
   * The cached value of the '{@link #getRStructuralFeatures() <em>RStructural Features</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRStructuralFeatures()
   * @generated
   * @ordered
   */
  protected EList<RStructuralFeature> rStructuralFeatures;
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ReportImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return ReportPackage.Literals.REPORT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<RClass> getRClasses() {
    if (rClasses == null) {
      rClasses = new EObjectContainmentEList<RClass>(RClass.class, this, ReportPackage.REPORT__RCLASSES);
    }
    return rClasses;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<RStructuralFeature> getRStructuralFeatures() {
    if (rStructuralFeatures == null) {
      rStructuralFeatures = new EObjectContainmentEList<RStructuralFeature>(RStructuralFeature.class, this, ReportPackage.REPORT__RSTRUCTURAL_FEATURES);
    }
    return rStructuralFeatures;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case ReportPackage.REPORT__RCLASSES:
        return ((InternalEList<?>)getRClasses()).basicRemove(otherEnd, msgs);
      case ReportPackage.REPORT__RSTRUCTURAL_FEATURES:
        return ((InternalEList<?>)getRStructuralFeatures()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case ReportPackage.REPORT__RCLASSES:
        return getRClasses();
      case ReportPackage.REPORT__RSTRUCTURAL_FEATURES:
        return getRStructuralFeatures();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue) {
    switch (featureID) {
      case ReportPackage.REPORT__RCLASSES:
        getRClasses().clear();
        getRClasses().addAll((Collection<? extends RClass>)newValue);
        return;
      case ReportPackage.REPORT__RSTRUCTURAL_FEATURES:
        getRStructuralFeatures().clear();
        getRStructuralFeatures().addAll((Collection<? extends RStructuralFeature>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID) {
    switch (featureID) {
      case ReportPackage.REPORT__RCLASSES:
        getRClasses().clear();
        return;
      case ReportPackage.REPORT__RSTRUCTURAL_FEATURES:
        getRStructuralFeatures().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID) {
    switch (featureID) {
      case ReportPackage.REPORT__RCLASSES:
        return rClasses != null && !rClasses.isEmpty();
      case ReportPackage.REPORT__RSTRUCTURAL_FEATURES:
        return rStructuralFeatures != null && !rStructuralFeatures.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ReportImpl
