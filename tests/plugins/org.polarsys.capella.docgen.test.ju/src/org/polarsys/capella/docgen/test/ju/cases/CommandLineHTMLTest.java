package org.polarsys.capella.docgen.test.ju.cases;

import org.eclipse.equinox.app.IApplicationContext;
import org.polarsys.capella.core.commandline.core.CommandLineException;
import org.polarsys.capella.docgen.commandline.HTMLCommandLine;
import org.polarsys.capella.test.framework.api.BasicTestCase;

public abstract class CommandLineHTMLTest extends BasicTestCase {
  protected void launchApplication(IApplicationContext mockApplicationContext, HTMLCommandLine htmlCmdLine)
      throws CommandLineException {
    htmlCmdLine.parseContext(mockApplicationContext);
    htmlCmdLine.checkArgs(mockApplicationContext);
    htmlCmdLine.prepare(mockApplicationContext);
    htmlCmdLine.execute(mockApplicationContext);
  }
}
