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

package org.polarsys.capella.core.semantic.data.capellamodeller.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.capella.core.semantic.data.capellacommon.GenericTrace;

import org.polarsys.capella.core.semantic.data.capellacore.AbstractPropertyValue;
import org.polarsys.capella.core.semantic.data.capellacore.CapellacorePackage;
import org.polarsys.capella.core.semantic.data.capellacore.EnumerationPropertyLiteral;
import org.polarsys.capella.core.semantic.data.capellacore.EnumerationPropertyType;
import org.polarsys.capella.core.semantic.data.capellacore.NamedElement;
import org.polarsys.capella.core.semantic.data.capellacore.Namespace;
import org.polarsys.capella.core.semantic.data.capellacore.PropertyValueGroup;
import org.polarsys.capella.core.semantic.data.capellacore.PropertyValuePkg;
import org.polarsys.capella.core.semantic.data.capellacore.Structure;

import org.polarsys.capella.core.semantic.data.capellamodeller.CapellamodellerPackage;
import org.polarsys.capella.core.semantic.data.capellamodeller.SystemEngineering;

import org.polarsys.capella.core.semantic.data.ctx.SystemAnalysis;

import org.polarsys.capella.core.semantic.data.epbs.EPBSArchitecture;

import org.polarsys.capella.core.semantic.data.la.LogicalArchitecture;

import org.polarsys.capella.core.semantic.data.modellingcore.AbstractNamedElement;
import org.polarsys.capella.core.semantic.data.modellingcore.ModellingcorePackage;

import org.polarsys.capella.core.semantic.data.modellingcore.impl.ModelElementImpl;

import org.polarsys.capella.core.semantic.data.oa.OperationalAnalysis;

import org.polarsys.capella.core.semantic.data.pa.PhysicalArchitecture;

import org.polarsys.capella.core.semantic.data.requirement.Requirement;
import org.polarsys.capella.core.semantic.data.requirement.RequirementsTrace;

import org.polarsys.capella.core.semantic.data.sharedmodel.SharedPkg;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Engineering</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.capella.core.semantic.data.capellamodeller.impl.SystemEngineeringImpl#getSummary <em>Summary</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.capellamodeller.impl.SystemEngineeringImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.capellamodeller.impl.SystemEngineeringImpl#getReview <em>Review</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.capellamodeller.impl.SystemEngineeringImpl#getOwnedPropertyValues <em>Owned Property Values</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.capellamodeller.impl.SystemEngineeringImpl#getOwnedEnumerationPropertyTypes <em>Owned Enumeration Property Types</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.capellamodeller.impl.SystemEngineeringImpl#getAppliedPropertyValues <em>Applied Property Values</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.capellamodeller.impl.SystemEngineeringImpl#getOwnedPropertyValueGroups <em>Owned Property Value Groups</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.capellamodeller.impl.SystemEngineeringImpl#getAppliedPropertyValueGroups <em>Applied Property Value Groups</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.capellamodeller.impl.SystemEngineeringImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.capellamodeller.impl.SystemEngineeringImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.capellamodeller.impl.SystemEngineeringImpl#getAppliedRequirements <em>Applied Requirements</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.capellamodeller.impl.SystemEngineeringImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.capellamodeller.impl.SystemEngineeringImpl#getContainedGenericTraces <em>Contained Generic Traces</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.capellamodeller.impl.SystemEngineeringImpl#getContainedRequirementsTraces <em>Contained Requirements Traces</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.capellamodeller.impl.SystemEngineeringImpl#getOwnedPropertyValuePkgs <em>Owned Property Value Pkgs</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.capellamodeller.impl.SystemEngineeringImpl#getContainedOperationalAnalysis <em>Contained Operational Analysis</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.capellamodeller.impl.SystemEngineeringImpl#getContainedSystemAnalysis <em>Contained System Analysis</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.capellamodeller.impl.SystemEngineeringImpl#getContainedLogicalArchitectures <em>Contained Logical Architectures</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.capellamodeller.impl.SystemEngineeringImpl#getContainedPhysicalArchitectures <em>Contained Physical Architectures</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.capellamodeller.impl.SystemEngineeringImpl#getContainedEPBSArchitectures <em>Contained EPBS Architectures</em>}</li>
 *   <li>{@link org.polarsys.capella.core.semantic.data.capellamodeller.impl.SystemEngineeringImpl#getContainedSharedPkgs <em>Contained Shared Pkgs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SystemEngineeringImpl extends ModelElementImpl implements SystemEngineering {
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
	 * The cached value of the '{@link #getOwnedPropertyValuePkgs() <em>Owned Property Value Pkgs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPropertyValuePkgs()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyValuePkg> ownedPropertyValuePkgs;

	/**
	 * The cached value of the '{@link #getContainedOperationalAnalysis() <em>Contained Operational Analysis</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedOperationalAnalysis()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationalAnalysis> containedOperationalAnalysis;

	/**
	 * The cached value of the '{@link #getContainedSystemAnalysis() <em>Contained System Analysis</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedSystemAnalysis()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemAnalysis> containedSystemAnalysis;

	/**
	 * The cached value of the '{@link #getContainedLogicalArchitectures() <em>Contained Logical Architectures</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedLogicalArchitectures()
	 * @generated
	 * @ordered
	 */
	protected EList<LogicalArchitecture> containedLogicalArchitectures;

	/**
	 * The cached value of the '{@link #getContainedPhysicalArchitectures() <em>Contained Physical Architectures</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedPhysicalArchitectures()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalArchitecture> containedPhysicalArchitectures;

	/**
	 * The cached value of the '{@link #getContainedEPBSArchitectures() <em>Contained EPBS Architectures</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedEPBSArchitectures()
	 * @generated
	 * @ordered
	 */
	protected EList<EPBSArchitecture> containedEPBSArchitectures;

	/**
	 * The cached value of the '{@link #getContainedSharedPkgs() <em>Contained Shared Pkgs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedSharedPkgs()
	 * @generated
	 * @ordered
	 */
	protected EList<SharedPkg> containedSharedPkgs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemEngineeringImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CapellamodellerPackage.Literals.SYSTEM_ENGINEERING;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CapellamodellerPackage.SYSTEM_ENGINEERING__SUMMARY, oldSummary, summary));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CapellamodellerPackage.SYSTEM_ENGINEERING__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CapellamodellerPackage.SYSTEM_ENGINEERING__REVIEW, oldReview, review));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractPropertyValue> getOwnedPropertyValues() {
		if (ownedPropertyValues == null) {
			ownedPropertyValues = new EObjectContainmentEList<AbstractPropertyValue>(AbstractPropertyValue.class, this, CapellamodellerPackage.SYSTEM_ENGINEERING__OWNED_PROPERTY_VALUES);
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
			ownedEnumerationPropertyTypes = new EObjectContainmentEList<EnumerationPropertyType>(EnumerationPropertyType.class, this, CapellamodellerPackage.SYSTEM_ENGINEERING__OWNED_ENUMERATION_PROPERTY_TYPES);
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
			appliedPropertyValues = new EObjectResolvingEList<AbstractPropertyValue>(AbstractPropertyValue.class, this, CapellamodellerPackage.SYSTEM_ENGINEERING__APPLIED_PROPERTY_VALUES);
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
			ownedPropertyValueGroups = new EObjectContainmentEList<PropertyValueGroup>(PropertyValueGroup.class, this, CapellamodellerPackage.SYSTEM_ENGINEERING__OWNED_PROPERTY_VALUE_GROUPS);
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
			appliedPropertyValueGroups = new EObjectResolvingEList<PropertyValueGroup>(PropertyValueGroup.class, this, CapellamodellerPackage.SYSTEM_ENGINEERING__APPLIED_PROPERTY_VALUE_GROUPS);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CapellamodellerPackage.SYSTEM_ENGINEERING__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CapellamodellerPackage.SYSTEM_ENGINEERING__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnumerationPropertyLiteral> getFeatures() {
		if (features == null) {
			features = new EObjectResolvingEList<EnumerationPropertyLiteral>(EnumerationPropertyLiteral.class, this, CapellamodellerPackage.SYSTEM_ENGINEERING__FEATURES);
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
			appliedRequirements = new EObjectResolvingEList<Requirement>(Requirement.class, this, CapellamodellerPackage.SYSTEM_ENGINEERING__APPLIED_REQUIREMENTS);
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
			eNotify(new ENotificationImpl(this, Notification.SET, CapellamodellerPackage.SYSTEM_ENGINEERING__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenericTrace> getContainedGenericTraces() {
		if (containedGenericTraces == null) {
			containedGenericTraces = new EObjectContainmentEList<GenericTrace>(GenericTrace.class, this, CapellamodellerPackage.SYSTEM_ENGINEERING__CONTAINED_GENERIC_TRACES);
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
			containedRequirementsTraces = new EObjectContainmentEList<RequirementsTrace>(RequirementsTrace.class, this, CapellamodellerPackage.SYSTEM_ENGINEERING__CONTAINED_REQUIREMENTS_TRACES);
		}
		return containedRequirementsTraces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PropertyValuePkg> getOwnedPropertyValuePkgs() {
		if (ownedPropertyValuePkgs == null) {
			ownedPropertyValuePkgs = new EObjectContainmentEList<PropertyValuePkg>(PropertyValuePkg.class, this, CapellamodellerPackage.SYSTEM_ENGINEERING__OWNED_PROPERTY_VALUE_PKGS);
		}
		return ownedPropertyValuePkgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationalAnalysis> getContainedOperationalAnalysis() {
		if (containedOperationalAnalysis == null) {
			containedOperationalAnalysis = new EObjectContainmentEList<OperationalAnalysis>(OperationalAnalysis.class, this, CapellamodellerPackage.SYSTEM_ENGINEERING__CONTAINED_OPERATIONAL_ANALYSIS);
		}
		return containedOperationalAnalysis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SystemAnalysis> getContainedSystemAnalysis() {
		if (containedSystemAnalysis == null) {
			containedSystemAnalysis = new EObjectContainmentEList<SystemAnalysis>(SystemAnalysis.class, this, CapellamodellerPackage.SYSTEM_ENGINEERING__CONTAINED_SYSTEM_ANALYSIS);
		}
		return containedSystemAnalysis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LogicalArchitecture> getContainedLogicalArchitectures() {
		if (containedLogicalArchitectures == null) {
			containedLogicalArchitectures = new EObjectContainmentEList<LogicalArchitecture>(LogicalArchitecture.class, this, CapellamodellerPackage.SYSTEM_ENGINEERING__CONTAINED_LOGICAL_ARCHITECTURES);
		}
		return containedLogicalArchitectures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PhysicalArchitecture> getContainedPhysicalArchitectures() {
		if (containedPhysicalArchitectures == null) {
			containedPhysicalArchitectures = new EObjectContainmentEList<PhysicalArchitecture>(PhysicalArchitecture.class, this, CapellamodellerPackage.SYSTEM_ENGINEERING__CONTAINED_PHYSICAL_ARCHITECTURES);
		}
		return containedPhysicalArchitectures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EPBSArchitecture> getContainedEPBSArchitectures() {
		if (containedEPBSArchitectures == null) {
			containedEPBSArchitectures = new EObjectContainmentEList<EPBSArchitecture>(EPBSArchitecture.class, this, CapellamodellerPackage.SYSTEM_ENGINEERING__CONTAINED_EPBS_ARCHITECTURES);
		}
		return containedEPBSArchitectures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SharedPkg> getContainedSharedPkgs() {
		if (containedSharedPkgs == null) {
			containedSharedPkgs = new EObjectContainmentEList<SharedPkg>(SharedPkg.class, this, CapellamodellerPackage.SYSTEM_ENGINEERING__CONTAINED_SHARED_PKGS);
		}
		return containedSharedPkgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CapellamodellerPackage.SYSTEM_ENGINEERING__OWNED_PROPERTY_VALUES:
				return ((InternalEList<?>)getOwnedPropertyValues()).basicRemove(otherEnd, msgs);
			case CapellamodellerPackage.SYSTEM_ENGINEERING__OWNED_ENUMERATION_PROPERTY_TYPES:
				return ((InternalEList<?>)getOwnedEnumerationPropertyTypes()).basicRemove(otherEnd, msgs);
			case CapellamodellerPackage.SYSTEM_ENGINEERING__OWNED_PROPERTY_VALUE_GROUPS:
				return ((InternalEList<?>)getOwnedPropertyValueGroups()).basicRemove(otherEnd, msgs);
			case CapellamodellerPackage.SYSTEM_ENGINEERING__CONTAINED_GENERIC_TRACES:
				return ((InternalEList<?>)getContainedGenericTraces()).basicRemove(otherEnd, msgs);
			case CapellamodellerPackage.SYSTEM_ENGINEERING__CONTAINED_REQUIREMENTS_TRACES:
				return ((InternalEList<?>)getContainedRequirementsTraces()).basicRemove(otherEnd, msgs);
			case CapellamodellerPackage.SYSTEM_ENGINEERING__OWNED_PROPERTY_VALUE_PKGS:
				return ((InternalEList<?>)getOwnedPropertyValuePkgs()).basicRemove(otherEnd, msgs);
			case CapellamodellerPackage.SYSTEM_ENGINEERING__CONTAINED_OPERATIONAL_ANALYSIS:
				return ((InternalEList<?>)getContainedOperationalAnalysis()).basicRemove(otherEnd, msgs);
			case CapellamodellerPackage.SYSTEM_ENGINEERING__CONTAINED_SYSTEM_ANALYSIS:
				return ((InternalEList<?>)getContainedSystemAnalysis()).basicRemove(otherEnd, msgs);
			case CapellamodellerPackage.SYSTEM_ENGINEERING__CONTAINED_LOGICAL_ARCHITECTURES:
				return ((InternalEList<?>)getContainedLogicalArchitectures()).basicRemove(otherEnd, msgs);
			case CapellamodellerPackage.SYSTEM_ENGINEERING__CONTAINED_PHYSICAL_ARCHITECTURES:
				return ((InternalEList<?>)getContainedPhysicalArchitectures()).basicRemove(otherEnd, msgs);
			case CapellamodellerPackage.SYSTEM_ENGINEERING__CONTAINED_EPBS_ARCHITECTURES:
				return ((InternalEList<?>)getContainedEPBSArchitectures()).basicRemove(otherEnd, msgs);
			case CapellamodellerPackage.SYSTEM_ENGINEERING__CONTAINED_SHARED_PKGS:
				return ((InternalEList<?>)getContainedSharedPkgs()).basicRemove(otherEnd, msgs);
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
			case CapellamodellerPackage.SYSTEM_ENGINEERING__SUMMARY:
				return getSummary();
			case CapellamodellerPackage.SYSTEM_ENGINEERING__DESCRIPTION:
				return getDescription();
			case CapellamodellerPackage.SYSTEM_ENGINEERING__REVIEW:
				return getReview();
			case CapellamodellerPackage.SYSTEM_ENGINEERING__OWNED_PROPERTY_VALUES:
				return getOwnedPropertyValues();
			case CapellamodellerPackage.SYSTEM_ENGINEERING__OWNED_ENUMERATION_PROPERTY_TYPES:
				return getOwnedEnumerationPropertyTypes();
			case CapellamodellerPackage.SYSTEM_ENGINEERING__APPLIED_PROPERTY_VALUES:
				return getAppliedPropertyValues();
			case CapellamodellerPackage.SYSTEM_ENGINEERING__OWNED_PROPERTY_VALUE_GROUPS:
				return getOwnedPropertyValueGroups();
			case CapellamodellerPackage.SYSTEM_ENGINEERING__APPLIED_PROPERTY_VALUE_GROUPS:
				return getAppliedPropertyValueGroups();
			case CapellamodellerPackage.SYSTEM_ENGINEERING__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case CapellamodellerPackage.SYSTEM_ENGINEERING__FEATURES:
				return getFeatures();
			case CapellamodellerPackage.SYSTEM_ENGINEERING__APPLIED_REQUIREMENTS:
				return getAppliedRequirements();
			case CapellamodellerPackage.SYSTEM_ENGINEERING__NAME:
				return getName();
			case CapellamodellerPackage.SYSTEM_ENGINEERING__CONTAINED_GENERIC_TRACES:
				return getContainedGenericTraces();
			case CapellamodellerPackage.SYSTEM_ENGINEERING__CONTAINED_REQUIREMENTS_TRACES:
				return getContainedRequirementsTraces();
			case CapellamodellerPackage.SYSTEM_ENGINEERING__OWNED_PROPERTY_VALUE_PKGS:
				return getOwnedPropertyValuePkgs();
			case CapellamodellerPackage.SYSTEM_ENGINEERING__CONTAINED_OPERATIONAL_ANALYSIS:
				return getContainedOperationalAnalysis();
			case CapellamodellerPackage.SYSTEM_ENGINEERING__CONTAINED_SYSTEM_ANALYSIS:
				return getContainedSystemAnalysis();
			case CapellamodellerPackage.SYSTEM_ENGINEERING__CONTAINED_LOGICAL_ARCHITECTURES:
				return getContainedLogicalArchitectures();
			case CapellamodellerPackage.SYSTEM_ENGINEERING__CONTAINED_PHYSICAL_ARCHITECTURES:
				return getContainedPhysicalArchitectures();
			case CapellamodellerPackage.SYSTEM_ENGINEERING__CONTAINED_EPBS_ARCHITECTURES:
				return getContainedEPBSArchitectures();
			case CapellamodellerPackage.SYSTEM_ENGINEERING__CONTAINED_SHARED_PKGS:
				return getContainedSharedPkgs();
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
			case CapellamodellerPackage.SYSTEM_ENGINEERING__SUMMARY:
				setSummary((String)newValue);
				return;
			case CapellamodellerPackage.SYSTEM_ENGINEERING__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case CapellamodellerPackage.SYSTEM_ENGINEERING__REVIEW:
				setReview((String)newValue);
				return;
			case CapellamodellerPackage.SYSTEM_ENGINEERING__OWNED_PROPERTY_VALUES:
				getOwnedPropertyValues().clear();
				getOwnedPropertyValues().addAll((Collection<? extends AbstractPropertyValue>)newValue);
				return;
			case CapellamodellerPackage.SYSTEM_ENGINEERING__OWNED_ENUMERATION_PROPERTY_TYPES:
				getOwnedEnumerationPropertyTypes().clear();
				getOwnedEnumerationPropertyTypes().addAll((Collection<? extends EnumerationPropertyType>)newValue);
				return;
			case CapellamodellerPackage.SYSTEM_ENGINEERING__APPLIED_PROPERTY_VALUES:
				getAppliedPropertyValues().clear();
				getAppliedPropertyValues().addAll((Collection<? extends AbstractPropertyValue>)newValue);
				return;
			case CapellamodellerPackage.SYSTEM_ENGINEERING__OWNED_PROPERTY_VALUE_GROUPS:
				getOwnedPropertyValueGroups().clear();
				getOwnedPropertyValueGroups().addAll((Collection<? extends PropertyValueGroup>)newValue);
				return;
			case CapellamodellerPackage.SYSTEM_ENGINEERING__APPLIED_PROPERTY_VALUE_GROUPS:
				getAppliedPropertyValueGroups().clear();
				getAppliedPropertyValueGroups().addAll((Collection<? extends PropertyValueGroup>)newValue);
				return;
			case CapellamodellerPackage.SYSTEM_ENGINEERING__STATUS:
				setStatus((EnumerationPropertyLiteral)newValue);
				return;
			case CapellamodellerPackage.SYSTEM_ENGINEERING__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends EnumerationPropertyLiteral>)newValue);
				return;
			case CapellamodellerPackage.SYSTEM_ENGINEERING__APPLIED_REQUIREMENTS:
				getAppliedRequirements().clear();
				getAppliedRequirements().addAll((Collection<? extends Requirement>)newValue);
				return;
			case CapellamodellerPackage.SYSTEM_ENGINEERING__NAME:
				setName((String)newValue);
				return;
			case CapellamodellerPackage.SYSTEM_ENGINEERING__CONTAINED_GENERIC_TRACES:
				getContainedGenericTraces().clear();
				getContainedGenericTraces().addAll((Collection<? extends GenericTrace>)newValue);
				return;
			case CapellamodellerPackage.SYSTEM_ENGINEERING__CONTAINED_REQUIREMENTS_TRACES:
				getContainedRequirementsTraces().clear();
				getContainedRequirementsTraces().addAll((Collection<? extends RequirementsTrace>)newValue);
				return;
			case CapellamodellerPackage.SYSTEM_ENGINEERING__OWNED_PROPERTY_VALUE_PKGS:
				getOwnedPropertyValuePkgs().clear();
				getOwnedPropertyValuePkgs().addAll((Collection<? extends PropertyValuePkg>)newValue);
				return;
			case CapellamodellerPackage.SYSTEM_ENGINEERING__CONTAINED_OPERATIONAL_ANALYSIS:
				getContainedOperationalAnalysis().clear();
				getContainedOperationalAnalysis().addAll((Collection<? extends OperationalAnalysis>)newValue);
				return;
			case CapellamodellerPackage.SYSTEM_ENGINEERING__CONTAINED_SYSTEM_ANALYSIS:
				getContainedSystemAnalysis().clear();
				getContainedSystemAnalysis().addAll((Collection<? extends SystemAnalysis>)newValue);
				return;
			case CapellamodellerPackage.SYSTEM_ENGINEERING__CONTAINED_LOGICAL_ARCHITECTURES:
				getContainedLogicalArchitectures().clear();
				getContainedLogicalArchitectures().addAll((Collection<? extends LogicalArchitecture>)newValue);
				return;
			case CapellamodellerPackage.SYSTEM_ENGINEERING__CONTAINED_PHYSICAL_ARCHITECTURES:
				getContainedPhysicalArchitectures().clear();
				getContainedPhysicalArchitectures().addAll((Collection<? extends PhysicalArchitecture>)newValue);
				return;
			case CapellamodellerPackage.SYSTEM_ENGINEERING__CONTAINED_EPBS_ARCHITECTURES:
				getContainedEPBSArchitectures().clear();
				getContainedEPBSArchitectures().addAll((Collection<? extends EPBSArchitecture>)newValue);
				return;
			case CapellamodellerPackage.SYSTEM_ENGINEERING__CONTAINED_SHARED_PKGS:
				getContainedSharedPkgs().clear();
				getContainedSharedPkgs().addAll((Collection<? extends SharedPkg>)newValue);
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
			case CapellamodellerPackage.SYSTEM_ENGINEERING__SUMMARY:
				setSummary(SUMMARY_EDEFAULT);
				return;
			case CapellamodellerPackage.SYSTEM_ENGINEERING__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case CapellamodellerPackage.SYSTEM_ENGINEERING__REVIEW:
				setReview(REVIEW_EDEFAULT);
				return;
			case CapellamodellerPackage.SYSTEM_ENGINEERING__OWNED_PROPERTY_VALUES:
				getOwnedPropertyValues().clear();
				return;
			case CapellamodellerPackage.SYSTEM_ENGINEERING__OWNED_ENUMERATION_PROPERTY_TYPES:
				getOwnedEnumerationPropertyTypes().clear();
				return;
			case CapellamodellerPackage.SYSTEM_ENGINEERING__APPLIED_PROPERTY_VALUES:
				getAppliedPropertyValues().clear();
				return;
			case CapellamodellerPackage.SYSTEM_ENGINEERING__OWNED_PROPERTY_VALUE_GROUPS:
				getOwnedPropertyValueGroups().clear();
				return;
			case CapellamodellerPackage.SYSTEM_ENGINEERING__APPLIED_PROPERTY_VALUE_GROUPS:
				getAppliedPropertyValueGroups().clear();
				return;
			case CapellamodellerPackage.SYSTEM_ENGINEERING__STATUS:
				setStatus((EnumerationPropertyLiteral)null);
				return;
			case CapellamodellerPackage.SYSTEM_ENGINEERING__FEATURES:
				getFeatures().clear();
				return;
			case CapellamodellerPackage.SYSTEM_ENGINEERING__APPLIED_REQUIREMENTS:
				getAppliedRequirements().clear();
				return;
			case CapellamodellerPackage.SYSTEM_ENGINEERING__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CapellamodellerPackage.SYSTEM_ENGINEERING__CONTAINED_GENERIC_TRACES:
				getContainedGenericTraces().clear();
				return;
			case CapellamodellerPackage.SYSTEM_ENGINEERING__CONTAINED_REQUIREMENTS_TRACES:
				getContainedRequirementsTraces().clear();
				return;
			case CapellamodellerPackage.SYSTEM_ENGINEERING__OWNED_PROPERTY_VALUE_PKGS:
				getOwnedPropertyValuePkgs().clear();
				return;
			case CapellamodellerPackage.SYSTEM_ENGINEERING__CONTAINED_OPERATIONAL_ANALYSIS:
				getContainedOperationalAnalysis().clear();
				return;
			case CapellamodellerPackage.SYSTEM_ENGINEERING__CONTAINED_SYSTEM_ANALYSIS:
				getContainedSystemAnalysis().clear();
				return;
			case CapellamodellerPackage.SYSTEM_ENGINEERING__CONTAINED_LOGICAL_ARCHITECTURES:
				getContainedLogicalArchitectures().clear();
				return;
			case CapellamodellerPackage.SYSTEM_ENGINEERING__CONTAINED_PHYSICAL_ARCHITECTURES:
				getContainedPhysicalArchitectures().clear();
				return;
			case CapellamodellerPackage.SYSTEM_ENGINEERING__CONTAINED_EPBS_ARCHITECTURES:
				getContainedEPBSArchitectures().clear();
				return;
			case CapellamodellerPackage.SYSTEM_ENGINEERING__CONTAINED_SHARED_PKGS:
				getContainedSharedPkgs().clear();
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
			case CapellamodellerPackage.SYSTEM_ENGINEERING__SUMMARY:
				return SUMMARY_EDEFAULT == null ? summary != null : !SUMMARY_EDEFAULT.equals(summary);
			case CapellamodellerPackage.SYSTEM_ENGINEERING__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case CapellamodellerPackage.SYSTEM_ENGINEERING__REVIEW:
				return REVIEW_EDEFAULT == null ? review != null : !REVIEW_EDEFAULT.equals(review);
			case CapellamodellerPackage.SYSTEM_ENGINEERING__OWNED_PROPERTY_VALUES:
				return ownedPropertyValues != null && !ownedPropertyValues.isEmpty();
			case CapellamodellerPackage.SYSTEM_ENGINEERING__OWNED_ENUMERATION_PROPERTY_TYPES:
				return ownedEnumerationPropertyTypes != null && !ownedEnumerationPropertyTypes.isEmpty();
			case CapellamodellerPackage.SYSTEM_ENGINEERING__APPLIED_PROPERTY_VALUES:
				return appliedPropertyValues != null && !appliedPropertyValues.isEmpty();
			case CapellamodellerPackage.SYSTEM_ENGINEERING__OWNED_PROPERTY_VALUE_GROUPS:
				return ownedPropertyValueGroups != null && !ownedPropertyValueGroups.isEmpty();
			case CapellamodellerPackage.SYSTEM_ENGINEERING__APPLIED_PROPERTY_VALUE_GROUPS:
				return appliedPropertyValueGroups != null && !appliedPropertyValueGroups.isEmpty();
			case CapellamodellerPackage.SYSTEM_ENGINEERING__STATUS:
				return status != null;
			case CapellamodellerPackage.SYSTEM_ENGINEERING__FEATURES:
				return features != null && !features.isEmpty();
			case CapellamodellerPackage.SYSTEM_ENGINEERING__APPLIED_REQUIREMENTS:
				return appliedRequirements != null && !appliedRequirements.isEmpty();
			case CapellamodellerPackage.SYSTEM_ENGINEERING__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CapellamodellerPackage.SYSTEM_ENGINEERING__CONTAINED_GENERIC_TRACES:
				return containedGenericTraces != null && !containedGenericTraces.isEmpty();
			case CapellamodellerPackage.SYSTEM_ENGINEERING__CONTAINED_REQUIREMENTS_TRACES:
				return containedRequirementsTraces != null && !containedRequirementsTraces.isEmpty();
			case CapellamodellerPackage.SYSTEM_ENGINEERING__OWNED_PROPERTY_VALUE_PKGS:
				return ownedPropertyValuePkgs != null && !ownedPropertyValuePkgs.isEmpty();
			case CapellamodellerPackage.SYSTEM_ENGINEERING__CONTAINED_OPERATIONAL_ANALYSIS:
				return containedOperationalAnalysis != null && !containedOperationalAnalysis.isEmpty();
			case CapellamodellerPackage.SYSTEM_ENGINEERING__CONTAINED_SYSTEM_ANALYSIS:
				return containedSystemAnalysis != null && !containedSystemAnalysis.isEmpty();
			case CapellamodellerPackage.SYSTEM_ENGINEERING__CONTAINED_LOGICAL_ARCHITECTURES:
				return containedLogicalArchitectures != null && !containedLogicalArchitectures.isEmpty();
			case CapellamodellerPackage.SYSTEM_ENGINEERING__CONTAINED_PHYSICAL_ARCHITECTURES:
				return containedPhysicalArchitectures != null && !containedPhysicalArchitectures.isEmpty();
			case CapellamodellerPackage.SYSTEM_ENGINEERING__CONTAINED_EPBS_ARCHITECTURES:
				return containedEPBSArchitectures != null && !containedEPBSArchitectures.isEmpty();
			case CapellamodellerPackage.SYSTEM_ENGINEERING__CONTAINED_SHARED_PKGS:
				return containedSharedPkgs != null && !containedSharedPkgs.isEmpty();
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
		if (baseClass == AbstractNamedElement.class) {
			switch (derivedFeatureID) {
				case CapellamodellerPackage.SYSTEM_ENGINEERING__NAME: return ModellingcorePackage.ABSTRACT_NAMED_ELEMENT__NAME;
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
				case CapellamodellerPackage.SYSTEM_ENGINEERING__CONTAINED_GENERIC_TRACES: return CapellacorePackage.NAMESPACE__CONTAINED_GENERIC_TRACES;
				case CapellamodellerPackage.SYSTEM_ENGINEERING__CONTAINED_REQUIREMENTS_TRACES: return CapellacorePackage.NAMESPACE__CONTAINED_REQUIREMENTS_TRACES;
				default: return -1;
			}
		}
		if (baseClass == Structure.class) {
			switch (derivedFeatureID) {
				case CapellamodellerPackage.SYSTEM_ENGINEERING__OWNED_PROPERTY_VALUE_PKGS: return CapellacorePackage.STRUCTURE__OWNED_PROPERTY_VALUE_PKGS;
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
		if (baseClass == AbstractNamedElement.class) {
			switch (baseFeatureID) {
				case ModellingcorePackage.ABSTRACT_NAMED_ELEMENT__NAME: return CapellamodellerPackage.SYSTEM_ENGINEERING__NAME;
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
				case CapellacorePackage.NAMESPACE__CONTAINED_GENERIC_TRACES: return CapellamodellerPackage.SYSTEM_ENGINEERING__CONTAINED_GENERIC_TRACES;
				case CapellacorePackage.NAMESPACE__CONTAINED_REQUIREMENTS_TRACES: return CapellamodellerPackage.SYSTEM_ENGINEERING__CONTAINED_REQUIREMENTS_TRACES;
				default: return -1;
			}
		}
		if (baseClass == Structure.class) {
			switch (baseFeatureID) {
				case CapellacorePackage.STRUCTURE__OWNED_PROPERTY_VALUE_PKGS: return CapellamodellerPackage.SYSTEM_ENGINEERING__OWNED_PROPERTY_VALUE_PKGS;
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
		result.append(')');
		return result.toString();
	}

} //SystemEngineeringImpl
