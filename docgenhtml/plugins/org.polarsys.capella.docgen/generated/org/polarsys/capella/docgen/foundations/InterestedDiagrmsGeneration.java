//Generated with EGF 1.6.1.201906060805
package org.polarsys.capella.docgen.foundations;

import java.util.stream.Collectors;
import org.polarsys.kitalpha.doc.gen.business.core.scope.GenerationGlobalScope;
import org.polarsys.kitalpha.doc.gen.business.core.util.DocGenHtmlUtil;
import org.polarsys.kitalpha.doc.gen.business.core.util.EscapeChars;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.emf.common.util.EList;
import org.eclipse.sirius.viewpoint.DRepresentationDescriptor;
import org.polarsys.kitalpha.doc.gen.business.core.sirius.util.session.DiagramSessionHelper;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.viewpoint.description.DAnnotation;
import org.polarsys.capella.core.diagram.helpers.DAnnotationHelper;
import org.polarsys.capella.core.diagram.helpers.naming.DAnnotationSourceConstants;
import org.eclipse.egf.common.helper.*;
import java.util.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.egf.model.pattern.*;
import org.eclipse.egf.pattern.execution.*;
import org.eclipse.egf.pattern.query.*;
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.core.data.capellacore.NamedElement;
import org.polarsys.capella.docgen.diagram.CapellaHelper;
import org.polarsys.capella.docgen.util.DocGenHtmlCapellaControl;
import org.polarsys.capella.docgen.util.DocGenHtmlCapellaUtil;
import org.polarsys.capella.docgen.util.CapellaDiagramHelper;
import org.polarsys.capella.docgen.util.CapellaServices;
import org.polarsys.kitalpha.doc.gen.business.core.util.LabelProviderHelper;
import org.polarsys.kitalpha.doc.gen.business.core.preference.helper.DocgenDiagramPreferencesHelper;

public class InterestedDiagrmsGeneration {
	protected static String nl;

	public static synchronized InterestedDiagrmsGeneration create(String lineSeparator) {
		nl = lineSeparator;
		InterestedDiagrmsGeneration result = new InterestedDiagrmsGeneration();
		nl = null;
		return result;
	}

	public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
	protected final String TEXT_1 = "";
	protected final String TEXT_2 = NL;
	protected final String TEXT_3 = NL + "\t<h2>Diagrams interesting for \"";
	protected final String TEXT_4 = "\"</h2>" + NL + "\t";
	protected final String TEXT_5 = NL + "\t\t<div>" + NL + "\t\t\t";
	protected final String TEXT_6 = NL + "\t\t\t<p class=\"diagram-name\" id=\"";
	protected final String TEXT_7 = "\">";
	protected final String TEXT_8 = "</p>" + NL + "\t\t\t<p class=\"diagram\">" + NL + "\t\t\t\t";
	protected final String TEXT_9 = NL + "\t\t\t\t";
	protected final String TEXT_10 = NL + "\t\t\t\t<br/>" + NL + "\t\t\t\t<br/>" + NL + "\t\t\t</p>" + NL + "\t\t</div>"
			+ NL + "\t";

	public InterestedDiagrmsGeneration() {
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

		stringBuffer.append(TEXT_2);
		stringBuffer.append(TEXT_2);
		return stringBuffer.toString();
	}

	public String orchestration(PatternContext ctx) throws Exception {
		InternalPatternContext ictx = (InternalPatternContext) ctx;

		method_setContext(new StringBuffer(), ictx);

		method_body(new StringBuffer(), ictx);

		if (ictx.useReporter()) {
			Map<String, Object> parameterValues = new HashMap<String, Object>();
			parameterValues.put("element", this.element);
			String outputWithCallBack = OutputManager.computeLoopOutput(ictx);
			String loop = OutputManager.computeLoopOutputWithoutCallback(ictx);
			ictx.getReporter().loopFinished(loop, outputWithCallBack, ictx, parameterValues);
		}
		return null;
	}

	protected org.polarsys.kitalpha.doc.gen.business.core.util.IFileNameService fileNameService = null;

	public void set_fileNameService(org.polarsys.kitalpha.doc.gen.business.core.util.IFileNameService object) {
		this.fileNameService = object;
	}

	protected org.polarsys.kitalpha.doc.gen.business.core.util.IDiagramHelper helper = null;

	public void set_helper(org.polarsys.kitalpha.doc.gen.business.core.util.IDiagramHelper object) {
		this.helper = object;
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

	protected void method_setContext(final StringBuffer stringBuffer, final PatternContext ctx) throws Exception {

		fileNameService = DocGenHtmlCapellaUtil.SERVICE;
		helper = new CapellaDiagramHelper();

		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "setContext", stringBuffer.toString());
	}

	protected void method_body(final StringBuffer stringBuffer, final PatternContext ctx) throws Exception {

		Collection<DDiagram> interestedDiagrams = CapellaHelper.getAllInterestedRepresentationsFor(element);
		stringBuffer.append(TEXT_1);
		List<DSemanticDiagram> exportableDiagrams = interestedDiagrams.parallelStream()
				.filter(diagram -> diagram instanceof DSemanticDiagram).map(diagram -> (DSemanticDiagram) diagram)
				.filter(diagram -> GenerationGlobalScope.getInstance().isCopyInScope(diagram.getTarget()))
				.collect(Collectors.toList());
		stringBuffer.append(TEXT_2);
		if (!exportableDiagrams.isEmpty()) {
			stringBuffer.append(TEXT_3);
			stringBuffer.append(LabelProviderHelper.getText(element));
			stringBuffer.append(TEXT_4);
			exportableDiagrams.forEach(diagram -> {
				stringBuffer.append(TEXT_5);
				String id = DiagramSessionHelper.getID(diagram);
				stringBuffer.append(TEXT_6);
				stringBuffer.append(id);
				stringBuffer.append(TEXT_7);
				stringBuffer.append(EscapeChars.forHTML(diagram.getName()));
				stringBuffer.append(TEXT_8);
				String generatedFolder = fileNameService.getFileName(diagram.getTarget());
				stringBuffer.append(TEXT_9);
				stringBuffer.append(CapellaServices.getImageLinkForDiagram(generatedFolder, diagram));
				stringBuffer.append(TEXT_10);
			});
		}
		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "body", stringBuffer.toString());
	}

	public boolean preCondition(PatternContext ctx) throws Exception {
		return true;
	}
}