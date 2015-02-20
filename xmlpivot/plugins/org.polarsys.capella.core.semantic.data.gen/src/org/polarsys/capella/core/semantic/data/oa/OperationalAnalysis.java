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

package org.polarsys.capella.core.semantic.data.oa;

import org.polarsys.capella.core.semantic.data.cs.BlockArchitecture;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operational Analysis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.oa.OperationalAnalysis#getOwnedOperationalContext <em>Owned Operational Context</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.oa.OperationalAnalysis#getOwnedRolePkg <em>Owned Role Pkg</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.oa.OperationalAnalysis#getOwnedEntityPkg <em>Owned Entity Pkg</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.oa.OperationalAnalysis#getContainedOperationalCapabilityPkg <em>Contained Operational Capability Pkg</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.oa.OperationalAnalysis#getContainedOperationalActivityPkg <em>Contained Operational Activity Pkg</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.oa.OaPackage#getOperationalAnalysis()
 * @model
 * @generated
 */
public interface OperationalAnalysis extends BlockArchitecture {
	/**
	 * Returns the value of the '<em><b>Owned Operational Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Operational Context</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Operational Context</em>' containment reference.
	 * @see #setOwnedOperationalContext(OperationalContext)
	 * @see org.polarsys.capella.core.semantic.data.oa.OaPackage#getOperationalAnalysis_OwnedOperationalContext()
	 * @model containment="true"
	 * @generated
	 */
	OperationalContext getOwnedOperationalContext();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.oa.OperationalAnalysis#getOwnedOperationalContext <em>Owned Operational Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Operational Context</em>' containment reference.
	 * @see #getOwnedOperationalContext()
	 * @generated
	 */
	void setOwnedOperationalContext(OperationalContext value);

	/**
	 * Returns the value of the '<em><b>Owned Role Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Role Pkg</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Role Pkg</em>' containment reference.
	 * @see #setOwnedRolePkg(RolePkg)
	 * @see org.polarsys.capella.core.semantic.data.oa.OaPackage#getOperationalAnalysis_OwnedRolePkg()
	 * @model containment="true"
	 * @generated
	 */
	RolePkg getOwnedRolePkg();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.oa.OperationalAnalysis#getOwnedRolePkg <em>Owned Role Pkg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Role Pkg</em>' containment reference.
	 * @see #getOwnedRolePkg()
	 * @generated
	 */
	void setOwnedRolePkg(RolePkg value);

	/**
	 * Returns the value of the '<em><b>Owned Entity Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Entity Pkg</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Entity Pkg</em>' containment reference.
	 * @see #setOwnedEntityPkg(EntityPkg)
	 * @see org.polarsys.capella.core.semantic.data.oa.OaPackage#getOperationalAnalysis_OwnedEntityPkg()
	 * @model containment="true"
	 * @generated
	 */
	EntityPkg getOwnedEntityPkg();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.oa.OperationalAnalysis#getOwnedEntityPkg <em>Owned Entity Pkg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Entity Pkg</em>' containment reference.
	 * @see #getOwnedEntityPkg()
	 * @generated
	 */
	void setOwnedEntityPkg(EntityPkg value);

	/**
	 * Returns the value of the '<em><b>Contained Operational Capability Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Operational Capability Pkg</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Operational Capability Pkg</em>' containment reference.
	 * @see #setContainedOperationalCapabilityPkg(OperationalCapabilityPkg)
	 * @see org.polarsys.capella.core.semantic.data.oa.OaPackage#getOperationalAnalysis_ContainedOperationalCapabilityPkg()
	 * @model containment="true"
	 * @generated
	 */
	OperationalCapabilityPkg getContainedOperationalCapabilityPkg();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.oa.OperationalAnalysis#getContainedOperationalCapabilityPkg <em>Contained Operational Capability Pkg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contained Operational Capability Pkg</em>' containment reference.
	 * @see #getContainedOperationalCapabilityPkg()
	 * @generated
	 */
	void setContainedOperationalCapabilityPkg(OperationalCapabilityPkg value);

	/**
	 * Returns the value of the '<em><b>Contained Operational Activity Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Operational Activity Pkg</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Operational Activity Pkg</em>' containment reference.
	 * @see #setContainedOperationalActivityPkg(OperationalActivityPkg)
	 * @see org.polarsys.capella.core.semantic.data.oa.OaPackage#getOperationalAnalysis_ContainedOperationalActivityPkg()
	 * @model containment="true"
	 * @generated
	 */
	OperationalActivityPkg getContainedOperationalActivityPkg();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.oa.OperationalAnalysis#getContainedOperationalActivityPkg <em>Contained Operational Activity Pkg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contained Operational Activity Pkg</em>' containment reference.
	 * @see #getContainedOperationalActivityPkg()
	 * @generated
	 */
	void setContainedOperationalActivityPkg(OperationalActivityPkg value);

} // OperationalAnalysis
