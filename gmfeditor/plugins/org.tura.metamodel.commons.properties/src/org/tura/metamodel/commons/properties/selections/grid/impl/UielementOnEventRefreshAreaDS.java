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
import java.util.HashMap;
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
			List<domain.NickNamed> removeAreas = (List<domain.NickNamed>) result[1];

			ArrayList<domain.AreaRef> removeAreaRef = new  ArrayList<>();
			for (domain.NickNamed element : removeAreas){
				for (  domain.AreaRef  ref :  ((domain.Uielement)element).getRefreshAreas()  ){
					if (ref.getArea().equals(element) ){
						removeAreaRef.add(ref);
					}
				}
			}
			// Remove
			editingDomain.getCommandStack().execute(
					RemoveCommand.create(editingDomain, property.getModel(),
							DomainPackage.eINSTANCE
									.getUielement_RefreshAreas(),
									removeAreaRef));

			HashMap<String, domain.NickNamed> map = new HashMap<String, domain.NickNamed>();
			for (domain.NickNamed event : ((domain.Uielement) (property.getModel())).getOnEventRefreshArea()) {
				if (event instanceof domain.Uielement) {
					map.put( ((domain.Uielement) event).getUid(), event);
				}
				if (event instanceof domain.ViewPort) {
					map.put( ((domain.ViewPort) event).getUid(), event);
				}
				if (event instanceof domain.ViewArea) {
					map.put( ((domain.ViewArea) event).getUid(), event);
				}				
			}

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
