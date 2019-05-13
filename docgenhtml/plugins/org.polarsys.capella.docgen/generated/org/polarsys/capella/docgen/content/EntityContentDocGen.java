//Generated with EGF 1.5.1.v20180423-0901
package org.polarsys.capella.docgen.content;

import org.eclipse.egf.common.helper.*;
import java.util.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.egf.model.pattern.*;
import org.eclipse.egf.pattern.execution.*;
import org.eclipse.egf.pattern.query.*;
import org.polarsys.capella.core.data.oa.Entity;
import org.polarsys.capella.docgen.util.pattern.helper.CapellaEntityHelper;

public class EntityContentDocGen {
	protected static String nl;

	public static synchronized EntityContentDocGen create(String lineSeparator) {
		nl = lineSeparator;
		EntityContentDocGen result = new EntityContentDocGen();
		nl = null;
		return result;
	}

	public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
	protected final String TEXT_1 = "<h2>Incoming Communication Means</h2>" + NL + "<table>" + NL + "\t<tr>" + NL
			+ "\t\t<th>Communication Means</th>" + NL + "\t\t<th>Source</th>" + NL + "\t\t<th>Description</th>" + NL
			+ "\t\t<th>Allocated Functional Exchanges</th>" + NL + "\t</tr>" + NL + "\t";
	protected final String TEXT_2 = NL + "\t";
	protected final String TEXT_3 = NL + "\t";
	protected final String TEXT_4 = NL + "</table>";
	protected final String TEXT_5 = NL + "<h2>Outgoing Communication Means</h2>" + NL + "<table>" + NL + "\t<tr>" + NL
			+ "\t\t<th>Communication Means</th>" + NL + "\t\t<th>Target</th>" + NL + "\t\t<th>Description</th>" + NL
			+ "\t\t<th>Allocated Functional Exchanges</th>" + NL + "\t</tr>" + NL + "\t";
	protected final String TEXT_6 = NL + "\t";
	protected final String TEXT_7 = NL + "\t";
	protected final String TEXT_8 = NL + "</table>";
	protected final String TEXT_9 = NL;
	protected final String TEXT_10 = NL;

	public EntityContentDocGen() {
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

		for (Object elementParameter : elementList) {

			this.element = (org.polarsys.capella.core.data.oa.Entity) elementParameter;

			if (preCondition(ctx)) {
				ctx.setNode(new Node.Container(currentNode, getClass()));
				orchestration(ctx);
			}

		}
		ctx.setNode(currentNode);
		if (ctx.useReporter()) {
			ctx.getReporter().executionFinished(OutputManager.computeExecutionOutput(ctx), ctx);
		}

		stringBuffer.append(TEXT_9);
		stringBuffer.append(TEXT_10);
		return stringBuffer.toString();
	}

	public String orchestration(PatternContext ctx) throws Exception {
		InternalPatternContext ictx = (InternalPatternContext) ctx;

		method_body(new StringBuffer(), ictx);

		if (ictx.useReporter()) {
			Map<String, Object> parameterValues = new HashMap<String, Object>();
			parameterValues.put("element", this.element);
			String outputWithCallBack = OutputManager.computeLoopOutput(ictx);
			String loop = OutputManager.computeLoopOutputWithoutCallback(ictx);
			ictx.getReporter().loopFinished(loop, outputWithCallBack, ictx, parameterValues);
		}
		return null;
	}

	protected org.polarsys.capella.core.data.oa.Entity element = null;

	public void set_element(org.polarsys.capella.core.data.oa.Entity object) {
		this.element = object;
	}

	public Map<String, Object> getParameters() {
		final Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("element", this.element);
		return parameters;
	}

	protected void method_body(final StringBuffer stringBuffer, final PatternContext ctx) throws Exception {

		String projectName = ctx.getValue("projectName").toString();
		String outputFolder = ctx.getValue("outputFolder").toString();

		Collection<String> incomingCommunicationMeans = CapellaEntityHelper
				.getIncomingCommunicationMeansLines((Entity) element, projectName, outputFolder);
		if (incomingCommunicationMeans.size() > 0) {

			stringBuffer.append(TEXT_1);
			for (String communicationMean : incomingCommunicationMeans) {

				stringBuffer.append(TEXT_2);
				stringBuffer.append(communicationMean);
				stringBuffer.append(TEXT_3);

			}
			stringBuffer.append(TEXT_4);
		}

		Collection<String> outgoingCommunicationMeans = CapellaEntityHelper
				.getOutgoingCommunicationMeansLines((Entity) element, projectName, outputFolder);
		if (outgoingCommunicationMeans.size() > 0) {

			stringBuffer.append(TEXT_5);
			for (String communicationMean : outgoingCommunicationMeans) {

				stringBuffer.append(TEXT_6);
				stringBuffer.append(communicationMean);
				stringBuffer.append(TEXT_7);

			}
			stringBuffer.append(TEXT_8);
		}
		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "body", stringBuffer.toString());
	}

	public boolean preCondition(PatternContext ctx) throws Exception {
		return true;
	}
}