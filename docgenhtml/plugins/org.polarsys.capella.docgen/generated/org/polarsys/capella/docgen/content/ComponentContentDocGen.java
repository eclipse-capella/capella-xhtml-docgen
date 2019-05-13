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

public class ComponentContentDocGen {
	protected static String nl;

	public static synchronized ComponentContentDocGen create(String lineSeparator) {
		nl = lineSeparator;
		ComponentContentDocGen result = new ComponentContentDocGen();
		nl = null;
		return result;
	}

	public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
	protected final String TEXT_1 = "\t<h2>Allocated Activites</h2>" + NL + "\t";
	protected final String TEXT_2 = NL + "<h2>Allocated Functions</h2>";
	protected final String TEXT_3 = NL;
	protected final String TEXT_4 = NL + "<h2>Implemented Interfaces</h2>";
	protected final String TEXT_5 = NL;
	protected final String TEXT_6 = NL + "<h2>Provided Interfaces</h2>";
	protected final String TEXT_7 = NL;
	protected final String TEXT_8 = NL + "<h2>Used Interfaces</h2>";
	protected final String TEXT_9 = NL;
	protected final String TEXT_10 = NL + "<h2>Required Interfaces</h2>";
	protected final String TEXT_11 = NL;
	protected final String TEXT_12 = NL + "<h2>Incoming Component Exchanges</h2>" + NL + "<table>" + NL + "\t<tr>" + NL
			+ "\t\t<th>Exchange</th>" + NL + "\t\t<th>Source</th>" + NL + "\t\t<th>Description</th>" + NL
			+ "\t\t<th>Allocated Functional Exchanges</th>" + NL + "\t\t<th>Allocated Exchange Items</th>" + NL
			+ "\t\t<th>Realized Component Exchanges</th>" + NL + "\t\t<th>Realizing Component Exchanges</th>" + NL
			+ "\t</tr>" + NL + "\t";
	protected final String TEXT_13 = NL + "\t";
	protected final String TEXT_14 = NL + "\t";
	protected final String TEXT_15 = NL + "</table>";
	protected final String TEXT_16 = NL + "<h2>Outgoing Component Exchanges</h2>" + NL + "<table>" + NL + "\t<tr>" + NL
			+ "\t\t<th>Exchange</th>" + NL + "\t\t<th>Target</th>" + NL + "\t\t<th>Description</th>" + NL
			+ "\t\t<th>Allocated Functional Exchanges</th>" + NL + "\t\t<th>Allocated Exchange Items</th>" + NL
			+ "\t\t<th>Realized Component Exchanges</th>" + NL + "\t\t<th>Realizing Component Exchanges</th>" + NL
			+ "\t</tr>" + NL + "\t";
	protected final String TEXT_17 = NL + "\t";
	protected final String TEXT_18 = NL + "\t";
	protected final String TEXT_19 = NL + "</table>";
	protected final String TEXT_20 = NL + "<h2>In/Out Component Exchanges</h2>" + NL + "<table>" + NL + "\t<tr>" + NL
			+ "\t\t<th>Exchange</th>" + NL + "\t\t<th>Target</th>" + NL + "\t\t<th>Description</th>" + NL
			+ "\t\t<th>Allocated Functional Exchanges</th>" + NL + "\t\t<th>Allocated Exchange Items</th>" + NL
			+ "\t\t<th>Realized Component Exchanges</th>" + NL + "\t\t<th>Realizing Component Exchanges</th>" + NL
			+ "\t</tr>" + NL + "\t";
	protected final String TEXT_21 = NL + "\t";
	protected final String TEXT_22 = NL + "\t";
	protected final String TEXT_23 = NL + "</table>";
	protected final String TEXT_24 = NL + "<h2>Ports</h2>";
	protected final String TEXT_25 = NL;
	protected final String TEXT_26 = NL + "<h2>State Machines</h2>";
	protected final String TEXT_27 = NL;
	protected final String TEXT_28 = NL;
	protected final String TEXT_29 = NL;
	protected final String TEXT_30 = NL;

	public ComponentContentDocGen() {
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
		List<Object> projectNameList = null;
		//this pattern can only be called by another (i.e. it's not an entry point in execution)
		List<Object> outputFolderList = null;
		//this pattern can only be called by another (i.e. it's not an entry point in execution)

		for (Object elementParameter : elementList) {
			for (Object projectNameParameter : projectNameList) {
				for (Object outputFolderParameter : outputFolderList) {

					this.element = (org.polarsys.capella.core.data.capellacore.CapellaElement) elementParameter;
					this.projectName = (java.lang.String) projectNameParameter;
					this.outputFolder = (java.lang.String) outputFolderParameter;

					if (preCondition(ctx)) {
						ctx.setNode(new Node.Container(currentNode, getClass()));
						orchestration(ctx);
					}

				}
			}
		}
		ctx.setNode(currentNode);
		if (ctx.useReporter()) {
			ctx.getReporter().executionFinished(OutputManager.computeExecutionOutput(ctx), ctx);
		}

		stringBuffer.append(TEXT_29);
		stringBuffer.append(TEXT_30);
		return stringBuffer.toString();
	}

	public String orchestration(PatternContext ctx) throws Exception {
		InternalPatternContext ictx = (InternalPatternContext) ctx;

		method_body(new StringBuffer(), ictx);

		if (ictx.useReporter()) {
			Map<String, Object> parameterValues = new HashMap<String, Object>();
			parameterValues.put("element", this.element);
			parameterValues.put("projectName", this.projectName);
			parameterValues.put("outputFolder", this.outputFolder);
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

	protected java.lang.String projectName = null;

	public void set_projectName(java.lang.String object) {
		this.projectName = object;
	}

	protected java.lang.String outputFolder = null;

	public void set_outputFolder(java.lang.String object) {
		this.outputFolder = object;
	}

	public Map<String, Object> getParameters() {
		final Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("element", this.element);
		parameters.put("projectName", this.projectName);
		parameters.put("outputFolder", this.outputFolder);
		return parameters;
	}

	protected void method_body(final StringBuffer stringBuffer, final PatternContext ctx) throws Exception {

		String elementName = EscapeChars.forHTML(LabelProviderHelper.getText(element));
		String elementType = EscapeChars.forHTML(element.eClass().getName());
		Collection<String> allocatedFunctionsInformations = CapellaComponentServices
				.getAllocatedFunctionsInformation((Component) element, projectName, outputFolder);
		if (allocatedFunctionsInformations.size() > 0) {
			if (element instanceof Entity) {

				stringBuffer.append(TEXT_1);

			} else {

				stringBuffer.append(TEXT_2);

			}

			stringBuffer.append(TEXT_3);
			stringBuffer.append(StringUtil.stringListToBulette(allocatedFunctionsInformations));

		}
		Collection<String> implementedInterfaces = CapellaComponentServices
				.getImplementedInterfaces((Component) element, projectName, outputFolder);
		if (implementedInterfaces.size() > 0) {
			stringBuffer.append(TEXT_4);
			stringBuffer.append(TEXT_5);
			stringBuffer.append(StringUtil.stringListToBulette(implementedInterfaces));

		}

		Collection<String> providedInterfaces = CapellaComponentServices.getProvidedInterfaces((Component) element,
				projectName, outputFolder);
		if (providedInterfaces.size() > 0) {
			stringBuffer.append(TEXT_6);
			stringBuffer.append(TEXT_7);
			stringBuffer.append(StringUtil.stringListToBulette(providedInterfaces));

		}

		Collection<String> usedInterfaces = CapellaComponentServices.getUsedInterfaces((Component) element, projectName,
				outputFolder);
		if (usedInterfaces.size() > 0) {
			stringBuffer.append(TEXT_8);
			stringBuffer.append(TEXT_9);
			stringBuffer.append(StringUtil.stringListToBulette(usedInterfaces));

		}

		Collection<String> requiredInterfaces = CapellaComponentServices.getRequiredInterfaces((Component) element,
				projectName, outputFolder);
		if (requiredInterfaces.size() > 0) {
			stringBuffer.append(TEXT_10);
			stringBuffer.append(TEXT_11);
			stringBuffer.append(StringUtil.stringListToBulette(requiredInterfaces));

		}

		Collection<ComponentExchange> incomingComponentExchanges = CapellaComponentServices
				.getIncomingComponentExchanges((Component) element);
		if (incomingComponentExchanges.size() > 0) {

			stringBuffer.append(TEXT_12);
			for (ComponentExchange componentExchange : incomingComponentExchanges) {

				stringBuffer.append(TEXT_13);
				stringBuffer.append(CapellaComponentServices.componentExchangeToTableLine((Component) element,
						componentExchange, projectName, outputFolder));
				stringBuffer.append(TEXT_14);

			}
			stringBuffer.append(TEXT_15);

		}
		Collection<ComponentExchange> outgoingComponentExchanges = CapellaComponentServices
				.getOutgoingComponentExchanges((Component) element);
		if (outgoingComponentExchanges.size() > 0) {

			stringBuffer.append(TEXT_16);
			for (ComponentExchange componentExchange : outgoingComponentExchanges) {

				stringBuffer.append(TEXT_17);
				stringBuffer.append(CapellaComponentServices.componentExchangeToTableLine((Component) element,
						componentExchange, projectName, outputFolder));
				stringBuffer.append(TEXT_18);

			}
			stringBuffer.append(TEXT_19);

		}

		Collection<ComponentExchange> inoutComponentExchanges = CapellaComponentServices
				.getInOutComponentExchanges((Component) element);
		if (inoutComponentExchanges.size() > 0) {

			stringBuffer.append(TEXT_20);
			for (ComponentExchange componentExchange : inoutComponentExchanges) {

				stringBuffer.append(TEXT_21);
				stringBuffer.append(CapellaComponentServices.componentExchangeToTableLine((Component) element,
						componentExchange, projectName, outputFolder));
				stringBuffer.append(TEXT_22);

			}
			stringBuffer.append(TEXT_23);

		}

		Collection<String> ports = CapellaComponentServices.getPorts((Component) element, projectName, outputFolder);
		if (ports.size() > 0) {
			stringBuffer.append(TEXT_24);
			stringBuffer.append(TEXT_25);
			stringBuffer.append(StringUtil.stringListToBulette(ports));
		}

		Collection<String> stateMachines = BlockHelper.getStateMachine(projectName, outputFolder, (Component) element);
		if (stateMachines.size() > 0) {
			stringBuffer.append(TEXT_26);
			stringBuffer.append(TEXT_27);
			stringBuffer.append(StringUtil.stringListToBulette(stateMachines));
		}

		stringBuffer.append(TEXT_28);
		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "body", stringBuffer.toString());
	}

	public boolean preCondition(PatternContext ctx) throws Exception {
		return true;
	}
}