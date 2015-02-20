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

package org.polarsys.capella.core.semantic.data.la.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.polarsys.capella.core.semantic.data.la.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LaFactoryImpl extends EFactoryImpl implements LaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LaFactory init() {
		try {
			LaFactory theLaFactory = (LaFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.polarsys.org/capella/core/la/0.8.0/semantic"); 
			if (theLaFactory != null) {
				return theLaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LaFactoryImpl() {
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
			case LaPackage.LOGICAL_ARCHITECTURE: return createLogicalArchitecture();
			case LaPackage.LOGICAL_FUNCTION: return createLogicalFunction();
			case LaPackage.LOGICAL_FUNCTION_PKG: return createLogicalFunctionPkg();
			case LaPackage.LOGICAL_COMPONENT: return createLogicalComponent();
			case LaPackage.LOGICAL_COMPONENT_PKG: return createLogicalComponentPkg();
			case LaPackage.CAPABILITY_REALIZATION: return createCapabilityRealization();
			case LaPackage.CAPABILITY_REALIZATION_PKG: return createCapabilityRealizationPkg();
			case LaPackage.LOGICAL_ACTOR_PKG: return createLogicalActorPkg();
			case LaPackage.LOGICAL_ACTOR: return createLogicalActor();
			case LaPackage.LOGICAL_CONTEXT: return createLogicalContext();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalArchitecture createLogicalArchitecture() {
		LogicalArchitectureImpl logicalArchitecture = new LogicalArchitectureImpl();
		return logicalArchitecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalFunction createLogicalFunction() {
		LogicalFunctionImpl logicalFunction = new LogicalFunctionImpl();
		return logicalFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalFunctionPkg createLogicalFunctionPkg() {
		LogicalFunctionPkgImpl logicalFunctionPkg = new LogicalFunctionPkgImpl();
		return logicalFunctionPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalComponent createLogicalComponent() {
		LogicalComponentImpl logicalComponent = new LogicalComponentImpl();
		return logicalComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalComponentPkg createLogicalComponentPkg() {
		LogicalComponentPkgImpl logicalComponentPkg = new LogicalComponentPkgImpl();
		return logicalComponentPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityRealization createCapabilityRealization() {
		CapabilityRealizationImpl capabilityRealization = new CapabilityRealizationImpl();
		return capabilityRealization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityRealizationPkg createCapabilityRealizationPkg() {
		CapabilityRealizationPkgImpl capabilityRealizationPkg = new CapabilityRealizationPkgImpl();
		return capabilityRealizationPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalActorPkg createLogicalActorPkg() {
		LogicalActorPkgImpl logicalActorPkg = new LogicalActorPkgImpl();
		return logicalActorPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalActor createLogicalActor() {
		LogicalActorImpl logicalActor = new LogicalActorImpl();
		return logicalActor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalContext createLogicalContext() {
		LogicalContextImpl logicalContext = new LogicalContextImpl();
		return logicalContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LaPackage getLaPackage() {
		return (LaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LaPackage getPackage() {
		return LaPackage.eINSTANCE;
	}

} //LaFactoryImpl
