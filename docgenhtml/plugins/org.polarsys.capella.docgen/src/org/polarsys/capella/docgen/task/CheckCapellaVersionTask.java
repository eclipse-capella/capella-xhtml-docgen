/*******************************************************************************
 * Copyright (c) 2021 THALES GLOBAL SERVICES.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales - initial API and implementation
 ******************************************************************************/
package org.polarsys.capella.docgen.task;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.egf.core.producer.InvocationException;
import org.eclipse.egf.ftask.producer.context.ITaskProductionContext;
import org.eclipse.egf.ftask.producer.invocation.ITaskProduction;
import org.eclipse.osgi.util.NLS;
import org.polarsys.capella.docgen.Messages;
import org.polarsys.capella.docgen.helper.CapellaVersionHelper;

/**
 * 
 * @author <a href="mailto:arnaud.dieumegard@obeo.fr">Arnaud Dieumegard</a>
 *
 */
public class CheckCapellaVersionTask implements ITaskProduction {
	
	@Override
	public void doExecute(ITaskProductionContext productionContext, IProgressMonitor monitor) throws InvocationException {
	    if (!CapellaVersionHelper.isSupportedCapellaVersion()) {
	        throw new OperationCanceledException(NLS.bind(Messages.capellaVersionMismatch, CapellaVersionHelper.getDocgenBundleVersionWithoutQualifier()));
	    }
	}

	@Override
	public void preExecute(ITaskProductionContext productionContext, IProgressMonitor monitor) throws InvocationException {
	}
	
	@Override
	public void postExecute(ITaskProductionContext productionContext, IProgressMonitor monitor) throws InvocationException {
	}

}
