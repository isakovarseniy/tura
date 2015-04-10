package org.tura.metamodel.commons.properties.selections.grid;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;
import org.tura.metamodel.commons.properties.selections.TextDataAdapter;

public class GridTextColumn implements GridColumn {

	private String columnName;
	private Table table;
	private GridProperty property;
	private int width = 100;
	private int col;
	private TextDataAdapter dataAdapter;

	public GridTextColumn(Table table, GridProperty property, int col) {
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
		TextCellEditor textEditor = new TextCellEditor(table);
		((Text) textEditor.getControl()).setTextLimit(100);
		return textEditor;
	}

	@Override
	public int compareOptions(Object o1, Object o2) {
		return 0;
	}

	@Override
	public Object getValue(Object element) {
		EStructuralFeature feature = dataAdapter.getFeature();
		if (dataAdapter instanceof TextColumnConverter)
		    return ((TextColumnConverter) dataAdapter).convertToText(dataAdapter.getFeatureValue((EObject) element, feature));
		else
		    return dataAdapter.getFeatureValue((EObject) element, feature);
	}

	@Override
	public Object getText(Object element) {
		EStructuralFeature feature = dataAdapter.getFeature();
		if (dataAdapter instanceof TextColumnConverter)
		    return ((TextColumnConverter) dataAdapter).convertToText(dataAdapter.getFeatureValue((EObject) element, feature));
		else
		    return dataAdapter.getFeatureValue( element, feature);
	}

	@Override
	public void modify(Object element, Object value) {
		Object data = ((TableItem) element).getData();

		EditingDomain editingDomain = ((DiagramEditor) this.property.getPart()).getEditingDomain();
		EStructuralFeature feature = dataAdapter.getFeature();

		if (dataAdapter instanceof TextColumnConverter){
			value = ((TextColumnConverter) dataAdapter).convertToObject((String) value);
		}
		Command setCommand = SetCommand
				.create(editingDomain, data, feature, value);

		editingDomain.getCommandStack().execute(setCommand);

	}

	@Override
	public boolean isModify(Object element, String property) {
		return true;
	}

	public void setTextDataAdapter(TextDataAdapter dataAdapter) {
		this.dataAdapter = dataAdapter;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

}
