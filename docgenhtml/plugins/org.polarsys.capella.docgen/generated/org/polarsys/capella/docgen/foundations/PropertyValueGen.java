//Generated with EGF 1.2.0.v20140805-0858
package org.polarsys.capella.docgen.foundations;

import org.eclipse.egf.common.helper.*;
import java.util.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.egf.model.pattern.*;
import org.eclipse.egf.pattern.execution.*;
import org.eclipse.egf.pattern.query.*;
import org.eclipse.emf.common.util.*;
import org.polarsys.capella.core.data.capellacore.AbstractPropertyValue;
import org.polarsys.capella.core.data.capellacore.BooleanPropertyValue;
import org.polarsys.capella.core.data.capellacore.EnumerationPropertyValue;
import org.polarsys.capella.core.data.capellacore.FloatPropertyValue;
import org.polarsys.capella.core.data.capellacore.IntegerPropertyValue;
import org.polarsys.capella.core.data.capellacore.StringPropertyValue;
import org.polarsys.capella.docgen.util.StringUtil;

public class PropertyValueGen {
	protected static String nl;

	public static synchronized PropertyValueGen create(String lineSeparator) {
		nl = lineSeparator;
		PropertyValueGen result = new PropertyValueGen();
		nl = null;
		return result;
	}

	public final String NL = nl == null ? (System.getProperties()
			.getProperty("line.separator")) : nl;
	protected final String TEXT_1 = "";
	protected final String TEXT_2 = NL;
	protected final String TEXT_3 = NL + "<h2>Properties Value</h2>" + NL
			+ "<table max-width=screen.width>" + NL + "   <thead> " + NL
			+ "       <tr>" + NL + "       \t   <th>Relation</th>\t" + NL
			+ "           <th>Name</th>" + NL + "           <th>Value</th>"
			+ NL + "           <th>Description</th>" + NL + "       </tr>" + NL
			+ "   </thead>" + NL + "   <tbody>" + NL;
	protected final String TEXT_4 = NL + "   \t   <tr>" + NL
			+ "           <td><i>";
	protected final String TEXT_5 = "</i></td>" + NL + "           <td>";
	protected final String TEXT_6 = "</td>" + NL + "           <td>";
	protected final String TEXT_7 = "</td>" + NL + "           <td>";
	protected final String TEXT_8 = "</td>" + NL + "       </tr>" + NL;
	protected final String TEXT_9 = NL;
	protected final String TEXT_10 = NL + "   \t   <tr>" + NL
			+ "           <td><i>";
	protected final String TEXT_11 = "</i></td>" + NL + "           <td>";
	protected final String TEXT_12 = "</td>" + NL + "           <td>";
	protected final String TEXT_13 = "</td>" + NL + "           <td>";
	protected final String TEXT_14 = "</td>" + NL + "       </tr>";
	protected final String TEXT_15 = NL + "   </tbody>" + NL + "</table>";
	protected final String TEXT_16 = NL;
	protected final String TEXT_17 = NL;

	public PropertyValueGen() {
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
		List<Object> outputFolderList = null;
		//this pattern can only be called by another (i.e. it's not an entry point in execution)
		List<Object> projectNameList = null;
		//this pattern can only be called by another (i.e. it's not an entry point in execution)

		for (Object elementParameter : elementList) {
			for (Object outputFolderParameter : outputFolderList) {
				for (Object projectNameParameter : projectNameList) {

					this.element = (org.polarsys.capella.core.data.capellacore.CapellaElement) elementParameter;
					this.outputFolder = (java.lang.String) outputFolderParameter;
					this.projectName = (java.lang.String) projectNameParameter;

					if (preCondition(ctx)) {
						ctx.setNode(new Node.Container(currentNode, getClass()));
						orchestration(ctx);
					}

				}
			}
		}
		ctx.setNode(currentNode);
		if (ctx.useReporter()) {
			ctx.getReporter().executionFinished(
					OutputManager.computeExecutionOutput(ctx), ctx);
		}

		stringBuffer.append(TEXT_16);
		stringBuffer.append(TEXT_17);
		return stringBuffer.toString();
	}

	public String orchestration(PatternContext ctx) throws Exception {
		InternalPatternContext ictx = (InternalPatternContext) ctx;

		method_body(new StringBuffer(), ictx);

		if (ictx.useReporter()) {
			Map<String, Object> parameterValues = new HashMap<String, Object>();
			parameterValues.put("element", this.element);
			parameterValues.put("outputFolder", this.outputFolder);
			parameterValues.put("projectName", this.projectName);
			String outputWithCallBack = OutputManager.computeLoopOutput(ictx);
			String loop = OutputManager.computeLoopOutputWithoutCallback(ictx);
			ictx.getReporter().loopFinished(loop, outputWithCallBack, ictx,
					parameterValues);
		}
		return null;
	}

	protected org.polarsys.capella.core.data.capellacore.CapellaElement element = null;

	public void set_element(
			org.polarsys.capella.core.data.capellacore.CapellaElement object) {
		this.element = object;
	}

	protected java.lang.String outputFolder = null;

	public void set_outputFolder(java.lang.String object) {
		this.outputFolder = object;
	}

	protected java.lang.String projectName = null;

	public void set_projectName(java.lang.String object) {
		this.projectName = object;
	}

	public Map<String, Object> getParameters() {
		final Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("element", this.element);
		parameters.put("outputFolder", this.outputFolder);
		parameters.put("projectName", this.projectName);
		return parameters;
	}

	protected void method_body(final StringBuffer stringBuffer,
			final PatternContext ctx) throws Exception {

		EList<AbstractPropertyValue> applayed_list = element
				.getAppliedPropertyValues();
		stringBuffer.append(TEXT_1);
		EList<AbstractPropertyValue> owned_list = element
				.getOwnedPropertyValues();
		stringBuffer.append(TEXT_2);
		if ((applayed_list != null && applayed_list.size() > 0)
				|| (owned_list != null && owned_list.size() > 0)) {
			stringBuffer.append(TEXT_3);
			// Handle Owned PropertyValues if not Handled yet 
			for (AbstractPropertyValue propertyValue : owned_list) {
				// Variable initialization
				String relation = "Contained";
				String name = propertyValue.getName();
				String value = "";
				String description = propertyValue.getDescription();
				description = StringUtil.transformAREFString(propertyValue,
						description, projectName, outputFolder);

				if (propertyValue instanceof EnumerationPropertyValue) {
					if (((EnumerationPropertyValue) propertyValue).getValue() != null)
						value = ((EnumerationPropertyValue) propertyValue)
								.getValue().getName();
				}

				if (propertyValue instanceof BooleanPropertyValue)
					value = (((BooleanPropertyValue) propertyValue).isValue() ? "True"
							: "False");

				if (propertyValue instanceof StringPropertyValue)
					value = ((StringPropertyValue) propertyValue).getValue();

				if (propertyValue instanceof IntegerPropertyValue)
					value = Integer
							.toString(((IntegerPropertyValue) propertyValue)
									.getValue());

				if (propertyValue instanceof FloatPropertyValue)
					value = Float.toString(((FloatPropertyValue) propertyValue)
							.getValue());

				if (applayed_list.contains(propertyValue))
					relation += " &amp; Applied";

				stringBuffer.append(TEXT_4);
				stringBuffer.append(relation);
				stringBuffer.append(TEXT_5);
				stringBuffer.append(name);
				stringBuffer.append(TEXT_6);
				stringBuffer.append(value);
				stringBuffer.append(TEXT_7);
				stringBuffer.append(description);
				stringBuffer.append(TEXT_8);
			}
			stringBuffer.append(TEXT_9);
			// Handle Applied PropertyValues 
			for (AbstractPropertyValue propertyValue : applayed_list) {
				if (!owned_list.contains(propertyValue)) {
					// Variable initialization
					String relation = "Applied";
					String name = propertyValue.getName();
					String value = "";
					String description = propertyValue.getDescription();
					description = StringUtil.transformAREFString(propertyValue,
							description, projectName, outputFolder);

					if (propertyValue instanceof EnumerationPropertyValue) {
						if (((EnumerationPropertyValue) propertyValue)
								.getValue() != null)
							value = ((EnumerationPropertyValue) propertyValue)
									.getValue().getName();
					}

					if (propertyValue instanceof BooleanPropertyValue)
						value = (((BooleanPropertyValue) propertyValue)
								.isValue() ? "True" : "False");

					if (propertyValue instanceof StringPropertyValue)
						value = ((StringPropertyValue) propertyValue)
								.getValue();

					if (propertyValue instanceof IntegerPropertyValue)
						value = Integer
								.toString(((IntegerPropertyValue) propertyValue)
										.getValue());

					if (propertyValue instanceof FloatPropertyValue)
						value = Float
								.toString(((FloatPropertyValue) propertyValue)
										.getValue());

					stringBuffer.append(TEXT_10);
					stringBuffer.append(relation);
					stringBuffer.append(TEXT_11);
					stringBuffer.append(name);
					stringBuffer.append(TEXT_12);
					stringBuffer.append(value);
					stringBuffer.append(TEXT_13);
					stringBuffer.append(description);
					stringBuffer.append(TEXT_14);
				}
			}
			stringBuffer.append(TEXT_15);
		}
		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "body",
				stringBuffer.toString());
	}

	public boolean preCondition(PatternContext ctx) throws Exception {
		return true;
	}
}