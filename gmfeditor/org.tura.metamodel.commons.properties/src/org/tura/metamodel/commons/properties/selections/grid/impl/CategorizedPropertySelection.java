package org.tura.metamodel.commons.properties.selections.grid.impl;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.notation.impl.DiagramImpl;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreePath;
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
import org.tura.metamodel.commons.QueryHelper;
import org.tura.metamodel.commons.properties.selections.adapters.IReturnTypeProvider;
import org.tura.metamodel.commons.properties.selections.adapters.helper.TreeRoot;
import org.tura.metamodel.commons.properties.selections.grid.GridColumn;
import org.tura.metamodel.commons.properties.selections.grid.GridProperty;

import domain.DomainPackage;

public class CategorizedPropertySelection extends GridProperty {

	private List<GridColumn> columnList;

	@Override
	public EObject getModel() {
		return getEObject();
	}

	public CategorizedPropertySelection() {
		ds = new CategorizedDS(this);
	}

	@Override
	public List<GridColumn> getColumns() {
		if (columnList == null) {
			columnList = new ArrayList<GridColumn>();
			columnList.add(new CategoryColumn(table, this, 0));
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

	class CategoryColumn implements GridColumn {

		public static final String COLUMN_NAME = "Category";
		private int col;

		private Table table;
		private GridProperty property;

		public CategoryColumn(Table table, GridProperty property, int col) {
			this.table = table;
			this.property = property;
			this.col = col;
		}

		@Override
		public TableColumn createColumn() {
			// 1 nd column with task Option
			TableColumn column = new TableColumn(table, SWT.LEFT, col);
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
			TextAndDialogCellEditor editor = new TextAndDialogCellEditor(table);
			return editor;
		}

		@Override
		public int compareOptions(Object o1, Object o2) {
			return 0;
		}

		@Override
		public Object getValue(Object element) {
			domain.Classifier opt = (domain.Classifier) element;
            if (opt.getHint() == null || opt.getHint().getName() == null)
            	return "";
			return   ((domain.Artifact) (opt.getHint().eContainer())).getName()+":"+ opt.getHint().getName();

		}

		@Override
		public void modify(Object element, Object value) {
			if (element == null)
				return;
			TableItem item = (TableItem) element;
			Object obj = ((TreePath)value).getLastSegment();
			
			IReturnTypeProvider provider = (IReturnTypeProvider) Platform
					.getAdapterManager().getAdapter(obj, IReturnTypeProvider.class);

			if (provider != null && provider.getReturnType(obj) != null){
				domain.Classifier opt = (domain.Classifier) item
						.getData();
				EditingDomain editingDomain = this.property.getEditPart()
						.getEditingDomain();
				
				editingDomain.getCommandStack().execute(
						SetCommand.create(editingDomain, opt,
								DomainPackage.eINSTANCE.getClassifier_Hint(),
								obj));
			}
			
			
			
		}

		@Override
		public boolean isModify(Object element, String property) {
			CellEditor editor =this.property.getTableViewer().getCellEditors()[col];
			((TextAndDialogCellEditor) editor).setRootObject(getContextRoot());
			return true;
		}

		@Override
		public Object getText(Object element) {
			return getValue(element);
		}

	}


	private TreeRoot getContextRoot() {

		TreeRoot rootOfTree = new TreeRoot();
		DiagramImpl root = (DiagramImpl) this.getEditPart().getRoot()
				.getContents().getModel();

		try {
			rootOfTree.addChild(new QueryHelper().getDomainArtifact(root
					.getElement()));
		} catch (Exception e) {
			// ignore
		}
		return rootOfTree;
	}

}
