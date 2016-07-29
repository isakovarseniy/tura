package org.tura.metamodel.sirius.properties.selections.grid.impl;


import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
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
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.tura.metamodel.commons.QueryHelper;
import org.tura.metamodel.commons.properties.selections.adapters.helper.TreeRoot;
import org.tura.metamodel.sirius.properties.selections.adapters.textdata.GenerationHintNickName;
import org.tura.metamodel.sirius.properties.selections.adapters.textdata.GenerationHintNickNameRef;
import org.tura.metamodel.sirius.properties.selections.grid.GridColumn;
import org.tura.metamodel.sirius.properties.selections.grid.GridProperty;
import org.tura.metamodel.sirius.properties.selections.grid.GridTextAndDialogColumn;
import org.tura.metamodel.sirius.properties.selections.grid.GridTextColumn;

import artifact.ArtifactPackage;
import artifact.GenerationHint;

public class GenerationHintsPropertySelection extends GridProperty {

	protected List<GridColumn> columnList;
	
	public GenerationHintsPropertySelection() {
		ds = new GenerationHintsDS(this);
	}	

	@Override
	public List<GridColumn> getColumns() {
		if (columnList == null) {
			columnList = new ArrayList<GridColumn>();
			columnList.add(new CategoryColumn(table, this, 0,ArtifactPackage.eINSTANCE.getGenerationHint_Name()));
			columnList.add(new ParameterColumn(table, this, 1));
		}
		return columnList;
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

		private EStructuralFeature feature;
		
		public CategoryColumn(Table table, GridProperty property, int col,EStructuralFeature feature) {
			super(table, property, col);
			setColumnName("Generation hint");
			setTextDataAdapter(new GenerationHintNickNameRef());
			this.feature  = feature;
		}

		@Override
		public void modify(Object element, Object value) {
			if (element == null)
				return;
			super.modify(element, value);
			TableItem item = (TableItem) element;

			Object data = modelConverter( item.getData());
			Object obj = ((TreePath) value).getLastSegment();
			if (checkType(data, obj)) {
				EObject eobject = (EObject) obj;
			    GridColumn col = getProperty().getColumns().get(1);
			    if (col.getValue(data) == null ||  "".equals(col.getValue(data))){
			        col.modify(element, eobject.eGet(feature));
			    }
			}
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
			if (selectedElement instanceof GenerationHint)
				return true;
			return false;
		}
	}
	
	class ParameterColumn extends GridTextColumn{

		public ParameterColumn(Table table, GridProperty property, int col) {
			super(table, property, col);
			setTextDataAdapter(new GenerationHintNickName());
			this.setColumnName("Nick name");
		}
		
	}
	
}
