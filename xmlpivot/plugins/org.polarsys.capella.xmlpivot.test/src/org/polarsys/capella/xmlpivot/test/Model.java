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

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 * The @Model annotation is used in xmlpivot unit tests to specify a test input model and
 * input model elements by Id. The annotation may either be used on a test class, or
 * a test method. The annotation is consumed by a test base class setUp() method, where
 * the specified model is loaded and selected elements are stored in test fields accessible
 * by subclasses. (See XMLPivotRoundtripTest.setUp()). 
 * 
 */
@Retention(RetentionPolicy.RUNTIME) // Make this annotation accessible at runtime via reflection.
@Target({ElementType.METHOD, ElementType.TYPE})
public @interface Model {
	
	/**
	 * An uri to the model that's used as a test input
	 */
	String uri();
	
	/**
	 * A list of element Ids. The use of these Ids depend on the context in which the annotation is used.
	 */
	String[] elements() default {};
}
