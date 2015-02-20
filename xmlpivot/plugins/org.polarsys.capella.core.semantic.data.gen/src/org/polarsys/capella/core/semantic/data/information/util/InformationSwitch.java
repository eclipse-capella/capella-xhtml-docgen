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

package org.polarsys.capella.core.semantic.data.information.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.polarsys.capella.core.semantic.data.behavior.AbstractEvent;

import org.polarsys.capella.core.semantic.data.capellacore.AbstractExchangeItemPkg;
import org.polarsys.capella.core.semantic.data.capellacore.CapellaElement;
import org.polarsys.capella.core.semantic.data.capellacore.Classifier;
import org.polarsys.capella.core.semantic.data.capellacore.Feature;
import org.polarsys.capella.core.semantic.data.capellacore.GeneralClass;
import org.polarsys.capella.core.semantic.data.capellacore.GeneralizableElement;
import org.polarsys.capella.core.semantic.data.capellacore.NamedElement;
import org.polarsys.capella.core.semantic.data.capellacore.Namespace;
import org.polarsys.capella.core.semantic.data.capellacore.Structure;
import org.polarsys.capella.core.semantic.data.capellacore.Type;
import org.polarsys.capella.core.semantic.data.capellacore.TypedElement;

import org.polarsys.capella.core.semantic.data.emde.Element;
import org.polarsys.capella.core.semantic.data.emde.ExtensibleElement;

import org.polarsys.capella.core.semantic.data.information.AbstractCollectionValue;
import org.polarsys.capella.core.semantic.data.information.AbstractEventOperation;
import org.polarsys.capella.core.semantic.data.information.Association;
import org.polarsys.capella.core.semantic.data.information.AssociationPkg;
import org.polarsys.capella.core.semantic.data.information.Collection;
import org.polarsys.capella.core.semantic.data.information.CollectionValue;
import org.polarsys.capella.core.semantic.data.information.CollectionValueReference;
import org.polarsys.capella.core.semantic.data.information.DataPkg;
import org.polarsys.capella.core.semantic.data.information.DomainElement;
import org.polarsys.capella.core.semantic.data.information.ExchangeItem;
import org.polarsys.capella.core.semantic.data.information.ExchangeItemElement;
import org.polarsys.capella.core.semantic.data.information.ExchangeItemInstance;
import org.polarsys.capella.core.semantic.data.information.InformationPackage;
import org.polarsys.capella.core.semantic.data.information.KeyPart;
import org.polarsys.capella.core.semantic.data.information.MultiplicityElement;
import org.polarsys.capella.core.semantic.data.information.Operation;
import org.polarsys.capella.core.semantic.data.information.Parameter;
import org.polarsys.capella.core.semantic.data.information.Partition;
import org.polarsys.capella.core.semantic.data.information.PartitionableElement;
import org.polarsys.capella.core.semantic.data.information.Port;
import org.polarsys.capella.core.semantic.data.information.Property;
import org.polarsys.capella.core.semantic.data.information.Service;
import org.polarsys.capella.core.semantic.data.information.Union;
import org.polarsys.capella.core.semantic.data.information.UnionProperty;
import org.polarsys.capella.core.semantic.data.information.Unit;

import org.polarsys.capella.core.semantic.data.information.communication.MessageReferencePkg;

import org.polarsys.capella.core.semantic.data.information.datavalue.DataValue;
import org.polarsys.capella.core.semantic.data.information.datavalue.DataValueContainer;

import org.polarsys.capella.core.semantic.data.modellingcore.AbstractExchangeItem;
import org.polarsys.capella.core.semantic.data.modellingcore.AbstractNamedElement;
import org.polarsys.capella.core.semantic.data.modellingcore.AbstractParameter;
import org.polarsys.capella.core.semantic.data.modellingcore.AbstractType;
import org.polarsys.capella.core.semantic.data.modellingcore.ModelElement;
import org.polarsys.capella.core.semantic.data.modellingcore.TraceableElement;
import org.polarsys.capella.core.semantic.data.modellingcore.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.polarsys.capella.core.semantic.data.information.InformationPackage
 * @generated
 */
public class InformationSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static InformationPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InformationSwitch() {
		if (modelPackage == null) {
			modelPackage = InformationPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case InformationPackage.ASSOCIATION_PKG: {
				AssociationPkg associationPkg = (AssociationPkg)theEObject;
				T result = caseAssociationPkg(associationPkg);
				if (result == null) result = caseStructure(associationPkg);
				if (result == null) result = caseNamespace(associationPkg);
				if (result == null) result = caseNamedElement(associationPkg);
				if (result == null) result = caseAbstractNamedElement(associationPkg);
				if (result == null) result = caseCapellaElement(associationPkg);
				if (result == null) result = caseTraceableElement(associationPkg);
				if (result == null) result = caseModelElement(associationPkg);
				if (result == null) result = caseExtensibleElement(associationPkg);
				if (result == null) result = caseElement(associationPkg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InformationPackage.ASSOCIATION: {
				Association association = (Association)theEObject;
				T result = caseAssociation(association);
				if (result == null) result = caseNamedElement(association);
				if (result == null) result = caseAbstractNamedElement(association);
				if (result == null) result = caseCapellaElement(association);
				if (result == null) result = caseTraceableElement(association);
				if (result == null) result = caseModelElement(association);
				if (result == null) result = caseExtensibleElement(association);
				if (result == null) result = caseElement(association);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InformationPackage.CLASS: {
				org.polarsys.capella.core.semantic.data.information.Class class_ = (org.polarsys.capella.core.semantic.data.information.Class)theEObject;
				T result = caseClass(class_);
				if (result == null) result = caseGeneralClass(class_);
				if (result == null) result = caseClassifier(class_);
				if (result == null) result = caseGeneralizableElement(class_);
				if (result == null) result = caseType(class_);
				if (result == null) result = caseAbstractType(class_);
				if (result == null) result = caseNamespace(class_);
				if (result == null) result = caseNamedElement(class_);
				if (result == null) result = caseAbstractNamedElement(class_);
				if (result == null) result = caseCapellaElement(class_);
				if (result == null) result = caseExtensibleElement(class_);
				if (result == null) result = caseTraceableElement(class_);
				if (result == null) result = caseModelElement(class_);
				if (result == null) result = caseElement(class_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InformationPackage.COLLECTION: {
				Collection collection = (Collection)theEObject;
				T result = caseCollection(collection);
				if (result == null) result = caseClassifier(collection);
				if (result == null) result = caseMultiplicityElement(collection);
				if (result == null) result = caseDataValueContainer(collection);
				if (result == null) result = caseGeneralizableElement(collection);
				if (result == null) result = caseStructure(collection);
				if (result == null) result = caseType(collection);
				if (result == null) result = caseAbstractType(collection);
				if (result == null) result = caseNamespace(collection);
				if (result == null) result = caseNamedElement(collection);
				if (result == null) result = caseAbstractNamedElement(collection);
				if (result == null) result = caseCapellaElement(collection);
				if (result == null) result = caseExtensibleElement(collection);
				if (result == null) result = caseTraceableElement(collection);
				if (result == null) result = caseModelElement(collection);
				if (result == null) result = caseElement(collection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InformationPackage.ABSTRACT_COLLECTION_VALUE: {
				AbstractCollectionValue abstractCollectionValue = (AbstractCollectionValue)theEObject;
				T result = caseAbstractCollectionValue(abstractCollectionValue);
				if (result == null) result = caseDataValue(abstractCollectionValue);
				if (result == null) result = caseNamedElement(abstractCollectionValue);
				if (result == null) result = caseValueSpecification(abstractCollectionValue);
				if (result == null) result = caseAbstractNamedElement(abstractCollectionValue);
				if (result == null) result = caseCapellaElement(abstractCollectionValue);
				if (result == null) result = caseTraceableElement(abstractCollectionValue);
				if (result == null) result = caseModelElement(abstractCollectionValue);
				if (result == null) result = caseExtensibleElement(abstractCollectionValue);
				if (result == null) result = caseElement(abstractCollectionValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InformationPackage.COLLECTION_VALUE: {
				CollectionValue collectionValue = (CollectionValue)theEObject;
				T result = caseCollectionValue(collectionValue);
				if (result == null) result = caseAbstractCollectionValue(collectionValue);
				if (result == null) result = caseDataValue(collectionValue);
				if (result == null) result = caseNamedElement(collectionValue);
				if (result == null) result = caseValueSpecification(collectionValue);
				if (result == null) result = caseAbstractNamedElement(collectionValue);
				if (result == null) result = caseCapellaElement(collectionValue);
				if (result == null) result = caseTraceableElement(collectionValue);
				if (result == null) result = caseModelElement(collectionValue);
				if (result == null) result = caseExtensibleElement(collectionValue);
				if (result == null) result = caseElement(collectionValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InformationPackage.COLLECTION_VALUE_REFERENCE: {
				CollectionValueReference collectionValueReference = (CollectionValueReference)theEObject;
				T result = caseCollectionValueReference(collectionValueReference);
				if (result == null) result = caseAbstractCollectionValue(collectionValueReference);
				if (result == null) result = caseDataValue(collectionValueReference);
				if (result == null) result = caseNamedElement(collectionValueReference);
				if (result == null) result = caseValueSpecification(collectionValueReference);
				if (result == null) result = caseAbstractNamedElement(collectionValueReference);
				if (result == null) result = caseCapellaElement(collectionValueReference);
				if (result == null) result = caseTraceableElement(collectionValueReference);
				if (result == null) result = caseModelElement(collectionValueReference);
				if (result == null) result = caseExtensibleElement(collectionValueReference);
				if (result == null) result = caseElement(collectionValueReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InformationPackage.DATA_PKG: {
				DataPkg dataPkg = (DataPkg)theEObject;
				T result = caseDataPkg(dataPkg);
				if (result == null) result = caseAbstractExchangeItemPkg(dataPkg);
				if (result == null) result = caseAssociationPkg(dataPkg);
				if (result == null) result = caseDataValueContainer(dataPkg);
				if (result == null) result = caseMessageReferencePkg(dataPkg);
				if (result == null) result = caseStructure(dataPkg);
				if (result == null) result = caseNamespace(dataPkg);
				if (result == null) result = caseNamedElement(dataPkg);
				if (result == null) result = caseAbstractNamedElement(dataPkg);
				if (result == null) result = caseCapellaElement(dataPkg);
				if (result == null) result = caseTraceableElement(dataPkg);
				if (result == null) result = caseModelElement(dataPkg);
				if (result == null) result = caseExtensibleElement(dataPkg);
				if (result == null) result = caseElement(dataPkg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InformationPackage.DOMAIN_ELEMENT: {
				DomainElement domainElement = (DomainElement)theEObject;
				T result = caseDomainElement(domainElement);
				if (result == null) result = caseClass(domainElement);
				if (result == null) result = caseGeneralClass(domainElement);
				if (result == null) result = caseClassifier(domainElement);
				if (result == null) result = caseGeneralizableElement(domainElement);
				if (result == null) result = caseType(domainElement);
				if (result == null) result = caseAbstractType(domainElement);
				if (result == null) result = caseNamespace(domainElement);
				if (result == null) result = caseNamedElement(domainElement);
				if (result == null) result = caseAbstractNamedElement(domainElement);
				if (result == null) result = caseCapellaElement(domainElement);
				if (result == null) result = caseExtensibleElement(domainElement);
				if (result == null) result = caseTraceableElement(domainElement);
				if (result == null) result = caseModelElement(domainElement);
				if (result == null) result = caseElement(domainElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InformationPackage.KEY_PART: {
				KeyPart keyPart = (KeyPart)theEObject;
				T result = caseKeyPart(keyPart);
				if (result == null) result = caseCapellaElement(keyPart);
				if (result == null) result = caseTraceableElement(keyPart);
				if (result == null) result = caseModelElement(keyPart);
				if (result == null) result = caseExtensibleElement(keyPart);
				if (result == null) result = caseElement(keyPart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InformationPackage.MULTIPLICITY_ELEMENT: {
				MultiplicityElement multiplicityElement = (MultiplicityElement)theEObject;
				T result = caseMultiplicityElement(multiplicityElement);
				if (result == null) result = caseCapellaElement(multiplicityElement);
				if (result == null) result = caseTraceableElement(multiplicityElement);
				if (result == null) result = caseModelElement(multiplicityElement);
				if (result == null) result = caseExtensibleElement(multiplicityElement);
				if (result == null) result = caseElement(multiplicityElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InformationPackage.OPERATION: {
				Operation operation = (Operation)theEObject;
				T result = caseOperation(operation);
				if (result == null) result = caseFeature(operation);
				if (result == null) result = caseAbstractEvent(operation);
				if (result == null) result = caseAbstractEventOperation(operation);
				if (result == null) result = caseNamedElement(operation);
				if (result == null) result = caseAbstractType(operation);
				if (result == null) result = caseAbstractNamedElement(operation);
				if (result == null) result = caseCapellaElement(operation);
				if (result == null) result = caseTraceableElement(operation);
				if (result == null) result = caseModelElement(operation);
				if (result == null) result = caseExtensibleElement(operation);
				if (result == null) result = caseElement(operation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InformationPackage.PARAMETER: {
				Parameter parameter = (Parameter)theEObject;
				T result = caseParameter(parameter);
				if (result == null) result = caseTypedElement(parameter);
				if (result == null) result = caseMultiplicityElement(parameter);
				if (result == null) result = caseAbstractParameter(parameter);
				if (result == null) result = caseNamedElement(parameter);
				if (result == null) result = caseAbstractNamedElement(parameter);
				if (result == null) result = caseCapellaElement(parameter);
				if (result == null) result = caseTraceableElement(parameter);
				if (result == null) result = caseModelElement(parameter);
				if (result == null) result = caseExtensibleElement(parameter);
				if (result == null) result = caseElement(parameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InformationPackage.PROPERTY: {
				Property property = (Property)theEObject;
				T result = caseProperty(property);
				if (result == null) result = caseFeature(property);
				if (result == null) result = caseTypedElement(property);
				if (result == null) result = caseMultiplicityElement(property);
				if (result == null) result = caseNamedElement(property);
				if (result == null) result = caseAbstractNamedElement(property);
				if (result == null) result = caseCapellaElement(property);
				if (result == null) result = caseTraceableElement(property);
				if (result == null) result = caseModelElement(property);
				if (result == null) result = caseExtensibleElement(property);
				if (result == null) result = caseElement(property);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InformationPackage.SERVICE: {
				Service service = (Service)theEObject;
				T result = caseService(service);
				if (result == null) result = caseOperation(service);
				if (result == null) result = caseFeature(service);
				if (result == null) result = caseAbstractEvent(service);
				if (result == null) result = caseAbstractEventOperation(service);
				if (result == null) result = caseNamedElement(service);
				if (result == null) result = caseAbstractType(service);
				if (result == null) result = caseAbstractNamedElement(service);
				if (result == null) result = caseCapellaElement(service);
				if (result == null) result = caseTraceableElement(service);
				if (result == null) result = caseModelElement(service);
				if (result == null) result = caseExtensibleElement(service);
				if (result == null) result = caseElement(service);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InformationPackage.UNION: {
				Union union = (Union)theEObject;
				T result = caseUnion(union);
				if (result == null) result = caseClass(union);
				if (result == null) result = caseGeneralClass(union);
				if (result == null) result = caseClassifier(union);
				if (result == null) result = caseGeneralizableElement(union);
				if (result == null) result = caseType(union);
				if (result == null) result = caseAbstractType(union);
				if (result == null) result = caseNamespace(union);
				if (result == null) result = caseNamedElement(union);
				if (result == null) result = caseAbstractNamedElement(union);
				if (result == null) result = caseCapellaElement(union);
				if (result == null) result = caseExtensibleElement(union);
				if (result == null) result = caseTraceableElement(union);
				if (result == null) result = caseModelElement(union);
				if (result == null) result = caseElement(union);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InformationPackage.UNION_PROPERTY: {
				UnionProperty unionProperty = (UnionProperty)theEObject;
				T result = caseUnionProperty(unionProperty);
				if (result == null) result = caseProperty(unionProperty);
				if (result == null) result = caseFeature(unionProperty);
				if (result == null) result = caseTypedElement(unionProperty);
				if (result == null) result = caseMultiplicityElement(unionProperty);
				if (result == null) result = caseNamedElement(unionProperty);
				if (result == null) result = caseAbstractNamedElement(unionProperty);
				if (result == null) result = caseCapellaElement(unionProperty);
				if (result == null) result = caseTraceableElement(unionProperty);
				if (result == null) result = caseModelElement(unionProperty);
				if (result == null) result = caseExtensibleElement(unionProperty);
				if (result == null) result = caseElement(unionProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InformationPackage.UNIT: {
				Unit unit = (Unit)theEObject;
				T result = caseUnit(unit);
				if (result == null) result = caseNamedElement(unit);
				if (result == null) result = caseAbstractNamedElement(unit);
				if (result == null) result = caseCapellaElement(unit);
				if (result == null) result = caseTraceableElement(unit);
				if (result == null) result = caseModelElement(unit);
				if (result == null) result = caseExtensibleElement(unit);
				if (result == null) result = caseElement(unit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InformationPackage.PARTITIONABLE_ELEMENT: {
				PartitionableElement partitionableElement = (PartitionableElement)theEObject;
				T result = casePartitionableElement(partitionableElement);
				if (result == null) result = caseClassifier(partitionableElement);
				if (result == null) result = caseGeneralizableElement(partitionableElement);
				if (result == null) result = caseType(partitionableElement);
				if (result == null) result = caseAbstractType(partitionableElement);
				if (result == null) result = caseNamespace(partitionableElement);
				if (result == null) result = caseNamedElement(partitionableElement);
				if (result == null) result = caseAbstractNamedElement(partitionableElement);
				if (result == null) result = caseCapellaElement(partitionableElement);
				if (result == null) result = caseExtensibleElement(partitionableElement);
				if (result == null) result = caseTraceableElement(partitionableElement);
				if (result == null) result = caseModelElement(partitionableElement);
				if (result == null) result = caseElement(partitionableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InformationPackage.PARTITION: {
				Partition partition = (Partition)theEObject;
				T result = casePartition(partition);
				if (result == null) result = caseProperty(partition);
				if (result == null) result = caseFeature(partition);
				if (result == null) result = caseTypedElement(partition);
				if (result == null) result = caseMultiplicityElement(partition);
				if (result == null) result = caseNamedElement(partition);
				if (result == null) result = caseAbstractNamedElement(partition);
				if (result == null) result = caseCapellaElement(partition);
				if (result == null) result = caseTraceableElement(partition);
				if (result == null) result = caseModelElement(partition);
				if (result == null) result = caseExtensibleElement(partition);
				if (result == null) result = caseElement(partition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InformationPackage.PORT: {
				Port port = (Port)theEObject;
				T result = casePort(port);
				if (result == null) result = caseNamedElement(port);
				if (result == null) result = caseAbstractNamedElement(port);
				if (result == null) result = caseCapellaElement(port);
				if (result == null) result = caseTraceableElement(port);
				if (result == null) result = caseModelElement(port);
				if (result == null) result = caseExtensibleElement(port);
				if (result == null) result = caseElement(port);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InformationPackage.EXCHANGE_ITEM: {
				ExchangeItem exchangeItem = (ExchangeItem)theEObject;
				T result = caseExchangeItem(exchangeItem);
				if (result == null) result = caseAbstractExchangeItem(exchangeItem);
				if (result == null) result = caseAbstractEvent(exchangeItem);
				if (result == null) result = caseGeneralizableElement(exchangeItem);
				if (result == null) result = caseType(exchangeItem);
				if (result == null) result = caseAbstractType(exchangeItem);
				if (result == null) result = caseNamespace(exchangeItem);
				if (result == null) result = caseNamedElement(exchangeItem);
				if (result == null) result = caseAbstractNamedElement(exchangeItem);
				if (result == null) result = caseExtensibleElement(exchangeItem);
				if (result == null) result = caseCapellaElement(exchangeItem);
				if (result == null) result = caseElement(exchangeItem);
				if (result == null) result = caseTraceableElement(exchangeItem);
				if (result == null) result = caseModelElement(exchangeItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InformationPackage.EXCHANGE_ITEM_ELEMENT: {
				ExchangeItemElement exchangeItemElement = (ExchangeItemElement)theEObject;
				T result = caseExchangeItemElement(exchangeItemElement);
				if (result == null) result = caseMultiplicityElement(exchangeItemElement);
				if (result == null) result = caseTypedElement(exchangeItemElement);
				if (result == null) result = caseNamedElement(exchangeItemElement);
				if (result == null) result = caseAbstractNamedElement(exchangeItemElement);
				if (result == null) result = caseCapellaElement(exchangeItemElement);
				if (result == null) result = caseTraceableElement(exchangeItemElement);
				if (result == null) result = caseModelElement(exchangeItemElement);
				if (result == null) result = caseExtensibleElement(exchangeItemElement);
				if (result == null) result = caseElement(exchangeItemElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InformationPackage.EXCHANGE_ITEM_INSTANCE: {
				ExchangeItemInstance exchangeItemInstance = (ExchangeItemInstance)theEObject;
				T result = caseExchangeItemInstance(exchangeItemInstance);
				if (result == null) result = caseProperty(exchangeItemInstance);
				if (result == null) result = caseFeature(exchangeItemInstance);
				if (result == null) result = caseTypedElement(exchangeItemInstance);
				if (result == null) result = caseMultiplicityElement(exchangeItemInstance);
				if (result == null) result = caseNamedElement(exchangeItemInstance);
				if (result == null) result = caseAbstractNamedElement(exchangeItemInstance);
				if (result == null) result = caseCapellaElement(exchangeItemInstance);
				if (result == null) result = caseTraceableElement(exchangeItemInstance);
				if (result == null) result = caseModelElement(exchangeItemInstance);
				if (result == null) result = caseExtensibleElement(exchangeItemInstance);
				if (result == null) result = caseElement(exchangeItemInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InformationPackage.ABSTRACT_EVENT_OPERATION: {
				AbstractEventOperation abstractEventOperation = (AbstractEventOperation)theEObject;
				T result = caseAbstractEventOperation(abstractEventOperation);
				if (result == null) result = caseNamedElement(abstractEventOperation);
				if (result == null) result = caseAbstractNamedElement(abstractEventOperation);
				if (result == null) result = caseCapellaElement(abstractEventOperation);
				if (result == null) result = caseTraceableElement(abstractEventOperation);
				if (result == null) result = caseModelElement(abstractEventOperation);
				if (result == null) result = caseExtensibleElement(abstractEventOperation);
				if (result == null) result = caseElement(abstractEventOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association Pkg</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association Pkg</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociationPkg(AssociationPkg object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociation(Association object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClass(org.polarsys.capella.core.semantic.data.information.Class object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollection(Collection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Collection Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Collection Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractCollectionValue(AbstractCollectionValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collection Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collection Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollectionValue(CollectionValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collection Value Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collection Value Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollectionValueReference(CollectionValueReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Pkg</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Pkg</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataPkg(DataPkg object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainElement(DomainElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Key Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Key Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeyPart(KeyPart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiplicity Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiplicity Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiplicityElement(MultiplicityElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperation(Operation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter(Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperty(Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseService(Service object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Union</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Union</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnion(Union object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Union Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Union Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnionProperty(UnionProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnit(Unit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Partitionable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Partitionable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePartitionableElement(PartitionableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Partition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Partition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePartition(Partition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePort(Port object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exchange Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exchange Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExchangeItem(ExchangeItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exchange Item Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exchange Item Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExchangeItemElement(ExchangeItemElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exchange Item Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exchange Item Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExchangeItemInstance(ExchangeItemInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Event Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Event Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractEventOperation(AbstractEventOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extensible Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extensible Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtensibleElement(ExtensibleElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelElement(ModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractNamedElement(AbstractNamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traceable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traceable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTraceableElement(TraceableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capella Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capella Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapellaElement(CapellaElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Namespace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Namespace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamespace(Namespace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructure(Structure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractType(AbstractType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseType(Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generalizable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generalizable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralizableElement(GeneralizableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassifier(Classifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>General Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>General Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralClass(GeneralClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Value Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Value Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataValueContainer(DataValueContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueSpecification(ValueSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataValue(DataValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Exchange Item Pkg</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Exchange Item Pkg</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractExchangeItemPkg(AbstractExchangeItemPkg object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Reference Pkg</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Reference Pkg</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageReferencePkg(MessageReferencePkg object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeature(Feature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractEvent(AbstractEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Typed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypedElement(TypedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractParameter(AbstractParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Exchange Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Exchange Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractExchangeItem(AbstractExchangeItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //InformationSwitch
