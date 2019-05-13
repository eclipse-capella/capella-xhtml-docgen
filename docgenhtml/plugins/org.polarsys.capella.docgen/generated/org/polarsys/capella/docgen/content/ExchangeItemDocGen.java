//Generated with EGF 1.5.1.v20180423-0901
package org.polarsys.capella.docgen.content;

import org.eclipse.egf.common.helper.*;
import java.util.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.egf.model.pattern.*;
import org.eclipse.egf.pattern.execution.*;
import org.eclipse.egf.pattern.query.*;
import org.polarsys.capella.core.data.information.ExchangeItem;
import org.polarsys.capella.docgen.util.CapellaElementService;
import org.polarsys.capella.docgen.util.CapellaServices;
import org.polarsys.capella.docgen.util.StringUtil;
import org.polarsys.capella.docgen.util.pattern.helper.CapellaExchangeItemHelper;

public class ExchangeItemDocGen extends org.polarsys.capella.docgen.foundations.NamedElementDocGen {
	protected static String nl;

	public static synchronized ExchangeItemDocGen create(String lineSeparator) {
		nl = lineSeparator;
		ExchangeItemDocGen result = new ExchangeItemDocGen();
		nl = null;
		return result;
	}

	public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
	protected final String TEXT_1 = "<h2>Involving Functional Chains</h2>";
	protected final String TEXT_2 = NL;
	protected final String TEXT_3 = NL + "\t\t\t<h2>Interfaces</h2>" + NL + "\t\t\t";
	protected final String TEXT_4 = NL + "\t\t";
	protected final String TEXT_5 = NL + "\t\t\t<h2>Exchange Item Elements</h2>" + NL + "\t\t\t";
	protected final String TEXT_6 = NL + "\t\t";
	protected final String TEXT_7 = NL + "\t<h2>Functional Exchanges</h2>" + NL + "\t";
	protected final String TEXT_8 = NL + "<div title=\"Properties Value\">";
	protected final String TEXT_9 = NL;
	protected final String TEXT_10 = NL;
	protected final String TEXT_11 = NL + "</div>";
	protected final String TEXT_12 = NL;
	protected final String TEXT_13 = NL;

	public ExchangeItemDocGen() {
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

			this.parameter = (org.polarsys.capella.core.data.information.ExchangeItem) parameterParameter;

			if (preCondition(ctx)) {
				ctx.setNode(new Node.Container(currentNode, getClass()));
				orchestration(ctx);
			}

		}
		ctx.setNode(currentNode);
		if (ctx.useReporter()) {
			ctx.getReporter().executionFinished(OutputManager.computeExecutionOutput(ctx), ctx);
		}

		stringBuffer.append(TEXT_12);
		stringBuffer.append(TEXT_13);
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

	protected org.polarsys.capella.core.data.information.ExchangeItem parameter = null;

	public void set_parameter(org.polarsys.capella.core.data.information.ExchangeItem object) {
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
		String projectName = ctx.getValue("projectName").toString();
		String outputFolder = ctx.getValue("outputFolder").toString();

		Collection<String> involvingFunctionalChains = CapellaExchangeItemHelper
				.getInvolvingFunctionalChains((ExchangeItem) element, projectName, outputFolder);
		if (involvingFunctionalChains.size() > 0) {
			stringBuffer.append(TEXT_1);
			stringBuffer.append(TEXT_2);
			stringBuffer.append(StringUtil.stringListToBulette(involvingFunctionalChains));
		}

		Collection<String> exchangeItemInterfaces = CapellaExchangeItemHelper
				.getExchangeItemInterfaces((ExchangeItem) element, projectName, outputFolder);

		if (exchangeItemInterfaces.size() > 0) {
			stringBuffer.append(TEXT_3);
			stringBuffer.append(StringUtil.stringListToBulette(exchangeItemInterfaces));
			stringBuffer.append(TEXT_4);
		}

		Collection<String> exchangeItemElements = CapellaExchangeItemHelper
				.getExchangeItemElements((ExchangeItem) element, projectName, outputFolder);
		if (exchangeItemElements.size() > 0) {
			stringBuffer.append(TEXT_5);
			stringBuffer.append(StringUtil.stringListToBulette(exchangeItemElements));
			stringBuffer.append(TEXT_6);
		}

		Collection<String> referencingExchanges = CapellaExchangeItemHelper
				.getReferencingFunctionalExchanges((ExchangeItem) element, projectName, outputFolder);
		if (referencingExchanges.size() > 0) {
			stringBuffer.append(TEXT_7);
			stringBuffer.append(StringUtil.stringListToBulette(referencingExchanges));
		}

		Collection<String> propertiesValueCollection = CapellaElementService.getPropertiesValue(element, projectName,
				outputFolder);
		if (propertiesValueCollection.size() >= 1) {
			stringBuffer.append(TEXT_8);
			String propertyValue = "Properties Value";
			stringBuffer.append(TEXT_9);
			{
				//<%@ egf:patternCall patternId="platform:/plugin/org.polarsys.kitalpha.doc.gen.business.core/egf/HTMLDocGenCommon.fcore#LogicalName=org.polarsys.kitalpha.doc.gen.business.core.generic.ElementGenerateByPropterty" args="element:eObject,propertyValue:property"%>

				InternalPatternContext ictx = (InternalPatternContext) ctx;
				new Node.DataLeaf(ictx.getNode(), getClass(), null, stringBuffer.toString());
				stringBuffer.setLength(0);

				final Map<String, Object> callParameters = new HashMap<String, Object>();
				callParameters.put("eObject", element);
				callParameters.put("property", propertyValue);
				CallHelper.executeWithParameterInjection(
						"platform:/plugin/org.polarsys.kitalpha.doc.gen.business.core/egf/HTMLDocGenCommon.fcore#_cWGxMONUEd-euK0PeLuaMA",
						new ExecutionContext((InternalPatternContext) ctx), callParameters);
				stringBuffer.setLength(0);
			}

			stringBuffer.append(TEXT_10);
			stringBuffer.append(StringUtil.stringListToBulette(propertiesValueCollection));
			stringBuffer.append(TEXT_11);
		}
		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "content", stringBuffer.toString());
	}

	protected void method_setTitle(final StringBuffer stringBuffer, final PatternContext ctx) throws Exception {

		String mecanism = ((ExchangeItem) element).getExchangeMechanism().getName();
		String elementName = CapellaServices.getHyperlinkFromElement(element);
		//String elementType = EscapeChars.forHTML(element.eClass().getName());
		documentTitle = "<span class=\"elementMetaClass\">" + mecanism + "</span> " + elementName;

		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "setTitle", stringBuffer.toString());
	}
}