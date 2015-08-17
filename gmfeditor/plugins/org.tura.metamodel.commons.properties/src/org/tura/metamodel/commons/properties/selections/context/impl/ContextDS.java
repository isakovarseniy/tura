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
package org.tura.metamodel.commons.properties.selections.context.impl;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.epsilon.common.dt.util.LogUtil;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.notation.impl.NodeImpl;
import org.tura.metamodel.commons.QueryHelper;
import org.tura.metamodel.commons.properties.selections.grid.GridProperty;
import org.tura.metamodel.commons.properties.selections.grid.impl.ContextParameterDS;

public class ContextDS extends ContextParameterDS {

	public ContextDS(GridProperty property) {
		super(property);
	}

	@Override
	public List<Object> queryRows() {
		try {
			NodeImpl diagram = (NodeImpl) property.getEditPart().getModel();
			EObject types = (EObject) diagram.getElement();
			EditingDomain editingDomain = ((DiagramEditor) property.getPart())
					.getEditingDomain();
			List<Object> ls = new ArrayList<Object>();

			domain.Context ctx = (domain.Context) property.getModel();
			if  (ctx.getExpression() != null && ctx.getExpression().size() != 0 ){
				domain.ExpressionPart obj = ctx.getExpression().get(ctx.getExpression().size() - 1);
				if (  obj.getObjRef() != null &&  obj.getObjRef() instanceof domain.Operation){
					ls = new QueryHelper().findTriggerParameters((domain.Operation)obj.getObjRef() ,ctx, types,
							editingDomain);
					
				}
			}

			return ls;
		} catch (Exception e) {
			LogUtil.log(e);
		}
		return null;
	}

}
