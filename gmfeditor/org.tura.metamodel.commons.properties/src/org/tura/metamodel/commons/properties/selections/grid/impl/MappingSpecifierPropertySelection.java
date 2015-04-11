package org.tura.metamodel.commons.properties.selections.grid.impl;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.tura.metamodel.commons.properties.selections.adapters.dropdown.MappingSpecifierSpecifierRef;
import org.tura.metamodel.commons.properties.selections.adapters.textdata.MappingSpecifierName;
import org.tura.metamodel.commons.properties.selections.grid.GridColumn;
import org.tura.metamodel.commons.properties.selections.grid.GridDropDownColumn;
import org.tura.metamodel.commons.properties.selections.grid.GridProperty;
import org.tura.metamodel.commons.properties.selections.grid.GridTextColumn;

import domain.Specifier;

public class MappingSpecifierPropertySelection extends GridProperty {

	private List<GridColumn> columnList;

	@Override
	public EObject getModel() {
		return getEObject();
	}

	public MappingSpecifierPropertySelection() {
		ds = new MappingSpecifierDS(this);
	}

	@Override
	public List<GridColumn> getColumns() {
		if (columnList == null) {
			columnList = new ArrayList<GridColumn>();
			columnList.add(new OptionColumn(table, this, 0));
			columnList.add(new ValueColumn(table, this, 1));
		}
		return columnList;
	}

	public void createControls(Composite parent, TabbedPropertySheetPage aTabbedPropertySheetPage) {

		Composite composite = aTabbedPropertySheetPage.getWidgetFactory().createFlatFormComposite(parent);

		GridLayout layout = new GridLayout(1, false);
		layout.marginWidth = 4;
		composite.setLayout(layout);
		super.createControls(composite, aTabbedPropertySheetPage);
		createButtons(composite, aTabbedPropertySheetPage);
	}

	private void createButtons(Composite parent, TabbedPropertySheetPage aTabbedPropertySheetPage) {
		Composite composite = aTabbedPropertySheetPage.getWidgetFactory().createFlatFormComposite(parent);

		GridLayout layout = new GridLayout(2, false);
		layout.marginWidth = 4;
		composite.setLayout(layout);

		// Create and configure the "Delete" button
		Button delete = new Button(composite, SWT.PUSH | SWT.CENTER);
		delete.setText("Delete");
		GridData gridData = new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING);
		gridData.widthHint = 80;
		delete.setLayoutData(gridData);

		delete.addSelectionListener(new SelectionAdapter() {

			// Remove the selection and refresh the view
			public void widgetSelected(SelectionEvent e) {
				Object row = ((IStructuredSelection) tableViewer.getSelection()).getFirstElement();
				if (row != null) {
					removeRow(row);
				}
			}
		});

	}

	class OptionColumn extends GridTextColumn {

		public OptionColumn(Table table, GridProperty property, int col) {
			super(table, property, col);
			setTextDataAdapter(new MappingSpecifierName());
			this.setColumnName("Option");
		}

		@Override
		public boolean isModify(Object element, String property) {
			return false;
		}
	}

	class ValueColumn extends GridDropDownColumn {

		public ValueColumn(Table table, GridProperty property, int col) {
			super(table, property, col);
			this.setColumnName("Value");
			setDropDownDataAdapter(new MappingSpecifierSpecifierRef());
		}

		@Override
		public Map<String, Object> getEnumerationFeatureValues(EObject base) {

			if (base == null)
				return new LinkedHashMap<>();
			Specifier ms = ((domain.MappingSpecifier) base).getSpecifierRef();
			if (ms == null)
				return new LinkedHashMap<>();

			Map<String, Object> ls = new LinkedHashMap<>();
			for (domain.Option option : ms.getOptions()) {
				ls.put(option.getValue(), option);
			}
			return ls;
		}

	}

	// class ValueColumn implements GridColumn {
	//
	// // Set the table column property names
	// private final String VALUE_COLUMN = "Value";
	//
	// private Table table;
	// @SuppressWarnings("unused")
	// private GridProperty property;
	//
	// public ValueColumn(Table table, GridProperty property) {
	// this.table = table;
	// this.property = property;
	// }
	//
	// @Override
	// public TableColumn createColumn() {
	// TableColumn column = new TableColumn(table, SWT.LEFT, 1);
	// column.setText(VALUE_COLUMN);
	// column.setWidth(100);
	//
	// return column;
	// }
	//
	// @Override
	// public String getName() {
	// return VALUE_COLUMN;
	// }
	//
	// @Override
	// public CellEditor getEditor() {
	// ComboBoxCellEditor comboBoxCellEditor = new ComboBoxCellEditor(
	// table, new String[] {}, SWT.READ_ONLY);
	// return comboBoxCellEditor;
	// }
	//
	// @Override
	// public int compareOptions(Object o1, Object o2) {
	// domain.MappingSpecifier opt1 = (domain.MappingSpecifier) o1;
	// domain.MappingSpecifier opt2 = (domain.MappingSpecifier) o2;
	//
	// if ((opt1.getValueRef() == null) || (opt2.getValueRef() == null))
	// return -1;
	// if ((opt1.getValueRef().getValue() == null)
	// || (opt2.getValueRef().getValue() == null))
	// return -1;
	//
	// return Collator.getInstance().compare(
	// opt1.getValueRef().getValue(),
	// opt2.getValueRef().getValue());
	// }
	//
	// private List<domain.Option> initOptions(domain.MappingSpecifier ms) {
	//
	// if (ms.getSpecifierRef() == null)
	// return new ArrayList<domain.Option>();
	// return ms.getSpecifierRef().getOptions();
	//
	// }
	//
	// @Override
	// public Object getValue(Object element) {
	// Object result = null;
	// domain.MappingSpecifier opt = (domain.MappingSpecifier) element;
	//
	// List<domain.Option> choicesOptions = initOptions(opt);
	//
	// ArrayList<String> choices = new ArrayList<String>();
	// for (Iterator<domain.Option> itr = choicesOptions.iterator(); itr
	// .hasNext();) {
	// choices.add(itr.next().getValue());
	// }
	// ((ComboBoxCellEditor) (tableViewer.getCellEditors()[1]))
	// .setItems(choices.toArray(new String[choices.size()]));
	//
	// domain.Option optValue = opt.getValueRef();
	// if (optValue == null) {
	// result = new Integer(0);
	// return result;
	// }
	// int i = choicesOptions.size() - 1;
	// while (!optValue.getUid().equals(choicesOptions.get(i).getUid())
	// && i > 0)
	// --i;
	// result = new Integer(i);
	//
	// return result;
	// }
	//
	// @Override
	// public void modify(Object element, Object value) {
	// TableItem item = (TableItem) element;
	// domain.MappingSpecifier opt = (domain.MappingSpecifier) item
	// .getData();
	//
	// String valueString = ((ComboBoxCellEditor) (tableViewer
	// .getCellEditors()[1])).getItems()[(int) value];
	//
	// List<domain.Option> choicesOptions = initOptions(opt);
	//
	// for (Iterator<domain.Option> itr = choicesOptions.iterator(); itr
	// .hasNext();) {
	// domain.Option option = itr.next();
	// if (option.getValue().equals(valueString)) {
	// EditingDomain editingDomain = ((DiagramEditor) getPart())
	// .getEditingDomain();
	// /* apply the property change to single selected object */
	// editingDomain.getCommandStack().execute(
	// SetCommand.create(editingDomain, opt,
	// DomainPackage.eINSTANCE
	// .getMappingSpecifier_ValueRef(),
	// option));
	// break;
	// }
	// }
	//
	// }
	//
	// @Override
	// public boolean isModify(Object element, String property) {
	// return true;
	// }
	//
	// @Override
	// public Object getText(Object element) {
	// String result = "";
	// domain.MappingSpecifier task = (domain.MappingSpecifier) element;
	// if (task.getSpecifierRef() == null)
	// return "";
	//
	// if (task.getValueRef() == null)
	// result = "";
	// else
	// result = task.getValueRef().getValue();
	// return result;
	// }
	//
	// }

}
