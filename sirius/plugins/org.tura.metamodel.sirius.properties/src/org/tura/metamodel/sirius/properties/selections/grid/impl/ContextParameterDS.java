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
import java.util.List;
import java.util.UUID;

import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.tura.metamodel.sirius.properties.selections.grid.DataSource;
import org.tura.metamodel.sirius.properties.selections.grid.GridProperty;

import form.ContextParameter;
import form.ContextParameters;
import form.ContextValue;
import form.FormFactory;
import form.FormPackage;


public abstract class ContextParameterDS extends DataSource {

	protected GridProperty property;

	public ContextParameterDS(GridProperty property) {
		this.property = property;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void addRow() {
		ContextParameter parameter = FormFactory.eINSTANCE.createContextParameter();
		parameter.setUid(UUID.randomUUID().toString());
		
		ContextValue cntVal = FormFactory.eINSTANCE.createContextValue();
		cntVal.setUid(UUID.randomUUID().toString());
		parameter.setValue(cntVal);
		
		ArrayList<ContextParameter> ls = new ArrayList<ContextParameter>();
		ls.add(parameter);

		EditingDomain editingDomain = ((DiagramEditor) property.getPart())
				.getEditingDomain();

		editingDomain.getCommandStack().execute(
				AddCommand.create(editingDomain, ((ContextParameters) property
						.getModel()), FormPackage.eINSTANCE
						.getContextParameters_Parameters(), ls));

		rowList.add(rowList.size(), parameter);
		this.notifyAddRow(parameter);

	}

	@Override
	public void removeRow(Object row) {
		ArrayList<ContextParameter> ls = new ArrayList<ContextParameter>();
		ls.add((ContextParameter) row);

		EditingDomain editingDomain = ((DiagramEditor) property.getPart())
				.getEditingDomain();

		editingDomain.getCommandStack().execute(
				RemoveCommand.create(editingDomain, ((ContextParameters) property
						.getModel()), FormPackage.eINSTANCE
						.getContextParameters_Parameters(), ls));

		rowList.remove(row);
		this.notifyRemoveRow(row);

	}

	@Override
	public abstract List<Object> queryRows() ;

	@Override
	public int getSorterID() {
		return 0;
	}

}
