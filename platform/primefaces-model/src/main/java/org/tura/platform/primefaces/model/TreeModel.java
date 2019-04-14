/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2019, Arseniy Isakov
 *
 * This project includes software developed by Arseniy Isakov
 * http://sourceforge.net/p/tura/wiki/Home/
 *
 * Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.tura.platform.primefaces.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.lang.exception.ExceptionUtils;
import org.primefaces.event.NodeCollapseEvent;
import org.primefaces.event.NodeExpandEvent;
import org.primefaces.event.NodeSelectEvent;
import org.primefaces.event.NodeUnselectEvent;
import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.TreeNode;
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

public class TreeModel {

    private TreeNode root;
    private TreeNode currentNode;
    private List<TreeNode> selectedList;
    private TreeDataControl dc;
    private Logger logger;
    @SuppressWarnings("unused")
	private Object callback;

    public TreeModel(TreeDataControl dc, Logger logger, Object callback) {
        this.dc = dc;
        dc.addEventLiteners(new RecordListener());
        this.logger = logger;
        this.callback = callback;
    }

    @SuppressWarnings("rawtypes")
    public TreeNode getRoot() throws Exception {
        if (root == null) {
            root = new DefaultTreeNode(new Root(), null);

            dc.setCurrentPosition(new TreePath[] { new TreePath(null, 0) });

            if (!dc.isBlocked()) {
                List scroler = ((DataControl) dc.getRoot()).getScroller();
                String relation = "";
                if (dc.getParent() != null)
                    relation = dc.getParent().getName();
                for (int i = 0; i < scroler.size(); i++) {
                    DefaultTreeNode leaf = new DefaultTreeNode(
                            new Object[] { new TreePath(relation, i), scroler.get(i) }, root);
                    new DefaultTreeNode(new Fake(), leaf);
                }

                if (root.getChildren().size() != 0 && !(root.getChildren().get(0).getData() instanceof Fake)) {
                    currentNode = root.getChildren().get(0);
                    currentNode.setSelected(true);
                }
            }
        }

        return root;
    }

    public TreeNode getSelectedNode() {
        return currentNode;
    }

    public void setSelectedNode(TreeNode selectedNode) throws Exception {
        this.currentNode = selectedNode;

    }


    public TreeNode[] getMultipleSelectedNode() {
        if ( selectedList == null) {
            return null;
        }
        return selectedList.toArray(new TreeNode[selectedList.size()]);
    }

    public void setMultipleSelectedNode(TreeNode[] selectedList) throws Exception {
        if ( selectedList != null) {
           this.selectedList = Arrays.asList( selectedList);
        }

    }
    
    
    @SuppressWarnings("rawtypes")
    public void onNodeExpand(NodeExpandEvent event) throws Exception {
        org.primefaces.component.tree.Tree object = (org.primefaces.component.tree.Tree) event.getSource();
        TreeNode expnode = object.getRowNode();

        Object[] data = (Object[]) expnode.getData();
        Object obj = data[1];

        IDataControl curdc = (DataControl<?>) ((ObjectControl) obj).getAttributes().get(Constants.DATA_CONTROL);

        expnode.getChildren().clear();

        for (String relationName : curdc.getRelationsName()) {
            curdc.createChild(relationName);
            IDataControl chdc = curdc.getChild(relationName).getChild();

            List scroler = ((DataControl) chdc).getScroller();
            for (int i = 0; i < scroler.size(); i++) {
                DefaultTreeNode leaf = new DefaultTreeNode(
                        new Object[] { new TreePath(relationName, i), scroler.get(i) }, expnode);
                new DefaultTreeNode(new Fake(), leaf);
            }
        }

    }


    public void onNodeCollapse(NodeCollapseEvent event) {
        org.primefaces.component.tree.Tree object = (org.primefaces.component.tree.Tree) event.getSource();
        TreeNode collapseNode = object.getRowNode();

        collapseNode.getChildren().clear();
        new DefaultTreeNode(new Fake(), collapseNode);
        collapseNode.setExpanded(false);

    }

    public void onNodeSelect(NodeSelectEvent event) throws Exception {
        org.primefaces.component.tree.Tree object = (org.primefaces.component.tree.Tree) event.getSource();
        TreeNode expnode = object.getRowNode();
        setSelected(expnode);
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
            if (event instanceof MasterRowChangedEvent && event.getSource() instanceof TreeDataControl) {
                root = null;
            }
            if (event instanceof ControlRefreshedEvent && event.getSource() instanceof TreeDataControl) {
                root = null;
            }
            if (event instanceof ControlRallbackEvent && event.getSource() instanceof DataControl) {
                root = null;
            }
            if (event instanceof RowCreatedEvent && event.getSource() instanceof TreeDataControl) {
                try {
                    TreeNode parent = null;

                    Object newRow = ((RowCreatedEvent) event).getRow();
                    DataControl<?> newDC = (DataControl<?>) ((ObjectControl) newRow).getAttributes()
                            .get(Constants.DATA_CONTROL);

                    if (currentNode == null) {
                        parent = root;
                    } else {

                        Object[] data = (Object[]) currentNode.getData();
                        Object obj = data[1];
                        DataControl<?> currentDc = (DataControl<?>) ((ObjectControl) obj).getAttributes()
                                .get(Constants.DATA_CONTROL);

                        if (currentDc.getId().equals(newDC.getId()))
                            parent = currentNode.getParent();
                        else
                            parent = currentNode;
                    }

                    parent.setExpanded(true);
                    parent.getChildren().clear();
                    List<?> scroler = newDC.getScroller();

                    String relation = "";
                    if (newDC.getParent() != null)
                        relation = newDC.getParent().getName();

                    for (int i = 0; i < scroler.size(); i++) {
                        DefaultTreeNode leaf = new DefaultTreeNode(
                                new Object[] { new TreePath(relation, i), scroler.get(i) }, parent);
                        if (currentNode == null)
                            currentNode = leaf;
                        new DefaultTreeNode(new Fake(), leaf);
                    }

                    TreePath[] p = getPath(currentNode);
                    event.getSource().setCurrentPosition(p);
                    currentNode.setSelected(true);
                    setSelected(currentNode);
                } catch (Exception e) {
                    logger.log(Level.SEVERE, ExceptionUtils.getFullStackTrace(e));
                }
            }
            if (event instanceof RowRemovedEvent && event.getSource() instanceof TreeDataControl) {
                try {

                    if (currentNode == null || (currentNode != null && currentNode.getChildren() == null)
                            || (currentNode != null && currentNode.getChildren().size() == 0)
                            || (currentNode != null && currentNode.getChildren().get(0).getData() instanceof Root)) {
                        return;
                    }

                    TreePath[] p = getPath(currentNode);

                    TreeNode parent = currentNode.getParent();
                    parent.setExpanded(true);
                    parent.getChildren().clear();

                    Object[] data = (Object[]) currentNode.getData();
                    Object obj = data[1];

                    DataControl<?> currentDc = (DataControl<?>) ((ObjectControl) obj).getAttributes()
                            .get(Constants.DATA_CONTROL);

                    List<?> scroller = currentDc.getScroller();
                    String relation = "";
                    if (currentDc.getParent() != null)
                        relation = currentDc.getParent().getName();

                    for (int i = 0; i < scroller.size(); i++) {
                        DefaultTreeNode leaf = new DefaultTreeNode(
                                new Object[] { new TreePath(relation, i), scroller.get(i) }, parent);
                        new DefaultTreeNode(new Fake(), leaf);
                    }

                    cleanSelection(root);
                    if (parent.getChildren().size() == 0) {
                        p = Arrays.copyOf(p, p.length - 1);
                        parent.setSelected(true);
                        setSelected(parent);
                    } else {
                        int lastIndex = p[p.length - 1].getKey();
                        if (lastIndex == parent.getChildren().size()) {
                            lastIndex--;
                            p[p.length - 1].setKey(lastIndex);
                        }
                        parent.getChildren().get(lastIndex).setSelected(true);
                        setSelected(parent.getChildren().get(lastIndex));
                    }

                    if (parent.getChildren().size() == 0 && !(parent.getData() instanceof Root)) {
                        new DefaultTreeNode(new Fake(), parent);
                        parent.setExpanded(false);
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
    
    private void cleanSelection(TreeNode node) {
        for (TreeNode child : node.getChildren()) {
            child.setSelected(false);
            if (child.isExpanded()) {
                cleanSelection(child);
            }
        }
    }
    
    private void setSelected(TreeNode selectedNode) throws Exception {
        TreePath[] p = getPath(selectedNode);
        if (!compareArrays((TreePath[]) dc.getCurrentPosition(), p))
            dc.setCurrentPosition(p);
    }

    private TreePath[] getPath(TreeNode node) {

        TreeNode runner = node;
        List<TreePath> path = new ArrayList<TreePath>();
        while (true) {
            if (runner.getData() instanceof Root)
                break;
            Object[] data = (Object[]) runner.getData();
            path.add((TreePath) data[0]);
            if (runner.getParent() != null)
                runner = runner.getParent();
        }
        Collections.reverse(path);
        TreePath[] p = new TreePath[path.size()];

        for (int i = 0; i < path.size(); i++) {
            p[i] = path.get(i);
        }

        return p;
    }
    
}