//Generated with EGF 1.5.1.v20180423-0901
package org.polarsys.capella.docgen.content;

import org.eclipse.egf.common.helper.*;
import java.util.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.egf.model.pattern.*;
import org.eclipse.egf.pattern.execution.*;
import org.eclipse.egf.pattern.query.*;
import org.polarsys.capella.docgen.util.GeneralizableElementServices;
import org.polarsys.capella.docgen.util.StringUtil;

public class GeneralizableElementDocGen extends org.polarsys.capella.docgen.foundations.NamedElementDocGen {
	protected static String nl;

	public static synchronized GeneralizableElementDocGen create(String lineSeparator) {
		nl = lineSeparator;
		GeneralizableElementDocGen result = new GeneralizableElementDocGen();
		nl = null;
		return result;
	}

	public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
	protected final String TEXT_1 = "";
	protected final String TEXT_2 = NL + "<h2>Inheriting from</h2>";
	protected final String TEXT_3 = NL;
	protected final String TEXT_4 = NL;
	protected final String TEXT_5 = NL;
	protected final String TEXT_6 = NL + "<div title=\"Inherited by\">";
	protected final String TEXT_7 = NL;
	protected final String TEXT_8 = NL;
	protected final String TEXT_9 = NL + "</div>";
	protected final String TEXT_10 = NL;
	protected final String TEXT_11 = NL;

	public GeneralizableElementDocGen() {
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

			this.parameter = (org.polarsys.capella.core.data.capellacore.GeneralizableElement) parameterParameter;

			if (preCondition(ctx)) {
				ctx.setNode(new Node.Container(currentNode, getClass()));
				orchestration(ctx);
			}

		}
		ctx.setNode(currentNode);
		if (ctx.useReporter()) {
			ctx.getReporter().executionFinished(OutputManager.computeExecutionOutput(ctx), ctx);
		}

		stringBuffer.append(TEXT_10);
		stringBuffer.append(TEXT_11);
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

	protected org.polarsys.capella.core.data.capellacore.GeneralizableElement parameter = null;

	public void set_parameter(org.polarsys.capella.core.data.capellacore.GeneralizableElement object) {
		this.parameter = object;
	}

	public Map<String, Object> getParameters() {
		final Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("parameter", this.parameter);
		return parameters;
	}

	protected void method_setCapellaContext(final StringBuffer stringBuffer, final PatternContext ctx)
			throws Exception {

		element = parameter;

		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "setCapellaContext", stringBuffer.toString());
	}

	protected void method_content(final StringBuffer stringBuffer, final PatternContext ctx) throws Exception {

		super.method_content(new StringBuffer(), ctx);
		String projectName = ctx.getValue("projectName").toString();
		String outputFolder = ctx.getValue("outputFolder").toString();

		stringBuffer.append(TEXT_1);

		Collection<String> inheritingFromCollection = GeneralizableElementServices.getClassInheritingFrom(element,
				projectName, outputFolder);
		if (inheritingFromCollection.size() >= 1) {
			stringBuffer.append(TEXT_2);
			stringBuffer.append(TEXT_3);
			stringBuffer.append(StringUtil.stringListToBulette(inheritingFromCollection));
			stringBuffer.append(TEXT_4);
		}
		stringBuffer.append(TEXT_5);

		Collection<String> inheritedByCollection = GeneralizableElementServices.getClassInheritedBy(element,
				projectName, outputFolder);
		if (inheritedByCollection.size() >= 1) {
			stringBuffer.append(TEXT_6);
			String inheritedBy = "Inherited by";
			stringBuffer.append(TEXT_7);
			{
				//<%@ egf:patternCall patternId="platform:/plugin/org.polarsys.kitalpha.doc.gen.business.core/egf/HTMLDocGenCommon.fcore#LogicalName=org.polarsys.kitalpha.doc.gen.business.core.generic.ElementGenerateByPropterty" args="element:eObject,inheritedBy:property"%>

				InternalPatternContext ictx = (InternalPatternContext) ctx;
				new Node.DataLeaf(ictx.getNode(), getClass(), null, stringBuffer.toString());
				stringBuffer.setLength(0);

				final Map<String, Object> callParameters = new HashMap<String, Object>();
				callParameters.put("eObject", element);
				callParameters.put("property", inheritedBy);
				CallHelper.executeWithParameterInjection(
						"platform:/plugin/org.polarsys.kitalpha.doc.gen.business.core/egf/HTMLDocGenCommon.fcore#_cWGxMONUEd-euK0PeLuaMA",
						new ExecutionContext((InternalPatternContext) ctx), callParameters);
				stringBuffer.setLength(0);
			}

			stringBuffer.append(TEXT_8);
			stringBuffer.append(StringUtil.stringListToBulette(inheritedByCollection));
			stringBuffer.append(TEXT_9);
		}
		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "content", stringBuffer.toString());
	}
}