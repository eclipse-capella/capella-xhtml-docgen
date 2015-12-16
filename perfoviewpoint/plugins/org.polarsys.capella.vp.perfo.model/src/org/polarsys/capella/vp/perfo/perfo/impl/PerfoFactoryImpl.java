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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.polarsys.capella.vp.perfo.perfo.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PerfoFactoryImpl extends EFactoryImpl implements PerfoFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PerfoFactory init() {
		try {
			PerfoFactory thePerfoFactory = (PerfoFactory) EPackage.Registry.INSTANCE.getEFactory(PerfoPackage.eNS_URI);
			if (thePerfoFactory != null) {
				return thePerfoFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PerfoFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerfoFactoryImpl() {
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
		case PerfoPackage.PERFORMANCE_CRITERIA:
			return createPerformanceCriteria();
		case PerfoPackage.PERFORMANCE_CONSUMPTION:
			return createPerformanceConsumption();
		case PerfoPackage.PERFORMANCE_CAPACITY:
			return createPerformanceCapacity();
		case PerfoPackage.TIME_CONSUMPTION:
			return createTimeConsumption();
		case PerfoPackage.TIME_CAPACITY:
			return createTimeCapacity();
		case PerfoPackage.UNITY_ELEMENT:
			return createUnityElement();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
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
		case PerfoPackage.MEASUREMENT_UNIT_TYPE:
			return createmeasurementUnit_TypeFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
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
		case PerfoPackage.MEASUREMENT_UNIT_TYPE:
			return convertmeasurementUnit_TypeToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformanceCriteria createPerformanceCriteria() {
		PerformanceCriteriaImpl performanceCriteria = new PerformanceCriteriaImpl();
		return performanceCriteria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformanceConsumption createPerformanceConsumption() {
		PerformanceConsumptionImpl performanceConsumption = new PerformanceConsumptionImpl();
		return performanceConsumption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformanceCapacity createPerformanceCapacity() {
		PerformanceCapacityImpl performanceCapacity = new PerformanceCapacityImpl();
		return performanceCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeConsumption createTimeConsumption() {
		TimeConsumptionImpl timeConsumption = new TimeConsumptionImpl();
		return timeConsumption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeCapacity createTimeCapacity() {
		TimeCapacityImpl timeCapacity = new TimeCapacityImpl();
		return timeCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnityElement createUnityElement() {
		UnityElementImpl unityElement = new UnityElementImpl();
		return unityElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public measurementUnit_Type createmeasurementUnit_TypeFromString(EDataType eDataType, String initialValue) {
		measurementUnit_Type result = measurementUnit_Type.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertmeasurementUnit_TypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerfoPackage getPerfoPackage() {
		return (PerfoPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PerfoPackage getPackage() {
		return PerfoPackage.eINSTANCE;
	}

} //PerfoFactoryImpl
