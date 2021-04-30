//Generated with EGF 1.6.2.202001031546
package org.polarsys.capella.docgen.foundations;

import org.eclipse.egf.common.helper.*;
import java.util.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.egf.model.pattern.*;
import org.eclipse.egf.pattern.execution.*;
import org.eclipse.egf.pattern.query.*;
import org.polarsys.capella.docgen.util.DocGenHtmlCapellaUtil;
import org.polarsys.capella.docgen.util.CapellaServices;
import org.polarsys.kitalpha.doc.gen.business.core.util.EscapeChars;
import org.polarsys.capella.core.data.cs.BlockArchitecture;
import org.polarsys.capella.docgen.diagram.CapellaHelper;

public class CapellaElementDocGen extends org.polarsys.kitalpha.doc.gen.business.core.doccontent.ElementDocContent {
	protected static String nl;

	public static synchronized CapellaElementDocGen create(String lineSeparator) {
		nl = lineSeparator;
		CapellaElementDocGen result = new CapellaElementDocGen();
		nl = null;
		return result;
	}

	public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
	protected final String TEXT_1 = "<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?>" + NL
			+ "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\"" + NL
			+ "    \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">" + NL
			+ "<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"en\" lang=\"en\">" + NL + "" + NL + "\t<head>"
			+ NL + "\t\t<meta name=\"copyright\" content=\"";
	protected final String TEXT_2 = "\" />" + NL
			+ "\t\t<meta http-equiv=\"content-type\" content=\"text/html;charset=ISO-8859-1\" />" + NL
			+ "\t\t<meta http-equiv=\"Content-Style-Type\" content=\"text/css\" />" + NL + "" + NL + "\t\t<title>";
	protected final String TEXT_3 = "</title>" + NL
			+ "\t\t<link rel=\"stylesheet\" href=\"../../scripts/jquery-treeview/jquery.treeview.css\" />" + NL
			+ "  \t\t<script src=\"../../scripts/jquery-treeview/lib/jquery-1.11.1.js\" type=\"text/javascript\"></script>"
			+ NL
			+ "  \t\t<script src=\"../../scripts/jquery-treeview/jquery.treeview.js\" type=\"text/javascript\"></script>"
			+ NL + "\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"../../css/simpletree.css\" />\t\t" + NL
			+ "\t\t<link title=\"default\" rel=\"stylesheet\" type=\"text/css\" media=\"screen, projection\" href=\"../../css/content.css\"></link>"
			+ NL + "\t\t<script type=\"text/javascript\">" + NL
			+ "\t\t\tif(parent.location.href == self.location.href) {" + NL
			+ "\t\t\t\twindow.location.href = 'index.html?";
	protected final String TEXT_4 = "' + '#' + self.location.href.substring(self.location.href.lastIndexOf(\"#\")+1);"
			+ NL + "\t\t\t}" + NL + "\t\t</script>" + NL + "\t\t" + NL + "\t\t<style>" + NL + "\t\t\tbody {" + NL
			+ "\t\t\t\tbackground: white;" + NL + "\t\t\t\tfont-family: Arial;" + NL + "\t\t\t}" + NL
			+ "\t\t\t.treeview {" + NL + "\t\t\t\tbackground-color: white ;" + NL + "\t\t\t}" + NL + "\t" + NL
			+ "\t\t\t.treeview ul{ /*CSS for Simple Tree Menu*/" + NL + "\t\t\t\tbackground-color: white;" + NL
			+ "\t\t\t\tfont-size: 12px;" + NL + "\t\t\t}" + NL + "\t" + NL
			+ "\t\t\t.treeview li{ /*Style for LI elements in general (excludes an LI that contains sub lists)*/" + NL
			+ "\t\t\t\tbackground-color: white;" + NL + "\t\t\t}" + NL + "\t\t</style>" + NL + "\t\t" + NL + "\t</head>"
			+ NL + "\t" + NL + "\t<body>\t";
	protected final String TEXT_5 = NL;

	public CapellaElementDocGen() {
		//Here is the constructor
		StringBuffer stringBuffer = new StringBuffer();

		// add initialisation of the pattern variables (declaration has been already done).

	}

	public String generate(Object argument) throws Exception {
		final StringBuffer stringBuffer = new StringBuffer();

		InternalPatternContext ctx = (InternalPatternContext) argument;
		Map<String, String> queryCtx = null;
		IQuery.ParameterDescription paramDesc = null;
		Node.Container currentNode = ctx.getNode();

		if (preCondition(ctx)) {
			ctx.setNode(new Node.Container(currentNode, getClass()));
			orchestration(ctx);
		}

		ctx.setNode(currentNode);
		if (ctx.useReporter()) {
			ctx.getReporter().executionFinished(OutputManager.computeExecutionOutput(ctx), ctx);
		}

		stringBuffer.append(TEXT_5);
		stringBuffer.append(TEXT_5);
		return stringBuffer.toString();
	}

	public String orchestration(PatternContext ctx) throws Exception {
		InternalPatternContext ictx = (InternalPatternContext) ctx;

		method_setCapellaContext(new StringBuffer(), ictx);

		method_setTitle(new StringBuffer(), ictx);

		method_setPath(new StringBuffer(), ictx);

		method_setFileName(new StringBuffer(), ictx);
		super.orchestration(new SuperOrchestrationContext(ictx));

		return null;
	}

	protected org.polarsys.capella.core.data.capellacore.CapellaElement element = null;

	public void set_element(org.polarsys.capella.core.data.capellacore.CapellaElement object) {
		this.element = object;
	}

	protected java.lang.String documentTitle = null;

	public void set_documentTitle(java.lang.String object) {
		this.documentTitle = object;
	}

	protected java.lang.String elementPath = null;

	public void set_elementPath(java.lang.String object) {
		this.elementPath = object;
	}

	public Map<String, Object> getParameters() {
		final Map<String, Object> parameters = new HashMap<String, Object>();
		return parameters;
	}

	protected void method_setCapellaContext(final StringBuffer stringBuffer, final PatternContext ctx)
			throws Exception {

		element = null;

		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "setCapellaContext", stringBuffer.toString());
	}

	protected void method_setTitle(final StringBuffer stringBuffer, final PatternContext ctx) throws Exception {

		String elementName = CapellaServices.getHyperlinkFromElement(element);
		/*
		String elementType = EscapeChars.forHTML(element.eClass().getName());
		String projectName= ctx.getValue("projectName").toString();
		*/
		documentTitle = elementName;
		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "setTitle", stringBuffer.toString());
	}

	protected void method_setPath(final StringBuffer stringBuffer, final PatternContext ctx) throws Exception {

		elementPath = CapellaServices.getElementPath(element);

		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "setPath", stringBuffer.toString());
	}

	protected void method_setFileName(final StringBuffer stringBuffer, final PatternContext ctx) throws Exception {

		fileName = DocGenHtmlCapellaUtil.getCapellaElementRootFileName(element);

		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "setFileName", stringBuffer.toString());
	}

	protected void method_content(final StringBuffer stringBuffer, final PatternContext ctx) throws Exception {

		{
			//<%@ egf:patternCall patternId="platform:/plugin/org.polarsys.capella.docgen/egf/HTMLDocGenCapella.fcore#LogicalName=org.polarsys.capella.docgen.foundations.CapellaElementContentDocGen" args="element:element, documentTitle:documentTitle"%>

			InternalPatternContext ictx = (InternalPatternContext) ctx;
			new Node.DataLeaf(ictx.getNode(), getClass(), null, stringBuffer.toString());
			stringBuffer.setLength(0);

			final Map<String, Object> callParameters = new HashMap<String, Object>();
			callParameters.put("element", element);
			callParameters.put("documentTitle", documentTitle);
			CallHelper.executeWithParameterInjection(
					"platform:/plugin/org.polarsys.capella.docgen/egf/HTMLDocGenCapella.fcore#_2twVYKu9EeCWrf9pgx3zjA",
					new ExecutionContext((InternalPatternContext) ctx), callParameters);
			stringBuffer.setLength(0);
		}

		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "content", stringBuffer.toString());
	}

	protected void method_setFileNameService(final StringBuffer stringBuffer, final PatternContext ctx)
			throws Exception {

		fileNameService = DocGenHtmlCapellaUtil.SERVICE;

		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "setFileNameService", stringBuffer.toString());
	}

	protected void method_endContent(final StringBuffer stringBuffer, final PatternContext ctx) throws Exception {

		{
			//<%@ egf:patternCall patternId="platform:/plugin/org.polarsys.capella.docgen/egf/HTMLDocGenCapella.fcore#LogicalName=org.polarsys.capella.docgen.foundations.CapellaElementEndContentDocGen" args="element:parameter"%>

			InternalPatternContext ictx = (InternalPatternContext) ctx;
			new Node.DataLeaf(ictx.getNode(), getClass(), null, stringBuffer.toString());
			stringBuffer.setLength(0);

			final Map<String, Object> callParameters = new HashMap<String, Object>();
			callParameters.put("parameter", element);
			CallHelper.executeWithParameterInjection(
					"platform:/plugin/org.polarsys.capella.docgen/egf/HTMLDocGenCapella.fcore#_H6iekavLEeCas-LHcur3rg",
					new ExecutionContext((InternalPatternContext) ctx), callParameters);
			stringBuffer.setLength(0);
		}

		super.method_endContent(new StringBuffer(), ctx);
		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "endContent", stringBuffer.toString());
	}

	protected void method_docHeader(final StringBuffer stringBuffer, final PatternContext ctx) throws Exception {

		stringBuffer.append(TEXT_1);
		stringBuffer.append(copyright);
		stringBuffer.append(TEXT_2);
		stringBuffer.append(title);
		stringBuffer.append(TEXT_3);
		stringBuffer.append(fileName);
		stringBuffer.append(TEXT_4);
		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "docHeader", stringBuffer.toString());
	}
}