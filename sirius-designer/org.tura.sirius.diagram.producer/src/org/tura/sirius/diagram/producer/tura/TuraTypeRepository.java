package org.tura.sirius.diagram.producer.tura;

import java.util.ArrayList;
import java.util.List;

import org.tura.sirius.diagram.producer.tura.config.items.type.TypeGroupConfigurator;
import org.tura.sirius.dsl.treediagram.tTreeItem;

public class TuraTypeRepository {
	public List<tTreeItem> getConfig() {
		ArrayList<tTreeItem> children = new ArrayList<tTreeItem>();
		children.add(TypeGroupConfigurator.create().addCreationDiagramNavigation("Type package", "Domain tree"));
		return children;
	}
}
