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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.polarsys.capella.core.semantic.data.cs.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CsFactoryImpl extends EFactoryImpl implements CsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CsFactory init() {
		try {
			CsFactory theCsFactory = (CsFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.polarsys.org/capella/core/cs/0.8.0/semantic"); 
			if (theCsFactory != null) {
				return theCsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CsPackage.PART: return createPart();
			case CsPackage.INTERFACE_PKG: return createInterfacePkg();
			case CsPackage.INTERFACE: return createInterface();
			case CsPackage.EXCHANGE_ITEM_ALLOCATION: return createExchangeItemAllocation();
			case CsPackage.PHYSICAL_LINK: return createPhysicalLink();
			case CsPackage.PHYSICAL_LINK_CATEGORY: return createPhysicalLinkCategory();
			case CsPackage.PHYSICAL_LINK_END: return createPhysicalLinkEnd();
			case CsPackage.PHYSICAL_PATH: return createPhysicalPath();
			case CsPackage.PHYSICAL_PATH_INVOLVEMENT: return createPhysicalPathInvolvement();
			case CsPackage.PHYSICAL_PATH_REFERENCE: return createPhysicalPathReference();
			case CsPackage.PHYSICAL_PORT: return createPhysicalPort();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Part createPart() {
		PartImpl part = new PartImpl();
		return part;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfacePkg createInterfacePkg() {
		InterfacePkgImpl interfacePkg = new InterfacePkgImpl();
		return interfacePkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface createInterface() {
		InterfaceImpl interface_ = new InterfaceImpl();
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExchangeItemAllocation createExchangeItemAllocation() {
		ExchangeItemAllocationImpl exchangeItemAllocation = new ExchangeItemAllocationImpl();
		return exchangeItemAllocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalLink createPhysicalLink() {
		PhysicalLinkImpl physicalLink = new PhysicalLinkImpl();
		return physicalLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalLinkCategory createPhysicalLinkCategory() {
		PhysicalLinkCategoryImpl physicalLinkCategory = new PhysicalLinkCategoryImpl();
		return physicalLinkCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalLinkEnd createPhysicalLinkEnd() {
		PhysicalLinkEndImpl physicalLinkEnd = new PhysicalLinkEndImpl();
		return physicalLinkEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalPath createPhysicalPath() {
		PhysicalPathImpl physicalPath = new PhysicalPathImpl();
		return physicalPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalPathInvolvement createPhysicalPathInvolvement() {
		PhysicalPathInvolvementImpl physicalPathInvolvement = new PhysicalPathInvolvementImpl();
		return physicalPathInvolvement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalPathReference createPhysicalPathReference() {
		PhysicalPathReferenceImpl physicalPathReference = new PhysicalPathReferenceImpl();
		return physicalPathReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalPort createPhysicalPort() {
		PhysicalPortImpl physicalPort = new PhysicalPortImpl();
		return physicalPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CsPackage getCsPackage() {
		return (CsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CsPackage getPackage() {
		return CsPackage.eINSTANCE;
	}

} //CsFactoryImpl
