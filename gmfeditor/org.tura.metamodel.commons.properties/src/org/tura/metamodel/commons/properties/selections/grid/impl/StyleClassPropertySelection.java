package org.tura.metamodel.commons.properties.selections.grid.impl;

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
import org.eclipse.epsilon.common.dt.util.LogUtil;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.notation.impl.DiagramImpl;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ComboBoxCellEditor;
import org.eclipse.jface.viewers.IStructuredSelection;
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
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.tura.metamodel.commons.properties.selections.grid.GridColumn;
import org.tura.metamodel.commons.properties.selections.grid.GridProperty;

import domain.DomainPackage;

public class StyleClassPropertySelection extends GridProperty {

	private List<GridColumn> columnList;

	@Override
	public EObject getModel() {
		return getEObject();
	}

	public StyleClassPropertySelection() {
		ds = new StyleClassDS(this);
	}

	@Override
	public List<GridColumn> getColumns() {
		if (columnList == null) {
			columnList = new ArrayList<GridColumn>();
			columnList.add(new StylesPackageColumn(table, this, 0));
			columnList.add(new StylesLibraryColumn(table, this, 1));
			columnList.add(new StyleSetColumn(table, this, 2));

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
				Object row = ((IStructuredSelection) tableViewer.getSelection())
						.getFirstElement();
				if (row != null) {
					removeRow(row);
				}
			}
		});

	}

	class StylesPackageColumn implements GridColumn {

		// Set the table column property names
		private final String PACKAGE_COLUMN = "Style package";
		private int col;

		private Table table;
		private GridProperty property;

		public StylesPackageColumn(Table table, GridProperty property,
				int column) {
			this.table = table;
			this.property = property;
			this.col = column;
		}

		private List<domain.StylesPackage> initPackages(EObject eObject) {

			DiagramImpl root = (DiagramImpl) this.property.getEditPart()
					.getRoot().getContents().getModel();
			domain.Form form = ((domain.Form) (((domain.Views) (((domain.CanvasView) root
					.getElement()).getParent().eContainer().eContainer()))
					.getParent().eContainer()));

			domain.Application app = ((domain.UIPackage) form.eContainer())
					.getParent().getParent().getParent();

			if (app.getApplicationStyle() == null
					|| app.getApplicationStyle().getStylesPackage() == null)
				return new ArrayList<domain.StylesPackage>();

			List<domain.StylesPackage> map = app.getApplicationStyle()
					.getStylesPackage();

			ArrayList<domain.StylesPackage> rows = new ArrayList<domain.StylesPackage>();
			for (Iterator<domain.StylesPackage> i = map.iterator(); i.hasNext();) {
				domain.StylesPackage p = i.next();
				rows.add(p);
			}
			return rows;
		}

		@Override
		public TableColumn createColumn() {
			TableColumn column = new TableColumn(table, SWT.LEFT, col);
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
			domain.StyleClass opr = (domain.StyleClass) element;

			List<domain.StylesPackage> choicesOptions = initPackages(opr);

			ArrayList<String> choices = new ArrayList<String>();
			for (Iterator<domain.StylesPackage> itr = choicesOptions.iterator(); itr
					.hasNext();) {
				choices.add(itr.next().getName());
			}
			((ComboBoxCellEditor) (tableViewer.getCellEditors()[col]))
					.setItems(choices.toArray(new String[choices.size()]));

			domain.StylesPackage pkg = opr.getStylesPackage();
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
			domain.StyleClass task = (domain.StyleClass) element;

			if (task.getStylesPackage() == null)
				result = "";
			else
				result = task.getStylesPackage().getName();
			return result;
		}

		@Override
		public void modify(Object element, Object value) {
			TableItem item = (TableItem) element;
			domain.StyleClass param = (domain.StyleClass) item.getData();

			String valueString = ((ComboBoxCellEditor) (tableViewer
					.getCellEditors()[col])).getItems()[(int) value];

			List<domain.StylesPackage> choicesOptions = initPackages(param);

			for (Iterator<domain.StylesPackage> itr = choicesOptions.iterator(); itr
					.hasNext();) {
				domain.StylesPackage pkg = itr.next();
				if (pkg.getName().equals(valueString)) {
					EditingDomain editingDomain = ((DiagramEditor) getPart())
							.getEditingDomain();

					CompoundCommand compoundCommand = new CompoundCommand();

					compoundCommand.append(SetCommand.create(editingDomain,
							param, DomainPackage.eINSTANCE
									.getStyleClass_StylesPackage(), pkg));

					compoundCommand.append(SetCommand.create(editingDomain,
							param,
							DomainPackage.eINSTANCE.getStyleClass_Library(),
							null));

					compoundCommand.append(SetCommand.create(editingDomain,
							param,
							DomainPackage.eINSTANCE.getStyleClass_StyleSet(),
							null));

					editingDomain.getCommandStack().execute(compoundCommand);

					break;
				}
			}

		}

		@Override
		public boolean isModify(Object element, String property) {
			domain.StyleClass opt = (domain.StyleClass) element;
			List<domain.StylesPackage> choicesOptions = initPackages(opt);
			if (choicesOptions == null || choicesOptions.size() == 0)
				return false;

			return true;
		}
	}

	class StylesLibraryColumn implements GridColumn {

		// Set the table column property names
		private final String LIBRARY_COLUMN = "Style library";
		private int col;

		private Table table;
		@SuppressWarnings("unused")
		private GridProperty property;

		public StylesLibraryColumn(Table table, GridProperty property,
				int column) {
			this.table = table;
			this.property = property;
			this.col = column;
		}

		@SuppressWarnings({ "rawtypes", "unchecked" })
		private List<domain.StyleLibrary> initLibrarys(EObject eObject) {

			domain.StyleClass opr = (domain.StyleClass) eObject;
			
			if (opr.getStylesPackage() == null)
				return new ArrayList<domain.StyleLibrary>();

			try {
				OCL ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
				OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl
						.createOCLHelper();
				helper.setContext(DomainPackage.eINSTANCE
						.getEClassifier("Types"));

				EObject types = (EObject) eObject;

				OCLExpression<EClassifier> query = helper
						.createQuery("domain::StyleLibrary.allInstances()->select(r|r.oclIsKindOf(domain::StyleLibrary) and r.oclAsType(domain::StyleLibrary).name <> null   "
								+ "and r.oclAsType(ecore::EObject).eContainer().oclAsType(domain::Styles).parent.uid='"
								+ opr.getStylesPackage().getUid() + "')");

				Collection<domain.StyleLibrary> map = (Collection<domain.StyleLibrary>) ocl
						.evaluate(types, query);

				ArrayList<domain.StyleLibrary> rows = new ArrayList<domain.StyleLibrary>();
				for (Iterator<domain.StyleLibrary> i = map.iterator(); i
						.hasNext();) {
					domain.StyleLibrary p = i.next();
					rows.add(p);
				}
				return rows;
			} catch (Exception e) {
				LogUtil.log(e);
			}
			return null;
		}

		@Override
		public TableColumn createColumn() {
			TableColumn column = new TableColumn(table, SWT.LEFT, col);
			column.setText(LIBRARY_COLUMN);
			column.setWidth(100);

			return column;
		}

		@Override
		public String getName() {
			return LIBRARY_COLUMN;
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
			domain.StyleClass opr = (domain.StyleClass) element;

			List<domain.StyleLibrary> choicesOptions = initLibrarys(opr);

			ArrayList<String> choices = new ArrayList<String>();
			for (Iterator<domain.StyleLibrary> itr = choicesOptions.iterator(); itr
					.hasNext();) {
				choices.add(itr.next().getName());
			}
			((ComboBoxCellEditor) (tableViewer.getCellEditors()[col]))
					.setItems(choices.toArray(new String[choices.size()]));

			domain.StyleLibrary pkg = opr.getLibrary();
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
			domain.StyleClass task = (domain.StyleClass) element;

			if (task.getLibrary() == null)
				result = "";
			else
				result = task.getLibrary().getName();
			return result;
		}

		@Override
		public void modify(Object element, Object value) {
			TableItem item = (TableItem) element;
			domain.StyleClass param = (domain.StyleClass) item.getData();

			String valueString = ((ComboBoxCellEditor) (tableViewer
					.getCellEditors()[col])).getItems()[(int) value];

			List<domain.StyleLibrary> choicesOptions = initLibrarys(param);

			for (Iterator<domain.StyleLibrary> itr = choicesOptions.iterator(); itr
					.hasNext();) {
				domain.StyleLibrary pkg = itr.next();
				if (pkg.getName().equals(valueString)) {
					EditingDomain editingDomain = ((DiagramEditor) getPart())
							.getEditingDomain();

					CompoundCommand compoundCommand = new CompoundCommand();

					compoundCommand.append(SetCommand.create(editingDomain,
							param,
							DomainPackage.eINSTANCE.getStyleClass_Library(),
							pkg));

					compoundCommand.append(SetCommand.create(editingDomain,
							param,
							DomainPackage.eINSTANCE.getStyleClass_StyleSet(),
							null));

					editingDomain.getCommandStack().execute(compoundCommand);

					break;
				}
			}

		}

		@Override
		public boolean isModify(Object element, String property) {
			domain.StyleClass opt = (domain.StyleClass) element;
			List<domain.StyleLibrary> choicesOptions = initLibrarys(opt);
			if (choicesOptions == null || choicesOptions.size() == 0)
				return false;

			return true;
		}
	}

	class StyleSetColumn implements GridColumn {

		// Set the table column property names
		private final String STYLESET_COLUMN = "Style Set";
		private int col;

		private Table table;
		@SuppressWarnings("unused")
		private GridProperty property;

		public StyleSetColumn(Table table, GridProperty property, int column) {
			this.table = table;
			this.property = property;
			this.col = column;
		}

		@SuppressWarnings({ "rawtypes", "unchecked" })
		private List<domain.StyleSet> initStyleSets(EObject eObject) {

			domain.StyleClass opr = (domain.StyleClass) eObject;
			if (opr.getLibrary() == null)
				return new ArrayList<domain.StyleSet>();

			try {
				OCL ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
				OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl
						.createOCLHelper();
				helper.setContext(DomainPackage.eINSTANCE
						.getEClassifier("Types"));

				EObject types = (EObject) eObject;

				OCLExpression<EClassifier> query = helper
						.createQuery("domain::StyleLibrary.allInstances()->select(r|r.oclIsKindOf(domain::StyleLibrary) and r.oclAsType(domain::StyleLibrary).name <> null   "
								+ "and r.oclAsType(domain::StyleLibrary).uid='"
								+ opr.getLibrary().getUid() + "').styles");

				Collection<domain.StyleSet> map = (Collection<domain.StyleSet>) ocl
						.evaluate(types, query);

				ArrayList<domain.StyleSet> rows = new ArrayList<domain.StyleSet>();
				for (Iterator<domain.StyleSet> i = map.iterator(); i.hasNext();) {
					domain.StyleSet p = i.next();
					rows.add(p);
				}
				return rows;
			} catch (Exception e) {
				LogUtil.log(e);
			}
			return null;
		}

		@Override
		public TableColumn createColumn() {
			TableColumn column = new TableColumn(table, SWT.LEFT, col);
			column.setText(STYLESET_COLUMN);
			column.setWidth(100);

			return column;
		}

		@Override
		public String getName() {
			return STYLESET_COLUMN;
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
			domain.StyleClass opr = (domain.StyleClass) element;

			List<domain.StyleSet> choicesOptions = initStyleSets(opr);

			ArrayList<String> choices = new ArrayList<String>();
			for (Iterator<domain.StyleSet> itr = choicesOptions.iterator(); itr
					.hasNext();) {
				choices.add(itr.next().getName());
			}
			((ComboBoxCellEditor) (tableViewer.getCellEditors()[col]))
					.setItems(choices.toArray(new String[choices.size()]));

			domain.StyleSet pkg = opr.getStyleSet();
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
			domain.StyleClass task = (domain.StyleClass) element;

			if (task.getStyleSet() == null)
				result = "";
			else
				result = task.getStyleSet().getName();
			return result;
		}

		@Override
		public void modify(Object element, Object value) {
			TableItem item = (TableItem) element;
			domain.StyleClass param = (domain.StyleClass) item.getData();

			String valueString = ((ComboBoxCellEditor) (tableViewer
					.getCellEditors()[col])).getItems()[(int) value];

			List<domain.StyleSet> choicesOptions = initStyleSets(param);

			for (Iterator<domain.StyleSet> itr = choicesOptions.iterator(); itr
					.hasNext();) {
				domain.StyleSet pkg = itr.next();
				if (pkg.getName().equals(valueString)) {
					EditingDomain editingDomain = ((DiagramEditor) getPart())
							.getEditingDomain();

					CompoundCommand compoundCommand = new CompoundCommand();

					compoundCommand.append(SetCommand.create(editingDomain,
							param,
							DomainPackage.eINSTANCE.getStyleClass_StyleSet(),
							pkg));

					editingDomain.getCommandStack().execute(compoundCommand);

					break;
				}
			}

		}

		@Override
		public boolean isModify(Object element, String property) {
			domain.StyleClass opt = (domain.StyleClass) element;
			List<domain.StyleSet> choicesOptions = initStyleSets(opt);
			if (choicesOptions == null || choicesOptions.size() == 0)
				return false;

			return true;
		}
	}

}
