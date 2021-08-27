//Generated with EGF 1.6.1.201906060805
package org.polarsys.capella.docgen.foundations;

import org.eclipse.egf.common.helper.*;
import java.util.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.egf.model.pattern.*;
import org.eclipse.egf.pattern.execution.*;
import org.eclipse.egf.pattern.query.*;
import org.polarsys.capella.core.data.capellacore.EnumerationPropertyLiteral;
import org.polarsys.capella.docgen.helper.ProgressHelper;
import org.polarsys.capella.core.data.capellamodeller.Project;
import org.polarsys.capella.docgen.preference.CapellaDocgenPreferenceHelper;
import org.polarsys.capella.core.data.capellacore.EnumerationPropertyType;
import org.polarsys.capella.core.model.handler.helpers.CapellaProjectHelper;

public class StatusAndReviewGeneration {
	protected static String nl;

	public static synchronized StatusAndReviewGeneration create(String lineSeparator) {
		nl = lineSeparator;
		StatusAndReviewGeneration result = new StatusAndReviewGeneration();
		nl = null;
		return result;
	}

	public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
	protected final String TEXT_1 = "\t<h2> Status and Review</h2>" + NL + "\t";
	protected final String TEXT_2 = NL + "\t\t<p><b>Status:</b> ";
	protected final String TEXT_3 = "</p>" + NL + "\t";
	protected final String TEXT_4 = NL + "\t\t<p><b>Review:</b> </p>" + NL + "\t\t";
	protected final String TEXT_5 = NL + "\t\t<p>";
	protected final String TEXT_6 = NL;
	protected final String TEXT_7 = NL + "<h2>Progress Overview</h2>";
	protected final String TEXT_8 = NL + "No Progress information in this project";

	public StatusAndReviewGeneration() {
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

		for (Object elementParameter : elementList) {

			this.element = (org.polarsys.capella.core.data.capellacore.CapellaElement) elementParameter;

			if (preCondition(ctx)) {
				ctx.setNode(new Node.Container(currentNode, getClass()));
				orchestration(ctx);
			}

		}
		ctx.setNode(currentNode);
		if (ctx.useReporter()) {
			ctx.getReporter().executionFinished(OutputManager.computeExecutionOutput(ctx), ctx);
		}

		stringBuffer.append(TEXT_6);
		stringBuffer.append(TEXT_6);
		return stringBuffer.toString();
	}

	public String orchestration(PatternContext ctx) throws Exception {
		InternalPatternContext ictx = (InternalPatternContext) ctx;

		method_genStatusAndReview(new StringBuffer(), ictx);

		method_genProgressOverview(new StringBuffer(), ictx);

		if (ictx.useReporter()) {
			Map<String, Object> parameterValues = new HashMap<String, Object>();
			parameterValues.put("element", this.element);
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
		return parameters;
	}

	protected void method_genStatusAndReview(final StringBuffer stringBuffer, final PatternContext ctx)
			throws Exception {

		EnumerationPropertyLiteral status = element.getStatus();
		String review = element.getReview();
		if (status != null || (review != null && !review.isEmpty())) {
			stringBuffer.append(TEXT_1);
			if (status != null) {
				String name = status.getName();
				stringBuffer.append(TEXT_2);
				stringBuffer.append(name);
				stringBuffer.append(TEXT_3);
			}
			if (review != null && !review.isEmpty()) {
				stringBuffer.append(TEXT_4);
				review = review.replace("\n", "").replace("\r", "</br>");
				stringBuffer.append(TEXT_5);
				stringBuffer.append(review);
				stringBuffer.append(TEXT_3);
			}
		}

		stringBuffer.append(TEXT_6);
		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "genStatusAndReview", stringBuffer.toString());
	}

	protected void method_genProgressOverview(final StringBuffer stringBuffer, final PatternContext ctx)
			throws Exception {

		String projectName = ctx.getValue("projectName").toString();
		String outputFolder = ctx.getValue("outputFolder").toString();

		stringBuffer.append(TEXT_6);
		if (element instanceof Project) {
			stringBuffer.append(TEXT_7);
			EnumerationPropertyType progressStatus = CapellaProjectHelper.getEnumerationPropertyType(element,
					CapellaProjectHelper.PROGRESS_STATUS_KEYWORD);
			if (progressStatus != null) {
				stringBuffer.append(TEXT_6);
				stringBuffer.append(new ProgressHelper(projectName, outputFolder).generateProgressTable(element));
			} else {
				stringBuffer.append(TEXT_8);
			}
		}
		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "genProgressOverview", stringBuffer.toString());
	}

	public boolean preCondition(PatternContext ctx) throws Exception {
		return CapellaDocgenPreferenceHelper.isExportStatusAndReview();
	}
}