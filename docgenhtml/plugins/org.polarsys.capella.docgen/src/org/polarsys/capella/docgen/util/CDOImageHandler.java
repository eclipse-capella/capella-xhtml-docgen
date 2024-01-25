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

import java.io.File;
import java.util.List;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.business.api.query.EObjectQuery;
import org.eclipse.sirius.business.api.query.URIQuery;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.common.tools.api.resource.FileProvider;

/*
 * Image handlers for "cdo:/" uris
 * Handles encoded html characters such as %20 in filepaths & names
 * Returns the filepath of temp image given a cdo uri
 */

public class CDOImageHandler extends DefaultImageHandler {

  @Override
  public boolean isHandlerFor(String uri) {
    return uri.startsWith(URIQuery.CDO_URI_SCHEME);
  }

  @Override
  public String handleImage(ILog logger, EObject eObject, String imageSrc, IFolder parentTargetFolder,
      List<String> imageFileNames) {
    Session session = new EObjectQuery(eObject).getSession();

    String decodedImageSrc = StringUtil.decodeHtmlFilePath(imageSrc, logger);
    if (decodedImageSrc == null) {
      return null;
    }

    IPath patha = new Path(decodedImageSrc);
    String id = getID(eObject);
    String targetIconPath = getTargetIconPath(patha, id, imageFileNames);
    targetIconPath = StringUtil.unencodeURIString(targetIconPath, logger);

    // If Team is installed, Sirius FileProvider shall find CDOFileGetter and return
    // the local temp file for that image
    File imageFile = FileProvider.getDefault().getFile(new Path(imageSrc), session);
    if (imageFile != null) {
      copyImage(logger, eObject, imageFile.getAbsolutePath(), parentTargetFolder, targetIconPath);
    }

    return targetIconPath;
  }

}
