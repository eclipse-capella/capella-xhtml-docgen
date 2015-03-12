//Generated with EGF 1.2.0.v20140805-0858
package org.polarsys.capella.docgen.content;

import org.polarsys.capella.core.linkedtext.ui.CapellaEmbeddedLinkedTextEditorInput;
import org.polarsys.capella.core.data.capellacore.Constraint;
import java.util.*;
import org.eclipse.egf.model.pattern.*;
import org.eclipse.egf.pattern.execution.*;
import org.eclipse.egf.pattern.query.*;
import org.polarsys.capella.core.data.capellacommon.Region;
import org.polarsys.capella.core.data.capellacommon.StateTransition;
import org.polarsys.capella.docgen.util.CapellaElementService;
import org.polarsys.capella.docgen.util.StringUtil;
import org.polarsys.capella.docgen.util.pattern.helper.RegionHelper;
import org.polarsys.capella.common.data.behavior.AbstractEvent;
import org.eclipse.emf.common.util.EList;

public class RegionDocGen extends
		org.polarsys.capella.docgen.foundations.NamedElementDocGen {
	protected static String nl;

	public static synchronized RegionDocGen create(String lineSeparator) {
		nl = lineSeparator;
		RegionDocGen result = new RegionDocGen();
		nl = null;
		return result;
	}

	public final String NL = nl == null ? (System.getProperties()
			.getProperty("line.separator")) : nl;
	protected final String TEXT_1 = "<h2>Modes and States</h2>";
	protected final String TEXT_2 = NL;
	protected final String TEXT_3 = NL + "<h2>Realized Elements</h2>" + NL;
	protected final String TEXT_4 = NL;
	protected final String TEXT_5 = NL;
	protected final String TEXT_6 = NL;
	protected final String TEXT_7 = NL + "<h2>Realizing Elements </h2>" + NL;
	protected final String TEXT_8 = NL;
	protected final String TEXT_9 = NL;
	protected final String TEXT_10 = NL;
	protected final String TEXT_11 = NL;
	protected final String TEXT_12 = NL;
	protected final String TEXT_13 = NL + "<h2>Owned Transitions</h2>" + NL
			+ "<table max-width=screen.width>" + NL + "   <thead> " + NL
			+ "       <tr>" + NL + "           <th>Transition</th>" + NL
			+ "           <th>Source</th>" + NL + "           <th>Target</th>"
			+ NL + "           <th>Tigger</th>" + NL
			+ "           <th>Effect</th>" + NL
			+ "           <th>Description</th>" + NL + "       </tr>" + NL
			+ "   </thead>" + NL + "   <tbody>";
	protected final String TEXT_14 = NL + "\t   <tr>" + NL + "           <td>";
	protected final String TEXT_15 = "</td>" + NL + "           <td>";
	protected final String TEXT_16 = "</td>" + NL + "           <td>";
	protected final String TEXT_17 = "</td>" + NL + "           <td>";
	protected final String TEXT_18 = "</td>" + NL + "           <td>";
	protected final String TEXT_19 = "</td>" + NL + "           <td>";
	protected final String TEXT_20 = "</td>" + NL + "       </tr>" + NL
			+ "\t\t";
	protected final String TEXT_21 = NL + NL + "</div>";
	protected final String TEXT_22 = NL;
	protected final String TEXT_23 = NL;

	public RegionDocGen() {
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

			this.parameter = (org.polarsys.capella.core.data.capellacommon.Region) parameterParameter;

			if (preCondition(ctx)) {
				ctx.setNode(new Node.Container(currentNode, getClass()));
				orchestration(ctx);
			}

		}
		ctx.setNode(currentNode);
		if (ctx.useReporter()) {
			ctx.getReporter().executionFinished(
					OutputManager.computeExecutionOutput(ctx), ctx);
		}

		stringBuffer.append(TEXT_22);
		stringBuffer.append(TEXT_23);
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
			ictx.getReporter().loopFinished(loop, outputWithCallBack, ictx,
					parameterValues);
		}
		return null;
	}

	protected org.polarsys.capella.core.data.capellacommon.Region parameter = null;

	public void set_parameter(
			org.polarsys.capella.core.data.capellacommon.Region object) {
		this.parameter = object;
	}

	public Map<String, Object> getParameters() {
		final Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("parameter", this.parameter);
		return parameters;
	}

	protected void method_content(final StringBuffer stringBuffer,
			final PatternContext ctx) throws Exception {

		super.method_content(new StringBuffer(), ctx);
		String projectName = ctx.getValue("projectName").toString();
		String outputFolder = ctx.getValue("outputFolder").toString();

		Collection<String> states = RegionHelper.getState(projectName,
				outputFolder, (Region) element);

		if (states.size() > 0) {

			stringBuffer.append(TEXT_1);
			stringBuffer.append(TEXT_2);
			stringBuffer.append(StringUtil.stringListToBulette(states));

		}

		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "content",
				stringBuffer.toString());
	}

	protected void method_setCapellaContext(final StringBuffer stringBuffer,
			final PatternContext ctx) throws Exception {

		element = parameter;

		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "setCapellaContext",
				stringBuffer.toString());
	}

	protected void method_endContent(final StringBuffer stringBuffer,
			final PatternContext ctx) throws Exception {

		// Realized Elements 

		String outputFolder = ctx.getValue("outputFolder").toString();
		String projectName = ctx.getValue("projectName").toString();
		Collection<String> allocations = CapellaElementService
				.getOutGoingAllocation(element, projectName, outputFolder);
		if (allocations.size() > 0) {
			stringBuffer.append(TEXT_3);
			stringBuffer.append(TEXT_4);
			stringBuffer.append(StringUtil.stringListToBulette(allocations));
			stringBuffer.append(TEXT_5);
		}
		stringBuffer.append(TEXT_6);
		// Realizing Elements 

		//String outputFolder = ctx.getValue("outputFolder").toString();
		//String projectName = ctx.getValue("projectName").toString();
		Collection<String> allocations2 = CapellaElementService
				.getIncomingAllocation(element, projectName, outputFolder);
		if (allocations2.size() > 0) {
			stringBuffer.append(TEXT_7);
			stringBuffer.append(TEXT_8);
			stringBuffer.append(StringUtil.stringListToBulette(allocations2));
			stringBuffer.append(TEXT_9);
		}
		stringBuffer.append(TEXT_10);
		// owned diagrams
		stringBuffer.append(TEXT_11);
		{
			//<%@ egf:patternCall patternId="platform:/plugin/org.polarsys.kitalpha.doc.gen.business.capella/egf/HTMLDocGenCapella.fcore#LogicalName=org.polarsys.kitalpha.doc.gen.business.capella.foundations.DiagramsGeneration" args="element:element"%>

			InternalPatternContext ictx = (InternalPatternContext) ctx;
			new Node.DataLeaf(ictx.getNode(), getClass(), null,
					stringBuffer.toString());
			stringBuffer.setLength(0);

			final Map<String, Object> callParameters = new HashMap<String, Object>();
			callParameters.put("element", element);
			CallHelper
					.executeWithParameterInjection(
							"platform:/plugin/org.polarsys.kitalpha.doc.gen.business.capella/egf/HTMLDocGenCapella.fcore#_PVePETXrEeCNvtb1bUM2fQ",
							new ExecutionContext((InternalPatternContext) ctx),
							callParameters);
			stringBuffer.setLength(0);
		}

		stringBuffer.append(TEXT_12);
		if (parameter.getOwnedTransitions() != null
				&& parameter.getOwnedTransitions().size() > 0) {
			stringBuffer.append(TEXT_13);
			for (StateTransition transition : parameter.getOwnedTransitions()) {
				String triggerName = "";
				EList<AbstractEvent> triggers = transition.getTriggers();
				if (triggers != null && !triggers.isEmpty()) {
					triggerName = triggers.get(0).getName();
					for (int i = 1; i < triggers.size(); i++) {
						triggerName += ", " + triggers.get(i).getName();
					}
				}

				String guard = "";

				// FIXME: (Old code) Keep until migration validation
				//guard = ( transition.getGuard() != null && transition.getGuard().length() > 0 ? "["+transition.getGuard()+"]" : "");
				// New code
				Constraint constraint = transition.getGuard();
				if (constraint != null && constraint.getName() != null) {
					String guardName = CapellaEmbeddedLinkedTextEditorInput
							.getDefaultText(constraint);
					guard = guardName != null ? "[" + guardName + "]" : "";
				}

				String trans_effect = (transition.getEffect() != null ? transition
						.getEffect().getName() : "");

				String trans_label = (triggerName.trim().length() > 0 ? triggerName
						: transition.getTriggerDescription())
						+ " "
						+ guard
						+ (trans_effect.trim().length() > 0 ? " / "
								+ trans_effect : "");

				String trans_source = (transition.getSource() != null ? transition
						.getSource().getName() : "");

				String trans_target = (transition.getTarget() != null ? transition
						.getTarget().getName() : "");

				String trans_description = "";

				if (transition instanceof StateTransition) {
					StateTransition tt = (StateTransition) transition;
					trans_description = tt.getDescription();
					trans_description = StringUtil.transformAREFString(
							transition, trans_description, projectName,
							outputFolder);
				}
				stringBuffer.append(TEXT_14);
				stringBuffer.append(trans_label);
				stringBuffer.append(TEXT_15);
				stringBuffer.append(trans_source);
				stringBuffer.append(TEXT_16);
				stringBuffer.append(trans_target);
				stringBuffer.append(TEXT_17);
				stringBuffer.append(triggerName);
				stringBuffer.append(TEXT_18);
				stringBuffer.append(trans_effect);
				stringBuffer.append(TEXT_19);
				stringBuffer.append(trans_description);
				stringBuffer.append(TEXT_20);
			}
		}
		stringBuffer.append(TEXT_21);
		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "endContent",
				stringBuffer.toString());
	}
}