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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.kitalpha.doc.gen.business.core.util.EObjectLabelProviderHelper;
import org.polarsys.kitalpha.doc.gen.business.core.util.LabelProviderHelper;

import org.polarsys.capella.common.mdsofa.common.constant.ICommonConstants;
import org.polarsys.capella.core.data.information.AggregationKind;
import org.polarsys.capella.core.data.information.CollectionValueReference;
import org.polarsys.capella.core.data.information.Property;
import org.polarsys.capella.core.data.information.UnionProperty;
import org.polarsys.capella.core.data.information.datavalue.BooleanReference;
import org.polarsys.capella.core.data.information.datavalue.ComplexValueReference;
import org.polarsys.capella.core.data.information.datavalue.DataValue;
import org.polarsys.capella.core.data.information.datavalue.EnumerationReference;
import org.polarsys.capella.core.data.information.datavalue.NumericReference;
import org.polarsys.capella.core.data.information.datavalue.StringReference;
import org.polarsys.capella.core.data.information.datavalue.ValuePart;
import org.polarsys.capella.core.data.capellacore.AbstractPropertyValue;
import org.polarsys.capella.core.data.capellacore.EnumerationPropertyValue;

public class CapellaPropertyServices {
	/**
	 * <b>Get the property value information</b>
	 * <p>
	 * Get the property value information from an AbstractPropertyValue
	 * 
	 * @param prop_p
	 * @return
	 */
	public static String getPropertyValueInformation(AbstractPropertyValue prop_p, String projectName, String outputFolder) {
		StringBuffer buffer = new StringBuffer();
		buffer.append(CapellaServices.getImageLinkFromElement(prop_p, projectName, outputFolder));
		buffer.append(CapellaServices.SPACE);
		buffer.append(CapellaServices.BOLD_BEGIN);
		buffer.append(prop_p.getName());
		buffer.append(CapellaServices.BOLD_END);
		buffer.append(CapellaServices.VALUE_EQUAL);
		buffer.append(getValueFromPropertyValue(prop_p));
		return buffer.toString();
	}
	
	/**
	 * Generate HTML part for documentation of a {@link ValuePart}.
	 * @param valuepart_p the {@link ValuePart} to generate
	 * @param projectName name of the project wherein documentation is generated
	 * @param outputFolder name of the folder wherein documentation is generated
	 * @return
	 */
	public static String getValuePartInformation(ValuePart valuepart_p, String projectName, String outputFolder) {
		StringBuffer buffer = new StringBuffer();
		buffer.append(CapellaServices.getImageLinkFromElement(valuepart_p, projectName, outputFolder));
		buffer.append(CapellaServices.SPACE);
		buffer.append(CapellaServices.BOLD_BEGIN);
		Property referencedProperty = valuepart_p.getReferencedProperty();
		String referencedPropertyLink = CapellaServices.CHEV_OPEN + CapellaServices.UNDEFINED + CapellaServices.CHEV_CLOSE;
		if (referencedProperty != null)
		{
			referencedPropertyLink = CapellaServices.getHyperlinkFromElement(referencedProperty);
		}
		buffer.append("Value for " +  referencedPropertyLink);
		buffer.append(CapellaServices.BOLD_END);
		return buffer.toString();
	}

	/**
	 * <b>Get the property value information</b>
	 * <p>
	 * Get the property value information from an EnumerationPropertyValue
	 * 
	 * @param prop_p
	 * @return
	 */
	public static String getPropertyValueInformation(EnumerationPropertyValue prop_p) {
		// Test If the type and the value are defined
		if (null != prop_p.getType() && null != prop_p.getValue() && CapellaServices.EMPTY.equals(prop_p.getValue())) {
			// Return the name, the type and the value
			return (CapellaServices.getHyperlinkFromElement(prop_p) + CapellaServices.VALUE_PRESENTER + prop_p.getType().getName() + "." + prop_p.getValue());
		}
		// Return just the name
		return (CapellaServices.getHyperlinkFromElement(prop_p));

	}

	/**
	 * <b>Get the information of a property</b>
	 * <p>
	 * Get the information detail of a property
	 * 
	 * @param prop_p
	 * @return
	 */
	public static String getInformationFromProperty(Property prop_p, String projectName, String outputFolder) {
		// Buffer declaration
		StringBuffer buffer = new StringBuffer();

		buffer.append(CapellaServices.getImageLinkFromElement(prop_p, projectName, outputFolder));
		buffer.append(" ");
		// Bold tag open
		buffer.append(CapellaServices.BOLD_BEGIN);
		// If property is abstract
		if (prop_p.isIsAbstract()) {
			// Add this information to the buffer
			buffer.append(CapellaServices.PROP_CRO_ABSTRACT);
		}
		// If property is static
		if (prop_p.isIsStatic()) {
			// Add this information to the buffer
			buffer.append(CapellaServices.PROP_CRO_STATIC);
		}
		// If property is key
		if (prop_p.isIsPartOfKey()) {
			// Add this information to the buffer
			buffer.append(CapellaServices.PROP_CRO_KEY);
		}
		// If property is key
		if (prop_p.getAggregationKind().getValue() == AggregationKind.ASSOCIATION_VALUE) {
			// Add this information to the buffer
			buffer.append("{ref}  ");
		}
		// If property is derived
		if (prop_p.isIsDerived()) {
			// Add this information to the buffer
			buffer.append(CapellaServices.PROP_CRO_DERIVED);
		}
		// If property is read only
		if (prop_p.isIsReadOnly()) {
			// Add this information to the buffer
			buffer.append(CapellaServices.PROP_CRO_READONLY);
		}
		// If property is ordered
		if (prop_p.isOrdered()) {
			// Add this information to the buffer
			buffer.append(CapellaServices.PROP_CRO_ORDERED);
		}
		// If property is unique
		if (prop_p.isUnique()) {
			// Add this information to the buffer
			buffer.append(CapellaServices.PROP_CRO_UNIQUE);
		}
		// Bold tag close
		buffer.append(CapellaServices.BOLD_END);

		buffer.append(CapellaServices.SPACE);
		// Bold tag open
		buffer.append(CapellaServices.BOLD_BEGIN);
		// Add the name of the property to the buffer
		buffer.append(prop_p.getName());

		// Add the cardinalities hyper link to the buffer
		if (null != prop_p.getOwnedMinCard() && null != prop_p.getOwnedMaxCard()) {
			// Add the min cardinality to the buffer
			buffer.append(CapellaServices.CRO_OPEN);
			buffer.append(CapellaDataValueServices.getSimpleValueOfDataValue(prop_p.getOwnedMinCard()));
			buffer.append(", ");
			// Add the max cardinality to the buffer
			buffer.append(CapellaDataValueServices.getSimpleValueOfDataValue(prop_p.getOwnedMaxCard()));
			buffer.append(CapellaServices.CRO_CLOSE);
		}
		// Bold tag close
		buffer.append(CapellaServices.BOLD_END);
		// Add the hyper link of the type of the property to the buffer
		buffer.append(CapellaServices.VALUE_PRESENTER);
		if (prop_p.getType() != null)
			buffer.append(CapellaServices.getFullDataPkgHierarchyLink(prop_p.getType()));

		// Display UnionProperties Qualifiers
		if (prop_p instanceof UnionProperty) {
			String qualifier = computeUnionPropertyLabelWithQualifier((UnionProperty) prop_p);
			buffer.append(qualifier);
		}

		if (null != prop_p.getDescription()) {
			buffer.append("<p>");
			buffer.append(StringUtil.transformAREFString(prop_p, prop_p.getDescription(), projectName, outputFolder));
			buffer.append("</p>");
		}
		// features and property-values

		// features
		Collection<String> features = new ArrayList<String>();

		if (prop_p.getOwnedMinValue() != null)
			features.add(CapellaServices.BOLD_BEGIN + CapellaServices.MIN_FEATURE + CapellaServices.BOLD_END
					+ CapellaDataValueServices.getValueOfDataValue(prop_p.getOwnedMinValue()));

		if (prop_p.getOwnedMaxValue() != null)
			features.add(CapellaServices.BOLD_BEGIN + CapellaServices.MAX_FEATURE + CapellaServices.BOLD_END
					+ CapellaDataValueServices.getValueOfDataValue(prop_p.getOwnedMaxValue()));

		if (prop_p.getOwnedMinLength() != null)
			features.add(CapellaServices.BOLD_BEGIN + CapellaServices.MINLENGTH_FEATURE + CapellaServices.BOLD_END
					+ CapellaDataValueServices.getValueOfDataValue(prop_p.getOwnedMinLength()));

		if (prop_p.getOwnedMaxLength() != null)
			features.add(CapellaServices.BOLD_BEGIN + CapellaServices.MAXLENGTH_FEATURE + CapellaServices.BOLD_END
					+ CapellaDataValueServices.getValueOfDataValue(prop_p.getOwnedMaxLength()));

		if (prop_p.getOwnedDefaultValue() != null)
			features.add(CapellaServices.BOLD_BEGIN + CapellaServices.DEFAULT_FEATURE + CapellaServices.BOLD_END
					+ CapellaDataValueServices.getValueOfDataValue(prop_p.getOwnedDefaultValue()));
		if (prop_p.getOwnedNullValue() != null)
			features.add(CapellaServices.BOLD_BEGIN + CapellaServices.NULL_FEATURE + CapellaServices.BOLD_END
					+ CapellaDataValueServices.getValueOfDataValue(prop_p.getOwnedNullValue()));

		buffer.append(CapellaServices.UL_OPEN);

		for (String featureString : features)
			buffer.append(CapellaServices.LI_OPEN + featureString + CapellaServices.LI_CLOSE);

		String propertyValues = getPropertyValues(prop_p.getOwnedPropertyValues(), projectName, outputFolder);
		if (propertyValues != null && propertyValues.length() > 0)
			buffer.append(propertyValues);

		buffer.append(CapellaServices.UL_CLOSE);
		return buffer.toString();
	}

	/**
	 * Unify export of property values to Html with this method Get the property
	 * values in html format
	 * 
	 * @param ownedPropertyValues
	 *            a {@link Collection} of property values to export to html
	 * @param projectName
	 *            name of the project wherein documentation is generated
	 * @param outputFolder
	 *            the name of the folder wherein documenation is generated
	 * @return an html content of the the property values
	 */
	public static String getPropertyValues(EList<AbstractPropertyValue> ownedPropertyValues, String projectName, String outputFolder) {
		StringBuffer buffer = new StringBuffer();
		Collection<String> propertiesValues = new ArrayList<String>();
		for (AbstractPropertyValue currentAbstractPropertyValue : ownedPropertyValues) {
			propertiesValues.add(CapellaPropertyServices.getPropertyValueInformation(currentAbstractPropertyValue, projectName, outputFolder));
		}

		if (propertiesValues.size() > 0) {
			buffer.append(CapellaServices.LI_OPEN);
			buffer.append("Property-values");
			buffer.append(StringUtil.stringListToBulette(propertiesValues));
			buffer.append(CapellaServices.LI_CLOSE);
		}

		return buffer.toString();
	}

	private static String computeUnionPropertyLabelWithQualifier(UnionProperty property_p) {
		String result = ICommonConstants.EMPTY_STRING;
		EList<DataValue> qualifier = property_p.getQualifier();
		if ((qualifier != null) && (qualifier.size() > 0)) {
			result += " { "; //$NON-NLS-1$
			for (int i = 0; i < (qualifier.size()); i++) {
				DataValue element = qualifier.get(i);
				result += getDataValueText(element, (i == qualifier.size() - 1));
			}
			result += " }"; //$NON-NLS-1$
		}
		return result;
	}

	/**
	 * Generate a text for a given {@link Datatype}.
	 * 
	 * If the element is not the last one in the list, then add ", " separator
	 * 
	 * @param dataValue
	 * @param last
	 * @return
	 */
	private static String getDataValueText(DataValue dataValue, boolean last) {
		if (ignoreDataValue(dataValue)) {
			return EObjectLabelProviderHelper.getText(dataValue) + (last ? "" : ", ");
		} else {
			return CapellaServices.getHyperlinkFromElement(dataValue) + (last ? "" : ", ");
		}
	}

	/**
	 * This set of elements have'nt Html pages and are not generated in there
	 * parent pages.
	 * 
	 * @param element
	 *            A DataValue
	 * @return True if the element is displayed anywhere in an Html page
	 */
	private static boolean ignoreDataValue(DataValue element) {
		if (element instanceof BooleanReference || element instanceof NumericReference || element instanceof EnumerationReference || element instanceof StringReference
				|| element instanceof ComplexValueReference || element instanceof CollectionValueReference)
			return true;
		else
			return false;
	}

	private static String getValueFromPropertyValue(AbstractPropertyValue propertyValue) {
		Method methodGetValue = null;
		try {
			methodGetValue = propertyValue.getClass().getMethod("getValue", new Class[] {});

		} catch (NoSuchMethodException e) {
			try {
				methodGetValue = propertyValue.getClass().getMethod("isValue", new Class[] {});
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (methodGetValue != null) {
			try {
				Object object = methodGetValue.invoke(propertyValue, new Object[] {});
				if (object instanceof EObject) {
					return LabelProviderHelper.getText((EObject) object);
				} else if (object != null) {
					return object.toString();
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return "";
	}
}
