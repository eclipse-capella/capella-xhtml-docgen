package org.polarsys.capella.docgen.util;

import java.util.Collections;
import java.util.Comparator;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.MutableTreeNode;

/**
 * 
 * @author Arnaud Dieumegard
 */
@SuppressWarnings("serial")
public class SortedTreeNode<T> extends DefaultMutableTreeNode {
	
	private final Comparator<T> comparator;
	
	public SortedTreeNode(Comparator<T> comparator) {
		super();
		this.comparator = comparator;
	}
	
	public SortedTreeNode(Object userObject, Comparator<T> comparator) {
		super(userObject);
		this.comparator = comparator;
	}
	
	public SortedTreeNode(Object userObject, boolean allowsChildren, Comparator<T> comparator) {
		super(userObject, allowsChildren);
		this.comparator = comparator;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void add(MutableTreeNode newChild) {
		super.add(newChild);
		if (this.comparator != null) {
			Collections.sort(this.children, this.comparator);
		}
	}

}
