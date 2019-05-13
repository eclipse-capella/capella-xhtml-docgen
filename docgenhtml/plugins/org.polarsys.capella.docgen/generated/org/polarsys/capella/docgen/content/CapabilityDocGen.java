//Generated with EGF 1.5.1.v20180423-0901
package org.polarsys.capella.docgen.content;

import org.eclipse.egf.common.helper.*;
import java.util.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.egf.model.pattern.*;
import org.eclipse.egf.pattern.execution.*;
import org.eclipse.egf.pattern.query.*;
import org.polarsys.capella.docgen.util.StringUtil;
import org.polarsys.capella.docgen.util.pattern.helper.CapellaCapabilityHelper;
import org.polarsys.capella.core.data.ctx.Capability;

public class CapabilityDocGen extends org.polarsys.capella.docgen.content.packageDocGen {
	protected static String nl;

	public static synchronized CapabilityDocGen create(String lineSeparator) {
		nl = lineSeparator;
		CapabilityDocGen result = new CapabilityDocGen();
		nl = null;
		return result;
	}

	public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
	protected final String TEXT_1 = NL + "<h2>Exploiting Missions</h2>";
	protected final String TEXT_2 = NL;
	protected final String TEXT_3 = NL;
	protected final String TEXT_4 = NL + "<h2>Involved Actors</h2>";
	protected final String TEXT_5 = NL;
	protected final String TEXT_6 = NL + "<h2>Relationships with other Capabilities</h2>";
	protected final String TEXT_7 = NL + "<h3>Extended Capabilities</h3>";
	protected final String TEXT_8 = NL;
	protected final String TEXT_9 = NL + "<h3>Included Capabilities</h3>";
	protected final String TEXT_10 = NL;
	protected final String TEXT_11 = NL + NL + "<h3>Super</h3>";
	protected final String TEXT_12 = NL;
	protected final String TEXT_13 = NL;
	protected final String TEXT_14 = NL + "<h2>Related Functions</h2>";
	protected final String TEXT_15 = NL;
	protected final String TEXT_16 = NL + "<h2>Modes and States</h2>";
	protected final String TEXT_17 = NL;
	protected final String TEXT_18 = NL + NL + NL;
	protected final String TEXT_19 = NL;
	protected final String TEXT_20 = NL;

	public CapabilityDocGen() {
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

			this.parameter = (org.polarsys.capella.core.data.capellacore.Structure) parameterParameter;

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

	public Map<String, Object> getParameters() {
		final Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("parameter", this.parameter);
		return parameters;
	}

	protected void method_content(final StringBuffer stringBuffer, final PatternContext ctx) throws Exception {

		super.method_content(new StringBuffer(), ctx);
		String projectName = ctx.getValue("projectName").toString();
		String outputFolder = ctx.getValue("outputFolder").toString();

		Collection<String> exploitingMissions = CapellaCapabilityHelper.INSTANCE.getExploitingMissions(projectName,
				outputFolder, (Capability) parameter);

		if (exploitingMissions.size() > 0) {

			stringBuffer.append(TEXT_1);
			stringBuffer.append(TEXT_2);
			stringBuffer.append(StringUtil.stringListToBulette(exploitingMissions));
			stringBuffer.append(TEXT_3);

		}
		Collection<String> actors = CapellaCapabilityHelper.INSTANCE.getInvolvedActors(projectName, outputFolder,
				(Capability) parameter);

		if (actors.size() > 0) {

			stringBuffer.append(TEXT_4);
			stringBuffer.append(TEXT_5);
			stringBuffer.append(StringUtil.stringListToBulette(actors));

		}

		Collection<String> extendedCapabilities = CapellaCapabilityHelper.INSTANCE.getExtendedCapabilities(projectName,
				outputFolder, (Capability) parameter);
		Collection<String> includedCapabilities = CapellaCapabilityHelper.INSTANCE.getIncludedCapabilities(projectName,
				outputFolder, (Capability) parameter);
		Collection<String> superCapabilities = CapellaCapabilityHelper.INSTANCE.getParentCapabilities(projectName,
				outputFolder, (Capability) parameter);
		if ((extendedCapabilities.size() > 0) && (includedCapabilities.size() > 0) && (superCapabilities.size() > 0)) {

			stringBuffer.append(TEXT_6);

		}
		if (extendedCapabilities.size() > 0) {

			stringBuffer.append(TEXT_7);
			stringBuffer.append(TEXT_8);
			stringBuffer.append(StringUtil.stringListToBulette(extendedCapabilities));

		}

		if (includedCapabilities.size() > 0) {

			stringBuffer.append(TEXT_9);
			stringBuffer.append(TEXT_10);
			stringBuffer.append(StringUtil.stringListToBulette(includedCapabilities));

		}

		if (superCapabilities.size() > 0) {

			stringBuffer.append(TEXT_11);
			stringBuffer.append(TEXT_12);
			stringBuffer.append(StringUtil.stringListToBulette(superCapabilities));
			stringBuffer.append(TEXT_13);

		}
		Collection<String> involvedFunctions = CapellaCapabilityHelper.INSTANCE.getInvolvedFunctions(projectName,
				outputFolder, (Capability) parameter);

		if (involvedFunctions.size() > 0) {

			stringBuffer.append(TEXT_14);
			stringBuffer.append(TEXT_15);
			stringBuffer.append(StringUtil.stringListToBulette(involvedFunctions));

		}

		Collection<String> availableModeAndState = CapellaCapabilityHelper.INSTANCE
				.getAvailableModeAndState(projectName, outputFolder, (Capability) parameter);

		if (availableModeAndState.size() > 0) {

			stringBuffer.append(TEXT_16);
			stringBuffer.append(TEXT_17);
			stringBuffer.append(StringUtil.stringListToBulette(availableModeAndState));

		}

		stringBuffer.append(TEXT_18);
		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "content", stringBuffer.toString());
	}

	public boolean preCondition(PatternContext ctx) throws Exception {
		return (this.parameter instanceof Capability);
	}
}