package org.tura.platform.primefaces.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.primefaces.event.NodeCollapseEvent;
import org.primefaces.event.NodeExpandEvent;
import org.primefaces.event.NodeSelectEvent;
import org.primefaces.event.NodeUnselectEvent;
import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.TreeNode;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.TreeDataControl;

public class TreeModel {

	private TreeNode root;
	private TreeNode selectedNode;
	private TreeDataControl dc;

	public TreeModel(TreeDataControl dc) {
		this.dc = dc;
	}

	@SuppressWarnings("rawtypes")
	public TreeNode getRoot() throws Exception {
		if (root == null) {
			root = new DefaultTreeNode("Root", null);

			dc.setCurrentPosition(new int[] { 0 });
			if (dc.getCurrentControl() != null) {
				List scroler = ((DataControl) dc.getCurrentControl())
						.getScroller();
				for (int i = 0; i < scroler.size(); i++) {
					new DefaultTreeNode(new Object[] { i, scroler.get(i) },
							root);
				}
			}
		}

		return root;
	}

	public TreeNode getSelectedNode() {
		return selectedNode;
	}

	public void setSelectedNode(TreeNode selectedNode) throws Exception {

		if (selectedNode == null)
			return;

		TreeNode runner = selectedNode;
		List<Integer> path = new ArrayList<Integer>();
		do {
			Object[] data = (Object[]) runner.getData();
			path.add((Integer) data[0]);
		} while (runner.getParent() != null);
		Collections.reverse(path);

		dc.setCurrentPosition(path.toArray(new Integer[path.size()]));

	}

	@SuppressWarnings("rawtypes")
	public void onNodeExpand(NodeExpandEvent event) throws Exception {
		org.primefaces.component.tree.Tree object = (org.primefaces.component.tree.Tree) event
				.getSource();
		TreeNode expnode = object.getRowNode();
		setSelectedNode(expnode);

		expnode.getChildren().clear();
		List scroler = ((DataControl) dc.getCurrentControl()).getScroller();
		for (int i = 0; i < scroler.size(); i++) {
			new DefaultTreeNode(new Object[] { i, scroler.get(i) }, expnode);
		}
	}

	public void onNodeCollapse(NodeCollapseEvent event) {
		org.primefaces.component.tree.Tree object = (org.primefaces.component.tree.Tree) event
				.getSource();
		TreeNode collapseNode = object.getRowNode();

		int i = collapseNode.getChildren().size();
		for (int j = 0; j < i; j++)
			collapseNode.getChildren().remove(0);

		collapseNode.setExpanded(false);

	}

	public void onNodeSelect(NodeSelectEvent event) throws Exception {
		org.primefaces.component.tree.Tree object = (org.primefaces.component.tree.Tree) event
				.getSource();
		TreeNode expnode = object.getRowNode();
		setSelectedNode(expnode);
	}

	public void onNodeUnselect(NodeUnselectEvent event) {
	}

}
