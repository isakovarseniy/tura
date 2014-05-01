package org.metamodel.tura.ui.properties.sections.grid.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.notation.impl.NodeImpl;
import org.metamodel.tura.ui.properties.sections.QueryHelper;
import org.metamodel.tura.ui.properties.sections.grid.DataSource;
import org.metamodel.tura.ui.properties.sections.grid.GridProperty;

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
				AddCommand.create(editingDomain,
						((domain.Trigger) property.getModel()),
						DomainPackage.eINSTANCE.getTrigger_Parameters(), ls));

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
				RemoveCommand.create(editingDomain,
						((domain.Trigger) property.getModel()),
						DomainPackage.eINSTANCE.getTrigger_Parameters(), ls));

		rowList.remove(row);
		this.notifyRemoveRow(row);

	}

	@Override
	public List<Object> queryRows() {

		try {
			NodeImpl diagram = (NodeImpl) property.getEditPart().getModel();
			EObject types = (EObject) diagram.getElement();
			domain.Trigger trg = (domain.Trigger) property.getModel();
			EditingDomain editingDomain = ((DiagramEditor) property.getPart())
					.getEditingDomain();

			List<Object> ls = new QueryHelper().findTriggerParameters(trg,
					types, editingDomain);
			return ls;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int getSorterID() {
		return 0;
	}

}
