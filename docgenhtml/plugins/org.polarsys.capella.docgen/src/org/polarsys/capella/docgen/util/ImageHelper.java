/*******************************************************************************
 * Copyright (c) 2006, 2021 THALES GLOBAL SERVICES.
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

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.MessageFormat;
import java.util.Arrays;
import java.util.List;

import javax.xml.bind.DatatypeConverter;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.ILog;
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
	private static final String FOLDER_HIERARCHY_CREATION_ERROR = "Cannot Create Target Folder Hierarchy";
	private static final NullProgressMonitor MONITOR = new NullProgressMonitor();
	private static final String PNG = "png";
	private static final String FILES_SUFFIX = "_files";
	public static final String DATA_IMAGE_PREFIX = "data:image/";
	public static final String DOC_GEN_GENERATED = "_gen_";
	private static final String BASE64_POSTFIX = ";base64";
	private static final String ERROR_IMAGE_DATA_FORMAT = "Error while interpreting image data format: {0}";
	private static final String ERROR_IMAGE_DATA_WRITE = "Error while writing image data to file: {0}";

	private ImageHelper() {
	}

	public void copyProjectImageToSystemLocation(String srcFile, String targetFile) throws IOException {

		File inputFile = new File(srcFile);
		File outputFile = new File(targetFile);

		createFoldersHierarchy(outputFile);

		if (inputFile.exists()) {
			copyFile(inputFile, outputFile);
			manageSpecialFiles(inputFile.getAbsolutePath(), outputFile.getAbsolutePath(), ".html", ".htm"); //$NON-NLS-1$ //$NON-NLS-2$
		} else {
			org.polarsys.capella.docgen.Activator.getDefault().getLog().log(new Status(IStatus.ERROR,
					Activator.PLUGIN_ID, FILE_NOT_FOUND + ": \"" + inputFile.getAbsolutePath() + "\""));
		}
	}

	private void manageSpecialFiles(String srcFile, String targetFile, String... extensions) throws IOException {
		List<String> extensionList = Arrays.asList(extensions);
		String srcExtension = srcFile.substring(srcFile.lastIndexOf('.'));
		if (srcExtension != null && extensionList.contains(srcExtension.toLowerCase())) {
			String companionFolderPath = srcFile.substring(0, srcFile.lastIndexOf('.'));
			File companionFolder = new File(companionFolderPath);
			if (companionFolder.exists()) {
				doCopy(targetFile, companionFolder, "");
			} else {
				// Handle html companion folder
				companionFolderPath = companionFolderPath + FILES_SUFFIX; // $NON-NLS-1$
				companionFolder = new File(companionFolderPath);
				if (companionFolder.exists()) {
					companionFolder = new File(companionFolderPath);
					doCopy(targetFile, companionFolder, FILES_SUFFIX);
				}
			}
		}
	}

	private void doCopy(String targetFile, File companionFolder, String suffix) throws IOException {
		File destFolder = new File(targetFile.substring(0, targetFile.lastIndexOf('.')) + suffix);
		doCopy(companionFolder, destFolder);
	}

	private void createFoldersHierarchy(File outputFile) {
		File parentFile = outputFile.getParentFile();
		if (!parentFile.exists() && !parentFile.mkdirs()) {
			org.polarsys.capella.docgen.Activator.getDefault().getLog()
					.log(new Status(IStatus.ERROR, Activator.PLUGIN_ID,
							FOLDER_HIERARCHY_CREATION_ERROR + ": \"" + outputFile.getAbsolutePath() + "\""));
		}
	}

	private void copyFile(File sourceFile, File destFile) throws IOException {
		try (
				InputStream inputStr = new FileInputStream(sourceFile);
				OutputStream outputStr = new FileOutputStream(destFile);
			) {
			byte[] buf = new byte[1024];
			int bytesRead;
			while ((bytesRead = inputStr.read(buf)) > 0) {
				outputStr.write(buf, 0, bytesRead);
			}
		}
	}

	/**
	 * Do copy file(s) from src to dest folder
	 * 
	 * @param src  maybe a file or directory
	 * @param dest destination folder. It is created if the folder does not exists
	 * @throws IOException
	 */
	public void doCopy(File src, File dest) throws IOException {
		if (src.isDirectory()) {
			if (!dest.exists()) {
				dest.mkdir();
			}
			String files[] = src.list();
			for (String file : files) {
				// construct the src and dest file structure
				File srcFile = new File(src, file);
				File destFile = new File(dest, file);
				// recursive copy
				doCopy(srcFile, destFile);
			}
		} else {
			copyFile(src, dest);
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
		if (!iconFile.exists()) {
			String withoutFileExtension = iconFile.getLocation().toString()
					.replace(iconFile.getLocation().getFileExtension(), "");

			IFile iconFileTemp = createNewIconFile(image, withoutFileExtension);
			if (iconFileTemp != null) {
				iconFile = iconFileTemp;
			}
			try {
				iconFolder.refreshLocal(IResource.DEPTH_ONE, MONITOR);
			} catch (CoreException e) {
				org.polarsys.capella.docgen.Activator.getDefault().getLog()
						.log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, folderName + " can not be refreshed.", e));
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
		if (!iconFolder.exists()) {
			try {
				FileHelper.createContainers(MONITOR, iconFolder);
				iconFolder.create(true, true, MONITOR);
			} catch (CoreException e) {
				org.polarsys.capella.docgen.Activator.getDefault().getLog()
						.log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, folderName
								+ " can not be created. This can lead to some gaps in the generated documentation. See the exception stack for more details",
								e));
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
				org.polarsys.capella.docgen.Activator.getDefault().getLog()
						.log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, fileName
								+ " can not be saved. This can lead to some gaps in the generated documentation. See the exception stack for more details",
								e));
			}
			return ResourcesPlugin.getWorkspace().getRoot().getFileForLocation(new Path(fileName));
		}
		return null;
	}

	public String serializeImageInTargetFolder(String imageData, String targetFolderPath, String pageObjectId,
			List<String> imageFileNames, ILog logger) {
		// Compute image file name
		String outputImageFileName = pageObjectId + "/gen/";
		String uniqueFileName = getUniqueFileName(pageObjectId, imageFileNames);
		outputImageFileName += uniqueFileName;

		// Compute image extension
		String extension = "";
		String[] imageDatas = imageData.split(",");
		switch (imageDatas[0]) {
		case DATA_IMAGE_PREFIX + "jpeg" + BASE64_POSTFIX:
		case DATA_IMAGE_PREFIX + "png" + BASE64_POSTFIX:
		case DATA_IMAGE_PREFIX + "jpg" + BASE64_POSTFIX:
		case DATA_IMAGE_PREFIX + "bmp" + BASE64_POSTFIX:
			int endIndex = imageDatas[0].length() - BASE64_POSTFIX.length();
			extension = imageDatas[0].substring(DATA_IMAGE_PREFIX.length(), endIndex);
			outputImageFileName = outputImageFileName + "." + extension;
			break;
		default:
			logger.log(new Status(IStatus.ERROR, Activator.PLUGIN_ID,
					MessageFormat.format(ERROR_IMAGE_DATA_FORMAT, imageDatas[0]), new IllegalArgumentException()));
			return null;
		}

		// Serialize image
		byte[] parseBase64Binary = DatatypeConverter.parseBase64Binary(imageDatas[1]);
		String targetFilePath = targetFolderPath + outputImageFileName;
		File imageFile = new File(targetFilePath);
		createFoldersHierarchy(imageFile);
		try (OutputStream outputStream = new BufferedOutputStream(new FileOutputStream(imageFile))) {
			outputStream.write(parseBase64Binary);
		} catch (IOException e) {
			logger.log(new Status(IStatus.ERROR, Activator.PLUGIN_ID,
					MessageFormat.format(ERROR_IMAGE_DATA_WRITE, targetFilePath), e));
			return null;
		}

		// Return output image path end value
		return outputImageFileName;
	}

	/**
	 * Build a unique image file name value of the form
	 * {@code imageFileNameWithoutExtension}+{@code DOC_GEN_GENERATED}+X. X is a
	 * decimal value.
	 * 
	 * @param imageFileName      The original file name without extension
	 * @param usedImageFileNames The file names that are already used
	 * @return A unique file name value. Adds the returned value to collection
	 *         {@code usedImageFileNames}
	 */
	public String getUniqueFileName(String imageFileName, List<String> usedImageFileNames) {
		int iter = 1;
		String uniqueFileName = imageFileName + DOC_GEN_GENERATED + (usedImageFileNames.size() + iter);
		while (usedImageFileNames.contains(uniqueFileName)) {
			iter += 1;
			uniqueFileName = imageFileName + DOC_GEN_GENERATED + (usedImageFileNames.size() + iter);
		}
		usedImageFileNames.add(uniqueFileName);
		return uniqueFileName;
	}

}
