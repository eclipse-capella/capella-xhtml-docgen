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
package org.polarsys.capella.transition.system2subsystem.handlers.scope;

import java.util.Collection;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.core.data.capellacore.AbstractPropertyValue;
import org.polarsys.capella.core.data.capellacore.PropertyValueGroup;
import org.polarsys.capella.core.data.capellacore.PropertyValuePkg;
import org.polarsys.capella.core.transition.common.handlers.options.OptionsHandlerHelper;
import org.polarsys.capella.core.transition.common.handlers.scope.IScopeFilter;
import org.polarsys.capella.transition.system2subsystem.constants.IOptionsConstants;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;


/**
 * A scope filter on AbstractPropertyValue, PropertyValueGroup and PropertyValuePkg
 * An element is filtered if it has been filtered or one of these parents have been filtered
 */
public class PropertyValuesScopeFilter implements IScopeFilter {

  public static final String PROPERTY_VALUES_SCOPE_FILTER = "PROPERTY_VALUES_SCOPE_FILTER"; //$NON-NLS-1$

  public static PropertyValuesScopeFilter getInstance(IContext context) {
    PropertyValuesScopeFilter handler = (PropertyValuesScopeFilter) context.get(PropertyValuesScopeFilter.PROPERTY_VALUES_SCOPE_FILTER);
    if (handler == null) {
      handler = new PropertyValuesScopeFilter();
      handler.init(context);
      context.put(PropertyValuesScopeFilter.PROPERTY_VALUES_SCOPE_FILTER, handler);
    }
    return handler;
  }

  public Collection<EObject> getElements(IContext context_p) {
    Collection<EObject> elements =
        OptionsHandlerHelper.getInstance(context_p).getCollectionValue(context_p, IOptionsConstants.SYSTEM2SUBSYSTEM_PREFERENCES,
            IOptionsConstants.PROPERTY_VALUES_ELEMENTS, IOptionsConstants.PROPERTY_VALUES_ELEMENTS_DEFAULT_VALUE);
    return elements;
  }

  /**
   * {@inheritDoc}
   */
  public boolean isValidScopeElement(EObject element_p, IContext context_p) {
    if ((element_p instanceof AbstractPropertyValue) || (element_p instanceof PropertyValueGroup) || (element_p instanceof PropertyValuePkg)) {
      Collection<EObject> elements = getElements(context_p);
      EObject element = element_p;
      while ((element instanceof AbstractPropertyValue) || (element instanceof PropertyValueGroup) || (element instanceof PropertyValuePkg)) {
        if (elements.contains(element)) {
          return true;
        }
        element = element.eContainer();
      }
      return false;
    }
    return true;
  }

  /**
   * {@inheritDoc}
   */
  public IStatus init(IContext context_p) {
    return Status.OK_STATUS;
  }

  /**
   * {@inheritDoc}
   */
  public IStatus dispose(IContext context_p) {
    return Status.OK_STATUS;
  }

}
