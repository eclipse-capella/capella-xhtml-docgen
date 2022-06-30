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

import org.eclipse.equinox.app.IApplicationContext;
import org.polarsys.capella.core.commandline.core.CommandLineException;
import org.polarsys.capella.core.commandline.core.DefaultCommandLine;
import org.polarsys.capella.docgen.commandline.HTMLCommandLine;
import org.polarsys.capella.test.framework.api.BasicTestCase;

public abstract class CommandLineHTMLTest extends BasicTestCase {
  protected void launchApplication(IApplicationContext mockApplicationContext, DefaultCommandLine htmlCmdLine)
      throws CommandLineException {
    htmlCmdLine.parseContext(mockApplicationContext);
    htmlCmdLine.checkArgs(mockApplicationContext);
    htmlCmdLine.prepare(mockApplicationContext);
    htmlCmdLine.execute(mockApplicationContext);
  }
}
