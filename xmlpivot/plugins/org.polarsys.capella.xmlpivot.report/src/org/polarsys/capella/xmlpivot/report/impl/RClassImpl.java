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
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import com.google.common.base.Function;
import com.google.common.collect.Collections2;
import org.polarsys.capella.xmlpivot.report.RClass;
import org.polarsys.capella.xmlpivot.report.RNamedElement;
import org.polarsys.capella.xmlpivot.report.ReportPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RClass</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.capella.xmlpivot.report.impl.RClassImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.polarsys.capella.xmlpivot.report.impl.RClassImpl#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.polarsys.capella.xmlpivot.report.impl.RClassImpl#getSuperClasses <em>Super Classes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RClassImpl extends ReportElementImpl implements RClass {
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;
  /**
   * The default value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAbstract()
   * @generated
   * @ordered
   */
  protected static final boolean ABSTRACT_EDEFAULT = false;
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RClassImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return ReportPackage.Literals.RCLASS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public String getName() {
    EClass c = (EClass) getModelElement();
    return c.getEPackage().getName() + "." + c.getName();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public boolean isAbstract() {
    return ((EClass) getModelElement()).isAbstract();
  }

 

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public EList<String> getSuperClasses() {
    EClass cls = (EClass) getModelElement();
    Collection<String> asStrings = Collections2.transform(cls.getEAllSuperTypes(), new Function<EClass, String>(){
      @Override
      public String apply(EClass input_p) {
        return input_p.getEPackage().getName() + "." + input_p.getName();
      }
    });
    return new BasicEList.UnmodifiableEList<String>(asStrings.size(), asStrings.toArray());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case ReportPackage.RCLASS__NAME:
        return getName();
      case ReportPackage.RCLASS__ABSTRACT:
        return isAbstract();
      case ReportPackage.RCLASS__SUPER_CLASSES:
        return getSuperClasses();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID) {
    switch (featureID) {
      case ReportPackage.RCLASS__NAME:
        return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
      case ReportPackage.RCLASS__ABSTRACT:
        return isAbstract() != ABSTRACT_EDEFAULT;
      case ReportPackage.RCLASS__SUPER_CLASSES:
        return !getSuperClasses().isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
    if (baseClass == RNamedElement.class) {
      switch (derivedFeatureID) {
        case ReportPackage.RCLASS__NAME: return ReportPackage.RNAMED_ELEMENT__NAME;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
    if (baseClass == RNamedElement.class) {
      switch (baseFeatureID) {
        case ReportPackage.RNAMED_ELEMENT__NAME: return ReportPackage.RCLASS__NAME;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

} //RClassImpl
