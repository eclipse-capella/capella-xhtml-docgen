//Generated with EGF 1.3.0.v20150507-0831
package org.polarsys.capella.addons.releng;

import org.eclipse.egf.common.helper.*;
import java.util.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.egf.model.pattern.*;
import org.eclipse.egf.pattern.execution.*;
import org.eclipse.egf.pattern.query.*;
import org.eclipse.egf.portfolio.eclipse.build.GenerationHelper;
import org.eclipse.egf.portfolio.eclipse.build.buildstep.BuildStep;

public class buildxmlpublishStepfeature
		extends
		org.eclipse.egf.portfolio.eclipse.build.buckminster.additions.buildxmlpublishStepfeature {
	protected static String nl;

	public static synchronized buildxmlpublishStepfeature create(
			String lineSeparator) {
		nl = lineSeparator;
		buildxmlpublishStepfeature result = new buildxmlpublishStepfeature();
		nl = null;
		return result;
	}

	public final String NL = nl == null ? (System.getProperties()
			.getProperty("line.separator")) : nl;
	protected final String TEXT_1 = "       <target name=\"";
	protected final String TEXT_2 = "\" depends=\"init,install.buckminster\" >"
			+ NL;
	protected final String TEXT_3 = NL
			+ "             "
			+ NL
			+ "             <echo message=\"Generate Site\"/>"
			+ NL
			+ "             <buckminster command=\"perform\">"
			+ NL
			+ "                    <globargs>"
			+ NL
			+ "                          <arg value=\"-Dsite.include.top=true\"/>"
			+ NL + "                          <arg value=\"-Dsite.signing=";
	protected final String TEXT_4 = "\"/>                      " + NL
			+ "                          <arg value=\"-Dcbi.include.source=";
	protected final String TEXT_5 = "\"/>                      " + NL
			+ "                    </globargs>" + NL
			+ "                    <cmdargs>" + NL
			+ "                          <arg value=\"";
	protected final String TEXT_6 = ":eclipse.feature#site.p2\" />" + NL
			+ "                    </cmdargs>" + NL
			+ "             </buckminster>" + NL + "" + NL
			+ "             <echo message=\"Publish site\"/>" + NL
			+ "             <mkdir dir=\"";
	protected final String TEXT_7 = "/site.p2/\"/>" + NL
			+ "             <copy todir=\"";
	protected final String TEXT_8 = "/site.p2/\">" + NL
			+ "                    <fileset dir=\"${result}/output\">" + NL
			+ "                          <include name=\"";
	protected final String TEXT_9 = "*/site.p2/*\"/>" + NL
			+ "                          <include name=\"";
	protected final String TEXT_10 = "*/site.p2/**\"/>"
			+ NL
			+ "                    </fileset>"
			+ NL
			+ "                    <filtermapper>"
			+ NL
			+ "                          <replaceregex pattern=\".*site\\.p2\" replace=\"\" />"
			+ NL + "                    </filtermapper>" + NL
			+ "             </copy>" + NL;
	protected final String TEXT_11 = NL
			+ "             <echo message=\"Publish dropins\"/>"
			+ NL
			+ "             <condition property=\"site.src\" value=\"site.signed\" else=\"site\">"
			+ NL + "                    <istrue value=\"${site.signing}\" />"
			+ NL + "             </condition>" + NL + "" + NL
			+ "             <copy todir=\"";
	protected final String TEXT_12 = "/dropins/";
	protected final String TEXT_13 = "/eclipse/\">" + NL
			+ "                    <fileset dir=\"${result}/output\">" + NL
			+ "                          <include name=\"";
	protected final String TEXT_14 = "*/${site.src}/plugins/*.jar\"/>" + NL
			+ "                          <include name=\"";
	protected final String TEXT_15 = "*/${site.src}/features/*.jar\"/>"
			+ NL
			+ "                    </fileset>"
			+ NL
			+ "                    <filtermapper>"
			+ NL
			+ "                          <replaceregex pattern=\".*_.*-eclipse\\.feature.${site.src}.plugins\" replace=\"plugins\" />"
			+ NL
			+ "                          <replaceregex pattern=\".*_.*-eclipse\\.feature.${site.src}.features\" replace=\"features\" />"
			+ NL + "                    </filtermapper>" + NL
			+ "             </copy>" + NL + "" + NL
			+ "             <buckminster command=\"perform\">" + NL
			+ "                    <globargs>" + NL
			+ "                          <arg value=\"-DsiteDir=";
	protected final String TEXT_16 = "/dropins/";
	protected final String TEXT_17 = "/eclipse/\" />" + NL
			+ "                    </globargs>" + NL
			+ "                    <cmdargs>";
	protected final String TEXT_18 = "                    " + NL
			+ "                          <arg value=\"";
	protected final String TEXT_19 = ":buckminster#convertSiteToRuntime\" />"
			+ NL + "                    </cmdargs>" + NL
			+ "             </buckminster>" + NL + "             " + NL
			+ "             <pathconvert property=\"featurefile";
	protected final String TEXT_20 = "\">"
			+ NL
			+ "                    <first count=\"1\">"
			+ NL
			+ "                          <fileset dir=\"${result}/output\" includes=\"";
	protected final String TEXT_21 = "*eclipse.feature/temp/manifest/feature.xml\" />"
			+ NL
			+ "                    </first>"
			+ NL
			+ "             </pathconvert>"
			+ NL
			+ "             <loadfile property=\"featureversion";
	protected final String TEXT_22 = "\" srcFile=\"${featurefile";
	protected final String TEXT_23 = "}\">"
			+ NL
			+ "                    <filterchain>"
			+ NL
			+ "                          <striplinebreaks/>"
			+ NL
			+ "                          <replaceregex"
			+ NL
			+ "                                 pattern=\"^.*&lt;feature[^&gt;]*version=&quot;([^&quot;]*)&quot;.*$\""
			+ NL + "                                 replace=\"\\1\"/>" + NL
			+ "                    </filterchain>" + NL
			+ "             </loadfile>" + NL + "" + NL
			+ "             <touch file=\"";
	protected final String TEXT_24 = "/dropins/";
	protected final String TEXT_25 = "/";
	protected final String TEXT_26 = "_version_${featureversion";
	protected final String TEXT_27 = "}\" />";
	protected final String TEXT_28 = "        " + NL + "       </target>";
	protected final String TEXT_29 = NL;
	protected final String TEXT_30 = NL;

	public buildxmlpublishStepfeature() {
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

		paramDesc = new IQuery.ParameterDescription("publishStep",
				"http://www.eclipse.org/egf/1.0.2/buildstep#//PublishStep");
		queryCtx = new HashMap<String, String>();
		List<Object> publishStepList = QueryHelper.load(ctx,
				"org.eclipse.egf.pattern.query.EObjectInjectedContextQuery")
				.execute(paramDesc, queryCtx, ctx);

		for (Object publishStepParameter : publishStepList) {

			this.publishStep = (org.eclipse.egf.portfolio.eclipse.build.buildstep.PublishStep) publishStepParameter;

			if (preCondition(ctx)) {
				ctx.setNode(new Node.Container(currentNode, getClass()));
				orchestration(ctx);
			}

		}
		ctx.setNode(currentNode);
		if (ctx.useReporter()) {
			ctx.getReporter().executionFinished(
					OutputManager.computeExecutionOutput(ctx), ctx);
		}

		stringBuffer.append(TEXT_29);
		stringBuffer.append(TEXT_30);
		return stringBuffer.toString();
	}

	public String orchestration(PatternContext ctx) throws Exception {
		InternalPatternContext ictx = (InternalPatternContext) ctx;

		super.orchestration(new SuperOrchestrationContext(ictx));

		if (ictx.useReporter()) {
			Map<String, Object> parameterValues = new HashMap<String, Object>();
			parameterValues.put("publishStep", this.publishStep);
			String outputWithCallBack = OutputManager.computeLoopOutput(ictx);
			String loop = OutputManager.computeLoopOutputWithoutCallback(ictx);
			ictx.getReporter().loopFinished(loop, outputWithCallBack, ictx,
					parameterValues);
		}
		return null;
	}

	public Map<String, Object> getParameters() {
		final Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("publishStep", this.publishStep);
		return parameters;
	}

	protected void method_body(final StringBuffer stringBuffer,
			final PatternContext ctx) throws Exception {

		String stepName = new GenerationHelper()
				.getNameOrGeneratedIdString(publishStep);
		stringBuffer.append(TEXT_1);
		stringBuffer.append(stepName);
		stringBuffer.append(TEXT_2);
		String featurename = publishStep.getComponent().getId();
		String publishdirectory = "${publish}/" + featurename;
		stringBuffer.append(TEXT_3);
		stringBuffer.append(publishStep.isSigning());
		stringBuffer.append(TEXT_4);
		stringBuffer.append(publishStep.isGenerateSources());
		stringBuffer.append(TEXT_5);
		stringBuffer.append(featurename);
		stringBuffer.append(TEXT_6);
		stringBuffer.append(publishdirectory);
		stringBuffer.append(TEXT_7);
		stringBuffer.append(publishdirectory);
		stringBuffer.append(TEXT_8);
		stringBuffer.append(featurename);
		stringBuffer.append(TEXT_9);
		stringBuffer.append(featurename);
		stringBuffer.append(TEXT_10);
		if (publishStep.isGenerateDropins()) {
			stringBuffer.append(TEXT_11);
			stringBuffer.append(publishdirectory);
			stringBuffer.append(TEXT_12);
			stringBuffer.append(featurename);
			stringBuffer.append(TEXT_13);
			stringBuffer.append(featurename);
			stringBuffer.append(TEXT_14);
			stringBuffer.append(featurename);
			stringBuffer.append(TEXT_15);
			stringBuffer.append(publishdirectory);
			stringBuffer.append(TEXT_16);
			stringBuffer.append(featurename);
			stringBuffer.append(TEXT_17);
			BuildStep buildStep = publishStep.getComponent().getBuildStep();
			String buildStepName = new GenerationHelper()
					.getNameOrGeneratedIdString(buildStep);
			stringBuffer.append(TEXT_18);
			stringBuffer.append(buildStepName);
			stringBuffer.append(TEXT_19);
			stringBuffer.append(stepName);
			stringBuffer.append(TEXT_20);
			stringBuffer.append(featurename);
			stringBuffer.append(TEXT_21);
			stringBuffer.append(stepName);
			stringBuffer.append(TEXT_22);
			stringBuffer.append(stepName);
			stringBuffer.append(TEXT_23);
			stringBuffer.append(publishdirectory);
			stringBuffer.append(TEXT_24);
			stringBuffer.append(featurename);
			stringBuffer.append(TEXT_25);
			stringBuffer.append(featurename);
			stringBuffer.append(TEXT_26);
			stringBuffer.append(stepName);
			stringBuffer.append(TEXT_27);
		}
		stringBuffer.append(TEXT_28);
		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "body",
				stringBuffer.toString());
	}
}