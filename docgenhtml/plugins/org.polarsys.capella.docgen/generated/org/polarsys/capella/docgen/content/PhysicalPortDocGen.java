//Generated with EGF 1.6.4.202309201142
package org.polarsys.capella.docgen.content;

import org.eclipse.egf.common.helper.*;
import java.util.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.egf.model.pattern.*;
import org.eclipse.egf.pattern.execution.*;
import org.eclipse.egf.pattern.query.*;
import org.polarsys.capella.core.data.cs.Component;
import org.polarsys.capella.core.data.fa.ComponentExchange;
import org.polarsys.capella.docgen.util.CapellaComponentServices;
import org.polarsys.capella.docgen.util.StringUtil;
import org.polarsys.capella.docgen.util.pattern.helper.BlockHelper;
import org.polarsys.kitalpha.doc.gen.business.core.util.EscapeChars;
import org.polarsys.capella.core.data.oa.Entity;
import org.polarsys.capella.docgen.util.pattern.helper.CapellaComponentPortHelper;
import org.polarsys.capella.core.data.cs.PhysicalPort;
import org.polarsys.capella.core.data.cs.PhysicalLink;

public class PhysicalPortDocGen extends org.polarsys.capella.docgen.foundations.NamedElementDocGen {
  protected static String nl;

  public static synchronized PhysicalPortDocGen create(String lineSeparator) {
    nl = lineSeparator;
    PhysicalPortDocGen result = new PhysicalPortDocGen();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL + "<h2>Provided Interfaces</h2>";
  protected final String TEXT_3 = NL;
  protected final String TEXT_4 = NL + "<h2>Required Interfaces</h2>";
  protected final String TEXT_5 = NL + "<h2>Physical Links</h2>" + NL + "<table>" + NL + "\t<tr>" + NL
      + "\t\t<th>Link</th>" + NL + "\t\t<th>Ends</th>" + NL + "\t\t<th>Description</th>" + NL
      + "\t\t<th>Allocated Component Exchanges</th>" + NL + "\t\t<th>Realized Physical Links </th>" + NL
      + "\t\t<th>Realizing Physical Links</th>" + NL + "\t</tr>" + NL + "\t";
  protected final String TEXT_6 = NL + "\t";
  protected final String TEXT_7 = NL + "</table>";

  public PhysicalPortDocGen() {
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

      this.parameter = (org.polarsys.capella.core.data.cs.PhysicalPort) parameterParameter;

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

    super.orchestration(new SuperOrchestrationContext(ictx));

    if (ictx.useReporter()) {
      Map<String, Object> parameterValues = new HashMap<String, Object>();
      parameterValues.put("parameter", this.parameter);
      String outputWithCallBack = OutputManager.computeLoopOutput(ictx);
      String loop = OutputManager.computeLoopOutputWithoutCallback(ictx);
      ictx.getReporter().loopFinished(loop, outputWithCallBack, ictx, parameterValues);
    }
    return null;
  }

  protected org.polarsys.capella.core.data.cs.PhysicalPort parameter = null;

  public void set_parameter(org.polarsys.capella.core.data.cs.PhysicalPort object) {
    this.parameter = object;
  }

  public Map<String, Object> getParameters() {
    final Map<String, Object> parameters = new HashMap<String, Object>();
    parameters.put("parameter", this.parameter);
    return parameters;
  }

  protected void method_content(final StringBuffer stringBuffer, final PatternContext ctx) throws Exception {

    super.method_content(new StringBuffer(), ctx);
    String projectName = ctx.getValue("projectName").toString();
    String outputFolder = ctx.getValue("outputFolder").toString();

    stringBuffer.append(TEXT_1);

    Map<String, String> providedInterfaces = CapellaComponentPortHelper.getProvidedInterfaces(parameter, projectName,
        outputFolder);
    if (providedInterfaces.size() > 0) {

      stringBuffer.append(TEXT_2);
      stringBuffer.append(TEXT_3);
      stringBuffer.append(StringUtil.mapToHTMLTable(providedInterfaces, "Interface", "Exchange Items"));

    }
    Map<String, String> requiredInterfaces = CapellaComponentPortHelper.getRequiredInterfaces(parameter, projectName,
        outputFolder);
    if (requiredInterfaces.size() > 0) {
      stringBuffer.append(TEXT_4);
      stringBuffer.append(TEXT_3);
      stringBuffer.append(StringUtil.mapToHTMLTable(requiredInterfaces, "Interface", "Exchange Items"));

    }
    Collection<PhysicalLink> physicalLinks = CapellaComponentServices.getPhysicalLinks((PhysicalPort) element);
    if (physicalLinks.size() > 0) {

      stringBuffer.append(TEXT_5);
      for (PhysicalLink physicalLink : physicalLinks) {

        stringBuffer.append(TEXT_6);
        stringBuffer.append(CapellaComponentServices.physicalLinkToTableLine(physicalLink, projectName, outputFolder));
        stringBuffer.append(TEXT_6);

      }
      stringBuffer.append(TEXT_7);

    }

    InternalPatternContext ictx = (InternalPatternContext) ctx;
    new Node.DataLeaf(ictx.getNode(), getClass(), "content", stringBuffer.toString());
  }

  protected void method_setCapellaContext(final StringBuffer stringBuffer, final PatternContext ctx) throws Exception {

    element = parameter;

    InternalPatternContext ictx = (InternalPatternContext) ctx;
    new Node.DataLeaf(ictx.getNode(), getClass(), "setCapellaContext", stringBuffer.toString());
  }
}