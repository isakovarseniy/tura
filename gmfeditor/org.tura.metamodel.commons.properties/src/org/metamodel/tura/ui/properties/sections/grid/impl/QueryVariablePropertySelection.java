package org.metamodel.tura.ui.properties.sections.grid.impl;

import java.text.Collator;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
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
import org.metamodel.tura.ui.properties.sections.grid.GridColumn;
import org.metamodel.tura.ui.properties.sections.grid.GridProperty;

import domain.DomainPackage;


public class QueryVariablePropertySelection extends GridProperty{

	private List<GridColumn> columnList;
	
	@Override
	public EObject getModel() {
		return getEObject();
	}
	
	public QueryVariablePropertySelection(){
		ds = new QueryVariableDS(this);
	}
	
	@Override
	public List<GridColumn> getColumns() {
        if (columnList == null ){
        	columnList = new ArrayList<GridColumn>();
        	columnList.add(new OptionColumn(table, this));
        	columnList.add(new ValueColumn(table, this));
        }
		return columnList;
	}


	class OptionColumn implements GridColumn {
		public static final String COLUMN_NAME = "Option";

		private Table table;
		@SuppressWarnings("unused")
		private GridProperty property;

		public OptionColumn(Table table, GridProperty property) {
			this.table = table;
			this.property=property;
		}

		@Override
		public TableColumn createColumn() {

			TableColumn column = new TableColumn(table, SWT.LEFT, 0);
			column.setText(COLUMN_NAME);
			column.setWidth(400);
			return column;
		}

		@Override
		public String getName() {
			return COLUMN_NAME;
		}

		@Override
		public CellEditor getEditor() {

			TextCellEditor textEditor = new TextCellEditor(table);
			((Text) textEditor.getControl()).setTextLimit(60);

			return textEditor;
		}

		@Override
		public int compareOptions(Object o1, Object o2) {
			domain.QueryVariable opt1 = (domain.QueryVariable) o1;
			domain.QueryVariable opt2 = (domain.QueryVariable) o2;

			if ((opt1.getQueryParamRef() == null)
					|| (opt2.getQueryParamRef() == null))
				return -1;

			return Collator.getInstance().compare(
					opt1.getQueryParamRef().getName(),
					opt2.getQueryParamRef().getName());
		}

		@Override
		public Object getValue(Object element) {
			Object result = null;
			domain.QueryVariable opt = (domain.QueryVariable) element;

			if (opt.getQueryParamRef() == null)
				result = "";
			else
				result = opt.getQueryParamRef().getName();

			return result;
		}

		@Override
		public void modify(Object element, Object value) {
		}

		@Override
		public boolean isModify(Object element, String property) {
			return false;
		}
		@Override
		public Object getText(Object element) {
			return getValue(element);
		}

	}
	
	class ValueColumn implements GridColumn {

		public static final String COLUMN_NAME = "Value";

		private Table table;
		private GridProperty property;

		public ValueColumn(Table table, GridProperty property) {
			this.table = table;
			this.property = property;
		}

		@Override
		public TableColumn createColumn() {
			// 1 nd column with task Option
			TableColumn column = new TableColumn(table, SWT.LEFT, 1);
			column.setText(COLUMN_NAME);
			column.setWidth(100);
			return column;
		}

		@Override
		public String getName() {
			return COLUMN_NAME;
		}

		@Override
		public CellEditor getEditor() {
			TextCellEditor textEditor = new TextCellEditor(table);
			((Text) textEditor.getControl()).setTextLimit(100);
			return textEditor;
		}

		@Override
		public int compareOptions(Object o1, Object o2) {
			domain.QueryVariable opt1 = (domain.QueryVariable) o1;
			domain.QueryVariable opt2 = (domain.QueryVariable) o2;

			if ((opt1.getValue() == null) || (opt2.getValue() == null))
				return -1;
			return Collator.getInstance().compare(opt1.getValue(), opt2.getValue());
		}

		@Override
		public Object getValue(Object element) {
			String result = "";
			domain.QueryVariable opt = (domain.QueryVariable) element;

			result = opt.getValue();
			if (result == null)
				result = "";

			return result;

		}

		@Override
		public void modify(Object element, Object value) {

			TableItem item = (TableItem) element;
			domain.QueryVariable opt = (domain.QueryVariable) item.getData();

			String valueString = ((String) value).trim();
			EditingDomain editingDomain = ((DiagramEditor) property.getPart())
					.getEditingDomain();
			/* apply the property change to single selected object */
			editingDomain.getCommandStack().execute(
					SetCommand.create(editingDomain, opt,
							DomainPackage.eINSTANCE.getQueryVariable_Value(),
							valueString));
		}

		@Override
		public boolean isModify(Object element, String property) {
			return true;
		}

		@Override
		public Object getText(Object element) {
			return getValue(element);
		}
		

	}
}
