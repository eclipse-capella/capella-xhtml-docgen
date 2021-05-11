/*******************************************************************************
 * Copyright (c) 2006, 2021 THALES GLOBAL SERVICES.
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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.common.data.modellingcore.AbstractType;
import org.polarsys.capella.core.data.capellacore.AbstractPropertyValue;
import org.polarsys.capella.core.data.capellacore.NamedElement;
import org.polarsys.capella.core.data.capellacore.Type;
import org.polarsys.capella.core.data.information.CollectionValue;
import org.polarsys.capella.core.data.information.datavalue.BinaryExpression;
import org.polarsys.capella.core.data.information.datavalue.ComplexValue;
import org.polarsys.capella.core.data.information.datavalue.DataValue;
import org.polarsys.capella.core.data.information.datavalue.EnumerationLiteral;
import org.polarsys.capella.core.data.information.datavalue.LiteralBooleanValue;
import org.polarsys.capella.core.data.information.datavalue.LiteralNumericValue;
import org.polarsys.capella.core.data.information.datavalue.LiteralStringValue;
import org.polarsys.capella.core.data.information.datavalue.NumericValue;
import org.polarsys.capella.core.data.information.datavalue.UnaryExpression;
import org.polarsys.capella.core.data.information.datavalue.ValuePart;

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
		buffer.append(dataValue_p.getName() != null && dataValue_p.getName().trim().isEmpty() == false ? dataValue_p.getName() : CapellaServices.NO_NAME);
		buffer.append(CapellaServices.BOLD_END);

		// Test if the type of the data value is defined
		AbstractType abstractType = dataValue_p.getAbstractType();
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
			for (ValuePart currentValuePart : complexValue.getOwnedParts()) 
			{
				String valuePartInformation = CapellaPropertyServices.getValuePartInformation(currentValuePart, projectName, outputFolder);
				DataValue ownedValue = currentValuePart.getOwnedValue();
				if (ownedValue != null)
				{
					String dataValueInformation = getDataValueInformation(ownedValue, projectName, outputFolder);
					if (false == dataValueInformation.isEmpty())
					{
						valuePartInformation += CapellaServices.NEW_LINE; 
						valuePartInformation += CapellaServices.UL_OPEN_WITH_BORDER; 
						valuePartInformation += CapellaServices.LI_OPEN;
						valuePartInformation += CapellaServices.SPAN_BEGIN_LABEL;
						valuePartInformation += "Owned value";
						valuePartInformation += CapellaServices.SPAN_END;
						valuePartInformation += CapellaServices.UL_OPEN; 
						valuePartInformation += CapellaServices.LI_OPEN;
						valuePartInformation += dataValueInformation;
						valuePartInformation += CapellaServices.LI_CLOSE;
						valuePartInformation += CapellaServices.UL_CLOSE;
						valuePartInformation += CapellaServices.LI_CLOSE;
						valuePartInformation += CapellaServices.UL_CLOSE;
					}
				}
				valuesPart.add(valuePartInformation);
			}
			if (valuesPart.size() > 0) 
			{
				buffer.append(CapellaServices.UL_OPEN_WITH_BORDER);
				buffer.append(CapellaServices.LI_OPEN);
				buffer.append(CapellaServices.SPAN_BEGIN_LABEL);
				buffer.append("Value Parts");
				buffer.append(CapellaServices.SPAN_END);
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

		// Add sub-DataValues
		String ownedDataValueInformation = getOwnedDataValueInformation(dataValue_p, projectName, outputFolder, displayType);
		buffer.append(ownedDataValueInformation);
		
		buffer.append("<br />");
		buffer.append("</div>");
		// Return the buffer
		return buffer.toString();
	}
	
	private static String getOwnedDataValueInformation(DataValue dataValue_p, String projectName, String outputFolder, boolean displayType){
		// Initialize the buffer
		StringBuffer buffer = new StringBuffer();
		
		if (dataValue_p instanceof UnaryExpression)
		{
			UnaryExpression ue_dataValue_p = (UnaryExpression) dataValue_p;
			// Owned operand
			DataValue ownedOperand = ue_dataValue_p.getOwnedOperand();
			if (ownedOperand != null)
			{
				String subDataValueInformation = getSubDataValueInformation(ownedOperand, projectName, outputFolder, displayType);
				if (false == subDataValueInformation.isEmpty())
					buffer.append(subDataValueInformation);
			}
		}
		
		if (dataValue_p instanceof BinaryExpression)
		{
			BinaryExpression ue_dataValue_p = (BinaryExpression) dataValue_p;
			// Left operand
			DataValue leftOperand = ue_dataValue_p.getOwnedLeftOperand();
			if (leftOperand != null)
			{
				String subDataValueInformation = getSubDataValueInformation(leftOperand, projectName, outputFolder, displayType);
				if (false == subDataValueInformation.isEmpty())
					buffer.append(subDataValueInformation);
			}
			
			// Right operand
			DataValue rightOperand = ue_dataValue_p.getOwnedRightOperand();
			if (rightOperand != null)
			{
				String subDataValueInformation = getSubDataValueInformation(rightOperand, projectName, outputFolder, displayType);
				if (false == subDataValueInformation.isEmpty())
					buffer.append(subDataValueInformation);
			}
		}
		
		if (dataValue_p instanceof EnumerationLiteral)
		{
			EnumerationLiteral el_dataValue_p = (EnumerationLiteral) dataValue_p;
			// Owned Default Element
			DataValue domainValue = el_dataValue_p.getDomainValue();
			if (domainValue != null)
			{
				String subDataValueInformation = getSubDataValueInformation("Domain value", domainValue, projectName, outputFolder, displayType);
				if (false == subDataValueInformation.isEmpty())
					buffer.append(subDataValueInformation);
			}
		}
		
		if (dataValue_p instanceof CollectionValue)
		{
			CollectionValue cv_dataValue_p = (CollectionValue) dataValue_p;
			// Owned Default Element
			DataValue ownedDefaultElement = cv_dataValue_p.getOwnedDefaultElement();
			if (ownedDefaultElement != null)
			{
				String subDataValueInformation = getSubDataValueInformation("Defaut Element", ownedDefaultElement, projectName, outputFolder, displayType);
				if (false == subDataValueInformation.isEmpty())
					buffer.append(subDataValueInformation);
			}
			
			// Owned Element
			EList<DataValue> ownedElements = cv_dataValue_p.getOwnedElements();
			if (ownedElements.isEmpty() == false)
			{
				String subDataValueInformation = getSubDataValueInformation("Owned Elements", ownedElements, projectName, outputFolder, displayType);
				if (false == subDataValueInformation.isEmpty())
					buffer.append(subDataValueInformation);
			}
		}
		
		String result = buffer.toString();
		if (false == result.trim().isEmpty())
		{
			result = CapellaServices.UL_OPEN_WITH_BORDER + result + CapellaServices.UL_CLOSE;
		}
		return result;
	}
	
	/**
	 * Generate Sub data value documentation without adding a section
	 * @param dataValue_p The {@link DataValue} under generation
	 * @param projectName the eclipse project wherein the documentation is generated
	 * @param outputFolder the eclipse folder wherein the documentation is generated
	 * @param displayType 
	 * @return the HTML generated documentation for the data value
	 */
	private static String getSubDataValueInformation(DataValue dataValue_p, String projectName, String outputFolder, boolean displayType){
		return getSubDataValueInformation(null, dataValue_p, projectName, outputFolder, displayType);
	}
	
	/**
	 * Generate Sub data value documentation in a section
	 * @param sectionName the name of the section wherein the DataValue will be generated
	 * @param dataValue_p The {@link DataValue} under generation
	 * @param projectName the eclipse project wherein the documentation is generated
	 * @param outputFolder the eclipse folder wherein the documentation is generated
	 * @param displayType 
	 * @return the HTML generated documentation for the data value
	 */
	private static String getSubDataValueInformation(String sectionName, DataValue dataValue_p, 
													 String projectName, String outputFolder, boolean displayType){
		StringBuffer buffer = new StringBuffer();
		
		if (sectionName != null && false == sectionName.trim().isEmpty())
		{
			buffer.append(CapellaServices.LI_OPEN);
			buffer.append(CapellaServices.SPAN_BEGIN_LABEL);
			buffer.append(sectionName + ": ");
			buffer.append(CapellaServices.SPAN_END);
			buffer.append(CapellaServices.UL_OPEN);
		}
		buffer.append(CapellaServices.LI_OPEN);
		String ownedDefaultElementHtml = getDataValueInformation(dataValue_p, projectName, outputFolder, displayType);
		buffer.append(ownedDefaultElementHtml);
		buffer.append(CapellaServices.LI_CLOSE);
		if (sectionName != null && false == sectionName.trim().isEmpty())
		{
			buffer.append(CapellaServices.UL_CLOSE);
			buffer.append(CapellaServices.LI_CLOSE);
		}
		return buffer.toString();
	}
	
	/**
	 * Generate Sub data value documentation in a section
	 * @param sectionName the name of the section wherein the DataValue will be generated
	 * @param dataValue_p The {@link DataValue} under generation
	 * @param projectName the eclipse project wherein the documentation is generated
	 * @param outputFolder the eclipse folder wherein the documentation is generated
	 * @param displayType 
	 * @return the HTML generated documentation for the data value
	 */
	private static String getSubDataValueInformation(String sectionName, EList<DataValue> dataValues_p, 
													 String projectName, String outputFolder, boolean displayType){
		StringBuffer buffer = new StringBuffer();
		buffer.append(CapellaServices.LI_OPEN);
		buffer.append(CapellaServices.SPAN_BEGIN_LABEL);
		buffer.append(sectionName + ": ");
		buffer.append(CapellaServices.SPAN_END);
		buffer.append(CapellaServices.UL_OPEN);
		for (DataValue dataValue : dataValues_p) 
		{
			String ownedElementHtml = getDataValueInformation(dataValue, projectName, outputFolder, displayType);
			buffer.append(CapellaServices.LI_OPEN);
			buffer.append(ownedElementHtml);
			buffer.append(CapellaServices.LI_CLOSE);
		}
		buffer.append(CapellaServices.UL_CLOSE);
		buffer.append(CapellaServices.LI_CLOSE);
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
							String value = ((LiteralStringValue) dataValue_p).getValue();
							if (null == value)
							{
								value = CapellaServices.UNDEFINED_CHEVRON;
							}
							else
							{
								if (value.trim().isEmpty())
								{
									value = "\"" + value + "\"";
								}
							}
							return (value);
						}
						else
							if (dataValue_p instanceof CollectionValue) 
							{
								CollectionValue collectionValue = (CollectionValue) dataValue_p;
								String collectionName = collectionValue.getName();
								if (collectionName == null || (collectionName!= null && collectionName.isEmpty()))
								{
									collectionName += CapellaServices.NO_NAME;
								}
								Type type = collectionValue.getType();
								if (type != null)
								{
									collectionName += " : " + CapellaServices.getFullDataPkgHierarchyLink(type);
								}
								return collectionName;
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
