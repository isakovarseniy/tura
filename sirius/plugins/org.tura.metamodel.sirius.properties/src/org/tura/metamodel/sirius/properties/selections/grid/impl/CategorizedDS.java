/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2023 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
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

import artifact.ArtifactFactory;
import artifact.ArtifactPackage;
import artifact.Categorized;
import artifact.Classifier;

public class CategorizedDS extends DataSource {

	private GridProperty property;

	public CategorizedDS(GridProperty property) {
		this.property = property;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void addRow() {
		Classifier classifier = ArtifactFactory.eINSTANCE.createClassifier();
		classifier.setUid(UUID.randomUUID().toString());
		ArrayList<Classifier> ls = new ArrayList<Classifier>();
		ls.add(classifier);

		EditingDomain editingDomain = ((DiagramEditor) property.getPart()).getEditingDomain();

		editingDomain.getCommandStack().execute(AddCommand.create(editingDomain,
				((Categorized) property.getModel()), ArtifactPackage.eINSTANCE.getCategorized_Classifiers(), ls));

		rowList.add(rowList.size(), classifier);
		this.notifyAddRow(classifier);

	}

	@Override
	public void removeRow(Object row) {
		ArrayList<Classifier> ls = new ArrayList<Classifier>();
		ls.add((Classifier) row);

		EditingDomain editingDomain = ((DiagramEditor) property.getPart()).getEditingDomain();

		editingDomain.getCommandStack().execute(RemoveCommand.create(editingDomain,
				((Categorized) property.getModel()), ArtifactPackage.eINSTANCE.getCategorized_Classifiers(), ls));

		rowList.remove(row);
		this.notifyRemoveRow(row);

	}

	@Override
	public List<Object> queryRows() {
		try {
			Categorized categorized = (Categorized) property.getModel();

			ArrayList<Object> rows = new ArrayList<Object>();
			if (categorized != null) {
				for (Iterator<Classifier> i = categorized.getClassifiers().iterator(); i.hasNext();) {
					Classifier p = i.next();
					rows.add(p);
				}
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
