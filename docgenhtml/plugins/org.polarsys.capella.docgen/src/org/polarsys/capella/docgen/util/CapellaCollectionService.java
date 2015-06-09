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
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.polarsys.capella.core.data.information.Collection;
import org.polarsys.capella.core.data.information.datatype.DataType;
import org.polarsys.capella.core.data.information.datavalue.DataValue;
import org.polarsys.capella.core.data.information.datavalue.NumericValue;

public class CapellaCollectionService {
	
	/**
	 * <b>Get the state of features of a collection</b>
	 * <p>
	 * Get the state of features isAbstract, isPrimitive, isOrdered, isUnique,
	 * min, max, default and null of a class
	 * </p>
	 * @param eObject_p a {@link Collection} object
	 * @return HTML documentation of a {@link Collection}
	 */
	public static List<String> getCollectionFeatures(EObject eObject_p) {
		return getCollectionFeatures(eObject_p, null, null);
	}

	/**
	 * <b>Get the state of features of a collection</b>
	 * <p>
	 * Like {@link #getCollectionFeatures(EObject)}, this method get the state of 
	 * features isAbstract, isPrimitive, isOrdered, isUnique, min, max, default 
	 * and null of a class.
	 * </p>
	 * <p>
	 * But it export the DataValues and their contents with links to the corresponding HTML pages .
	 * </p>
	 * @param eObject_p a {@link Collection} object
	 * @param projectName the project wherein the HTML documentation will be generated
	 * @param outputFolder the folder wherein the HTML documentation will be generated
	 * @return HTML documentation of a {@link Collection}
	 */
	public static List<String> getCollectionFeatures(EObject eObject_p, String projectName, String outputFolder) {
		boolean simple = false;
		if (projectName == null || (projectName != null && projectName.trim().isEmpty()))
		{
			simple = true;
		}
		if (outputFolder == null || (outputFolder != null && outputFolder.trim().isEmpty()))
		{
			simple = true;
		}
		// Create the list to return
		List<String> ret = new ArrayList<String>();

		if (eObject_p instanceof Collection) {
			Collection eCollection = (Collection) eObject_p;
			// Add the boolean Features information
			ret.add(CapellaServices.BOLD_BEGIN + CapellaServices.IS_ABSTRACT + CapellaServices.BOLD_END + eCollection.isAbstract());
			ret.add(CapellaServices.BOLD_BEGIN + CapellaServices.PROP_STATIC + CapellaServices.VALUE_PRESENTER + CapellaServices.BOLD_END + eCollection.isIsPrimitive());
			ret.add(CapellaServices.BOLD_BEGIN + CapellaServices.PROP_ORDERED + CapellaServices.VALUE_PRESENTER + CapellaServices.BOLD_END + eCollection.isOrdered());
			ret.add(CapellaServices.BOLD_BEGIN + CapellaServices.PROP_UNIQUE + CapellaServices.VALUE_PRESENTER + CapellaServices.BOLD_END + eCollection.isUnique());

			// Add the no boolean Features information if their are not null
			// Export max-value DataValue
			DataValue maxValue = eCollection.getOwnedMaxValue();
			if (null != maxValue)
			{
				String s_maxValue = (simple ? 
										CapellaDataValueServices.getSimpleValueOfDataValue(maxValue) : 
										CapellaServices.DIV_WITH_PADDING 
										+ CapellaDataValueServices.getDataValueInformation(maxValue, projectName, outputFolder))
										+ CapellaServices.DIV_END;
				
				ret.add(CapellaServices.BOLD_BEGIN + 
						CapellaServices.MIN + 
						CapellaServices.VALUE_PRESENTER + 
						CapellaServices.BOLD_END + 
						s_maxValue);
//						maxValue);
			}
			
			// Export min-value DataValue
			DataValue minValue = eCollection.getOwnedMinValue();
			if (null != minValue)
			{
				String s_minValue = (simple ? 
										CapellaDataValueServices.getSimpleValueOfDataValue(minValue) : 
										CapellaServices.DIV_WITH_PADDING 
										+ CapellaDataValueServices.getDataValueInformation(minValue, projectName, outputFolder))
										+ CapellaServices.DIV_END;
				
				ret.add(CapellaServices.BOLD_BEGIN + 
						CapellaServices.MAX + 
						CapellaServices.VALUE_PRESENTER + 
						CapellaServices.BOLD_END + 
						s_minValue);
//						minValue);
			}
			
			// Export default value DataValue
			DataValue defaultValue = eCollection.getOwnedDefaultValue();
			if (null != defaultValue)
			{
				String s_defaultValue = (simple ? 
											CapellaDataValueServices.getSimpleValueOfDataValue(defaultValue) : 
											CapellaServices.DIV_WITH_PADDING 
											+ CapellaDataValueServices.getDataValueInformation(defaultValue, projectName, outputFolder))
											+ CapellaServices.DIV_END;
				
				ret.add(CapellaServices.BOLD_BEGIN + 
						CapellaServices.DEFAULT_FEATURE + 
						CapellaServices.BOLD_END + 
						s_defaultValue);
//						CapellaDataValueServices.getValueOfDataValue(defaultValue));
			}
			
			// Export null value DataValue
			DataValue nullValue = eCollection.getOwnedNullValue();
			if (null != nullValue)
			{
				String s_nullValue = (simple ? 
											CapellaDataValueServices.getSimpleValueOfDataValue(nullValue) : 
											CapellaServices.DIV_WITH_PADDING 
											+ CapellaDataValueServices.getDataValueInformation(nullValue, projectName, outputFolder))
											+ CapellaServices.DIV_END;
				ret.add(CapellaServices.BOLD_BEGIN + 
						CapellaServices.NULL_FEATURE + 
						CapellaServices.BOLD_END + 
						s_nullValue);
//						CapellaDataValueServices.getValueOfDataValue(nullValue));
			}
		}
		return ret;
	}

	/**
	 * <b>Get Cardinality Element of collection</b>
	 * <p>
	 * Get the min and max cardinality of a Collection
	 * 
	 * @param element
	 * @return
	 */
	public static List<String> getCollectionElements(EObject eObject_p) {
		// Create the list to return
		List<String> ret = new ArrayList<String>();

		if (eObject_p instanceof Collection) {
			Collection eCollection = (Collection) eObject_p;
			StringBuffer buffer = new StringBuffer();
			// Add the cardinalities information to the buffer
			final NumericValue ownedMinCard = eCollection.getOwnedMinCard();
			if (ownedMinCard != null)
				buffer.append(CapellaServices.getHyperlinkFromElement(ownedMinCard));
			else
				buffer.append("<undefined>");

			buffer.append(CapellaServices.SPACE + "\n");
			final NumericValue ownedMaxCard = eCollection.getOwnedMaxCard();
			if (ownedMaxCard != null)
				buffer.append(CapellaServices.getHyperlinkFromElement(ownedMaxCard));
			else
				buffer.append("<undefined>");

			ret.add(buffer.toString());
		}
		return ret;
	}

	public static List<String> getIndexedBy(Collection collection, String projectName, String outputFolder) {
		List<String> informations = new ArrayList<String>();
		for (DataType currentDataType : collection.getIndex()) {
			StringBuffer buffer = new StringBuffer();
			buffer.append(CapellaServices.getImageLinkFromElement(collection, projectName, outputFolder));
			buffer.append(" ");
			buffer.append(CapellaServices.getFullDataPkgHierarchyLink(currentDataType));
			informations.add(buffer.toString());
		}
		return informations;
	}

}
