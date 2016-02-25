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

public class KeyValuePairDS extends DataSource {

	private GridProperty property;

	public KeyValuePairDS(GridProperty property) {
		this.property = property;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void addRow() {
		domain.KeyValuePair keyValue = DomainFactory.eINSTANCE
				.createKeyValuePair();
		keyValue.setUid(UUID.randomUUID().toString());
		ArrayList<domain.KeyValuePair> ls = new ArrayList<domain.KeyValuePair>();
		ls.add(keyValue);

		EditingDomain editingDomain = ((DiagramEditor) property.getPart())
				.getEditingDomain();

		editingDomain.getCommandStack().execute(
				AddCommand.create(editingDomain,
						((domain.HashProperty) property.getModel()),
						DomainPackage.eINSTANCE.getHashProperty_Hash(), ls));

		rowList.add(rowList.size(), keyValue);
		this.notifyAddRow(keyValue);

	}

	@Override
	public void removeRow(Object row) {
		ArrayList<domain.KeyValuePair> ls = new ArrayList<domain.KeyValuePair>();
		ls.add((domain.KeyValuePair) row);

		EditingDomain editingDomain = ((DiagramEditor) property.getPart())
				.getEditingDomain();

		editingDomain.getCommandStack().execute(
				RemoveCommand.create(editingDomain,
						((domain.HashProperty) property.getModel()),
						DomainPackage.eINSTANCE.getHashProperty_Hash(), ls));

		rowList.remove(row);
		this.notifyRemoveRow(row);

	}

	@Override
	public List<Object> queryRows() {
		domain.HashProperty hash = (domain.HashProperty) property.getModel();

		ArrayList<Object> rows = new ArrayList<Object>();
		if (hash != null) {
			for (domain.KeyValuePair p : hash.getHash()) {
				rows.add(p);
			}
		}
		return rows;
	}

	@Override
	public int getSorterID() {
		return 0;
	}

}
