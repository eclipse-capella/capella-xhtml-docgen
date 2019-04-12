/*******************************************************************************
 * Copyright (c) 2019 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.capella.docgen.preference;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.ui.dialogs.PreferenceLinkArea;
import org.eclipse.ui.preferences.IWorkbenchPreferenceContainer;
import org.polarsys.capella.docgen.preference.internal.Messages;
import org.polarsys.capella.docgen.preference.internal.PreferencesUIMsg;
import org.polarsys.kitalpha.doc.gen.business.core.preference.ui.AbstractDocgenPreferencePage;

/**
 * @author Boubekeur Zendagui.
 */
public class CapellaDocgenPreferencePage  extends AbstractDocgenPreferencePage {

	private BooleanFieldEditor useExportStatusAndReview;
	private BooleanFieldEditor useExportComponentExchange;
	private BooleanFieldEditor useExportFunctionalExchange;
	private BooleanFieldEditor useExportPhysicalLink;
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.jface.preference.FieldEditorPreferencePage#createFieldEditors()
	 */
	@Override
	protected void createFieldEditors() {
		createLink();
		
		createExportStatusAndReview();
		addField(useExportStatusAndReview);
		
		createExportExchanges();
		addField(useExportFunctionalExchange);
		addField(useExportComponentExchange);
		addField(useExportPhysicalLink);
		
		CapellaDocgenPreferenceHelper.setDefaultValues();
	}
	
	private void initilizeBoolean(Composite parent, BooleanFieldEditor bfe, boolean value) {
		Control c = bfe.getDescriptionControl(parent);
		if (c != null && c instanceof Button) {
			((Button)c).setSelection(value);
		}
	}

	/**
	 * Creation of the Boolean field. 
	 * If checked, the status and review will be generated, otherwise, they will ignored.
	 */
	private void createExportStatusAndReview(){
		Composite composite = createParent(getFieldEditorParent(), "Common");
		useExportStatusAndReview = new BooleanFieldEditor(CapellaDocgenPreferenceConstant.DOCGEN_EXPORT__STATUS_AND_REVIEW, 
				 Messages.EXPORT__STATUS_AND_REVIEW_FIELD_LABEL, composite);
		initilizeBoolean(composite, useExportStatusAndReview, CapellaDocgenPreferenceConstant.DOCGEN_EXPORT__STATUS_AND_REVIEW_DEFAULT_VALUE);
	}
	
	/**
	 * Creation of the Boolean field. 
	 * If checked, the status and review will be generated, otherwise, they will ignored.
	 */
	private void createExportExchanges(){
		Composite composite = createParent(getFieldEditorParent(), "Exchanges");
		useExportComponentExchange = new BooleanFieldEditor(CapellaDocgenPreferenceConstant.DOCGEN_EXPORT__COMPONENT_EXCHANGE, 
				 Messages.EXPORT__COMPONENT_EXCHANGE_FIELD_LABEL, composite);
		
		useExportFunctionalExchange = new BooleanFieldEditor(CapellaDocgenPreferenceConstant.DOCGEN_EXPORT__FUNCTIONAL_EXCHANGE, 
				 Messages.EXPORT__FUNCTIONAL_EXCHANGE_FIELD_LABEL, composite);
		
		useExportPhysicalLink = new BooleanFieldEditor(CapellaDocgenPreferenceConstant.DOCGEN_EXPORT__PHYSICAL_LINK, 
				 Messages.EXPORT__PHYSICAL_LINK_FIELD_LABEL, composite);
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.jface.preference.FieldEditorPreferencePage#performDefaults()
	 */
	@Override
	protected void performDefaults() {
		super.performDefaults();
		CapellaDocgenPreferenceHelper.restoreDefaultValues();
	}
	
	/**
	 * Create a parent widget that will contain preferences fields
	 * @param parent parent {@link Composite}
	 * @param text to display on the top of a {@link Group}. Note that the value of this parameter will 
	 * determine if the result of this method will be a {@link Composite} or a {@link Group}
	 * @return A {@link Group} if <code>text</code> has a value or is not null, a {@link Composite} otherwise 
	 */
	private Composite createParent(Composite parent, String text) {
		Composite result = null;
		if (text!= null && text.trim().length() > 0){
			result = new Group(parent, SWT.NONE);
			((Group)result).setText(text);
		}
		else{
			result = new Composite(parent, SWT.NONE);
		}
			
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.horizontalSpan = 2;
		gd.verticalIndent = 5;
		GridLayout layout = new GridLayout();
		result.setLayoutData(gd);
		result.setLayout(layout);
        return result;
	}
	
	private void createLink(){
		final IWorkbenchPreferenceContainer preferenceContainer = (IWorkbenchPreferenceContainer) getContainer();
		PreferenceLinkArea pageLink = new PreferenceLinkArea(getFieldEditorParent(), 
															 SWT.NONE, 
															 "org.polarsys.kitalpha.mdecore.docgen.preference.category", 
															 PreferencesUIMsg.CATEGORY_PAGE_LABEL_DOCGEN, 
															 preferenceContainer, 
															 null);
		
		pageLink.getControl().setLayoutData(new GridData(GridData.FILL_HORIZONTAL | GridData.GRAB_HORIZONTAL));
	}
}
