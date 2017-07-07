package org.tura.sirius.dsl.config;

import java.util.List;

import org.tura.sirius.dsl.treediagram.tTreeItem;

public   interface ChildrenProvider {
	public  List<tTreeItem> getChildren();
}