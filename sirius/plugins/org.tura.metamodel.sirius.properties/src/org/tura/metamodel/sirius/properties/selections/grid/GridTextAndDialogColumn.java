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

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.tura.metamodel.commons.properties.selections.adapters.helper.TreeRoot;
import org.tura.metamodel.sirius.properties.selections.TextDataAdapter;

public abstract class GridTextAndDialogColumn implements GridColumn {

	private String columnName;

	private Table table;
	private GridProperty property;
	private int width = 400;
	private int col;
	private TextDataAdapter dataAdapter;

	public abstract TreeRoot getContextRoot();

	public abstract boolean checkType(Object tableItem, Object selectedElement);

	public GridTextAndDialogColumn(Table table, GridProperty property, int col) {
		this.table = table;
		this.property = property;
		this.col = col;
	}

	@Override
	public TableColumn createColumn() {
		TableColumn column = new TableColumn(table, SWT.LEFT, col);
		column.setText(columnName);
		column.setWidth(width);
		return column;
	}

	@Override
	public String getName() {
		return columnName;
	}

	@Override
	public CellEditor getEditor() {
		TextAndDialogCellEditor editor = new TextAndDialogCellEditor(table);
		return editor;
	}

	@Override
	public int compareOptions(Object o1, Object o2) {
		return 0;
	}

	@Override
	public Object getValue(Object element) {
		return dataAdapter.getFeatureValue(modelConverter(element),null);
	}

	@Override
	public Object getText(Object element) {
		return dataAdapter.getFeatureValue(modelConverter(element),null);
	}

	@Override
	public void modify(Object element, Object value) {
		if (element == null)
			return;

		TableItem item = (TableItem) element;

		Object data = modelConverter( item.getData());
		if (value instanceof TreePath ){
		  Object obj = ((TreePath) value).getLastSegment();
			if ( checkType(data, obj)) {
	
				EditingDomain editingDomain = ((DiagramEditor) this.property.getPart()).getEditingDomain();
				EStructuralFeature feature = dataAdapter.getFeature();
				Command setCommand = SetCommand.create(editingDomain, data, feature, obj);
				editingDomain.getCommandStack().execute(setCommand);
			}
		}
	}

	@Override
	public boolean isModify(Object element, String property) {
		CellEditor editor = this.property.getTableViewer().getCellEditors()[col];
		((TextAndDialogCellEditor) editor).setRootObject(getContextRoot());
		return true;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void setTextDataAdapter(TextDataAdapter dataAdapter){
		this.dataAdapter=dataAdapter;
	}

	public GridProperty getProperty() {
		return property;
	}
	
	public Object modelConverter(Object model){
		return model;
	}
}
