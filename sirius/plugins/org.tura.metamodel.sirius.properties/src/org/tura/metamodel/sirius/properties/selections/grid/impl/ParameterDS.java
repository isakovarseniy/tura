/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.tura.metamodel.sirius.properties.selections.grid.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.epsilon.common.dt.util.LogUtil;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.tura.metamodel.sirius.properties.selections.grid.DataSource;
import org.tura.metamodel.sirius.properties.selections.grid.GridProperty;

import type.Operation;
import type.Parameter;
import type.TypeFactory;
import type.TypePackage;

public class ParameterDS extends DataSource {

	private GridProperty property;

	public ParameterDS(GridProperty property) {
		this.property = property;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void addRow() {
		Parameter parameter = TypeFactory.eINSTANCE.createParameter();
		parameter.setName("New parameter");
		parameter.setUid(UUID.randomUUID().toString());
		ArrayList<Parameter> ls = new ArrayList<Parameter>();
		ls.add(parameter);

		EditingDomain editingDomain = ((DiagramEditor) property.getPart()).getEditingDomain();

		editingDomain.getCommandStack().execute(
				AddCommand.create(editingDomain,
						((Operation) property.getModel()),
						TypePackage.eINSTANCE.getOperation_Parameters(), ls));

		rowList.add(rowList.size(), parameter);
		this.notifyAddRow(parameter);

	}

	@Override
	public void removeRow(Object row) {
		ArrayList<Parameter> ls = new ArrayList<Parameter>();
		ls.add((Parameter) row);

		EditingDomain editingDomain = ((DiagramEditor) property.getPart()).getEditingDomain();

		editingDomain.getCommandStack().execute(
				RemoveCommand.create(editingDomain,
						((Operation) property.getModel()),
						TypePackage.eINSTANCE.getOperation_Parameters(), ls));

		rowList.remove(row);
		this.notifyRemoveRow(row);

	}

	@Override
	public List<Object> queryRows() {
		try {
			Operation operation = ((Operation) property.getModel());

			ArrayList<Object> rows = new ArrayList<Object>();
			for (Parameter p : operation.getParameters()) {
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
		return 2;
	}

}
