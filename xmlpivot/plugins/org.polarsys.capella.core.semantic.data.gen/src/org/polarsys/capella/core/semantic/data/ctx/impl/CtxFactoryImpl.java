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

package org.polarsys.capella.core.semantic.data.ctx.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.polarsys.capella.core.semantic.data.ctx.Actor;
import org.polarsys.capella.core.semantic.data.ctx.ActorPkg;
import org.polarsys.capella.core.semantic.data.ctx.Capability;
import org.polarsys.capella.core.semantic.data.ctx.CapabilityPkg;
import org.polarsys.capella.core.semantic.data.ctx.CtxFactory;
import org.polarsys.capella.core.semantic.data.ctx.CtxPackage;
import org.polarsys.capella.core.semantic.data.ctx.Mission;
import org.polarsys.capella.core.semantic.data.ctx.MissionPkg;
import org.polarsys.capella.core.semantic.data.ctx.SystemAnalysis;
import org.polarsys.capella.core.semantic.data.ctx.SystemContext;
import org.polarsys.capella.core.semantic.data.ctx.SystemFunction;
import org.polarsys.capella.core.semantic.data.ctx.SystemFunctionPkg;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CtxFactoryImpl extends EFactoryImpl implements CtxFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CtxFactory init() {
		try {
			CtxFactory theCtxFactory = (CtxFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.polarsys.org/capella/core/ctx/0.8.0/semantic"); 
			if (theCtxFactory != null) {
				return theCtxFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CtxFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtxFactoryImpl() {
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
			case CtxPackage.SYSTEM_ANALYSIS: return createSystemAnalysis();
			case CtxPackage.SYSTEM: return createSystem();
			case CtxPackage.SYSTEM_FUNCTION: return createSystemFunction();
			case CtxPackage.SYSTEM_FUNCTION_PKG: return createSystemFunctionPkg();
			case CtxPackage.ACTOR: return createActor();
			case CtxPackage.ACTOR_PKG: return createActorPkg();
			case CtxPackage.MISSION: return createMission();
			case CtxPackage.MISSION_PKG: return createMissionPkg();
			case CtxPackage.CAPABILITY: return createCapability();
			case CtxPackage.CAPABILITY_PKG: return createCapabilityPkg();
			case CtxPackage.SYSTEM_CONTEXT: return createSystemContext();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemAnalysis createSystemAnalysis() {
		SystemAnalysisImpl systemAnalysis = new SystemAnalysisImpl();
		return systemAnalysis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.polarsys.capella.core.semantic.data.ctx.System createSystem() {
		SystemImpl system = new SystemImpl();
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemFunction createSystemFunction() {
		SystemFunctionImpl systemFunction = new SystemFunctionImpl();
		return systemFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemFunctionPkg createSystemFunctionPkg() {
		SystemFunctionPkgImpl systemFunctionPkg = new SystemFunctionPkgImpl();
		return systemFunctionPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor createActor() {
		ActorImpl actor = new ActorImpl();
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActorPkg createActorPkg() {
		ActorPkgImpl actorPkg = new ActorPkgImpl();
		return actorPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mission createMission() {
		MissionImpl mission = new MissionImpl();
		return mission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MissionPkg createMissionPkg() {
		MissionPkgImpl missionPkg = new MissionPkgImpl();
		return missionPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Capability createCapability() {
		CapabilityImpl capability = new CapabilityImpl();
		return capability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityPkg createCapabilityPkg() {
		CapabilityPkgImpl capabilityPkg = new CapabilityPkgImpl();
		return capabilityPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemContext createSystemContext() {
		SystemContextImpl systemContext = new SystemContextImpl();
		return systemContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtxPackage getCtxPackage() {
		return (CtxPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CtxPackage getPackage() {
		return CtxPackage.eINSTANCE;
	}

} //CtxFactoryImpl
