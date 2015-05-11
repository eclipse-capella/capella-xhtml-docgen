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

import org.eclipse.emf.ecore.EObject;

import org.polarsys.capella.core.data.information.CollectionValue;
import org.polarsys.capella.core.data.information.datavalue.BinaryExpression;
import org.polarsys.capella.core.data.information.datavalue.ComplexValue;
import org.polarsys.capella.core.data.information.datavalue.DataValue;
import org.polarsys.capella.core.data.information.datavalue.LiteralBooleanValue;
import org.polarsys.capella.core.data.information.datavalue.LiteralNumericValue;
import org.polarsys.capella.core.data.information.datavalue.LiteralStringValue;
import org.polarsys.capella.core.data.information.datavalue.NumericValue;
import org.polarsys.capella.core.data.information.datavalue.UnaryExpression;
import org.polarsys.capella.core.data.information.datavalue.ValuePart;
import org.polarsys.capella.core.data.capellacore.AbstractPropertyValue;
import org.polarsys.capella.core.data.capellacore.NamedElement;
import org.polarsys.capella.core.data.capellacore.Type;
import org.polarsys.capella.common.data.modellingcore.AbstractType;

public class CapellaDataValueServices {
	/**
	 * <b>Get the Data value information</b>
	 * <p>
	 * Get the information of a Data Value
	 * 
	 * @param dataValue_p
	 * @return
	 */
	public static String getDataValueInformation(DataValue dataValue_p, String projectName, String outputFolder) {
		return getDataValueInformation(dataValue_p, projectName, outputFolder, true);
	}

	private static String getDataValueInformation(DataValue dataValue_p, String projectName, String outputFolder, boolean displayType) {
		// Initialize the buffer
		StringBuffer buffer = new StringBuffer();
		buffer.append("<div id=\"" + CapellaServices.getAnchorId(dataValue_p) + "\">");
		buffer.append(CapellaServices.getImageLinkFromElement(dataValue_p, projectName, outputFolder));
		buffer.append(CapellaServices.SPACE);

		// Add the name of data value to the buffer
		buffer.append(CapellaServices.BOLD_BEGIN);
		buffer.append(dataValue_p.getName());
		buffer.append(CapellaServices.BOLD_END);

		// Test if the type of the data value is defined
		AbstractType abstractType;
		if (dataValue_p.getAbstractType() != null)
			abstractType = dataValue_p.getAbstractType();
		else
			abstractType = dataValue_p.getAbstractType();
		if (displayType && abstractType != null) {
			buffer.append(CapellaServices.VALUE_PRESENTER);
			// Add the Hyper link of type of the value to the buffer
			buffer.append(CapellaServices.getHyperlinkFromElement(abstractType) + CapellaServices.SPACE);
		}
		String valueString = getValueOfDataValue(dataValue_p);
		if (valueString != "") {
			buffer.append(CapellaServices.VALUE_EQUAL);
			// Add the value of data value to the buffer
			buffer.append(valueString);
		}
		if (dataValue_p instanceof NumericValue) {
			if (null != ((NumericValue) dataValue_p).getUnit()) {
				String unitString = getUnitOfNumericValue((NumericValue) dataValue_p);
				if (unitString != "") {
					buffer.append(CapellaServices.SPACE);
					buffer.append(unitString);
				}
			}
		}

		if (null != dataValue_p.getSummary()) {
			buffer.append(" - ");
			// Add the summary of the data Value

			buffer.append(dataValue_p.getSummary());
		}
		// Add the Description of the Data Value
		if (null != dataValue_p.getDescription()) {
			buffer.append("<p>");
			buffer.append(StringUtil.transformAREFString(dataValue_p, dataValue_p.getDescription(), projectName, outputFolder));
			buffer.append("</p>");
		}
		
		// Add ComplexValue ValueParts
		if (dataValue_p instanceof ComplexValue)
		{
			Collection<String> valuesPart = new ArrayList<String>();
			ComplexValue complexValue = (ComplexValue) dataValue_p;
			for (ValuePart currentValuePart : complexValue.getOwnedParts()) {
				valuesPart.add(CapellaPropertyServices.getValuePartInformation(currentValuePart, projectName, outputFolder));
			}
			if (valuesPart.size() > 0) 
			{
				buffer.append(CapellaServices.UL_OPEN);
				buffer.append(CapellaServices.LI_OPEN);
				buffer.append("Value-Parts");
				buffer.append(StringUtil.stringListToBulette(valuesPart));
				buffer.append(CapellaServices.LI_CLOSE);
				buffer.append(CapellaServices.UL_CLOSE);
			}
		}
		
		
		// Add DataValue Properties
		Collection<String> propertiesValues = new ArrayList<String>();
		for (AbstractPropertyValue currentAbstractPropertyValue : dataValue_p.getOwnedPropertyValues()) {
			propertiesValues.add(CapellaPropertyServices.getPropertyValueInformation(currentAbstractPropertyValue, projectName, outputFolder));
		}
		if (propertiesValues.size() > 0) {
			buffer.append(CapellaServices.UL_OPEN);
			buffer.append(CapellaServices.LI_OPEN);
			buffer.append("Property-values");
			buffer.append(StringUtil.stringListToBulette(propertiesValues));
			buffer.append(CapellaServices.LI_CLOSE);
			buffer.append(CapellaServices.UL_CLOSE);
		}

		buffer.append("</div>");
		// Return the buffer
		return buffer.toString();
	}

	public static String getUnitOfNumericValue(NumericValue numericValue_p) {
		return CapellaServices.getHyperlinkFromElement(numericValue_p.getUnit());
	}

	public static String getDataValueLiteralInformation(DataValue dataValue_p, String projectName, String outputFolder) {
		return getDataValueInformation(dataValue_p, projectName, outputFolder, false);
	}

	/**
	 * <b>Get the value of a Data Value</b>
	 * <p>
	 * Get the value of a Data Value
	 * 
	 * @param dataValue_p
	 * @return
	 */
	public static String getValueOfDataValue(DataValue dataValue_p) {
		return getValueOfDataValue(dataValue_p, false);
	}

	private static String getValueOfDataValue(DataValue dataValue_p, boolean simple) {
		// Test the type of the Data Value
		if (dataValue_p instanceof LiteralNumericValue) 
		{
			// Return the value
			return (((LiteralNumericValue) dataValue_p).getValue());
		} 
		else 
		{
			if (dataValue_p instanceof BinaryExpression) 
			{
				return (((BinaryExpression) dataValue_p).getExpression());
			} 
			else 
				if (dataValue_p instanceof UnaryExpression) 
				{
					return (((UnaryExpression) dataValue_p).getExpression());
				} 
				else 
					if (dataValue_p instanceof LiteralBooleanValue) 
					{
						return (String.valueOf(((LiteralBooleanValue) dataValue_p).isValue()));
					} 
					else 
						if (dataValue_p instanceof LiteralStringValue) 
						{
							return (((LiteralStringValue) dataValue_p).getValue());
						}
						else
							if (dataValue_p instanceof CollectionValue) 
							{
								CollectionValue collectionValue = (CollectionValue) dataValue_p;
								String result = collectionValue.getName();
								if (result.isEmpty())
								{
									result += "No name";
								}
								Type type = collectionValue.getType();
								if (type != null)
								{
									result += " : " + CapellaServices.getFullDataPkgHierarchyLink(type);
								}
								return result;
							}
		}
		
		EObject referencedValue = getReferencedValue(dataValue_p);
		if (referencedValue instanceof NamedElement) 
		{
			if (simple) 
			{
				String name = ((NamedElement) referencedValue).getName();
				if (name != null && name.length() > 0) 
				{
					return CapellaServices.getHyperlinkFromElement(referencedValue, name);
				}
				
				return CapellaServices.getHyperlinkFromElement(referencedValue);
			} 
			else
				return CapellaServices.getFullDataPkgHierarchyLink(referencedValue);
		}
		// Return empty if there is no value or if the type is not defined
		return CapellaServices.EMPTY;
	}

	public static String getSimpleValueOfDataValue(DataValue dataValue_p) {
		return getValueOfDataValue(dataValue_p, true);
	}

	public static EObject getReferencedValue(DataValue dataValue) {

		try {
			Method methodGetReferencedValue = dataValue.getClass().getMethod("getReferencedValue", new Class[] {});
			Object result = methodGetReferencedValue.invoke(dataValue, new Object[] {});
			if (result instanceof EObject)
				return (EObject) result;
			return null;

		} catch (Exception e) {
			return null;
		}
	}
}
