package org.metamodel.tura.ui.properties.sections.grid.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.metamodel.tura.ui.properties.sections.grid.DataSource;
import org.metamodel.tura.ui.properties.sections.grid.GridProperty;

import domain.DomainFactory;
import domain.DomainPackage;

public class AvailableLanguagesDS extends DataSource {

	private GridProperty property;

	public AvailableLanguagesDS(GridProperty property) {
		this.property = property;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void addRow() {
		domain.LanguageRef parameter = DomainFactory.eINSTANCE
				.createLanguageRef();
		parameter.setUid(UUID.randomUUID().toString());
		ArrayList<domain.LanguageRef> ls = new ArrayList<domain.LanguageRef>();
		ls.add(parameter);

		EditingDomain editingDomain = ((DiagramEditor) property.getPart())
				.getEditingDomain();

		editingDomain.getCommandStack()
				.execute(
						AddCommand.create(editingDomain,
								((domain.MessageLibrary) property.getModel()),
								DomainPackage.eINSTANCE
										.getMessageLibrary_LibLanguages(), ls));

		rowList.add(rowList.size(), parameter);
		this.notifyAddRow(parameter);

	}

	@Override
	public void removeRow(Object row) {
		ArrayList<domain.LanguageRef> ls = new ArrayList<domain.LanguageRef>();
		ls.add((domain.LanguageRef) row);

		EditingDomain editingDomain = ((DiagramEditor) property.getPart())
				.getEditingDomain();

		editingDomain.getCommandStack()
				.execute(
						RemoveCommand.create(editingDomain,
								((domain.MessageLibrary) property.getModel()),
								DomainPackage.eINSTANCE
										.getMessageLibrary_LibLanguages(), ls));

		rowList.remove(row);
		this.notifyRemoveRow(row);

	}

	public List<Object> queryRows() {
		domain.MessageLibrary msg = (domain.MessageLibrary) property.getModel();

		ArrayList<Object> ls = new ArrayList<Object>();
		ls.addAll(msg.getLibLanguages());

		return ls;

	}

	@Override
	public int getSorterID() {
		return 0;
	}

}
