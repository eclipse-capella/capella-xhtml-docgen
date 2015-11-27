/*******************************************************************************
 * Copyright (c) 2006, 2015 Thales Global Services
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v1.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v10.html
 * 
 *   Contributors:
 *      Thales - initial API and implementation
 ******************************************************************************/
package org.polarsys.capella.vp.perfo.ui.fields;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;

import org.polarsys.capella.core.ui.properties.fields.AbstractSemanticKindGroup;
import org.polarsys.capella.vp.perfo.perfo.measurementUnit_Type;

/**
 * <!-- begin-user-doc -->
 * The '<em><b>[MeasurementUnitField_semanticKindGroup]</b></em>' customized RadioboxGroup field. 
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */

public class MeasurementUnitField_semanticKindGroup extends AbstractSemanticKindGroup {

	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @generated
	*/
	private Button _measurementUnit_TypeBtnMILLISECOND;

	/**
	* Constructor.
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @param parent_p
	* @param widgetFactory_p
	* @generated
	*/
	public MeasurementUnitField_semanticKindGroup(Composite parent_p,
			TabbedPropertySheetWidgetFactory widgetFactory_p) {
		super(parent_p, widgetFactory_p, "Measurement Unit", 6); //$NON-NLS-1$

		_measurementUnit_TypeBtnMILLISECOND = createButton(measurementUnit_Type.MILLISECOND);
	}

	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* {@inheritDoc}
	* @generated   
	*/
	@Override
	public List<Button> getSemanticFields() {
		List<Button> fields = new ArrayList<Button>();
		fields.add(_measurementUnit_TypeBtnMILLISECOND);
		return fields;
	}

	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* {@inheritDoc}
	* @generated   
	*/
	@Override
	public Button getDefaultSemanticField() {
		return _measurementUnit_TypeBtnMILLISECOND;
	}
}
