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
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.polarsys.capella.docgen.preference.internal.Messages;
import org.polarsys.kitalpha.doc.gen.business.core.preference.ui.AbstractDocgenPreferencePage;

/**
 * @author Boubekeur Zendagui.
 */
public class CapellaDocgenPreferencePage  extends AbstractDocgenPreferencePage {

	private BooleanFieldEditor useExportStatusAndReview;
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.jface.preference.FieldEditorPreferencePage#createFieldEditors()
	 */
	@Override
	protected void createFieldEditors() {
		createExportDiagramsField();
		addField(useExportStatusAndReview);
	}
	
	/**
	 * Creation of the Boolean field. 
	 * If checked, the diagram will be handled, otherwise, they will ignored.
	 */
	private void createExportDiagramsField(){
		Composite composite = createParent(getFieldEditorParent(), "Common");
		useExportStatusAndReview = new BooleanFieldEditor(CapellaDocgenPreferenceConstant.DOCGEN_EXPORT__STATUS_AND_REVIEW, 
				 Messages.EXPORT__STATUS_AND_REVIEW_FIELD_LABEL, composite);
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.jface.preference.FieldEditorPreferencePage#performDefaults()
	 */
	@Override
	protected void performDefaults() {
		super.performDefaults();
		store.setDefault(CapellaDocgenPreferenceConstant.DOCGEN_EXPORT__STATUS_AND_REVIEW, 
				CapellaDocgenPreferenceConstant.DOCGEN_EXPORT__STATUS_AND_REVIEW_DEFAULT_VALUE);
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
}
