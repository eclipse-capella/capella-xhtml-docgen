/*******************************************************************************
 * Copyright (c) 2006, 2015 Thales Global Services
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v1.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v10.html
 * 
 *   Contributors:
 *      Thales - initial API and implementation
 ******************************************************************************/

package org.polarsys.capella.vp.mass.mass.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.polarsys.capella.core.data.capellacommon.CapellacommonPackage;

import org.polarsys.capella.core.data.capellacore.CapellacorePackage;

import org.polarsys.capella.core.data.capellamodeller.CapellamodellerPackage;

import org.polarsys.capella.core.data.cs.CsPackage;

import org.polarsys.capella.core.data.ctx.CtxPackage;

import org.polarsys.capella.core.data.epbs.EpbsPackage;

import org.polarsys.capella.core.data.fa.FaPackage;

import org.polarsys.capella.core.data.information.InformationPackage;

import org.polarsys.capella.core.data.interaction.InteractionPackage;

import org.polarsys.capella.core.data.la.LaPackage;

import org.polarsys.capella.core.data.oa.OaPackage;

import org.polarsys.capella.core.data.pa.PaPackage;

import org.polarsys.capella.core.data.requirement.RequirementPackage;

import org.polarsys.capella.core.data.sharedmodel.SharedmodelPackage;

import org.polarsys.capella.vp.mass.mass.Mass;
import org.polarsys.capella.vp.mass.mass.MassFactory;
import org.polarsys.capella.vp.mass.mass.MassPackage;
import org.polarsys.capella.vp.mass.mass.PartMass;

import org.polarsys.kitalpha.emde.model.EmdePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MassPackageImpl extends EPackageImpl implements MassPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass massEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partMassEClass = null;

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
	 * @see org.polarsys.capella.vp.mass.mass.MassPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MassPackageImpl() {
		super(eNS_URI, MassFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MassPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MassPackage init() {
		if (isInited)
			return (MassPackage) EPackage.Registry.INSTANCE.getEPackage(MassPackage.eNS_URI);

		// Obtain or create and register package
		MassPackageImpl theMassPackage = (MassPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof MassPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new MassPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CapellamodellerPackage.eINSTANCE.eClass();
		CapellacorePackage.eINSTANCE.eClass();
		OaPackage.eINSTANCE.eClass();
		CtxPackage.eINSTANCE.eClass();
		LaPackage.eINSTANCE.eClass();
		PaPackage.eINSTANCE.eClass();
		EpbsPackage.eINSTANCE.eClass();
		SharedmodelPackage.eINSTANCE.eClass();
		RequirementPackage.eINSTANCE.eClass();
		CapellacommonPackage.eINSTANCE.eClass();
		InformationPackage.eINSTANCE.eClass();
		CsPackage.eINSTANCE.eClass();
		FaPackage.eINSTANCE.eClass();
		InteractionPackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theMassPackage.createPackageContents();

		// Initialize created meta-data
		theMassPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMassPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MassPackage.eNS_URI, theMassPackage);
		return theMassPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMass() {
		return massEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMass_Value() {
		return (EAttribute) massEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMass_MaxValue() {
		return (EAttribute) massEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMass_MinValue() {
		return (EAttribute) massEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPartMass() {
		return partMassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPartMass_CurrentMass() {
		return (EAttribute) partMassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MassFactory getMassFactory() {
		return (MassFactory) getEFactoryInstance();
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
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		massEClass = createEClass(MASS);
		createEAttribute(massEClass, MASS__VALUE);
		createEAttribute(massEClass, MASS__MAX_VALUE);
		createEAttribute(massEClass, MASS__MIN_VALUE);

		partMassEClass = createEClass(PART_MASS);
		createEAttribute(partMassEClass, PART_MASS__CURRENT_MASS);
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
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CapellacorePackage theCapellacorePackage = (CapellacorePackage) EPackage.Registry.INSTANCE
				.getEPackage(CapellacorePackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage) EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		EmdePackage theEmdePackage = (EmdePackage) EPackage.Registry.INSTANCE.getEPackage(EmdePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		massEClass.getESuperTypes().add(theCapellacorePackage.getNamedElement());
		partMassEClass.getESuperTypes().add(this.getMass());
		partMassEClass.getESuperTypes().add(theEmdePackage.getElementExtension());

		// Initialize classes and features; add operations and parameters
		initEClass(massEClass, Mass.class, "Mass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getMass_Value(), theEcorePackage.getEInt(), "value", null, 0, 1, Mass.class, !IS_TRANSIENT, //$NON-NLS-1$
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMass_MaxValue(), theEcorePackage.getEInt(), "maxValue", null, 0, 1, Mass.class, !IS_TRANSIENT, //$NON-NLS-1$
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMass_MinValue(), theEcorePackage.getEInt(), "minValue", null, 0, 1, Mass.class, !IS_TRANSIENT, //$NON-NLS-1$
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(partMassEClass, PartMass.class, "PartMass", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPartMass_CurrentMass(), theEcorePackage.getEInt(), "currentMass", null, 0, 1, PartMass.class, //$NON-NLS-1$
				IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.polarsys.org/kitalpha/emde/1.0.0/constraint
		createConstraintAnnotations();
		// http://www.polarsys.org/kitalpha/emde/1.0.0/constraintMapping
		createConstraintMappingAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.polarsys.org/kitalpha/emde/1.0.0/constraint</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createConstraintAnnotations() {
		String source = "http://www.polarsys.org/kitalpha/emde/1.0.0/constraint"; //$NON-NLS-1$	
		addAnnotation(partMassEClass, source,
				new String[] { "ExtendedElement", " http://www.polarsys.org/capella/core/cs/1.0.0#//Part" //$NON-NLS-1$ //$NON-NLS-2$
		});
	}

	/**
	 * Initializes the annotations for <b>http://www.polarsys.org/kitalpha/emde/1.0.0/constraintMapping</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createConstraintMappingAnnotations() {
		String source = "http://www.polarsys.org/kitalpha/emde/1.0.0/constraintMapping"; //$NON-NLS-1$	
		addAnnotation(partMassEClass, source, new String[] { "Mapping", //$NON-NLS-1$
				" platform:/plugin/org.polarsys.capella.core.data.gen/model/CompositeStructure.ecore#//Part" //$NON-NLS-1$
		});
	}

} //MassPackageImpl
