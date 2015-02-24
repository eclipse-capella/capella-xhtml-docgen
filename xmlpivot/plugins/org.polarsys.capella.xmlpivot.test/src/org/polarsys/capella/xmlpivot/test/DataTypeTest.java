/*******************************************************************************
 * Copyright (c) 2006, 2015 THALES GLOBAL SERVICES.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *    
 *  Contributors:
 *     Thales - initial API and implementation
 ******************************************************************************/
package org.polarsys.capella.xmlpivot.test;

import java.util.Arrays;
import java.util.Collection;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.Test;

import org.polarsys.capella.core.data.information.datatype.DatatypePackage;
import org.polarsys.capella.core.data.information.datavalue.DatavaluePackage;
import org.polarsys.capella.common.data.modellingcore.AbstractType;
import org.polarsys.capella.common.data.modellingcore.AbstractTypedElement;

/**
 *
 */
public class DataTypeTest extends XMLPivotTest {

	@Test
	public void testLiteralBooleanValue__booleanType() throws Exception{
		testAbstractTypedElement__abstractType(DatavaluePackage.Literals.LITERAL_BOOLEAN_VALUE, DatatypePackage.Literals.BOOLEAN_TYPE);
	}

	@Test
	public void testLiteralNumericValue__numericType() throws Exception{
		testAbstractTypedElement__abstractType(DatavaluePackage.Literals.LITERAL_NUMERIC_VALUE, DatatypePackage.Literals.NUMERIC_TYPE);
	}
	
	@Test
	public void testLiteralStringValue__stringType() throws Exception{
		testAbstractTypedElement__abstractType(DatavaluePackage.Literals.LITERAL_STRING_VALUE, DatatypePackage.Literals.STRING_TYPE);
	}
	
	private void testAbstractTypedElement__abstractType(EClass abstractTypedElementClass, EClass abstractTypeClass) throws Exception{
		AbstractTypedElement abstractTypedElement = (AbstractTypedElement) EcoreUtil.create(abstractTypedElementClass);
		AbstractType abstractType = (AbstractType) EcoreUtil.create(abstractTypeClass);
		
		abstractTypedElement.setAbstractType(abstractType);		
		Collection<EObject> roundtrip = importer(exporter(Arrays.asList(abstractTypedElement, abstractType)));
		assertEquals(2, roundtrip.size());
		
		AbstractTypedElement abstractTypedElementImport = null;
		AbstractType abstractTypeImport = null;
		
		for (EObject e : roundtrip){
			if (e instanceof AbstractTypedElement){
				abstractTypedElementImport = (AbstractTypedElement) e;
			} else if (e instanceof AbstractType){
				abstractTypeImport = (AbstractType) e;
			}
		}
		assertNotNull(abstractTypedElementImport);
		assertNotNull(abstractTypeImport);
		assertTrue(abstractTypedElementImport.getAbstractType() == abstractTypeImport);
	}
	

}
