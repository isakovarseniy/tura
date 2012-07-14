package org.eclipse.wb.elsoft.propertyeditor;

import java.util.ArrayList;

public class TreeModel {

	public TreeModel parent;
	public boolean updated=false;
	public ArrayList<TreeModel> child = new ArrayList<TreeModel>();
	public String nodeName;

	public TreeModel(String name, TreeModel parent) {
		this.parent = parent;
		this.nodeName = name;
		if (parent != null)
			parent.child.add(this);
	}

	public String toString() {
		return nodeName;
	}
}
