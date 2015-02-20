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

package org.polarsys.capella.core.semantic.data.oa.impl;

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

import org.polarsys.capella.core.semantic.data.capellacommon.AbstractCapabilityPkg;
import org.polarsys.capella.core.semantic.data.capellacommon.GenericTrace;
import org.polarsys.capella.core.semantic.data.capellacommon.StateMachine;

import org.polarsys.capella.core.semantic.data.capellacore.AbstractPropertyValue;
import org.polarsys.capella.core.semantic.data.capellacore.CapellaElement;
import org.polarsys.capella.core.semantic.data.capellacore.CapellacorePackage;
import org.polarsys.capella.core.semantic.data.capellacore.Classifier;
import org.polarsys.capella.core.semantic.data.capellacore.EnumerationPropertyLiteral;
import org.polarsys.capella.core.semantic.data.capellacore.EnumerationPropertyType;
import org.polarsys.capella.core.semantic.data.capellacore.GeneralizableElement;
import org.polarsys.capella.core.semantic.data.capellacore.InvolvedElement;
import org.polarsys.capella.core.semantic.data.capellacore.NamedElement;
import org.polarsys.capella.core.semantic.data.capellacore.Namespace;
import org.polarsys.capella.core.semantic.data.capellacore.PropertyValueGroup;
import org.polarsys.capella.core.semantic.data.capellacore.Type;

import org.polarsys.capella.core.semantic.data.cs.Block;
import org.polarsys.capella.core.semantic.data.cs.Component;
import org.polarsys.capella.core.semantic.data.cs.CsPackage;
import org.polarsys.capella.core.semantic.data.cs.Interface;
import org.polarsys.capella.core.semantic.data.cs.InterfacePkg;
import org.polarsys.capella.core.semantic.data.cs.Part;
import org.polarsys.capella.core.semantic.data.cs.PhysicalLink;
import org.polarsys.capella.core.semantic.data.cs.PhysicalLinkCategory;
import org.polarsys.capella.core.semantic.data.cs.PhysicalPath;
import org.polarsys.capella.core.semantic.data.cs.PhysicalPort;

import org.polarsys.capella.core.semantic.data.fa.AbstractFunctionalBlock;
import org.polarsys.capella.core.semantic.data.fa.ComponentExchange;
import org.polarsys.capella.core.semantic.data.fa.ComponentExchangeCategory;
import org.polarsys.capella.core.semantic.data.fa.ComponentPort;
import org.polarsys.capella.core.semantic.data.fa.FaPackage;

import org.polarsys.capella.core.semantic.data.information.DataPkg;
import org.polarsys.capella.core.semantic.data.information.PartitionableElement;
import org.polarsys.capella.core.semantic.data.information.Property;

import org.polarsys.capella.core.semantic.data.information.communication.CommunicationLink;
import org.polarsys.capella.core.semantic.data.information.communication.CommunicationLinkExchanger;
import org.polarsys.capella.core.semantic.data.information.communication.CommunicationPackage;

import org.polarsys.capella.core.semantic.data.modellingcore.AbstractNamedElement;
import org.polarsys.capella.core.semantic.data.modellingcore.AbstractType;
import org.polarsys.capella.core.semantic.data.modellingcore.ModellingcorePackage;
import org.polarsys.capella.core.semantic.data.modellingcore.TraceableElement;

import org.polarsys.capella.core.semantic.data.modellingcore.impl.InformationsExchangerImpl;

import org.polarsys.capella.core.semantic.data.oa.CommunicationMean;
import org.polarsys.capella.core.semantic.data.oa.Entity;
import org.polarsys.capella.core.semantic.data.oa.OaPackage;
import org.polarsys.capella.core.semantic.data.oa.OperationalActivity;
import org.polarsys.capella.core.semantic.data.oa.Role;

import org.polarsys.capella.core.semantic.data.requirement.Requirement;
import org.polarsys.capella.core.semantic.data.requirement.RequirementsTrace;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.oa.impl.EntityImpl#getSummary <em>Summary</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.oa.impl.EntityImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.oa.impl.EntityImpl#getReview <em>Review</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.oa.impl.EntityImpl#getOwnedPropertyValues <em>Owned Property Values</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.oa.impl.EntityImpl#getOwnedEnumerationPropertyTypes <em>Owned Enumeration Property Types</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.oa.impl.EntityImpl#getAppliedPropertyValues <em>Applied Property Values</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.oa.impl.EntityImpl#getOwnedPropertyValueGroups <em>Owned Property Value Groups</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.oa.impl.EntityImpl#getAppliedPropertyValueGroups <em>Applied Property Value Groups</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.oa.impl.EntityImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.oa.impl.EntityImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.oa.impl.EntityImpl#getAppliedRequirements <em>Applied Requirements</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.oa.impl.EntityImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.oa.impl.EntityImpl#getContainedGenericTraces <em>Contained Generic Traces</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.oa.impl.EntityImpl#getContainedRequirementsTraces <em>Contained Requirements Traces</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.oa.impl.EntityImpl#getOwnedComponentExchanges <em>Owned Component Exchanges</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.oa.impl.EntityImpl#getOwnedComponentExchangeCategories <em>Owned Component Exchange Categories</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.oa.impl.EntityImpl#getOwnedAbstractCapabilityPkg <em>Owned Abstract Capability Pkg</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.oa.impl.EntityImpl#getOwnedInterfacePkg <em>Owned Interface Pkg</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.oa.impl.EntityImpl#getOwnedDataPkg <em>Owned Data Pkg</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.oa.impl.EntityImpl#getOwnedStateMachines <em>Owned State Machines</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.oa.impl.EntityImpl#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.oa.impl.EntityImpl#getSuper <em>Super</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.oa.impl.EntityImpl#getSub <em>Sub</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.oa.impl.EntityImpl#getContainedProperties <em>Contained Properties</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.oa.impl.EntityImpl#getOwnedCommunicationLinks <em>Owned Communication Links</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.oa.impl.EntityImpl#getUsedInterfaces <em>Used Interfaces</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.oa.impl.EntityImpl#getImplementedInterfaces <em>Implemented Interfaces</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.oa.impl.EntityImpl#getAllocatedComponents <em>Allocated Components</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.oa.impl.EntityImpl#getProvidedInterfaces <em>Provided Interfaces</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.oa.impl.EntityImpl#getRequiredInterfaces <em>Required Interfaces</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.oa.impl.EntityImpl#getContainedComponentPorts <em>Contained Component Ports</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.oa.impl.EntityImpl#getContainedParts <em>Contained Parts</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.oa.impl.EntityImpl#getContainedPhysicalPorts <em>Contained Physical Ports</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.oa.impl.EntityImpl#getOwnedPhysicalPath <em>Owned Physical Path</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.oa.impl.EntityImpl#getOwnedPhysicalLinks <em>Owned Physical Links</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.oa.impl.EntityImpl#getOwnedPhysicalLinkCategories <em>Owned Physical Link Categories</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.oa.impl.EntityImpl#getOwnedEntities <em>Owned Entities</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.oa.impl.EntityImpl#getOwnedCommunicationMeans <em>Owned Communication Means</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.oa.impl.EntityImpl#getAllocatedOperationalActivities <em>Allocated Operational Activities</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.oa.impl.EntityImpl#getAllocatedRoles <em>Allocated Roles</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntityImpl extends InformationsExchangerImpl implements Entity {
	/**
	 * The default value of the '{@link #getSummary() <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSummary()
	 * @generated
	 * @ordered
	 */
	protected static final String SUMMARY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSummary() <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSummary()
	 * @generated
	 * @ordered
	 */
	protected String summary = SUMMARY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getReview() <em>Review</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReview()
	 * @generated
	 * @ordered
	 */
	protected static final String REVIEW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReview() <em>Review</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReview()
	 * @generated
	 * @ordered
	 */
	protected String review = REVIEW_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedPropertyValues() <em>Owned Property Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPropertyValues()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractPropertyValue> ownedPropertyValues;

	/**
	 * The cached value of the '{@link #getOwnedEnumerationPropertyTypes() <em>Owned Enumeration Property Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedEnumerationPropertyTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<EnumerationPropertyType> ownedEnumerationPropertyTypes;

	/**
	 * The cached value of the '{@link #getAppliedPropertyValues() <em>Applied Property Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppliedPropertyValues()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractPropertyValue> appliedPropertyValues;

	/**
	 * The cached value of the '{@link #getOwnedPropertyValueGroups() <em>Owned Property Value Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPropertyValueGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyValueGroup> ownedPropertyValueGroups;

	/**
	 * The cached value of the '{@link #getAppliedPropertyValueGroups() <em>Applied Property Value Groups</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppliedPropertyValueGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyValueGroup> appliedPropertyValueGroups;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected EnumerationPropertyLiteral status;

	/**
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<EnumerationPropertyLiteral> features;

	/**
	 * The cached value of the '{@link #getAppliedRequirements() <em>Applied Requirements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppliedRequirements()
	 * @generated
	 * @ordered
	 */
	protected EList<Requirement> appliedRequirements;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContainedGenericTraces() <em>Contained Generic Traces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedGenericTraces()
	 * @generated
	 * @ordered
	 */
	protected EList<GenericTrace> containedGenericTraces;

	/**
	 * The cached value of the '{@link #getContainedRequirementsTraces() <em>Contained Requirements Traces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedRequirementsTraces()
	 * @generated
	 * @ordered
	 */
	protected EList<RequirementsTrace> containedRequirementsTraces;

	/**
	 * The cached value of the '{@link #getOwnedComponentExchanges() <em>Owned Component Exchanges</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedComponentExchanges()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentExchange> ownedComponentExchanges;

	/**
	 * The cached value of the '{@link #getOwnedComponentExchangeCategories() <em>Owned Component Exchange Categories</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedComponentExchangeCategories()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentExchangeCategory> ownedComponentExchangeCategories;

	/**
	 * The cached value of the '{@link #getOwnedAbstractCapabilityPkg() <em>Owned Abstract Capability Pkg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedAbstractCapabilityPkg()
	 * @generated
	 * @ordered
	 */
	protected AbstractCapabilityPkg ownedAbstractCapabilityPkg;

	/**
	 * The cached value of the '{@link #getOwnedInterfacePkg() <em>Owned Interface Pkg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedInterfacePkg()
	 * @generated
	 * @ordered
	 */
	protected InterfacePkg ownedInterfacePkg;

	/**
	 * The cached value of the '{@link #getOwnedDataPkg() <em>Owned Data Pkg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedDataPkg()
	 * @generated
	 * @ordered
	 */
	protected DataPkg ownedDataPkg;

	/**
	 * The cached value of the '{@link #getOwnedStateMachines() <em>Owned State Machines</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedStateMachines()
	 * @generated
	 * @ordered
	 */
	protected EList<StateMachine> ownedStateMachines;

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
	 * The cached value of the '{@link #getOwnedEntities() <em>Owned Entities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> ownedEntities;

	/**
	 * The cached value of the '{@link #getOwnedCommunicationMeans() <em>Owned Communication Means</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedCommunicationMeans()
	 * @generated
	 * @ordered
	 */
	protected EList<CommunicationMean> ownedCommunicationMeans;

	/**
	 * The cached value of the '{@link #getAllocatedOperationalActivities() <em>Allocated Operational Activities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatedOperationalActivities()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationalActivity> allocatedOperationalActivities;

	/**
	 * The cached value of the '{@link #getAllocatedRoles() <em>Allocated Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatedRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> allocatedRoles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OaPackage.Literals.ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSummary() {
		return summary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSummary(String newSummary) {
		String oldSummary = summary;
		summary = newSummary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OaPackage.ENTITY__SUMMARY, oldSummary, summary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OaPackage.ENTITY__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReview() {
		return review;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReview(String newReview) {
		String oldReview = review;
		review = newReview;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OaPackage.ENTITY__REVIEW, oldReview, review));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractPropertyValue> getOwnedPropertyValues() {
		if (ownedPropertyValues == null) {
			ownedPropertyValues = new EObjectContainmentEList<AbstractPropertyValue>(AbstractPropertyValue.class, this, OaPackage.ENTITY__OWNED_PROPERTY_VALUES);
		}
		return ownedPropertyValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnumerationPropertyType> getOwnedEnumerationPropertyTypes() {
		if (ownedEnumerationPropertyTypes == null) {
			ownedEnumerationPropertyTypes = new EObjectContainmentEList<EnumerationPropertyType>(EnumerationPropertyType.class, this, OaPackage.ENTITY__OWNED_ENUMERATION_PROPERTY_TYPES);
		}
		return ownedEnumerationPropertyTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractPropertyValue> getAppliedPropertyValues() {
		if (appliedPropertyValues == null) {
			appliedPropertyValues = new EObjectResolvingEList<AbstractPropertyValue>(AbstractPropertyValue.class, this, OaPackage.ENTITY__APPLIED_PROPERTY_VALUES);
		}
		return appliedPropertyValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PropertyValueGroup> getOwnedPropertyValueGroups() {
		if (ownedPropertyValueGroups == null) {
			ownedPropertyValueGroups = new EObjectContainmentEList<PropertyValueGroup>(PropertyValueGroup.class, this, OaPackage.ENTITY__OWNED_PROPERTY_VALUE_GROUPS);
		}
		return ownedPropertyValueGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PropertyValueGroup> getAppliedPropertyValueGroups() {
		if (appliedPropertyValueGroups == null) {
			appliedPropertyValueGroups = new EObjectResolvingEList<PropertyValueGroup>(PropertyValueGroup.class, this, OaPackage.ENTITY__APPLIED_PROPERTY_VALUE_GROUPS);
		}
		return appliedPropertyValueGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationPropertyLiteral getStatus() {
		if (status != null && status.eIsProxy()) {
			InternalEObject oldStatus = (InternalEObject)status;
			status = (EnumerationPropertyLiteral)eResolveProxy(oldStatus);
			if (status != oldStatus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OaPackage.ENTITY__STATUS, oldStatus, status));
			}
		}
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationPropertyLiteral basicGetStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(EnumerationPropertyLiteral newStatus) {
		EnumerationPropertyLiteral oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OaPackage.ENTITY__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnumerationPropertyLiteral> getFeatures() {
		if (features == null) {
			features = new EObjectResolvingEList<EnumerationPropertyLiteral>(EnumerationPropertyLiteral.class, this, OaPackage.ENTITY__FEATURES);
		}
		return features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Requirement> getAppliedRequirements() {
		if (appliedRequirements == null) {
			appliedRequirements = new EObjectResolvingEList<Requirement>(Requirement.class, this, OaPackage.ENTITY__APPLIED_REQUIREMENTS);
		}
		return appliedRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OaPackage.ENTITY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenericTrace> getContainedGenericTraces() {
		if (containedGenericTraces == null) {
			containedGenericTraces = new EObjectContainmentEList<GenericTrace>(GenericTrace.class, this, OaPackage.ENTITY__CONTAINED_GENERIC_TRACES);
		}
		return containedGenericTraces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RequirementsTrace> getContainedRequirementsTraces() {
		if (containedRequirementsTraces == null) {
			containedRequirementsTraces = new EObjectContainmentEList<RequirementsTrace>(RequirementsTrace.class, this, OaPackage.ENTITY__CONTAINED_REQUIREMENTS_TRACES);
		}
		return containedRequirementsTraces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentExchange> getOwnedComponentExchanges() {
		if (ownedComponentExchanges == null) {
			ownedComponentExchanges = new EObjectContainmentEList<ComponentExchange>(ComponentExchange.class, this, OaPackage.ENTITY__OWNED_COMPONENT_EXCHANGES);
		}
		return ownedComponentExchanges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentExchangeCategory> getOwnedComponentExchangeCategories() {
		if (ownedComponentExchangeCategories == null) {
			ownedComponentExchangeCategories = new EObjectContainmentEList<ComponentExchangeCategory>(ComponentExchangeCategory.class, this, OaPackage.ENTITY__OWNED_COMPONENT_EXCHANGE_CATEGORIES);
		}
		return ownedComponentExchangeCategories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractCapabilityPkg getOwnedAbstractCapabilityPkg() {
		return ownedAbstractCapabilityPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedAbstractCapabilityPkg(AbstractCapabilityPkg newOwnedAbstractCapabilityPkg, NotificationChain msgs) {
		AbstractCapabilityPkg oldOwnedAbstractCapabilityPkg = ownedAbstractCapabilityPkg;
		ownedAbstractCapabilityPkg = newOwnedAbstractCapabilityPkg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OaPackage.ENTITY__OWNED_ABSTRACT_CAPABILITY_PKG, oldOwnedAbstractCapabilityPkg, newOwnedAbstractCapabilityPkg);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedAbstractCapabilityPkg(AbstractCapabilityPkg newOwnedAbstractCapabilityPkg) {
		if (newOwnedAbstractCapabilityPkg != ownedAbstractCapabilityPkg) {
			NotificationChain msgs = null;
			if (ownedAbstractCapabilityPkg != null)
				msgs = ((InternalEObject)ownedAbstractCapabilityPkg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OaPackage.ENTITY__OWNED_ABSTRACT_CAPABILITY_PKG, null, msgs);
			if (newOwnedAbstractCapabilityPkg != null)
				msgs = ((InternalEObject)newOwnedAbstractCapabilityPkg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OaPackage.ENTITY__OWNED_ABSTRACT_CAPABILITY_PKG, null, msgs);
			msgs = basicSetOwnedAbstractCapabilityPkg(newOwnedAbstractCapabilityPkg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OaPackage.ENTITY__OWNED_ABSTRACT_CAPABILITY_PKG, newOwnedAbstractCapabilityPkg, newOwnedAbstractCapabilityPkg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfacePkg getOwnedInterfacePkg() {
		return ownedInterfacePkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedInterfacePkg(InterfacePkg newOwnedInterfacePkg, NotificationChain msgs) {
		InterfacePkg oldOwnedInterfacePkg = ownedInterfacePkg;
		ownedInterfacePkg = newOwnedInterfacePkg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OaPackage.ENTITY__OWNED_INTERFACE_PKG, oldOwnedInterfacePkg, newOwnedInterfacePkg);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedInterfacePkg(InterfacePkg newOwnedInterfacePkg) {
		if (newOwnedInterfacePkg != ownedInterfacePkg) {
			NotificationChain msgs = null;
			if (ownedInterfacePkg != null)
				msgs = ((InternalEObject)ownedInterfacePkg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OaPackage.ENTITY__OWNED_INTERFACE_PKG, null, msgs);
			if (newOwnedInterfacePkg != null)
				msgs = ((InternalEObject)newOwnedInterfacePkg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OaPackage.ENTITY__OWNED_INTERFACE_PKG, null, msgs);
			msgs = basicSetOwnedInterfacePkg(newOwnedInterfacePkg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OaPackage.ENTITY__OWNED_INTERFACE_PKG, newOwnedInterfacePkg, newOwnedInterfacePkg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPkg getOwnedDataPkg() {
		return ownedDataPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedDataPkg(DataPkg newOwnedDataPkg, NotificationChain msgs) {
		DataPkg oldOwnedDataPkg = ownedDataPkg;
		ownedDataPkg = newOwnedDataPkg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OaPackage.ENTITY__OWNED_DATA_PKG, oldOwnedDataPkg, newOwnedDataPkg);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedDataPkg(DataPkg newOwnedDataPkg) {
		if (newOwnedDataPkg != ownedDataPkg) {
			NotificationChain msgs = null;
			if (ownedDataPkg != null)
				msgs = ((InternalEObject)ownedDataPkg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OaPackage.ENTITY__OWNED_DATA_PKG, null, msgs);
			if (newOwnedDataPkg != null)
				msgs = ((InternalEObject)newOwnedDataPkg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OaPackage.ENTITY__OWNED_DATA_PKG, null, msgs);
			msgs = basicSetOwnedDataPkg(newOwnedDataPkg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OaPackage.ENTITY__OWNED_DATA_PKG, newOwnedDataPkg, newOwnedDataPkg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StateMachine> getOwnedStateMachines() {
		if (ownedStateMachines == null) {
			ownedStateMachines = new EObjectContainmentEList<StateMachine>(StateMachine.class, this, OaPackage.ENTITY__OWNED_STATE_MACHINES);
		}
		return ownedStateMachines;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OaPackage.ENTITY__ABSTRACT, oldAbstract, abstract_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeneralizableElement> getSuper() {
		if (super_ == null) {
			super_ = new EObjectWithInverseResolvingEList.ManyInverse<GeneralizableElement>(GeneralizableElement.class, this, OaPackage.ENTITY__SUPER, CapellacorePackage.GENERALIZABLE_ELEMENT__SUB);
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
			sub = new EObjectWithInverseResolvingEList.ManyInverse<GeneralizableElement>(GeneralizableElement.class, this, OaPackage.ENTITY__SUB, CapellacorePackage.GENERALIZABLE_ELEMENT__SUPER);
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
			containedProperties = new EObjectContainmentEList<Property>(Property.class, this, OaPackage.ENTITY__CONTAINED_PROPERTIES);
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
			ownedCommunicationLinks = new EObjectContainmentEList<CommunicationLink>(CommunicationLink.class, this, OaPackage.ENTITY__OWNED_COMMUNICATION_LINKS);
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
			usedInterfaces = new EObjectResolvingEList<Interface>(Interface.class, this, OaPackage.ENTITY__USED_INTERFACES);
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
			implementedInterfaces = new EObjectResolvingEList<Interface>(Interface.class, this, OaPackage.ENTITY__IMPLEMENTED_INTERFACES);
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
			allocatedComponents = new EObjectResolvingEList<Component>(Component.class, this, OaPackage.ENTITY__ALLOCATED_COMPONENTS);
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
			providedInterfaces = new EObjectResolvingEList<Interface>(Interface.class, this, OaPackage.ENTITY__PROVIDED_INTERFACES);
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
			requiredInterfaces = new EObjectResolvingEList<Interface>(Interface.class, this, OaPackage.ENTITY__REQUIRED_INTERFACES);
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
			containedComponentPorts = new EObjectContainmentEList<ComponentPort>(ComponentPort.class, this, OaPackage.ENTITY__CONTAINED_COMPONENT_PORTS);
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
			containedParts = new EObjectContainmentEList<Part>(Part.class, this, OaPackage.ENTITY__CONTAINED_PARTS);
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
			containedPhysicalPorts = new EObjectContainmentEList<PhysicalPort>(PhysicalPort.class, this, OaPackage.ENTITY__CONTAINED_PHYSICAL_PORTS);
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
			ownedPhysicalPath = new EObjectContainmentEList<PhysicalPath>(PhysicalPath.class, this, OaPackage.ENTITY__OWNED_PHYSICAL_PATH);
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
			ownedPhysicalLinks = new EObjectContainmentEList<PhysicalLink>(PhysicalLink.class, this, OaPackage.ENTITY__OWNED_PHYSICAL_LINKS);
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
			ownedPhysicalLinkCategories = new EObjectContainmentEList<PhysicalLinkCategory>(PhysicalLinkCategory.class, this, OaPackage.ENTITY__OWNED_PHYSICAL_LINK_CATEGORIES);
		}
		return ownedPhysicalLinkCategories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entity> getOwnedEntities() {
		if (ownedEntities == null) {
			ownedEntities = new EObjectContainmentEList<Entity>(Entity.class, this, OaPackage.ENTITY__OWNED_ENTITIES);
		}
		return ownedEntities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CommunicationMean> getOwnedCommunicationMeans() {
		if (ownedCommunicationMeans == null) {
			ownedCommunicationMeans = new EObjectContainmentEList<CommunicationMean>(CommunicationMean.class, this, OaPackage.ENTITY__OWNED_COMMUNICATION_MEANS);
		}
		return ownedCommunicationMeans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationalActivity> getAllocatedOperationalActivities() {
		if (allocatedOperationalActivities == null) {
			allocatedOperationalActivities = new EObjectResolvingEList<OperationalActivity>(OperationalActivity.class, this, OaPackage.ENTITY__ALLOCATED_OPERATIONAL_ACTIVITIES);
		}
		return allocatedOperationalActivities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role> getAllocatedRoles() {
		if (allocatedRoles == null) {
			allocatedRoles = new EObjectResolvingEList<Role>(Role.class, this, OaPackage.ENTITY__ALLOCATED_ROLES);
		}
		return allocatedRoles;
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
			case OaPackage.ENTITY__SUPER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSuper()).basicAdd(otherEnd, msgs);
			case OaPackage.ENTITY__SUB:
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
			case OaPackage.ENTITY__OWNED_PROPERTY_VALUES:
				return ((InternalEList<?>)getOwnedPropertyValues()).basicRemove(otherEnd, msgs);
			case OaPackage.ENTITY__OWNED_ENUMERATION_PROPERTY_TYPES:
				return ((InternalEList<?>)getOwnedEnumerationPropertyTypes()).basicRemove(otherEnd, msgs);
			case OaPackage.ENTITY__OWNED_PROPERTY_VALUE_GROUPS:
				return ((InternalEList<?>)getOwnedPropertyValueGroups()).basicRemove(otherEnd, msgs);
			case OaPackage.ENTITY__CONTAINED_GENERIC_TRACES:
				return ((InternalEList<?>)getContainedGenericTraces()).basicRemove(otherEnd, msgs);
			case OaPackage.ENTITY__CONTAINED_REQUIREMENTS_TRACES:
				return ((InternalEList<?>)getContainedRequirementsTraces()).basicRemove(otherEnd, msgs);
			case OaPackage.ENTITY__OWNED_COMPONENT_EXCHANGES:
				return ((InternalEList<?>)getOwnedComponentExchanges()).basicRemove(otherEnd, msgs);
			case OaPackage.ENTITY__OWNED_COMPONENT_EXCHANGE_CATEGORIES:
				return ((InternalEList<?>)getOwnedComponentExchangeCategories()).basicRemove(otherEnd, msgs);
			case OaPackage.ENTITY__OWNED_ABSTRACT_CAPABILITY_PKG:
				return basicSetOwnedAbstractCapabilityPkg(null, msgs);
			case OaPackage.ENTITY__OWNED_INTERFACE_PKG:
				return basicSetOwnedInterfacePkg(null, msgs);
			case OaPackage.ENTITY__OWNED_DATA_PKG:
				return basicSetOwnedDataPkg(null, msgs);
			case OaPackage.ENTITY__OWNED_STATE_MACHINES:
				return ((InternalEList<?>)getOwnedStateMachines()).basicRemove(otherEnd, msgs);
			case OaPackage.ENTITY__SUPER:
				return ((InternalEList<?>)getSuper()).basicRemove(otherEnd, msgs);
			case OaPackage.ENTITY__SUB:
				return ((InternalEList<?>)getSub()).basicRemove(otherEnd, msgs);
			case OaPackage.ENTITY__CONTAINED_PROPERTIES:
				return ((InternalEList<?>)getContainedProperties()).basicRemove(otherEnd, msgs);
			case OaPackage.ENTITY__OWNED_COMMUNICATION_LINKS:
				return ((InternalEList<?>)getOwnedCommunicationLinks()).basicRemove(otherEnd, msgs);
			case OaPackage.ENTITY__CONTAINED_COMPONENT_PORTS:
				return ((InternalEList<?>)getContainedComponentPorts()).basicRemove(otherEnd, msgs);
			case OaPackage.ENTITY__CONTAINED_PARTS:
				return ((InternalEList<?>)getContainedParts()).basicRemove(otherEnd, msgs);
			case OaPackage.ENTITY__CONTAINED_PHYSICAL_PORTS:
				return ((InternalEList<?>)getContainedPhysicalPorts()).basicRemove(otherEnd, msgs);
			case OaPackage.ENTITY__OWNED_PHYSICAL_PATH:
				return ((InternalEList<?>)getOwnedPhysicalPath()).basicRemove(otherEnd, msgs);
			case OaPackage.ENTITY__OWNED_PHYSICAL_LINKS:
				return ((InternalEList<?>)getOwnedPhysicalLinks()).basicRemove(otherEnd, msgs);
			case OaPackage.ENTITY__OWNED_PHYSICAL_LINK_CATEGORIES:
				return ((InternalEList<?>)getOwnedPhysicalLinkCategories()).basicRemove(otherEnd, msgs);
			case OaPackage.ENTITY__OWNED_ENTITIES:
				return ((InternalEList<?>)getOwnedEntities()).basicRemove(otherEnd, msgs);
			case OaPackage.ENTITY__OWNED_COMMUNICATION_MEANS:
				return ((InternalEList<?>)getOwnedCommunicationMeans()).basicRemove(otherEnd, msgs);
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
			case OaPackage.ENTITY__SUMMARY:
				return getSummary();
			case OaPackage.ENTITY__DESCRIPTION:
				return getDescription();
			case OaPackage.ENTITY__REVIEW:
				return getReview();
			case OaPackage.ENTITY__OWNED_PROPERTY_VALUES:
				return getOwnedPropertyValues();
			case OaPackage.ENTITY__OWNED_ENUMERATION_PROPERTY_TYPES:
				return getOwnedEnumerationPropertyTypes();
			case OaPackage.ENTITY__APPLIED_PROPERTY_VALUES:
				return getAppliedPropertyValues();
			case OaPackage.ENTITY__OWNED_PROPERTY_VALUE_GROUPS:
				return getOwnedPropertyValueGroups();
			case OaPackage.ENTITY__APPLIED_PROPERTY_VALUE_GROUPS:
				return getAppliedPropertyValueGroups();
			case OaPackage.ENTITY__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case OaPackage.ENTITY__FEATURES:
				return getFeatures();
			case OaPackage.ENTITY__APPLIED_REQUIREMENTS:
				return getAppliedRequirements();
			case OaPackage.ENTITY__NAME:
				return getName();
			case OaPackage.ENTITY__CONTAINED_GENERIC_TRACES:
				return getContainedGenericTraces();
			case OaPackage.ENTITY__CONTAINED_REQUIREMENTS_TRACES:
				return getContainedRequirementsTraces();
			case OaPackage.ENTITY__OWNED_COMPONENT_EXCHANGES:
				return getOwnedComponentExchanges();
			case OaPackage.ENTITY__OWNED_COMPONENT_EXCHANGE_CATEGORIES:
				return getOwnedComponentExchangeCategories();
			case OaPackage.ENTITY__OWNED_ABSTRACT_CAPABILITY_PKG:
				return getOwnedAbstractCapabilityPkg();
			case OaPackage.ENTITY__OWNED_INTERFACE_PKG:
				return getOwnedInterfacePkg();
			case OaPackage.ENTITY__OWNED_DATA_PKG:
				return getOwnedDataPkg();
			case OaPackage.ENTITY__OWNED_STATE_MACHINES:
				return getOwnedStateMachines();
			case OaPackage.ENTITY__ABSTRACT:
				return isAbstract();
			case OaPackage.ENTITY__SUPER:
				return getSuper();
			case OaPackage.ENTITY__SUB:
				return getSub();
			case OaPackage.ENTITY__CONTAINED_PROPERTIES:
				return getContainedProperties();
			case OaPackage.ENTITY__OWNED_COMMUNICATION_LINKS:
				return getOwnedCommunicationLinks();
			case OaPackage.ENTITY__USED_INTERFACES:
				return getUsedInterfaces();
			case OaPackage.ENTITY__IMPLEMENTED_INTERFACES:
				return getImplementedInterfaces();
			case OaPackage.ENTITY__ALLOCATED_COMPONENTS:
				return getAllocatedComponents();
			case OaPackage.ENTITY__PROVIDED_INTERFACES:
				return getProvidedInterfaces();
			case OaPackage.ENTITY__REQUIRED_INTERFACES:
				return getRequiredInterfaces();
			case OaPackage.ENTITY__CONTAINED_COMPONENT_PORTS:
				return getContainedComponentPorts();
			case OaPackage.ENTITY__CONTAINED_PARTS:
				return getContainedParts();
			case OaPackage.ENTITY__CONTAINED_PHYSICAL_PORTS:
				return getContainedPhysicalPorts();
			case OaPackage.ENTITY__OWNED_PHYSICAL_PATH:
				return getOwnedPhysicalPath();
			case OaPackage.ENTITY__OWNED_PHYSICAL_LINKS:
				return getOwnedPhysicalLinks();
			case OaPackage.ENTITY__OWNED_PHYSICAL_LINK_CATEGORIES:
				return getOwnedPhysicalLinkCategories();
			case OaPackage.ENTITY__OWNED_ENTITIES:
				return getOwnedEntities();
			case OaPackage.ENTITY__OWNED_COMMUNICATION_MEANS:
				return getOwnedCommunicationMeans();
			case OaPackage.ENTITY__ALLOCATED_OPERATIONAL_ACTIVITIES:
				return getAllocatedOperationalActivities();
			case OaPackage.ENTITY__ALLOCATED_ROLES:
				return getAllocatedRoles();
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
			case OaPackage.ENTITY__SUMMARY:
				setSummary((String)newValue);
				return;
			case OaPackage.ENTITY__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case OaPackage.ENTITY__REVIEW:
				setReview((String)newValue);
				return;
			case OaPackage.ENTITY__OWNED_PROPERTY_VALUES:
				getOwnedPropertyValues().clear();
				getOwnedPropertyValues().addAll((Collection<? extends AbstractPropertyValue>)newValue);
				return;
			case OaPackage.ENTITY__OWNED_ENUMERATION_PROPERTY_TYPES:
				getOwnedEnumerationPropertyTypes().clear();
				getOwnedEnumerationPropertyTypes().addAll((Collection<? extends EnumerationPropertyType>)newValue);
				return;
			case OaPackage.ENTITY__APPLIED_PROPERTY_VALUES:
				getAppliedPropertyValues().clear();
				getAppliedPropertyValues().addAll((Collection<? extends AbstractPropertyValue>)newValue);
				return;
			case OaPackage.ENTITY__OWNED_PROPERTY_VALUE_GROUPS:
				getOwnedPropertyValueGroups().clear();
				getOwnedPropertyValueGroups().addAll((Collection<? extends PropertyValueGroup>)newValue);
				return;
			case OaPackage.ENTITY__APPLIED_PROPERTY_VALUE_GROUPS:
				getAppliedPropertyValueGroups().clear();
				getAppliedPropertyValueGroups().addAll((Collection<? extends PropertyValueGroup>)newValue);
				return;
			case OaPackage.ENTITY__STATUS:
				setStatus((EnumerationPropertyLiteral)newValue);
				return;
			case OaPackage.ENTITY__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends EnumerationPropertyLiteral>)newValue);
				return;
			case OaPackage.ENTITY__APPLIED_REQUIREMENTS:
				getAppliedRequirements().clear();
				getAppliedRequirements().addAll((Collection<? extends Requirement>)newValue);
				return;
			case OaPackage.ENTITY__NAME:
				setName((String)newValue);
				return;
			case OaPackage.ENTITY__CONTAINED_GENERIC_TRACES:
				getContainedGenericTraces().clear();
				getContainedGenericTraces().addAll((Collection<? extends GenericTrace>)newValue);
				return;
			case OaPackage.ENTITY__CONTAINED_REQUIREMENTS_TRACES:
				getContainedRequirementsTraces().clear();
				getContainedRequirementsTraces().addAll((Collection<? extends RequirementsTrace>)newValue);
				return;
			case OaPackage.ENTITY__OWNED_COMPONENT_EXCHANGES:
				getOwnedComponentExchanges().clear();
				getOwnedComponentExchanges().addAll((Collection<? extends ComponentExchange>)newValue);
				return;
			case OaPackage.ENTITY__OWNED_COMPONENT_EXCHANGE_CATEGORIES:
				getOwnedComponentExchangeCategories().clear();
				getOwnedComponentExchangeCategories().addAll((Collection<? extends ComponentExchangeCategory>)newValue);
				return;
			case OaPackage.ENTITY__OWNED_ABSTRACT_CAPABILITY_PKG:
				setOwnedAbstractCapabilityPkg((AbstractCapabilityPkg)newValue);
				return;
			case OaPackage.ENTITY__OWNED_INTERFACE_PKG:
				setOwnedInterfacePkg((InterfacePkg)newValue);
				return;
			case OaPackage.ENTITY__OWNED_DATA_PKG:
				setOwnedDataPkg((DataPkg)newValue);
				return;
			case OaPackage.ENTITY__OWNED_STATE_MACHINES:
				getOwnedStateMachines().clear();
				getOwnedStateMachines().addAll((Collection<? extends StateMachine>)newValue);
				return;
			case OaPackage.ENTITY__ABSTRACT:
				setAbstract((Boolean)newValue);
				return;
			case OaPackage.ENTITY__SUPER:
				getSuper().clear();
				getSuper().addAll((Collection<? extends GeneralizableElement>)newValue);
				return;
			case OaPackage.ENTITY__SUB:
				getSub().clear();
				getSub().addAll((Collection<? extends GeneralizableElement>)newValue);
				return;
			case OaPackage.ENTITY__CONTAINED_PROPERTIES:
				getContainedProperties().clear();
				getContainedProperties().addAll((Collection<? extends Property>)newValue);
				return;
			case OaPackage.ENTITY__OWNED_COMMUNICATION_LINKS:
				getOwnedCommunicationLinks().clear();
				getOwnedCommunicationLinks().addAll((Collection<? extends CommunicationLink>)newValue);
				return;
			case OaPackage.ENTITY__USED_INTERFACES:
				getUsedInterfaces().clear();
				getUsedInterfaces().addAll((Collection<? extends Interface>)newValue);
				return;
			case OaPackage.ENTITY__IMPLEMENTED_INTERFACES:
				getImplementedInterfaces().clear();
				getImplementedInterfaces().addAll((Collection<? extends Interface>)newValue);
				return;
			case OaPackage.ENTITY__ALLOCATED_COMPONENTS:
				getAllocatedComponents().clear();
				getAllocatedComponents().addAll((Collection<? extends Component>)newValue);
				return;
			case OaPackage.ENTITY__PROVIDED_INTERFACES:
				getProvidedInterfaces().clear();
				getProvidedInterfaces().addAll((Collection<? extends Interface>)newValue);
				return;
			case OaPackage.ENTITY__REQUIRED_INTERFACES:
				getRequiredInterfaces().clear();
				getRequiredInterfaces().addAll((Collection<? extends Interface>)newValue);
				return;
			case OaPackage.ENTITY__CONTAINED_COMPONENT_PORTS:
				getContainedComponentPorts().clear();
				getContainedComponentPorts().addAll((Collection<? extends ComponentPort>)newValue);
				return;
			case OaPackage.ENTITY__CONTAINED_PARTS:
				getContainedParts().clear();
				getContainedParts().addAll((Collection<? extends Part>)newValue);
				return;
			case OaPackage.ENTITY__CONTAINED_PHYSICAL_PORTS:
				getContainedPhysicalPorts().clear();
				getContainedPhysicalPorts().addAll((Collection<? extends PhysicalPort>)newValue);
				return;
			case OaPackage.ENTITY__OWNED_PHYSICAL_PATH:
				getOwnedPhysicalPath().clear();
				getOwnedPhysicalPath().addAll((Collection<? extends PhysicalPath>)newValue);
				return;
			case OaPackage.ENTITY__OWNED_PHYSICAL_LINKS:
				getOwnedPhysicalLinks().clear();
				getOwnedPhysicalLinks().addAll((Collection<? extends PhysicalLink>)newValue);
				return;
			case OaPackage.ENTITY__OWNED_PHYSICAL_LINK_CATEGORIES:
				getOwnedPhysicalLinkCategories().clear();
				getOwnedPhysicalLinkCategories().addAll((Collection<? extends PhysicalLinkCategory>)newValue);
				return;
			case OaPackage.ENTITY__OWNED_ENTITIES:
				getOwnedEntities().clear();
				getOwnedEntities().addAll((Collection<? extends Entity>)newValue);
				return;
			case OaPackage.ENTITY__OWNED_COMMUNICATION_MEANS:
				getOwnedCommunicationMeans().clear();
				getOwnedCommunicationMeans().addAll((Collection<? extends CommunicationMean>)newValue);
				return;
			case OaPackage.ENTITY__ALLOCATED_OPERATIONAL_ACTIVITIES:
				getAllocatedOperationalActivities().clear();
				getAllocatedOperationalActivities().addAll((Collection<? extends OperationalActivity>)newValue);
				return;
			case OaPackage.ENTITY__ALLOCATED_ROLES:
				getAllocatedRoles().clear();
				getAllocatedRoles().addAll((Collection<? extends Role>)newValue);
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
			case OaPackage.ENTITY__SUMMARY:
				setSummary(SUMMARY_EDEFAULT);
				return;
			case OaPackage.ENTITY__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case OaPackage.ENTITY__REVIEW:
				setReview(REVIEW_EDEFAULT);
				return;
			case OaPackage.ENTITY__OWNED_PROPERTY_VALUES:
				getOwnedPropertyValues().clear();
				return;
			case OaPackage.ENTITY__OWNED_ENUMERATION_PROPERTY_TYPES:
				getOwnedEnumerationPropertyTypes().clear();
				return;
			case OaPackage.ENTITY__APPLIED_PROPERTY_VALUES:
				getAppliedPropertyValues().clear();
				return;
			case OaPackage.ENTITY__OWNED_PROPERTY_VALUE_GROUPS:
				getOwnedPropertyValueGroups().clear();
				return;
			case OaPackage.ENTITY__APPLIED_PROPERTY_VALUE_GROUPS:
				getAppliedPropertyValueGroups().clear();
				return;
			case OaPackage.ENTITY__STATUS:
				setStatus((EnumerationPropertyLiteral)null);
				return;
			case OaPackage.ENTITY__FEATURES:
				getFeatures().clear();
				return;
			case OaPackage.ENTITY__APPLIED_REQUIREMENTS:
				getAppliedRequirements().clear();
				return;
			case OaPackage.ENTITY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OaPackage.ENTITY__CONTAINED_GENERIC_TRACES:
				getContainedGenericTraces().clear();
				return;
			case OaPackage.ENTITY__CONTAINED_REQUIREMENTS_TRACES:
				getContainedRequirementsTraces().clear();
				return;
			case OaPackage.ENTITY__OWNED_COMPONENT_EXCHANGES:
				getOwnedComponentExchanges().clear();
				return;
			case OaPackage.ENTITY__OWNED_COMPONENT_EXCHANGE_CATEGORIES:
				getOwnedComponentExchangeCategories().clear();
				return;
			case OaPackage.ENTITY__OWNED_ABSTRACT_CAPABILITY_PKG:
				setOwnedAbstractCapabilityPkg((AbstractCapabilityPkg)null);
				return;
			case OaPackage.ENTITY__OWNED_INTERFACE_PKG:
				setOwnedInterfacePkg((InterfacePkg)null);
				return;
			case OaPackage.ENTITY__OWNED_DATA_PKG:
				setOwnedDataPkg((DataPkg)null);
				return;
			case OaPackage.ENTITY__OWNED_STATE_MACHINES:
				getOwnedStateMachines().clear();
				return;
			case OaPackage.ENTITY__ABSTRACT:
				setAbstract(ABSTRACT_EDEFAULT);
				return;
			case OaPackage.ENTITY__SUPER:
				getSuper().clear();
				return;
			case OaPackage.ENTITY__SUB:
				getSub().clear();
				return;
			case OaPackage.ENTITY__CONTAINED_PROPERTIES:
				getContainedProperties().clear();
				return;
			case OaPackage.ENTITY__OWNED_COMMUNICATION_LINKS:
				getOwnedCommunicationLinks().clear();
				return;
			case OaPackage.ENTITY__USED_INTERFACES:
				getUsedInterfaces().clear();
				return;
			case OaPackage.ENTITY__IMPLEMENTED_INTERFACES:
				getImplementedInterfaces().clear();
				return;
			case OaPackage.ENTITY__ALLOCATED_COMPONENTS:
				getAllocatedComponents().clear();
				return;
			case OaPackage.ENTITY__PROVIDED_INTERFACES:
				getProvidedInterfaces().clear();
				return;
			case OaPackage.ENTITY__REQUIRED_INTERFACES:
				getRequiredInterfaces().clear();
				return;
			case OaPackage.ENTITY__CONTAINED_COMPONENT_PORTS:
				getContainedComponentPorts().clear();
				return;
			case OaPackage.ENTITY__CONTAINED_PARTS:
				getContainedParts().clear();
				return;
			case OaPackage.ENTITY__CONTAINED_PHYSICAL_PORTS:
				getContainedPhysicalPorts().clear();
				return;
			case OaPackage.ENTITY__OWNED_PHYSICAL_PATH:
				getOwnedPhysicalPath().clear();
				return;
			case OaPackage.ENTITY__OWNED_PHYSICAL_LINKS:
				getOwnedPhysicalLinks().clear();
				return;
			case OaPackage.ENTITY__OWNED_PHYSICAL_LINK_CATEGORIES:
				getOwnedPhysicalLinkCategories().clear();
				return;
			case OaPackage.ENTITY__OWNED_ENTITIES:
				getOwnedEntities().clear();
				return;
			case OaPackage.ENTITY__OWNED_COMMUNICATION_MEANS:
				getOwnedCommunicationMeans().clear();
				return;
			case OaPackage.ENTITY__ALLOCATED_OPERATIONAL_ACTIVITIES:
				getAllocatedOperationalActivities().clear();
				return;
			case OaPackage.ENTITY__ALLOCATED_ROLES:
				getAllocatedRoles().clear();
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
			case OaPackage.ENTITY__SUMMARY:
				return SUMMARY_EDEFAULT == null ? summary != null : !SUMMARY_EDEFAULT.equals(summary);
			case OaPackage.ENTITY__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case OaPackage.ENTITY__REVIEW:
				return REVIEW_EDEFAULT == null ? review != null : !REVIEW_EDEFAULT.equals(review);
			case OaPackage.ENTITY__OWNED_PROPERTY_VALUES:
				return ownedPropertyValues != null && !ownedPropertyValues.isEmpty();
			case OaPackage.ENTITY__OWNED_ENUMERATION_PROPERTY_TYPES:
				return ownedEnumerationPropertyTypes != null && !ownedEnumerationPropertyTypes.isEmpty();
			case OaPackage.ENTITY__APPLIED_PROPERTY_VALUES:
				return appliedPropertyValues != null && !appliedPropertyValues.isEmpty();
			case OaPackage.ENTITY__OWNED_PROPERTY_VALUE_GROUPS:
				return ownedPropertyValueGroups != null && !ownedPropertyValueGroups.isEmpty();
			case OaPackage.ENTITY__APPLIED_PROPERTY_VALUE_GROUPS:
				return appliedPropertyValueGroups != null && !appliedPropertyValueGroups.isEmpty();
			case OaPackage.ENTITY__STATUS:
				return status != null;
			case OaPackage.ENTITY__FEATURES:
				return features != null && !features.isEmpty();
			case OaPackage.ENTITY__APPLIED_REQUIREMENTS:
				return appliedRequirements != null && !appliedRequirements.isEmpty();
			case OaPackage.ENTITY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OaPackage.ENTITY__CONTAINED_GENERIC_TRACES:
				return containedGenericTraces != null && !containedGenericTraces.isEmpty();
			case OaPackage.ENTITY__CONTAINED_REQUIREMENTS_TRACES:
				return containedRequirementsTraces != null && !containedRequirementsTraces.isEmpty();
			case OaPackage.ENTITY__OWNED_COMPONENT_EXCHANGES:
				return ownedComponentExchanges != null && !ownedComponentExchanges.isEmpty();
			case OaPackage.ENTITY__OWNED_COMPONENT_EXCHANGE_CATEGORIES:
				return ownedComponentExchangeCategories != null && !ownedComponentExchangeCategories.isEmpty();
			case OaPackage.ENTITY__OWNED_ABSTRACT_CAPABILITY_PKG:
				return ownedAbstractCapabilityPkg != null;
			case OaPackage.ENTITY__OWNED_INTERFACE_PKG:
				return ownedInterfacePkg != null;
			case OaPackage.ENTITY__OWNED_DATA_PKG:
				return ownedDataPkg != null;
			case OaPackage.ENTITY__OWNED_STATE_MACHINES:
				return ownedStateMachines != null && !ownedStateMachines.isEmpty();
			case OaPackage.ENTITY__ABSTRACT:
				return abstract_ != ABSTRACT_EDEFAULT;
			case OaPackage.ENTITY__SUPER:
				return super_ != null && !super_.isEmpty();
			case OaPackage.ENTITY__SUB:
				return sub != null && !sub.isEmpty();
			case OaPackage.ENTITY__CONTAINED_PROPERTIES:
				return containedProperties != null && !containedProperties.isEmpty();
			case OaPackage.ENTITY__OWNED_COMMUNICATION_LINKS:
				return ownedCommunicationLinks != null && !ownedCommunicationLinks.isEmpty();
			case OaPackage.ENTITY__USED_INTERFACES:
				return usedInterfaces != null && !usedInterfaces.isEmpty();
			case OaPackage.ENTITY__IMPLEMENTED_INTERFACES:
				return implementedInterfaces != null && !implementedInterfaces.isEmpty();
			case OaPackage.ENTITY__ALLOCATED_COMPONENTS:
				return allocatedComponents != null && !allocatedComponents.isEmpty();
			case OaPackage.ENTITY__PROVIDED_INTERFACES:
				return providedInterfaces != null && !providedInterfaces.isEmpty();
			case OaPackage.ENTITY__REQUIRED_INTERFACES:
				return requiredInterfaces != null && !requiredInterfaces.isEmpty();
			case OaPackage.ENTITY__CONTAINED_COMPONENT_PORTS:
				return containedComponentPorts != null && !containedComponentPorts.isEmpty();
			case OaPackage.ENTITY__CONTAINED_PARTS:
				return containedParts != null && !containedParts.isEmpty();
			case OaPackage.ENTITY__CONTAINED_PHYSICAL_PORTS:
				return containedPhysicalPorts != null && !containedPhysicalPorts.isEmpty();
			case OaPackage.ENTITY__OWNED_PHYSICAL_PATH:
				return ownedPhysicalPath != null && !ownedPhysicalPath.isEmpty();
			case OaPackage.ENTITY__OWNED_PHYSICAL_LINKS:
				return ownedPhysicalLinks != null && !ownedPhysicalLinks.isEmpty();
			case OaPackage.ENTITY__OWNED_PHYSICAL_LINK_CATEGORIES:
				return ownedPhysicalLinkCategories != null && !ownedPhysicalLinkCategories.isEmpty();
			case OaPackage.ENTITY__OWNED_ENTITIES:
				return ownedEntities != null && !ownedEntities.isEmpty();
			case OaPackage.ENTITY__OWNED_COMMUNICATION_MEANS:
				return ownedCommunicationMeans != null && !ownedCommunicationMeans.isEmpty();
			case OaPackage.ENTITY__ALLOCATED_OPERATIONAL_ACTIVITIES:
				return allocatedOperationalActivities != null && !allocatedOperationalActivities.isEmpty();
			case OaPackage.ENTITY__ALLOCATED_ROLES:
				return allocatedRoles != null && !allocatedRoles.isEmpty();
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
		if (baseClass == TraceableElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == CapellaElement.class) {
			switch (derivedFeatureID) {
				case OaPackage.ENTITY__SUMMARY: return CapellacorePackage.CAPELLA_ELEMENT__SUMMARY;
				case OaPackage.ENTITY__DESCRIPTION: return CapellacorePackage.CAPELLA_ELEMENT__DESCRIPTION;
				case OaPackage.ENTITY__REVIEW: return CapellacorePackage.CAPELLA_ELEMENT__REVIEW;
				case OaPackage.ENTITY__OWNED_PROPERTY_VALUES: return CapellacorePackage.CAPELLA_ELEMENT__OWNED_PROPERTY_VALUES;
				case OaPackage.ENTITY__OWNED_ENUMERATION_PROPERTY_TYPES: return CapellacorePackage.CAPELLA_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES;
				case OaPackage.ENTITY__APPLIED_PROPERTY_VALUES: return CapellacorePackage.CAPELLA_ELEMENT__APPLIED_PROPERTY_VALUES;
				case OaPackage.ENTITY__OWNED_PROPERTY_VALUE_GROUPS: return CapellacorePackage.CAPELLA_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS;
				case OaPackage.ENTITY__APPLIED_PROPERTY_VALUE_GROUPS: return CapellacorePackage.CAPELLA_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS;
				case OaPackage.ENTITY__STATUS: return CapellacorePackage.CAPELLA_ELEMENT__STATUS;
				case OaPackage.ENTITY__FEATURES: return CapellacorePackage.CAPELLA_ELEMENT__FEATURES;
				case OaPackage.ENTITY__APPLIED_REQUIREMENTS: return CapellacorePackage.CAPELLA_ELEMENT__APPLIED_REQUIREMENTS;
				default: return -1;
			}
		}
		if (baseClass == InvolvedElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == AbstractNamedElement.class) {
			switch (derivedFeatureID) {
				case OaPackage.ENTITY__NAME: return ModellingcorePackage.ABSTRACT_NAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == AbstractType.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Namespace.class) {
			switch (derivedFeatureID) {
				case OaPackage.ENTITY__CONTAINED_GENERIC_TRACES: return CapellacorePackage.NAMESPACE__CONTAINED_GENERIC_TRACES;
				case OaPackage.ENTITY__CONTAINED_REQUIREMENTS_TRACES: return CapellacorePackage.NAMESPACE__CONTAINED_REQUIREMENTS_TRACES;
				default: return -1;
			}
		}
		if (baseClass == Type.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == AbstractFunctionalBlock.class) {
			switch (derivedFeatureID) {
				case OaPackage.ENTITY__OWNED_COMPONENT_EXCHANGES: return FaPackage.ABSTRACT_FUNCTIONAL_BLOCK__OWNED_COMPONENT_EXCHANGES;
				case OaPackage.ENTITY__OWNED_COMPONENT_EXCHANGE_CATEGORIES: return FaPackage.ABSTRACT_FUNCTIONAL_BLOCK__OWNED_COMPONENT_EXCHANGE_CATEGORIES;
				default: return -1;
			}
		}
		if (baseClass == Block.class) {
			switch (derivedFeatureID) {
				case OaPackage.ENTITY__OWNED_ABSTRACT_CAPABILITY_PKG: return CsPackage.BLOCK__OWNED_ABSTRACT_CAPABILITY_PKG;
				case OaPackage.ENTITY__OWNED_INTERFACE_PKG: return CsPackage.BLOCK__OWNED_INTERFACE_PKG;
				case OaPackage.ENTITY__OWNED_DATA_PKG: return CsPackage.BLOCK__OWNED_DATA_PKG;
				case OaPackage.ENTITY__OWNED_STATE_MACHINES: return CsPackage.BLOCK__OWNED_STATE_MACHINES;
				default: return -1;
			}
		}
		if (baseClass == GeneralizableElement.class) {
			switch (derivedFeatureID) {
				case OaPackage.ENTITY__ABSTRACT: return CapellacorePackage.GENERALIZABLE_ELEMENT__ABSTRACT;
				case OaPackage.ENTITY__SUPER: return CapellacorePackage.GENERALIZABLE_ELEMENT__SUPER;
				case OaPackage.ENTITY__SUB: return CapellacorePackage.GENERALIZABLE_ELEMENT__SUB;
				default: return -1;
			}
		}
		if (baseClass == Classifier.class) {
			switch (derivedFeatureID) {
				case OaPackage.ENTITY__CONTAINED_PROPERTIES: return CapellacorePackage.CLASSIFIER__CONTAINED_PROPERTIES;
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
				case OaPackage.ENTITY__OWNED_COMMUNICATION_LINKS: return CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__OWNED_COMMUNICATION_LINKS;
				default: return -1;
			}
		}
		if (baseClass == Component.class) {
			switch (derivedFeatureID) {
				case OaPackage.ENTITY__USED_INTERFACES: return CsPackage.COMPONENT__USED_INTERFACES;
				case OaPackage.ENTITY__IMPLEMENTED_INTERFACES: return CsPackage.COMPONENT__IMPLEMENTED_INTERFACES;
				case OaPackage.ENTITY__ALLOCATED_COMPONENTS: return CsPackage.COMPONENT__ALLOCATED_COMPONENTS;
				case OaPackage.ENTITY__PROVIDED_INTERFACES: return CsPackage.COMPONENT__PROVIDED_INTERFACES;
				case OaPackage.ENTITY__REQUIRED_INTERFACES: return CsPackage.COMPONENT__REQUIRED_INTERFACES;
				case OaPackage.ENTITY__CONTAINED_COMPONENT_PORTS: return CsPackage.COMPONENT__CONTAINED_COMPONENT_PORTS;
				case OaPackage.ENTITY__CONTAINED_PARTS: return CsPackage.COMPONENT__CONTAINED_PARTS;
				case OaPackage.ENTITY__CONTAINED_PHYSICAL_PORTS: return CsPackage.COMPONENT__CONTAINED_PHYSICAL_PORTS;
				case OaPackage.ENTITY__OWNED_PHYSICAL_PATH: return CsPackage.COMPONENT__OWNED_PHYSICAL_PATH;
				case OaPackage.ENTITY__OWNED_PHYSICAL_LINKS: return CsPackage.COMPONENT__OWNED_PHYSICAL_LINKS;
				case OaPackage.ENTITY__OWNED_PHYSICAL_LINK_CATEGORIES: return CsPackage.COMPONENT__OWNED_PHYSICAL_LINK_CATEGORIES;
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
		if (baseClass == TraceableElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == CapellaElement.class) {
			switch (baseFeatureID) {
				case CapellacorePackage.CAPELLA_ELEMENT__SUMMARY: return OaPackage.ENTITY__SUMMARY;
				case CapellacorePackage.CAPELLA_ELEMENT__DESCRIPTION: return OaPackage.ENTITY__DESCRIPTION;
				case CapellacorePackage.CAPELLA_ELEMENT__REVIEW: return OaPackage.ENTITY__REVIEW;
				case CapellacorePackage.CAPELLA_ELEMENT__OWNED_PROPERTY_VALUES: return OaPackage.ENTITY__OWNED_PROPERTY_VALUES;
				case CapellacorePackage.CAPELLA_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES: return OaPackage.ENTITY__OWNED_ENUMERATION_PROPERTY_TYPES;
				case CapellacorePackage.CAPELLA_ELEMENT__APPLIED_PROPERTY_VALUES: return OaPackage.ENTITY__APPLIED_PROPERTY_VALUES;
				case CapellacorePackage.CAPELLA_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS: return OaPackage.ENTITY__OWNED_PROPERTY_VALUE_GROUPS;
				case CapellacorePackage.CAPELLA_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS: return OaPackage.ENTITY__APPLIED_PROPERTY_VALUE_GROUPS;
				case CapellacorePackage.CAPELLA_ELEMENT__STATUS: return OaPackage.ENTITY__STATUS;
				case CapellacorePackage.CAPELLA_ELEMENT__FEATURES: return OaPackage.ENTITY__FEATURES;
				case CapellacorePackage.CAPELLA_ELEMENT__APPLIED_REQUIREMENTS: return OaPackage.ENTITY__APPLIED_REQUIREMENTS;
				default: return -1;
			}
		}
		if (baseClass == InvolvedElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == AbstractNamedElement.class) {
			switch (baseFeatureID) {
				case ModellingcorePackage.ABSTRACT_NAMED_ELEMENT__NAME: return OaPackage.ENTITY__NAME;
				default: return -1;
			}
		}
		if (baseClass == AbstractType.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Namespace.class) {
			switch (baseFeatureID) {
				case CapellacorePackage.NAMESPACE__CONTAINED_GENERIC_TRACES: return OaPackage.ENTITY__CONTAINED_GENERIC_TRACES;
				case CapellacorePackage.NAMESPACE__CONTAINED_REQUIREMENTS_TRACES: return OaPackage.ENTITY__CONTAINED_REQUIREMENTS_TRACES;
				default: return -1;
			}
		}
		if (baseClass == Type.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == AbstractFunctionalBlock.class) {
			switch (baseFeatureID) {
				case FaPackage.ABSTRACT_FUNCTIONAL_BLOCK__OWNED_COMPONENT_EXCHANGES: return OaPackage.ENTITY__OWNED_COMPONENT_EXCHANGES;
				case FaPackage.ABSTRACT_FUNCTIONAL_BLOCK__OWNED_COMPONENT_EXCHANGE_CATEGORIES: return OaPackage.ENTITY__OWNED_COMPONENT_EXCHANGE_CATEGORIES;
				default: return -1;
			}
		}
		if (baseClass == Block.class) {
			switch (baseFeatureID) {
				case CsPackage.BLOCK__OWNED_ABSTRACT_CAPABILITY_PKG: return OaPackage.ENTITY__OWNED_ABSTRACT_CAPABILITY_PKG;
				case CsPackage.BLOCK__OWNED_INTERFACE_PKG: return OaPackage.ENTITY__OWNED_INTERFACE_PKG;
				case CsPackage.BLOCK__OWNED_DATA_PKG: return OaPackage.ENTITY__OWNED_DATA_PKG;
				case CsPackage.BLOCK__OWNED_STATE_MACHINES: return OaPackage.ENTITY__OWNED_STATE_MACHINES;
				default: return -1;
			}
		}
		if (baseClass == GeneralizableElement.class) {
			switch (baseFeatureID) {
				case CapellacorePackage.GENERALIZABLE_ELEMENT__ABSTRACT: return OaPackage.ENTITY__ABSTRACT;
				case CapellacorePackage.GENERALIZABLE_ELEMENT__SUPER: return OaPackage.ENTITY__SUPER;
				case CapellacorePackage.GENERALIZABLE_ELEMENT__SUB: return OaPackage.ENTITY__SUB;
				default: return -1;
			}
		}
		if (baseClass == Classifier.class) {
			switch (baseFeatureID) {
				case CapellacorePackage.CLASSIFIER__CONTAINED_PROPERTIES: return OaPackage.ENTITY__CONTAINED_PROPERTIES;
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
				case CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__OWNED_COMMUNICATION_LINKS: return OaPackage.ENTITY__OWNED_COMMUNICATION_LINKS;
				default: return -1;
			}
		}
		if (baseClass == Component.class) {
			switch (baseFeatureID) {
				case CsPackage.COMPONENT__USED_INTERFACES: return OaPackage.ENTITY__USED_INTERFACES;
				case CsPackage.COMPONENT__IMPLEMENTED_INTERFACES: return OaPackage.ENTITY__IMPLEMENTED_INTERFACES;
				case CsPackage.COMPONENT__ALLOCATED_COMPONENTS: return OaPackage.ENTITY__ALLOCATED_COMPONENTS;
				case CsPackage.COMPONENT__PROVIDED_INTERFACES: return OaPackage.ENTITY__PROVIDED_INTERFACES;
				case CsPackage.COMPONENT__REQUIRED_INTERFACES: return OaPackage.ENTITY__REQUIRED_INTERFACES;
				case CsPackage.COMPONENT__CONTAINED_COMPONENT_PORTS: return OaPackage.ENTITY__CONTAINED_COMPONENT_PORTS;
				case CsPackage.COMPONENT__CONTAINED_PARTS: return OaPackage.ENTITY__CONTAINED_PARTS;
				case CsPackage.COMPONENT__CONTAINED_PHYSICAL_PORTS: return OaPackage.ENTITY__CONTAINED_PHYSICAL_PORTS;
				case CsPackage.COMPONENT__OWNED_PHYSICAL_PATH: return OaPackage.ENTITY__OWNED_PHYSICAL_PATH;
				case CsPackage.COMPONENT__OWNED_PHYSICAL_LINKS: return OaPackage.ENTITY__OWNED_PHYSICAL_LINKS;
				case CsPackage.COMPONENT__OWNED_PHYSICAL_LINK_CATEGORIES: return OaPackage.ENTITY__OWNED_PHYSICAL_LINK_CATEGORIES;
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
		result.append(" (summary: ");
		result.append(summary);
		result.append(", description: ");
		result.append(description);
		result.append(", review: ");
		result.append(review);
		result.append(", name: ");
		result.append(name);
		result.append(", abstract: ");
		result.append(abstract_);
		result.append(')');
		return result.toString();
	}

} //EntityImpl
