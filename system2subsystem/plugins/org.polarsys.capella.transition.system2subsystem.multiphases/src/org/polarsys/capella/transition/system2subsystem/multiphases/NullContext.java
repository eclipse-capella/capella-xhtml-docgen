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
package org.polarsys.capella.transition.system2subsystem.multiphases;

import java.util.List;

import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;


/**
 * A context that throws exceptions. Nullcontexts are set as default contexts
 * for all multiphase mappings and then replaced with the shared multiphase context
 * in HeadlesMultiphaseLauncher at the beginning of each phase. Having a null context
 * default makes it easier to detect bugs in transposer context states. 
 */
public class NullContext implements IContext {

	@Override
	public String getName() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void initWith(IContext baseContext_p) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void updateWith(IContext context_p) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void put(Object key_p, Object value_p) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Object get(Object key_p) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean exists(Object key_p) {
		throw new UnsupportedOperationException();
	}

	@Override
	public List<Object> getKeys() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void setUpForModelElement(Object modelElement_p) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void reset() {
		throw new UnsupportedOperationException();
	}

}
