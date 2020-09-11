/*******************************************************************************
 * Copyright (c) 2020 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package org.polarsys.capella.docgen.util;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.polarsys.capella.docgen.Activator;

public class Logger {
	
	public static void logInfo(String message, Exception exception) {
		log(IStatus.INFO, message, exception);
	}
	
	public static void logWarning(String message, Exception exception) {
		log(IStatus.WARNING, message, exception);
	}
	
	public static void logError(String message, Exception exception) {
		log(IStatus.ERROR, message, exception);
	}
	
	private static void log(int status, String message, Exception exception) {
		IStatus newStatus = new Status(status, Activator.PLUGIN_ID, message, exception);
		Activator.getDefault().getLog().log(newStatus);
	}

}
