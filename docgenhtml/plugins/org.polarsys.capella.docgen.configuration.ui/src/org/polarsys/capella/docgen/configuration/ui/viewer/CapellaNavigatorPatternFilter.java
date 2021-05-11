/*******************************************************************************
 * Copyright (c) 2006, 2021 THALES GLOBAL SERVICES and others.
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
package org.polarsys.capella.docgen.configuration.ui.viewer;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

import org.eclipse.core.runtime.Status;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.dialogs.FilteredTree;
import org.eclipse.ui.dialogs.PatternFilter;
import org.polarsys.capella.core.platform.sirius.ui.navigator.view.CapellaCommonNavigatorPatternFilter;
import org.polarsys.capella.docgen.configuration.ui.Activator;

/**
 * Copy of org.polarsys.capella.core.platform.sirius.ui.navigator.view.
 * CapellaCommonNavigator.CapellaPatternFilter. Specific pattern filter
 * for the Capella Navigator to be able to search base on {@link LabelProvider}
 * or on Description model element attribute.
 */
public class CapellaNavigatorPatternFilter extends CapellaCommonNavigatorPatternFilter {
	  private static final String IMPOSSIBLE_TO_CLEAR_CACHE = "Impossible to clear cache";
	private static final String IMPOSSIBLE_TO_ACTIVATE_CACHE = "Impossible to activate cache";
	private String pattern;
	  private Pattern matchingPattern;

	  private boolean caseSensitiveEnabled = false;

	  @Override
	  protected String getText(Viewer viewer, Object element) {
	    return ((ILabelProvider) ((StructuredViewer) viewer).getLabelProvider()).getText(element);
	  }

	  @Override
	  protected boolean isLeafMatch(Viewer viewer, Object element) {
	    String labelText = getText(viewer, element);
	    if (labelText == null) {
	      return false;
	    }
	    return wordMatches(labelText);
	  }

	  @Override
	  public void setPattern(String patternString) {
	    super.setPattern(patternString);
	    if (patternString != null) {
	      // As the matcher of PatternFilter use by default "true" for "ignoreCase" and "false" for "ignoreWildCard"
	      // We create a another matcher here so that we can provide search options for user.
	      int flags = 0;
	      if (!patternString.endsWith(" ")) {
	    	  // So that if search for "Air", the results will include texts containing "Aircraft" or "Airplane"
	    	  flags |= Pattern.DOTALL;
	      }
	      if (!caseSensitiveEnabled) {
	    	  flags |= Pattern.CASE_INSENSITIVE;
	      }
	      this.pattern = patternString;
	      try {
	    	  matchingPattern = Pattern.compile(this.pattern, flags);
	      } catch (PatternSyntaxException e) {
	    	  Activator.getDefault().getLog().log(new Status(Status.ERROR, Activator.PLUGIN_ID, e.getMessage()));
	      }
	    } else {
	    	this.pattern = "";
	    	matchingPattern = Pattern.compile(pattern);
	    }
	  }

	  @Override
	  public String getPattern() {
	    return pattern;
	  }

	  @Override
	  protected boolean wordMatches(String text) {
	    if (this.pattern == null || this.pattern.isEmpty() || matchingPattern == null) {
	      return true;
	    }

	    if (text == null) {
	      return false;
	    }

	    return matchingPattern.matcher(text).find();
	  }

	  @Override
	  public void setCaseSensitiveEnabled(boolean caseSensitiveEnabled) {
	    this.caseSensitiveEnabled = caseSensitiveEnabled;
	  }

	  /**
	   * By default, the cache is used only for {@link FilteredTree.NotifyingTreeViewer} and the
	   * {@link PatternFilter#setUseCache()} is not public accessed. Use java reflection to be able to activate the caches
	   * to improve performance while searching in big Capella model
	   * 
	   * If activating the cache for a viewer, DO NOT forget to clear cache before refreshing a viewer. Otherwise, a
	   * potential {@link ArrayIndexOutOfBoundsException} is thrown at {@link StructuredViewer#notifyFilteredOut()}
	   * 
	   * @see https://jira.appcelerator.org/browse/APSTUD-1074
	   * @see PatternFilter#setUseCache()
	   */
	  @Override
	  public void doSetUseCache(boolean useCache) {
	    try {
	      // As we are not using the default NotifyingTreeViewer of FilteredTree, the cache is not activated.
	      // Use java reflection to activate it here
	      Method setUseCacheMethod = PatternFilter.class.getDeclaredMethod("setUseCache", boolean.class); //$NON-NLS-1$
	      setUseCacheMethod.setAccessible(true);
	      setUseCacheMethod.invoke(this, useCache);
	    } catch (IllegalAccessException e) {
	    	Activator.getDefault().getLog().error(IMPOSSIBLE_TO_ACTIVATE_CACHE, e);
	    } catch (IllegalArgumentException e) {
	    	Activator.getDefault().getLog().error(IMPOSSIBLE_TO_ACTIVATE_CACHE, e);
	    } catch (InvocationTargetException e) {
	    	Activator.getDefault().getLog().error(IMPOSSIBLE_TO_ACTIVATE_CACHE, e);
	    } catch (NoSuchMethodException e) {
	    	Activator.getDefault().getLog().error(IMPOSSIBLE_TO_ACTIVATE_CACHE, e);
	    } catch (SecurityException e) {
	    	Activator.getDefault().getLog().error(IMPOSSIBLE_TO_ACTIVATE_CACHE, e);
	    }
	  }

	  /**
	   * Use java reflection to be able to clear the caches.
	   * 
	   * @see PatternFilter#clearCaches()
	   */
	  @Override
	  public void doClearCaches() {
	    try {
	      Method clearCachesMethod = PatternFilter.class.getDeclaredMethod("clearCaches");
	      clearCachesMethod.setAccessible(true);
	      clearCachesMethod.invoke(this);
	    } catch (NoSuchMethodException e) {
	    	Activator.getDefault().getLog().error(IMPOSSIBLE_TO_CLEAR_CACHE, e);
	    } catch (SecurityException e) {
	    	Activator.getDefault().getLog().error(IMPOSSIBLE_TO_CLEAR_CACHE, e);
	    } catch (IllegalAccessException e) {
	    	Activator.getDefault().getLog().error(IMPOSSIBLE_TO_CLEAR_CACHE, e);
	    } catch (IllegalArgumentException e) {
	    	Activator.getDefault().getLog().error(IMPOSSIBLE_TO_CLEAR_CACHE, e);
	    } catch (InvocationTargetException e) {
	    	Activator.getDefault().getLog().error(IMPOSSIBLE_TO_CLEAR_CACHE, e);
	    }
	  }
	}
