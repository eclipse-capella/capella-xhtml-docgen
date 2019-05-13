//Generated with EGF 1.5.1.v20180423-0901
package org.polarsys.capella.docgen.content;

import org.eclipse.egf.common.helper.*;
import java.util.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.egf.model.pattern.*;
import org.eclipse.egf.pattern.execution.*;
import org.eclipse.egf.pattern.query.*;
import java.util.Collection;
import org.polarsys.capella.docgen.util.CapellaClassServices;
import org.polarsys.capella.docgen.util.CapellaServices;
import org.polarsys.capella.docgen.util.StringUtil;
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
	protected final String TEXT_2 = NL + "<div title=\"Features\">";
	protected final String TEXT_3 = NL;
	protected final String TEXT_4 = NL;
	protected final String TEXT_5 = NL + "</div>";
	protected final String TEXT_6 = NL;
	protected final String TEXT_7 = NL + "<div title=\"Realisation\">";
	protected final String TEXT_8 = NL;
	protected final String TEXT_9 = NL;
	protected final String TEXT_10 = NL + "</div>";
	protected final String TEXT_11 = NL;
	protected final String TEXT_12 = NL + "<div title=\"Properties\">";
	protected final String TEXT_13 = NL;
	protected final String TEXT_14 = NL;
	protected final String TEXT_15 = NL + "</div>";
	protected final String TEXT_16 = NL + " ";
	protected final String TEXT_17 = NL + " <div title=\"Operations\">";
	protected final String TEXT_18 = NL;
	protected final String TEXT_19 = NL;
	protected final String TEXT_20 = NL + "</div>";
	protected final String TEXT_21 = NL;
	protected final String TEXT_22 = NL + "<div title=\"Data Values\">";
	protected final String TEXT_23 = NL;
	protected final String TEXT_24 = NL;
	protected final String TEXT_25 = NL + "</div>";
	protected final String TEXT_26 = NL;
	protected final String TEXT_27 = NL + "<h2>Part Of</h2>";
	protected final String TEXT_28 = NL;
	protected final String TEXT_29 = NL + "<h2>Referenced By</h2>";
	protected final String TEXT_30 = NL;
	protected final String TEXT_31 = NL + "<h2>Parameter Of</h2>";
	protected final String TEXT_32 = NL;
	protected final String TEXT_33 = NL;
	protected final String TEXT_34 = NL;

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

		stringBuffer.append(TEXT_33);
		stringBuffer.append(TEXT_34);
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

	public Map<String, Object> getParameters() {
		final Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("parameter", this.parameter);
		return parameters;
	}

	protected void method_content(final StringBuffer stringBuffer, final PatternContext ctx) throws Exception {

		super.method_content(new StringBuffer(), ctx);
		String projectName = ctx.getValue("projectName").toString();
		String outputFolder = ctx.getValue("outputFolder").toString();

		stringBuffer.append(TEXT_1);
		if (CapellaClassServices.getClassFeatures(element).size() >= 1) {
			stringBuffer.append(TEXT_2);
			String features = "Features";
			stringBuffer.append(TEXT_3);
			{
				//<%@ egf:patternCall patternId="platform:/plugin/org.polarsys.kitalpha.doc.gen.business.core/egf/HTMLDocGenCommon.fcore#LogicalName=org.polarsys.kitalpha.doc.gen.business.core.generic.ElementGenerateByPropterty" args="element:eObject,features:property"%>

				InternalPatternContext ictx = (InternalPatternContext) ctx;
				new Node.DataLeaf(ictx.getNode(), getClass(), null, stringBuffer.toString());
				stringBuffer.setLength(0);

				final Map<String, Object> callParameters = new HashMap<String, Object>();
				callParameters.put("eObject", element);
				callParameters.put("property", features);
				CallHelper.executeWithParameterInjection(
						"platform:/plugin/org.polarsys.kitalpha.doc.gen.business.core/egf/HTMLDocGenCommon.fcore#_cWGxMONUEd-euK0PeLuaMA",
						new ExecutionContext((InternalPatternContext) ctx), callParameters);
				stringBuffer.setLength(0);
			}

			stringBuffer.append(TEXT_4);
			stringBuffer.append(StringUtil.stringListToBulette(CapellaClassServices.getClassFeatures(element)));
			stringBuffer.append(TEXT_5);
		}
		stringBuffer.append(TEXT_6);
		if (CapellaClassServices.getClassRealizeInformation(element).size() >= 1) {
			stringBuffer.append(TEXT_7);
			String realisation = "Realisation";
			stringBuffer.append(TEXT_8);
			{
				//<%@ egf:patternCall patternId="platform:/plugin/org.polarsys.kitalpha.doc.gen.business.core/egf/HTMLDocGenCommon.fcore#LogicalName=org.polarsys.kitalpha.doc.gen.business.core.generic.ElementGenerateByPropterty" args="element:eObject,realisation:property"%>

				InternalPatternContext ictx = (InternalPatternContext) ctx;
				new Node.DataLeaf(ictx.getNode(), getClass(), null, stringBuffer.toString());
				stringBuffer.setLength(0);

				final Map<String, Object> callParameters = new HashMap<String, Object>();
				callParameters.put("eObject", element);
				callParameters.put("property", realisation);
				CallHelper.executeWithParameterInjection(
						"platform:/plugin/org.polarsys.kitalpha.doc.gen.business.core/egf/HTMLDocGenCommon.fcore#_cWGxMONUEd-euK0PeLuaMA",
						new ExecutionContext((InternalPatternContext) ctx), callParameters);
				stringBuffer.setLength(0);
			}

			stringBuffer.append(TEXT_9);
			stringBuffer
					.append(StringUtil.stringListToBulette(CapellaClassServices.getClassRealizeInformation(element)));
			stringBuffer.append(TEXT_10);
		}
		stringBuffer.append(TEXT_11);

		Collection<String> propertiesCollection = CapellaClassServices.getClassProperties(element, projectName,
				outputFolder);
		if (propertiesCollection.size() >= 1) {
			stringBuffer.append(TEXT_12);
			String properties = "Properties";
			stringBuffer.append(TEXT_13);
			{
				//<%@ egf:patternCall patternId="platform:/plugin/org.polarsys.kitalpha.doc.gen.business.core/egf/HTMLDocGenCommon.fcore#LogicalName=org.polarsys.kitalpha.doc.gen.business.core.generic.ElementGenerateByPropterty" args="element:eObject,properties:property"%>

				InternalPatternContext ictx = (InternalPatternContext) ctx;
				new Node.DataLeaf(ictx.getNode(), getClass(), null, stringBuffer.toString());
				stringBuffer.setLength(0);

				final Map<String, Object> callParameters = new HashMap<String, Object>();
				callParameters.put("eObject", element);
				callParameters.put("property", properties);
				CallHelper.executeWithParameterInjection(
						"platform:/plugin/org.polarsys.kitalpha.doc.gen.business.core/egf/HTMLDocGenCommon.fcore#_cWGxMONUEd-euK0PeLuaMA",
						new ExecutionContext((InternalPatternContext) ctx), callParameters);
				stringBuffer.setLength(0);
			}

			stringBuffer.append(TEXT_14);
			stringBuffer.append(StringUtil.stringListToBulette(propertiesCollection));
			stringBuffer.append(TEXT_15);
		}
		stringBuffer.append(TEXT_16);
		if (CapellaClassServices.getClassOperation(element).size() > 0) {
			stringBuffer.append(TEXT_17);
			String operation = "Operations";
			stringBuffer.append(TEXT_18);
			{
				//<%@ egf:patternCall patternId="platform:/plugin/org.polarsys.kitalpha.doc.gen.business.core/egf/HTMLDocGenCommon.fcore#LogicalName=org.polarsys.kitalpha.doc.gen.business.core.generic.ElementGenerateByPropterty" args="element:eObject,operation:property"%>

				InternalPatternContext ictx = (InternalPatternContext) ctx;
				new Node.DataLeaf(ictx.getNode(), getClass(), null, stringBuffer.toString());
				stringBuffer.setLength(0);

				final Map<String, Object> callParameters = new HashMap<String, Object>();
				callParameters.put("eObject", element);
				callParameters.put("property", operation);
				CallHelper.executeWithParameterInjection(
						"platform:/plugin/org.polarsys.kitalpha.doc.gen.business.core/egf/HTMLDocGenCommon.fcore#_cWGxMONUEd-euK0PeLuaMA",
						new ExecutionContext((InternalPatternContext) ctx), callParameters);
				stringBuffer.setLength(0);
			}

			stringBuffer.append(TEXT_19);
			stringBuffer.append(StringUtil.stringListToBulette(CapellaClassServices.getClassOperation(element)));
			stringBuffer.append(TEXT_20);
		}
		stringBuffer.append(TEXT_21);

		Collection<String> dataValuesCollection = CapellaClassServices.getClassDataValues(element, projectName,
				outputFolder);
		if (dataValuesCollection.size() >= 1) {
			stringBuffer.append(TEXT_22);
			String dataValue = "Data Values";
			stringBuffer.append(TEXT_23);
			{
				//<%@ egf:patternCall patternId="platform:/plugin/org.polarsys.kitalpha.doc.gen.business.core/egf/HTMLDocGenCommon.fcore#LogicalName=org.polarsys.kitalpha.doc.gen.business.core.generic.ElementGenerateByPropterty" args="element:eObject,dataValue:property"%>

				InternalPatternContext ictx = (InternalPatternContext) ctx;
				new Node.DataLeaf(ictx.getNode(), getClass(), null, stringBuffer.toString());
				stringBuffer.setLength(0);

				final Map<String, Object> callParameters = new HashMap<String, Object>();
				callParameters.put("eObject", element);
				callParameters.put("property", dataValue);
				CallHelper.executeWithParameterInjection(
						"platform:/plugin/org.polarsys.kitalpha.doc.gen.business.core/egf/HTMLDocGenCommon.fcore#_cWGxMONUEd-euK0PeLuaMA",
						new ExecutionContext((InternalPatternContext) ctx), callParameters);
				stringBuffer.setLength(0);
			}

			stringBuffer.append(TEXT_24);
			stringBuffer.append(StringUtil.stringListToBulette(dataValuesCollection));
			stringBuffer.append(TEXT_25);
		}
		stringBuffer.append(TEXT_26);
		Collection<String> partofCollection = CapellaClassServices.getPartOf((Class) element, projectName,
				outputFolder);
		if (partofCollection.size() > 0) {
			stringBuffer.append(TEXT_27);
			stringBuffer.append(TEXT_28);
			stringBuffer.append(StringUtil.stringListToBulette(partofCollection));
		}

		Collection<String> referencedByCollection = CapellaClassServices.getReferencedBy((Class) element, projectName,
				outputFolder);
		if (referencedByCollection.size() > 0) {
			stringBuffer.append(TEXT_29);
			stringBuffer.append(TEXT_30);
			stringBuffer.append(StringUtil.stringListToBulette(referencedByCollection));
		}

		Collection<String> parameterOfCollection = CapellaClassServices.getParameterOf((Class) element, projectName,
				outputFolder);
		if (parameterOfCollection.size() > 0) {
			stringBuffer.append(TEXT_31);
			stringBuffer.append(TEXT_32);
			stringBuffer.append(StringUtil.stringListToBulette(parameterOfCollection));
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

	public boolean preCondition(PatternContext ctx) throws Exception {
		return (this.parameter instanceof Class);
	}
}