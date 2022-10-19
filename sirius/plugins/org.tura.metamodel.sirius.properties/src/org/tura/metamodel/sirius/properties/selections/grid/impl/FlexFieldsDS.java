/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2022 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
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
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.epsilon.common.dt.util.LogUtil;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.tura.metamodel.sirius.properties.selections.grid.DataSource;
import org.tura.metamodel.sirius.properties.selections.grid.GridProperty;

import form.FlexField;
import form.FlexFields;
import form.FormFactory;
import form.FormPackage;

public class FlexFieldsDS extends DataSource {

	private GridProperty property;

	public FlexFieldsDS(GridProperty property) {
		this.property = property;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void addRow() {
		FlexField field = FormFactory.eINSTANCE.createFlexField();
		field.setUid(UUID.randomUUID().toString());
		ArrayList<FlexField> ls = new ArrayList<FlexField>();
		ls.add(field);

		EditingDomain editingDomain = ((DiagramEditor) property.getPart())
				.getEditingDomain();

		editingDomain.getCommandStack().execute(
				AddCommand.create(editingDomain,
						((FlexFields) property.getModel()),
						FormPackage.eINSTANCE.getFlexFields_Fields(), ls));

		rowList.add(rowList.size(), field);
		this.notifyAddRow(field);

	}

	@Override
	public void removeRow(Object row) {
		ArrayList<FlexField> ls = new ArrayList<FlexField>();
		ls.add((FlexField) row);

		EditingDomain editingDomain = ((DiagramEditor) property.getPart())
				.getEditingDomain();

		editingDomain.getCommandStack().execute(
				RemoveCommand.create(editingDomain,
						((FlexFields) property.getModel()),
						FormPackage.eINSTANCE.getFlexFields_Fields(), ls));

		rowList.remove(row);
		this.notifyRemoveRow(row);

	}

	@Override
	public List<Object> queryRows() {
		try {
			FlexFields fields = (FlexFields) property.getModel();

			ArrayList<Object> rows = new ArrayList<Object>();
			for (Iterator<FlexField> i = fields.getFields().iterator(); i
					.hasNext();) {
				FlexField p = i.next();
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
