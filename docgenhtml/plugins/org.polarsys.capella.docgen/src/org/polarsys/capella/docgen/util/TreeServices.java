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

import java.util.Comparator;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.swing.tree.DefaultMutableTreeNode;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.business.api.query.DRepresentationQuery;
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.eclipse.sirius.table.metamodel.table.DTable;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.DRepresentationDescriptor;
import org.eclipse.sirius.viewpoint.description.RepresentationDescription;
import org.eclipse.sirius.viewpoint.description.Viewpoint;
import org.polarsys.capella.core.data.capellacore.NamedElement;
import org.polarsys.capella.core.data.cs.BlockArchitecture;
import org.polarsys.capella.core.data.requirement.Requirement;
import org.polarsys.capella.core.data.requirement.RequirementsPkg;
import org.polarsys.capella.docgen.diagram.CapellaHelper;

/**
 * A class providing methods to build trees of elements and to display them as html lists
 * 
 * @author Arnaud Dieumegard
 */
public class TreeServices {
	
	public static final String REQUIREMENT_TREE_ID = "requirementTreeView";
	public static final String DIAGRAMS_TREE_ID = "diagramsTreeView";
	
	/**
	 * A comparator for <code>Requirement</code> VS <code>RequirementsPkg</code> elements
	 */
	private static final Comparator<DefaultMutableTreeNode> requirementsComparator = new Comparator<DefaultMutableTreeNode>() {
		public int compare(DefaultMutableTreeNode arg0, DefaultMutableTreeNode arg1) {
			Object obj0 = arg0.getUserObject();
			Object obj1 = arg1.getUserObject();
			if (obj0 instanceof RequirementsPkg && obj1 instanceof Requirement) {
				return 1;
			} else if (obj0 instanceof Requirement && obj1 instanceof RequirementsPkg) {
				return -1;
			}
			if (obj0 instanceof NamedElement && obj1 instanceof NamedElement) {
				return ((NamedElement)obj0).getName().compareTo(((NamedElement)obj1).getName());	
			}
			return 0;
		};
	};
	
	/**
	 * A comparator for <code>DRepresentation</code> VS <code>Viewpoint</code> VS <code>RepresentationDescription</code> elements  
	 */
	private static final Comparator<DefaultMutableTreeNode> diagramsComparator = new Comparator<DefaultMutableTreeNode>() {
		public int compare(DefaultMutableTreeNode arg0, DefaultMutableTreeNode arg1) {
			Object obj0 = arg0.getUserObject();
			Object obj1 = arg1.getUserObject();
			String str0 = "";
			String str1 = "";
			if (obj0 instanceof DRepresentation) {
				DRepresentationQuery rep2descQuery = new DRepresentationQuery((DRepresentation)obj0);
		        DRepresentationDescriptor result = rep2descQuery.getRepresentationDescriptor();
		    	str0 = (result == null) ? "" : result.getName();
			} else if (obj0 instanceof Viewpoint){
				str0 = ((Viewpoint)obj0).getName();
			} else if (obj0 instanceof RepresentationDescription) {
				str0 = ((RepresentationDescription)obj0).getName();
			}
			if (obj1 instanceof DRepresentation) {
				DRepresentationQuery rep2descQuery = new DRepresentationQuery((DRepresentation)obj1);
		        DRepresentationDescriptor result = rep2descQuery.getRepresentationDescriptor();
		    	str1 = (result == null) ? "" : result.getName();
			} else if (obj1 instanceof Viewpoint){
				str1 = ((Viewpoint)obj1).getName();
			} else if (obj1 instanceof RepresentationDescription) {
				str1 = ((RepresentationDescription)obj1).getName();
			}
			return str0.compareTo(str1);
		};
	};
	
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
		SortedTreeNode tree = new SortedTreeNode(requirementsComparator);
		
		// build the list of already visited requirement packages
		Map<RequirementsPkg, SortedTreeNode> reqPkgToTreeNodeMap = new HashMap<RequirementsPkg, SortedTreeNode>();
		for (Requirement req : appliedReq){
			SortedTreeNode currentNode = new SortedTreeNode(req, requirementsComparator);
			EObject parent = req.eContainer();
			boolean hasFoundParent = false;
			while (parent instanceof RequirementsPkg) {
				SortedTreeNode pkgNode = reqPkgToTreeNodeMap.get(parent);
				// Build parent node if not yet created
				if (pkgNode == null) {
					pkgNode = new SortedTreeNode(parent, requirementsComparator);
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
	 * 
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
	
	/**
	 * Retrieve an HTML list representation for the <code>appliedReq</code> requirements including their complete <code>RequirementPkg</code> hierarchy
	 * 
	 * @param appliedReq
	 * @param projectName
	 * @param outputFolder
	 * @return
	 */
	public static String getDiagramsTree(BlockArchitecture archi, String projectName, String outputFolder) {
		StringBuilder sb = new StringBuilder();
		
		DefaultMutableTreeNode tree = buildDiagramsTree(archi);
		
		sb.append("<ul id=\"").append(DIAGRAMS_TREE_ID).append("\" class=\"treeview\">");
		sb.append(printDiagramsTree(tree, projectName, outputFolder));
		sb.append(CapellaServices.UL_CLOSE);
		
		return sb.toString();
	}
	
	/**
	 * Builds a tree containing <code>Viewpoint</code> objects as top nodes, <code>RepresentationDescription</code> objects as middle nodes, and <code>DRepresentation</code> objects as leafs
	 * 
	 * @param archi
	 * @return
	 */
	private static DefaultMutableTreeNode buildDiagramsTree(BlockArchitecture archi) {
		SortedTreeNode tree = new SortedTreeNode(diagramsComparator);
		
		Map<RepresentationDescription, SortedTreeNode> repDescToTreeNodeMap = new HashMap<RepresentationDescription, SortedTreeNode>();
		Map<Viewpoint, SortedTreeNode> vpToTreeNodeMap = new HashMap<Viewpoint, SortedTreeNode>();
		
		// Get all representations
		for (DRepresentation rep : CapellaHelper.getAllDiagramsIn(archi)) {
			// Get description
			RepresentationDescription description = null;
			if (rep instanceof DSemanticDiagram) {
				EObject target = ((DSemanticDiagram) rep).getTarget();
				if (!CapellaHelper.exportRefToDiagram(rep, target)) {
					continue;
				}
				description = ((DSemanticDiagram) rep).getDescription();
			} else if (rep instanceof DTable) {
				EObject target = ((DTable) rep).getTarget();
				if (!CapellaHelper.exportRefToDiagram(rep, target)) {
					continue;
				}
				description = ((DTable) rep).getDescription();
			} else {
				break;
			}
			
			// Get Viewpoint
			Viewpoint vp = (Viewpoint) description.eContainer();
			
			// Get description node
			SortedTreeNode descNode = repDescToTreeNodeMap.get(description);
			if (descNode == null) {
				descNode = new SortedTreeNode(description, diagramsComparator);
				repDescToTreeNodeMap.put(description, descNode);
			}
			
			// Get viewpoint node
			SortedTreeNode vpNode = vpToTreeNodeMap.get(vp);
			if (vpNode == null) {
				vpNode = new SortedTreeNode(vp, diagramsComparator);
				vpToTreeNodeMap.put(vp, vpNode);
			}
			
			// Build representation node
			SortedTreeNode repNode = new SortedTreeNode(rep, diagramsComparator);
			
			// Add nodes to tree
			if (!tree.isNodeChild(vpNode)) {
				tree.add(vpNode);
			}
			if (!vpNode.isNodeChild(descNode)) {
				vpNode.add(descNode);
			}
			descNode.add(repNode);
		}
		return tree;
	}
	
	/**
	 * 
	 * 
	 * @param tree
	 * @param projectName
	 * @param outputFolder
	 * @return
	 */
	private static String printDiagramsTree(DefaultMutableTreeNode tree, String projectName, String outputFolder) {
		StringBuilder sb = new StringBuilder();

		Enumeration<?> childs = tree.children();
		if (childs instanceof Enumeration) {
			while (childs.hasMoreElements()) {
				sb.append(CapellaServices.LI_OPEN);
				Object element = childs.nextElement();
				if (element instanceof DefaultMutableTreeNode) {
					DefaultMutableTreeNode node = (DefaultMutableTreeNode) element;
					if (node.getUserObject() instanceof EObject) {
						EObject obj = (EObject) node.getUserObject();
						if (obj instanceof Viewpoint) {
							Viewpoint vp = (Viewpoint) obj;
							sb.append(CapellaServices.getImageLinkFromElement(vp, projectName, outputFolder));
							sb.append(CapellaServices.getHyperlinkFromElement(vp, vp.getName()));
							sb.append(CapellaServices.UL_OPEN_SIMPLE);
							sb.append(printDiagramsTree(node, projectName, outputFolder));
							sb.append(CapellaServices.UL_CLOSE);
						} else if (obj instanceof RepresentationDescription) {
							RepresentationDescription description = (RepresentationDescription) obj;
							sb.append(CapellaServices.getImageLinkFromElement(description, projectName, outputFolder));
							sb.append(description.getName());
							sb.append(CapellaServices.UL_OPEN_SIMPLE);
							sb.append(printDiagramsTree(node, projectName, outputFolder));
							sb.append(CapellaServices.UL_CLOSE);
						} else if (obj instanceof DRepresentation) {
							DRepresentation rep = (DRepresentation) obj;
							sb.append(CapellaServices.getImageLinkFromElement(rep, projectName, outputFolder));

							DRepresentationQuery rep2descQuery = new DRepresentationQuery(rep);
					        DRepresentationDescriptor result = rep2descQuery.getRepresentationDescriptor();
					    	sb.append(CapellaServices.getHyperlinkFromElement(rep, (result == null) ? "" : result.getName()));
						}
					}
				}
				sb.append(CapellaServices.LI_CLOSE);
			}
		}
		return sb.toString();
	}

}
