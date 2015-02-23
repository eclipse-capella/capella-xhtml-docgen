/*******************************************************************************
 * Copyright (c) 2006, 2015 THALES GLOBAL SERVICES.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *    
 *  Contributors:
 *     Thales - initial API and implementation
 ******************************************************************************/
package org.polarsys.capella.xmlpivot.ui;

import java.io.File;
import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbench;
import org.polarsys.capella.core.platform.sirius.ui.project.NewProjectWizard;
import org.polarsys.capella.core.platform.sirius.ui.project.operations.SessionCreationHelper;

public class NewCapellaProjectWizard extends NewProjectWizard {

  private ImportSpecPage page;

  protected IStructuredSelection selection;

  /**
   * @see org.eclipse.jface.wizard.Wizard#canFinish()
   */
  @Override
  public boolean canFinish() {
    return (getContainer().getCurrentPage() != page) && super.canFinish();
  }

  @Override
  public void addPages() {
    page = new ImportSpecPage();
    addPage(page);
    super.addPages();
  }

  @Override
  public void init(IWorkbench workbench_p, IStructuredSelection currentSelection_p) {
    selection = currentSelection_p;
    super.init(workbench_p, currentSelection_p);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  protected SessionCreationHelper createSessionCreationHelper() {
    return new PivotSessionCreationHelper(getShell(), _modelPage.isEpbsSelected(), _modelPage.isOpaSelected(), getProjectApproach(), page.getURI());
  }

  private class ImportSpecPage extends WizardPage {

    private URI uri;

    /**
     * @param pageName_p
     */
    protected ImportSpecPage() {
      super("Select XML Pivot Import Source"); //$NON-NLS-1$
      setTitle("Capella Project"); //$NON-NLS-1$
      setMessage("Select an existing XML Pivot file"); //$NON-NLS-1$
      setPageComplete(false);
    }

    public URI getURI() {
      return uri;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void createControl(Composite parent_p) {

      Composite composite = new Composite(parent_p, SWT.NONE);
      setControl(composite);

      composite.setLayout(new GridLayout(3, false));

      Label label = new Label(composite, SWT.NONE);
      label.setText("Location:"); //$NON-NLS-1$

      final Text text = new Text(composite, SWT.SINGLE | SWT.BORDER);
      text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));

      Button button = new Button(composite, SWT.PUSH);
      button.setText("B&rowse..."); //$NON-NLS-1$
      button.addSelectionListener(new SelectionListener() {

        @Override
        public void widgetSelected(SelectionEvent e_p) {

          FileDialog dialog = new FileDialog(getShell(), SWT.OPEN);
          String[] filterNames = new String[] { "XML Files", "All Files (*)" }; //$NON-NLS-1$ //$NON-NLS-2$
          String[] filterExtensions = new String[] { "*.xml", "*" }; //$NON-NLS-1$ //$NON-NLS-2$
          String filterPath = "/"; //$NON-NLS-1$
          String platform = SWT.getPlatform();
          if (platform.equals("win32") || platform.equals("wpf")) { //$NON-NLS-1$
            filterNames = new String[] { "XML Pivot Files", "All Files (*)" }; //$NON-NLS-1$ //$NON-NLS-2$
            filterExtensions = new String[] { "*.xml", "*.*" }; //$NON-NLS-1$ //$NON-NLS-2$
            filterPath = "c:\\"; //$NON-NLS-1$
          }
          dialog.setFilterNames(filterNames);
          dialog.setFilterExtensions(filterExtensions);
          dialog.setFilterPath(filterPath);
          String file = dialog.open();
          if (file != null) {
            text.setText(file);
          }
        }

        @Override
        public void widgetDefaultSelected(SelectionEvent e_p) {
        }

      });

      text.addModifyListener(new ModifyListener() {

        @Override
        public void modifyText(ModifyEvent arg0_p) {
          setPageComplete(false);
          if (!((Text) arg0_p.widget).getText().matches("\\s*")) { //$NON-NLS-1$
            try {
              URI fileURI = URI.createFileURI(((Text) arg0_p.widget).getText());
              if (new File(fileURI.toFileString()).exists()) {
                try {
                  new ResourceSetImpl().getURIConverter().createInputStream(fileURI);
                  uri = fileURI;
                  setErrorMessage(null);
                  setPageComplete(true);
                } catch (IOException e) {
                  setErrorMessage(e.getMessage());
                }
              } else {
                setErrorMessage("File does not exist"); //$NON-NLS-1$
              }
            } catch (IllegalArgumentException e) {
              setErrorMessage("Please enter a valid file path"); //$NON-NLS-1$
            }
          } else {
            setErrorMessage(null);
          }
        }
      });

      // FIXME verify if useless
      //      final Button dynamicButton = new Button(composite, SWT.CHECK);
      //      Label dynamicImport = new Label(composite, SWT.NONE);
      //      dynamicImport.setText("Dynamic Import");
      //      dynamicButton.addSelectionListener(new SelectionAdapter(){
      //        @Override
      //        public void widgetSelected(SelectionEvent e_p) {
      //          dynamic = dynamicButton.getSelection();
      //        }
      //      });

      if ((selection != null) && (selection.getFirstElement() instanceof IFile)) {
        IFile file = (IFile) selection.getFirstElement();
        if ("xml".equals(file.getFileExtension())) { //$NON-NLS-1$
          text.setText(file.getLocation().toString());
        }
      }
    }

  }
}
