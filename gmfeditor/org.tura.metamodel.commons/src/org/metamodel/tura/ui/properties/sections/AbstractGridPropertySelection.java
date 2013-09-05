package org.metamodel.tura.ui.properties.sections;

import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.eclipse.jface.viewers.*;
import org.eclipse.swt.widgets.*;
import org.eclipse.jface.viewers.ITableLabelProvider;

public abstract class AbstractGridPropertySelection extends
		AbstractTuraPropertySection {

	// private Shell shell;
	protected Table table;
	protected TableViewer tableViewer;
	protected Button closeButton;

	public void createControls(Composite parent,
			TabbedPropertySheetPage aTabbedPropertySheetPage) {

		super.createControls(parent, aTabbedPropertySheetPage);
		Composite composite = getWidgetFactory()
				.createFlatFormComposite(parent);

		// Set numColumns to 3 for the buttons
		GridLayout layout = new GridLayout(2, false);
		layout.marginWidth = 4;
		composite.setLayout(layout);

		// Create the table
		createTable(composite);

		// Create and setup the TableViewer
		createTableViewer();
		tableViewer.setContentProvider(getContentProvider());
		tableViewer.setLabelProvider(getLabelProvider());

		// Add the buttons
		createButtons(composite);

	}

	protected abstract IStructuredContentProvider getContentProvider();

	protected abstract ITableLabelProvider getLabelProvider();

	protected abstract void createTable(Composite parent);

	protected abstract void createTableViewer();

	protected abstract void addRow();

	protected abstract void removeRow(Object o);

	protected abstract void createButtons(Composite parent) ;


	/**
	 * @return currently selected item
	 */
	public ISelection getSelection() {
		return tableViewer.getSelection();
	}

	/**
	 * Return the parent composite
	 */
	public Control getControl() {
		return table.getParent();
	}

	/**
	 * Return the 'close' Button
	 */
	public Button getCloseButton() {
		return closeButton;
	}

	public void dispose() {

		// Tell the label provider to release its ressources
		// tableViewer.getLabelProvider().dispose();
	}

}
