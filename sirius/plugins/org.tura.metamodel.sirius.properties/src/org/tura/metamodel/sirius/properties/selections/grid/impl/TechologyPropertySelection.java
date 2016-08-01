package org.tura.metamodel.sirius.properties.selections.grid.impl;

import java.util.ArrayList;
import java.util.List;

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
import org.tura.metamodel.commons.QueryHelper;
import org.tura.metamodel.commons.properties.selections.adapters.helper.TreeRoot;
import org.tura.metamodel.sirius.properties.selections.TextDataAdapter;
import org.tura.metamodel.sirius.properties.selections.adapters.textdata.OptionRef;
import org.tura.metamodel.sirius.properties.selections.grid.GridColumn;
import org.tura.metamodel.sirius.properties.selections.grid.GridProperty;
import org.tura.metamodel.sirius.properties.selections.grid.GridTextAndDialogColumn;

import artifact.TechLeaf;

public class TechologyPropertySelection extends GridProperty {

	protected List<GridColumn> columnList;
	private TextDataAdapter firstColumnTextAdapter;
	
	
	public TechologyPropertySelection(){
		this.firstColumnTextAdapter= new OptionRef();
		ds = new TechologyDS(this);
	}
	
	
	
	@Override
	public List<GridColumn> getColumns() {
		if (columnList == null) {
			columnList = new ArrayList<GridColumn>();
			columnList.add(new CategoryColumn(table, this, 0,firstColumnTextAdapter));
		}
		return columnList;
	}
	
	public Class<?> getComaringClass(){
		return TechLeaf.class;
	}
	
	public String getNameContextColumn(){
		return "Technology";
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
				Object row = ((IStructuredSelection) tableViewer.getSelection()).getFirstElement();
				if (row != null) {
					removeRow(row);
				}
			}
		});

	}


	class CategoryColumn extends GridTextAndDialogColumn {

		
		public CategoryColumn(Table table, GridProperty property, int col,TextDataAdapter textAdapter) {
			super(table, property, col);
			setColumnName(getNameContextColumn());
			setTextDataAdapter(textAdapter);
		}

		@Override
		public Object modelConverter(Object model){
			return model;
			
		}
		@Override
		public TreeRoot getContextRoot() {
			TreeRoot rootOfTree = new TreeRoot();
			try {
				rootOfTree.addChild(new QueryHelper().getDomainArtifact(this.getProperty().getModel()));
			} catch (Exception e) {
				// ignore
			}
			return rootOfTree;
		}

		@Override
		public boolean checkType(Object tableItem, Object selectedElement) {
			if (getComaringClass().isAssignableFrom(selectedElement.getClass()) )
				return true;
			return false;
		}
	}


	
	
	
}
