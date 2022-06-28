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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.core.data.information.Collection;
import org.polarsys.capella.core.data.information.datatype.DataType;
import org.polarsys.capella.core.data.information.datavalue.NumericValue;

public class CapellaCollectionService {
	
	private CapellaCollectionService() {}
	
	/**
	 * <b>Get the state of features of a collection</b>
	 * <p>
	 * Get the state of features isAbstract, isPrimitive, isOrdered, isUnique,
	 * min, max, default and null of a class
	 * 
	 * @param eObject
	 * @return
	 */
	public static List<String> getCollectionFeatures(EObject eObject) {
		// Create the list to return
		List<String> ret = new ArrayList<>();

		if (eObject instanceof Collection) {
			Collection eCollection = (Collection) eObject;
			// Add the boolean Features information
			ret.add(CapellaServices.BOLD_BEGIN + CapellaServices.IS_ABSTRACT + CapellaServices.BOLD_END + eCollection.isAbstract());
			ret.add(CapellaServices.BOLD_BEGIN + CapellaServices.PROP_STATIC + CapellaServices.VALUE_PRESENTER + CapellaServices.BOLD_END + eCollection.isIsPrimitive());
			ret.add(CapellaServices.BOLD_BEGIN + CapellaServices.PROP_ORDERED + CapellaServices.VALUE_PRESENTER + CapellaServices.BOLD_END + eCollection.isOrdered());
			ret.add(CapellaServices.BOLD_BEGIN + CapellaServices.PROP_UNIQUE + CapellaServices.VALUE_PRESENTER + CapellaServices.BOLD_END + eCollection.isUnique());

			// Add the no boolean Features information if their are not null
            if (null != eCollection.getOwnedMaxValue())
                ret.add(CapellaServices.BOLD_BEGIN + CapellaServices.MIN + CapellaServices.VALUE_PRESENTER + CapellaServices.BOLD_END
                        + CapellaDataValueServices.getValueOfDataValue(eCollection.getOwnedMaxValue()));
            if (null != eCollection.getOwnedMinValue())
                ret.add(CapellaServices.BOLD_BEGIN + CapellaServices.MAX + CapellaServices.VALUE_PRESENTER + CapellaServices.BOLD_END
                        + CapellaDataValueServices.getValueOfDataValue(eCollection.getOwnedMinValue()));
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
	public static List<String> getCollectionElements(EObject eObject) {
		// Create the list to return
		List<String> ret = new ArrayList<>();

		if (eObject instanceof Collection) {
			Collection eCollection = (Collection) eObject;
			StringBuilder stringBuilder = new StringBuilder();
			// Add the cardinalities information to the buffer
			final NumericValue ownedMinCard = eCollection.getOwnedMinCard();
			if (ownedMinCard != null)
				stringBuilder.append(CapellaServices.getHyperlinkFromElement(ownedMinCard));
			else
				stringBuilder.append("<undefined>");

			stringBuilder.append(CapellaServices.SPACE + "\n");
			final NumericValue ownedMaxCard = eCollection.getOwnedMaxCard();
			if (ownedMaxCard != null)
				stringBuilder.append(CapellaServices.getHyperlinkFromElement(ownedMaxCard));
			else
				stringBuilder.append("<undefined>");

			ret.add(stringBuilder.toString());
		}
		return ret;
	}

	public static List<String> getIndexedBy(Collection collection, String projectName, String outputFolder) {
		List<String> informations = new ArrayList<>();
		for (DataType currentDataType : collection.getIndex()) {
			StringBuilder stringBuilder = new StringBuilder();
			stringBuilder.append(CapellaServices.getImageLinkFromElement(collection, projectName, outputFolder));
			stringBuilder.append(" ");
			stringBuilder.append(CapellaServices.getFullDataPkgHierarchyLink(currentDataType));
			informations.add(stringBuilder.toString());
		}
		return informations;
	}

}
