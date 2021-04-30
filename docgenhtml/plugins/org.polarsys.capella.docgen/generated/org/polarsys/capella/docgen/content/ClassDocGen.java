//Generated with EGF 1.6.2.202001031546
package org.polarsys.capella.docgen.content;

import java.util.*;
import org.eclipse.egf.model.pattern.*;
import org.eclipse.egf.pattern.execution.*;
import org.eclipse.egf.pattern.query.*;
import org.polarsys.capella.docgen.util.CapellaServices;
import org.polarsys.capella.core.data.capellacore.VisibilityKind;
import org.polarsys.capella.core.data.information.Class;

public class ClassDocGen extends org.polarsys.capella.docgen.content.ClassifierDocGen {
	protected static String nl;

	public static synchronized ClassDocGen create(String lineSeparator) {
		nl = lineSeparator;
		ClassDocGen result = new ClassDocGen();
		nl = null;
		return result;
	}

	public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
	protected final String TEXT_1 = "";
	protected final String TEXT_2 = NL;

	public ClassDocGen() {
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

		stringBuffer.append(TEXT_2);
		stringBuffer.append(TEXT_2);
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

	protected java.lang.String projectName = null;

	public void set_projectName(java.lang.String object) {
		this.projectName = object;
	}

	protected java.lang.String outputFolder = null;

	public void set_outputFolder(java.lang.String object) {
		this.outputFolder = object;
	}

	public Map<String, Object> getParameters() {
		final Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("parameter", this.parameter);
		return parameters;
	}

	protected void method_content(final StringBuffer stringBuffer, final PatternContext ctx) throws Exception {

		super.method_content(new StringBuffer(), ctx);

		stringBuffer.append(TEXT_1);
		stringBuffer.append(TEXT_2);
		{
			//<%@ egf:patternCall patternId="platform:/plugin/org.polarsys.capella.docgen/egf/HTMLDocGenCapella.fcore#LogicalName=org.polarsys.capella.docgen.sections.classes.Class_Features" args="element:parameter, projectName:projectNameParameter, outputFolder:outputFolderParameter"%>

			InternalPatternContext ictx = (InternalPatternContext) ctx;
			new Node.DataLeaf(ictx.getNode(), getClass(), null, stringBuffer.toString());
			stringBuffer.setLength(0);

			final Map<String, Object> callParameters = new HashMap<String, Object>();
			callParameters.put("parameter", element);
			callParameters.put("projectNameParameter", projectName);
			callParameters.put("outputFolderParameter", outputFolder);
			CallHelper.executeWithParameterInjection(
					"platform:/plugin/org.polarsys.capella.docgen/egf/HTMLDocGenCapella.fcore#_q7iGkKnUEeux98xBZ-sHgw",
					new ExecutionContext((InternalPatternContext) ctx), callParameters);
			stringBuffer.setLength(0);
		}

		stringBuffer.append(TEXT_2);
		stringBuffer.append(TEXT_2);
		{
			//<%@ egf:patternCall patternId="platform:/plugin/org.polarsys.capella.docgen/egf/HTMLDocGenCapella.fcore#LogicalName=org.polarsys.capella.docgen.sections.classes.Class_Realisation" args="element:parameter, projectName:projectNameParameter, outputFolder:outputFolderParameter"%>

			InternalPatternContext ictx = (InternalPatternContext) ctx;
			new Node.DataLeaf(ictx.getNode(), getClass(), null, stringBuffer.toString());
			stringBuffer.setLength(0);

			final Map<String, Object> callParameters = new HashMap<String, Object>();
			callParameters.put("parameter", element);
			callParameters.put("projectNameParameter", projectName);
			callParameters.put("outputFolderParameter", outputFolder);
			CallHelper.executeWithParameterInjection(
					"platform:/plugin/org.polarsys.capella.docgen/egf/HTMLDocGenCapella.fcore#_PQROgKnWEeux98xBZ-sHgw",
					new ExecutionContext((InternalPatternContext) ctx), callParameters);
			stringBuffer.setLength(0);
		}

		stringBuffer.append(TEXT_2);
		stringBuffer.append(TEXT_2);
		{
			//<%@ egf:patternCall patternId="platform:/plugin/org.polarsys.capella.docgen/egf/HTMLDocGenCapella.fcore#LogicalName=org.polarsys.capella.docgen.sections.classes.Class_Properties" args="element:parameter, projectName:projectNameParameter, outputFolder:outputFolderParameter"%>

			InternalPatternContext ictx = (InternalPatternContext) ctx;
			new Node.DataLeaf(ictx.getNode(), getClass(), null, stringBuffer.toString());
			stringBuffer.setLength(0);

			final Map<String, Object> callParameters = new HashMap<String, Object>();
			callParameters.put("parameter", element);
			callParameters.put("projectNameParameter", projectName);
			callParameters.put("outputFolderParameter", outputFolder);
			CallHelper.executeWithParameterInjection(
					"platform:/plugin/org.polarsys.capella.docgen/egf/HTMLDocGenCapella.fcore#_Pir0MKnWEeux98xBZ-sHgw",
					new ExecutionContext((InternalPatternContext) ctx), callParameters);
			stringBuffer.setLength(0);
		}

		stringBuffer.append(TEXT_2);
		stringBuffer.append(TEXT_2);
		{
			//<%@ egf:patternCall patternId="platform:/plugin/org.polarsys.capella.docgen/egf/HTMLDocGenCapella.fcore#LogicalName=org.polarsys.capella.docgen.sections.classes.Class_Operations" args="element:parameter, projectName:projectNameParameter, outputFolder:outputFolderParameter"%>

			InternalPatternContext ictx = (InternalPatternContext) ctx;
			new Node.DataLeaf(ictx.getNode(), getClass(), null, stringBuffer.toString());
			stringBuffer.setLength(0);

			final Map<String, Object> callParameters = new HashMap<String, Object>();
			callParameters.put("parameter", element);
			callParameters.put("projectNameParameter", projectName);
			callParameters.put("outputFolderParameter", outputFolder);
			CallHelper.executeWithParameterInjection(
					"platform:/plugin/org.polarsys.capella.docgen/egf/HTMLDocGenCapella.fcore#_Prw3sKnWEeux98xBZ-sHgw",
					new ExecutionContext((InternalPatternContext) ctx), callParameters);
			stringBuffer.setLength(0);
		}

		stringBuffer.append(TEXT_2);
		stringBuffer.append(TEXT_2);
		{
			//<%@ egf:patternCall patternId="platform:/plugin/org.polarsys.capella.docgen/egf/HTMLDocGenCapella.fcore#LogicalName=org.polarsys.capella.docgen.sections.classes.Class_DataValues" args="element:parameter, projectName:projectNameParameter, outputFolder:outputFolderParameter"%>

			InternalPatternContext ictx = (InternalPatternContext) ctx;
			new Node.DataLeaf(ictx.getNode(), getClass(), null, stringBuffer.toString());
			stringBuffer.setLength(0);

			final Map<String, Object> callParameters = new HashMap<String, Object>();
			callParameters.put("parameter", element);
			callParameters.put("projectNameParameter", projectName);
			callParameters.put("outputFolderParameter", outputFolder);
			CallHelper.executeWithParameterInjection(
					"platform:/plugin/org.polarsys.capella.docgen/egf/HTMLDocGenCapella.fcore#_P05lkKnWEeux98xBZ-sHgw",
					new ExecutionContext((InternalPatternContext) ctx), callParameters);
			stringBuffer.setLength(0);
		}

		stringBuffer.append(TEXT_2);
		stringBuffer.append(TEXT_2);
		{
			//<%@ egf:patternCall patternId="platform:/plugin/org.polarsys.capella.docgen/egf/HTMLDocGenCapella.fcore#LogicalName=org.polarsys.capella.docgen.sections.classes.Class_PartOf" args="parameter:parameter, projectName:projectNameParameter, outputFolder:outputFolderParameter"%>

			InternalPatternContext ictx = (InternalPatternContext) ctx;
			new Node.DataLeaf(ictx.getNode(), getClass(), null, stringBuffer.toString());
			stringBuffer.setLength(0);

			final Map<String, Object> callParameters = new HashMap<String, Object>();
			callParameters.put("parameter", parameter);
			callParameters.put("projectNameParameter", projectName);
			callParameters.put("outputFolderParameter", outputFolder);
			CallHelper.executeWithParameterInjection(
					"platform:/plugin/org.polarsys.capella.docgen/egf/HTMLDocGenCapella.fcore#_zK6ccKnMEeux98xBZ-sHgw",
					new ExecutionContext((InternalPatternContext) ctx), callParameters);
			stringBuffer.setLength(0);
		}

		stringBuffer.append(TEXT_2);
		stringBuffer.append(TEXT_2);
		{
			//<%@ egf:patternCall patternId="platform:/plugin/org.polarsys.capella.docgen/egf/HTMLDocGenCapella.fcore#LogicalName=org.polarsys.capella.docgen.sections.classes.Class_ReferencedBy" args="parameter:parameter, projectName:projectNameParameter, outputFolder:outputFolderParameter"%>

			InternalPatternContext ictx = (InternalPatternContext) ctx;
			new Node.DataLeaf(ictx.getNode(), getClass(), null, stringBuffer.toString());
			stringBuffer.setLength(0);

			final Map<String, Object> callParameters = new HashMap<String, Object>();
			callParameters.put("parameter", parameter);
			callParameters.put("projectNameParameter", projectName);
			callParameters.put("outputFolderParameter", outputFolder);
			CallHelper.executeWithParameterInjection(
					"platform:/plugin/org.polarsys.capella.docgen/egf/HTMLDocGenCapella.fcore#_UFoKAKnNEeux98xBZ-sHgw",
					new ExecutionContext((InternalPatternContext) ctx), callParameters);
			stringBuffer.setLength(0);
		}

		stringBuffer.append(TEXT_2);
		stringBuffer.append(TEXT_2);
		{
			//<%@ egf:patternCall patternId="platform:/plugin/org.polarsys.capella.docgen/egf/HTMLDocGenCapella.fcore#LogicalName=org.polarsys.capella.docgen.sections.classes.Class_ParameterOf" args="parameter:parameter, projectName:projectNameParameter, outputFolder:outputFolderParameter"%>

			InternalPatternContext ictx = (InternalPatternContext) ctx;
			new Node.DataLeaf(ictx.getNode(), getClass(), null, stringBuffer.toString());
			stringBuffer.setLength(0);

			final Map<String, Object> callParameters = new HashMap<String, Object>();
			callParameters.put("parameter", parameter);
			callParameters.put("projectNameParameter", projectName);
			callParameters.put("outputFolderParameter", outputFolder);
			CallHelper.executeWithParameterInjection(
					"platform:/plugin/org.polarsys.capella.docgen/egf/HTMLDocGenCapella.fcore#_UU0ckKnNEeux98xBZ-sHgw",
					new ExecutionContext((InternalPatternContext) ctx), callParameters);
			stringBuffer.setLength(0);
		}

		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "content", stringBuffer.toString());
	}

	protected void method_setTitle(final StringBuffer stringBuffer, final PatternContext ctx) throws Exception {

		String visibility = "";
		if (((Class) element).getVisibility().getValue() != VisibilityKind.UNSET_VALUE)
			visibility = "{" + ((Class) element).getVisibility().getLiteral().toLowerCase() + "} ";
		String type = element.eClass().getName();
		String elementFullName = CapellaServices.getHyperlinkFromElement(element);
		documentTitle = "<span class=\"elementMetaClass\">" + visibility + "</span> " + elementFullName;

		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "setTitle", stringBuffer.toString());
	}

	protected void method_setCapellaContext(final StringBuffer stringBuffer, final PatternContext ctx)
			throws Exception {

		super.method_setCapellaContext(new StringBuffer(), ctx);
		projectName = ctx.getValue("projectName").toString();
		outputFolder = ctx.getValue("outputFolder").toString();

		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "setCapellaContext", stringBuffer.toString());
	}

	public boolean preCondition(PatternContext ctx) throws Exception {
		return (this.parameter instanceof Class);
	}
}