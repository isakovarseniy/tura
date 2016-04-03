package org.tura.metamodel.commons.properties.selections.grid.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.tura.metamodel.commons.properties.selections.grid.DataSource;
import org.tura.metamodel.commons.properties.selections.grid.GridProperty;

import domain.DomainFactory;
import domain.DomainPackage;
import domain.Type;

public class AssosiationMasterDetailDS  extends DataSource {

	private GridProperty property;

	public AssosiationMasterDetailDS(GridProperty property) {
		this.property = property;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void addRow() {
		domain.Link row = DomainFactory.eINSTANCE.createLink();
		row.setUid(UUID.randomUUID().toString());


		Type type = (Type) ((domain.Assosiation) (property.getModel())).getSource();

		if (type == null)
			return;
		
		List<domain.Attribute> choicesOptions = ((AssosiationMasterDetailPropertySelection) property).initOptions(type);

		if (choicesOptions != null && choicesOptions.size() != 0) {
			row.setMasterField(choicesOptions.get(0));
		}

		type = (Type) ((domain.Assosiation) (property.getModel())).getTarget();

		if (type == null)
			return;

		choicesOptions = ((AssosiationMasterDetailPropertySelection) property).initOptions(type);

		if (choicesOptions != null && choicesOptions.size() != 0) {
			row.setDetailField(choicesOptions.get(0));
		}

		ArrayList<domain.Link> ls = new ArrayList<domain.Link>();
		ls.add((domain.Link) row);

		EditingDomain editingDomain = ((DiagramEditor) property.getPart()).getEditingDomain();

		editingDomain.getCommandStack().execute(
				AddCommand.create(editingDomain, ((domain.Assosiation) property.getModel()),
						DomainPackage.eINSTANCE.getAssosiation_Links(), ls));

		rowList.add(row);
		this.notifyAddRow(row);

	}

	@Override
	public void removeRow(Object row) {
		ArrayList<domain.Link> ls = new ArrayList<domain.Link>();
		ls.add((domain.Link) row);

		EditingDomain editingDomain = ((DiagramEditor) property.getPart()).getEditingDomain();

		editingDomain.getCommandStack().execute(
				RemoveCommand.create(editingDomain, ((domain.Assosiation) property.getModel()),
						DomainPackage.eINSTANCE.getAssosiation_Links(), ls));

		rowList.remove(row);
		this.notifyRemoveRow(row);

	}

	public List<Object> queryRows() {

		ArrayList<Object> rows = new ArrayList<Object>();
		if (property.getModel() != null) {

			List<domain.Link> links = ((domain.Assosiation) property.getModel()).getLinks();
			rows.addAll(links);
		}

		return rows;
	}

	@Override
	public int getSorterID() {
		return 0;
	}

}
