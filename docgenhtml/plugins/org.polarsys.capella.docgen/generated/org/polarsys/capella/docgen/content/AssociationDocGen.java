//Generated with EGF 1.6.4.202309201142
package org.polarsys.capella.docgen.content;

import java.util.*;
import org.eclipse.egf.model.pattern.*;
import org.eclipse.egf.pattern.execution.*;
import org.eclipse.egf.pattern.query.*;
import org.polarsys.capella.docgen.util.CapellaAssociationService;
import org.polarsys.capella.docgen.util.StringUtil;
import org.polarsys.capella.core.data.information.Association;

public class AssociationDocGen extends org.polarsys.capella.docgen.foundations.NamedElementDocGen {
  protected static String nl;

  public static synchronized AssociationDocGen create(String lineSeparator) {
    nl = lineSeparator;
    AssociationDocGen result = new AssociationDocGen();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL + "<div title=\"";
  protected final String TEXT_3 = "\">";
  protected final String TEXT_4 = NL;
  protected final String TEXT_5 = NL + "</div>";

  public AssociationDocGen() {
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

      this.parameter = (org.polarsys.capella.core.data.information.Association) parameterParameter;

      if (preCondition(ctx)) {
        ctx.setNode(new Node.Container(currentNode, getClass()));
        orchestration(ctx);
      }

    }
    ctx.setNode(currentNode);
    if (ctx.useReporter()) {
      ctx.getReporter().executionFinished(OutputManager.computeExecutionOutput(ctx), ctx);
    }

    stringBuffer.append(TEXT_4);
    stringBuffer.append(TEXT_4);
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

  protected org.polarsys.capella.core.data.information.Association parameter = null;

  public void set_parameter(org.polarsys.capella.core.data.information.Association object) {
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

    List<String> ownedMembers = CapellaAssociationService
        .getInformationForAssociationOwnedMembers((Association) element, projectName, outputFolder);
    if (ownedMembers.size() >= 1) {

      String sectionName = "Source";
      stringBuffer.append(TEXT_2);
      stringBuffer.append(sectionName);
      stringBuffer.append(TEXT_3);
      stringBuffer.append(TEXT_4);
      {
        //<%@ egf:patternCall patternId="platform:/plugin/org.polarsys.kitalpha.doc.gen.business.core/egf/HTMLDocGenCommon.fcore#LogicalName=org.polarsys.kitalpha.doc.gen.business.core.generic.ElementGenerateByPropterty" args="element:eObject,sectionName:property"%>

        InternalPatternContext ictx = (InternalPatternContext) ctx;
        new Node.DataLeaf(ictx.getNode(), getClass(), null, stringBuffer.toString());
        stringBuffer.setLength(0);

        final Map<String, Object> callParameters = new HashMap<String, Object>();
        callParameters.put("eObject", element);
        callParameters.put("property", sectionName);
        CallHelper.executeWithParameterInjection(
            "platform:/plugin/org.polarsys.kitalpha.doc.gen.business.core/egf/HTMLDocGenCommon.fcore#_cWGxMONUEd-euK0PeLuaMA",
            new ExecutionContext((InternalPatternContext) ctx), callParameters);
        stringBuffer.setLength(0);
      }

      stringBuffer.append(TEXT_4);
      stringBuffer.append(StringUtil.stringListToBulette(ownedMembers));
      stringBuffer.append(TEXT_5);
    }
    stringBuffer.append(TEXT_4);

    List<String> navigableMembers = CapellaAssociationService
        .getInformationForAssociationNavigableMembers((Association) element, projectName, outputFolder);
    if (navigableMembers.size() >= 1) {

      String sectionName = "Target";
      stringBuffer.append(TEXT_2);
      stringBuffer.append(sectionName);
      stringBuffer.append(TEXT_3);
      stringBuffer.append(TEXT_4);
      {
        //<%@ egf:patternCall patternId="platform:/plugin/org.polarsys.kitalpha.doc.gen.business.core/egf/HTMLDocGenCommon.fcore#LogicalName=org.polarsys.kitalpha.doc.gen.business.core.generic.ElementGenerateByPropterty" args="element:eObject,sectionName:property"%>

        InternalPatternContext ictx = (InternalPatternContext) ctx;
        new Node.DataLeaf(ictx.getNode(), getClass(), null, stringBuffer.toString());
        stringBuffer.setLength(0);

        final Map<String, Object> callParameters = new HashMap<String, Object>();
        callParameters.put("eObject", element);
        callParameters.put("property", sectionName);
        CallHelper.executeWithParameterInjection(
            "platform:/plugin/org.polarsys.kitalpha.doc.gen.business.core/egf/HTMLDocGenCommon.fcore#_cWGxMONUEd-euK0PeLuaMA",
            new ExecutionContext((InternalPatternContext) ctx), callParameters);
        stringBuffer.setLength(0);
      }

      stringBuffer.append(TEXT_4);
      stringBuffer.append(StringUtil.stringListToBulette(navigableMembers));
      stringBuffer.append(TEXT_5);
    }
    InternalPatternContext ictx = (InternalPatternContext) ctx;
    new Node.DataLeaf(ictx.getNode(), getClass(), "content", stringBuffer.toString());
  }

  protected void method_setCapellaContext(final StringBuffer stringBuffer, final PatternContext ctx) throws Exception {

    element = parameter;

    InternalPatternContext ictx = (InternalPatternContext) ctx;
    new Node.DataLeaf(ictx.getNode(), getClass(), "setCapellaContext", stringBuffer.toString());
  }

  public boolean preCondition(PatternContext ctx) throws Exception {
    return (this.parameter instanceof Association);
  }
}