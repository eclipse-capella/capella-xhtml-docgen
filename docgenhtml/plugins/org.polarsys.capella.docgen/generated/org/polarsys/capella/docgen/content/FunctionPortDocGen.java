//Generated with EGF 1.6.4.202309201142
package org.polarsys.capella.docgen.content;

import org.eclipse.egf.common.helper.*;
import java.util.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.egf.model.pattern.*;
import org.eclipse.egf.pattern.execution.*;
import org.eclipse.egf.pattern.query.*;
import org.polarsys.capella.core.data.fa.FunctionalExchange;
import org.polarsys.capella.docgen.util.CapellaFunctionServices;
import org.polarsys.capella.docgen.util.CapellaFunctionPortServices;
import org.polarsys.capella.core.data.fa.FunctionPort;

public class FunctionPortDocGen extends org.polarsys.capella.docgen.foundations.NamedElementDocGen {
	protected static String nl;

	public static synchronized FunctionPortDocGen create(String lineSeparator) {
		nl = lineSeparator;
		FunctionPortDocGen result = new FunctionPortDocGen();
		nl = null;
		return result;
	}

	public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
	protected final String TEXT_1 = "<h2>Incoming Functional Exchanges</h2>" + NL + "" + NL + "<table>" + NL + "\t<tr>"
			+ NL + "\t\t<th>Exchange</th>" + NL + "\t\t<th>Involving Functional Chains</th>" + NL
			+ "\t\t<th>Allocating Component Exchanges</th>" + NL + "\t\t<th>Source Port</th>" + NL
			+ "\t\t<th>Source Function</th>" + NL + "\t\t<th>Description</th>" + NL
			+ "\t\t<th>Allocated Exchange Items</th>" + NL + "\t\t<th>Realized Functional Exchanges</th>" + NL
			+ "\t\t<th>Realizing Functional Exchanges</th>" + NL + "\t</tr>";
	protected final String TEXT_2 = NL + "\t";
	protected final String TEXT_3 = NL + "</table>";
	protected final String TEXT_4 = NL + " <h2>Outgoing Functional Exchanges</h2>" + NL + "" + NL + "    <table>" + NL
			+ "\t<tr>" + NL + "\t\t<th>Exchange</th>" + NL + "\t\t<th>Involving Functional Chains</th>" + NL
			+ "\t\t<th>Allocating Component Exchanges</th>" + NL + "\t\t<th>Target Port</th>" + NL
			+ "\t\t<th>Target Function</th>" + NL + "\t\t<th>Description</th>" + NL
			+ "\t\t<th>Allocated Exchange Items</th>" + NL + "\t\t<th>Realized Functional Exchanges</th>" + NL
			+ "\t\t<th>Realizing Functional Exchanges</th>" + NL + "\t</tr>";
	protected final String TEXT_5 = NL;

	public FunctionPortDocGen() {
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

			this.parameter = (org.polarsys.capella.core.data.fa.FunctionPort) parameterParameter;

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
		stringBuffer.append(TEXT_5);
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

	protected org.polarsys.capella.core.data.fa.FunctionPort parameter = null;

	public void set_parameter(org.polarsys.capella.core.data.fa.FunctionPort object) {
		this.parameter = object;
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

		Collection<FunctionalExchange> incomingFunctionalExchanges = CapellaFunctionPortServices
				.getIncomingFunctionalExchanges((FunctionPort) element);
		if (incomingFunctionalExchanges.size() > 0) {

			stringBuffer.append(TEXT_1);
			for (FunctionalExchange functionalExchange : incomingFunctionalExchanges) {

				stringBuffer.append(TEXT_2);
				stringBuffer.append(CapellaFunctionServices.incomingFunctionalExchangeToTableLine(functionalExchange,
						projectName, outputFolder));
				stringBuffer.append(TEXT_2);

			}
			stringBuffer.append(TEXT_3);

		}

		Collection<FunctionalExchange> outgoingFunctionalExchanges = CapellaFunctionPortServices
				.getOutgoingFunctionalExchanges((FunctionPort) element);
		if (outgoingFunctionalExchanges.size() > 0) {

			stringBuffer.append(TEXT_4);
			for (FunctionalExchange functionalExchange : outgoingFunctionalExchanges) {
				stringBuffer.append(TEXT_2);
				stringBuffer.append(CapellaFunctionServices.outgoingFunctionalExchangeToTableLine(functionalExchange,
						projectName, outputFolder));
			}
			stringBuffer.append(TEXT_3);

		}

		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "content", stringBuffer.toString());
	}

	protected void method_setCapellaContext(final StringBuffer stringBuffer, final PatternContext ctx)
			throws Exception {

		element = parameter;

		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "setCapellaContext", stringBuffer.toString());
	}
}