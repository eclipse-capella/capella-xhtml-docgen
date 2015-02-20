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

import org.eclipse.emf.common.util.EList;

import org.polarsys.capella.core.semantic.data.fa.ComponentExchangeAllocator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Physical Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.PhysicalLink#getLinkEnds <em>Link Ends</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.PhysicalLink#getOwnedPhysicalLinkEnds <em>Owned Physical Link Ends</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.PhysicalLink#getCategories <em>Categories</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.PhysicalLink#getSourcePhysicalPort <em>Source Physical Port</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.PhysicalLink#getTargetPhysicalPort <em>Target Physical Port</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.PhysicalLink#getRealizedPhysicalLinks <em>Realized Physical Links</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.cs.CsPackage#getPhysicalLink()
 * @model
 * @generated
 */
public interface PhysicalLink extends AbstractPhysicalArtifact, AbstractPathInvolvedElement, ComponentExchangeAllocator {
	/**
	 * Returns the value of the '<em><b>Link Ends</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.cs.AbstractPhysicalLinkEnd}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link Ends</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Ends</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.cs.CsPackage#getPhysicalLink_LinkEnds()
	 * @model lower="2" upper="2"
	 * @generated
	 */
	EList<AbstractPhysicalLinkEnd> getLinkEnds();

	/**
	 * Returns the value of the '<em><b>Owned Physical Link Ends</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.cs.PhysicalLinkEnd}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Physical Link Ends</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Physical Link Ends</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.cs.CsPackage#getPhysicalLink_OwnedPhysicalLinkEnds()
	 * @model containment="true"
	 * @generated
	 */
	EList<PhysicalLinkEnd> getOwnedPhysicalLinkEnds();

	/**
	 * Returns the value of the '<em><b>Categories</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.cs.PhysicalLinkCategory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categories</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categories</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.cs.CsPackage#getPhysicalLink_Categories()
	 * @model
	 * @generated
	 */
	EList<PhysicalLinkCategory> getCategories();

	/**
	 * Returns the value of the '<em><b>Source Physical Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Physical Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Physical Port</em>' reference.
	 * @see #setSourcePhysicalPort(PhysicalPort)
	 * @see org.polarsys.capella.core.semantic.data.cs.CsPackage#getPhysicalLink_SourcePhysicalPort()
	 * @model
	 * @generated
	 */
	PhysicalPort getSourcePhysicalPort();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.cs.PhysicalLink#getSourcePhysicalPort <em>Source Physical Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Physical Port</em>' reference.
	 * @see #getSourcePhysicalPort()
	 * @generated
	 */
	void setSourcePhysicalPort(PhysicalPort value);

	/**
	 * Returns the value of the '<em><b>Target Physical Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Physical Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Physical Port</em>' reference.
	 * @see #setTargetPhysicalPort(PhysicalPort)
	 * @see org.polarsys.capella.core.semantic.data.cs.CsPackage#getPhysicalLink_TargetPhysicalPort()
	 * @model
	 * @generated
	 */
	PhysicalPort getTargetPhysicalPort();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.cs.PhysicalLink#getTargetPhysicalPort <em>Target Physical Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Physical Port</em>' reference.
	 * @see #getTargetPhysicalPort()
	 * @generated
	 */
	void setTargetPhysicalPort(PhysicalPort value);

	/**
	 * Returns the value of the '<em><b>Realized Physical Links</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.cs.PhysicalLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realized Physical Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realized Physical Links</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.cs.CsPackage#getPhysicalLink_RealizedPhysicalLinks()
	 * @model
	 * @generated
	 */
	EList<PhysicalLink> getRealizedPhysicalLinks();

} // PhysicalLink
