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

package org.polarsys.capella.core.semantic.data.requirement.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.polarsys.capella.core.semantic.data.requirement.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RequirementFactoryImpl extends EFactoryImpl implements RequirementFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RequirementFactory init() {
		try {
			RequirementFactory theRequirementFactory = (RequirementFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.polarsys.org/capella/core/requirement/0.8.0/semantic"); 
			if (theRequirementFactory != null) {
				return theRequirementFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RequirementFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case RequirementPackage.REQUIREMENTS_PKG: return createRequirementsPkg();
			case RequirementPackage.REQUIREMENTS_TRACE: return createRequirementsTrace();
			case RequirementPackage.SYSTEM_FUNCTIONAL_INTERFACE_REQUIREMENT: return createSystemFunctionalInterfaceRequirement();
			case RequirementPackage.SYSTEM_FUNCTIONAL_REQUIREMENT: return createSystemFunctionalRequirement();
			case RequirementPackage.SYSTEM_NON_FUNCTIONAL_INTERFACE_REQUIREMENT: return createSystemNonFunctionalInterfaceRequirement();
			case RequirementPackage.SYSTEM_NON_FUNCTIONAL_REQUIREMENT: return createSystemNonFunctionalRequirement();
			case RequirementPackage.SYSTEM_USER_REQUIREMENT: return createSystemUserRequirement();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementsPkg createRequirementsPkg() {
		RequirementsPkgImpl requirementsPkg = new RequirementsPkgImpl();
		return requirementsPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementsTrace createRequirementsTrace() {
		RequirementsTraceImpl requirementsTrace = new RequirementsTraceImpl();
		return requirementsTrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemFunctionalInterfaceRequirement createSystemFunctionalInterfaceRequirement() {
		SystemFunctionalInterfaceRequirementImpl systemFunctionalInterfaceRequirement = new SystemFunctionalInterfaceRequirementImpl();
		return systemFunctionalInterfaceRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemFunctionalRequirement createSystemFunctionalRequirement() {
		SystemFunctionalRequirementImpl systemFunctionalRequirement = new SystemFunctionalRequirementImpl();
		return systemFunctionalRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemNonFunctionalInterfaceRequirement createSystemNonFunctionalInterfaceRequirement() {
		SystemNonFunctionalInterfaceRequirementImpl systemNonFunctionalInterfaceRequirement = new SystemNonFunctionalInterfaceRequirementImpl();
		return systemNonFunctionalInterfaceRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemNonFunctionalRequirement createSystemNonFunctionalRequirement() {
		SystemNonFunctionalRequirementImpl systemNonFunctionalRequirement = new SystemNonFunctionalRequirementImpl();
		return systemNonFunctionalRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemUserRequirement createSystemUserRequirement() {
		SystemUserRequirementImpl systemUserRequirement = new SystemUserRequirementImpl();
		return systemUserRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementPackage getRequirementPackage() {
		return (RequirementPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RequirementPackage getPackage() {
		return RequirementPackage.eINSTANCE;
	}

} //RequirementFactoryImpl
