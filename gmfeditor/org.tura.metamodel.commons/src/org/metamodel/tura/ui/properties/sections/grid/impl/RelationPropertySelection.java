package org.metamodel.tura.ui.properties.sections.grid.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
import org.metamodel.tura.ui.properties.sections.grid.GridColumn;
import org.metamodel.tura.ui.properties.sections.grid.GridProperty;

import domain.DomainPackage;
import domain.Type;
import domain.TypeElement;

public class RelationPropertySelection extends GridProperty {

	private List<GridColumn> columnList;
	
	public RelationPropertySelection() {
		ds = new RelationDS(this);
	}
	
	@Override
	public List<GridColumn> getColumns() {
		if (columnList == null) {
			columnList = new ArrayList<GridColumn>();
			columnList.add(new MasterColumn(table, this,0));
			columnList.add(new DetailColumn(table, this,1));
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

	class MasterColumn implements GridColumn {

		// Set the table column property names
		private final String MASTER_COLUMN = "Master column";

		private Table table;
		@SuppressWarnings("unused")
		private GridProperty property;

		private int col ;
		
		public MasterColumn(Table table, GridProperty property, int col) {
			this.table = table;
			this.property = property;
			this.col=col;
		}

		@Override
		public TableColumn createColumn() {
			TableColumn column = new TableColumn(table, SWT.LEFT, col);
			column.setText(MASTER_COLUMN);
			column.setWidth(100);

			return column;
		}

		@Override
		public String getName() {
			return MASTER_COLUMN;
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
			domain.Link opt = (domain.Link) element;

			List<domain.Attribute> choicesOptions = new ArrayList<>();
			if (opt.getParent().getMaster().getCreate() != null
					&& opt.getParent().getMaster().getCreate().getMethodRef() != null
					&& opt.getParent().getMaster().getCreate().getMethodRef()
							.getReturnValue() != null)
				choicesOptions = new InitOption().initOptions((Type) opt.getParent().getMaster()
						.getCreate().getMethodRef().getReturnValue()
						.getTypeRef());

			ArrayList<String> choices = new ArrayList<String>();
			for (Iterator<domain.Attribute> itr = choicesOptions.iterator(); itr
					.hasNext();) {
				choices.add(itr.next().getName());
			}
			((ComboBoxCellEditor) (tableViewer.getCellEditors()[col]))
					.setItems(choices.toArray(new String[choices.size()]));

			domain.Attribute optValue = opt.getMasterField();
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
			domain.Link opt = (domain.Link) item.getData();

			String valueString = ((ComboBoxCellEditor) (tableViewer
					.getCellEditors()[col])).getItems()[(int) value];

			List<domain.Attribute> choicesOptions = new InitOption().initOptions((Type) opt
					.getParent().getMaster().getCreate().getMethodRef()
					.getReturnValue().getTypeRef());

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
											.getLink_MasterField(),
									option));
					break;
				}
			}

		}

		@Override
		public boolean isModify() {
			return true;
		}

		@Override
		public Object getText(Object element) {
			String result = "";
			domain.Link task = (domain.Link) element;

			if (task.getMasterField() == null)
				result = "";
			else
				result = task.getMasterField().getName();
			return result;
		}

	}

	class DetailColumn implements GridColumn {

		// Set the table column property names
		private final String DETAIL_COLUMN = "Detail column";

		private Table table;
		@SuppressWarnings("unused")
		private GridProperty property;

		private int col ;
		
		public DetailColumn(Table table, GridProperty property, int col) {
			this.table = table;
			this.property = property;
			this.col=col;
		}

		@Override
		public TableColumn createColumn() {
			TableColumn column = new TableColumn(table, SWT.LEFT, col);
			column.setText(DETAIL_COLUMN);
			column.setWidth(100);

			return column;
		}

		@Override
		public String getName() {
			return DETAIL_COLUMN;
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
			domain.Link opt = (domain.Link) element;

			List<domain.Attribute> choicesOptions = new ArrayList<>();
			if (opt.getParent().getDetail().getCreate() != null
					&& opt.getParent().getDetail().getCreate().getMethodRef() != null
					&& opt.getParent().getDetail().getCreate().getMethodRef()
							.getReturnValue() != null)
				choicesOptions = new InitOption().initOptions((Type) opt.getParent().getDetail()
						.getCreate().getMethodRef().getReturnValue()
						.getTypeRef());

			ArrayList<String> choices = new ArrayList<String>();
			for (Iterator<domain.Attribute> itr = choicesOptions.iterator(); itr
					.hasNext();) {
				choices.add(itr.next().getName());
			}
			((ComboBoxCellEditor) (tableViewer.getCellEditors()[col]))
					.setItems(choices.toArray(new String[choices.size()]));

			domain.Attribute optValue = opt.getDetailField();
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
			domain.Link opt = (domain.Link) item.getData();

			String valueString = ((ComboBoxCellEditor) (tableViewer
					.getCellEditors()[col])).getItems()[(int) value];

			List<domain.Attribute> choicesOptions = new InitOption().initOptions((Type) opt
					.getParent().getDetail().getCreate().getMethodRef()
					.getReturnValue().getTypeRef());

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
											.getLink_DetailField(),
									option));
					break;
				}
			}

		}

		@Override
		public boolean isModify() {
			return true;
		}

		@Override
		public Object getText(Object element) {
			String result = "";
			domain.Link task = (domain.Link) element;

			if (task.getDetailField() == null)
				result = "";
			else
				result = task.getDetailField().getName();
			return result;
		}

	}
	
	public class InitOption{

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
}
