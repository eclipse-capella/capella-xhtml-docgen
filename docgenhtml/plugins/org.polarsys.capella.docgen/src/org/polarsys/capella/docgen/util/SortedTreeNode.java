/*******************************************************************************
 * Copyright (c) 2019, 2021 THALES GLOBAL SERVICES.
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

/**
 * 
 * @author Arnaud Dieumegard
 */
@SuppressWarnings("serial")
public class SortedTreeNode extends DefaultMutableTreeNode {

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
	/**
	 * Override insert method to ensure ordering of elements. Actual insert is done
	 * by the parent method but {@code childIndex} is replaced by a computed value.
	 */
	public void insert(MutableTreeNode newChild, int childIndex) {
		int insertIndex = 0;
		// Check limit cases
		if (this.children == null || this.children.size() == 0) {
			super.insert(newChild, insertIndex);
			return;
		}

		// Compute the {@code insertIndex} value by dichotomy.
		// Keeping track of a min and max index between which {@code newChild} is to be inserted.
		int minIndex = 0;
		int maxIndex = this.children.size();
		boolean found = false;
		while (!found) {
			// Compute insertIndex (here it is equal to the middle of the remaining elements).
			insertIndex = minIndex + ((maxIndex - minIndex) / 2);
			// Compare with element located at insertIndex
			int compareResult = this.comparator.compare((DefaultMutableTreeNode) newChild,
					(DefaultMutableTreeNode) this.children.get(insertIndex));
			if (compareResult == 0) {
				// If equal then this is good
				found = true;
			} else if (compareResult < 0) {
				// If smaller
				if (insertIndex == maxIndex) {
					// min and max are so close that rounding the index value gives the same value
					// So we have found but newChild should be inserted before
					found = true;
					insertIndex = minIndex;
				} else {
					// Narrow the max index
					maxIndex = insertIndex;
				}
			} else {
				if (insertIndex == minIndex) {
					// min and max are so close that rounding the index value gives the same value
					// So we have found but newChild should be inserted after
					found = true;
					insertIndex = maxIndex;
				}
				// Narrow the min index
				minIndex = insertIndex;
			}
			if (maxIndex == minIndex) {
				insertIndex = minIndex;
				found = true;
			}
		}
		// insert using standard code
		super.insert(newChild, insertIndex);
	}

}
