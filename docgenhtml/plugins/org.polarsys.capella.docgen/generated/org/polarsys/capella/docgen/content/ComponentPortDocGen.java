//Generated with EGF 1.5.1.v20180423-0901
package org.polarsys.capella.docgen.content;

import org.eclipse.egf.common.helper.*;
import java.util.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.egf.model.pattern.*;
import org.eclipse.egf.pattern.execution.*;
import org.eclipse.egf.pattern.query.*;
import org.polarsys.capella.core.data.cs.Component;
import org.polarsys.capella.core.data.fa.ComponentExchange;
import org.polarsys.capella.docgen.util.CapellaComponentServices;
import org.polarsys.capella.docgen.util.StringUtil;
import org.polarsys.capella.docgen.util.pattern.helper.BlockHelper;
import org.polarsys.kitalpha.doc.gen.business.core.util.EscapeChars;
import org.polarsys.kitalpha.doc.gen.business.core.util.LabelProviderHelper;
import org.polarsys.capella.core.data.oa.Entity;
import org.polarsys.capella.docgen.util.pattern.helper.CapellaComponentPortHelper;
import org.polarsys.capella.core.data.fa.ComponentPort;

public class ComponentPortDocGen extends org.polarsys.capella.docgen.foundations.NamedElementDocGen {
	protected static String nl;

	public static synchronized ComponentPortDocGen create(String lineSeparator) {
		nl = lineSeparator;
		ComponentPortDocGen result = new ComponentPortDocGen();
		nl = null;
		return result;
	}

	public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
	protected final String TEXT_1 = "";
	protected final String TEXT_2 = NL + "<h2>Provided Interfaces</h2>";
	protected final String TEXT_3 = NL;
	protected final String TEXT_4 = NL + "<h2>Required Interfaces</h2>";
	protected final String TEXT_5 = NL;
	protected final String TEXT_6 = NL + "<h2>Component Exchanges</h2>" + NL + "" + NL + "<table>" + NL + "\t<tr>" + NL
			+ "\t\t<th>Exchange</th>" + NL + "\t\t<th>Opposite Port</th>" + NL + "\t\t<th>Opposite Component</th>" + NL
			+ "\t\t<th>Description</th>" + NL + "\t</tr>" + NL + "\t";
	protected final String TEXT_7 = NL + "\t";
	protected final String TEXT_8 = NL + "\t";
	protected final String TEXT_9 = NL + "</table>";
	protected final String TEXT_10 = NL + "<h2>Component Delegations</h2>" + NL + "" + NL + "<table>" + NL + "\t<tr>"
			+ NL + "\t\t<th>Delegation</th>" + NL + "\t\t<th>Opposite Port</th>" + NL
			+ "\t\t<th>Opposite Component</th>" + NL + "\t\t<th>Description</th>" + NL + "\t</tr>" + NL + "\t";
	protected final String TEXT_11 = NL + "\t";
	protected final String TEXT_12 = NL + "\t";
	protected final String TEXT_13 = NL + "</table>";
	protected final String TEXT_14 = NL;
	protected final String TEXT_15 = NL;

	public ComponentPortDocGen() {
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

			this.parameter = (org.polarsys.capella.core.data.fa.ComponentPort) parameterParameter;

			if (preCondition(ctx)) {
				ctx.setNode(new Node.Container(currentNode, getClass()));
				orchestration(ctx);
			}

		}
		ctx.setNode(currentNode);
		if (ctx.useReporter()) {
			ctx.getReporter().executionFinished(OutputManager.computeExecutionOutput(ctx), ctx);
		}

		stringBuffer.append(TEXT_14);
		stringBuffer.append(TEXT_15);
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

	protected org.polarsys.capella.core.data.fa.ComponentPort parameter = null;

	public void set_parameter(org.polarsys.capella.core.data.fa.ComponentPort object) {
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

		stringBuffer.append(TEXT_1);

		Map<String, String> providedInterfaces = CapellaComponentPortHelper.getProvidedInterfaces(parameter,
				projectName, outputFolder);
		if (providedInterfaces.size() > 0) {

			stringBuffer.append(TEXT_2);
			stringBuffer.append(TEXT_3);
			stringBuffer.append(StringUtil.mapToHTMLTable(providedInterfaces, "Interface", "Exchange Items"));

		}
		Map<String, String> requiredInterfaces = CapellaComponentPortHelper.getRequiredInterfaces(parameter,
				projectName, outputFolder);
		if (requiredInterfaces.size() > 0) {
			stringBuffer.append(TEXT_4);
			stringBuffer.append(TEXT_5);
			stringBuffer.append(StringUtil.mapToHTMLTable(requiredInterfaces, "Interface", "Exchange Items"));

		}
		Collection<ComponentExchange> componentExchanges = CapellaComponentPortHelper
				.getComponentPortExchanges(parameter, projectName, outputFolder);
		if (componentExchanges.size() > 0) {

			stringBuffer.append(TEXT_6);
			for (ComponentExchange componentExchange : componentExchanges) {
				stringBuffer.append(TEXT_7);
				stringBuffer.append(CapellaComponentPortHelper.componentExchangeToTableLine(parameter,
						componentExchange, projectName, outputFolder));
				stringBuffer.append(TEXT_8);

			}
			stringBuffer.append(TEXT_9);

		}
		Collection<ComponentExchange> componentDelegations = CapellaComponentPortHelper
				.getComponentPortDelegations(parameter, projectName, outputFolder);
		if (componentDelegations.size() > 0) {

			stringBuffer.append(TEXT_10);
			for (ComponentExchange componentDelegation : componentDelegations) {
				stringBuffer.append(TEXT_11);
				stringBuffer.append(CapellaComponentPortHelper.componentExchangeToTableLine(parameter,
						componentDelegation, projectName, outputFolder));
				stringBuffer.append(TEXT_12);

			}
			stringBuffer.append(TEXT_13);

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