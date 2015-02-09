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
package org.polarsys.capella.transition.system2subsystem.context;

import java.util.List;

import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;

/**
 * A delegating context
 */
public class SubSystemContext implements IContext {

  private IContext _context;

  public SubSystemContext(IContext context_p) {
    _context = context_p;
  }

  /**
   * {@inheritDoc}
   */
  public boolean exists(Object obj_p) {
    return _context.exists(obj_p);
  }

  /**
   * {@inheritDoc}
   */
  public Object get(Object obj_p) {
    return _context.get(obj_p);
  }

  /**
   * {@inheritDoc}
   */
  public List<Object> getKeys() {
    return _context.getKeys();
  }

  /**
   * {@inheritDoc}
   */
  public String getName() {
    return _context.getName();
  }

  /**
   * {@inheritDoc}
   */
  public void initWith(IContext icontext_p) {
    _context.initWith(icontext_p);
  }

  /**
   * {@inheritDoc}
   */
  public void put(Object obj_p, Object obj1_p) {
    _context.put(obj_p, obj1_p);
  }

  /**
   * {@inheritDoc}
   */
  public void reset() {
    _context.reset();
  }

  /**
   * {@inheritDoc}
   */
  public void setUpForModelElement(Object obj_p) {
    _context.setUpForModelElement(obj_p);
  }

  /**
   * {@inheritDoc}
   */
  public void updateWith(IContext icontext_p) {
    _context.updateWith(icontext_p);
  }
}
