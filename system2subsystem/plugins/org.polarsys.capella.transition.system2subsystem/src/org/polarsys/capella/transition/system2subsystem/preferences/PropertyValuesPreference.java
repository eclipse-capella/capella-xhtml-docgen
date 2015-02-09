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
package org.polarsys.capella.transition.system2subsystem.preferences;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.common.flexibility.properties.property.PropertyPreference;
import org.polarsys.capella.common.flexibility.properties.schema.IPropertyContext;
import org.polarsys.capella.common.flexibility.properties.schema.IRestraintProperty;
import org.polarsys.capella.common.flexibility.properties.schema.PropertiesSchemaConstants;
import org.polarsys.capella.common.helpers.EObjectExt;
import org.polarsys.capella.core.data.capellacore.AbstractPropertyValue;
import org.polarsys.capella.core.data.capellacore.CapellacorePackage;
import org.polarsys.capella.core.data.capellacore.PropertyValueGroup;
import org.polarsys.capella.core.data.capellacore.PropertyValuePkg;
import org.polarsys.capella.core.data.capellamodeller.SystemEngineering;
import org.polarsys.capella.core.data.cs.BlockArchitecture;
import org.polarsys.capella.core.model.helpers.BlockArchitectureExt;
import org.polarsys.capella.core.transition.common.constants.ITransitionConstants;
import org.polarsys.capella.core.transition.common.handlers.session.SessionHandlerHelper;
import org.polarsys.capella.transition.system2subsystem.constants.IOptionsConstants;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;


/**
 * 
 */
public class PropertyValuesPreference extends PropertyPreference implements IRestraintProperty {

  public static final String PROPERTIES_ELEMENTS = "PROPERTIES_ELEMENTS"; //$NON-NLS-1$

  /**
   * {@inheritDoc}
   */
  @Override
  public Object getType() {
    return Collection.class;
  }

  public Collection<EObject> getElements(IContext context) {
    Collection<EObject> elements = (Collection<EObject>) context.get(IOptionsConstants.PROPERTY_VALUES_ELEMENTS);
    if (elements == null) {
      elements = new HashSet<EObject>();
      context.put(IOptionsConstants.PROPERTY_VALUES_ELEMENTS, elements);
    }
    return elements;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Object getValue(IPropertyContext context_p) {

    Object source = context_p.getSource();
    if (source instanceof IContext) {
      IContext context = (IContext) source;

      //Persisted value
      if (getElements(context).size() == 0) {
        String value = (String) super.getValue(context_p);
        if ((value != null) && (value.length() > 0)) {
          Collection<EObject> result = new ArrayList<EObject>();
          String[] ids = value.split("\n");
          for (String id : ids) {
            if ((id != null) && (id.length() > 0)) {
              EObject relatedObject = SessionHandlerHelper.getInstance(context).getEObjectFromId(id, context);
              if (relatedObject != null) {
                result.add(relatedObject);
              }
            }
          }
          getElements(context).addAll(result);
        }
      }

      return getElements(context);
    }
    return Collections.emptyList();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Object toType(Object value_p, IPropertyContext context_p) {
    return value_p;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public IStatus validate(Object newValue_p, IPropertyContext context_p) {
    if (newValue_p == null) {
      return Status.CANCEL_STATUS;
    }
    return Status.OK_STATUS;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void setValue(IPropertyContext context_p) {
    Object source = context_p.getSource();
    if (source instanceof IContext) {
      IContext context = (IContext) source;
      Object value = context_p.getCurrentValue(this);
      if (value instanceof Collection) {
        String result = "";
        for (Object item : (Collection) value) {
          if ((item != null) && (item instanceof EObject)) {
            result += SessionHandlerHelper.getInstance(context).getId((EObject) item, context) + "\n";
          }
        }
        //Store into preferences
        IEclipsePreferences preference = getScope().getNode(getParameter(PropertiesSchemaConstants.PropertiesSchema_PROPERTY_PREFERENCE__SCOPE));
        if (result != null) {
          preference.put(getId(), result);
        }

        getElements(context).addAll((Collection) value);
      }
    }
  }

  /**
   * {@inheritDoc}
   */
  public Collection<Object> getChoiceValues(IPropertyContext context_p) {
    Object source = context_p.getSource();
    ArrayList<EObject> values = new ArrayList<EObject>();

    if (source instanceof IContext) {
      IContext context = (IContext) source;
      Collection<EObject> selection = (Collection<EObject>) context.get(ITransitionConstants.TRANSITION_SOURCES);
      BlockArchitecture archi = null;
      if (selection.size() > 0){
        archi = BlockArchitectureExt.getRootBlockArchitecture(selection.iterator().next());
      }
      if (archi != null) {
        visit(values, archi);
        if (archi.eContainer() instanceof SystemEngineering) {
          Iterator<EObject> childsParent = ((SystemEngineering) archi.eContainer()).eContents().iterator();
          while (childsParent.hasNext()) {
            EObject child = childsParent.next();
            if ((child instanceof AbstractPropertyValue) || (child instanceof PropertyValueGroup) || (child instanceof PropertyValuePkg)) {
              visit(values, child);
            }
          }
        }
      }
    }
    return (Collection) values;
  }

  /**
   * @param values_p
   * @param archi_p
   */
  private void visit(ArrayList<EObject> values_p, EObject archi_p) {
    if ((archi_p instanceof AbstractPropertyValue) || (archi_p instanceof PropertyValueGroup) || (archi_p instanceof PropertyValuePkg)) {
      values_p.add(archi_p);
    }
    if (archi_p instanceof PropertyValuePkg) {
      values_p.addAll(EObjectExt.getAll(archi_p, CapellacorePackage.Literals.PROPERTY_VALUE_PKG));
      return;
    }

    TreeIterator<EObject> childs = (archi_p).eAllContents();
    while (childs.hasNext()) {
      EObject child = childs.next();
      if ((child instanceof AbstractPropertyValue) || (child instanceof PropertyValueGroup) || (child instanceof PropertyValuePkg)) {
        values_p.add(child);
      }
      if (child instanceof PropertyValuePkg) {
        values_p.addAll(EObjectExt.getAll(child, CapellacorePackage.Literals.PROPERTY_VALUE_PKG));
        childs.prune();
      }
    }
  }

  /**
   * {@inheritDoc}
   */
  public boolean isMany() {
    return true;
  }
}
