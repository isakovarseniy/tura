/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2020 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.tura.platform.uuiclient.model.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.tura.platform.datacontrol.TreePath;

import com.fasterxml.jackson.databind.ObjectMapper;

public class TreeProcessor {

	public static void addNodeOnPosition(TreePath[] nodeFullPath, TreeNode root, TreeNode node) {
		addNodeOnPosition(Arrays.asList(nodeFullPath), root, node);
	}

	public static void addNodeOnPosition(List<TreePath> nodeFullPath, TreeNode root, TreeNode node) {
		TreeNode parent = root;
		if (nodeFullPath.size() != 1 ) {
			parent = findNode(nodeFullPath, root, 0, nodeFullPath.size() - 1);
		}
		TreePath lastStep = nodeFullPath.get(nodeFullPath.size() - 1);
		parent.addChild(lastStep.getRelation(), node, lastStep.getKey());
	}

	public static void addNodeToParent(TreePath[] parentPath, TreeNode root, TreeNode node, String relation) {
		addNodeToParent(Arrays.asList(parentPath),root,node,relation);
	}
	
	public static void addNodeToParent(List<TreePath> parentPath, TreeNode root, TreeNode node, String relation) {
		TreeNode parent = findNode(parentPath, root, 0, parentPath.size() );
		parent.addChild(relation, node);
	}

	public static void addNodeToParentOnPosition(List<TreePath> parentPath, TreeNode root, TreeNode node,
			String relation, int position) {
		TreeNode parent = findNode(parentPath, root, 0, parentPath.size() );
		parent.addChild(relation, node, position);
	}


	public static boolean removeNode(TreePath[] path, TreeNode root) {
		return removeNode(Arrays.asList(path),root);
	}
	
	public static boolean removeNode(List<TreePath> path, TreeNode root) {
		TreeNode node = findNode(path, root, 0, path.size() );
		if (  node != null && node.getParent() != null ) {
			node.getParent().removeChild(node);
			return true;
		}
		return false;
	}	
	
	
	public static boolean removeNodeFromParent(List<TreePath> parentPath, TreeNode root, String key,
			DataExtractor extractor) {
		TreeNode parent = findNode(parentPath, root, 0, parentPath.size() );
		Map<Object, Object []> hash = new HashMap<Object, Object []>();
		for (String rel : parent.getRelations()) {
			for (int i = 0; i < parent.getChildren(rel).length; i++) {
				hash.put(extractor.extract(parent.getChildren(rel)[i].getData()), new Object[] {i,rel});
			}
		}
		if (hash.get(key) == null) {
			return false;
		}
		Object [] pointer = hash.get(key);
		TreeNode node = parent.getChildren((String)pointer[1]) [(int)pointer[0]];
		return parent.removeChild(node);
	}

	public static TreeNode findNode(TreePath[] path, TreeNode node, int step, int steps) {
		return findNode(Arrays.asList(path), node, step, steps);

	}

	public static TreeNode findNode(List<TreePath> path, TreeNode node, int step, int steps) {
		if (node  == null) {
			return null;
		}
		
		if (path == null) {
			throw new RuntimeException("Path cannot be null");
		}
		if (path.size() == 0) {
			return node;
		}

		if (path.size() == step) {
			throw new RuntimeException("Path to short");
		}
		
		TreePath p = path.get(step);

		TreeNode[] children = node.getChildren(p.getRelation());
		if (children == null) {
			return null;
		}
		
		TreeNode child = children[p.getKey()];
		if (steps -1 == step) {
			return child;
		} else {
			step++;
			return findNode(path, child, step, steps);
		}
	}

	public static String stringify(List<TreePath> path) throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		return mapper.writeValueAsString(path);
	}

	public static void collectExpandedNodes(TreeNode node, List<TreeNode> expanded) {
		if (node.isExpanded()) {
			expanded.add(node);
		}
		for (String relation : node.getRelations()) {
			for (TreeNode child : node.getChildren(relation)) {
				collectExpandedNodes(child, expanded);
			}
		}
	}

	public static List<String> collectExpandedNodes(TreeNode node) throws Exception {
		List<TreeNode> expanded = new ArrayList<TreeNode>();
		List<String> expandedPath = new ArrayList<String>();
		collectExpandedNodes(node, expanded);
		for (TreeNode n : expanded) {
			expandedPath.add(stringify(n.getPath()));
		}
		return expandedPath;
	}

}
