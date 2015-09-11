/*******************************************************************************
 * Copyright (c) 2006, 2015 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales - initial API and implementation
 ******************************************************************************/

package org.polarsys.capella.docgen.util;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.polarsys.capella.common.data.behavior.TimeExpression;
import org.polarsys.capella.common.data.modellingcore.ModelElement;
import org.polarsys.capella.common.data.modellingcore.ValueSpecification;
import org.polarsys.capella.common.linkedtext.ui.LinkedTextDocument;
import org.polarsys.capella.core.data.capellacore.Constraint;
import org.polarsys.capella.core.data.information.datavalue.DataValue;
import org.polarsys.capella.core.data.information.datavalue.OpaqueExpression;
import org.polarsys.capella.core.linkedtext.ui.CapellaEmbeddedLinkedTextEditorInput;
import org.polarsys.capella.core.linkedtext.ui.CapellaLinkedTextConstants;

/**
 * @author Boubekeur Zendagui
 */
public class ConstraintsService {

	/**
	 * Transforms elements of the {@link Constraint#getConstrainedElements()} to an HTML list 
	 * @param constraint the concerned {@link Constraint}
	 * @param projectName the project wherein the documentation is generated
	 * @param outputFolder  the folder wherein the documentation is generated
	 * @return An HTML list of all constrained elements
	 */
	public static String getConstrainedElement(Constraint constraint, String projectName, String outputFolder){
		final EList<ModelElement> constrainedElements = constraint.getConstrainedElements();
		final List<String> result = new ArrayList<String>();
		for (ModelElement modelElement : constrainedElements) 
		{
			final String imageLinkFromElement = CapellaServices.getImageLinkFromElement(modelElement, projectName, outputFolder);
			final String hyperlinkFromElement = CapellaServices.getHyperlinkFromElement(modelElement);
			result.add(imageLinkFromElement + " " + hyperlinkFromElement);
		}
		
		final String result_s = StringUtil.stringListToBulette(result);
		return result_s.isEmpty() == false ? result_s : "No constrained elements";
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
			DataValue dataValue_p = (DataValue) valueSpecification;
			return CapellaDataValueServices.getDataValueInformation(dataValue_p, projectName, outputFolder);
		}
		
		if (valueSpecification instanceof OpaqueExpression)
		{// Generate Data value
			String result = "";
			OpaqueExpression expression = (OpaqueExpression) valueSpecification;
			final EList<String> languages = expression.getLanguages();
			if (languages.isEmpty() == false)
			{
				for (int i = 0; i < languages.size(); i++) 
				{
					final String language = languages.get(i);
					result += CapellaServices.BOLD_BEGIN;
					result += language.equals(CapellaLinkedTextConstants.OPAQUE_EXPRESSION_LINKED_TEXT) ? "LinkedText" : language;
					result += CapellaServices.VALUE_PRESENTER;
					result += CapellaServices.BOLD_END;
					result += CapellaServices.NEW_LINE;
					result += getOpaqueExpressionValue(expression, i);
					if (i+1 < languages.size())
						result += CapellaServices.NEW_LINE;
				}
			}
			
			return result;
		}
		
		if (valueSpecification instanceof TimeExpression)
		{// Generate Data value
			String result = "";
			
			return result;
		}
		
		return "[Unknown value specification]";
	}
	
	/**
	 * Return an expression Body
	 * @param exp an {@link OpaqueExpression}
	 * @param index the index of the expression to export.
	 * @return expression Body
	 */
	private static String getOpaqueExpressionValue(OpaqueExpression exp, int index){
		String result = "<pre>";
		if (CapellaLinkedTextConstants.OPAQUE_EXPRESSION_LINKED_TEXT.equals(exp.getLanguages().get(index))) 
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
