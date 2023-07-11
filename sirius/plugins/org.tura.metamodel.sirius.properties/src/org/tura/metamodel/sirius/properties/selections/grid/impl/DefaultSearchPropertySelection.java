/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2023 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
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
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

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
import org.eclipse.swt.widgets.Table;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.tura.metamodel.commons.QueryHelper;
import org.tura.metamodel.commons.Util;
import org.tura.metamodel.sirius.properties.selections.adapters.dropdown.ContextParameterOperation;
import org.tura.metamodel.sirius.properties.selections.adapters.dropdown.ContextParameterRefObjToAttribure;
import org.tura.metamodel.sirius.properties.selections.grid.DataSource;
import org.tura.metamodel.sirius.properties.selections.grid.GridColumn;
import org.tura.metamodel.sirius.properties.selections.grid.GridDropDownColumn;
import org.tura.metamodel.sirius.properties.selections.grid.GridProperty;

import form.Comparator;
import form.ContextParameter;
import form.ContextParameters;
import form.DataControl;
import form.FormFactory;
import form.FormPackage;
import type.Attribute;
import type.Generalization;
import type.Type;
import type.TypeElement;
import type.TypeReference;


public class DefaultSearchPropertySelection extends ContextParameterPropertySelection {

	@Override
	public EObject getModel() {
		if (((DataControl) super.getModel()).getDefaultSearch() == null) {
			EditingDomain editingDomain = ((DiagramEditor) this.getPart()).getEditingDomain();

			ContextParameters ctx = FormFactory.eINSTANCE.createContextParameters();
			editingDomain.getCommandStack().execute(
					SetCommand.create(editingDomain, super.getModel(),
							FormPackage.eINSTANCE.getDataControl_DefaultSearch(), ctx));
		}
		return ((DataControl) super.getModel()).getDefaultSearch();
	}

	@Override
	public List<GridColumn> getColumns() {
		if (columnList == null) {
			columnList = new ArrayList<GridColumn>();
			columnList.add(new FieldsColumn(table, this, 0));
			columnList.add(new OperationColumn(table, this, 1));
			columnList.add(new IsExpressioinColumn(table, this, 2));
			columnList.add(new ValueColumn(table, this, 3));
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

	class FieldsColumn extends GridDropDownColumn {

		public FieldsColumn(Table table, GridProperty property, int col) {
			super(table, property, col);
			setColumnName("Column");
			setDropDownDataAdapter(new ContextParameterRefObjToAttribure());
		}

		@Override
		public Map<String, Object> getEnumerationFeatureValues(EObject base) {
			DataControl dc = (DataControl) this.getProperty().getModel().eContainer();

			Type type = (Type) Util.getBase(dc);
			if (type == null){
				return null;
			}
				

			List<Attribute> attributes = initOptions(type);

			LinkedHashMap<String, Object> ls = new LinkedHashMap<>();
			for (Attribute attr : attributes)
				ls.put(attr.getName(), attr);

			return ls;
		}

	}

	public List<Attribute> initOptions(Type type) {
		List<Attribute> attrs = new ArrayList<>();

		Collection<Generalization> ls =  new QueryHelper().getTypeExtension(type);
		if (ls.size() != 0) {
			for (Generalization ext : ls ) {
				TypeElement typeElement = ext.getTarget();
				if (typeElement instanceof Type)
					attrs.addAll(initOptions((Type) typeElement));

				if (typeElement instanceof TypeReference)
					attrs.addAll(initOptions((Type) ((TypeReference) typeElement).getTypeRef()));
			}
		}
		attrs.addAll(type.getAttributes());
		return attrs;
	}

	class OperationColumn extends GridDropDownColumn {

		public OperationColumn(Table table, GridProperty property, int col) {
			super(table, property, col);
			setColumnName("Operation");
			setDropDownDataAdapter(new ContextParameterOperation());
		}

		@Override
		public Map<String, Object> getEnumerationFeatureValues(EObject base) {

			Map<String, Object> ls = new LinkedHashMap<>();

			for (Comparator cmpval : Comparator.values()) {
				ls.put(cmpval.getName(), cmpval);
			}

			return ls;
		}

	}

	@Override
	public TypeElement contextRefTypeExtreactor(ContextParameter obj) {
		return ((Attribute) obj.getRefObj()).getTypeRef();
	}

	@Override
	protected DataSource getDS() {
		return new DefaultContextParametersDS(this);
	}

}
