/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2022 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
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
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.epsilon.common.dt.util.LogUtil;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.dialogs.ListSelectionDialog;
import org.tura.metamodel.commons.QueryHelper;
import org.tura.metamodel.sirius.properties.selections.grid.DataSource;
import org.tura.metamodel.sirius.properties.selections.grid.GridProperty;

import mapper.MappingLayer;

public abstract class MappingLayerDS extends DataSource {

	private GridProperty property;

	public MappingLayerDS(GridProperty property) {
		this.property = property;
	}

	public abstract EStructuralFeature getFeature();
	
	protected List<Object> getContextRoot() {
		try {

			List<MappingLayer> result =  new QueryHelper().findApplicationLayers (property.getModel());

			ArrayList<MappingLayer> list = new ArrayList<MappingLayer>();
			list.addAll(result);
			Collections.sort(list,new MappingLayerComparator());
			
			ArrayList<Object> rows = new ArrayList<Object>();
			rows.addAll(list);

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
				new ArrayContentProvider(), new MappingLayerLabelProvider(), "Select mapping layers:");

		dialog.setTitle("Select Arias:");
		dialog.setMessage("");

		dialog.setInitialElementSelections(queryRows());

		List<Object> result = new ArrayList<>();

		if (dialog.open() == Window.OK) {
			result = Arrays.asList(dialog.getResult());

			Session session = SessionManager.INSTANCE.getSession(this.property.getModel());
			EditingDomain editingDomain = session.getTransactionalEditingDomain();
			
			editingDomain.getCommandStack().execute(SetCommand.create(editingDomain, property.getModel(),
					getFeature(), result));

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

	@SuppressWarnings("unchecked")
	@Override
	public List<Object> queryRows() {
		ArrayList <Object> list = new ArrayList<Object>();
		list.addAll((List<Object>) property.getModel().eGet(getFeature()));
	    return list;
	}

	@Override
	public int getSorterID() {
		return 0;
	}

	class MappingLayerLabelProvider extends LabelProvider {
		public String getText(Object element) {
			return element == null ? "" : ((MappingLayer) element).getName();
		}

	}

}
