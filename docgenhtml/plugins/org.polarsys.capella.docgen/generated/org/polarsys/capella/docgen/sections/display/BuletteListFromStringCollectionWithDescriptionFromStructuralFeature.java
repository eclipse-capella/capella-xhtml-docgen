//Generated with EGF 1.6.2.202001031546
package org.polarsys.capella.docgen.sections.display;

import java.util.*;
import org.eclipse.egf.model.pattern.*;
import org.eclipse.egf.pattern.execution.*;
import org.eclipse.egf.pattern.query.*;
import org.polarsys.capella.docgen.util.StringUtil;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.kitalpha.doc.gen.business.core.util.EscapeChars;

public class BuletteListFromStringCollectionWithDescriptionFromStructuralFeature
		extends org.polarsys.capella.docgen.sections.display.TitleSection {
	protected static String nl;

	public static synchronized BuletteListFromStringCollectionWithDescriptionFromStructuralFeature create(
			String lineSeparator) {
		nl = lineSeparator;
		BuletteListFromStringCollectionWithDescriptionFromStructuralFeature result = new BuletteListFromStringCollectionWithDescriptionFromStructuralFeature();
		nl = null;
		return result;
	}

	public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
	protected final String TEXT_1 = "<p>";
	protected final String TEXT_2 = NL;
	protected final String TEXT_3 = NL + "</p>";
	protected final String TEXT_4 = NL + "<p>";
	protected final String TEXT_5 = "<div title=\"";
	protected final String TEXT_6 = "\">";
	protected final String TEXT_7 = "</div>";

	public BuletteListFromStringCollectionWithDescriptionFromStructuralFeature() {
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

		List<Object> projectNameParameterList = null;
		//this pattern can only be called by another (i.e. it's not an entry point in execution)
		List<Object> outputFolderParameterList = null;
		//this pattern can only be called by another (i.e. it's not an entry point in execution)
		List<Object> parameterListParameterList = null;
		//this pattern can only be called by another (i.e. it's not an entry point in execution)
		List<Object> parameterList = null;
		//this pattern can only be called by another (i.e. it's not an entry point in execution)
		List<Object> structuralFeatureNameParameterList = null;
		//this pattern can only be called by another (i.e. it's not an entry point in execution)
		List<Object> sectionTitleParameterList = null;
		//this pattern can only be called by another (i.e. it's not an entry point in execution)
		List<Object> sectionLevelParameterList = null;
		//this pattern can only be called by another (i.e. it's not an entry point in execution)

		for (Object projectNameParameterParameter : projectNameParameterList) {
			for (Object outputFolderParameterParameter : outputFolderParameterList) {
				for (Object parameterListParameterParameter : parameterListParameterList) {
					for (Object parameterParameter : parameterList) {
						for (Object structuralFeatureNameParameterParameter : structuralFeatureNameParameterList) {
							for (Object sectionTitleParameterParameter : sectionTitleParameterList) {
								for (Object sectionLevelParameterParameter : sectionLevelParameterList) {

									this.projectNameParameter = (java.lang.String) projectNameParameterParameter;
									this.outputFolderParameter = (java.lang.String) outputFolderParameterParameter;
									this.parameterListParameter = (java.util.Collection) parameterListParameterParameter;
									this.parameter = (org.eclipse.emf.ecore.EObject) parameterParameter;
									this.structuralFeatureNameParameter = (java.lang.String) structuralFeatureNameParameterParameter;
									this.sectionTitleParameter = (java.lang.String) sectionTitleParameterParameter;
									this.sectionLevelParameter = (java.lang.Integer) sectionLevelParameterParameter;

									if (preCondition(ctx)) {
										ctx.setNode(new Node.Container(currentNode, getClass()));
										orchestration(ctx);
									}

								}
							}
						}
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

		method_openDiv(new StringBuffer(), ictx);
		super.orchestration(new SuperOrchestrationContext(ictx));

		method_descriptionContent(new StringBuffer(), ictx);

		method_body(new StringBuffer(), ictx);

		method_closeDiv(new StringBuffer(), ictx);

		if (ictx.useReporter()) {
			Map<String, Object> parameterValues = new HashMap<String, Object>();
			parameterValues.put("projectNameParameter", this.projectNameParameter);
			parameterValues.put("outputFolderParameter", this.outputFolderParameter);
			parameterValues.put("parameterListParameter", this.parameterListParameter);
			parameterValues.put("parameter", this.parameter);
			parameterValues.put("structuralFeatureNameParameter", this.structuralFeatureNameParameter);
			parameterValues.put("sectionTitleParameter", this.sectionTitleParameter);
			parameterValues.put("sectionLevelParameter", this.sectionLevelParameter);
			String outputWithCallBack = OutputManager.computeLoopOutput(ictx);
			String loop = OutputManager.computeLoopOutputWithoutCallback(ictx);
			ictx.getReporter().loopFinished(loop, outputWithCallBack, ictx, parameterValues);
		}
		return null;
	}

	protected java.lang.String projectNameParameter = null;

	public void set_projectNameParameter(java.lang.String object) {
		this.projectNameParameter = object;
	}

	protected java.lang.String outputFolderParameter = null;

	public void set_outputFolderParameter(java.lang.String object) {
		this.outputFolderParameter = object;
	}

	protected java.util.Collection parameterListParameter = null;

	public void set_parameterListParameter(java.util.Collection object) {
		this.parameterListParameter = object;
	}

	protected org.eclipse.emf.ecore.EObject parameter = null;

	public void set_parameter(org.eclipse.emf.ecore.EObject object) {
		this.parameter = object;
	}

	protected java.lang.String structuralFeatureNameParameter = null;

	public void set_structuralFeatureNameParameter(java.lang.String object) {
		this.structuralFeatureNameParameter = object;
	}

	public Map<String, Object> getParameters() {
		final Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("projectNameParameter", this.projectNameParameter);
		parameters.put("outputFolderParameter", this.outputFolderParameter);
		parameters.put("parameterListParameter", this.parameterListParameter);
		parameters.put("parameter", this.parameter);
		parameters.put("structuralFeatureNameParameter", this.structuralFeatureNameParameter);
		parameters.put("sectionTitleParameter", this.sectionTitleParameter);
		parameters.put("sectionLevelParameter", this.sectionLevelParameter);
		return parameters;
	}

	protected void method_descriptionContent(final StringBuffer stringBuffer, final PatternContext ctx)
			throws Exception {

		stringBuffer.append(TEXT_1);

		EClass eClass = parameter.eClass();
		EStructuralFeature eStructuralFeature = eClass.getEStructuralFeature(structuralFeatureNameParameter);
		if (eStructuralFeature != null) {
			Object value = parameter.eGet(eStructuralFeature);
			String description = null;
			if (value != null && value.toString().length() > 0) {
				description = value.toString();
			} else {
				description = "No " + structuralFeatureNameParameter;
			}
			stringBuffer.append(TEXT_2);
			stringBuffer.append(EscapeChars.replaceSpecialCharacters(description));
		}
		stringBuffer.append(TEXT_3);
		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "descriptionContent", stringBuffer.toString());
	}

	protected void method_body(final StringBuffer stringBuffer, final PatternContext ctx) throws Exception {

		stringBuffer.append(StringUtil.stringListToBulette(parameterListParameter));
		stringBuffer.append(TEXT_2);
		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "body", stringBuffer.toString());
	}

	protected void method_title(final StringBuffer stringBuffer, final PatternContext ctx) throws Exception {

		if (sectionTitleParameter == null) {
			sectionTitleParameter = Character.toString(structuralFeatureNameParameter.charAt(0)).toUpperCase()
					+ structuralFeatureNameParameter.substring(1);
		}
		super.method_title(new StringBuffer(), ctx);

		stringBuffer.append(TEXT_4);
		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "title", stringBuffer.toString());
	}

	protected void method_openDiv(final StringBuffer stringBuffer, final PatternContext ctx) throws Exception {

		stringBuffer.append(TEXT_5);
		stringBuffer.append(sectionTitleParameter);
		stringBuffer.append(TEXT_6);
		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "openDiv", stringBuffer.toString());
	}

	protected void method_closeDiv(final StringBuffer stringBuffer, final PatternContext ctx) throws Exception {

		stringBuffer.append(TEXT_7);
		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "closeDiv", stringBuffer.toString());
	}
}