//Generated with EGF 1.5.1.v20180423-0901
package org.polarsys.capella.docgen.content;

import org.eclipse.egf.common.helper.*;
import java.util.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.egf.model.pattern.*;
import org.eclipse.egf.pattern.execution.*;
import org.eclipse.egf.pattern.query.*;
import org.polarsys.capella.docgen.util.CapellaServices;
import org.polarsys.capella.docgen.util.StringUtil;
import org.polarsys.capella.docgen.util.pattern.helper.CapellaInterfaceHelper;
import org.polarsys.capella.core.data.capellacore.VisibilityKind;
import org.polarsys.capella.core.data.cs.Interface;

public class InterfaceDocGen extends org.polarsys.capella.docgen.content.ClassifierDocGen {
	protected static String nl;

	public static synchronized InterfaceDocGen create(String lineSeparator) {
		nl = lineSeparator;
		InterfaceDocGen result = new InterfaceDocGen();
		nl = null;
		return result;
	}

	public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
	protected final String TEXT_1 = "<h2>Usage</h2>";
	protected final String TEXT_2 = NL + "\t <h3>Provided by</h3>" + NL + " \t";
	protected final String TEXT_3 = NL + "\t <h3>Implemented by</h3>" + NL + " \t";
	protected final String TEXT_4 = NL + " \t<h3>Required by</h3>" + NL + " \t";
	protected final String TEXT_5 = NL + "\t <h3>Used by</h3>" + NL + " \t";
	protected final String TEXT_6 = NL + "<h2>Operations</h2>";
	protected final String TEXT_7 = NL;
	protected final String TEXT_8 = NL;
	protected final String TEXT_9 = NL + "<h2> Flow </h2>";
	protected final String TEXT_10 = NL;
	protected final String TEXT_11 = NL;
	protected final String TEXT_12 = NL + "<h2>Shared Data</h2>";
	protected final String TEXT_13 = NL;
	protected final String TEXT_14 = NL;
	protected final String TEXT_15 = NL + "<h2>Events</h2>";
	protected final String TEXT_16 = NL;
	protected final String TEXT_17 = NL;
	protected final String TEXT_18 = NL + "<h2>Unset Exchange Items</h2>";
	protected final String TEXT_19 = NL;
	protected final String TEXT_20 = NL;
	protected final String TEXT_21 = NL;

	public InterfaceDocGen() {
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

			this.parameter = (org.polarsys.capella.core.data.capellacore.GeneralizableElement) parameterParameter;

			if (preCondition(ctx)) {
				ctx.setNode(new Node.Container(currentNode, getClass()));
				orchestration(ctx);
			}

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

	protected void method_setTitle(final StringBuffer stringBuffer, final PatternContext ctx) throws Exception {

		String visibility = "";
		if (((Interface) element).getVisibility().getValue() != VisibilityKind.UNSET_VALUE)
			visibility = "{" + ((Interface) element).getVisibility().getLiteral().toLowerCase() + "} ";
		String type = element.eClass().getName();
		String elementFullName = CapellaServices.getFullDataPkgHierarchyLink(element);
		documentTitle = "<span class=\"elementMetaClass\">" + visibility + "</span> " + elementFullName;

		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "setTitle", stringBuffer.toString());
	}

	protected void method_content(final StringBuffer stringBuffer, final PatternContext ctx) throws Exception {

		super.method_content(new StringBuffer(), ctx);
		String projectName = ctx.getValue("projectName").toString();
		String outputFolder = ctx.getValue("outputFolder").toString();

		Collection<String> providedComponents = CapellaInterfaceHelper.getProvidedBy((Interface) element, projectName,
				outputFolder);

		Collection<String> implementedComponents = CapellaInterfaceHelper.getImplementedBy((Interface) element,
				projectName, outputFolder);

		Collection<String> requiredComponents = CapellaInterfaceHelper.getRequiredBy((Interface) element, projectName,
				outputFolder);

		Collection<String> usedComponents = CapellaInterfaceHelper.getUsedBy((Interface) element, projectName,
				outputFolder);

		if (providedComponents.size() > 0 || implementedComponents.size() > 0 || requiredComponents.size() > 0
				|| usedComponents.size() > 0) {

			stringBuffer.append(TEXT_1);

			if (providedComponents.size() > 0) {
				stringBuffer.append(TEXT_2);
				stringBuffer.append(StringUtil.stringListToBulette(providedComponents));
			}

			if (implementedComponents.size() > 0) {
				stringBuffer.append(TEXT_3);
				stringBuffer.append(StringUtil.stringListToBulette(implementedComponents));
			}

			if (requiredComponents.size() > 0) {
				stringBuffer.append(TEXT_4);
				stringBuffer.append(StringUtil.stringListToBulette(requiredComponents));
			}

			if (usedComponents.size() > 0) {
				stringBuffer.append(TEXT_5);
				stringBuffer.append(StringUtil.stringListToBulette(usedComponents));
			}
		}

		Collection<String> operationExchangeItems = CapellaInterfaceHelper
				.getOperationExchangeItems((Interface) element, projectName, outputFolder);
		if (operationExchangeItems.size() > 0) {

			stringBuffer.append(TEXT_6);
			stringBuffer.append(TEXT_7);
			stringBuffer.append(StringUtil.stringListToBulette(operationExchangeItems));
		}
		stringBuffer.append(TEXT_8);
		Collection<String> sharedFlowExchangeItems = CapellaInterfaceHelper.getFlowExchangeItems((Interface) element,
				projectName, outputFolder);
		if (sharedFlowExchangeItems.size() > 0) {

			stringBuffer.append(TEXT_9);
			stringBuffer.append(TEXT_10);
			stringBuffer.append(StringUtil.stringListToBulette(sharedFlowExchangeItems));
		}
		stringBuffer.append(TEXT_11);
		Collection<String> sharedDataExchangeItems = CapellaInterfaceHelper
				.getSharedDataExchangeItems((Interface) element, projectName, outputFolder);
		if (sharedDataExchangeItems.size() > 0) {

			stringBuffer.append(TEXT_12);
			stringBuffer.append(TEXT_13);
			stringBuffer.append(StringUtil.stringListToBulette(sharedDataExchangeItems));
		}
		stringBuffer.append(TEXT_14);
		Collection<String> eventExchangeItems = CapellaInterfaceHelper.getEventExchangeItems((Interface) element,
				projectName, outputFolder);
		if (eventExchangeItems.size() > 0) {

			stringBuffer.append(TEXT_15);
			stringBuffer.append(TEXT_16);
			stringBuffer.append(StringUtil.stringListToBulette(eventExchangeItems));
		}
		stringBuffer.append(TEXT_17);
		Collection<String> unsetExchangeItems = CapellaInterfaceHelper.getUnsetExchangeItems((Interface) element,
				projectName, outputFolder);
		if (unsetExchangeItems.size() > 0) {

			stringBuffer.append(TEXT_18);
			stringBuffer.append(TEXT_19);
			stringBuffer.append(StringUtil.stringListToBulette(unsetExchangeItems));
		}
		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "content", stringBuffer.toString());
	}

	public boolean preCondition(PatternContext ctx) throws Exception {
		return (this.parameter instanceof Interface);
	}
}