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
package org.polarsys.capella.xmlpivot.report;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.polarsys.capella.xmlpivot.report.ReportFactory
 * @model kind="package"
 * @generated
 */
public interface ReportPackage extends EPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2006, 2015 THALES GLOBAL SERVICES.\r\nAll rights reserved. This program and the accompanying materials\r\nare made available under the terms of the Eclipse Public License v1.0\r\nwhich accompanies this distribution, and is available at\r\nhttp://www.eclipse.org/legal/epl-v10.html\r\n    \r\nContributors:\r\n   Thales - initial API and implementation";

	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "report";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.polarsys.org/capella/xmlpivot/report/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "report";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ReportPackage eINSTANCE = org.polarsys.capella.xmlpivot.report.impl.ReportPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.polarsys.capella.xmlpivot.report.impl.ReportImpl <em>Report</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.xmlpivot.report.impl.ReportImpl
	 * @see org.polarsys.capella.xmlpivot.report.impl.ReportPackageImpl#getReport()
	 * @generated
	 */
	int REPORT = 0;

	/**
	 * The feature id for the '<em><b>RClasses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT__RCLASSES = 0;

	/**
	 * The feature id for the '<em><b>RStructural Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT__RSTRUCTURAL_FEATURES = 1;

	/**
	 * The number of structural features of the '<em>Report</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Report</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.xmlpivot.report.impl.ReportElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.xmlpivot.report.impl.ReportElementImpl
	 * @see org.polarsys.capella.xmlpivot.report.impl.ReportPackageImpl#getReportElement()
	 * @generated
	 */
	int REPORT_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_ELEMENT__MODEL_ELEMENT = 0;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.xmlpivot.report.impl.RClassImpl <em>RClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.xmlpivot.report.impl.RClassImpl
	 * @see org.polarsys.capella.xmlpivot.report.impl.ReportPackageImpl#getRClass()
	 * @generated
	 */
	int RCLASS = 2;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCLASS__MODEL_ELEMENT = REPORT_ELEMENT__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCLASS__NAME = REPORT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCLASS__ABSTRACT = REPORT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Super Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCLASS__SUPER_CLASSES = REPORT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>RClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCLASS_FEATURE_COUNT = REPORT_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>RClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCLASS_OPERATION_COUNT = REPORT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.xmlpivot.report.impl.RStructuralFeatureImpl <em>RStructural Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.xmlpivot.report.impl.RStructuralFeatureImpl
	 * @see org.polarsys.capella.xmlpivot.report.impl.ReportPackageImpl#getRStructuralFeature()
	 * @generated
	 */
	int RSTRUCTURAL_FEATURE = 3;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSTRUCTURAL_FEATURE__MODEL_ELEMENT = REPORT_ELEMENT__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSTRUCTURAL_FEATURE__NAME = REPORT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>RStructural Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSTRUCTURAL_FEATURE_FEATURE_COUNT = REPORT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>RStructural Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSTRUCTURAL_FEATURE_OPERATION_COUNT = REPORT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.capella.xmlpivot.report.RNamedElement <em>RNamed Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.xmlpivot.report.RNamedElement
	 * @see org.polarsys.capella.xmlpivot.report.impl.ReportPackageImpl#getRNamedElement()
	 * @generated
	 */
	int RNAMED_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RNAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>RNamed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RNAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>RNamed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RNAMED_ELEMENT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.xmlpivot.report.Report <em>Report</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Report</em>'.
	 * @see org.polarsys.capella.xmlpivot.report.Report
	 * @generated
	 */
	EClass getReport();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.capella.xmlpivot.report.Report#getRClasses <em>RClasses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>RClasses</em>'.
	 * @see org.polarsys.capella.xmlpivot.report.Report#getRClasses()
	 * @see #getReport()
	 * @generated
	 */
	EReference getReport_RClasses();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.capella.xmlpivot.report.Report#getRStructuralFeatures <em>RStructural Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>RStructural Features</em>'.
	 * @see org.polarsys.capella.xmlpivot.report.Report#getRStructuralFeatures()
	 * @see #getReport()
	 * @generated
	 */
	EReference getReport_RStructuralFeatures();

	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.xmlpivot.report.ReportElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see org.polarsys.capella.xmlpivot.report.ReportElement
	 * @generated
	 */
	EClass getReportElement();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.capella.xmlpivot.report.ReportElement#getModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model Element</em>'.
	 * @see org.polarsys.capella.xmlpivot.report.ReportElement#getModelElement()
	 * @see #getReportElement()
	 * @generated
	 */
	EReference getReportElement_ModelElement();

	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.xmlpivot.report.RClass <em>RClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RClass</em>'.
	 * @see org.polarsys.capella.xmlpivot.report.RClass
	 * @generated
	 */
	EClass getRClass();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.capella.xmlpivot.report.RClass#isAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see org.polarsys.capella.xmlpivot.report.RClass#isAbstract()
	 * @see #getRClass()
	 * @generated
	 */
	EAttribute getRClass_Abstract();

	/**
	 * Returns the meta object for the attribute list '{@link org.polarsys.capella.xmlpivot.report.RClass#getSuperClasses <em>Super Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Super Classes</em>'.
	 * @see org.polarsys.capella.xmlpivot.report.RClass#getSuperClasses()
	 * @see #getRClass()
	 * @generated
	 */
	EAttribute getRClass_SuperClasses();

	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.xmlpivot.report.RStructuralFeature <em>RStructural Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RStructural Feature</em>'.
	 * @see org.polarsys.capella.xmlpivot.report.RStructuralFeature
	 * @generated
	 */
	EClass getRStructuralFeature();

	/**
	 * Returns the meta object for class '{@link org.polarsys.capella.xmlpivot.report.RNamedElement <em>RNamed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RNamed Element</em>'.
	 * @see org.polarsys.capella.xmlpivot.report.RNamedElement
	 * @generated
	 */
	EClass getRNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.capella.xmlpivot.report.RNamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.polarsys.capella.xmlpivot.report.RNamedElement#getName()
	 * @see #getRNamedElement()
	 * @generated
	 */
	EAttribute getRNamedElement_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ReportFactory getReportFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.polarsys.capella.xmlpivot.report.impl.ReportImpl <em>Report</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.xmlpivot.report.impl.ReportImpl
		 * @see org.polarsys.capella.xmlpivot.report.impl.ReportPackageImpl#getReport()
		 * @generated
		 */
		EClass REPORT = eINSTANCE.getReport();

		/**
		 * The meta object literal for the '<em><b>RClasses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPORT__RCLASSES = eINSTANCE.getReport_RClasses();

		/**
		 * The meta object literal for the '<em><b>RStructural Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPORT__RSTRUCTURAL_FEATURES = eINSTANCE.getReport_RStructuralFeatures();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.xmlpivot.report.impl.ReportElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.xmlpivot.report.impl.ReportElementImpl
		 * @see org.polarsys.capella.xmlpivot.report.impl.ReportPackageImpl#getReportElement()
		 * @generated
		 */
		EClass REPORT_ELEMENT = eINSTANCE.getReportElement();

		/**
		 * The meta object literal for the '<em><b>Model Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPORT_ELEMENT__MODEL_ELEMENT = eINSTANCE.getReportElement_ModelElement();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.xmlpivot.report.impl.RClassImpl <em>RClass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.xmlpivot.report.impl.RClassImpl
		 * @see org.polarsys.capella.xmlpivot.report.impl.ReportPackageImpl#getRClass()
		 * @generated
		 */
		EClass RCLASS = eINSTANCE.getRClass();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RCLASS__ABSTRACT = eINSTANCE.getRClass_Abstract();

		/**
		 * The meta object literal for the '<em><b>Super Classes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RCLASS__SUPER_CLASSES = eINSTANCE.getRClass_SuperClasses();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.xmlpivot.report.impl.RStructuralFeatureImpl <em>RStructural Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.xmlpivot.report.impl.RStructuralFeatureImpl
		 * @see org.polarsys.capella.xmlpivot.report.impl.ReportPackageImpl#getRStructuralFeature()
		 * @generated
		 */
		EClass RSTRUCTURAL_FEATURE = eINSTANCE.getRStructuralFeature();

		/**
		 * The meta object literal for the '{@link org.polarsys.capella.xmlpivot.report.RNamedElement <em>RNamed Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.capella.xmlpivot.report.RNamedElement
		 * @see org.polarsys.capella.xmlpivot.report.impl.ReportPackageImpl#getRNamedElement()
		 * @generated
		 */
		EClass RNAMED_ELEMENT = eINSTANCE.getRNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RNAMED_ELEMENT__NAME = eINSTANCE.getRNamedElement_Name();

	}

} //ReportPackage
