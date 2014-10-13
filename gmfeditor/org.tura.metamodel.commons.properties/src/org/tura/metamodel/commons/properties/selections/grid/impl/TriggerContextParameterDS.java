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

public class TriggerContextParameterDS extends ContextParameterDS {

	public TriggerContextParameterDS(GridProperty property) {
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

			domain.Trigger trg = (domain.Trigger) property.getModel();
			if (trg.getMethodRef() == null)
				return ls;
			ls = new QueryHelper().findTriggerParameters(trg.getMethodRef(),
					trg, types, editingDomain);

			return ls;
		} catch (Exception e) {
			LogUtil.log(e);
		}
		return null;
	}

}
