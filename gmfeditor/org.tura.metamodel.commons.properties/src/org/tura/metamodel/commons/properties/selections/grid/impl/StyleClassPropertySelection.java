package org.tura.metamodel.commons.properties.selections.grid.impl;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.tura.metamodel.commons.properties.selections.grid.DataSource;
import org.tura.metamodel.commons.properties.selections.grid.GridColumn;

import domain.DomainFactory;
import domain.DomainPackage;

public class StyleClassPropertySelection extends ContextParameterPropertySelection {

	@Override
	public EObject getModel() {
		if (((domain.StyleElement) getEObject()).getStyleClass() == null) {
			EditingDomain editingDomain = ((DiagramEditor) this.getPart())
					.getEditingDomain();

			domain.ContextParameters ctx = DomainFactory.eINSTANCE
					.createContextParameters();
			editingDomain.getCommandStack().execute(
					SetCommand.create(editingDomain, getEObject(),
							DomainPackage.eINSTANCE
									.getStyleElement_StyleClass(), ctx));
		}
		return ((domain.StyleElement) getEObject()).getStyleClass();
	}	
	
	@Override
	public List<GridColumn> getColumns() {
		if (columnList == null) {
			columnList = new ArrayList<GridColumn>();
			columnList.add(new IsExpressioinColumn(table, this, 0));
			columnList.add(new ValueColumn(table, this, 1));
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

	@Override
	public String contextRefNameExtreactor(domain.ContextParameter obj) {
		return null;
	}

	@Override
	public domain.TypeElement contextRefTypeExtreactor(
			domain.ContextParameter obj) {
		return null;
	}

	@Override
	protected DataSource getDS() {
		return new StyleClassDS(this);
	}	
	
}
