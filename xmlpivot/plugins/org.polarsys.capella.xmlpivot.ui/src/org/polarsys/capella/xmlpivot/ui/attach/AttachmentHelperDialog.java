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
package org.polarsys.capella.xmlpivot.ui.attach;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.dnd.EditingDomainViewerDropAdapter;
import org.eclipse.emf.edit.ui.dnd.LocalTransfer;
import org.eclipse.emf.edit.ui.dnd.ViewerDragAdapter;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.polarsys.capella.common.helpers.TransactionHelper;
import org.polarsys.capella.xmlpivot.common.predicates.EMFPredicates;

import com.google.common.collect.Collections2;

/**
 *
 */
public class AttachmentHelperDialog extends Dialog {

  private final EObject fragmentHolder;
  private final Collection<EObject> context;

  private TreeViewer contextTreeViewer;
  private TreeViewer fragmentTreeViewer;

  /**
   * Create the dialog.
   * @param parentShell
   */
  public AttachmentHelperDialog(Shell parentShell, EObject fragmentHolder_p, Collection<? extends EObject> context_p) {
    super(parentShell);
    fragmentHolder = fragmentHolder_p;
    context = new ArrayList<EObject>(context_p);
  }

  /**
   * Create contents of the dialog.
   * @param parent
   */
  @Override
  protected Control createDialogArea(Composite parent) {
    Composite container = (Composite) super.createDialogArea(parent);
    container.setLayout(new FillLayout(SWT.HORIZONTAL));

    fragmentTreeViewer = new TreeViewer(container, SWT.BORDER);
    contextTreeViewer = new TreeViewer(container, SWT.BORDER);

    ComposedAdapterFactory af = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
    af.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());

    contextTreeViewer.setContentProvider(new AdapterFactoryContentProvider(af));
    fragmentTreeViewer.setContentProvider(new AdapterFactoryContentProvider(af));

    contextTreeViewer.setLabelProvider(new AdapterFactoryLabelProvider(af));
    fragmentTreeViewer.setLabelProvider(new AdapterFactoryLabelProvider(af));

    fragmentTreeViewer.setInput(fragmentHolder);
    contextTreeViewer.setInput(new MultiRootItemContentProvider(context));

    fragmentTreeViewer.addDragSupport(DND.DROP_MOVE, new Transfer[] { LocalTransfer.getInstance() }, new ViewerDragAdapter(fragmentTreeViewer));
    contextTreeViewer.addDropSupport(DND.DROP_MOVE, new Transfer[] { LocalTransfer.getInstance() },
        new EditingDomainViewerDropAdapter(TransactionHelper.getEditingDomain(fragmentHolder), contextTreeViewer));

    return container;
  }

  /**
   * Create contents of the button bar.
   * @param parent
   */
  @Override
  protected void createButtonsForButtonBar(Composite parent) {
    createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, true);
    createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, false);
  }

  /**
   * Return the initial size of the dialog.
   */
  @Override
  protected Point getInitialSize() {
    return new Point(450, 300);
  }

  static class MultiRootItemContentProvider implements IStructuredItemContentProvider {
    final Collection<? extends EObject> rootElements;

    public MultiRootItemContentProvider(final Collection<? extends EObject> elements) {
      rootElements = elements;
    }

    @Override
    public Collection<?> getElements(Object object_p) {
      return Collections2.filter(rootElements, EMFPredicates.isRootContainer());
    }
  }

}
