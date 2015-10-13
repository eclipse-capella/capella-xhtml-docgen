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
// Generated on 20.08.2015 at 11:04:03 CEST by Viewpoint DSL Generator V 0.1

package org.polarsys.capella.vp.mass.ui.sections;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.core.ui.properties.fields.AbstractSemanticField;
import org.polarsys.capella.core.ui.properties.fields.TextValueGroup;
import org.polarsys.capella.core.ui.properties.sections.AbstractSection;
import org.polarsys.capella.vp.mass.mass.Mass;
import org.polarsys.capella.vp.mass.mass.MassPackage;

/**
 * <!-- begin-user-doc -->
 * This class is an implementation of the section '<em><b>[Mass_PartMass_mass_PartMass_Section]</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */

public class Mass_PartMass_mass_PartMass_Section extends AbstractSection {

	/**
	 * <!-- begin-model-doc -->
	 * <!-- end-model-doc -->
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TextValueGroup ValueField;

	/**
	 * <!-- begin-model-doc -->
	 * <!-- end-model-doc -->
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TextValueGroup MaxValueField;

	/**
	 * <!-- begin-model-doc -->
	 * <!-- end-model-doc -->
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Group mass_PartMass_AttributeGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eObject: current object
	 * @generated
	 */
	public boolean select(Object eObject) {
		EObject eObjectToTest = super.selection(eObject);

		if (eObjectToTest instanceof Mass)
			return true;

		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param part
	 * @param selection
	 * @generated
	 */
	public void setInput(IWorkbenchPart part, ISelection selection) {
		EObject newEObject = super.setInputSelection(part, selection);
		if (newEObject != null) {
			loadData((CapellaElement) newEObject);
		} else {
			return;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param parent:
	 * @param aTabbedPropertySheetPage:
	 * @generated
	 */
	public void createControls(Composite parent,
			TabbedPropertySheetPage aTabbedPropertySheetPage) {
		super.createControls(parent, aTabbedPropertySheetPage);

		mass_PartMass_AttributeGroup = getWidgetFactory().createGroup(
				_rootParentComposite, "Part Mass Attributes");
		mass_PartMass_AttributeGroup.setLayout(new GridLayout(1, false));
		GridData gdmass_PartMass_AttributeGroup = new GridData(
				GridData.FILL_HORIZONTAL);
		gdmass_PartMass_AttributeGroup.horizontalSpan = ((GridLayout) _rootParentComposite
				.getLayout()).numColumns;
		mass_PartMass_AttributeGroup
				.setLayoutData(gdmass_PartMass_AttributeGroup);

		ValueField = new TextValueGroup(mass_PartMass_AttributeGroup,
				"Value :", getWidgetFactory(), true);

		MaxValueField = new TextValueGroup(mass_PartMass_AttributeGroup,
				"Max Value :", getWidgetFactory(), true);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param capellaElement_p
	 * @generated
	 */
	public void loadData(CapellaElement capellaElement_p) {
		super.loadData(capellaElement_p);

		ValueField.loadData(capellaElement_p,
				MassPackage.eINSTANCE.getMass_Value());

		MaxValueField.loadData(capellaElement_p,
				MassPackage.eINSTANCE.getMass_MaxValue());

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<AbstractSemanticField> getSemanticFields() {
		List<AbstractSemanticField> abstractSemanticFields = new ArrayList<AbstractSemanticField>();

		abstractSemanticFields.add(ValueField);

		abstractSemanticFields.add(MaxValueField);

		return abstractSemanticFields;
	}
}
