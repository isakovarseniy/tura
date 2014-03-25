package org.metamodel.tura.ui.properties.sections.grid.impl;

import java.util.ArrayList;
import java.util.Iterator;
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

public class ParameterDS extends DataSource {

	private GridProperty property;

	public ParameterDS(GridProperty property) {
		this.property = property;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void addRow() {
		domain.Parameter parameter = DomainFactory.eINSTANCE.createParameter();
		parameter.setName("New parameter");
		parameter.setUid(UUID.randomUUID().toString());
		ArrayList<domain.Parameter> ls = new ArrayList<domain.Parameter>();
		ls.add(parameter);

		EditingDomain editingDomain = ((DiagramEditor) property.getPart())
				.getEditingDomain();

		editingDomain.getCommandStack().execute(
				AddCommand.create(editingDomain,
						((domain.ModelQuery) property.getEObject()),
						DomainPackage.eINSTANCE.getOperation_Parameters(), ls));

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
						((domain.ModelQuery) property.getEObject()),
						DomainPackage.eINSTANCE.getOperation_Parameters(), ls));

		rowList.remove(row);
		this.notifyRemoveRow(row);

	}

	@Override
	public List<Object> queryRows() {
		try {
			domain.Operation operation = ((domain.Operation) property
					.getEObject());

			ArrayList<Object> rows = new ArrayList<Object>();
			for (Iterator<domain.Parameter> i = operation.getParameters()
					.iterator(); i.hasNext();) {
				domain.Parameter p = i.next();
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
		return 3;
	}

}
