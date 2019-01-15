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

import form.ExpressionPart;
import form.FlexField;
import type.Operation;

public class FlexFieldParameterDS extends ContextParameterDS {

	public FlexFieldParameterDS(GridProperty property) {
		super(property);
	}

	@Override
	public List<Object> queryRows() {
		try {
			List<Object> ls = new ArrayList<Object>();
			if (property.getEditPart() == null || property.getEditPart().getModel() == null){
				return ls;
			}
			
			NodeImpl diagram = (NodeImpl) property.getEditPart().getModel();
			EObject types = (EObject) diagram.getElement();
			EditingDomain editingDomain = ((DiagramEditor) property.getPart())
					.getEditingDomain();

			FlexField field = (FlexField) property.getModel();
			if (field != null && field.getExpression() != null && field.getExpression().size() != 0){
				ExpressionPart exp = field.getExpression().get(field.getExpression().size()-1);
				if ( exp.getObjRef() != null &&  exp.getObjRef() instanceof Operation ){
					ls = new QueryHelper1().findTriggerParameters((Operation) exp.getObjRef(),
							field, types, editingDomain);
				}
			}
			return ls;
		} catch (Exception e) {
			LogUtil.log(e);
		}
		return null;
	}

}
