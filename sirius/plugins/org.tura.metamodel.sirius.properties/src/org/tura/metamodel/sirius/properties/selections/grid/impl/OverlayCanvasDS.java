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
import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.epsilon.common.dt.util.LogUtil;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.dialogs.ListSelectionDialog;
import org.tura.metamodel.commons.QueryHelper;
import org.tura.metamodel.sirius.properties.selections.grid.DataSource;
import org.tura.metamodel.sirius.properties.selections.grid.GridProperty;
import org.eclipse.jface.window.Window;

import form.AreaRef;
import form.FormFactory;
import form.FormPackage;
import form.NickNamed;
import form.OverlayCanvas;
import form.Uielement;
import form.Views;

public abstract class OverlayCanvasDS extends DataSource {

	private GridProperty property;

	public OverlayCanvasDS(GridProperty property) {
		this.property = property;
	}

	public abstract int getGroup();
	
	protected List<Object> getContextRoot() {
		try {

			Object[] result = (new QueryHelper()).findRefreshedAeas( (Views)  ((OverlayCanvas) property.getModel()).eContainer(), property.getModel() );

			@SuppressWarnings("unchecked")
			List<NickNamed> allAreas = (List<NickNamed>) result[0];

			ArrayList<Object> rows = new ArrayList<Object>();

			boolean noThisElement = true;
			for (AreaRef p : ((OverlayCanvas) property.getModel()).getSourceTarget()) {
				if (p.getGroup() == getGroup()) {
					RefreshAreaRow r = new RefreshAreaRow(p);
					if (p.getArea().equals(((Uielement) property.getModel()))) {
						noThisElement = false;
						r.setTHIS("this");
					}

					if (allAreas.contains(p.getArea())){
						allAreas.remove(p.getArea());
					}

					rows.add(r);
				}
			}

			if (noThisElement) {
				rows.add(new RefreshAreaRow(((OverlayCanvas) property.getModel()), "this"));
			}

			for (NickNamed nick : allAreas) {
				rows.add(new RefreshAreaRow(nick));
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

		ListSelectionDialog dialog = new ListSelectionDialog(Display.getCurrent().getActiveShell(), getContextRoot(),
				new ArrayContentProvider(), new RefreshAreaLabelProvider(), "Select Arias:");

		dialog.setTitle("Select Arias:");
		dialog.setMessage("");

		dialog.setInitialElementSelections(queryRows());

		List<Object> result = new ArrayList<>();

		if (dialog.open() == Window.OK) {
			result = Arrays.asList(dialog.getResult());

			EditingDomain editingDomain = ((DiagramEditor) property.getPart()).getEditingDomain();
			ArrayList<AreaRef> areaRef = new ArrayList<AreaRef>();
			for (Object obj : result) {
				RefreshAreaRow r = (RefreshAreaRow) obj;
				if (r.getRef() != null) {
					areaRef.add( r.getRef());
				} else {
					if (r.getNickNamed() != null) {
						AreaRef ref = FormFactory.eINSTANCE.createAreaRef();
						ref.setArea(r.getNickNamed());
						ref.setGroup(getGroup());
						areaRef.add(ref);
					}
				}
			}
			
			for(  AreaRef ref : ((OverlayCanvas) property.getModel()).getSourceTarget()){
				if (ref.getGroup() != getGroup()){
					areaRef.add(ref);
				}
			}

			editingDomain.getCommandStack().execute(SetCommand.create(editingDomain, ((OverlayCanvas) property.getModel()),
					FormPackage.eINSTANCE.getOverlayCanvas_SourceTarget(), areaRef));

			rowList.clear();
			rowList.addAll(result);

			if (result.size() == 0) {
				property.refresh();
			}
			for (Object m : result) {
				notifyAddRow(m);
			}
		}

	}

	@Override
	public void removeRow(Object row) {

	}

	@Override
	public List<Object> queryRows() {
		EditingDomain editingDomain = ((DiagramEditor) property.getPart()).getEditingDomain();

		try {

			Object[] result = (new QueryHelper()).findRefreshedAeas( (Views)  ((OverlayCanvas) property.getModel()).eContainer(), property.getModel() );

			@SuppressWarnings("unchecked")
			List<NickNamed> allAreas = (List<NickNamed>) result[0];
			@SuppressWarnings("unchecked")
			List<AreaRef> removeAreas = (List<AreaRef>) result[1];

			// Remove
			editingDomain.getCommandStack().execute(RemoveCommand.create(editingDomain, property.getModel(),
					FormPackage.eINSTANCE.getOverlayCanvas_SourceTarget(), removeAreas));

			ArrayList<Object> rows = new ArrayList<Object>();

			for (AreaRef p : ((OverlayCanvas) property.getModel()).getSourceTarget()) {
				if (p.getGroup() == getGroup()) {
					RefreshAreaRow r = new RefreshAreaRow(p);
					if (p.getArea().equals(((OverlayCanvas) property.getModel()))) {
						r.setTHIS("this");
					}

					if (allAreas.contains(p.getArea()))
						allAreas.remove(p.getArea());

					rows.add(r);
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

	class RefreshAreaLabelProvider extends LabelProvider {
		public String getText(Object element) {
			return element == null ? "" : ((RefreshAreaRow) element).getNickName();
		}

	}

}
