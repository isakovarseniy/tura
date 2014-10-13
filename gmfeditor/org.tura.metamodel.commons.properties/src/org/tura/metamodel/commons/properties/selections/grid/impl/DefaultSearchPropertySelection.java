package org.tura.metamodel.commons.properties.selections.grid.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ComboBoxCellEditor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.tura.metamodel.commons.properties.selections.grid.DataSource;
import org.tura.metamodel.commons.properties.selections.grid.GridColumn;
import org.tura.metamodel.commons.properties.selections.grid.GridProperty;

import domain.Attribute;
import domain.DataControl;
import domain.DomainFactory;
import domain.DomainPackage;
import domain.Type;
import domain.TypeElement;

public class DefaultSearchPropertySelection extends
		ContextParameterPropertySelection {

	@Override
	public EObject getModel() {
		if (((domain.DataControl) getEObject()).getDefaultSearch() == null){
			EditingDomain editingDomain = ((DiagramEditor) this.getPart())
					.getEditingDomain();

			domain.ContextParameters  ctx = DomainFactory.eINSTANCE.createContextParameters();
			editingDomain.getCommandStack().execute(
					SetCommand.create(editingDomain, getEObject(), DomainPackage.eINSTANCE
							.getDataControl_DefaultSearch(), ctx));
		}
		return ((domain.DataControl) getEObject()).getDefaultSearch();
	}

	@Override
	public List<GridColumn> getColumns() {
		if (columnList == null) {
			columnList = new ArrayList<GridColumn>();
			columnList.add(new FieldsColumn(table, this, 0));
			columnList.add(new IsExpressioinColumn(table, this, 1));
			columnList.add(new ValueColumn(table, this, 2));
		}
		return columnList;
	}

	public void createControls(Composite parent,
			TabbedPropertySheetPage aTabbedPropertySheetPage) {

		Composite composite = aTabbedPropertySheetPage.getWidgetFactory()
				.createFlatFormComposite(parent);

		GridLayout layout = new GridLayout(1, false);
		layout.marginWidth = 4;
		composite.setLayout(layout);
		super.createControls(composite, aTabbedPropertySheetPage);
		createButtons(composite, aTabbedPropertySheetPage);
	}

	private void createButtons(Composite parent,
			TabbedPropertySheetPage aTabbedPropertySheetPage) {
		Composite composite = aTabbedPropertySheetPage.getWidgetFactory()
				.createFlatFormComposite(parent);

		GridLayout layout = new GridLayout(2, false);
		layout.marginWidth = 4;
		composite.setLayout(layout);

		// Create and configure the "Delete" button
		Button add = new Button(composite, SWT.PUSH | SWT.CENTER);
		add.setText("Add");
		GridData gridData = new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING);
		gridData.widthHint = 80;
		add.setLayoutData(gridData);

		add.addSelectionListener(new SelectionAdapter() {

			// Remove the selection and refresh the view
			public void widgetSelected(SelectionEvent e) {
				addRow();
			}
		});

		// Create and configure the "Delete" button
		Button delete = new Button(composite, SWT.PUSH | SWT.CENTER);
		delete.setText("Delete");
		gridData = new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING);
		gridData.widthHint = 80;
		delete.setLayoutData(gridData);

		delete.addSelectionListener(new SelectionAdapter() {

			// Remove the selection and refresh the view
			public void widgetSelected(SelectionEvent e) {
				Object row = ((IStructuredSelection) tableViewer.getSelection())
						.getFirstElement();
				if (row != null) {
					removeRow(row);
				}
			}
		});

	}

	class FieldsColumn implements GridColumn {

		// Set the table column property names
		private final String COLUMN_NAME = "Column";

		private Table table;
		private GridProperty property;

		private int col;

		public FieldsColumn(Table table, GridProperty property, int col) {
			this.table = table;
			this.property = property;
			this.col = col;
		}

		@Override
		public TableColumn createColumn() {
			TableColumn column = new TableColumn(table, SWT.LEFT, col);
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
			ComboBoxCellEditor comboBoxCellEditor = new ComboBoxCellEditor(
					table, new String[] {}, SWT.READ_ONLY);
			return comboBoxCellEditor;
		}

		@Override
		public int compareOptions(Object o1, Object o2) {
			return 0;
		}

		@Override
		public Object getValue(Object element) {
			Object result = null;
			domain.ContextParameter opt = (domain.ContextParameter) element;

			List<domain.Attribute> choicesOptions = new ArrayList<>();
			domain.DataControl dc = (DataControl) property.getEObject();

			domain.Type t = null;
			if (dc.getCreate() != null && dc.getCreate().getMethodRef() != null
					&& dc.getCreate().getMethodRef().getReturnValue() != null) {
				t = (Type) dc.getCreate().getMethodRef().getReturnValue()
						.getTypeRef();
			}
			if (dc.getBaseType() != null)
				t = dc.getBaseType();

			choicesOptions = new InitOption().initOptions(t);

			ArrayList<String> choices = new ArrayList<String>();
			for (Iterator<domain.Attribute> itr = choicesOptions.iterator(); itr
					.hasNext();) {
				choices.add(itr.next().getName());
			}
			((ComboBoxCellEditor) (tableViewer.getCellEditors()[col]))
					.setItems(choices.toArray(new String[choices.size()]));

			domain.Attribute optValue = (Attribute) opt.getRefObj();
			if (optValue == null) {
				result = new Integer(0);
				return result;
			}
			int i = choicesOptions.size() - 1;
			while (!optValue.getUid().equals(choicesOptions.get(i).getUid())
					&& i > 0)
				--i;
			result = new Integer(i);

			return result;
		}

		@Override
		public void modify(Object element, Object value) {

			TableItem item = (TableItem) element;
			domain.ContextParameter opt = (domain.ContextParameter) item.getData();

			domain.DataControl dc = (DataControl) property.getEObject();
			
			String valueString = ((ComboBoxCellEditor) (tableViewer
					.getCellEditors()[col])).getItems()[(int) value];

			domain.Type t = null;
			if (dc.getCreate() != null && dc.getCreate().getMethodRef() != null
					&& dc.getCreate().getMethodRef().getReturnValue() != null) {
				t = (Type) dc.getCreate().getMethodRef().getReturnValue()
						.getTypeRef();
			}
			if (dc.getBaseType() != null)
				t = dc.getBaseType();

			List<domain.Attribute> choicesOptions = new InitOption().initOptions(t);

			for (Iterator<domain.Attribute> itr = choicesOptions.iterator(); itr
					.hasNext();) {
				domain.Attribute option = itr.next();
				if (option.getName().equals(valueString)) {
					EditingDomain editingDomain = ((DiagramEditor) getPart())
							.getEditingDomain();
					/* apply the property change to single selected object */
					editingDomain.getCommandStack().execute(
							SetCommand.create(editingDomain, opt,
									DomainPackage.eINSTANCE
											.getContextParameter_RefObj(), option));
					break;
				}
			}

		}

		@Override
		public boolean isModify(Object element, String property) {
			return true;
		}

		@Override
		public Object getText(Object element) {
			String result = "";
			domain.ContextParameter task = (domain.ContextParameter) element;

			if (task.getRefObj() == null)
				result = "";
			else
				result = ((domain.Attribute) task.getRefObj()).getName();
			return result;
		}

	}

	public class InitOption {

		public List<domain.Attribute> initOptions(domain.Type type) {
			List<domain.Attribute> attrs = new ArrayList<>();

			if (type.getExtension().size() != 0) {
				for (Iterator<domain.TypeExtension> itr = type.getExtension()
						.iterator(); itr.hasNext();) {
					TypeElement typeElement = itr.next().getTarget();
					if (typeElement instanceof domain.Type)
						attrs.addAll(initOptions((Type) typeElement));

					if (typeElement instanceof domain.TypeReference)
						attrs.addAll(initOptions((Type) ((domain.TypeReference) typeElement)
								.getTypeRef()));
				}
			}
			attrs.addAll(type.getAttributes());
			return attrs;
		}

	}

	@Override
	public String contextRefNameExtreactor(domain.ContextParameter  obj) {
		return ((domain.Attribute) obj.getRefObj()).getName();
	}

	@Override
	public domain.TypeElement contextRefTypeExtreactor(domain.ContextParameter  obj) {
		return ((domain.Attribute) obj.getRefObj()).getTypeRef();
	}

	@Override
	protected DataSource getDS() {
		return new DefaultContextParametersDS(this);
	}

}
