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

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.MutableTreeNode;
import javax.swing.tree.TreeNode;

/**
 * 
 * @author Arnaud Dieumegard
 */
public class SortedTreeNode extends DefaultMutableTreeNode implements Comparable<DefaultMutableTreeNode> {

	private static final long serialVersionUID = 3662423933281010544L;
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
		if (this.comparator != null && this.children != null && newChild instanceof DefaultMutableTreeNode) {
			this.children.sort(new Comparator<TreeNode>() {
				public int compare(TreeNode o1, TreeNode o2) {
					return comparator.compare((DefaultMutableTreeNode) o1, (DefaultMutableTreeNode) o2);
				}
			});
		}
	}

	@Override
	public int compareTo(DefaultMutableTreeNode o) {
		return this.comparator.compare(this, o);
	}

}
