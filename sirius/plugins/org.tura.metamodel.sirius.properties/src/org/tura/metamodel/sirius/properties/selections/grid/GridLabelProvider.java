/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.tura.metamodel.sirius.properties.selections.grid;

import java.util.List;

import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;

public class GridLabelProvider extends LabelProvider implements ITableLabelProvider {
	
	private List<GridColumn> columnsList;

	public GridLabelProvider(List<GridColumn> columnsList){
		this.columnsList=columnsList;
		
	}

	public String getColumnText(Object element, int columnIndex) {
		if (columnsList.get(columnIndex) == null ||  columnsList.get(columnIndex).getText(element) == null)
			return "";
		return columnsList.get(columnIndex).getText(element).toString();
	}

	public Image getColumnImage(Object element, int columnIndex) {
		return null;
	}

}
