/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2022 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
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

import form.Trigger;

public class TriggerContextParameterDS extends ContextParameterDS {

	public TriggerContextParameterDS(GridProperty property) {
		super(property);
	}

	@Override
	public List<Object> queryRows() {
		try {
			NodeImpl diagram = (NodeImpl) property.getEditPart().getModel();

			EObject types = (EObject) diagram.getElement();
			EditingDomain editingDomain = ((DiagramEditor) property.getPart()).getEditingDomain();
			List<Object> ls = new ArrayList<Object>();

			Trigger trg = (Trigger) property.getModel();
			if (trg.getMethodRef() == null)
				return ls;
			ls = new QueryHelper1().findTriggerParameters(trg.getMethodRef(),trg, types, editingDomain);

			return ls;
		} catch (Exception e) {
			LogUtil.log(e);
		}
		return null;
	}

}
