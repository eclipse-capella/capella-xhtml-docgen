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

import org.polarsys.capella.core.semantic.data.behavior.AbstractEvent;

import org.polarsys.capella.core.semantic.data.capellacore.NamedElement;

import org.polarsys.capella.core.semantic.data.cs.Part;

import org.polarsys.capella.core.semantic.data.information.AbstractEventOperation;
import org.polarsys.capella.core.semantic.data.information.Port;

import org.polarsys.capella.core.semantic.data.modellingcore.AbstractInformationFlow;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Exchange</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.fa.ComponentExchange#getKind <em>Kind</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.fa.ComponentExchange#isOriented <em>Oriented</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.fa.ComponentExchange#getAllocatedFunctionalExchanges <em>Allocated Functional Exchanges</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.fa.ComponentExchange#getOwnedComponentExchangeEnds <em>Owned Component Exchange Ends</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.fa.ComponentExchange#getSourcePort <em>Source Port</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.fa.ComponentExchange#getSourcePart <em>Source Part</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.fa.ComponentExchange#getTargetPort <em>Target Port</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.fa.ComponentExchange#getTargetPart <em>Target Part</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.fa.ComponentExchange#getCategories <em>Categories</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.fa.ComponentExchange#getRealizedComponentExchanges <em>Realized Component Exchanges</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.fa.FaPackage#getComponentExchange()
 * @model
 * @generated
 */
public interface ComponentExchange extends AbstractEvent, AbstractEventOperation, NamedElement, AbstractInformationFlow {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.polarsys.capella.core.semantic.data.fa.ComponentExchangeKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.polarsys.capella.core.semantic.data.fa.ComponentExchangeKind
	 * @see #setKind(ComponentExchangeKind)
	 * @see org.polarsys.capella.core.semantic.data.fa.FaPackage#getComponentExchange_Kind()
	 * @model
	 * @generated
	 */
	ComponentExchangeKind getKind();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.fa.ComponentExchange#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.polarsys.capella.core.semantic.data.fa.ComponentExchangeKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(ComponentExchangeKind value);

	/**
	 * Returns the value of the '<em><b>Oriented</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Oriented</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Oriented</em>' attribute.
	 * @see #setOriented(boolean)
	 * @see org.polarsys.capella.core.semantic.data.fa.FaPackage#getComponentExchange_Oriented()
	 * @model default="false"
	 * @generated
	 */
	boolean isOriented();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.fa.ComponentExchange#isOriented <em>Oriented</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oriented</em>' attribute.
	 * @see #isOriented()
	 * @generated
	 */
	void setOriented(boolean value);

	/**
	 * Returns the value of the '<em><b>Allocated Functional Exchanges</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.fa.FunctionalExchange}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocated Functional Exchanges</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocated Functional Exchanges</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.fa.FaPackage#getComponentExchange_AllocatedFunctionalExchanges()
	 * @model
	 * @generated
	 */
	EList<FunctionalExchange> getAllocatedFunctionalExchanges();

	/**
	 * Returns the value of the '<em><b>Owned Component Exchange Ends</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.fa.ComponentExchangeEnd}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Component Exchange Ends</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Component Exchange Ends</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.fa.FaPackage#getComponentExchange_OwnedComponentExchangeEnds()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComponentExchangeEnd> getOwnedComponentExchangeEnds();

	/**
	 * Returns the value of the '<em><b>Source Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Port</em>' reference.
	 * @see #setSourcePort(Port)
	 * @see org.polarsys.capella.core.semantic.data.fa.FaPackage#getComponentExchange_SourcePort()
	 * @model
	 * @generated
	 */
	Port getSourcePort();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.fa.ComponentExchange#getSourcePort <em>Source Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Port</em>' reference.
	 * @see #getSourcePort()
	 * @generated
	 */
	void setSourcePort(Port value);

	/**
	 * Returns the value of the '<em><b>Source Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Part</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Part</em>' reference.
	 * @see #setSourcePart(Part)
	 * @see org.polarsys.capella.core.semantic.data.fa.FaPackage#getComponentExchange_SourcePart()
	 * @model
	 * @generated
	 */
	Part getSourcePart();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.fa.ComponentExchange#getSourcePart <em>Source Part</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Part</em>' reference.
	 * @see #getSourcePart()
	 * @generated
	 */
	void setSourcePart(Part value);

	/**
	 * Returns the value of the '<em><b>Target Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Port</em>' reference.
	 * @see #setTargetPort(Port)
	 * @see org.polarsys.capella.core.semantic.data.fa.FaPackage#getComponentExchange_TargetPort()
	 * @model
	 * @generated
	 */
	Port getTargetPort();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.fa.ComponentExchange#getTargetPort <em>Target Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Port</em>' reference.
	 * @see #getTargetPort()
	 * @generated
	 */
	void setTargetPort(Port value);

	/**
	 * Returns the value of the '<em><b>Target Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Part</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Part</em>' reference.
	 * @see #setTargetPart(Part)
	 * @see org.polarsys.capella.core.semantic.data.fa.FaPackage#getComponentExchange_TargetPart()
	 * @model
	 * @generated
	 */
	Part getTargetPart();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.fa.ComponentExchange#getTargetPart <em>Target Part</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Part</em>' reference.
	 * @see #getTargetPart()
	 * @generated
	 */
	void setTargetPart(Part value);

	/**
	 * Returns the value of the '<em><b>Categories</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.fa.ComponentExchangeCategory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categories</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categories</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.fa.FaPackage#getComponentExchange_Categories()
	 * @model
	 * @generated
	 */
	EList<ComponentExchangeCategory> getCategories();

	/**
	 * Returns the value of the '<em><b>Realized Component Exchanges</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.fa.ComponentExchange}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realized Component Exchanges</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realized Component Exchanges</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.fa.FaPackage#getComponentExchange_RealizedComponentExchanges()
	 * @model
	 * @generated
	 */
	EList<ComponentExchange> getRealizedComponentExchanges();

} // ComponentExchange
