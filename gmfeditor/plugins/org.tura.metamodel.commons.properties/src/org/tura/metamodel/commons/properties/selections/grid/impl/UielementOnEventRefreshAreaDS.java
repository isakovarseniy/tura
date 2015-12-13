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
package org.tura.metamodel.commons.properties.selections.grid.impl;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.epsilon.common.dt.util.LogUtil;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.tura.metamodel.commons.QueryHelper;
import org.tura.metamodel.commons.properties.selections.grid.DataSource;
import org.tura.metamodel.commons.properties.selections.grid.GridProperty;

import domain.DomainPackage;

public class UielementOnEventRefreshAreaDS extends DataSource {

	private GridProperty property;

	public UielementOnEventRefreshAreaDS(GridProperty property) {
		this.property = property;
	}

	@Override
	public void addRow() {
	}

	@Override
	public void removeRow(Object row) {
	}

	@Override
	public List<Object> queryRows() {

		EditingDomain editingDomain = ((DiagramEditor) property.getPart())
				.getEditingDomain();

		try {

			Object[] result = (new QueryHelper())
					.findRefreshedAeas((domain.Uielement) property.getModel());

			@SuppressWarnings("unchecked")
			List<domain.NickNamed> allAreas = (List<domain.NickNamed>) result[0];
			@SuppressWarnings("unchecked")
			List<domain.AreaRef> removeAreas = (List<domain.AreaRef>) result[1];

			// Remove
			editingDomain.getCommandStack().execute(
					RemoveCommand.create(editingDomain, property.getModel(),
							DomainPackage.eINSTANCE
									.getUielement_RefreshAreas(),
									removeAreas));

			ArrayList<Object> rows = new ArrayList<Object>();
			
			boolean noThisElement = true;
			for (domain.AreaRef p : ((domain.Uielement) property.getModel()).getRefreshAreas() ) {
				RefreshAreaRow r = new RefreshAreaRow(p);
				if (p.getArea().equals(((domain.Uielement) property.getModel())) ){
					noThisElement = false;
					r.setTHIS("this");
				}
				

				if (allAreas.contains(p.getArea()))
					allAreas.remove(p.getArea());
				
				rows.add(r);
			}

			if (noThisElement){
				rows.add( new RefreshAreaRow(((domain.Uielement) property.getModel()),"this"));
			}
			
			for (domain.NickNamed nick :  allAreas){
				rows.add( new RefreshAreaRow(nick));
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
