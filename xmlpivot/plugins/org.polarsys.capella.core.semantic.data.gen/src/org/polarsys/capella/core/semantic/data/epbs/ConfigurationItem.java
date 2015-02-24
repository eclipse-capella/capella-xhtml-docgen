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

package org.polarsys.capella.core.semantic.data.epbs;

import org.eclipse.emf.common.util.EList;

import org.polarsys.capella.core.semantic.data.cs.AbstractPhysicalArtifact;
import org.polarsys.capella.core.semantic.data.cs.SystemComponent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.epbs.ConfigurationItem#getItemIdentifier <em>Item Identifier</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.epbs.ConfigurationItem#getKind <em>Kind</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.epbs.ConfigurationItem#getOwnedConfigurationItems <em>Owned Configuration Items</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.epbs.ConfigurationItem#getOwnedConfigurationItemPkgs <em>Owned Configuration Item Pkgs</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.epbs.ConfigurationItem#getAllocatedPhysicalArtifacts <em>Allocated Physical Artifacts</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.capella.core.semantic.data.epbs.EpbsPackage#getConfigurationItem()
 * @model
 * @generated
 */
public interface ConfigurationItem extends SystemComponent {
	/**
	 * Returns the value of the '<em><b>Item Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Identifier</em>' attribute.
	 * @see #setItemIdentifier(String)
	 * @see org.polarsys.capella.core.semantic.data.epbs.EpbsPackage#getConfigurationItem_ItemIdentifier()
	 * @model
	 * @generated
	 */
	String getItemIdentifier();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.epbs.ConfigurationItem#getItemIdentifier <em>Item Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Identifier</em>' attribute.
	 * @see #getItemIdentifier()
	 * @generated
	 */
	void setItemIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The default value is <code>"Unset"</code>.
	 * The literals are from the enumeration {@link org.polarsys.capella.core.semantic.data.epbs.ConfigurationItemKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.polarsys.capella.core.semantic.data.epbs.ConfigurationItemKind
	 * @see #setKind(ConfigurationItemKind)
	 * @see org.polarsys.capella.core.semantic.data.epbs.EpbsPackage#getConfigurationItem_Kind()
	 * @model default="Unset"
	 * @generated
	 */
	ConfigurationItemKind getKind();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.core.semantic.data.epbs.ConfigurationItem#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.polarsys.capella.core.semantic.data.epbs.ConfigurationItemKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(ConfigurationItemKind value);

	/**
	 * Returns the value of the '<em><b>Owned Configuration Items</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.epbs.ConfigurationItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Configuration Items</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Configuration Items</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.epbs.EpbsPackage#getConfigurationItem_OwnedConfigurationItems()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConfigurationItem> getOwnedConfigurationItems();

	/**
	 * Returns the value of the '<em><b>Owned Configuration Item Pkgs</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.epbs.ConfigurationItemPkg}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Configuration Item Pkgs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Configuration Item Pkgs</em>' containment reference list.
	 * @see org.polarsys.capella.core.semantic.data.epbs.EpbsPackage#getConfigurationItem_OwnedConfigurationItemPkgs()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConfigurationItemPkg> getOwnedConfigurationItemPkgs();

	/**
	 * Returns the value of the '<em><b>Allocated Physical Artifacts</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.semantic.data.cs.AbstractPhysicalArtifact}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocated Physical Artifacts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocated Physical Artifacts</em>' reference list.
	 * @see org.polarsys.capella.core.semantic.data.epbs.EpbsPackage#getConfigurationItem_AllocatedPhysicalArtifacts()
	 * @model ordered="false"
	 * @generated
	 */
	EList<AbstractPhysicalArtifact> getAllocatedPhysicalArtifacts();

} // ConfigurationItem
