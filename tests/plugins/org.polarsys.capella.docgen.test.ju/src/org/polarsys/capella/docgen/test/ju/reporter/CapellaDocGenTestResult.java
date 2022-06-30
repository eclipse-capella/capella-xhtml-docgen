/*******************************************************************************
 * Copyright (c) 2022 THALES GLOBAL SERVICES.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.capella.docgen.test.ju.reporter;

/**
 * This object is used to store the generated HTML content for Capella objects. These objects are the one that are
 * serialized as expected test results.
 * 
 * @author <a href="mailto:arnaud.dieumegard@obeo.fr">Arnaud Dieumegard</a>
 */
public class CapellaDocGenTestResult implements Comparable<CapellaDocGenTestResult> {
		
	private String elementID;
	private String fullLabel;
	private String elementType;
	private String usedPatternClass;
	private String fileName;
	private String generatedHTMLContent;
	
	public String getElementID() {
		return elementID;
	}
	
	public String getElementFullLabel() {
        return fullLabel;
    }
	
	public String getElementType() {
		return elementType;
	}
	
	public String getUsedPatternClass() {
		return usedPatternClass;
	}
	
	public String getFileName() {
		return fileName;
	}
	
	public String getGeneratedHTMLContent() {
		return generatedHTMLContent;
	}
	
	public String getClassifierId() {
		return getElementID() + "\n" + getElementFullLabel() + "\n" + getFileName() + "\n" + getElementType() + "\n" + getUsedPatternClass();
	}
	
	public CapellaDocGenTestResult(String elementID, String fullLabel, String elementType, String usedPatternClass, String fileName, String generatedHTMLContent) {
		this.elementID = elementID;
		this.fullLabel = fullLabel;
		this.elementType = elementType;
		this.usedPatternClass = usedPatternClass;
		this.generatedHTMLContent = generatedHTMLContent;
		this.fileName = fileName;
	}

	@Override
	public int compareTo(CapellaDocGenTestResult o) {
		int classifierIdCompare = getClassifierId().compareTo(o.getClassifierId());
		if (classifierIdCompare == 0) {
			return getGeneratedHTMLContent().compareTo(o.getGeneratedHTMLContent());
		}
		return classifierIdCompare;
	}
}
