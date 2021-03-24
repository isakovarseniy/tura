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
import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.dialogs.ListSelectionDialog;
import org.tura.metamodel.sirius.properties.selections.grid.DataSource;
import org.tura.metamodel.sirius.properties.selections.grid.GridProperty;

import application.Application;
import application.ApplicationMapper;
import mapper.Mappers;
import recipe.Ingredient;
import recipe.Recipe;
import recipe.RecipePackage;
import recipe.Recipes;
import recipe.UsingMappers;

public class MappersListDS extends DataSource {

	private GridProperty property;

	public MappersListDS(GridProperty property) {
		this.property = property;
	}

	protected List<Mappers> getContextRoot(){
		DiagramEditor editor = ((DiagramEditor) property.getPart());
		
		DSemanticDiagram obj = (DSemanticDiagram) editor.getDiagram().getElement();
		Recipes root =  (Recipes) obj.getTarget();
		
		Application app = (Application) root.eContainer().eContainer().eContainer();
		
		ArrayList<Mappers> initList = new ArrayList<Mappers>();

		for(  ApplicationMapper m : app.getApplicationMappers().getMappers()){
			initList.add(m.getMapper());
		}

		if ( property.getModel() instanceof  Ingredient){
			Recipe recipe = (Recipe) property.getModel().eContainer();
			for (Mappers m : recipe.getMappers()){
				initList.remove(m);
			}
		}
		
		return  initList;

	}
	
	
	@SuppressWarnings("unchecked")
	@Override
	public void addRow() {
		
		ListSelectionDialog dialog = new ListSelectionDialog(Display.getCurrent().getActiveShell(), getContextRoot(), new ArrayContentProvider(),
				new MappersLabelProvider(), "Select Mappers:");
		
		dialog.setTitle("Select Mappers:");
		dialog.setMessage("");
		
		dialog.setInitialElementSelections(((UsingMappers) property.getModel()).getMappers());
		
		List<Object> result = new ArrayList<>();
		
		if (dialog.open() == Window.OK) {
			result = Arrays.asList(dialog.getResult());

			EditingDomain editingDomain = ((DiagramEditor) property.getPart()).getEditingDomain();

			editingDomain.getCommandStack().execute(
					SetCommand.create(editingDomain,
							((UsingMappers) property.getModel()),
							RecipePackage.eINSTANCE.getUsingMappers_Mappers(),
							result));


			rowList.clear();
			rowList.addAll(result);

			if (result.size() == 0){
				 property.refresh();;
			}
			for (Object m :  result){
				notifyAddRow(m);
			}
		}

	}

	@Override
	public void removeRow(Object row) {

	}

	@Override
	public List<Object> queryRows() {
		ArrayList<Object> rows = new ArrayList<Object>();
		for (Mappers p : ((UsingMappers) property.getModel()).getMappers()) {
			rows.add(p);
		}
	   return rows;
	}

	@Override
	public int getSorterID() {
		return 0;
	}

	class MappersLabelProvider extends LabelProvider {
		public String getText(Object element) {
			return element == null ? "" :  ( (ApplicationMapper) ((((Mappers) element)).eContainer())).getName();
		}

	}
	
	
}
