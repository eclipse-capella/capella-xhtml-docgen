//Generated with EGF 1.5.1.v20180423-0901
package org.polarsys.capella.docgen.foundations;

import org.eclipse.egf.common.helper.*;
import java.util.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.egf.model.pattern.*;
import org.eclipse.egf.pattern.execution.*;
import org.eclipse.egf.pattern.query.*;
import org.polarsys.capella.docgen.util.DocGenHtmlCapellaUtil;
import org.polarsys.kitalpha.doc.gen.business.core.util.DocGenHtmlUtil;
import org.polarsys.kitalpha.doc.gen.business.core.util.LabelProviderHelper;
import org.polarsys.kitalpha.doc.gen.business.core.util.EscapeChars;

public class NamedElementDocGen extends org.polarsys.capella.docgen.foundations.CapellaElementDocGen {
	protected static String nl;

	public static synchronized NamedElementDocGen create(String lineSeparator) {
		nl = lineSeparator;
		NamedElementDocGen result = new NamedElementDocGen();
		nl = null;
		return result;
	}

	public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
	protected final String TEXT_1 = NL;
	protected final String TEXT_2 = NL;
	protected final String TEXT_3 = NL;

	public NamedElementDocGen() {
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

		if (preCondition(ctx)) {
			ctx.setNode(new Node.Container(currentNode, getClass()));
			orchestration(ctx);
		}

		ctx.setNode(currentNode);
		if (ctx.useReporter()) {
			ctx.getReporter().executionFinished(OutputManager.computeExecutionOutput(ctx), ctx);
		}

		stringBuffer.append(TEXT_2);
		stringBuffer.append(TEXT_3);
		return stringBuffer.toString();
	}

	public String orchestration(PatternContext ctx) throws Exception {
		InternalPatternContext ictx = (InternalPatternContext) ctx;

		super.orchestration(new SuperOrchestrationContext(ictx));

		return null;
	}

	public Map<String, Object> getParameters() {
		final Map<String, Object> parameters = new HashMap<String, Object>();
		return parameters;
	}

	protected void method_setContext(final StringBuffer stringBuffer, final PatternContext ctx) throws Exception {

		String elementName = EscapeChars.forHTML(LabelProviderHelper.getText(element));
		String elementType = EscapeChars.forHTML(element.eClass().getName());
		/*NamedElement namedElement = ((NamedElement) element);
		
		StringBuffer buffer = new StringBuffer (namedElement.getName());
		
		buffer
			.append (" [")
			.append (namedElement.eClass().getName())
			.append ("]");
		*/
		title = "Capella - " + DocGenHtmlUtil.getModelName(element) + " - " + elementType + " " + elementName;

		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "setContext", stringBuffer.toString());
	}

	protected void method_setFileName(final StringBuffer stringBuffer, final PatternContext ctx) throws Exception {

		fileName = DocGenHtmlCapellaUtil.getNamedElementRootFileName(element);

		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "setFileName", stringBuffer.toString());
	}

	protected void method_content(final StringBuffer stringBuffer, final PatternContext ctx) throws Exception {

		super.method_content(new StringBuffer(), ctx);
		stringBuffer.append(TEXT_1);
		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "content", stringBuffer.toString());
	}
}