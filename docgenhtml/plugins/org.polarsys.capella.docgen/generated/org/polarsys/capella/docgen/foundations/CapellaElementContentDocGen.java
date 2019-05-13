//Generated with EGF 1.6.1.201906060805
package org.polarsys.capella.docgen.foundations;

import java.util.*;
import org.eclipse.egf.model.pattern.*;
import org.eclipse.egf.pattern.execution.*;
import org.eclipse.egf.pattern.query.*;
import org.polarsys.capella.docgen.util.ImageHelper;
import org.polarsys.capella.docgen.util.CapellaServices;
import org.polarsys.kitalpha.doc.gen.business.core.util.EscapeChars;
import org.eclipse.emf.common.util.EList;
import org.polarsys.capella.core.data.requirement.Requirement;
import org.polarsys.capella.docgen.util.TreeServices;

public class CapellaElementContentDocGen {
	protected static String nl;

	public static synchronized CapellaElementContentDocGen create(String lineSeparator) {
		nl = lineSeparator;
		CapellaElementContentDocGen result = new CapellaElementContentDocGen();
		nl = null;
		return result;
	}

	public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
	protected final String TEXT_1 = "<img src=\"../icon/";
	protected final String TEXT_2 = "\" alt=\"";
	protected final String TEXT_3 = "\" style=\"float:left; margin-right:10px\" /><h1>";
	protected final String TEXT_4 = "</h1>" + NL
			+ "<p style=\"margin-top:3px; margin-bottom:3px\"><span class=\"elementMetaClass\">";
	protected final String TEXT_5 = "</span></p>" + NL + "<em class=\"elementPath\">";
	protected final String TEXT_6 = "</em>";
	protected final String TEXT_7 = NL;
	protected final String TEXT_8 = NL + "\t<h2>" + NL + "\tRequirements" + NL + "\t</h2>" + NL + "\t" + NL + "\t";
	protected final String TEXT_9 = NL + "\t<br>" + NL + "\t" + NL + "\t";
	protected final String TEXT_10 = NL + "\t" + NL + "\t";
	protected final String TEXT_11 = NL + "\t";

	public CapellaElementContentDocGen() {
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

		List<Object> elementList = null;
		//this pattern can only be called by another (i.e. it's not an entry point in execution)
		List<Object> documentTitleList = null;
		//this pattern can only be called by another (i.e. it's not an entry point in execution)

		for (Object elementParameter : elementList) {
			for (Object documentTitleParameter : documentTitleList) {

				this.element = (org.polarsys.capella.core.data.capellacore.CapellaElement) elementParameter;
				this.documentTitle = (java.lang.String) documentTitleParameter;

				if (preCondition(ctx)) {
					ctx.setNode(new Node.Container(currentNode, getClass()));
					orchestration(ctx);
				}

			}
		}
		ctx.setNode(currentNode);
		if (ctx.useReporter()) {
			ctx.getReporter().executionFinished(OutputManager.computeExecutionOutput(ctx), ctx);
		}

		stringBuffer.append(TEXT_7);
		stringBuffer.append(TEXT_7);
		return stringBuffer.toString();
	}

	public String orchestration(PatternContext ctx) throws Exception {
		InternalPatternContext ictx = (InternalPatternContext) ctx;

		method_body(new StringBuffer(), ictx);

		method_postBody(new StringBuffer(), ictx);

		if (ictx.useReporter()) {
			Map<String, Object> parameterValues = new HashMap<String, Object>();
			parameterValues.put("element", this.element);
			parameterValues.put("documentTitle", this.documentTitle);
			String outputWithCallBack = OutputManager.computeLoopOutput(ictx);
			String loop = OutputManager.computeLoopOutputWithoutCallback(ictx);
			ictx.getReporter().loopFinished(loop, outputWithCallBack, ictx, parameterValues);
		}
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

	public Map<String, Object> getParameters() {
		final Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("element", this.element);
		parameters.put("documentTitle", this.documentTitle);
		return parameters;
	}

	protected void method_body(final StringBuffer stringBuffer, final PatternContext ctx) throws Exception {

		String projectName = ctx.getValue("projectName").toString();
		String outputFolder = ctx.getValue("outputFolder").toString();
		String elementPath = CapellaServices.getElementPath(element);
		String elementName = CapellaServices.getHyperlinkFromElement(element);
		String elementType = EscapeChars.forHTML(element.eClass().getName());
		String logo = ImageHelper.INSTANCE.getTypePng(element, projectName, outputFolder);

		stringBuffer.append(TEXT_1);
		stringBuffer.append(logo);
		stringBuffer.append(TEXT_2);
		stringBuffer.append(elementType);
		stringBuffer.append(TEXT_3);
		stringBuffer.append(documentTitle);
		stringBuffer.append(TEXT_4);
		stringBuffer.append(elementType);
		stringBuffer.append(TEXT_5);
		stringBuffer.append(elementPath);
		stringBuffer.append(TEXT_6);
		// Summary and description generation
		stringBuffer.append(TEXT_7);
		{
			//<%@ egf:patternCall patternId="platform:/plugin/org.polarsys.capella.docgen/egf/HTMLDocGenCapella.fcore#LogicalName=org.polarsys.capella.docgen.foundations.SummaryAndDescriptionGeneration" args="element:element"%>

			InternalPatternContext ictx = (InternalPatternContext) ctx;
			new Node.DataLeaf(ictx.getNode(), getClass(), null, stringBuffer.toString());
			stringBuffer.setLength(0);

			final Map<String, Object> callParameters = new HashMap<String, Object>();
			callParameters.put("element", element);
			CallHelper.executeWithParameterInjection(
					"platform:/plugin/org.polarsys.capella.docgen/egf/HTMLDocGenCapella.fcore#_fiM9sOZdEd-YVt45ZEg4_w",
					new ExecutionContext((InternalPatternContext) ctx), callParameters);
			stringBuffer.setLength(0);
		}

		stringBuffer.append(TEXT_7);
		// Generating status and review information 
		stringBuffer.append(TEXT_7);
		{
			//<%@ egf:patternCall patternId="platform:/plugin/org.polarsys.capella.docgen/egf/HTMLDocGenCapella.fcore#LogicalName=org.polarsys.capella.docgen.foundations.StatusAndReviewGeneration" args="element:element"%>

			InternalPatternContext ictx = (InternalPatternContext) ctx;
			new Node.DataLeaf(ictx.getNode(), getClass(), null, stringBuffer.toString());
			stringBuffer.setLength(0);

			final Map<String, Object> callParameters = new HashMap<String, Object>();
			callParameters.put("element", element);
			CallHelper.executeWithParameterInjection(
					"platform:/plugin/org.polarsys.capella.docgen/egf/HTMLDocGenCapella.fcore#_2sAHwHWMEemiHtSfRhpXIQ",
					new ExecutionContext((InternalPatternContext) ctx), callParameters);
			stringBuffer.setLength(0);
		}

		stringBuffer.append(TEXT_7);
		// requirements

		EList<Requirement> appliedReq = element.getAppliedRequirements();
		if (appliedReq.size() > 0) {

			stringBuffer.append(TEXT_8);
			{
				//<%@ egf:patternCall patternId="platform:/plugin/org.polarsys.kitalpha.doc.gen.business.core/egf/HTMLDocGenCommon.fcore#LogicalName=org.polarsys.kitalpha.doc.gen.business.core.doccontent.treeview.TreeViewControlHeader" args="element:parameter, TreeServices.REQUIREMENT_TREE_ID:treeID"%>

				InternalPatternContext ictx = (InternalPatternContext) ctx;
				new Node.DataLeaf(ictx.getNode(), getClass(), null, stringBuffer.toString());
				stringBuffer.setLength(0);

				final Map<String, Object> callParameters = new HashMap<String, Object>();
				callParameters.put("parameter", element);
				callParameters.put("treeID", TreeServices.REQUIREMENT_TREE_ID);
				CallHelper.executeWithParameterInjection(
						"platform:/plugin/org.polarsys.kitalpha.doc.gen.business.core/egf/HTMLDocGenCommon.fcore#_V6ybEJ52EemYav3Xat9ApA",
						new ExecutionContext((InternalPatternContext) ctx), callParameters);
				stringBuffer.setLength(0);
			}

			stringBuffer.append(TEXT_9);
			stringBuffer.append(TreeServices.getRequirementsTree(appliedReq, projectName, outputFolder));
			stringBuffer.append(TEXT_10);
			{
				//<%@ egf:patternCall patternId="platform:/plugin/org.polarsys.kitalpha.doc.gen.business.core/egf/HTMLDocGenCommon.fcore#LogicalName=org.polarsys.kitalpha.doc.gen.business.core.doccontent.treeview.TreeViewControlFooter" args="element:parameter, TreeServices.REQUIREMENT_TREE_ID:treeID, true:collapsed"%>

				InternalPatternContext ictx = (InternalPatternContext) ctx;
				new Node.DataLeaf(ictx.getNode(), getClass(), null, stringBuffer.toString());
				stringBuffer.setLength(0);

				final Map<String, Object> callParameters = new HashMap<String, Object>();
				callParameters.put("parameter", element);
				callParameters.put("treeID", TreeServices.REQUIREMENT_TREE_ID);
				callParameters.put("collapsed", true);
				CallHelper.executeWithParameterInjection(
						"platform:/plugin/org.polarsys.kitalpha.doc.gen.business.core/egf/HTMLDocGenCommon.fcore#_-tPnEJ8dEemYav3Xat9ApA",
						new ExecutionContext((InternalPatternContext) ctx), callParameters);
				stringBuffer.setLength(0);
			}

			stringBuffer.append(TEXT_11);

		}

		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "body", stringBuffer.toString());
	}

	protected void method_postBody(final StringBuffer stringBuffer, final PatternContext ctx) throws Exception {

		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "postBody", stringBuffer.toString());
	}

	public boolean preCondition(PatternContext ctx) throws Exception {
		return true;
	}
}