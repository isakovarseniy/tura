package org.metamodel.tura.ui.properties.sections.grid;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.Viewer;

public class GridContentProvider implements IStructuredContentProvider {

	private TableViewer tableViewer;
	protected DataSource ds;

	public GridContentProvider(TableViewer tableViewer, DataSource ds) {
		this.tableViewer = tableViewer;
		this.ds = ds;
	}

	public void inputChanged(Viewer v, Object oldInput, Object newInput) {
		if (oldInput != null)
			((DataSource) oldInput).removeChangeListener(this);
		if (newInput != null)
			((DataSource) newInput).addChangeListener(this);
	}

	public void dispose() {
		ds.removeChangeListener(this);
	}

	// Return the tasks as an array of Objects
	public Object[] getElements(Object parent) {
		return ds.getRows().toArray();
	}

	public void addRaw(Object raw) {
		tableViewer.add(raw);
	}

	public void removeRow(Object raw) {
		tableViewer.remove(raw);
	}

	public void updateRow(Object raw) {
		tableViewer.update(raw, null);
	}

}
