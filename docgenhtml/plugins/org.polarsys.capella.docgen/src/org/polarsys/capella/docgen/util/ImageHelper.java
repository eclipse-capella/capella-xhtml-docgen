/*******************************************************************************
 * Copyright (c) 2006, 2015 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales - initial API and implementation
 ******************************************************************************/
package org.polarsys.capella.docgen.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.egf.common.helper.FileHelper;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.ImageLoader;
import org.polarsys.capella.core.ui.resources.CapellaUIResourcesPlugin;
import org.polarsys.capella.docgen.Activator;

public class ImageHelper {

	public static ImageHelper INSTANCE = new ImageHelper();
	private static final String ICON_FOLDER_NAME = "icon";
	private static final String FILE_NOT_FOUND = "Image source file doesn't exist";
	private static final NullProgressMonitor MONITOR = new NullProgressMonitor();
	private static final String PNG = "png";

	private ImageHelper() {

	}

	public void copyProjectImageToSystemLocation(String srcFile, String targetFile) throws IOException {
		File inputFile = new File(srcFile);
		File outputFile = new File(targetFile);
		if (inputFile.exists())
			copyFile(inputFile, outputFile);
		else
			org.polarsys.capella.docgen.Activator.getDefault().getLog()
					.log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, FILE_NOT_FOUND + ": \"" + inputFile.getAbsolutePath() + "\""));
	}

	private void copyFile(File sourceFile, File destFile) throws IOException {
		InputStream inputStr = null;
		OutputStream outputStr = null;
		try {
			inputStr = new FileInputStream(sourceFile);
			outputStr = new FileOutputStream(destFile);
			byte[] buf = new byte[1024];
			int bytesRead;
			while ((bytesRead = inputStr.read(buf)) > 0) {
				outputStr.write(buf, 0, bytesRead);
			}
		} finally {
			inputStr.close();
			outputStr.close();
		}
	}

	public static String getTypePng(EObject eObject, String projectName, String folderName) {
		final ImageDescriptor imageDescriptor = CapellaUIResourcesPlugin.getDefault().getPNGImage(eObject);
		Image image = null;
		if (imageDescriptor != null) {
			image = imageDescriptor.createImage(true);
		}
		String simpleFileName = CapellaUIResourcesPlugin.getDefault().getCustomizedImageName(eObject);
		final IFolder iconFolder = getIconFolder(projectName, folderName);
		IFile iconFile = iconFolder.getFile(simpleFileName + ".png");
		if (iconFile.exists() == false) {
			String withoutFileExtension = iconFile.getLocation().toString().replace(iconFile.getLocation().getFileExtension(), "");

			IFile iconFileTemp = createNewIconFile(image, withoutFileExtension);
			if (iconFileTemp != null) {
				iconFile = iconFileTemp;
			}
		}
		if (image != null)
			image.dispose();
		return iconFile.getName();
	}

	private static IFolder getIconFolder(String projectName, String folderName) {
		final IPath path = new Path(projectName).append(folderName);
		final IContainer parent = ResourcesPlugin.getWorkspace().getRoot().getFolder(path).getParent();
		final IPath iconPath = parent.getFullPath().append(ICON_FOLDER_NAME);
		final IFolder iconFolder = ResourcesPlugin.getWorkspace().getRoot().getFolder(iconPath);
		if (iconFolder == null || iconFolder.exists() == false) {
			try {
				FileHelper.createContainers(MONITOR, iconFolder);
				iconFolder.create(true, true, MONITOR);
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
		return iconFolder;

	}

	private static IFile createNewIconFile(Image iconImage, String fileName) {
		if (iconImage != null) {
			final ImageLoader loader = new ImageLoader();
			loader.data = new ImageData[] { iconImage.getImageData() };
			try {
				// if image is encoded as more than 8-bits, then we save it into
				// png format.
				fileName = fileName + PNG;
				loader.save(fileName, SWT.IMAGE_PNG);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return ResourcesPlugin.getWorkspace().getRoot().getFileForLocation(new Path(fileName));
		}
		return null;
	}

}
