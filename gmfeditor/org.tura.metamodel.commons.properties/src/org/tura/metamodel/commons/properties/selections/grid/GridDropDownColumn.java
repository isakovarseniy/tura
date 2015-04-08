package org.tura.metamodel.commons.properties.selections.grid;

import java.util.LinkedHashMap;
import java.util.Map;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ComboBoxCellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.tura.metamodel.commons.properties.selections.DropDownDataAdapter;

public abstract class GridDropDownColumn implements GridColumn {

	private String columnName;

	private Table table;
	private GridProperty property;
	private int width = 100;
	private int col;
	private DropDownDataAdapter dataAdapter;
	LinkedHashMap<String, Object> options;

	public abstract Map<String, Object> getEnumerationFeatureValues( EObject base);

	public GridDropDownColumn(Table table, GridProperty property, int col) {
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

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public String getName() {
		return columnName;
	}

	@Override
	public CellEditor getEditor() {
		ComboBoxCellEditor comboBoxCellEditor = new ComboBoxCellEditor(table, new String[] {}, SWT.READ_ONLY);
		return comboBoxCellEditor;
	}

	@Override
	public int compareOptions(Object o1, Object o2) {
		return 0;
	}

	@Override
	public Object getValue(Object element) {
		EObject base = (EObject) element;
		options = (LinkedHashMap<String, Object>) getEnumerationFeatureValues(base);
		ComboBoxCellEditor editor = ((ComboBoxCellEditor) (property.getTableViewer().getCellEditors()[col]));
		editor.setItems(options.keySet().toArray(new String[options.keySet().size()]));
		return  editor.getValue();
	}

	@Override
	public Object getText(Object element) {
		EObject base = (EObject) element;
		options = (LinkedHashMap<String, Object>) getEnumerationFeatureValues(base);
		return this.dataAdapter.getFeatureAsText(element);
	}

	@Override
	public void modify(Object element, Object value) {
		Object data = ((TableItem)element).getData();
		
		ComboBoxCellEditor editor = ((ComboBoxCellEditor) (property.getTableViewer().getCellEditors()[col]));
		Object v = editor.getItems()[(int) value];

		EditingDomain editingDomain = ((DiagramEditor) this.property.getPart()).getEditingDomain();
		CompoundCommand compoundCommand = new CompoundCommand();
		EStructuralFeature[] features = dataAdapter.getFeature();

		for (int i = 0; i < features.length; i++) {
			compoundCommand.append(SetCommand.create(editingDomain, data, features[i],
					dataAdapter.getFeatureValue(data, options, features[i], v)));
		}
		editingDomain.getCommandStack().execute(compoundCommand);
	}

	@Override
	public boolean isModify(Object element, String property) {
		return true;
	}

	public void setDropDownDataAdapter(DropDownDataAdapter dataAdapter) {
		this.dataAdapter = dataAdapter;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}
}
