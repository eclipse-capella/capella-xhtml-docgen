package org.polarsys.capella.docgen.test.ju.cases;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
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

    File projectFolder = getFolderInTestModelRepository("empty");
    
    IFile capellaFileForLoadedModel = getCapellaFileForLoadedModel("empty");
    IPath fullPath = capellaFileForLoadedModel.getProject().getFullPath();
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
  }
  
  @Override
    public List<String> getRequiredTestModels() {
        List<String> res = new ArrayList<>();
        res.add("empty");
        return res;
    }


}
