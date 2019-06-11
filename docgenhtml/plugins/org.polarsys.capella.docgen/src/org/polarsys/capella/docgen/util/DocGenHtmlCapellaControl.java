/*******************************************************************************
 * Copyright (c) 2006, 2019 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales - initial API and implementation
 ******************************************************************************/
package org.polarsys.capella.docgen.util;

import org.polarsys.capella.core.data.capellacommon.AbstractState;
import org.polarsys.capella.core.data.capellacommon.InitialPseudoState;
import org.polarsys.capella.core.data.capellacommon.Region;
import org.polarsys.capella.core.data.capellacommon.StateMachine;
import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.core.data.capellacore.GeneralClass;
import org.polarsys.capella.core.data.capellacore.Structure;
import org.polarsys.capella.core.data.cs.Component;
import org.polarsys.capella.core.data.cs.Interface;
import org.polarsys.capella.core.data.cs.Part;
import org.polarsys.capella.core.data.cs.PhysicalLink;
import org.polarsys.capella.core.data.cs.PhysicalLinkCategory;
import org.polarsys.capella.core.data.cs.PhysicalPath;
import org.polarsys.capella.core.data.ctx.Mission;
import org.polarsys.capella.core.data.fa.AbstractFunction;
import org.polarsys.capella.core.data.fa.ComponentExchange;
import org.polarsys.capella.core.data.fa.ComponentExchangeCategory;
import org.polarsys.capella.core.data.fa.ComponentPort;
import org.polarsys.capella.core.data.fa.ExchangeCategory;
import org.polarsys.capella.core.data.fa.FunctionPort;
import org.polarsys.capella.core.data.fa.FunctionalChain;
import org.polarsys.capella.core.data.fa.FunctionalExchange;
import org.polarsys.capella.core.data.information.Collection;
import org.polarsys.capella.core.data.information.ExchangeItem;
import org.polarsys.capella.core.data.information.ExchangeItemElement;
import org.polarsys.capella.core.data.information.Unit;
import org.polarsys.capella.core.data.information.datatype.DataType;
import org.polarsys.capella.core.data.interaction.AbstractCapability;
import org.polarsys.capella.core.data.interaction.Scenario;
import org.polarsys.capella.core.data.oa.Entity;
import org.polarsys.capella.core.data.oa.Role;
import org.polarsys.capella.core.data.requirement.Requirement;
import org.polarsys.capella.docgen.preference.CapellaDocgenPreferenceHelper;

public class DocGenHtmlCapellaControl {

	/**
	 * check if the page can be optional
	 * @param element
	 * @return
	 */
	public static boolean isPageOptional(CapellaElement element) {
		return (   element instanceof FunctionalExchange 
				|| element instanceof ComponentExchange 
				|| element instanceof PhysicalLink);
	}
	/**
	 * Indicates if the considered element has an html page or not
	 * 
	 * @param CapellaElement
	 * @return
	 */
	public static boolean isPageCandidate(CapellaElement element) {

		// Include these elements
		return (
				element instanceof AbstractState 
				|| element instanceof StateMachine
				|| element instanceof Structure
				|| element instanceof AbstractFunction
				|| element instanceof Part 
				|| element instanceof Component
				|| element instanceof FunctionalChain
				|| element instanceof FunctionPort
				|| element instanceof ComponentPort
				|| element instanceof ExchangeCategory
				|| element instanceof AbstractCapability
				|| element instanceof Scenario 
				|| element instanceof Mission
				|| element instanceof Entity 
				|| element instanceof Role
				|| element instanceof PhysicalPath
				|| element instanceof GeneralClass
				|| element instanceof Collection
				|| element instanceof ExchangeItem
				|| element instanceof DataType 
				|| element instanceof Unit
				|| element instanceof Requirement 
				|| element instanceof Region
				|| element instanceof ComponentExchangeCategory 
				|| (element instanceof FunctionalExchange 	&& CapellaDocgenPreferenceHelper.isExportFunctionalExchange())
				|| (element instanceof ComponentExchange 	&& CapellaDocgenPreferenceHelper.isExportComponentExchange())
				|| (element instanceof PhysicalLink 		&& CapellaDocgenPreferenceHelper.isExportPhysialLink())
				|| element instanceof PhysicalLinkCategory);
	}

	/**
	 * <p> Indicates if the considered element has an html page or not. </p>
	 * <p> Unlike the other element, who's HTML pages are generated thanks to their dedicated EGF Pattern, 
	 * the HTML page for the elements accepted by this method are generated thanks to the EGF Pattern 
	 * <code>org.polarsys.capella.docgen.content.AnyNamedElementDocGen</code></p>
	 * 
	 * @param element a Capella model element  
	 * @return <code>true</code> or <code>false</code> :-)
	 * <ul>
	 * 		<li> If <code>true</code>, an HTML page will be generated by the pattern <code>org.polarsys.capella.docgen.content.AnyNamedElementDocGen</code> </li>
	 * 		<li> If <code>false</code>, either there is no HTML page for the element, or it page is generated by a dedicated pattern</li>
	 * </ul>
	 */
	public static boolean isPageCandidateForAnyElement(CapellaElement element) {
		return (isPageCandidate(element) &&	!
				(  element instanceof Component
				|| element instanceof Part
				|| element instanceof AbstractFunction
				|| element instanceof org.polarsys.capella.core.data.information.Class 
				|| element instanceof Collection 
				|| element instanceof DataType
				|| element instanceof Requirement
				|| element instanceof Interface
				|| element instanceof ExchangeItem
				|| element instanceof Structure
				|| element instanceof Mission
				|| element instanceof FunctionalChain
				|| element instanceof FunctionalExchange
				|| element instanceof PhysicalLink
				|| element instanceof ComponentExchange
				|| (element instanceof AbstractState && element instanceof InitialPseudoState == false)
				|| element instanceof Region
				|| element instanceof ExchangeItemElement
				|| element instanceof ComponentExchangeCategory
				|| element instanceof PhysicalLinkCategory
		));
	}
}
