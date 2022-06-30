/*******************************************************************************
 * Copyright (c) 2022 THALES GLOBAL SERVICES.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.capella.docgen.test.ju.cases;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IPath;
import org.eclipse.equinox.app.IApplicationContext;
import org.polarsys.capella.core.commandline.core.CommandLineConstants;
import org.polarsys.capella.docgen.commandline.HTMLCommandLine;

public class CommandLineTest extends CommandLineHTMLTest {
    
  @Override
  public void test() throws Exception {

    IFile capellaFileForLoadedModel = getCapellaFileForLoadedModel("empty");
    IPath fullPath = capellaFileForLoadedModel.getProject().getParent().getLocation();
    IProject emptyProject = capellaFileForLoadedModel.getProject();
    
    // Simulated migration command line with a zip
    String[] validationCommandLineArguments = { CommandLineConstants.ID, "org.polarsys.kitalpha.doc.gen.business.capella.commandline",
        CommandLineConstants.DATA, fullPath.toOSString(),
        CommandLineConstants.INPUT, "/empty/empty.aird",
        CommandLineConstants.OUTPUTFOLDER, "/empty/HTML"};
    
    assertFalse("", emptyProject.getFolder("HTML").exists());
    
    IApplicationContext mockApplicationContext = new MockApplicationContext(validationCommandLineArguments);

    // Simulate launching from command line
    HTMLCommandLine htmlCommandLine = new HTMLCommandLine();
    launchApplication(mockApplicationContext, htmlCommandLine);
    
    assertTrue("", emptyProject.getFolder("HTML").exists());
    assertTrue("", emptyProject.getFolder("HTML").getFolder("output").exists());
  }
  
  @Override
    public List<String> getRequiredTestModels() {
        List<String> res = new ArrayList<>();
        res.add("empty");
        return res;
    }


}
