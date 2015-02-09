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
package org.polarsys.capella.transition.system2subsystem.multiphases.activities;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.diffmerge.api.Role;
import org.eclipse.emf.diffmerge.api.diff.IDifference;
import org.eclipse.emf.diffmerge.api.diff.IElementRelativeDifference;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.common.data.modellingcore.ModellingcorePackage;
import org.polarsys.capella.core.data.cs.CsPackage;
import org.polarsys.capella.core.data.fa.FaPackage;
import org.polarsys.capella.core.data.interaction.InteractionPackage;
import org.polarsys.capella.core.model.helpers.naming.NamingConstants;
import org.polarsys.capella.core.transition.common.activities.DifferencesFilteringActivity;
import org.polarsys.capella.core.transition.common.handlers.filter.AttributeValueFromSource;
import org.polarsys.capella.core.transition.common.handlers.filter.CompoundFilteringItems;
import org.polarsys.capella.core.transition.common.handlers.filter.ElementPresenceFromSource;
import org.polarsys.capella.core.transition.common.handlers.filter.TargetAttributeFilterItem;
import org.polarsys.capella.core.transition.common.handlers.filter.UnmatchableElementFilterItem;
import org.polarsys.capella.core.transition.common.handlers.filter.UpdateOfFilterItem;
import org.polarsys.capella.core.transition.system.handlers.filter.AttributeNameValueFromSource;
import org.polarsys.capella.core.transition.system.handlers.filter.ElementPresenceManyToOne;
import org.polarsys.capella.core.transition.system.handlers.filter.ElementPresenceOneToMany;
import org.polarsys.capella.core.transition.system.handlers.filter.PreferenceFilterItem;
import org.polarsys.capella.core.transition.system.handlers.filter.RootFilterItem;
import org.polarsys.capella.transition.system2subsystem.handlers.filter.RealizationLinkFilterItem;
import org.polarsys.capella.transition.system2subsystem.handlers.filter.ReferenceOnReconciliation;
import org.polarsys.kitalpha.cadence.core.api.parameter.ActivityParameters;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;


public class MultiphasesDifferencesFilteringActivity extends
		DifferencesFilteringActivity {

	@Override
	protected IStatus initializeFilterItemHandlers(IContext context_p,
			CompoundFilteringItems handler_p,
			ActivityParameters activityParams_p) {
		
		super.initializeFilterItemHandlers(context_p, handler_p, activityParams_p);

		/*
     * START SYSTEM TRANSITION FILTERS WITH FIXES 
     */
    handler_p.addFilterItem(new RootFilterItem(), context_p);
    handler_p.addFilterItem(new PreferenceFilterItem(), context_p);
    handler_p.addFilterItem(new AttributeValueFromSource(), context_p);
    handler_p.addFilterItem(new ElementPresenceFromSource(), context_p);
    
    // Overriden to update logical component name if necessary
    handler_p.addFilterItem(new AttributeNameValueFromSource(){
      @Override
      public boolean isMergeableAttributeValue(EAttribute attribute_p, EObject source_p, EObject target_p, Object oldValue_p, Object newValue_p) {
        // Merge name of element if name is same as EClass of the element
        if (ModellingcorePackage.Literals.ABSTRACT_NAMED_ELEMENT__NAME.equals(attribute_p)) {
          if (NamingConstants.CreateLogicalArchCmd_logicalComponent_name.equals(oldValue_p)){
            return true;
          }
        }
        return super.isMergeableAttributeValue(attribute_p, source_p, target_p, oldValue_p, newValue_p);
      }
    }, context_p);

    handler_p.addFilterItem(new ElementPresenceOneToMany(), context_p);
    handler_p.addFilterItem(new ElementPresenceManyToOne(), context_p);

    /*
     * END SYSTEM TRANSITION FILTERS 
     */

    handler_p.addFilterItem(new TargetAttributeFilterItem(), context_p);
    handler_p.addFilterItem(new UnmatchableElementFilterItem(){
		    	
      // Overridden to support null match IDs...
      @Override
      public boolean isUnmatchable(IDifference diff_p, Role role_p, IContext context_p) {
        if (diff_p instanceof IElementRelativeDifference) {
          IElementRelativeDifference presence = (IElementRelativeDifference) diff_p;
          EObject target = presence.getElementMatch().get(Role.TARGET);
          if (target != null) {
            Object id = (diff_p.getComparison()).getLastMatchPolicy().getMatchID(target, diff_p.getComparison().getScope(Role.TARGET));
            if (id == null) {
              return true;
            }
          }
        }
        return false;
      }
    }, context_p);
    handler_p.addFilterItem(new RealizationLinkFilterItem(), context_p);
    handler_p.addFilterItem(new ReferenceOnReconciliation(), context_p);

    handler_p.addFilterItem(new UpdateOfFilterItem(FaPackage.Literals.FUNCTIONAL_CHAIN), context_p);
    handler_p.addFilterItem(new UpdateOfFilterItem(CsPackage.Literals.PHYSICAL_PATH), context_p);
    handler_p.addFilterItem(new UpdateOfFilterItem(InteractionPackage.Literals.SCENARIO), context_p); 

    return Status.OK_STATUS;
	}

	@Override
	protected boolean displayLog(IContext context_p) {
		// FIXME don't display log for now until this causes no more side effects (P.ex. create absent Requirements Packages)
		return false;
	}

}
