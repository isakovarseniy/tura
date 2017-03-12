package org.tura.metamodel.sirius.properties.selections.grid.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.tura.metamodel.sirius.properties.selections.grid.DataSource;
import org.tura.metamodel.sirius.properties.selections.grid.GridProperty;

import type.Attribute;
import type.DomainConnector;
import type.Link;
import type.Type;
import type.TypeFactory;
import type.TypePackage;

public class DomainConnectorMasterDetailDS  extends DataSource {

	private GridProperty property;

	public DomainConnectorMasterDetailDS(GridProperty property) {
		this.property = property;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void addRow() {
		Link row = TypeFactory.eINSTANCE.createLink();
		row.setUid(UUID.randomUUID().toString());


		Type type = (Type) ((DomainConnector) (property.getModel())).getSource();

		if (type == null)
			return;
		
		List<Attribute> choicesOptions = ((DomainConnectorMasterDetailPropertySelection) property).initOptions(type);

		if (choicesOptions != null && choicesOptions.size() != 0) {
			row.setMasterField(choicesOptions.get(0));
		}

		type = (Type) ((DomainConnector) (property.getModel())).getTarget();

		if (type == null)
			return;

		choicesOptions = ((DomainConnectorMasterDetailPropertySelection) property).initOptions(type);

		if (choicesOptions != null && choicesOptions.size() != 0) {
			row.setDetailField(choicesOptions.get(0));
		}

		ArrayList<Link> ls = new ArrayList<Link>();
		ls.add((Link) row);

		EditingDomain editingDomain = ((DiagramEditor) property.getPart()).getEditingDomain();

		editingDomain.getCommandStack().execute(
				AddCommand.create(editingDomain, ((DomainConnector) property.getModel()),
						TypePackage.eINSTANCE.getDomainConnector_Links(), ls));

		rowList.add(row);
		this.notifyAddRow(row);

	}

	@Override
	public void removeRow(Object row) {
		ArrayList<Link> ls = new ArrayList<Link>();
		ls.add((Link) row);

		EditingDomain editingDomain = ((DiagramEditor) property.getPart()).getEditingDomain();

		editingDomain.getCommandStack().execute(
				RemoveCommand.create(editingDomain, ((DomainConnector) property.getModel()),
						TypePackage.eINSTANCE.getDomainConnector_Links(), ls));

		rowList.remove(row);
		this.notifyRemoveRow(row);

	}

	public List<Object> queryRows() {

		ArrayList<Object> rows = new ArrayList<Object>();
		if (property.getModel() != null) {

			List<Link> links = ((DomainConnector) property.getModel()).getLinks();
			rows.addAll(links);
		}

		return rows;
	}

	@Override
	public int getSorterID() {
		return 0;
	}

}
