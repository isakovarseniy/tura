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

import artifact.Artifact;
import artifact.ArtifactFactory;
import artifact.ArtifactPackage;
import artifact.ConfigVariableWithNickName;

public class ConfigVariablesDS extends DataSource {

	protected GridProperty property;

	public ConfigVariablesDS(GridProperty property) {
		this.property = property;
	}

	@Override
	public List<Object> queryRows() {
		try {
			ArrayList<Object> rows = new ArrayList<Object>();
			for (ConfigVariableWithNickName hint : ((Artifact) property.getModel()).getConfigVariables()) {
				rows.add(hint);
			}

			return rows;
		} catch (Exception e) {
			LogUtil.log(e);
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void addRow() {
		ConfigVariableWithNickName hint = ArtifactFactory.eINSTANCE.createConfigVariableWithNickName();
		hint.setUid(UUID.randomUUID().toString());


		EditingDomain editingDomain = ((DiagramEditor) property.getPart()).getEditingDomain();

		ArrayList<ConfigVariableWithNickName> ls = new ArrayList<ConfigVariableWithNickName>();
		ls.add(hint);

		editingDomain.getCommandStack().execute(
				AddCommand.create(editingDomain, ((Artifact) property.getModel()),
						ArtifactPackage.eINSTANCE.getArtifact_ConfigVariables(), ls));

		rowList.add(rowList.size(), hint);
		this.notifyAddRow(hint);

	}

	@Override
	public void removeRow(Object row) {
		ArrayList<ConfigVariableWithNickName> ls = new ArrayList<ConfigVariableWithNickName>();
		ls.add((ConfigVariableWithNickName) row);

		EditingDomain editingDomain = ((DiagramEditor) property.getPart()).getEditingDomain();

		editingDomain.getCommandStack().execute(
				RemoveCommand.create(editingDomain, ((Artifact) property.getModel()),
						ArtifactPackage.eINSTANCE.getArtifact_ConfigVariables(), ls));

		rowList.remove(row);
		this.notifyRemoveRow(row);

	}

	@Override
	public int getSorterID() {
		return 0;
	}

}
