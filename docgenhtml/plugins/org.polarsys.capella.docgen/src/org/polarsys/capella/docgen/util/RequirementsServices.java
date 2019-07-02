/*******************************************************************************
 * Copyright (c) 2019 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales - initial API and implementation
 ******************************************************************************/

package org.polarsys.capella.docgen.util;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.swing.tree.DefaultMutableTreeNode;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.core.data.requirement.Requirement;
import org.polarsys.capella.core.data.requirement.RequirementsPkg;

/**
 * 
 * @author Arnaud Dieumegard
 */
public class RequirementsServices {
	
	public static final String REQUIREMENT_TREE_ID = "requirementTreeView";
	
	/**
	 * Retrieve an HTML list representation for the <code>appliedReq</code> requirements including their complete <code>RequirementPkg</code> hierarchy
	 * @param appliedReq
	 * @param projectName
	 * @param outputFolder
	 * @return
	 */
	public static String getRequirementsTree(EList<Requirement> appliedReq, String projectName, String outputFolder) {
		StringBuilder sb = new StringBuilder();
		
		DefaultMutableTreeNode tree = buildRequirementsTree(appliedReq);
		
		sb.append("<ul id=\"").append(REQUIREMENT_TREE_ID).append("\" class=\"treeview\">");
		sb.append(printRequirementsTree(tree, projectName, outputFolder));
		sb.append(CapellaServices.UL_CLOSE);
		
		return sb.toString();
	}
	
	/**
	 * Builds a tree of <code>Requirement</code> objects as leafs and <code>RequirementPkg</code> objects as nodes
	 * @param appliedReq
	 * @return
	 */
	private static DefaultMutableTreeNode buildRequirementsTree(EList<Requirement> appliedReq) {
		DefaultMutableTreeNode tree = new DefaultMutableTreeNode();
		
		// build the list of requirement packages involved
		Map<RequirementsPkg, DefaultMutableTreeNode> reqPkgToTreeNodeMap = new HashMap<RequirementsPkg, DefaultMutableTreeNode>();
		for (Requirement req : appliedReq){
			DefaultMutableTreeNode currentNode = new DefaultMutableTreeNode(req);
			EObject parent = req.eContainer();
			boolean hasFoundParent = false;
			while (parent instanceof RequirementsPkg) {
				DefaultMutableTreeNode pkgNode = reqPkgToTreeNodeMap.get(parent);
				// Build parent node if not yet created
				if (pkgNode == null) {
					pkgNode = new DefaultMutableTreeNode(parent);
					reqPkgToTreeNodeMap.put((RequirementsPkg) parent, pkgNode);
				} else {
					hasFoundParent = true;
				}
				// Add element
				pkgNode.add(currentNode);
				
				// Go one level up
				currentNode = pkgNode;
				parent = parent.eContainer();
				if (hasFoundParent) {
					break;
				}
			}
			if (!hasFoundParent) {
				tree.add(currentNode);
			}
		}
		return tree;
	}
	
	/**
	 * Prints tree elements as a bullet list. Does not print the root element.
	 * @param tree A tree of EObjects
	 * @param projectName
	 * @param outputFolder
	 * @return
	 */
	private static String printRequirementsTree(DefaultMutableTreeNode tree, String projectName, String outputFolder) {
		StringBuilder sb = new StringBuilder();
		
		Enumeration<?> childs = tree.children();
		// Loop over root elements
		if (childs instanceof Enumeration) {
			while (childs.hasMoreElements()) {
				Object element = childs.nextElement(); 
				if (element instanceof DefaultMutableTreeNode) {
					DefaultMutableTreeNode node = (DefaultMutableTreeNode) element;
					if (node.getUserObject() instanceof EObject) {
						EObject obj = (EObject) node.getUserObject();
						sb.append(CapellaServices.LI_OPEN);
						sb.append(CapellaServices.buildHyperlinkWithIcon(projectName, outputFolder, obj));
						if (obj instanceof RequirementsPkg) {
							sb.append(CapellaServices.UL_OPEN_SIMPLE);
							sb.append(printRequirementsTree(node, projectName, outputFolder));
							sb.append(CapellaServices.UL_CLOSE);
						}
						sb.append(CapellaServices.LI_CLOSE);
					}
				}
			}
		}
		
		return sb.toString();
	}

}
