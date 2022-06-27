package org.polarsys.capella.docgen.test.ju.reporter;

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
