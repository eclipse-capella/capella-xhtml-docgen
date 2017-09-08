/*******************************************************************************
 * Copyright (c) 2006, 2017 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales - initial API and implementation
 ******************************************************************************/
package org.polarsys.capella.docgen.visitor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.egf.model.pattern.Pattern;
import org.eclipse.egf.model.pattern.PatternContext;
import org.eclipse.egf.model.pattern.PatternException;
import org.eclipse.egf.model.pattern.PatternParameter;
import org.eclipse.egf.pattern.engine.PatternEngine;
import org.eclipse.egf.pattern.extension.ExtensionHelper;
import org.eclipse.egf.pattern.extension.ExtensionHelper.MissingExtensionException;
import org.eclipse.egf.pattern.extension.PatternExtension;
import org.polarsys.kitalpha.doc.gen.business.core.visitor.DocgenCommonSubClassEmfModelVisitor;

/**
 * 
 */
public class CapellaDomainVisitor extends DocgenCommonSubClassEmfModelVisitor {

	private PatternContext context;

	@Override
	protected List<Pattern> findPatterns(PatternContext context, Object model) throws PatternException {
		this.context = context;
		return super.findPatterns(context, model);
	}

	/**
	 * @see org.eclipse.egf.pattern.strategy.domaindriven.SubClassEmfModelVisitor
	 *      #findPatterns(java.lang.Object) This override operation add a
	 *      inheriting check (it delete super pattern of the list) to create a
	 *      pattern polymorphism like
	 */
	@Override
	protected List<Pattern> findPatterns(Object model) {
		// Get the List of applicable patterns to check
		List<Pattern> patternFind = super.findPatterns(model);
		// Get the list of applicable patterns to return
		List<Pattern> result = new ArrayList<Pattern>();
		result.addAll(patternFind);
		// If the list is not null
		if (null != patternFind) {
			// For each pattern of the list
			for (Pattern pat : patternFind) {
				try {
					// If current pattern cannot be applied, we do not delete
					// supper patterns from list .
					if (checkCondition(pat, model)) {
						// If the return list of pattern contain the super
						// pattern
						// of
						// the current pattern
						if (result.contains(pat.getSuperPattern()))
							// Delete the supper pattern of the return list
							result.remove(pat.getSuperPattern());
					} else
						result.remove(pat);
				} catch (PatternException e) {
					e.printStackTrace();
				}
			}
		}
		return result;
	}

	private boolean checkCondition(Pattern pattern, Object model) throws PatternException {
		PatternExtension extension;
		try {
			extension = ExtensionHelper.getExtension(pattern.getNature());

			String canExecute = extension.canExecute(pattern);
			if (canExecute != null)
				throw new PatternException(canExecute);
			PatternEngine engine = extension.createEngine(pattern);
			return engine.checkCondition(context, createParameterMap(pattern, model));
		} catch (MissingExtensionException e) {
			throw new PatternException(e);
		}
	}

	private Map<PatternParameter, Object> createParameterMap(Pattern pattern, Object model) {
		Map<PatternParameter, Object> parameters = new HashMap<PatternParameter, Object>();
		parameters.put(pattern.getAllParameters().get(0), model);
		return parameters;
	}

}
