//Generated with EGF 1.5.1.v20180423-0901
package org.polarsys.capella.docgen.content;

import org.polarsys.capella.docgen.util.CapellaCategoryServices;
import org.polarsys.capella.core.data.cs.PhysicalLink;
import org.polarsys.capella.core.data.cs.PhysicalLinkCategory;
import org.polarsys.capella.core.data.fa.ComponentExchange;
import org.polarsys.capella.core.data.fa.FunctionalExchange;
import org.polarsys.capella.core.data.fa.ExchangeCategory;
import org.polarsys.capella.core.data.fa.ComponentExchangeCategory;
import org.eclipse.egf.common.helper.*;
import java.util.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.egf.model.pattern.*;
import org.eclipse.egf.pattern.execution.*;
import org.eclipse.egf.pattern.query.*;

public class CategoriesDocGen extends org.polarsys.capella.docgen.foundations.NamedElementDocGen {
	protected static String nl;

	public static synchronized CategoriesDocGen create(String lineSeparator) {
		nl = lineSeparator;
		CategoriesDocGen result = new CategoriesDocGen();
		nl = null;
		return result;
	}

	public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
	protected final String TEXT_1 = "\t\t<h2>Involved Functional Exchanges</h2>" + NL + "\t\t";
	protected final String TEXT_2 = NL + "\t\t<table>" + NL + "\t\t\t<tr>" + NL + "\t\t\t\t<th>Functional Exchange</th>"
			+ NL + "\t\t\t\t<th>Source Function</th>" + NL + "\t\t\t\t<th>Target Function</th>" + NL
			+ "\t\t\t\t<th>Description</th>" + NL + "\t\t\t</tr>" + NL + "\t\t";
	protected final String TEXT_3 = NL + "\t\t\t";
	protected final String TEXT_4 = NL + "\t\t\t";
	protected final String TEXT_5 = NL + "\t\t</table>" + NL + "\t\t";
	protected final String TEXT_6 = NL + "\t\t<h2>Involved Component Exchanges</h2>" + NL + "\t\t";
	protected final String TEXT_7 = NL + "\t\t<table>" + NL + "\t\t\t<tr>" + NL + "\t\t\t\t<th>Component Exchange</th>"
			+ NL + "\t\t\t\t<th>Source Component</th>" + NL + "\t\t\t\t<th>Target Component</th>" + NL
			+ "\t\t\t\t<th>Description</th>" + NL + "\t\t\t</tr>" + NL + "\t\t";
	protected final String TEXT_8 = NL + "\t\t\t";
	protected final String TEXT_9 = NL + "\t\t\t";
	protected final String TEXT_10 = NL + "\t\t</table>" + NL + "\t\t";
	protected final String TEXT_11 = NL + "\t\t<h2>Involved Physical Links</h2>" + NL + "\t\t";
	protected final String TEXT_12 = NL + "\t\t<table>" + NL + "\t\t\t<tr>" + NL + "\t\t\t\t<th>Physical Link</th>" + NL
			+ "\t\t\t\t<th>Source Component</th>" + NL + "\t\t\t\t<th>Target Component</th>" + NL
			+ "\t\t\t\t<th>Description</th>" + NL + "\t\t\t</tr>" + NL + "\t\t";
	protected final String TEXT_13 = NL + "\t\t\t";
	protected final String TEXT_14 = NL + "\t\t\t";
	protected final String TEXT_15 = NL + "\t\t</table>" + NL + "\t\t";
	protected final String TEXT_16 = NL;
	protected final String TEXT_17 = NL;

	public CategoriesDocGen() {
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

			this.parameter = (org.polarsys.capella.core.data.capellacore.NamedElement) parameterParameter;

			if (preCondition(ctx)) {
				ctx.setNode(new Node.Container(currentNode, getClass()));
				orchestration(ctx);
			}

		}
		ctx.setNode(currentNode);
		if (ctx.useReporter()) {
			ctx.getReporter().executionFinished(OutputManager.computeExecutionOutput(ctx), ctx);
		}

		stringBuffer.append(TEXT_16);
		stringBuffer.append(TEXT_17);
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

	protected org.polarsys.capella.core.data.capellacore.NamedElement parameter = null;

	public void set_parameter(org.polarsys.capella.core.data.capellacore.NamedElement object) {
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

		// Exchange Categories
		if (element instanceof ExchangeCategory) {
			ExchangeCategory category = (ExchangeCategory) element;
			if (category.getExchanges().size() > 0) {
				// Display Title

				stringBuffer.append(TEXT_1);

				// Create table header

				stringBuffer.append(TEXT_2);

				// Create each line
				for (FunctionalExchange fe : category.getExchanges()) {

					stringBuffer.append(TEXT_3);
					stringBuffer.append(CapellaCategoryServices.edgeToTableLine(fe, projectName, outputFolder));
					stringBuffer.append(TEXT_4);

				}
				// Create table footer

				stringBuffer.append(TEXT_5);

			}
		}

		// Component Exchange Categories
		if (element instanceof ComponentExchangeCategory) {
			ComponentExchangeCategory category = (ComponentExchangeCategory) element;
			if (category.getExchanges().size() > 0) {
				// Display Title

				stringBuffer.append(TEXT_6);

				// Create table header

				stringBuffer.append(TEXT_7);

				// Create each line
				for (ComponentExchange ce : category.getExchanges()) {

					stringBuffer.append(TEXT_8);
					stringBuffer.append(CapellaCategoryServices.edgeToTableLine(ce, projectName, outputFolder));
					stringBuffer.append(TEXT_9);

				}
				// Create table footer

				stringBuffer.append(TEXT_10);

			}
		}

		// Physical Link Categories
		if (element instanceof PhysicalLinkCategory) {
			PhysicalLinkCategory category = (PhysicalLinkCategory) element;
			if (category.getLinks().size() > 0) {
				// Display Title

				stringBuffer.append(TEXT_11);

				// Create table header

				stringBuffer.append(TEXT_12);

				// Create each line
				for (PhysicalLink pl : category.getLinks()) {

					stringBuffer.append(TEXT_13);
					stringBuffer.append(CapellaCategoryServices.edgeToTableLine(pl, projectName, outputFolder));
					stringBuffer.append(TEXT_14);

				}
				// Create table footer

				stringBuffer.append(TEXT_15);

			}
		}

		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "content", stringBuffer.toString());
	}

	public boolean preCondition(PatternContext ctx) throws Exception {
		return element instanceof ExchangeCategory || element instanceof ComponentExchangeCategory
				|| element instanceof PhysicalLinkCategory;
	}
}