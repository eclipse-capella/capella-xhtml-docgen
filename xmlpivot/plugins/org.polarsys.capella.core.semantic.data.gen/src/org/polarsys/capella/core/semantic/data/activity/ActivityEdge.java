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

package org.polarsys.capella.core.semantic.data.activity;

import org.polarsys.capella.core.semantic.data.modellingcore.ModelElement;
import org.polarsys.capella.core.semantic.data.modellingcore.RateKind;
import org.polarsys.capella.core.semantic.data.modellingcore.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.activity.ActivityEdge#getKindOfRate <em>Kind Of Rate</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.activity.ActivityEdge#getRate <em>Rate</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.activity.ActivityEdge#getProbability <em>Probability</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.activity.ActivityEdge#getTarget <em>Target</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.activity.ActivityEdge#getSource <em>Source</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.activity.ActivityEdge#getGuard <em>Guard</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.activity.ActivityEdge#getWeight <em>Weight</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.activity.ActivityPackage#getActivityEdge()
 * @model abstract="true"
 * @generated
 */
public interface ActivityEdge extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Kind Of Rate</b></em>' attribute.
	 * The literals are from the enumeration {@link org.polarsys.capella.core.semantic.data.modellingcore.RateKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind Of Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind Of Rate</em>' attribute.
	 * @see org.polarsys.capella.core.semantic.data.modellingcore.RateKind
	 * @see #setKindOfRate(RateKind)
	 * @see org.polarsys.capella.core.semantic.data.activity.ActivityPackage#getActivityEdge_KindOfRate()
	 * @model
	 * @generated
	 */
	RateKind getKindOfRate();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.activity.ActivityEdge#getKindOfRate <em>Kind Of Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind Of Rate</em>' attribute.
	 * @see org.polarsys.capella.core.semantic.data.modellingcore.RateKind
	 * @see #getKindOfRate()
	 * @generated
	 */
	void setKindOfRate(RateKind value);

	/**
	 * Returns the value of the '<em><b>Rate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rate</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rate</em>' containment reference.
	 * @see #setRate(ValueSpecification)
	 * @see org.polarsys.capella.core.semantic.data.activity.ActivityPackage#getActivityEdge_Rate()
	 * @model containment="true"
	 * @generated
	 */
	ValueSpecification getRate();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.activity.ActivityEdge#getRate <em>Rate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate</em>' containment reference.
	 * @see #getRate()
	 * @generated
	 */
	void setRate(ValueSpecification value);

	/**
	 * Returns the value of the '<em><b>Probability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Probability</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Probability</em>' containment reference.
	 * @see #setProbability(ValueSpecification)
	 * @see org.polarsys.capella.core.semantic.data.activity.ActivityPackage#getActivityEdge_Probability()
	 * @model containment="true"
	 * @generated
	 */
	ValueSpecification getProbability();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.activity.ActivityEdge#getProbability <em>Probability</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Probability</em>' containment reference.
	 * @see #getProbability()
	 * @generated
	 */
	void setProbability(ValueSpecification value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(ActivityNode)
	 * @see org.polarsys.capella.core.semantic.data.activity.ActivityPackage#getActivityEdge_Target()
	 * @model required="true"
	 * @generated
	 */
	ActivityNode getTarget();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.activity.ActivityEdge#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ActivityNode value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(ActivityNode)
	 * @see org.polarsys.capella.core.semantic.data.activity.ActivityPackage#getActivityEdge_Source()
	 * @model required="true"
	 * @generated
	 */
	ActivityNode getSource();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.activity.ActivityEdge#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ActivityNode value);

	/**
	 * Returns the value of the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guard</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard</em>' containment reference.
	 * @see #setGuard(ValueSpecification)
	 * @see org.polarsys.capella.core.semantic.data.activity.ActivityPackage#getActivityEdge_Guard()
	 * @model containment="true"
	 * @generated
	 */
	ValueSpecification getGuard();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.activity.ActivityEdge#getGuard <em>Guard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard</em>' containment reference.
	 * @see #getGuard()
	 * @generated
	 */
	void setGuard(ValueSpecification value);

	/**
	 * Returns the value of the '<em><b>Weight</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weight</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight</em>' containment reference.
	 * @see #setWeight(ValueSpecification)
	 * @see org.polarsys.capella.core.semantic.data.activity.ActivityPackage#getActivityEdge_Weight()
	 * @model containment="true"
	 * @generated
	 */
	ValueSpecification getWeight();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.activity.ActivityEdge#getWeight <em>Weight</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' containment reference.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(ValueSpecification value);

} // ActivityEdge
