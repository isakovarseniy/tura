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
package org.tura.metamodel.commons.properties.selections.grid.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.epsilon.common.dt.util.LogUtil;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.tura.metamodel.commons.properties.selections.grid.DataSource;
import org.tura.metamodel.commons.properties.selections.grid.GridProperty;

import domain.DomainFactory;
import domain.DomainPackage;

public class FlexFieldsDS extends DataSource {

	private GridProperty property;

	public FlexFieldsDS(GridProperty property) {
		this.property = property;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void addRow() {
		domain.FlexField field = DomainFactory.eINSTANCE.createFlexField();
		field.setUid(UUID.randomUUID().toString());
		ArrayList<domain.FlexField> ls = new ArrayList<domain.FlexField>();
		ls.add(field);

		EditingDomain editingDomain = ((DiagramEditor) property.getPart())
				.getEditingDomain();

		editingDomain.getCommandStack().execute(
				AddCommand.create(editingDomain,
						((domain.FlexFields) property.getModel()),
						DomainPackage.eINSTANCE.getFlexFields_Fields(), ls));

		rowList.add(rowList.size(), field);
		this.notifyAddRow(field);

	}

	@Override
	public void removeRow(Object row) {
		ArrayList<domain.FlexField> ls = new ArrayList<domain.FlexField>();
		ls.add((domain.FlexField) row);

		EditingDomain editingDomain = ((DiagramEditor) property.getPart())
				.getEditingDomain();

		editingDomain.getCommandStack().execute(
				RemoveCommand.create(editingDomain,
						((domain.FlexFields) property.getModel()),
						DomainPackage.eINSTANCE.getFlexFields_Fields(), ls));

		rowList.remove(row);
		this.notifyRemoveRow(row);

	}

	@Override
	public List<Object> queryRows() {
		try {
			domain.FlexFields fields = (domain.FlexFields) property.getModel();

			ArrayList<Object> rows = new ArrayList<Object>();
			for (Iterator<domain.FlexField> i = fields.getFields().iterator(); i
					.hasNext();) {
				domain.FlexField p = i.next();
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
