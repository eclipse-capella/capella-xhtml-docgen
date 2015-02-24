/*******************************************************************************
 * Copyright (c) 2006, 2015 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *     
 * Contributors:
 *    Thales - initial API and implementation
 ******************************************************************************/

package org.polarsys.capella.core.semantic.data.cs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Physical Path Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.PhysicalPathReference#getReferencedPhysicalPath <em>Referenced Physical Path</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.cs.CsPackage#getPhysicalPathReference()
 * @model
 * @generated
 */
public interface PhysicalPathReference extends PhysicalPathInvolvement {
	/**
	 * Returns the value of the '<em><b>Referenced Physical Path</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Physical Path</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Physical Path</em>' reference.
	 * @see #setReferencedPhysicalPath(PhysicalPath)
	 * @see org.polarsys.capella.core.semantic.data.cs.CsPackage#getPhysicalPathReference_ReferencedPhysicalPath()
	 * @model
	 * @generated
	 */
	PhysicalPath getReferencedPhysicalPath();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.cs.PhysicalPathReference#getReferencedPhysicalPath <em>Referenced Physical Path</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Physical Path</em>' reference.
	 * @see #getReferencedPhysicalPath()
	 * @generated
	 */
	void setReferencedPhysicalPath(PhysicalPath value);

} // PhysicalPathReference
