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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Report</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.xmlpivot.report.Report#getRClasses <em>RClasses</em>}</li>
 *   <li>{@link org.polarsys.capella.xmlpivot.report.Report#getRStructuralFeatures <em>RStructural Features</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.xmlpivot.report.ReportPackage#getReport()
 * @model
 * @generated
 */
public interface Report extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2006, 2015 THALES GLOBAL SERVICES.\r\nAll rights reserved. This program and the accompanying materials\r\nare made available under the terms of the Eclipse Public License v1.0\r\nwhich accompanies this distribution, and is available at\r\nhttp://www.eclipse.org/legal/epl-v10.html\r\n    \r\nContributors:\r\n   Thales - initial API and implementation";

	/**
	 * Returns the value of the '<em><b>RClasses</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.xmlpivot.report.RClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RClasses</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RClasses</em>' containment reference list.
	 * @see org.polarsys.capella.xmlpivot.report.ReportPackage#getReport_RClasses()
	 * @model containment="true"
	 *        extendedMetaData="name='EClass' kind='element'"
	 * @generated
	 */
	EList<RClass> getRClasses();

	/**
	 * Returns the value of the '<em><b>RStructural Features</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.xmlpivot.report.RStructuralFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RStructural Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RStructural Features</em>' containment reference list.
	 * @see org.polarsys.capella.xmlpivot.report.ReportPackage#getReport_RStructuralFeatures()
	 * @model containment="true"
	 *        extendedMetaData="name='EStructuralFeature' kind='element'"
	 * @generated
	 */
	EList<RStructuralFeature> getRStructuralFeatures();

} // Report
