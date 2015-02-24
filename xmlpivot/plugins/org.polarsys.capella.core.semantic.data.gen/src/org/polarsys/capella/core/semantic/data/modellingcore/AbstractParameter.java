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

package org.polarsys.capella.core.semantic.data.modellingcore;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.modellingcore.AbstractParameter#isIsException <em>Is Exception</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.modellingcore.AbstractParameter#isIsStream <em>Is Stream</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.modellingcore.AbstractParameter#isIsOptional <em>Is Optional</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.modellingcore.AbstractParameter#getKindOfRate <em>Kind Of Rate</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.modellingcore.AbstractParameter#getEffect <em>Effect</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.modellingcore.AbstractParameter#getRate <em>Rate</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.modellingcore.AbstractParameter#getProbability <em>Probability</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.modellingcore.ModellingcorePackage#getAbstractParameter()
 * @model abstract="true"
 * @generated
 */
public interface AbstractParameter extends AbstractNamedElement {
	/**
	 * Returns the value of the '<em><b>Is Exception</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Exception</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Exception</em>' attribute.
	 * @see #setIsException(boolean)
	 * @see org.polarsys.capella.core.semantic.data.modellingcore.ModellingcorePackage#getAbstractParameter_IsException()
	 * @model
	 * @generated
	 */
	boolean isIsException();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.modellingcore.AbstractParameter#isIsException <em>Is Exception</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Exception</em>' attribute.
	 * @see #isIsException()
	 * @generated
	 */
	void setIsException(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Stream</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Stream</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Stream</em>' attribute.
	 * @see #setIsStream(boolean)
	 * @see org.polarsys.capella.core.semantic.data.modellingcore.ModellingcorePackage#getAbstractParameter_IsStream()
	 * @model
	 * @generated
	 */
	boolean isIsStream();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.modellingcore.AbstractParameter#isIsStream <em>Is Stream</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Stream</em>' attribute.
	 * @see #isIsStream()
	 * @generated
	 */
	void setIsStream(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Optional</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Optional</em>' attribute.
	 * @see #setIsOptional(boolean)
	 * @see org.polarsys.capella.core.semantic.data.modellingcore.ModellingcorePackage#getAbstractParameter_IsOptional()
	 * @model
	 * @generated
	 */
	boolean isIsOptional();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.modellingcore.AbstractParameter#isIsOptional <em>Is Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Optional</em>' attribute.
	 * @see #isIsOptional()
	 * @generated
	 */
	void setIsOptional(boolean value);

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
	 * @see org.polarsys.capella.core.semantic.data.modellingcore.ModellingcorePackage#getAbstractParameter_KindOfRate()
	 * @model
	 * @generated
	 */
	RateKind getKindOfRate();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.modellingcore.AbstractParameter#getKindOfRate <em>Kind Of Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind Of Rate</em>' attribute.
	 * @see org.polarsys.capella.core.semantic.data.modellingcore.RateKind
	 * @see #getKindOfRate()
	 * @generated
	 */
	void setKindOfRate(RateKind value);

	/**
	 * Returns the value of the '<em><b>Effect</b></em>' attribute.
	 * The literals are from the enumeration {@link org.polarsys.capella.core.semantic.data.modellingcore.ParameterEffectKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effect</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effect</em>' attribute.
	 * @see org.polarsys.capella.core.semantic.data.modellingcore.ParameterEffectKind
	 * @see #setEffect(ParameterEffectKind)
	 * @see org.polarsys.capella.core.semantic.data.modellingcore.ModellingcorePackage#getAbstractParameter_Effect()
	 * @model
	 * @generated
	 */
	ParameterEffectKind getEffect();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.modellingcore.AbstractParameter#getEffect <em>Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effect</em>' attribute.
	 * @see org.polarsys.capella.core.semantic.data.modellingcore.ParameterEffectKind
	 * @see #getEffect()
	 * @generated
	 */
	void setEffect(ParameterEffectKind value);

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
	 * @see org.polarsys.capella.core.semantic.data.modellingcore.ModellingcorePackage#getAbstractParameter_Rate()
	 * @model containment="true"
	 * @generated
	 */
	ValueSpecification getRate();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.modellingcore.AbstractParameter#getRate <em>Rate</em>}' containment reference.
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
	 * @see org.polarsys.capella.core.semantic.data.modellingcore.ModellingcorePackage#getAbstractParameter_Probability()
	 * @model containment="true"
	 * @generated
	 */
	ValueSpecification getProbability();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.modellingcore.AbstractParameter#getProbability <em>Probability</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Probability</em>' containment reference.
	 * @see #getProbability()
	 * @generated
	 */
	void setProbability(ValueSpecification value);

} // AbstractParameter
