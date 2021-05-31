/*******************************************************************************
 * Copyright (c) 2006, 2021 THALES GLOBAL SERVICES.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales - initial API and implementation
 ******************************************************************************/

package org.polarsys.capella.docgen.util;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.eclipse.osgi.util.NLS;
import org.polarsys.capella.common.data.behavior.TimeExpression;
import org.polarsys.capella.common.data.modellingcore.AbstractConstraint;
import org.polarsys.capella.common.data.modellingcore.ModelElement;
import org.polarsys.capella.common.data.modellingcore.ValueSpecification;
import org.polarsys.capella.common.linkedtext.ui.LinkedTextDocument;
import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.core.data.capellacore.Constraint;
import org.polarsys.capella.core.data.information.datavalue.DataValue;
import org.polarsys.capella.core.data.information.datavalue.OpaqueExpression;
import org.polarsys.capella.core.linkedtext.ui.CapellaEmbeddedLinkedTextEditorInput;
import org.polarsys.capella.core.model.helpers.ConstraintExt;
import org.polarsys.capella.docgen.Messages;

/**
 * @author Boubekeur Zendagui
 */
public class ConstraintsService {
	
	private ConstraintsService() {}

	/**
	 * Get the constraints applied on {@code element} that are not contained in {@code element}.
	 * @param element
	 * @return
	 */
	public static List<AbstractConstraint> getAppliedAndNotOwnedConstraints(CapellaElement element) {
		List<AbstractConstraint> ownedConstraints = element.getOwnedConstraints();
		return element.getConstraints().stream().filter(c -> !ownedConstraints.contains(c)).collect(Collectors.toList());
	}
	
	/**
	 * Get the constraint name. Defaults to {@linkplain CapellaServices.NO_NAME} when null or empty name content.
	 * @param constraint
	 * @return
	 */
	public static String getConstraintName(AbstractConstraint constraint) {
		String constraintName = "";
		if (constraint instanceof Constraint) {
			constraintName = ((Constraint)constraint).getName();
		}
		if (constraintName == null || constraintName.isEmpty()) {
			constraintName = CapellaServices.NO_NAME;
		}
		return constraintName;
	}
	
	/**
	 * Transforms elements of the {@link Constraint#getConstrainedElements()} to an HTML list 
	 * @param constraint the concerned {@link Constraint}
	 * @param projectName the project wherein the documentation is generated
	 * @param outputFolder  the folder wherein the documentation is generated
	 * @return An HTML list of all constrained elements
	 */
	public static String getConstrainedElement(Constraint constraint, String projectName, String outputFolder){
		final EList<ModelElement> constrainedElements = constraint.getConstrainedElements();
		final List<String> result = new ArrayList<>();
		for (ModelElement modelElement : constrainedElements) 
		{
			final String imageLinkFromElement = CapellaServices.getImageLinkFromElement(modelElement, projectName, outputFolder);
			final String hyperlinkFromElement = CapellaServices.getHyperlinkFromElement(modelElement);
			result.add(imageLinkFromElement + " " + hyperlinkFromElement);
		}
		
		final String result_s = StringUtil.stringListToBulette(result);
		return !result_s.isEmpty() ? result_s : "No constrained elements";
	}
	
	/**
	 * Export a {@link ValueSpecification} to HTML format
	 * @param valueSpecification the {@link ValueSpecification} to export in HTML format
	 * @param projectName the project wherein the documentation is generated
	 * @param outputFolder  the folder wherein the documentation is generated
	 * @return the {@link ValueSpecification} documentation
	 */
	public static String getValueSpecification(ValueSpecification valueSpecification, String projectName, String outputFolder){
		if (valueSpecification == null)
			return "[No value specification]";
		
		if (valueSpecification instanceof DataValue)
		{// Generate Data value
			DataValue dataValue = (DataValue) valueSpecification;
			return CapellaDataValueServices.getDataValueInformation(dataValue, projectName, outputFolder);
		}
		
		if (valueSpecification instanceof OpaqueExpression)
		{// Generate Data value
			OpaqueExpression expression = (OpaqueExpression) valueSpecification;
			return getOpaqueExpressionInformation(expression);
		}
		
		if (valueSpecification instanceof TimeExpression)
		{// Generate Data value
			// TimeExpression interface has no implementation.
			Logger.logWarning(NLS.bind(Messages.elementTypeNotHandled, "TimeExpression"), null);
			return "";
		}
		
		return "[Unknown value specification]";
	}

	/**
	 * Returns a string representation for a {@link OpaqueExpression}. 
	 * @param expression The expression to extract
	 * @return Whole expression string representation
	 */
	private static String getOpaqueExpressionInformation(OpaqueExpression expression) {
		StringBuilder result = new StringBuilder();
		final EList<String> languages = expression.getLanguages();
		if (!languages.isEmpty())
		{
			for (int i = 0; i < languages.size(); i++) 
			{
				final String language = languages.get(i);
				result.append(CapellaServices.BOLD_BEGIN);
				result.append(language.equals(ConstraintExt.OPAQUE_EXPRESSION_LINKED_TEXT) ? "LinkedText" : language);
				result.append(CapellaServices.VALUE_PRESENTER);
				result.append(CapellaServices.BOLD_END);
				result.append(CapellaServices.NEW_LINE);
				result.append(getOpaqueExpressionValue(expression, i));
				if (i+1 < languages.size())
					result.append(CapellaServices.NEW_LINE);
			}
		}
		
		return result.toString();
	}
	
	/**
	 * Return an expression Body
	 * @param exp an {@link OpaqueExpression}
	 * @param index the index of the expression to export.
	 * @return expression Body
	 */
	private static String getOpaqueExpressionValue(OpaqueExpression exp, int index){
		String result = "<pre>";
		if (ConstraintExt.OPAQUE_EXPRESSION_LINKED_TEXT.equals(exp.getLanguages().get(index))) 
		{
			CapellaEmbeddedLinkedTextEditorInput input = new CapellaEmbeddedLinkedTextEditorInput.Readonly(exp, exp.getBodies().get(index));
			result += LinkedTextDocument.load(input).get();
			input.dispose();
		} 
		else 
		{
			result += exp.getBodies().get(index);
		}
		
		result += "</pre>";
		
		return result;
	}
}
