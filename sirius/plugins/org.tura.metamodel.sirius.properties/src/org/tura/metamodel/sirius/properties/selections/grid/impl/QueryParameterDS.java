/*******************************************************************************
 * Tura - application generation platform
 *
 * Copyright (c) 2012, 2015, Arseniy Isakov
 *  
 * This project includes software developed by Arseniy Isakov
 * http://sourceforge.net/p/tura/wiki/Home/
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.tura.metamodel.sirius.properties.selections.grid.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.tura.metamodel.sirius.properties.selections.grid.DataSource;
import org.tura.metamodel.sirius.properties.selections.grid.GridProperty;

import artifact.ArtifactFactory;
import artifact.ArtifactPackage;
import artifact.ModelQuery;
import artifact.QueryParameter;

public class QueryParameterDS extends DataSource {

	private GridProperty property;

	public QueryParameterDS(GridProperty property) {
		this.property = property;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void addRow() {
		QueryParameter parameter = ArtifactFactory.eINSTANCE.createQueryParameter();
		parameter.setName("New option");
		parameter.setUid(UUID.randomUUID().toString());
		ArrayList<QueryParameter> ls = new ArrayList<QueryParameter>();
		ls.add(parameter);

		EditingDomain editingDomain = ((DiagramEditor) property.getPart()).getEditingDomain();

		editingDomain.getCommandStack().execute(
				AddCommand.create(editingDomain, ((ModelQuery) property.getModel()),ArtifactPackage.eINSTANCE.getModelQuery_Parameters(), ls));

		rowList.add(rowList.size(), parameter);
		this.notifyAddRow(parameter);

	}

	@Override
	public void removeRow(Object row) {
		ArrayList<QueryParameter> ls = new ArrayList<QueryParameter>();
		ls.add((QueryParameter) row);

		EditingDomain editingDomain = ((DiagramEditor) property.getPart()).getEditingDomain();

		editingDomain.getCommandStack().execute(RemoveCommand.create(editingDomain, ((ModelQuery) property.getModel()),
				ArtifactPackage.eINSTANCE.getModelQuery_Parameters(), ls));

		rowList.remove(row);
		this.notifyRemoveRow(row);

	}

	@Override
	public List<Object> queryRows() {
		
		ModelQuery query = (ModelQuery) property.getModel();
		List<Object>  parameters = new ArrayList<Object>();
		parameters.addAll(query.getParameters());
		return parameters;
		
	}

	@Override
	public int getSorterID() {
		return 0;
	}

}
