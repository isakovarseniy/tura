package org.metamodel.tura.ui.properties.sections.grid;

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
		return columnsList.get(columnIndex).getValue(element).toString();
	}

	public Image getColumnImage(Object element, int columnIndex) {
		return null;
	}

}
