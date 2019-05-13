//Generated with EGF 1.5.1.v20180423-0901
package org.polarsys.capella.docgen.content;

import org.eclipse.egf.common.helper.*;
import java.util.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.egf.model.pattern.*;
import org.eclipse.egf.pattern.execution.*;
import org.eclipse.egf.pattern.query.*;
import org.polarsys.capella.core.data.capellacore.VisibilityKind;
import org.polarsys.capella.core.data.information.AggregationKind;
import org.polarsys.capella.docgen.util.DataValuePkgService;
import org.polarsys.capella.docgen.util.CapellaCollectionService;
import org.polarsys.capella.docgen.util.CapellaServices;
import org.polarsys.capella.docgen.util.StringUtil;
import org.polarsys.capella.core.data.capellacore.Type;

public class CollectionDocGen extends org.polarsys.capella.docgen.content.ClassifierDocGen {
	protected static String nl;

	public static synchronized CollectionDocGen create(String lineSeparator) {
		nl = lineSeparator;
		CollectionDocGen result = new CollectionDocGen();
		nl = null;
		return result;
	}

	public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
	protected final String TEXT_1 = "";
	protected final String TEXT_2 = NL + "<div title=\"Element\">";
	protected final String TEXT_3 = NL;
	protected final String TEXT_4 = NL;
	protected final String TEXT_5 = NL + "</div>";
	protected final String TEXT_6 = NL + "<div title=\"Indexed By\">";
	protected final String TEXT_7 = NL;
	protected final String TEXT_8 = NL;
	protected final String TEXT_9 = NL + "</div>";
	protected final String TEXT_10 = NL + "<div title=\"Features\">";
	protected final String TEXT_11 = NL;
	protected final String TEXT_12 = NL;
	protected final String TEXT_13 = NL + "</div>";
	protected final String TEXT_14 = NL + "<div title=\"Data Values\">";
	protected final String TEXT_15 = NL;
	protected final String TEXT_16 = NL;
	protected final String TEXT_17 = NL + "</div>";
	protected final String TEXT_18 = NL;
	protected final String TEXT_19 = NL;

	public CollectionDocGen() {
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

		stringBuffer.append(TEXT_18);
		stringBuffer.append(TEXT_19);
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
		if (CapellaCollectionService.getCollectionElements(element).size() >= 1) {
			stringBuffer.append(TEXT_2);
			String elem = "Element";
			stringBuffer.append(TEXT_3);
			{
				//<%@ egf:patternCall patternId="platform:/plugin/org.polarsys.kitalpha.doc.gen.business.core/egf/HTMLDocGenCommon.fcore#LogicalName=org.polarsys.kitalpha.doc.gen.business.core.generic.ElementGenerateByPropterty" args="element:eObject,elem:property"%>

				InternalPatternContext ictx = (InternalPatternContext) ctx;
				new Node.DataLeaf(ictx.getNode(), getClass(), null, stringBuffer.toString());
				stringBuffer.setLength(0);

				final Map<String, Object> callParameters = new HashMap<String, Object>();
				callParameters.put("eObject", element);
				callParameters.put("property", elem);
				CallHelper.executeWithParameterInjection(
						"platform:/plugin/org.polarsys.kitalpha.doc.gen.business.core/egf/HTMLDocGenCommon.fcore#_cWGxMONUEd-euK0PeLuaMA",
						new ExecutionContext((InternalPatternContext) ctx), callParameters);
				stringBuffer.setLength(0);
			}

			stringBuffer.append(TEXT_4);
			stringBuffer
					.append(StringUtil.stringListToBulette(CapellaCollectionService.getCollectionElements(element)));
			stringBuffer.append(TEXT_5);
		}

		Collection<String> indexedByCollection = CapellaCollectionService.getIndexedBy(
				(org.polarsys.capella.core.data.information.Collection) element, projectName, outputFolder);
		if (indexedByCollection.size() >= 1) {
			stringBuffer.append(TEXT_6);
			String propertyValue = "Index";
			stringBuffer.append(TEXT_7);
			{
				//<%@ egf:patternCall patternId="platform:/plugin/org.polarsys.kitalpha.doc.gen.business.core/egf/HTMLDocGenCommon.fcore#LogicalName=org.polarsys.kitalpha.doc.gen.business.core.generic.ElementGenerateByPropterty" args="element:eObject,propertyValue:property"%>

				InternalPatternContext ictx = (InternalPatternContext) ctx;
				new Node.DataLeaf(ictx.getNode(), getClass(), null, stringBuffer.toString());
				stringBuffer.setLength(0);

				final Map<String, Object> callParameters = new HashMap<String, Object>();
				callParameters.put("eObject", element);
				callParameters.put("property", propertyValue);
				CallHelper.executeWithParameterInjection(
						"platform:/plugin/org.polarsys.kitalpha.doc.gen.business.core/egf/HTMLDocGenCommon.fcore#_cWGxMONUEd-euK0PeLuaMA",
						new ExecutionContext((InternalPatternContext) ctx), callParameters);
				stringBuffer.setLength(0);
			}

			stringBuffer.append(TEXT_8);
			stringBuffer.append(StringUtil.stringListToBulette(indexedByCollection));
			stringBuffer.append(TEXT_9);
		}

		if (CapellaCollectionService.getCollectionFeatures(element).size() >= 1) {
			stringBuffer.append(TEXT_10);
			String features = "Features";
			stringBuffer.append(TEXT_11);
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

			stringBuffer.append(TEXT_12);
			stringBuffer
					.append(StringUtil.stringListToBulette(CapellaCollectionService.getCollectionFeatures(element)));
			stringBuffer.append(TEXT_13);
		}

		if (DataValuePkgService.getDataValues(element, projectName, outputFolder).size() >= 1) {
			stringBuffer.append(TEXT_14);
			String dataValue = "Data Values";
			stringBuffer.append(TEXT_15);
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

			stringBuffer.append(TEXT_16);
			stringBuffer.append(StringUtil
					.stringListToBulette(DataValuePkgService.getDataValues(element, projectName, outputFolder)));
			stringBuffer.append(TEXT_17);
		}
		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "content", stringBuffer.toString());
	}

	protected void method_setTitle(final StringBuffer stringBuffer, final PatternContext ctx) throws Exception {

		String visibility = "";
		String aggregation = "";
		String kind = "";
		String collectionTypeString = "";

		if (((org.polarsys.capella.core.data.information.Collection) element).getVisibility()
				.getValue() != VisibilityKind.UNSET_VALUE)
			visibility = "{" + ((org.polarsys.capella.core.data.information.Collection) element).getVisibility()
					.getLiteral().toLowerCase() + "} ";

		if (((org.polarsys.capella.core.data.information.Collection) element).getAggregationKind()
				.getValue() != AggregationKind.UNSET_VALUE)
			aggregation = "{" + ((org.polarsys.capella.core.data.information.Collection) element).getAggregationKind()
					.getLiteral().toLowerCase() + "} ";

		kind = "{"
				+ ((org.polarsys.capella.core.data.information.Collection) element).getKind().getLiteral().toLowerCase()
				+ "} ";

		Type collectionType = ((org.polarsys.capella.core.data.information.Collection) element).getType();
		if (collectionType != null)
			collectionTypeString = " of " + CapellaServices.getFullDataPkgHierarchyLink(collectionType);

		String type = element.eClass().getName();
		String elementFullName = CapellaServices.getHyperlinkFromElement(element);
		documentTitle = visibility + aggregation + kind + " " + elementFullName + collectionTypeString;

		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "setTitle", stringBuffer.toString());
	}

	public boolean preCondition(PatternContext ctx) throws Exception {
		return (this.parameter instanceof org.polarsys.capella.core.data.information.Collection);
	}
}