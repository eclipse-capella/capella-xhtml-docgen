//Generated with EGF 1.5.1.v20180423-0901
package org.polarsys.capella.docgen.content;

import org.eclipse.egf.common.helper.*;
import java.util.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.egf.model.pattern.*;
import org.eclipse.egf.pattern.execution.*;
import org.eclipse.egf.pattern.query.*;
import org.polarsys.capella.docgen.util.StringUtil;
import org.polarsys.capella.docgen.util.pattern.helper.CapellaCapabilityHelper;
import org.polarsys.capella.core.data.la.CapabilityRealization;

public class CapabilityRealizationDocGen extends org.polarsys.capella.docgen.content.packageDocGen {
	protected static String nl;

	public static synchronized CapabilityRealizationDocGen create(String lineSeparator) {
		nl = lineSeparator;
		CapabilityRealizationDocGen result = new CapabilityRealizationDocGen();
		nl = null;
		return result;
	}

	public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
	protected final String TEXT_1 = "<h2>Involved Components</h2>";
	protected final String TEXT_2 = NL;
	protected final String TEXT_3 = NL + "<h2>Related Functions</h2>";
	protected final String TEXT_4 = NL;
	protected final String TEXT_5 = NL;
	protected final String TEXT_6 = NL;

	public CapabilityRealizationDocGen() {
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

		List<Object> parameterList = null;
		//this pattern can only be called by another (i.e. it's not an entry point in execution)

		for (Object parameterParameter : parameterList) {

			this.parameter = (org.polarsys.capella.core.data.capellacore.Structure) parameterParameter;

			if (preCondition(ctx)) {
				ctx.setNode(new Node.Container(currentNode, getClass()));
				orchestration(ctx);
			}

		}
		ctx.setNode(currentNode);
		if (ctx.useReporter()) {
			ctx.getReporter().executionFinished(OutputManager.computeExecutionOutput(ctx), ctx);
		}

		stringBuffer.append(TEXT_5);
		stringBuffer.append(TEXT_6);
		return stringBuffer.toString();
	}

	public String orchestration(PatternContext ctx) throws Exception {
		InternalPatternContext ictx = (InternalPatternContext) ctx;

		super.orchestration(new SuperOrchestrationContext(ictx));

		if (ictx.useReporter()) {
			Map<String, Object> parameterValues = new HashMap<String, Object>();
			parameterValues.put("parameter", this.parameter);
			String outputWithCallBack = OutputManager.computeLoopOutput(ictx);
			String loop = OutputManager.computeLoopOutputWithoutCallback(ictx);
			ictx.getReporter().loopFinished(loop, outputWithCallBack, ictx, parameterValues);
		}
		return null;
	}

	public Map<String, Object> getParameters() {
		final Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("parameter", this.parameter);
		return parameters;
	}

	protected void method_content(final StringBuffer stringBuffer, final PatternContext ctx) throws Exception {

		super.method_content(new StringBuffer(), ctx);
		String projectName = ctx.getValue("projectName").toString();
		String outputFolder = ctx.getValue("outputFolder").toString();
		Collection<String> involvedComponent = CapellaCapabilityHelper.INSTANCE.getInvolvedComponent(projectName,
				outputFolder, (CapabilityRealization) parameter);

		if (involvedComponent.size() > 0) {

			stringBuffer.append(TEXT_1);
			stringBuffer.append(TEXT_2);
			stringBuffer.append(StringUtil.stringListToBulette(involvedComponent));

		}

		Collection<String> involvedFunctions = CapellaCapabilityHelper.INSTANCE.getInvolvedFunctions(projectName,
				outputFolder, (CapabilityRealization) parameter);

		if (involvedFunctions.size() > 0) {

			stringBuffer.append(TEXT_3);
			stringBuffer.append(TEXT_4);
			stringBuffer.append(StringUtil.stringListToBulette(involvedFunctions));

		}

		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "content", stringBuffer.toString());
	}

	public boolean preCondition(PatternContext ctx) throws Exception {
		return (this.parameter instanceof CapabilityRealization);
	}
}