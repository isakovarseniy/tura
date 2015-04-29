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

public class RelationDS extends DataSource {

	private GridProperty property;

	public RelationDS(GridProperty property) {
		this.property = property;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void addRow() {
		domain.Link row = DomainFactory.eINSTANCE.createLink();
		row.setUid(UUID.randomUUID().toString());

		domain.Type type = null;

		domain.DataControl dc = ((domain.Relation) (property.getModel())).getMaster();
		if (dc.getCreate() != null && dc.getCreate().getMethodRef() != null
				&& dc.getCreate().getMethodRef().getReturnValue() != null) {
			type = (Type) dc.getCreate().getMethodRef().getReturnValue().getTypeRef();
		}
		if (dc.getBaseType() != null)
			type = dc.getBaseType();

		if (type == null)
			return;
		
		List<domain.Attribute> choicesOptions = ((RelationPropertySelection) property).initOptions(type);

		if (choicesOptions != null && choicesOptions.size() != 0) {
			row.setMasterField(choicesOptions.get(0));
		}

		dc = ((domain.Relation) (property.getModel())).getDetail();
		if (dc.getCreate() != null && dc.getCreate().getMethodRef() != null
				&& dc.getCreate().getMethodRef().getReturnValue() != null) {
			type = (Type) dc.getCreate().getMethodRef().getReturnValue().getTypeRef();
		}
		if (dc.getBaseType() != null)
			type = dc.getBaseType();

		if (type == null)
			return;

		choicesOptions = ((RelationPropertySelection) property).initOptions(type);

		if (choicesOptions != null && choicesOptions.size() != 0) {
			row.setDetailField(choicesOptions.get(0));
		}

		ArrayList<domain.Link> ls = new ArrayList<domain.Link>();
		ls.add((domain.Link) row);

		EditingDomain editingDomain = ((DiagramEditor) property.getPart()).getEditingDomain();

		editingDomain.getCommandStack().execute(
				AddCommand.create(editingDomain, ((domain.Relation) property.getModel()),
						DomainPackage.eINSTANCE.getRelation_Links(), ls));

		rowList.add(row);
		this.notifyAddRow(row);

	}

	@Override
	public void removeRow(Object row) {
		ArrayList<domain.Link> ls = new ArrayList<domain.Link>();
		ls.add((domain.Link) row);

		EditingDomain editingDomain = ((DiagramEditor) property.getPart()).getEditingDomain();

		editingDomain.getCommandStack().execute(
				RemoveCommand.create(editingDomain, ((domain.Relation) property.getModel()),
						DomainPackage.eINSTANCE.getRelation_Links(), ls));

		rowList.remove(row);
		this.notifyRemoveRow(row);

	}

	public List<Object> queryRows() {

		ArrayList<Object> rows = new ArrayList<Object>();
		if (property.getModel() != null) {

			List<domain.Link> links = ((domain.Relation) property.getModel()).getLinks();
			rows.addAll(links);
		}

		return rows;
	}

	@Override
	public int getSorterID() {
		return 0;
	}

}
