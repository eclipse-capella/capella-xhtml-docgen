//Generated with EGF 1.6.2.202001031546
package org.polarsys.capella.docgen.sections.display;

import java.util.*;
import org.eclipse.egf.model.pattern.*;
import org.eclipse.egf.pattern.execution.*;
import org.eclipse.egf.pattern.query.*;
import org.polarsys.capella.docgen.util.StringUtil;

public class TableHeaderFromListColumn extends org.polarsys.capella.docgen.sections.display.TitleSection {
	protected static String nl;

	public static synchronized TableHeaderFromListColumn create(String lineSeparator) {
		nl = lineSeparator;
		TableHeaderFromListColumn result = new TableHeaderFromListColumn();
		nl = null;
		return result;
	}

	public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
	protected final String TEXT_1 = "<table>" + NL + "<tr>";
	protected final String TEXT_2 = NL + "<th>";
	protected final String TEXT_3 = "</th>";
	protected final String TEXT_4 = NL + "</tr>" + NL;
	protected final String TEXT_5 = NL;

	public TableHeaderFromListColumn() {
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

		List<Object> tableColumnsListParameterList = null;
		//this pattern can only be called by another (i.e. it's not an entry point in execution)
		List<Object> sectionTitleParameterList = null;
		//this pattern can only be called by another (i.e. it's not an entry point in execution)
		List<Object> sectionLevelParameterList = null;
		//this pattern can only be called by another (i.e. it's not an entry point in execution)

		for (Object tableColumnsListParameterParameter : tableColumnsListParameterList) {
			for (Object sectionTitleParameterParameter : sectionTitleParameterList) {
				for (Object sectionLevelParameterParameter : sectionLevelParameterList) {

					this.tableColumnsListParameter = (java.util.Collection) tableColumnsListParameterParameter;
					this.sectionTitleParameter = (java.lang.String) sectionTitleParameterParameter;
					this.sectionLevelParameter = (java.lang.Integer) sectionLevelParameterParameter;

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

		stringBuffer.append(TEXT_5);
		stringBuffer.append(TEXT_5);
		return stringBuffer.toString();
	}

	public String orchestration(PatternContext ctx) throws Exception {
		InternalPatternContext ictx = (InternalPatternContext) ctx;

		super.orchestration(new SuperOrchestrationContext(ictx));

		method_body(new StringBuffer(), ictx);

		if (ictx.useReporter()) {
			Map<String, Object> parameterValues = new HashMap<String, Object>();
			parameterValues.put("tableColumnsListParameter", this.tableColumnsListParameter);
			parameterValues.put("sectionTitleParameter", this.sectionTitleParameter);
			parameterValues.put("sectionLevelParameter", this.sectionLevelParameter);
			String outputWithCallBack = OutputManager.computeLoopOutput(ictx);
			String loop = OutputManager.computeLoopOutputWithoutCallback(ictx);
			ictx.getReporter().loopFinished(loop, outputWithCallBack, ictx, parameterValues);
		}
		return null;
	}

	protected java.util.Collection tableColumnsListParameter = null;

	public void set_tableColumnsListParameter(java.util.Collection object) {
		this.tableColumnsListParameter = object;
	}

	public Map<String, Object> getParameters() {
		final Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("tableColumnsListParameter", this.tableColumnsListParameter);
		parameters.put("sectionTitleParameter", this.sectionTitleParameter);
		parameters.put("sectionLevelParameter", this.sectionLevelParameter);
		return parameters;
	}

	protected void method_body(final StringBuffer stringBuffer, final PatternContext ctx) throws Exception {

		stringBuffer.append(TEXT_1);

		Collection<String> columns = (Collection<String>) tableColumnsListParameter;
		for (String column : columns) {

			stringBuffer.append(TEXT_2);
			stringBuffer.append(column);
			stringBuffer.append(TEXT_3);

		}

		stringBuffer.append(TEXT_4);
		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "body", stringBuffer.toString());
	}
}