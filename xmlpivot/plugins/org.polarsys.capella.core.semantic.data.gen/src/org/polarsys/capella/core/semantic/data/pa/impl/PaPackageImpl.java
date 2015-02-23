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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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

import org.polarsys.capella.core.semantic.data.cs.CsPackage;

import org.polarsys.capella.core.semantic.data.cs.impl.CsPackageImpl;

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

import org.polarsys.capella.core.semantic.data.pa.AbstractPhysicalComponent;
import org.polarsys.capella.core.semantic.data.pa.PaFactory;
import org.polarsys.capella.core.semantic.data.pa.PaPackage;
import org.polarsys.capella.core.semantic.data.pa.PhysicalActor;
import org.polarsys.capella.core.semantic.data.pa.PhysicalActorPkg;
import org.polarsys.capella.core.semantic.data.pa.PhysicalArchitecture;
import org.polarsys.capella.core.semantic.data.pa.PhysicalComponent;
import org.polarsys.capella.core.semantic.data.pa.PhysicalComponentKind;
import org.polarsys.capella.core.semantic.data.pa.PhysicalComponentNature;
import org.polarsys.capella.core.semantic.data.pa.PhysicalComponentPkg;
import org.polarsys.capella.core.semantic.data.pa.PhysicalContext;
import org.polarsys.capella.core.semantic.data.pa.PhysicalFunction;
import org.polarsys.capella.core.semantic.data.pa.PhysicalFunctionPkg;
import org.polarsys.capella.core.semantic.data.pa.PhysicalNode;

import org.polarsys.capella.core.semantic.data.pa.deployment.DeploymentPackage;

import org.polarsys.capella.core.semantic.data.pa.deployment.impl.DeploymentPackageImpl;

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
public class PaPackageImpl extends EPackageImpl implements PaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalArchitectureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalFunctionPkgEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractPhysicalComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalActorPkgEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalComponentPkgEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalActorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum physicalComponentKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum physicalComponentNatureEEnum = null;

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
	 * @see org.polarsys.capella.core.semantic.data.pa.PaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PaPackageImpl() {
		super(eNS_URI, PaFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PaPackage init() {
		if (isInited) return (PaPackage)EPackage.Registry.INSTANCE.getEPackage(PaPackage.eNS_URI);

		// Obtain or create and register package
		PaPackageImpl thePaPackage = (PaPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PaPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		DeploymentPackageImpl theDeploymentPackage = (DeploymentPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DeploymentPackage.eNS_URI) instanceof DeploymentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DeploymentPackage.eNS_URI) : DeploymentPackage.eINSTANCE);
		CsPackageImpl theCsPackage = (CsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CsPackage.eNS_URI) instanceof CsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CsPackage.eNS_URI) : CsPackage.eINSTANCE);
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
		thePaPackage.createPackageContents();
		theDeploymentPackage.createPackageContents();
		theCsPackage.createPackageContents();
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
		thePaPackage.initializePackageContents();
		theDeploymentPackage.initializePackageContents();
		theCsPackage.initializePackageContents();
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
		thePaPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PaPackage.eNS_URI, thePaPackage);
		return thePaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicalArchitecture() {
		return physicalArchitectureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalArchitecture_OwnedPhysicalContext() {
		return (EReference)physicalArchitectureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalArchitecture_OwnedPhysicalComponent() {
		return (EReference)physicalArchitectureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalArchitecture_OwnedPhysicalComponentPkg() {
		return (EReference)physicalArchitectureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalArchitecture_OwnedPhysicalActorPkg() {
		return (EReference)physicalArchitectureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalArchitecture_ContainedCapabilityRealizationPkg() {
		return (EReference)physicalArchitectureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalArchitecture_ContainedPhysicalFunctionPkg() {
		return (EReference)physicalArchitectureEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalArchitecture_OwnedDeployments() {
		return (EReference)physicalArchitectureEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalArchitecture_AllocatedLogicalArchitectures() {
		return (EReference)physicalArchitectureEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicalFunction() {
		return physicalFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalFunction_OwnedPhysicalFunctionPkgs() {
		return (EReference)physicalFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalFunction_RealizedLogicalFunctions() {
		return (EReference)physicalFunctionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalFunction_ContainedPhysicalFunctions() {
		return (EReference)physicalFunctionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicalFunctionPkg() {
		return physicalFunctionPkgEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalFunctionPkg_OwnedPhysicalFunctions() {
		return (EReference)physicalFunctionPkgEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalFunctionPkg_OwnedPhysicalFunctionPkgs() {
		return (EReference)physicalFunctionPkgEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractPhysicalComponent() {
		return abstractPhysicalComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractPhysicalComponent_Kind() {
		return (EAttribute)abstractPhysicalComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractPhysicalComponent_Nature() {
		return (EAttribute)abstractPhysicalComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractPhysicalComponent_OwnedDeploymentLinks() {
		return (EReference)abstractPhysicalComponentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractPhysicalComponent_OwnedDeploymentAspect() {
		return (EReference)abstractPhysicalComponentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicalComponent() {
		return physicalComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalComponent_OwnedPhysicalComponents() {
		return (EReference)physicalComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalComponent_OwnedPhysicalComponentPkgs() {
		return (EReference)physicalComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalComponent_RealizedLogicalComponents() {
		return (EReference)physicalComponentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalComponent_AllocatedPhysicalFunctions() {
		return (EReference)physicalComponentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalComponent_DeployedPhysicalComponents() {
		return (EReference)physicalComponentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicalActorPkg() {
		return physicalActorPkgEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalActorPkg_OwnedPhysicalActorPkgs() {
		return (EReference)physicalActorPkgEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalActorPkg_OwnedPhysicalActors() {
		return (EReference)physicalActorPkgEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicalComponentPkg() {
		return physicalComponentPkgEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalComponentPkg_OwnedComponents() {
		return (EReference)physicalComponentPkgEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalComponentPkg_OwnedPhysicalComponentPkgs() {
		return (EReference)physicalComponentPkgEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalComponentPkg_OwnedKeyParts() {
		return (EReference)physicalComponentPkgEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicalActor() {
		return physicalActorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalActor_AllocatedPhysicalFunctions() {
		return (EReference)physicalActorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalActor_RealizedLogicalActors() {
		return (EReference)physicalActorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalActor_DeployedPhysicalComponents() {
		return (EReference)physicalActorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicalNode() {
		return physicalNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicalContext() {
		return physicalContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPhysicalComponentKind() {
		return physicalComponentKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPhysicalComponentNature() {
		return physicalComponentNatureEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaFactory getPaFactory() {
		return (PaFactory)getEFactoryInstance();
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
		physicalArchitectureEClass = createEClass(PHYSICAL_ARCHITECTURE);
		createEReference(physicalArchitectureEClass, PHYSICAL_ARCHITECTURE__OWNED_PHYSICAL_CONTEXT);
		createEReference(physicalArchitectureEClass, PHYSICAL_ARCHITECTURE__OWNED_PHYSICAL_COMPONENT);
		createEReference(physicalArchitectureEClass, PHYSICAL_ARCHITECTURE__OWNED_PHYSICAL_COMPONENT_PKG);
		createEReference(physicalArchitectureEClass, PHYSICAL_ARCHITECTURE__OWNED_PHYSICAL_ACTOR_PKG);
		createEReference(physicalArchitectureEClass, PHYSICAL_ARCHITECTURE__CONTAINED_CAPABILITY_REALIZATION_PKG);
		createEReference(physicalArchitectureEClass, PHYSICAL_ARCHITECTURE__CONTAINED_PHYSICAL_FUNCTION_PKG);
		createEReference(physicalArchitectureEClass, PHYSICAL_ARCHITECTURE__OWNED_DEPLOYMENTS);
		createEReference(physicalArchitectureEClass, PHYSICAL_ARCHITECTURE__ALLOCATED_LOGICAL_ARCHITECTURES);

		physicalFunctionEClass = createEClass(PHYSICAL_FUNCTION);
		createEReference(physicalFunctionEClass, PHYSICAL_FUNCTION__OWNED_PHYSICAL_FUNCTION_PKGS);
		createEReference(physicalFunctionEClass, PHYSICAL_FUNCTION__REALIZED_LOGICAL_FUNCTIONS);
		createEReference(physicalFunctionEClass, PHYSICAL_FUNCTION__CONTAINED_PHYSICAL_FUNCTIONS);

		physicalFunctionPkgEClass = createEClass(PHYSICAL_FUNCTION_PKG);
		createEReference(physicalFunctionPkgEClass, PHYSICAL_FUNCTION_PKG__OWNED_PHYSICAL_FUNCTIONS);
		createEReference(physicalFunctionPkgEClass, PHYSICAL_FUNCTION_PKG__OWNED_PHYSICAL_FUNCTION_PKGS);

		abstractPhysicalComponentEClass = createEClass(ABSTRACT_PHYSICAL_COMPONENT);
		createEAttribute(abstractPhysicalComponentEClass, ABSTRACT_PHYSICAL_COMPONENT__KIND);
		createEAttribute(abstractPhysicalComponentEClass, ABSTRACT_PHYSICAL_COMPONENT__NATURE);
		createEReference(abstractPhysicalComponentEClass, ABSTRACT_PHYSICAL_COMPONENT__OWNED_DEPLOYMENT_LINKS);
		createEReference(abstractPhysicalComponentEClass, ABSTRACT_PHYSICAL_COMPONENT__OWNED_DEPLOYMENT_ASPECT);

		physicalComponentEClass = createEClass(PHYSICAL_COMPONENT);
		createEReference(physicalComponentEClass, PHYSICAL_COMPONENT__OWNED_PHYSICAL_COMPONENTS);
		createEReference(physicalComponentEClass, PHYSICAL_COMPONENT__OWNED_PHYSICAL_COMPONENT_PKGS);
		createEReference(physicalComponentEClass, PHYSICAL_COMPONENT__REALIZED_LOGICAL_COMPONENTS);
		createEReference(physicalComponentEClass, PHYSICAL_COMPONENT__ALLOCATED_PHYSICAL_FUNCTIONS);
		createEReference(physicalComponentEClass, PHYSICAL_COMPONENT__DEPLOYED_PHYSICAL_COMPONENTS);

		physicalActorPkgEClass = createEClass(PHYSICAL_ACTOR_PKG);
		createEReference(physicalActorPkgEClass, PHYSICAL_ACTOR_PKG__OWNED_PHYSICAL_ACTOR_PKGS);
		createEReference(physicalActorPkgEClass, PHYSICAL_ACTOR_PKG__OWNED_PHYSICAL_ACTORS);

		physicalComponentPkgEClass = createEClass(PHYSICAL_COMPONENT_PKG);
		createEReference(physicalComponentPkgEClass, PHYSICAL_COMPONENT_PKG__OWNED_COMPONENTS);
		createEReference(physicalComponentPkgEClass, PHYSICAL_COMPONENT_PKG__OWNED_PHYSICAL_COMPONENT_PKGS);
		createEReference(physicalComponentPkgEClass, PHYSICAL_COMPONENT_PKG__OWNED_KEY_PARTS);

		physicalActorEClass = createEClass(PHYSICAL_ACTOR);
		createEReference(physicalActorEClass, PHYSICAL_ACTOR__ALLOCATED_PHYSICAL_FUNCTIONS);
		createEReference(physicalActorEClass, PHYSICAL_ACTOR__REALIZED_LOGICAL_ACTORS);
		createEReference(physicalActorEClass, PHYSICAL_ACTOR__DEPLOYED_PHYSICAL_COMPONENTS);

		physicalNodeEClass = createEClass(PHYSICAL_NODE);

		physicalContextEClass = createEClass(PHYSICAL_CONTEXT);

		// Create enums
		physicalComponentKindEEnum = createEEnum(PHYSICAL_COMPONENT_KIND);
		physicalComponentNatureEEnum = createEEnum(PHYSICAL_COMPONENT_NATURE);
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
		DeploymentPackage theDeploymentPackage = (DeploymentPackage)EPackage.Registry.INSTANCE.getEPackage(DeploymentPackage.eNS_URI);
		CsPackage theCsPackage = (CsPackage)EPackage.Registry.INSTANCE.getEPackage(CsPackage.eNS_URI);
		LaPackage theLaPackage = (LaPackage)EPackage.Registry.INSTANCE.getEPackage(LaPackage.eNS_URI);
		FaPackage theFaPackage = (FaPackage)EPackage.Registry.INSTANCE.getEPackage(FaPackage.eNS_URI);
		InformationPackage theInformationPackage = (InformationPackage)EPackage.Registry.INSTANCE.getEPackage(InformationPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theDeploymentPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		physicalArchitectureEClass.getESuperTypes().add(theCsPackage.getBlockArchitecture());
		physicalFunctionEClass.getESuperTypes().add(theFaPackage.getAbstractFunction());
		physicalFunctionPkgEClass.getESuperTypes().add(theFaPackage.getFunctionPkg());
		abstractPhysicalComponentEClass.getESuperTypes().add(theCsPackage.getSystemComponent());
		abstractPhysicalComponentEClass.getESuperTypes().add(theCsPackage.getDeployableElement());
		abstractPhysicalComponentEClass.getESuperTypes().add(theCsPackage.getDeploymentTarget());
		physicalComponentEClass.getESuperTypes().add(this.getAbstractPhysicalComponent());
		physicalComponentEClass.getESuperTypes().add(theCsPackage.getAbstractPhysicalArtifact());
		physicalActorPkgEClass.getESuperTypes().add(theFaPackage.getAbstractFunctionalStructure());
		physicalComponentPkgEClass.getESuperTypes().add(theFaPackage.getAbstractFunctionalStructure());
		physicalComponentPkgEClass.getESuperTypes().add(theInformationPackage.getAssociationPkg());
		physicalActorEClass.getESuperTypes().add(this.getAbstractPhysicalComponent());
		physicalActorEClass.getESuperTypes().add(theCsPackage.getAbstractActor());
		physicalNodeEClass.getESuperTypes().add(this.getPhysicalComponent());
		physicalContextEClass.getESuperTypes().add(theCsPackage.getComponent());

		// Initialize classes and features; add operations and parameters
		initEClass(physicalArchitectureEClass, PhysicalArchitecture.class, "PhysicalArchitecture", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPhysicalArchitecture_OwnedPhysicalContext(), this.getPhysicalContext(), null, "ownedPhysicalContext", null, 0, 1, PhysicalArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalArchitecture_OwnedPhysicalComponent(), this.getPhysicalComponent(), null, "ownedPhysicalComponent", null, 0, 1, PhysicalArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalArchitecture_OwnedPhysicalComponentPkg(), this.getPhysicalComponentPkg(), null, "ownedPhysicalComponentPkg", null, 0, 1, PhysicalArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalArchitecture_OwnedPhysicalActorPkg(), this.getPhysicalActorPkg(), null, "ownedPhysicalActorPkg", null, 0, 1, PhysicalArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalArchitecture_ContainedCapabilityRealizationPkg(), theLaPackage.getCapabilityRealizationPkg(), null, "containedCapabilityRealizationPkg", null, 0, 1, PhysicalArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalArchitecture_ContainedPhysicalFunctionPkg(), this.getPhysicalFunctionPkg(), null, "containedPhysicalFunctionPkg", null, 0, 1, PhysicalArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalArchitecture_OwnedDeployments(), theCsPackage.getAbstractDeploymentLink(), null, "ownedDeployments", null, 0, -1, PhysicalArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalArchitecture_AllocatedLogicalArchitectures(), theLaPackage.getLogicalArchitecture(), null, "allocatedLogicalArchitectures", null, 0, -1, PhysicalArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(physicalFunctionEClass, PhysicalFunction.class, "PhysicalFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPhysicalFunction_OwnedPhysicalFunctionPkgs(), this.getPhysicalFunctionPkg(), null, "ownedPhysicalFunctionPkgs", null, 0, -1, PhysicalFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalFunction_RealizedLogicalFunctions(), theLaPackage.getLogicalFunction(), null, "realizedLogicalFunctions", null, 0, -1, PhysicalFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalFunction_ContainedPhysicalFunctions(), this.getPhysicalFunction(), null, "containedPhysicalFunctions", null, 0, -1, PhysicalFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(physicalFunctionPkgEClass, PhysicalFunctionPkg.class, "PhysicalFunctionPkg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPhysicalFunctionPkg_OwnedPhysicalFunctions(), this.getPhysicalFunction(), null, "ownedPhysicalFunctions", null, 0, -1, PhysicalFunctionPkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalFunctionPkg_OwnedPhysicalFunctionPkgs(), this.getPhysicalFunctionPkg(), null, "ownedPhysicalFunctionPkgs", null, 0, -1, PhysicalFunctionPkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractPhysicalComponentEClass, AbstractPhysicalComponent.class, "AbstractPhysicalComponent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractPhysicalComponent_Kind(), this.getPhysicalComponentKind(), "kind", null, 0, 1, AbstractPhysicalComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractPhysicalComponent_Nature(), this.getPhysicalComponentNature(), "nature", null, 0, 1, AbstractPhysicalComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractPhysicalComponent_OwnedDeploymentLinks(), theCsPackage.getAbstractDeploymentLink(), null, "ownedDeploymentLinks", null, 0, -1, AbstractPhysicalComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractPhysicalComponent_OwnedDeploymentAspect(), theDeploymentPackage.getDeploymentAspect(), null, "ownedDeploymentAspect", null, 0, 1, AbstractPhysicalComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(physicalComponentEClass, PhysicalComponent.class, "PhysicalComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPhysicalComponent_OwnedPhysicalComponents(), this.getPhysicalComponent(), null, "ownedPhysicalComponents", null, 0, -1, PhysicalComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalComponent_OwnedPhysicalComponentPkgs(), this.getPhysicalComponentPkg(), null, "ownedPhysicalComponentPkgs", null, 0, -1, PhysicalComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalComponent_RealizedLogicalComponents(), theLaPackage.getLogicalComponent(), null, "realizedLogicalComponents", null, 0, -1, PhysicalComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPhysicalComponent_AllocatedPhysicalFunctions(), this.getPhysicalFunction(), null, "allocatedPhysicalFunctions", null, 0, -1, PhysicalComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalComponent_DeployedPhysicalComponents(), this.getPhysicalComponent(), null, "deployedPhysicalComponents", null, 0, -1, PhysicalComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(physicalActorPkgEClass, PhysicalActorPkg.class, "PhysicalActorPkg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPhysicalActorPkg_OwnedPhysicalActorPkgs(), this.getPhysicalActorPkg(), null, "ownedPhysicalActorPkgs", null, 0, -1, PhysicalActorPkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalActorPkg_OwnedPhysicalActors(), this.getPhysicalActor(), null, "ownedPhysicalActors", null, 0, -1, PhysicalActorPkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(physicalComponentPkgEClass, PhysicalComponentPkg.class, "PhysicalComponentPkg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPhysicalComponentPkg_OwnedComponents(), this.getPhysicalComponent(), null, "ownedComponents", null, 0, -1, PhysicalComponentPkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalComponentPkg_OwnedPhysicalComponentPkgs(), this.getPhysicalComponentPkg(), null, "ownedPhysicalComponentPkgs", null, 0, -1, PhysicalComponentPkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalComponentPkg_OwnedKeyParts(), theInformationPackage.getKeyPart(), null, "ownedKeyParts", null, 0, -1, PhysicalComponentPkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(physicalActorEClass, PhysicalActor.class, "PhysicalActor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPhysicalActor_AllocatedPhysicalFunctions(), this.getPhysicalFunction(), null, "allocatedPhysicalFunctions", null, 0, -1, PhysicalActor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalActor_RealizedLogicalActors(), theLaPackage.getLogicalActor(), null, "realizedLogicalActors", null, 0, -1, PhysicalActor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalActor_DeployedPhysicalComponents(), this.getPhysicalComponent(), null, "deployedPhysicalComponents", null, 0, -1, PhysicalActor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(physicalNodeEClass, PhysicalNode.class, "PhysicalNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(physicalContextEClass, PhysicalContext.class, "PhysicalContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(physicalComponentKindEEnum, PhysicalComponentKind.class, "PhysicalComponentKind");
		addEEnumLiteral(physicalComponentKindEEnum, PhysicalComponentKind.UNSET);
		addEEnumLiteral(physicalComponentKindEEnum, PhysicalComponentKind.HARDWARE);
		addEEnumLiteral(physicalComponentKindEEnum, PhysicalComponentKind.HARDWARE_COMPUTER);
		addEEnumLiteral(physicalComponentKindEEnum, PhysicalComponentKind.SOFTWARE);
		addEEnumLiteral(physicalComponentKindEEnum, PhysicalComponentKind.SOFTWARE_DEPLOYMENT_UNIT);
		addEEnumLiteral(physicalComponentKindEEnum, PhysicalComponentKind.SOFTWARE_EXECUTION_UNIT);
		addEEnumLiteral(physicalComponentKindEEnum, PhysicalComponentKind.SOFTWARE_APPLICATION);
		addEEnumLiteral(physicalComponentKindEEnum, PhysicalComponentKind.FIRMWARE);
		addEEnumLiteral(physicalComponentKindEEnum, PhysicalComponentKind.PERSON);
		addEEnumLiteral(physicalComponentKindEEnum, PhysicalComponentKind.FACILITIES);
		addEEnumLiteral(physicalComponentKindEEnum, PhysicalComponentKind.DATA);
		addEEnumLiteral(physicalComponentKindEEnum, PhysicalComponentKind.MATERIALS);
		addEEnumLiteral(physicalComponentKindEEnum, PhysicalComponentKind.SERVICES);
		addEEnumLiteral(physicalComponentKindEEnum, PhysicalComponentKind.PROCESSES);

		initEEnum(physicalComponentNatureEEnum, PhysicalComponentNature.class, "PhysicalComponentNature");
		addEEnumLiteral(physicalComponentNatureEEnum, PhysicalComponentNature.UNSET);
		addEEnumLiteral(physicalComponentNatureEEnum, PhysicalComponentNature.BEHAVIOR);
		addEEnumLiteral(physicalComponentNatureEEnum, PhysicalComponentNature.NODE);

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
			 "sourceNsURI", "http://www.polarsys.org/capella/core/pa/0.8.0"
		   });
	}

} //PaPackageImpl
