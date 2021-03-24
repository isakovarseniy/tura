/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   http://sourceforge.net/p/tura/wiki/Home/
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

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
