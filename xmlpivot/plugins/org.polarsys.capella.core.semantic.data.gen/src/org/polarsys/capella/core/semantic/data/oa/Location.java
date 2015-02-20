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

package org.polarsys.capella.core.semantic.data.oa;

import org.polarsys.capella.core.semantic.data.cs.Component;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.oa.Location#getLocationDescription <em>Location Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.oa.OaPackage#getLocation()
 * @model
 * @generated
 */
public interface Location extends Component {
	/**
	 * Returns the value of the '<em><b>Location Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location Description</em>' attribute.
	 * @see #setLocationDescription(String)
	 * @see org.polarsys.capella.core.semantic.data.oa.OaPackage#getLocation_LocationDescription()
	 * @model
	 * @generated
	 */
	String getLocationDescription();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.oa.Location#getLocationDescription <em>Location Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location Description</em>' attribute.
	 * @see #getLocationDescription()
	 * @generated
	 */
	void setLocationDescription(String value);

} // Location
