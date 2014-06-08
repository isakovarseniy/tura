package org.tura.metamodel.commons.properties.selections.grid;

import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.widgets.TableColumn;

public interface GridColumn {

    public abstract TableColumn createColumn();

	public abstract String getName();

	public abstract CellEditor getEditor() ;

	public abstract int compareOptions(Object o1, Object o2) ;

	public abstract Object getValue(Object element);

	public abstract Object getText(Object element);

	public abstract void modify(Object element, Object value);
	
	public abstract boolean isModify(Object element, String property);
}
