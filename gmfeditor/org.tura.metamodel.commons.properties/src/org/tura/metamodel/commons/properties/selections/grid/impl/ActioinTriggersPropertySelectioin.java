package org.tura.metamodel.commons.properties.selections.grid.impl;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Table;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.tura.metamodel.commons.properties.selections.adapters.textdata.ActioinTriggerName;
import org.tura.metamodel.commons.properties.selections.grid.GridColumn;
import org.tura.metamodel.commons.properties.selections.grid.GridProperty;
import org.tura.metamodel.commons.properties.selections.grid.GridTextColumn;

import domain.ActionTrigger;

public class ActioinTriggersPropertySelectioin extends GridProperty{

	private List<GridColumn> columnList;
	
	@Override
	public List<GridColumn> getColumns() {
		if (columnList == null) {
			columnList = new ArrayList<GridColumn>();
			columnList.add(new TriggerColumn(table, this,0));
		}
		return columnList;
	}

	
	public ActioinTriggersPropertySelectioin() {
		ds = new ActioinTriggersDS(this);
	}	
	
	public void createControls(Composite parent, final TabbedPropertySheetPage aTabbedPropertySheetPage) {

		Composite composite = aTabbedPropertySheetPage.getWidgetFactory().createFlatFormComposite(parent);

		GridLayout layout = new GridLayout(1, false);
		layout.marginWidth = 4;
		composite.setLayout(layout);
		super.createControls(composite, aTabbedPropertySheetPage);
		createButtons(composite, aTabbedPropertySheetPage);
		
		this.tableViewer.addSelectionChangedListener(new ISelectionChangedListener(){

			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				StructuredSelection qq = (StructuredSelection) event.getSelection();
				aTabbedPropertySheetPage.getControl().notifyListeners(SWT.Selection, new ActionTriggerSelectionEvent((ActionTrigger) qq.getFirstElement()));
				System.out.println();
			}
		});
		
	}

	private void createButtons(Composite parent, TabbedPropertySheetPage aTabbedPropertySheetPage) {
		Composite composite = aTabbedPropertySheetPage.getWidgetFactory().createFlatFormComposite(parent);

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
				Object row = ((IStructuredSelection) tableViewer.getSelection()).getFirstElement();
				if (row != null) {
					removeRow(row);
				}
			}
		});
		
	}
	
	public class ActionTriggerSelectionEvent extends Event{
		private  domain.ActionTrigger trigger;

		public ActionTriggerSelectionEvent( domain.ActionTrigger trigger){
			this.setTrigger(trigger);
		}

		public domain.ActionTrigger getTrigger() {
			return trigger;
		}

		public void setTrigger(domain.ActionTrigger trigger) {
			this.trigger = trigger;
		}
		
	}
	
	class TriggerColumn extends GridTextColumn {

		public TriggerColumn(Table table, GridProperty property, int col) {
			super(table, property, col);
			setTextDataAdapter(new ActioinTriggerName());
			this.setColumnName("Triggers");
		}

		@Override
		public boolean isModify(Object element, String property) {
			return false;
		}
	}
	
	
	@Override
	public EObject getModel() {
		return getEObject();
	}

}