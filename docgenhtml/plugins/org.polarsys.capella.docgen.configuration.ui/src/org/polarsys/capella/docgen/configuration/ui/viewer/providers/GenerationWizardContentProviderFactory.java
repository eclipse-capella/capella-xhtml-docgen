/*******************************************************************************
 * Copyright (c) 2006, 2019 THALES GLOBAL SERVICES and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *    Thales - initial API and implementation
 *    Obeo - additional customizations
 *******************************************************************************/
package org.polarsys.capella.docgen.configuration.ui.viewer.providers;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.polarsys.capella.common.ui.toolkit.browser.BrowserActivator;
import org.polarsys.capella.common.ui.toolkit.browser.category.CategoryRegistry;
import org.polarsys.capella.common.ui.toolkit.browser.category.ICategory;
import org.polarsys.capella.common.ui.toolkit.browser.content.provider.IBrowserContentProvider;
import org.polarsys.capella.common.ui.toolkit.browser.content.provider.factory.impl.DefaultContentProviderFactory;
import org.polarsys.capella.common.ui.toolkit.browser.content.provider.impl.CurrentElementCP;
import org.polarsys.capella.common.ui.toolkit.browser.content.provider.impl.ReferencedElementCP;
import org.polarsys.capella.common.ui.toolkit.browser.content.provider.impl.ReferencingElementCP;
import org.polarsys.capella.common.ui.toolkit.browser.content.provider.wrapper.BrowserElementWrapper;
import org.polarsys.capella.common.ui.toolkit.browser.content.provider.wrapper.CategoryWrapper;
import org.polarsys.capella.common.ui.toolkit.browser.content.provider.wrapper.EObjectWrapper;
import org.polarsys.capella.core.model.handler.provider.CapellaAdapterFactoryProvider;

/**
 * Content provider factory used for the semantic browser. Code adapted from
 * org.polarsys.capella.core.ui.semantic.browser.content.provider.
 * SemanticBrowserContentProviderFactory
 */
public class GenerationWizardContentProviderFactory extends DefaultContentProviderFactory {

	/**
	 * Constructor.
	 */
	public GenerationWizardContentProviderFactory() {
		super(CapellaAdapterFactoryProvider.getInstance().getAdapterFactory());
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see org.polarsys.capella.common.ui.toolkit.browser.content.provider.factory.impl.DefaultContentProviderFactory#getCurrentContentProvider()
	 */
	@Override
	public ITreeContentProvider getCurrentContentProvider() {

		return new CurrentElementCP(getAdapterFactory(), model) {

			/**
			 * (non-Javadoc)
			 * 
			 * @see org.polarsys.capella.common.ui.toolkit.browser.content.provider.impl.AbstractContentProvider#getCategoryChildren(org.polarsys.capella.common.ui.toolkit.browser.category.ICategory,
			 *      org.polarsys.capella.common.ui.toolkit.browser.content.provider.wrapper.BrowserElementWrapper,
			 *      java.util.Set)
			 */
			@Override
			protected void getCategoryChildren(ICategory category, BrowserElementWrapper wrapper,
					Set<Object> gatheredElements) {
				// lookup for the element that we need to query on.
				EObject elementToQuery = lookUpModelElement(wrapper);
				if (elementToQuery == null) {
					return;
				}

				// Gather subCategories & compute queries attached to the
				// category.
				gatheredElements.addAll(category.compute(elementToQuery));
				gatheredElements.addAll(
						CategoryRegistry.getInstance().gatherSubCategories(getBrowserId(), elementToQuery, category));

			}

			/**
			 * Look up a model element for specified wrapper.
			 * 
			 * @param wrapper
			 * @return
			 */
			private EObject lookUpModelElement(BrowserElementWrapper wrapper) {
				BrowserElementWrapper parentWrapper = semanticParentHashMap.get(wrapper);
				if (parentWrapper instanceof CategoryWrapper) {
					return lookUpModelElement(parentWrapper);
				}
				if (parentWrapper == null) {
					return null;
				}
				return (EObject) parentWrapper.getElement();
			}

			/**
			 * (non-Javadoc)
			 * 
			 * @see org.polarsys.capella.common.ui.toolkit.browser.content.provider.impl.AbstractContentProvider#getChildren(java.lang.Object)
			 */
			@Override
			public Object[] getChildren(Object parentElement) {
				Object[] result = new Object[0];
				try {
					if (parentElement instanceof RootCategoryWrapper) {
						return result;// getChildren(new
										// EObjectWrapper(_rootElement));
					}
					if (parentElement instanceof BrowserElementWrapper) {
						BrowserElementWrapper wrapper = (BrowserElementWrapper) parentElement;
						if (!(wrapper.getElement().equals(this.viewer.getInput())
								|| isParentPresent(parentElement))) {
							return result;
						}
						// retrieve referenced element by the wrapper.
						Object element = ((BrowserElementWrapper) parentElement).getElement();
						Set<Object> gatheredElements = new HashSet<Object>(0);
						if (wrapper instanceof EObjectWrapper) {
							// Provide the root element to the CurrentElement
							// Browser in purpose to display it.
							if ((element == rootElement) && inputHasChanged) {
								// Root element has no parent : store null
								// value.
								semanticParentHashMap.put(wrapper, null);
								inputHasChanged = false;
								// if
								// (getBrowserId().equalsIgnoreCase(IBrowserContentProvider.ID_CURRENT_CP))
								// {
								// return new Object[] { wrapper };
								// }
							}
							getElementChildren((EObject) element, wrapper, gatheredElements);
						} else if (wrapper instanceof CategoryWrapper) {
							getCategoryChildren((ICategory) element, wrapper, gatheredElements);
						}

						/**
						 * Wrap gathered elements & register each wrapper in
						 * cache.
						 */
						Set<Object> wrappers = new HashSet<Object>(0);
						for (Object gatherElement : gatheredElements) {
							// ignore queries result that returns a null object
							// (reference with cardinality max 1)
							if (gatherElement != null) {
								BrowserElementWrapper elementWrapper = wrapElement(gatherElement);
								// Add wrapper and element wrapper in internal
								// data and returned collection.
								wrappers.add(elementWrapper);
								semanticParentHashMap.put(elementWrapper, wrapper);
								// Flag to filter out empty category.
								boolean shouldRemovedEmptyCategoryWrapper = false;
								if (gatherElement instanceof ICategory) {
									if (!model.doesShowCategory((ICategory) gatherElement)) {
										shouldRemovedEmptyCategoryWrapper = true;
									} else {
										Set<Object> categoryChildren = new HashSet<Object>(0);
										// Compute category children, if no
										// child, remove this category from
										// displayed elements.
										getCategoryChildren((ICategory) gatherElement, elementWrapper,
												categoryChildren);
										if (categoryChildren.isEmpty()) {
											shouldRemovedEmptyCategoryWrapper = true;
										}
									}
								}
								if (shouldRemovedEmptyCategoryWrapper) {
									wrappers.remove(elementWrapper);
									semanticParentHashMap.remove(elementWrapper);
								}
							}
						}

						result = wrappers.toArray();
					} else {
						// Wrap given element. This input element can't be a
						// Category because a category element is computed.
						rootElement = (EObject) parentElement;
						result = getChildren(new EObjectWrapper(rootElement));

					}
				} catch (Exception exception) {
					BrowserActivator.getDefault().getLog().log(new Status(IStatus.ERROR, BrowserActivator.PLUGIN_ID,
							"Error while getting children for " + parentElement, exception)); //$NON-NLS-1$
					result = new Object[0];
				}
				return result;
			}

			/**
			 * Wrap element in the proper wrapper.
			 * 
			 * @param gatherElement
			 * @return
			 */
			private BrowserElementWrapper wrapElement(Object gatherElement) {
				BrowserElementWrapper wrapper = null;
				if ((gatherElement != null) && (gatherElement instanceof EObject)) {
					wrapper = new EObjectWrapper((EObject) gatherElement);
				} else if (gatherElement instanceof ICategory) {
					wrapper = new CategoryWrapper((ICategory) gatherElement);
				}
				return wrapper;
			}

			private boolean isParentPresent(Object parentElement) {
				return semanticParentHashMap.containsKey(parentElement);
			}

		};
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see org.polarsys.capella.common.ui.toolkit.browser.content.provider.factory.impl.DefaultContentProviderFactory#getReferencedContentProvider()
	 */
	@Override
	public ITreeContentProvider getReferencedContentProvider() {
		return new ReferencedElementCP(getAdapterFactory(), model) {

			/**
			 * (non-Javadoc)
			 * 
			 * @see org.polarsys.capella.common.ui.toolkit.browser.content.provider.impl.AbstractContentProvider#getCategoryChildren(org.polarsys.capella.common.ui.toolkit.browser.category.ICategory,
			 *      org.polarsys.capella.common.ui.toolkit.browser.content.provider.wrapper.BrowserElementWrapper,
			 *      java.util.Set)
			 */
			@Override
			protected void getCategoryChildren(ICategory category, BrowserElementWrapper wrapper,
					Set<Object> gatheredElements) {
				// lookup for the element that we need to query on.
				EObject elementToQuery = lookUpModelElement(wrapper);
				if (elementToQuery == null) {
					return;
				}

				// Gather subCategories & compute queries attached to the
				// category.
				gatheredElements.addAll(category.compute(elementToQuery));
				gatheredElements.addAll(
						CategoryRegistry.getInstance().gatherSubCategories(getBrowserId(), elementToQuery, category));

			}

			/**
			 * Look up a model element for specified wrapper.
			 * 
			 * @param wrapper
			 * @return
			 */
			private EObject lookUpModelElement(BrowserElementWrapper wrapper) {
				BrowserElementWrapper parentWrapper = semanticParentHashMap.get(wrapper);
				if (parentWrapper instanceof CategoryWrapper) {
					return lookUpModelElement(parentWrapper);
				}
				if (parentWrapper == null) {
					return null;
				}
				return (EObject) parentWrapper.getElement();
			}

			/**
			 * (non-Javadoc)
			 * 
			 * @see org.polarsys.capella.common.ui.toolkit.browser.content.provider.impl.AbstractContentProvider#getChildren(java.lang.Object)
			 */
			@Override
			public Object[] getChildren(Object parentElement) {
				Object[] result = new Object[0];
				try {
					if (parentElement instanceof RootCategoryWrapper) {
						if (((RootCategoryWrapper) parentElement).getBrowserID().equals(getBrowserId())) {
							return getChildren(new EObjectWrapper(rootElement));
						} else {
							return result;
						}
					}
					if (parentElement instanceof BrowserElementWrapper) {
						BrowserElementWrapper wrapper = (BrowserElementWrapper) parentElement;
						if (!(wrapper.getElement().equals(this.viewer.getInput()) || isParentPresent(parentElement))) {
							return result;
						}
						// retrieve referenced element by the wrapper.
						Object element = ((BrowserElementWrapper) parentElement).getElement();
						Set<Object> gatheredElements = new HashSet<Object>(0);
						if (wrapper instanceof EObjectWrapper) {
							// Provide the root element to the CurrentElement
							// Browser in purpose to display it.
							if ((element == rootElement) && inputHasChanged) {
								// Root element has no parent : store null
								// value.
								semanticParentHashMap.put(wrapper, null);
								inputHasChanged = false;
								if (getBrowserId().equalsIgnoreCase(IBrowserContentProvider.ID_CURRENT_CP)) {
									return new Object[] { wrapper };
								}
							}
							getElementChildren((EObject) element, wrapper, gatheredElements);
						} else if (wrapper instanceof CategoryWrapper) {
							getCategoryChildren((ICategory) element, wrapper, gatheredElements);
						}

						/**
						 * Wrap gathered elements & register each wrapper in
						 * cache.
						 */
						Set<Object> wrappers = new HashSet<Object>(0);
						for (Object gatherElement : gatheredElements) {
							// ignore queries result that returns a null object
							// (reference with cardinality max 1)
							if (gatherElement != null) {
								BrowserElementWrapper elementWrapper = wrapElement(gatherElement);
								// Add wrapper and element wrapper in internal
								// data and returned collection.
								wrappers.add(elementWrapper);
								semanticParentHashMap.put(elementWrapper, wrapper);
								// Flag to filter out empty category.
								boolean shouldRemovedEmptyCategoryWrapper = false;
								if (gatherElement instanceof ICategory) {
									if (!model.doesShowCategory((ICategory) gatherElement)) {
										shouldRemovedEmptyCategoryWrapper = true;
									} else {
										Set<Object> categoryChildren = new HashSet<Object>(0);
										// Compute category children, if no
										// child, remove this category from
										// displayed elements.
										getCategoryChildren((ICategory) gatherElement, elementWrapper,
												categoryChildren);
										if (categoryChildren.isEmpty()) {
											shouldRemovedEmptyCategoryWrapper = true;
										}
									}
								}
								if (shouldRemovedEmptyCategoryWrapper) {
									wrappers.remove(elementWrapper);
									semanticParentHashMap.remove(elementWrapper);
								}
							}
						}

						result = wrappers.toArray();
					} else {
						// Wrap given element. This input element can't be a
						// Category because a category element is computed.
						rootElement = (EObject) parentElement;
						result = new Object[] { new RootCategoryWrapper(parentElement, getBrowserId()) };

					}
				} catch (Exception exception) {
					BrowserActivator.getDefault().getLog().log(new Status(IStatus.ERROR, BrowserActivator.PLUGIN_ID,
							"Error while getting children for " + parentElement, exception)); //$NON-NLS-1$
					result = new Object[0];
				}
				return result;
			}

			/**
			 * Wrap element in the proper wrapper.
			 * 
			 * @param gatherElement
			 * @return
			 */
			private BrowserElementWrapper wrapElement(Object gatherElement) {
				BrowserElementWrapper wrapper = null;
				if ((gatherElement != null) && (gatherElement instanceof EObject)) {
					wrapper = new EObjectWrapper((EObject) gatherElement);
				} else if (gatherElement instanceof ICategory) {
					wrapper = new CategoryWrapper((ICategory) gatherElement);
				}
				return wrapper;
			}

			private boolean isParentPresent(Object parentElement_p) {
				return semanticParentHashMap.containsKey(parentElement_p);
			}

		};
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see org.polarsys.capella.common.ui.toolkit.browser.content.provider.factory.impl.DefaultContentProviderFactory#getReferencingContentProvider()
	 */
	@Override
	public ITreeContentProvider getReferencingContentProvider() {
		return new ReferencingElementCP(getAdapterFactory(), model) {

			/**
			 * (non-Javadoc)
			 * 
			 * @see org.polarsys.capella.common.ui.toolkit.browser.content.provider.impl.AbstractContentProvider#getCategoryChildren(org.polarsys.capella.common.ui.toolkit.browser.category.ICategory,
			 *      org.polarsys.capella.common.ui.toolkit.browser.content.provider.wrapper.BrowserElementWrapper,
			 *      java.util.Set)
			 */
			@Override
			protected void getCategoryChildren(ICategory category, BrowserElementWrapper wrapper,
					Set<Object> gatheredElements_p) {
				// lookup for the element that we need to query on.
				EObject elementToQuery = lookUpModelElement(wrapper);
				if (elementToQuery == null) {
					return;
				}

				// Gather subCategories & compute queries attached to the
				// category.
				gatheredElements_p.addAll(category.compute(elementToQuery));
				gatheredElements_p.addAll(
						CategoryRegistry.getInstance().gatherSubCategories(getBrowserId(), elementToQuery, category));

			}

			/**
			 * Look up a model element for specified wrapper.
			 * 
			 * @param wrapper
			 * @return
			 */
			private EObject lookUpModelElement(BrowserElementWrapper wrapper) {
				BrowserElementWrapper parentWrapper = semanticParentHashMap.get(wrapper);
				if (parentWrapper instanceof CategoryWrapper) {
					return lookUpModelElement(parentWrapper);
				}
				if (parentWrapper == null) {
					return null;
				}
				return (EObject) parentWrapper.getElement();
			}

			/**
			 * (non-Javadoc)
			 * 
			 * @see org.polarsys.capella.common.ui.toolkit.browser.content.provider.impl.AbstractContentProvider#getChildren(java.lang.Object)
			 */
			@Override
			public Object[] getChildren(Object parentElement) {
				Object[] result = new Object[0];
				try {
					if (parentElement instanceof RootCategoryWrapper) {
						if (((RootCategoryWrapper) parentElement).getBrowserID().equals(getBrowserId())) {
							return getChildren(new EObjectWrapper(rootElement));
						} else {
							return result;
						}
					}

					if (parentElement instanceof BrowserElementWrapper) {
						BrowserElementWrapper wrapper = (BrowserElementWrapper) parentElement;
						if (!(wrapper.getElement().equals(this.viewer.getInput()) || isParentPresent(parentElement))) {
							return result;
						}
						// retrieve referenced element by the wrapper.
						Object element = ((BrowserElementWrapper) parentElement).getElement();
						Set<Object> gatheredElements = new HashSet<Object>(0);
						if (wrapper instanceof EObjectWrapper) {
							// Provide the root element to the CurrentElement
							// Browser in purpose to display it.
							if ((element == rootElement) && inputHasChanged) {
								// Root element has no parent : store null
								// value.
								semanticParentHashMap.put(wrapper, null);
								inputHasChanged = false;
								if (getBrowserId().equalsIgnoreCase(IBrowserContentProvider.ID_CURRENT_CP)) {
									return new Object[] { wrapper };
								}
							}
							getElementChildren((EObject) element, wrapper, gatheredElements);
						} else if (wrapper instanceof CategoryWrapper) {
							getCategoryChildren((ICategory) element, wrapper, gatheredElements);
						}

						/**
						 * Wrap gathered elements & register each wrapper in
						 * cache.
						 */
						Set<Object> wrappers = new HashSet<Object>(0);
						for (Object gatherElement : gatheredElements) {
							// ignore queries result that returns a null object
							// (reference with cardinality max 1)
							if (gatherElement != null) {
								BrowserElementWrapper elementWrapper = wrapElement(gatherElement);
								// Add wrapper and element wrapper in internal
								// data and returned collection.
								wrappers.add(elementWrapper);
								semanticParentHashMap.put(elementWrapper, wrapper);
								// Flag to filter out empty category.
								boolean shouldRemovedEmptyCategoryWrapper = false;
								if (gatherElement instanceof ICategory) {
									if (!model.doesShowCategory((ICategory) gatherElement)) {
										shouldRemovedEmptyCategoryWrapper = true;
									} else {
										Set<Object> categoryChildren = new HashSet<Object>(0);
										// Compute category children, if no
										// child, remove this category from
										// displayed elements.
										getCategoryChildren((ICategory) gatherElement, elementWrapper,
												categoryChildren);
										if (categoryChildren.isEmpty()) {
											shouldRemovedEmptyCategoryWrapper = true;
										}
									}
								}
								if (shouldRemovedEmptyCategoryWrapper) {
									wrappers.remove(elementWrapper);
									semanticParentHashMap.remove(elementWrapper);
								}
							}
						}

						result = wrappers.toArray();
					} else {
						// Wrap given element. This input element can't be a
						// Category because a category element is computed.
						rootElement = (EObject) parentElement;
						result = new Object[] { new RootCategoryWrapper(parentElement, getBrowserId()) };
					}
				} catch (Exception exception) {
					BrowserActivator.getDefault().getLog().log(new Status(IStatus.ERROR, BrowserActivator.PLUGIN_ID,
							"Error while getting children for " + parentElement, exception)); //$NON-NLS-1$
					result = new Object[0];
				}
				return result;
			}

			/**
			 * Wrap element in the proper wrapper.
			 * 
			 * @param gatherElement
			 * @return
			 */
			private BrowserElementWrapper wrapElement(Object gatherElement) {
				BrowserElementWrapper wrapper = null;
				if ((gatherElement != null) && (gatherElement instanceof EObject)) {
					wrapper = new EObjectWrapper((EObject) gatherElement);
				} else if (gatherElement instanceof ICategory) {
					wrapper = new CategoryWrapper((ICategory) gatherElement);
				}
				return wrapper;
			}

			private boolean isParentPresent(Object parentElement) {
				return semanticParentHashMap.containsKey(parentElement);
			}

		};
	}

}
