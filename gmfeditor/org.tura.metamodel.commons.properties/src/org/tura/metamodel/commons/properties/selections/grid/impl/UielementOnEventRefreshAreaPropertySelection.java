package org.tura.metamodel.commons.properties.selections.grid.impl;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.CheckboxCellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.tura.metamodel.commons.properties.selections.adapters.textdata.AreaNickname;
import org.tura.metamodel.commons.properties.selections.grid.GridColumn;
import org.tura.metamodel.commons.properties.selections.grid.GridProperty;
import org.tura.metamodel.commons.properties.selections.grid.GridTextColumn;

import domain.DomainPackage;
import domain.Uielement;

public class UielementOnEventRefreshAreaPropertySelection extends GridProperty {

	private List<GridColumn> columnList;

	@Override
	public EObject getModel() {
		return getEObject();
	}

	public UielementOnEventRefreshAreaPropertySelection() {
		ds = new UielementOnEventRefreshAreaDS(this);
	}

	@Override
	public List<GridColumn> getColumns() {
		if (columnList == null) {
			columnList = new ArrayList<GridColumn>();
			columnList.add(new NickColumn(table, this, 0));
			columnList.add(new RefrashableColumn(table, this, 1));
		}
		return columnList;
	}

	class NickColumn extends GridTextColumn {

		public NickColumn(Table table, GridProperty property, int col) {
			super(table, property, col);
			setTextDataAdapter(new AreaNickname());
			this.setColumnName("Nick name");
		}
		
		@Override
		public boolean isModify(Object element, String property) {
			return false;
		}
	}	
	

	class RefrashableColumn implements GridColumn {

		// Set the table column property names
		private final String REFRASHABLE_COLUMN = "Is refreshable";
		private int col;

		private Table table;
		private GridProperty property;

		public RefrashableColumn(Table table, GridProperty property, int col) {
			this.table = table;
			this.property = property;
			this.col = col;
		}

		@Override
		public TableColumn createColumn() {
			TableColumn column = new TableColumn(table, SWT.LEFT, col);
			column.setText(REFRASHABLE_COLUMN);
			column.setWidth(80);
			return column;
		}

		@Override
		public String getName() {
			return REFRASHABLE_COLUMN;
		}

		@Override
		public CellEditor getEditor() {
			CheckboxCellEditor textEditor = new CheckboxCellEditor(table);
			return textEditor;
		}

		@Override
		public int compareOptions(Object o1, Object o2) {
			return 0;
		}

		@Override
		public Object getValue(Object element) {
			UielementOnEventRefreshAreaDS.Area opt = (UielementOnEventRefreshAreaDS.Area) element;
			return opt.isRefreshed();
		}

		@Override
		public void modify(Object element, Object value) {

			TableItem item = (TableItem) element;
			UielementOnEventRefreshAreaDS.Area opt = (UielementOnEventRefreshAreaDS.Area) item
					.getData();

			Boolean refreshable = ((Boolean) value);
			opt.setRefreshed(refreshable);
			EditingDomain editingDomain = ((DiagramEditor) getPart())
					.getEditingDomain();

			if (refreshable) {
				ArrayList<domain.NickNamed> ls = new ArrayList<domain.NickNamed>();
				ls.add(opt.getElement());

				editingDomain
						.getCommandStack()
						.execute(
								AddCommand.create(editingDomain, property
										.getModel(), DomainPackage.eINSTANCE
										.getUielement_OnEventRefreshArea(), ls));
			} else {
				ArrayList<domain.NickNamed> ls = new ArrayList<domain.NickNamed>();
				Uielement uie = (Uielement) property.getModel();
				for (domain.NickNamed ev : uie.getOnEventRefreshArea()) {
					String elUID = null;
					if (ev instanceof domain.Uielement) {
						elUID = ((domain.Uielement) ev).getUid();
					}
					if (ev instanceof domain.ViewPort) {
						elUID = ((domain.ViewPort) ev).getUid();
					}

					if (elUID.equals(opt.getUid()))
						ls.add(ev);

				}
				editingDomain
						.getCommandStack()
						.execute(
								RemoveCommand.create(editingDomain, property
										.getModel(), DomainPackage.eINSTANCE
										.getUielement_OnEventRefreshArea(), ls));

			}

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