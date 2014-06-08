package org.tura.metamodel.commons.properties.selections.grid.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.notation.impl.NodeImpl;
import org.tura.metamodel.commons.QueryHelper;
import org.tura.metamodel.commons.properties.selections.grid.DataSource;
import org.tura.metamodel.commons.properties.selections.grid.GridProperty;

import domain.DomainFactory;
import domain.DomainPackage;
import domain.MappingSpecifier;
import domain.Specifier;

public class MappingSpecifierDS extends DataSource {

	private GridProperty property;

	public MappingSpecifierDS(GridProperty property) {
		this.property = property;
	}

	@Override
	public void addRow() {

	}

	@Override
	public void removeRow(Object row) {
		ArrayList<domain.MappingSpecifier> ls = new ArrayList<domain.MappingSpecifier>();
		ls.add((MappingSpecifier) row);

		EditingDomain editingDomain = ((DiagramEditor) property.getPart())
				.getEditingDomain();

		editingDomain.getCommandStack().execute(
				RemoveCommand
						.create(editingDomain, ((domain.ModelMapper) property
								.getModel()), DomainPackage.eINSTANCE
								.getModelMapper_Specifiers(), ls));

		rowList.remove(row);
		this.notifyRemoveRow(row);

	}

	@Override
	public List<Object> queryRows() {
		EditingDomain editingDomain = ((DiagramEditor) property.getPart())
				.getEditingDomain();

		NodeImpl diagram = (NodeImpl) property.getEditPart().getModel();
		try {

			EObject types = (EObject) diagram.getElement();
			Object[] result = (new QueryHelper()).findMappingSpecifiers(
					(domain.ModelMapper) property.getModel(), types);

			@SuppressWarnings("unchecked")
			List<domain.Specifier> addSpecifiers = (List<Specifier>) result[0];
			@SuppressWarnings("unchecked")
			List<domain.MappingSpecifier> removeSpecifiers = (List<MappingSpecifier>) result[1];

			// Add new
			for (Iterator<domain.Specifier> itr = addSpecifiers.iterator(); itr
					.hasNext();) {
				domain.Specifier specifier = itr.next();
				domain.MappingSpecifier ms = DomainFactory.eINSTANCE
						.createMappingSpecifier();
				ms.setSpecifierRef(specifier);
				editingDomain.getCommandStack().execute(
						AddCommand.create(editingDomain,
								((domain.ModelMapper) property.getModel()),
								DomainPackage.eINSTANCE
										.getModelMapper_Specifiers(), ms));
			}

			// Remove
			for (Iterator<domain.MappingSpecifier> itr = removeSpecifiers
					.iterator(); itr.hasNext();) {
				domain.MappingSpecifier ms = itr.next();
				editingDomain.getCommandStack().execute(
						RemoveCommand.create(editingDomain,
								((domain.ModelMapper) property.getModel()),
								DomainPackage.eINSTANCE
										.getModelMapper_Specifiers(), ms));
			}

			ArrayList<Object> rows = new ArrayList<Object>();
			for (Iterator<domain.MappingSpecifier> i = ((domain.ModelMapper) property
					.getModel()).getSpecifiers().iterator(); i.hasNext();) {
				domain.MappingSpecifier p = i.next();
				rows.add(p);
			}
			return rows;

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
