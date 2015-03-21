package org.tura.platform.primefaces.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

import org.primefaces.event.NodeCollapseEvent;
import org.primefaces.event.NodeExpandEvent;
import org.primefaces.event.NodeSelectEvent;
import org.primefaces.event.NodeUnselectEvent;
import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.TreeNode;
import org.tura.platform.datacontrol.BeanWrapper;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.EventListener;
import org.tura.platform.datacontrol.IDataControl;
import org.tura.platform.datacontrol.TreeDataControl;
import org.tura.platform.datacontrol.commons.Reflection;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.datacontrol.event.ControlRallbackEvent;
import org.tura.platform.datacontrol.event.Event;
import org.tura.platform.datacontrol.event.MasterRowChangedEvent;
import org.tura.platform.datacontrol.event.RowCreatedEvent;
import org.tura.platform.datacontrol.event.RowRemovedEvent;

public class TreeModel {

	private TreeNode root;
	private TreeNode selectedNode;
	private TreeDataControl dc;
	private Logger logger;


	public TreeModel(TreeDataControl dc, Logger logger) {
		this.dc = dc;
		dc.addEventLiteners(new RecordListener());
		this.logger = logger;
	}

	@SuppressWarnings("rawtypes")
	public TreeNode getRoot() throws Exception {
		if (root == null) {
			root = new DefaultTreeNode(new Root(), null);

			dc.setCurrentPosition(new int[] { 0 });
			List scroler = ((DataControl) dc.getRoot()).getScroller();
			for (int i = 0; i < scroler.size(); i++) {
				DefaultTreeNode leaf = new DefaultTreeNode(new Object[] { i,
						scroler.get(i) }, root);
				new DefaultTreeNode(new Fake(), leaf);
			}

			if (root.getChildren().size() != 0
					&& !(root.getChildren().get(0).getData() instanceof Fake)) {
				selectedNode = root.getChildren().get(0);
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
		this.selectedNode = selectedNode;

		int[] p = getPath(selectedNode);
		if (!compareArrays((int[]) dc.getCurrentPosition(), p))
			dc.setCurrentPosition(p);

	}

	private int[] getPath(TreeNode node) {

		TreeNode runner = node;
		List<Integer> path = new ArrayList<Integer>();
		while (true) {
			if (runner.getData() instanceof Root)
				break;
			Object[] data = (Object[]) runner.getData();
			path.add((Integer) data[0]);
			if (runner.getParent() != null)
				runner = runner.getParent();
		}
		Collections.reverse(path);
		int[] p = new int[path.size()];

		for (int i = 0; i < path.size(); i++) {
			p[i] = path.get(i).intValue();
		}

		return p;
	}

	@SuppressWarnings("rawtypes")
	public void onNodeExpand(NodeExpandEvent event) throws Exception {
		org.primefaces.component.tree.Tree object = (org.primefaces.component.tree.Tree) event
				.getSource();
		TreeNode expnode = object.getRowNode();
		setSelectedNode(expnode);

		Object[] data = (Object[]) expnode.getData();
		Object obj = data[1];

		BeanWrapper w = (BeanWrapper) Reflection.call(obj, "getWrapper");

		IDataControl curdc = w.getDatacontrol();

		expnode.getChildren().clear();

		for (String relationName : curdc.getRelationsName()) {
			curdc.createChild(relationName);
			IDataControl chdc = curdc.getChild(relationName).getChild();

			List scroler = ((DataControl) chdc).getScroller();
			for (int i = 0; i < scroler.size(); i++) {
				DefaultTreeNode leaf = new DefaultTreeNode(new Object[] { i,
						scroler.get(i) }, expnode);
				new DefaultTreeNode(new Fake(), leaf);
			}
		}

	}

	private boolean compareArrays(int[] array1, int[] array2) {
		boolean b = true;
		if (array1 != null && array2 != null) {
			if (array1.length != array2.length)
				b = false;
			else
				for (int i = 0; i < array2.length; i++) {
					if (array2[i] != array1[i]) {
						b = false;
					}
				}
		} else {
			b = false;
		}
		return b;
	}

	public void onNodeCollapse(NodeCollapseEvent event) {
		org.primefaces.component.tree.Tree object = (org.primefaces.component.tree.Tree) event
				.getSource();
		TreeNode collapseNode = object.getRowNode();

		collapseNode.getChildren().clear();
		new DefaultTreeNode(new Fake(), collapseNode);
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

	class Root {

	}

	class Fake {

	}

	class RecordListener implements EventListener {
		@Override
		public void handleEventListener(Event event) throws TuraException {
			if (event instanceof MasterRowChangedEvent
					&& event.getSource() instanceof TreeDataControl) {
				root = null;
			}
			if (event instanceof ControlRallbackEvent
					&& event.getSource() instanceof DataControl) {
				root = null;
			}
			if (event instanceof RowCreatedEvent
					&& event.getSource() instanceof TreeDataControl) {
				try {
					TreeNode parent = null;

					Object[] data = (Object[]) selectedNode.getData();
					Object obj = data[1];
					BeanWrapper w = ((BeanWrapper) Reflection.call(obj,
							"getWrapper"));
					DataControl<?> currentDc = w.getDatacontrol();

					Object newRow = ((RowCreatedEvent) event).getRow();
					w = ((BeanWrapper) Reflection.call(newRow, "getWrapper"));
					DataControl<?> newDC = w.getDatacontrol();

					if (selectedNode == null) {
						parent = root;
					} else {

						if (currentDc.getId().equals(newDC.getId()))
							parent = selectedNode.getParent();
						else
							parent = selectedNode;
					}

					parent.setExpanded(true);
					parent.getChildren().clear();
					List<?> scroler = newDC.getScroller();
					for (int i = 0; i < scroler.size(); i++) {
						DefaultTreeNode leaf = new DefaultTreeNode(
								new Object[] { i, scroler.get(i) }, parent);
						new DefaultTreeNode(new Fake(), leaf);
					}

					int[] p = getPath(selectedNode);
					event.getSource().setCurrentPosition(p);
					selectedNode.setSelected(true);
					setSelectedNode(selectedNode);
				} catch (Exception e) {
					logger.fine(e.getMessage());
				}
			}
			if (event instanceof RowRemovedEvent
					&& event.getSource() instanceof TreeDataControl) {
				try {

					if (selectedNode == null
							|| (selectedNode != null && selectedNode
									.getChildren().get(0).getData() instanceof Root)) {
						return;
					}

					int[] p = getPath(selectedNode);

					TreeNode parent = selectedNode.getParent();
					parent.setExpanded(true);
					parent.getChildren().clear();

					Object[] data = (Object[]) selectedNode.getData();
					Object obj = data[1];

					BeanWrapper w = ((BeanWrapper) Reflection.call(obj,
							"getWrapper"));
					DataControl<?> currentDc = w.getDatacontrol();
					List<?> scroller = currentDc.getScroller();

					for (int i = 0; i < scroller.size(); i++) {
						DefaultTreeNode leaf = new DefaultTreeNode(
								new Object[] { i, scroller.get(i) }, parent);
						new DefaultTreeNode(new Fake(), leaf);
					}

					cleanSelection(root);
					if (parent.getChildren().size() == 0) {
						p = Arrays.copyOf(p, p.length - 1);
						parent.setSelected(true);
						setSelectedNode(parent);
					} else {
						int lastIndex = p[p.length - 1];
						if (lastIndex == parent.getChildren().size()) {
							lastIndex--;
							p[p.length - 1] = lastIndex;
						}
						parent.getChildren().get(lastIndex).setSelected(true);
						setSelectedNode(parent.getChildren().get(lastIndex));
					}

					if (parent.getChildren().size() == 0) {
						new DefaultTreeNode(new Fake(), parent);
						parent.setExpanded(false);
					}

				} catch (Exception e) {
					logger.fine(e.getMessage());
				}

			}
		}

		private void cleanSelection(TreeNode node) {
			for (TreeNode child : node.getChildren()) {
				child.setSelected(false);
				if (child.isExpanded()) {
					cleanSelection(child);
				}
			}
		}
	}
}
