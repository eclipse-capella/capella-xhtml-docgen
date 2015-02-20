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

package org.polarsys.capella.core.semantic.data.capellacore.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.polarsys.capella.core.semantic.data.capellacore.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CapellacoreFactoryImpl extends EFactoryImpl implements CapellacoreFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CapellacoreFactory init() {
		try {
			CapellacoreFactory theCapellacoreFactory = (CapellacoreFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.polarsys.org/capella/core/core/0.8.0/semantic"); 
			if (theCapellacoreFactory != null) {
				return theCapellacoreFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CapellacoreFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapellacoreFactoryImpl() {
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
			case CapellacorePackage.NAMING_RULE: return createNamingRule();
			case CapellacorePackage.CONSTRAINT: return createConstraint();
			case CapellacorePackage.KEY_VALUE: return createKeyValue();
			case CapellacorePackage.STRING_PROPERTY_VALUE: return createStringPropertyValue();
			case CapellacorePackage.INTEGER_PROPERTY_VALUE: return createIntegerPropertyValue();
			case CapellacorePackage.BOOLEAN_PROPERTY_VALUE: return createBooleanPropertyValue();
			case CapellacorePackage.FLOAT_PROPERTY_VALUE: return createFloatPropertyValue();
			case CapellacorePackage.ENUMERATION_PROPERTY_VALUE: return createEnumerationPropertyValue();
			case CapellacorePackage.ENUMERATION_PROPERTY_TYPE: return createEnumerationPropertyType();
			case CapellacorePackage.ENUMERATION_PROPERTY_LITERAL: return createEnumerationPropertyLiteral();
			case CapellacorePackage.PROPERTY_VALUE_GROUP: return createPropertyValueGroup();
			case CapellacorePackage.PROPERTY_VALUE_PKG: return createPropertyValuePkg();
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
			case CapellacorePackage.VISIBILITY_KIND:
				return createVisibilityKindFromString(eDataType, initialValue);
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
			case CapellacorePackage.VISIBILITY_KIND:
				return convertVisibilityKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamingRule createNamingRule() {
		NamingRuleImpl namingRule = new NamingRuleImpl();
		return namingRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createConstraint() {
		ConstraintImpl constraint = new ConstraintImpl();
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyValue createKeyValue() {
		KeyValueImpl keyValue = new KeyValueImpl();
		return keyValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringPropertyValue createStringPropertyValue() {
		StringPropertyValueImpl stringPropertyValue = new StringPropertyValueImpl();
		return stringPropertyValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerPropertyValue createIntegerPropertyValue() {
		IntegerPropertyValueImpl integerPropertyValue = new IntegerPropertyValueImpl();
		return integerPropertyValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanPropertyValue createBooleanPropertyValue() {
		BooleanPropertyValueImpl booleanPropertyValue = new BooleanPropertyValueImpl();
		return booleanPropertyValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FloatPropertyValue createFloatPropertyValue() {
		FloatPropertyValueImpl floatPropertyValue = new FloatPropertyValueImpl();
		return floatPropertyValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationPropertyValue createEnumerationPropertyValue() {
		EnumerationPropertyValueImpl enumerationPropertyValue = new EnumerationPropertyValueImpl();
		return enumerationPropertyValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationPropertyType createEnumerationPropertyType() {
		EnumerationPropertyTypeImpl enumerationPropertyType = new EnumerationPropertyTypeImpl();
		return enumerationPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationPropertyLiteral createEnumerationPropertyLiteral() {
		EnumerationPropertyLiteralImpl enumerationPropertyLiteral = new EnumerationPropertyLiteralImpl();
		return enumerationPropertyLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyValueGroup createPropertyValueGroup() {
		PropertyValueGroupImpl propertyValueGroup = new PropertyValueGroupImpl();
		return propertyValueGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyValuePkg createPropertyValuePkg() {
		PropertyValuePkgImpl propertyValuePkg = new PropertyValuePkgImpl();
		return propertyValuePkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibilityKind createVisibilityKindFromString(EDataType eDataType, String initialValue) {
		VisibilityKind result = VisibilityKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVisibilityKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapellacorePackage getCapellacorePackage() {
		return (CapellacorePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CapellacorePackage getPackage() {
		return CapellacorePackage.eINSTANCE;
	}

} //CapellacoreFactoryImpl
