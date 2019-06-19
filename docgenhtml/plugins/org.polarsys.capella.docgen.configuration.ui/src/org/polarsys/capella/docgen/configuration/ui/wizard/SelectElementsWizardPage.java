/*******************************************************************************
 * Copyright (c) 2017, 2019 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package org.polarsys.capella.docgen.configuration.ui.wizard;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.IDialogPage;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.CheckboxTreeViewer;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.common.tools.api.util.ReflectionHelper;
import org.eclipse.sirius.ext.base.Option;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.DRepresentationDescriptor;
import org.eclipse.sirius.viewpoint.DRepresentationElement;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.swt.widgets.Widget;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.internal.misc.StringMatcher;
import org.eclipse.ui.navigator.CommonNavigator;
import org.eclipse.ui.navigator.CommonViewer;
import org.polarsys.capella.common.ui.toolkit.browser.category.ICategory;
import org.polarsys.capella.common.ui.toolkit.browser.content.provider.wrapper.BrowserElementWrapper;
import org.polarsys.capella.common.ui.toolkit.browser.content.provider.wrapper.CategoryWrapper;
import org.polarsys.capella.common.ui.toolkit.browser.content.provider.wrapper.EObjectWrapper;
import org.polarsys.capella.common.ui.toolkit.widgets.filter.StringMatcherFactory;
import org.polarsys.capella.core.model.handler.command.CapellaResourceHelper;
import org.polarsys.capella.core.platform.sirius.ui.navigator.preferences.ICapellaNavigatorPreferences;
import org.polarsys.capella.core.sirius.ui.helper.SessionHelper;
import org.polarsys.capella.core.ui.toolkit.viewers.CapellaElementLabelProvider;
import org.polarsys.capella.docgen.configuration.ui.Activator;
import org.polarsys.capella.docgen.configuration.ui.Messages;
import org.polarsys.capella.docgen.configuration.ui.actions.IImageKeys;
import org.polarsys.capella.docgen.configuration.ui.utils.ConfigurationUtils;
import org.polarsys.capella.docgen.configuration.ui.viewer.CapellaFilteredTree;
import org.polarsys.capella.docgen.configuration.ui.viewer.CapellaNavigatorPatternFilter;
import org.polarsys.capella.docgen.configuration.ui.viewer.GenerationContainerCheckedTreeViewer;
import org.polarsys.capella.docgen.configuration.ui.viewer.providers.DetailsContentProvider;
import org.polarsys.capella.docgen.configuration.ui.viewer.providers.DetailsLabelProvider;
import org.polarsys.capella.docgen.configuration.ui.viewer.providers.SessionContentProvider;

/**
 * Wizard page to select capella element for XHTML generation.
 */

@SuppressWarnings("restriction")
public class SelectElementsWizardPage extends WizardPage {

	/**
	 * {@link CapellaElementLabelProvider} that implements
	 * {@link IColorProvider} such that elements for which no HTML documentation
	 * is generated have their label in grey.
	 */
	private final static class CapellaElementLabelProviderWithColors extends CapellaElementLabelProvider
			implements IColorProvider {

		@Override
		public Color getBackground(Object object) {
			return super.getBackground(object);
		}

		@Override
		public Color getForeground(Object object) {
			if (!ConfigurationUtils.getInstance().canGenerateHtmlDocumentationFor(object)) {
				// Since no HTML documentation can be generated for this
				// element, its label is greyed out.
				return ConfigurationUtils.COLOR_ELEMENT_WITH_NO_HTML_DOCUMENTATION;
			}
			return super.getForeground(object);
		}
	}

	/**
	 * Session.
	 */
	private Session session;

	/**
	 * Widgets.
	 */
	private Text fileText;
	private CapellaNavigatorPatternFilter patternFilter;
	private GenerationContainerCheckedTreeViewer leftTreeViewer;
	private GenerationContainerCheckedTreeViewer rightTreeViewer;
	private Button buttonLoad;
	private Button buttonSave;

	/**
	 * Constructor for SelectElementsWizardPage.
	 * 
	 * @param pageName
	 */
	public SelectElementsWizardPage(ISelection selection) {
		super("selectElementWizardPage"); //$NON-NLS-1$
		setTitle(Messages.SelectElementsWizardPage_0);
		setDescription(Messages.SelectElementsWizardPage_1);
		setMessage(Messages.SelectElementsWizardPage_2, IMessageProvider.INFORMATION);
		initSession(selection);
	}

	/**
	 * Init session from selected aird file.
	 * 
	 * @param selection
	 *            ISelection
	 */
	protected void initSession(ISelection selection) {
		if (selection != null && selection.isEmpty() == false && selection instanceof IStructuredSelection) {
			IStructuredSelection ssel = (IStructuredSelection) selection;
			Object obj = ssel.getFirstElement();

			if (obj instanceof EObject) {
				session = SessionManager.INSTANCE.getSession((EObject) obj);
			} else if (obj instanceof IFile && CapellaResourceHelper.isAirdResource((IFile) obj, false)) {
				session = SessionHelper.getSession(((IFile) obj));
			}
		}

	}

	/**
	 * @see IDialogPage#createControl(Composite)
	 */
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NONE);

		setControl(container);
		container.setLayout(new GridLayout(1, false));

		// create groups
		createSelectElementsGroup(container);
		createConfigurationGroup(container);

		// initialise viewers
		initialize();

		// update wizard status
		dialogChanged();
		setControl(container);
	}

	/**
	 * Create select element group
	 * 
	 * @param container
	 *            Composite
	 */
	protected void createSelectElementsGroup(Composite container) {
		Group grpSelectElements = new Group(container, SWT.NONE);
		grpSelectElements.setText(Messages.SelectElementsWizardPage_3);
		grpSelectElements.setLayout(new GridLayout(2, false));
		grpSelectElements.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

		createSelectElementsViewers(grpSelectElements);
	}

	/**
	 * Create configuration group.
	 * 
	 * @param container
	 *            Composite
	 */
	protected void createConfigurationGroup(Composite container) {
		Group grpConfiguration = new Group(container, SWT.NONE);
		grpConfiguration.setLayout(new GridLayout(3, false));
		grpConfiguration.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false, 1, 1));
		grpConfiguration.setText(Messages.SelectElementsWizardPage_4);

		fileText = new Text(grpConfiguration, SWT.BORDER);
		fileText.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));

		buttonLoad = new Button(grpConfiguration, SWT.NONE);
		buttonLoad.setLayoutData(new GridData(SWT.CENTER, SWT.FILL, false, false, 1, 1));
		// _btnLoad.setText(Messages.SelectElementsWizardPage_5);
		buttonLoad.setImage(Activator.getImageDescriptor(IImageKeys.IMG_LOAD_CONFIGURATION).createImage());

		buttonLoad.addSelectionListener(new SelectionListener() {

			/**
			 * (non-Javadoc)
			 * 
			 * @see org.eclipse.swt.events.SelectionListener#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 */
			@Override
			public void widgetSelected(SelectionEvent e) {
				FileDialog fileDialog = new FileDialog(getShell());
				fileDialog.setFilterExtensions(new String[] { Messages.SelectElementsWizardPage_6 });
				fileDialog.setOverwrite(true);
				fileDialog.setText(Messages.SelectElementsWizardPage_7);
				final String selectedFile = fileDialog.open();
				if (selectedFile != null) {
					fileText.setText(selectedFile);
					// load resource
					loadConfigurationFile(selectedFile);
					// update dialog status
					dialogChanged();
				}
			}

			/**
			 * (non-Javadoc)
			 * 
			 * @see org.eclipse.swt.events.SelectionListener#widgetDefaultSelected(org.eclipse.swt.events.SelectionEvent)
			 */
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});

		buttonSave = new Button(grpConfiguration, SWT.NONE);
		buttonSave.setLayoutData(new GridData(SWT.CENTER, SWT.FILL, false, false, 1, 1));
		// _btnSave.setText(Messages.SelectElementsWizardPage_8);
		buttonSave.setImage(Activator.getImageDescriptor(IImageKeys.IMG_SAVE_CONFIGURATION).createImage());

		buttonSave.addSelectionListener(new SelectionListener() {

			/**
			 * (non-Javadoc)
			 * 
			 * @see org.eclipse.swt.events.SelectionListener#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 */
			@Override
			public void widgetSelected(SelectionEvent e) {
				FileDialog fileDialog = new FileDialog(getShell(), SWT.SAVE);
				fileDialog.setFilterExtensions(new String[] { Messages.SelectElementsWizardPage_6 });
				if (fileText.getText() != null && fileText.getText() != "") { //$NON-NLS-1$
					fileDialog.setFileName(fileText.getText());
				} else {
					fileDialog.setFileName(Messages.SelectElementsWizardPage_10);
				}
				fileDialog.setOverwrite(true);
				fileDialog.setText(Messages.SelectElementsWizardPage_11);
				String selectedDirectory = fileDialog.open();
				if (selectedDirectory != null) {
					if (!selectedDirectory.endsWith(Messages.SelectElementsWizardPage_16)) {
						selectedDirectory += Messages.SelectElementsWizardPage_16;
					}
					fileText.setText(selectedDirectory);
					// save resource
					saveConfigurationFile(selectedDirectory);
				}
			}

			/**
			 * (non-Javadoc)
			 * 
			 * @see org.eclipse.swt.events.SelectionListener#widgetDefaultSelected(org.eclipse.swt.events.SelectionEvent)
			 */
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});
	}

	private void checkRightOnLeftSelection() {
		for (Object checkedElement : leftTreeViewer.getCheckedElements()) {
			if (checkedElement instanceof DRepresentationDescriptor) {
				checkedElement = ((DRepresentationDescriptor) checkedElement).getRepresentation();
			}
			Widget[] findItems = rightTreeViewer.testFindItems(checkedElement);
			// if (findItems.length > 0 && findItems[0] instanceof TreeItem) {
			// _leftTreeViewer.setChecked(checkedElement, true);
			// }
			for (Widget widget : findItems) {
				if (widget instanceof TreeItem) {
					if (widget.getData() instanceof DRepresentationElement) {
						((TreeItem) widget).setChecked(true);
						// _rightTreeViewer.doCheckStateChanged(((TreeItem)
						// widget));
					} else if (((TreeItem) widget).getParentItem() != null
							&& !(((TreeItem) widget).getParentItem().getData() instanceof EObjectWrapper)) {
						((TreeItem) widget).setChecked(true);
						rightTreeViewer.doCheckStateChanged(((TreeItem) widget));
					} else if (((TreeItem) widget).getParentItem() != null
							&& (((TreeItem) widget).getParentItem().getData() instanceof EObjectWrapper)) {
						// if children are all checked
						if (allChidrenCheckedinLeftViewer(((TreeItem) widget).getParentItem())) {
							((TreeItem) widget).getParentItem().setChecked(true);
							rightTreeViewer.doCheckStateChanged(((TreeItem) widget).getParentItem());
						}
					}
				}
			}
		}
	}

	private boolean allChidrenCheckedinLeftViewer(TreeItem item) {
		for (Widget child : ((TreeItem) item).getParentItem().getItems()) {
			if (!leftTreeViewer.getChecked(child.getData())) {
				return false;
			}
		}
		return true;
	}

	private void createSelectElementsViewers(Group grpSelectElements) {
		leftTreeViewer = (GenerationContainerCheckedTreeViewer) createFilteredCheckBoxTreeViewer(grpSelectElements);

		// Apply the exact same filters as those used in the Capella Project
		// Explorer view.
		IWorkbenchWindow workbenchWindow = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		if (workbenchWindow != null) {
			IWorkbenchPage activePage = workbenchWindow.getActivePage();
			if (activePage != null) {
				IViewPart viewPart = activePage.findView("capella.project.explorer");
				if (viewPart instanceof CommonNavigator) {
					CommonViewer viewer = ((CommonNavigator) viewPart).getCommonViewer();
					if (viewer != null) {
						ViewerFilter[] filters = viewer.getFilters();
						leftTreeViewer.setFilters(filters);
					}
				}

			}
		}

		leftTreeViewer.addSelectionChangedListener(new ISelectionChangedListener() {

			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				if (!event.getSelection().isEmpty() && !((TreeSelection) event.getSelection()).getFirstElement()
						.equals(rightTreeViewer.getInput())) {
					// have to call setInput 2 times because checked and grayed
					// element are calculated before removing items...
					rightTreeViewer.setInput(leftTreeViewer.getInput());
					rightTreeViewer.setAllChecked(false);
					rightTreeViewer.setInput(((IStructuredSelection) event.getSelection()).getFirstElement());
					checkRightOnLeftSelection();
				}

			}

		});
		leftTreeViewer.addCheckStateListener(new ICheckStateListener() {

			@Override
			public void checkStateChanged(CheckStateChangedEvent event) {
				Object element = event.getElement();
				// have to call setInput 2 times because checked and grayed
				// element are calculated before removing items...
				rightTreeViewer.setInput(leftTreeViewer.getInput());
				rightTreeViewer.setAllChecked(false);
				rightTreeViewer.setInput(element);

				// check already checked elements
				for (Object checkedObject : leftTreeViewer.getCheckedElements()) {
					checkElementLeftToRight(checkedObject, true);
				}

				// check current element and children
				checkChildrenElementLeftToRight(element, event.getChecked());
				// check parent
				checkParentElementLeftToRight(element, event.getChecked());
				// update wizard status
				dialogChanged();
			}

		});
		rightTreeViewer = (GenerationContainerCheckedTreeViewer) createRightFilteredCheckBoxTreeViewer(
				grpSelectElements);
		rightTreeViewer.addCheckStateListener(new ICheckStateListener() {

			@Override
			public void checkStateChanged(CheckStateChangedEvent event) {
				Object element = event.getElement();
				// check click on referenced/referencing element
				if (element instanceof EObjectWrapper) {
					TreeItem lastClickedItem = null;
					Optional<Object> itemOption = ReflectionHelper.getFieldValueWithoutException(rightTreeViewer,
							"lastClickedItem"); //$NON-NLS-1$
					if (itemOption.isPresent()) {
						lastClickedItem = (TreeItem) itemOption.get();
						while (lastClickedItem.getParentItem() != null
								&& lastClickedItem.getParentItem().getData() instanceof EObjectWrapper) {
							lastClickedItem = lastClickedItem.getParentItem();
							element = lastClickedItem.getData();
						}
					}
				}

				// check current element and children
				checkChildrenElementRightToLeft(element, event.getChecked());
				// check parent
				checkParentElementRightToLeft(element, event.getChecked());

				// update wizard status
				dialogChanged();
			}

		});
	}

	/**
	 * Check parent element from right to left viewer
	 * 
	 * @param element
	 * @param checked
	 */
	protected void checkParentElementRightToLeft(Object element, boolean checked) {
		if (element instanceof DRepresentationDescriptor) {
			// only DRepresentation are saved in tree viewer map
			element = ((DRepresentationDescriptor) element).getRepresentation();
		}
		Widget[] findItems = rightTreeViewer.testFindItems(element);
		for (Widget findItem : findItems) {
			if (findItem instanceof TreeItem) {
				if (checked) {
					while (((TreeItem) findItem).getParentItem() != null && (((TreeItem) findItem).getParentItem()
							.getData() instanceof EObjectWrapper
							|| ((TreeItem) findItem).getParentItem().getData() instanceof DRepresentationElement)) {
						checkElementRightToLeft(((TreeItem) findItem).getParentItem().getData(), checked);
						findItem = ((TreeItem) findItem).getParentItem();
					}
				} else {
					while (((TreeItem) findItem).getParentItem() != null
							&& ((TreeItem) findItem).getParentItem().getData() instanceof DRepresentationElement
							&& !((TreeItem) findItem).getParentItem().getChecked()) {
						leftTreeViewer.setChecked(
								((DRepresentationElement) ((TreeItem) findItem).getParentItem().getData()).getTarget(),
								checked);
						findItem = ((TreeItem) findItem).getParentItem();
					}
					while (((TreeItem) findItem).getParentItem() != null
							&& ((TreeItem) findItem).getParentItem().getChecked()
							&& (((TreeItem) findItem).getParentItem().getData() instanceof EObjectWrapper)) {
						checkElementRightToLeft(((TreeItem) findItem).getParentItem().getData(), checked);
						findItem = ((TreeItem) findItem).getParentItem();
					}
				}
			}
		}
	}

	/**
	 * Check children element from right to left viewer.
	 * 
	 * @param element
	 * @param checked
	 */
	protected void checkChildrenElementRightToLeft(Object element, boolean checked) {
		Widget[] findItems = checkElementRightToLeft(element, checked);

		// check children
		for (Widget findItem : findItems) {
			if (!(findItem.getData() instanceof EObjectWrapper)) {
				TreeItem[] children = ((TreeItem) findItem).getItems();
				if (children.length > 0 && children[0].getData() == null) {
					rightTreeViewer.createChildren(findItem);
				}
				if (findItem instanceof TreeItem) {
					for (TreeItem child : ((TreeItem) findItem).getItems()) {
						if (child.getData() != null) {
							if (findItem instanceof TreeItem && !((TreeItem) findItem).getChecked()) {
								rightTreeViewer.setChecked(((TreeItem) findItem).getData(), checked);
							}
							checkElementRightToLeft(child.getData(), checked);
							checkChildrenElementRightToLeft(child.getData(), checked);
						}
					}
				}
			}

		}
	}

	/**
	 * Check element from right to left viewer.
	 * 
	 * @param element
	 * @param checked
	 * @return Widget[]
	 */
	protected Widget[] checkElementRightToLeft(Object element, boolean checked) {
		// check all findItems in rightTreeViewer
		Widget[] findItems = rightTreeViewer.testFindItems(element);
		for (Widget widget : findItems) {
			if (widget instanceof TreeItem) {
				((TreeItem) widget).setChecked(checked);
				if (!(checked && element instanceof DRepresentationElement)) {
					rightTreeViewer.doCheckStateChanged(((TreeItem) widget));
				}
			}
		}

		// check in leftTreeviwer
		if (element instanceof EObjectWrapper) {
			element = ((EObjectWrapper) element).getElement();
		}
		if (element instanceof DRepresentationElement) {
			element = ((DRepresentationElement) element).getTarget();
		}
		if (!(element instanceof BrowserElementWrapper)) {
			leftTreeViewer.setChecked(element, checked);
		}
		return findItems;
	}

	/**
	 * Create right tree viewer with capella filter and semantic browser view
	 * content provider.
	 * 
	 * @param grpSelectElements
	 *            Group
	 * @return CheckboxTreeViewer
	 */
	protected CheckboxTreeViewer createRightFilteredCheckBoxTreeViewer(Group grpSelectElements) {

		patternFilter = new CapellaNavigatorPatternFilter();
		patternFilter.setStringMatcherFactory(new StringMatcherFactory() {
			@Override
			public StringMatcher createStringMatcher(String pattern) {
				IPreferenceStore store = Activator.getDefault().getPreferenceStore();
				return new StringMatcher(pattern, store.getBoolean(ICapellaNavigatorPreferences.PREFERENCE_IGNORE_CASE),
						false);
			}
		});
		CapellaFilteredTree _filteredTree = new CapellaFilteredTree(grpSelectElements,
				SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL, patternFilter);

		_filteredTree.getViewer().setLabelProvider(new DetailsLabelProvider());
		_filteredTree.getViewer().setContentProvider(new DetailsContentProvider(session));
		_filteredTree.getViewer().setSorter(new ViewerSorter() {
			/**
			 * Overridden to force All Related Diagrams and All Related Tables
			 * to be located at the end of the tree. {@inheritDoc}
			 */
			@Override
			public int compare(Viewer viewer, Object e1, Object e2) {
				if ((e1 instanceof CategoryWrapper) && isRepresentationCategory((CategoryWrapper) e1)) {
					return 1;
				}
				if ((e2 instanceof CategoryWrapper) && isRepresentationCategory((CategoryWrapper) e2)) {
					return -1;
				}
				return super.compare(viewer, e1, e2);
			}

			/**
			 * Is given category used to displayed diagrams or tables ?
			 * 
			 * @param categoryWrapper
			 * @return
			 */
			private boolean isRepresentationCategory(CategoryWrapper categoryWrapper) {
				ICategory category = (ICategory) (categoryWrapper).getElement();
				String categoryName = category.getName();
				return categoryName.equals(DetailsContentProvider.ALL_RELATED_DIAGRAMS)
						|| categoryName.equals(DetailsContentProvider.ALL_RELATED_TABLES);
			}
		});
		_filteredTree.getViewer().setAutoExpandLevel(4);
		return (CheckboxTreeViewer) _filteredTree.getViewer();
	}

	/**
	 * Create left tree viewer with capella filter and content provider.
	 * 
	 * @param grpSelectElements
	 *            Group
	 * @return CheckboxTreeViewer
	 */
	protected CheckboxTreeViewer createFilteredCheckBoxTreeViewer(Group grpSelectElements) {

		patternFilter = new CapellaNavigatorPatternFilter();
		patternFilter.setStringMatcherFactory(new StringMatcherFactory() {
			@Override
			public StringMatcher createStringMatcher(String pattern) {
				IPreferenceStore store = Activator.getDefault().getPreferenceStore();
				return new StringMatcher(pattern, store.getBoolean(ICapellaNavigatorPreferences.PREFERENCE_IGNORE_CASE),
						false);
			}
		});
		CapellaFilteredTree filteredTree = new CapellaFilteredTree(grpSelectElements,
				SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL, patternFilter);
		filteredTree.getViewer().setLabelProvider(new CapellaElementLabelProviderWithColors());
		filteredTree.getViewer().setContentProvider(new SessionContentProvider(session));
		filteredTree.getViewer().setAutoExpandLevel(2);
		return (CheckboxTreeViewer) filteredTree.getViewer();
	}

	/**
	 * Initialize viewers.
	 */
	protected void initialize() {
		if (session != null) {
			leftTreeViewer.setInput(session);
			rightTreeViewer.setInput(session);
			leftTreeViewer.setSelection(new StructuredSelection(leftTreeViewer.getTree().getTopItem()));
		}
	}

	/**
	 * Return all selected elements.
	 * 
	 * @return all selected elements.
	 */
	@SuppressWarnings("unchecked")
	public Collection<EObject> getSelectedElements() {
		Collection<EObject> result = new HashSet<EObject>();
		Collection<? extends EObject> asList = (Collection<? extends EObject>) Arrays
				.asList(leftTreeViewer.getCheckedElements());
		result.addAll(asList);
		// result.removeAll(Arrays.asList(_leftTreeViewer.getGrayedElements()));
		return result;
	}

	/**
	 * Ensures one element is checked.
	 */
	protected void dialogChanged() {
		if (leftTreeViewer.getCheckedElements().length > 0) {
			updateStatus(null);
		} else {
			if (ConfigurationUtils.getInstance().getMessage() != "" //$NON-NLS-1$
					&& ConfigurationUtils.getInstance().getMessage() != null) {
				updateStatus(
						Messages.SelectElementsWizardPage_12 + " " + ConfigurationUtils.getInstance().getMessage()); //$NON-NLS-1$
			} else {
				updateStatus(Messages.SelectElementsWizardPage_12);
			}
		}
	}

	/**
	 * Update wizard page status message
	 * 
	 * @param message
	 *            String
	 */
	protected void updateStatus(String message) {
		setErrorMessage(message);

		displayInformationMessageForGreyedElements();

		setPageComplete(message == null);
	}

	/**
	 * Looks up all the selected elements, and if there are some for which no
	 * HTML documentation will be generated (their label is greyed in the
	 * viewers), then we display an informational message to the user that no
	 * documentation will be generated for these elements.
	 */
	private void displayInformationMessageForGreyedElements() {
		List<Object> allCheckedElements = new ArrayList<Object>();
		allCheckedElements.addAll(Arrays.asList(this.leftTreeViewer.getCheckedElements()));
		allCheckedElements.addAll(Arrays.asList(this.rightTreeViewer.getCheckedElements()));
		List<Object> greyedCheckedElements = new ArrayList<Object>();
		for (Object checkedElement : allCheckedElements) {
			if (!ConfigurationUtils.getInstance().canGenerateHtmlDocumentationFor(checkedElement)) {
				greyedCheckedElements.add(checkedElement);
			}
		}
		if (!greyedCheckedElements.isEmpty()) {
			setMessage(Messages.SelectElementsWizardPage_17, INFORMATION);
		}
	}

	/**
	 * Check parent element left to right viewer.
	 * 
	 * @param element
	 * @param checked
	 */
	protected void checkParentElementLeftToRight(Object element, boolean checked) {
		Widget findItem = leftTreeViewer.testFindItem(element);
		if (findItem instanceof TreeItem) {
			if (checked) {
				while (((TreeItem) findItem).getParentItem() != null
						&& ((TreeItem) findItem).getParentItem().getData() != null) {
					checkElementLeftToRight(((TreeItem) findItem).getParentItem().getData(), checked);
					findItem = ((TreeItem) findItem).getParentItem();
				}
			} else {
				while (((TreeItem) findItem).getParentItem() != null
						&& ((TreeItem) findItem).getParentItem().getChecked()
						&& ((TreeItem) findItem).getParentItem().getData() != null) {
					checkElementLeftToRight(((TreeItem) findItem).getParentItem().getData(), checked);
					findItem = ((TreeItem) findItem).getParentItem();
				}
			}
		}
	}

	/**
	 * Check children from left to right viewer.
	 * 
	 * @param element
	 * @param checked
	 */
	protected void checkChildrenElementLeftToRight(Object element, boolean checked) {
		if (element instanceof DRepresentationDescriptor) {
			element = ((DRepresentationDescriptor) element).getRepresentation();
		}
		checkElementLeftToRight(element, checked);
		Widget findItem = leftTreeViewer.testFindItem(element);
		if (findItem instanceof TreeItem && !((TreeItem) findItem).getChecked()) {
			leftTreeViewer.setChecked(((TreeItem) findItem).getData(), checked);
		}
		if (element instanceof DRepresentation) {
			leftTreeViewer.setChecked(((TreeItem) findItem).getData(), checked);
		}
		// check children
		if (findItem instanceof TreeItem) {
			TreeItem[] children = ((TreeItem) findItem).getItems();
			if (children.length > 0 && children[0].getData() == null) {
				leftTreeViewer.createChildren(findItem);
			}
			for (TreeItem child : ((TreeItem) findItem).getItems()) {
				if (child.getData() != null) {
					checkElementLeftToRight(child.getData(), checked);
					checkChildrenElementLeftToRight(child.getData(), checked);
				}
			}
		}
	}

	/**
	 * Check element in right tree viewer from left tree viewer information.
	 * 
	 * @param element
	 *            in left tree viewer
	 * @param checked
	 */
	protected void checkElementLeftToRight(Object element, boolean checked) {
		if (element instanceof DRepresentationDescriptor) {
			// only DRepresentation are saved in tree viewer map
			element = ((DRepresentationDescriptor) element).getRepresentation();
		}
		Widget[] findItems = rightTreeViewer.testFindItems(element);
		if (findItems.length > 0 && findItems[0] instanceof TreeItem && checked) {
			leftTreeViewer.setChecked(rightTreeViewer.getInput(), checked);
		}
		for (Widget widget : findItems) {
			if (widget instanceof TreeItem) {
				if (((TreeItem) widget).getData() instanceof DRepresentationElement) {
					((TreeItem) widget).setChecked(checked);
				} else if (((TreeItem) widget).getParentItem() != null
						&& !(((TreeItem) widget).getParentItem().getData() instanceof EObjectWrapper)) {
					((TreeItem) widget).setChecked(checked);
					rightTreeViewer.doCheckStateChanged(((TreeItem) widget));
				} else if (((TreeItem) widget).getParentItem() != null
						&& (((TreeItem) widget).getParentItem().getData() instanceof EObjectWrapper)) {
					((TreeItem) widget).getParentItem().setChecked(checked);
					rightTreeViewer.doCheckStateChanged(((TreeItem) widget).getParentItem());
				}
			}
		}
	}

	/**
	 * Load configuration file.
	 * 
	 * @param fileName
	 *            configuration file name.
	 */
	public void loadConfigurationFile(final String fileName) {
		try {
			getContainer().run(true, true, new IRunnableWithProgress() {
				public void run(final IProgressMonitor monitor) {
					monitor.beginTask(Messages.SelectElementsWizardPage_13, 3);
					final List<EObject> configurationElements = ConfigurationUtils.getInstance()
							.getElementsFromConfigurationFile(fileName, session, monitor);
					monitor.worked(2);

					// checked all configuration elements in left tree viewer

					Display.getDefault().syncExec(new Runnable() {

						@SuppressWarnings("deprecation")
						@Override
						public void run() {
							if (leftTreeViewer.getTree().getItemCount() > 0) {
								leftTreeViewer.setSubtreeChecked(leftTreeViewer.getTree().getItem(0).getData(), false);
								if (!(rightTreeViewer.getInput() instanceof Session)) {
									rightTreeViewer.setInput(leftTreeViewer.getInput());
									rightTreeViewer.setAllChecked(false);
								}
							}

							if (!configurationElements.isEmpty()) {
								for (EObject element : configurationElements) {
									Widget findItem = leftTreeViewer.testFindItem(element);
									if (findItem == null) {
										// calculate data
										EObject parent = element.eContainer();
										List<EObject> toCalculateEObject = new ArrayList<EObject>();
										while (parent != null && leftTreeViewer.testFindItem(parent) == null) {
											toCalculateEObject.add(0, parent);
											parent = parent.eContainer();
										}
										Widget parentWidget = leftTreeViewer.testFindItem(parent);
										if (parentWidget != null) {
											leftTreeViewer.createChildren(parentWidget);
											for (EObject eObject : toCalculateEObject) {
												leftTreeViewer.createChildren(leftTreeViewer.testFindItem(eObject));
											}
										}
									}

									if (findItem instanceof TreeItem && ((TreeItem) findItem).getItemCount() == 0) {
										leftTreeViewer.setChecked(element, true);
									}
								}
								checkRightOnLeftSelection();
							}
						}

					});
					monitor.done();

				}
			});
		} catch (InvocationTargetException e1) {
			Activator.getDefault().getLog().log(new Status(Status.ERROR, Activator.PLUGIN_ID, e1.getMessage()));
		} catch (InterruptedException e1) {
			Activator.getDefault().getLog().log(new Status(Status.ERROR, Activator.PLUGIN_ID, e1.getMessage()));
		}
	}

	/**
	 * Save configuration file.
	 * 
	 * @param fileName
	 *            configuration file name
	 */
	public void saveConfigurationFile(final String fileName) {
		try {
			getContainer().run(true, true, new IRunnableWithProgress() {
				public void run(IProgressMonitor monitor) {
					monitor.beginTask(Messages.SelectElementsWizardPage_14, 2);
					Display.getDefault().syncExec(new Runnable() {

						@Override
						public void run() {
							ConfigurationUtils.getInstance().createConfigurationResource(fileName,
									getSelectedElements());
						}
					});
					monitor.done();
				}
			});
		} catch (InvocationTargetException e1) {
			Activator.getDefault().getLog().log(new Status(Status.ERROR, Activator.PLUGIN_ID, e1.getMessage()));
		} catch (InterruptedException e1) {
			Activator.getDefault().getLog().log(new Status(Status.ERROR, Activator.PLUGIN_ID, e1.getMessage()));
		}
	}

}
