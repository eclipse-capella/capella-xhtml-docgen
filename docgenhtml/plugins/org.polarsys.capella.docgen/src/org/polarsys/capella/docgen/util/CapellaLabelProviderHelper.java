/*******************************************************************************
 * Copyright (c) 2020 THALES GLOBAL SERVICES.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales - initial API and implementation
 ******************************************************************************/
package org.polarsys.capella.docgen.util;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.polarsys.capella.core.model.handler.provider.CapellaAdapterFactoryProvider;
import org.polarsys.kitalpha.doc.gen.business.core.util.LabelProviderHelper;

public class CapellaLabelProviderHelper extends LabelProviderHelper {
	
	public static Object getIItemLabelProvider(EObject eObject) {
		AdapterFactory adapterFactory = CapellaAdapterFactoryProvider.getInstance().getAdapterFactory();
		return adapterFactory.adapt(eObject, IItemLabelProvider.class);
	}

}
