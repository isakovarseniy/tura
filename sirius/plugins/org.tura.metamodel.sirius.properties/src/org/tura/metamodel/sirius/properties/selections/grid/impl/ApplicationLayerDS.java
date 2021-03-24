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
import java.util.Collections;
import java.util.List;
import java.util.UUID;

import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.tura.metamodel.sirius.properties.selections.grid.DataSource;
import org.tura.metamodel.sirius.properties.selections.grid.GridProperty;

import application.ApplicationMappers;
import application.ApplicationPackage;
import mapper.MapperFactory;
import mapper.MapperPackage;
import mapper.MappingLayer;

public class ApplicationLayerDS extends DataSource {

	private GridProperty property;

	public ApplicationLayerDS(GridProperty property) {
		this.property = property;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void addRow() {
		MappingLayer layer = MapperFactory.eINSTANCE.createMappingLayer();
		layer.setName("New option");
		layer.setUid(UUID.randomUUID().toString());
		layer.setOrder(((ApplicationMappers) property.getModel()).getAppLayers().size());
		ArrayList<MappingLayer> ls = new ArrayList<MappingLayer>();
		ls.add(layer);

		Session session = SessionManager.INSTANCE.getSession(this.property.getModel());
		EditingDomain editingDomain = session.getTransactionalEditingDomain();

		editingDomain.getCommandStack().execute(
				AddCommand.create(editingDomain, ((ApplicationMappers) property.getModel()),ApplicationPackage.eINSTANCE.getApplicationMappers_AppLayers(), ls));

		rowList.add(rowList.size(), layer);
		
		Collections.sort(rowList, new MappingLayerComparator());
		
		this.notifyAddRow(layer);

	}

	@Override
	public void removeRow(Object row) {
		ArrayList<MappingLayer> ls = new ArrayList<MappingLayer>();
		ls.add((MappingLayer) row);

		Session session = SessionManager.INSTANCE.getSession(this.property.getModel());
		EditingDomain editingDomain = session.getTransactionalEditingDomain();

		editingDomain.getCommandStack().execute(RemoveCommand.create(editingDomain, ((ApplicationMappers) property.getModel()),
				ApplicationPackage.eINSTANCE.getApplicationMappers_AppLayers(), ls));

		rowList.remove(row);
		this.notifyRemoveRow(row);

	}

	@SuppressWarnings("unchecked")
	@Override
	public void upRow(Object row){
		MappingLayer layer = (MappingLayer) row;
		
		int i = rowList.indexOf(layer);

		if(i>0){
			rowList.add( i -1, row);
			rowList.remove(i+1);
	    }		
		
		Session session = SessionManager.INSTANCE.getSession(this.property.getModel());
		EditingDomain editingDomain = session.getTransactionalEditingDomain();

		for ( int k = rowList.size()-1,  j = 0 ; k >= 0; k-- ,j++){
			editingDomain.getCommandStack().execute(SetCommand.create(editingDomain, rowList.get(j),
					MapperPackage.eINSTANCE.getMappingLayer_Order(), k));
		}
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public void downRow(Object row){
		MappingLayer layer = (MappingLayer) row;

		int i = rowList.indexOf(layer);

	    if((i!=-1) && (i < rowList.size()-1)) {
	    	rowList.add(i+2,row); 
	    	rowList.remove(i);
	    }
		
		Session session = SessionManager.INSTANCE.getSession(this.property.getModel());
		EditingDomain editingDomain = session.getTransactionalEditingDomain();

		for ( int k = rowList.size()-1,  j = 0 ; k > 0; k-- ,j++){
			editingDomain.getCommandStack().execute(SetCommand.create(editingDomain, rowList.get(j),
					MapperPackage.eINSTANCE.getMappingLayer_Order(), k));
		}
		
	}
	
	
	@Override
	public List<Object> queryRows() {
		
		ApplicationMappers appMappers = (ApplicationMappers) property.getModel();
		List<MappingLayer>  layers = new ArrayList<MappingLayer>();
		layers.addAll(appMappers.getAppLayers());
		
		Collections.sort(layers, new MappingLayerComparator());

		List<Object>  result = new ArrayList<Object>();
		result.addAll(layers);
		return result;
		
	}

	@Override
	public int getSorterID() {
		return 0;
	}
	
}
