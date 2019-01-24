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

	/**
	 * <b>Get the state of features of a class</b>
	 * <p>
	 * Get the state of features isAbstract and isPrimitive of a class
	 * 
	 * @param eObject_p
	 * @return
	 */
	public static List<String> getClassFeatures(EObject eObject_p) {
		// Create the list to return
		List<String> ret = new ArrayList<String>();

		if (eObject_p instanceof Class) {
			Class eClass = (Class) eObject_p;
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
	 * @param eObject_p
	 * @return
	 */
	public static List<String> getClassProperties(EObject eObject_p,
			String projectName, String outputFolder) {

		Property minProperty = null;
		Property maxProperty = null;
		// Create the list to return
		List<String> ret = new ArrayList<String>();

		// If the Object is a Class
		if (eObject_p instanceof Class) 
		{
			EList<Property> properties = null;
			if (eObject_p instanceof Union )
			{
				properties = new BasicEList<Property>(((Union)eObject_p).getContainedUnionProperties());
			}
			else
			{
				properties = ((Class) eObject_p).getContainedProperties();
			}
			
			if (properties != null && properties.isEmpty() == false)
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
		}
		return ret;
	}

	/**
	 * <b>Get the Data values of a class</b>
	 * <p>
	 * Get the Data values information of a class
	 * 
	 * @param eObject_p
	 * @return
	 */
	public static List<String> getClassDataValues(EObject eObject_p,
			String projectName, String outputFolder) {
		// Create the list to return
		List<String> ret = new ArrayList<String>();

		// If the Object is a Class
		if (eObject_p instanceof Class) {
			List<DataValue> dataValueList = ((Class) eObject_p)
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
	 * @param eObject_p
	 * @return
	 */
	public static List<String> getClassRealizeInformation(EObject eObject_p) {
		// Create the list to return
		List<String> ret = new ArrayList<String>();

		// If the Object is a Class
		if (eObject_p instanceof Class) {
			List<InformationRealization> listReal = ((Class) eObject_p)
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
	 * @param eObject_p
	 * @return
	 */
	public static List<String> getClassOperation(EObject eObject_p) {
		// Create the list to return
		List<String> ret = new ArrayList<String>();

		// If the Object is a Class
		if (eObject_p instanceof Class) {
			// For each operation of the Class
			for (Operation ope : ((Class) eObject_p).getContainedOperations()) {
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
	 * @param ope_p
	 * @return
	 */
	private static String getInformationFromOperation(Operation ope_p) {
		// Buffer declaration
		StringBuffer buffer = new StringBuffer();
		// Bold tag open
		buffer.append(CapellaServices.BOLD_BEGIN);
		// If property is abstract
		if (ope_p.isIsAbstract()) {
			// Add this information to the buffer
			buffer.append(CapellaServices.PROP_ABSTRACT);
		}
		// If property is static
		if (ope_p.isIsStatic()) {
			// Add this information to the buffer
			buffer.append(CapellaServices.PROP_STATIC);
		}
		// Bold tag close
		buffer.append(CapellaServices.BOLD_END);
		// Add the name of the property to the buffer
		buffer.append(CapellaServices.getHyperlinkFromElement(ope_p));
		// Add the parameters to the buffer
		buffer.append(CapellaServices.PAR_OPEN);
		for (Parameter param : ope_p.getOwnedParameters()) {
			// Add the hyper link of the parameter type
			if (param.getType() != null){
				buffer.append(CapellaServices.getHyperlinkFromElement(param
						.getType()));
			}
			if (param.getName().length() > 0){
				String paramStr = param.getName();
				if (param.getType() == null){
					paramStr += " : &lt;undefined&gt;";
				}
				buffer.append(CapellaServices.SPACE + paramStr);
			}
			
		}
		buffer.append(CapellaServices.PAR_CLOSE);
		return buffer.toString();
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
		List<String> ret = new ArrayList<String>();
		Collection<TypedElement> typedElements = theClass.getTypedElements();
		for (TypedElement typedElement : typedElements) {
			if (typedElement instanceof Property) {
				if (((Property) typedElement).getAggregationKind().getValue() == AggregationKind.COMPOSITION_VALUE) {
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
		List<String> ret = new ArrayList<String>();
		Collection<TypedElement> typedElements = theClass.getTypedElements();
		for (TypedElement typedElement : typedElements) {
			if (typedElement instanceof Property) {
				if (((Property) typedElement).getAggregationKind().getValue() == AggregationKind.ASSOCIATION_VALUE) {
					EObject container = typedElement.eContainer();
					if (container instanceof Class) {
						String currentStringValue = CapellaServices
								.getImageLinkFromElement(container,
										projectName, outputFolder)
								+ " "
								+ CapellaServices
										.getFullDataPkgHierarchyLink(container);
						if (!ret.contains(currentStringValue))
							ret.add(currentStringValue);
					}
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
		List<String> ret = new ArrayList<String>();
		Collection<TypedElement> typedElements = theClass.getTypedElements();
		for (TypedElement typedElement : typedElements) {
			if (typedElement instanceof ExchangeItemElement) {
				EObject exchangeItem = typedElement.eContainer();
				if(null!=exchangeItem && exchangeItem instanceof ExchangeItem){
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
