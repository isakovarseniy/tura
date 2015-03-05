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
import org.tura.platform.datacontrol.BeanWrapper;
import org.tura.platform.datacontrol.ChangeRecordListener;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.IDataControl;
import org.tura.platform.datacontrol.TreeDataControl;
import org.tura.platform.datacontrol.commons.Reflection;
import org.tura.platform.datacontrol.commons.TuraException;

public class TreeModel {

	private TreeNode root;
	private TreeNode selectedNode;
	private TreeDataControl dc;

	public TreeModel(TreeDataControl dc) {
		this.dc = dc;
		dc.addMusterCurrentRecordChageLiteners(new RecordListener());
	}

	@SuppressWarnings("rawtypes")
	public TreeNode getRoot() throws Exception {
		if (root == null) {
			root = new DefaultTreeNode(new Root(), null);

			dc.setCurrentPosition(new int[] { 0 });
				List scroler = ((DataControl) dc.getRoot())
						.getScroller();
				for (int i = 0; i < scroler.size(); i++) {
					DefaultTreeNode leaf = new DefaultTreeNode(new Object[] {
							i, scroler.get(i) }, root);
					new DefaultTreeNode(new Fake(), leaf);
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
		while (true) {
			if (runner.getData() instanceof Root)
				break;
			Object[] data = (Object[]) runner.getData();
			path.add((Integer) data[0]);
			if (runner.getParent() != null)
				runner = runner.getParent();
		}
		Collections.reverse(path);
		int [] p = new int[path.size()];
		
		for ( int i = 0 ; i < path.size(); i++   ){
			p[i] = path.get(i).intValue();
		}

		if (!compareArrays((int[]) dc.getCurrentPosition(), p))
		   dc.setCurrentPosition(p);

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

		IDataControl curdc =  w.getDatacontrol();

        expnode.getChildren().clear();
		
        for ( String relationName :  curdc.getRelationsName() ){
        	  curdc.createChild(relationName);
        	  IDataControl chdc =  curdc.getChild(relationName).getChild();
        	  
      		List scroler = ((DataControl) chdc).getScroller();
    		for (int i = 0; i < scroler.size(); i++) {
    			DefaultTreeNode leaf = new DefaultTreeNode(new Object[] { i, scroler.get(i) }, expnode);
    			new DefaultTreeNode(new Fake(), leaf);
    		}        	
        }

	}
	
	private  boolean  compareArrays(int[] array1, int[] array2) {
        boolean b = true;
        if (array1 != null && array2 != null){
          if (array1.length != array2.length)
              b = false;
          else
              for (int i = 0; i < array2.length; i++) {
                  if (array2[i] != array1[i]) {
                      b = false;    
                  }                 
            }
        }else{
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
	
	class RecordListener implements  ChangeRecordListener{

		@Override
		public void handleChangeRecord(IDataControl dc, Object newCurrentObject)
				throws TuraException {
           root = null;
		}
		
	}

}
