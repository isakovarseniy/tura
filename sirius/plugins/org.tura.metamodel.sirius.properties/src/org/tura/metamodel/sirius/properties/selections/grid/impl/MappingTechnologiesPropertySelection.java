/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.tura.metamodel.sirius.properties.selections.grid.impl;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.sirius.viewpoint.DRepresentationElement;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.tura.metamodel.sirius.properties.selections.adapters.dropdown.MappingTechnologyTechRef;
import org.tura.metamodel.sirius.properties.selections.adapters.textdata.MappingTechnologyName;
import org.tura.metamodel.sirius.properties.selections.events.ModelMapperArtifactChangeEvent;
import org.tura.metamodel.sirius.properties.selections.events.Bus;
import org.tura.metamodel.sirius.properties.selections.events.Event;
import org.tura.metamodel.sirius.properties.selections.events.EventListener;
import org.tura.metamodel.sirius.properties.selections.grid.GridColumn;
import org.tura.metamodel.sirius.properties.selections.grid.GridDropDownColumn;
import org.tura.metamodel.sirius.properties.selections.grid.GridProperty;
import org.tura.metamodel.sirius.properties.selections.grid.GridTextColumn;

import artifact.Option;
import artifact.Technology;
import recipe.MappingTecnologiy;

public class MappingTechnologiesPropertySelection extends GridProperty {

	private List<GridColumn> columnList;
	private SelectionListener listener = new SelectionListener();

	@Override
	public EObject getModel() {
		DRepresentationElement element = (DRepresentationElement) getEObject();
		return element.getTarget();
	}
	
	public MappingTechnologiesPropertySelection() {
		ds = new MappingTechnologiesDS(this);
	}

	@Override
	public List<GridColumn> getColumns() {
		if (columnList == null) {
			columnList = new ArrayList<GridColumn>();
			columnList.add(new OptionColumn(table, this, 0));
			columnList.add(new ValueColumn(table, this, 1));
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
		
		Bus.getInstance().addEventListner(listener);
		
	}

	private void createButtons(Composite parent, TabbedPropertySheetPage aTabbedPropertySheetPage) {
		Composite composite = aTabbedPropertySheetPage.getWidgetFactory().createFlatFormComposite(parent);

		GridLayout layout = new GridLayout(2, false);
		layout.marginWidth = 4;
		composite.setLayout(layout);

		// Create and configure the "Delete" button
		Button delete = new Button(composite, SWT.PUSH | SWT.CENTER);
		delete.setText("Delete");
		GridData gridData = new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING);
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

	class OptionColumn extends GridTextColumn {

		public OptionColumn(Table table, GridProperty property, int col) {
			super(table, property, col);
			setTextDataAdapter(new MappingTechnologyName());
			this.setColumnName("Option");
		}

		@Override
		public boolean isModify(Object element, String property) {
			return false;
		}
	}

	class ValueColumn extends GridDropDownColumn {

		public ValueColumn(Table table, GridProperty property, int col) {
			super(table, property, col);
			this.setColumnName("Value");
			setDropDownDataAdapter(new MappingTechnologyTechRef());
		}

		@Override
		public Map<String, Object> getEnumerationFeatureValues(EObject base) {

			if (base == null)
				return new LinkedHashMap<>();
			Technology ms = ((MappingTecnologiy) base).getTechRef();
			if (ms == null)
				return new LinkedHashMap<>();

			Map<String, Object> ls = new LinkedHashMap<>();
			for (Option option : ms.getOptions()) {
				ls.put( getDataAdapter().getFeatureAsText(option) , option);
			}
			return ls;
		}

	}

	private class SelectionListener implements EventListener {

		public SelectionListener() {
		}

		@Override
		public void handleEvent(Event event) {
			if (event instanceof ModelMapperArtifactChangeEvent) {
				ds.cleanList();
				ds.getRows();
				refresh();
			}
		}
	}
	
	@Override
	public void dispose(){
		Bus.getInstance().removeEventListner(listener);
	}

}
