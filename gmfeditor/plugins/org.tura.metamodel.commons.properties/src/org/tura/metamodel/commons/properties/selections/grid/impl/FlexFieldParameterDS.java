package org.tura.metamodel.commons.properties.selections.grid.impl;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.epsilon.common.dt.util.LogUtil;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.notation.impl.NodeImpl;
import org.tura.metamodel.commons.QueryHelper;
import org.tura.metamodel.commons.properties.selections.grid.GridProperty;

import domain.Operation;

public class FlexFieldParameterDS extends ContextParameterDS {

	public FlexFieldParameterDS(GridProperty property) {
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

			domain.FlexField field = (domain.FlexField) property.getModel();
			if (field != null && field.getExpression() != null && field.getExpression().size() != 0){
				domain.ExpressionPart exp = field.getExpression().get(field.getExpression().size()-1);
				if ( exp.getObjRef() != null &&  exp.getObjRef() instanceof domain.Operation ){
					ls = new QueryHelper().findTriggerParameters((Operation) exp.getObjRef(),
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
