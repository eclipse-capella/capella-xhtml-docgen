/*******************************************************************************
 * Copyright (c) 2022 THALES GLOBAL SERVICES.
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

import org.eclipse.emf.common.util.EList;
import org.polarsys.capella.core.data.information.Association;
import org.polarsys.capella.core.data.information.Property;
import org.polarsys.capella.docgen.preference.CapellaDocgenPreferenceHelper;

/**
 * Service Class to get information from {@code Association} CapellaElement.
 * @author <a href="mailto:arnaud.dieumegard@obeo.fr">Arnaud Dieumegard</a>
 */
public class CapellaAssociationService {
    
    CapellaAssociationService() {
        // Prevent instanciation
    }
    
    /**
     * Generate HTML part for documentation of the NAvigableMembers feature content for {@code association}. Each
     * NavigableMember Property element is formatted using
     * {@link CapellaPropertyServices#getInformationFromProperty(Property, String, String)}
     * 
     * @param association
     *            The association for which HTML content is generated
     * @param projectName
     * @param outputFolder
     * @return HTML formatted String content
     */
    public static List<String> getInformationForAssociationNavigableMembers(Association association, String projectName, String outputFolder) {
        EList<Property> navigableMembers = association.getNavigableMembers();
        return getProperties(navigableMembers, projectName, outputFolder);
    }

    /**
     * Generate HTML part for documentation of the OwnedMembers feature content for {@code association}. Each
     * OwnedMember Property element is formatted using
     * {@link CapellaPropertyServices#getInformationFromProperty(Property, String, String)}
     * 
     * @param association
     *            The association for which HTML content is generated
     * @param projectName
     * @param outputFolder
     * @return HTML formatted String content
     */
    public static List<String> getInformationForAssociationOwnedMembers(Association association, String projectName, String outputFolder) {
        EList<Property> ownedMembers = association.getOwnedMembers();
        return getProperties(ownedMembers, projectName, outputFolder);
    }

    /**
     * Generate HTML part for documentation of {@code association}. The HTML content is the Icon and link to the element
     * page.
     * 
     * @param association
     *            The association for which HTML content is generated
     * @param projectName
     * @param outputFolder
     * @return HTML formatted String content
     */
    public static String getInformationFromAssociation(Association association, String projectName, String outputFolder) {
        StringBuilder buffer = new StringBuilder();
        buffer.append(CapellaServices.getImageLinkFromElement(association, projectName, outputFolder));
        buffer.append(CapellaServices.SPACE);
        if (CapellaDocgenPreferenceHelper.isExportAssociation()) {
            buffer.append(CapellaServices.getHyperlinkFromElement(association, association.getLabel()));
        } else {
            buffer.append(association.getLabel());
        }
        return buffer.toString();
    }

    private static List<String> getProperties(EList<Property> navigableMembers, String projectName, String outputFolder) {
        List<String> result = new ArrayList<>();
        for (Property property : navigableMembers) {
            result.add(CapellaPropertyServices.getInformationFromProperty(property, projectName, outputFolder));
        }
        return result;
    }

}
