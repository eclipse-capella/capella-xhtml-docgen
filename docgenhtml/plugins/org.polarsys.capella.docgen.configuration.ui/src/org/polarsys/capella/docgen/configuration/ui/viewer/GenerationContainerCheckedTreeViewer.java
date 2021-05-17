/*******************************************************************************
 * Copyright (c) 2017, 2021 Obeo.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *    Obeo - initial API and implementation
 *    Thales - additional customizations
 *******************************************************************************/
package org.polarsys.capella.docgen.configuration.ui.viewer;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Optional;

import org.eclipse.jface.util.Policy;
import org.eclipse.sirius.common.tools.api.util.ReflectionHelper;
import org.eclipse.sirius.viewpoint.DRepresentationDescriptor;
import org.eclipse.sirius.viewpoint.DRepresentationElement;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Item;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.swt.widgets.Widget;
import org.eclipse.ui.dialogs.ContainerCheckedTreeViewer;
import org.polarsys.capella.common.ui.toolkit.browser.content.provider.wrapper.BrowserElementWrapper;
import org.polarsys.capella.docgen.configuration.ui.Activator;

/**
 * Check box tree viewer for XHTML generation. Adapt element/ widget mapping to
 * make easier left to right and right to left checked selection.
 *
 */
public class GenerationContainerCheckedTreeViewer extends ContainerCheckedTreeViewer {
	private static final String IMPOSSIBLE_TO_GET_ELEMENT_FROM_MAP = "Impossible to get element from map";
	private static final String REMOVE = "remove";
	private static final String VIRTUAL_DISPOSE_KEY = Policy.JFACE + ".DISPOSE_LISTENER"; //$NON-NLS-1$

	/**
	 * @param parent
	 * @param style
	 */
	public GenerationContainerCheckedTreeViewer(Composite parent, int style) {
		super(parent, style);
	}

	/**
	 * Update element after a checkstate change.
	 * 
	 * @param element
	 */
	public void doCheckStateChanged(Widget item) {
		if (item instanceof TreeItem) {
			TreeItem treeItem = (TreeItem) item;
			treeItem.setGrayed(false);
			updateChildrenItems(treeItem);
			updateParentItems(treeItem.getParentItem());
		}
	}

	/**
	 * Updates the check state of all created children
	 */
	private void updateChildrenItems(TreeItem parent) {
		Item[] children = getChildren(parent);
		boolean state = parent.getChecked();
		for (int i = 0; i < children.length; i++) {
			TreeItem curr = (TreeItem) children[i];
			if (curr.getData() != null && ((curr.getChecked() != state) || curr.getGrayed())) {
				curr.setChecked(state);
				curr.setGrayed(false);
				updateChildrenItems(curr);
			}
		}
	}

	/**
	 * Updates the check / gray state of all parent items
	 */
	private void updateParentItems(TreeItem item) {
		if (item != null) {
			Item[] children = getChildren(item);
			boolean containsChecked = false;
			boolean containsUnchecked = false;
			for (int i = 0; i < children.length; i++) {
				TreeItem curr = (TreeItem) children[i];
				containsChecked |= curr.getChecked();
				containsUnchecked |= (!curr.getChecked() || curr.getGrayed());
			}
			item.setChecked(containsChecked);
			item.setGrayed(containsChecked && containsUnchecked);
			updateParentItems(item.getParentItem());
		}
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.viewers.TreeViewer#mapElement(java.lang.Object,
	 *      org.eclipse.swt.widgets.Widget)
	 */
	@Override
	protected void mapElement(Object element, final Widget item) {

		Optional<Object> value = ReflectionHelper.getFieldValueWithoutException(this, "elementMap"); //$NON-NLS-1$
		if (!value.isPresent()) {
			return;
		}
		if (value.get() != null) {
			Object widgetOrWidgets = getElementMap(value.get(), element);
			if (widgetOrWidgets == null) {
				putElementMap(value.get(), element, item);
			} else if (widgetOrWidgets instanceof Widget) {
				if (widgetOrWidgets != item) {
					putElementMap(value.get(), element, new Widget[] { (Widget) widgetOrWidgets, item });
				}
			} else {
				Widget[] widgets = (Widget[]) widgetOrWidgets;
				int indexOfItem = Arrays.asList(widgets).indexOf(item);
				if (indexOfItem == -1) {
					int length = widgets.length;
					System.arraycopy(widgets, 0, widgets = new Widget[length + 1], 0, length);
					widgets[length] = item;
					putElementMap(value.get(), element, widgets);
				}
			}
		}

		unmapItemsOnTree(item);
	}

	/**
	 * unmap elements if the tree is virtual
	 * @param item
	 */
	private void unmapItemsOnTree(final Widget item) {
		if (((getTree().getStyle() & SWT.VIRTUAL) != 0) && (item.getData(VIRTUAL_DISPOSE_KEY) == null)) {
			item.setData(VIRTUAL_DISPOSE_KEY, Boolean.TRUE);
			item.addDisposeListener(new DisposeListener() {
				@Override
				public void widgetDisposed(DisposeEvent e) {
					Optional<Object> treeIsDisposed = ReflectionHelper.getFieldValueWithoutException(this,
							"treeIsDisposed"); //$NON-NLS-1$
					if (treeIsDisposed.isPresent() && !((Boolean) treeIsDisposed.get())) {
						Object data = item.getData();
						if (usingElementMap() && data != null) {
							unmapElement(data, item);
						}
					}
				}
			});
		}
	}

	private void putElementMap(Object elementMap, Object element, final Object item) {
		ReflectionHelper.invokeMethodWithoutException(elementMap, elementMap.getClass(), "put", //$NON-NLS-1$
				new Class<?>[] { Object.class, Object.class }, new Object[] { element, item }, true);
		if (element instanceof DRepresentationDescriptor) {
			ReflectionHelper.invokeMethodWithoutException(elementMap, elementMap.getClass(), "put", //$NON-NLS-1$
					new Class<?>[] { Object.class, Object.class },
					new Object[] { ((DRepresentationDescriptor) element).getRepresentation(), item }, true);
		}
		if (element instanceof DRepresentationElement) {
			ReflectionHelper.invokeMethodWithoutException(elementMap, elementMap.getClass(), "put", //$NON-NLS-1$
					new Class<?>[] { Object.class, Object.class },
					new Object[] { ((DRepresentationElement) element).getTarget(), item }, true);
		}
		if (element instanceof BrowserElementWrapper) {
			ReflectionHelper.invokeMethodWithoutException(elementMap, elementMap.getClass(), "put", //$NON-NLS-1$
					new Class<?>[] { Object.class, Object.class },
					new Object[] { ((BrowserElementWrapper) element).getElement(), item }, true);
		}
	}

	private Object getElementMap(Object elementMap, Object element) {
		try {
			return ReflectionHelper.invokeMethod(elementMap, elementMap.getClass(), "get", //$NON-NLS-1$
					new Class<?>[] { Object.class }, new Object[] { element }, true);
		} catch (SecurityException e) {
			Activator.getDefault().getLog().error(IMPOSSIBLE_TO_GET_ELEMENT_FROM_MAP, e);
		} catch (NoSuchMethodException e) {
			Activator.getDefault().getLog().error(IMPOSSIBLE_TO_GET_ELEMENT_FROM_MAP, e);
		} catch (IllegalArgumentException e) {
			Activator.getDefault().getLog().error(IMPOSSIBLE_TO_GET_ELEMENT_FROM_MAP, e);
		} catch (IllegalAccessException e) {
			Activator.getDefault().getLog().error(IMPOSSIBLE_TO_GET_ELEMENT_FROM_MAP, e);
		} catch (InvocationTargetException e) {
			Activator.getDefault().getLog().error(IMPOSSIBLE_TO_GET_ELEMENT_FROM_MAP, e);
		}
		return null;
	}

	private void removeElementMap(Object elementMap, Object element) {
		ReflectionHelper.invokeMethodWithoutException(elementMap, elementMap.getClass(), REMOVE, //$NON-NLS-1$
				new Class<?>[] { Object.class }, new Object[] { element }, true);
		if (element instanceof BrowserElementWrapper) {
			ReflectionHelper.invokeMethodWithoutException(elementMap, elementMap.getClass(), REMOVE, //$NON-NLS-1$
					new Class<?>[] { Object.class }, new Object[] { ((BrowserElementWrapper) element).getElement() },
					true);
		}
		if (element instanceof DRepresentationDescriptor) {
			ReflectionHelper.invokeMethodWithoutException(elementMap, elementMap.getClass(), REMOVE, //$NON-NLS-1$
					new Class<?>[] { Object.class },
					new Object[] { ((DRepresentationDescriptor) element).getRepresentation() }, true);
		}
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.viewers.StructuredViewer#unmapElement(java.lang.Object,
	 *      org.eclipse.swt.widgets.Widget)
	 */
	@Override
	protected void unmapElement(Object element, Widget item) {
		// double-check that the element actually maps to the given item
		// before
		// unmapping it
		Optional<Object> value = ReflectionHelper.getFieldValueWithoutException(this, "elementMap"); //$NON-NLS-1$
		if (!value.isPresent()) {
			return;
		}
		Object widgetOrWidgets = getElementMap(value.get(), element);
		if (widgetOrWidgets instanceof Widget) {
			if (item == widgetOrWidgets) {
				removeElementMap(value.get(), element);
			}
		} else if (widgetOrWidgets != null) {
			Widget[] widgets = (Widget[]) widgetOrWidgets;
			int indexOfItem = Arrays.asList(widgets).indexOf(item);
			if (indexOfItem == -1) {
				return;
			}
			int length = widgets.length;
			if (indexOfItem == 0) {
				if (length == 1) {
					removeElementMap(value.get(), element);
				} else {
					Widget[] updatedWidgets = new Widget[length - 1];
					System.arraycopy(widgets, 1, updatedWidgets, 0, length - 1);
					putElementMap(value.get(), element, updatedWidgets);
				}
			} else {
				Widget[] updatedWidgets = new Widget[length - 1];
				System.arraycopy(widgets, 0, updatedWidgets, 0, indexOfItem);
				System.arraycopy(widgets, indexOfItem + 1, updatedWidgets, indexOfItem, length - indexOfItem - 1);
				putElementMap(value.get(), element, updatedWidgets);
			}
		}
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.viewers.AbstractTreeViewer#createChildren(org.eclipse.swt.widgets.Widget)
	 */
	@Override
	public void createChildren(Widget widget) {
		super.createChildren(widget);
	}

}