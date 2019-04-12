//Generated with EGF 1.5.1.v20180423-0901
package org.polarsys.capella.docgen.foundations;

import org.eclipse.egf.common.helper.*;
import java.util.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.egf.model.pattern.*;
import org.eclipse.egf.pattern.execution.*;
import org.eclipse.egf.pattern.query.*;

public class SummaryGenerate extends org.polarsys.kitalpha.doc.gen.business.core.generic.ElementGenerateByPropterty {
	protected static String nl;

	public static synchronized SummaryGenerate create(String lineSeparator) {
		nl = lineSeparator;
		SummaryGenerate result = new SummaryGenerate();
		nl = null;
		return result;
	}

	public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
	protected final String TEXT_1 = "<em>";
	protected final String TEXT_2 = "</em>";
	protected final String TEXT_3 = NL;
	protected final String TEXT_4 = NL;

	public SummaryGenerate() {
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
		List<Object> propertyList = null;
		//this pattern can only be called by another (i.e. it's not an entry point in execution)
		List<Object> titleList = null;
		//this pattern can only be called by another (i.e. it's not an entry point in execution)
		List<Object> eObjectList = null;
		//this pattern can only be called by another (i.e. it's not an entry point in execution)

		for (Object elementParameter : elementList) {
			for (Object propertyParameter : propertyList) {
				for (Object titleParameter : titleList) {
					for (Object eObjectParameter : eObjectList) {

						this.element = (org.polarsys.capella.core.data.capellacore.CapellaElement) elementParameter;
						this.property = (java.lang.String) propertyParameter;
						this.title = (java.lang.String) titleParameter;
						this.eObject = (org.eclipse.emf.ecore.EObject) eObjectParameter;

						if (preCondition(ctx)) {
							ctx.setNode(new Node.Container(currentNode, getClass()));
							orchestration(ctx);
						}

					}
				}
			}
		}
		ctx.setNode(currentNode);
		if (ctx.useReporter()) {
			ctx.getReporter().executionFinished(OutputManager.computeExecutionOutput(ctx), ctx);
		}

		stringBuffer.append(TEXT_3);
		stringBuffer.append(TEXT_4);
		return stringBuffer.toString();
	}

	public String orchestration(PatternContext ctx) throws Exception {
		InternalPatternContext ictx = (InternalPatternContext) ctx;

		super.orchestration(new SuperOrchestrationContext(ictx));

		if (ictx.useReporter()) {
			Map<String, Object> parameterValues = new HashMap<String, Object>();
			parameterValues.put("element", this.element);
			parameterValues.put("property", this.property);
			parameterValues.put("title", this.title);
			parameterValues.put("eObject", this.eObject);
			String outputWithCallBack = OutputManager.computeLoopOutput(ictx);
			String loop = OutputManager.computeLoopOutputWithoutCallback(ictx);
			ictx.getReporter().loopFinished(loop, outputWithCallBack, ictx, parameterValues);
		}
		return null;
	}

	protected org.polarsys.capella.core.data.capellacore.CapellaElement element = null;

	public void set_element(org.polarsys.capella.core.data.capellacore.CapellaElement object) {
		this.element = object;
	}

	public Map<String, Object> getParameters() {
		final Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("element", this.element);
		parameters.put("property", this.property);
		parameters.put("title", this.title);
		parameters.put("eObject", this.eObject);
		return parameters;
	}

	protected void method_openDescription(final StringBuffer stringBuffer, final PatternContext ctx) throws Exception {

		stringBuffer.append(TEXT_1);
		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "openDescription", stringBuffer.toString());
	}

	protected void method_closeDescription(final StringBuffer stringBuffer, final PatternContext ctx) throws Exception {

		stringBuffer.append(TEXT_2);
		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "closeDescription", stringBuffer.toString());
	}
}