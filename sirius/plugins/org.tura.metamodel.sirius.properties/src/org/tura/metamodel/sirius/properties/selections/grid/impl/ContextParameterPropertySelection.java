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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.viewpoint.DRepresentationElement;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.tura.metamodel.commons.QueryHelper;
import org.tura.metamodel.sirius.properties.selections.adapters.textdata.ContextParameterParameterRefName;
import org.tura.metamodel.sirius.properties.selections.grid.DataSource;
import org.tura.metamodel.sirius.properties.selections.grid.GridColumn;
import org.tura.metamodel.sirius.properties.selections.grid.GridProperty;
import org.tura.metamodel.sirius.properties.selections.grid.GridTextColumn;

import form.ContextParameter;
import form.ContextValue;
import type.Generalization;
import type.Type;
import type.TypeElement;
import type.TypeReference;



public abstract class ContextParameterPropertySelection extends ContextValuePropertySelection {

	protected List<GridColumn> columnList;

	public abstract TypeElement contextRefTypeExtreactor(ContextParameter obj);

	protected abstract DataSource getDS();

	@Override
	public EObject getModel() {
		DRepresentationElement element = (DRepresentationElement) getEObject();
		return element.getTarget();
	}

	public ContextParameterPropertySelection() {
		ds = getDS();
	}

	@Override
	public List<GridColumn> getColumns() {
		if (columnList == null) {
			columnList = new ArrayList<GridColumn>();
			columnList.add(new ParameterColumn(table, this, 0));
			columnList.add(new IsExpressioinColumn(table, this, 1));
			columnList.add(new ValueColumn(table, this, 2));
		}
		return columnList;
	}

	public void createControls(Composite parent, TabbedPropertySheetPage aTabbedPropertySheetPage) {

		Composite composite = aTabbedPropertySheetPage.getWidgetFactory().createFlatFormComposite(parent);

		GridLayout layout = new GridLayout(1, false);
		layout.marginWidth = 4;
		composite.setLayout(layout);
		super.createControls(composite, aTabbedPropertySheetPage);
	}

	class ParameterColumn extends GridTextColumn {

		public ParameterColumn(Table table, GridProperty property, int col) {
			super(table, property, col);
			setTextDataAdapter(new ContextParameterParameterRefName());
			this.setColumnName("Parameter");
		}

	}

	
	public boolean checkType(ContextValue param, TypeElement type,Object model) {
		TypeElement nullType =   new QueryHelper().findNullType(type);
		
		if (type.getUid().equals(nullType.getUid()))
			return true;
		
		if (type.getUid().equals(contextRefTypeExtreactor((ContextParameter) model).getUid()))
			return true;
		else {
			if (type instanceof TypeReference)
				type = ((TypeReference) type).getTypeRef();

			if (type instanceof Type) {
				for (Generalization ext : new QueryHelper().getTypeExtension((Type)type)) {
					TypeElement typeElement =ext.getTarget();
					if (typeElement instanceof Type) {
						if (checkType(param, typeElement,model)) {
							return true;
						}
					}
					if (typeElement instanceof TypeReference) {
						if (checkType(param, ((TypeReference) typeElement).getTypeRef(),model)) {
							return true;
						}
					}
				}
			} else
				return false;
		}
		return false;
	}

	public ContextValue modelToCtxValue(Object model) {
		return ((ContextParameter) model).getValue();

	}

}
