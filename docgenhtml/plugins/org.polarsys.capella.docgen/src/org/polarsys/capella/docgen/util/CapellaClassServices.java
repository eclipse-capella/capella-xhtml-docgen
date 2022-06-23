/*******************************************************************************
 * Copyright (c) 2006, 2022 THALES GLOBAL SERVICES.
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

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.core.data.capellacore.TypedElement;
import org.polarsys.capella.core.data.information.AggregationKind;
import org.polarsys.capella.core.data.information.Class;
import org.polarsys.capella.core.data.information.ExchangeItem;
import org.polarsys.capella.core.data.information.ExchangeItemElement;
import org.polarsys.capella.core.data.information.InformationRealization;
import org.polarsys.capella.core.data.information.Operation;
import org.polarsys.capella.core.data.information.Parameter;
import org.polarsys.capella.core.data.information.Property;
import org.polarsys.capella.core.data.information.Union;
import org.polarsys.capella.core.data.information.datavalue.DataValue;

/**
 * 
 */
public class CapellaClassServices {
	
	private CapellaClassServices() {}

	/**
	 * <b>Get the state of features of a class</b>
	 * <p>
	 * Get the state of features isAbstract and isPrimitive of a class
	 * 
	 * @param eObject
	 * @return
	 */
	public static List<String> getClassFeatures(EObject eObject) {
		// Create the list to return
		List<String> ret = new ArrayList<>();

		if (eObject instanceof Class) {
			Class eClass = (Class) eObject;
			// Add the features to the list
			ret.add(CapellaServices.BOLD_BEGIN + CapellaServices.IS_ABSTRACT
					+ CapellaServices.BOLD_END + eClass.isAbstract());
			ret.add(CapellaServices.BOLD_BEGIN + CapellaServices.IS_PRIMITIVE
					+ CapellaServices.BOLD_END + eClass.isIsPrimitive());
		}
		return ret;
	}

	/**
	 * <b>Get the properties of a Class</b>
	 * <p>
	 * Get the informations of class properties
	 * 
	 * @param eObject
	 * @return
	 */
	public static List<String> getClassProperties(EObject eObject,
			String projectName, String outputFolder, boolean associations) {

		Property minProperty = null;
		Property maxProperty = null;
		// Create the list to return
		List<String> ret = new ArrayList<>();

		if (!(eObject instanceof Class)) {
			return ret;
		}
		// If the Object is a Class
		EList<Property> properties;
		if (!associations) {
		    properties = getClassProperties((Class) eObject);
		} else {
		    properties = getClassAssociations((Class) eObject);
		}
		
		if (properties != null)
		{
			// For each properties of the Class
			for (Property prop : properties) 
			{
				if (prop.getName().equals("min")) 
					minProperty = prop;
				else
				{
					if (prop.getName().equals("max")) 
					{
						maxProperty = prop;
					}
					else 
					{
						// Add the information of the property to the list
						String info = CapellaPropertyServices.getInformationFromProperty(prop, projectName, outputFolder);
						ret.add(info);
					}
				}
			}
		}
		
		if (maxProperty != null) 
		{
			ret.add(0, CapellaPropertyServices.getInformationFromProperty(maxProperty, projectName, outputFolder));
		}
		if (minProperty != null) 
		{
			ret.add(0, CapellaPropertyServices.getInformationFromProperty(minProperty, projectName, outputFolder));
		}
		return ret;
	}

	/**
	 * Get all properties of a Class object
	 * @param clazz
	 * @return The Class properties. If object contained properties getter returns null or empty it will return null.
	 */
	private static EList<Property> getClassProperties(Class clazz) {
		EList<Property> properties = null;
		if (clazz instanceof Union) {
			properties = new BasicEList<>(((Union) clazz).getContainedUnionProperties().stream().filter(CapellaPropertyServices.isAssociationPropertyPredicate.negate()).toList());
		} else {
			properties = new BasicEList<>(clazz.getContainedProperties().stream().filter(CapellaPropertyServices.isAssociationPropertyPredicate.negate()).toList());
		}
		if (properties.isEmpty()) {
			return null;
		}
		return properties;
	}

    /**
     * Get all properties of a Class object
     * @param clazz
     * @return The Class properties. If object contained properties getter returns null or empty it will return null.
     */
    private static EList<Property> getClassAssociations(Class clazz) {
        EList<Property> properties = null;
        if (clazz instanceof Union) {
            properties = new BasicEList<>(((Union) clazz).getContainedUnionProperties().stream().filter(CapellaPropertyServices.isAssociationPropertyPredicate).toList());
        } else {
            properties = new BasicEList<>(clazz.getContainedProperties().stream().filter(CapellaPropertyServices.isAssociationPropertyPredicate).toList());
        }
        if (properties.isEmpty()) {
            return null;
        }
        return properties;
    }

	/**
	 * <b>Get the Data values of a class</b>
	 * <p>
	 * Get the Data values information of a class
	 * 
	 * @param eObject
	 * @return
	 */
	public static List<String> getClassDataValues(EObject eObject,
			String projectName, String outputFolder) {
		// Create the list to return
		List<String> ret = new ArrayList<>();

		// If the Object is a Class
		if (eObject instanceof Class) {
			List<DataValue> dataValueList = ((Class) eObject)
					.getOwnedDataValues();
			// For each Data Value
			for (DataValue dataValue : dataValueList) {
				// Add the information to the list
				ret.add(CapellaDataValueServices.getDataValueInformation(
						dataValue, projectName, outputFolder));
			}
		}
		return ret;
	}

	/**
	 * <b>Get the realization of a class</b>
	 * <p>
	 * Get the realisation information of a class
	 * 
	 * @param eObject
	 * @return
	 */
	public static List<String> getClassRealizeInformation(EObject eObject) {
		// Create the list to return
		List<String> ret = new ArrayList<>();

		// If the Object is a Class
		if (eObject instanceof Class) {
			List<InformationRealization> listReal = ((Class) eObject)
					.getOwnedInformationRealizations();
			for (InformationRealization realization : listReal) {
				if (realization.getTargetElement() != null)
					ret.add(CapellaServices.getHyperlinkFromElement(realization
							.getTargetElement()));

			}
		}
		return ret;
	}

	/**
	 * <b>Get the operation of a class</b>
	 * <p>
	 * Get the operatin informations of a class
	 * 
	 * @param eObject
	 * @return
	 */
	public static List<String> getClassOperation(EObject eObject) {
		// Create the list to return
		List<String> ret = new ArrayList<>();

		// If the Object is a Class
		if (eObject instanceof Class) {
			// For each operation of the Class
			for (Operation ope : ((Class) eObject).getContainedOperations()) {
				// Add the information of the operation to the list
				ret.add(getInformationFromOperation(ope));
			}
		}
		return ret;
	}

	/**
	 * <b>Get the information of an operation</b>
	 * <p>
	 * Get the information detail of an operation
	 * 
	 * @param ope
	 * @return
	 */
	private static String getInformationFromOperation(Operation ope) {
		// Buffer declaration
		StringBuilder stringBuilder = new StringBuilder();
		// Bold tag open
		stringBuilder.append(CapellaServices.BOLD_BEGIN);
		// If property is abstract
		if (ope.isIsAbstract()) {
			// Add this information to the buffer
			stringBuilder.append(CapellaServices.PROP_ABSTRACT);
		}
		// If property is static
		if (ope.isIsStatic()) {
			// Add this information to the buffer
			stringBuilder.append(CapellaServices.PROP_STATIC);
		}
		// Bold tag close
		stringBuilder.append(CapellaServices.BOLD_END);
		// Add the name of the property to the buffer
		stringBuilder.append(CapellaServices.getHyperlinkFromElement(ope));
		// Add the parameters to the buffer
		stringBuilder.append(CapellaServices.PAR_OPEN);
		for (Parameter param : ope.getOwnedParameters()) {
			// Add the hyper link of the parameter type
			if (param.getType() != null){
				stringBuilder.append(CapellaServices.getHyperlinkFromElement(param
						.getType()));
			}
			if (param.getName().length() > 0){
				String paramStr = param.getName();
				if (param.getType() == null){
					paramStr += " : &lt;undefined&gt;";
				}
				stringBuilder.append(CapellaServices.SPACE + paramStr);
			}
			
		}
		stringBuilder.append(CapellaServices.PAR_CLOSE);
		return stringBuilder.toString();
	}

	/**
	 * 
	 * @param theClass
	 * @param projectName
	 * @param outputFolder
	 * @return
	 */
	public static List<String> getPartOf(Class theClass, String projectName,
			String outputFolder) {
		List<String> ret = new ArrayList<>();
		Collection<TypedElement> typedElements = theClass.getTypedElements();
		for (TypedElement typedElement : typedElements) {
			if (typedElement instanceof Property && ((Property) typedElement).getAggregationKind().getValue() == AggregationKind.COMPOSITION_VALUE) {
				String currentStringValue = CapellaServices
						.getImageLinkFromElement(typedElement.eContainer(),
								projectName, outputFolder)
						+ " "
						+ CapellaServices
								.getFullDataPkgHierarchyLink(typedElement
										.eContainer());
				if (!ret.contains(currentStringValue))
					ret.add(currentStringValue);
			}
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
	public static List<String> getReferencedBy(Class theClass,
			String projectName, String outputFolder) {
		List<String> ret = new ArrayList<>();
		Collection<TypedElement> typedElements = theClass.getTypedElements();
		for (TypedElement typedElement : typedElements) {
			if (typedElement instanceof Property && CapellaPropertyServices.isAssociationPropertyPredicate.test((Property) typedElement)) {
				EObject container = typedElement.eContainer();
				if (container instanceof Class) {
				    StringBuffer buffer = new StringBuffer();
				    
                    buffer.append(CapellaServices.getImageLinkFromElement(container, projectName, outputFolder));
                    buffer.append(CapellaServices.SPACE);
                    buffer.append(CapellaServices.getFullDataPkgHierarchyLink(container));
                    
                    // Add related association information
//                    buffer.append(" through ");
//                    buffer.append(CapellaPropertyServices.getAssociationImageAndHyperlink((Property) typedElement, projectName, outputFolder));
                    
                    String currentStringValue = buffer.toString();
					if (!ret.contains(currentStringValue))
						ret.add(currentStringValue);
				}
			}
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
	public static List<String> getParameterOf(Class theClass,
			String projectName, String outputFolder) {
		List<String> ret = new ArrayList<>();
		Collection<TypedElement> typedElements = theClass.getTypedElements();
		for (TypedElement typedElement : typedElements) {
			if (typedElement instanceof ExchangeItemElement) {
				EObject exchangeItem = typedElement.eContainer();
				if(exchangeItem instanceof ExchangeItem){
				String currentStringValue = CapellaServices
						.getImageLinkFromElement(exchangeItem, projectName,
								outputFolder)
						+ CapellaServices.SPACE
						+ CapellaServices.getHyperlinkFromElement(exchangeItem);
				if (!ret.contains(currentStringValue))
					ret.add(currentStringValue);
			}
			}

		}
		return ret;
	}
}
