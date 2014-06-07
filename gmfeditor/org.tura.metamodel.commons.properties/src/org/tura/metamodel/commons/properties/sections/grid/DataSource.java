package org.tura.metamodel.commons.properties.sections.grid;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public abstract class DataSource {

	@SuppressWarnings("rawtypes")
	protected List rowList;
	@SuppressWarnings("rawtypes")
	private Set changeListeners = new HashSet();

	public List<?> getRows() {
		if (rowList == null)
			rowList=queryRows();
		return rowList;
	}

	public void notifyAddRow(Object row) {
		Iterator<?> iterator = changeListeners.iterator();
		while (iterator.hasNext())
			((GridContentProvider) iterator.next()).addRaw(row);

	}

	public void notifyRemoveRow(Object row) {
		Iterator<?> iterator = changeListeners.iterator();
		while (iterator.hasNext())
			((GridContentProvider) iterator.next()).removeRow(row);
	}

	public void notifyRowChanged(Object raw) {
		Iterator<?> iterator = changeListeners.iterator();
		while (iterator.hasNext())
			((GridContentProvider) iterator.next()).updateRow(raw);
	}

	public void removeChangeListener(GridContentProvider viewer) {
		changeListeners.remove(viewer);
	}

	@SuppressWarnings("unchecked")
	public void addChangeListener(GridContentProvider viewer) {
		changeListeners.add(viewer);
	}

	public abstract void addRow();
	public abstract void removeRow(Object row);
	public abstract List<Object> queryRows();
	public abstract int getSorterID();

	public void cleanList() {
		rowList=null;
	}
	
}
