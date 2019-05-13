//Generated with EGF 1.5.1.v20180423-0901
package org.polarsys.capella.docgen.content;

import org.eclipse.egf.common.helper.*;
import java.util.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.egf.model.pattern.*;
import org.eclipse.egf.pattern.execution.*;
import org.eclipse.egf.pattern.query.*;
import org.polarsys.capella.core.data.capellacommon.State;
import org.polarsys.capella.docgen.util.StringUtil;
import org.polarsys.capella.docgen.util.pattern.helper.CapellaStateHelper;

public class StateDocGen extends org.polarsys.capella.docgen.foundations.NamedElementDocGen {
	protected static String nl;

	public static synchronized StateDocGen create(String lineSeparator) {
		nl = lineSeparator;
		StateDocGen result = new StateDocGen();
		nl = null;
		return result;
	}

	public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
	protected final String TEXT_1 = "<h2>Properties</h2>" + NL + "<p><strong>Do Activity:</strong> ";
	protected final String TEXT_2 = "</p>";
	protected final String TEXT_3 = NL + "<h2>Modes and States</h2>";
	protected final String TEXT_4 = NL;
	protected final String TEXT_5 = NL + "<h3>Referenced</h3>";
	protected final String TEXT_6 = NL;
	protected final String TEXT_7 = NL + "<h2>Previous States / Modes</h2>";
	protected final String TEXT_8 = NL;
	protected final String TEXT_9 = NL + "<h2>Following States / Modes</h2>";
	protected final String TEXT_10 = NL;
	protected final String TEXT_11 = NL + "<h2>Functions</h2>";
	protected final String TEXT_12 = NL;
	protected final String TEXT_13 = NL + "<h2>Functional Chains</h2>";
	protected final String TEXT_14 = NL;
	protected final String TEXT_15 = NL + "<h2>Capabilities</h2>";
	protected final String TEXT_16 = NL;
	protected final String TEXT_17 = NL;
	protected final String TEXT_18 = NL;

	public StateDocGen() {
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

			this.parameter = (org.polarsys.capella.core.data.capellacommon.State) parameterParameter;

			if (preCondition(ctx)) {
				ctx.setNode(new Node.Container(currentNode, getClass()));
				orchestration(ctx);
			}

		}
		ctx.setNode(currentNode);
		if (ctx.useReporter()) {
			ctx.getReporter().executionFinished(OutputManager.computeExecutionOutput(ctx), ctx);
		}

		stringBuffer.append(TEXT_17);
		stringBuffer.append(TEXT_18);
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

	protected org.polarsys.capella.core.data.capellacommon.State parameter = null;

	public void set_parameter(org.polarsys.capella.core.data.capellacommon.State object) {
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

		String doActivity = CapellaStateHelper.getDoActivity(projectName, outputFolder, (State) element);
		if (doActivity != "") {

			stringBuffer.append(TEXT_1);
			stringBuffer.append(doActivity);
			stringBuffer.append(TEXT_2);

		}
		Collection<String> ownedReferencedStatesModes = CapellaStateHelper.getOwnedReferencedStatesModes(projectName,
				outputFolder, (State) element);
		Collection<String> referencedStatesModes = CapellaStateHelper.getReferencedStatesModes(projectName,
				outputFolder, (State) element);

		if (ownedReferencedStatesModes.size() > 0 || referencedStatesModes.size() > 0) {

			stringBuffer.append(TEXT_3);
			stringBuffer.append(TEXT_4);
			stringBuffer.append(StringUtil.stringListToBulette(ownedReferencedStatesModes));

		}

		if (referencedStatesModes.size() > 0) {

			stringBuffer.append(TEXT_5);
			stringBuffer.append(TEXT_6);
			stringBuffer.append(StringUtil.stringListToBulette(referencedStatesModes));

		}
		/*
		Collection<String> previousStatesModes = CapellaStateHelper.getPreviousStatesModes(projectName,
					outputFolder,(State) element);
					
					if(previousStatesModes.size() > 0) {
		
		    stringBuffer.append(TEXT_7);
		    stringBuffer.append(TEXT_8);
		    stringBuffer.append(StringUtil.stringListToBulette(previousStatesModes));
		    
		}
		
		
		Collection<String> followingStatesModes = CapellaStateHelper.getFollowingStatesModes(projectName,
					outputFolder,(State) element);
					
					if(followingStatesModes.size() > 0) {
		
		    stringBuffer.append(TEXT_9);
		    stringBuffer.append(TEXT_10);
		    stringBuffer.append(StringUtil.stringListToBulette(followingStatesModes));
		    
		}
		
		*/
		Collection<String> functions = CapellaStateHelper.getFunctions(projectName, outputFolder, (State) element);

		if (functions.size() > 0) {

			stringBuffer.append(TEXT_11);
			stringBuffer.append(TEXT_12);
			stringBuffer.append(StringUtil.stringListToBulette(functions));

		}

		Collection<String> functionalChain = CapellaStateHelper.getFunctionalChain(projectName, outputFolder,
				(State) element);

		if (functionalChain.size() > 0) {

			stringBuffer.append(TEXT_13);
			stringBuffer.append(TEXT_14);
			stringBuffer.append(StringUtil.stringListToBulette(functionalChain));

		}

		Collection<String> capabilities = CapellaStateHelper.getCapabilities(projectName, outputFolder,
				(State) element);

		if (capabilities.size() > 0) {

			stringBuffer.append(TEXT_15);
			stringBuffer.append(TEXT_16);
			stringBuffer.append(StringUtil.stringListToBulette(capabilities));

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