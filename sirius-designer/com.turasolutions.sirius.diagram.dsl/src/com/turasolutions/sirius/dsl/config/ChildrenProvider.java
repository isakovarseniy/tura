package com.turasolutions.sirius.dsl.config;

import java.util.List;

import com.turasolutions.sirius.dsl.treediagram.tTreeItem;

public   interface ChildrenProvider {
	public  List<tTreeItem> getChildren();
}