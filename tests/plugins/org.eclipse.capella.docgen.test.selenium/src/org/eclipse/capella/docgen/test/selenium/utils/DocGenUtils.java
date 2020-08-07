package org.eclipse.capella.docgen.test.selenium.utils;

import org.polarsys.kitalpha.doc.gen.business.core.util.DocGenHtmlUtil;

public class DocGenUtils {

	public static String getValidFileName(String id) {
		return DocGenHtmlUtil.getValidFileName(id) + ".html";
	}
	
}
