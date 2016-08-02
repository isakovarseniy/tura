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
import java.util.List;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.tura.metamodel.sirius.properties.selections.adapters.textdata.QueryVariableName;
import org.tura.metamodel.sirius.properties.selections.adapters.textdata.QueryVariableValue;
import org.tura.metamodel.sirius.properties.selections.events.Bus;
import org.tura.metamodel.sirius.properties.selections.events.Event;
import org.tura.metamodel.sirius.properties.selections.events.EventListener;
import org.tura.metamodel.sirius.properties.selections.events.QueryChangeEvent;
import org.tura.metamodel.sirius.properties.selections.grid.GridColumn;
import org.tura.metamodel.sirius.properties.selections.grid.GridProperty;
import org.tura.metamodel.sirius.properties.selections.grid.GridTextColumn;


public class QueryVariablePropertySelection extends GridProperty{

	private List<GridColumn> columnList;
	private SelectionListener listener = new SelectionListener();
	
	public QueryVariablePropertySelection(){
		ds = new QueryVariableDS(this);
	}
	
	@Override
	public List<GridColumn> getColumns() {
        if (columnList == null ){
        	columnList = new ArrayList<GridColumn>();
        	columnList.add(new OptionColumn(table, this,0));
        	columnList.add(new ValueColumn(table, this,1));
        }
		return columnList;
	}
	@Override
	public void createControls(Composite parent, TabbedPropertySheetPage aTabbedPropertySheetPage) {
		super.createControls(parent, aTabbedPropertySheetPage);
		Bus.getInstance().addEventListner(listener);
		
	}

	class OptionColumn extends GridTextColumn{

		public OptionColumn(Table table, GridProperty property, int col) {
			super(table, property, col);
			setTextDataAdapter(new QueryVariableName());
			this.setColumnName("Option");
		}
		@Override
		public boolean isModify(Object element, String property) {
			return false;
		}
		
	}
	
	class ValueColumn extends GridTextColumn{

		public ValueColumn(Table table, GridProperty property, int col) {
			super(table, property, col);
			setTextDataAdapter(new QueryVariableValue());
			this.setColumnName("Value");
		}
		
	}
	private class SelectionListener implements EventListener {

		public SelectionListener() {
		}

		@Override
		public void handleEvent(Event event) {
			if (event instanceof QueryChangeEvent) {
				ds.cleanList();
				ds.getRows();
				refresh();
			}
		}
	}
	
	@Override
	public void dispose(){
		Bus.getInstance().removeEventListner(listener);
	}
	
}
