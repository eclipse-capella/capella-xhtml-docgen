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

package org.polarsys.capella.core.semantic.data.oa.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.polarsys.capella.core.semantic.data.oa.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OaFactoryImpl extends EFactoryImpl implements OaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OaFactory init() {
		try {
			OaFactory theOaFactory = (OaFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.polarsys.org/capella/core/oa/0.8.0/semantic"); 
			if (theOaFactory != null) {
				return theOaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OaFactoryImpl() {
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
			case OaPackage.OPERATIONAL_ANALYSIS: return createOperationalAnalysis();
			case OaPackage.OPERATIONAL_ACTIVITY_PKG: return createOperationalActivityPkg();
			case OaPackage.OPERATIONAL_ACTIVITY: return createOperationalActivity();
			case OaPackage.OPERATIONAL_PROCESS: return createOperationalProcess();
			case OaPackage.OPERATIONAL_CAPABILITY_PKG: return createOperationalCapabilityPkg();
			case OaPackage.OPERATIONAL_CAPABILITY: return createOperationalCapability();
			case OaPackage.ROLE_PKG: return createRolePkg();
			case OaPackage.ROLE: return createRole();
			case OaPackage.ENTITY_PKG: return createEntityPkg();
			case OaPackage.ENTITY: return createEntity();
			case OaPackage.OPERATIONAL_ACTOR: return createOperationalActor();
			case OaPackage.LOCATION: return createLocation();
			case OaPackage.COMMUNICATION_MEAN: return createCommunicationMean();
			case OaPackage.OPERATIONAL_CONTEXT: return createOperationalContext();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalAnalysis createOperationalAnalysis() {
		OperationalAnalysisImpl operationalAnalysis = new OperationalAnalysisImpl();
		return operationalAnalysis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalActivityPkg createOperationalActivityPkg() {
		OperationalActivityPkgImpl operationalActivityPkg = new OperationalActivityPkgImpl();
		return operationalActivityPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalActivity createOperationalActivity() {
		OperationalActivityImpl operationalActivity = new OperationalActivityImpl();
		return operationalActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalProcess createOperationalProcess() {
		OperationalProcessImpl operationalProcess = new OperationalProcessImpl();
		return operationalProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalCapabilityPkg createOperationalCapabilityPkg() {
		OperationalCapabilityPkgImpl operationalCapabilityPkg = new OperationalCapabilityPkgImpl();
		return operationalCapabilityPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalCapability createOperationalCapability() {
		OperationalCapabilityImpl operationalCapability = new OperationalCapabilityImpl();
		return operationalCapability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RolePkg createRolePkg() {
		RolePkgImpl rolePkg = new RolePkgImpl();
		return rolePkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role createRole() {
		RoleImpl role = new RoleImpl();
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityPkg createEntityPkg() {
		EntityPkgImpl entityPkg = new EntityPkgImpl();
		return entityPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity createEntity() {
		EntityImpl entity = new EntityImpl();
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalActor createOperationalActor() {
		OperationalActorImpl operationalActor = new OperationalActorImpl();
		return operationalActor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location createLocation() {
		LocationImpl location = new LocationImpl();
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationMean createCommunicationMean() {
		CommunicationMeanImpl communicationMean = new CommunicationMeanImpl();
		return communicationMean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalContext createOperationalContext() {
		OperationalContextImpl operationalContext = new OperationalContextImpl();
		return operationalContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OaPackage getOaPackage() {
		return (OaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OaPackage getPackage() {
		return OaPackage.eINSTANCE;
	}

} //OaFactoryImpl
