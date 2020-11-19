/*******************************************************************************
 * Copyright (c) 2006, 2019 THALES GLOBAL SERVICES.
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
import org.eclipse.egf.core.producer.InvocationException;
import org.eclipse.egf.ftask.producer.context.ITaskProductionContext;
import org.eclipse.egf.ftask.producer.invocation.ITaskProduction;
import org.polarsys.capella.docgen.util.CapellaFileNameService;
import org.polarsys.kitalpha.doc.gen.business.core.extension.page.PageExtensionRuntimeParameters;

public class InitPageExtensionRuntimeParametersTask implements ITaskProduction {

	@Override
	public void preExecute(ITaskProductionContext productionContext, IProgressMonitor monitor)
			throws InvocationException {

	}

	@Override
	public void doExecute(ITaskProductionContext productionContext, IProgressMonitor monitor)
			throws InvocationException {
		PageExtensionRuntimeParameters.getInstance().getParameters().put(PageExtensionRuntimeParameters.FILE_NAME_SERVICE_PARAMETER, new CapellaFileNameService());
	}

	@Override
	public void postExecute(ITaskProductionContext productionContext, IProgressMonitor monitor)
			throws InvocationException {
	}

}
