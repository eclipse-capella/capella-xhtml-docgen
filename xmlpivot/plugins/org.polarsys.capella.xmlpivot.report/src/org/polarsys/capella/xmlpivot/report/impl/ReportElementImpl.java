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

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.polarsys.capella.xmlpivot.report.ReportElement;
import org.polarsys.capella.xmlpivot.report.ReportPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.capella.xmlpivot.report.impl.ReportElementImpl#getModelElement <em>Model Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ReportElementImpl extends MinimalEObjectImpl.Container implements ReportElement {
  /**
   * The cached value of the '{@link #getModelElement() <em>Model Element</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModelElement()
   * @generated
   * @ordered
   */
  protected EModelElement modelElement;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ReportElementImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return ReportPackage.Literals.REPORT_ELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EModelElement getModelElement() {
    if (modelElement != null && modelElement.eIsProxy()) {
      InternalEObject oldModelElement = (InternalEObject)modelElement;
      modelElement = (EModelElement)eResolveProxy(oldModelElement);
      if (modelElement != oldModelElement) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReportPackage.REPORT_ELEMENT__MODEL_ELEMENT, oldModelElement, modelElement));
      }
    }
    return modelElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EModelElement basicGetModelElement() {
    return modelElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModelElement(EModelElement newModelElement) {
    EModelElement oldModelElement = modelElement;
    modelElement = newModelElement;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReportPackage.REPORT_ELEMENT__MODEL_ELEMENT, oldModelElement, modelElement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case ReportPackage.REPORT_ELEMENT__MODEL_ELEMENT:
        if (resolve) return getModelElement();
        return basicGetModelElement();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue) {
    switch (featureID) {
      case ReportPackage.REPORT_ELEMENT__MODEL_ELEMENT:
        setModelElement((EModelElement)newValue);
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
      case ReportPackage.REPORT_ELEMENT__MODEL_ELEMENT:
        setModelElement((EModelElement)null);
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
      case ReportPackage.REPORT_ELEMENT__MODEL_ELEMENT:
        return modelElement != null;
    }
    return super.eIsSet(featureID);
  }

} //ReportElementImpl
