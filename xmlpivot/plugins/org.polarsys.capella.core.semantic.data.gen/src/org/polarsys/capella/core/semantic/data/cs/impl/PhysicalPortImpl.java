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

package org.polarsys.capella.core.semantic.data.cs.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.capella.core.semantic.data.capellacommon.StateMachine;

import org.polarsys.capella.core.semantic.data.cs.AbstractPhysicalArtifact;
import org.polarsys.capella.core.semantic.data.cs.AbstractPhysicalLinkEnd;
import org.polarsys.capella.core.semantic.data.cs.CsPackage;
import org.polarsys.capella.core.semantic.data.cs.Interface;
import org.polarsys.capella.core.semantic.data.cs.PhysicalLink;
import org.polarsys.capella.core.semantic.data.cs.PhysicalPort;

import org.polarsys.capella.core.semantic.data.fa.ComponentPort;

import org.polarsys.capella.core.semantic.data.information.InformationPackage;
import org.polarsys.capella.core.semantic.data.information.Port;

import org.polarsys.capella.core.semantic.data.information.impl.PropertyImpl;

import org.polarsys.capella.core.semantic.data.modellingcore.InformationsExchanger;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Physical Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.impl.PhysicalPortImpl#getOwnedProtocols <em>Owned Protocols</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.impl.PhysicalPortImpl#getProvidedInterfaces <em>Provided Interfaces</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.impl.PhysicalPortImpl#getRequiredInterfaces <em>Required Interfaces</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.impl.PhysicalPortImpl#getInvolvedLinks <em>Involved Links</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.impl.PhysicalPortImpl#getAllocatedComponentPorts <em>Allocated Component Ports</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.impl.PhysicalPortImpl#getRealizedPhysicalPorts <em>Realized Physical Ports</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PhysicalPortImpl extends PropertyImpl implements PhysicalPort {
	/**
	 * The cached value of the '{@link #getOwnedProtocols() <em>Owned Protocols</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedProtocols()
	 * @generated
	 * @ordered
	 */
	protected EList<StateMachine> ownedProtocols;

	/**
	 * The cached value of the '{@link #getProvidedInterfaces() <em>Provided Interfaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> providedInterfaces;

	/**
	 * The cached value of the '{@link #getRequiredInterfaces() <em>Required Interfaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> requiredInterfaces;

	/**
	 * The cached value of the '{@link #getInvolvedLinks() <em>Involved Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvolvedLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalLink> involvedLinks;

	/**
	 * The cached value of the '{@link #getAllocatedComponentPorts() <em>Allocated Component Ports</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatedComponentPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentPort> allocatedComponentPorts;

	/**
	 * The cached value of the '{@link #getRealizedPhysicalPorts() <em>Realized Physical Ports</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizedPhysicalPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalPort> realizedPhysicalPorts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicalPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CsPackage.Literals.PHYSICAL_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StateMachine> getOwnedProtocols() {
		if (ownedProtocols == null) {
			ownedProtocols = new EObjectContainmentEList<StateMachine>(StateMachine.class, this, CsPackage.PHYSICAL_PORT__OWNED_PROTOCOLS);
		}
		return ownedProtocols;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getProvidedInterfaces() {
		if (providedInterfaces == null) {
			providedInterfaces = new EObjectResolvingEList<Interface>(Interface.class, this, CsPackage.PHYSICAL_PORT__PROVIDED_INTERFACES);
		}
		return providedInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getRequiredInterfaces() {
		if (requiredInterfaces == null) {
			requiredInterfaces = new EObjectResolvingEList<Interface>(Interface.class, this, CsPackage.PHYSICAL_PORT__REQUIRED_INTERFACES);
		}
		return requiredInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PhysicalLink> getInvolvedLinks() {
		if (involvedLinks == null) {
			involvedLinks = new EObjectResolvingEList<PhysicalLink>(PhysicalLink.class, this, CsPackage.PHYSICAL_PORT__INVOLVED_LINKS);
		}
		return involvedLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentPort> getAllocatedComponentPorts() {
		if (allocatedComponentPorts == null) {
			allocatedComponentPorts = new EObjectResolvingEList<ComponentPort>(ComponentPort.class, this, CsPackage.PHYSICAL_PORT__ALLOCATED_COMPONENT_PORTS);
		}
		return allocatedComponentPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PhysicalPort> getRealizedPhysicalPorts() {
		if (realizedPhysicalPorts == null) {
			realizedPhysicalPorts = new EObjectResolvingEList<PhysicalPort>(PhysicalPort.class, this, CsPackage.PHYSICAL_PORT__REALIZED_PHYSICAL_PORTS);
		}
		return realizedPhysicalPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CsPackage.PHYSICAL_PORT__OWNED_PROTOCOLS:
				return ((InternalEList<?>)getOwnedProtocols()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CsPackage.PHYSICAL_PORT__OWNED_PROTOCOLS:
				return getOwnedProtocols();
			case CsPackage.PHYSICAL_PORT__PROVIDED_INTERFACES:
				return getProvidedInterfaces();
			case CsPackage.PHYSICAL_PORT__REQUIRED_INTERFACES:
				return getRequiredInterfaces();
			case CsPackage.PHYSICAL_PORT__INVOLVED_LINKS:
				return getInvolvedLinks();
			case CsPackage.PHYSICAL_PORT__ALLOCATED_COMPONENT_PORTS:
				return getAllocatedComponentPorts();
			case CsPackage.PHYSICAL_PORT__REALIZED_PHYSICAL_PORTS:
				return getRealizedPhysicalPorts();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CsPackage.PHYSICAL_PORT__OWNED_PROTOCOLS:
				getOwnedProtocols().clear();
				getOwnedProtocols().addAll((Collection<? extends StateMachine>)newValue);
				return;
			case CsPackage.PHYSICAL_PORT__PROVIDED_INTERFACES:
				getProvidedInterfaces().clear();
				getProvidedInterfaces().addAll((Collection<? extends Interface>)newValue);
				return;
			case CsPackage.PHYSICAL_PORT__REQUIRED_INTERFACES:
				getRequiredInterfaces().clear();
				getRequiredInterfaces().addAll((Collection<? extends Interface>)newValue);
				return;
			case CsPackage.PHYSICAL_PORT__INVOLVED_LINKS:
				getInvolvedLinks().clear();
				getInvolvedLinks().addAll((Collection<? extends PhysicalLink>)newValue);
				return;
			case CsPackage.PHYSICAL_PORT__ALLOCATED_COMPONENT_PORTS:
				getAllocatedComponentPorts().clear();
				getAllocatedComponentPorts().addAll((Collection<? extends ComponentPort>)newValue);
				return;
			case CsPackage.PHYSICAL_PORT__REALIZED_PHYSICAL_PORTS:
				getRealizedPhysicalPorts().clear();
				getRealizedPhysicalPorts().addAll((Collection<? extends PhysicalPort>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CsPackage.PHYSICAL_PORT__OWNED_PROTOCOLS:
				getOwnedProtocols().clear();
				return;
			case CsPackage.PHYSICAL_PORT__PROVIDED_INTERFACES:
				getProvidedInterfaces().clear();
				return;
			case CsPackage.PHYSICAL_PORT__REQUIRED_INTERFACES:
				getRequiredInterfaces().clear();
				return;
			case CsPackage.PHYSICAL_PORT__INVOLVED_LINKS:
				getInvolvedLinks().clear();
				return;
			case CsPackage.PHYSICAL_PORT__ALLOCATED_COMPONENT_PORTS:
				getAllocatedComponentPorts().clear();
				return;
			case CsPackage.PHYSICAL_PORT__REALIZED_PHYSICAL_PORTS:
				getRealizedPhysicalPorts().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CsPackage.PHYSICAL_PORT__OWNED_PROTOCOLS:
				return ownedProtocols != null && !ownedProtocols.isEmpty();
			case CsPackage.PHYSICAL_PORT__PROVIDED_INTERFACES:
				return providedInterfaces != null && !providedInterfaces.isEmpty();
			case CsPackage.PHYSICAL_PORT__REQUIRED_INTERFACES:
				return requiredInterfaces != null && !requiredInterfaces.isEmpty();
			case CsPackage.PHYSICAL_PORT__INVOLVED_LINKS:
				return involvedLinks != null && !involvedLinks.isEmpty();
			case CsPackage.PHYSICAL_PORT__ALLOCATED_COMPONENT_PORTS:
				return allocatedComponentPorts != null && !allocatedComponentPorts.isEmpty();
			case CsPackage.PHYSICAL_PORT__REALIZED_PHYSICAL_PORTS:
				return realizedPhysicalPorts != null && !realizedPhysicalPorts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Port.class) {
			switch (derivedFeatureID) {
				case CsPackage.PHYSICAL_PORT__OWNED_PROTOCOLS: return InformationPackage.PORT__OWNED_PROTOCOLS;
				case CsPackage.PHYSICAL_PORT__PROVIDED_INTERFACES: return InformationPackage.PORT__PROVIDED_INTERFACES;
				case CsPackage.PHYSICAL_PORT__REQUIRED_INTERFACES: return InformationPackage.PORT__REQUIRED_INTERFACES;
				default: return -1;
			}
		}
		if (baseClass == AbstractPhysicalArtifact.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == InformationsExchanger.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == AbstractPhysicalLinkEnd.class) {
			switch (derivedFeatureID) {
				case CsPackage.PHYSICAL_PORT__INVOLVED_LINKS: return CsPackage.ABSTRACT_PHYSICAL_LINK_END__INVOLVED_LINKS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Port.class) {
			switch (baseFeatureID) {
				case InformationPackage.PORT__OWNED_PROTOCOLS: return CsPackage.PHYSICAL_PORT__OWNED_PROTOCOLS;
				case InformationPackage.PORT__PROVIDED_INTERFACES: return CsPackage.PHYSICAL_PORT__PROVIDED_INTERFACES;
				case InformationPackage.PORT__REQUIRED_INTERFACES: return CsPackage.PHYSICAL_PORT__REQUIRED_INTERFACES;
				default: return -1;
			}
		}
		if (baseClass == AbstractPhysicalArtifact.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == InformationsExchanger.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == AbstractPhysicalLinkEnd.class) {
			switch (baseFeatureID) {
				case CsPackage.ABSTRACT_PHYSICAL_LINK_END__INVOLVED_LINKS: return CsPackage.PHYSICAL_PORT__INVOLVED_LINKS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //PhysicalPortImpl
