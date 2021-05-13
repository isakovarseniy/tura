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

import form.FormFactory;
import form.FormPackage;
import form.OrderBy;
import form.Orders;

public class DefaultOrderByDS extends DataSource {

	protected GridProperty property;

	public DefaultOrderByDS(GridProperty property) {
		this.property = property;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void addRow() {
		OrderBy parameter = FormFactory.eINSTANCE.createOrderBy();
		parameter.setUid(UUID.randomUUID().toString());

		ArrayList<OrderBy> ls = new ArrayList<OrderBy>();
		ls.add(parameter);

		EditingDomain editingDomain = ((DiagramEditor) property.getPart())
				.getEditingDomain();

		editingDomain.getCommandStack().execute(
				AddCommand.create(editingDomain, property.getModel(),
						FormPackage.eINSTANCE.getOrders_OrderRules(), ls));

		rowList.add(rowList.size(), parameter);
		this.notifyAddRow(parameter);

	}

	@Override
	public void removeRow(Object row) {
		ArrayList<OrderBy> ls = new ArrayList<OrderBy>();
		ls.add((OrderBy) row);

		EditingDomain editingDomain = ((DiagramEditor) property.getPart())
				.getEditingDomain();

		editingDomain.getCommandStack().execute(
				RemoveCommand.create(editingDomain, property.getModel(),
						FormPackage.eINSTANCE.getOrders_OrderRules(), ls));

		rowList.remove(row);
		this.notifyRemoveRow(row);

	}

	@Override
	public List<Object> queryRows() {
		try {
			ArrayList<Object> rows = new ArrayList<Object>();
			for (OrderBy  order: ((Orders) property.getModel()).getOrderRules()) {
				rows.add(order);
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
