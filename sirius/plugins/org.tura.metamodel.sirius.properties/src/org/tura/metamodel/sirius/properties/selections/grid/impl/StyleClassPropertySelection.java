/*******************************************************************************
 * Tura - application generation platform
 *
 * Copyright (c) 2012, 2015, Arseniy Isakov
 *  
 * This project includes software developed by Arseniy Isakov
 * http://sourceforge.net/p/tura/wiki/Home/
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.tura.metamodel.sirius.properties.selections.grid.impl;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.Platform;
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
import org.tura.metamodel.commons.properties.selections.adapters.IReturnTypeProvider;
import org.tura.metamodel.commons.properties.selections.adapters.helper.TreeRoot;
import org.tura.metamodel.sirius.properties.selections.TextDataAdapter;
import org.tura.metamodel.sirius.properties.selections.adapters.textdata.ClassifierRef;
import org.tura.metamodel.sirius.properties.selections.grid.GridColumn;
import org.tura.metamodel.sirius.properties.selections.grid.GridProperty;
import org.tura.metamodel.sirius.properties.selections.grid.GridTextAndDialogColumn;

import artifact.GenerationHint;
import form.ContextValue;
import form.StyleClass;
import type.TypeElement;

public class StyleClassPropertySelection extends ContextValuePropertySelection {

	protected List<GridColumn> columnList;
	private TextDataAdapter hintTextAdapter = new ClassifierRef();
	
	
	protected TypeElement getTargetType() throws Exception {
		return new QueryHelper().findStyleType(getModel());
	}
	
	
	public StyleClassPropertySelection() {
		ds = new StyleClassDS(this);
	}	

	@Override
	public List<GridColumn> getColumns() {
		if (columnList == null) {
			columnList = new ArrayList<GridColumn>();
			columnList.add(new IsExpressioinColumn(table, this, 0));
			columnList.add(new ValueColumn(table, this, 1));
			columnList.add(new CategoryColumn(table, this, 2,hintTextAdapter));
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

	@Override
	protected TypeElement getType(Object obj){
		IReturnTypeProvider provider = (IReturnTypeProvider) Platform.getAdapterManager().getAdapter(obj,
				IReturnTypeProvider.class);

		TypeElement type = null;
		if (provider != null && provider.getApplicationType(obj) != null)
			type = (TypeElement) provider.getApplicationType(obj);
		
		return type;
		
	}

	
	@Override
	public boolean checkType(ContextValue ctxv, TypeElement type, Object model) {
		TypeElement  modelType = (TypeElement) type;
		TypeElement targetType = null;

		try{
			targetType = getTargetType();
		}catch(Exception e){
			return false;
		}
		
		if (targetType == null){
			return false;
		}
		if (targetType.getUid().equals(modelType.getUid())){
			return true;
		}else{
			return false;
		}
	}

	
	
	@Override
	public ContextValue modelToCtxValue(Object ctxv) {
		return (ContextValue) ctxv;
	}

	class CategoryColumn extends GridTextAndDialogColumn {

		public CategoryColumn(Table table, GridProperty property, int col,TextDataAdapter adapter) {
			super(table, property, col);
			setColumnName("Category");
			setTextDataAdapter(adapter);
		}

		@Override
		public Object modelConverter(Object model){
			return ((StyleClass)model).getClassifier();
			
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
	
	
}
