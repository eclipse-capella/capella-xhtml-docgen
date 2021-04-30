//Generated with EGF 1.6.2.202001031546
package org.polarsys.capella.docgen.content;

import java.util.*;
import org.eclipse.egf.model.pattern.*;
import org.eclipse.egf.pattern.execution.*;
import org.eclipse.egf.pattern.query.*;
import org.polarsys.capella.core.data.fa.AbstractFunction;
import org.polarsys.capella.core.data.fa.FunctionalExchange;
import org.polarsys.capella.docgen.util.CapellaFunctionServices;
import org.polarsys.capella.docgen.util.StringUtil;
import org.polarsys.kitalpha.doc.gen.business.core.util.EscapeChars;
import org.polarsys.capella.docgen.util.CapellaLabelProviderHelper;
import org.polarsys.capella.docgen.util.pattern.helper.FunctionHelper;
import org.polarsys.capella.common.data.activity.InputPin;
import org.polarsys.capella.common.data.activity.OutputPin;
import org.eclipse.emf.common.util.EList;
import org.polarsys.capella.core.data.oa.OperationalActivity;

public class AbstractFunctionDocGen extends org.polarsys.capella.docgen.foundations.NamedElementDocGen {
	protected static String nl;

	public static synchronized AbstractFunctionDocGen create(String lineSeparator) {
		nl = lineSeparator;
		AbstractFunctionDocGen result = new AbstractFunctionDocGen();
		nl = null;
		return result;
	}

	public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
	protected final String TEXT_1 = "";
	protected final String TEXT_2 = NL;

	public AbstractFunctionDocGen() {
		//Here is the constructor
		StringBuffer stringBuffer = new StringBuffer();

		// add initialisation of the pattern variables (declaration has been already done).

	}

	public String generate(Object argument) throws Exception {
		final StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append(TEXT_1);

		InternalPatternContext ctx = (InternalPatternContext) argument;
		Map<String, String> queryCtx = null;
		IQuery.ParameterDescription paramDesc = null;
		Node.Container currentNode = ctx.getNode();

		List<Object> parameterList = null;
		//this pattern can only be called by another (i.e. it's not an entry point in execution)

		for (Object parameterParameter : parameterList) {

			this.parameter = (org.polarsys.capella.core.data.fa.AbstractFunction) parameterParameter;

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

	protected java.lang.String elementName = null;

	public void set_elementName(java.lang.String object) {
		this.elementName = object;
	}

	protected java.lang.String elementType = null;

	public void set_elementType(java.lang.String object) {
		this.elementType = object;
	}

	protected java.lang.String projectName = null;

	public void set_projectName(java.lang.String object) {
		this.projectName = object;
	}

	protected java.lang.String outputFolder = null;

	public void set_outputFolder(java.lang.String object) {
		this.outputFolder = object;
	}

	protected org.polarsys.capella.core.data.fa.AbstractFunction parameter = null;

	public void set_parameter(org.polarsys.capella.core.data.fa.AbstractFunction object) {
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
		elementName = EscapeChars.forHTML(CapellaLabelProviderHelper.getText(element));
		elementType = EscapeChars.forHTML(element.eClass().getName());
		projectName = ctx.getValue("projectName").toString();
		outputFolder = ctx.getValue("outputFolder").toString();

		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "setCapellaContext", stringBuffer.toString());
	}

	protected void method_content(final StringBuffer stringBuffer, final PatternContext ctx) throws Exception {

		super.method_content(new StringBuffer(), ctx);

		stringBuffer.append(TEXT_2);
		{
			//<%@ egf:patternCall patternId="platform:/plugin/org.polarsys.capella.docgen/egf/HTMLDocGenCapella.fcore#LogicalName=org.polarsys.capella.docgen.sections.abstractfunction.AbstractFunction_InvolvingFunctionalChains" args="parameter:parameter, projectName:projectNameParameter, outputFolder:outputFolderParameter, elementName:elementNameParameter, elementType:elementTypeParameter"%>

			InternalPatternContext ictx = (InternalPatternContext) ctx;
			new Node.DataLeaf(ictx.getNode(), getClass(), null, stringBuffer.toString());
			stringBuffer.setLength(0);

			final Map<String, Object> callParameters = new HashMap<String, Object>();
			callParameters.put("parameter", parameter);
			callParameters.put("projectNameParameter", projectName);
			callParameters.put("outputFolderParameter", outputFolder);
			callParameters.put("elementNameParameter", elementName);
			callParameters.put("elementTypeParameter", elementType);
			CallHelper.executeWithParameterInjection(
					"platform:/plugin/org.polarsys.capella.docgen/egf/HTMLDocGenCapella.fcore#_qm2FgI40EeuxdbbVGtbmsw",
					new ExecutionContext((InternalPatternContext) ctx), callParameters);
			stringBuffer.setLength(0);
		}

		stringBuffer.append(TEXT_2);
		stringBuffer.append(TEXT_2);
		{
			//<%@ egf:patternCall patternId="platform:/plugin/org.polarsys.capella.docgen/egf/HTMLDocGenCapella.fcore#LogicalName=org.polarsys.capella.docgen.sections.abstractfunction.AbstractFunction_InvolvingOperationalProcesses" args="parameter:parameter, projectName:projectNameParameter, outputFolder:outputFolderParameter, elementName:elementNameParameter, elementType:elementTypeParameter"%>

			InternalPatternContext ictx = (InternalPatternContext) ctx;
			new Node.DataLeaf(ictx.getNode(), getClass(), null, stringBuffer.toString());
			stringBuffer.setLength(0);

			final Map<String, Object> callParameters = new HashMap<String, Object>();
			callParameters.put("parameter", parameter);
			callParameters.put("projectNameParameter", projectName);
			callParameters.put("outputFolderParameter", outputFolder);
			callParameters.put("elementNameParameter", elementName);
			callParameters.put("elementTypeParameter", elementType);
			CallHelper.executeWithParameterInjection(
					"platform:/plugin/org.polarsys.capella.docgen/egf/HTMLDocGenCapella.fcore#_ptIdAI45EeuxdbbVGtbmsw",
					new ExecutionContext((InternalPatternContext) ctx), callParameters);
			stringBuffer.setLength(0);
		}

		stringBuffer.append(TEXT_2);
		stringBuffer.append(TEXT_2);
		{
			//<%@ egf:patternCall patternId="platform:/plugin/org.polarsys.capella.docgen/egf/HTMLDocGenCapella.fcore#LogicalName=org.polarsys.capella.docgen.sections.abstractfunction.AbstractFunction_AllocatingComponents" args="parameter:parameter, projectName:projectNameParameter, outputFolder:outputFolderParameter, elementName:elementNameParameter, elementType:elementTypeParameter"%>

			InternalPatternContext ictx = (InternalPatternContext) ctx;
			new Node.DataLeaf(ictx.getNode(), getClass(), null, stringBuffer.toString());
			stringBuffer.setLength(0);

			final Map<String, Object> callParameters = new HashMap<String, Object>();
			callParameters.put("parameter", parameter);
			callParameters.put("projectNameParameter", projectName);
			callParameters.put("outputFolderParameter", outputFolder);
			callParameters.put("elementNameParameter", elementName);
			callParameters.put("elementTypeParameter", elementType);
			CallHelper.executeWithParameterInjection(
					"platform:/plugin/org.polarsys.capella.docgen/egf/HTMLDocGenCapella.fcore#_p_FU8KctEeuJhsj8yYqhhw",
					new ExecutionContext((InternalPatternContext) ctx), callParameters);
			stringBuffer.setLength(0);
		}

		stringBuffer.append(TEXT_2);
		stringBuffer.append(TEXT_2);
		{
			//<%@ egf:patternCall patternId="platform:/plugin/org.polarsys.capella.docgen/egf/HTMLDocGenCapella.fcore#LogicalName=org.polarsys.capella.docgen.sections.abstractfunction.AbstractFunction_IncomingFunctionalPorts" args="parameter:parameter, projectName:projectNameParameter, outputFolder:outputFolderParameter, elementName:elementNameParameter, elementType:elementTypeParameter"%>

			InternalPatternContext ictx = (InternalPatternContext) ctx;
			new Node.DataLeaf(ictx.getNode(), getClass(), null, stringBuffer.toString());
			stringBuffer.setLength(0);

			final Map<String, Object> callParameters = new HashMap<String, Object>();
			callParameters.put("parameter", parameter);
			callParameters.put("projectNameParameter", projectName);
			callParameters.put("outputFolderParameter", outputFolder);
			callParameters.put("elementNameParameter", elementName);
			callParameters.put("elementTypeParameter", elementType);
			CallHelper.executeWithParameterInjection(
					"platform:/plugin/org.polarsys.capella.docgen/egf/HTMLDocGenCapella.fcore#_R9PoYKc0EeuJhsj8yYqhhw",
					new ExecutionContext((InternalPatternContext) ctx), callParameters);
			stringBuffer.setLength(0);
		}

		stringBuffer.append(TEXT_2);
		stringBuffer.append(TEXT_2);
		{
			//<%@ egf:patternCall patternId="platform:/plugin/org.polarsys.capella.docgen/egf/HTMLDocGenCapella.fcore#LogicalName=org.polarsys.capella.docgen.sections.abstractfunction.AbstractFunction_OutgoingFunctionalPorts" args="parameter:parameter, projectName:projectNameParameter, outputFolder:outputFolderParameter, elementName:elementNameParameter, elementType:elementTypeParameter"%>

			InternalPatternContext ictx = (InternalPatternContext) ctx;
			new Node.DataLeaf(ictx.getNode(), getClass(), null, stringBuffer.toString());
			stringBuffer.setLength(0);

			final Map<String, Object> callParameters = new HashMap<String, Object>();
			callParameters.put("parameter", parameter);
			callParameters.put("projectNameParameter", projectName);
			callParameters.put("outputFolderParameter", outputFolder);
			callParameters.put("elementNameParameter", elementName);
			callParameters.put("elementTypeParameter", elementType);
			CallHelper.executeWithParameterInjection(
					"platform:/plugin/org.polarsys.capella.docgen/egf/HTMLDocGenCapella.fcore#_UI3ggKc2EeuJhsj8yYqhhw",
					new ExecutionContext((InternalPatternContext) ctx), callParameters);
			stringBuffer.setLength(0);
		}

		stringBuffer.append(TEXT_2);
		stringBuffer.append(TEXT_2);
		{
			//<%@ egf:patternCall patternId="platform:/plugin/org.polarsys.capella.docgen/egf/HTMLDocGenCapella.fcore#LogicalName=org.polarsys.capella.docgen.sections.abstractfunction.AbstractFunction_IncomingInternalFunctionalExchanges" args="parameter:parameter, projectName:projectNameParameter, outputFolder:outputFolderParameter, elementName:elementNameParameter, elementType:elementTypeParameter"%>

			InternalPatternContext ictx = (InternalPatternContext) ctx;
			new Node.DataLeaf(ictx.getNode(), getClass(), null, stringBuffer.toString());
			stringBuffer.setLength(0);

			final Map<String, Object> callParameters = new HashMap<String, Object>();
			callParameters.put("parameter", parameter);
			callParameters.put("projectNameParameter", projectName);
			callParameters.put("outputFolderParameter", outputFolder);
			callParameters.put("elementNameParameter", elementName);
			callParameters.put("elementTypeParameter", elementType);
			CallHelper.executeWithParameterInjection(
					"platform:/plugin/org.polarsys.capella.docgen/egf/HTMLDocGenCapella.fcore#_SjNGEKc9EeuJhsj8yYqhhw",
					new ExecutionContext((InternalPatternContext) ctx), callParameters);
			stringBuffer.setLength(0);
		}

		stringBuffer.append(TEXT_2);
		stringBuffer.append(TEXT_2);
		{
			//<%@ egf:patternCall patternId="platform:/plugin/org.polarsys.capella.docgen/egf/HTMLDocGenCapella.fcore#LogicalName=org.polarsys.capella.docgen.sections.abstractfunction.AbstractFunction_OutgoingInternalFunctionalExchanges" args="parameter:parameter, projectName:projectNameParameter, outputFolder:outputFolderParameter, elementName:elementNameParameter, elementType:elementTypeParameter"%>

			InternalPatternContext ictx = (InternalPatternContext) ctx;
			new Node.DataLeaf(ictx.getNode(), getClass(), null, stringBuffer.toString());
			stringBuffer.setLength(0);

			final Map<String, Object> callParameters = new HashMap<String, Object>();
			callParameters.put("parameter", parameter);
			callParameters.put("projectNameParameter", projectName);
			callParameters.put("outputFolderParameter", outputFolder);
			callParameters.put("elementNameParameter", elementName);
			callParameters.put("elementTypeParameter", elementType);
			CallHelper.executeWithParameterInjection(
					"platform:/plugin/org.polarsys.capella.docgen/egf/HTMLDocGenCapella.fcore#_Lgl88KdTEeuJhsj8yYqhhw",
					new ExecutionContext((InternalPatternContext) ctx), callParameters);
			stringBuffer.setLength(0);
		}

		stringBuffer.append(TEXT_2);
		stringBuffer.append(TEXT_2);
		{
			//<%@ egf:patternCall patternId="platform:/plugin/org.polarsys.capella.docgen/egf/HTMLDocGenCapella.fcore#LogicalName=org.polarsys.capella.docgen.sections.abstractfunction.AbstractFunction_IncomingFunctionalExchanges" args="parameter:parameter, projectName:projectNameParameter, outputFolder:outputFolderParameter, elementName:elementNameParameter, elementType:elementTypeParameter"%>

			InternalPatternContext ictx = (InternalPatternContext) ctx;
			new Node.DataLeaf(ictx.getNode(), getClass(), null, stringBuffer.toString());
			stringBuffer.setLength(0);

			final Map<String, Object> callParameters = new HashMap<String, Object>();
			callParameters.put("parameter", parameter);
			callParameters.put("projectNameParameter", projectName);
			callParameters.put("outputFolderParameter", outputFolder);
			callParameters.put("elementNameParameter", elementName);
			callParameters.put("elementTypeParameter", elementType);
			CallHelper.executeWithParameterInjection(
					"platform:/plugin/org.polarsys.capella.docgen/egf/HTMLDocGenCapella.fcore#_xOS4YKdTEeuJhsj8yYqhhw",
					new ExecutionContext((InternalPatternContext) ctx), callParameters);
			stringBuffer.setLength(0);
		}

		stringBuffer.append(TEXT_2);
		stringBuffer.append(TEXT_2);
		{
			//<%@ egf:patternCall patternId="platform:/plugin/org.polarsys.capella.docgen/egf/HTMLDocGenCapella.fcore#LogicalName=org.polarsys.capella.docgen.sections.abstractfunction.AbstractFunction_OutgoingFunctionalExchanges" args="parameter:parameter, projectName:projectNameParameter, outputFolder:outputFolderParameter, elementName:elementNameParameter, elementType:elementTypeParameter"%>

			InternalPatternContext ictx = (InternalPatternContext) ctx;
			new Node.DataLeaf(ictx.getNode(), getClass(), null, stringBuffer.toString());
			stringBuffer.setLength(0);

			final Map<String, Object> callParameters = new HashMap<String, Object>();
			callParameters.put("parameter", parameter);
			callParameters.put("projectNameParameter", projectName);
			callParameters.put("outputFolderParameter", outputFolder);
			callParameters.put("elementNameParameter", elementName);
			callParameters.put("elementTypeParameter", elementType);
			CallHelper.executeWithParameterInjection(
					"platform:/plugin/org.polarsys.capella.docgen/egf/HTMLDocGenCapella.fcore#_U4K64KdUEeuJhsj8yYqhhw",
					new ExecutionContext((InternalPatternContext) ctx), callParameters);
			stringBuffer.setLength(0);
		}

		stringBuffer.append(TEXT_2);
		stringBuffer.append(TEXT_2);
		{
			//<%@ egf:patternCall patternId="platform:/plugin/org.polarsys.capella.docgen/egf/HTMLDocGenCapella.fcore#LogicalName=org.polarsys.capella.docgen.sections.abstractfunction.AbstractFunction_IncomingInternalInteractions" args="parameter:parameter, projectName:projectNameParameter, outputFolder:outputFolderParameter, elementName:elementNameParameter, elementType:elementTypeParameter"%>

			InternalPatternContext ictx = (InternalPatternContext) ctx;
			new Node.DataLeaf(ictx.getNode(), getClass(), null, stringBuffer.toString());
			stringBuffer.setLength(0);

			final Map<String, Object> callParameters = new HashMap<String, Object>();
			callParameters.put("parameter", parameter);
			callParameters.put("projectNameParameter", projectName);
			callParameters.put("outputFolderParameter", outputFolder);
			callParameters.put("elementNameParameter", elementName);
			callParameters.put("elementTypeParameter", elementType);
			CallHelper.executeWithParameterInjection(
					"platform:/plugin/org.polarsys.capella.docgen/egf/HTMLDocGenCapella.fcore#_7ABmQKdVEeuJhsj8yYqhhw",
					new ExecutionContext((InternalPatternContext) ctx), callParameters);
			stringBuffer.setLength(0);
		}

		stringBuffer.append(TEXT_2);
		stringBuffer.append(TEXT_2);
		{
			//<%@ egf:patternCall patternId="platform:/plugin/org.polarsys.capella.docgen/egf/HTMLDocGenCapella.fcore#LogicalName=org.polarsys.capella.docgen.sections.abstractfunction.AbstractFunction_OutgoingInternalInteractions" args="parameter:parameter, projectName:projectNameParameter, outputFolder:outputFolderParameter, elementName:elementNameParameter, elementType:elementTypeParameter"%>

			InternalPatternContext ictx = (InternalPatternContext) ctx;
			new Node.DataLeaf(ictx.getNode(), getClass(), null, stringBuffer.toString());
			stringBuffer.setLength(0);

			final Map<String, Object> callParameters = new HashMap<String, Object>();
			callParameters.put("parameter", parameter);
			callParameters.put("projectNameParameter", projectName);
			callParameters.put("outputFolderParameter", outputFolder);
			callParameters.put("elementNameParameter", elementName);
			callParameters.put("elementTypeParameter", elementType);
			CallHelper.executeWithParameterInjection(
					"platform:/plugin/org.polarsys.capella.docgen/egf/HTMLDocGenCapella.fcore#_cWDW0KdWEeuJhsj8yYqhhw",
					new ExecutionContext((InternalPatternContext) ctx), callParameters);
			stringBuffer.setLength(0);
		}

		stringBuffer.append(TEXT_2);
		stringBuffer.append(TEXT_2);
		{
			//<%@ egf:patternCall patternId="platform:/plugin/org.polarsys.capella.docgen/egf/HTMLDocGenCapella.fcore#LogicalName=org.polarsys.capella.docgen.sections.abstractfunction.AbstractFunction_IncomingInteractions" args="parameter:parameter, projectName:projectNameParameter, outputFolder:outputFolderParameter, elementName:elementNameParameter, elementType:elementTypeParameter"%>

			InternalPatternContext ictx = (InternalPatternContext) ctx;
			new Node.DataLeaf(ictx.getNode(), getClass(), null, stringBuffer.toString());
			stringBuffer.setLength(0);

			final Map<String, Object> callParameters = new HashMap<String, Object>();
			callParameters.put("parameter", parameter);
			callParameters.put("projectNameParameter", projectName);
			callParameters.put("outputFolderParameter", outputFolder);
			callParameters.put("elementNameParameter", elementName);
			callParameters.put("elementTypeParameter", elementType);
			CallHelper.executeWithParameterInjection(
					"platform:/plugin/org.polarsys.capella.docgen/egf/HTMLDocGenCapella.fcore#_xJyEcKdWEeuJhsj8yYqhhw",
					new ExecutionContext((InternalPatternContext) ctx), callParameters);
			stringBuffer.setLength(0);
		}

		stringBuffer.append(TEXT_2);
		stringBuffer.append(TEXT_2);
		{
			//<%@ egf:patternCall patternId="platform:/plugin/org.polarsys.capella.docgen/egf/HTMLDocGenCapella.fcore#LogicalName=org.polarsys.capella.docgen.sections.abstractfunction.AbstractFunction_OutgoingInteractions" args="parameter:parameter, projectName:projectNameParameter, outputFolder:outputFolderParameter, elementName:elementNameParameter, elementType:elementTypeParameter"%>

			InternalPatternContext ictx = (InternalPatternContext) ctx;
			new Node.DataLeaf(ictx.getNode(), getClass(), null, stringBuffer.toString());
			stringBuffer.setLength(0);

			final Map<String, Object> callParameters = new HashMap<String, Object>();
			callParameters.put("parameter", parameter);
			callParameters.put("projectNameParameter", projectName);
			callParameters.put("outputFolderParameter", outputFolder);
			callParameters.put("elementNameParameter", elementName);
			callParameters.put("elementTypeParameter", elementType);
			CallHelper.executeWithParameterInjection(
					"platform:/plugin/org.polarsys.capella.docgen/egf/HTMLDocGenCapella.fcore#_Ln8lUKdXEeuJhsj8yYqhhw",
					new ExecutionContext((InternalPatternContext) ctx), callParameters);
			stringBuffer.setLength(0);
		}

		stringBuffer.append(TEXT_2);
		stringBuffer.append(TEXT_2);
		{
			//<%@ egf:patternCall patternId="platform:/plugin/org.polarsys.capella.docgen/egf/HTMLDocGenCapella.fcore#LogicalName=org.polarsys.capella.docgen.sections.abstractfunction.AbstractFunction_ModesAndStates" args="parameter:parameter, projectName:projectNameParameter, outputFolder:outputFolderParameter, elementName:elementNameParameter, elementType:elementTypeParameter"%>

			InternalPatternContext ictx = (InternalPatternContext) ctx;
			new Node.DataLeaf(ictx.getNode(), getClass(), null, stringBuffer.toString());
			stringBuffer.setLength(0);

			final Map<String, Object> callParameters = new HashMap<String, Object>();
			callParameters.put("parameter", parameter);
			callParameters.put("projectNameParameter", projectName);
			callParameters.put("outputFolderParameter", outputFolder);
			callParameters.put("elementNameParameter", elementName);
			callParameters.put("elementTypeParameter", elementType);
			CallHelper.executeWithParameterInjection(
					"platform:/plugin/org.polarsys.capella.docgen/egf/HTMLDocGenCapella.fcore#_5e5Q4Kc4EeuJhsj8yYqhhw",
					new ExecutionContext((InternalPatternContext) ctx), callParameters);
			stringBuffer.setLength(0);
		}

		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "content", stringBuffer.toString());
	}
}