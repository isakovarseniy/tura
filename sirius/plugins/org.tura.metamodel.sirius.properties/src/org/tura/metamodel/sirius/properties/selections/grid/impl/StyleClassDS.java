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
import org.eclipse.epsilon.common.dt.util.LogUtil;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.tura.metamodel.sirius.properties.selections.grid.DataSource;
import org.tura.metamodel.sirius.properties.selections.grid.GridProperty;

import artifact.ArtifactFactory;
import artifact.Classifier;
import form.FormFactory;
import form.FormPackage;
import form.StyleClass;
import form.StyleElement;

public class StyleClassDS extends DataSource {

	protected GridProperty property;

	public StyleClassDS(GridProperty property) {
		this.property = property;
	}

	@Override
	public List<Object> queryRows() {
		try {
			ArrayList<Object> rows = new ArrayList<Object>();
			for (StyleClass style : ((StyleElement) property.getModel()).getStyleClass()) {
				rows.add(style);
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
		StyleClass styleClass = FormFactory.eINSTANCE.createStyleClass();
		styleClass.setUid(UUID.randomUUID().toString());

		Classifier cntVal = ArtifactFactory.eINSTANCE.createClassifier();
		cntVal.setUid(UUID.randomUUID().toString());
		styleClass.setClassifier(cntVal);

		EditingDomain editingDomain = ((DiagramEditor) property.getPart()).getEditingDomain();

		ArrayList<StyleClass> ls = new ArrayList<StyleClass>();
		ls.add(styleClass);

		editingDomain.getCommandStack().execute(
				AddCommand.create(editingDomain, ((StyleElement) property.getModel()),
						FormPackage.eINSTANCE.getStyleElement_StyleClass(), ls));

		rowList.add(rowList.size(), styleClass);
		this.notifyAddRow(styleClass);

	}

	@Override
	public void removeRow(Object row) {
		ArrayList<StyleClass> ls = new ArrayList<StyleClass>();
		ls.add((StyleClass) row);

		EditingDomain editingDomain = ((DiagramEditor) property.getPart()).getEditingDomain();

		editingDomain.getCommandStack().execute(
				RemoveCommand.create(editingDomain, ((StyleElement) property.getModel()),
						FormPackage.eINSTANCE.getStyleElement_StyleClass(), ls));

		rowList.remove(row);
		this.notifyRemoveRow(row);

	}

	@Override
	public int getSorterID() {
		return 0;
	}

}
