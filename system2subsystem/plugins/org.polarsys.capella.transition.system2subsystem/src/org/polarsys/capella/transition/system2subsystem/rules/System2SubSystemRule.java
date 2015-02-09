/*******************************************************************************
 * Copyright (c) 2006, 2015 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.capella.transition.system2subsystem.rules;

import org.polarsys.capella.core.transition.system.rules.AbstractCapellaElementRule;


/**
 * Some elements such as owned functions are related to the reference component.
 * To avoid in a IRule to recompute for each elements if it related to the reference component
 * we use a temporary "scope" stored into the current IContext.
 * 
 * A rule which retrieve any elements related to the reference scope should register them into this scope
 *
 */
public abstract class System2SubSystemRule extends AbstractCapellaElementRule {

}
