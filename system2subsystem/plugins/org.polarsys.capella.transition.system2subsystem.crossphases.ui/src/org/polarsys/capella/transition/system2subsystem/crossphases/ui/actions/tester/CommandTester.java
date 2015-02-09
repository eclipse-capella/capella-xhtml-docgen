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
package org.polarsys.capella.transition.system2subsystem.crossphases.ui.actions.tester;

import java.util.List;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.common.data.modellingcore.AbstractType;
import org.polarsys.capella.common.ui.actions.ModelAdaptation;
import org.polarsys.capella.core.data.cs.Component;
import org.polarsys.capella.core.data.cs.Part;
import org.polarsys.capella.core.data.epbs.ConfigurationItem;
import org.polarsys.capella.core.data.la.LogicalComponent;
import org.polarsys.capella.core.data.pa.PhysicalComponent;

public class CommandTester extends PropertyTester {

  /**
   * @see org.eclipse.core.expressions.IPropertyTester#test(java.lang.Object, java.lang.String, java.lang.Object[], java.lang.Object)
   */
  public boolean test(Object object_p, String propertyName_p, Object[] params_p, Object testedValue_p) {
    if (propertyName_p.equals("transitionMode")) { //$NON-NLS-1$ 
      List<EObject> elements = (List) ModelAdaptation.adaptToCapellaElements(object_p);
      if ((!elements.isEmpty()) && (testedValue_p instanceof String)) {
        String value = (String) testedValue_p;

        if (value.startsWith("transitionCrossPhases")) { //$NON-NLS-1$

          for (EObject element : elements) {
            AbstractType type = null;
            if (element instanceof Component) {
              type = (Component) element;
            } else if (element instanceof Part) {
              type = ((Part) element).getAbstractType();
            }
            return (type != null) && ((type instanceof LogicalComponent) || (type instanceof PhysicalComponent) || (type instanceof ConfigurationItem));
          }

        }
      }
    }

    return false;
  }
}
