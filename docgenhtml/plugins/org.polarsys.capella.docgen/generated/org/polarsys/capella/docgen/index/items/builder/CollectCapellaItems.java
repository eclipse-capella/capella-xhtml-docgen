//Generated with EGF 1.6.3.202110291409
package org.polarsys.capella.docgen.index.items.builder;

import org.polarsys.kitalpha.doc.gen.business.core.services.IndexItem;
import org.polarsys.capella.docgen.util.CapellaServices;
import org.polarsys.capella.docgen.util.DocGenHtmlCapellaUtil;
import org.polarsys.kitalpha.doc.gen.business.core.services.IndexerService;
import org.polarsys.kitalpha.doc.gen.business.core.services.ExtensionService;
import org.polarsys.kitalpha.doc.gen.business.core.helper.IConceptsHelper;
import java.util.*;
import org.eclipse.egf.model.pattern.*;
import org.eclipse.egf.pattern.execution.*;
import org.eclipse.egf.pattern.query.*;
import org.polarsys.kitalpha.doc.gen.business.core.util.DefaultFileNameService;
import org.polarsys.capella.common.data.modellingcore.ModelElement;

public class CollectCapellaItems {
    protected static String nl;

    public static synchronized CollectCapellaItems create(String lineSeparator) {
        nl = lineSeparator;
        CollectCapellaItems result = new CollectCapellaItems();
        nl = null;
        return result;
    }

    public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;

    protected final String TEXT_1 = "";

    protected final String TEXT_2 = NL;

    public CollectCapellaItems() {
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

            this.parameter = (org.eclipse.emf.ecore.EObject) parameterParameter;

            if (preCondition(ctx)) {
                ctx.setNode(new Node.Container(currentNode, getClass()));
                orchestration(ctx);
            }

        }
        ctx.setNode(currentNode);
        if (ctx.useReporter()) {
            ctx.getReporter().executionFinished(OutputManager.computeExecutionOutput(ctx), ctx);
        }

        stringBuffer.append(TEXT_1);
        stringBuffer.append(TEXT_2);
        return stringBuffer.toString();
    }

    public String orchestration(PatternContext ctx) throws Exception {
        InternalPatternContext ictx = (InternalPatternContext) ctx;

        method_setContext(new StringBuffer(), ictx);

        method_body(new StringBuffer(), ictx);

        if (ictx.useReporter()) {
            Map<String, Object> parameterValues = new HashMap<String, Object>();
            parameterValues.put("parameter", this.parameter);
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

    protected org.eclipse.emf.ecore.EObject parameter = null;

    public void set_parameter(org.eclipse.emf.ecore.EObject object) {
        this.parameter = object;
    }

    public Map<String, Object> getParameters() {
        final Map<String, Object> parameters = new HashMap<String, Object>();
        parameters.put("parameter", this.parameter);
        return parameters;
    }

    protected void method_setContext(final StringBuffer stringBuffer, final PatternContext ctx) throws Exception {

        fileNameService = DocGenHtmlCapellaUtil.SERVICE;

        InternalPatternContext ictx = (InternalPatternContext) ctx;
        new Node.DataLeaf(ictx.getNode(), getClass(), "setContext", stringBuffer.toString());
    }

    protected void method_body(final StringBuffer stringBuffer, final PatternContext ctx) throws Exception {

        List<IConceptsHelper> conceptsHelperList = ExtensionService.INSTANCE.getConceptsHelpersList();

        String projectName = (String) ctx.getValue("projectName");
        String outputFolder = (String) ctx.getValue("outputFolder");

        for (IConceptsHelper iConceptsHelper : conceptsHelperList) {
            if (iConceptsHelper.accept(parameter)) {
                String conceptLabel = iConceptsHelper.getConceptLabel(parameter);
                String linkTagTowardPageElement = CapellaServices.getIndexHyperlinkFromElement(parameter);
                String iconTagOfElement = CapellaServices.getIndexImageLinkFromElement(parameter, projectName, outputFolder);
                String fileName = DocGenHtmlCapellaUtil.SERVICE.getFileName(parameter);
                IndexItem item = new IndexItem(conceptLabel, parameter.eClass().getName(), iconTagOfElement, linkTagTowardPageElement, fileName);
                // Check if the default indexer have already indexed the element
                String defaultFileName = DefaultFileNameService.INSTANCE.getFileName(parameter);
                if (IndexerService.INSTANCE.getElementsToIndexItems().get(defaultFileName) != null) {
                    IndexerService.INSTANCE.getElementsToIndexItems().remove(defaultFileName);
                }
                IndexerService.INSTANCE.getElementsToIndexItems().put(fileName, item);
                break;
            }
        }

        InternalPatternContext ictx = (InternalPatternContext) ctx;
        new Node.DataLeaf(ictx.getNode(), getClass(), "body", stringBuffer.toString());
    }

    public boolean preCondition(PatternContext ctx) throws Exception {
        return parameter instanceof ModelElement;
    }
}
