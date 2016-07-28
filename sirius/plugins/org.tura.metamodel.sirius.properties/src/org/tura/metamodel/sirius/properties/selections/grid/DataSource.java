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
package org.tura.metamodel.sirius.properties.selections.grid;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public abstract class DataSource {

	@SuppressWarnings("rawtypes")
	protected List rowList;
	@SuppressWarnings("rawtypes")
	private Set changeListeners = new HashSet();
	
	private boolean renewed = false;

	public List<?> getRows() {
		if (rowList == null){
			rowList=queryRows();
			renewed = true;
		}
		return rowList;
	}
	
	public void reset(){
		renewed = false;
	}

	public boolean isRenewed() {
		return renewed;
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
