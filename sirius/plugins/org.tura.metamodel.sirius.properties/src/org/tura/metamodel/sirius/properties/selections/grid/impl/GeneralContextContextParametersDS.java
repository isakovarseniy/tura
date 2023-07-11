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
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.epsilon.common.dt.util.LogUtil;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.notation.impl.NodeImpl;
import org.tura.metamodel.commons.QueryHelper1;
import org.tura.metamodel.sirius.properties.selections.grid.GridProperty;

import form.Context;
import type.Operation;

public abstract class GeneralContextContextParametersDS extends ContextParameterDS {

	
	public abstract Context getContext(Object obj);
	
	public GeneralContextContextParametersDS(GridProperty property) {
		super(property);
	}

	@Override
	public List<Object> queryRows() {
		try {
			NodeImpl diagram = (NodeImpl) property.getEditPart().getModel();

			EObject types = (EObject) diagram.getElement();
			EditingDomain editingDomain = ((DiagramEditor) property.getPart()).getEditingDomain();
			List<Object> ls = new ArrayList<Object>();

			Context context =  getContext(property.getModel());
			if (context.getExpression() != null && context.getExpression().size() > 0){
				int i = context.getExpression().size();
				Object obj = context.getExpression().get(i-1).getObjRef();
				if (obj  != null  && obj instanceof Operation){
					ls = new QueryHelper1().findTriggerParameters((Operation)obj ,context, types, editingDomain);
				}
			}
			return ls;
		} catch (Exception e) {
			LogUtil.log(e);
		}
		return null;
	}

}
