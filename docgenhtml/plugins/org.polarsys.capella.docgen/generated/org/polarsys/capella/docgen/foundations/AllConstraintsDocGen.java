//Generated with EGF 1.6.2.202001031546
package org.polarsys.capella.docgen.foundations;

import java.util.*;
import org.eclipse.egf.model.pattern.*;
import org.eclipse.egf.pattern.execution.*;
import org.eclipse.egf.pattern.query.*;
import org.polarsys.capella.docgen.util.ConstraintsService;
import org.polarsys.capella.common.data.modellingcore.AbstractConstraint;

public class AllConstraintsDocGen {
	protected static String nl;

	public static synchronized AllConstraintsDocGen create(String lineSeparator) {
		nl = lineSeparator;
		AllConstraintsDocGen result = new AllConstraintsDocGen();
		nl = null;
		return result;
	}

	public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
	protected final String TEXT_1 = "";
	protected final String TEXT_2 = NL;

	public AllConstraintsDocGen() {
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

			this.parameter = (org.polarsys.capella.core.data.capellacore.CapellaElement) parameterParameter;

			if (preCondition(ctx)) {
				ctx.setNode(new Node.Container(currentNode, getClass()));
				orchestration(ctx);
			}

		}
		ctx.setNode(currentNode);
		if (ctx.useReporter()) {
			ctx.getReporter().executionFinished(OutputManager.computeExecutionOutput(ctx), ctx);
		}

		stringBuffer.append(TEXT_2);
		stringBuffer.append(TEXT_2);
		return stringBuffer.toString();
	}

	public String orchestration(PatternContext ctx) throws Exception {
		InternalPatternContext ictx = (InternalPatternContext) ctx;

		method_genConstraints(new StringBuffer(), ictx);

		if (ictx.useReporter()) {
			Map<String, Object> parameterValues = new HashMap<String, Object>();
			parameterValues.put("parameter", this.parameter);
			String outputWithCallBack = OutputManager.computeLoopOutput(ictx);
			String loop = OutputManager.computeLoopOutputWithoutCallback(ictx);
			ictx.getReporter().loopFinished(loop, outputWithCallBack, ictx, parameterValues);
		}
		return null;
	}

	protected org.polarsys.capella.core.data.capellacore.CapellaElement parameter = null;

	public void set_parameter(org.polarsys.capella.core.data.capellacore.CapellaElement object) {
		this.parameter = object;
	}

	public Map<String, Object> getParameters() {
		final Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("parameter", this.parameter);
		return parameters;
	}

	protected void method_genConstraints(final StringBuffer stringBuffer, final PatternContext ctx) throws Exception {

		List<AbstractConstraint> ownedConstraintsList = parameter.getOwnedConstraints();
		if (!ownedConstraintsList.isEmpty()) {
			String title = "Owned Constraints";

			stringBuffer.append(TEXT_1);
			{
				//<%@ egf:patternCall patternId="platform:/plugin/org.polarsys.capella.docgen/egf/HTMLDocGenCapella.fcore#LogicalName=org.polarsys.capella.docgen.foundations.ConstraintsDocGen" args="parameter:parameter, ownedConstraintsList:constraintsList, title:constraintSectionTitle"%>

				InternalPatternContext ictx = (InternalPatternContext) ctx;
				new Node.DataLeaf(ictx.getNode(), getClass(), null, stringBuffer.toString());
				stringBuffer.setLength(0);

				final Map<String, Object> callParameters = new HashMap<String, Object>();
				callParameters.put("parameter", parameter);
				callParameters.put("constraintsList", ownedConstraintsList);
				callParameters.put("constraintSectionTitle", title);
				CallHelper.executeWithParameterInjection(
						"platform:/plugin/org.polarsys.capella.docgen/egf/HTMLDocGenCapella.fcore#_F9HPoVcEEeWXKstRBeKifA",
						new ExecutionContext((InternalPatternContext) ctx), callParameters);
				stringBuffer.setLength(0);
			}

		}

		stringBuffer.append(TEXT_2);

		List<AbstractConstraint> appledConstraintsList = ConstraintsService.getAppliedAndNotOwnedConstraints(parameter);
		if (!appledConstraintsList.isEmpty()) {
			String title = "Applied Constraints";

			stringBuffer.append(TEXT_2);
			{
				//<%@ egf:patternCall patternId="platform:/plugin/org.polarsys.capella.docgen/egf/HTMLDocGenCapella.fcore#LogicalName=org.polarsys.capella.docgen.foundations.ConstraintsDocGen" args="parameter:parameter, appledConstraintsList:constraintsList, title:constraintSectionTitle"%>

				InternalPatternContext ictx = (InternalPatternContext) ctx;
				new Node.DataLeaf(ictx.getNode(), getClass(), null, stringBuffer.toString());
				stringBuffer.setLength(0);

				final Map<String, Object> callParameters = new HashMap<String, Object>();
				callParameters.put("parameter", parameter);
				callParameters.put("constraintsList", appledConstraintsList);
				callParameters.put("constraintSectionTitle", title);
				CallHelper.executeWithParameterInjection(
						"platform:/plugin/org.polarsys.capella.docgen/egf/HTMLDocGenCapella.fcore#_F9HPoVcEEeWXKstRBeKifA",
						new ExecutionContext((InternalPatternContext) ctx), callParameters);
				stringBuffer.setLength(0);
			}

		}

		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "genConstraints", stringBuffer.toString());
	}

	public boolean preCondition(PatternContext ctx) throws Exception {
		return true;
	}
}