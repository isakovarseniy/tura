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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.epsilon.common.dt.util.LogUtil;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.notation.impl.NodeImpl;
import org.tura.metamodel.commons.QueryHelper;
import org.tura.metamodel.sirius.properties.selections.grid.DataSource;
import org.tura.metamodel.sirius.properties.selections.grid.GridProperty;

import artifact.QueryParameter;
import recipe.Query;
import recipe.QueryVariable;
import recipe.RecipeFactory;
import recipe.RecipePackage;

public class QueryVariableDS extends DataSource {

	private GridProperty property;

	public QueryVariableDS(GridProperty property) {
		this.property = property;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void addRow() {
		QueryVariable queryVar = RecipeFactory.eINSTANCE.createQueryVariable();
		queryVar.setValue("New option");
		ArrayList<QueryVariable> ls = new ArrayList<QueryVariable>();
		ls.add(queryVar);

		EditingDomain editingDomain = ((DiagramEditor) property.getPart()).getEditingDomain();

		editingDomain.getCommandStack().execute(AddCommand.create(editingDomain, ((QueryParameter) property.getModel()),
				RecipePackage.eINSTANCE.getQuery_Variables(), ls));

		rowList.add(rowList.size(), queryVar);
		this.notifyAddRow(queryVar);
	}

	@Override
	public void removeRow(Object row) {
		ArrayList<QueryVariable> ls = new ArrayList<QueryVariable>();
		ls.add((QueryVariable) row);

		EditingDomain editingDomain = ((DiagramEditor) property.getPart()).getEditingDomain();

		editingDomain.getCommandStack().execute(RemoveCommand.create(editingDomain,
				((QueryParameter) property.getModel()), RecipePackage.eINSTANCE.getQuery_Variables(), ls));

		rowList.remove(row);
		this.notifyRemoveRow(row);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Object> queryRows() {

		EditingDomain editingDomain = ((DiagramEditor) property.getPart()).getEditingDomain();

		NodeImpl diagram = (NodeImpl) property.getEditPart().getModel();
		try {

			EObject types = (EObject) diagram.getElement();
			Object[] result = (new QueryHelper()).findMappingVariable((Query) property.getModel(), types);

			List<QueryParameter> addVariables = (List<QueryParameter>) result[0];
			List<QueryVariable> removeVariables = (List<QueryVariable>) result[1];

			// Add new
			for (QueryParameter Variable : addVariables) {
				QueryVariable ms = RecipeFactory.eINSTANCE.createQueryVariable();
				ms.setQueryParamRef(Variable);
				editingDomain.getCommandStack().execute(AddCommand.create(editingDomain, ((Query) property.getModel()),
						RecipePackage.eINSTANCE.getQuery_Variables(), ms));
			}

			// Remove
			for (QueryVariable ms : removeVariables) {
				editingDomain.getCommandStack().execute(RemoveCommand.create(editingDomain,
						((Query) property.getModel()), RecipePackage.eINSTANCE.getQuery_Variables(), ms));
			}
			ArrayList<Object> rows = new ArrayList<Object>();
			for (QueryVariable p : ((Query) property.getModel()).getVariables()) {
				rows.add(p);
			}

			return rows;

		} catch (Exception e) {
			LogUtil.log(e);
		}

		return null;
	}

	@Override
	public int getSorterID() {
		return 0;
	}

}
