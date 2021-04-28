//Generated with EGF 1.6.2.202001031546
package org.polarsys.capella.docgen.sections.region;

import java.util.*;
import org.eclipse.egf.model.pattern.*;
import org.eclipse.egf.pattern.execution.*;
import org.eclipse.egf.pattern.query.*;
import org.polarsys.capella.core.data.capellacommon.Region;
import org.polarsys.capella.core.linkedtext.ui.CapellaEmbeddedLinkedTextEditorInput;
import org.polarsys.capella.core.data.capellacore.Constraint;
import org.polarsys.capella.core.data.capellacommon.StateTransition;
import org.polarsys.capella.docgen.util.StringUtil;
import org.polarsys.capella.common.data.behavior.AbstractEvent;
import org.eclipse.emf.common.util.EList;

public class Region_OwnedTransitions {
	protected static String nl;

	public static synchronized Region_OwnedTransitions create(String lineSeparator) {
		nl = lineSeparator;
		Region_OwnedTransitions result = new Region_OwnedTransitions();
		nl = null;
		return result;
	}

	public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
	protected final String TEXT_1 = "";
	protected final String TEXT_2 = NL;
	protected final String TEXT_3 = NL + "<tr>" + NL + "\t<td>";
	protected final String TEXT_4 = "</td>" + NL + "\t<td>";
	protected final String TEXT_5 = "</td>" + NL + "</tr>";

	public Region_OwnedTransitions() {
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
		List<Object> projectNameParameterList = null;
		//this pattern can only be called by another (i.e. it's not an entry point in execution)
		List<Object> outputFolderParameterList = null;
		//this pattern can only be called by another (i.e. it's not an entry point in execution)

		for (Object parameterParameter : parameterList) {
			for (Object projectNameParameterParameter : projectNameParameterList) {
				for (Object outputFolderParameterParameter : outputFolderParameterList) {

					this.parameter = (org.polarsys.capella.core.data.capellacommon.Region) parameterParameter;
					this.projectNameParameter = (java.lang.String) projectNameParameterParameter;
					this.outputFolderParameter = (java.lang.String) outputFolderParameterParameter;

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

		stringBuffer.append(TEXT_2);
		stringBuffer.append(TEXT_2);
		return stringBuffer.toString();
	}

	public String orchestration(PatternContext ctx) throws Exception {
		InternalPatternContext ictx = (InternalPatternContext) ctx;

		method_body(new StringBuffer(), ictx);

		if (ictx.useReporter()) {
			Map<String, Object> parameterValues = new HashMap<String, Object>();
			parameterValues.put("parameter", this.parameter);
			parameterValues.put("projectNameParameter", this.projectNameParameter);
			parameterValues.put("outputFolderParameter", this.outputFolderParameter);
			String outputWithCallBack = OutputManager.computeLoopOutput(ictx);
			String loop = OutputManager.computeLoopOutputWithoutCallback(ictx);
			ictx.getReporter().loopFinished(loop, outputWithCallBack, ictx, parameterValues);
		}
		return null;
	}

	protected org.polarsys.capella.core.data.capellacommon.Region parameter = null;

	public void set_parameter(org.polarsys.capella.core.data.capellacommon.Region object) {
		this.parameter = object;
	}

	protected java.lang.String projectNameParameter = null;

	public void set_projectNameParameter(java.lang.String object) {
		this.projectNameParameter = object;
	}

	protected java.lang.String outputFolderParameter = null;

	public void set_outputFolderParameter(java.lang.String object) {
		this.outputFolderParameter = object;
	}

	public Map<String, Object> getParameters() {
		final Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("parameter", this.parameter);
		parameters.put("projectNameParameter", this.projectNameParameter);
		parameters.put("outputFolderParameter", this.outputFolderParameter);
		return parameters;
	}

	protected void method_body(final StringBuffer stringBuffer, final PatternContext ctx) throws Exception {

		if (parameter.getOwnedTransitions() != null && parameter.getOwnedTransitions().size() > 0) {
			String title = "Owned Transitions";
			Integer level = 2;
			String[] columns = { "Transition", "Source", "Target", "Trigger", "Effect", "Description" };
			Collection<String> tableColumnList = Arrays.asList(columns);

			stringBuffer.append(TEXT_1);
			{
				//<%@ egf:patternCall patternId="platform:/plugin/org.polarsys.capella.docgen/egf/HTMLDocGenCapella.fcore#LogicalName=org.polarsys.capella.docgen.sections.display.TableHeaderFromListColumn" args="tableColumnList:tableColumnsListParameter, title:sectionTitleParameter, level:sectionLevelParameter"%>

				InternalPatternContext ictx = (InternalPatternContext) ctx;
				new Node.DataLeaf(ictx.getNode(), getClass(), null, stringBuffer.toString());
				stringBuffer.setLength(0);

				final Map<String, Object> callParameters = new HashMap<String, Object>();
				callParameters.put("tableColumnsListParameter", tableColumnList);
				callParameters.put("sectionTitleParameter", title);
				callParameters.put("sectionLevelParameter", level);
				CallHelper.executeWithParameterInjection(
						"platform:/plugin/org.polarsys.capella.docgen/egf/HTMLDocGenCapella.fcore#_HG8TkKc8EeuJhsj8yYqhhw",
						new ExecutionContext((InternalPatternContext) ctx), callParameters);
				stringBuffer.setLength(0);
			}

			stringBuffer.append(TEXT_2);

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
					String guardName = CapellaEmbeddedLinkedTextEditorInput.getDefaultText(constraint);
					guard = guardName != null ? "[" + guardName + "]" : "";
				}

				EList<AbstractEvent> effects = transition.getEffect();
				String trans_effect = "";
				for (AbstractEvent abstractEvent : effects) {
					trans_effect += abstractEvent.getName();
					if (effects.indexOf(abstractEvent) != effects.size()) {
						trans_effect += ", ";
					}
				}

				if (!trans_effect.isEmpty() && effects.size() > 1) {
					trans_effect = "(" + trans_effect + ")";
				}

				// String trans_effect = (transition.getEffect() != null ? transition.getEffect().getName() : "");

				String trans_label = (triggerName.trim().length() > 0 ? triggerName
						: transition.getTriggerDescription()) + " " + guard
						+ (trans_effect.trim().length() > 0 ? " / " + trans_effect : "");

				String trans_source = (transition.getSource() != null ? transition.getSource().getName() : "");

				String trans_target = (transition.getTarget() != null ? transition.getTarget().getName() : "");

				String trans_description = "";

				if (transition instanceof StateTransition) {
					StateTransition tt = (StateTransition) transition;
					trans_description = tt.getDescription();
					trans_description = StringUtil.transformAREFString(transition, trans_description,
							projectNameParameter, outputFolderParameter);
				}

				stringBuffer.append(TEXT_3);
				stringBuffer.append(trans_label);
				stringBuffer.append(TEXT_4);
				stringBuffer.append(trans_source);
				stringBuffer.append(TEXT_4);
				stringBuffer.append(trans_target);
				stringBuffer.append(TEXT_4);
				stringBuffer.append(triggerName);
				stringBuffer.append(TEXT_4);
				stringBuffer.append(trans_effect);
				stringBuffer.append(TEXT_4);
				stringBuffer.append(trans_description);
				stringBuffer.append(TEXT_5);
			}
			stringBuffer.append(TEXT_2);
			stringBuffer.append(TEXT_2);
			{
				//<%@ egf:patternCall patternId="platform:/plugin/org.polarsys.capella.docgen/egf/HTMLDocGenCapella.fcore#LogicalName=org.polarsys.capella.docgen.sections.display.TableFooter"%>

				InternalPatternContext ictx = (InternalPatternContext) ctx;
				new Node.DataLeaf(ictx.getNode(), getClass(), null, stringBuffer.toString());
				stringBuffer.setLength(0);

				final Map<String, Object> callParameters = new HashMap<String, Object>();
				CallHelper.executeWithParameterInjection(
						"platform:/plugin/org.polarsys.capella.docgen/egf/HTMLDocGenCapella.fcore#_GyZxgKc9EeuJhsj8yYqhhw",
						new ExecutionContext((InternalPatternContext) ctx), callParameters);
				stringBuffer.setLength(0);
			}

			stringBuffer.append(TEXT_2);
		}
		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "body", stringBuffer.toString());
	}

	public boolean preCondition(PatternContext ctx) throws Exception {
		return parameter instanceof Region;
	}
}