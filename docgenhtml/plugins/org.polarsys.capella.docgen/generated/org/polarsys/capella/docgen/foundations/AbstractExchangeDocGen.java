//Generated with EGF 1.5.1.v20180423-0901
package org.polarsys.capella.docgen.foundations;

import org.eclipse.egf.common.helper.*;
import java.util.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.egf.model.pattern.*;
import org.eclipse.egf.pattern.execution.*;
import org.eclipse.egf.pattern.query.*;
import org.polarsys.capella.core.data.fa.ComponentExchange;
import org.polarsys.capella.core.data.fa.FunctionalExchange;
import org.polarsys.capella.docgen.util.ExchangesServices;
import org.polarsys.capella.core.data.cs.PhysicalLink;

public class AbstractExchangeDocGen extends org.polarsys.capella.docgen.foundations.NamedElementDocGen {
	protected static String nl;

	public static synchronized AbstractExchangeDocGen create(String lineSeparator) {
		nl = lineSeparator;
		AbstractExchangeDocGen result = new AbstractExchangeDocGen();
		nl = null;
		return result;
	}

	public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
	protected final String TEXT_1 = NL + "<h2> Source </h2>";
	protected final String TEXT_2 = NL;
	protected final String TEXT_3 = NL + NL + "<h2> Target </h2>";
	protected final String TEXT_4 = NL;
	protected final String TEXT_5 = NL;
	protected final String TEXT_6 = NL + "\t<h2> Allocated Function Exchanges </h2>" + NL + "\t";
	protected final String TEXT_7 = NL;
	protected final String TEXT_8 = NL + "\t<h2> Allocated Function Exchanges </h2>" + NL + "\t";
	protected final String TEXT_9 = NL;
	protected final String TEXT_10 = NL + "\t\t<h2> Allocated Exchanges Items </h2>" + NL + "\t\t";
	protected final String TEXT_11 = NL;
	protected final String TEXT_12 = NL + "\t<h2> Categories </h2>" + NL + "\t";
	protected final String TEXT_13 = "<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?>" + NL
			+ "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\"" + NL
			+ "    \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">" + NL
			+ "<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"en\" lang=\"en\">" + NL + "" + NL + "\t<head>"
			+ NL + "\t\t<meta name=\"copyright\" content=\"";
	protected final String TEXT_14 = "\" />" + NL
			+ "\t\t<meta http-equiv=\"content-type\" content=\"text/html;charset=ISO-8859-1\" />" + NL
			+ "\t\t<meta http-equiv=\"Content-Style-Type\" content=\"text/css\" />" + NL + "" + NL + "\t\t<title>";
	protected final String TEXT_15 = "</title>" + NL
			+ "\t\t<link rel=\"stylesheet\" href=\"../../scripts/jquery-treeview/jquery.treeview.css\" />" + NL
			+ "  \t\t<script src=\"../../scripts/jquery-treeview/lib/jquery-1.11.1.js\" type=\"text/javascript\"></script>"
			+ NL
			+ "  \t\t<script src=\"../../scripts/jquery-treeview/jquery.treeview.js\" type=\"text/javascript\"></script>"
			+ NL + "\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"../../css/simpletree.css\" />\t\t" + NL
			+ "\t\t<link title=\"default\" rel=\"stylesheet\" type=\"text/css\" media=\"screen, projection\" href=\"../../css/content.css\"></link>"
			+ NL + "\t\t<script type=\"text/javascript\">" + NL
			+ "\t\t\tif(parent.location.href == self.location.href) {" + NL
			+ "\t\t\t\twindow.location.href = 'index.html?";
	protected final String TEXT_16 = "';" + NL + "\t\t\t}" + NL + "\t\t</script>" + NL + "\t\t" + NL + "\t\t<style>"
			+ NL + "\t\t\tbody {" + NL + "\t\t\t\tbackground: white;" + NL + "\t\t\t\tfont-family: Arial;" + NL
			+ "\t\t\t}" + NL + "\t\t\t.treeview {" + NL + "\t\t\t\tbackground-color: white ;" + NL + "\t\t\t}" + NL
			+ "\t" + NL + "\t\t\t.treeview ul{ /*CSS for Simple Tree Menu*/" + NL + "\t\t\t\tbackground-color: white;"
			+ NL + "\t\t\t\tfont-size: 12px;" + NL + "\t\t\t}" + NL + "\t" + NL
			+ "\t\t\t.treeview li{ /*Style for LI elements in general (excludes an LI that contains sub lists)*/" + NL
			+ "\t\t\t\tbackground-color: white;" + NL + "\t\t\t}" + NL + "\t\t</style>" + NL + "\t\t" + NL + "\t</head>"
			+ NL + "\t" + NL + "\t<body>";
	protected final String TEXT_17 = "\t<script type=\"text/javascript\">" + NL + "\t\t$(\"#";
	protected final String TEXT_18 = "\").treeview({ collapsed: false, animated: \"fast\", unique: false, control: \"#treecontrol\"});"
			+ NL + "\t\t$(\"#";
	protected final String TEXT_19 = "\").treeview({ collapsed: false, animated: \"fast\", unique: false, control: \"#treecontrol\"});"
			+ NL + "\t</script>" + NL + "   </body>" + NL + "</html>";
	protected final String TEXT_20 = NL;
	protected final String TEXT_21 = NL;

	public AbstractExchangeDocGen() {
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

		stringBuffer.append(TEXT_20);
		stringBuffer.append(TEXT_21);
		return stringBuffer.toString();
	}

	public String orchestration(PatternContext ctx) throws Exception {
		InternalPatternContext ictx = (InternalPatternContext) ctx;

		super.orchestration(new SuperOrchestrationContext(ictx));

		return null;
	}

	public Map<String, Object> getParameters() {
		final Map<String, Object> parameters = new HashMap<String, Object>();
		return parameters;
	}

	protected void method_content(final StringBuffer stringBuffer, final PatternContext ctx) throws Exception {

		super.method_content(new StringBuffer(), ctx);
		String projectName = ctx.getValue("projectName").toString();
		String outputFolder = ctx.getValue("outputFolder").toString();
		stringBuffer.append(TEXT_1);
		stringBuffer.append(TEXT_2);
		stringBuffer.append(ExchangesServices.getSource(element, projectName, outputFolder));
		stringBuffer.append(TEXT_3);
		stringBuffer.append(TEXT_4);
		stringBuffer.append(ExchangesServices.getTarget(element, projectName, outputFolder));
		stringBuffer.append(TEXT_5);
		if (ExchangesServices.genAllocatedFunctionExchanges(element)) {
			if (element instanceof ComponentExchange) {
				stringBuffer.append(TEXT_6);
				stringBuffer.append(ExchangesServices.getAllocatedFunctionExchanges((ComponentExchange) element,
						projectName, outputFolder));
			}
		}
		stringBuffer.append(TEXT_7);
		if (ExchangesServices.genAllocatedComponentExchanges(element)) {
			if (element instanceof PhysicalLink) {
				stringBuffer.append(TEXT_8);
				stringBuffer.append(ExchangesServices.getAllocatedComponentExchanges((PhysicalLink) element,
						projectName, outputFolder));
			}
		}
		stringBuffer.append(TEXT_9);
		if (ExchangesServices.genAllocatedExchangeItems(element)) {
			if (element instanceof ComponentExchange || element instanceof FunctionalExchange) {
				stringBuffer.append(TEXT_10);
				stringBuffer.append(ExchangesServices.getAllocatedExchangeItems(element, projectName, outputFolder));
			}
		}
		stringBuffer.append(TEXT_11);
		if (ExchangesServices.genCategories(element)) {
			stringBuffer.append(TEXT_12);
			stringBuffer.append(ExchangesServices.getCategories(element, projectName, outputFolder));
		}
		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "content", stringBuffer.toString());
	}

	protected void method_docHeader(final StringBuffer stringBuffer, final PatternContext ctx) throws Exception {

		stringBuffer.append(TEXT_13);
		stringBuffer.append(copyright);
		stringBuffer.append(TEXT_14);
		stringBuffer.append(title);
		stringBuffer.append(TEXT_15);
		stringBuffer.append(fileName);
		stringBuffer.append(TEXT_16);
		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "docHeader", stringBuffer.toString());
	}

	protected void method_docFooter(final StringBuffer stringBuffer, final PatternContext ctx) throws Exception {

		stringBuffer.append(TEXT_17);
		stringBuffer.append(ExchangesServices.SOURCE_PORT_TREE_ID);
		stringBuffer.append(TEXT_18);
		stringBuffer.append(ExchangesServices.TARGET_PORT_TREE_ID);
		stringBuffer.append(TEXT_19);
		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "docFooter", stringBuffer.toString());
	}
}