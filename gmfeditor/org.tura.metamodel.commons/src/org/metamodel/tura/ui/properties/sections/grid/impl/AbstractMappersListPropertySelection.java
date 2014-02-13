package org.metamodel.tura.ui.properties.sections.grid.impl;

import java.text.Collator;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Text;
import org.metamodel.tura.ui.properties.sections.grid.GridColumn;
import org.metamodel.tura.ui.properties.sections.grid.GridProperty;

public class AbstractMappersListPropertySelection extends GridProperty {

	private List<GridColumn> columnList;

	@Override
	public List<GridColumn> getColumns() {
		if (columnList == null) {
			columnList = new ArrayList<GridColumn>();
			columnList.add(new MapperColumn(table, this));
		}
		return columnList;
	}

	class MapperColumn implements GridColumn {

		// Set the table column property names
		private final String MAPPERS_COLUMN = "Mappers";

		private Table table;
		@SuppressWarnings("unused")
		private GridProperty property;

		public MapperColumn(Table table, GridProperty property) {
			this.table = table;
			this.property = property;
		}

		@Override
		public TableColumn createColumn() {
			TableColumn column = new TableColumn(table, SWT.LEFT, 0);
			column.setText(MAPPERS_COLUMN);
			column.setWidth(400);
			return column;
		}

		@Override
		public String getName() {
			return MAPPERS_COLUMN;
		}

		@Override
		public CellEditor getEditor() {
			TextCellEditor textEditor = new TextCellEditor(table);
			((Text) textEditor.getControl()).setTextLimit(60);
			return textEditor;
		}

		@Override
		public int compareOptions(Object o1, Object o2) {
			domain.ApplicationMapper opt1 = (domain.ApplicationMapper) o1;
			domain.ApplicationMapper opt2 = (domain.ApplicationMapper) o2;

			if ((opt1 == null) || (opt2 == null))
				return -1;
			return Collator.getInstance().compare(opt1.getName(),
					opt2.getName());
		}

		@Override
		public Object getValue(Object element) {
			return null;
		}

		@Override
		public Object getText(Object element) {
			String result = "";
			String task = ((domain.ApplicationMapper) element).getName();
			if (task != null)
				result = task;
			return result;
		}

		@Override
		public void modify(Object element, Object value) {

		}

		@Override
		public boolean isModify() {
			return false;
		}

	}

}
