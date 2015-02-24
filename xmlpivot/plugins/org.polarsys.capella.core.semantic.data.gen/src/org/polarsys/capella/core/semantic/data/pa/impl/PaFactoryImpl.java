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

package org.polarsys.capella.core.semantic.data.pa.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.polarsys.capella.core.semantic.data.pa.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PaFactoryImpl extends EFactoryImpl implements PaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PaFactory init() {
		try {
			PaFactory thePaFactory = (PaFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.polarsys.org/capella/core/pa/0.8.0/semantic"); 
			if (thePaFactory != null) {
				return thePaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaFactoryImpl() {
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
			case PaPackage.PHYSICAL_ARCHITECTURE: return createPhysicalArchitecture();
			case PaPackage.PHYSICAL_FUNCTION: return createPhysicalFunction();
			case PaPackage.PHYSICAL_FUNCTION_PKG: return createPhysicalFunctionPkg();
			case PaPackage.PHYSICAL_COMPONENT: return createPhysicalComponent();
			case PaPackage.PHYSICAL_ACTOR_PKG: return createPhysicalActorPkg();
			case PaPackage.PHYSICAL_COMPONENT_PKG: return createPhysicalComponentPkg();
			case PaPackage.PHYSICAL_ACTOR: return createPhysicalActor();
			case PaPackage.PHYSICAL_NODE: return createPhysicalNode();
			case PaPackage.PHYSICAL_CONTEXT: return createPhysicalContext();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case PaPackage.PHYSICAL_COMPONENT_KIND:
				return createPhysicalComponentKindFromString(eDataType, initialValue);
			case PaPackage.PHYSICAL_COMPONENT_NATURE:
				return createPhysicalComponentNatureFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case PaPackage.PHYSICAL_COMPONENT_KIND:
				return convertPhysicalComponentKindToString(eDataType, instanceValue);
			case PaPackage.PHYSICAL_COMPONENT_NATURE:
				return convertPhysicalComponentNatureToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalArchitecture createPhysicalArchitecture() {
		PhysicalArchitectureImpl physicalArchitecture = new PhysicalArchitectureImpl();
		return physicalArchitecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalFunction createPhysicalFunction() {
		PhysicalFunctionImpl physicalFunction = new PhysicalFunctionImpl();
		return physicalFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalFunctionPkg createPhysicalFunctionPkg() {
		PhysicalFunctionPkgImpl physicalFunctionPkg = new PhysicalFunctionPkgImpl();
		return physicalFunctionPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalComponent createPhysicalComponent() {
		PhysicalComponentImpl physicalComponent = new PhysicalComponentImpl();
		return physicalComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalActorPkg createPhysicalActorPkg() {
		PhysicalActorPkgImpl physicalActorPkg = new PhysicalActorPkgImpl();
		return physicalActorPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalComponentPkg createPhysicalComponentPkg() {
		PhysicalComponentPkgImpl physicalComponentPkg = new PhysicalComponentPkgImpl();
		return physicalComponentPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalActor createPhysicalActor() {
		PhysicalActorImpl physicalActor = new PhysicalActorImpl();
		return physicalActor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalNode createPhysicalNode() {
		PhysicalNodeImpl physicalNode = new PhysicalNodeImpl();
		return physicalNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalContext createPhysicalContext() {
		PhysicalContextImpl physicalContext = new PhysicalContextImpl();
		return physicalContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalComponentKind createPhysicalComponentKindFromString(EDataType eDataType, String initialValue) {
		PhysicalComponentKind result = PhysicalComponentKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPhysicalComponentKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalComponentNature createPhysicalComponentNatureFromString(EDataType eDataType, String initialValue) {
		PhysicalComponentNature result = PhysicalComponentNature.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPhysicalComponentNatureToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaPackage getPaPackage() {
		return (PaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PaPackage getPackage() {
		return PaPackage.eINSTANCE;
	}

} //PaFactoryImpl
