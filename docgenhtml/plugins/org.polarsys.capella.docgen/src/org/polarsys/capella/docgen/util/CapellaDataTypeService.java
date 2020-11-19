/*******************************************************************************
 * Copyright (c) 2006, 2015 THALES GLOBAL SERVICES.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
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
import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.core.data.capellacore.TypedElement;
import org.polarsys.capella.core.data.information.Class;
import org.polarsys.capella.core.data.information.ExchangeItem;
import org.polarsys.capella.core.data.information.ExchangeItemElement;
import org.polarsys.capella.core.data.information.Property;
import org.polarsys.capella.core.data.information.datatype.BooleanType;
import org.polarsys.capella.core.data.information.datatype.DataType;
import org.polarsys.capella.core.data.information.datatype.Enumeration;
import org.polarsys.capella.core.data.information.datavalue.DataValue;
import org.polarsys.capella.core.data.information.datavalue.NumericValue;

public class CapellaDataTypeService {

	public static List<String> getFeatures(EObject eObj_p) {
		List<String> ret = new ArrayList<String>();
		if (eObj_p instanceof DataType) {
			DataType dataType = (DataType) eObj_p;
			// Add boolean Features information
			ret.add(CapellaServices.BOLD_BEGIN + CapellaServices.IS_ABSTRACT + CapellaServices.BOLD_END + dataType.isAbstract());
			ret.add(CapellaServices.BOLD_BEGIN + CapellaServices.IS_DISCRETE + CapellaServices.BOLD_END + dataType.isDiscrete());

			DataValue minValue = getMinValue(dataType);
			if (minValue != null) {
				ret.add(CapellaServices.BOLD_BEGIN
						+ "Min Value: "
						+ CapellaServices.BOLD_END
						+ CapellaDataValueServices.getSimpleValueOfDataValue(minValue)
						+ ((minValue instanceof NumericValue && null != ((NumericValue) minValue).getUnit()) ? CapellaServices.SPACE
								+ CapellaDataValueServices.getUnitOfNumericValue((NumericValue) minValue) : CapellaServices.EMPTY));
			}

			DataValue minLength = getMinLength(dataType);
			if (minLength != null) {
				ret.add(CapellaServices.BOLD_BEGIN + "Min Length: " + CapellaServices.BOLD_END + CapellaDataValueServices.getSimpleValueOfDataValue(minLength));
			}

			DataValue maxValue = getMaxValue(dataType);
			if (maxValue != null) {
				ret.add(CapellaServices.BOLD_BEGIN
						+ "Max Value: "
						+ CapellaServices.BOLD_END
						+ CapellaDataValueServices.getSimpleValueOfDataValue(maxValue)
						+ ((maxValue instanceof NumericValue && null != ((NumericValue) maxValue).getUnit()) ? CapellaServices.SPACE
								+ CapellaDataValueServices.getUnitOfNumericValue((NumericValue) maxValue) : CapellaServices.EMPTY));
			}

			DataValue maxLength = getMaxLength(dataType);
			if (maxLength != null) {
				ret.add(CapellaServices.BOLD_BEGIN + "Max Length: " + CapellaServices.BOLD_END + CapellaDataValueServices.getSimpleValueOfDataValue(maxLength));
			}
			if (dataType.getDefaultValue() != null) {
				ret.add(CapellaServices.BOLD_BEGIN + CapellaServices.DEFAULT_FEATURE + CapellaServices.BOLD_END
						+ CapellaDataValueServices.getValueOfDataValue(dataType.getDefaultValue()));
			}
			DataValue nullValue = getNullValue(dataType);
			if (nullValue != null) {
				ret.add(CapellaServices.BOLD_BEGIN + "Null Value: " + CapellaServices.BOLD_END + CapellaDataValueServices.getSimpleValueOfDataValue(nullValue));
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
