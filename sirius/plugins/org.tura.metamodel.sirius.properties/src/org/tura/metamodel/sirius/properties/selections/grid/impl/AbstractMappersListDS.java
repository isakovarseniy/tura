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
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.epsilon.common.dt.util.LogUtil;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.dialogs.ListSelectionDialog;
import org.tura.metamodel.sirius.properties.selections.grid.DataSource;
import org.tura.metamodel.sirius.properties.selections.grid.GridProperty;

import application.ApplicationMapper;
import domain.DomainPackage;
import mapper.Mappers;
import recipe.RecipePackage;
import recipe.UsingMappers;

public abstract class AbstractMappersListDS extends DataSource {

	private GridProperty property;

	public AbstractMappersListDS(GridProperty property) {
		this.property = property;
	}

	public abstract List<ApplicationMapper> findRemovedMappers(
			UsingMappers usingMappers);

	public abstract Set<ApplicationMapper> findAvailableMappers(
			UsingMappers usingMappers);

	@SuppressWarnings("unchecked")
	@Override
	public void addRow() {
		Set<ApplicationMapper> set = findAvailableMappers((UsingMappers) property
				.getModel());
		ListSelectionDialog dlg = new ListSelectionDialog(Display.getCurrent()
				.getActiveShell(), set, new ArrayContentProvider(),
				new MappersLabelProvider(), "Select Mappers:");
		dlg.setTitle("Mappers Selection");
		dlg.setInitialElementSelections(((UsingMappers) property
				.getModel()).getMappers());
		List<Object> result = new ArrayList<>();
		if (dlg.open() == Window.OK) {
			result = Arrays.asList(dlg.getResult());

			List<ApplicationMapper> addMappers = new ArrayList<ApplicationMapper>();
			for (Iterator<?> itr = result.iterator(); itr.hasNext();) {
				ApplicationMapper mapper = (ApplicationMapper) itr
						.next();
				if (!((UsingMappers) property.getModel()).getMappers()
						.contains(mapper)) {
					addMappers.add(mapper);
				}
			}

			List<ApplicationMapper> removeMappers = new ArrayList<ApplicationMapper>();
			for (Mappers mapper : ((UsingMappers) property.getModel()).getMappers()) {
				if (!result.contains(mapper)) {
					removeMappers.add(mapper);
				}
			}

			EditingDomain editingDomain = ((DiagramEditor) property.getPart())
					.getEditingDomain();

			editingDomain.getCommandStack().execute(
					AddCommand.create(editingDomain,
							((UsingMappers) property.getModel()),
							RecipePackage.eINSTANCE.getUsingMappers_Mappers(),
							addMappers));

			editingDomain.getCommandStack().execute(
					RemoveCommand.create(editingDomain,
							((UsingMappers) property.getModel()),
							RecipePackage.eINSTANCE.getUsingMappers_Mappers(),
							removeMappers));

			rowList.removeAll(removeMappers);
			rowList.addAll(addMappers);

			for (Iterator<ApplicationMapper>itra =  addMappers.iterator();itra.hasNext();){
				notifyAddRow(itra.next());
			}

			for (Iterator<ApplicationMapper>itrr =  removeMappers.iterator();itrr.hasNext();){
				notifyRemoveRow(itrr.next());
			}
			
		}

	}

	@Override
	public void removeRow(Object row) {

	}

	@Override
	public List<Object> queryRows() {
		EditingDomain editingDomain = ((DiagramEditor) property.getPart())
				.getEditingDomain();

		try {

			List<ApplicationMapper> removeMappers = findRemovedMappers((UsingMappers) property
					.getModel());

			// Remove
			for (Iterator<ApplicationMapper> itr = removeMappers.iterator(); itr
					.hasNext();) {
				ApplicationMapper ms = itr.next();
				editingDomain.getCommandStack().execute(
						RemoveCommand.create(editingDomain,
								((UsingMappers) property.getModel()),
								DomainPackage.eINSTANCE
										.getUsingMappers_Mappers(), ms));
			}

			ArrayList<Object> rows = new ArrayList<Object>();
			for (Iterator<ApplicationMapper> i = ((UsingMappers) property
					.getModel()).getMappers().iterator(); i.hasNext();) {
				ApplicationMapper p = i.next();
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

	class MappersLabelProvider extends LabelProvider {
		public String getText(Object element) {
			return element == null ? "" : ((ApplicationMapper) element)
					.getName();
		}

	}

}
