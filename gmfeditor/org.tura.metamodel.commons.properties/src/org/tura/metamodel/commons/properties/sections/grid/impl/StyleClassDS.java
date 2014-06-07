package org.tura.metamodel.commons.properties.sections.grid.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.tura.metamodel.commons.properties.sections.grid.DataSource;
import org.tura.metamodel.commons.properties.sections.grid.GridProperty;

import domain.DomainFactory;
import domain.DomainPackage;

public class StyleClassDS extends DataSource {

	private GridProperty property;

	public StyleClassDS(GridProperty property) {
		this.property = property;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void addRow() {
		domain.StyleClass parameter = DomainFactory.eINSTANCE
				.createStyleClass();
		parameter.setUid(UUID.randomUUID().toString());
		ArrayList<domain.StyleClass> ls = new ArrayList<domain.StyleClass>();
		ls.add(parameter);

		EditingDomain editingDomain = ((DiagramEditor) property.getPart())
				.getEditingDomain();

		editingDomain.getCommandStack().execute(
				AddCommand.create(editingDomain,
						((domain.StyleElement) property.getModel()),
						DomainPackage.eINSTANCE.getStyleElement_StyleClass(),
						ls));

		rowList.add(rowList.size(), parameter);
		this.notifyAddRow(parameter);

	}

	@Override
	public void removeRow(Object row) {
		ArrayList<domain.StyleClass> ls = new ArrayList<domain.StyleClass>();
		ls.add((domain.StyleClass) row);

		EditingDomain editingDomain = ((DiagramEditor) property.getPart())
				.getEditingDomain();

		editingDomain.getCommandStack().execute(
				RemoveCommand.create(editingDomain,
						((domain.StyleElement) property.getModel()),
						DomainPackage.eINSTANCE.getStyleElement_StyleClass(),
						ls));

		rowList.remove(row);
		this.notifyRemoveRow(row);

	}

	@Override
	public List<Object> queryRows() {

		domain.StyleElement trg = (domain.StyleElement) property.getModel();

		ArrayList<Object> rows = new ArrayList<Object>();
		for (Iterator<domain.StyleClass> i = trg.getStyleClass().iterator(); i
				.hasNext();) {
			domain.StyleClass p = i.next();
			rows.add(p);
		}
		return rows;
	}

	@Override
	public int getSorterID() {
		return 0;
	}

}
