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
package org.tura.metamodel.commons.properties.selections.grid;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.swt.widgets.TableItem;

public class CellModifier implements ICellModifier {

	private List<String> columnNames;
	private List<GridColumn> columnsList;
	private DataSource ds;

	public CellModifier(List<GridColumn> columnsList, DataSource ds){
		this.ds=ds;
		columnNames = new ArrayList<String>();
		this.columnsList=columnsList;

		for (Iterator<GridColumn> itr = columnsList.iterator() ; itr.hasNext(); ){
			GridColumn column = itr.next();
			columnNames.add(column.getName());
		}
		
	}

	public boolean canModify(Object element, String property) {
		int columnIndex = columnNames.indexOf(property);
		return columnsList.get(columnIndex).isModify(element, property);
	}
	
	public Object getValue(Object element, String property) {

		int columnIndex = columnNames.indexOf(property);
		return columnsList.get(columnIndex).getValue(element);

	}

	public void modify(Object element, String property, Object value) {
		if ( element  == null )
			return;
		int columnIndex = columnNames.indexOf(property);
		columnsList.get(columnIndex).modify(element,value);
		TableItem item = (TableItem) element;
		ds.notifyRowChanged(item.getData());
	}
	
}