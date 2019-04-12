//Generated with EGF 1.5.1.v20180423-0901
package org.polarsys.capella.docgen.foundations;

import org.eclipse.egf.common.helper.*;
import java.util.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.egf.model.pattern.*;
import org.eclipse.egf.pattern.execution.*;
import org.eclipse.egf.pattern.query.*;
import org.polarsys.capella.docgen.util.StringUtil;

public class SummaryAndDescriptionGeneration {
	protected static String nl;

	public static synchronized SummaryAndDescriptionGeneration create(String lineSeparator) {
		nl = lineSeparator;
		SummaryAndDescriptionGeneration result = new SummaryAndDescriptionGeneration();
		nl = null;
		return result;
	}

	public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
	protected final String TEXT_1 = "<em style=\"margin-top:5px;\">";
	protected final String TEXT_2 = "</em>";
	protected final String TEXT_3 = NL + "<p>";
	protected final String TEXT_4 = NL;
	protected final String TEXT_5 = NL;
	protected final String TEXT_6 = NL + "No description.";
	protected final String TEXT_7 = NL + "</p>";
	protected final String TEXT_8 = NL;
	protected final String TEXT_9 = NL;

	public SummaryAndDescriptionGeneration() {
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

		for (Object elementParameter : elementList) {

			this.element = (org.polarsys.capella.core.data.capellacore.CapellaElement) elementParameter;

			if (preCondition(ctx)) {
				ctx.setNode(new Node.Container(currentNode, getClass()));
				orchestration(ctx);
			}

		}
		ctx.setNode(currentNode);
		if (ctx.useReporter()) {
			ctx.getReporter().executionFinished(OutputManager.computeExecutionOutput(ctx), ctx);
		}

		stringBuffer.append(TEXT_8);
		stringBuffer.append(TEXT_9);
		return stringBuffer.toString();
	}

	public String orchestration(PatternContext ctx) throws Exception {
		InternalPatternContext ictx = (InternalPatternContext) ctx;

		method_body(new StringBuffer(), ictx);

		if (ictx.useReporter()) {
			Map<String, Object> parameterValues = new HashMap<String, Object>();
			parameterValues.put("element", this.element);
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

	public Map<String, Object> getParameters() {
		final Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("element", this.element);
		return parameters;
	}

	protected void method_body(final StringBuffer stringBuffer, final PatternContext ctx) throws Exception {

		String projectName = ctx.getValue("projectName").toString();
		String outputFolder = ctx.getValue("outputFolder").toString();
		if (element.getSummary() != null && element.getSummary().length() > 0) {
			stringBuffer.append(TEXT_1);
			stringBuffer.append(element.getSummary());
			stringBuffer.append(TEXT_2);
		}
		stringBuffer.append(TEXT_3);
		if (element.getDescription() != null && element.getDescription().length() > 0) {
			stringBuffer.append(TEXT_4);
			stringBuffer.append(TEXT_5);
			stringBuffer.append(
					StringUtil.transformAREFString(element, element.getDescription(), projectName, outputFolder));
		} else {
			stringBuffer.append(TEXT_6);
		}
		stringBuffer.append(TEXT_7);
		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "body", stringBuffer.toString());
	}

	public boolean preCondition(PatternContext ctx) throws Exception {
		return true;
	}
}