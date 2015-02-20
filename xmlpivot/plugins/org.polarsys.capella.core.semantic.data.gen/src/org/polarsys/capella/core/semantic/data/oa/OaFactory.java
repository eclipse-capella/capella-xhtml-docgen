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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.polarsys.capella.core.semantic.data.oa.OaPackage
 * @generated
 */
public interface OaFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OaFactory eINSTANCE = org.polarsys.capella.core.semantic.data.oa.impl.OaFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Operational Analysis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operational Analysis</em>'.
	 * @generated
	 */
	OperationalAnalysis createOperationalAnalysis();

	/**
	 * Returns a new object of class '<em>Operational Activity Pkg</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operational Activity Pkg</em>'.
	 * @generated
	 */
	OperationalActivityPkg createOperationalActivityPkg();

	/**
	 * Returns a new object of class '<em>Operational Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operational Activity</em>'.
	 * @generated
	 */
	OperationalActivity createOperationalActivity();

	/**
	 * Returns a new object of class '<em>Operational Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operational Process</em>'.
	 * @generated
	 */
	OperationalProcess createOperationalProcess();

	/**
	 * Returns a new object of class '<em>Operational Capability Pkg</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operational Capability Pkg</em>'.
	 * @generated
	 */
	OperationalCapabilityPkg createOperationalCapabilityPkg();

	/**
	 * Returns a new object of class '<em>Operational Capability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operational Capability</em>'.
	 * @generated
	 */
	OperationalCapability createOperationalCapability();

	/**
	 * Returns a new object of class '<em>Role Pkg</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Pkg</em>'.
	 * @generated
	 */
	RolePkg createRolePkg();

	/**
	 * Returns a new object of class '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role</em>'.
	 * @generated
	 */
	Role createRole();

	/**
	 * Returns a new object of class '<em>Entity Pkg</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity Pkg</em>'.
	 * @generated
	 */
	EntityPkg createEntityPkg();

	/**
	 * Returns a new object of class '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity</em>'.
	 * @generated
	 */
	Entity createEntity();

	/**
	 * Returns a new object of class '<em>Operational Actor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operational Actor</em>'.
	 * @generated
	 */
	OperationalActor createOperationalActor();

	/**
	 * Returns a new object of class '<em>Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Location</em>'.
	 * @generated
	 */
	Location createLocation();

	/**
	 * Returns a new object of class '<em>Communication Mean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Communication Mean</em>'.
	 * @generated
	 */
	CommunicationMean createCommunicationMean();

	/**
	 * Returns a new object of class '<em>Operational Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operational Context</em>'.
	 * @generated
	 */
	OperationalContext createOperationalContext();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	OaPackage getOaPackage();

} //OaFactory
