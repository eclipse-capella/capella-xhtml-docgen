//Generated with EGF 1.5.1.v20180423-0901
package org.polarsys.capella.docgen.content;

import org.eclipse.egf.common.helper.*;
import java.util.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.egf.model.pattern.*;
import org.eclipse.egf.pattern.execution.*;
import org.eclipse.egf.pattern.query.*;
import org.polarsys.capella.core.data.fa.AbstractFunction;
import org.polarsys.capella.core.data.fa.FunctionalExchange;
import org.polarsys.capella.docgen.util.CapellaFunctionServices;
import org.polarsys.capella.docgen.util.StringUtil;
import org.polarsys.kitalpha.doc.gen.business.core.util.EscapeChars;
import org.polarsys.kitalpha.doc.gen.business.core.util.LabelProviderHelper;
import org.polarsys.capella.core.data.fa.FunctionalChain;
import org.polarsys.capella.docgen.util.pattern.helper.FunctionHelper;
import org.polarsys.capella.common.data.activity.InputPin;
import org.polarsys.capella.common.data.activity.OutputPin;
import org.eclipse.emf.common.util.EList;

public class AbstractFunctionDocGen extends org.polarsys.capella.docgen.foundations.NamedElementDocGen {
	protected static String nl;

	public static synchronized AbstractFunctionDocGen create(String lineSeparator) {
		nl = lineSeparator;
		AbstractFunctionDocGen result = new AbstractFunctionDocGen();
		nl = null;
		return result;
	}

	public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
	protected final String TEXT_1 = "<h2>Involving Functional Chains</h2>" + NL;
	protected final String TEXT_2 = NL;
	protected final String TEXT_3 = NL + "<h2>Allocating Component</h2>" + NL;
	protected final String TEXT_4 = NL;
	protected final String TEXT_5 = NL + "<h2>Incoming Functional Ports</h2>";
	protected final String TEXT_6 = NL;
	protected final String TEXT_7 = NL;
	protected final String TEXT_8 = NL + "<h2>Outgoing Functional Ports</h2>";
	protected final String TEXT_9 = NL;
	protected final String TEXT_10 = NL;
	protected final String TEXT_11 = NL + "    <h2>Incoming Internal Functional Exchanges</h2>" + NL + "    " + NL
			+ "    " + NL + "   <table>" + NL + "\t<tr>" + NL + "\t\t<th>Exchange</th>" + NL + "\t\t<th>Source</th>"
			+ NL + "\t\t<th>Target</th>" + NL + "\t\t<th>Description</th>" + NL
			+ "\t\t<th>Allocated Exchange Items</th>" + NL + "\t</tr>";
	protected final String TEXT_12 = NL + "\t";
	protected final String TEXT_13 = NL + "</table>";
	protected final String TEXT_14 = NL + " <h2>Outgoing Internal Functional Exchanges</h2>" + NL + "" + NL
			+ "    <table>" + NL + "\t<tr>" + NL + "\t\t<th>Exchange</th>" + NL + "\t\t<th>Source</th>" + NL
			+ "\t\t<th>Target</th>" + NL + "\t\t<th>Description</th>" + NL + "\t\t<th>Allocated Exchange Items</th>"
			+ NL + "\t</tr>";
	protected final String TEXT_15 = NL + "\t";
	protected final String TEXT_16 = NL + "</table>";
	protected final String TEXT_17 = NL + "<h2>Modes and States</h2>";
	protected final String TEXT_18 = NL;
	protected final String TEXT_19 = NL;
	protected final String TEXT_20 = NL;

	public AbstractFunctionDocGen() {
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

		stringBuffer.append(TEXT_19);
		stringBuffer.append(TEXT_20);
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

		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "setCapellaContext", stringBuffer.toString());
	}

	protected void method_content(final StringBuffer stringBuffer, final PatternContext ctx) throws Exception {

		super.method_content(new StringBuffer(), ctx);
		String elementName = EscapeChars.forHTML(LabelProviderHelper.getText(element));
		String elementType = EscapeChars.forHTML(element.eClass().getName());
		String projectName = ctx.getValue("projectName").toString();
		String outputFolder = ctx.getValue("outputFolder").toString();

		Collection<String> involvingFunctionalChains = FunctionHelper.getInvolvingFunctionalChains(projectName,
				outputFolder, (AbstractFunction) element);
		if (involvingFunctionalChains.size() > 0) {

			stringBuffer.append(TEXT_1);
			stringBuffer.append(TEXT_2);
			stringBuffer.append(StringUtil.stringListToBulette(involvingFunctionalChains));

		}

		Collection<String> allocatingComponents = FunctionHelper.getAllocatingComponents(projectName, outputFolder,
				(AbstractFunction) element);
		if (allocatingComponents.size() > 0) {

			stringBuffer.append(TEXT_3);
			stringBuffer.append(TEXT_4);
			stringBuffer.append(StringUtil.stringListToBulette(allocatingComponents));

		}

		EList<InputPin> incomingPorts = ((AbstractFunction) element).getInputs();
		if (incomingPorts.size() > 0) {

			stringBuffer.append(TEXT_5);
			stringBuffer.append(TEXT_6);
			stringBuffer.append(StringUtil.stringListToBulette(incomingPorts, projectName, outputFolder));
			stringBuffer.append(TEXT_7);

		}

		EList<OutputPin> outgoingPorts = ((AbstractFunction) element).getOutputs();
		if (outgoingPorts.size() > 0) {

			stringBuffer.append(TEXT_8);
			stringBuffer.append(TEXT_9);
			stringBuffer.append(StringUtil.stringListToBulette(outgoingPorts, projectName, outputFolder));
			stringBuffer.append(TEXT_10);

		}

		if (element instanceof AbstractFunction) {
			Collection<FunctionalExchange> incomingInteralFunctionalExchanges = CapellaFunctionServices
					.getIncomingInteralFunctionalExchanges((AbstractFunction) element);
			if (incomingInteralFunctionalExchanges.size() > 0) {

				stringBuffer.append(TEXT_11);
				for (FunctionalExchange functionalExchange : incomingInteralFunctionalExchanges) {
					stringBuffer.append(TEXT_12);
					stringBuffer.append(CapellaFunctionServices
							.externalFunctionalExchangeToTableLine(functionalExchange, projectName, outputFolder));
				}
				stringBuffer.append(TEXT_13);

			}
			Collection<FunctionalExchange> outgoingInteralFunctionalExchanges = CapellaFunctionServices
					.getOutgoingInteralFunctionalExchanges((AbstractFunction) element);
			if (outgoingInteralFunctionalExchanges.size() > 0) {

				stringBuffer.append(TEXT_14);
				for (FunctionalExchange functionalExchange : outgoingInteralFunctionalExchanges) {
					stringBuffer.append(TEXT_15);
					stringBuffer.append(CapellaFunctionServices
							.externalFunctionalExchangeToTableLine(functionalExchange, projectName, outputFolder));
				}
				stringBuffer.append(TEXT_16);

			}
		}

		Collection<String> availableModeAndState = CapellaFunctionServices.getAvailableModeAndState(projectName,
				outputFolder, (AbstractFunction) element);

		if (availableModeAndState.size() > 0) {

			stringBuffer.append(TEXT_17);
			stringBuffer.append(TEXT_18);
			stringBuffer.append(StringUtil.stringListToBulette(availableModeAndState));

		}

		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "content", stringBuffer.toString());
	}
}