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

import artifact.Technology;
import recipe.MappingTecnologiy;
import recipe.ModelMapper;
import recipe.RecipeFactory;
import recipe.RecipePackage;


public class MappingTechnologiesDS extends DataSource {

	private GridProperty property;

	public MappingTechnologiesDS(GridProperty property) {
		this.property = property;
	}

	@Override
	public void addRow() {

	}

	@Override
	public void removeRow(Object row) {
		ArrayList<MappingTecnologiy> ls = new ArrayList<MappingTecnologiy>();
		ls.add((MappingTecnologiy) row);

		EditingDomain editingDomain = ((DiagramEditor) property.getPart())
				.getEditingDomain();

		editingDomain.getCommandStack().execute(
				RemoveCommand
						.create(editingDomain, ((ModelMapper) property
								.getModel()), RecipePackage.eINSTANCE
								.getModelMapper_Technologies(), ls));

		rowList.remove(row);
		this.notifyRemoveRow(row);

	}

	@Override
	public List<Object> queryRows() {
		
		if (((ModelMapper) property.getModel()).getArtifactRef() == null){
			return new ArrayList<Object>();
		}
		
		EditingDomain editingDomain = ((DiagramEditor) property.getPart())
				.getEditingDomain();

		NodeImpl diagram = (NodeImpl) property.getEditPart().getModel();
		try {

			EObject types = (EObject) diagram.getElement();
			Object[] result = (new QueryHelper()).findMappingTechnologies(
					(ModelMapper) property.getModel(), types);

			@SuppressWarnings("unchecked")
			List<Technology> addSpecifiers = (List<Technology>) result[0];
			@SuppressWarnings("unchecked")
			List<MappingTecnologiy> removeSpecifiers = (List<MappingTecnologiy>) result[1];

			// Add new
			for (Technology specifier : addSpecifiers) {
				MappingTecnologiy ms = RecipeFactory.eINSTANCE.createMappingTecnologiy();
				ms.setTechRef(specifier);
				editingDomain.getCommandStack().execute(
						AddCommand.create(editingDomain,
								((ModelMapper) property.getModel()),
								RecipePackage.eINSTANCE
										.getModelMapper_Technologies(), ms));
			}

			// Remove
			for (MappingTecnologiy ms  :removeSpecifiers) {
				editingDomain.getCommandStack().execute(
						RemoveCommand.create(editingDomain,
								((ModelMapper) property.getModel()),
								RecipePackage.eINSTANCE
										.getModelMapper_Technologies(), ms));
			}

			ArrayList<Object> rows = new ArrayList<Object>();
			for (MappingTecnologiy p : ((ModelMapper) property.getModel()).getTechnologies()) {
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
