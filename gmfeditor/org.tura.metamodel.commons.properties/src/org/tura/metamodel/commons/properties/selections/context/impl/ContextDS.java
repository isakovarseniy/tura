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
import org.tura.metamodel.commons.properties.selections.grid.impl.up.ContextParameterDS;

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
