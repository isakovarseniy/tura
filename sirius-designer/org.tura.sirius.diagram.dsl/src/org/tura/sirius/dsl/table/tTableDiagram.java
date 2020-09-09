/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2020 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   http://sourceforge.net/p/tura/wiki/Home/
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.tura.sirius.dsl.table;

import java.util.List;

import org.eclipse.sirius.table.metamodel.table.description.CreateLineTool;
import org.eclipse.sirius.table.metamodel.table.description.DescriptionFactory;
import org.eclipse.sirius.table.metamodel.table.description.EditionTableDescription;
import org.eclipse.sirius.table.metamodel.table.description.TableCreationDescription;
import org.eclipse.sirius.viewpoint.description.tool.ContainerViewVariable;
import org.eclipse.sirius.viewpoint.description.tool.NameVariable;
import org.eclipse.sirius.viewpoint.description.tool.ToolFactory;
import org.tura.sirius.dsl.config.ConfigProvider;
import org.tura.sirius.dsl.viewpoint.tRoot;

public class tTableDiagram {
	private EditionTableDescription tableDescription;

	public tTableDiagram(EditionTableDescription tableDescription, ConfigProvider configurator) {
		this.tableDescription = tableDescription;
		this.tableDescription.setTitleExpression("aql:self.name");
		tRoot.context.put(tableDescription.getName() + tTableDiagram.class.getName(), this);
	}

	public tLine addChild(tLine line) {
		this.tableDescription.getOwnedLineMappings().add(line.getLineMapping());
		return line;
	}

	public tColumn addChild(tColumn colum) {
		this.tableDescription.getOwnedColumnMappings().add(colum.getColumnMapping());
		return colum;
	}

	public TableCreationDescription getCreationRepresentation() {
		TableCreationDescription creationDescription = DescriptionFactory.eINSTANCE.createTableCreationDescription();
		creationDescription.setName("Create " + this.tableDescription.getName());
		creationDescription.setTableDescription(this.tableDescription);

		ContainerViewVariable var = ToolFactory.eINSTANCE.createContainerViewVariable();
		var.setName("containerView");
		creationDescription.setContainerViewVariable(var);

		NameVariable var1 = ToolFactory.eINSTANCE.createNameVariable();
		var1.setName("tableName");
		creationDescription.setRepresentationNameVariable(var1);

		return creationDescription;
	}

	public tTableDiagram addCreationTool(List<CreateLineTool> tools) {
		for (CreateLineTool tool : tools) {
			this.tableDescription.getOwnedCreateLine().add(tool);
		}
		return this;
	}
}
