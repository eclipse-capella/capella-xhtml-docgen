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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RClass</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.xmlpivot.report.RClass#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.polarsys.capella.xmlpivot.report.RClass#getSuperClasses <em>Super Classes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.xmlpivot.report.ReportPackage#getRClass()
 * @model
 * @generated
 */
public interface RClass extends ReportElement, RNamedElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2006, 2015 THALES GLOBAL SERVICES.\r\nAll rights reserved. This program and the accompanying materials\r\nare made available under the terms of the Eclipse Public License v1.0\r\nwhich accompanies this distribution, and is available at\r\nhttp://www.eclipse.org/legal/epl-v10.html\r\n    \r\nContributors:\r\n   Thales - initial API and implementation";

	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see org.polarsys.capella.xmlpivot.report.ReportPackage#getRClass_Abstract()
	 * @model default="false" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	boolean isAbstract();

	/**
	 * Returns the value of the '<em><b>Super Classes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Classes</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Classes</em>' attribute list.
	 * @see org.polarsys.capella.xmlpivot.report.ReportPackage#getRClass_SuperClasses()
	 * @model changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='attribute'"
	 * @generated
	 */
	EList<String> getSuperClasses();

} // RClass
