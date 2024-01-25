/*******************************************************************************
 * Copyright (c) 2024 THALES GLOBAL SERVICES.
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

import java.util.List;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.ILog;
import org.eclipse.emf.ecore.EObject;

public class ImageHandlerService {

  public static ImageHandlerService eINSTANCE = new ImageHandlerService();

  private IImageHandler cdoHandler = new CDOImageHandler();
  private IImageHandler defaultHandler = new DefaultImageHandler();

  public IImageHandler getImageHandler(String uri) {
    if (cdoHandler.isHandlerFor(uri)) {
      return cdoHandler;
    }
    return defaultHandler;
  }

  public String getTargetIconPath(ILog logger, EObject eObject, String imageSrc, IFolder parentTargetFolder,
      List<String> imageFileNames) {
    IImageHandler handler = getImageHandler(imageSrc);
    return handler.handleImage(logger, eObject, imageSrc, parentTargetFolder, imageFileNames);
  }
}
