/*******************************************************************************
 * Copyright (c) 2019, 2020 THALES GLOBAL SERVICES.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales - initial API and implementation
 ******************************************************************************/

package org.polarsys.capella.docgen.util;

import java.util.Comparator;
import java.util.Vector;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.MutableTreeNode;

/**
 * 
 * @author Arnaud Dieumegard
 */
@SuppressWarnings("serial")
public class SortedTreeNode extends DefaultMutableTreeNode {
	
    /** Force type of children */
    protected Vector<DefaultMutableTreeNode> children;
	
	private final Comparator<DefaultMutableTreeNode> comparator;
	
	public SortedTreeNode(Comparator<DefaultMutableTreeNode> comparator) {
		super();
		this.comparator = comparator;
	}
	
	public SortedTreeNode(Object userObject, Comparator<DefaultMutableTreeNode> comparator) {
		super(userObject);
		this.comparator = comparator;
	}
	
	public SortedTreeNode(Object userObject, boolean allowsChildren, Comparator<DefaultMutableTreeNode> comparator) {
		super(userObject, allowsChildren);
		this.comparator = comparator;
	}
	
	@Override
	public void add(MutableTreeNode newChild) {
		super.add(newChild);
		if (this.comparator != null && this.children != null) {
			this.children.sort(this.comparator);
		}
	}

}
