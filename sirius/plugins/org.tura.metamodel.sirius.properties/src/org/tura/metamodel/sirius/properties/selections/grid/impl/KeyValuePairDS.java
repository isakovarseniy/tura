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
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.tura.metamodel.sirius.properties.selections.grid.DataSource;
import org.tura.metamodel.sirius.properties.selections.grid.GridProperty;

import recipe.HashProperty;
import recipe.KeyValuePair;
import recipe.RecipeFactory;
import recipe.RecipePackage;

public class KeyValuePairDS extends DataSource {

	private GridProperty property;

	public KeyValuePairDS(GridProperty property) {
		this.property = property;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void addRow() {
		KeyValuePair keyValue = RecipeFactory.eINSTANCE
				.createKeyValuePair();
		keyValue.setUid(UUID.randomUUID().toString());
		ArrayList<KeyValuePair> ls = new ArrayList<KeyValuePair>();
		ls.add(keyValue);

		EditingDomain editingDomain = ((DiagramEditor) property.getPart())
				.getEditingDomain();

		editingDomain.getCommandStack().execute(
				AddCommand.create(editingDomain,
						((HashProperty) property.getModel()),
						RecipePackage.eINSTANCE.getHashProperty_Hash(), ls));

		rowList.add(rowList.size(), keyValue);
		this.notifyAddRow(keyValue);

	}

	@Override
	public void removeRow(Object row) {
		ArrayList<KeyValuePair> ls = new ArrayList<KeyValuePair>();
		ls.add((KeyValuePair) row);

		EditingDomain editingDomain = ((DiagramEditor) property.getPart())
				.getEditingDomain();

		editingDomain.getCommandStack().execute(
				RemoveCommand.create(editingDomain,
						((HashProperty) property.getModel()),
						RecipePackage.eINSTANCE.getHashProperty_Hash(), ls));

		rowList.remove(row);
		this.notifyRemoveRow(row);

	}

	@Override
	public List<Object> queryRows() {
		HashProperty hash = (HashProperty) property.getModel();

		ArrayList<Object> rows = new ArrayList<Object>();
		if (hash != null) {
			for (KeyValuePair p : hash.getHash()) {
				rows.add(p);
			}
		}
		return rows;
	}

	@Override
	public int getSorterID() {
		return 0;
	}

}
