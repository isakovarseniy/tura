/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2023 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
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
