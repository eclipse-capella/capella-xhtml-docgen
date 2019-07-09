//Generated with EGF 1.6.0.201805040915
package org.polarsys.capella.docgen.foundations;

import java.util.*;
import org.eclipse.egf.model.pattern.*;
import org.eclipse.egf.pattern.execution.*;
import org.eclipse.egf.pattern.query.*;
import org.polarsys.capella.core.data.cs.BlockArchitecture;
import org.polarsys.capella.docgen.util.TreeServices;
import org.polarsys.capella.docgen.diagram.CapellaHelper;

public class DiagramNavigationTree {
	protected static String nl;

	public static synchronized DiagramNavigationTree create(String lineSeparator) {
		nl = lineSeparator;
		DiagramNavigationTree result = new DiagramNavigationTree();
		nl = null;
		return result;
	}

	public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
	protected final String TEXT_1 = "\t<h2>Diagrams</h2>" + NL + "\t";
	protected final String TEXT_2 = NL + "\t<br>" + NL + "\t" + NL + "\t";
	protected final String TEXT_3 = NL + "\t";
	protected final String TEXT_4 = NL + "\t";
	protected final String TEXT_5 = NL;
	protected final String TEXT_6 = NL;

	public DiagramNavigationTree() {
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

		stringBuffer.append(TEXT_5);
		stringBuffer.append(TEXT_6);
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

		String projectName = ctx.getValue("projectName").toString();
		String outputFolder = ctx.getValue("outputFolder").toString();
		String treeID = TreeServices.DIAGRAMS_TREE_ID;

		if (element instanceof BlockArchitecture) {
			if (CapellaHelper.hostDiagrams((BlockArchitecture) element)) {

				stringBuffer.append(TEXT_1);
				{
					//<%@ egf:patternCall patternId="platform:/plugin/org.polarsys.kitalpha.doc.gen.business.core/egf/HTMLDocGenCommon.fcore#LogicalName=org.polarsys.kitalpha.doc.gen.business.core.doccontent.treeview.TreeViewControlHeader" args="element:parameter, treeID:treeID"%>

					InternalPatternContext ictx = (InternalPatternContext) ctx;
					new Node.DataLeaf(ictx.getNode(), getClass(), null, stringBuffer.toString());
					stringBuffer.setLength(0);

					final Map<String, Object> callParameters = new HashMap<String, Object>();
					callParameters.put("parameter", element);
					callParameters.put("treeID", treeID);
					CallHelper.executeWithParameterInjection(
							"platform:/plugin/org.polarsys.kitalpha.doc.gen.business.core/egf/HTMLDocGenCommon.fcore#_V6ybEJ52EemYav3Xat9ApA",
							new ExecutionContext((InternalPatternContext) ctx), callParameters);
					stringBuffer.setLength(0);
				}

				stringBuffer.append(TEXT_2);
				stringBuffer
						.append(TreeServices.getDiagramsTree((BlockArchitecture) element, projectName, outputFolder));
				stringBuffer.append(TEXT_3);
				{
					//<%@ egf:patternCall patternId="platform:/plugin/org.polarsys.kitalpha.doc.gen.business.core/egf/HTMLDocGenCommon.fcore#LogicalName=org.polarsys.kitalpha.doc.gen.business.core.doccontent.treeview.TreeViewControlFooter" args="element:parameter, treeID:treeID, false:collapsed"%>

					InternalPatternContext ictx = (InternalPatternContext) ctx;
					new Node.DataLeaf(ictx.getNode(), getClass(), null, stringBuffer.toString());
					stringBuffer.setLength(0);

					final Map<String, Object> callParameters = new HashMap<String, Object>();
					callParameters.put("parameter", element);
					callParameters.put("treeID", treeID);
					callParameters.put("collapsed", false);
					CallHelper.executeWithParameterInjection(
							"platform:/plugin/org.polarsys.kitalpha.doc.gen.business.core/egf/HTMLDocGenCommon.fcore#_-tPnEJ8dEemYav3Xat9ApA",
							new ExecutionContext((InternalPatternContext) ctx), callParameters);
					stringBuffer.setLength(0);
				}

				stringBuffer.append(TEXT_4);

			}
		}

		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "body", stringBuffer.toString());
	}

	public boolean preCondition(PatternContext ctx) throws Exception {
		return element instanceof BlockArchitecture;
	}
}