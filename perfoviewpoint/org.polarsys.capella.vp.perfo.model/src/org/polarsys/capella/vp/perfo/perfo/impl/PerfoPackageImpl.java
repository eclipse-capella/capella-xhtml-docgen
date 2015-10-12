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
package org.polarsys.capella.vp.perfo.perfo.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

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

import org.polarsys.capella.vp.perfo.perfo.PerfoFactory;
import org.polarsys.capella.vp.perfo.perfo.PerfoPackage;
import org.polarsys.capella.vp.perfo.perfo.PerformanceCapacity;
import org.polarsys.capella.vp.perfo.perfo.PerformanceConsumption;
import org.polarsys.capella.vp.perfo.perfo.PerformanceCriteria;
import org.polarsys.capella.vp.perfo.perfo.UnityElement;
import org.polarsys.capella.vp.perfo.perfo.measurementUnit_Type;
import org.polarsys.capella.vp.perfo.perfo.timeCapacity;
import org.polarsys.capella.vp.perfo.perfo.timeConsumption;

import org.polarsys.kitalpha.emde.model.EmdePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PerfoPackageImpl extends EPackageImpl implements PerfoPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass performanceCriteriaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass performanceConsumptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass performanceCapacityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeConsumptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeCapacityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unityElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum measurementUnit_TypeEEnum = null;

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
	 * @see org.polarsys.capella.vp.perfo.perfo.PerfoPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PerfoPackageImpl() {
		super(eNS_URI, PerfoFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PerfoPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PerfoPackage init() {
		if (isInited)
			return (PerfoPackage) EPackage.Registry.INSTANCE
					.getEPackage(PerfoPackage.eNS_URI);

		// Obtain or create and register package
		PerfoPackageImpl thePerfoPackage = (PerfoPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof PerfoPackageImpl ? EPackage.Registry.INSTANCE
				.get(eNS_URI) : new PerfoPackageImpl());

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

		// Create package meta-data objects
		thePerfoPackage.createPackageContents();

		// Initialize created meta-data
		thePerfoPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePerfoPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PerfoPackage.eNS_URI, thePerfoPackage);
		return thePerfoPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerformanceCriteria() {
		return performanceCriteriaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerformanceCriteria_Value() {
		return (EAttribute) performanceCriteriaEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerformanceCriteria_MaxValue() {
		return (EAttribute) performanceCriteriaEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerformanceCriteria_MinValue() {
		return (EAttribute) performanceCriteriaEClass.getEStructuralFeatures()
				.get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerformanceConsumption() {
		return performanceConsumptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerformanceCapacity() {
		return performanceCapacityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass gettimeConsumption() {
		return timeConsumptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass gettimeCapacity() {
		return timeCapacityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute gettimeCapacity_CurrentExecutionTime() {
		return (EAttribute) timeCapacityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnityElement() {
		return unityElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnityElement_MeasurementUnit() {
		return (EAttribute) unityElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getmeasurementUnit_Type() {
		return measurementUnit_TypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerfoFactory getPerfoFactory() {
		return (PerfoFactory) getEFactoryInstance();
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
		performanceCriteriaEClass = createEClass(PERFORMANCE_CRITERIA);
		createEAttribute(performanceCriteriaEClass, PERFORMANCE_CRITERIA__VALUE);
		createEAttribute(performanceCriteriaEClass,
				PERFORMANCE_CRITERIA__MAX_VALUE);
		createEAttribute(performanceCriteriaEClass,
				PERFORMANCE_CRITERIA__MIN_VALUE);

		performanceConsumptionEClass = createEClass(PERFORMANCE_CONSUMPTION);

		performanceCapacityEClass = createEClass(PERFORMANCE_CAPACITY);

		timeConsumptionEClass = createEClass(TIME_CONSUMPTION);

		timeCapacityEClass = createEClass(TIME_CAPACITY);
		createEAttribute(timeCapacityEClass,
				TIME_CAPACITY__CURRENT_EXECUTION_TIME);

		unityElementEClass = createEClass(UNITY_ELEMENT);
		createEAttribute(unityElementEClass, UNITY_ELEMENT__MEASUREMENT_UNIT);

		// Create enums
		measurementUnit_TypeEEnum = createEEnum(MEASUREMENT_UNIT_TYPE);
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
		EmdePackage theEmdePackage = (EmdePackage) EPackage.Registry.INSTANCE
				.getEPackage(EmdePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		performanceCriteriaEClass.getESuperTypes().add(
				theCapellacorePackage.getNamedElement());
		performanceConsumptionEClass.getESuperTypes().add(
				this.getPerformanceCriteria());
		performanceCapacityEClass.getESuperTypes().add(
				this.getPerformanceCriteria());
		timeConsumptionEClass.getESuperTypes().add(
				this.getPerformanceConsumption());
		timeConsumptionEClass.getESuperTypes().add(this.getUnityElement());
		timeConsumptionEClass.getESuperTypes().add(
				theEmdePackage.getElementExtension());
		timeCapacityEClass.getESuperTypes().add(this.getPerformanceCapacity());
		timeCapacityEClass.getESuperTypes().add(this.getUnityElement());
		timeCapacityEClass.getESuperTypes().add(
				theEmdePackage.getElementExtension());
		unityElementEClass.getESuperTypes().add(
				theCapellacorePackage.getNamedElement());

		// Initialize classes and features; add operations and parameters
		initEClass(
				performanceCriteriaEClass,
				PerformanceCriteria.class,
				"PerformanceCriteria", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(
				getPerformanceCriteria_Value(),
				ecorePackage.getEInt(),
				"value", null, 0, 1, PerformanceCriteria.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getPerformanceCriteria_MaxValue(),
				ecorePackage.getEInt(),
				"maxValue", null, 0, 1, PerformanceCriteria.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getPerformanceCriteria_MinValue(),
				ecorePackage.getEInt(),
				"minValue", null, 0, 1, PerformanceCriteria.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(
				performanceConsumptionEClass,
				PerformanceConsumption.class,
				"PerformanceConsumption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(
				performanceCapacityEClass,
				PerformanceCapacity.class,
				"PerformanceCapacity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(
				timeConsumptionEClass,
				timeConsumption.class,
				"timeConsumption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(
				timeCapacityEClass,
				timeCapacity.class,
				"timeCapacity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(
				gettimeCapacity_CurrentExecutionTime(),
				ecorePackage.getEInt(),
				"currentExecutionTime", null, 0, 1, timeCapacity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(
				unityElementEClass,
				UnityElement.class,
				"UnityElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(
				getUnityElement_MeasurementUnit(),
				this.getmeasurementUnit_Type(),
				"measurementUnit", null, 0, 1, UnityElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		// Initialize enums and add enum literals
		initEEnum(measurementUnit_TypeEEnum, measurementUnit_Type.class,
				"measurementUnit_Type"); //$NON-NLS-1$
		addEEnumLiteral(measurementUnit_TypeEEnum,
				measurementUnit_Type.MILLISECOND);

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
		addAnnotation(
				timeConsumptionEClass,
				source,
				new String[] {
						"ExtendedElement", " http://www.polarsys.org/capella/core/fa/0.8.0#//FunctionalExchange http://www.polarsys.org/capella/core/pa/0.8.0#//PhysicalFunction http://www.polarsys.org/capella/core/la/0.8.0#//LogicalFunction" //$NON-NLS-1$ //$NON-NLS-2$
				});
		addAnnotation(
				timeCapacityEClass,
				source,
				new String[] {
						"ExtendedElement", " http://www.polarsys.org/capella/core/fa/0.8.0#//FunctionalChain" //$NON-NLS-1$ //$NON-NLS-2$
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
		addAnnotation(
				timeConsumptionEClass,
				source,
				new String[] {
						"Mapping", " platform:/plugin/org.polarsys.capella.core.data.gen/model/FunctionalAnalysis.ecore#//FunctionalExchange platform:/plugin/org.polarsys.capella.core.data.gen/model/PhysicalArchitecture.ecore#//PhysicalFunction platform:/plugin/org.polarsys.capella.core.data.gen/model/LogicalArchitecture.ecore#//LogicalFunction" //$NON-NLS-1$ //$NON-NLS-2$
				});
		addAnnotation(
				timeCapacityEClass,
				source,
				new String[] {
						"Mapping", " platform:/plugin/org.polarsys.capella.core.data.gen/model/FunctionalAnalysis.ecore#//FunctionalChain" //$NON-NLS-1$ //$NON-NLS-2$
				});
	}

} //PerfoPackageImpl
