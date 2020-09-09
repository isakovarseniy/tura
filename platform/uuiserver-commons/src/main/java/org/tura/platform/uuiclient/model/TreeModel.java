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

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.lang.exception.ExceptionUtils;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.EventListener;
import org.tura.platform.datacontrol.IDataControl;
import org.tura.platform.datacontrol.TreeDataControl;
import org.tura.platform.datacontrol.TreePath;
import org.tura.platform.datacontrol.commons.Constants;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.datacontrol.event.ControlRallbackEvent;
import org.tura.platform.datacontrol.event.ControlRefreshedEvent;
import org.tura.platform.datacontrol.event.Event;
import org.tura.platform.datacontrol.event.MasterRowChangedEvent;
import org.tura.platform.datacontrol.event.RowCreatedEvent;
import org.tura.platform.datacontrol.event.RowRemovedEvent;
import org.tura.platform.repository.core.ObjectControl;
import org.tura.platform.uuiclient.model.tree.TreeNode;
import org.tura.platform.uuiclient.model.tree.TreeProcessor;
import org.tura.platform.uuiclient.rest.EventDescription;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TreeModel implements Serializable {
	private static final long serialVersionUID = -6622372767066011622L;

private TreeNode root;
	private TreeNode currentNode;
	private List<List<TreePath>> selectedList;
	private List<TreePath> currentPath;
	private TreeDataControl dc;
	private transient Logger logger;
	private Object callback;
	private String modelId;
	private TreeNode contextSelectedNode;
	private List<String> expandedNodes;
	private int expandedNodesRefreshIterator;



	public TreeModel() {
	}
	
	
	public TreeModel(TreeDataControl dc,  Object callback,String modelId) {
		this.setModelId(modelId);
		this.dc = dc;
		dc.addEventLiteners(new RecordListener());
		this.callback = callback;
	}
	
	
	public List<String> getExpandedNodes() {
		return expandedNodes;
	}


	public void setExpandedNodes(List<String> expandedNodes) {
		this.expandedNodes = expandedNodes;
		expandedNodesRefreshIterator  = 0;
	}
	
	
	public TreeNode getContextSelectedNode() {
		return contextSelectedNode;
	}


	public void setContextSelectedNode(TreeNode contextSelectedNode) {
		this.contextSelectedNode = contextSelectedNode;
	}


	public Object getCallback() {
		return callback;
	}

	@SuppressWarnings("rawtypes")
	public TreeNode getRoot() throws Exception {
		if (root == null) {
			root = new TreeNode( null);

			dc.setCurrentPosition(new TreePath[] { new TreePath(null, 0) });

			if (!dc.isBlocked()) {
				List scroler = ((DataControl) dc.getRoot()).getScroller();
				String relation = "";
				if (dc.getParent() != null)
					relation = dc.getParent().getName();
				for (int i = 0; i < scroler.size(); i++) {
					
					root.addChild(relation, new TreeNode(scroler.get(i)) );
				}

				if (root.isExpanded() ) {
					String r = root.getRelations().iterator().next();
					setCurrentNode ( root.getChildren(r)[0]);
				}
			}
		}

		return root;
	}

	public List<TreePath> getSelectedNode() {
		return this.currentPath;
	}

	public void setSelectedNode(List<TreePath> currentPath) throws Exception {
		this.currentPath = currentPath;

	}

	public List<List<TreePath>> getMultipleSelectedNode() {
		return selectedList;
	}

	public void setMultipleSelectedNode(List<List<TreePath>> selectedList) throws Exception {
			this.selectedList = selectedList;
	}

	public void onNodeExpand(EventDescription event) throws Exception {
		TreeNode expnode = findNode(event);
		List<TreePath> path = findPath(event);
		onNodeExpand(expnode,path);
	}
	
	
	@SuppressWarnings("rawtypes")
	public void onNodeExpand(TreeNode expnode,List<TreePath> path) throws Exception {

		Object[] twoResult = dc.treeScaner(path.toArray(new TreePath[path.size()]));
		boolean success = (boolean) twoResult[1];
		if (!success) {
			return;
		}

		Object obj = twoResult[0];

		IDataControl curdc = (DataControl<?>) ((ObjectControl) obj).getAttributes().get(Constants.DATA_CONTROL);

		for (String relationName : curdc.getRelationsName()) {
			curdc.createChild(relationName);
			IDataControl chdc = curdc.getChild(relationName).getChild();

			List scroler = ((DataControl) chdc).getScroller();
			for (int i = 0; i < scroler.size(); i++) {
				expnode.addChild(relationName, new TreeNode(scroler.get(i))); 
			}
		}
	}
	
	public String stringify(List<TreePath> path) throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		return mapper.writeValueAsString(path);
	}


	public void onNodeCollapse(EventDescription event) throws Exception {
		TreeNode collapseNode = findNode(event);
		collapseNode.removeChildren();
	}

	public void onNodeSelect(EventDescription event) throws Exception {
		TreeNode expnode = findNode(event);
		setSelected(expnode);
	}

	public void onNodeUnselect(EventDescription event) {
	}
	
	
	

	@SuppressWarnings("unchecked")
	public List<TreePath> findPath(EventDescription event) throws Exception {
		Map<String, Object> map = (Map<String, Object>) event.findParameter("node").getValue();
		ObjectMapper mapper = new ObjectMapper();

		String json = (String) map.get("key");

		List<TreePath> path = mapper.readValue(json, new TypeReference<ArrayList<TreePath>>() {});
		return path;

	}


	public List<TreePath> findPath(String key) throws Exception {
		ObjectMapper mapper = new ObjectMapper();

		List<TreePath> path = mapper.readValue(key, new TypeReference<ArrayList<TreePath>>() {});
		return path;

	}
	
	
	private TreeNode findNode(EventDescription event) throws Exception {
		List<TreePath> path = findPath(event);
		return TreeProcessor.findNode(path, getRoot(), 0, path.size());
	}
	
	
	public TreeNode findNode(String key) throws Exception {
		List<TreePath> path = findPath(key);
		return TreeProcessor.findNode(path, getRoot(), 0, path.size());
	}
	

	public TreeNode getCurrentNode() {
		return currentNode;
	}

	public void setCurrentNode(TreeNode currentNode) {
		this.currentNode = currentNode;
		this.currentPath = this.currentNode.getPath();
	}

	

	class RecordListener implements EventListener , Serializable{
		private static final long serialVersionUID = -8314392353882578270L;

		@Override
		public void handleEventListener(Event event) throws TuraException {
			if (event instanceof MasterRowChangedEvent && event.getSource() instanceof TreeDataControl) {
				root = null;
				expandedNodes = null;
			}
			if (event instanceof ControlRefreshedEvent && event.getSource() instanceof TreeDataControl) {
				try {
						expandedNodes = TreeProcessor.collectExpandedNodes(getRoot());
						root = null;
				}catch(Exception e) {
					logger.log(Level.SEVERE, ExceptionUtils.getFullStackTrace(e));
				}
			}
			if (event instanceof ControlRallbackEvent && event.getSource() instanceof DataControl) {
				try {
					if (expandedNodesRefreshIterator == 0) {
						expandedNodes = TreeProcessor.collectExpandedNodes(getRoot());
						expandedNodesRefreshIterator++;
					}
						root = null;
				}catch(Exception e) {
					logger.log(Level.SEVERE, ExceptionUtils.getFullStackTrace(e));
				}
				
			}
			if (event instanceof RowCreatedEvent && event.getSource() instanceof TreeDataControl) {
				try {
					Object newRow = ((RowCreatedEvent) event).getRow();

					TreeDataControl tdc = (TreeDataControl) event.getSource();
					TreePath[] path =  (TreePath[]) tdc.getCurrentPosition();
					TreeNode newNode = new TreeNode(newRow);
					

					if (!((RowCreatedEvent)event).isChildObject()) {
						TreeProcessor.addNodeOnPosition(path, getRoot(), newNode);
					}
					else {
						TreeNode parentNode = TreeProcessor.findNode(path, getRoot(), 0, path.length);
						if ( parentNode.isExpanded()) {
							String relation = ((RowCreatedEvent)event).getRelationName();
							TreeProcessor.addNodeToParent(path, getRoot(), newNode,relation);
						}else {
							onNodeExpand(parentNode, parentNode.getPath());
						}
					}
					setCurrentNode(newNode);
					setSelected(getCurrentNode());


				} catch (Exception e) {
					logger.log(Level.SEVERE, ExceptionUtils.getFullStackTrace(e));
				}
			}
			if (event instanceof RowRemovedEvent && event.getSource() instanceof TreeDataControl) {
				try {

					TreePath[]  path = (TreePath[]) ((RowRemovedEvent) event).getPosition();
					TreeProcessor.removeNode(path, root);
					
					TreeNode node =  TreeProcessor.findNode(path, getRoot(), 0, path.length);
					if ( node ==  null ) {
						if ( path.length > 1 ) {
							node =  TreeProcessor.findNode(path, getRoot(), 0, path.length-1);
						}
						if ( node == null) {
							return;
						}
					}
					if ( node.getData()  != null) {
						setCurrentNode(node);
					}

				} catch (Exception e) {
					logger.log(Level.SEVERE, ExceptionUtils.getFullStackTrace(e));
				}

			}
		}

	}

	private boolean compareArrays(TreePath[] array1, TreePath[] array2) {
		boolean b = true;
		if (array1 != null && array2 != null) {
			if (array1.length != array2.length)
				b = false;
			else
				for (int i = 0; i < array2.length; i++) {
					if (!array2[i].equals(array1[i])) {
						b = false;
					}
				}
		} else {
			b = false;
		}
		return b;
	}


	private void setSelected(TreeNode selectedNode) throws Exception {
		TreePath[] p = getPath(selectedNode);
		if (!compareArrays((TreePath[]) dc.getCurrentPosition(), p)) {
			dc.setCurrentPosition(p);
			this.setCurrentNode(selectedNode);
		}
	}

	private TreePath[] getPath(TreeNode node) {
		return node.getPath().toArray(new TreePath[node.getPath().size()]);
	}

	public String getModelId() {
		return modelId;
	}

	public void setModelId(String modelId) {
		this.modelId = modelId;
	}

}