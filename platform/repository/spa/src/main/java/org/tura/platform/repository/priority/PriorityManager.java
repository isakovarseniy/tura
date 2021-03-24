/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.tura.platform.repository.priority;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.tura.platform.repository.core.ObjectGraph;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.platform.repository.spa.OperationLevel;
import org.tura.platform.repository.spa.SpaControl;

public class PriorityManager {
	private Map<String, RelationNode> hash = new HashMap<>();

	public List<SpaControl> buildTree(List<SpaControl> commands) {
		List<SpaControl> processed = new ArrayList<SpaControl>();

		List<String> list = new ArrayList<String>();
		for (SpaControl command : commands) {
			if (command.getLevel().equals(OperationLevel.LINK)) {
				processed.add(command);

				LinkControl control = (LinkControl) command;
				String link = control.getExtendedMasterPk().toString() + "-" + control.getExtendedDetailPk().toString();
				if (list.contains(link)) {
					continue;
				}
				list.add(link);
				link((LinkControl) command);
				continue;
			}
			if (command.getLevel().equals(OperationLevel.UNLINK)) {
				processed.add(command);

				unlink((LinkControl) command);
				continue;
			}
		}
		commands.removeAll(processed);
		return commands;
	}

	public static String getKey(SpaControl control) {
		return control.getType() + control.getKey().toString();
	}

	public static String getLinkedKey(String type, Object key) {
		return type + key.toString();
	}

	public void attachTree(List<SpaControl> commands) throws RepositoryException {
		Map<String, SpaControl> cmdhash = new HashMap<>();
		for (SpaControl command : commands) {
			cmdhash.put(getKey(command), command);
		}
		for (String key : hash.keySet()) {
			RelationNode node = hash.get(key);
			SpaControl command = cmdhash.get(key);
			if (command == null) {
				//No operation on master object. Just a link
//				throw new RepositoryException("Command cannot be null");
			}
			node.setCommand(command);
		}
	}
	
	
	public List<RelationNode> sort() {

		List<RelationNode> border = new ArrayList<>();
		for (RelationNode node : this.hash.values()) {
			if (node.getIncoming().size() == 0) {
				border.add(node);
			}
		}

		List<RelationNode> sequence = new ArrayList<>();
		ObjectGraph graph = new ObjectGraph();
		for (RelationNode node : border) {
			if (graph.exists(node.getId())) {
				continue;
			}
			walk(graph, sequence, node);
		}

		return sequence;
	}

	public void walk(ObjectGraph graph, List<RelationNode> sequence, RelationNode node) {
		if (!graph.addBranch(node.getId())) {
			return;
		}
		for (RelationNode n : node.getIncoming()) {
			walk(graph, sequence, n);
		}

		if (node.getCommand() != null &&  node.getCommand().getLevel().equals(OperationLevel.INSERT)) {
			sequence.add(node);
		}

		for (RelationNode n : node.getOutcoming()) {
			walk(graph, sequence, n);
		}
	}

	private void link(LinkControl control) {

		String key = getLinkedKey(control.getMasterType(), control.getMasterPk());
		RelationNode masterNode = hash.get(key);
		if (masterNode == null) {
			masterNode = new RelationNode(key);
			hash.put(getKey(control), masterNode);
		}

		key = getLinkedKey(control.getDetailType(), control.getDetailPk());
		RelationNode detailNode = hash.get(key);
		if (detailNode == null) {
			detailNode = new RelationNode(key);
			hash.put(key, detailNode);
		}

		masterNode.addOutcoming(detailNode,control,key);
	}

	private void unlink(LinkControl control) {
		String key = getLinkedKey(control.getMasterType(), control.getMasterPk());
		RelationNode masterNode = hash.get(key);
		if (masterNode == null) {
			return;
		}

		key = getLinkedKey(control.getDetailType(), control.getDetailPk());
		RelationNode detailNode = hash.get(key);
		if (detailNode == null) {
			return;
		}
		masterNode.removeOutcoming(detailNode,key);
	}

}
