package org.tura.metamodel.commons.properties.selections.grid;

import java.util.Iterator;
import java.util.List;

import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.internal.views.properties.tabbed.view.TabbedPropertyComposite;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.tura.metamodel.commons.properties.selections.AbstractTuraPropertySection;

public abstract class GridProperty extends AbstractTuraPropertySection {

	protected Table table;
	protected TableViewer tableViewer;
	private GridContentProvider gridContentProvider;
	protected DataSource ds;

	public TableViewer getTableViewer() {
		return tableViewer;
	}

	public void createControls(Composite parent,
			TabbedPropertySheetPage aTabbedPropertySheetPage) {
		super.createControls(parent, aTabbedPropertySheetPage);
		Composite composite = aTabbedPropertySheetPage.getWidgetFactory()
				.createFlatFormComposite(parent);

		GridLayout layout = new GridLayout(1, false);
		layout.marginWidth = 4;
		composite.setLayout(layout);

		// Create the table
		createTable(composite);

		// Create and setup the TableViewer
		createTableViewer();

		tableViewer.setContentProvider(gridContentProvider);
		tableViewer.setLabelProvider(new GridLabelProvider(getColumns()));

	}

	public GridContentProvider getGridContentProvider() {
		return gridContentProvider;
	}

	private void createTable(Composite parent) {
		int style = SWT.SINGLE | SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL
				| SWT.FULL_SELECTION | SWT.HIDE_SELECTION;

		table = new Table(parent, style);

		GridData gridData = new GridData(GridData.FILL_BOTH);
		gridData.grabExcessVerticalSpace = true;
		gridData.horizontalSpan = 3;
		table.setLayoutData(gridData);

		table.setLinesVisible(true);
		table.setHeaderVisible(true);

		for (Iterator<GridColumn> itr = getColumns().iterator(); itr.hasNext();) {
			GridColumn column = itr.next();
			column.createColumn();
		}

	}

	private void createTableViewer() {
		tableViewer = new TableViewer(table);
		tableViewer.setUseHashlookup(true);

		gridContentProvider = new GridContentProvider(tableViewer, ds);

		String[] columnNames = new String[getColumns().size()];
		CellEditor[] editors = new CellEditor[getColumns().size()];

		int i = 0;
		for (Iterator<GridColumn> itr = getColumns().iterator(); itr.hasNext(); i++) {
			GridColumn column = itr.next();
			columnNames[i] = column.getName();
			editors[i] = column.getEditor();
		}

		tableViewer.setColumnProperties(columnNames);
		// Assign the cell editors to the viewer
		tableViewer.setCellEditors(editors);
		// Set the cell modifier for the viewer
		tableViewer.setCellModifier(new CellModifier(getColumns(), ds));
		// Set the default sorter for the viewer
		if (getSorterID() != -1)
			tableViewer.setSorter(new Sorter(getColumns().get(getSorterID())));

	}

	public void setInput(IWorkbenchPart part, ISelection selection) {
		super.setInput(part, selection);
		ds.cleanList();
	}

	public void addRow() {
		ds.addRow();
		((TabbedPropertyComposite)(getPropertySheetPage().getControl())).getTabComposite().layout(true,true);
	}

	public void removeRow(Object row) {
		ds.removeRow(row);
		((TabbedPropertyComposite)(getPropertySheetPage().getControl())).getTabComposite().layout(true,true);
	}

	public int getSorterID() {
		return ds.getSorterID();
	}

	public void refresh() {
		try {
			super.refresh();
			tableViewer.setInput(ds);
			((TabbedPropertyComposite)(getPropertySheetPage().getControl())).getTabComposite().layout(true,true);
			
		} catch (org.eclipse.swt.SWTException e) {
		}
	}

	public abstract List<GridColumn> getColumns();

}
