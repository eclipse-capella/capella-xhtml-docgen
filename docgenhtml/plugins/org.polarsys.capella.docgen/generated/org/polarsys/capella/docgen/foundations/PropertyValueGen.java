//Generated with EGF 1.6.4.202309201142
package org.polarsys.capella.docgen.foundations;

import java.util.*;
import org.eclipse.egf.model.pattern.*;
import org.eclipse.egf.pattern.execution.*;
import org.eclipse.egf.pattern.query.*;
import org.eclipse.emf.common.util.*;
import org.polarsys.capella.core.data.capellacore.AbstractPropertyValue;
import org.polarsys.capella.core.data.capellacore.PropertyValueGroup;
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
  protected final String TEXT_1 = "\t<table style=\"border:none\">" + NL + "\t\t<tr style=\"border:none\">" + NL
      + "\t\t\t<td style=\"border:none; vertical-align:top\">" + NL + "\t";
  protected final String TEXT_2 = NL + "\t<h";
  protected final String TEXT_3 = ">Property Values</h";
  protected final String TEXT_4 = ">" + NL + "\t<table max-width=screen.width>" + NL + "\t   <thead> " + NL
      + "\t       <tr>" + NL + "\t       \t   <th>Relation</th>\t" + NL + "\t           <th>Name</th>" + NL
      + "\t           <th>Value</th>" + NL + "\t           <th>Description</th>" + NL + "\t       </tr>" + NL
      + "\t   </thead>" + NL + "\t   <tbody>" + NL + "\t";
  protected final String TEXT_5 = NL + "\t";
  protected final String TEXT_6 = NL + "\t</tbody>" + NL + "\t</table>" + NL + "\t";
  protected final String TEXT_7 = NL + "\t\t\t</td>" + NL + "\t\t\t<td style=\"border:none; vertical-align:top\">" + NL
      + "\t";
  protected final String TEXT_8 = ">Property Value Groups</h";
  protected final String TEXT_9 = NL + "\t\t\t</td>" + NL + "\t\t</tr>" + NL + "\t</table>" + NL + "\t";
  protected final String TEXT_10 = NL;

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
    List<Object> sectionLevelParameterList = null;
    //this pattern can only be called by another (i.e. it's not an entry point in execution)
    List<Object> displayAsRowParameterList = null;
    //this pattern can only be called by another (i.e. it's not an entry point in execution)

    for (Object elementParameter : elementList) {
      for (Object outputFolderParameter : outputFolderList) {
        for (Object projectNameParameter : projectNameList) {
          for (Object sectionLevelParameterParameter : sectionLevelParameterList) {
            for (Object displayAsRowParameterParameter : displayAsRowParameterList) {

              this.element = (org.polarsys.capella.core.data.capellacore.CapellaElement) elementParameter;
              this.outputFolder = (java.lang.String) outputFolderParameter;
              this.projectName = (java.lang.String) projectNameParameter;
              this.sectionLevelParameter = (java.lang.Integer) sectionLevelParameterParameter;
              this.displayAsRowParameter = (java.lang.Boolean) displayAsRowParameterParameter;

              if (preCondition(ctx)) {
                ctx.setNode(new Node.Container(currentNode, getClass()));
                orchestration(ctx);
              }

            }
          }
        }
      }
    }
    ctx.setNode(currentNode);
    if (ctx.useReporter()) {
      ctx.getReporter().executionFinished(OutputManager.computeExecutionOutput(ctx), ctx);
    }

    stringBuffer.append(TEXT_10);
    stringBuffer.append(TEXT_10);
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
      parameterValues.put("sectionLevelParameter", this.sectionLevelParameter);
      parameterValues.put("displayAsRowParameter", this.displayAsRowParameter);
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

  protected java.lang.Integer sectionLevelParameter = null;

  public void set_sectionLevelParameter(java.lang.Integer object) {
    this.sectionLevelParameter = object;
  }

  protected java.lang.Boolean displayAsRowParameter = null;

  public void set_displayAsRowParameter(java.lang.Boolean object) {
    this.displayAsRowParameter = object;
  }

  public Map<String, Object> getParameters() {
    final Map<String, Object> parameters = new HashMap<String, Object>();
    parameters.put("element", this.element);
    parameters.put("outputFolder", this.outputFolder);
    parameters.put("projectName", this.projectName);
    parameters.put("sectionLevelParameter", this.sectionLevelParameter);
    parameters.put("displayAsRowParameter", this.displayAsRowParameter);
    return parameters;
  }

  protected void method_body(final StringBuffer stringBuffer, final PatternContext ctx) throws Exception {

    int sectionLevel = 2;
    if (sectionLevelParameter != null) {
      sectionLevel = sectionLevelParameter;
    }
    ;
    // We get the list of applied and owned PV
    EList<AbstractPropertyValue> applied_list = element.getAppliedPropertyValues();
    EList<AbstractPropertyValue> owned_list = element.getOwnedPropertyValues();

    // If we want to display both tables horizontally
    if (displayAsRowParameter != null && displayAsRowParameter) {

      stringBuffer.append(TEXT_1);

    }
    if ((applied_list != null && applied_list.size() > 0) || (owned_list != null && owned_list.size() > 0)) {

      stringBuffer.append(TEXT_2);
      stringBuffer.append(sectionLevel);
      stringBuffer.append(TEXT_3);
      stringBuffer.append(sectionLevel);
      stringBuffer.append(TEXT_4);

      String table = PropertyValueHelper.getPVTable(element, 0, projectName, outputFolder);

      stringBuffer.append(TEXT_5);
      stringBuffer.append(table);
      stringBuffer.append(TEXT_6);

      if (displayAsRowParameter != null && displayAsRowParameter) {

        stringBuffer.append(TEXT_7);

      }
    }

    // We get the list of applied and owned PVG
    EList<PropertyValueGroup> appliedgroup_list = element.getAppliedPropertyValueGroups();
    EList<PropertyValueGroup> ownedgroup_list = element.getOwnedPropertyValueGroups();

    if ((appliedgroup_list != null && appliedgroup_list.size() > 0)
        || (ownedgroup_list != null && ownedgroup_list.size() > 0)) {

      stringBuffer.append(TEXT_2);
      stringBuffer.append(sectionLevel);
      stringBuffer.append(TEXT_8);
      stringBuffer.append(sectionLevel);
      stringBuffer.append(TEXT_4);

      String table = PropertyValueHelper.getPVGTable(element, 0, projectName, outputFolder);

      stringBuffer.append(TEXT_5);
      stringBuffer.append(table);
      stringBuffer.append(TEXT_6);

    }
    if (displayAsRowParameter != null && displayAsRowParameter) {

      stringBuffer.append(TEXT_9);

    }

    stringBuffer.append(TEXT_10);
    InternalPatternContext ictx = (InternalPatternContext) ctx;
    new Node.DataLeaf(ictx.getNode(), getClass(), "body", stringBuffer.toString());
  }

  public boolean preCondition(PatternContext ctx) throws Exception {
    return true;
  }
}