/*******************************************************************************
 * Copyright (c) 2006, 2015 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales - initial API and implementation
 ******************************************************************************/
package org.polarsys.capella.docgen.util;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.polarsys.capella.core.data.information.Class;
import org.polarsys.capella.core.data.information.ExchangeItem;
import org.polarsys.capella.core.data.information.ExchangeItemElement;
import org.polarsys.capella.core.data.information.Property;
import org.polarsys.capella.core.data.information.datatype.BooleanType;
import org.polarsys.capella.core.data.information.datatype.DataType;
import org.polarsys.capella.core.data.information.datatype.Enumeration;
import org.polarsys.capella.core.data.information.datavalue.DataValue;
import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.core.data.capellacore.TypedElement;

public class CapellaDataTypeService {
	
	public static List<String> getFeatures(EObject eObj_p) {
		return getFeatures(eObj_p, null, null);
	}
	
	public static List<String> getFeatures(EObject eObj_p, String projectName, String outputFolder) {
		boolean simple = false;
		if (projectName == null || (projectName != null && projectName.trim().isEmpty()))
		{
			simple = true;
		}
		if (outputFolder == null || (outputFolder != null && outputFolder.trim().isEmpty()))
		{
			simple = true;
		}
		
		List<String> ret = new ArrayList<String>();
		if (eObj_p instanceof DataType) 
		{
			DataType dataType = (DataType) eObj_p;
			// Add boolean Features information
			ret.add(CapellaServices.BOLD_BEGIN + CapellaServices.IS_ABSTRACT + CapellaServices.BOLD_END + dataType.isAbstract());
			ret.add(CapellaServices.BOLD_BEGIN + CapellaServices.IS_DISCRETE + CapellaServices.BOLD_END + dataType.isDiscrete());

			// MinValue DataValue
			DataValue minValue = getMinValue(dataType);
			if (minValue != null) 
			{
				String s_minValue = (simple ? 
										CapellaDataValueServices.getSimpleValueOfDataValue(minValue) : 
										CapellaServices.DIV_WITH_PADDING 
										+ CapellaDataValueServices.getDataValueInformation(minValue, projectName, outputFolder)) 
										+ CapellaServices.DIV_WITH_PADDING;
				
				ret.add(CapellaServices.BOLD_BEGIN
						+ "Min Value: "
						+ CapellaServices.BOLD_END
						+ s_minValue);
						//+ ((minValue instanceof NumericValue && null != ((NumericValue) minValue).getUnit()) ? CapellaServices.SPACE
						//		+ CapellaDataValueServices.getUnitOfNumericValue((NumericValue) minValue) : CapellaServices.EMPTY));
			}

			// MinLength DataValue
			DataValue minLength = getMinLength(dataType);
			if (minLength != null) 
			{
				String s_minLength = (simple ? 
										CapellaDataValueServices.getSimpleValueOfDataValue(minLength) : 
										CapellaServices.DIV_WITH_PADDING 
										+ CapellaDataValueServices.getDataValueInformation(minLength, projectName, outputFolder))
										+ CapellaServices.DIV_WITH_PADDING;
				
				ret.add(CapellaServices.BOLD_BEGIN 
						+ "Min Length: " 
						+ CapellaServices.BOLD_END 
						+ s_minLength);
				//ret.add(CapellaServices.BOLD_BEGIN + "Min Length: " + CapellaServices.BOLD_END + CapellaDataValueServices.getSimpleValueOfDataValue(minLength));
			}

			// MaxValue DataValue
			DataValue maxValue = getMaxValue(dataType);
			if (maxValue != null) 
			{
				String s_maxValue = (simple ? 
										CapellaDataValueServices.getSimpleValueOfDataValue(maxValue) : 
										CapellaServices.DIV_WITH_PADDING 
										+ CapellaDataValueServices.getDataValueInformation(maxValue, projectName, outputFolder))
										+ CapellaServices.DIV_WITH_PADDING;
				
				ret.add(CapellaServices.BOLD_BEGIN
						+ "Max Value: "
						+ CapellaServices.BOLD_END
						+ s_maxValue);
				//+ CapellaDataValueServices.getSimpleValueOfDataValue(maxValue)
				//		+ ((maxValue instanceof NumericValue && null != ((NumericValue) maxValue).getUnit()) ? CapellaServices.SPACE
				//				+ CapellaDataValueServices.getUnitOfNumericValue((NumericValue) maxValue) : CapellaServices.EMPTY));
			}

			// MaxLength DataValue
			DataValue maxLength = getMaxLength(dataType);
			if (maxLength != null) 
			{
				String s_maxLength = (simple ? 
										CapellaDataValueServices.getSimpleValueOfDataValue(maxLength) : 
										CapellaServices.DIV_WITH_PADDING 
										+ CapellaDataValueServices.getDataValueInformation(maxLength, projectName, outputFolder))
										+ CapellaServices.DIV_WITH_PADDING;
				
				ret.add(CapellaServices.BOLD_BEGIN 
						+ "Max Length: "  
						+ CapellaServices.BOLD_END  
						+ s_maxLength);
				//ret.add(CapellaServices.BOLD_BEGIN + "Max Length: " + CapellaServices.BOLD_END + CapellaDataValueServices.getSimpleValueOfDataValue(maxLength));
			}
			
			// Default DataValue
			DataValue defaultValue = dataType.getDefaultValue();
			if (defaultValue != null) 
			{
				String s_defaultValue = (simple ? 
										CapellaDataValueServices.getSimpleValueOfDataValue(defaultValue) : 
										CapellaServices.DIV_WITH_PADDING 
										+ CapellaDataValueServices.getDataValueInformation(defaultValue, projectName, outputFolder))
										+ CapellaServices.DIV_WITH_PADDING;
				
				ret.add(CapellaServices.BOLD_BEGIN 
						+ CapellaServices.DEFAULT_FEATURE 
						+ CapellaServices.BOLD_END
						+ s_defaultValue);
						//+ CapellaDataValueServices.getValueOfDataValue(defaultValue));
			}
			
			// NullValue DataValue
			DataValue nullValue = getNullValue(dataType);
			if (nullValue != null) 
			{
				String s_nullValue = (simple ? 
											CapellaDataValueServices.getSimpleValueOfDataValue(nullValue) : 
											CapellaServices.DIV_WITH_PADDING 
											+ CapellaDataValueServices.getDataValueInformation(nullValue, projectName, outputFolder))
											+ CapellaServices.DIV_WITH_PADDING;
				
				ret.add(CapellaServices.BOLD_BEGIN 
						+ "Null Value: " 
						+ CapellaServices.BOLD_END 
						+ s_nullValue);
				//ret.add(CapellaServices.BOLD_BEGIN + "Null Value: " + CapellaServices.BOLD_END + CapellaDataValueServices.getSimpleValueOfDataValue(nullValue));
			}

			// Add the no boolean Features information if is not null
			if (null != dataType.getPattern())
				ret.add(CapellaServices.BOLD_BEGIN + CapellaServices.PATTERN + CapellaServices.BOLD_END + dataType.getPattern());

		}
		return ret;
	}

	/**
	 * 
	 * @param theClass
	 * @param projectName
	 * @param outputFolder
	 * @return
	 */
	public static Collection<String> getTypeOf(DataType dataType, String projectName, String outputFolder) {
		List<String> ret = new ArrayList<String>();
		Collection<TypedElement> typedElements = dataType.getTypedElements();

		for (TypedElement typedElement : typedElements) {
			if (typedElement instanceof ExchangeItemElement) {
				EObject exchangeItem = typedElement.eContainer();
				if (null != exchangeItem && exchangeItem instanceof ExchangeItem) {
					String currentStringValue = CapellaServices.getImageLinkFromElement(exchangeItem, projectName, outputFolder) + CapellaServices.SPACE
							+ CapellaServices.getHyperlinkFromElement(exchangeItem);
					if (!ret.contains(currentStringValue))
						ret.add(currentStringValue);
				}
			}
			if (typedElement instanceof Property) {
				Property prop = (Property) typedElement;
				EObject eContainer = prop.eContainer();
				if (null != eContainer && eContainer instanceof Class) {
					String currentValue = CapellaServices.getImageLinkFromElement(eContainer, projectName, outputFolder) + CapellaServices.SPACE
							+ CapellaServices.getHyperlinkFromElement(eContainer);
					if (!ret.contains(currentValue))
						ret.add(currentValue);
				}
			}

		}
		return ret;
	}

	public static Collection<String> getLiterals(CapellaElement element, String projectName, String outputFolder) {
		Collection<String> literals = new ArrayList<String>();
		Collection<DataValue> dataValues = new ArrayList<DataValue>();
		if (element instanceof BooleanType) {
			dataValues.addAll(((BooleanType) element).getOwnedLiterals());

		} else if (element instanceof Enumeration) {
			dataValues.addAll(((Enumeration) element).getOwnedLiterals());

		}

		for (DataValue currentDataValue : dataValues) {
			literals.add(CapellaDataValueServices.getDataValueLiteralInformation(currentDataValue, projectName, outputFolder));
		}
		return literals;
	}

	private static DataValue getMinValue(DataType dataType) {
		return getMethodDataValue(dataType, "getOwnedMinValue");
	}

	private static DataValue getMinLength(DataType dataType) {
		return getMethodDataValue(dataType, "getOwnedMinLength");
	}

	private static DataValue getMaxValue(DataType dataType) {
		return getMethodDataValue(dataType, "getOwnedMaxValue");
	}

	private static DataValue getMaxLength(DataType dataType) {
		return getMethodDataValue(dataType, "getOwnedMaxLength");
	}

	private static DataValue getNullValue(DataType dataType) {
		return getMethodDataValue(dataType, "getOwnedNullValue");
	}

	private static DataValue getMethodDataValue(DataType dataType, String methodName) {
		try {
			Method method = dataType.getClass().getMethod(methodName, new java.lang.Class[] {});
			Object result = method.invoke(dataType, new Object[] {});
			if (result instanceof DataValue)
				return (DataValue) result;
			return null;

		} catch (Exception e) {
			return null;
		}
	}

}
