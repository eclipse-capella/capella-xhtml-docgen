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
import org.polarsys.capella.core.data.information.datavalue.NumericValue;

public class CapellaCollectionService {
	/**
	 * <b>Get the state of features of a collection</b>
	 * <p>
	 * Get the state of features isAbstract, isPrimitive, isOrdered, isUnique,
	 * min, max, default and null of a class
	 * 
	 * @param eObject_p
	 * @return
	 */
	public static List<String> getCollectionFeatures(EObject eObject_p) {
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
			if (null != eCollection.getOwnedMaxValue())
				ret.add(CapellaServices.BOLD_BEGIN + CapellaServices.MIN + CapellaServices.VALUE_PRESENTER + CapellaServices.BOLD_END + eCollection.getOwnedMaxValue());
			if (null != eCollection.getOwnedMinValue())
				ret.add(CapellaServices.BOLD_BEGIN + CapellaServices.MAX + CapellaServices.VALUE_PRESENTER + CapellaServices.BOLD_END + eCollection.getOwnedMinValue());
			if (null != eCollection.getOwnedDefaultValue())
				ret.add(CapellaServices.BOLD_BEGIN + CapellaServices.DEFAULT_FEATURE + CapellaServices.BOLD_END
						+ CapellaDataValueServices.getValueOfDataValue(eCollection.getOwnedDefaultValue()));
			if (null != eCollection.getOwnedNullValue())
				ret.add(CapellaServices.BOLD_BEGIN + CapellaServices.NULL_FEATURE + CapellaServices.BOLD_END
						+ CapellaDataValueServices.getValueOfDataValue(eCollection.getOwnedNullValue()));
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
