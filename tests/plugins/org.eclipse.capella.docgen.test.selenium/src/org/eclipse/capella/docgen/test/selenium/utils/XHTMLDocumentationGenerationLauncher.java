package org.eclipse.capella.docgen.test.selenium.utils;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.ILaunchManager;

public class XHTMLDocumentationGenerationLauncher {
	
	private final static String ATTR__DATA = "-data";
	private final static String ATTR__FILE_PATH = "-filepath";
	private final static String ATTR__OUTPUT_FOLDER = "-outputfolder";
	private final static String ATTR__FORCE_OUTPUT_FOLDER_CREATION = "-forceoutputfoldercreation";
	private final static String ATTR__LOG = "-logfile";
	private final static String LAUNCH_CONFIG__APPLICATION_ID__ATTR = "-appid";
	private final static String LAUNCH_CONFIG__APPLICATION_ID__ATTR_VALUE = "org.polarsys.kitalpha.doc.gen.business.capella.commandline";
		
	private final static String LAUNCH_CONFIG_TYPE = "org.eclipse.pde.ui.RuntimeWorkbench";
	private final static String LAUNCH_CONFIG__APPLICATION__ATTR = "application";
	private final static String LAUNCH_CONFIG__APPLICATION__ATTR_VALUE = "org.polarsys.capella.core.commandline.core";
	
	private final static String LAUNCH_CONFIG__PROGRAM_ARGUMENTS__ATTR = "org.eclipse.jdt.launching.PROGRAM_ARGUMENTS";
	private final static String LAUNCH_CONFIG__PROGRAM_ARGUMENTS__ATTR_VALUE = "-os ${target.os} -ws ${target.ws} -arch ${target.arch} -nl ${target.nl} -consoleLog -nosplash";
	
	private final static String ATTR_USE_START_ON_FIRST_THREAD = "org.eclipse.jdt.launching.ATTR_USE_START_ON_FIRST_THREAD"; //true
	private final static String JRE_CONTAINER__ATTR = "org.eclipse.jdt.launching.JRE_CONTAINER";
	private final static String JRE_CONTAINER__ATTR_VALUE = "org.eclipse.jdt.launching.JRE_CONTAINER/org.eclipse.jdt.internal.debug.ui.launcher.StandardVMType/JavaSE-1.8";
	private final static String SOURCE_PATH_PROVIDER__ATTR = "org.eclipse.jdt.launching.SOURCE_PATH_PROVIDER";
	private final static String SOURCE_PATH_PROVIDER__ATTR_VALUE = "org.eclipse.pde.ui.workbenchClasspathProvider";
	private final static String PRODUCT__ATTR = "product";
	private final static String PRODUCT__ATTR_VALUE = "org.eclipse.sdk.ide";
	
	private XHTMLDocumentationGenerationLauncher() {}
	
	public static void generateDocumentation(String workspace, String projectPath, String modelName, String outputfolder, boolean force, boolean log) {
		ILaunchManager manager = DebugPlugin.getDefault().getLaunchManager();
		
		ILaunchConfigurationType type = manager.getLaunchConfigurationType(LAUNCH_CONFIG_TYPE);
		ILaunchConfigurationWorkingCopy workingCopy = null;
		try {
			workingCopy = type.newInstance(null, "Generate documentation");
		} catch (CoreException e) {
			e.printStackTrace();
		}
		if (workingCopy != null) {
						
			workingCopy.setAttribute(LAUNCH_CONFIG__APPLICATION__ATTR, LAUNCH_CONFIG__APPLICATION__ATTR_VALUE);
			workingCopy.setAttribute(LAUNCH_CONFIG__PROGRAM_ARGUMENTS__ATTR, 
				LAUNCH_CONFIG__PROGRAM_ARGUMENTS__ATTR_VALUE
				+ " " + LAUNCH_CONFIG__APPLICATION_ID__ATTR + " " + LAUNCH_CONFIG__APPLICATION_ID__ATTR_VALUE
				+ " " + ATTR__DATA + " " + (new Path(workspace)).toOSString()
				+ " " + ATTR__FILE_PATH + " " + (new Path(projectPath + modelName)).toPortableString()
				+ " " + ATTR__OUTPUT_FOLDER + " " + (new Path(projectPath + outputfolder)).toPortableString()
				+ (force ? (" " + ATTR__FORCE_OUTPUT_FOLDER_CREATION) : "")
				+ (log ? (" " + ATTR__LOG + " " + (new Path(workspace + projectPath + outputfolder)).toOSString() + "log_gendoc.html") : "")
			);
			workingCopy.setAttribute(ATTR_USE_START_ON_FIRST_THREAD, true);
			workingCopy.setAttribute(JRE_CONTAINER__ATTR, JRE_CONTAINER__ATTR_VALUE);
			workingCopy.setAttribute(SOURCE_PATH_PROVIDER__ATTR, SOURCE_PATH_PROVIDER__ATTR_VALUE);
			workingCopy.setAttribute(PRODUCT__ATTR, PRODUCT__ATTR_VALUE);

			ILaunch launch;
			try {
				launch = workingCopy.launch(ILaunchManager.RUN_MODE, new NullProgressMonitor());
				while (!launch.isTerminated()) {
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			} catch (CoreException e1) {
				e1.printStackTrace();
			}
		}
	}
}
