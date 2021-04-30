//Generated with EGF 1.6.2.202001031546
package org.polarsys.capella.docgen.sections.display;

import java.util.*;
import org.eclipse.egf.model.pattern.*;
import org.eclipse.egf.pattern.execution.*;
import org.eclipse.egf.pattern.query.*;

public class TitleSection {
	protected static String nl;

	public static synchronized TitleSection create(String lineSeparator) {
		nl = lineSeparator;
		TitleSection result = new TitleSection();
		nl = null;
		return result;
	}

	public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
	protected final String TEXT_1 = "<h";
	protected final String TEXT_2 = ">";
	protected final String TEXT_3 = "</h";
	protected final String TEXT_4 = ">" + NL;
	protected final String TEXT_5 = NL;

	public TitleSection() {
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

		List<Object> sectionTitleParameterList = null;
		//this pattern can only be called by another (i.e. it's not an entry point in execution)
		List<Object> sectionLevelParameterList = null;
		//this pattern can only be called by another (i.e. it's not an entry point in execution)

		for (Object sectionTitleParameterParameter : sectionTitleParameterList) {
			for (Object sectionLevelParameterParameter : sectionLevelParameterList) {

				this.sectionTitleParameter = (java.lang.String) sectionTitleParameterParameter;
				this.sectionLevelParameter = (java.lang.Integer) sectionLevelParameterParameter;

				if (preCondition(ctx)) {
					ctx.setNode(new Node.Container(currentNode, getClass()));
					orchestration(ctx);
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

		method_title(new StringBuffer(), ictx);

		if (ictx.useReporter()) {
			Map<String, Object> parameterValues = new HashMap<String, Object>();
			parameterValues.put("sectionTitleParameter", this.sectionTitleParameter);
			parameterValues.put("sectionLevelParameter", this.sectionLevelParameter);
			String outputWithCallBack = OutputManager.computeLoopOutput(ictx);
			String loop = OutputManager.computeLoopOutputWithoutCallback(ictx);
			ictx.getReporter().loopFinished(loop, outputWithCallBack, ictx, parameterValues);
		}
		return null;
	}

	protected java.lang.String sectionTitleParameter = null;

	public void set_sectionTitleParameter(java.lang.String object) {
		this.sectionTitleParameter = object;
	}

	protected java.lang.Integer sectionLevelParameter = null;

	public void set_sectionLevelParameter(java.lang.Integer object) {
		this.sectionLevelParameter = object;
	}

	public Map<String, Object> getParameters() {
		final Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("sectionTitleParameter", this.sectionTitleParameter);
		parameters.put("sectionLevelParameter", this.sectionLevelParameter);
		return parameters;
	}

	protected void method_title(final StringBuffer stringBuffer, final PatternContext ctx) throws Exception {

		stringBuffer.append(TEXT_1);
		stringBuffer.append(sectionLevelParameter);
		stringBuffer.append(TEXT_2);
		stringBuffer.append(sectionTitleParameter);
		stringBuffer.append(TEXT_3);
		stringBuffer.append(sectionLevelParameter);
		stringBuffer.append(TEXT_4);
		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "title", stringBuffer.toString());
	}

	public boolean preCondition(PatternContext ctx) throws Exception {
		return true;
	}
}