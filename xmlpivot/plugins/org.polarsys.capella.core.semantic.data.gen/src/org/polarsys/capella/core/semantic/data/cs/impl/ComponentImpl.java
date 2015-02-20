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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.capella.core.semantic.data.capellacore.CapellacorePackage;
import org.polarsys.capella.core.semantic.data.capellacore.Classifier;
import org.polarsys.capella.core.semantic.data.capellacore.GeneralizableElement;

import org.polarsys.capella.core.semantic.data.cs.Component;
import org.polarsys.capella.core.semantic.data.cs.CsPackage;
import org.polarsys.capella.core.semantic.data.cs.Interface;
import org.polarsys.capella.core.semantic.data.cs.Part;
import org.polarsys.capella.core.semantic.data.cs.PhysicalLink;
import org.polarsys.capella.core.semantic.data.cs.PhysicalLinkCategory;
import org.polarsys.capella.core.semantic.data.cs.PhysicalPath;
import org.polarsys.capella.core.semantic.data.cs.PhysicalPort;

import org.polarsys.capella.core.semantic.data.fa.ComponentPort;

import org.polarsys.capella.core.semantic.data.information.PartitionableElement;
import org.polarsys.capella.core.semantic.data.information.Property;

import org.polarsys.capella.core.semantic.data.information.communication.CommunicationLink;
import org.polarsys.capella.core.semantic.data.information.communication.CommunicationLinkExchanger;
import org.polarsys.capella.core.semantic.data.information.communication.CommunicationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.impl.ComponentImpl#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.impl.ComponentImpl#getSuper <em>Super</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.impl.ComponentImpl#getSub <em>Sub</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.impl.ComponentImpl#getContainedProperties <em>Contained Properties</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.impl.ComponentImpl#getOwnedCommunicationLinks <em>Owned Communication Links</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.impl.ComponentImpl#getUsedInterfaces <em>Used Interfaces</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.impl.ComponentImpl#getImplementedInterfaces <em>Implemented Interfaces</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.impl.ComponentImpl#getAllocatedComponents <em>Allocated Components</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.impl.ComponentImpl#getProvidedInterfaces <em>Provided Interfaces</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.impl.ComponentImpl#getRequiredInterfaces <em>Required Interfaces</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.impl.ComponentImpl#getContainedComponentPorts <em>Contained Component Ports</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.impl.ComponentImpl#getContainedParts <em>Contained Parts</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.impl.ComponentImpl#getContainedPhysicalPorts <em>Contained Physical Ports</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.impl.ComponentImpl#getOwnedPhysicalPath <em>Owned Physical Path</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.impl.ComponentImpl#getOwnedPhysicalLinks <em>Owned Physical Links</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.cs.impl.ComponentImpl#getOwnedPhysicalLinkCategories <em>Owned Physical Link Categories</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ComponentImpl extends BlockImpl implements Component {
	/**
	 * The default value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean abstract_ = ABSTRACT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSuper() <em>Super</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuper()
	 * @generated
	 * @ordered
	 */
	protected EList<GeneralizableElement> super_;

	/**
	 * The cached value of the '{@link #getSub() <em>Sub</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSub()
	 * @generated
	 * @ordered
	 */
	protected EList<GeneralizableElement> sub;

	/**
	 * The cached value of the '{@link #getContainedProperties() <em>Contained Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> containedProperties;

	/**
	 * The cached value of the '{@link #getOwnedCommunicationLinks() <em>Owned Communication Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedCommunicationLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<CommunicationLink> ownedCommunicationLinks;

	/**
	 * The cached value of the '{@link #getUsedInterfaces() <em>Used Interfaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> usedInterfaces;

	/**
	 * The cached value of the '{@link #getImplementedInterfaces() <em>Implemented Interfaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementedInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> implementedInterfaces;

	/**
	 * The cached value of the '{@link #getAllocatedComponents() <em>Allocated Components</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatedComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> allocatedComponents;

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
	 * The cached value of the '{@link #getContainedComponentPorts() <em>Contained Component Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedComponentPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentPort> containedComponentPorts;

	/**
	 * The cached value of the '{@link #getContainedParts() <em>Contained Parts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedParts()
	 * @generated
	 * @ordered
	 */
	protected EList<Part> containedParts;

	/**
	 * The cached value of the '{@link #getContainedPhysicalPorts() <em>Contained Physical Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedPhysicalPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalPort> containedPhysicalPorts;

	/**
	 * The cached value of the '{@link #getOwnedPhysicalPath() <em>Owned Physical Path</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPhysicalPath()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalPath> ownedPhysicalPath;

	/**
	 * The cached value of the '{@link #getOwnedPhysicalLinks() <em>Owned Physical Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPhysicalLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalLink> ownedPhysicalLinks;

	/**
	 * The cached value of the '{@link #getOwnedPhysicalLinkCategories() <em>Owned Physical Link Categories</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPhysicalLinkCategories()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalLinkCategory> ownedPhysicalLinkCategories;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CsPackage.Literals.COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAbstract() {
		return abstract_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstract(boolean newAbstract) {
		boolean oldAbstract = abstract_;
		abstract_ = newAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.COMPONENT__ABSTRACT, oldAbstract, abstract_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeneralizableElement> getSuper() {
		if (super_ == null) {
			super_ = new EObjectWithInverseResolvingEList.ManyInverse<GeneralizableElement>(GeneralizableElement.class, this, CsPackage.COMPONENT__SUPER, CapellacorePackage.GENERALIZABLE_ELEMENT__SUB);
		}
		return super_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeneralizableElement> getSub() {
		if (sub == null) {
			sub = new EObjectWithInverseResolvingEList.ManyInverse<GeneralizableElement>(GeneralizableElement.class, this, CsPackage.COMPONENT__SUB, CapellacorePackage.GENERALIZABLE_ELEMENT__SUPER);
		}
		return sub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getContainedProperties() {
		if (containedProperties == null) {
			containedProperties = new EObjectContainmentEList<Property>(Property.class, this, CsPackage.COMPONENT__CONTAINED_PROPERTIES);
		}
		return containedProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CommunicationLink> getOwnedCommunicationLinks() {
		if (ownedCommunicationLinks == null) {
			ownedCommunicationLinks = new EObjectContainmentEList<CommunicationLink>(CommunicationLink.class, this, CsPackage.COMPONENT__OWNED_COMMUNICATION_LINKS);
		}
		return ownedCommunicationLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getUsedInterfaces() {
		if (usedInterfaces == null) {
			usedInterfaces = new EObjectResolvingEList<Interface>(Interface.class, this, CsPackage.COMPONENT__USED_INTERFACES);
		}
		return usedInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getImplementedInterfaces() {
		if (implementedInterfaces == null) {
			implementedInterfaces = new EObjectResolvingEList<Interface>(Interface.class, this, CsPackage.COMPONENT__IMPLEMENTED_INTERFACES);
		}
		return implementedInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Component> getAllocatedComponents() {
		if (allocatedComponents == null) {
			allocatedComponents = new EObjectResolvingEList<Component>(Component.class, this, CsPackage.COMPONENT__ALLOCATED_COMPONENTS);
		}
		return allocatedComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getProvidedInterfaces() {
		if (providedInterfaces == null) {
			providedInterfaces = new EObjectResolvingEList<Interface>(Interface.class, this, CsPackage.COMPONENT__PROVIDED_INTERFACES);
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
			requiredInterfaces = new EObjectResolvingEList<Interface>(Interface.class, this, CsPackage.COMPONENT__REQUIRED_INTERFACES);
		}
		return requiredInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentPort> getContainedComponentPorts() {
		if (containedComponentPorts == null) {
			containedComponentPorts = new EObjectContainmentEList<ComponentPort>(ComponentPort.class, this, CsPackage.COMPONENT__CONTAINED_COMPONENT_PORTS);
		}
		return containedComponentPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Part> getContainedParts() {
		if (containedParts == null) {
			containedParts = new EObjectContainmentEList<Part>(Part.class, this, CsPackage.COMPONENT__CONTAINED_PARTS);
		}
		return containedParts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PhysicalPort> getContainedPhysicalPorts() {
		if (containedPhysicalPorts == null) {
			containedPhysicalPorts = new EObjectContainmentEList<PhysicalPort>(PhysicalPort.class, this, CsPackage.COMPONENT__CONTAINED_PHYSICAL_PORTS);
		}
		return containedPhysicalPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PhysicalPath> getOwnedPhysicalPath() {
		if (ownedPhysicalPath == null) {
			ownedPhysicalPath = new EObjectContainmentEList<PhysicalPath>(PhysicalPath.class, this, CsPackage.COMPONENT__OWNED_PHYSICAL_PATH);
		}
		return ownedPhysicalPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PhysicalLink> getOwnedPhysicalLinks() {
		if (ownedPhysicalLinks == null) {
			ownedPhysicalLinks = new EObjectContainmentEList<PhysicalLink>(PhysicalLink.class, this, CsPackage.COMPONENT__OWNED_PHYSICAL_LINKS);
		}
		return ownedPhysicalLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PhysicalLinkCategory> getOwnedPhysicalLinkCategories() {
		if (ownedPhysicalLinkCategories == null) {
			ownedPhysicalLinkCategories = new EObjectContainmentEList<PhysicalLinkCategory>(PhysicalLinkCategory.class, this, CsPackage.COMPONENT__OWNED_PHYSICAL_LINK_CATEGORIES);
		}
		return ownedPhysicalLinkCategories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CsPackage.COMPONENT__SUPER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSuper()).basicAdd(otherEnd, msgs);
			case CsPackage.COMPONENT__SUB:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSub()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CsPackage.COMPONENT__SUPER:
				return ((InternalEList<?>)getSuper()).basicRemove(otherEnd, msgs);
			case CsPackage.COMPONENT__SUB:
				return ((InternalEList<?>)getSub()).basicRemove(otherEnd, msgs);
			case CsPackage.COMPONENT__CONTAINED_PROPERTIES:
				return ((InternalEList<?>)getContainedProperties()).basicRemove(otherEnd, msgs);
			case CsPackage.COMPONENT__OWNED_COMMUNICATION_LINKS:
				return ((InternalEList<?>)getOwnedCommunicationLinks()).basicRemove(otherEnd, msgs);
			case CsPackage.COMPONENT__CONTAINED_COMPONENT_PORTS:
				return ((InternalEList<?>)getContainedComponentPorts()).basicRemove(otherEnd, msgs);
			case CsPackage.COMPONENT__CONTAINED_PARTS:
				return ((InternalEList<?>)getContainedParts()).basicRemove(otherEnd, msgs);
			case CsPackage.COMPONENT__CONTAINED_PHYSICAL_PORTS:
				return ((InternalEList<?>)getContainedPhysicalPorts()).basicRemove(otherEnd, msgs);
			case CsPackage.COMPONENT__OWNED_PHYSICAL_PATH:
				return ((InternalEList<?>)getOwnedPhysicalPath()).basicRemove(otherEnd, msgs);
			case CsPackage.COMPONENT__OWNED_PHYSICAL_LINKS:
				return ((InternalEList<?>)getOwnedPhysicalLinks()).basicRemove(otherEnd, msgs);
			case CsPackage.COMPONENT__OWNED_PHYSICAL_LINK_CATEGORIES:
				return ((InternalEList<?>)getOwnedPhysicalLinkCategories()).basicRemove(otherEnd, msgs);
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
			case CsPackage.COMPONENT__ABSTRACT:
				return isAbstract();
			case CsPackage.COMPONENT__SUPER:
				return getSuper();
			case CsPackage.COMPONENT__SUB:
				return getSub();
			case CsPackage.COMPONENT__CONTAINED_PROPERTIES:
				return getContainedProperties();
			case CsPackage.COMPONENT__OWNED_COMMUNICATION_LINKS:
				return getOwnedCommunicationLinks();
			case CsPackage.COMPONENT__USED_INTERFACES:
				return getUsedInterfaces();
			case CsPackage.COMPONENT__IMPLEMENTED_INTERFACES:
				return getImplementedInterfaces();
			case CsPackage.COMPONENT__ALLOCATED_COMPONENTS:
				return getAllocatedComponents();
			case CsPackage.COMPONENT__PROVIDED_INTERFACES:
				return getProvidedInterfaces();
			case CsPackage.COMPONENT__REQUIRED_INTERFACES:
				return getRequiredInterfaces();
			case CsPackage.COMPONENT__CONTAINED_COMPONENT_PORTS:
				return getContainedComponentPorts();
			case CsPackage.COMPONENT__CONTAINED_PARTS:
				return getContainedParts();
			case CsPackage.COMPONENT__CONTAINED_PHYSICAL_PORTS:
				return getContainedPhysicalPorts();
			case CsPackage.COMPONENT__OWNED_PHYSICAL_PATH:
				return getOwnedPhysicalPath();
			case CsPackage.COMPONENT__OWNED_PHYSICAL_LINKS:
				return getOwnedPhysicalLinks();
			case CsPackage.COMPONENT__OWNED_PHYSICAL_LINK_CATEGORIES:
				return getOwnedPhysicalLinkCategories();
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
			case CsPackage.COMPONENT__ABSTRACT:
				setAbstract((Boolean)newValue);
				return;
			case CsPackage.COMPONENT__SUPER:
				getSuper().clear();
				getSuper().addAll((Collection<? extends GeneralizableElement>)newValue);
				return;
			case CsPackage.COMPONENT__SUB:
				getSub().clear();
				getSub().addAll((Collection<? extends GeneralizableElement>)newValue);
				return;
			case CsPackage.COMPONENT__CONTAINED_PROPERTIES:
				getContainedProperties().clear();
				getContainedProperties().addAll((Collection<? extends Property>)newValue);
				return;
			case CsPackage.COMPONENT__OWNED_COMMUNICATION_LINKS:
				getOwnedCommunicationLinks().clear();
				getOwnedCommunicationLinks().addAll((Collection<? extends CommunicationLink>)newValue);
				return;
			case CsPackage.COMPONENT__USED_INTERFACES:
				getUsedInterfaces().clear();
				getUsedInterfaces().addAll((Collection<? extends Interface>)newValue);
				return;
			case CsPackage.COMPONENT__IMPLEMENTED_INTERFACES:
				getImplementedInterfaces().clear();
				getImplementedInterfaces().addAll((Collection<? extends Interface>)newValue);
				return;
			case CsPackage.COMPONENT__ALLOCATED_COMPONENTS:
				getAllocatedComponents().clear();
				getAllocatedComponents().addAll((Collection<? extends Component>)newValue);
				return;
			case CsPackage.COMPONENT__PROVIDED_INTERFACES:
				getProvidedInterfaces().clear();
				getProvidedInterfaces().addAll((Collection<? extends Interface>)newValue);
				return;
			case CsPackage.COMPONENT__REQUIRED_INTERFACES:
				getRequiredInterfaces().clear();
				getRequiredInterfaces().addAll((Collection<? extends Interface>)newValue);
				return;
			case CsPackage.COMPONENT__CONTAINED_COMPONENT_PORTS:
				getContainedComponentPorts().clear();
				getContainedComponentPorts().addAll((Collection<? extends ComponentPort>)newValue);
				return;
			case CsPackage.COMPONENT__CONTAINED_PARTS:
				getContainedParts().clear();
				getContainedParts().addAll((Collection<? extends Part>)newValue);
				return;
			case CsPackage.COMPONENT__CONTAINED_PHYSICAL_PORTS:
				getContainedPhysicalPorts().clear();
				getContainedPhysicalPorts().addAll((Collection<? extends PhysicalPort>)newValue);
				return;
			case CsPackage.COMPONENT__OWNED_PHYSICAL_PATH:
				getOwnedPhysicalPath().clear();
				getOwnedPhysicalPath().addAll((Collection<? extends PhysicalPath>)newValue);
				return;
			case CsPackage.COMPONENT__OWNED_PHYSICAL_LINKS:
				getOwnedPhysicalLinks().clear();
				getOwnedPhysicalLinks().addAll((Collection<? extends PhysicalLink>)newValue);
				return;
			case CsPackage.COMPONENT__OWNED_PHYSICAL_LINK_CATEGORIES:
				getOwnedPhysicalLinkCategories().clear();
				getOwnedPhysicalLinkCategories().addAll((Collection<? extends PhysicalLinkCategory>)newValue);
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
			case CsPackage.COMPONENT__ABSTRACT:
				setAbstract(ABSTRACT_EDEFAULT);
				return;
			case CsPackage.COMPONENT__SUPER:
				getSuper().clear();
				return;
			case CsPackage.COMPONENT__SUB:
				getSub().clear();
				return;
			case CsPackage.COMPONENT__CONTAINED_PROPERTIES:
				getContainedProperties().clear();
				return;
			case CsPackage.COMPONENT__OWNED_COMMUNICATION_LINKS:
				getOwnedCommunicationLinks().clear();
				return;
			case CsPackage.COMPONENT__USED_INTERFACES:
				getUsedInterfaces().clear();
				return;
			case CsPackage.COMPONENT__IMPLEMENTED_INTERFACES:
				getImplementedInterfaces().clear();
				return;
			case CsPackage.COMPONENT__ALLOCATED_COMPONENTS:
				getAllocatedComponents().clear();
				return;
			case CsPackage.COMPONENT__PROVIDED_INTERFACES:
				getProvidedInterfaces().clear();
				return;
			case CsPackage.COMPONENT__REQUIRED_INTERFACES:
				getRequiredInterfaces().clear();
				return;
			case CsPackage.COMPONENT__CONTAINED_COMPONENT_PORTS:
				getContainedComponentPorts().clear();
				return;
			case CsPackage.COMPONENT__CONTAINED_PARTS:
				getContainedParts().clear();
				return;
			case CsPackage.COMPONENT__CONTAINED_PHYSICAL_PORTS:
				getContainedPhysicalPorts().clear();
				return;
			case CsPackage.COMPONENT__OWNED_PHYSICAL_PATH:
				getOwnedPhysicalPath().clear();
				return;
			case CsPackage.COMPONENT__OWNED_PHYSICAL_LINKS:
				getOwnedPhysicalLinks().clear();
				return;
			case CsPackage.COMPONENT__OWNED_PHYSICAL_LINK_CATEGORIES:
				getOwnedPhysicalLinkCategories().clear();
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
			case CsPackage.COMPONENT__ABSTRACT:
				return abstract_ != ABSTRACT_EDEFAULT;
			case CsPackage.COMPONENT__SUPER:
				return super_ != null && !super_.isEmpty();
			case CsPackage.COMPONENT__SUB:
				return sub != null && !sub.isEmpty();
			case CsPackage.COMPONENT__CONTAINED_PROPERTIES:
				return containedProperties != null && !containedProperties.isEmpty();
			case CsPackage.COMPONENT__OWNED_COMMUNICATION_LINKS:
				return ownedCommunicationLinks != null && !ownedCommunicationLinks.isEmpty();
			case CsPackage.COMPONENT__USED_INTERFACES:
				return usedInterfaces != null && !usedInterfaces.isEmpty();
			case CsPackage.COMPONENT__IMPLEMENTED_INTERFACES:
				return implementedInterfaces != null && !implementedInterfaces.isEmpty();
			case CsPackage.COMPONENT__ALLOCATED_COMPONENTS:
				return allocatedComponents != null && !allocatedComponents.isEmpty();
			case CsPackage.COMPONENT__PROVIDED_INTERFACES:
				return providedInterfaces != null && !providedInterfaces.isEmpty();
			case CsPackage.COMPONENT__REQUIRED_INTERFACES:
				return requiredInterfaces != null && !requiredInterfaces.isEmpty();
			case CsPackage.COMPONENT__CONTAINED_COMPONENT_PORTS:
				return containedComponentPorts != null && !containedComponentPorts.isEmpty();
			case CsPackage.COMPONENT__CONTAINED_PARTS:
				return containedParts != null && !containedParts.isEmpty();
			case CsPackage.COMPONENT__CONTAINED_PHYSICAL_PORTS:
				return containedPhysicalPorts != null && !containedPhysicalPorts.isEmpty();
			case CsPackage.COMPONENT__OWNED_PHYSICAL_PATH:
				return ownedPhysicalPath != null && !ownedPhysicalPath.isEmpty();
			case CsPackage.COMPONENT__OWNED_PHYSICAL_LINKS:
				return ownedPhysicalLinks != null && !ownedPhysicalLinks.isEmpty();
			case CsPackage.COMPONENT__OWNED_PHYSICAL_LINK_CATEGORIES:
				return ownedPhysicalLinkCategories != null && !ownedPhysicalLinkCategories.isEmpty();
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
		if (baseClass == GeneralizableElement.class) {
			switch (derivedFeatureID) {
				case CsPackage.COMPONENT__ABSTRACT: return CapellacorePackage.GENERALIZABLE_ELEMENT__ABSTRACT;
				case CsPackage.COMPONENT__SUPER: return CapellacorePackage.GENERALIZABLE_ELEMENT__SUPER;
				case CsPackage.COMPONENT__SUB: return CapellacorePackage.GENERALIZABLE_ELEMENT__SUB;
				default: return -1;
			}
		}
		if (baseClass == Classifier.class) {
			switch (derivedFeatureID) {
				case CsPackage.COMPONENT__CONTAINED_PROPERTIES: return CapellacorePackage.CLASSIFIER__CONTAINED_PROPERTIES;
				default: return -1;
			}
		}
		if (baseClass == PartitionableElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == CommunicationLinkExchanger.class) {
			switch (derivedFeatureID) {
				case CsPackage.COMPONENT__OWNED_COMMUNICATION_LINKS: return CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__OWNED_COMMUNICATION_LINKS;
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
		if (baseClass == GeneralizableElement.class) {
			switch (baseFeatureID) {
				case CapellacorePackage.GENERALIZABLE_ELEMENT__ABSTRACT: return CsPackage.COMPONENT__ABSTRACT;
				case CapellacorePackage.GENERALIZABLE_ELEMENT__SUPER: return CsPackage.COMPONENT__SUPER;
				case CapellacorePackage.GENERALIZABLE_ELEMENT__SUB: return CsPackage.COMPONENT__SUB;
				default: return -1;
			}
		}
		if (baseClass == Classifier.class) {
			switch (baseFeatureID) {
				case CapellacorePackage.CLASSIFIER__CONTAINED_PROPERTIES: return CsPackage.COMPONENT__CONTAINED_PROPERTIES;
				default: return -1;
			}
		}
		if (baseClass == PartitionableElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == CommunicationLinkExchanger.class) {
			switch (baseFeatureID) {
				case CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__OWNED_COMMUNICATION_LINKS: return CsPackage.COMPONENT__OWNED_COMMUNICATION_LINKS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (abstract: ");
		result.append(abstract_);
		result.append(')');
		return result.toString();
	}

} //ComponentImpl
