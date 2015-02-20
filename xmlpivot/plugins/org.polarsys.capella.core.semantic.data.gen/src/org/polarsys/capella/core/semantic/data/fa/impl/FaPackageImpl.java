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

package org.polarsys.capella.core.semantic.data.fa.impl;

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

import org.polarsys.capella.core.semantic.data.fa.AbstractFunction;
import org.polarsys.capella.core.semantic.data.fa.AbstractFunctionalArchitecture;
import org.polarsys.capella.core.semantic.data.fa.AbstractFunctionalBlock;
import org.polarsys.capella.core.semantic.data.fa.AbstractFunctionalChainContainer;
import org.polarsys.capella.core.semantic.data.fa.AbstractFunctionalStructure;
import org.polarsys.capella.core.semantic.data.fa.ComponentExchange;
import org.polarsys.capella.core.semantic.data.fa.ComponentExchangeAllocator;
import org.polarsys.capella.core.semantic.data.fa.ComponentExchangeCategory;
import org.polarsys.capella.core.semantic.data.fa.ComponentExchangeEnd;
import org.polarsys.capella.core.semantic.data.fa.ComponentExchangeKind;
import org.polarsys.capella.core.semantic.data.fa.ComponentPort;
import org.polarsys.capella.core.semantic.data.fa.ComponentPortKind;
import org.polarsys.capella.core.semantic.data.fa.ExchangeCategory;
import org.polarsys.capella.core.semantic.data.fa.FaFactory;
import org.polarsys.capella.core.semantic.data.fa.FaPackage;
import org.polarsys.capella.core.semantic.data.fa.FunctionInputPort;
import org.polarsys.capella.core.semantic.data.fa.FunctionKind;
import org.polarsys.capella.core.semantic.data.fa.FunctionOutputPort;
import org.polarsys.capella.core.semantic.data.fa.FunctionPkg;
import org.polarsys.capella.core.semantic.data.fa.FunctionPort;
import org.polarsys.capella.core.semantic.data.fa.FunctionalChain;
import org.polarsys.capella.core.semantic.data.fa.FunctionalChainInvolvement;
import org.polarsys.capella.core.semantic.data.fa.FunctionalChainKind;
import org.polarsys.capella.core.semantic.data.fa.FunctionalChainReference;
import org.polarsys.capella.core.semantic.data.fa.FunctionalExchange;
import org.polarsys.capella.core.semantic.data.fa.OrientationPortKind;

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
public class FaPackageImpl extends EPackageImpl implements FaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractFunctionalArchitectureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractFunctionalStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractFunctionalBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionPkgEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exchangeCategoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionalChainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractFunctionalChainContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionalChainInvolvementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionalChainReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionInputPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionOutputPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionalExchangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentExchangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentExchangeAllocatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentExchangeCategoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentExchangeEndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum functionalChainKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum functionKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum componentExchangeKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum componentPortKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum orientationPortKindEEnum = null;

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
	 * @see org.polarsys.capella.core.semantic.data.fa.FaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FaPackageImpl() {
		super(eNS_URI, FaFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link FaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FaPackage init() {
		if (isInited) return (FaPackage)EPackage.Registry.INSTANCE.getEPackage(FaPackage.eNS_URI);

		// Obtain or create and register package
		FaPackageImpl theFaPackage = (FaPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FaPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		PaPackageImpl thePaPackage = (PaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PaPackage.eNS_URI) instanceof PaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PaPackage.eNS_URI) : PaPackage.eINSTANCE);
		DeploymentPackageImpl theDeploymentPackage = (DeploymentPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DeploymentPackage.eNS_URI) instanceof DeploymentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DeploymentPackage.eNS_URI) : DeploymentPackage.eINSTANCE);
		CsPackageImpl theCsPackage = (CsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CsPackage.eNS_URI) instanceof CsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CsPackage.eNS_URI) : CsPackage.eINSTANCE);
		InformationPackageImpl theInformationPackage = (InformationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InformationPackage.eNS_URI) instanceof InformationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InformationPackage.eNS_URI) : InformationPackage.eINSTANCE);
		CommunicationPackageImpl theCommunicationPackage = (CommunicationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommunicationPackage.eNS_URI) instanceof CommunicationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommunicationPackage.eNS_URI) : CommunicationPackage.eINSTANCE);
		DatatypePackageImpl theDatatypePackage = (DatatypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatatypePackage.eNS_URI) instanceof DatatypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatatypePackage.eNS_URI) : DatatypePackage.eINSTANCE);
		DatavaluePackageImpl theDatavaluePackage = (DatavaluePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatavaluePackage.eNS_URI) instanceof DatavaluePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatavaluePackage.eNS_URI) : DatavaluePackage.eINSTANCE);
		BehaviorPackageImpl theBehaviorPackage = (BehaviorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) instanceof BehaviorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) : BehaviorPackage.eINSTANCE);
		CapellamodellerPackageImpl theCapellamodellerPackage = (CapellamodellerPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CapellamodellerPackage.eNS_URI) instanceof CapellamodellerPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CapellamodellerPackage.eNS_URI) : CapellamodellerPackage.eINSTANCE);
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
		theFaPackage.createPackageContents();
		thePaPackage.createPackageContents();
		theDeploymentPackage.createPackageContents();
		theCsPackage.createPackageContents();
		theInformationPackage.createPackageContents();
		theCommunicationPackage.createPackageContents();
		theDatatypePackage.createPackageContents();
		theDatavaluePackage.createPackageContents();
		theBehaviorPackage.createPackageContents();
		theCapellamodellerPackage.createPackageContents();
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
		theFaPackage.initializePackageContents();
		thePaPackage.initializePackageContents();
		theDeploymentPackage.initializePackageContents();
		theCsPackage.initializePackageContents();
		theInformationPackage.initializePackageContents();
		theCommunicationPackage.initializePackageContents();
		theDatatypePackage.initializePackageContents();
		theDatavaluePackage.initializePackageContents();
		theBehaviorPackage.initializePackageContents();
		theCapellamodellerPackage.initializePackageContents();
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
		theFaPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FaPackage.eNS_URI, theFaPackage);
		return theFaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractFunctionalArchitecture() {
		return abstractFunctionalArchitectureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractFunctionalArchitecture_OwnedComponentExchanges() {
		return (EReference)abstractFunctionalArchitectureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractFunctionalArchitecture_OwnedComponentExchangeCategories() {
		return (EReference)abstractFunctionalArchitectureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractFunctionalStructure() {
		return abstractFunctionalStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractFunctionalStructure_OwnedComponentExchanges() {
		return (EReference)abstractFunctionalStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractFunctionalStructure_OwnedComponentExchangeCategories() {
		return (EReference)abstractFunctionalStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractFunctionalBlock() {
		return abstractFunctionalBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractFunctionalBlock_OwnedComponentExchanges() {
		return (EReference)abstractFunctionalBlockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractFunctionalBlock_OwnedComponentExchangeCategories() {
		return (EReference)abstractFunctionalBlockEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionPkg() {
		return functionPkgEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionPkg_OwnedCategories() {
		return (EReference)functionPkgEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExchangeCategory() {
		return exchangeCategoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionalChain() {
		return functionalChainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionalChain_Kind() {
		return (EAttribute)functionalChainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalChain_OwnedFunctionalChainInvolvements() {
		return (EReference)functionalChainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalChain_AvailableInStates() {
		return (EReference)functionalChainEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalChain_FirstFunctionalChainInvolvements() {
		return (EReference)functionalChainEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalChain_RealizedFunctionalChains() {
		return (EReference)functionalChainEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractFunctionalChainContainer() {
		return abstractFunctionalChainContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractFunctionalChainContainer_OwnedFunctionalChains() {
		return (EReference)abstractFunctionalChainContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionalChainInvolvement() {
		return functionalChainInvolvementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalChainInvolvement_NextFunctionalChainInvolvements() {
		return (EReference)functionalChainInvolvementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalChainInvolvement_InvolvedElement() {
		return (EReference)functionalChainInvolvementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionalChainReference() {
		return functionalChainReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalChainReference_ReferencedFunctionalChain() {
		return (EReference)functionalChainReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionInputPort() {
		return functionInputPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionInputPort_IncomingExchangeItems() {
		return (EReference)functionInputPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionOutputPort() {
		return functionOutputPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionOutputPort_OutgoingExchangeItems() {
		return (EReference)functionOutputPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionalExchange() {
		return functionalExchangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalExchange_ExchangedItems() {
		return (EReference)functionalExchangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalExchange_Categories() {
		return (EReference)functionalExchangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalExchange_SourceFunctionOutputPort() {
		return (EReference)functionalExchangeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalExchange_TargetFunctionInputPort() {
		return (EReference)functionalExchangeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalExchange_RealizedFunctionalExchanges() {
		return (EReference)functionalExchangeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractFunction() {
		return abstractFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractFunction_Kind() {
		return (EAttribute)abstractFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractFunction_Condition() {
		return (EAttribute)abstractFunctionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractFunction_OwnedFunctionalExchanges() {
		return (EReference)abstractFunctionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractFunction_AvailableInStates() {
		return (EReference)abstractFunctionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractFunction_LinkedStateMachine() {
		return (EReference)abstractFunctionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionPort() {
		return functionPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionPort_RealizedFunctionPorts() {
		return (EReference)functionPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentExchange() {
		return componentExchangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentExchange_Kind() {
		return (EAttribute)componentExchangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentExchange_Oriented() {
		return (EAttribute)componentExchangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentExchange_AllocatedFunctionalExchanges() {
		return (EReference)componentExchangeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentExchange_OwnedComponentExchangeEnds() {
		return (EReference)componentExchangeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentExchange_SourcePort() {
		return (EReference)componentExchangeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentExchange_SourcePart() {
		return (EReference)componentExchangeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentExchange_TargetPort() {
		return (EReference)componentExchangeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentExchange_TargetPart() {
		return (EReference)componentExchangeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentExchange_Categories() {
		return (EReference)componentExchangeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentExchange_RealizedComponentExchanges() {
		return (EReference)componentExchangeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentExchangeAllocator() {
		return componentExchangeAllocatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentExchangeAllocator_AllocatedComponentExchanges() {
		return (EReference)componentExchangeAllocatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentExchangeCategory() {
		return componentExchangeCategoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentExchangeEnd() {
		return componentExchangeEndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentExchangeEnd_Port() {
		return (EReference)componentExchangeEndEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentExchangeEnd_Part() {
		return (EReference)componentExchangeEndEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentPort() {
		return componentPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentPort_Orientation() {
		return (EAttribute)componentPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentPort_Kind() {
		return (EAttribute)componentPortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentPort_ComponentExchanges() {
		return (EReference)componentPortEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentPort_AllocatedFunctionPorts() {
		return (EReference)componentPortEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentPort_DelegatedComponentPorts() {
		return (EReference)componentPortEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentPort_RealizedComponentPorts() {
		return (EReference)componentPortEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFunctionalChainKind() {
		return functionalChainKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFunctionKind() {
		return functionKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getComponentExchangeKind() {
		return componentExchangeKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getComponentPortKind() {
		return componentPortKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOrientationPortKind() {
		return orientationPortKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FaFactory getFaFactory() {
		return (FaFactory)getEFactoryInstance();
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
		abstractFunctionalArchitectureEClass = createEClass(ABSTRACT_FUNCTIONAL_ARCHITECTURE);
		createEReference(abstractFunctionalArchitectureEClass, ABSTRACT_FUNCTIONAL_ARCHITECTURE__OWNED_COMPONENT_EXCHANGES);
		createEReference(abstractFunctionalArchitectureEClass, ABSTRACT_FUNCTIONAL_ARCHITECTURE__OWNED_COMPONENT_EXCHANGE_CATEGORIES);

		abstractFunctionalStructureEClass = createEClass(ABSTRACT_FUNCTIONAL_STRUCTURE);
		createEReference(abstractFunctionalStructureEClass, ABSTRACT_FUNCTIONAL_STRUCTURE__OWNED_COMPONENT_EXCHANGES);
		createEReference(abstractFunctionalStructureEClass, ABSTRACT_FUNCTIONAL_STRUCTURE__OWNED_COMPONENT_EXCHANGE_CATEGORIES);

		abstractFunctionalBlockEClass = createEClass(ABSTRACT_FUNCTIONAL_BLOCK);
		createEReference(abstractFunctionalBlockEClass, ABSTRACT_FUNCTIONAL_BLOCK__OWNED_COMPONENT_EXCHANGES);
		createEReference(abstractFunctionalBlockEClass, ABSTRACT_FUNCTIONAL_BLOCK__OWNED_COMPONENT_EXCHANGE_CATEGORIES);

		functionPkgEClass = createEClass(FUNCTION_PKG);
		createEReference(functionPkgEClass, FUNCTION_PKG__OWNED_CATEGORIES);

		exchangeCategoryEClass = createEClass(EXCHANGE_CATEGORY);

		functionalChainEClass = createEClass(FUNCTIONAL_CHAIN);
		createEAttribute(functionalChainEClass, FUNCTIONAL_CHAIN__KIND);
		createEReference(functionalChainEClass, FUNCTIONAL_CHAIN__OWNED_FUNCTIONAL_CHAIN_INVOLVEMENTS);
		createEReference(functionalChainEClass, FUNCTIONAL_CHAIN__AVAILABLE_IN_STATES);
		createEReference(functionalChainEClass, FUNCTIONAL_CHAIN__FIRST_FUNCTIONAL_CHAIN_INVOLVEMENTS);
		createEReference(functionalChainEClass, FUNCTIONAL_CHAIN__REALIZED_FUNCTIONAL_CHAINS);

		abstractFunctionalChainContainerEClass = createEClass(ABSTRACT_FUNCTIONAL_CHAIN_CONTAINER);
		createEReference(abstractFunctionalChainContainerEClass, ABSTRACT_FUNCTIONAL_CHAIN_CONTAINER__OWNED_FUNCTIONAL_CHAINS);

		functionalChainInvolvementEClass = createEClass(FUNCTIONAL_CHAIN_INVOLVEMENT);
		createEReference(functionalChainInvolvementEClass, FUNCTIONAL_CHAIN_INVOLVEMENT__NEXT_FUNCTIONAL_CHAIN_INVOLVEMENTS);
		createEReference(functionalChainInvolvementEClass, FUNCTIONAL_CHAIN_INVOLVEMENT__INVOLVED_ELEMENT);

		functionalChainReferenceEClass = createEClass(FUNCTIONAL_CHAIN_REFERENCE);
		createEReference(functionalChainReferenceEClass, FUNCTIONAL_CHAIN_REFERENCE__REFERENCED_FUNCTIONAL_CHAIN);

		functionInputPortEClass = createEClass(FUNCTION_INPUT_PORT);
		createEReference(functionInputPortEClass, FUNCTION_INPUT_PORT__INCOMING_EXCHANGE_ITEMS);

		functionOutputPortEClass = createEClass(FUNCTION_OUTPUT_PORT);
		createEReference(functionOutputPortEClass, FUNCTION_OUTPUT_PORT__OUTGOING_EXCHANGE_ITEMS);

		functionalExchangeEClass = createEClass(FUNCTIONAL_EXCHANGE);
		createEReference(functionalExchangeEClass, FUNCTIONAL_EXCHANGE__EXCHANGED_ITEMS);
		createEReference(functionalExchangeEClass, FUNCTIONAL_EXCHANGE__CATEGORIES);
		createEReference(functionalExchangeEClass, FUNCTIONAL_EXCHANGE__SOURCE_FUNCTION_OUTPUT_PORT);
		createEReference(functionalExchangeEClass, FUNCTIONAL_EXCHANGE__TARGET_FUNCTION_INPUT_PORT);
		createEReference(functionalExchangeEClass, FUNCTIONAL_EXCHANGE__REALIZED_FUNCTIONAL_EXCHANGES);

		abstractFunctionEClass = createEClass(ABSTRACT_FUNCTION);
		createEAttribute(abstractFunctionEClass, ABSTRACT_FUNCTION__KIND);
		createEAttribute(abstractFunctionEClass, ABSTRACT_FUNCTION__CONDITION);
		createEReference(abstractFunctionEClass, ABSTRACT_FUNCTION__OWNED_FUNCTIONAL_EXCHANGES);
		createEReference(abstractFunctionEClass, ABSTRACT_FUNCTION__AVAILABLE_IN_STATES);
		createEReference(abstractFunctionEClass, ABSTRACT_FUNCTION__LINKED_STATE_MACHINE);

		functionPortEClass = createEClass(FUNCTION_PORT);
		createEReference(functionPortEClass, FUNCTION_PORT__REALIZED_FUNCTION_PORTS);

		componentExchangeEClass = createEClass(COMPONENT_EXCHANGE);
		createEAttribute(componentExchangeEClass, COMPONENT_EXCHANGE__KIND);
		createEAttribute(componentExchangeEClass, COMPONENT_EXCHANGE__ORIENTED);
		createEReference(componentExchangeEClass, COMPONENT_EXCHANGE__ALLOCATED_FUNCTIONAL_EXCHANGES);
		createEReference(componentExchangeEClass, COMPONENT_EXCHANGE__OWNED_COMPONENT_EXCHANGE_ENDS);
		createEReference(componentExchangeEClass, COMPONENT_EXCHANGE__SOURCE_PORT);
		createEReference(componentExchangeEClass, COMPONENT_EXCHANGE__SOURCE_PART);
		createEReference(componentExchangeEClass, COMPONENT_EXCHANGE__TARGET_PORT);
		createEReference(componentExchangeEClass, COMPONENT_EXCHANGE__TARGET_PART);
		createEReference(componentExchangeEClass, COMPONENT_EXCHANGE__CATEGORIES);
		createEReference(componentExchangeEClass, COMPONENT_EXCHANGE__REALIZED_COMPONENT_EXCHANGES);

		componentExchangeAllocatorEClass = createEClass(COMPONENT_EXCHANGE_ALLOCATOR);
		createEReference(componentExchangeAllocatorEClass, COMPONENT_EXCHANGE_ALLOCATOR__ALLOCATED_COMPONENT_EXCHANGES);

		componentExchangeCategoryEClass = createEClass(COMPONENT_EXCHANGE_CATEGORY);

		componentExchangeEndEClass = createEClass(COMPONENT_EXCHANGE_END);
		createEReference(componentExchangeEndEClass, COMPONENT_EXCHANGE_END__PORT);
		createEReference(componentExchangeEndEClass, COMPONENT_EXCHANGE_END__PART);

		componentPortEClass = createEClass(COMPONENT_PORT);
		createEAttribute(componentPortEClass, COMPONENT_PORT__ORIENTATION);
		createEAttribute(componentPortEClass, COMPONENT_PORT__KIND);
		createEReference(componentPortEClass, COMPONENT_PORT__COMPONENT_EXCHANGES);
		createEReference(componentPortEClass, COMPONENT_PORT__ALLOCATED_FUNCTION_PORTS);
		createEReference(componentPortEClass, COMPONENT_PORT__DELEGATED_COMPONENT_PORTS);
		createEReference(componentPortEClass, COMPONENT_PORT__REALIZED_COMPONENT_PORTS);

		// Create enums
		functionalChainKindEEnum = createEEnum(FUNCTIONAL_CHAIN_KIND);
		functionKindEEnum = createEEnum(FUNCTION_KIND);
		componentExchangeKindEEnum = createEEnum(COMPONENT_EXCHANGE_KIND);
		componentPortKindEEnum = createEEnum(COMPONENT_PORT_KIND);
		orientationPortKindEEnum = createEEnum(ORIENTATION_PORT_KIND);
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
		CapellacorePackage theCapellacorePackage = (CapellacorePackage)EPackage.Registry.INSTANCE.getEPackage(CapellacorePackage.eNS_URI);
		CapellacommonPackage theCapellacommonPackage = (CapellacommonPackage)EPackage.Registry.INSTANCE.getEPackage(CapellacommonPackage.eNS_URI);
		ModellingcorePackage theModellingcorePackage = (ModellingcorePackage)EPackage.Registry.INSTANCE.getEPackage(ModellingcorePackage.eNS_URI);
		ActivityPackage theActivityPackage = (ActivityPackage)EPackage.Registry.INSTANCE.getEPackage(ActivityPackage.eNS_URI);
		InformationPackage theInformationPackage = (InformationPackage)EPackage.Registry.INSTANCE.getEPackage(InformationPackage.eNS_URI);
		BehaviorPackage theBehaviorPackage = (BehaviorPackage)EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI);
		CsPackage theCsPackage = (CsPackage)EPackage.Registry.INSTANCE.getEPackage(CsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		abstractFunctionalArchitectureEClass.getESuperTypes().add(theCapellacorePackage.getStructure());
		abstractFunctionalStructureEClass.getESuperTypes().add(theCapellacorePackage.getStructure());
		abstractFunctionalBlockEClass.getESuperTypes().add(theCapellacorePackage.getType());
		functionPkgEClass.getESuperTypes().add(theCapellacorePackage.getStructure());
		exchangeCategoryEClass.getESuperTypes().add(theCapellacorePackage.getNamedElement());
		functionalChainEClass.getESuperTypes().add(theCapellacorePackage.getNamedElement());
		functionalChainEClass.getESuperTypes().add(theCapellacorePackage.getInvolvedElement());
		functionalChainEClass.getESuperTypes().add(theCapellacorePackage.getCapellaElement());
		abstractFunctionalChainContainerEClass.getESuperTypes().add(theCapellacorePackage.getCapellaElement());
		functionalChainInvolvementEClass.getESuperTypes().add(theCapellacorePackage.getCapellaElement());
		functionalChainInvolvementEClass.getESuperTypes().add(theModellingcorePackage.getModelElement());
		functionalChainReferenceEClass.getESuperTypes().add(this.getFunctionalChainInvolvement());
		functionInputPortEClass.getESuperTypes().add(this.getFunctionPort());
		functionInputPortEClass.getESuperTypes().add(theActivityPackage.getInputPin());
		functionOutputPortEClass.getESuperTypes().add(this.getFunctionPort());
		functionOutputPortEClass.getESuperTypes().add(theActivityPackage.getOutputPin());
		functionalExchangeEClass.getESuperTypes().add(theCapellacorePackage.getNamedElement());
		functionalExchangeEClass.getESuperTypes().add(theCapellacorePackage.getInvolvedElement());
		functionalExchangeEClass.getESuperTypes().add(theActivityPackage.getObjectFlow());
		functionalExchangeEClass.getESuperTypes().add(theBehaviorPackage.getAbstractEvent());
		functionalExchangeEClass.getESuperTypes().add(theInformationPackage.getAbstractEventOperation());
		functionalExchangeEClass.getESuperTypes().add(theCapellacorePackage.getCapellaElement());
		functionalExchangeEClass.getESuperTypes().add(theModellingcorePackage.getModelElement());
		abstractFunctionEClass.getESuperTypes().add(theCapellacorePackage.getNamespace());
		abstractFunctionEClass.getESuperTypes().add(theCapellacorePackage.getInvolvedElement());
		abstractFunctionEClass.getESuperTypes().add(this.getAbstractFunctionalChainContainer());
		abstractFunctionEClass.getESuperTypes().add(theBehaviorPackage.getAbstractEvent());
		abstractFunctionEClass.getESuperTypes().add(theInformationPackage.getProperty());
		abstractFunctionEClass.getESuperTypes().add(theActivityPackage.getAbstractAction());
		functionPortEClass.getESuperTypes().add(theInformationPackage.getPort());
		functionPortEClass.getESuperTypes().add(theCapellacorePackage.getTypedElement());
		componentExchangeEClass.getESuperTypes().add(theBehaviorPackage.getAbstractEvent());
		componentExchangeEClass.getESuperTypes().add(theInformationPackage.getAbstractEventOperation());
		componentExchangeEClass.getESuperTypes().add(theCapellacorePackage.getNamedElement());
		componentExchangeEClass.getESuperTypes().add(theModellingcorePackage.getAbstractInformationFlow());
		componentExchangeAllocatorEClass.getESuperTypes().add(theCapellacorePackage.getNamedElement());
		componentExchangeCategoryEClass.getESuperTypes().add(theCapellacorePackage.getNamedElement());
		componentExchangeEndEClass.getESuperTypes().add(theModellingcorePackage.getInformationsExchanger());
		componentExchangeEndEClass.getESuperTypes().add(theCapellacorePackage.getCapellaElement());
		componentPortEClass.getESuperTypes().add(theInformationPackage.getPort());
		componentPortEClass.getESuperTypes().add(theInformationPackage.getPartition());
		componentPortEClass.getESuperTypes().add(theModellingcorePackage.getInformationsExchanger());

		// Initialize classes and features; add operations and parameters
		initEClass(abstractFunctionalArchitectureEClass, AbstractFunctionalArchitecture.class, "AbstractFunctionalArchitecture", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractFunctionalArchitecture_OwnedComponentExchanges(), this.getComponentExchange(), null, "ownedComponentExchanges", null, 0, -1, AbstractFunctionalArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractFunctionalArchitecture_OwnedComponentExchangeCategories(), this.getComponentExchangeCategory(), null, "ownedComponentExchangeCategories", null, 0, -1, AbstractFunctionalArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractFunctionalStructureEClass, AbstractFunctionalStructure.class, "AbstractFunctionalStructure", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractFunctionalStructure_OwnedComponentExchanges(), this.getComponentExchange(), null, "ownedComponentExchanges", null, 0, -1, AbstractFunctionalStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractFunctionalStructure_OwnedComponentExchangeCategories(), this.getComponentExchangeCategory(), null, "ownedComponentExchangeCategories", null, 0, -1, AbstractFunctionalStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractFunctionalBlockEClass, AbstractFunctionalBlock.class, "AbstractFunctionalBlock", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractFunctionalBlock_OwnedComponentExchanges(), this.getComponentExchange(), null, "ownedComponentExchanges", null, 0, -1, AbstractFunctionalBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractFunctionalBlock_OwnedComponentExchangeCategories(), this.getComponentExchangeCategory(), null, "ownedComponentExchangeCategories", null, 0, -1, AbstractFunctionalBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionPkgEClass, FunctionPkg.class, "FunctionPkg", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionPkg_OwnedCategories(), this.getExchangeCategory(), null, "ownedCategories", null, 0, -1, FunctionPkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exchangeCategoryEClass, ExchangeCategory.class, "ExchangeCategory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(functionalChainEClass, FunctionalChain.class, "FunctionalChain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFunctionalChain_Kind(), this.getFunctionalChainKind(), "kind", null, 0, 1, FunctionalChain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionalChain_OwnedFunctionalChainInvolvements(), this.getFunctionalChainInvolvement(), null, "ownedFunctionalChainInvolvements", null, 0, -1, FunctionalChain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionalChain_AvailableInStates(), theCapellacommonPackage.getState(), null, "availableInStates", null, 0, -1, FunctionalChain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionalChain_FirstFunctionalChainInvolvements(), this.getFunctionalChainInvolvement(), null, "firstFunctionalChainInvolvements", null, 0, -1, FunctionalChain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionalChain_RealizedFunctionalChains(), this.getFunctionalChain(), null, "realizedFunctionalChains", null, 0, -1, FunctionalChain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractFunctionalChainContainerEClass, AbstractFunctionalChainContainer.class, "AbstractFunctionalChainContainer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractFunctionalChainContainer_OwnedFunctionalChains(), this.getFunctionalChain(), null, "ownedFunctionalChains", null, 0, -1, AbstractFunctionalChainContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionalChainInvolvementEClass, FunctionalChainInvolvement.class, "FunctionalChainInvolvement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionalChainInvolvement_NextFunctionalChainInvolvements(), this.getFunctionalChainInvolvement(), null, "nextFunctionalChainInvolvements", null, 0, -1, FunctionalChainInvolvement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionalChainInvolvement_InvolvedElement(), theCapellacorePackage.getInvolvedElement(), null, "involvedElement", null, 0, 1, FunctionalChainInvolvement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionalChainReferenceEClass, FunctionalChainReference.class, "FunctionalChainReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionalChainReference_ReferencedFunctionalChain(), this.getFunctionalChain(), null, "referencedFunctionalChain", null, 0, 1, FunctionalChainReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionInputPortEClass, FunctionInputPort.class, "FunctionInputPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionInputPort_IncomingExchangeItems(), theInformationPackage.getExchangeItem(), null, "incomingExchangeItems", null, 0, -1, FunctionInputPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionOutputPortEClass, FunctionOutputPort.class, "FunctionOutputPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionOutputPort_OutgoingExchangeItems(), theInformationPackage.getExchangeItem(), null, "outgoingExchangeItems", null, 0, -1, FunctionOutputPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionalExchangeEClass, FunctionalExchange.class, "FunctionalExchange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionalExchange_ExchangedItems(), theInformationPackage.getExchangeItem(), null, "exchangedItems", null, 0, -1, FunctionalExchange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionalExchange_Categories(), this.getExchangeCategory(), null, "categories", null, 0, -1, FunctionalExchange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionalExchange_SourceFunctionOutputPort(), this.getFunctionOutputPort(), null, "sourceFunctionOutputPort", null, 0, 1, FunctionalExchange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionalExchange_TargetFunctionInputPort(), this.getFunctionInputPort(), null, "targetFunctionInputPort", null, 0, 1, FunctionalExchange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionalExchange_RealizedFunctionalExchanges(), this.getFunctionalExchange(), null, "realizedFunctionalExchanges", null, 0, -1, FunctionalExchange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractFunctionEClass, AbstractFunction.class, "AbstractFunction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractFunction_Kind(), this.getFunctionKind(), "kind", null, 0, 1, AbstractFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractFunction_Condition(), ecorePackage.getEString(), "condition", null, 0, 1, AbstractFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractFunction_OwnedFunctionalExchanges(), this.getFunctionalExchange(), null, "ownedFunctionalExchanges", null, 0, -1, AbstractFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractFunction_AvailableInStates(), theCapellacommonPackage.getState(), null, "availableInStates", null, 0, -1, AbstractFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractFunction_LinkedStateMachine(), theCapellacommonPackage.getStateMachine(), null, "linkedStateMachine", null, 0, 1, AbstractFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionPortEClass, FunctionPort.class, "FunctionPort", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionPort_RealizedFunctionPorts(), this.getFunctionPort(), null, "realizedFunctionPorts", null, 0, -1, FunctionPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentExchangeEClass, ComponentExchange.class, "ComponentExchange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponentExchange_Kind(), this.getComponentExchangeKind(), "kind", null, 0, 1, ComponentExchange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentExchange_Oriented(), ecorePackage.getEBoolean(), "oriented", "false", 0, 1, ComponentExchange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentExchange_AllocatedFunctionalExchanges(), this.getFunctionalExchange(), null, "allocatedFunctionalExchanges", null, 0, -1, ComponentExchange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentExchange_OwnedComponentExchangeEnds(), this.getComponentExchangeEnd(), null, "ownedComponentExchangeEnds", null, 0, -1, ComponentExchange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentExchange_SourcePort(), theInformationPackage.getPort(), null, "sourcePort", null, 0, 1, ComponentExchange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentExchange_SourcePart(), theCsPackage.getPart(), null, "sourcePart", null, 0, 1, ComponentExchange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentExchange_TargetPort(), theInformationPackage.getPort(), null, "targetPort", null, 0, 1, ComponentExchange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentExchange_TargetPart(), theCsPackage.getPart(), null, "targetPart", null, 0, 1, ComponentExchange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentExchange_Categories(), this.getComponentExchangeCategory(), null, "categories", null, 0, -1, ComponentExchange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentExchange_RealizedComponentExchanges(), this.getComponentExchange(), null, "realizedComponentExchanges", null, 0, -1, ComponentExchange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentExchangeAllocatorEClass, ComponentExchangeAllocator.class, "ComponentExchangeAllocator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentExchangeAllocator_AllocatedComponentExchanges(), this.getComponentExchange(), null, "allocatedComponentExchanges", null, 0, -1, ComponentExchangeAllocator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentExchangeCategoryEClass, ComponentExchangeCategory.class, "ComponentExchangeCategory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(componentExchangeEndEClass, ComponentExchangeEnd.class, "ComponentExchangeEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentExchangeEnd_Port(), theInformationPackage.getPort(), null, "port", null, 0, 1, ComponentExchangeEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentExchangeEnd_Part(), theInformationPackage.getPartition(), null, "part", null, 0, 1, ComponentExchangeEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentPortEClass, ComponentPort.class, "ComponentPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponentPort_Orientation(), this.getOrientationPortKind(), "orientation", null, 0, 1, ComponentPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentPort_Kind(), this.getComponentPortKind(), "kind", null, 0, 1, ComponentPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentPort_ComponentExchanges(), this.getComponentExchange(), null, "componentExchanges", null, 0, -1, ComponentPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentPort_AllocatedFunctionPorts(), this.getFunctionPort(), null, "allocatedFunctionPorts", null, 0, -1, ComponentPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentPort_DelegatedComponentPorts(), this.getComponentPort(), null, "delegatedComponentPorts", null, 0, -1, ComponentPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentPort_RealizedComponentPorts(), this.getComponentPort(), null, "realizedComponentPorts", null, 0, -1, ComponentPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(functionalChainKindEEnum, FunctionalChainKind.class, "FunctionalChainKind");
		addEEnumLiteral(functionalChainKindEEnum, FunctionalChainKind.SIMPLE);
		addEEnumLiteral(functionalChainKindEEnum, FunctionalChainKind.COMPOSITE);
		addEEnumLiteral(functionalChainKindEEnum, FunctionalChainKind.FRAGMENT);

		initEEnum(functionKindEEnum, FunctionKind.class, "FunctionKind");
		addEEnumLiteral(functionKindEEnum, FunctionKind.FUNCTION);
		addEEnumLiteral(functionKindEEnum, FunctionKind.DUPLICATE);
		addEEnumLiteral(functionKindEEnum, FunctionKind.GATHER);
		addEEnumLiteral(functionKindEEnum, FunctionKind.SELECT);
		addEEnumLiteral(functionKindEEnum, FunctionKind.SPLIT);
		addEEnumLiteral(functionKindEEnum, FunctionKind.ROUTE);

		initEEnum(componentExchangeKindEEnum, ComponentExchangeKind.class, "ComponentExchangeKind");
		addEEnumLiteral(componentExchangeKindEEnum, ComponentExchangeKind.UNSET);
		addEEnumLiteral(componentExchangeKindEEnum, ComponentExchangeKind.DELEGATION);
		addEEnumLiteral(componentExchangeKindEEnum, ComponentExchangeKind.ASSEMBLY);
		addEEnumLiteral(componentExchangeKindEEnum, ComponentExchangeKind.FLOW);

		initEEnum(componentPortKindEEnum, ComponentPortKind.class, "ComponentPortKind");
		addEEnumLiteral(componentPortKindEEnum, ComponentPortKind.STANDARD);
		addEEnumLiteral(componentPortKindEEnum, ComponentPortKind.FLOW);

		initEEnum(orientationPortKindEEnum, OrientationPortKind.class, "OrientationPortKind");
		addEEnumLiteral(orientationPortKindEEnum, OrientationPortKind.UNSET);
		addEEnumLiteral(orientationPortKindEEnum, OrientationPortKind.IN);
		addEEnumLiteral(orientationPortKindEEnum, OrientationPortKind.OUT);
		addEEnumLiteral(orientationPortKindEEnum, OrientationPortKind.INOUT);

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
			 "sourceNsURI", "http://www.polarsys.org/capella/core/fa/0.8.0"
		   });
	}

} //FaPackageImpl
