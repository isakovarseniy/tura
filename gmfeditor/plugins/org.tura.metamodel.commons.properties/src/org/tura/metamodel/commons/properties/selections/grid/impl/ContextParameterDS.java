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
package org.tura.metamodel.commons.properties.selections.grid.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.tura.metamodel.commons.properties.selections.grid.DataSource;
import org.tura.metamodel.commons.properties.selections.grid.GridProperty;

import domain.DomainFactory;
import domain.DomainPackage;

public abstract class ContextParameterDS extends DataSource {

	protected GridProperty property;

	public ContextParameterDS(GridProperty property) {
		this.property = property;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void addRow() {
		domain.ContextParameter parameter = DomainFactory.eINSTANCE.createContextParameter();
		parameter.setUid(UUID.randomUUID().toString());
		
		domain.ContextValue cntVal = DomainFactory.eINSTANCE.createContextValue();
		cntVal.setUid(UUID.randomUUID().toString());
		parameter.setValue(cntVal);
		
		ArrayList<domain.ContextParameter> ls = new ArrayList<domain.ContextParameter>();
		ls.add(parameter);

		EditingDomain editingDomain = ((DiagramEditor) property.getPart())
				.getEditingDomain();

		editingDomain.getCommandStack().execute(
				AddCommand.create(editingDomain, ((domain.ContextParameters) property
						.getModel()), DomainPackage.eINSTANCE
						.getContextParameters_Parameters(), ls));

		rowList.add(rowList.size(), parameter);
		this.notifyAddRow(parameter);

	}

	@Override
	public void removeRow(Object row) {
		ArrayList<domain.ContextParameter> ls = new ArrayList<domain.ContextParameter>();
		ls.add((domain.ContextParameter) row);

		EditingDomain editingDomain = ((DiagramEditor) property.getPart())
				.getEditingDomain();

		editingDomain.getCommandStack().execute(
				RemoveCommand.create(editingDomain, ((domain.ContextParameters) property
						.getModel()), DomainPackage.eINSTANCE
						.getContextParameters_Parameters(), ls));

		rowList.remove(row);
		this.notifyRemoveRow(row);

	}

	@Override
	public abstract List<Object> queryRows() ;
//	{
//
//		try {
//			NodeImpl diagram = (NodeImpl) property.getEditPart().getModel();
//			EObject types = (EObject) diagram.getElement();
//			EditingDomain editingDomain = ((DiagramEditor) property.getPart())
//					.getEditingDomain();
//			List<Object> ls = new ArrayList<Object>();
//
//			if (property.getModel() instanceof domain.Trigger) {
//				domain.Trigger trg = (domain.Trigger) property.getModel();
//				if (trg.getMethodRef() == null)
//					return ls;
//				ls = new QueryHelper().findTriggerParameters(trg.getMethodRef(),trg, types,
//						editingDomain);
//			}
//			if (property.getModel() instanceof domain.Context) {
//				domain.Context ctx = (domain.Context) property.getModel();
//				if  (ctx.getExpression() != null && ctx.getExpression().size() != 0 ){
//					domain.ExpressionPart obj = ctx.getExpression().get(ctx.getExpression().size() - 1);
//					if (  obj.getObjRef() != null &&  obj.getObjRef() instanceof domain.Operation){
//						ls = new QueryHelper().findTriggerParameters((domain.Operation)obj.getObjRef() ,ctx, types,
//								editingDomain);
//						
//					}
//				}
//					
//			}
//
//			return ls;
//		} catch (Exception e) {
//			LogUtil.log(e);
//		}
//		return null;
//	}

	@Override
	public int getSorterID() {
		return 0;
	}

}
