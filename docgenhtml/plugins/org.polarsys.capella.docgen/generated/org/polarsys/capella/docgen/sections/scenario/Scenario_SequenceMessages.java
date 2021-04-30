//Generated with EGF 1.6.2.202001031546
package org.polarsys.capella.docgen.sections.scenario;

import java.util.*;
import org.eclipse.egf.model.pattern.*;
import org.eclipse.egf.pattern.execution.*;
import org.eclipse.egf.pattern.query.*;
import org.polarsys.capella.core.data.interaction.Scenario;
import org.polarsys.capella.core.data.interaction.SequenceMessage;
import org.polarsys.capella.docgen.util.StringUtil;

public class Scenario_SequenceMessages {
	protected static String nl;

	public static synchronized Scenario_SequenceMessages create(String lineSeparator) {
		nl = lineSeparator;
		Scenario_SequenceMessages result = new Scenario_SequenceMessages();
		nl = null;
		return result;
	}

	public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
	protected final String TEXT_1 = "";
	protected final String TEXT_2 = NL;
	protected final String TEXT_3 = NL + "<tr>" + NL + "\t<td>";
	protected final String TEXT_4 = "</td>" + NL + "\t<td>";
	protected final String TEXT_5 = "</td>" + NL + "</tr>";

	public Scenario_SequenceMessages() {
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

					this.parameter = (org.polarsys.capella.core.data.interaction.Scenario) parameterParameter;
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

	protected org.polarsys.capella.core.data.interaction.Scenario parameter = null;

	public void set_parameter(org.polarsys.capella.core.data.interaction.Scenario object) {
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

		// Sort messages
		List<SequenceMessage> orderedMessagesList = parameter.getOwnedMessages();

		stringBuffer.append(TEXT_1);

		if (orderedMessagesList.size() > 0) {
			String title = "Sequence Messages";
			Integer level = 2;
			String[] columns = { "Invoked Exchange", "Source element of the Exchange", "Target element of the Exchange",
					"Description of the Sequence Message <br /> <i>(and not the one of the invoked exchange)</i>" };
			Collection<String> tableColumnList = Arrays.asList(columns);

			stringBuffer.append(TEXT_2);
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

			for (SequenceMessage sMessage : orderedMessagesList) {

				String source = "";
				String target = "";

				if (sMessage.getSendingEnd() != null && sMessage.getSendingEnd().getCovered() != null
						&& sMessage.getSendingEnd().getCovered().getRepresentedInstance() != null)
					source = sMessage.getSendingEnd().getCovered().getRepresentedInstance().getName();

				if (sMessage.getReceivingEnd() != null && sMessage.getReceivingEnd().getCovered() != null
						&& sMessage.getReceivingEnd().getCovered().getRepresentedInstance() != null)
					target = sMessage.getReceivingEnd().getCovered().getRepresentedInstance().getName();

				String name = sMessage.getName();
				String description = sMessage.getDescription();
				description = StringUtil.transformAREFString(sMessage, description, projectNameParameter,
						outputFolderParameter);
				if (description == null || description.trim().length() == 0)
					description = "No description";

				stringBuffer.append(TEXT_3);
				stringBuffer.append(name);
				stringBuffer.append(TEXT_4);
				stringBuffer.append(source);
				stringBuffer.append(TEXT_4);
				stringBuffer.append(target);
				stringBuffer.append(TEXT_4);
				stringBuffer.append(description);
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
		stringBuffer.append(TEXT_2);
		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "body", stringBuffer.toString());
	}

	public boolean preCondition(PatternContext ctx) throws Exception {
		return parameter instanceof Scenario;
	}
}