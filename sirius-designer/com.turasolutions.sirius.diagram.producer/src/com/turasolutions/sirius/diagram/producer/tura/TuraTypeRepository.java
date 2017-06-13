package com.turasolutions.sirius.diagram.producer.tura;

import java.util.ArrayList;
import java.util.List;

import com.turasolutions.sirius.diagram.producer.tura.config.items.type.TypeGroupConfigurator;
import com.turasolutions.sirius.dsl.treediagram.tTreeItem;

public class TuraTypeRepository {
	public List<tTreeItem> getConfig() {
		ArrayList<tTreeItem> children = new ArrayList<tTreeItem>();
		children.add(TypeGroupConfigurator.create().addCreationDiagramNavigation("Type package", "Domain tree"));
		return children;
	}
}
