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

package org.polarsys.capella.core.semantic.data.cs.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.polarsys.capella.core.semantic.data.activity.ActivityPackage;

import org.polarsys.capella.core.semantic.data.activity.impl.ActivityPackageImpl;

import org.polarsys.capella.core.semantic.data.behavior.BehaviorPackage;

import org.polarsys.capella.core.semantic.data.behavior.impl.BehaviorPackageImpl;

import org.polarsys.capella.core.semantic.data.capellacommon.CapellacommonPackage;

import org.polarsys.capella.core.semantic.data.capellacommon.impl.CapellacommonPackageImpl;

import org.polarsys.capella.core.semantic.data.capellacore.CapellacorePackage;

import org.polarsys.capella.core.semantic.data.capellacore.impl.CapellacorePackageImpl;

import org.polarsys.capella.core.semantic.data.capellamodeller.CapellamodellerPackage;

import org.polarsys.capella.core.semantic.data.capellamodeller.impl.CapellamodellerPackageImpl;

import org.polarsys.capella.core.semantic.data.cs.AbstractActor;
import org.polarsys.capella.core.semantic.data.cs.AbstractDeploymentLink;
import org.polarsys.capella.core.semantic.data.cs.AbstractPathInvolvedElement;
import org.polarsys.capella.core.semantic.data.cs.AbstractPhysicalArtifact;
import org.polarsys.capella.core.semantic.data.cs.AbstractPhysicalLinkEnd;
import org.polarsys.capella.core.semantic.data.cs.Block;
import org.polarsys.capella.core.semantic.data.cs.BlockArchitecture;
import org.polarsys.capella.core.semantic.data.cs.Component;
import org.polarsys.capella.core.semantic.data.cs.CsFactory;
import org.polarsys.capella.core.semantic.data.cs.CsPackage;
import org.polarsys.capella.core.semantic.data.cs.DeployableElement;
import org.polarsys.capella.core.semantic.data.cs.DeploymentTarget;
import org.polarsys.capella.core.semantic.data.cs.ExchangeItemAllocation;
import org.polarsys.capella.core.semantic.data.cs.Interface;
import org.polarsys.capella.core.semantic.data.cs.InterfacePkg;
import org.polarsys.capella.core.semantic.data.cs.Part;
import org.polarsys.capella.core.semantic.data.cs.PhysicalLink;
import org.polarsys.capella.core.semantic.data.cs.PhysicalLinkCategory;
import org.polarsys.capella.core.semantic.data.cs.PhysicalLinkEnd;
import org.polarsys.capella.core.semantic.data.cs.PhysicalPath;
import org.polarsys.capella.core.semantic.data.cs.PhysicalPathInvolvement;
import org.polarsys.capella.core.semantic.data.cs.PhysicalPathReference;
import org.polarsys.capella.core.semantic.data.cs.PhysicalPort;
import org.polarsys.capella.core.semantic.data.cs.SystemComponent;

import org.polarsys.capella.core.semantic.data.ctx.CtxPackage;

import org.polarsys.capella.core.semantic.data.ctx.impl.CtxPackageImpl;

import org.polarsys.capella.core.semantic.data.emde.EmdePackage;

import org.polarsys.capella.core.semantic.data.emde.impl.EmdePackageImpl;

import org.polarsys.capella.core.semantic.data.epbs.EpbsPackage;

import org.polarsys.capella.core.semantic.data.epbs.impl.EpbsPackageImpl;

import org.polarsys.capella.core.semantic.data.fa.FaPackage;

import org.polarsys.capella.core.semantic.data.fa.impl.FaPackageImpl;

import org.polarsys.capella.core.semantic.data.information.InformationPackage;

import org.polarsys.capella.core.semantic.data.information.communication.CommunicationPackage;

import org.polarsys.capella.core.semantic.data.information.communication.impl.CommunicationPackageImpl;

import org.polarsys.capella.core.semantic.data.information.datatype.DatatypePackage;

import org.polarsys.capella.core.semantic.data.information.datatype.impl.DatatypePackageImpl;

import org.polarsys.capella.core.semantic.data.information.datavalue.DatavaluePackage;

import org.polarsys.capella.core.semantic.data.information.datavalue.impl.DatavaluePackageImpl;

import org.polarsys.capella.core.semantic.data.information.impl.InformationPackageImpl;

import org.polarsys.capella.core.semantic.data.interaction.InteractionPackage;

import org.polarsys.capella.core.semantic.data.interaction.impl.InteractionPackageImpl;

import org.polarsys.capella.core.semantic.data.la.LaPackage;

import org.polarsys.capella.core.semantic.data.la.impl.LaPackageImpl;

import org.polarsys.capella.core.semantic.data.modellingcore.ModellingcorePackage;

import org.polarsys.capella.core.semantic.data.modellingcore.impl.ModellingcorePackageImpl;

import org.polarsys.capella.core.semantic.data.oa.OaPackage;

import org.polarsys.capella.core.semantic.data.oa.impl.OaPackageImpl;

import org.polarsys.capella.core.semantic.data.pa.PaPackage;

import org.polarsys.capella.core.semantic.data.pa.deployment.DeploymentPackage;

import org.polarsys.capella.core.semantic.data.pa.deployment.impl.DeploymentPackageImpl;

import org.polarsys.capella.core.semantic.data.pa.impl.PaPackageImpl;

import org.polarsys.capella.core.semantic.data.requirement.RequirementPackage;

import org.polarsys.capella.core.semantic.data.requirement.impl.RequirementPackageImpl;

import org.polarsys.capella.core.semantic.data.sharedmodel.SharedmodelPackage;

import org.polarsys.capella.core.semantic.data.sharedmodel.impl.SharedmodelPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CsPackageImpl extends EPackageImpl implements CsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockArchitectureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractActorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfacePkgEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exchangeItemAllocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deployableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deploymentTargetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractDeploymentLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractPathInvolvedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractPhysicalArtifactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractPhysicalLinkEndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalLinkCategoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalLinkEndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalPathEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalPathInvolvementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalPathReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalPortEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.polarsys.capella.core.semantic.data.cs.CsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CsPackageImpl() {
		super(eNS_URI, CsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link CsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CsPackage init() {
		if (isInited) return (CsPackage)EPackage.Registry.INSTANCE.getEPackage(CsPackage.eNS_URI);

		// Obtain or create and register package
		CsPackageImpl theCsPackage = (CsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		PaPackageImpl thePaPackage = (PaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PaPackage.eNS_URI) instanceof PaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PaPackage.eNS_URI) : PaPackage.eINSTANCE);
		DeploymentPackageImpl theDeploymentPackage = (DeploymentPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DeploymentPackage.eNS_URI) instanceof DeploymentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DeploymentPackage.eNS_URI) : DeploymentPackage.eINSTANCE);
		InformationPackageImpl theInformationPackage = (InformationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InformationPackage.eNS_URI) instanceof InformationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InformationPackage.eNS_URI) : InformationPackage.eINSTANCE);
		CommunicationPackageImpl theCommunicationPackage = (CommunicationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommunicationPackage.eNS_URI) instanceof CommunicationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommunicationPackage.eNS_URI) : CommunicationPackage.eINSTANCE);
		DatatypePackageImpl theDatatypePackage = (DatatypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatatypePackage.eNS_URI) instanceof DatatypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatatypePackage.eNS_URI) : DatatypePackage.eINSTANCE);
		DatavaluePackageImpl theDatavaluePackage = (DatavaluePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatavaluePackage.eNS_URI) instanceof DatavaluePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatavaluePackage.eNS_URI) : DatavaluePackage.eINSTANCE);
		BehaviorPackageImpl theBehaviorPackage = (BehaviorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) instanceof BehaviorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) : BehaviorPackage.eINSTANCE);
		CapellamodellerPackageImpl theCapellamodellerPackage = (CapellamodellerPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CapellamodellerPackage.eNS_URI) instanceof CapellamodellerPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CapellamodellerPackage.eNS_URI) : CapellamodellerPackage.eINSTANCE);
		FaPackageImpl theFaPackage = (FaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FaPackage.eNS_URI) instanceof FaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FaPackage.eNS_URI) : FaPackage.eINSTANCE);
		OaPackageImpl theOaPackage = (OaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OaPackage.eNS_URI) instanceof OaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OaPackage.eNS_URI) : OaPackage.eINSTANCE);
		RequirementPackageImpl theRequirementPackage = (RequirementPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RequirementPackage.eNS_URI) instanceof RequirementPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RequirementPackage.eNS_URI) : RequirementPackage.eINSTANCE);
		InteractionPackageImpl theInteractionPackage = (InteractionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InteractionPackage.eNS_URI) instanceof InteractionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InteractionPackage.eNS_URI) : InteractionPackage.eINSTANCE);
		CapellacorePackageImpl theCapellacorePackage = (CapellacorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CapellacorePackage.eNS_URI) instanceof CapellacorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CapellacorePackage.eNS_URI) : CapellacorePackage.eINSTANCE);
		SharedmodelPackageImpl theSharedmodelPackage = (SharedmodelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SharedmodelPackage.eNS_URI) instanceof SharedmodelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SharedmodelPackage.eNS_URI) : SharedmodelPackage.eINSTANCE);
		CapellacommonPackageImpl theCapellacommonPackage = (CapellacommonPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CapellacommonPackage.eNS_URI) instanceof CapellacommonPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CapellacommonPackage.eNS_URI) : CapellacommonPackage.eINSTANCE);
		ActivityPackageImpl theActivityPackage = (ActivityPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ActivityPackage.eNS_URI) instanceof ActivityPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ActivityPackage.eNS_URI) : ActivityPackage.eINSTANCE);
		EmdePackageImpl theEmdePackage = (EmdePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EmdePackage.eNS_URI) instanceof EmdePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EmdePackage.eNS_URI) : EmdePackage.eINSTANCE);
		ModellingcorePackageImpl theModellingcorePackage = (ModellingcorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ModellingcorePackage.eNS_URI) instanceof ModellingcorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ModellingcorePackage.eNS_URI) : ModellingcorePackage.eINSTANCE);
		LaPackageImpl theLaPackage = (LaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LaPackage.eNS_URI) instanceof LaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LaPackage.eNS_URI) : LaPackage.eINSTANCE);
		CtxPackageImpl theCtxPackage = (CtxPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CtxPackage.eNS_URI) instanceof CtxPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CtxPackage.eNS_URI) : CtxPackage.eINSTANCE);
		EpbsPackageImpl theEpbsPackage = (EpbsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EpbsPackage.eNS_URI) instanceof EpbsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EpbsPackage.eNS_URI) : EpbsPackage.eINSTANCE);

		// Create package meta-data objects
		theCsPackage.createPackageContents();
		thePaPackage.createPackageContents();
		theDeploymentPackage.createPackageContents();
		theInformationPackage.createPackageContents();
		theCommunicationPackage.createPackageContents();
		theDatatypePackage.createPackageContents();
		theDatavaluePackage.createPackageContents();
		theBehaviorPackage.createPackageContents();
		theCapellamodellerPackage.createPackageContents();
		theFaPackage.createPackageContents();
		theOaPackage.createPackageContents();
		theRequirementPackage.createPackageContents();
		theInteractionPackage.createPackageContents();
		theCapellacorePackage.createPackageContents();
		theSharedmodelPackage.createPackageContents();
		theCapellacommonPackage.createPackageContents();
		theActivityPackage.createPackageContents();
		theEmdePackage.createPackageContents();
		theModellingcorePackage.createPackageContents();
		theLaPackage.createPackageContents();
		theCtxPackage.createPackageContents();
		theEpbsPackage.createPackageContents();

		// Initialize created meta-data
		theCsPackage.initializePackageContents();
		thePaPackage.initializePackageContents();
		theDeploymentPackage.initializePackageContents();
		theInformationPackage.initializePackageContents();
		theCommunicationPackage.initializePackageContents();
		theDatatypePackage.initializePackageContents();
		theDatavaluePackage.initializePackageContents();
		theBehaviorPackage.initializePackageContents();
		theCapellamodellerPackage.initializePackageContents();
		theFaPackage.initializePackageContents();
		theOaPackage.initializePackageContents();
		theRequirementPackage.initializePackageContents();
		theInteractionPackage.initializePackageContents();
		theCapellacorePackage.initializePackageContents();
		theSharedmodelPackage.initializePackageContents();
		theCapellacommonPackage.initializePackageContents();
		theActivityPackage.initializePackageContents();
		theEmdePackage.initializePackageContents();
		theModellingcorePackage.initializePackageContents();
		theLaPackage.initializePackageContents();
		theCtxPackage.initializePackageContents();
		theEpbsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CsPackage.eNS_URI, theCsPackage);
		return theCsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlockArchitecture() {
		return blockArchitectureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlockArchitecture_OwnedRequirementPkgs() {
		return (EReference)blockArchitectureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlockArchitecture_OwnedInterfacePkg() {
		return (EReference)blockArchitectureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlockArchitecture_OwnedDataPkg() {
		return (EReference)blockArchitectureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlock() {
		return blockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlock_OwnedAbstractCapabilityPkg() {
		return (EReference)blockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlock_OwnedInterfacePkg() {
		return (EReference)blockEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlock_OwnedDataPkg() {
		return (EReference)blockEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlock_OwnedStateMachines() {
		return (EReference)blockEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponent() {
		return componentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_UsedInterfaces() {
		return (EReference)componentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_ImplementedInterfaces() {
		return (EReference)componentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_AllocatedComponents() {
		return (EReference)componentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_ProvidedInterfaces() {
		return (EReference)componentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_RequiredInterfaces() {
		return (EReference)componentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_ContainedComponentPorts() {
		return (EReference)componentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_ContainedParts() {
		return (EReference)componentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_ContainedPhysicalPorts() {
		return (EReference)componentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_OwnedPhysicalPath() {
		return (EReference)componentEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_OwnedPhysicalLinks() {
		return (EReference)componentEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_OwnedPhysicalLinkCategories() {
		return (EReference)componentEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractActor() {
		return abstractActorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPart() {
		return partEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPart_DeployedParts() {
		return (EReference)partEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPart_OwnedAbstractType() {
		return (EReference)partEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemComponent() {
		return systemComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemComponent_DataComponent() {
		return (EAttribute)systemComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfacePkg() {
		return interfacePkgEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfacePkg_OwnedInterfaces() {
		return (EReference)interfacePkgEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfacePkg_OwnedInterfacePkgs() {
		return (EReference)interfacePkgEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterface() {
		return interfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterface_Mechanism() {
		return (EAttribute)interfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_OwnedExchangeItemAllocations() {
		return (EReference)interfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_RealizedContextInterfaces() {
		return (EReference)interfaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_RealizedLogicalInterfaces() {
		return (EReference)interfaceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExchangeItemAllocation() {
		return exchangeItemAllocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExchangeItemAllocation_SendProtocol() {
		return (EAttribute)exchangeItemAllocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExchangeItemAllocation_ReceiveProtocol() {
		return (EAttribute)exchangeItemAllocationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExchangeItemAllocation_AllocatedItem() {
		return (EReference)exchangeItemAllocationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeployableElement() {
		return deployableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeploymentTarget() {
		return deploymentTargetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractDeploymentLink() {
		return abstractDeploymentLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractDeploymentLink_DeployedElement() {
		return (EReference)abstractDeploymentLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractDeploymentLink_Location() {
		return (EReference)abstractDeploymentLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractPathInvolvedElement() {
		return abstractPathInvolvedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractPhysicalArtifact() {
		return abstractPhysicalArtifactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractPhysicalLinkEnd() {
		return abstractPhysicalLinkEndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractPhysicalLinkEnd_InvolvedLinks() {
		return (EReference)abstractPhysicalLinkEndEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicalLink() {
		return physicalLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalLink_LinkEnds() {
		return (EReference)physicalLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalLink_OwnedPhysicalLinkEnds() {
		return (EReference)physicalLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalLink_Categories() {
		return (EReference)physicalLinkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalLink_SourcePhysicalPort() {
		return (EReference)physicalLinkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalLink_TargetPhysicalPort() {
		return (EReference)physicalLinkEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalLink_RealizedPhysicalLinks() {
		return (EReference)physicalLinkEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicalLinkCategory() {
		return physicalLinkCategoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicalLinkEnd() {
		return physicalLinkEndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalLinkEnd_Port() {
		return (EReference)physicalLinkEndEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalLinkEnd_Part() {
		return (EReference)physicalLinkEndEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicalPath() {
		return physicalPathEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalPath_OwnedPhysicalPathInvolvements() {
		return (EReference)physicalPathEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalPath_FirstPhysicalPathInvolvements() {
		return (EReference)physicalPathEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalPath_RealizedPhysicalPaths() {
		return (EReference)physicalPathEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicalPathInvolvement() {
		return physicalPathInvolvementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalPathInvolvement_NextInvolvements() {
		return (EReference)physicalPathInvolvementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalPathInvolvement_InvolvedElement() {
		return (EReference)physicalPathInvolvementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicalPathReference() {
		return physicalPathReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalPathReference_ReferencedPhysicalPath() {
		return (EReference)physicalPathReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicalPort() {
		return physicalPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalPort_AllocatedComponentPorts() {
		return (EReference)physicalPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalPort_RealizedPhysicalPorts() {
		return (EReference)physicalPortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CsFactory getCsFactory() {
		return (CsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		blockArchitectureEClass = createEClass(BLOCK_ARCHITECTURE);
		createEReference(blockArchitectureEClass, BLOCK_ARCHITECTURE__OWNED_REQUIREMENT_PKGS);
		createEReference(blockArchitectureEClass, BLOCK_ARCHITECTURE__OWNED_INTERFACE_PKG);
		createEReference(blockArchitectureEClass, BLOCK_ARCHITECTURE__OWNED_DATA_PKG);

		blockEClass = createEClass(BLOCK);
		createEReference(blockEClass, BLOCK__OWNED_ABSTRACT_CAPABILITY_PKG);
		createEReference(blockEClass, BLOCK__OWNED_INTERFACE_PKG);
		createEReference(blockEClass, BLOCK__OWNED_DATA_PKG);
		createEReference(blockEClass, BLOCK__OWNED_STATE_MACHINES);

		componentEClass = createEClass(COMPONENT);
		createEReference(componentEClass, COMPONENT__USED_INTERFACES);
		createEReference(componentEClass, COMPONENT__IMPLEMENTED_INTERFACES);
		createEReference(componentEClass, COMPONENT__ALLOCATED_COMPONENTS);
		createEReference(componentEClass, COMPONENT__PROVIDED_INTERFACES);
		createEReference(componentEClass, COMPONENT__REQUIRED_INTERFACES);
		createEReference(componentEClass, COMPONENT__CONTAINED_COMPONENT_PORTS);
		createEReference(componentEClass, COMPONENT__CONTAINED_PARTS);
		createEReference(componentEClass, COMPONENT__CONTAINED_PHYSICAL_PORTS);
		createEReference(componentEClass, COMPONENT__OWNED_PHYSICAL_PATH);
		createEReference(componentEClass, COMPONENT__OWNED_PHYSICAL_LINKS);
		createEReference(componentEClass, COMPONENT__OWNED_PHYSICAL_LINK_CATEGORIES);

		abstractActorEClass = createEClass(ABSTRACT_ACTOR);

		partEClass = createEClass(PART);
		createEReference(partEClass, PART__DEPLOYED_PARTS);
		createEReference(partEClass, PART__OWNED_ABSTRACT_TYPE);

		systemComponentEClass = createEClass(SYSTEM_COMPONENT);
		createEAttribute(systemComponentEClass, SYSTEM_COMPONENT__DATA_COMPONENT);

		interfacePkgEClass = createEClass(INTERFACE_PKG);
		createEReference(interfacePkgEClass, INTERFACE_PKG__OWNED_INTERFACES);
		createEReference(interfacePkgEClass, INTERFACE_PKG__OWNED_INTERFACE_PKGS);

		interfaceEClass = createEClass(INTERFACE);
		createEAttribute(interfaceEClass, INTERFACE__MECHANISM);
		createEReference(interfaceEClass, INTERFACE__OWNED_EXCHANGE_ITEM_ALLOCATIONS);
		createEReference(interfaceEClass, INTERFACE__REALIZED_CONTEXT_INTERFACES);
		createEReference(interfaceEClass, INTERFACE__REALIZED_LOGICAL_INTERFACES);

		exchangeItemAllocationEClass = createEClass(EXCHANGE_ITEM_ALLOCATION);
		createEAttribute(exchangeItemAllocationEClass, EXCHANGE_ITEM_ALLOCATION__SEND_PROTOCOL);
		createEAttribute(exchangeItemAllocationEClass, EXCHANGE_ITEM_ALLOCATION__RECEIVE_PROTOCOL);
		createEReference(exchangeItemAllocationEClass, EXCHANGE_ITEM_ALLOCATION__ALLOCATED_ITEM);

		deployableElementEClass = createEClass(DEPLOYABLE_ELEMENT);

		deploymentTargetEClass = createEClass(DEPLOYMENT_TARGET);

		abstractDeploymentLinkEClass = createEClass(ABSTRACT_DEPLOYMENT_LINK);
		createEReference(abstractDeploymentLinkEClass, ABSTRACT_DEPLOYMENT_LINK__DEPLOYED_ELEMENT);
		createEReference(abstractDeploymentLinkEClass, ABSTRACT_DEPLOYMENT_LINK__LOCATION);

		abstractPathInvolvedElementEClass = createEClass(ABSTRACT_PATH_INVOLVED_ELEMENT);

		abstractPhysicalArtifactEClass = createEClass(ABSTRACT_PHYSICAL_ARTIFACT);

		abstractPhysicalLinkEndEClass = createEClass(ABSTRACT_PHYSICAL_LINK_END);
		createEReference(abstractPhysicalLinkEndEClass, ABSTRACT_PHYSICAL_LINK_END__INVOLVED_LINKS);

		physicalLinkEClass = createEClass(PHYSICAL_LINK);
		createEReference(physicalLinkEClass, PHYSICAL_LINK__LINK_ENDS);
		createEReference(physicalLinkEClass, PHYSICAL_LINK__OWNED_PHYSICAL_LINK_ENDS);
		createEReference(physicalLinkEClass, PHYSICAL_LINK__CATEGORIES);
		createEReference(physicalLinkEClass, PHYSICAL_LINK__SOURCE_PHYSICAL_PORT);
		createEReference(physicalLinkEClass, PHYSICAL_LINK__TARGET_PHYSICAL_PORT);
		createEReference(physicalLinkEClass, PHYSICAL_LINK__REALIZED_PHYSICAL_LINKS);

		physicalLinkCategoryEClass = createEClass(PHYSICAL_LINK_CATEGORY);

		physicalLinkEndEClass = createEClass(PHYSICAL_LINK_END);
		createEReference(physicalLinkEndEClass, PHYSICAL_LINK_END__PORT);
		createEReference(physicalLinkEndEClass, PHYSICAL_LINK_END__PART);

		physicalPathEClass = createEClass(PHYSICAL_PATH);
		createEReference(physicalPathEClass, PHYSICAL_PATH__OWNED_PHYSICAL_PATH_INVOLVEMENTS);
		createEReference(physicalPathEClass, PHYSICAL_PATH__FIRST_PHYSICAL_PATH_INVOLVEMENTS);
		createEReference(physicalPathEClass, PHYSICAL_PATH__REALIZED_PHYSICAL_PATHS);

		physicalPathInvolvementEClass = createEClass(PHYSICAL_PATH_INVOLVEMENT);
		createEReference(physicalPathInvolvementEClass, PHYSICAL_PATH_INVOLVEMENT__NEXT_INVOLVEMENTS);
		createEReference(physicalPathInvolvementEClass, PHYSICAL_PATH_INVOLVEMENT__INVOLVED_ELEMENT);

		physicalPathReferenceEClass = createEClass(PHYSICAL_PATH_REFERENCE);
		createEReference(physicalPathReferenceEClass, PHYSICAL_PATH_REFERENCE__REFERENCED_PHYSICAL_PATH);

		physicalPortEClass = createEClass(PHYSICAL_PORT);
		createEReference(physicalPortEClass, PHYSICAL_PORT__ALLOCATED_COMPONENT_PORTS);
		createEReference(physicalPortEClass, PHYSICAL_PORT__REALIZED_PHYSICAL_PORTS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		FaPackage theFaPackage = (FaPackage)EPackage.Registry.INSTANCE.getEPackage(FaPackage.eNS_URI);
		RequirementPackage theRequirementPackage = (RequirementPackage)EPackage.Registry.INSTANCE.getEPackage(RequirementPackage.eNS_URI);
		InformationPackage theInformationPackage = (InformationPackage)EPackage.Registry.INSTANCE.getEPackage(InformationPackage.eNS_URI);
		CapellacorePackage theCapellacorePackage = (CapellacorePackage)EPackage.Registry.INSTANCE.getEPackage(CapellacorePackage.eNS_URI);
		CapellacommonPackage theCapellacommonPackage = (CapellacommonPackage)EPackage.Registry.INSTANCE.getEPackage(CapellacommonPackage.eNS_URI);
		CommunicationPackage theCommunicationPackage = (CommunicationPackage)EPackage.Registry.INSTANCE.getEPackage(CommunicationPackage.eNS_URI);
		ModellingcorePackage theModellingcorePackage = (ModellingcorePackage)EPackage.Registry.INSTANCE.getEPackage(ModellingcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		blockArchitectureEClass.getESuperTypes().add(theFaPackage.getAbstractFunctionalArchitecture());
		blockEClass.getESuperTypes().add(theFaPackage.getAbstractFunctionalBlock());
		blockEClass.getESuperTypes().add(theCapellacorePackage.getType());
		componentEClass.getESuperTypes().add(this.getBlock());
		componentEClass.getESuperTypes().add(theInformationPackage.getPartitionableElement());
		componentEClass.getESuperTypes().add(theCommunicationPackage.getCommunicationLinkExchanger());
		componentEClass.getESuperTypes().add(theCapellacorePackage.getCapellaElement());
		abstractActorEClass.getESuperTypes().add(this.getComponent());
		abstractActorEClass.getESuperTypes().add(theCapellacorePackage.getInvolvedElement());
		partEClass.getESuperTypes().add(theInformationPackage.getPartition());
		partEClass.getESuperTypes().add(theModellingcorePackage.getInformationsExchanger());
		partEClass.getESuperTypes().add(this.getDeployableElement());
		partEClass.getESuperTypes().add(this.getDeploymentTarget());
		partEClass.getESuperTypes().add(this.getAbstractPathInvolvedElement());
		systemComponentEClass.getESuperTypes().add(this.getComponent());
		systemComponentEClass.getESuperTypes().add(theCapellacorePackage.getInvolvedElement());
		interfacePkgEClass.getESuperTypes().add(theCommunicationPackage.getMessageReferencePkg());
		interfacePkgEClass.getESuperTypes().add(theCapellacorePackage.getAbstractExchangeItemPkg());
		interfacePkgEClass.getESuperTypes().add(theCapellacorePackage.getStructure());
		interfaceEClass.getESuperTypes().add(theCapellacorePackage.getGeneralClass());
		interfaceEClass.getESuperTypes().add(theCapellacorePackage.getCapellaElement());
		exchangeItemAllocationEClass.getESuperTypes().add(theInformationPackage.getAbstractEventOperation());
		exchangeItemAllocationEClass.getESuperTypes().add(theCapellacorePackage.getCapellaElement());
		exchangeItemAllocationEClass.getESuperTypes().add(theModellingcorePackage.getModelElement());
		deployableElementEClass.getESuperTypes().add(theCapellacorePackage.getNamedElement());
		deploymentTargetEClass.getESuperTypes().add(theCapellacorePackage.getNamedElement());
		abstractDeploymentLinkEClass.getESuperTypes().add(theCapellacorePackage.getCapellaElement());
		abstractDeploymentLinkEClass.getESuperTypes().add(theModellingcorePackage.getModelElement());
		abstractPathInvolvedElementEClass.getESuperTypes().add(theCapellacorePackage.getInvolvedElement());
		abstractPhysicalArtifactEClass.getESuperTypes().add(theCapellacorePackage.getCapellaElement());
		abstractPhysicalLinkEndEClass.getESuperTypes().add(theCapellacorePackage.getCapellaElement());
		physicalLinkEClass.getESuperTypes().add(this.getAbstractPhysicalArtifact());
		physicalLinkEClass.getESuperTypes().add(this.getAbstractPathInvolvedElement());
		physicalLinkEClass.getESuperTypes().add(theFaPackage.getComponentExchangeAllocator());
		physicalLinkCategoryEClass.getESuperTypes().add(theCapellacorePackage.getNamedElement());
		physicalLinkEndEClass.getESuperTypes().add(this.getAbstractPhysicalLinkEnd());
		physicalPathEClass.getESuperTypes().add(theCapellacorePackage.getNamedElement());
		physicalPathEClass.getESuperTypes().add(theFaPackage.getComponentExchangeAllocator());
		physicalPathEClass.getESuperTypes().add(this.getAbstractPathInvolvedElement());
		physicalPathEClass.getESuperTypes().add(theCapellacorePackage.getCapellaElement());
		physicalPathInvolvementEClass.getESuperTypes().add(theCapellacorePackage.getCapellaElement());
		physicalPathInvolvementEClass.getESuperTypes().add(theModellingcorePackage.getModelElement());
		physicalPathReferenceEClass.getESuperTypes().add(this.getPhysicalPathInvolvement());
		physicalPortEClass.getESuperTypes().add(theInformationPackage.getPartition());
		physicalPortEClass.getESuperTypes().add(theInformationPackage.getPort());
		physicalPortEClass.getESuperTypes().add(this.getAbstractPhysicalArtifact());
		physicalPortEClass.getESuperTypes().add(theModellingcorePackage.getInformationsExchanger());
		physicalPortEClass.getESuperTypes().add(this.getAbstractPhysicalLinkEnd());

		// Initialize classes and features; add operations and parameters
		initEClass(blockArchitectureEClass, BlockArchitecture.class, "BlockArchitecture", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBlockArchitecture_OwnedRequirementPkgs(), theRequirementPackage.getRequirementsPkg(), null, "ownedRequirementPkgs", null, 0, -1, BlockArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlockArchitecture_OwnedInterfacePkg(), this.getInterfacePkg(), null, "ownedInterfacePkg", null, 0, 1, BlockArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlockArchitecture_OwnedDataPkg(), theInformationPackage.getDataPkg(), null, "ownedDataPkg", null, 0, 1, BlockArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(blockEClass, Block.class, "Block", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBlock_OwnedAbstractCapabilityPkg(), theCapellacommonPackage.getAbstractCapabilityPkg(), null, "ownedAbstractCapabilityPkg", null, 0, 1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlock_OwnedInterfacePkg(), this.getInterfacePkg(), null, "ownedInterfacePkg", null, 0, 1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlock_OwnedDataPkg(), theInformationPackage.getDataPkg(), null, "ownedDataPkg", null, 0, 1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlock_OwnedStateMachines(), theCapellacommonPackage.getStateMachine(), null, "ownedStateMachines", null, 0, -1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentEClass, Component.class, "Component", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponent_UsedInterfaces(), this.getInterface(), null, "usedInterfaces", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_ImplementedInterfaces(), this.getInterface(), null, "implementedInterfaces", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_AllocatedComponents(), this.getComponent(), null, "allocatedComponents", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_ProvidedInterfaces(), this.getInterface(), null, "providedInterfaces", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_RequiredInterfaces(), this.getInterface(), null, "requiredInterfaces", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_ContainedComponentPorts(), theFaPackage.getComponentPort(), null, "containedComponentPorts", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_ContainedParts(), this.getPart(), null, "containedParts", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_ContainedPhysicalPorts(), this.getPhysicalPort(), null, "containedPhysicalPorts", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_OwnedPhysicalPath(), this.getPhysicalPath(), null, "ownedPhysicalPath", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_OwnedPhysicalLinks(), this.getPhysicalLink(), null, "ownedPhysicalLinks", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_OwnedPhysicalLinkCategories(), this.getPhysicalLinkCategory(), null, "ownedPhysicalLinkCategories", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractActorEClass, AbstractActor.class, "AbstractActor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(partEClass, Part.class, "Part", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPart_DeployedParts(), this.getPart(), null, "deployedParts", null, 0, -1, Part.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPart_OwnedAbstractType(), theModellingcorePackage.getAbstractType(), null, "ownedAbstractType", null, 0, 1, Part.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemComponentEClass, SystemComponent.class, "SystemComponent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSystemComponent_DataComponent(), ecorePackage.getEBoolean(), "dataComponent", null, 0, 1, SystemComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interfacePkgEClass, InterfacePkg.class, "InterfacePkg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterfacePkg_OwnedInterfaces(), this.getInterface(), null, "ownedInterfaces", null, 0, -1, InterfacePkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterfacePkg_OwnedInterfacePkgs(), this.getInterfacePkg(), null, "ownedInterfacePkgs", null, 0, -1, InterfacePkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interfaceEClass, Interface.class, "Interface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInterface_Mechanism(), ecorePackage.getEString(), "mechanism", null, 0, 1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterface_OwnedExchangeItemAllocations(), this.getExchangeItemAllocation(), null, "ownedExchangeItemAllocations", null, 0, -1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterface_RealizedContextInterfaces(), this.getInterface(), null, "realizedContextInterfaces", null, 0, -1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterface_RealizedLogicalInterfaces(), this.getInterface(), null, "realizedLogicalInterfaces", null, 0, -1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exchangeItemAllocationEClass, ExchangeItemAllocation.class, "ExchangeItemAllocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExchangeItemAllocation_SendProtocol(), theCommunicationPackage.getCommunicationLinkProtocol(), "sendProtocol", null, 0, 1, ExchangeItemAllocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExchangeItemAllocation_ReceiveProtocol(), theCommunicationPackage.getCommunicationLinkProtocol(), "receiveProtocol", null, 0, 1, ExchangeItemAllocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExchangeItemAllocation_AllocatedItem(), theInformationPackage.getExchangeItem(), null, "allocatedItem", null, 0, 1, ExchangeItemAllocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deployableElementEClass, DeployableElement.class, "DeployableElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(deploymentTargetEClass, DeploymentTarget.class, "DeploymentTarget", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractDeploymentLinkEClass, AbstractDeploymentLink.class, "AbstractDeploymentLink", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractDeploymentLink_DeployedElement(), this.getDeployableElement(), null, "deployedElement", null, 1, 1, AbstractDeploymentLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractDeploymentLink_Location(), this.getDeploymentTarget(), null, "location", null, 1, 1, AbstractDeploymentLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractPathInvolvedElementEClass, AbstractPathInvolvedElement.class, "AbstractPathInvolvedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractPhysicalArtifactEClass, AbstractPhysicalArtifact.class, "AbstractPhysicalArtifact", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractPhysicalLinkEndEClass, AbstractPhysicalLinkEnd.class, "AbstractPhysicalLinkEnd", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractPhysicalLinkEnd_InvolvedLinks(), this.getPhysicalLink(), null, "involvedLinks", null, 0, -1, AbstractPhysicalLinkEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(physicalLinkEClass, PhysicalLink.class, "PhysicalLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPhysicalLink_LinkEnds(), this.getAbstractPhysicalLinkEnd(), null, "linkEnds", null, 2, 2, PhysicalLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalLink_OwnedPhysicalLinkEnds(), this.getPhysicalLinkEnd(), null, "ownedPhysicalLinkEnds", null, 0, -1, PhysicalLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalLink_Categories(), this.getPhysicalLinkCategory(), null, "categories", null, 0, -1, PhysicalLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalLink_SourcePhysicalPort(), this.getPhysicalPort(), null, "sourcePhysicalPort", null, 0, 1, PhysicalLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalLink_TargetPhysicalPort(), this.getPhysicalPort(), null, "targetPhysicalPort", null, 0, 1, PhysicalLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalLink_RealizedPhysicalLinks(), this.getPhysicalLink(), null, "realizedPhysicalLinks", null, 0, -1, PhysicalLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(physicalLinkCategoryEClass, PhysicalLinkCategory.class, "PhysicalLinkCategory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(physicalLinkEndEClass, PhysicalLinkEnd.class, "PhysicalLinkEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPhysicalLinkEnd_Port(), this.getPhysicalPort(), null, "port", null, 0, 1, PhysicalLinkEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalLinkEnd_Part(), this.getPart(), null, "part", null, 0, 1, PhysicalLinkEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(physicalPathEClass, PhysicalPath.class, "PhysicalPath", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPhysicalPath_OwnedPhysicalPathInvolvements(), this.getPhysicalPathInvolvement(), null, "ownedPhysicalPathInvolvements", null, 0, -1, PhysicalPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalPath_FirstPhysicalPathInvolvements(), this.getPhysicalPathInvolvement(), null, "firstPhysicalPathInvolvements", null, 0, -1, PhysicalPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalPath_RealizedPhysicalPaths(), this.getPhysicalPath(), null, "realizedPhysicalPaths", null, 0, -1, PhysicalPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(physicalPathInvolvementEClass, PhysicalPathInvolvement.class, "PhysicalPathInvolvement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPhysicalPathInvolvement_NextInvolvements(), this.getPhysicalPathInvolvement(), null, "nextInvolvements", null, 0, -1, PhysicalPathInvolvement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalPathInvolvement_InvolvedElement(), this.getAbstractPathInvolvedElement(), null, "involvedElement", null, 0, 1, PhysicalPathInvolvement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(physicalPathReferenceEClass, PhysicalPathReference.class, "PhysicalPathReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPhysicalPathReference_ReferencedPhysicalPath(), this.getPhysicalPath(), null, "referencedPhysicalPath", null, 0, 1, PhysicalPathReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(physicalPortEClass, PhysicalPort.class, "PhysicalPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPhysicalPort_AllocatedComponentPorts(), theFaPackage.getComponentPort(), null, "allocatedComponentPorts", null, 0, -1, PhysicalPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalPort_RealizedPhysicalPorts(), this.getPhysicalPort(), null, "realizedPhysicalPorts", null, 0, -1, PhysicalPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.polarsys.org/capella/xmlpivot
		createXmlpivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.polarsys.org/capella/xmlpivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createXmlpivotAnnotations() {
		String source = "http://www.polarsys.org/capella/xmlpivot";		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "sourceNsURI", "http://www.polarsys.org/capella/core/cs/0.8.0"
		   });
	}

} //CsPackageImpl
