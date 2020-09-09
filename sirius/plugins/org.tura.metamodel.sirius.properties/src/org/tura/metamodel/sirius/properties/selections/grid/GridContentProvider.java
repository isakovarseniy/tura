/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2020 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   http://sourceforge.net/p/tura/wiki/Home/
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.tura.metamodel.sirius.properties.selections.grid;

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
		if (ds == null || ds.getRows() == null)
			return new Object[]{};
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
