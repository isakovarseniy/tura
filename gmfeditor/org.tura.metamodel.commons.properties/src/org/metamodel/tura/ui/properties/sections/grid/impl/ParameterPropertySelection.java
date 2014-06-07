package org.metamodel.tura.ui.properties.sections.grid.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.validation.internal.modeled.model.validation.Constraint;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ComboBoxCellEditor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.ocl.OCL;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.ocl.helper.OCLHelper;
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
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.metamodel.tura.ui.properties.sections.grid.GridColumn;
import org.metamodel.tura.ui.properties.sections.grid.GridProperty;

import domain.DomainPackage;

public class ParameterPropertySelection extends GridProperty {

	private List<GridColumn> columnList;

	@Override
	public EObject getModel() {
		return getEObject();
	}

	
	public ParameterPropertySelection() {
		ds = new ParameterDS(this);
	}

	@Override
	public List<GridColumn> getColumns() {
		if (columnList == null) {
			columnList = new ArrayList<GridColumn>();
			columnList.add(new ParameterColumn(table, this));
			columnList.add(new PackageColumn(table, this));
			columnList.add(new TypeColumn(table, this));
			columnList.add(new OrderColumn(table, this));

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
		createButtons(composite,aTabbedPropertySheetPage);
	}	
	
	private void createButtons(Composite parent,TabbedPropertySheetPage aTabbedPropertySheetPage) {

		Composite composite = aTabbedPropertySheetPage.getWidgetFactory()
				.createFlatFormComposite(parent);

		GridLayout layout = new GridLayout(2, false);
		layout.marginWidth = 4;
		composite.setLayout(layout);
		
		// Create and configure the "Add" button
		Button add = new Button(composite, SWT.PUSH | SWT.CENTER);
		add.setText("Add");

		GridData gridData = new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING);
		gridData.widthHint = 80;
		add.setLayoutData(gridData);
		add.addSelectionListener(new SelectionAdapter() {

			// Add the selection and refresh the view
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
				Object row = ((IStructuredSelection) tableViewer
						.getSelection()).getFirstElement();
				if (row != null) {
					removeRow(row);
				}
			}
		});

	}
	
	
	
	class TypeColumn implements GridColumn {

		// Set the table column property names
		private final String TYPE_COLUMN = "Type";

		private Table table;
		@SuppressWarnings("unused")
		private GridProperty property;

		public TypeColumn(Table table, GridProperty property) {
			this.table = table;
			this.property = property;
		}

		@SuppressWarnings({ "rawtypes", "unchecked" })
		private List<domain.TypeElement> initTypes(EObject eObject) {
			try {
				OCL ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
				OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl
						.createOCLHelper();
				helper.setContext(DomainPackage.eINSTANCE
						.getEClassifier("Types"));

				domain.Package pkg = (domain.Package) eObject;

				OCLExpression<EClassifier> query = helper
						.createQuery("domain::Package.allInstances()->select(r|r.oclAsType(domain::Package).uid='"
								+ pkg.getUid()
								+ "').oclAsType(domain::Package).typedefinition.types->"
								+ "select(r|(r.oclIsKindOf(domain::Type) and  r.oclAsType(domain::Type).name <> null)  "
								+ "or (r.oclIsKindOf(domain::Primitive) and  r.oclAsType(domain::Primitive).name <> null)"
								+ "or (r.oclIsKindOf(domain::Enumarator) and  r.oclAsType(domain::Enumarator).name <> null)"
								+ ")");

				Collection<domain.TypeElement> map = (Collection<domain.TypeElement>) ocl
						.evaluate(pkg, query);

				ArrayList<domain.TypeElement> rows = new ArrayList<domain.TypeElement>();
				for (Iterator<domain.TypeElement> i = map.iterator(); i
						.hasNext();) {
					domain.TypeElement p = i.next();
					rows.add(p);
				}
				return rows;
			} catch (Exception e) {
				e.printStackTrace();
			}
			return null;
		}

		@Override
		public TableColumn createColumn() {
			TableColumn column = new TableColumn(table, SWT.LEFT, 2);
			column.setText(TYPE_COLUMN);
			column.setWidth(100);

			return column;
		}

		@Override
		public String getName() {
			return TYPE_COLUMN;
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
			domain.Parameter opr = (domain.Parameter) element;

			List<domain.TypeElement> choicesOptions = initTypes(opr
					.getPackageRef());

			ArrayList<String> choices = new ArrayList<String>();
			for (Iterator<domain.TypeElement> itr = choicesOptions.iterator(); itr
					.hasNext();) {
				choices.add(itr.next().getName());
			}
			((ComboBoxCellEditor) (tableViewer.getCellEditors()[2]))
					.setItems(choices.toArray(new String[choices.size()]));

			domain.TypeElement type = opr.getTypeRef();
			if (type == null) {
				result = new Integer(0);
				return result;
			}
			int i = choicesOptions.size() - 1;
			while (!type.getUid().equals(choicesOptions.get(i).getUid())
					&& i > 0)
				--i;
			result = new Integer(i);

			return result;
		}

		@Override
		public Object getText(Object element) {
			String result = "";
			domain.Parameter task = (domain.Parameter) element;

			if (task.getTypeRef() == null)
				result = "";
			else
				result = task.getTypeRef().getName();
			return result;
		}

		@Override
		public void modify(Object element, Object value) {
			TableItem item = (TableItem) element;
			domain.Parameter param = (domain.Parameter) item.getData();

			String valueString = ((ComboBoxCellEditor) (tableViewer
					.getCellEditors()[2])).getItems()[(int) value];

			List<domain.TypeElement> choicesOptions = initTypes(param
					.getPackageRef());

			for (Iterator<domain.TypeElement> itr = choicesOptions.iterator(); itr
					.hasNext();) {
				domain.TypeElement type = itr.next();
				if (type.getName().equals(valueString)) {
					EditingDomain editingDomain = ((DiagramEditor) getPart())
							.getEditingDomain();
					/* apply the property change to single selected object */
					editingDomain.getCommandStack().execute(
							SetCommand.create(editingDomain, param,
									DomainPackage.eINSTANCE
											.getTypePointer_TypeRef(), type));
					break;
				}
			}

		}

		@Override
		public boolean isModify(Object element, String property) {
			return true;
		}
	}

	class PackageColumn implements GridColumn {

		// Set the table column property names
		private final String PACKAGE_COLUMN = "Package";

		private Table table;
		@SuppressWarnings("unused")
		private GridProperty property;

		public PackageColumn(Table table, GridProperty property) {
			this.table = table;
			this.property = property;
		}

		@SuppressWarnings({ "rawtypes", "unchecked" })
		private List<domain.Package> initPackages(EObject eObject) {
			try {
				OCL ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
				OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl
						.createOCLHelper();
				helper.setContext(DomainPackage.eINSTANCE
						.getEClassifier("Types"));

				EObject types = (EObject) eObject;

				OCLExpression<EClassifier> query = helper
						.createQuery("domain::Package.allInstances()->asOrderedSet()->select(r|r.oclIsKindOf(domain::Package) and  r.oclAsType(domain::Package).name <> null)");

				Collection<domain.Package> map = (Collection<domain.Package>) ocl
						.evaluate(types, query);

				ArrayList<domain.Package> rows = new ArrayList<domain.Package>();
				for (Iterator<domain.Package> i = map.iterator(); i.hasNext();) {
					domain.Package p = i.next();
					rows.add(p);
				}
				return rows;
			} catch (Exception e) {
				e.printStackTrace();
			}
			return null;
		}

		@Override
		public TableColumn createColumn() {
			TableColumn column = new TableColumn(table, SWT.LEFT, 1);
			column.setText(PACKAGE_COLUMN);
			column.setWidth(100);

			return column;
		}

		@Override
		public String getName() {
			return PACKAGE_COLUMN;
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
			domain.Parameter opr = (domain.Parameter) element;

			List<domain.Package> choicesOptions = initPackages(opr);

			ArrayList<String> choices = new ArrayList<String>();
			for (Iterator<domain.Package> itr = choicesOptions.iterator(); itr
					.hasNext();) {
				choices.add(itr.next().getName());
			}
			((ComboBoxCellEditor) (tableViewer.getCellEditors()[1]))
					.setItems(choices.toArray(new String[choices.size()]));

			domain.Package pkg = opr.getPackageRef();
			if (pkg == null) {
				result = new Integer(0);
				return result;
			}
			int i = choicesOptions.size() - 1;
			while (!pkg.getUid().equals(choicesOptions.get(i).getUid())
					&& i > 0)
				--i;
			result = new Integer(i);

			return result;
		}

		@Override
		public Object getText(Object element) {
			String result = "";
			domain.Parameter task = (domain.Parameter) element;

			if (task.getPackageRef() == null)
				result = "";
			else
				result = task.getPackageRef().getName();
			return result;
		}

		@Override
		public void modify(Object element, Object value) {
			TableItem item = (TableItem) element;
			domain.Parameter param = (domain.Parameter) item.getData();

			String valueString = ((ComboBoxCellEditor) (tableViewer
					.getCellEditors()[1])).getItems()[(int) value];

			List<domain.Package> choicesOptions = initPackages(param);

			for (Iterator<domain.Package> itr = choicesOptions.iterator(); itr
					.hasNext();) {
				domain.Package pkg = itr.next();
				if (pkg.getName().equals(valueString)) {
					EditingDomain editingDomain = ((DiagramEditor) getPart())
							.getEditingDomain();

					CompoundCommand compoundCommand = new CompoundCommand();
					compoundCommand
							.append(SetCommand.create(editingDomain, param,
									DomainPackage.eINSTANCE
											.getTypePointer_PackageRef(), pkg));

					compoundCommand.append(SetCommand.create(editingDomain,
							param,
							DomainPackage.eINSTANCE.getTypePointer_TypeRef(),
							null));
					editingDomain.getCommandStack().execute(compoundCommand);

					break;
				}
			}

		}

		@Override
		public boolean isModify(Object element, String property) {
			return true;
		}
	}

	class ParameterColumn implements GridColumn {

		// Set the table column property names
		private final String PARAMETER_COLUMN = "Parameter";

		private Table table;
		@SuppressWarnings("unused")
		private GridProperty property;

		public ParameterColumn(Table table, GridProperty property) {
			this.table = table;
			this.property = property;
		}

		@Override
		public TableColumn createColumn() {
			TableColumn column = new TableColumn(table, SWT.LEFT, 0);
			column.setText(PARAMETER_COLUMN);
			column.setWidth(400);
			return column;
		}

		@Override
		public String getName() {
			return PARAMETER_COLUMN;
		}

		@Override
		public CellEditor getEditor() {
			TextCellEditor textEditor = new TextCellEditor(table);
			((Text) textEditor.getControl()).setTextLimit(60);
			return textEditor;
		}

		@Override
		public int compareOptions(Object o1, Object o2) {
			return 0;
		}

		@Override
		public Object getValue(Object element) {
			String result = "";
			domain.Parameter task = (domain.Parameter) element;
			if (task.getName() != null)
				result = task.getName();
			return result;
		}

		@Override
		public Object getText(Object element) {
			return getValue(element);
		}

		@Override
		public void modify(Object element, Object value) {

			TableItem item = (TableItem) element;
			domain.Parameter opt = (domain.Parameter) item.getData();
			String valueString;

			valueString = ((String) value).trim();
			EditingDomain editingDomain = ((DiagramEditor) getPart())
					.getEditingDomain();
			/* apply the property change to single selected object */
			editingDomain.getCommandStack().execute(
					SetCommand.create(editingDomain, opt,
							DomainPackage.eINSTANCE.getParameter_Name(),
							valueString));
		}

		@Override
		public boolean isModify(Object element, String property) {
			return true;
		}

	}

	class OrderColumn implements GridColumn {

		// Set the table column property names
		private final String ORDER_COLUMN = "Order";

		private Table table;
		@SuppressWarnings("unused")
		private GridProperty property;

		public OrderColumn(Table table, GridProperty property) {
			this.table = table;
			this.property = property;
		}

		@Override
		public TableColumn createColumn() {
			TableColumn column = new TableColumn(table, SWT.LEFT, 3);
			column.setText(ORDER_COLUMN);
			column.setWidth(40);
			return column;
		}

		@Override
		public String getName() {
			return ORDER_COLUMN;
		}

		@Override
		public CellEditor getEditor() {
			TextCellEditor textEditor = new TextCellEditor(table);
			((Text) textEditor.getControl()).setTextLimit(40);
			return textEditor;
		}

		@Override
		public int compareOptions(Object o1, Object o2) {
			domain.Parameter op1 = (domain.Parameter) o1;
			domain.Parameter op2 = (domain.Parameter) o2;

			return  new Integer(op1.getOrder()).compareTo(new Integer(op2.getOrder()));
		}

		@Override
		public Object getValue(Object element) {
			int result = -1;
			domain.Parameter task = (domain.Parameter) element;
			if (task.getName() != null)
				result = task.getOrder();
			return new Integer(result).toString();
		}

		@Override
		public Object getText(Object element) {
			return getValue(element);
		}

		@Override
		public void modify(Object element, Object value) {

			TableItem item = (TableItem) element;
			domain.Parameter opt = (domain.Parameter) item.getData();

			EditingDomain editingDomain = ((DiagramEditor) getPart())
					.getEditingDomain();
			/* apply the property change to single selected object */
			editingDomain.getCommandStack().execute(
					SetCommand.create(editingDomain, opt,
							DomainPackage.eINSTANCE.getParameter_Order(),
							new Integer((String) value)));
		}

		@Override
		public boolean isModify(Object element, String property) {
			return true;
		}

	}

}
