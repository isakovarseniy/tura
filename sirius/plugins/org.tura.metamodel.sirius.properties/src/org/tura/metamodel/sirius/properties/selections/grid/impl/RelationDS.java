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

package org.tura.metamodel.sirius.properties.selections.grid.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.tura.metamodel.commons.Util;
import org.tura.metamodel.sirius.properties.selections.grid.DataSource;
import org.tura.metamodel.sirius.properties.selections.grid.GridProperty;

import form.DataControl;
import form.FormPackage;
import form.Relation;
import type.Attribute;
import type.Link;
import type.Type;
import type.TypeFactory;


public class RelationDS extends DataSource {

	private GridProperty property;

	public RelationDS(GridProperty property) {
		this.property = property;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void addRow() {
		Link row = TypeFactory.eINSTANCE.createLink();
		row.setUid(UUID.randomUUID().toString());


		DataControl dc = ((Relation) (property.getModel())).getMaster();

		Type type = (Type) Util.getBase(dc);

		if (type == null)
			return;
		
		List<Attribute> choicesOptions = ((RelationPropertySelection) property).initOptions(type);

		if (choicesOptions != null && choicesOptions.size() != 0) {
			row.setMasterField(choicesOptions.get(0));
		}

		dc = ((Relation) (property.getModel())).getDetail();

		type = (Type) Util.getBase(dc);

		if (type == null)
			return;

		choicesOptions = ((RelationPropertySelection) property).initOptions(type);

		if (choicesOptions != null && choicesOptions.size() != 0) {
			row.setDetailField(choicesOptions.get(0));
		}

		ArrayList<Link> ls = new ArrayList<Link>();
		ls.add((Link) row);

		EditingDomain editingDomain = ((DiagramEditor) property.getPart()).getEditingDomain();

		editingDomain.getCommandStack().execute(
				AddCommand.create(editingDomain, ((Relation) property.getModel()),
						FormPackage.eINSTANCE.getRelation_Links(), ls));

		rowList.add(row);
		this.notifyAddRow(row);

	}

	@Override
	public void removeRow(Object row) {
		ArrayList<Link> ls = new ArrayList<Link>();
		ls.add((Link) row);

		EditingDomain editingDomain = ((DiagramEditor) property.getPart()).getEditingDomain();

		editingDomain.getCommandStack().execute(
				RemoveCommand.create(editingDomain, ((Relation) property.getModel()),
						FormPackage.eINSTANCE.getRelation_Links(), ls));

		rowList.remove(row);
		this.notifyRemoveRow(row);

	}

	public List<Object> queryRows() {

		ArrayList<Object> rows = new ArrayList<Object>();
		if (property.getModel() != null) {

			List<Link> links = ((Relation) property.getModel()).getLinks();
			rows.addAll(links);
		}

		return rows;
	}

	@Override
	public int getSorterID() {
		return 0;
	}

}
