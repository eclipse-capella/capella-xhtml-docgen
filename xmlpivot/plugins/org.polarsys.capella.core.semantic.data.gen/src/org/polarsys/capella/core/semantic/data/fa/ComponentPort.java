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

package org.polarsys.capella.core.semantic.data.fa;

import org.eclipse.emf.common.util.EList;

import org.polarsys.capella.core.semantic.data.information.Partition;
import org.polarsys.capella.core.semantic.data.information.Port;

import org.polarsys.capella.core.semantic.data.modellingcore.InformationsExchanger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.fa.ComponentPort#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.fa.ComponentPort#getKind <em>Kind</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.fa.ComponentPort#getComponentExchanges <em>Component Exchanges</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.fa.ComponentPort#getAllocatedFunctionPorts <em>Allocated Function Ports</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.fa.ComponentPort#getDelegatedComponentPorts <em>Delegated Component Ports</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.fa.ComponentPort#getRealizedComponentPorts <em>Realized Component Ports</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.fa.FaPackage#getComponentPort()
 * @model
 * @generated
 */
public interface ComponentPort extends Port, Partition, InformationsExchanger {
	/**
	 * Returns the value of the '<em><b>Orientation</b></em>' attribute.
	 * The literals are from the enumeration {@link org.polarsys.capella.core.semantic.data.fa.OrientationPortKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orientation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orientation</em>' attribute.
	 * @see org.polarsys.capella.core.semantic.data.fa.OrientationPortKind
	 * @see #setOrientation(OrientationPortKind)
	 * @see org.polarsys.capella.core.semantic.data.fa.FaPackage#getComponentPort_Orientation()
	 * @model
	 * @generated
	 */
	OrientationPortKind getOrientation();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.fa.ComponentPort#getOrientation <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientation</em>' attribute.
	 * @see org.polarsys.capella.core.semantic.data.fa.OrientationPortKind
	 * @see #getOrientation()
	 * @generated
	 */
	void setOrientation(OrientationPortKind value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.polarsys.capella.core.semantic.data.fa.ComponentPortKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.polarsys.capella.core.semantic.data.fa.ComponentPortKind
	 * @see #setKind(ComponentPortKind)
	 * @see org.polarsys.capella.core.semantic.data.fa.FaPackage#getComponentPort_Kind()
	 * @model
	 * @generated
	 */
	ComponentPortKind getKind();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.fa.ComponentPort#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.polarsys.capella.core.semantic.data.fa.ComponentPortKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(ComponentPortKind value);

	/**
	 * Returns the value of the '<em><b>Component Exchanges</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.fa.ComponentExchange}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Exchanges</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Exchanges</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.fa.FaPackage#getComponentPort_ComponentExchanges()
	 * @model
	 * @generated
	 */
	EList<ComponentExchange> getComponentExchanges();

	/**
	 * Returns the value of the '<em><b>Allocated Function Ports</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.fa.FunctionPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocated Function Ports</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocated Function Ports</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.fa.FaPackage#getComponentPort_AllocatedFunctionPorts()
	 * @model
	 * @generated
	 */
	EList<FunctionPort> getAllocatedFunctionPorts();

	/**
	 * Returns the value of the '<em><b>Delegated Component Ports</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.fa.ComponentPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegated Component Ports</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegated Component Ports</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.fa.FaPackage#getComponentPort_DelegatedComponentPorts()
	 * @model
	 * @generated
	 */
	EList<ComponentPort> getDelegatedComponentPorts();

	/**
	 * Returns the value of the '<em><b>Realized Component Ports</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.fa.ComponentPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realized Component Ports</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realized Component Ports</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.fa.FaPackage#getComponentPort_RealizedComponentPorts()
	 * @model
	 * @generated
	 */
	EList<ComponentPort> getRealizedComponentPorts();

} // ComponentPort
