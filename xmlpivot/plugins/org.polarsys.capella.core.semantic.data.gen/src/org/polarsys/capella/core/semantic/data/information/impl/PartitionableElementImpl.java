/*******************************************************************************
 * Copyright (c) 2006, 2015 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *     
 * Contributors:
 *    Thales - initial API and implementation
 ******************************************************************************/

package org.polarsys.capella.core.semantic.data.information.impl;

import org.eclipse.emf.ecore.EClass;

import org.polarsys.capella.core.semantic.data.capellacore.impl.ClassifierImpl;

import org.polarsys.capella.core.semantic.data.information.InformationPackage;
import org.polarsys.capella.core.semantic.data.information.PartitionableElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Partitionable Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class PartitionableElementImpl extends ClassifierImpl implements PartitionableElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartitionableElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InformationPackage.Literals.PARTITIONABLE_ELEMENT;
	}

} //PartitionableElementImpl
