//Generated with EGF 1.6.2.202001031546
package org.polarsys.capella.docgen.content;

import java.util.*;
import org.eclipse.egf.model.pattern.*;
import org.eclipse.egf.pattern.execution.*;
import org.eclipse.egf.pattern.query.*;
import org.polarsys.capella.core.data.interaction.Scenario;
import org.polarsys.capella.core.data.interaction.SequenceMessage;
import org.polarsys.capella.docgen.util.CapellaElementService;
import org.polarsys.capella.docgen.util.StringUtil;

public class CapellaScenarioDocGen extends org.polarsys.capella.docgen.foundations.NamedElementDocGen {
	protected static String nl;

	public static synchronized CapellaScenarioDocGen create(String lineSeparator) {
		nl = lineSeparator;
		CapellaScenarioDocGen result = new CapellaScenarioDocGen();
		nl = null;
		return result;
	}

	public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
	protected final String TEXT_1 = "";
	protected final String TEXT_2 = NL;
	protected final String TEXT_3 = NL + "</div>";

	public CapellaScenarioDocGen() {
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

			this.parameter = (org.polarsys.capella.core.data.interaction.Scenario) parameterParameter;

			if (preCondition(ctx)) {
				ctx.setNode(new Node.Container(currentNode, getClass()));
				orchestration(ctx);
			}

		}
		ctx.setNode(currentNode);
		if (ctx.useReporter()) {
			ctx.getReporter().executionFinished(OutputManager.computeExecutionOutput(ctx), ctx);
		}

		stringBuffer.append(TEXT_2);
		stringBuffer.append(TEXT_2);
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

	protected java.lang.String projectName = null;

	public void set_projectName(java.lang.String object) {
		this.projectName = object;
	}

	protected java.lang.String outputFolder = null;

	public void set_outputFolder(java.lang.String object) {
		this.outputFolder = object;
	}

	protected org.polarsys.capella.core.data.interaction.Scenario parameter = null;

	public void set_parameter(org.polarsys.capella.core.data.interaction.Scenario object) {
		this.parameter = object;
	}

	public Map<String, Object> getParameters() {
		final Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("parameter", this.parameter);
		return parameters;
	}

	protected void method_setCapellaContext(final StringBuffer stringBuffer, final PatternContext ctx)
			throws Exception {

		element = parameter;
		outputFolder = ctx.getValue("outputFolder").toString();
		projectName = ctx.getValue("projectName").toString();

		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "setCapellaContext", stringBuffer.toString());
	}

	protected void method_endContent(final StringBuffer stringBuffer, final PatternContext ctx) throws Exception {

		{
			//<%@ egf:patternCall patternId="platform:/plugin/org.polarsys.capella.docgen/egf/HTMLDocGenCapella.fcore#LogicalName=org.polarsys.capella.docgen.sections.capellaelement.CapellaElement_RealizedElements" args="parameter:parameter"%>

			InternalPatternContext ictx = (InternalPatternContext) ctx;
			new Node.DataLeaf(ictx.getNode(), getClass(), null, stringBuffer.toString());
			stringBuffer.setLength(0);

			final Map<String, Object> callParameters = new HashMap<String, Object>();
			callParameters.put("parameter", parameter);
			CallHelper.executeWithParameterInjection(
					"platform:/plugin/org.polarsys.capella.docgen/egf/HTMLDocGenCapella.fcore#_yfHS4KgKEeu7bOcPHGGhcQ",
					new ExecutionContext((InternalPatternContext) ctx), callParameters);
			stringBuffer.setLength(0);
		}

		stringBuffer.append(TEXT_1);
		stringBuffer.append(TEXT_2);
		{
			//<%@ egf:patternCall patternId="platform:/plugin/org.polarsys.capella.docgen/egf/HTMLDocGenCapella.fcore#LogicalName=org.polarsys.capella.docgen.sections.capellaelement.CapellaElement_RealizingElements" args="parameter:parameter"%>

			InternalPatternContext ictx = (InternalPatternContext) ctx;
			new Node.DataLeaf(ictx.getNode(), getClass(), null, stringBuffer.toString());
			stringBuffer.setLength(0);

			final Map<String, Object> callParameters = new HashMap<String, Object>();
			callParameters.put("parameter", parameter);
			CallHelper.executeWithParameterInjection(
					"platform:/plugin/org.polarsys.capella.docgen/egf/HTMLDocGenCapella.fcore#_6IqBsKgLEeu7bOcPHGGhcQ",
					new ExecutionContext((InternalPatternContext) ctx), callParameters);
			stringBuffer.setLength(0);
		}

		stringBuffer.append(TEXT_2);
		// owned diagrams
		stringBuffer.append(TEXT_2);
		{
			//<%@ egf:patternCall patternId="platform:/plugin/org.polarsys.capella.docgen/egf/HTMLDocGenCapella.fcore#LogicalName=org.polarsys.capella.docgen.foundations.DiagramsGeneration" args="element:element"%>

			InternalPatternContext ictx = (InternalPatternContext) ctx;
			new Node.DataLeaf(ictx.getNode(), getClass(), null, stringBuffer.toString());
			stringBuffer.setLength(0);

			final Map<String, Object> callParameters = new HashMap<String, Object>();
			callParameters.put("element", element);
			CallHelper.executeWithParameterInjection(
					"platform:/plugin/org.polarsys.capella.docgen/egf/HTMLDocGenCapella.fcore#_PVePETXrEeCNvtb1bUM2fQ",
					new ExecutionContext((InternalPatternContext) ctx), callParameters);
			stringBuffer.setLength(0);
		}

		stringBuffer.append(TEXT_2);
		stringBuffer.append(TEXT_2);
		{
			//<%@ egf:patternCall patternId="platform:/plugin/org.polarsys.capella.docgen/egf/HTMLDocGenCapella.fcore#LogicalName=org.polarsys.capella.docgen.sections.scenario.Scenario_SequenceMessages" args="parameter:parameter, projectName:projectNameParameter, outputFolder:outputFolderParameter"%>

			InternalPatternContext ictx = (InternalPatternContext) ctx;
			new Node.DataLeaf(ictx.getNode(), getClass(), null, stringBuffer.toString());
			stringBuffer.setLength(0);

			final Map<String, Object> callParameters = new HashMap<String, Object>();
			callParameters.put("parameter", parameter);
			callParameters.put("projectNameParameter", projectName);
			callParameters.put("outputFolderParameter", outputFolder);
			CallHelper.executeWithParameterInjection(
					"platform:/plugin/org.polarsys.capella.docgen/egf/HTMLDocGenCapella.fcore#_KEGRQKg5Eeu7bOcPHGGhcQ",
					new ExecutionContext((InternalPatternContext) ctx), callParameters);
			stringBuffer.setLength(0);
		}

		stringBuffer.append(TEXT_3);
		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "endContent", stringBuffer.toString());
	}
}