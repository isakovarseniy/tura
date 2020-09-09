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

package org.tura.platform.uuiclient.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.repository.core.ObjectControl;
import org.tura.platform.uuiclient.model.tree.TreeNode;

public abstract class TreeObjectExtractor {

	@SuppressWarnings("unchecked")
	public void reverseWalk(List<String> keys, List<Map<String, Object>> nodeList, List<Map<String, Object>> result) {
		if (nodeList == null) {
			return;
		}

		for (Map<String, Object> hashNode : nodeList) {
			String key = (String) hashNode.get("key");

			if (key != null) {
				if (keys.contains(key)) {
					result.add(hashNode);
				}
			}
			List<Map<String, Object>> children = (List<Map<String, Object>>) hashNode.get("children");
			reverseWalk(keys, children, result);
		}
	}

	public Map<String, Object> beginWalk(ELResolver elResolver, TreeNode node, SelectionIndicator indicator,
			Object callback, Map<String, Boolean> expandedNodes, Object selected, TreeType treeType, TreeModel model)
			throws Exception {

		Map<String, Object> map = walk(elResolver, node, indicator, callback, expandedNodes, selected, treeType, model);
		model.setExpandedNodes(null);
		return map;

	}

	@SuppressWarnings("unchecked")
	private Map<String, Object> walk(ELResolver elResolver, TreeNode node, SelectionIndicator indicator, Object callback,
			Map<String, Boolean> expandedNodes, Object selected, TreeType treeType, TreeModel model) throws Exception {

		Object data = node.getData();
		Map<String, Object> hashNode = new HashMap<String, Object>();
		GridModelTriggers triggers = (GridModelTriggers) callback;

		if (!(node.isRoot())) {
			ObjectControl oc = (ObjectControl) data;
			hashNode = (Map<String, Object>) extract(elResolver, oc);
			String type = oc.getWrappedObject().getClass().getName();
			String key = model.stringify(node.getPath());
			hashNode.put("key", key);
			hashNode.put("type", type);
			hashNode.put("leaf", false);
			hashNode.put("objKey", oc.getKey());

			if (triggers != null) {
				triggers.customizeObject(node, hashNode);
			}

			if (node.isExpanded()) {
				expandedNodes.put(key, true);
			} else {
				if (model.getExpandedNodes() != null) {
					if (model.getExpandedNodes().contains(key)) {
						model.onNodeExpand(node, node.getPath());
						if (node.isExpanded()) {
							expandedNodes.put(key, true);
						}
					}
				}
			}
		}

		ArrayList<Map<String, Object>> children = new ArrayList<Map<String, Object>>();

		int selectedChildren = 0;
		int partialSelectedChildren = 0;

		for (String rel : node.getRelations()) {
			for (TreeNode child : node.getChildren(rel)) {
				if ( child == null) {
					continue;
				}
				SelectionIndicator selection = new SelectionIndicator();
				children.add(walk(elResolver, child, selection, callback, expandedNodes, selected, treeType, model));
				if (selection.checked) {
					selectedChildren++;
				}
				if (selection.partialChecked) {
					partialSelectedChildren++;
				}
			}
		}

		if ( TreeType.CheckBox.equals(treeType)) {
			processCheckBoxSelect(selectedChildren, partialSelectedChildren, indicator, (Map<String, Object>) selected,
					node, hashNode, children);
		}

		if (TreeType.Multiple.equals(treeType)) {
			processMultipleSelect(indicator, (Map<String, Object>) selected, node, hashNode);
		}

		hashNode.put("children", children);

		return hashNode;
	}

	private void processMultipleSelect(SelectionIndicator indicator, Map<String, Object> selected, TreeNode node,
			Map<String, Object> hashNode) {

		if (selected.keySet().contains(hashNode.get("key"))) {
			if (indicator != null) {
				indicator.checked = true;
			}
			if  ((String) hashNode.get("key") != null ) {
			   selected.put((String) hashNode.get("key"), true);
			}
		}

	}

	private void processCheckBoxSelect(int selectedChildren, int partialSelectedChildren, SelectionIndicator indicator,
			Map<String, Object> selected, TreeNode node, Map<String, Object> hashNode,
			ArrayList<Map<String, Object>> children) {

		Map<String, Object> checked = new HashMap<String, Object>();
		if ((selectedChildren != 0 && partialSelectedChildren != 0) || (selectedChildren != 0
				&& selectedChildren != node.getChildrenCount() && partialSelectedChildren == 0)
				|| (selectedChildren == 0 && partialSelectedChildren != 0)) {
			checked.put("checked", false);
			checked.put("partialChecked", true);
			if (indicator != null) {
				indicator.partialChecked = true;
			}
			if  ((String) hashNode.get("key") != null ) {
			   selected.put((String) hashNode.get("key"), checked);
			}
		}

		if (selectedChildren != 0 && selectedChildren == node.getChildrenCount() && partialSelectedChildren == 0) {
			checked.put("checked", true);
			checked.put("partialChecked", false);
			if (indicator != null) {
				indicator.checked = true;
			}
			if  ((String) hashNode.get("key") != null ) {
			   selected.put((String) hashNode.get("key"), checked);
			}
		}

		if (children.size() == 0) {
			if (selected.keySet().contains(hashNode.get("key"))) {
				checked.put("checked", true);
				checked.put("partialChecked", false);
				if (indicator != null) {
					indicator.checked = true;
				}
				if  ((String) hashNode.get("key") != null ) {
				    selected.put((String) hashNode.get("key"), checked);
				}
			}
		}
		if (children.size() != 0 && selectedChildren == 0 && partialSelectedChildren == 0
				&& selected.keySet().contains(hashNode.get("key"))) {
			for (Map<String, Object> child : children) {
				force(child, selected);
			}
			checked.put("checked", true);
			checked.put("partialChecked", false);
			if (indicator != null) {
				indicator.checked = true;
			}
			if  ((String) hashNode.get("key") != null ) {
			   selected.put((String) hashNode.get("key"), checked);
			}
		}

	}

	@SuppressWarnings("unchecked")
	private void force(Map<String, Object> nodeHash, Map<String, Object> selected) {
		List<Map<String, Object>> children = (List<Map<String, Object>>) nodeHash.get("children");
		String key = (String) nodeHash.get("key");
		Map<String, Object> checked = new HashMap<String, Object>();
		checked.put("checked", true);
		checked.put("partialChecked", false);
		if  (key != null ) {
		    selected.put(key, checked);
		}

		for (Map<String, Object> child : children) {
			force(child, selected);
		}

	}

	public abstract Object extract(ELResolver elResolver, Object obj) throws Exception;

	private class SelectionIndicator {
		boolean checked;
		boolean partialChecked;
	}

}
