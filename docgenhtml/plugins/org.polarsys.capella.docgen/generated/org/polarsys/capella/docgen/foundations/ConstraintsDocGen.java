//Generated with EGF 1.6.4.202309201142
package org.polarsys.capella.docgen.foundations;

import java.util.*;
import org.eclipse.egf.model.pattern.*;
import org.eclipse.egf.pattern.execution.*;
import org.eclipse.egf.pattern.query.*;
import org.polarsys.capella.core.data.capellacore.Constraint;
import org.polarsys.capella.docgen.util.ConstraintsService;
import org.polarsys.capella.docgen.util.pattern.helper.PropertyValueHelper;

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
      + "\t\t\t<td style=\"font-weight: bold; text-align: center; width: 15%\"> Constrained elements<br /></td>" + NL
      + "\t\t\t" + NL + "        </tr>";
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
      + "\t\t\tApplied and Contained Property Values" + NL + "\t\t\t</th>" + NL + "\t\t</tr>" + NL + "\t\t<tr>" + NL
      + "\t\t\t<td colspan=\"2\">";
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
    List<Object> constraintsListList = null;
    //this pattern can only be called by another (i.e. it's not an entry point in execution)
    List<Object> constraintSectionTitleList = null;
    //this pattern can only be called by another (i.e. it's not an entry point in execution)

    for (Object parameterParameter : parameterList) {
      for (Object constraintsListParameter : constraintsListList) {
        for (Object constraintSectionTitleParameter : constraintSectionTitleList) {

          this.parameter = (org.polarsys.capella.core.data.capellacore.CapellaElement) parameterParameter;
          this.constraintsList = (java.util.List) constraintsListParameter;
          this.constraintSectionTitle = (java.lang.String) constraintSectionTitleParameter;

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
      parameterValues.put("constraintsList", this.constraintsList);
      parameterValues.put("constraintSectionTitle", this.constraintSectionTitle);
      String outputWithCallBack = OutputManager.computeLoopOutput(ictx);
      String loop = OutputManager.computeLoopOutputWithoutCallback(ictx);
      ictx.getReporter().loopFinished(loop, outputWithCallBack, ictx, parameterValues);
    }
    return null;
  }

  protected org.polarsys.capella.core.data.capellacore.CapellaElement parameter = null;

  public void set_parameter(org.polarsys.capella.core.data.capellacore.CapellaElement object) {
    this.parameter = object;
  }

  protected java.util.List constraintsList = null;

  public void set_constraintsList(java.util.List object) {
    this.constraintsList = object;
  }

  protected java.lang.String constraintSectionTitle = null;

  public void set_constraintSectionTitle(java.lang.String object) {
    this.constraintSectionTitle = object;
  }

  public Map<String, Object> getParameters() {
    final Map<String, Object> parameters = new HashMap<String, Object>();
    parameters.put("parameter", this.parameter);
    parameters.put("constraintsList", this.constraintsList);
    parameters.put("constraintSectionTitle", this.constraintSectionTitle);
    return parameters;
  }

  protected void method_genConstraints(final StringBuffer stringBuffer, final PatternContext ctx) throws Exception {

    // Fallback to default behavior
    if (constraintSectionTitle == null || constraintSectionTitle.trim().equals("")) {
      constraintSectionTitle = "Constraints";
    }
    if (constraintsList == null || constraintsList.isEmpty()) {
      constraintsList = parameter.getOwnedConstraints();
    }

    stringBuffer.append(TEXT_1);
    {
      //<%@ egf:patternCall patternId="platform:/plugin/org.polarsys.kitalpha.doc.gen.business.core/egf/HTMLDocGenCommon.fcore#LogicalName=org.polarsys.kitalpha.doc.gen.business.core.generic.ElementGenerateByPropterty" args="parameter:eObject,constraintSectionTitle:property"%>

      InternalPatternContext ictx = (InternalPatternContext) ctx;
      new Node.DataLeaf(ictx.getNode(), getClass(), null, stringBuffer.toString());
      stringBuffer.setLength(0);

      final Map<String, Object> callParameters = new HashMap<String, Object>();
      callParameters.put("eObject", parameter);
      callParameters.put("property", constraintSectionTitle);
      CallHelper.executeWithParameterInjection(
          "platform:/plugin/org.polarsys.kitalpha.doc.gen.business.core/egf/HTMLDocGenCommon.fcore#_cWGxMONUEd-euK0PeLuaMA",
          new ExecutionContext((InternalPatternContext) ctx), callParameters);
      stringBuffer.setLength(0);
    }

    stringBuffer.append(TEXT_2);
    String projectName = (String) ctx.getValue("projectName");
    String outputFolder = (String) ctx.getValue("outputFolder");
    stringBuffer.append(TEXT_3);

    List<?> constraints = constraintsList;
    constraints.stream().filter(Constraint.class::isInstance).forEach(c -> {
      Constraint constraint = (Constraint) c;
      String constraintName = ConstraintsService.getConstraintName(constraint);

      stringBuffer.append(TEXT_4);

      Boolean hasAppliedPVorPVGs = PropertyValueHelper.hasAppliedOrOwnedPropertyValues(constraint);
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
      stringBuffer.append(
          ConstraintsService.getValueSpecification(constraint.getOwnedSpecification(), projectName, outputFolder));
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
    });

    stringBuffer.append(TEXT_14);
    InternalPatternContext ictx = (InternalPatternContext) ctx;
    new Node.DataLeaf(ictx.getNode(), getClass(), "genConstraints", stringBuffer.toString());
  }

  public boolean preCondition(PatternContext ctx) throws Exception {
    return true;
  }
}