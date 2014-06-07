package org.metamodel.tura.ui.properties.sections.grid;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerSorter;

public class Sorter extends ViewerSorter {
	private GridColumn column;

	public Sorter(GridColumn column) {
		this.column = column;
	}

	public int compare(Viewer viewer, Object o1, Object o2) {

		return column.compareOptions(o1, o2);

	}

}
