//Generated with EGF 1.5.1.v20180423-0901
package org.polarsys.capella.docgen.foundations;

import org.eclipse.egf.common.helper.*;
import java.util.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.egf.model.pattern.*;
import org.eclipse.egf.pattern.execution.*;
import org.eclipse.egf.pattern.query.*;
import org.eclipse.emf.common.util.*;
import org.polarsys.capella.core.data.capellacore.AbstractPropertyValue;
import org.polarsys.capella.core.data.capellacore.PropertyValueGroup;
import org.polarsys.capella.docgen.util.CapellaServices;
import org.polarsys.capella.docgen.util.StringUtil;
import org.polarsys.capella.docgen.util.pattern.helper.PropertyValueHelper;

public class PropertyValueGen {
	protected static String nl;

	public static synchronized PropertyValueGen create(String lineSeparator) {
		nl = lineSeparator;
		PropertyValueGen result = new PropertyValueGen();
		nl = null;
		return result;
	}

	public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
	protected final String TEXT_1 = "\t<h2>Property Values</h2>" + NL + "\t<table max-width=screen.width>" + NL
			+ "\t   <thead> " + NL + "\t       <tr>" + NL + "\t       \t   <th>Relation</th>\t" + NL
			+ "\t           <th>Name</th>" + NL + "\t           <th>Value</th>" + NL
			+ "\t           <th>Description</th>" + NL + "\t       </tr>" + NL + "\t   </thead>" + NL + "\t   <tbody>"
			+ NL + "\t";
	protected final String TEXT_2 = NL + "\t";
	protected final String TEXT_3 = NL + "\t</tbody>" + NL + "\t</table>" + NL + "\t";
	protected final String TEXT_4 = NL + "\t<h2>Property Value Groups</h2>" + NL + "\t<table max-width=screen.width>"
			+ NL + "\t   <thead> " + NL + "\t       <tr>" + NL + "\t       \t   <th>Relation</th>\t" + NL
			+ "\t           <th>Name</th>" + NL + "\t           <th>Value</th>" + NL
			+ "\t           <th>Description</th>" + NL + "\t       </tr>" + NL + "\t   </thead>" + NL + "\t   <tbody>"
			+ NL + "\t";
	protected final String TEXT_5 = NL + "\t";
	protected final String TEXT_6 = NL + "\t</tbody>" + NL + "\t</table>" + NL + "\t";
	protected final String TEXT_7 = NL;
	protected final String TEXT_8 = NL;
	protected final String TEXT_9 = NL;

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
			ctx.getReporter().executionFinished(OutputManager.computeExecutionOutput(ctx), ctx);
		}

		stringBuffer.append(TEXT_8);
		stringBuffer.append(TEXT_9);
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
			ictx.getReporter().loopFinished(loop, outputWithCallBack, ictx, parameterValues);
		}
		return null;
	}

	protected org.polarsys.capella.core.data.capellacore.CapellaElement element = null;

	public void set_element(org.polarsys.capella.core.data.capellacore.CapellaElement object) {
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

	protected void method_body(final StringBuffer stringBuffer, final PatternContext ctx) throws Exception {

		// We get the list of applied and owned PV
		EList<AbstractPropertyValue> applied_list = element.getAppliedPropertyValues();
		EList<AbstractPropertyValue> owned_list = element.getOwnedPropertyValues();

		if ((applied_list != null && applied_list.size() > 0) || (owned_list != null && owned_list.size() > 0)) {

			stringBuffer.append(TEXT_1);

			String table = PropertyValueHelper.getPVTable(element, 0, projectName, outputFolder);

			stringBuffer.append(TEXT_2);
			stringBuffer.append(table);
			stringBuffer.append(TEXT_3);

		}

		// We get the list of applied and owned PVG
		EList<PropertyValueGroup> appliedgroup_list = element.getAppliedPropertyValueGroups();
		EList<PropertyValueGroup> ownedgroup_list = element.getOwnedPropertyValueGroups();

		if ((appliedgroup_list != null && appliedgroup_list.size() > 0)
				|| (ownedgroup_list != null && ownedgroup_list.size() > 0)) {

			stringBuffer.append(TEXT_4);

			String table = PropertyValueHelper.getPVGTable(element, 0, projectName, outputFolder);

			stringBuffer.append(TEXT_5);
			stringBuffer.append(table);
			stringBuffer.append(TEXT_6);

		}

		stringBuffer.append(TEXT_7);
		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "body", stringBuffer.toString());
	}

	public boolean preCondition(PatternContext ctx) throws Exception {
		return true;
	}
}