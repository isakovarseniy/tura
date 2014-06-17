package org.tura.metamodel.commons.properties.selections.grid.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.epsilon.common.dt.util.LogUtil;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.notation.impl.NodeImpl;
import org.tura.metamodel.commons.QueryHelper;
import org.tura.metamodel.commons.properties.selections.grid.DataSource;
import org.tura.metamodel.commons.properties.selections.grid.GridProperty;

import domain.DomainFactory;
import domain.DomainPackage;

public class ContextParameterrDS extends DataSource {

	private GridProperty property;

	public ContextParameterrDS(GridProperty property) {
		this.property = property;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void addRow() {
		domain.Parameter parameter = DomainFactory.eINSTANCE.createParameter();
		parameter.setName("New option");
		parameter.setUid(UUID.randomUUID().toString());
		ArrayList<domain.Parameter> ls = new ArrayList<domain.Parameter>();
		ls.add(parameter);

		EditingDomain editingDomain = ((DiagramEditor) property.getPart())
				.getEditingDomain();

		editingDomain.getCommandStack().execute(
				AddCommand.create(editingDomain, ((domain.Trigger) property
						.getModel()), DomainPackage.eINSTANCE
						.getContextParameters_Parameters(), ls));

		rowList.add(rowList.size(), parameter);
		this.notifyAddRow(parameter);

	}

	@Override
	public void removeRow(Object row) {
		ArrayList<domain.Parameter> ls = new ArrayList<domain.Parameter>();
		ls.add((domain.Parameter) row);

		EditingDomain editingDomain = ((DiagramEditor) property.getPart())
				.getEditingDomain();

		editingDomain.getCommandStack().execute(
				RemoveCommand.create(editingDomain, ((domain.Trigger) property
						.getModel()), DomainPackage.eINSTANCE
						.getContextParameters_Parameters(), ls));

		rowList.remove(row);
		this.notifyRemoveRow(row);

	}

	@Override
	public List<Object> queryRows() {

		try {
			NodeImpl diagram = (NodeImpl) property.getEditPart().getModel();
			EObject types = (EObject) diagram.getElement();
			EditingDomain editingDomain = ((DiagramEditor) property.getPart())
					.getEditingDomain();
			List<Object> ls = new ArrayList<Object>();

			if (property.getModel() instanceof domain.Trigger) {
				domain.Trigger trg = (domain.Trigger) property.getModel();
				if (trg.getMethodRef() == null)
					return ls;
				ls = new QueryHelper().findTriggerParameters(trg.getMethodRef(),trg, types,
						editingDomain);
			}
			if (property.getModel() instanceof domain.Context) {
				domain.Context ctx = (domain.Context) property.getModel();
				if  (ctx.getExpression() != null && ctx.getExpression().size() != 0 ){
					domain.ExpressionPart obj = ctx.getExpression().get(ctx.getExpression().size() - 1);
					if (  obj.getObjRef() != null &&  obj.getObjRef() instanceof domain.Operation){
						ls = new QueryHelper().findTriggerParameters((domain.Operation)obj.getObjRef() ,ctx, types,
								editingDomain);
						
					}
				}
					
			}

			return ls;
		} catch (Exception e) {
			LogUtil.log(e);
		}
		return null;
	}

	@Override
	public int getSorterID() {
		return 0;
	}

}
