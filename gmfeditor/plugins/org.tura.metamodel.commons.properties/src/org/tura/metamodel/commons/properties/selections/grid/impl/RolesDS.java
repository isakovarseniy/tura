package org.tura.metamodel.commons.properties.selections.grid.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.epsilon.common.dt.util.LogUtil;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.tura.metamodel.commons.properties.selections.grid.DataSource;
import org.tura.metamodel.commons.properties.selections.grid.GridProperty;

import domain.DomainFactory;
import domain.DomainPackage;

public class RolesDS extends DataSource {

	private GridProperty property;

	public RolesDS(GridProperty property) {
		this.property = property;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void addRow() {
		domain.GrantAccess access = DomainFactory.eINSTANCE.createGrantAccess();
		access.setUid(UUID.randomUUID().toString());
		ArrayList<domain.GrantAccess> ls = new ArrayList<domain.GrantAccess>();
		ls.add(access);

		EditingDomain editingDomain = ((DiagramEditor) property.getPart())
				.getEditingDomain();

		editingDomain.getCommandStack().execute(
				AddCommand.create(editingDomain,
						((domain.Secured) property.getModel()),
						DomainPackage.eINSTANCE.getSecured_Grants(), ls));

		rowList.add(rowList.size(), access);
		this.notifyAddRow(access);

	}

	@Override
	public void removeRow(Object row) {
		ArrayList<domain.GrantAccess> ls = new ArrayList<domain.GrantAccess>();
		ls.add((domain.GrantAccess) row);

		EditingDomain editingDomain = ((DiagramEditor) property.getPart())
				.getEditingDomain();

		editingDomain.getCommandStack().execute(
				RemoveCommand.create(editingDomain,
						((domain.Secured) property.getModel()),
						DomainPackage.eINSTANCE.getSecured_Grants(), ls));

		rowList.remove(row);
		this.notifyRemoveRow(row);

	}

	@Override
	public List<Object> queryRows() {
		try {
			domain.Secured operation = ((domain.Secured) property
					.getModel());

			ArrayList<Object> rows = new ArrayList<Object>();
			for (Iterator<domain.GrantAccess> i = operation.getGrants()
					.iterator(); i.hasNext();) {
				domain.GrantAccess p = i.next();
				rows.add(p);
			}
			return rows;
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
