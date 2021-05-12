//Generated with EGF 1.6.2.202001031546
package org.polarsys.capella.docgen.foundations;

import java.util.*;
import org.eclipse.egf.model.pattern.*;
import org.eclipse.egf.pattern.execution.*;
import org.eclipse.egf.pattern.query.*;
import org.polarsys.capella.docgen.util.ConstraintsService;
import org.polarsys.capella.docgen.util.CapellaServices;
import org.polarsys.capella.common.data.modellingcore.AbstractConstraint;
import org.polarsys.capella.core.data.capellacore.Constraint;
import org.eclipse.emf.common.util.EList;
import org.polarsys.capella.core.data.capellacore.AbstractPropertyValue;
import org.polarsys.capella.core.data.capellacore.PropertyValueGroup;

public class ConstraintsDocGen {
	protected static String nl;

	public static synchronized ConstraintsDocGen create(String lineSeparator) {
		nl = lineSeparator;
		ConstraintsDocGen result = new ConstraintsDocGen();
		nl = null;
		return result;
	}

	public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
	protected final String TEXT_1 = "";
	protected final String TEXT_2 = NL + NL + "<table style=\"width: 100%\" border=\"1\">" + NL + "\t<tbody>" + NL
			+ "        <tr>" + NL
			+ "\t\t\t<td style=\"font-weight: bold; text-align: center; width: 15%\"> Name and Description</td>" + NL
			+ "\t\t\t<td style=\"font-weight: bold; text-align: center; width: 55%\"> Owned specification</td>" + NL
			+ "\t\t\t<td style=\"font-weight: bold; text-align: center; width: 15%\"> Constrained elements<br /></td>"
			+ NL + "\t\t\t" + NL + "        </tr>";
	protected final String TEXT_3 = NL;
	protected final String TEXT_4 = NL + "        <tr>";
	protected final String TEXT_5 = "\t\t\t<td rowspan=\"3\">";
	protected final String TEXT_6 = "        \t<td>";
	protected final String TEXT_7 = NL + "<b>";
	protected final String TEXT_8 = " </b>";
	protected final String TEXT_9 = NL + "\t\t\t</td>" + NL + "\t\t\t<td>";
	protected final String TEXT_10 = "\t\t\t\t" + NL + "\t\t\t</td>" + NL + "\t\t\t<td>  ";
	protected final String TEXT_11 = "\t\t\t" + NL + "\t\t\t</td>" + NL + "        </tr>";
	protected final String TEXT_12 = NL + "\t\t<tr>" + NL + "\t\t\t<th colspan=\"2\">" + NL
			+ "\t\t\tApplied and Contained Property Values" + NL + "\t\t\t</th>" + NL + "\t\t</tr>" + NL + "\t\t<tr>"
			+ NL + "\t\t\t<td colspan=\"2\">";
	protected final String TEXT_13 = NL + "\t\t\t</td>" + NL + "\t\t</tr>";
	protected final String TEXT_14 = NL + "\t</tbody>" + NL + "</table>" + NL;

	public ConstraintsDocGen() {
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

			this.parameter = (org.polarsys.capella.core.data.capellacore.NamedElement) parameterParameter;

			if (preCondition(ctx)) {
				ctx.setNode(new Node.Container(currentNode, getClass()));
				orchestration(ctx);
			}

		}
		ctx.setNode(currentNode);
		if (ctx.useReporter()) {
			ctx.getReporter().executionFinished(OutputManager.computeExecutionOutput(ctx), ctx);
		}

		stringBuffer.append(TEXT_3);
		stringBuffer.append(TEXT_3);
		return stringBuffer.toString();
	}

	public String orchestration(PatternContext ctx) throws Exception {
		InternalPatternContext ictx = (InternalPatternContext) ctx;

		method_genConstraints(new StringBuffer(), ictx);

		if (ictx.useReporter()) {
			Map<String, Object> parameterValues = new HashMap<String, Object>();
			parameterValues.put("parameter", this.parameter);
			String outputWithCallBack = OutputManager.computeLoopOutput(ictx);
			String loop = OutputManager.computeLoopOutputWithoutCallback(ictx);
			ictx.getReporter().loopFinished(loop, outputWithCallBack, ictx, parameterValues);
		}
		return null;
	}

	protected org.polarsys.capella.core.data.capellacore.NamedElement parameter = null;

	public void set_parameter(org.polarsys.capella.core.data.capellacore.NamedElement object) {
		this.parameter = object;
	}

	public Map<String, Object> getParameters() {
		final Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("parameter", this.parameter);
		return parameters;
	}

	protected void method_genConstraints(final StringBuffer stringBuffer, final PatternContext ctx) throws Exception {

		String constraintTitle = "Constraints";
		stringBuffer.append(TEXT_1);
		{
			//<%@ egf:patternCall patternId="platform:/plugin/org.polarsys.kitalpha.doc.gen.business.core/egf/HTMLDocGenCommon.fcore#LogicalName=org.polarsys.kitalpha.doc.gen.business.core.generic.ElementGenerateByPropterty" args="parameter:eObject,constraintTitle:property"%>

			InternalPatternContext ictx = (InternalPatternContext) ctx;
			new Node.DataLeaf(ictx.getNode(), getClass(), null, stringBuffer.toString());
			stringBuffer.setLength(0);

			final Map<String, Object> callParameters = new HashMap<String, Object>();
			callParameters.put("eObject", parameter);
			callParameters.put("property", constraintTitle);
			CallHelper.executeWithParameterInjection(
					"platform:/plugin/org.polarsys.kitalpha.doc.gen.business.core/egf/HTMLDocGenCommon.fcore#_cWGxMONUEd-euK0PeLuaMA",
					new ExecutionContext((InternalPatternContext) ctx), callParameters);
			stringBuffer.setLength(0);
		}

		stringBuffer.append(TEXT_2);
		String projectName = (String) ctx.getValue("projectName");
		String outputFolder = (String) ctx.getValue("outputFolder");
		stringBuffer.append(TEXT_3);
		List<AbstractConstraint> ownedConstraints = parameter.getOwnedConstraints();
		for (AbstractConstraint abstractConstraint : ownedConstraints) {
			Constraint constraint = (Constraint) abstractConstraint;
			String constraintName = constraint.getName();
			if (constraintName == null || (constraintName != null && constraintName.isEmpty())) {
				constraintName = CapellaServices.NO_NAME;
			}

			stringBuffer.append(TEXT_4);

			EList<AbstractPropertyValue> appliedPVList = constraint.getAppliedPropertyValues();
			EList<PropertyValueGroup> appliedPVGList = constraint.getAppliedPropertyValueGroups();
			EList<AbstractPropertyValue> ownedPVList = constraint.getOwnedPropertyValues();
			EList<PropertyValueGroup> ownedPVGList = constraint.getOwnedPropertyValueGroups();
			Boolean hasAppliedPVorPVGs = !appliedPVList.isEmpty() || !appliedPVGList.isEmpty() || !ownedPVList.isEmpty()
					|| !ownedPVGList.isEmpty();
			if (hasAppliedPVorPVGs) {

				stringBuffer.append(TEXT_5);
			} else {

				stringBuffer.append(TEXT_6);
			}

			stringBuffer.append(TEXT_7);
			stringBuffer.append(constraintName);
			stringBuffer.append(TEXT_8);
			// Summary and description generation
			stringBuffer.append(TEXT_3);
			{
				//<%@ egf:patternCall patternId="platform:/plugin/org.polarsys.capella.docgen/egf/HTMLDocGenCapella.fcore#LogicalName=org.polarsys.capella.docgen.foundations.SummaryAndDescriptionGeneration" args="constraint:element"%>

				InternalPatternContext ictx = (InternalPatternContext) ctx;
				new Node.DataLeaf(ictx.getNode(), getClass(), null, stringBuffer.toString());
				stringBuffer.setLength(0);

				final Map<String, Object> callParameters = new HashMap<String, Object>();
				callParameters.put("element", constraint);
				CallHelper.executeWithParameterInjection(
						"platform:/plugin/org.polarsys.capella.docgen/egf/HTMLDocGenCapella.fcore#_fiM9sOZdEd-YVt45ZEg4_w",
						new ExecutionContext((InternalPatternContext) ctx), callParameters);
				stringBuffer.setLength(0);
			}

			stringBuffer.append(TEXT_9);
			stringBuffer.append(TEXT_3);
			stringBuffer.append(ConstraintsService.getValueSpecification(constraint.getOwnedSpecification(),
					projectName, outputFolder));
			stringBuffer.append(TEXT_10);
			stringBuffer.append(TEXT_3);
			stringBuffer.append(ConstraintsService.getConstrainedElement(constraint, projectName, outputFolder));
			stringBuffer.append(TEXT_11);

			if (hasAppliedPVorPVGs) {
				int sectionLevel = 4;
				boolean displayAsRowParameter = true;

				stringBuffer.append(TEXT_12);
				stringBuffer.append(TEXT_3);
				{
					//<%@ egf:patternCall patternId="platform:/plugin/org.polarsys.capella.docgen/egf/HTMLDocGenCapella.fcore#LogicalName=org.polarsys.capella.docgen.foundations.PropertyValueGen" args="constraint:element,outputFolder:outputFolder,projectName:projectName,sectionLevel:sectionLevelParameter,displayAsRowParameter:displayAsRowParameter"%>

					InternalPatternContext ictx = (InternalPatternContext) ctx;
					new Node.DataLeaf(ictx.getNode(), getClass(), null, stringBuffer.toString());
					stringBuffer.setLength(0);

					final Map<String, Object> callParameters = new HashMap<String, Object>();
					callParameters.put("element", constraint);
					callParameters.put("outputFolder", outputFolder);
					callParameters.put("projectName", projectName);
					callParameters.put("sectionLevelParameter", sectionLevel);
					callParameters.put("displayAsRowParameter", displayAsRowParameter);
					CallHelper.executeWithParameterInjection(
							"platform:/plugin/org.polarsys.capella.docgen/egf/HTMLDocGenCapella.fcore#_UT85gDr2EeK9AZkoGpWdMw",
							new ExecutionContext((InternalPatternContext) ctx), callParameters);
					stringBuffer.setLength(0);
				}

				stringBuffer.append(TEXT_13);

			}
		}

		stringBuffer.append(TEXT_14);
		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "genConstraints", stringBuffer.toString());
	}

	public boolean preCondition(PatternContext ctx) throws Exception {
		return true;
	}
}