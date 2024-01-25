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

import java.text.MessageFormat;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.docgen.Activator;
import org.polarsys.capella.shared.id.handler.IdManager;
import org.polarsys.kitalpha.doc.gen.business.core.util.DocGenHtmlUtil;

public class DefaultImageHandler implements IImageHandler {

  @Override
  public boolean isHandlerFor(String uri) {
    return true;
  }

  @Override
  public String handleImage(ILog logger, EObject eObject, String imageSrc, IFolder parentTargetFolder,
      List<String> imageFileNames) {

    String id = getID(eObject);
    String targetIconPath = "";
    boolean isDataImage = imageSrc.startsWith(ImageHelper.DATA_IMAGE_PREFIX);
    if (isDataImage) {
      // Serialize image in target folder: "[dogen_output]/object_id/folder
      targetIconPath = ImageHelper.INSTANCE.serializeImageInTargetFolder(imageSrc,
          parentTargetFolder.getLocationURI().getPath() + StringUtil.IMAGES_FOLDER, id, imageFileNames, logger);
      if (targetIconPath == null) {
        // Image serialization has failed, we will keep current image
        logger.log(new Status(IStatus.WARNING, Activator.PLUGIN_ID,
            MessageFormat.format(StringUtil.WARNING_IMAGE_SERIALIZATION_FAILED, id), new Exception()));
      }
      return targetIconPath;
    }
    // Use an inline creation of HTMLDocument to get correct html content
    String decodedImageSrc = StringUtil.decodeHtmlFilePath(imageSrc, logger);
    if (decodedImageSrc == null) {
      return null;
    }

    IPath aPath = new Path(decodedImageSrc);
    targetIconPath = getTargetIconPath(aPath, id, imageFileNames);
    String iconSourcePath = "";

    if (isNetworkImage(decodedImageSrc)) {
      logger.log(new Status(IStatus.WARNING, Activator.PLUGIN_ID,
          MessageFormat.format(StringUtil.WARNING_NETWORK_IMAGE_NO_TREATMENT, decodedImageSrc, id)));
      return null;

    } else if (isNetworkDrive(decodedImageSrc)) {
      // Absolute path may be serialized with %20 string for spaces
      // We should thus decode them for the upcoming copy
      iconSourcePath = StringUtil.unencodeURIString(decodedImageSrc, logger);
      targetIconPath = StringUtil.unencodeURIString(targetIconPath, logger);

    } else if (aPath.isAbsolute()) {
      // Absolute path may be serialized with %20 string for spaces
      // We should thus decode them for the upcoming copy
      iconSourcePath = aPath.toFile().toURI().getPath();
      iconSourcePath = StringUtil.unencodeURIString(iconSourcePath, logger);
      targetIconPath = StringUtil.unencodeURIString(targetIconPath, logger);

    } else {
      // Relative path
      IPath path = new Path(decodedImageSrc);
      IFile iconFile = ResourcesPlugin.getWorkspace().getRoot().getFile(path);
      if (!iconFile.exists()) { // Try if image is located in the current folder
        IPath parentSrcFolder = new Path(eObject.eResource().getURI().segment(1));
        path = parentSrcFolder.append(decodedImageSrc);
        iconFile = ResourcesPlugin.getWorkspace().getRoot().getFile(path);
      }
      if (iconFile.exists()) {
        iconSourcePath = iconFile.getLocationURI().getPath();
      } else {
        logger.log(
            new Status(IStatus.ERROR, Activator.PLUGIN_ID, StringUtil.getResourceCopyError(eObject, path.toString())));
        return null;
      }
    }
    copyImage(logger, eObject, iconSourcePath, parentTargetFolder, targetIconPath);
    return targetIconPath;
  }

  private boolean isNetworkDrive(String imageSrc) {
    return imageSrc.startsWith("//") || imageSrc.startsWith("\\\\");
  }

  private boolean isNetworkImage(String imageSrc) {
    return imageSrc.startsWith("http") || imageSrc.startsWith("https");
  }

  protected void copyImage(ILog logger, EObject eObject, String iconSourcePath, IFolder parentTargetFolder,
      String iconName) {
    try {
      // Copy file
      ImageHelper.INSTANCE.copyProjectImageToSystemLocation(iconSourcePath,
          parentTargetFolder.getLocationURI().getPath() + StringUtil.IMAGES_FOLDER + iconName);
    } catch (Exception e) {
      logger.log(
          new Status(IStatus.ERROR, Activator.PLUGIN_ID, StringUtil.getResourceCopyError(eObject, iconSourcePath), e));
    }
  }

  protected String getTargetIconPath(IPath aPath, String id, List<String> imageFileNames) {
    String targetFolderPath = aPath.removeFileExtension().lastSegment();
    targetFolderPath = id + "/" + targetFolderPath;
    // Ensure unique file name
    targetFolderPath = ImageHelper.INSTANCE.getUniqueFileName(targetFolderPath, imageFileNames);
    targetFolderPath += "." + aPath.getFileExtension();
    return targetFolderPath;
  }

  protected String getID(EObject eObject) {
    String id = IdManager.getInstance().getId(eObject);
    id = DocGenHtmlUtil.getValidFileName(id);
    return id;
  }

}
